package shmoe6.s58.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import shmoe6.s58.main;
import shmoe6.s58.init.ModBlocks;
import shmoe6.s58.init.ModItems;
import shmoe6.s58.util.IHasModel;

public class BlockTesla extends Block implements IHasModel
{
	public BlockTesla(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.site58tab);
		setHardness(4.0F);
		setLightLevel(10.0F);
		setLightOpacity(1);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
    
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.attackEntityFrom(DamageSource.CACTUS, 9.0F);
    }
}