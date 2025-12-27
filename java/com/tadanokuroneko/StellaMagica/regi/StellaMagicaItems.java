package com.tadanokuroneko.StellaMagica.regi;

import com.tadanokuroneko.StellaMagica.main.StellaMagica;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StellaMagicaItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StellaMagica.MOD_ID);

    public static final RegistryObject<Item> WOODWAND = ITEMS.register("woodwand", ItemWoodWand::new);
}
