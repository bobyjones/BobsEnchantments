package net.bobyjones.bobsenchantments;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BobsEnchantments implements ModInitializer {
	public static final String MOD_ID = "bobsenchantments";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
