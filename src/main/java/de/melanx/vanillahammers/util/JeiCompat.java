//package de.melanx.vanillahammers.util;
//
//import de.melanx.morevanillalib.LibConfigHandler;
//import de.melanx.vanillahammers.items.HammerRegistry;
//import mezz.jei.api.IModPlugin;
//import mezz.jei.api.JeiPlugin;
//import mezz.jei.api.registration.IRecipeRegistration;
//import net.minecraft.resources.ResourceLocation;
//
//import javax.annotation.Nonnull;
//
//import static de.melanx.morevanillalib.compat.JeiCompat.PLUGIN_UID;
//import static de.melanx.morevanillalib.compat.JeiCompat.addValueInfoPage;
//
//@JeiPlugin
//public class JeiCompat implements IModPlugin {
//
//    @Nonnull
//    @Override
//    public ResourceLocation getPluginUid() {
//        return PLUGIN_UID;
//    }
//
//    @Override
//    public void registerRecipes(@Nonnull IRecipeRegistration registration) {
//        if (LibConfigHandler.doubleDrop.get()) {
//            if (LibConfigHandler.diamondDoubleDrop.get())
//                addValueInfoPage(registration, HammerRegistry.DIAMOND_HAMMER.get(), "diamond_double_drop", LibConfigHandler.diamondDoubleDropChance.get() / 10);
//            if (LibConfigHandler.coalDoubleDrop.get())
//                addValueInfoPage(registration, HammerRegistry.COAL_HAMMER.get(), "coal_double_drop", LibConfigHandler.coalDoubleDropChance.get() / 10);
//            if (LibConfigHandler.emeraldDoubleDrop.get())
//                addValueInfoPage(registration, HammerRegistry.EMERALD_HAMMER.get(), "emerald_double_drop", LibConfigHandler.emeraldDoubleDropChance.get() / 10);
//            if (LibConfigHandler.lapisDoubleDrop.get())
//                addValueInfoPage(registration, HammerRegistry.LAPIS_HAMMER.get(), "lapis_double_drop", LibConfigHandler.lapisDoubleDropChance.get() / 10);
//            if (LibConfigHandler.quartzDoubleDrop.get())
//                addValueInfoPage(registration, HammerRegistry.QUARTZ_HAMMER.get(), "quartz_double_drop", LibConfigHandler.quartzDoubleDropChance.get() / 10);
//            if (LibConfigHandler.redstoneDoubleDrop.get())
//                addValueInfoPage(registration, HammerRegistry.REDSTONE_HAMMER.get(), "redstone_double_drop", LibConfigHandler.redstoneDoubleDropChance.get() / 10);
//        }
//    }
//}
