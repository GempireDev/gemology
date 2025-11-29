package com.github.gemology;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = Gemology.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Gemology.MOD_ID, value = Dist.CLIENT)
public class GemologyClient {
    public GemologyClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
