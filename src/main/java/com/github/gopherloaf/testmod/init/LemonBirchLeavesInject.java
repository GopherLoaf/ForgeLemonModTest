package com.github.gopherloaf.testmod.init;

import com.github.gopherloaf.testmod.TestMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class LemonBirchLeavesInject {
    @SubscribeEvent
    public static void InjectLootTables(LootTableLoadEvent evt) {
        if (evt.getName().toString().equals("minecraft:blocks/birch_leaves")) {
            evt.getTable().addPool(LootPool.lootPool().add(LootTableReference.lootTableReference(new ResourceLocation(TestMod.MODID, "inject/" + evt.getName().toString().substring("minecraft:".length())))).name("lemon_inject_pool").build());
        }
    }
}