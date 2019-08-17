package shmoe6.s58.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import shmoe6.s58.Main;
import shmoe6.s58.entity.EntitySCP035;
import shmoe6.s58.util.Reference;

public class ModEntities {
	public ModEntities() {
		this.registerEntity("scp035", EntitySCP035.class, Reference.ENTITY_SCP035, 50, 3093151, 11350687);
	}

	private void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1,
			int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id,
				Main.instance, range, 1, true, color1, color2);
	}
}