package dev.sixseven.n;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1109;
import net.minecraft.class_310;
import net.minecraft.class_3414;

public final class h {
   private static dev.sixseven.m.b a = new dev.sixseven.m.b();
   private static long b;
   private static long c;

   private h() {
   }

   public static void a(dev.sixseven.m.b soundSettings) {
      a = soundSettings;
   }

   private static void a(class_3414 event, float pitch, float volume) {
      float var3 = a.b();
      if (!(var3 <= 0.01F)) {
         class_310.method_1551().method_1483().method_4873(class_1109.method_4757(event, pitch, volume * var3));
      }
   }

   public static void a() {
      if (a.b.i()) {
         a(g.a, 1.0F, 0.85F);
      }
   }

   public static void b() {
      if (a.b.i()) {
         a(g.b, 1.0F, 0.75F);
      }
   }

   public static void c() {
      if (a.c.i()) {
         long var0 = System.nanoTime();
         if (var0 - b >= 45000000L) {
            b = var0;
            a(g.c, 0.95F + (float)(var0 % 7L) * 0.015F, 0.5F);
         }
      }
   }

   public static void a(boolean enabled) {
      if (a.d.i()) {
         a(enabled ? g.d : g.e, 1.0F, 0.8F);
      }
   }

   public static void b(boolean checked) {
      if (a.d.i()) {
         a(checked ? g.d : g.e, 1.25F, 0.55F);
      }
   }

   public static void d() {
      if (a.d.i()) {
         a(g.g, 1.0F, 0.65F);
      }
   }

   public static void a(float normalized) {
      if (a.d.i()) {
         long var1 = System.nanoTime();
         if (var1 - c >= 60000000L) {
            c = var1;
            a(g.f, 0.85F + normalized * 0.55F, 0.5F);
         }
      }
   }

   public static void e() {
      if (a.d.i()) {
         a(g.h, 0.8F, 0.6F);
      }
   }

   public static void f() {
      if (a.d.i()) {
         a(g.h, 1.1F, 0.6F);
      }
   }

   public static void c(boolean enabled) {
      if (a.e.i()) {
         a(enabled ? g.i : g.j, 1.0F, 0.7F);
      }
   }

   public static void g() {
      if (a.d.i()) {
         a(g.g, 0.8F, 0.5F);
      }
   }

   public static void h() {
      if (a != null && a.j.i()) {
         ArrayList var0 = new ArrayList();
         if (a.f.i()) {
            var0.add(g.n);
         }

         if (a.g.i()) {
            var0.add(g.k);
         }

         if (a.h.i()) {
            var0.add(g.l);
         }

         if (a.i.i()) {
            var0.add(g.m);
         }

         if (!var0.isEmpty()) {
            class_3414 var1 = (class_3414)var0.get(ThreadLocalRandom.current().nextInt(var0.size()));
            a(var1, 1.0F, 0.9F);
         }
      }
   }
}
