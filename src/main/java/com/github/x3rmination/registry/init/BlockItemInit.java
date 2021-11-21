package com.github.x3rmination.registry.init;

import com.github.x3rmination.registry.ModRegistration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class BlockItemInit {

    public static final RegistryObject<BlockItem> POWERED_FURNACE = ModRegistration.BLOCK_ITEMS.register("powered_furnace",
            () -> new BlockItem(BlockInit.POWERED_FURNACE.get(), new Item.Properties().tab(ModRegistration.ModItemTab.instance)));
    public static final RegistryObject<BlockItem> POWERED_PULVERIZER = ModRegistration.BLOCK_ITEMS.register("powered_pulverizer",
            () -> new BlockItem(BlockInit.POWERED_PULVERIZER.get(), new Item.Properties().tab(ModRegistration.ModItemTab.instance)));
    public static final RegistryObject<BlockItem> MACHINE_FRAME = ModRegistration.BLOCK_ITEMS.register("machine_frame",
            () -> new BlockItem(BlockInit.MACHINE_FRAME.get(), new Item.Properties().tab(ModRegistration.ModItemTab.instance)));
     public static void register() {}
}