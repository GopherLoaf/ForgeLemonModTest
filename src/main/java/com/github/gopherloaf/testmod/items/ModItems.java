package com.github.gopherloaf.testmod.items;

import com.github.gopherloaf.testmod.TestMod;
import com.github.gopherloaf.testmod.items.advanced.LemonItem;
import com.github.gopherloaf.testmod.items.advanced.LemonJuiceBottleItem;
import com.github.gopherloaf.testmod.items.advanced.LemonadeBottleItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", () -> new LemonItem(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(4).saturationMod(4.8f).effect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 0), 1.0F).build())));
    public static final RegistryObject<Item> LEMON_BAR = ITEMS.register("lemon_bar", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.4f).build())));
    public static final RegistryObject<Item> LEMON_JUICE_BOTTLE = ITEMS.register("lemon_juice_bottle", () -> new LemonJuiceBottleItem(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(2).saturationMod(4.8f).effect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 0), 1.0F).build()).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> LEMONADE_BOTTLE = ITEMS.register("lemonade_bottle", () -> new LemonadeBottleItem(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(2).saturationMod(0.8f).effect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 0), 1.0F).build()).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));

    public static void register(){
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
