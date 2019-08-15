package shmoe6.s58.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shmoe6.s58.main;
import shmoe6.s58.init.ModBlocks;
import shmoe6.s58.init.ModItems;
import shmoe6.s58.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.site58tab);
		setHardness(4.0F);
		setResistance(45.0F);
		setHarvestLevel("pickaxe", 1);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
