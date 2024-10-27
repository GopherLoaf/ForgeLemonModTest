package com.github.gopherloaf.testmod.items.advanced;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class LemonItem extends Item {
    public LemonItem(Properties p_41383_) {
        super(p_41383_);
    }

    public ItemStack finishUsingItem(ItemStack p_41348_, Level p_41349_, LivingEntity p_41350_) {
        ItemStack itemstack = super.finishUsingItem(p_41348_, p_41349_, p_41350_);
        if (!p_41349_.isClientSide) {
            p_41350_.removeEffect(MobEffects.HUNGER);
        }

        return itemstack;
    }
}