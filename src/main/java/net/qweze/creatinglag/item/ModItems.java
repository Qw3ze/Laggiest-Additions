package net.qweze.creatinglag.item;

import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.qweze.creatinglag.CreatingLag;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatingLag.MOD_ID);
    //register your items under here
    //important: in order to get that cool looking thing saying "name", just put quotes in the ()
    //after adding an item, you will still need to give it a name and texture
    public static final RegistryObject<Item> GLASS_LENS = ITEMS.register("glass_lens",
            () -> new Item(new Item.Properties()));


    //ok stop registering them nerd
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
