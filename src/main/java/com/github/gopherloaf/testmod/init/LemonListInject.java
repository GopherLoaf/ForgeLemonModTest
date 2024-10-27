package com.github.gopherloaf.testmod.init;

import com.github.gopherloaf.testmod.items.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;

public class LemonListInject {
    private static void compostablesInject(){
        ComposterBlock.COMPOSTABLES.put(ModItems.LEMON.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.LEMON_BAR.get(), 0.85F);
    }

    public static void init(){
        compostablesInject();
    }
}