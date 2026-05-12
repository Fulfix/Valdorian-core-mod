package net.trucbizard365.valdoriancoremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trucbizard365.valdoriancoremod.ValdorianCoreMode;

public class ModItems {
    public static final Item Test = registerItem("test", new Item(new Item.Settings()));
    public static final Item MONEY = registerItem("money", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ValdorianCoreMode.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ValdorianCoreMode.LOGGER.info("Registering Mod Items for " + ValdorianCoreMode.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Test);
            entries.add(MONEY);
        }) ;
    }

}
