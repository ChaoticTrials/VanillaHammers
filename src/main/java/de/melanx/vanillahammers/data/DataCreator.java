package de.melanx.vanillahammers.data;

import de.melanx.vanillahammers.data.tags.HammerTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = "vanillahammers", bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataCreator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(new HammerTags(generator, helper));
            generator.addProvider(new Recipes(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(new ItemModels(generator, helper));
        }
    }

}
