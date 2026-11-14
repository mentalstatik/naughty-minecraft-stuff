package dev.sixseven.mixin;

import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_1297.class})
public interface EntityNoClipAccessor {
   @Accessor("field_5960")
   boolean sixsevenclient$getNoClip();

   @Accessor("field_5960")
   void sixsevenclient$setNoClip(boolean var1);
}
