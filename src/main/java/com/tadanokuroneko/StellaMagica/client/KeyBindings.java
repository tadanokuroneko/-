package com.tadanokuroneko.StellaMagica.client;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = "stellamagica", bus = Bus.MOD)
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

    @Mod.EventBusSubscriber(modid = "stellamagica", value = Dist.CLIENT, bus = Bus.FORGE)
    public static class ClientEvents {
        @SubscribeEvent
        public static void onClientTick(ClientTickEvent event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc == null) return;

            if (OPEN_RADIAL.isDown()) {
                if (!(mc.screen instanceof RadialMenuScreen)) {
                    mc.setScreen(new RadialMenuScreen());
                }
            } else {
                if (mc.screen instanceof RadialMenuScreen) {
                    mc.screen.onClose();
                }
            }
        }
    }
}