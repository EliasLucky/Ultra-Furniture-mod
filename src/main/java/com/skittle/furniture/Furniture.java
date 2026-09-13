package com.skittle.furniture;

import com.skittle.furniture.misc.creativetab.BedBlocksTab;
import com.skittle.furniture.misc.creativetab.CarpetBlocksTab;
import com.skittle.furniture.misc.creativetab.ChairBlocksTab;
import com.skittle.furniture.misc.creativetab.CurtainBlocksTab;
import com.skittle.furniture.misc.creativetab.DecorationBlocksTab;
import com.skittle.furniture.misc.creativetab.DoorBlocksTab;
import com.skittle.furniture.misc.creativetab.ExteriorBlocksTab;
import com.skittle.furniture.misc.creativetab.FoodBlocksTab;
import com.skittle.furniture.misc.creativetab.InteriorBlocksTab;
import com.skittle.furniture.misc.creativetab.KitchenNBathBlocksTab;
import com.skittle.furniture.misc.creativetab.LightingBlocksTab;
import com.skittle.furniture.misc.creativetab.OtherBlocksTab;
import com.skittle.furniture.misc.creativetab.PlantBlocksTab;
import com.skittle.furniture.misc.creativetab.StairBlocksTab;
import com.skittle.furniture.misc.creativetab.StoneBlocksTab;
import com.skittle.furniture.misc.creativetab.StorageBlocksTab;
import com.skittle.furniture.misc.creativetab.TableBlocksTab;
import com.skittle.furniture.misc.creativetab.WallpaperBlocksTab;
import com.skittle.furniture.misc.creativetab.WindowBlocksTab;
import com.skittle.furniture.proxy.CommonProxy;
import com.skittle.furniture.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)
public class Furniture
{
	@Instance
	public static Furniture instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	//Page 1
	public static final CreativeTabs PLANT_BLOCKS = new PlantBlocksTab("plant_blocks");
	public static final CreativeTabs EXTERIOR_BLOCKS = new ExteriorBlocksTab("exterior_blocks");
	public static final CreativeTabs INTERIOR_BLOCKS = new InteriorBlocksTab("interior_blocks");
	public static final CreativeTabs LIGHTING_BLOCKS = new LightingBlocksTab("lighting_blocks");
	public static final CreativeTabs FOOD_BLOCKS = new FoodBlocksTab("food_blocks");
	
	public static final CreativeTabs CHAIR_BLOCKS = new ChairBlocksTab("chair_blocks");
	public static final CreativeTabs TABLE_BLOCKS = new TableBlocksTab("table_blocks");
	public static final CreativeTabs SHELFNSTORAGE_BLOCKS = new StorageBlocksTab("shelfandstorage_blocks");
	public static final CreativeTabs KITCHENNBATH_BLOCKS = new KitchenNBathBlocksTab("kitchenandbath_blocks");
	public static final CreativeTabs BED_BLOCKS = new BedBlocksTab("bed_blocks");
	
	//Page 2
	public static final CreativeTabs STONE_BLOCKS = new StoneBlocksTab("stone_blocks");
	public static final CreativeTabs OTHER_BLOCKS = new OtherBlocksTab("other_blocks");
	public static final CreativeTabs WALLPAPER_BLOCKS = new WallpaperBlocksTab("wallpaper_blocks");
	public static final CreativeTabs CARPET_BLOCKS = new CarpetBlocksTab("carpet_blocks");
	public static final CreativeTabs DECORATION_BLOCKS = new DecorationBlocksTab("decoration_blocks");
	
	public static final CreativeTabs DOOR_BLOCKS = new DoorBlocksTab("door_blocks");
	public static final CreativeTabs WINDOW_BLOCKS = new WindowBlocksTab("window_blocks");
	public static final CreativeTabs CURTAIN_BLOCKS = new CurtainBlocksTab("curtain_blocks");
	public static final CreativeTabs STAIR_BLOCKS = new StairBlocksTab("stair_blocks");
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {  };
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		System.out.println("Ultra Furniture Mod. Only play this mod if you got it from CurseForge. Author: Skittle-man a.k.a Elias Lucky, discord - Skittle-man#4320");
	};
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {  };
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) {  };
}
