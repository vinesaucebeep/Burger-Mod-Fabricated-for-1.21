package com.beep67;

import com.beep67.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BurgerModFabricated implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("burger-mod-fabricated");
	public static final String MOD_ID = "burger-mod-fabricated";

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}