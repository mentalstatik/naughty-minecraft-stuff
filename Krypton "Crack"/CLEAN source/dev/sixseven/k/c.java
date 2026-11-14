package dev.sixseven.k;

import dev.sixseven.d.a.ag;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_1934;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;

public final class c {
   private static final int a = 10;
   private final ag b;
   private volatile List<b> c = List.of();
   private Set<String> d = new HashSet<>();
   private boolean e;
   private int f;
   private static volatile List<b> g;

   public c(ag module) {
      this.b = module;
   }

   public List<b> a() {
      List var1 = g;
      return var1 != null ? var1 : this.c;
   }

   public void b() {
      this.d = new HashSet<>();
      this.e = false;
      this.c = List.of();
      this.f = 0;
   }

   public void c() {
      this.b();
   }

   public void d() {
      if (g == null && ++this.f % 10 == 0) {
         this.f();
      }
   }

   private void f() {
      class_310 var1 = class_310.method_1551();
      class_634 var2 = var1.method_1562();
      if (var2 != null && var1.field_1724 != null) {
         a.a var3 = this.b.l();
         UUID var4 = var1.field_1724.method_5667();
         HashSet var5 = new HashSet();

         for (class_640 var7 : var2.method_45732()) {
            var5.add(var7.method_2966().id());
         }

         ArrayList var14 = new ArrayList();

         for (class_640 var8 : var2.method_2880()) {
            UUID var9 = var8.method_2966().id();
            if (!var9.equals(var4)) {
               String var10 = var8.method_2966().name();
               if (var10 != null && !var10.isEmpty()) {
                  boolean var11 = var8.method_2958() == class_1934.field_9219 || !var5.contains(var9);
                  if (!var11 || var3.f()) {
                     class_268 var12 = var8.method_2955();
                     b var13 = dev.sixseven.k.a.a(
                        var10,
                        var8.method_2971(),
                        var12 == null ? null : var12.method_1144(),
                        var12 == null ? null : var12.method_1136(),
                        var12 == null ? null : var12.method_1197(),
                        var11,
                        var8.method_2959(),
                        var3
                     );
                     if (var13 != null) {
                        var14.add(var13);
                     }
                  }
               }
            }
         }

         var14.sort(Comparator.comparing(b::e).thenComparing(Comparator.comparingInt(b::g).reversed()).thenComparing(ex -> ex.b().toLowerCase(Locale.ROOT)));
         HashSet var16 = new HashSet();

         for (b var19 : var14) {
            var16.add(var19.b());
         }

         if (this.e) {
            for (b var20 : var14) {
               if (!this.d.contains(var20.b())) {
                  this.b.a(var20);
               }
            }
         }

         this.d = var16;
         this.e = true;
         this.c = List.copyOf(var14);
      } else {
         this.c = List.of();
         this.d = new HashSet<>();
         this.e = false;
      }
   }

   public static void a(List<b> entries) {
      g = entries == null ? null : List.copyOf(entries);
   }

   public static void e() {
      g = null;
   }
}
