package dev.sixseven.g;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import dev.sixseven.SixSevenClient;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1011;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import net.minecraft.class_918;
import net.minecraft.class_9848;

public final class l {
   private static final class_2960[] a = new class_2960[]{class_918.field_43087, class_918.field_43086};
   private static final class_1011[] b = new class_1011[a.length];
   private static final class_1011[] c = new class_1011[a.length];
   private static final GpuTexture[] d = new GpuTexture[a.length];
   private static final Map<String, class_1011> e = new HashMap<>();
   private static boolean f;
   private static boolean g;
   private static String h;

   private l() {
   }

   public static void a() {
      dev.sixseven.d.a.w var0 = SixSevenClient.modules() == null ? null : SixSevenClient.modules().ab;
      if (var0 != null) {
         if (var0.k()) {
            if (var0.l()) {
               a(var0.m(), var0.n());
            } else {
               a(var0.o());
            }
         } else if (g) {
            c();
         }
      }
   }

   private static void b() {
      if (!f) {
         f = true;
         class_310 var0 = class_310.method_1551();

         for (int var1 = 0; var1 < a.length; var1++) {
            Optional var2 = var0.method_1478().method_14486(a[var1]);
            if (!var2.isEmpty()) {
               try (InputStream var3 = ((class_3298)var2.get()).method_14482()) {
                  b[var1] = class_1011.method_4309(var3);
               } catch (Exception var8) {
                  b[var1] = null;
               }
            }
         }
      }
   }

   private static void a(int color) {
      b();
      a("tint:" + color, i -> a(i, b[i], color));
   }

   private static void a(String name, float strength) {
      b();
      class_1011 var2 = a(name);
      if (var2 != null) {
         int var3 = Math.round(strength * 255.0F);
         a("tex:" + name + ":" + var3, i -> a(i, var2, strength));
      }
   }

   private static void a(String key, l.a source) {
      class_1060 var2 = class_310.method_1551().method_1531();
      boolean var3 = false;

      for (int var4 = 0; var4 < a.length; var4++) {
         class_1044 var5 = var2.method_4619(a[var4]);
         if (var5 != null && var5.method_68004() != d[var4]) {
            var3 = true;
         }
      }

      if (!g || !key.equals(h) || var3) {
         for (int var8 = 0; var8 < a.length; var8++) {
            if (b[var8] != null) {
               class_1044 var9 = var2.method_4619(a[var8]);
               GpuTexture var6 = var9 == null ? null : var9.method_68004();
               if (var6 != null) {
                  class_1011 var7 = source.build(var8);
                  if (var7 != null) {
                     RenderSystem.getDevice().createCommandEncoder().writeToTexture(var6, var7);
                     d[var8] = var6;
                  }
               }
            }
         }

         g = true;
         h = key;
      }
   }

   private static void c() {
      class_1060 var0 = class_310.method_1551().method_1531();

      for (int var1 = 0; var1 < a.length; var1++) {
         class_1011 var2 = b[var1];
         if (var2 != null) {
            class_1044 var3 = var0.method_4619(a[var1]);
            GpuTexture var4 = var3 == null ? null : var3.method_68004();
            if (var4 != null) {
               RenderSystem.getDevice().createCommandEncoder().writeToTexture(var4, var2);
               d[var1] = var4;
            }
         }
      }

      g = false;
      h = null;
   }

   private static class_1011 a(int i, class_1011 src, int color) {
      int var3 = src.method_4307();
      int var4 = src.method_4323();
      class_1011 var5 = a(i, var3, var4);
      int var6 = class_9848.method_61327(color);
      int var7 = class_9848.method_61329(color);
      int var8 = class_9848.method_61331(color);

      for (int var9 = 0; var9 < var4; var9++) {
         for (int var10 = 0; var10 < var3; var10++) {
            int var11 = src.method_61940(var10, var9);
            int var12 = Math.max(class_9848.method_61327(var11), Math.max(class_9848.method_61329(var11), class_9848.method_61331(var11)));
            var5.method_61941(var10, var9, class_9848.method_61324(class_9848.method_61320(var11), var6 * var12 / 255, var7 * var12 / 255, var8 * var12 / 255));
         }
      }

      return var5;
   }

   private static class_1011 a(int i, class_1011 src, float strength) {
      int var3 = b[i].method_4307();
      int var4 = b[i].method_4323();
      int var5 = src.method_4307();
      int var6 = src.method_4323();
      class_1011 var7 = a(i, var3, var4);

      for (int var8 = 0; var8 < var4; var8++) {
         float var9 = ((float)var8 + 0.5F) * (float)var6 / (float)var4 - 0.5F;

         for (int var10 = 0; var10 < var3; var10++) {
            float var11 = ((float)var10 + 0.5F) * (float)var5 / (float)var3 - 0.5F;
            int var12 = a(src, var11, var9, var5, var6);
            int var13 = Math.round((float)class_9848.method_61327(var12) * strength);
            int var14 = Math.round((float)class_9848.method_61329(var12) * strength);
            int var15 = Math.round((float)class_9848.method_61331(var12) * strength);
            var7.method_61941(var10, var8, class_9848.method_61324(class_9848.method_61320(var12), var13, var14, var15));
         }
      }

      return var7;
   }

   private static class_1011 a(int i, int w, int h) {
      class_1011 var3 = c[i];
      if (var3 == null || var3.method_4307() != w || var3.method_4323() != hx) {
         if (var3 != null) {
            var3.close();
         }

         var3 = new class_1011(w, hx, false);
         c[i] = var3;
      }

      return var3;
   }

   private static int a(class_1011 img, float fx, float fy, int sw, int sh) {
      int var5 = Math.floorMod((int)Math.floor((double)fx), sw);
      int var6 = Math.floorMod((int)Math.floor((double)fy), sh);
      int var7 = (var5 + 1) % sw;
      int var8 = (var6 + 1) % sh;
      float var9 = fx - (float)Math.floor((double)fx);
      float var10 = fy - (float)Math.floor((double)fy);
      int var11 = img.method_61940(var5, var6);
      int var12 = img.method_61940(var7, var6);
      int var13 = img.method_61940(var5, var8);
      int var14 = img.method_61940(var7, var8);
      int var15 = a(class_9848.method_61320(var11), class_9848.method_61320(var12), class_9848.method_61320(var13), class_9848.method_61320(var14), var9, var10);
      int var16 = a(class_9848.method_61327(var11), class_9848.method_61327(var12), class_9848.method_61327(var13), class_9848.method_61327(var14), var9, var10);
      int var17 = a(class_9848.method_61329(var11), class_9848.method_61329(var12), class_9848.method_61329(var13), class_9848.method_61329(var14), var9, var10);
      int var18 = a(class_9848.method_61331(var11), class_9848.method_61331(var12), class_9848.method_61331(var13), class_9848.method_61331(var14), var9, var10);
      return class_9848.method_61324(var15, var16, var17, var18);
   }

   private static int a(int c00, int c10, int c01, int c11, float dx, float dy) {
      float var6 = (float)c00 + (float)(c10 - c00) * dx;
      float var7 = (float)c01 + (float)(c11 - c01) * dx;
      return Math.round(var6 + (var7 - var6) * dy);
   }

   private static class_1011 a(String name) {
      if (e.containsKey(name)) {
         return e.get(name);
      } else {
         class_1011 var1 = null;
         class_2960 var2 = class_2960.method_60655("sixsevenclient", "textures/misc/glints/" + name + ".png");
         Optional var3 = class_310.method_1551().method_1478().method_14486(var2);
         if (var3.isPresent()) {
            try (InputStream var4 = ((class_3298)var3.get()).method_14482()) {
               var1 = class_1011.method_4309(var4);
            } catch (Exception var9) {
               var1 = null;
            }
         }

         e.put(name, var1);
         return var1;
      }
   }

   private interface a {
      class_1011 build(int var1);
   }
}
