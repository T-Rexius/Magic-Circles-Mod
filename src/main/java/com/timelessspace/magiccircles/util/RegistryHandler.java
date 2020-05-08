package com.timelessspace.magiccircles.util;

import com.timelessspace.magiccircles.MagicCircles;
import com.timelessspace.magiccircles.blocks.BlockItemBase;
import com.timelessspace.magiccircles.blocks.MagicaCrystalBlock;
import com.timelessspace.magiccircles.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MagicCircles.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MagicCircles.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> MAGICA_ASH = ITEMS.register("magica_ash", ItemBase::new);
    public static final RegistryObject<Item> MAGICA_CRYSTAL = ITEMS.register("magica_crystal", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> MAGICA_CYSTAL_BLOCK = BLOCKS.register("magica_crystal_block", MagicaCrystalBlock::new);

    // Block Items
    public static final RegistryObject<Item> MAGICA_CYSTAL_BLOCK_ITEM = ITEMS.register("magica_crystal_block", () -> new BlockItemBase(MAGICA_CYSTAL_BLOCK.get()));
}
