package pulsescanner.mixin;

import net.minecraft.class_2338;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_636.class})
public interface ClientPlayerInteractionManagerAccessor {
   @Accessor("field_3717")
   boolean pulse$isBreaking();

   @Accessor("field_3714")
   class_2338 pulse$getBreakingPos();

   @Accessor("field_3715")
   float pulse$getBreakingProgress();

   @Accessor("field_3715")
   void pulse$setBreakingProgress(float var1);

   @Accessor("field_3716")
   int pulse$getCooldown();

   @Accessor("field_3716")
   void pulse$setCooldown(int var1);

   @Invoker("method_2911")
   void pulse$syncSelectedSlot();
}
