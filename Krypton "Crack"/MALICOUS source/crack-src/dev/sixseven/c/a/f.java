package dev.sixseven.c.a;

import java.util.function.BooleanSupplier;
import net.minecraft.class_310;
import net.minecraft.class_742;
import net.minecraft.class_746;

public class f extends dev.sixseven.c.a {
   private static final float c = 110.0F;
   private static final String[] d = new String[]{"N", "E", "S", "W"};
   private static final float[][] e = new float[][]{{0.0F, -1.0F}, {1.0F, 0.0F}, {0.0F, 1.0F}, {-1.0F, 0.0F}};
   private final dev.sixseven.d.e.c f;
   private final dev.sixseven.d.e.f g;
   private final dev.sixseven.m.d h;

   public f(dev.sixseven.d.e.c var1, dev.sixseven.d.e.f var2, dev.sixseven.m.d var3, BooleanSupplier var4) {
      super("radar", 0.006F, 0.45F, var4);
      this.f = var1;
      this.g = var2;
      this.h = var3;
   }

   @Override
   public float b(dev.sixseven.g.b.d var1) {
      return 110.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d var1) {
      return 110.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5) {
      dev.sixseven.m.c var6 = this.h.a();
      class_746 var7 = class_310.method_1551().field_1724;
      if (var7 != null) {
         float var8 = var4 / 2.0F;
         float var9 = var2 + var8;
         float var10 = var3 + var8;
         float var11 = 0.55F;
         var1.a(var9, var10, var8, dev.sixseven.n.c.a(-15856621, var11));
         var1.d(var9, var10, var8 * 0.5F, 1.0F, dev.sixseven.n.c.a(var6.a(), 0.22F));
         int var12 = dev.sixseven.n.c.a(var6.a(), 0.18F);
         var1.b(var9 - var8, var10, var9 + var8, var10, 1.0F, var12);
         var1.b(var9, var10 - var8, var9, var10 + var8, 1.0F, var12);
         float var13 = var7.method_36454();
         float var14 = (float)Math.toRadians((double)(var13 + 90.0F));
         double var15 = Math.sin((double)var14);
         double var17 = Math.cos((double)var14);

         for (int var19 = 0; var19 < 4; var19++) {
            float var20 = a(e[var19][0], e[var19][1], var14);
            float var21 = b(e[var19][0], e[var19][1], var14);
            float var22 = var9 + var20 * (var8 - 9.0F);
            float var23 = var10 + var21 * (var8 - 9.0F);
            boolean var24 = var19 == 0;
            var1.a(d[var19], var22 - var1.a(d[var19], 11.0F) / 2.0F, var23, 11.0F, var24 ? var6.d() : var6.l());
         }

         float var39 = this.f.o.d();
         if (this.g.f() && this.g.q.i()) {
            int var40 = this.g.s.c();

            for (dev.sixseven.l.b.g var44 : this.g.s.b()) {
               this.a(
                  var1,
                  var6,
                  var9,
                  var10,
                  var8,
                  var39,
                  var14,
                  (float)(var44.b() - var7.method_23317()),
                  (float)(var44.c() - var7.method_23321()),
                  a(var44.e(), var40)
               );
            }
         }

         var1.a(var9, var10, 3.0F, 4.0F, dev.sixseven.n.c.a(var6.a(), 0.6F));
         var1.a(var9, var10, 3.0F, var6.d());
         float var41 = Math.max(10.0F, var8 * 0.17F);
         float var43 = var39 * var39;
         double var45 = var7.method_23317();
         double var46 = var7.method_23321();
         boolean var26 = this.f.p.i();

         for (class_742 var28 : class_310.method_1551().field_1687.method_18456()) {
            if (var28 != var7) {
               float var30 = (float)(var28.method_23317() - var45);
               float var31 = (float)(var28.method_23321() - var46);
               float var32 = var30 * var30 + var31 * var31;
               if (!(var32 > var43)) {
                  float var33 = (float)Math.sqrt((double)var32);
                  float var34 = var33 / var39;
                  float var35 = var9 + a(var30, var31, var15, var17) / Math.max(var33, 0.001F) * var34 * (var8 - var41 / 2.0F - 3.0F);
                  float var36 = var10 + b(var30, var31, var15, var17) / Math.max(var33, 0.001F) * var34 * (var8 - var41 / 2.0F - 3.0F);
                  int var29;
                  if (var26 && (var29 = dev.sixseven.g.b.c.a(var28.method_52814().comp_1626().comp_3627(), 64, 64)) > 0) {
                     float var37 = var35 - var41 / 2.0F;
                     float var38 = var36 - var41 / 2.0F;
                     dev.sixseven.g.b.c.a(var1, var29, 64.0F, 64.0F, 8.0F, 8.0F, 16.0F, 16.0F, var37, var38, var41, var41, 1.0F);
                     dev.sixseven.g.b.c.a(var1, var29, 64.0F, 64.0F, 40.0F, 8.0F, 48.0F, 16.0F, var37, var38, var41, var41, 1.0F);
                     var1.b(var37 - 1.0F, var38 - 1.0F, var41 + 2.0F, var41 + 2.0F, 3.0F, 1.0F, dev.sixseven.n.c.a(-1, 0.35F));
                  } else {
                     var1.a(var35, var36, 2.5F, 3.0F, dev.sixseven.n.c.a(-1, 0.4F));
                     var1.a(var35, var36, 2.5F, -1);
                  }
               }
            }
         }
      }
   }

   private static float a(double var0, int var2) {
      return var2 <= 0 ? 1.0F : Math.clamp((float)((var0 - (double)var2) / ((double)var2 * 2.0)), 0.0F, 1.0F);
   }

   private void a(
      dev.sixseven.g.b.d var1, dev.sixseven.m.c var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      float var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
      if (!(var11 < 0.5F)) {
         boolean var12 = var11 > var6;
         float var13 = Math.min(var11 / var6, 1.0F);
         float var14 = var12 ? 6.0F : 9.0F;
         float var15 = var3 + a(var8, var9, var7) / var11 * var13 * (var5 - var14);
         float var16 = var4 + b(var8, var9, var7) / var11 * var13 * (var5 - var14);
         double var17 = (double)(System.nanoTime() % 1000000000000L) / 1.0E9;
         float var19 = (float)(0.5 + 0.5 * Math.sin(var17 * Math.PI * 2.0 / 1.8));
         float var20 = (var12 ? 2.4F : 3.0F + 1.5F * var10) * (1.0F + 0.1F * var19);
         float var21 = (0.72F + 0.28F * var10) * (0.88F + 0.12F * var19);
         int var22 = var2.a();
         var1.c(
            var15 - var20,
            var16 - var20,
            var20 * 2.0F,
            var20 * 2.0F,
            var20 * 0.6F,
            3.5F + 2.5F * var19,
            dev.sixseven.n.c.a(var22, (0.3F + 0.25F * var10) * var21)
         );
         var1.a(var15 - var20, var16 - var20, var20 * 2.0F, var20 * 2.0F, var20 * 0.6F, dev.sixseven.n.c.a(var22, var21));
         var1.b(var15 - var20, var16 - var20, var20 * 2.0F, var20 * 2.0F, var20 * 0.6F, 1.0F, dev.sixseven.n.c.a(var2.d(), 0.55F * var21));
         if (var12 && var11 <= var6 * 2.5F) {
            String var23 = (int)var11 + "m";
            float var24 = var1.a(var23, 8.5F);
            float var25 = var15 + (var3 - var15) * 0.24F;
            float var26 = var16 + (var4 - var16) * 0.24F;
            var1.a(var25 - var24 / 2.0F - 3.0F, var26 - 5.5F, var24 + 6.0F, 11.0F, 5.5F, dev.sixseven.n.c.a(-15856621, 0.72F));
            var1.a(var23, var25 - var24 / 2.0F, var26, 8.5F, dev.sixseven.n.c.a(var2.d(), 0.95F));
         }
      }
   }

   private static float a(float var0, float var1, float var2) {
      return (float)((double)(-var0) * Math.sin((double)var2) + (double)var1 * Math.cos((double)var2));
   }

   private static float b(float var0, float var1, float var2) {
      return (float)(-((double)var0 * Math.cos((double)var2) + (double)var1 * Math.sin((double)var2)));
   }

   private static float a(float var0, float var1, double var2, double var4) {
      return (float)(-((double)var0) * var2 + (double)var1 * var4);
   }

   private static float b(float var0, float var1, double var2, double var4) {
      return (float)(-((double)var0 * var4 + (double)var1 * var2));
   }
}
