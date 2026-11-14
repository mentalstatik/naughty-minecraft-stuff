package dev.sixseven.g;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class o<H> {
   private final int a;
   private final int b;
   private final int c;
   private volatile List<H> d = List.of();
   private volatile List<H> e = List.of();
   private final LongOpenHashSet f = new LongOpenHashSet();
   private List<H> g = new ArrayList<>();
   private int h;
   private int[] i = new int[0];
   private int j = -1;
   private int k = Integer.MIN_VALUE;
   private int l = Integer.MIN_VALUE;
   private int m;
   private boolean n;
   private boolean o;
   private class_638 p;

   public o(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public List<H> a() {
      return this.d;
   }

   public List<H> b() {
      return this.e;
   }

   public void c() {
      this.n = true;
      this.d = List.of();
      this.e = List.of();
      this.f.clear();
      this.o = false;
   }

   public void d() {
      this.d = List.of();
      this.e = List.of();
      this.g = new ArrayList<>();
      this.h = 0;
      this.m = 0;
      this.n = false;
      this.o = false;
      this.f.clear();
      this.p = null;
      this.l = Integer.MIN_VALUE;
      this.k = Integer.MIN_VALUE;
   }

   public void a(Predicate<? super H> var1) {
      List var2 = this.d;
      List var3 = a(var2, var1);
      this.d = var3;
      List var4 = this.e;
      this.e = var4 == var2 ? var3 : a(var4, var1);
      this.g.removeIf(var1);
   }

   private static <T> List<T> a(List<T> var0, Predicate<? super T> var1) {
      ArrayList var2 = null;

      for (int var3 = 0; var3 < var0.size(); var3++) {
         Object var4 = var0.get(var3);
         if (var1.test(var4)) {
            if (var2 == null) {
               var2 = new ArrayList(var0.size());
               var2.addAll(var0.subList(0, var3));
            }
         } else if (var2 != null) {
            var2.add(var4);
         }
      }

      return var2 == null ? var0 : List.copyOf(var2);
   }

   public void a(int var1, o.a<H> var2, ToLongFunction<H> var3, Predicate<H> var4) {
      class_310 var5 = class_310.method_1551();
      class_638 var6 = var5.field_1687;
      class_746 var7 = var5.field_1724;
      if (var6 != null && var7 != null) {
         if (this.p != var6) {
            this.d();
            this.p = var6;
            this.n = true;
         }

         if (this.j != var1) {
            this.a(var1);
            this.n = true;
         }

         int var8 = var7.method_31476().field_9181;
         int var9 = var7.method_31476().field_9180;
         boolean var10 = this.k != Integer.MIN_VALUE && (var8 != this.k || var9 != this.l);
         if (var10) {
            if (this.h == 0) {
               this.n = true;
               this.m = 0;
            } else {
               this.o = true;
            }
         }

         if (this.h == 0) {
            if (!this.n && this.m > 0) {
               this.m--;
               return;
            }

            this.k = var8;
            this.l = var9;
            this.g = new ArrayList<>();
            this.f.clear();
            this.n = false;
            this.o = false;
         } else if (this.n) {
            this.k = var8;
            this.l = var9;
            this.h = 0;
            this.g = new ArrayList<>();
            this.f.clear();
            this.n = false;
            this.o = false;
         }

         int var11 = this.i.length;
         int var12 = 0;

         for (int var13 = 0; this.h < var11 && var12 < this.a && var13 < this.b; var12++) {
            int var14 = this.i[this.h];
            short var15 = (short)(var14 >> 16);
            short var16 = (short)(var14 & 65535);
            int var17 = this.k + var15;
            int var18 = this.l + var16;
            class_2818 var19 = var6.method_2935().method_12126(var17, var18, false);
            if (var19 != null) {
               var13 += var2.scan(var19, this.g);
            }

            this.f.add(a(var17, var18));
            this.h++;
         }

         if (this.h >= var11) {
            this.d = List.copyOf(this.g);
            this.e = this.d;
            this.g = new ArrayList<>();
            this.h = 0;
            this.m = this.o ? 0 : this.c;
            this.n = this.o;
            this.o = false;
            this.f.clear();
         } else {
            ArrayList var20 = new ArrayList(this.d.size() + this.g.size());

            for (Object var23 : this.d) {
               if (!this.f.contains(var3.applyAsLong(var23)) && var4.test(var23)) {
                  var20.add(var23);
               }
            }

            for (Object var24 : this.g) {
               if (var4.test(var24)) {
                  var20.add(var24);
               }
            }

            this.e = var20;
         }
      } else {
         this.d();
      }
   }

   public static long a(int var0, int var1) {
      return (long)var0 << 32 | (long)var1 & 4294967295L;
   }

   public static long a(int var0, int var1, int var2) {
      return ((long)var0 & 67108863L) << 38 | ((long)var2 & 67108863L) << 12 | (long)var1 & 4095L;
   }

   private void a(int var1) {
      if (this.j != var1) {
         int var2 = 2 * var1 + 1;
         Integer[] var3 = new Integer[var2 * var2];
         int var4 = 0;

         for (int var5 = -var1; var5 <= var1; var5++) {
            for (int var6 = -var1; var6 <= var1; var6++) {
               var3[var4++] = (var5 & 65535) << 16 | var6 & 65535;
            }
         }

         Arrays.sort(var3, (var0, var1x) -> {
            short var2x = (short)(var0 >> 16);
            short var3x = (short)(var0 & 65535);
            short var4x = (short)(var1x >> 16);
            short var5x = (short)(var1x & 65535);
            return Integer.compare(var2x * var2x + var3x * var3x, var4x * var4x + var5x * var5x);
         });
         int[] var7 = new int[var3.length];

         for (int var8 = 0; var8 < var3.length; var8++) {
            var7[var8] = var3[var8];
         }

         this.i = var7;
         this.j = var1;
      }
   }

   public interface a<H> {
      int scan(class_2818 var1, List<H> var2);
   }
}
