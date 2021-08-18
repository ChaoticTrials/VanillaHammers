package de.melanx.vanillahammers.items;

import de.melanx.morevanillalib.api.ToolType;
import de.melanx.morevanillalib.api.ranged.RangeItem;
import de.melanx.morevanillalib.api.ranged.RangeMaterials;
import de.melanx.vanillahammers.VanillaHammers;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.world.item.Item;

@RegisterClass
public class HammerRegistry {

    @SuppressWarnings("ConstantConditions")
    public static final Item woodenHammer = new RangeItem(RangeMaterials.WOODEN, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item stoneHammer = new RangeItem(RangeMaterials.STONE, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item ironHammer = new RangeItem(RangeMaterials.IRON, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item goldenHammer = new RangeItem(RangeMaterials.GOLDEN, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item diamondHammer = new RangeItem(RangeMaterials.DIAMOND, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item netheriteHammer = new RangeItem(RangeMaterials.NETHERITE, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));

    public static final Item boneHammer = new RangeItem(RangeMaterials.BONE, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item coalHammer = new RangeItem(RangeMaterials.COAL, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item emeraldHammer = new RangeItem(RangeMaterials.EMERALD, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item enderHammer = new RangeItem(RangeMaterials.ENDER, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item fieryHammer = new RangeItem(RangeMaterials.FIERY, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item glowstoneHammer = new RangeItem(RangeMaterials.GLOWSTONE, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item lapisHammer = new RangeItem(RangeMaterials.LAPIS, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item netherHammer = new RangeItem(RangeMaterials.NETHER, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item obsidianHammer = new ObsidianHammer(RangeMaterials.OBSIDIAN, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item paperHammer = new RangeItem(RangeMaterials.PAPER, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item prismarineHammer = new RangeItem(RangeMaterials.PRISMARINE, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item quartzHammer = new RangeItem(RangeMaterials.QUARTZ, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item redstoneHammer = new RangeItem(RangeMaterials.REDSTONE, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
    public static final Item slimeHammer = new RangeItem(RangeMaterials.SLIME, ToolType.PICKAXE, new Item.Properties().tab(VanillaHammers.getInstance().tab));
}
