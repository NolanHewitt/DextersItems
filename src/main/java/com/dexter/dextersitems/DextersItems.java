package com.dexter.dextersitems;

import com.dexter.dextersitems.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DextersItems implements ModInitializer {
	public static final String MOD_ID = "dextersitems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}