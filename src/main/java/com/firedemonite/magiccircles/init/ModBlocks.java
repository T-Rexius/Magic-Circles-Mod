package com.firedemonite.magiccircles.init;

import java.util.ArrayList;
import java.util.List;

import com.firedemonite.magiccircles.blocks.BlockBase;
import com.firedemonite.magiccircles.blocks.MagicaOre;
import com.firedemonite.magiccircles.blocks.NetherCrystalBlock;
import com.firedemonite.magiccircles.blocks.NetherCrystalOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block NETHER_CRYSTAL_BLOCK = new NetherCrystalBlock("nether_crystal_block", Material.IRON);
	public static final Block NETHER_CRYSTAL_ORE = new NetherCrystalOre("nether_crystal_ore", Material.ROCK);
	public static final Block MAGICA_ORE = new MagicaOre("magica_ore", Material.ROCK);
}
