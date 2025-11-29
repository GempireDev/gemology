package com.github.gemology;

import com.github.gemology.block.GemologyBlocks;
import com.github.gemology.item.GemologyItems;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import org.slf4j.Logger;

@Mod(Gemology.MOD_ID)
public class Gemology {
    public static final String MOD_ID = "gemology";
    public static final String MOD_NAME = "Gemology";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Gemology(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Loading {}...", MOD_NAME);

        GemologyBlocks.REGISTER.register(modEventBus);
        GemologyItems.REGISTER.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }
}
