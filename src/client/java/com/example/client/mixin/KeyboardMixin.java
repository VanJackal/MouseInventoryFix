package com.example.client.mixin;

import com.example.ExampleMod;
import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.input.KeyEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardHandler.class)
public class KeyboardMixin {

    @Inject(at=@At("HEAD"), method="keyPress")
    public void keyPress(final long handle,
                         final @KeyEvent.Action int action,
                         final KeyEvent event,
                         CallbackInfo ci) {
        ExampleMod.LOGGER.debug("Key pressed: {}, {}", action, event);
    }

}
