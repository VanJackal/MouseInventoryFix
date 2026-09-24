package com.example.client.mixin;

import com.example.ExampleMod;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.input.MouseButtonInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public class MouseMixin {
    @Inject(at= @At("HEAD"), method="onButton")
    public void onButton(final long handle,
                         final MouseButtonInfo info,
                         final @MouseButtonInfo.Action int action,
                         CallbackInfo ci){
        ExampleMod.LOGGER.info("Mouse button triggered: {}, {}", info, action);
    }
}
