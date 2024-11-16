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
    public static final Item PowerStone = registerItem("powerstone", new Item(new FabricItemSettings()));
    public static final Item CrystalStar = registerItem("crystal_star", new Item(new FabricItemSettings()));
    public static final Item ZincDust = registerItem("zinc_dust", new Item(new FabricItemSettings()));
    public static final Item BrassDust = registerItem("brass_dust", new Item(new FabricItemSettings()));
    public static final Item ReinforcedElytra = registerItem("reinforced_elytra", new Item(new FabricItemSettings()));
    public static final Item PurifiedZinc = registerItem("purified_zinc", new Item(new FabricItemSettings()));
    public static final Item ZincChunk = registerItem("zinc_chunk", new Item(new FabricItemSettings()));
    public static final Item TungstenChunk = registerItem("tungsten_chunk", new Item(new FabricItemSettings()));
    public static final Item SteelChunk = registerItem("steel_chunk", new Item(new FabricItemSettings()));
    public static final Item ElectrumChunk = registerItem("electrum_chunk", new Item(new FabricItemSettings()));
    public static final Item BronzeChunk = registerItem("bronze_chunk", new Item(new FabricItemSettings()));
    public static final Item BrassChunk = registerItem("brass_chunk", new Item(new FabricItemSettings()));
    public static final Item ManaShake = registerItem("mana_shake", new BottleDrink(new FabricItemSettings().food(ModFoodComponents.ManaShake)));
    public static final Item TerrasteelShake = registerItem("terrasteel_shake", new BottleDrink(new FabricItemSettings().food(ModFoodComponents.TerrasteelShake)));
    public static final Item CoconutShake = registerItem("coconut_shake", new BottleDrink(new FabricItemSettings().food(ModFoodComponents.CoconutShake)));
    public static final Item IceShake = registerItem("ice_shake", new BottleDrink(new FabricItemSettings().food(ModFoodComponents.IceShake)));
    public static final Item PricklyPearJuice = registerItem("prickly_pear_juice", new BottleDrink(new FabricItemSettings().food(ModFoodComponents.PricklyPearJuice)));
    public static final Item DuckMeat = registerItem("duck_meat", new Item(new FabricItemSettings().food(ModFoodComponents.DuckMeat)));
    public static final Item DuckSoup = registerItem("duck_soup", new SoupFood(new FabricItemSettings().food(ModFoodComponents.DuckSoup)));
    public static final Item CrushedAzaleaFlower = registerItem("crushed_azalea_flower", new SoupFood2(new FabricItemSettings().food(ModFoodComponents.CrushedAzaleaFlower)));
    public static final Item WalnutSalad = registerItem("walnut_salad", new SoupFood2(new FabricItemSettings().food(ModFoodComponents.WalnutSalad)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(TiaraCore);
        entries.add(TiaraCoreFragment);
        entries.add(PowerStone);
        entries.add(CrystalStar);
        entries.add(ZincDust);
        entries.add(BrassDust);
        entries.add(ReinforcedElytra);
        entries.add(PurifiedZinc);
        entries.add(ZincChunk);
        entries.add(TungstenChunk);
        entries.add(SteelChunk);
        entries.add(ElectrumChunk);
        entries.add(BronzeChunk);
        entries.add(BrassChunk);
        entries.add(ManaShake);
        entries.add(TerrasteelShake);
        entries.add(CoconutShake);
        entries.add(IceShake);
        entries.add(PricklyPearJuice);
        entries.add(DuckMeat);
        entries.add(DuckSoup);
        entries.add(CrushedAzaleaFlower);
        entries.add(WalnutSalad);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DextersItems.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DextersItems.LOGGER.info("Registering Mod Items for " + DextersItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
