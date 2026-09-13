package com.skittle.furniture.objects.blocks;

import com.skittle.furniture.Furniture;
import com.skittle.furniture.init.BlockInit;
import com.skittle.furniture.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockTable extends MultipleBlock
{
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		boolean back = (worldIn.getBlockState(pos.south()).getBlock() == this);
		boolean forward = (worldIn.getBlockState(pos.north()).getBlock() == this);
		boolean left = (worldIn.getBlockState(pos.west()).getBlock() == this);
		boolean right = (worldIn.getBlockState(pos.east()).getBlock() == this);
		
		return state.withProperty(BACK, Boolean.valueOf(back)).withProperty(FORWARD, Boolean.valueOf(forward)).withProperty(LEFT, Boolean.valueOf(left)).withProperty(RIGHT, Boolean.valueOf(right));
	}
	
	public BlockTable(String name, Material material, SoundType soundType, float hardness, float resistance, String harvestLevel) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Furniture.TABLE_BLOCKS);
		
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestLevel, 0);
		
		setSoundType(soundType);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}
