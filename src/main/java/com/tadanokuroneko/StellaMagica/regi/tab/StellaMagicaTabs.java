package com.tadanokuroneko.StellaMagica.regi.tab;

import com.tadanokuroneko.StellaMagica.main.StellaMagica;
import com.tadanokuroneko.StellaMagica.regi.StellaMagicaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class StellaMagicaTabs{

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StellaMagica.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STELLAMAGICATABS = MOD_TABS.register("stellamagica",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(StellaMagicaItems.WOODWAND.get()))
                   .title(Component.translatable("itemGroup.stellamagicaTabs"))
                    .displayItems((param,output)->{
                        for(Item item:Wand.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });
    public static final RegistryObject<CreativeModeTab> StellaMagicaSUB = MOD_TABS.register("stellamagicasub",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Blocks.CHERRY_PLANKS))
                    .title(Component.translatable("itemGroup.stellamagicasub"))
                    .withTabsBefore(StellaMagicaTabs.STELLAMAGICATABS.getId())
                    .displayItems((param,output)->{
                        for (Item item : com.tadanokuroneko.StellaMagica.regi.tab.StellaMagicaSUB.items){
                            output.accept(item);
                        }
                    })
                    .build();
            });
}