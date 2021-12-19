package de.melanx.vanillahammers.data;

import de.melanx.morevanillalib.api.IConfigurableTier;
import de.melanx.morevanillalib.api.ranged.RangeItem;
import de.melanx.morevanillalib.api.ranged.RangeMaterials;
import de.melanx.morevanillalib.data.ModTags;
import de.melanx.vanillahammers.VanillaHammers;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.CommonTagsProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

@Datagen
public class HammerTags extends CommonTagsProviderBase {

    public HammerTags(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(VanillaHammers.getInstance(), generator, fileHelper);
    }

    @Override
    public void setup() {
        // :)
    }

    @Override
    public void defaultItemTags(Item item) {
        if (item instanceof RangeItem) {
            IConfigurableTier material = ((RangeItem) item).getToolMaterial();
            if (RangeMaterials.WOODEN.equals(material)) {
                this.item(ModTags.Items.WOOD_TOOLS).add(item);
            } else if (RangeMaterials.STONE.equals(material)) {
                this.item(ModTags.Items.STONE_TOOLS).add(item);
            } else if (RangeMaterials.IRON.equals(material)) {
                this.item(ModTags.Items.IRON_TOOLS).add(item);
            } else if (RangeMaterials.GOLDEN.equals(material)) {
                this.item(ModTags.Items.GOLD_TOOLS).add(item);
            } else if (RangeMaterials.DIAMOND.equals(material)) {
                this.item(ModTags.Items.DIAMOND_TOOLS).add(item);
            } else if (RangeMaterials.BONE.equals(material)) {
                this.item(ModTags.Items.BONE_TOOLS).add(item);
            } else if (RangeMaterials.COAL.equals(material)) {
                this.item(ModTags.Items.COAL_TOOLS).add(item);
            } else if (RangeMaterials.EMERALD.equals(material)) {
                this.item(ModTags.Items.EMERALD_TOOLS).add(item);
            } else if (RangeMaterials.ENDER.equals(material)) {
                this.item(ModTags.Items.ENDER_TOOLS).add(item);
            } else if (RangeMaterials.FIERY.equals(material)) {
                this.item(ModTags.Items.FIERY_TOOLS).add(item);
            } else if (RangeMaterials.GLOWSTONE.equals(material)) {
                this.item(ModTags.Items.GLOWSTONE_TOOLS).add(item);
            } else if (RangeMaterials.LAPIS.equals(material)) {
                this.item(ModTags.Items.LAPIS_TOOLS).add(item);
            } else if (RangeMaterials.NETHER.equals(material)) {
                this.item(ModTags.Items.NETHER_TOOLS).add(item);
            } else if (RangeMaterials.NETHERITE.equals(material)) {
                this.item(ModTags.Items.NETHERITE_TOOLS).add(item);
            } else if (RangeMaterials.OBSIDIAN.equals(material)) {
                this.item(ModTags.Items.OBSIDIAN_TOOLS).add(item);
            } else if (RangeMaterials.PAPER.equals(material)) {
                this.item(ModTags.Items.PAPER_TOOLS).add(item);
            } else if (RangeMaterials.PRISMARINE.equals(material)) {
                this.item(ModTags.Items.PRISMARINE_TOOLS).add(item);
            } else if (RangeMaterials.QUARTZ.equals(material)) {
                this.item(ModTags.Items.QUARTZ_TOOLS).add(item);
            } else if (RangeMaterials.REDSTONE.equals(material)) {
                this.item(ModTags.Items.REDSTONE_TOOLS).add(item);
            } else if (RangeMaterials.SLIME.equals(material)) {
                this.item(ModTags.Items.SLIME_TOOLS).add(item);
            }
        }
    }
}
