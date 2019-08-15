package shmoe6.s58;

import shmoe6.s58.proxy.CommonProxy;
import shmoe6.s58.tabs.Site58Tab;
import shmoe6.s58.util.Reference;
import shmoe6.s58.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class main 
{
	public static final CreativeTabs site58tab = new Site58Tab("site58tab");
	
    @Instance
    public static main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) 
    {
    	RegistryHandler.preInitRegistries();
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event) 
    {
    	RegistryHandler.initRegistries();
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) 
    {
    	
    }
}