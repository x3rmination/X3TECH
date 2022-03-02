package com.github.x3rmination.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import java.awt.*;

public class MBlockItemBase extends net.minecraft.item.BlockItem{

    Color color;

    public MBlockItemBase(Block block, Properties properties, Color ingotColor) {
        super(block, properties);
        this.color = ingotColor;
    }


    public int getColor(ItemStack itemStack, int index) {
        return color.getRGB();
    }

}
