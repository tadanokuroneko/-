package com.tadanokuroneko.StellaMagica.client;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.world.phys.Vec3;

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

        PoseStack pose = g.pose();

        for (int i = 0; i < 10; i++) {
            pose.pushPose();

            float angle = i * 36.0F; // 360 ÷ 10 = 36度
            pose.translate(cx, cy, 0); // 画面中央へ移
            pose.mulPose(Axis.ZP.rotationDegrees(angle)); // Z軸回転

            // 中心から上下に伸びる縦線（太さ4px、高さ200px）
            g.fill(-2, -100, 2, 100, 0xFFFFFFFF);

            pose.popPose();
        }
    }
    }


