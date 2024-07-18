package com.beep67.util;

import net.minecraft.block.Portal;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {

    // Tiers for the burgers, including nutrition and saturation.
    public static final FoodComponent TIER_1 = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.0f)
            .build();

    public static final FoodComponent TIER_2 = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();

    public static final FoodComponent TIER_3 = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .build();

    public static final FoodComponent TIER_4 = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();

    public static final FoodComponent TIER_5 = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(0.8f)
            .build();

    public static final FoodComponent GOLD_TIER = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*4, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*60, 0), 1.0f)
            .build();
}
