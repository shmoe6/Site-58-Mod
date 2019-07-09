package shmoe6.s58.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shmoe6.s58.blocks.BlockBase;
import shmoe6.s58.blocks.BlockSCPLever;
import shmoe6.s58.blocks.BlockTesla;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
//	 Office Blocks
	// yes i know this code is messy but it makes the Creative Tab look really organised
	//TOP
	public static final Block PURPLE_OFFICE_TOP = new BlockBase("purple_office_top", Material.IRON);
	public static final Block RED_OFFICE_TOP = new BlockBase("red_office_top", Material.IRON);
	public static final Block YELLOW_OFFICE_TOP = new BlockBase("yellow_office_top", Material.IRON);
	public static final Block GREEN_OFFICE_TOP = new BlockBase("green_office_top", Material.IRON);
	public static final Block DARK_GREEN_OFFICE_TOP = new BlockBase("dark_green_office_top", Material.IRON);
	public static final Block LIGHT_BLUE_OFFICE_TOP = new BlockBase("light_blue_office_top", Material.IRON);
	public static final Block BLUE_OFFICE_TOP = new BlockBase("blue_office_top", Material.IRON);
	public static final Block GRAY_OFFICE_TOP = new BlockBase("gray_office_top", Material.IRON);
	public static final Block BLACK_OFFICE_TOP = new BlockBase("black_office_top", Material.IRON);
	//LINE
	public static final Block PURPLE_OFFICE_LINE = new BlockBase("purple_office_line", Material.IRON);
	public static final Block RED_OFFICE_LINE = new BlockBase("red_office_line", Material.IRON);
	public static final Block YELLOW_OFFICE_LINE = new BlockBase("yellow_office_line", Material.IRON);
	public static final Block GREEN_OFFICE_LINE = new BlockBase("green_office_line", Material.IRON);
	public static final Block DARK_GREEN_OFFICE_LINE = new BlockBase("dark_green_office_line", Material.IRON);
	public static final Block LIGHT_BLUE_OFFICE_LINE = new BlockBase("light_blue_office_line", Material.IRON);
	public static final Block BLUE_OFFICE_LINE = new BlockBase("blue_office_line", Material.IRON);
	public static final Block GRAY_OFFICE_LINE = new BlockBase("gray_office_line", Material.IRON);
	public static final Block BLACK_OFFICE_LINE = new BlockBase("black_office_line", Material.IRON);
	//BOTTOM
	public static final Block PURPLE_OFFICE_BOTTOM = new BlockBase("purple_office_bottom", Material.IRON);
	public static final Block RED_OFFICE_BOTTOM = new BlockBase("red_office_bottom", Material.IRON);
	public static final Block YELLOW_OFFICE_BOTTOM = new BlockBase("yellow_office_bottom", Material.IRON);
	public static final Block GREEN_OFFICE_BOTTOM = new BlockBase("green_office_bottom", Material.IRON);
	public static final Block DARK_GREEN_OFFICE_BOTTOM = new BlockBase("dark_green_office_bottom", Material.IRON);
	public static final Block LIGHT_BLUE_OFFICE_BOTTOM = new BlockBase("light_blue_office_bottom", Material.IRON);
	public static final Block BLUE_OFFICE_BOTTOM = new BlockBase("blue_office_bottom", Material.IRON);
	public static final Block GRAY_OFFICE_BOTTOM = new BlockBase("gray_office_bottom", Material.IRON);
	public static final Block BLACK_OFFICE_BOTTOM = new BlockBase("black_office_bottom", Material.IRON);
	
//	public static final Block SCPLEVER = new BlockSCPLever("scp_lever");
	
	public static final Block TESLA_GATE = new BlockTesla("tesla_gate", Material.CLOTH);
		
}