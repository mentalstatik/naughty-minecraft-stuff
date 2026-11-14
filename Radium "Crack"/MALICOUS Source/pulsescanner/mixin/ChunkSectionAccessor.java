package pulsescanner.mixin;

import net.minecraft.class_2826;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2826.class})
public interface ChunkSectionAccessor {
   @Accessor("field_12877")
   short pulse$getNonEmptyBlockCount();
}
