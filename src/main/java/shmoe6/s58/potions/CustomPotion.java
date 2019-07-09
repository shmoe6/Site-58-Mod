
package shmoe6.s58.potions;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import shmoe6.s58.util.Reference;

public class CustomPotion extends Potion 
{
	public CustomPotion(String name, boolean isBadPotion, int color, int iconIndexX, int iconIndexY)
	{
		super(isBadPotion, color);
		setPotionName("effect." + name);
		setIconIndex(iconIndexX, iconIndexY);
		setRegistryName(new ResourceLocation(Reference.MODID + ":" + name));
	}
	
	@Override
	public boolean hasStatusIcon()
	{
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MODID + "textures/gui/potioneffects.png"));
		return true;
	}
}
