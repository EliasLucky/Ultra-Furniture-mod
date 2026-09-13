package com.skittle.furniture.objects.blocks;

import com.skittle.furniture.Furniture;
import com.skittle.furniture.init.BlockInit;
import com.skittle.furniture.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockChair extends DirectionalHorizontalBlock
{
	static final AxisAlignedBB BOX = new AxisAlignedBB(0.1D, 0.6D, 0.1D, 0.9D, 0.0D, 0.9D);
	
	public BlockChair(String name, Material material, SoundType soundType, float hardness, float resistance, String harvestLevel) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Furniture.CHAIR_BLOCKS);
		
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
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOX;
	}
	
	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED;
	}
}
