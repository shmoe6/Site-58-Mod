package shmoe6.s58.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
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
public class RegistryHandler
{
  public static void initRegistries() { new SoundsHandler(); }
  
  @SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
  
  @SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
  
  @SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
	  for(Item item : ModItems.ITEMS)
	  {
		  if(item instanceof IHasModel)
		  {
			  ((IHasModel)item).registerModels();
		  }
	  }
	  
	  for(Block block : ModBlocks.BLOCKS)
	  {
		  if(block instanceof IHasModel)
		  {
			  ((IHasModel)block).registerModels();
		  }
	  }
	}
  
  //	public static void  preInitRegistries(FMLPreInitializationEvent event)
  //	{
  	//	ModPotions.registerPotions();
  	//}
  
  		public static void preInitRegistries()
  		{
  			ModEntities.registerEntities();
  			RenderHandler.registerEntityRenderers();
  		}
	  
}