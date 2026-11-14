package dev.sixseven.g;

import dev.sixseven.d.a.O;
import java.util.Deque;
import net.minecraft.class_12249;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_7833;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;

public final class p {
   private static final class_2960 a = class_2960.method_60655("sixsevenclient", "textures/misc/67.png");
   private static final class_2960 b = class_2960.method_60655("sixsevenclient", "textures/misc/ring.png");
   private static final float c = 0.25F;
   private static final float d = 0.4F;
   private static final float e = 0.45F;
   private static final float f = 10.0F;
   private static final int g = 16761566;

   private p() {
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, O module) {
      Deque var4 = module.k();
      if (!var4.isEmpty()) {
         long var5 = System.nanoTime();
         float var7 = Math.max(0.1F, module.c.d());

         while (!var4.isEmpty() && ((O.a)var4.peekFirst()).a(var5) > var7) {
            var4.removeFirst();
         }

         if (!var4.isEmpty()) {
            float var8 = module.a.d();
            int var9 = a(module);
            class_4588 var10 = bufferSource.method_73477(class_12249.method_76002(a));

            for (O.a var12 : var4) {
               a(poseStack, var10, var12, cam, var5, var7, var8, var9);
            }

            if (module.e.i()) {
               class_4588 var14 = bufferSource.method_73477(class_12249.method_76002(b));

               for (O.a var13 : var4) {
                  a(poseStack, var14, var13, cam, var5, var8, var9);
               }
            }
         }
      }
   }

   private static void a(class_4587 poseStack, class_4588 buffer, O.a circle, class_243 cam, long now, float lifetime, float size, int baseRgb) {
      float var9 = circle.a(now);
      float var10;
      float var11;
      if (var9 < 0.25F) {
         float var12 = var9 / 0.25F;
         var10 = d(var12);
         var11 = b(Math.min(1.0F, var12 * 2.0F));
      } else if (var9 > lifetime - 0.4F) {
         float var16 = (var9 - (lifetime - 0.4F)) / 0.4F;
         var10 = a(b(var16), 1.0F, 1.3F);
         var11 = 1.0F - c(var16);
      } else {
         var10 = 1.0F;
         var11 = 1.0F;
      }

      float var17 = 0.5F + 0.5F * class_3532.method_15374((double)(var9 * 10.0F));
      var11 *= 0.82F + 0.18F * var17;
      int var13 = a(baseRgb, 16761566, var17 * 0.35F);
      int var14 = a(var13, var11);
      poseStack.method_22903();
      poseStack.method_22904(circle.a - cam.field_1352, circle.b + (double)circle.e - cam.field_1351, circle.c - cam.field_1350);
      poseStack.method_22907(class_7833.field_40716.rotationDegrees(180.0F - circle.d));
      a(poseStack.method_23760(), buffer, 0.5F * size * var10, var14);
      poseStack.method_22909();
   }

   private static void a(class_4587 poseStack, class_4588 buffer, O.a circle, class_243 cam, long now, float size, int baseRgb) {
      float var8 = circle.a(now);
      if (!(var8 >= 0.45F)) {
         float var9 = var8 / 0.45F;
         float var10 = a(b(var9), 0.35F, 2.2F) * size;
         float var11 = 0.85F * (1.0F - c(var9));
         int var12 = a(baseRgb, var11);
         poseStack.method_22903();
         poseStack.method_22904(circle.a - cam.field_1352, circle.b + (double)(circle.e * 0.5F) + 0.004F - cam.field_1351, circle.c - cam.field_1350);
         a(poseStack.method_23760(), buffer, var10, var12);
         poseStack.method_22909();
      }
   }

   private static int a(O module) {
      if (module.d.i()) {
         float var1 = (float)(System.currentTimeMillis() % 4000L) / 4000.0F;
         return class_3532.method_15369(var1, 0.75F, 1.0F) & 16777215;
      } else {
         return module.m();
      }
   }

   private static void a(class_4665 pose, class_4588 buffer, float half, int argb) {
      a(pose, buffer, -half, -half, 0.0F, 0.0F, argb);
      a(pose, buffer, -half, half, 0.0F, 1.0F, argb);
      a(pose, buffer, half, half, 1.0F, 1.0F, argb);
      a(pose, buffer, half, -half, 1.0F, 0.0F, argb);
   }

   private static void a(class_4665 pose, class_4588 buffer, float x, float z, float u, float v, int argb) {
      buffer.method_56824(pose, x, 0.0F, z)
         .method_39415(argb)
         .method_22913(u, v)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_60831(pose, 0.0F, 1.0F, 0.0F);
   }

   private static int a(int rgb, float alpha) {
      int var2 = (int)(a(alpha) * 255.0F);
      return var2 << 24 | rgb & 16777215;
   }

   private static int a(int from, int to, float t) {
      int var3 = (int)class_3532.method_16439(t, (float)(from >> 16 & 0xFF), (float)(to >> 16 & 0xFF));
      int var4 = (int)class_3532.method_16439(t, (float)(from >> 8 & 0xFF), (float)(to >> 8 & 0xFF));
      int var5 = (int)class_3532.method_16439(t, (float)(from & 0xFF), (float)(to & 0xFF));
      return var3 << 16 | var4 << 8 | var5;
   }

   private static float a(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   private static float a(float t, float a, float b) {
      return ax + (bx - ax) * t;
   }

   private static float b(float t) {
      t = a(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private static float c(float t) {
      t = a(t);
      return t * t;
   }

   private static float d(float t) {
      t = a(t);
      float var1 = 2.2F;
      float var2 = var1 + 1.0F;
      float var3 = t - 1.0F;
      return 1.0F + var2 * var3 * var3 * var3 + var1 * var3 * var3;
   }
}
