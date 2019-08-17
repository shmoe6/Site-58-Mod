package shmoe6.s58.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shmoe6.s58.init.ModItems;

public class Site58Tab extends CreativeTabs
{
	public Site58Tab(String label) { super("site58tab");
/*	this.setBackgroundImageName("example.png"); */}
	public ItemStack getTabIconItem() 
	{ 
		return new ItemStack(ModItems.instance.SCPLOGO);
	}
	
}
