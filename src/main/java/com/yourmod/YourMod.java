package com.yourmod;

import com.yourmod.init.ModBlocks;
import com.yourmod.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match the modId in mods.toml
@Mod(YourMod.MODID)
public class YourMod {
    public static final String MODID = "yourmod";
    private static final Logger LOGGER = LogManager.getLogger();

    public YourMod() {
        // Register the setup methods for mod loading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register block and item registries
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        // Register the common setup method
        modEventBus.addListener(this::commonSetup);

        // Register the client setup method
        modEventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code here (e.g., registering network handlers)
        LOGGER.info("Common setup complete.");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        // Client-specific setup code here (e.g., rendering setups)
        LOGGER.info("Client setup complete.");
    }
}
