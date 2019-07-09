/*    */ package shmoe6.s58.blocks;
/*    */ 
/*    */ import shmoe6.s58.Main;
/*    */ import shmoe6.s58.init.ModBlocks;
/*    */ import shmoe6.s58.init.ModItems;
/*    */ import shmoe6.s58.sounds.SoundList;
/*    */ import shmoe6.s58util.IHasModel;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ 
/*    */ public class MetalBlock
/*    */   extends Block
/*    */   implements shmoe6.s58.util.IHasModel {
/*    */   public MetalBlock(String name, Material material) {
/* 17 */     super(material);
/* 18 */     func_149663_c(name);
/* 19 */     setRegistryName(name);
/* 20 */     func_149711_c(3.0F);
/* 21 */     func_149647_a(Main.scpletab);
/* 22 */     //func_149672_a(SoundList.METAL_FLOOR_A);
/* 23 */     ModBlocks.BLOCKS.add(this);
/* 24 */     ModItems.ITEMS.add((new ItemBlock(this)).setRegistryName(getRegistryName()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 30 */   public void registerModels() { Main.proxy.registerItemRenderer(Item.func_150898_a(this), 0, "inventory"); }
/*    */ }