package com.james.mymod_1.init;

import com.james.mymod_1.Items.First_Item;
import com.james.mymod_1.MyMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    public static final RegistryObject<Item> First_Item = ITEMS.register("first_item",()-> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
