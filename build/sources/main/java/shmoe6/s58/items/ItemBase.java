package shmoe6.s58.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import shmoe6.s58.main;
import shmoe6.s58.init.ModItems;
import shmoe6.s58.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.site58tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
