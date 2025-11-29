package com.github.gemology.item;

import com.github.gemology.Gemology;
import com.github.gemology.block.GemologyBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class GemologyItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(Gemology.MOD_ID);

    public static final DeferredItem<Item> TUNGSTEN_INGOT = REGISTER.registerSimpleItem("tungsten_ingot");
    public static final DeferredItem<BlockItem> TUNGSTEN_BLOCK = REGISTER.registerSimpleBlockItem(GemologyBlocks.TUNGSTEN_BLOCK);
}
