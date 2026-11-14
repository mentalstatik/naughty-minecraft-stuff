package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;

public final class r extends dev.sixseven.d.c {
   private static final int c = 200;
   private static final int d = 200;
   private static final int e = 10;
   private static final int f = 8;
   private static final int g = 20;
   private static final int h = 80;
   private static final int i = 3;
   private static final int j = 16;
   private static final int k = 2;
   public final dev.sixseven.i.c a = this.a(new dev.sixseven.i.c("Color", "Chunk highlight fill, border and flag color", -11943937));
   public final dev.sixseven.i.h b = this.a(
      new dev.sixseven.i.h("Merge Radius", "Hives within this many chunks of each other merge to one middle flag", 4.0, 1.0, 8.0, 1.0, " ch")
   );
   private final Set<Long> l = new HashSet<>();
   private final Set<Long> m = new HashSet<>();
   private final Map<Long, Integer> n = new HashMap<>();
   private final Map<Long, Integer> o = new HashMap<>();
   private volatile Set<Long> p = Set.of();
   private int[][] q = new int[0][2];
   private int r;
   private int s;
   private boolean t;
   private int u;
   private int v = Integer.MIN_VALUE;
   private int w = Integer.MIN_VALUE;
   private int x = Integer.MIN_VALUE;
   private int y = Integer.MIN_VALUE;
   private int z = Integer.MIN_VALUE;

   public r() {
      super("Chunk Finder", "Highlights Donut SMP chunks that match a rare world signal worth checking.", dev.sixseven.d.b.d);
   }

   @Override
   protected void h() {
      this.l();
   }

   @Override
   protected void i() {
      this.l();
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1687 != null && var1.field_1724 != null) {
         this.s++;
         int var2 = (Integer)var1.field_1690.method_42503().method_41753();
         class_1923 var3 = var1.field_1724.method_31476();
         boolean var4 = var2 != this.x;
         boolean var5 = var3.field_9181 != this.v || var3.field_9180 != this.w;
         if (var4 || var5) {
            this.v = var3.field_9181;
            this.w = var3.field_9180;
            this.x = var2;
            if (var4) {
               this.r = 0;
               this.b(var2);
            }
         }

         boolean var6 = var4 || this.y == Integer.MIN_VALUE || Math.max(Math.abs(var3.field_9181 - this.y), Math.abs(var3.field_9180 - this.z)) >= 2;
         if (var6) {
            this.y = var3.field_9181;
            this.z = var3.field_9180;
            if (this.l.removeIf(var2x -> a(var2x, var3, var2))) {
               this.t = true;
            }

            this.n.keySet().removeIf(var2x -> a(var2x, var3, var2));
            this.o.keySet().removeIf(var2x -> a(var2x, var3, var2));
            this.m.removeIf(var2x -> a(var2x, var3, var2));
         }

         int var7 = this.q.length;
         if (var7 > 0) {
            boolean var8 = a(var1);
            int var9 = var8 ? 20 : 200;
            int var10 = var8 ? 80 : 200;
            int var11 = var8 ? 16 : 8;

            for (int var12 = 0; var12 < var11; var12++) {
               int var13 = this.r % var7;
               this.r = (this.r + 1) % var7;
               int var14 = var3.field_9181 + this.q[var13][0];
               int var15 = var3.field_9180 + this.q[var13][1];
               class_2818 var16 = var1.field_1687.method_2935().method_12126(var14, var15, false);
               if (var16 != null && !var16.method_12223()) {
                  long var17 = class_1923.method_8331(var14, var15);
                  this.n.putIfAbsent(var17, this.s);
                  if (this.s - this.n.get(var17) >= var9 && this.s >= this.o.getOrDefault(var17, Integer.MIN_VALUE)) {
                     this.o.put(var17, this.s + var10);
                     if (a(var16)) {
                        if (this.l.add(var17)) {
                           this.t = true;
                        }

                        if (this.m.add(var17)) {
                           this.a(new class_1923(var14, var15));
                        }
                     } else if (this.l.remove(var17)) {
                        this.t = true;
                     }
                  }
               }
            }

            if (this.t || this.b.e() != this.u) {
               this.m();
            }
         }
      }
   }

   private void m() {
      this.t = false;
      this.u = this.b.e();
      HashSet var1 = new HashSet<>(this.l);
      if (var1.size() < 2) {
         this.p = Set.copyOf(var1);
      } else {
         int var2 = Math.max(1, this.u);
         HashSet var3 = new HashSet();
         HashSet var4 = new HashSet();

         for (long var6 : var1) {
            if (var4.add(var6)) {
               ArrayList var8 = new ArrayList();
               ArrayDeque var9 = new ArrayDeque();
               var9.add(var6);

               while (!var9.isEmpty()) {
                  long var10 = (Long)var9.poll();
                  var8.add(var10);
                  int var12 = class_1923.method_8325(var10);
                  int var13 = class_1923.method_8332(var10);

                  for (int var14 = -var2; var14 <= var2; var14++) {
                     for (int var15 = -var2; var15 <= var2; var15++) {
                        long var16;
                        if ((var14 != 0 || var15 != 0) && var1.contains(var16 = class_1923.method_8331(var12 + var14, var13 + var15)) && var4.add(var16)) {
                           var9.add(var16);
                        }
                     }
                  }
               }

               var3.add(var8.size() == 1 ? (Long)var8.get(0) : a(var8));
            }
         }

         this.p = Set.copyOf(var3);
      }
   }

   private static long a(List<Long> var0) {
      long var1 = 0L;
      long var3 = 0L;

      for (long var6 : var0) {
         var1 += (long)class_1923.method_8325(var6);
         var3 += (long)class_1923.method_8332(var6);
      }

      int var8 = (int)Math.round((double)var1 / (double)var0.size());
      int var9 = (int)Math.round((double)var3 / (double)var0.size());
      return class_1923.method_8331(var8, var9);
   }

   private void b(int var1) {
      ArrayList var2 = new ArrayList((var1 * 2 + 1) * (var1 * 2 + 1));

      for (int var3 = -var1; var3 <= var1; var3++) {
         for (int var4 = -var1; var4 <= var1; var4++) {
            var2.add(new r.a(var3, var4));
         }
      }

      var2.sort(Comparator.comparingInt(var0 -> var0.a * var0.a + var0.b * var0.b));
      this.q = new int[var2.size()][2];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         r.a var6 = (r.a)var2.get(var5);
         this.q[var5][0] = var6.a;
         this.q[var5][1] = var6.b;
      }
   }

   private static boolean a(class_2818 var0) {
      for (class_2826 var4 : var0.method_12006()) {
         if (var4 != null && !var4.method_38292() && var4.method_12265().method_19526(r::a)) {
            for (int var5 = 0; var5 < 16; var5++) {
               for (int var6 = 0; var6 < 16; var6++) {
                  for (int var7 = 0; var7 < 16; var7++) {
                     if (a(var4.method_12254(var7, var5, var6))) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private static boolean a(class_2680 var0) {
      return (var0.method_27852(class_2246.field_20422) || var0.method_27852(class_2246.field_20421))
         && var0.method_28498(class_2741.field_20432)
         && (Integer)var0.method_11654(class_2741.field_20432) == 5;
   }

   private static boolean a(long var0, class_1923 var2, int var3) {
      return Math.abs(class_1923.method_8325(var0) - var2.field_9181) > var3 || Math.abs(class_1923.method_8332(var0) - var2.field_9180) > var3;
   }

   private static boolean a(class_310 var0) {
      double var1 = var0.field_1724.method_18798().field_1352;
      double var3 = var0.field_1724.method_18798().field_1350;
      return var1 * var1 + var3 * var3 >= 0.16;
   }

   private void a(class_1923 var1) {
      if (SixSevenClient.notifications() != null) {
         dev.sixseven.f.a var2 = SixSevenClient.notifications();
         int var3 = var1.method_33940();
         var2.a("Chunk Finder · X " + var3 + " Z " + var1.method_33942());
      }
   }

   public Set<Long> k() {
      return this.p;
   }

   public void a(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      Integer var5 = this.n.get(var3);
      class_310 var6 = class_310.method_1551();
      boolean var7 = var6.field_1724 != null && a(var6);
      int var8 = var7 ? 20 : 200;
      if (var5 != null && this.s - var5 >= var8) {
         int var9 = var7 ? 3 : 10;
         int var10 = this.s + var9;
         this.o.merge(var3, var10, Math::min);
      }
   }

   public void l() {
      this.l.clear();
      this.m.clear();
      this.n.clear();
      this.o.clear();
      this.p = Set.of();
      this.r = 0;
      this.s = 0;
      this.t = false;
      this.u = this.b.e();
      this.v = Integer.MIN_VALUE;
      this.w = Integer.MIN_VALUE;
      this.x = Integer.MIN_VALUE;
      this.y = Integer.MIN_VALUE;
      this.z = Integer.MIN_VALUE;
      this.q = new int[0][2];
   }

   private static record a(int a, int b) {
   }
}
