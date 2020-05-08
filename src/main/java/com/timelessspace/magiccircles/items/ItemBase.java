package com.timelessspace.magiccircles.items;

import com.timelessspace.magiccircles.MagicCircles;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item
{

    public ItemBase() {
        super(new Item.Properties().group(MagicCircles.TAB));
    }
}
