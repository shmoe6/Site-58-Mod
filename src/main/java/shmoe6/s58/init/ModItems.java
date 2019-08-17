package shmoe6.s58.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import shmoe6.s58.items.ItemBase;
import shmoe6.s58.items.ItemHidden;

public class ModItems 
{
	public static ModItems instance;
	public final List<Item> ITEMS = new ArrayList<Item>();
	
	public Item SCPLOGO;
//	public static final Item TEST = new ItemBase("test");
	
	public ModItems() {
		instance = this;
		SCPLOGO = new ItemHidden("scplogo");
	}
}
