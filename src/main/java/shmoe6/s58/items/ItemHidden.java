package shmoe6.s58.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import shmoe6.s58.Main;
import shmoe6.s58.init.ModItems;
import shmoe6.s58.util.IHasModel;

public class ItemHidden extends Item implements IHasModel
{
	public ItemHidden(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab();
		
		ModItems.instance.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
