package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class TracerMod implements ClientModInitializer {

    public static boolean enabled = true;
    public static KeyBinding toggleKey;

    @Override
    public void onInitializeClient() {

        toggleKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.tracer.toggle",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_X,
                        "category.tracer"
                )
        );

        TracerRenderer.register();
    }
}
