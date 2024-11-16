package com.dexter.dextersitems.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class ModFoodComponents {
    public static final FoodComponent ManaShake = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 0, 1),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 0),1f).build();

    public static final FoodComponent TerrasteelShake = new FoodComponent.Builder().hunger(15).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600, 4),1f).build();

    public static final FoodComponent CoconutShake = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f).build();

    public static final FoodComponent CrushedAzaleaFlower = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).build();

    public static final FoodComponent DuckMeat = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();

    public static final FoodComponent DuckSoup = new FoodComponent.Builder().hunger(14).saturationModifier(0.55f).build();

    public static final FoodComponent IceShake = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).build();

    public static final FoodComponent PricklyPearJuice = new FoodComponent.Builder().hunger(8).saturationModifier(0.35f).build();

    public static final FoodComponent WalnutSalad = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).build();
}


