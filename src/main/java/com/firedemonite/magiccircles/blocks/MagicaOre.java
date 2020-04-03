package com.firedemonite.magiccircles.blocks;

import java.util.Random;

import com.firedemonite.magiccircles.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class MagicaOre extends BlockBase
{
	public MagicaOre(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.MAGICA_ASH; //ITEMS.(item) or BLOCKS. for vanilla
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
