package dev.sixseven.g;

import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector4f;

public final class x {
   private static final Matrix4f a = new Matrix4f();
   private static final Vector4f b = new Vector4f();
   private static class_243 c = class_243.field_1353;
   private static int d;
   private static int e;
   private static float f;
   private static boolean g;

   private x() {
   }

   public static void a(Matrix4f projection, float partialTick) {
      class_310 var2 = class_310.method_1551();
      class_4184 var3 = var2.field_1773.method_19418();
      if (var3 == null) {
         g = false;
      } else {
         Quaternionf var4 = var3.method_23767().conjugate(new Quaternionf());
         a.set(projection).rotate(var4);
         c = var3.method_71156();
         class_276 var5 = var2.method_1522();
         d = var5.field_1482;
         e = var5.field_1481;
         f = partialTick;
         g = true;
      }
   }

   public static void a() {
      g = false;
   }

   public static boolean b() {
      return g;
   }

   public static float c() {
      return f;
   }

   public static float[] a(double wx, double wy, double wz) {
      float[] var6 = b(wx, wy, wz);
      if (var6 == null) {
         return null;
      } else {
         float var7 = t.a();
         return new float[]{var6[0] / var7, var6[1] / var7};
      }
   }

   public static float[] b(double wx, double wy, double wz) {
      if (!g) {
         return null;
      } else {
         b.set((float)(wx - c.field_1352), (float)(wy - c.field_1351), (float)(wz - c.field_1350), 1.0F);
         a.transform(b);
         if (b.w <= 1.0E-4F) {
            return null;
         } else {
            float var6 = b.x / b.w;
            float var7 = b.y / b.w;
            float var8 = (var6 * 0.5F + 0.5F) * (float)d;
            float var9 = (1.0F - (var7 * 0.5F + 0.5F)) * (float)e;
            return new float[]{var8, var9};
         }
      }
   }
}
