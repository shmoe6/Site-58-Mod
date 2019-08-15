package shmoe6.s58.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntitySCP035 extends EntityPigZombie
{
	public EntitySCP035(World worldIn) 
	{
		super(worldIn);
	}
	
//	@Override
//	public EntityPigZombie createChild(EntityAgeable ageable)
//	{
//		return new EntitySCP035(world);
//	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return super.getDeathSound();
	}

}
