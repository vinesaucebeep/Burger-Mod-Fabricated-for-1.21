package com.beep67.init;

import com.beep67.BurgerModFabricated;
import com.beep67.util.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class ItemInit {
    // Meat + Eggs
    public static final Item BEEF_BURGER = register("beef_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item PORK_BURGER = register("pork_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item MUTTON_BURGER = register("mutton_burger",
            new Item(new Item.Settings().food(FoodList.TIER_2)));

    public static final Item CHICKEN_BURGER = register("chicken_burger",
            new Item(new Item.Settings().food(FoodList.TIER_3)));

    // Fish + Eggs
    public static final Item SALMON_BURGER = register("salmon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_4)));

    public static final Item COD_BURGER = register("cod_burger",
            new Item(new Item.Settings().food(FoodList.TIER_5)));


    // Meat + Cheese
    public static final Item BEEF_CHEESE_BURGER = register("beef_cheese_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item PORK_CHEESE_BURGER = register("pork_cheese_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item MUTTON_CHEESE_BURGER = register("mutton_cheese_burger",
            new Item(new Item.Settings().food(FoodList.TIER_2)));

    public static final Item CHICKEN_CHEESE_BURGER = register("chicken_cheese_burger",
            new Item(new Item.Settings().food(FoodList.TIER_3)));

    // Fish + Cheese
    public static final Item SALMON_CHEESE_BURGER = register("salmon_cheese_burger",
            new Item(new Item.Settings().food(FoodList.TIER_4)));

    public static final Item COD_CHEESE_BURGER = register("cod_cheese_burger",
            new Item(new Item.Settings().food(FoodList.TIER_5)));

    // Meat + Champignons
    public static final Item BEEF_CHAMPIGNON_BURGER = register("beef_champignon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item PORK_CHAMPIGNON_BURGER = register("pork_champignon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item MUTTON_CHAMPIGNON_BURGER = register("mutton_champignon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_2)));

    public static final Item CHICKEN_CHAMPIGNON_BURGER = register("chicken_champignon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_3)));

    // Fish + Champignons
    public static final Item SALMON_CHAMPIGNON_BURGER = register("salmon_champignon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_4)));

    public static final Item COD_CHAMPIGNON_BURGER = register("cod_champignon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_5)));

    // GOLDEN BURGERS

    public static final Item GOLDEN_BEEF_BURGER = register("golden_beefburger",
            new Item(new Item.Settings().food(FoodList.GOLD_TIER_1)));

    public static final Item GOLDEN_PORK_BURGER = register("golden_pork_burger",
            new Item(new Item.Settings().food(FoodList.TIER_1)));

    public static final Item GOLDEN_MUTTON_BURGER = register("golden_mutton_burger",
            new Item(new Item.Settings().food(FoodList.TIER_2)));

    public static final Item GOLDEN_CHICKEN_BURGER = register("golden_chicken_burger",
            new Item(new Item.Settings().food(FoodList.TIER_3)));

    public static final Item GOLDEN_SALMON_BURGER = register("golden_salmon_burger",
            new Item(new Item.Settings().food(FoodList.TIER_4)));

    public static final Item GOLDEN_COD_BURGER = register("golden_cod_burger",
            new Item(new Item.Settings().food(FoodList.TIER_5)));



    public static <T extends Item> T register(String name, T item)  {
        return Registry.register(Registries.ITEM, BurgerModFabricated.id(name), item);


    }

    // Ignore
    public static void load() {}


}
