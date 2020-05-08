package com.timelessspace.magiccircles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagicaCrystalBlock extends Block
{

    public MagicaCrystalBlock() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
