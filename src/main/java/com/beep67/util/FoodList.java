package com.beep67.util;

import net.minecraft.component.type.FoodComponent;

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
}
