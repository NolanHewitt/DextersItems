package com.dexter.dextersitems.item;

import com.dexter.dextersitems.DextersItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TiaraCore = registerItem("tiara_core", new Item(new FabricItemSettings()));
    public static final Item TiaraCoreFragment = registerItem("tiara_core_fragment", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(TiaraCore);
        entries.add(TiaraCoreFragment);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DextersItems.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DextersItems.LOGGER.info("Registering Mod Items for " + DextersItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
