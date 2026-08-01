package net.breadcraftsvids.firstmod.item;

import net.breadcraftsvids.firstmod.FirstMod;
import net.breadcraftsvids.firstmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_MINERALS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstMod.MOD_ID, "more_minerals_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.firstmod.more_minerals_items"))
                    .entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.CRACKED_SAPPHIRE);

                        // Special Items

                        // Tools

                        // Armour

                    }).build());

    public static final ItemGroup MORE_MINERALS_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstMod.MOD_ID, "more_minerals_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SAPPHIRE_BLOCK))
                    .displayName(Text.translatable("itemgroup.firstmod.more_minerals_blocks"))
                    .entries((displayContext, entries) -> {

                        // Blocks
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.CRACKED_SAPPHIRE_BLOCK);

                        // Ores
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

                        // Special Blocks

                    }).build());



    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.MOD_ID);
    }
}
