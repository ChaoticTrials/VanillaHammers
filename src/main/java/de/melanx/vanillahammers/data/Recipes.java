package de.melanx.vanillahammers.data;

import com.google.gson.JsonArray;
import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.morevanillalib.core.WrapperResult;
import de.melanx.morevanillalib.core.crafting.VanillaCondition;
import de.melanx.vanillahammers.VanillaHammers;
import de.melanx.vanillahammers.items.HammerRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(@Nonnull Consumer<IFinishedRecipe> consumer) {
        int i = 0;
        for (RegistryObject<Item> item : HammerRegistry.ITEMS.getEntries()) {
            BigBreakMaterials hammer = BigBreakMaterials.values()[i];
            ITag.INamedTag<Item> tagIngredient = hammer.getTagIngredient();
            ShapedRecipeBuilder recipe = createRecipe(item.get(), tagIngredient);
            if (!hammer.isVanilla()) {
                recipe.build(WrapperResult.transformJson(consumer, json -> {
                    JsonArray array = new JsonArray();
                    array.add(VanillaCondition.SERIALIZER.getJson(new VanillaCondition(true)));
                    json.add("conditions", array);
                }));
            } else {
                recipe.build(consumer);
            }
            i++;
        }
    }

    private ShapedRecipeBuilder createRecipe(Item result, ITag.INamedTag<Item> ingredient) {
        return ShapedRecipeBuilder.shapedRecipe(result)
                .key('D', ingredient)
                .key('s', Items.STICK)
                .patternLine("DsD")
                .patternLine(" s ")
                .patternLine(" s ")
                .setGroup(VanillaHammers.MODID)
                .addCriterion("has_material", hasItem(ingredient));
    }
}
