package com.github.gemology.block;

import com.github.gemology.Gemology;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class GemologyBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(Gemology.MOD_ID);

    public static final DeferredBlock<Block> TUNGSTEN_BLOCK = REGISTER.registerSimpleBlock("tungsten_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
    );
}
