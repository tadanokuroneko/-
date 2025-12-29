package com.tadanokuroneko.StellaMagica.main;

import com.tadanokuroneko.StellaMagica.regi.StellaMagicaItems;
import com.tadanokuroneko.StellaMagica.regi.tab.StellaMagicaTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLanguageProvider;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("stellamagica")
public class StellaMagica {

    public static final String  MOD_ID = "stellamagica";
    public static Item[] items;

    public StellaMagica(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        StellaMagicaItems.ITEMS.register(bus);
        StellaMagicaTabs.MOD_TABS.register(bus);
    }
}

