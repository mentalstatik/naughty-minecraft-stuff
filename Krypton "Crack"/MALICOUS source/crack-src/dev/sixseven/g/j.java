package dev.sixseven.g;

import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class j {
   private static final float a = 0.35F;
   private static final float b = 0.1F;
   private static final ThreadLocal<Vector3f> c = ThreadLocal.withInitial(Vector3f::new);

   private j() {
   }

   public static void a(
      class_4598 var0, class_4587 var1, class_243 var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15, float var16
   ) {
      class_4588 var17 = var0.method_73477(k.b);
      class_4665 var18 = var1.method_23760();
      float var19 = (float)(var3 - var2.field_1352);
      float var20 = (float)(var5 - var2.field_1351);
      float var21 = (float)(var7 - var2.field_1350);
      float var22 = (float)(var9 - var2.field_1352);
      float var23 = (float)(var11 - var2.field_1351);
      float var24 = (float)(var13 - var2.field_1350);
      a(var17, var18, var19, var20, var21, var22, var20, var21, var15, var16);
      a(var17, var18, var22, var20, var21, var22, var20, var24, var15, var16);
      a(var17, var18, var22, var20, var24, var19, var20, var24, var15, var16);
      a(var17, var18, var19, var20, var24, var19, var20, var21, var15, var16);
      a(var17, var18, var19, var23, var21, var22, var23, var21, var15, var16);
      a(var17, var18, var22, var23, var21, var22, var23, var24, var15, var16);
      a(var17, var18, var22, var23, var24, var19, var23, var24, var15, var16);
      a(var17, var18, var19, var23, var24, var19, var23, var21, var15, var16);
      a(var17, var18, var19, var20, var21, var19, var23, var21, var15, var16);
      a(var17, var18, var22, var20, var21, var22, var23, var21, var15, var16);
      a(var17, var18, var22, var20, var24, var22, var23, var24, var15, var16);
      a(var17, var18, var19, var20, var24, var19, var23, var24, var15, var16);
   }

   public static void a(
      class_4598 var0, class_4587 var1, class_243 var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15
   ) {
      class_4588 var16 = var0.method_73477(k.a);
      class_4665 var17 = var1.method_23760();
      float var18 = (float)(var3 - var2.field_1352);
      float var19 = (float)(var5 - var2.field_1351);
      float var20 = (float)(var7 - var2.field_1350);
      float var21 = (float)(var9 - var2.field_1352);
      float var22 = (float)(var11 - var2.field_1351);
      float var23 = (float)(var13 - var2.field_1350);
      a(var16, var17, var15, var18, var19, var20, var21, var19, var20, var21, var19, var23, var18, var19, var23);
      a(var16, var17, var15, var18, var22, var20, var18, var22, var23, var21, var22, var23, var21, var22, var20);
      a(var16, var17, var15, var18, var19, var20, var18, var22, var20, var21, var22, var20, var21, var19, var20);
      a(var16, var17, var15, var18, var19, var23, var21, var19, var23, var21, var22, var23, var18, var22, var23);
      a(var16, var17, var15, var18, var19, var20, var18, var19, var23, var18, var22, var23, var18, var22, var20);
      a(var16, var17, var15, var21, var19, var20, var21, var22, var20, var21, var22, var23, var21, var19, var23);
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, Vector3fc var3, double var4, double var6, double var8, int var10, float var11) {
      float var12 = var3.x();
      float var13 = var3.y();
      float var14 = var3.z();
      float var15 = var12 * 0.35F;
      float var16 = var13 * 0.35F;
      float var17 = var14 * 0.35F;
      float var18 = (float)(var4 - var2.field_1352);
      float var19 = (float)(var6 - var2.field_1351);
      float var20 = (float)(var8 - var2.field_1350);
      float var21 = var18 * var12 + var19 * var13 + var20 * var14;
      if (var21 < 0.1F) {
         float var22 = -0.25F / (var21 - 0.35F);
         var18 = var15 + (var18 - var15) * var22;
         var19 = var16 + (var19 - var16) * var22;
         var20 = var17 + (var20 - var17) * var22;
      }

      class_4588 var24 = var0.method_73477(k.b);
      class_4665 var23 = var1.method_23760();
      a(var24, var23, var15, var16, var17, var18, var19, var20, var10, var11);
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, double var3, double var5, double var7, double var9, int var11, int var12, float var13) {
      class_4588 var14 = var0.method_73477(k.b);
      class_4665 var15 = var1.method_23760();
      float var16 = (float)(var5 - var2.field_1351);
      double var17 = var3 + var9;
      double var19 = var7;

      for (int var21 = 1; var21 <= var11; var21++) {
         double var22 = (Math.PI * 2) * (double)var21 / (double)var11;
         double var24 = var3 + Math.cos(var22) * var9;
         double var26 = var7 + Math.sin(var22) * var9;
         a(
            var14,
            var15,
            (float)(var17 - var2.field_1352),
            var16,
            (float)(var19 - var2.field_1350),
            (float)(var24 - var2.field_1352),
            var16,
            (float)(var26 - var2.field_1350),
            var12,
            var13
         );
         var17 = var24;
         var19 = var26;
      }
   }

   public static void a(class_4598 var0) {
      k.a(var0);
   }

   private static void a(class_4588 var0, class_4665 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float var9) {
      Vector3f var10 = c.get().set(var5 - var2, var6 - var3, var7 - var4);
      if (var10.lengthSquared() > 1.0E-9F) {
         var10.normalize();
      } else {
         var10.set(0.0F, 1.0F, 0.0F);
      }

      var0.method_56824(var1, var2, var3, var4).method_39415(var8).method_61959(var1, var10).method_75298(var9);
      var0.method_56824(var1, var5, var6, var7).method_39415(var8).method_61959(var1, var10).method_75298(var9);
   }

   private static void a(
      class_4588 var0,
      class_4665 var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      var0.method_56824(var1, var3, var4, var5).method_39415(var2);
      var0.method_56824(var1, var6, var7, var8).method_39415(var2);
      var0.method_56824(var1, var9, var10, var11).method_39415(var2);
      var0.method_56824(var1, var12, var13, var14).method_39415(var2);
   }
}
