package net.trucbizard365.valdoriancoremod;

import net.fabricmc.api.ModInitializer;

import net.trucbizard365.valdoriancoremod.block.ModBlocks;
import net.trucbizard365.valdoriancoremod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValdorianCoreMode implements ModInitializer {
	public static final String MOD_ID = "valdorian-core-mode";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}