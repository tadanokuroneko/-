package com.tadanokuroneko.StellaMagica.client;

import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "stellamagica", bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeyBindings {

    public static final KeyMapping OPEN_RADIAL = new KeyMapping(
            "key.stellamagica.open_radial",
            GLFW.GLFW_KEY_N,
            "key.categories.gameplay"
    );

    @SubscribeEvent
    public static void onRegisterKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(OPEN_RADIAL);
    }
}

