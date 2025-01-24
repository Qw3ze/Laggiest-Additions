package net.qweze.creatinglag.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qweze.creatinglag.CreatingLag;

public class ModCreativeModeTabs {
      public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
              DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatingLag.MOD_ID);
      //read the comment in ModItems
      public static final RegistryObject<CreativeModeTab> CREATING_LAG_TAB = CREATIVE_MODE_TABS.register("creating_lag_tab",
              () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLASS_LENS.get()))
                      .title(Component.translatable("creativetab.creating_lag_tab")).displayItems((itemDisplayParameters, output) -> {
                          output.accept(ModItems.GLASS_LENS.get() );
                      })
                      .build());

      //you shall not pass
      public static void register(IEventBus eventBus) {
          CREATIVE_MODE_TABS.register(eventBus);
      }
}
