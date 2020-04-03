package com.firedemonite.magiccircles.init;

import java.util.ArrayList;
import java.util.List;

import com.firedemonite.magiccircles.items.ItemBase;
import com.firedemonite.magiccircles.items.armor.ArmorBase;
import com.firedemonite.magiccircles.items.food.FoodBase;
import com.firedemonite.magiccircles.items.food.FoodEffectBase;
import com.firedemonite.magiccircles.items.tools.ToolAxe;
import com.firedemonite.magiccircles.items.tools.ToolHoe;
import com.firedemonite.magiccircles.items.tools.ToolPickaxe;
import com.firedemonite.magiccircles.items.tools.ToolSpade;
import com.firedemonite.magiccircles.items.tools.ToolSword;
import com.firedemonite.magiccircles.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_NETHER_CRYSTAL = EnumHelper.addToolMaterial("material_nether_crystal", 3, 500, 8.0F, 3.0F, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_NETHER_CRYSTAL = EnumHelper.addArmorMaterial("armor_material_nether_crystal", Reference.MOD_ID + ":nether_crystal", 14, 
			new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
					//boots,leggings,chestplate,helmet
	
	//Items
	public static final Item NETHER_CRYSTAL = new ItemBase("nether_crystal");
	public static final Item MAGICA_ASH = new ItemBase("magica_ash");
	
	
	//Tools
	public static final ItemSword NETHER_CRYSTAL_SWORD = new ToolSword("nether_crystal_sword", MATERIAL_NETHER_CRYSTAL);
	public static final ItemSpade NETHER_CRYSTAL_SHOVEL = new ToolSpade("nether_crystal_shovel", MATERIAL_NETHER_CRYSTAL);
	public static final ItemPickaxe NETHER_CRYSTAL_PICKAXE = new ToolPickaxe("nether_crystal_pickaxe", MATERIAL_NETHER_CRYSTAL);
	public static final ItemAxe NETHER_CRYSTAL_AXE = new ToolAxe("nether_crystal_axe", MATERIAL_NETHER_CRYSTAL);
	public static final ItemHoe NETHER_CRYSTAL_HOE = new ToolHoe("nether_crystal_hoe", MATERIAL_NETHER_CRYSTAL);
	
	
	//Armor
	public static final Item NETHER_CRYSTAL_HELMET = new ArmorBase("nether_crystal_helmet", ARMOR_MATERIAL_NETHER_CRYSTAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item NETHER_CRYSTAL_CHESTPLATE = new ArmorBase("nether_crystal_chestplate", ARMOR_MATERIAL_NETHER_CRYSTAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item NETHER_CRYSTAL_LEGGINGS = new ArmorBase("nether_crystal_leggings", ARMOR_MATERIAL_NETHER_CRYSTAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item NETHER_CRYSTAL_BOOTS = new ArmorBase("nether_crystal_boots", ARMOR_MATERIAL_NETHER_CRYSTAL, 1, EntityEquipmentSlot.FEET);
	
	
	//Food
	//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f, false);										   // 1 minute
	public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f, false, new PotionEffect(MobEffects.BLINDNESS, (60*20), 0, false, true));
}
