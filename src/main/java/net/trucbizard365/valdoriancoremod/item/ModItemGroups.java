package net.trucbizard365.valdoriancoremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trucbizard365.valdoriancoremod.ValdorianCoreMode;
import net.trucbizard365.valdoriancoremod.ValdoriancoremodClient;
import net.trucbizard365.valdoriancoremod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup VADLORIAN_TEST_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ValdorianCoreMode.MOD_ID, "valdorian_test-items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Test))
                    .displayName(Text.translatable("itemgroup.valdoriancoremode.test"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Test);
                    })
                    .build());
    public static final ItemGroup VADLORIAN_TEST_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ValdorianCoreMode.MOD_ID, "valdorian_test"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Test))
                    .displayName(Text.translatable("itemgroup.valdoriancoremode.test_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANOTHER_TEST_BLOCK);
                        entries.add(ModBlocks.TEST_BLOCK);
                    })
                    .build());

    public static void registerItemGroups() {
        ValdorianCoreMode.LOGGER.info("Registering Valdorian Core mod item groups");
    }
}
