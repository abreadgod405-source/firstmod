package net.breadcraftsvids.firstmod.block;

import net.breadcraftsvids.firstmod.FirstMod;
import net.breadcraftsvids.firstmod.block.custom.Stove;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(3f, 6f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRACKED_SAPPHIRE_BLOCK = registerBlock("cracked_sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(3f, 6f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new Block(AbstractBlock.Settings.create().requiresTool()
                    .strength(3f, 3f).sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new Block(AbstractBlock.Settings.create().requiresTool()
                    .strength(4.5f, 3f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block STOVE = registerBlock("stove",
            new Stove(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FirstMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FirstMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FirstMod.LOGGER.info("Register Mod Blocks for" + FirstMod.MOD_ID);

    }

}
