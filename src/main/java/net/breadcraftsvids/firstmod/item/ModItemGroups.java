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
    public static final ItemGroup FIRSTMOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstMod.MOD_ID, "firstmod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.firstmod.firstmod_items"))
                    .entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.CRACKED_SAPPHIRE);

                        entries.add(ModItems.BEEF_BURGER);
                        entries.add(ModItems.BURGER_BUN);

                        entries.add(ModItems.LAVA_STAR);
                        // Special Items
                        entries.add(ModItems.SAPPHIRE_CLOTH);
                        // Tools

                        // Armour

                    }).build());

    public static final ItemGroup FIRSTMOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstMod.MOD_ID, "firstmod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SAPPHIRE_BLOCK))
                    .displayName(Text.translatable("itemgroup.firstmod.firstmod_blocks"))
                    .entries((displayContext, entries) -> {

                        // Blocks
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.CRACKED_SAPPHIRE_BLOCK);

                        // Ores
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

                        // Special Blocks
                        entries.add(ModBlocks.STOVE);
                    }).build());



    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.MOD_ID);
    }
}
