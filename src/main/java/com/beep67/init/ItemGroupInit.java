package com.beep67.init;


import com.beep67.BurgerModFabricated;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    private static final Text BURGERMODTITLE = Text.translatable("itemGroup." + BurgerModFabricated.MOD_ID + ".burger_mod");
    public static final ItemGroup BURGER_MOD = register("burger_mod", FabricItemGroup.builder()
            .displayName(BURGERMODTITLE)
            .icon(ItemInit.BEEF_BURGER::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(BurgerModFabricated.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());





    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, BurgerModFabricated.id(name), itemGroup);
    }

    public static void load() {}

}
