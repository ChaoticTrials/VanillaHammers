package de.melanx.vanillahammers;

import de.melanx.vanillahammers.items.HammerRegistry;
import io.github.noeppi_noeppi.libx.mod.registration.ModXRegistration;
import io.github.noeppi_noeppi.libx.mod.registration.RegistrationBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nonnull;

@Mod("vanillahammers")
public final class VanillaHammers extends ModXRegistration {
    private static VanillaHammers instance;

    public VanillaHammers() {
        super(new CreativeModeTab("vanillahammers") {
            @Nonnull
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(HammerRegistry.redstoneHammer);
            }
        });
        instance = this;
    }

    @Override
    protected void initRegistration(RegistrationBuilder builder) {
        builder.setVersion(1);
    }

    @Override
    protected void setup(FMLCommonSetupEvent event) {

    }

    @Override
    protected void clientSetup(FMLClientSetupEvent event) {

    }

    public static VanillaHammers getInstance() {
        return instance;
    }
}
