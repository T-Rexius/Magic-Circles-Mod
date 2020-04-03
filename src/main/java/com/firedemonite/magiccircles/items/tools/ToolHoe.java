package com.firedemonite.magiccircles.items.tools;

import com.firedemonite.magiccircles.Main;
import com.firedemonite.magiccircles.init.ModItems;
import com.firedemonite.magiccircles.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolHoe extends ItemHoe implements IHasModel
{
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
