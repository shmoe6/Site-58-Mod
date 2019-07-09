package shmoe6.s58.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SoundEvent extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<SoundEvent>
{
    public static final RegistryNamespaced<ResourceLocation, SoundEvent> REGISTRY = net.minecraftforge.registries.GameData.getWrapper(SoundEvent.class);
    private final ResourceLocation soundName;
    private static int soundEventId;

    public SoundEvent(ResourceLocation soundNameIn)
    {
        this.soundName = soundNameIn;
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getSoundName()
    {
        return this.soundName;
    }

    public static void registerSounds()
    {
        registerSound("finalflash");
    }

    private static void registerSound(String soundNameIn)
    {
        ResourceLocation resourcelocation = new ResourceLocation(soundNameIn);
        REGISTRY.register(soundEventId++, resourcelocation, new SoundEvent(resourcelocation));
    }
}