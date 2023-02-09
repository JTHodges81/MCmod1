package com.james.mymod_1.Items;

import com.james.mymod_1.MyMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class ModCreativeModeTab {
    public static CreativeModeTab MYTab;

    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        MYTab = event.registerCreativeModeTab(new ResourceLocation(MyMod.MOD_ID, "mymod_1"),
                builder -> builder.icon(()-> new ItemStack()))
    }
}
