package net.breadcraftsvids.firstmod;

import net.breadcraftsvids.firstmod.block.ModBlocks;
import net.breadcraftsvids.firstmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// VERY important comment
public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
