package shmoe6.s58;

import shmoe6.s58.init.ModBlocks;
import shmoe6.s58.init.ModEntities;
import shmoe6.s58.init.ModItems;
import shmoe6.s58.proxy.CommonProxy;
import shmoe6.s58.tabs.Site58Tab;
import shmoe6.s58.util.Reference;
import shmoe6.s58.util.handlers.RegistryHandler;
import shmoe6.s58.util.handlers.RenderHandler;
import shmoe6.s58.util.handlers.SoundsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	public static final CreativeTabs site58tab = new Site58Tab("site58tab");

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		new ModItems();
		new ModBlocks();
		new RegistryHandler();
		new ModEntities();
		
		if (event.getSide().equals(Side.CLIENT)) {
			new RenderHandler();
		}
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		new SoundsHandler();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}
}