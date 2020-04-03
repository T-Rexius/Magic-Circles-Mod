package com.firedemonite.magiccircles.items.food;

import com.firedemonite.magiccircles.Main;
import com.firedemonite.magiccircles.init.ModItems;
import com.firedemonite.magiccircles.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{							// Foodbars 					food for wolved (bonus for animals)
		super(amount, saturation, isAnimalFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
