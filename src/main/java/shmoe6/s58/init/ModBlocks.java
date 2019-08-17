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
	public static ModBlocks instance;
	public final List<Block> BLOCKS = new ArrayList<Block>();
	
	public ModBlocks() {
		instance = this;
		
		// yes i know this code is messy but it makes the Creative Tab look really organised
		//TOP
		PURPLE_OFFICE_TOP = new BlockBase("purple_office_top", Material.IRON);
		RED_OFFICE_TOP = new BlockBase("red_office_top", Material.IRON);
		YELLOW_OFFICE_TOP = new BlockBase("yellow_office_top", Material.IRON);
		GREEN_OFFICE_TOP = new BlockBase("green_office_top", Material.IRON);
		DARK_GREEN_OFFICE_TOP = new BlockBase("dark_green_office_top", Material.IRON);
		LIGHT_BLUE_OFFICE_TOP = new BlockBase("light_blue_office_top", Material.IRON);
		BLUE_OFFICE_TOP = new BlockBase("blue_office_top", Material.IRON);
		GRAY_OFFICE_TOP = new BlockBase("gray_office_top", Material.IRON);
		BLACK_OFFICE_TOP = new BlockBase("black_office_top", Material.IRON);
		// LINE
		PURPLE_OFFICE_LINE = new BlockBase("purple_office_line", Material.IRON);
		RED_OFFICE_LINE = new BlockBase("red_office_line", Material.IRON);
		YELLOW_OFFICE_LINE = new BlockBase("yellow_office_line", Material.IRON);
		GREEN_OFFICE_LINE = new BlockBase("green_office_line", Material.IRON);
		DARK_GREEN_OFFICE_LINE = new BlockBase("dark_green_office_line", Material.IRON);
		LIGHT_BLUE_OFFICE_LINE = new BlockBase("light_blue_office_line", Material.IRON);
		BLUE_OFFICE_LINE = new BlockBase("blue_office_line", Material.IRON);
		GRAY_OFFICE_LINE = new BlockBase("gray_office_line", Material.IRON);
		BLACK_OFFICE_LINE = new BlockBase("black_office_line", Material.IRON);
		// BOTTOM
		PURPLE_OFFICE_BOTTOM = new BlockBase("purple_office_bottom", Material.IRON);
		RED_OFFICE_BOTTOM = new BlockBase("red_office_bottom", Material.IRON);
		YELLOW_OFFICE_BOTTOM = new BlockBase("yellow_office_bottom", Material.IRON);
		GREEN_OFFICE_BOTTOM = new BlockBase("green_office_bottom", Material.IRON);
		DARK_GREEN_OFFICE_BOTTOM = new BlockBase("dark_green_office_bottom", Material.IRON);
		LIGHT_BLUE_OFFICE_BOTTOM = new BlockBase("light_blue_office_bottom", Material.IRON);
		BLUE_OFFICE_BOTTOM = new BlockBase("blue_office_bottom", Material.IRON);
		GRAY_OFFICE_BOTTOM = new BlockBase("gray_office_bottom", Material.IRON);
		BLACK_OFFICE_BOTTOM = new BlockBase("black_office_bottom", Material.IRON);

		// WC
		WC_BLOCK = new BlockBase("wc_block", Material.IRON);
		MALE_WC_BLOCK = new BlockBase("male_wc_block", Material.IRON);
		FEMALE_WC_BLOCK = new BlockBase("female_wc_block", Material.IRON);

		// GOI BLOCKS
		SH_BLOCK = new BlockBase("sh_block", Material.IRON);
		CI_BLOCK = new BlockBase("ci_block", Material.IRON);

//		public static final Block SCPLEVER = new BlockSCPLever("scp_lever");

		TESLA_GATE = new BlockTesla("tesla_gate", Material.CLOTH);
	}
	
//	 Office Blocks
	// yes i know this code is messy but it makes the Creative Tab look really organised
	//TOP
	public Block PURPLE_OFFICE_TOP;
	public Block RED_OFFICE_TOP;
	public Block YELLOW_OFFICE_TOP;
	public Block GREEN_OFFICE_TOP;
	public Block DARK_GREEN_OFFICE_TOP;
	public Block LIGHT_BLUE_OFFICE_TOP;
	public Block BLUE_OFFICE_TOP;
	public Block GRAY_OFFICE_TOP;
	public Block BLACK_OFFICE_TOP;
	//LINE
	public Block PURPLE_OFFICE_LINE;
	public Block RED_OFFICE_LINE;
	public Block YELLOW_OFFICE_LINE;
	public Block GREEN_OFFICE_LINE;
	public Block DARK_GREEN_OFFICE_LINE;
	public Block LIGHT_BLUE_OFFICE_LINE;
	public Block BLUE_OFFICE_LINE;
	public Block GRAY_OFFICE_LINE;
	public Block BLACK_OFFICE_LINE;
	//BOTTOM
	public Block PURPLE_OFFICE_BOTTOM;
	public Block RED_OFFICE_BOTTOM;
	public Block YELLOW_OFFICE_BOTTOM;
	public Block GREEN_OFFICE_BOTTOM;
	public Block DARK_GREEN_OFFICE_BOTTOM;
	public Block LIGHT_BLUE_OFFICE_BOTTOM;
	public Block BLUE_OFFICE_BOTTOM;
	public Block GRAY_OFFICE_BOTTOM;
	public Block BLACK_OFFICE_BOTTOM;
	
	//WC
	public Block WC_BLOCK;
	public Block MALE_WC_BLOCK;
	public Block FEMALE_WC_BLOCK;
	
	//GOI BLOCKS
	public Block SH_BLOCK;
	public Block CI_BLOCK;
	
	
	
//	public static final Block SCPLEVER = new BlockSCPLever("scp_lever");
	
	public Block TESLA_GATE;
	
}