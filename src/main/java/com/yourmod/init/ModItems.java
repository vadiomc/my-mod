package com.yourmod.init;

import com.yourmod.YourMod;
import com.yourmod.blocks.CustomBlock; // Make sure to import your CustomBlock class
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, YourMod.MODID);

    // Registering an item for the custom block
    public static final RegistryObject<Item> CUSTOM_BLOCK_ITEM = ITEMS.register("custom_block",
            () -> new BlockItem(ModBlocks.CUSTOM_BLOCK.get(), new Item.Properties().tab(CreativeModeTabs.BUILDING_BLOCKS)));

    // Ensure you add other items here as needed
}
