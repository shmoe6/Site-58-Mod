package shmoe6.s58.util.handlers;

import shmoe6.s58.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
    public static SoundsHandler instance;
    private SoundEvent ALPHA_WARHEADS;
    private SoundEvent ANNOUNCEMENT_1;
    private SoundEvent ANNOUNCEMENT_2;
    private SoundEvent ANNOUNCEMENT_3;
    private SoundEvent ANNOUNCEMENT_4;
    private SoundEvent ANNOUNCEMENT_5;
    private SoundEvent ANNOUNCEMENT_6;
    private SoundEvent ANNOUNCEMENT_7;
    private SoundEvent CHECKPOINT_OPEN;
    private SoundEvent CHECKPOINT_SIREN;
    private SoundEvent DECONTAMINATION_15_MIN;
    private SoundEvent DECONTAMINATION_5_MIN;
    private SoundEvent DECONTAMINATION_1_MIN;
    private SoundEvent DECONTAMINATION_30_SEC;
    private SoundEvent DECONTAMINATION_BEGUN;
    private SoundEvent ELEVATOR_DING;
    private SoundEvent FEMUR_BREAKER;
    private SoundEvent GENERAL_SIREN;
    private SoundEvent KETER_SIREN;
    private SoundEvent NUKE_CANCELLED;
    private SoundEvent SCP_1048_B;
    private SoundEvent SCP_1048_B_GROWTH;
    private SoundEvent SCRIPTED_1;
    private SoundEvent SCRIPTED_2;
    private SoundEvent SCRIPTED_3;
    private SoundEvent SCRIPTED_4;
    private SoundEvent SCRIPTED_5;
    private SoundEvent SCRIPTED_6;
    private SoundEvent FINAL_FLASH;
    private SoundEvent SCP_MAIN_THEME;
    private SoundEvent MELANCHOLY;
    private SoundEvent KCLASS;
    private SoundEvent BLACKMESA;
    private SoundEvent ESCAPE682;
    private SoundEvent AMBIENCE012;
    private SoundEvent GAS035;
    private SoundEvent GAS035_2;
    private SoundEvent STATIC079;
    private SoundEvent DIALOGUE079;
    private SoundEvent DIE079;
    private SoundEvent GATE079;
    private SoundEvent GUARD096;
    private SoundEvent GUARD096_2;
    private SoundEvent BLUE_FEATHER;
    private SoundEvent BUMP_IN_THE_NIGHT;
    private SoundEvent FRANKLIN2;
    private SoundEvent FRANKLIN3;
    private SoundEvent FRANKLIN4;
    private SoundEvent INTRO1;
    private SoundEvent INTRO2;
    private SoundEvent INTRO3;
    private SoundEvent MANDEVILLE;
    private SoundEvent MEDUSA;
    private SoundEvent GOLGOTHA;
    private SoundEvent SCPRADIO;
    private SoundEvent AIRLOCK;
    private SoundEvent GENERATORON;
    private SoundEvent ALARM4;
    private SoundEvent ALARM5;
    private SoundEvent FAN;
    private SoundEvent FANOFF;
    private SoundEvent FANON;
    
    public SoundsHandler()  {
    instance = this;
        ALPHA_WARHEADS = registerSound("alphawarheads");
        ANNOUNCEMENT_1 = registerSound("announcement1");
        ANNOUNCEMENT_2 = registerSound("announcement2");
        ANNOUNCEMENT_3 = registerSound("announcement3");
        ANNOUNCEMENT_4 = registerSound("announcement4");
        ANNOUNCEMENT_5 = registerSound("announcement5");
        ANNOUNCEMENT_6 = registerSound("announcement6");
        ANNOUNCEMENT_7 = registerSound("announcement7");
        CHECKPOINT_OPEN = registerSound("checkpointopen");
        CHECKPOINT_SIREN = registerSound("checkpointsiren");
        DECONTAMINATION_15_MIN = registerSound("decontamination15min");
        DECONTAMINATION_5_MIN = registerSound("decontamination5min");
        DECONTAMINATION_1_MIN = registerSound("decontamination1min");
        DECONTAMINATION_30_SEC = registerSound("decontamination30sec");
        DECONTAMINATION_BEGUN = registerSound("decontaminationbegun");
        ELEVATOR_DING = registerSound("elevatording");
        FEMUR_BREAKER = registerSound("femurbreaker");
        GENERAL_SIREN = registerSound("generalsiren");
        KETER_SIREN = registerSound("ketersiren");
        NUKE_CANCELLED = registerSound("nukecancelled");
        SCP_1048_B = registerSound("scp1048b");
        SCP_1048_B_GROWTH = registerSound("scp1048bgrowth");
        SCRIPTED_1 = registerSound("scripted1");
        SCRIPTED_2 = registerSound("scripted2");
        SCRIPTED_3 = registerSound("scripted3");
        SCRIPTED_4 = registerSound("scripted4");
        SCRIPTED_5 = registerSound("scripted5");
        SCRIPTED_6 = registerSound("scripted6");
        FINAL_FLASH = registerSound("finalflash");
        SCP_MAIN_THEME = registerSound("scpmaintheme");
        MELANCHOLY = registerSound("melancholy");
        KCLASS = registerSound("kclass");
        BLACKMESA = registerSound("blackmesa");
        ESCAPE682 = registerSound("escape682");
        AMBIENCE012 = registerSound("ambience012");
        GAS035 = registerSound("gas035");
        GAS035_2 = registerSound("gas035_2");
        STATIC079 = registerSound("static079");
        DIALOGUE079 = registerSound("dialogue079");
        DIE079 = registerSound("die079");
        GATE079 = registerSound("gate079");
        GUARD096 = registerSound("guard096");
        GUARD096_2 = registerSound("guard096_2");
        BLUE_FEATHER = registerSound("bluefeather");
        BUMP_IN_THE_NIGHT = registerSound("bumpinthenight");
        FRANKLIN2 = registerSound("franklin2");
        FRANKLIN3 = registerSound("franklin3");
        FRANKLIN4 = registerSound("franklin4");
        INTRO1 = registerSound("intro1");
        INTRO2 = registerSound("intro2");
        INTRO3 = registerSound("intro3");
        MANDEVILLE = registerSound("mandeville");
        MEDUSA = registerSound("medusa");
        GOLGOTHA = registerSound("golgotha");
        SCPRADIO = registerSound("scpradio");
        AIRLOCK = registerSound("airlock");
        GENERATORON = registerSound("generatoron");
        ALARM4 = registerSound("alarm4");
        ALARM5 = registerSound("alarm5");
        FAN = registerSound("fan");
        FANOFF = registerSound("fanoff");
        FANON = registerSound("fanon");
        
    }
    	private SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
     }
}