package de.melanx.vanillahammers.data;

import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.vanillahammers.VanillaHammers;
import de.melanx.vanillahammers.items.HammerRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.Tag;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        int i = 0;
        for (RegistryObject<Item> item : HammerRegistry.ITEMS.getEntries()) {
            BigBreakMaterials hammer = BigBreakMaterials.values()[i];
            Tag<Item> tagIngredient = hammer.getTagIngredient();
            ShapedRecipeBuilder recipe = createRecipe(item.get(), tagIngredient);
            recipe.build(consumer);
            i++;
        }
    }

    private ShapedRecipeBuilder createRecipe(Item result, Tag<Item> ingredient) {
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
