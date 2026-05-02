package net.trucbizard365.valdoriancoremod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.trucbizard365.valdoriancoremod.ValdorianCoreMode;

public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(55f, 10000f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GRAVEL)
            ));
    public static final Block ANOTHER_TEST_BLOCK = registerBlock("another_test_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5f, 1f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)
            ));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ValdorianCoreMode.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ValdorianCoreMode.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        ValdorianCoreMode.LOGGER.info("Registering Mod Blocks for " + ValdorianCoreMode.MOD_ID);
    }
}
