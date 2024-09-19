package com.yourmod.init;

import com.yourmod.YourMod;
import com.yourmod.blocks.CustomBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;

public class ModBlocks {
    // Deferred register for registering blocks in Minecraft
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, YourMod.MODID);

    // Registering a custom block
    public static final RegistryObject<Block> CUSTOM_BLOCK = BLOCKS.register("custom_block",
            () -> new CustomBlock(BlockBehaviour.Properties.of()
                    .strength(3.0f, 10.0f)
                    .requiresCorrectToolForDrops()));

}
