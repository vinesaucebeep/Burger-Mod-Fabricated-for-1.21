package com.beep67.init;

import com.beep67.BurgerModFabricated;
import com.beep67.util.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class ItemInit {
    // Basic burgers.
    public static final Item BEEF_BURGER = register("beef_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item PORK_BURGER = register("pork_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item MUTTON_BURGER = register("mutton_burger",
            new Item(new Item.Settings().food(FoodList.TIER_2)));

    public static final Item CHICKEN_BURGER = register("chicken_burger",
            new Item(new Item.Settings().food(FoodList.TIER_3)));

    public static final Item SALMON_BURGER = register("salmon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_4)));

    public static final Item COD_BURGER = register("cod_burger",
            new Item(new Item.Settings().food(FoodList.TIER_5)));

    public static <T extends Item> T register(String name, T item)  {
        return Registry.register(Registries.ITEM, BurgerModFabricated.id(name), item);
    }

    // Ignore
    public static void load() {}


}
