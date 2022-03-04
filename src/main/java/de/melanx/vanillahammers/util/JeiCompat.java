package de.melanx.vanillahammers.util;

import de.melanx.morevanillalib.config.FeatureConfig;
import de.melanx.vanillahammers.items.HammerRegistry;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

import static de.melanx.morevanillalib.compat.JeiCompat.PLUGIN_UID;
import static de.melanx.morevanillalib.compat.JeiCompat.addValueInfoPage;

@JeiPlugin
public class JeiCompat implements IModPlugin {

    @Nonnull
    @Override
    public ResourceLocation getPluginUid() {
        return PLUGIN_UID;
    }

    @Override
    public void registerRecipes(@Nonnull IRecipeRegistration registration) {
        if (FeatureConfig.DoubleDrop.enabledAll) {
            if (FeatureConfig.DoubleDrop.Diamond.enabled) {
                addValueInfoPage(registration, HammerRegistry.diamondHammer, "diamond_double_drop", FeatureConfig.DoubleDrop.Diamond.chance * 100);
            }

            if (FeatureConfig.DoubleDrop.Coal.enabled) {
                addValueInfoPage(registration, HammerRegistry.coalHammer, "coal_double_drop", FeatureConfig.DoubleDrop.Coal.chance * 100);
            }

            if (FeatureConfig.DoubleDrop.Emerald.enabled) {
                addValueInfoPage(registration, HammerRegistry.emeraldHammer, "emerald_double_drop", FeatureConfig.DoubleDrop.Emerald.chance * 100);
            }

            if (FeatureConfig.DoubleDrop.Lapis.enabled) {
                addValueInfoPage(registration, HammerRegistry.lapisHammer, "lapis_double_drop", FeatureConfig.DoubleDrop.Lapis.chance * 100);
            }

            if (FeatureConfig.DoubleDrop.Quartz.enabled) {
                addValueInfoPage(registration, HammerRegistry.quartzHammer, "quartz_double_drop", FeatureConfig.DoubleDrop.Quartz.chance * 100);
            }

            if (FeatureConfig.DoubleDrop.Redstone.enabled) {
                addValueInfoPage(registration, HammerRegistry.redstoneHammer, "redstone_double_drop", FeatureConfig.DoubleDrop.Redstone.chance * 100);
            }
        }
    }
}
