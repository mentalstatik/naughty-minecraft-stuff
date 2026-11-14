package dev.sixseven.d.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_1263;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_465;

public final class ao {
   private static ao.a a;
   private static ao.f b;

   private ao() {
   }

   public static boolean a(class_465<?> var0) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var0 != null) {
         class_1661 var2 = var1.field_1724.method_31548();
         class_1703 var3 = var0.method_17577();

         for (class_1735 var5 : var3.field_7761) {
            if (var5.field_7871 instanceof class_1263 && var5.field_7871 != var2) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static void b(class_465<?> var0) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && a(var0)) {
         if (b != null || a != null && a.a == var0.method_17577().field_7763) {
            var1.field_1724
               .method_7353(
                  class_2561.method_43470(
                     b != null
                        ? "Undo is still running"
                        : (a.i ? "Use Undo or close this container before starting another Store action" : "The current Store action is still running")
                  ),
                  true
               );
         } else {
            class_1703 var2 = var0.method_17577();
            if (!var2.method_34255().method_7960()) {
               var1.field_1724.method_7353(class_2561.method_43470("Empty the cursor before storing items"), true);
            } else {
               a = new ao.a(var2, var1.field_1724.method_31548());
               var1.field_1724.method_7353(class_2561.method_43470("Moving inventory items into storage…"), true);
            }
         }
      }
   }

   public static boolean c(class_465<?> var0) {
      class_310 var1 = class_310.method_1551();
      ao.a var2 = a;
      if (var1.field_1724 != null && var1.field_1761 != null && var2 != null && var2.i && a(var0)) {
         class_1703 var3 = var0.method_17577();
         class_1661 var4 = var1.field_1724.method_31548();
         if (var3.field_7763 == var2.a && var3.method_34255().method_7960() && var2.b(var3, var4)) {
            List var5 = var2.c();
            if (var5 != null && !var5.isEmpty()) {
               b = new ao.f(var5);
               var1.field_1724.method_7353(class_2561.method_43470("Returning the items from the last Store action…"), true);
               return true;
            } else {
               var1.field_1724.method_7353(class_2561.method_43470("Undo unavailable: transfer could not be matched safely"), true);
               a = null;
               return true;
            }
         } else {
            var1.field_1724.method_7353(class_2561.method_43470("Undo expired: inventory or storage contents changed"), true);
            a = null;
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean a(class_1703 var0) {
      return b != null || a != null && a.a == var0.field_7763;
   }

   public static String a() {
      if (b != null) {
         return "Return";
      } else {
         return a != null && !a.i ? "Wait" : "Store";
      }
   }

   public static boolean b() {
      return b == null && a != null && a.i;
   }

   public static boolean c() {
      return b != null || a != null && !a.i;
   }

   public static void d() {
      if (b != null) {
         e();
      } else {
         ao.a var0 = a;
         if (var0 != null) {
            class_310 var1 = class_310.method_1551();
            if (var1.field_1724 == null || var1.field_1761 == null || !(var1.field_1755 instanceof class_465 var2) || var2.method_17577().field_7763 != var0.a) {
               a = null;
            } else if (!var0.i) {
               if (var0.h > 0) {
                  if (--var0.h == 0) {
                     var0.a(var2.method_17577(), var1.field_1724.method_31548());
                     var0.i = true;
                     var1.field_1724.method_7353(class_2561.method_43470("Store complete. Use Undo to return those items"), true);
                  }
               } else if (var0.g < 36) {
                  int var5 = var0.g++;
                  class_1735 var4 = var0.a(var2.method_17577(), var5);
                  if (var4 != null && var4.method_7681()) {
                     var1.field_1761.method_2906(var0.a, var4.field_7874, 0, class_1713.field_7794, var1.field_1724);
                  }
               } else {
                  var0.h = 4;
               }
            }
         }
      }
   }

   private static class_1799 a(class_1799 var0) {
      return var0.method_7972();
   }

   private static boolean a(class_1799 var0, class_1799 var1) {
      return var0.method_7947() == var1.method_7947() && class_1799.method_7973(var0, var1);
   }

   private static void e() {
      class_310 var0 = class_310.method_1551();
      ao.a var1 = a;
      ao.f var2 = b;
      if (var0.field_1724 != null
         && var0.field_1761 != null
         && var1 != null
         && var0.field_1755 instanceof class_465 var3
         && var3.method_17577().field_7763 == var1.a) {
         class_1703 var10 = var3.method_17577();
         int var5 = 48;

         while (var5 >= 2 && var2.b < var2.a.size()) {
            ao.e var6 = var2.a.get(var2.b);
            if (var2.c >= var6.b.size()) {
               var2.b++;
            } else {
               class_1735 var7 = var10.method_7611(var6.a);
               if (var7 == null || !var7.method_7681() || var7.method_7677().method_7947() != var6.d || !class_1799.method_7973(var7.method_7677(), var6.c)) {
                  b = null;
                  a = null;
                  var0.field_1724.method_7353(class_2561.method_43470("Undo stopped: storage changed during return"), true);
                  return;
               }

               var0.field_1761.method_2906(var10.field_7763, var6.a, 0, class_1713.field_7790, var0.field_1724);
               var5--;

               while (var5 > 1 && var2.c < var6.b.size()) {
                  ao.c var8 = var6.b.get(var2.c);
                  class_1735 var9 = var1.a(var10, var8.a);
                  if (var9 == null) {
                     var0.field_1761.method_2906(var10.field_7763, var6.a, 0, class_1713.field_7790, var0.field_1724);
                     b = null;
                     a = null;
                     var0.field_1724.method_7353(class_2561.method_43470("Undo stopped: player inventory slot is unavailable"), true);
                     return;
                  }

                  var0.field_1761.method_2906(var10.field_7763, var9.field_7874, 1, class_1713.field_7790, var0.field_1724);
                  var8.b--;
                  var6.d--;
                  var5--;
                  if (var8.b == 0) {
                     var2.c++;
                  }
               }

               var0.field_1761.method_2906(var10.field_7763, var6.a, 0, class_1713.field_7790, var0.field_1724);
               var5--;
               if (var2.c < var6.b.size()) {
                  break;
               }

               var2.b++;
            }
         }

         if (var2.b >= var2.a.size()) {
            b = null;
            a = null;
            var0.field_1724.method_7353(class_2561.method_43470("Returned the items from the last Store action"), true);
         }

         return;
      } else {
         b = null;
         a = null;
      }
   }

   private static final class a {
      final int a;
      final int[] b;
      final class_1799[] c;
      final class_1799[] d = new class_1799[36];
      class_1799[] e;
      class_1799[] f;
      int g;
      int h;
      boolean i;

      a(class_1703 var1, class_1661 var2) {
         this.a = var1.field_7763;
         ArrayList var3 = new ArrayList();

         for (int var4 = 0; var4 < var1.field_7761.size(); var4++) {
            class_1735 var5 = (class_1735)var1.field_7761.get(var4);
            if (var5.field_7871 instanceof class_1263 && var5.field_7871 != var2) {
               var3.add(var4);
            }
         }

         this.b = var3.stream().mapToInt(Integer::intValue).toArray();
         this.c = new class_1799[this.b.length];

         for (int var6 = 0; var6 < this.b.length; var6++) {
            this.c[var6] = ao.a(var1.method_7611(this.b[var6]).method_7677());
         }

         for (int var7 = 0; var7 < this.d.length; var7++) {
            this.d[var7] = ao.a(var2.method_5438(var7));
         }
      }

      void a(class_1703 var1, class_1661 var2) {
         this.e = new class_1799[this.b.length];

         for (int var3 = 0; var3 < this.b.length; var3++) {
            this.e[var3] = ao.a(var1.method_7611(this.b[var3]).method_7677());
         }

         this.f = new class_1799[this.d.length];

         for (int var4 = 0; var4 < this.f.length; var4++) {
            this.f[var4] = ao.a(var2.method_5438(var4));
         }
      }

      class_1735 a(class_1703 var1, int var2) {
         for (class_1735 var4 : var1.field_7761) {
            if (var4.field_7872 == var2 && var4.field_7871 instanceof class_1661) {
               return var4;
            }
         }

         return null;
      }

      boolean b(class_1703 var1, class_1661 var2) {
         if (this.e != null && this.f != null && var1.field_7761.size() > Arrays.stream(this.b).max().orElse(-1)) {
            for (int var3 = 0; var3 < this.b.length; var3++) {
               if (!ao.a(var1.method_7611(this.b[var3]).method_7677(), this.e[var3])) {
                  return false;
               }
            }

            for (int var4 = 0; var4 < this.f.length; var4++) {
               if (!ao.a(var2.method_5438(var4), this.f[var4])) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }

      List<ao.b> a() {
         ArrayList var1 = new ArrayList();

         for (int var2 = 0; var2 < this.d.length; var2++) {
            class_1799 var3 = this.d[var2];
            class_1799 var4 = this.f[var2];
            if (!var3.method_7960()) {
               int var5 = var4.method_7960() ? var3.method_7947() : (class_1799.method_7973(var3, var4) ? var3.method_7947() - var4.method_7947() : 0);
               if (var5 > 0) {
                  var1.add(new ao.b(var2, ao.a(var3), var5));
               }
            }
         }

         return var1;
      }

      List<ao.d> b() {
         ArrayList var1 = new ArrayList();

         for (int var2 = 0; var2 < this.b.length; var2++) {
            class_1799 var3 = this.c[var2];
            class_1799 var4 = this.e[var2];
            if (!var4.method_7960()) {
               int var5 = var3.method_7960()
                  ? var4.method_7947()
                  : (class_1799.method_7973(var3, var4) ? var4.method_7947() - var3.method_7947() : var4.method_7947());
               if (var5 > 0) {
                  var1.add(new ao.d(this.b[var2], ao.a(var4), var5));
               }
            }
         }

         return var1;
      }

      List<ao.e> c() {
         List var1 = this.a();
         List var2 = this.b();
         ArrayList var3 = new ArrayList();

         for (ao.d var5 : var2) {
            int var6 = var5.c;
            ArrayList var7 = new ArrayList();

            for (ao.b var9 : var1) {
               if (var6 > 0 && var9.c > 0 && class_1799.method_7973(var5.b, var9.b)) {
                  int var10 = Math.min(var6, var9.c);
                  var7.add(new ao.c(var9.a, var10));
                  var9.c -= var10;
                  var6 -= var10;
               }
            }

            if (var6 != 0) {
               return null;
            }

            if (!var7.isEmpty()) {
               var3.add(new ao.e(var5.a, ao.a(var5.b), var7));
            }
         }

         for (ao.b var12 : var1) {
            if (var12.c != 0) {
               return null;
            }
         }

         return var3;
      }
   }

   private static final class b {
      final int a;
      final class_1799 b;
      int c;

      b(int var1, class_1799 var2, int var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }
   }

   private static final class c {
      final int a;
      int b;

      c(int var1, int var2) {
         this.a = var1;
         this.b = var2;
      }
   }

   private static final class d {
      final int a;
      final class_1799 b;
      final int c;

      d(int var1, class_1799 var2, int var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }
   }

   private static final class e {
      final int a;
      final class_1799 c;
      final List<ao.c> b;
      int d;

      e(int var1, class_1799 var2, List<ao.c> var3) {
         this.a = var1;
         this.c = var2;
         this.b = var3;
         this.d = var2.method_7947();
      }
   }

   private static final class f {
      final List<ao.e> a;
      int b;
      int c;

      f(List<ao.e> var1) {
         this.a = var1;
      }
   }
}
