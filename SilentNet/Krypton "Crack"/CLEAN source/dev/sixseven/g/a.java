package dev.sixseven.g;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import java.util.Deque;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_746;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3f;

public final class a {
   private static final class_2960 a = class_2960.method_60655("sixsevenclient", "textures/misc/67.png");
   private static final int b = 7;
   private static final int c = 9;
   private static final float d = 0.62F;
   private static final float e = 1.05F;
   private static final RenderPipeline f = RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
      .withLocation("sixsevenclient/pipeline/cape_fill")
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .build();
   private static final class_1921 g = class_1921.method_75940("sixsevenclient:cape_fill", class_12247.method_75927(f).method_75937().method_75938());

   private a() {
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, dev.sixseven.d.a.t module) {
      class_310 var4 = class_310.method_1551();
      class_746 var5 = var4.field_1724;
      if (var5 != null && var4.field_1687 != null) {
         boolean var6 = var4.field_1690.method_31044().method_31034() && !module.d.i();
         float var7 = var4.method_61966().method_60637(false);
         double var8 = class_3532.method_16436((double)var7, var5.field_6014, var5.method_23317());
         double var10 = class_3532.method_16436((double)var7, var5.field_6036, var5.method_23318());
         double var12 = class_3532.method_16436((double)var7, var5.field_5969, var5.method_23321());
         float var14 = class_3532.method_17821(var7, var5.field_6220, var5.field_6283);
         float var15 = var5.method_17682();
         float var16 = (float)Math.hypot(var5.method_23317() - var5.field_6014, var5.method_23321() - var5.field_5969);
         long var17 = System.nanoTime();
         float var19 = (float)(var17 % 1000000000000L) / 1.0E9F;
         int var20 = module.m();
         float var21 = module.n();
         class_4184 var22 = var4.field_1773.method_19418();
         Vector3f var23 = new Vector3f(var22.method_19335());
         Vector3f var24 = new Vector3f();
         var23.cross(new Vector3f(0.0F, 1.0F, 0.0F), var24);
         if (var24.lengthSquared() < 1.0E-6F) {
            var24.set(1.0F, 0.0F, 0.0F);
         }

         var24.normalize();
         Vector3f var25 = new Vector3f();
         var24.cross(var23, var25);
         var25.normalize();
         class_4665 var26 = poseStack.method_23760();
         boolean var27 = module.e.i() && !var6;
         boolean var28 = var27 && module.f.a("67");
         float[] var29 = null;
         float[] var30 = null;
         float[] var31 = null;
         if (var27) {
            byte var32 = 80;
            var29 = new float[var32];
            var30 = new float[var32];
            var31 = new float[var32];
            a(var29, var30, var31, var8, var10, var12, var15, var14, var16, var19, module.g.i(), cam);
         }

         class_4588 var36 = bufferSource.method_73477(k.b);
         if (!var6 && module.h.i() && module.i.a("Echo")) {
            a(var36, var26, cam, module, var17, var20);
         }

         if (module.k.i() && module.l.a("Ring")) {
            a(var36, var26, cam, var8, var10, var12, var19, var20, var21);
         }

         if (var27 && !var28) {
            class_4588 var33 = bufferSource.method_73477(g);
            a(var33, var26, var29, var30, var31, module.f.i(), var19, var20);
            bufferSource.method_22994(g);
         }

         class_4588 var37 = bufferSource.method_73477(k.a);
         if (!var6 && module.h.i() && module.i.a("Ribbon")) {
            a(var37, var26, cam, var24, module, var17, var20, var21);
         }

         if (!var6 && module.h.i() && module.i.a("Sparkle")) {
            a(var37, var26, cam, var24, var25, module, var17, var20, var21);
         }

         if (module.k.i() && module.l.a("Orbit")) {
            a(var37, var26, cam, var24, var25, var8, var10, var12, var19, var20, var21);
         }

         k.a(bufferSource);
         boolean var34 = module.m.i() && !var6;
         if (var28 || var34) {
            class_4588 var35 = bufferSource.method_73477(class_12249.method_76002(a));
            if (var28) {
               a(var35, var26, var29, var30, var31, var23, var20);
            }

            if (var34) {
               a(var35, var26, cam, var24, var25, var23, var8, var10, var12, var15, var19, var20);
            }
         }
      }
   }

   private static void a(
      float[] gx, float[] gy, float[] gz, double px, double py, double pz, float height, float bodyYaw, float speed, float time, boolean physics, class_243 cam
   ) {
      float var15 = bodyYaw * (float) (Math.PI / 180.0);
      float var16 = -class_3532.method_15374((double)var15);
      float var17 = class_3532.method_15362((double)var15);
      float var18 = var17;
      float var19 = -var16;
      float var20 = -var16;
      float var21 = -var17;
      float var22 = (float)py + height * 0.78F;
      float var23 = (float)px + var20 * 0.14F;
      float var24 = (float)pz + var21 * 0.14F;
      float var25 = physics ? Math.min(speed * 5.0F, 1.05F) : 0.0F;
      float var26 = 0.1F;
      float var27 = physics ? 0.06F + var25 * 0.14F : 0.02F;

      for (int var28 = 0; var28 <= 9; var28++) {
         float var29 = (float)var28 / 9.0F;
         float var30 = var29 * var29;
         float var31 = (var26 + var25) * var30;

         for (int var32 = 0; var32 <= 7; var32++) {
            float var33 = (float)var32 / 7.0F;
            float var34 = (var33 - 0.5F) * 0.62F;
            float var35 = physics ? class_3532.method_15374((double)(time * 6.5F - var29 * 4.2F + (float)var32 * 0.7F)) * var27 * var29 : 0.0F;
            float var36 = physics ? class_3532.method_15374((double)(time * 5.0F + var29 * 3.5F)) * 0.03F * var29 : 0.0F;
            float var37 = var31 + var35;
            int var38 = var28 * 8 + var32;
            gx[var38] = var23 + var18 * (var34 + var36) + var20 * var37 - (float)cam.field_1352;
            gy[var38] = var22 - var29 * 1.05F - (float)cam.field_1351;
            gz[var38] = var24 + var19 * (var34 + var36) + var21 * var37 - (float)cam.field_1350;
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, float[] gx, float[] gy, float[] gz, String style, float time, int rgb) {
      boolean var8 = style.equals("Grid");
      boolean var9 = style.equals("Wave");
      int var10 = dev.sixseven.n.c.b(rgb, 0.22F);
      int var11 = b(rgb, 0.18F);

      for (int var12 = 0; var12 < 9; var12++) {
         for (int var13 = 0; var13 < 7; var13++) {
            int var14 = var12 * 8 + var13;
            int var15 = var14 + 1;
            int var16 = var14 + 8;
            int var17 = var16 + 1;
            if (var8) {
               boolean var18 = (var12 + var13 & 1) == 0;
               int var19 = var18 ? dev.sixseven.n.c.b(rgb, 0.35F) : b(rgb, 0.5F);
               int var20 = var18 ? a(var19, 0.9F) : a(var19, 0.6F);
               a(buf, pose, gx[var14], gy[var14], gz[var14], var20);
               a(buf, pose, gx[var16], gy[var16], gz[var16], var20);
               a(buf, pose, gx[var17], gy[var17], gz[var17], var20);
               a(buf, pose, gx[var15], gy[var15], gz[var15], var20);
            } else {
               float var24 = (float)var12 / 9.0F;
               float var25 = (float)(var12 + 1) / 9.0F;
               int var26 = a(var10, var11, var24);
               int var21 = a(var10, var11, var25);
               if (var9) {
                  var26 = a(var26, 16777215, a(var24, time));
                  var21 = a(var21, 16777215, a(var25, time));
               }

               int var22 = a(var26, 0.86F - 0.08F * var24);
               int var23 = a(var21, 0.86F - 0.08F * var25);
               a(buf, pose, gx[var14], gy[var14], gz[var14], var22);
               a(buf, pose, gx[var16], gy[var16], gz[var16], var23);
               a(buf, pose, gx[var17], gy[var17], gz[var17], var23);
               a(buf, pose, gx[var15], gy[var15], gz[var15], var22);
            }
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, float[] gx, float[] gy, float[] gz, Vector3f fwd, int rgb) {
      int var7 = a(rgb, 0.98F);
      float var8 = -fwd.x;
      float var9 = -fwd.y;
      float var10 = -fwd.z;

      for (int var11 = 0; var11 < 9; var11++) {
         float var12 = (float)var11 / 9.0F;
         float var13 = (float)(var11 + 1) / 9.0F;

         for (int var14 = 0; var14 < 7; var14++) {
            float var15 = (float)var14 / 7.0F;
            float var16 = (float)(var14 + 1) / 7.0F;
            int var17 = var11 * 8 + var14;
            int var18 = var17 + 1;
            int var19 = var17 + 8;
            int var20 = var19 + 1;
            a(buf, pose, gx[var17], gy[var17], gz[var17], var15, var12, var7, var8, var9, var10);
            a(buf, pose, gx[var19], gy[var19], gz[var19], var15, var13, var7, var8, var9, var10);
            a(buf, pose, gx[var20], gy[var20], gz[var20], var16, var13, var7, var8, var9, var10);
            a(buf, pose, gx[var18], gy[var18], gz[var18], var16, var12, var7, var8, var9, var10);
         }
      }
   }

   private static float a(float fr, float time) {
      float var2 = class_3532.method_15374((double)((fr - time * 0.35F % 1.0F) * (float) (Math.PI * 2)));
      return Math.max(0.0F, var2) * 0.5F;
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, dev.sixseven.d.a.t module, long now, int rgb, float glow) {
      Deque var9 = module.k();
      if (var9.size() >= 2) {
         float var10 = Math.max(0.2F, module.j.d());
         float var11 = 0.28F * (0.7F + 0.6F * glow);
         dev.sixseven.d.a.t.a var12 = null;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var17 = 0.0F;
         float var18 = 0.0F;
         float var19 = 0.0F;
         float var20 = 0.0F;

         for (dev.sixseven.d.a.t.a var22 : var9) {
            float var23 = var22.a(now);
            if (var23 > var10) {
               var12 = null;
            } else {
               float var24 = var23 / var10;
               float var25 = var11 * (1.0F - var24);
               float var26 = (1.0F - var24) * (1.0F - var24);
               float var27 = (float)(var22.a - cam.field_1352);
               float var28 = (float)(var22.b - cam.field_1351);
               float var29 = (float)(var22.c - cam.field_1350);
               float var30 = var27 - right.x * var25;
               float var31 = var28 - right.y * var25;
               float var32 = var29 - right.z * var25;
               float var33 = var27 + right.x * var25;
               float var34 = var28 + right.y * var25;
               float var35 = var29 + right.z * var25;
               if (var12 != null) {
                  int var36 = a(rgb, var14 * 0.85F);
                  int var37 = a(dev.sixseven.n.c.b(rgb, 0.25F), var26 * 0.85F);
                  a(buf, pose, var15, var16, var17, var36);
                  a(buf, pose, var30, var31, var32, var37);
                  a(buf, pose, var33, var34, var35, var37);
                  a(buf, pose, var18, var19, var20, var36);
               }

               var12 = var22;
               var14 = var26;
               var15 = var30;
               var16 = var31;
               var17 = var32;
               var18 = var33;
               var19 = var34;
               var20 = var35;
            }
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, dev.sixseven.d.a.t module, long now, int rgb, float glow) {
      Deque var10 = module.k();
      float var11 = Math.max(0.2F, module.j.d());
      int var12 = 0;

      for (dev.sixseven.d.a.t.a var14 : var10) {
         int var15 = var12++;
         if ((var15 & 1) != 1) {
            float var16 = var14.a(now);
            if (!(var16 > var11)) {
               float var17 = var16 / var11;
               float var18 = 1.0F - var17;
               if (!(var18 <= 0.02F)) {
                  float var19 = var17 < 0.15F ? var17 / 0.15F : 1.0F;
                  float var20 = (a(var14.d, 1) - 0.5F) * 0.5F;
                  float var21 = (a(var14.d, 2) - 0.5F) * 0.4F + var17 * 0.35F;
                  float var22 = (a(var14.d, 3) - 0.5F) * 0.5F;
                  float var23 = (float)(var14.a - cam.field_1352) + var20;
                  float var24 = (float)(var14.b - cam.field_1351) + var21;
                  float var25 = (float)(var14.c - cam.field_1350) + var22;
                  float var26 = 0.05F * var19 * (0.7F + 0.6F * glow) * (0.6F + 0.8F * (1.0F - var17));
                  int var27 = a(dev.sixseven.n.c.b(rgb, 0.5F), var18);
                  a(buf, pose, right, up, var23, var24, var25, var26, var27);
                  if (glow > 0.01F) {
                     a(buf, pose, right, up, var23, var24, var25, var26 * 2.0F, a(rgb, var18 * 0.25F * glow));
                  }
               }
            }
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, dev.sixseven.d.a.t module, long now, int rgb) {
      Deque var7 = module.k();
      float var8 = Math.max(0.2F, module.j.d());
      int var9 = 0;

      for (dev.sixseven.d.a.t.a var11 : var7) {
         int var12 = var9++;
         if (var12 % 5 == 0) {
            float var13 = var11.a(now);
            if (!(var13 > var8)) {
               float var14 = var13 / var8;
               float var15 = (1.0F - var14) * 0.8F;
               if (!(var15 <= 0.02F)) {
                  int var16 = a(rgb, var15);
                  float var17 = (float)(var11.a - 0.32 - cam.field_1352);
                  float var18 = (float)(var11.a + 0.32 - cam.field_1352);
                  float var19 = (float)(var11.b - 0.9 - cam.field_1351);
                  float var20 = (float)(var11.b + 0.9 - cam.field_1351);
                  float var21 = (float)(var11.c - 0.32 - cam.field_1350);
                  float var22 = (float)(var11.c + 0.32 - cam.field_1350);
                  a(buf, pose, var17, var19, var21, var18, var20, var22, var16, 1.6F);
               }
            }
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, float x0, float y0, float z0, float x1, float y1, float z1, int color, float w) {
      b(buf, pose, x0, y0, z0, x1, y0, z0, color, w);
      b(buf, pose, x1, y0, z0, x1, y0, z1, color, w);
      b(buf, pose, x1, y0, z1, x0, y0, z1, color, w);
      b(buf, pose, x0, y0, z1, x0, y0, z0, color, w);
      b(buf, pose, x0, y1, z0, x1, y1, z0, color, w);
      b(buf, pose, x1, y1, z0, x1, y1, z1, color, w);
      b(buf, pose, x1, y1, z1, x0, y1, z1, color, w);
      b(buf, pose, x0, y1, z1, x0, y1, z0, color, w);
      b(buf, pose, x0, y0, z0, x0, y1, z0, color, w);
      b(buf, pose, x1, y0, z0, x1, y1, z0, color, w);
      b(buf, pose, x1, y0, z1, x1, y1, z1, color, w);
      b(buf, pose, x0, y0, z1, x0, y1, z1, color, w);
   }

   private static void a(
      class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, double px, double py, double pz, float time, int rgb, float glow
   ) {
      byte var14 = 8;
      float var15 = 0.72F;
      float var16 = (float)(py - cam.field_1351) + 0.12F;
      float var17 = (float)(px - cam.field_1352);
      float var18 = (float)(pz - cam.field_1350);

      for (int var19 = 0; var19 < var14; var19++) {
         float var20 = time * 1.7F + (float)var19 * ((float) (Math.PI * 2) / (float)var14);
         float var21 = class_3532.method_15362((double)var20) * var15;
         float var22 = class_3532.method_15374((double)var20) * var15;
         float var23 = var16 + class_3532.method_15374((double)(time * 2.4F + (float)var19)) * 0.18F + 0.25F;
         float var24 = var17 + var21;
         float var25 = var18 + var22;
         float var26 = 0.07F * (0.75F + 0.5F * glow);
         int var27 = a(dev.sixseven.n.c.b(rgb, 0.45F), 0.95F);
         a(buf, pose, right, up, var24, var23, var25, var26, var27);
         if (glow > 0.01F) {
            a(buf, pose, right, up, var24, var23, var25, var26 * 2.1F, a(rgb, 0.22F * glow));
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, double px, double py, double pz, float time, int rgb, float glow) {
      float var12 = (float)(px - cam.field_1352);
      float var13 = (float)(pz - cam.field_1350);

      for (int var14 = 0; var14 < 2; var14++) {
         float var15 = time * 0.9F + (float)var14 * 0.5F;
         float var16 = var15 - (float)Math.floor((double)var15);
         float var17 = 0.4F + var16 * 1.1F;
         float var18 = (1.0F - var16) * (0.7F + 0.3F * glow);
         if (!(var18 <= 0.02F)) {
            int var19 = a(dev.sixseven.n.c.b(rgb, 0.2F), var18);
            float var20 = (float)(py - cam.field_1351) + 0.04F + (float)var14 * 0.02F;
            a(buf, pose, var12, var20, var13, var17, 40, var19, 2.4F);
         }
      }
   }

   private static void a(
      class_4588 buf,
      class_4665 pose,
      class_243 cam,
      Vector3f right,
      Vector3f up,
      Vector3f fwd,
      double px,
      double py,
      double pz,
      float height,
      float time,
      int rgb
   ) {
      float var15 = class_3532.method_15374((double)(time * 2.0F)) * 0.06F;
      float var16 = (float)(px - cam.field_1352);
      float var17 = (float)(py - cam.field_1351) + height + 0.55F + var15;
      float var18 = (float)(pz - cam.field_1350);
      float var19 = 0.34F;
      float var20 = time * 1.4F;
      float var21 = class_3532.method_15362((double)var20);
      float var22 = class_3532.method_15374((double)var20);
      Vector3f var23 = a(right, up, var21 * var19, var22 * var19);
      Vector3f var24 = a(right, up, -var22 * var19, var21 * var19);
      int var25 = a(rgb, 0.98F);
      float var26 = -fwd.x;
      float var27 = -fwd.y;
      float var28 = -fwd.z;
      a(buf, pose, var16 - var23.x - var24.x, var17 - var23.y - var24.y, var18 - var23.z - var24.z, 0.0F, 0.0F, var25, var26, var27, var28);
      a(buf, pose, var16 - var23.x + var24.x, var17 - var23.y + var24.y, var18 - var23.z + var24.z, 0.0F, 1.0F, var25, var26, var27, var28);
      a(buf, pose, var16 + var23.x + var24.x, var17 + var23.y + var24.y, var18 + var23.z + var24.z, 1.0F, 1.0F, var25, var26, var27, var28);
      a(buf, pose, var16 + var23.x - var24.x, var17 + var23.y - var24.y, var18 + var23.z - var24.z, 1.0F, 0.0F, var25, var26, var27, var28);
   }

   private static Vector3f a(Vector3f right, Vector3f up, float a, float b) {
      return new Vector3f(right.x * ax + up.x * bx, right.y * ax + up.y * bx, right.z * ax + up.z * bx);
   }

   private static void a(class_4588 buf, class_4665 pose, Vector3f right, Vector3f up, float bx, float by, float bz, float r, int argb) {
      Vector3f var9 = a(right, up, r, r);
      Vector3f var10 = a(right, up, -r, r);
      a(buf, pose, bx - var9.x, by - var9.y, bz - var9.z, argb);
      a(buf, pose, bx + var10.x, by + var10.y, bz + var10.z, argb);
      a(buf, pose, bx + var9.x, by + var9.y, bz + var9.z, argb);
      a(buf, pose, bx - var10.x, by - var10.y, bz - var10.z, argb);
   }

   private static void a(class_4588 buf, class_4665 pose, float cx, float fy, float cz, float radius, int segments, int color, float width) {
      float var9 = cx + radius;
      float var10 = cz;

      for (int var11 = 1; var11 <= segments; var11++) {
         float var12 = (float)var11 / (float)segments * (float) (Math.PI * 2);
         float var13 = cx + class_3532.method_15362((double)var12) * radius;
         float var14 = cz + class_3532.method_15374((double)var12) * radius;
         b(buf, pose, var9, fy, var10, var13, fy, var14, color, width);
         var9 = var13;
         var10 = var14;
      }
   }

   private static void a(class_4588 buf, class_4665 pose, float x, float y, float z, int argb) {
      buf.method_56824(pose, x, y, z).method_39415(argb);
   }

   private static void b(class_4588 buf, class_4665 pose, float x1, float y1, float z1, float x2, float y2, float z2, int argb, float width) {
      Vector3f var10 = new Vector3f(x2 - x1, y2 - y1, z2 - z1);
      if (var10.lengthSquared() > 1.0E-9F) {
         var10.normalize();
      } else {
         var10.set(0.0F, 1.0F, 0.0F);
      }

      buf.method_56824(pose, x1, y1, z1).method_39415(argb).method_61959(pose, var10).method_75298(width);
      buf.method_56824(pose, x2, y2, z2).method_39415(argb).method_61959(pose, var10).method_75298(width);
   }

   private static void a(class_4588 buf, class_4665 pose, float x, float y, float z, float u, float vv, int argb, float nx, float ny, float nz) {
      buf.method_56824(pose, x, y, z)
         .method_39415(argb)
         .method_22913(u, vv)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_60831(pose, nx, ny, nz);
   }

   private static int a(int rgb, float alpha) {
      return dev.sixseven.n.c.a(rgb, alpha);
   }

   private static int a(int from, int to, float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      int var3 = (int)class_3532.method_16439(t, (float)(from >> 16 & 0xFF), (float)(to >> 16 & 0xFF));
      int var4 = (int)class_3532.method_16439(t, (float)(from >> 8 & 0xFF), (float)(to >> 8 & 0xFF));
      int var5 = (int)class_3532.method_16439(t, (float)(from & 0xFF), (float)(to & 0xFF));
      return var3 << 16 | var4 << 8 | var5;
   }

   private static int b(int rgb, float t) {
      return a(rgb, 0, t);
   }

   private static float a(long seed, int salt) {
      float var3 = class_3532.method_15374((double)((float)(seed % 100000L) * 0.0131F + (float)salt * 12.9898F)) * 43758.547F;
      return var3 - (float)class_3532.method_15375(var3);
   }
}
