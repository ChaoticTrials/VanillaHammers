package de.melanx.vanillahammers.data;

import de.melanx.vanillahammers.VanillaHammers;
import io.github.noeppi_noeppi.libx.data.provider.ItemModelProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProviderBase {

    public ItemModels(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(VanillaHammers.getInstance(), generator, fileHelper);
    }

    @Override
    protected void setup() {
        // :)
    }

    @Override
    protected void defaultItem(ResourceLocation id, Item item) {
        this.withExistingParent(id.getPath(), HANDHELD).texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
    }
}
