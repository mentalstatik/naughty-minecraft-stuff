package dev.sixseven.g;

import net.minecraft.class_12074;
import net.minecraft.class_12249;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_9974;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;

public final class e {
   private e() {
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_12074 state, class_243 camera, dev.sixseven.d.e.a module) {
      double var5 = (double)state.comp_4932().method_10263() - camera.field_1352;
      double var7 = (double)state.comp_4932().method_10264() - camera.field_1351;
      double var9 = (double)state.comp_4932().method_10260() - camera.field_1350;
      double var11 = (double)(System.nanoTime() % 1000000000000L) / 1.0E9;
      int var13 = a(module, var11);
      float var14 = b(module, var11);
      float var15 = module.e.d() / 100.0F;
      if (var15 > 0.004F) {
         class_4588 var16 = bufferSource.method_73477(class_12249.method_76023());
         int var17 = dev.sixseven.n.c.a(var13, var15 * (0.75F + 0.25F * var14));

         for (class_238 var19 : state.comp_4935().method_1090()) {
            a(poseStack, var16, var19.method_1014(-0.002).method_989(var5, var7, var9), var17);
         }

         bufferSource.method_37104();
      }

      float var20 = module.d.d();
      float var21 = module.c.d() / 100.0F;
      if (var21 > 0.02F) {
         class_4588 var22 = bufferSource.method_73477(class_12249.method_76017());
         class_9974.method_62296(
            poseStack, var22, state.comp_4935(), var5, var7, var9, dev.sixseven.n.c.a(var13, (0.16F + 0.22F * var14) * var21), var20 * 3.2F
         );
         bufferSource.method_37104();
         class_4588 var24 = bufferSource.method_73477(class_12249.method_76015());
         class_9974.method_62296(poseStack, var24, state.comp_4935(), var5, var7, var9, dev.sixseven.n.c.a(var13, (0.3F + 0.25F * var14) * var21), var20 * 2.0F);
         bufferSource.method_37104();
      }

      class_4588 var23 = bufferSource.method_73477(class_12249.method_76015());
      class_9974.method_62296(poseStack, var23, state.comp_4935(), var5, var7, var9, dev.sixseven.n.c.a(var13, 0.85F + 0.15F * var14), var20);
      bufferSource.method_37104();
   }

   private static int a(dev.sixseven.d.e.a module, double seconds) {
      if (module.b.i()) {
         return dev.sixseven.n.c.a((float)(seconds * 42.0 % 360.0), 0.75F, 1.0F);
      } else {
         int var3 = module.a.i() | 0xFF000000;
         if (module.f.a("Gradient Flow")) {
            float[] var4 = dev.sixseven.n.c.e(var3);
            float var5 = (var4[0] + (float)(Math.sin(seconds * 1.6) * 28.0)) % 360.0F;
            if (var5 < 0.0F) {
               var5 += 360.0F;
            }

            return dev.sixseven.n.c.a(var5, Math.max(0.4F, var4[1]), var4[2]);
         } else {
            return var3;
         }
      }
   }

   private static float b(dev.sixseven.d.e.a module, double seconds) {
      return module.f.a("Pulse") ? (float)(0.5 + 0.5 * Math.sin(seconds * Math.PI * 2.0 / 1.6)) : 1.0F;
   }

   private static void a(class_4587 poseStack, class_4588 buffer, class_238 b, int color) {
      class_4665 var4 = poseStack.method_23760();
      float var5 = (float)b.field_1323;
      float var6 = (float)b.field_1322;
      float var7 = (float)b.field_1321;
      float var8 = (float)b.field_1320;
      float var9 = (float)b.field_1325;
      float var10 = (float)b.field_1324;
      a(buffer, var4, color, var5, var6, var7, var8, var6, var7, var8, var6, var10, var5, var6, var10);
      a(buffer, var4, color, var5, var9, var7, var5, var9, var10, var8, var9, var10, var8, var9, var7);
      a(buffer, var4, color, var5, var6, var7, var5, var9, var7, var8, var9, var7, var8, var6, var7);
      a(buffer, var4, color, var5, var6, var10, var8, var6, var10, var8, var9, var10, var5, var9, var10);
      a(buffer, var4, color, var5, var6, var7, var5, var6, var10, var5, var9, var10, var5, var9, var7);
      a(buffer, var4, color, var8, var6, var7, var8, var9, var7, var8, var9, var10, var8, var6, var10);
   }

   private static void a(
      class_4588 buffer,
      class_4665 pose,
      int color,
      float ax,
      float ay,
      float az,
      float bx,
      float by,
      float bz,
      float cx,
      float cy,
      float cz,
      float dx2,
      float dy2,
      float dz2
   ) {
      buffer.method_56824(pose, ax, ay, az).method_39415(color);
      buffer.method_56824(pose, bx, by, bz).method_39415(color);
      buffer.method_56824(pose, cx, cy, cz).method_39415(color);
      buffer.method_56824(pose, dx2, dy2, dz2).method_39415(color);
   }
}
