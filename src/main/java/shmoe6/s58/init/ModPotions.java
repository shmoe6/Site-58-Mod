/* package shmoe6.s58.init;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import shmoe6.s58.potions.CustomPotion;

public class ModPotions 
{
	public static final Potion HIGH = new CustomPotion("shortscp420j", true, 47872, 0, 0).registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, MathHelper.getRandomUUID(), -5.0D, 2);
	
	public static final PotionType SHORTSCP420J = new PotionType("shortscp420j", new PotionEffect[] {new PotionEffect(HIGH, 2400)}).setRegistryName("shortscp420j");
	public static final PotionType SCP420J = new PotionType("scp420j", new PotionEffect[] {new PotionEffect(HIGH, 9999)}).setRegistryName("scp420j");
	
	public static void registerPotions()
	{
		registerPotion(SHORTSCP420J, SCP420J, HIGH);
		
		registerPotionMixes();
	}
	
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect)
	{
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
	
	private static void registerPotionMixes()
	{
		PotionHelper.addMix(SHORTSCP420J, Items.REDSTONE, SCP420J);
		PotionHelper.addMix(PotionTypes.AWKWARD, ModItems.SCPLOGO, SCP420J);
	}
}
*/