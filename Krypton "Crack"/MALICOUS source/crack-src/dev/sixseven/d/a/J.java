package dev.sixseven.d.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.DoubleFunction;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1716;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class J extends dev.sixseven.d.c {
   private static final int d = 9;
   private static final int e = 9;
   private static final int f = 45;
   private static final int g = 0;
   private static final int h = 1;
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h(
            "Click Delay",
            "Ticks between each moved stack. 0 = instant (whole grid in one tick); raise it only if a server flags rapid container clicks.",
            0.0,
            0.0,
            10.0,
            1.0
         )
         .a((DoubleFunction<String>)(v -> (int)v <= 0 ? "Instant" : (int)v + " tick"))
   );
   public final dev.sixseven.i.b b = this.a(
      new dev.sixseven.i.b(
         "Keep Slot Stays",
         "Leave the picked slot untouched in the container (someone else refills it). Off: pull it out too and restore leaves it empty.",
         true
      )
   );
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Chat Feedback", "Print what the rigger is doing to chat.", true));
   private final class_310 i = class_310.method_1551();
   private J.a j = J.a.a;
   private int k = -1;
   private int l = -1;
   private final class_1799[] m = new class_1799[9];
   private final int[] n = new int[9];
   private final Deque<int[]> o = new ArrayDeque<>();
   private int p = 0;

   public J() {
      super(
         "GambleRigger",
         "Rig a dispenser/dropper gamble — a fake slot-panel keypad that pulls every slot but the one you keep, then restores the exact layout.",
         dev.sixseven.d.b.c
      );
   }

   public J.a k() {
      return this.j;
   }

   public int l() {
      return this.k;
   }

   public int m() {
      return this.o.size();
   }

   public boolean n() {
      return this.j == J.a.b || this.j == J.a.d;
   }

   public boolean o() {
      return this.j == J.a.a && this.u();
   }

   public boolean p() {
      return this.j == J.a.c && this.u();
   }

   public void b(int slot) {
      if (this.o() && slot >= 0 && slot < 9) {
         class_746 var2 = this.i.field_1724;
         if (var2 != null && var2.field_7512 instanceof class_1716 var4) {
            this.l = var4.field_7763;
            this.k = slot;
            this.o.clear();
            this.p = 0;
            boolean[] var5 = new boolean[45];
            int var6 = 0;

            for (int var7 = 0; var7 < 9; var7++) {
               this.m[var7] = var4.method_7611(var7).method_7677().method_7972();
               this.n[var7] = -1;
            }

            for (int var9 = 0; var9 < 9; var9++) {
               if ((!this.b.i() || var9 != this.k) && !this.m[var9].method_7960()) {
                  int var8 = this.a(var4, var5);
                  if (var8 >= 0) {
                     var5[var8] = true;
                     this.n[var9] = var8;
                     this.o.add(new int[]{0, var9, var8});
                  } else {
                     var6++;
                     this.o.add(new int[]{1, var9, 0});
                  }
               }
            }

            if (this.o.isEmpty()) {
               this.j = J.a.c;
               this.a("§dGambleRigger §7» grid empty — nothing to take, click §fRestore §7when done");
               return;
            }

            this.j = J.a.b;
            if (var6 > 0) {
               this.a("§eGambleRigger §7» your inventory is nearly full — " + var6 + " stack(s) fall back to shift-click and may not restore exactly");
            }

            return;
         }
      }
   }

   public void q() {
      if (this.p()) {
         class_746 var1 = this.i.field_1724;
         if (var1 != null && var1.field_7512 instanceof class_1716 var3 && var3.field_7763 == this.l) {
            this.o.clear();
            this.p = 0;
            boolean[] var4 = new boolean[45];
            int var5 = 0;

            for (int var6 = 0; var6 < 9; var6++) {
               if (var6 != this.k) {
                  class_1799 var7 = this.m[var6];
                  if (var7 != null && !var7.method_7960()) {
                     int var8 = this.a(var3, var7, var6, var4);
                     if (var8 < 0) {
                        var5++;
                     } else {
                        var4[var8] = true;
                        this.o.add(new int[]{0, var8, var6});
                     }
                  }
               }
            }

            this.j = J.a.d;
            if (var5 > 0) {
               this.a("§eGambleRigger §7» restoring, but §c" + var5 + " §7stack(s) were not found in your inventory");
            }

            return;
         }

         this.b(true);
      }
   }

   public void r() {
      boolean var1 = this.j != J.a.a || this.k >= 0;
      this.v();
      if (var1) {
         this.a("§7GambleRigger » reset");
      }
   }

   @Override
   public void j() {
      this.s();
   }

   private void s() {
      if (this.o.isEmpty()) {
         this.t();
      } else {
         class_746 var1 = this.i.field_1724;
         if (var1 != null && this.i.field_1761 != null && var1.field_7512 instanceof class_1716 && var1.field_7512.field_7763 == this.l) {
            boolean var2 = this.a.e() <= 0;

            while (!this.o.isEmpty()) {
               if (this.p > 0) {
                  this.p--;
                  return;
               }

               this.a(var1, this.o.poll());
               this.p = this.a.e();
               if (!var2) {
                  return;
               }
            }

            this.t();
         } else {
            this.b(true);
         }
      }
   }

   private void t() {
      if (this.o.isEmpty()) {
         if (this.j == J.a.b) {
            this.j = J.a.c;
            this.a("§aGambleRigger §7» pulled the grid (kept §f#" + (this.k + 1) + "§7) — click §fRestore §7when ready");
         } else if (this.j == J.a.d) {
            this.a("§aGambleRigger §7» layout restored — slot §f#" + (this.k + 1) + " §7left open");
            this.v();
         }
      }
   }

   private void a(class_1657 p, int[] step) {
      class_1703 var3 = px.field_7512;
      if (step[0] == 1) {
         this.a(px, step[1], 0, class_1713.field_7794);
      } else {
         this.a(px, step[1], 0, class_1713.field_7790);
         if (!var3.method_34255().method_7960()) {
            this.a(px, step[2], 0, class_1713.field_7790);
         }

         if (!var3.method_34255().method_7960()) {
            this.a(px, step[1], 0, class_1713.field_7790);
         }
      }
   }

   @Override
   protected void i() {
      this.b(false);
   }

   private boolean u() {
      class_746 var1 = this.i.field_1724;
      return var1 != null && var1.field_7512 instanceof class_1716;
   }

   private void a(class_1657 p, int slot, int button, class_1713 type) {
      this.i.field_1761.method_2906(this.l, slot, button, type, px);
   }

   private int a(class_1703 menu, boolean[] reserved) {
      for (int var3 = 9; var3 < 45; var3++) {
         if (!reserved[var3] && menu.method_7611(var3).method_7677().method_7960()) {
            return var3;
         }
      }

      return -1;
   }

   private int a(class_1703 menu, class_1799 want, int j, boolean[] used) {
      int var5 = this.n[jx];
      if (var5 >= 9 && var5 < 45 && !used[var5] && class_1799.method_7973(menu.method_7611(var5).method_7677(), want)) {
         return var5;
      } else {
         for (int var6 = 9; var6 < 45; var6++) {
            if (!used[var6] && class_1799.method_7973(menu.method_7611(var6).method_7677(), want)) {
               return var6;
            }
         }

         for (int var8 = 9; var8 < 45; var8++) {
            if (!used[var8]) {
               class_1799 var7 = menu.method_7611(var8).method_7677();
               if (!var7.method_7960() && class_1799.method_31577(var7, want)) {
                  return var8;
               }
            }
         }

         return -1;
      }
   }

   private void b(boolean warn) {
      boolean var2 = this.j != J.a.a;
      this.v();
      if (warn && var2) {
         this.a("§cGambleRigger §7» aborted (the container closed or changed)");
      }
   }

   private void v() {
      this.j = J.a.a;
      this.k = -1;
      this.l = -1;
      this.o.clear();
      this.p = 0;

      for (int var1 = 0; var1 < 9; var1++) {
         this.m[var1] = null;
         this.n[var1] = -1;
      }
   }

   private void a(String msg) {
      if (this.c.i()) {
         class_746 var2 = this.i.field_1724;
         if (var2 != null) {
            var2.method_7353(class_2561.method_43470(msg), false);
         }
      }
   }

   public static enum a {
      a,
      b,
      c,
      d;

      public static J.a[] a() {
         return (J.a[])e.clone();
      }

      public static J.a a(String name) {
         return Enum.valueOf(J.a.class, name);
      }

      private static J.a[] b() {
         return new J.a[]{a, b, c, d};
      }
   }
}
