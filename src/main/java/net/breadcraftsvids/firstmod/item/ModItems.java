package net.breadcraftsvids.firstmod.item;

import net.breadcraftsvids.firstmod.FirstMod;
import net.breadcraftsvids.firstmod.item.custom.ClothItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item CRACKED_SAPPHIRE = registerItem("cracked_sapphire", new Item(new Item.Settings()));

    public static final Item SAPPHIRE_CLOTH = registerItem("sapphire_cloth", new ClothItem(new Item.Settings().maxDamage(32)));

    public static final Item BURGER_BUN = registerItem("burger_bun", new Item(new Item.Settings()));

    public static final Item BEEF_BURGER = registerItem("beef_burger",
            new Item(new Item.Settings().food(ModFoodComponents.BEEF_BURGER)));

    public static final Item LAVA_STAR = registerItem("lava_star", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering mod items for " + FirstMod.MOD_ID);

    }
}