package dev.sixseven.l;

import dev.sixseven.SixSevenClient;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.LongConsumer;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_4076;
import net.minecraft.class_638;
import net.minecraft.class_6606;

public final class a {
   private static final int a = 2048;
   private static final boolean b = Boolean.getBoolean("sixseven.sus.debug");
   private static final dev.sixseven.l.a c = new dev.sixseven.l.a();
   private final ConcurrentHashMap<Long, byte[]> d = new ConcurrentHashMap<>();
   private final ConcurrentHashMap<Long, short[]> e = new ConcurrentHashMap<>();
   private final ConcurrentHashMap<Long, Set<Long>> f = new ConcurrentHashMap<>();
   private final Set<Long> g = ConcurrentHashMap.newKeySet();
   private final List<LongConsumer> h = new CopyOnWriteArrayList<>();
   private final Object i = new Object();
   private final ArrayDeque<Long> j = new ArrayDeque<>();
   private final Set<Long> k = new HashSet<>();

   private a() {
   }

   public static dev.sixseven.l.a a() {
      return c;
   }

   public void b() {
      this.d.clear();
      this.e.clear();
      this.f.clear();
      this.g.clear();
      synchronized (this.i) {
         this.j.clear();
         this.k.clear();
      }
   }

   public boolean a(int var1, int var2) {
      return this.g.remove(class_1923.method_8331(var1, var2));
   }

   public void a(LongConsumer var1) {
      this.h.add(var1);
   }

   public void b(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      this.g.add(var3);
      this.a(var3);
   }

   private void a(long var1) {
      for (LongConsumer var4 : this.h) {
         var4.accept(var1);
      }
   }

   public void a(int var1, int var2, class_6606 var3, class_1937 var4) {
      if (var4 != null) {
         int var5 = var4.method_32891() - 1;
         BitSet var6 = var3.method_38608();
         BitSet var7 = var3.method_38609();
         List var8 = var3.method_38610();
         int var9 = 0;
         boolean var10 = false;

         for (int var11 = var6.nextSetBit(0); var11 >= 0; var11 = var6.nextSetBit(var11 + 1)) {
            byte[] var12 = var9 < var8.size() ? (byte[])var8.get(var9) : null;
            var9++;
            int var13 = var5 + var11;
            if (var12 != null && var12.length == 2048) {
               long var14 = class_4076.method_18685(var1, var13, var2);
               long var16 = class_1923.method_8331(var1, var2);
               this.d.put(var14, (byte[])var12.clone());
               this.f.computeIfAbsent(var16, var0 -> ConcurrentHashMap.newKeySet()).add(var14);
               this.b(var16);
               int var18 = this.a(var14, var12);
               if (b && var18 > 0) {
                  SixSevenClient.LOGGER.info("[sus-light] section ({},{},{}): {} light-5 positions", new Object[]{var1, var13, var2, var18});
               }

               var10 = true;
            }
         }

         for (int var19 = var7.nextSetBit(0); var19 >= 0; var19 = var7.nextSetBit(var19 + 1)) {
            int var20 = var5 + var19;
            long var22 = class_4076.method_18685(var1, var20, var2);
            this.e.remove(var22);
            if (this.d.remove(var22) != null) {
               var10 = true;
            }

            this.f.computeIfPresent(class_1923.method_8331(var1, var2), (var2x, var3x) -> {
               var3x.remove(var22);
               return var3x.isEmpty() ? null : var3x;
            });
         }

         if (var10) {
            this.b(var1, var2);
         }

         long var21 = class_1923.method_8331(var1, var2);
         if (!this.f.containsKey(var21)) {
            this.c(var21);
         }
      }
   }

   public int a(int var1, int var2, int var3) {
      byte[] var4 = this.d.get(class_4076.method_18685(class_4076.method_18675(var1), class_4076.method_18675(var2), class_4076.method_18675(var3)));
      if (var4 == null) {
         return -1;
      } else {
         int var5 = (var2 & 15) << 8 | (var3 & 15) << 4 | var1 & 15;
         int var6 = var4[var5 >> 1] & 255;
         return (var5 & 1) == 0 ? var6 & 15 : var6 >> 4 & 15;
      }
   }

   public boolean b(int var1, int var2, int var3) {
      return this.a(var1, var2, var3) == 5;
   }

   private int a(long var1, byte[] var3) {
      short[] var4 = null;
      int var5 = 0;

      for (int var6 = 0; var6 < 4096; var6++) {
         int var8 = var3[var6 >> 1] & 255;
         int var7 = (var6 & 1) == 0 ? var8 & 15 : var8 >> 4 & 15;
         if (var7 == 5) {
            if (var4 == null) {
               var4 = new short[16];
            } else if (var5 == var4.length) {
               var4 = Arrays.copyOf(var4, var4.length * 2);
            }

            var4[var5++] = (short)var6;
         }
      }

      if (var5 == 0) {
         this.e.remove(var1);
      } else {
         this.e.put(var1, Arrays.copyOf(var4, var5));
      }

      return var5;
   }

   public List<class_2338> c(int var1, int var2) {
      ArrayList var3 = new ArrayList();
      this.a(var1, var2, (var1x, var2x, var3x) -> var3.add(new class_2338(var1x, var2x, var3x)));
      return (List<class_2338>)(var3.isEmpty() ? List.of() : var3);
   }

   public void a(int var1, int var2, dev.sixseven.l.a.a var3) {
      int var4 = var1 << 4;
      int var5 = var2 << 4;
      Set var6 = this.f.get(class_1923.method_8331(var1, var2));
      if (var6 != null) {
         for (long var8 : var6) {
            short[] var10 = this.e.get(var8);
            if (var10 != null) {
               int var11 = class_4076.method_18689(var8) << 4;

               for (short var15 : var10) {
                  int var16 = var15 & '\uffff';
                  int var17 = var11 + (var16 >> 8);
                  var3.accept(var4 + (var16 & 15), var17, var5 + (var16 >> 4 & 15));
               }
            }
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = class_4076.method_18675(var1);
      int var6 = class_4076.method_18675(var3);
      long var7 = class_1923.method_8331(var5, var6);
      long var9 = class_4076.method_18685(var5, class_4076.method_18675(var2), var6);
      this.f.computeIfAbsent(var7, var0 -> ConcurrentHashMap.newKeySet()).add(var9);
      this.b(var7);
      byte[] var11 = this.d.computeIfAbsent(var9, var0 -> new byte[2048]);
      int var12 = (var2 & 15) << 8 | (var3 & 15) << 4 | var1 & 15;
      int var13 = var12 >> 1;
      int var14 = (var12 & 1) * 4;
      var11[var13] = (byte)(var11[var13] & ~(15 << var14) | (var4 & 15) << var14);
      this.a(var9, var11);
      this.b(var5, var6);
   }

   public boolean d(int var1, int var2) {
      return this.f.containsKey(class_1923.method_8331(var1, var2));
   }

   public void a(class_638 var1) {
      for (long var3 : this.f.keySet()) {
         int var5 = class_1923.method_8325(var3);
         int var6 = class_1923.method_8332(var3);
         if (var1.method_2935().method_12126(var5, var6, false) == null) {
            this.d(var3);
         }
      }

      this.g.removeIf(var1x -> !this.f.containsKey(var1x));
   }

   private void b(long var1) {
      synchronized (this.i) {
         if (this.k.add(var1)) {
            this.j.addLast(var1);

            while (this.k.size() > 2048) {
               Long var4 = this.j.pollFirst();
               if (var4 == null) {
                  break;
               }

               if (this.k.remove(var4)) {
                  this.d(var4.longValue());
                  this.a(var4.longValue());
               }
            }
         }
      }
   }

   private void c(long var1) {
      synchronized (this.i) {
         if (this.k.remove(var1)) {
            this.j.remove(var1);
         }
      }
   }

   private void d(long var1) {
      Set var3 = this.f.remove(var1);
      if (var3 != null) {
         for (long var5 : var3) {
            this.d.remove(var5);
            this.e.remove(var5);
         }
      }

      this.g.remove(var1);
      this.c(var1);
   }

   @FunctionalInterface
   public interface a {
      void accept(int var1, int var2, int var3);
   }
}
