package com.firedemonite.magiccircles.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.NETHER_CRYSTAL, new ItemStack(ModItems.MAGICA_ASH, 1), 1.5f);
		GameRegistry.addSmelting(Blocks.WOODEN_BUTTON, new ItemStack(ModItems.MAGICA_ASH, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.MAGICA_ORE, new ItemStack(ModItems.MAGICA_ASH, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.NETHER_CRYSTAL_ORE, new ItemStack(ModItems.NETHER_CRYSTAL, 1), 1.5f);
	}
}
