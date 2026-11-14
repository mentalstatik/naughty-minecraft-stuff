package dev.sixseven.g;

import dev.sixseven.d.a.L;
import java.util.Deque;
import net.minecraft.class_12249;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3f;

public final class m {
   private static final class_2960 a = class_2960.method_60655("sixsevenclient", "textures/misc/67.png");
   private static final int b = 20;
   private static final float[] c = new float[21];
   private static final float[] d = new float[21];
   private static final float e = 0.5F;

   private m() {
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, L module) {
      Deque var4 = module.k();
      Deque var5 = module.l();
      if (!var4.isEmpty() || !var5.isEmpty()) {
         long var6 = System.nanoTime();

         while (!var4.isEmpty() && ((L.a)var4.peekFirst()).a(var6) > ((L.a)var4.peekFirst()).m) {
            var4.removeFirst();
         }

         while (!var5.isEmpty() && ((L.b)var5.peekFirst()).a(var6) > 0.5F) {
            var5.removeFirst();
         }

         if (!var4.isEmpty() || !var5.isEmpty()) {
            class_4184 var8 = class_310.method_1551().field_1773.method_19418();
            Vector3f var9 = new Vector3f(var8.method_19335());
            Vector3f var10 = new Vector3f();
            var9.cross(new Vector3f(0.0F, 1.0F, 0.0F), var10);
            if (var10.lengthSquared() < 1.0E-6F) {
               var10.set(1.0F, 0.0F, 0.0F);
            }

            var10.normalize();
            Vector3f var11 = new Vector3f();
            var10.cross(var9, var11);
            var11.normalize();
            float var12 = module.n();
            class_4665 var13 = poseStack.method_23760();
            class_4588 var14 = bufferSource.method_73477(k.b);

            for (L.b var16 : var5) {
               a(var14, var13, cam, var10, var11, var16, var6);
            }

            boolean var21 = false;

            for (L.a var17 : var4) {
               float var18 = var17.a(var6);
               if (!(var18 < 0.0F) && !(var18 > var17.m)) {
                  if (var17.h == 2) {
                     a(var14, var13, cam, var10, var11, var17, var18);
                  } else if (var17.h == 3) {
                     var21 = true;
                  }
               }
            }

            class_4588 var23 = bufferSource.method_73477(k.a);

            for (L.a var26 : var4) {
               float var19 = var26.a(var6);
               if (!(var19 < 0.0F) && !(var19 > var26.m)) {
                  if (var26.h == 1) {
                     b(var23, var13, cam, var10, var11, var26, var19, var12);
                  } else if (var26.h == 0) {
                     a(var23, var13, cam, var10, var11, var26, var19, var12);
                  }
               }
            }

            k.a(bufferSource);
            if (var21) {
               class_4588 var25 = bufferSource.method_73477(class_12249.method_76002(a));

               for (L.a var28 : var4) {
                  if (var28.h == 3) {
                     float var20 = var28.a(var6);
                     if (!(var20 < 0.0F) && !(var20 > var28.m)) {
                        a(var25, var13, cam, var10, var11, var9, var28, var20);
                     }
                  }
               }
            }
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, L.a p, float age, float glow) {
      float var8 = age / p.m;
      float var9 = a(var8);
      if (!(var9 <= 0.01F)) {
         float var10 = (float)(p.a(age) - cam.field_1352);
         float var11 = (float)(p.b(age) - cam.field_1351);
         float var12 = (float)(p.c(age) - cam.field_1350);
         float var13 = p.e - p.l * age;
         float var14 = p.d * right.x + var13 * right.y + p.f * right.z;
         float var15 = p.d * up.x + var13 * up.y + p.f * up.z;
         float var16 = class_3532.method_15355(var14 * var14 + var15 * var15);
         float var17;
         float var18;
         if (var16 > 1.0E-4F) {
            var17 = var14 / var16;
            var18 = var15 / var16;
         } else {
            var17 = 0.0F;
            var18 = 1.0F;
         }

         float var19 = 0.35F + 0.65F * (1.0F - var8);
         float var20 = 0.28F * p.i * var19;
         float var21 = 0.055F * p.i * var19;
         Vector3f var22 = a(right, up, var17 * var20, var18 * var20);
         Vector3f var23 = a(right, up, -var18 * var21, var17 * var21);
         int var24 = dev.sixseven.n.c.a(dev.sixseven.n.c.b(p.g, 0.55F), var9);
         a(buf, pose, var10, var11, var12, var22, var23, var24);
         if (glow > 0.01F) {
            float var25 = 0.06F * p.i * var19 * (1.0F + 0.6F * glow);
            Vector3f var26 = a(right, up, var25, var25);
            Vector3f var27 = a(right, up, -var25, var25);
            int var28 = dev.sixseven.n.c.a(p.g, var9 * 0.22F * glow);
            a(buf, pose, var10, var11, var12, var26, var27, var28);
         }
      }
   }

   private static void b(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, L.a p, float age, float glow) {
      float var8 = age / p.m;
      float var9 = a(var8);
      if (!(var9 <= 0.01F)) {
         float var10 = var8 < 0.2F ? e(var8 / 0.2F) : 1.0F;
         float var11 = 0.16F * p.i * var10;
         float var12 = (float)(p.a(age) - cam.field_1352);
         float var13 = (float)(p.b(age) - cam.field_1351);
         float var14 = (float)(p.c(age) - cam.field_1350);
         float var15 = 0.18F * class_3532.method_15374((double)(age * 6.0F + p.j));
         int var16 = dev.sixseven.n.c.a(dev.sixseven.n.c.b(p.g, 0.25F), var9);
         a(buf, pose, right, up, var12, var13, var14, var11, var15, var16);
         if (glow > 0.01F) {
            int var17 = dev.sixseven.n.c.a(p.g, var9 * 0.3F * glow);
            a(buf, pose, right, up, var12, var13, var14, var11 * (1.35F + 0.35F * glow), var15, var17);
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, Vector3f right, Vector3f up, float bx, float by, float bz, float scale, float shearX, int argb) {
      for (int var10 = 0; var10 < 20; var10++) {
         float var11 = (c[var10] + shearX * d[var10]) * scale;
         float var12 = d[var10] * scale;
         float var13 = (c[var10 + 1] + shearX * d[var10 + 1]) * scale;
         float var14 = d[var10 + 1] * scale;
         a(buf, pose, bx, by, bz, argb);
         a(buf, pose, bx + right.x * var11 + up.x * var12, by + right.y * var11 + up.y * var12, bz + right.z * var11 + up.z * var12, argb);
         a(buf, pose, bx + right.x * var13 + up.x * var14, by + right.y * var13 + up.y * var14, bz + right.z * var13 + up.z * var14, argb);
         a(buf, pose, bx, by, bz, argb);
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, L.a p, float age) {
      float var7 = age / p.m;
      float var8 = a(var7);
      if (!(var8 <= 0.01F)) {
         float var9 = 0.45F + 0.55F * class_3532.method_15379(class_3532.method_15374((double)(age * 42.0F + p.j)));
         var8 *= var9;
         float var10 = (float)(p.a - cam.field_1352);
         float var11 = (float)(p.b - cam.field_1351);
         float var12 = (float)(p.c - cam.field_1350);
         float var13 = (float)(p.a(age) - cam.field_1352);
         float var14 = (float)(p.b(age) - cam.field_1351);
         float var15 = (float)(p.c(age) - cam.field_1350);
         float var16 = var13 - var10;
         float var17 = var14 - var11;
         float var18 = var15 - var12;
         float var19 = var16 * right.x + var17 * right.y + var18 * right.z;
         float var20 = var16 * up.x + var17 * up.y + var18 * up.z;
         float var21 = class_3532.method_15355(var19 * var19 + var20 * var20);
         float var22;
         float var23;
         if (var21 > 1.0E-4F) {
            var22 = -var20 / var21;
            var23 = var19 / var21;
         } else {
            var22 = 1.0F;
            var23 = 0.0F;
         }

         float var24 = 0.16F * p.i;
         int var25 = dev.sixseven.n.c.a(dev.sixseven.n.c.b(p.g, 0.6F), var8);
         float var26 = 2.4F * p.i;
         byte var27 = 4;
         float var28 = var10;
         float var29 = var11;
         float var30 = var12;

         for (int var31 = 1; var31 <= var27; var31++) {
            float var32 = (float)var31 / (float)var27;
            float var33 = class_3532.method_15374((double)(var32 * (float) Math.PI));
            float var34 = var31 == var27 ? 0.0F : (a(p, var31) * 2.0F - 1.0F) * var24 * var33;
            float var35 = var10 + var16 * var32 + (right.x * var22 + up.x * var23) * var34;
            float var36 = var11 + var17 * var32 + (right.y * var22 + up.y * var23) * var34;
            float var37 = var12 + var18 * var32 + (right.z * var22 + up.z * var23) * var34;
            a(buf, pose, var28, var29, var30, var35, var36, var37, var25, var26);
            var28 = var35;
            var29 = var36;
            var30 = var37;
         }
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, Vector3f fwd, L.a p, float age) {
      float var8 = age / p.m;
      float var9 = a(var8);
      if (!(var9 <= 0.01F)) {
         float var10 = var8 < 0.22F ? e(var8 / 0.22F) : 1.0F;
         float var11 = 0.16F * p.i * var10;
         float var12 = p.j + p.k * age * 0.5F;
         float var13 = class_3532.method_15362((double)var12);
         float var14 = class_3532.method_15374((double)var12);
         Vector3f var15 = a(right, up, var13 * var11, var14 * var11);
         Vector3f var16 = a(right, up, -var14 * var11, var13 * var11);
         float var17 = (float)(p.a(age) - cam.field_1352);
         float var18 = (float)(p.b(age) - cam.field_1351);
         float var19 = (float)(p.c(age) - cam.field_1350);
         int var20 = dev.sixseven.n.c.a(p.g, var9);
         float var21 = -fwd.x;
         float var22 = -fwd.y;
         float var23 = -fwd.z;
         a(buf, pose, var17 - var15.x - var16.x, var18 - var15.y - var16.y, var19 - var15.z - var16.z, 0.0F, 0.0F, var20, var21, var22, var23);
         a(buf, pose, var17 - var15.x + var16.x, var18 - var15.y + var16.y, var19 - var15.z + var16.z, 0.0F, 1.0F, var20, var21, var22, var23);
         a(buf, pose, var17 + var15.x + var16.x, var18 + var15.y + var16.y, var19 + var15.z + var16.z, 1.0F, 1.0F, var20, var21, var22, var23);
         a(buf, pose, var17 + var15.x - var16.x, var18 + var15.y - var16.y, var19 + var15.z - var16.z, 1.0F, 0.0F, var20, var21, var22, var23);
      }
   }

   private static void a(class_4588 buf, class_4665 pose, class_243 cam, Vector3f right, Vector3f up, L.b shock, long now) {
      float var8 = shock.a(now);
      if (!(var8 < 0.0F) && !(var8 >= 0.5F)) {
         float var9 = var8 / 0.5F;
         float var10 = 0.15F + d(var9) * 1.15F;
         float var11 = 0.8F * (1.0F - c(var9));
         int var12 = dev.sixseven.n.c.a(dev.sixseven.n.c.b(shock.d, 0.2F), var11);
         float var13 = (float)(shock.a - cam.field_1352);
         float var14 = (float)(shock.b - cam.field_1351);
         float var15 = (float)(shock.c - cam.field_1350);
         byte var16 = 28;
         float var17 = 0.0F;
         float var18 = 0.0F;
         float var19 = 0.0F;

         for (int var20 = 0; var20 <= var16; var20++) {
            float var21 = (float)var20 / (float)var16 * (float) (Math.PI * 2);
            float var22 = class_3532.method_15362((double)var21) * var10;
            float var23 = class_3532.method_15374((double)var21) * var10;
            float var24 = var13 + right.x * var22 + up.x * var23;
            float var25 = var14 + right.y * var22 + up.y * var23;
            float var26 = var15 + right.z * var22 + up.z * var23;
            if (var20 > 0) {
               a(buf, pose, var17, var18, var19, var24, var25, var26, var12, 2.2F);
            }

            var17 = var24;
            var18 = var25;
            var19 = var26;
         }
      }
   }

   private static Vector3f a(Vector3f right, Vector3f up, float a, float b) {
      return new Vector3f(right.x * ax + up.x * bx, right.y * ax + up.y * bx, right.z * ax + up.z * bx);
   }

   private static void a(class_4588 buf, class_4665 pose, float bx, float by, float bz, Vector3f ax1, Vector3f ax2, int argb) {
      a(buf, pose, bx - ax1.x - ax2.x, by - ax1.y - ax2.y, bz - ax1.z - ax2.z, argb);
      a(buf, pose, bx + ax1.x - ax2.x, by + ax1.y - ax2.y, bz + ax1.z - ax2.z, argb);
      a(buf, pose, bx + ax1.x + ax2.x, by + ax1.y + ax2.y, bz + ax1.z + ax2.z, argb);
      a(buf, pose, bx - ax1.x + ax2.x, by - ax1.y + ax2.y, bz - ax1.z + ax2.z, argb);
   }

   private static void a(class_4588 buf, class_4665 pose, float x, float y, float z, int argb) {
      buf.method_56824(pose, x, y, z).method_39415(argb);
   }

   private static void a(class_4588 buf, class_4665 pose, float x1, float y1, float z1, float x2, float y2, float z2, int argb, float width) {
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

   private static float a(L.a p, int salt) {
      float var2 = class_3532.method_15374((double)((float)(p.a * 12.9898 + p.c * 78.233 + (double)p.j * 3.17 + (double)salt * 43.123))) * 43758.547F;
      return var2 - (float)class_3532.method_15375(var2);
   }

   private static float a(float t) {
      t = b(t);
      return t < 0.12F ? t / 0.12F : 1.0F - c((t - 0.12F) / 0.88F);
   }

   private static float b(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   private static float c(float t) {
      t = b(t);
      return t * t;
   }

   private static float d(float t) {
      t = b(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private static float e(float t) {
      t = b(t);
      float var1 = 2.4F;
      float var2 = var1 + 1.0F;
      float var3 = t - 1.0F;
      return 1.0F + var2 * var3 * var3 * var3 + var1 * var3 * var3;
   }

   static {
      for (int var0 = 0; var0 <= 20; var0++) {
         double var1 = (double)var0 / 20.0 * Math.PI * 2.0;
         double var3 = 16.0 * Math.pow(Math.sin(var1), 3.0);
         double var5 = 13.0 * Math.cos(var1) - 5.0 * Math.cos(2.0 * var1) - 2.0 * Math.cos(3.0 * var1) - Math.cos(4.0 * var1);
         c[var0] = (float)(var3 / 17.0);
         d[var0] = (float)(var5 / 17.0);
      }
   }
}
