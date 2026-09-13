package com.skittle.furniture.misc.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class StorageBlocksTab extends CreativeTabs
{
	public StorageBlocksTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(Blocks.PLANKS));
	}
}
