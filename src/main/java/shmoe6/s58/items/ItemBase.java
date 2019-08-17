package shmoe6.s58.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import shmoe6.s58.Main;
import shmoe6.s58.init.ModItems;
import shmoe6.s58.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.site58tab);
		
		ModItems.instance.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
