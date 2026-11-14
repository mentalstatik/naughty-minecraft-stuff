package pulsescanner.mixin;

import net.minecraft.class_11246;
import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_332.class})
public interface DrawContextAccessor {
   @Accessor("field_59826")
   class_11246 pulse$getState();
}
