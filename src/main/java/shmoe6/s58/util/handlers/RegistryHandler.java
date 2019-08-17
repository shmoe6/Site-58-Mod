package shmoe6.s58.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import shmoe6.s58.init.ModBlocks;
import shmoe6.s58.init.ModEntities;
import shmoe6.s58.init.ModItems;
//import shmoe6.s58.init.ModPotions;
import shmoe6.s58.util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	public RegistryHandler() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.instance.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.instance.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ModItems.instance.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();
			}
		}

		for (Block block : ModBlocks.instance.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel) block).registerModels();
			}
		}
	}

	// public static void preInitRegistries(FMLPreInitializationEvent event)
	// {
	// ModPotions.registerPotions();
	// }

}