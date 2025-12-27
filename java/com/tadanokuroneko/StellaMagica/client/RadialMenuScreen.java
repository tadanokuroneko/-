package com.tadanokuroneko.StellaMagica.client;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class RadialMenuScreen extends Screen {

    private static final ResourceLocation RADIAL_10 =
            new ResourceLocation("stellamagica", "textures/gui/radial_10.png");

    public RadialMenuScreen() {
        super(Component.literal("Radial Menu"));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float partialTicks) {
        super.render(g, mouseX, mouseY, partialTicks);

        int cx = width / 2;
        int cy = height / 2;

        g.blit(RADIAL_10, cx - 128, cy - 128, 0, 0, 256, 256);
    }
}