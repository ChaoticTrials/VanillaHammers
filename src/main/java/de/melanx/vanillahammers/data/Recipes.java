package de.melanx.vanillahammers.data;

import com.google.gson.JsonArray;
import de.melanx.morevanillalib.api.IConfigurableTier;
import de.melanx.morevanillalib.api.ranged.RangeItem;
import de.melanx.morevanillalib.api.ranged.RangeMaterials;
import de.melanx.morevanillalib.core.WrapperResult;
import de.melanx.morevanillalib.core.crafting.VanillaCondition;
import de.melanx.vanillahammers.VanillaHammers;
import de.melanx.vanillahammers.items.HammerRegistry;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.recipe.RecipeProviderBase;
import io.github.noeppi_noeppi.libx.mod.ModX;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

@Datagen
public class Recipes extends RecipeProviderBase {

    public Recipes(ModX mod, DataGenerator generator) {
        super(mod, generator);
    }

    @Override
    protected void setup() {
        //noinspection ConstantConditions
        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getRegistryName().getNamespace().equalsIgnoreCase(VanillaHammers.getInstance().modid))
                .map(item -> (RangeItem) item)
                .forEach(item -> {
                    IConfigurableTier material = item.getToolMaterial();
                    if (material == RangeMaterials.NETHERITE) {
                        //noinspection ConstantConditions
                        UpgradeRecipeBuilder.smithing(Ingredient.of(HammerRegistry.diamondHammer), Ingredient.of(Items.NETHERITE_INGOT), item)
                                .unlocks("hasDiamond", has(HammerRegistry.diamondHammer))
                                .save(this.consumer(), item.getRegistryName().getPath() + "_smithing");
                    } else {
                        RecipeBuilder recipe = this.createRecipe(item, material.getCraftingIngredient());
                        if (!material.isVanilla()) {
                            recipe.save(WrapperResult.transformJson(this.consumer(), json -> {
                                JsonArray array = new JsonArray();
                                array.add(VanillaCondition.SERIALIZER.getJson(new VanillaCondition()));
                                json.add("conditions", array);
                            }));
                        } else {
                            recipe.save(this.consumer());
                        }
                    }
                });
    }

    private RecipeBuilder createRecipe(Item result, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(result)
                .define('D', ingredient)
                .define('s', Items.STICK)
                .pattern("DsD")
                .pattern(" s ")
                .pattern(" s ")
                .group(VanillaHammers.getInstance().modid)
                .unlockedBy("has_material", has(Items.STICK));
    }
}
