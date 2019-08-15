package shmoe6.s58.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import shmoe6.s58.entity.EntitySCP035;
import shmoe6.s58.entity.model.ModelSCP035;
import shmoe6.s58.util.Reference;

public class RenderSCP035 extends RenderLiving<EntitySCP035>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/SCP035.png");
	
	public RenderSCP035(RenderManager manager)
	{
		super(manager, new ModelSCP035(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySCP035 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySCP035 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
