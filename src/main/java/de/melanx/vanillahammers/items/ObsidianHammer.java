package de.melanx.vanillahammers.items;

import de.melanx.morevanillalib.api.IConfigurableTier;
import de.melanx.morevanillalib.api.ToolType;
import de.melanx.morevanillalib.api.ranged.RangeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nonnull;

public class ObsidianHammer extends RangeItem {

    public ObsidianHammer(IConfigurableTier material, ToolType toolType, Properties properties) {
        super(material, toolType, properties);
    }

    @Override
    public float getDestroySpeed(@Nonnull ItemStack stack, BlockState state) {
        if (state.getBlock() == Blocks.OBSIDIAN) {
            int efficiencyLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, stack);
            return 5.0F * (efficiencyLevel / 3.5F + 1);
        } else {
            return super.getDestroySpeed(stack, state);
        }
    }
}
