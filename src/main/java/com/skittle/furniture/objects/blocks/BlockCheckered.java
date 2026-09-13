package com.skittle.furniture.objects.blocks;

import com.skittle.furniture.Furniture;
import com.skittle.furniture.init.BlockInit;
import com.skittle.furniture.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockCheckered extends Block
{
	public BlockCheckered(String name, Material material)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Furniture.DECORATION_BLOCKS);
		
		setHardness(4.0F);
		setResistance(4.0F);
		setHarvestLevel("pickaxe", 0);
		
		setSoundType(SoundType.STONE);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
