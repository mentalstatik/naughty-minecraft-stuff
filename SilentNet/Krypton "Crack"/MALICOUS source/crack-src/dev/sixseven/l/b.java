package dev.sixseven.l;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.N;
import dev.sixseven.n.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_2338.class_2339;

public class b {
   public static final int a = 5;
   private static final int b = 5;
   private static final int c = 10;
   private static final boolean d = Boolean.getBoolean("sixseven.sus.debug");
   private final dev.sixseven.d.e.f e;
   private final Map<Long, dev.sixseven.l.b.a> f = new HashMap<>();
   private final Deque<Long> g = new ArrayDeque<>();
   private final Set<Long> h = ConcurrentHashMap.newKeySet();
   private final Set<Long> i = ConcurrentHashMap.newKeySet();
   private final Set<Long> j = new HashSet<>();
   private volatile List<dev.sixseven.l.b.b> k = List.of();
   private volatile List<dev.sixseven.l.b.g> l = List.of();
   private class_1923 m;
   private int n;
   private int o = -1;
   private int p;
   private int q;
   private int r = -10;
   private int s = -1;
   private int t = Integer.MIN_VALUE;
   private int u = Integer.MIN_VALUE;
   private boolean v = true;
   private Object w;

   public b(dev.sixseven.d.e.f var1) {
      this.e = var1;
      dev.sixseven.l.a.a().a((LongConsumer)(var1x -> {
         if (this.i.contains(var1x)) {
            this.h.add(var1x);
         }
      }));
   }

   public List<dev.sixseven.l.b.b> a() {
      return this.k;
   }

   public List<dev.sixseven.l.b.g> b() {
      return this.l;
   }

   public int c() {
      return this.e.b.e() * 5;
   }

   public void d() {
      this.f.clear();
      this.g.clear();
      this.h.clear();
      this.i.clear();
      this.j.clear();
      this.k = List.of();
      this.l = List.of();
      this.m = null;
      this.o = -1;
      this.p = 0;
      this.q = 0;
      this.r = -10;
      this.n = 0;
      this.w = null;
      this.s = this.f();
      this.t = this.c();
      this.u = this.e.o.e();
      this.v = true;
   }

   public void a(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      if (this.i.contains(var3)) {
         this.h.add(var3);
      }
   }

   public void e() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1687 != null && var1.field_1724 != null) {
         try {
            if (this.w != var1.field_1687) {
               this.d();
               this.w = var1.field_1687;
            }

            this.n++;
            int var2 = this.f();
            if (var2 != this.s) {
               this.f.clear();
               this.g.clear();
               this.h.clear();
               this.i.clear();
               this.j.clear();
               this.m = null;
               this.o = -1;
               this.s = var2;
               this.v = true;
            }

            int var3 = this.c();
            if (var3 != this.t) {
               this.t = var3;
               this.v = true;
            }

            int var4 = this.e.o.e();
            if (var4 != this.u) {
               this.u = var4;
               this.v = true;
            }

            if (var2 == 0) {
               if (!this.f.isEmpty() || !this.k.isEmpty() || !this.l.isEmpty()) {
                  this.f.clear();
                  this.i.clear();
                  this.k = List.of();
                  this.l = List.of();
               }

               this.h.clear();
               this.g.clear();
               return;
            }

            this.b(var1);
            boolean var5 = c(var1);
            int var6 = this.e.i.e();
            N var7 = SixSevenClient.modules() == null ? null : SixSevenClient.modules().h;
            boolean var8 = var7 != null && var7.f();
            int var9 = var8 ? var7.a.e() : (var5 ? Math.min(var6 * 2, 36) : var6);
            long var10 = var8 ? (long)var7.b.e() * 1000000L : (var5 ? 2500000L : 2000000L);
            long var12 = System.nanoTime() + var10;
            int var14 = this.a(var1, var9, var12);
            this.b(var1, var9 - var14, var12);
            if (this.n - this.q >= 20) {
               this.a(var1);
            }

            if (this.v && this.n - this.r >= 10) {
               this.d(var1);
               this.v = false;
               this.r = this.n;
            }
         } catch (Exception var15) {
            SixSevenClient.LOGGER.warn("SusChunkFinder scan error: {}", var15.toString());
         }
      } else {
         if (this.w != null) {
            this.d();
         }
      }
   }

   private int f() {
      byte var1 = 0;
      if (this.e.c.i()) {
         var1 |= 1;
      }

      if (this.e.d.i()) {
         var1 |= 2;
      }

      if (this.e.e.i()) {
         var1 |= 4;
      }

      if (this.e.f.i()) {
         var1 |= 8;
      }

      if (this.e.g.i()) {
         var1 |= 16;
      }

      if (this.e.h.i()) {
         var1 |= 32;
      }

      return var1;
   }

   private void a(class_310 var1) {
      this.q = this.n;
      dev.sixseven.l.a.a().a(var1.field_1687);
      boolean var2 = this.f
         .keySet()
         .removeIf(var1x -> var1.field_1687.method_2935().method_12126(class_1923.method_8325(var1x), class_1923.method_8332(var1x), false) == null);
      this.i.removeIf(var1x -> !this.f.containsKey(var1x));
      this.h.removeIf(var1x -> !this.f.containsKey(var1x));
      if (this.j.removeIf(var1x -> !this.f.containsKey(var1x))) {
         var2 = true;
      }

      if (var2) {
         this.v = true;
      }
   }

   private int a(class_310 var1, int var2, long var3) {
      if (this.h.isEmpty()) {
         return 0;
      } else {
         int var5 = 0;
         Iterator var6 = this.h.iterator();

         while (var6.hasNext() && var5 < var2 && System.nanoTime() < var3) {
            long var7 = (Long)var6.next();
            var6.remove();
            class_2818 var9 = var1.field_1687.method_2935().method_12126(class_1923.method_8325(var7), class_1923.method_8332(var7), false);
            if (var9 != null && this.f.containsKey(var7)) {
               this.f.put(var7, this.a(var1, var9));
               this.i.add(var7);
               this.v = true;
               var5++;
            }
         }

         return var5;
      }
   }

   private void b(class_310 var1, int var2, long var3) {
      int var5 = 0;
      int var6 = 0;

      while (var5 < var2 && var6 < 128 && !this.g.isEmpty() && System.nanoTime() < var3) {
         var6++;
         long var8 = this.g.pollFirst();
         class_2818 var7;
         if (!this.f.containsKey(var8)
            && (var7 = var1.field_1687.method_2935().method_12126(class_1923.method_8325(var8), class_1923.method_8332(var8), false)) != null) {
            this.f.put(var8, this.a(var1, var7));
            this.i.add(var8);
            this.v = true;
            var5++;
         }
      }
   }

   private void b(class_310 var1) {
      class_1923 var2 = var1.field_1724.method_31476();
      int var3 = Math.min((Integer)var1.field_1690.method_42503().method_41753() + 1, 16);
      int var4 = c(var1) ? 1 : 3;
      boolean var5 = this.m == null || Math.max(Math.abs(var2.field_9181 - this.m.field_9181), Math.abs(var2.field_9180 - this.m.field_9180)) >= var4;
      boolean var6 = var3 != this.o;
      boolean var7 = this.g.isEmpty() && this.n - this.p >= 20;
      if (var5 || var6 || var7) {
         this.m = var2;
         this.o = var3;
         this.p = this.n;
         this.g.clear();
         ArrayList var8 = new ArrayList();

         for (int var9 = -var3; var9 <= var3; var9++) {
            for (int var10 = -var3; var10 <= var3; var10++) {
               long var11 = class_1923.method_8331(var2.field_9181 + var9, var2.field_9180 + var10);
               if (!this.f.containsKey(var11)) {
                  var8.add(var11);
               }
            }
         }

         var8.sort(Comparator.comparingInt(var1x -> {
            int var2x = class_1923.method_8325(var1x) - var2.field_9181;
            int var3x = class_1923.method_8332(var1x) - var2.field_9180;
            return var2x * var2x + var3x * var3x;
         }));
         this.g.addAll(var8);
      }
   }

   private static boolean a(class_2680 var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      class_2248 var6 = var0.method_26204();
      return var1 && (var6 == class_2246.field_9993 || var6 == class_2246.field_10463)
         || var2 && var6 == class_2246.field_10211
         || var3 && var6 == class_2246.field_16999
         || var4 && var6 == class_2246.field_10597
         || var5 && var6 == class_2246.field_28048;
   }

   private static boolean a(class_2680 var0) {
      return var0.method_27852(class_2246.field_27160) || var0.method_27852(class_2246.field_27159);
   }

   private static boolean c(class_310 var0) {
      double var1 = var0.field_1724.method_18798().field_1352;
      double var3 = var0.field_1724.method_18798().field_1350;
      return var1 * var1 + var3 * var3 >= 0.16;
   }

   private dev.sixseven.l.b.a a(class_310 var1, class_2818 var2) {
      dev.sixseven.l.b.a var3 = new dev.sixseven.l.b.a(var2.method_12004().method_8324());
      if (this.e.c.i()) {
         this.a(var1, var2, var3);
      }

      this.b(var1, var2, var3);
      var3.a();
      if (d && var3.d > 0.0) {
         SixSevenClient.LOGGER.info("[sus] chunk {} score={} hits={}", new Object[]{var2.method_12004(), var3.d, var3.b});
      }

      return var3;
   }

   private void a(class_310 var1, class_2818 var2, dev.sixseven.l.b.a var3) {
      class_2339 var4 = new class_2339();
      dev.sixseven.l.a.a()
         .a(
            var2.method_12004().field_9181,
            var2.method_12004().field_9180,
            (var3x, var4x, var5) -> {
               var4.method_10103(var3x, var4x, var5);
               class_2680 var6 = var1.field_1687.method_8320(var4);
               if ((var6.method_26215() || var6.method_27852(class_2246.field_27161)) && a(var1, var3x, var4x, var5, var4)) {
                  var3.c.add(new class_2338(var3x, var4x, var5));
                  if (d) {
                     SixSevenClient.LOGGER
                        .info("[sus] AMETHYST light-5 cell @{}, {}, {} ({})", new Object[]{var3x, var4x, var5, var6.method_26215() ? "hidden" : "visible"});
                  }
               }
            }
         );
   }

   private static boolean a(class_310 var0, int var1, int var2, int var3, class_2339 var4) {
      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               if (var5 != 0 || var6 != 0 || var7 != 0) {
                  var4.method_10103(var1 + var5, var2 + var6, var3 + var7);
                  if (a(var0.field_1687.method_8320(var4))) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private void b(class_310 var1, class_2818 var2, dev.sixseven.l.b.a var3) {
      boolean var4 = this.e.d.i();
      boolean var5 = this.e.e.i();
      boolean var6 = this.e.f.i();
      boolean var7 = this.e.g.i();
      boolean var8 = this.e.h.i();
      if (var4 || var5 || var6 || var7 || var8) {
         Predicate var9 = var5x -> a(var5x, var4, var5, var6, var7, var8);
         class_2826[] var10 = var2.method_12006();
         int var11 = var2.method_32891();
         int var12 = var2.method_12004().method_8326();
         int var13 = var2.method_12004().method_8328();
         class_2339 var14 = new class_2339();

         for (int var15 = 0; var15 < var10.length; var15++) {
            int var17 = var11 + var15;
            class_2826 var16;
            if ((var16 = var10[var15]) != null && !var16.method_38292() && var16.method_12265().method_19526(var9)) {
               int var18 = var17 << 4;

               for (int var19 = 0; var19 < 16; var19++) {
                  int var20 = var18 + var19;

                  for (int var21 = 0; var21 < 16; var21++) {
                     for (int var22 = 0; var22 < 16; var22++) {
                        class_2680 var23 = var16.method_12254(var22, var19, var21);
                        if (var9.test(var23)) {
                           var14.method_10103(var12 + var22, var20, var13 + var21);
                           this.a(var1, var23, var14, var3, var4, var5, var6, var7, var8);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(
      class_310 var1, class_2680 var2, class_2338 var3, dev.sixseven.l.b.a var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9
   ) {
      class_2248 var10 = var2.method_26204();
      if ((var10 == class_2246.field_9993 || var10 == class_2246.field_10463) && var5) {
         class_2680 var12 = var1.field_1687.method_8320(var3.method_10084());
         if (var12.method_27852(class_2246.field_9993) || var12.method_27852(class_2246.field_10463)) {
            return;
         }

         int var13 = a(var1, var3, class_2350.field_11033, class_2246.field_9993, class_2246.field_10463);
         boolean var17 = var10 == class_2246.field_9993
            && var2.method_28498(class_2741.field_12517)
            && (Integer)var2.method_11654(class_2741.field_12517) == 25;
         if (var17 && var13 >= 8 || var13 >= 14) {
            var4.a(dev.sixseven.l.b.f.b, var3);
            if (d) {
               SixSevenClient.LOGGER.info("[sus] KELP @{} height={} maxAge={}", new Object[]{var3, var13, var17});
            }
         }
      } else if (var10 == class_2246.field_10211 && var6) {
         if (var1.field_1687.method_8320(var3.method_10074()).method_27852(class_2246.field_10211)) {
            return;
         }

         int var16 = a(var1, var3, class_2350.field_11036, class_2246.field_10211);
         if (var16 >= 12) {
            var4.a(dev.sixseven.l.b.f.c, var3);
            if (d) {
               SixSevenClient.LOGGER.info("[sus] BAMBOO @{} height={}", var3, var16);
            }
         }
      } else if (var10 == class_2246.field_16999 && var7) {
         if (var2.method_28498(class_2741.field_12497) && (Integer)var2.method_11654(class_2741.field_12497) == 3) {
            var4.a(dev.sixseven.l.b.f.d, var3);
            if (d) {
               SixSevenClient.LOGGER.info("[sus] BERRIES max age @{}", var3);
            }
         }
      } else if (var10 == class_2246.field_10597 && var8) {
         if (var1.field_1687.method_8320(var3.method_10084()).method_27852(class_2246.field_10597)) {
            return;
         }

         int var15 = a(var1, var3, class_2350.field_11033, class_2246.field_10597);
         if (var15 >= 7) {
            var4.a(dev.sixseven.l.b.f.e, var3);
            if (d) {
               SixSevenClient.LOGGER.info("[sus] VINES @{} hang={}", var3, var15);
            }
         }
      } else if (var10 == class_2246.field_28048 && var9) {
         if (var1.field_1687.method_8320(var3.method_10084()).method_27852(class_2246.field_28048)
            || !var1.field_1687.method_8320(var3.method_10074()).method_27852(class_2246.field_28048)) {
            return;
         }

         int var11 = a(var1, var3, class_2350.field_11033, class_2246.field_28048);
         if (var11 >= 5) {
            var4.a(dev.sixseven.l.b.f.f, var3);
            if (d) {
               SixSevenClient.LOGGER.info("[sus] DRIPSTONE @{} length={}", var3, var11);
            }
         }
      }
   }

   private static int a(class_310 var0, class_2338 var1, class_2350 var2, class_2248 var3) {
      int var4 = 1;

      for (class_2339 var5 = var1.method_25503(); var4 < 40; var4++) {
         var5.method_10098(var2);
         class_2680 var6 = var0.field_1687.method_8320(var5);
         if (!var6.method_27852(var3)) {
            break;
         }
      }

      return var4;
   }

   private static int a(class_310 var0, class_2338 var1, class_2350 var2, class_2248 var3, class_2248 var4) {
      int var5 = 1;

      for (class_2339 var6 = var1.method_25503(); var5 < 40; var5++) {
         var6.method_10098(var2);
         class_2680 var7 = var0.field_1687.method_8320(var6);
         if (!var7.method_27852(var3) && !var7.method_27852(var4)) {
            break;
         }
      }

      return var5;
   }

   private void d(class_310 var1) {
      this.f
         .keySet()
         .removeIf(var1x -> var1.field_1687.method_2935().method_12126(class_1923.method_8325(var1x), class_1923.method_8332(var1x), false) == null);
      this.i.removeIf(var1x -> !this.f.containsKey(var1x));
      int var2 = this.c();
      HashMap var3 = new HashMap();

      for (dev.sixseven.l.b.a var5 : this.f.values()) {
         if (var5.d >= (double)var2) {
            dev.sixseven.l.b.c var6 = var3.computeIfAbsent(var5.a, dev.sixseven.l.b.c::new);
            var6.b = Math.max(var6.b, var5.d);
            var6.c = var6.c + var5.e;
            var6.d = var6.d + var5.f;
            var6.e = var6.e + var5.g;
         }
      }

      for (dev.sixseven.l.b.d var13 : this.g()) {
         if (!(var13.c() < (double)var2)) {
            for (long var7 : var13.b()) {
               dev.sixseven.l.b.c var9 = var3.computeIfAbsent(var7, dev.sixseven.l.b.c::new);
               var9.b = Math.max(var9.b, var13.c());
            }

            double var16 = dev.sixseven.l.b.f.a.g;

            for (class_2338 var18 : var13.a()) {
               dev.sixseven.l.b.c var10 = (dev.sixseven.l.b.c)var3.get(class_1923.method_8331(var18.method_10263() >> 4, var18.method_10260() >> 4));
               if (var10 != null) {
                  var10.c += var16;
                  var10.d = var10.d + ((double)var18.method_10263() + 0.5) * var16;
                  var10.e = var10.e + ((double)var18.method_10260() + 0.5) * var16;
               }
            }

            if (d) {
               SixSevenClient.LOGGER.info("[sus] GEODE {} cells / {} chunks, score {} -> FLAG", new Object[]{var13.a().size(), var13.b().size(), var13.c()});
            }
         }
      }

      ArrayList var12 = new ArrayList();

      for (dev.sixseven.l.b.c var17 : var3.values()) {
         var12.add(new dev.sixseven.l.b.b(var17.a, var17.b));
      }

      this.k = List.copyOf(var12);
      this.l = this.a(var12, var3);
      this.e(var1);
   }

   private List<dev.sixseven.l.b.d> g() {
      ArrayList var1 = new ArrayList();

      for (dev.sixseven.l.b.a var3 : this.f.values()) {
         var1.addAll(var3.c);
      }

      int var20 = var1.size();
      if (var20 == 0) {
         return List.of();
      } else {
         int[] var21 = new int[var20];
         int[] var4 = new int[var20];
         int[] var5 = new int[var20];
         int[] var6 = new int[var20];
         HashMap var7 = new HashMap((int)Math.min((long)var20 * 2L, 65536L));

         for (int var8 = 0; var8 < var20; var8++) {
            var21[var8] = var8;
            class_2338 var9 = (class_2338)var1.get(var8);
            var4[var8] = var9.method_10263();
            var5[var8] = var9.method_10264();
            var6[var8] = var9.method_10260();
            int var10 = Math.floorDiv(var4[var8], 6);
            int var11 = Math.floorDiv(var5[var8], 6);
            int var12 = Math.floorDiv(var6[var8], 6);

            for (int var13 = -1; var13 <= 1; var13++) {
               for (int var14 = -1; var14 <= 1; var14++) {
                  for (int var15 = -1; var15 <= 1; var15++) {
                     ArrayList var16 = (ArrayList)var7.get(new dev.sixseven.l.b.e(var10 + var13, var11 + var14, var12 + var15));
                     if (var16 != null) {
                        for (int var18 : var16) {
                           int var19 = Math.max(
                              Math.abs(var4[var8] - var4[var18]), Math.max(Math.abs(var5[var8] - var5[var18]), Math.abs(var6[var8] - var6[var18]))
                           );
                           if (var19 <= 5) {
                              a(var21, var8, var18);
                           }
                        }
                     }
                  }
               }
            }

            var7.computeIfAbsent(new dev.sixseven.l.b.e(var10, var11, var12), var0 -> new ArrayList<>()).add(var8);
         }

         HashMap var22 = new HashMap();

         for (int var23 = 0; var23 < var20; var23++) {
            var22.computeIfAbsent(a(var21, var23), var0 -> new ArrayList<>()).add((class_2338)var1.get(var23));
         }

         ArrayList var24 = new ArrayList();

         for (List var26 : var22.values()) {
            HashSet var27 = new HashSet();
            double var28 = 0.0;
            double var29 = 0.0;

            for (class_2338 var32 : var26) {
               var27.add(class_1923.method_8331(var32.method_10263() >> 4, var32.method_10260() >> 4));
               var28 += (double)var32.method_10263() + 0.5;
               var29 += (double)var32.method_10260() + 0.5;
            }

            double var31 = dev.sixseven.l.b.f.a.g * (double)Math.min(var26.size(), dev.sixseven.l.b.f.a.h);
            var24.add(new dev.sixseven.l.b.d(List.copyOf(var26), Set.copyOf(var27), var31, var28 / (double)var26.size(), var29 / (double)var26.size()));
         }

         return var24;
      }
   }

   private static void a(int[] var0, int var1, int var2) {
      int var3 = a(var0, var1);
      int var4 = a(var0, var2);
      if (var3 != var4) {
         var0[var3] = var4;
      }
   }

   private static int a(int[] var0, int var1) {
      while (var0[var1] != var1) {
         var0[var1] = var0[var0[var1]];
         var1 = var0[var1];
      }

      return var1;
   }

   private List<dev.sixseven.l.b.g> a(List<dev.sixseven.l.b.b> var1, Map<Long, dev.sixseven.l.b.c> var2) {
      int var3 = Math.max(1, this.e.o.e());
      HashMap var4 = new HashMap();

      for (dev.sixseven.l.b.b var6 : var1) {
         var4.put(var6.a(), var6);
      }

      ArrayList var17 = new ArrayList();
      HashSet var18 = new HashSet();

      for (dev.sixseven.l.b.b var8 : var1) {
         if (var18.add(var8.a())) {
            ArrayList var9 = new ArrayList();
            ArrayDeque var10 = new ArrayDeque<>(List.of(var8));

            while (!var10.isEmpty()) {
               dev.sixseven.l.b.b var11 = (dev.sixseven.l.b.b)var10.poll();
               var9.add(var11);
               int var12 = class_1923.method_8325(var11.a());
               int var13 = class_1923.method_8332(var11.a());

               for (int var14 = -var3; var14 <= var3; var14++) {
                  for (int var15 = -var3; var15 <= var3; var15++) {
                     dev.sixseven.l.b.b var16;
                     if ((var14 != 0 || var15 != 0)
                        && (var16 = (dev.sixseven.l.b.b)var4.get(class_1923.method_8331(var12 + var14, var13 + var15))) != null
                        && var18.add(var16.a())) {
                        var10.add(var16);
                     }
                  }
               }
            }

            var17.add(this.b(var9, var2));
         }
      }

      var17.sort(Comparator.comparingDouble(dev.sixseven.l.b.g::d).reversed());
      return var17;
   }

   private dev.sixseven.l.b.g b(List<dev.sixseven.l.b.b> var1, Map<Long, dev.sixseven.l.b.c> var2) {
      HashSet var3 = new HashSet();
      double var4 = 0.0;
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 0.0;
      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = 0.0;

      for (dev.sixseven.l.b.b var19 : var1) {
         var3.add(var19.a());
         var4 += var19.b();
         var6 = Math.max(var6, var19.b());
         dev.sixseven.l.b.c var20 = (dev.sixseven.l.b.c)var2.get(var19.a());
         if (var20 != null && var20.c > 0.0) {
            var8 += var20.c;
            var10 += var20.d;
            var12 += var20.e;
         }

         var14 += (double)(class_1923.method_8325(var19.a()) * 16 + 8) * var19.b();
         var16 += (double)(class_1923.method_8332(var19.a()) * 16 + 8) * var19.b();
      }

      double var22 = var8 > 0.0 ? var10 / var8 : var14 / var4;
      double var23 = var8 > 0.0 ? var12 / var8 : var16 / var4;
      return new dev.sixseven.l.b.g(Set.copyOf(var3), var22, var23, var4, var6);
   }

   private void e(class_310 var1) {
      for (dev.sixseven.l.b.g var3 : this.l) {
         boolean var4 = true;

         for (long var6 : var3.a()) {
            if (this.j.contains(var6)) {
               var4 = false;
               break;
            }
         }

         if (!var4) {
            this.j.addAll(var3.a());
         } else {
            this.j.addAll(var3.a());
            if (!this.e.r.a("Off")) {
               int var9 = (int)Math.round(var3.b());
               int var10 = (int)Math.round(var3.c());
               int var7 = (int)Math.hypot((double)var9 - var1.field_1724.method_23317(), (double)var10 - var1.field_1724.method_23321());
               String var8 = "Sus zone · " + var7 + "m · " + var9 + ", " + var10;
               if (this.e.r.a("Toast") && SixSevenClient.notifications() != null) {
                  SixSevenClient.notifications().a(var8);
                  dev.sixseven.n.h.c(true);
               } else if (this.e.r.a("Chat")) {
                  var1.field_1724.method_7353(class_2561.method_43470("§d[67] §f" + var8), false);
               }
            }
         }
      }
   }

   public static final class a {
      public final long a;
      public final EnumMap<dev.sixseven.l.b.f, Integer> b = new EnumMap<>(dev.sixseven.l.b.f.class);
      public final List<class_2338> c = new ArrayList<>();
      public double d;
      double e;
      double f;
      double g;

      a(long var1) {
         this.a = var1;
      }

      void a(dev.sixseven.l.b.f var1, class_2338 var2) {
         this.b.merge(var1, Integer.valueOf(1), Integer::sum);
         this.e = this.e + var1.g;
         this.f = this.f + ((double)var2.method_10263() + 0.5) * var1.g;
         this.g = this.g + ((double)var2.method_10260() + 0.5) * var1.g;
      }

      void a() {
         double var1 = 0.0;

         for (Entry var4 : this.b.entrySet()) {
            var1 += ((dev.sixseven.l.b.f)var4.getKey()).g * (double)Math.min((Integer)var4.getValue(), ((dev.sixseven.l.b.f)var4.getKey()).h);
         }

         this.d = var1;
      }
   }

   public static record b(long a, double b) {
   }

   private static final class c {
      final long a;
      double b;
      double c;
      double d;
      double e;

      c(long var1) {
         this.a = var1;
      }
   }

   public static record d(List<class_2338> a, Set<Long> b, double c, double d, double e) {
   }

   private static record e(int a, int b, int c) {
   }

   public static enum f {
      a(6.0, 16),
      b(2.0, 6),
      c(2.0, 6),
      d(2.0, 5),
      e(2.0, 6),
      f(2.0, 5);

      public final double g;
      public final int h;

      public static dev.sixseven.l.b.f[] a() {
         return (dev.sixseven.l.b.f[])i.clone();
      }

      public static dev.sixseven.l.b.f a(String param0) {
         return Enum.valueOf(dev.sixseven.l.b.f.class, var0);
      }

      private f(double nullxx, int nullxxx) {
         this.g = nullxx;
         this.h = nullxxx;
      }
   }

   public static record g(Set<Long> a, double b, double c, double d, double e) {
   }
}
