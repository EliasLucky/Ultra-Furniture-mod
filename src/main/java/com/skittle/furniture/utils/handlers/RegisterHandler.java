package com.skittle.furniture.utils.handlers;

import com.skittle.furniture.Furniture;
import com.skittle.furniture.init.BlockInit;
import com.skittle.furniture.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegisterHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS) {
			Furniture.proxy.registerItemRenderer(item, 0, "inventory");
		}
		for(Block block : BlockInit.BLOCKS) {
			Furniture.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
}
