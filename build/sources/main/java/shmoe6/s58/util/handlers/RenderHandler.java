package shmoe6.s58.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import shmoe6.s58.entity.EntitySCP035;
import shmoe6.s58.entity.render.RenderSCP035;

public class RenderHandler 
{
	public static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySCP035.class, new IRenderFactory<EntitySCP035>()
		{
			 @Override
			 public Render<? super EntitySCP035> createRenderFor(RenderManager manager)
			 {
				 return new RenderSCP035(manager);
			 }
		});
	}
}
