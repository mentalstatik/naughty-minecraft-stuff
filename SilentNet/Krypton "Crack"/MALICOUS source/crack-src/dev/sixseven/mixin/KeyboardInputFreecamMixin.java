package dev.sixseven.mixin;

import dev.sixseven.d.a.H;
import java.lang.reflect.Method;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_743.class})
public class KeyboardInputFreecamMixin {
   private static final Method SIXSEVENCLIENT$ALLOW_INVENTORY_MOVEMENT = sixsevenclient$findNoStunInventoryMethod();

   @Inject(
      method = {"method_3129"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$freecamReapplyCachedBodyInput(CallbackInfo var1) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1724 != null && var2.field_1724.field_3913 == this) {
         if (sixsevenclient$allowInventoryMovement(var2)) {
            class_315 var3 = var2.field_1690;
            boolean var4 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1894);
            boolean var5 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1881);
            boolean var6 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1913);
            boolean var7 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1849);
            boolean var8 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1903);
            boolean var9 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1832);
            boolean var10 = this.sixsevenclient$isPhysicalDown(var2, var3.field_1867);
            ((ClientInputAccessor)this).sixsevenclient$setKeyPresses(new class_10185(var4, var5, var6, var7, var8, var9, var10));
            float var11 = (var6 ? 1.0F : 0.0F) - (var7 ? 1.0F : 0.0F);
            float var12 = (var4 ? 1.0F : 0.0F) - (var5 ? 1.0F : 0.0F);
            ((ClientInputAccessor)this).sixsevenclient$setMoveVector(new class_241(var11, var12).method_35581());
         }

         H var13 = H.k();
         if (var13 != null && var13.m()) {
            H.c(var2);
         }
      }
   }

   private static Method sixsevenclient$findNoStunInventoryMethod() {
      try {
         return Class.forName("dev.sixseven.d.a.Y").getMethod("a", class_310.class);
      } catch (LinkageError | ReflectiveOperationException var1) {
         return null;
      }
   }

   private static boolean sixsevenclient$allowInventoryMovement(class_310 var0) {
      if (SIXSEVENCLIENT$ALLOW_INVENTORY_MOVEMENT == null) {
         return false;
      } else {
         try {
            return Boolean.TRUE.equals(SIXSEVENCLIENT$ALLOW_INVENTORY_MOVEMENT.invoke(null, var0));
         } catch (RuntimeException | ReflectiveOperationException var2) {
            return false;
         }
      }
   }

   private boolean sixsevenclient$isPhysicalDown(class_310 var1, class_304 var2) {
      long var3 = var1.method_22683().method_4490();
      if (var3 == 0L) {
         return var2.method_1434();
      } else {
         class_306 var5 = ((KeyMappingAccessor)var2).sixsevenclient$getKey();
         int var6 = var5.method_1444();
         if (var5.method_1442() == class_307.field_1672) {
            return GLFW.glfwGetMouseButton(var3, var6) == 1;
         } else {
            return var5.method_1442() == class_307.field_1668 ? GLFW.glfwGetKey(var3, var6) == 1 : var2.method_1434();
         }
      }
   }
}
