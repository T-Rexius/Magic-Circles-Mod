package com.firedemonite.magiccircles.blocks;

import java.util.Random;

import com.firedemonite.magiccircles.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class NetherCrystalBlock extends BlockBase
{

	public NetherCrystalBlock(String name, Material material) 
	{
		super(name, material);
		
		// Walking over sound
		setSoundType(SoundType.METAL);
		
		// How long it takes to break (stone 1.5f dirt 0.5f)
		setHardness(5.0F);
		
		// Blow up resistance (normal 15 obsidian 6000)
		setResistance(15.0F);
		
		// First tool to break, then value harvestlevel (0=wood,1=stone,2=iron,3=diamond)
		setHarvestLevel("pickaxe", 2);
		
		// Light level (max = 15 ex. glowstone)
		setLightLevel(0.1F);
		
		// Let light through (1 = light goes through)
	//	setLightOpacity(1);
		
		// Makes block unbreakable
	//	setBlockUnbreakable();
	}
	
}
