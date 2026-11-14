package dev.sixseven.g;

import com.mojang.blaze3d.textures.GpuTexture;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.T;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_408;
import org.lwjgl.opengl.GL33C;

public final class t {
   private static dev.sixseven.c.c a;
   private static dev.sixseven.f.a b;
   private static int c = -1;
   private static boolean d;

   private t() {
   }

   public static void a(dev.sixseven.c.c var0, dev.sixseven.f.a var1) {
      a = var0;
      b = var1;
   }

   public static float a() {
      class_310 var0 = class_310.method_1551();
      return Math.max(1.0F, (float)var0.method_22683().method_4506() / 1080.0F);
   }

   public static void b() {
      try {
         l.a();
      } catch (Throwable var24) {
      }

      GpuTexture var0;
      class_310 var1;
      class_276 var2;
      if (!d && a != null && (var2 = (var1 = class_310.method_1551()).method_1522()) != null && (var0 = var2.method_30277()) instanceof class_10868) {
         class_10868 var4 = (class_10868)var0;
         boolean var5 = var1.field_1755 instanceof s;
         boolean var6 = var1.field_1755 instanceof class_408;
         dev.sixseven.d.d var7 = SixSevenClient.modules();
         boolean var8 = !var1.field_1690.field_1842 && var1.field_1687 != null && !var5;
         boolean var9 = var1.field_1755 == null
            && var7 != null
            && (var7.W != null && var7.W.f() || var7.L != null && var7.L.f() || var7.R != null && var7.R.f());
         boolean var10 = var8 && (a.b() || var9 || var6 && dev.sixseven.c.b.a());
         boolean var11 = var1.field_1687 != null && !var1.field_1690.field_1842 && b != null && b.g();
         T var12 = var7 != null ? var7.aa : null;
         boolean var3 = var12 != null && var12.f() && var1.field_1687 != null && !var5;
         if (var5 || var10 || var11 || var3) {
            try {
               dev.sixseven.g.b.a var14 = dev.sixseven.g.b.a.a();

               try {
                  if (!a(var4, var2.field_1482, var2.field_1481)) {
                     return;
                  }

                  dev.sixseven.g.b.d var15 = dev.sixseven.g.b.d.a();
                  if (var3) {
                     r.a(var15, var2.field_1482, var2.field_1481, var12);
                  }

                  var15.a(SixSevenClient.modules().a.c.i());
                  if (var15.c()) {
                     float var16 = a();
                     float var17 = (float)var2.field_1482 / var16;
                     float var18 = (float)var2.field_1481 / var16;
                     var15.a((float)var2.field_1482, (float)var2.field_1481, 1.0F);
                     var15.e();
                     var15.a(var16);
                     if (var10) {
                        if (var6 && dev.sixseven.c.b.b()) {
                           dev.sixseven.c.b.a(var15);
                        }

                        dev.sixseven.d.a.u var19;
                        if ((var19 = SixSevenClient.modules().W).f() && var1.field_1755 == null) {
                           var19.a(var15, var17 / 2.0F, var18 / 2.0F);
                        }

                        if (var1.field_1755 == null) {
                           w.a(var15);
                        }

                        a.a(var15, var17, var18);
                        if (var6) {
                           a(var15, var17, var18);
                        }
                     }

                     if (var11) {
                        b.a(var15, var17, var18);
                     }

                     if (var5) {
                        ((s)var1.field_1755).a(var15, c(), d(), var17, var18);
                     }

                     var15.f();
                     var15.d();
                     return;
                  }
               } finally {
                  var14.b();
               }
            } catch (Throwable var26) {
               d = true;
               SixSevenClient.LOGGER.error("WINTER CLIENT overlay renderer crashed; disabling overlay", var26);
            }
         }
      }
   }

   private static void a(dev.sixseven.g.b.d var0, float var1, float var2) {
      dev.sixseven.m.c var3 = SixSevenClient.themes().a();
      float var4 = c();
      float var5 = d();
      String var6 = "Drag to move  ·  scroll to resize";
      var0.a(var6, (var1 - var0.a(var6, 14.0F)) / 2.0F, 22.0F, 14.0F, dev.sixseven.n.c.a(var3.l(), 0.9F));

      for (dev.sixseven.c.c.a var8 : a.a(var0, var1, var2, true)) {
         boolean var10 = !var8.a().e();
         boolean var9 = var8.a(var4, var5) || var8.a() == dev.sixseven.c.b.d();
         if (var10) {
            var0.e();
            var0.b(0.35F);
            a.a(var0, var8);
            var0.f();
         }

         int var12 = var9 ? var3.d() : dev.sixseven.n.c.a(var3.a(), 0.5F);
         var0.b(var8.b() - 3.0F, var8.c() - 3.0F, var8.d() + 6.0F, var8.e() + 6.0F, 6.0F, var9 ? 1.6F : 1.0F, var12);
         var0.a(var8.b() + var8.d() - 2.0F, var8.c() + var8.e() - 2.0F, 6.0F, 6.0F, 2.0F, var12);
         if (var9) {
            float var13 = var8.a().d();
            String var14 = Math.round(var13 * 100.0F) + "%";
            var0.a(var14, var8.b() + var8.d() + 6.0F, var8.c() + var8.e() / 2.0F, 11.0F, var3.d());
         }
      }
   }

   private static boolean a(class_10868 var0, int var1, int var2) {
      if (c == -1) {
         c = GL33C.glGenFramebuffers();
      }

      GL33C.glBindFramebuffer(36160, c);
      GL33C.glFramebufferTexture2D(36160, 36064, 3553, var0.method_68427(), 0);
      if (GL33C.glCheckFramebufferStatus(36160) != 36053) {
         return false;
      } else {
         GL33C.glViewport(0, 0, var1, var2);
         GL33C.glDisable(3089);
         return true;
      }
   }

   public static float c() {
      class_310 var0 = class_310.method_1551();
      return (float)(var0.field_1729.method_1603() * (double)var0.method_22683().method_4489() / (double)Math.max(1, var0.method_22683().method_4480())) / a();
   }

   public static float d() {
      class_310 var0 = class_310.method_1551();
      return (float)(var0.field_1729.method_1604() * (double)var0.method_22683().method_4506() / (double)Math.max(1, var0.method_22683().method_4507())) / a();
   }

   public static float a(double var0) {
      class_310 var2 = class_310.method_1551();
      float var3 = (float)(var0 * (double)var2.method_22683().method_4495());
      return var3 / a();
   }

   public static float e() {
      class_310 var0 = class_310.method_1551();
      return (float)var0.method_22683().method_4489() / a();
   }

   public static float f() {
      class_310 var0 = class_310.method_1551();
      return (float)var0.method_22683().method_4506() / a();
   }
}
