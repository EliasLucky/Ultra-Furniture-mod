package com.skittle.furniture.init;

import java.util.ArrayList;
import java.util.List;

import com.skittle.furniture.objects.blocks.BlockChair;
import com.skittle.furniture.objects.blocks.BlockCheckered;
import com.skittle.furniture.objects.blocks.BlockTable;
import com.skittle.furniture.objects.blocks.ToiletPaper;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Chair Block Tab
	public static final Block CHAIR_DINING_NORMAL_WHITE = new BlockChair("chair_dining_normal_white", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_CLEAR = new BlockChair("chair_dining_normal_clear", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_SHABBY = new BlockChair("chair_dining_normal_shabby", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_GRAY = new BlockChair("chair_dining_normal_gray", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_NATURAL = new BlockChair("chair_dining_normal_natural", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_BROWN = new BlockChair("chair_dining_normal_brown", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_ANTIQUE = new BlockChair("chair_dining_normal_antique", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_DARK = new BlockChair("chair_dining_normal_dark", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_NORMAL_BLACK = new BlockChair("chair_dining_normal_black", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	public static final Block CHAIR_DINING_NORMAL_RED = new BlockChair("chair_dining_normal_red", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	
	public static final Block CHAIR_DINING_WINDSOR_WHITE = new BlockChair("chair_dining_windsor_white", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_CLEAR = new BlockChair("chair_dining_windsor_clear", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_SHABBY = new BlockChair("chair_dining_windsor_shabby", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_GRAY = new BlockChair("chair_dining_windsor_gray", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_NATURAL = new BlockChair("chair_dining_windsor_natural", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_BROWN = new BlockChair("chair_dining_windsor_brown", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_ANTIQUE = new BlockChair("chair_dining_windsor_antique", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_DARK = new BlockChair("chair_dining_windsor_dark", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_DINING_WINDSOR_BLACK = new BlockChair("chair_dining_windsor_black", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	public static final Block CHAIR_DINING_WINDSOR_RED = new BlockChair("chair_dining_windsor_red", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	//shabby -> gray
	//antique -> crimson
	
	public static final Block CHAIR_GREEK_WHITE = new BlockChair("chair_greek_white", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	public static final Block CHAIR_GREEK_RED = new BlockChair("chair_greek_red", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block CHAIR_GREEK_BROWN = new BlockChair("chair_greek_brown", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	//remove chairs greek
	
	//Table Block Tab
	public static final Block TABLE_DINING_TURNEDLEG_WHITE = new BlockTable("table_dining_turnedleg_white", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block TABLE_DINING_TURNEDLEG_CLEAR = new BlockTable("table_dining_turnedleg_clear", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block TABLE_DINING_TURNEDLEG_NATURAL = new BlockTable("table_dining_turnedleg_natural", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block TABLE_DINING_TURNEDLEG_BROWN = new BlockTable("table_dining_turnedleg_brown", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block TABLE_DINING_TURNEDLEG_DARK = new BlockTable("table_dining_turnedleg_dark", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	public static final Block TABLE_DINING_TURNEDLEG_BLACK = new BlockTable("table_dining_turnedleg_black", Material.WOOD, SoundType.WOOD, 2.0F, 2.0F, "axe");
	
	
	//Decoration Block Tab
	public static final Block CHECKERED_QUARTZ_WHITE = new BlockCheckered("checkered_quartz_white", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_BLACK = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	
	/*
	public static final Block CHECKERED_QUARTZ_RED = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_ORANGE = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_YELLOW = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_GREEN = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_LIME = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_CYAN = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_BLUE = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_LIGHT_BLUE = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_PURPLE = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_MAGENTA = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_PINK = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	
	public static final Block CHECKERED_QUARTZ_LIGHT_GRAY = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_GRAY = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	public static final Block CHECKERED_QUARTZ_BLACK = new BlockCheckered("checkered_quartz_black", Material.ROCK);
	
	*/
	//Other
	public static final Block TOILET_PAPER = new ToiletPaper("toilet_paper", Material.ROCK);
	
}
