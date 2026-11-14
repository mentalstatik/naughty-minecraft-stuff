package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_746;

public class ae extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Stacks To Deposit", "How many full stacks of spawners to mine before stashing.", 3.0, 1.0, 30.0, 1.0)
   );
   public final dev.sixseven.i.h b = this.a(
      new dev.sixseven.i.h("Trigger Range", "Horizontal distance a stranger triggers the routine.", 64.0, 16.0, 128.0, 1.0, "m")
   );
   public final dev.sixseven.i.h c = this.a(
      new dev.sixseven.i.h("Rotation Speed", "Degrees per tick the look direction is nudged toward its target.", 15.0, 1.0, 30.0, 1.0)
   );
   public final dev.sixseven.i.b d = this.a(
      new dev.sixseven.i.b("Detect Block Updates", "Detects distant players by their out-of-render block break/place packets.", true)
   );
   public final dev.sixseven.i.i e = this.a(new dev.sixseven.i.i("Whitelist", "Comma-separated names to ignore.", "", 256, "Steve, Alex"));
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Break Range", "How close a spawner must be before it is broken.", 5.5, 1.0, 8.0, 0.5, "m"));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Double Check", "Requires two distant breaks within the window before triggering.", true));
   public final dev.sixseven.i.h h = this.a(new dev.sixseven.i.h("Double Check Window", "Time window for the double check.", 60.0, 1.0, 600.0, 1.0, "s"));
   public final dev.sixseven.i.i i = this.a(
      new dev.sixseven.i.i("Webhook URL", "Optional Discord webhook for alerts.", "", 256, "https://discord.com/api/webhooks/...")
   );
   private final class_310 j = class_310.method_1551();
   private ae.a k = ae.a.a;
   private class_2338 l = null;
   private class_2338 m = null;
   private int n = 0;
   private int o = 0;
   private int p = 0;
   private boolean q = false;
   private final Set<Integer> r = new HashSet<>();
   private int s = 0;
   private long t = 0L;
   private int u = 0;
   private int v = 0;
   private int w = 0;
   private class_638 x;
   private class_2248 y;
   private int z = -1;
   private long A;
   private class_2338 B;

   public ae() {
      super("SpawnerProtect", "Auto-salvages your spawners when a stranger approaches, then logs out.", dev.sixseven.d.b.c);
      dev.sixseven.i.h var1 = this.h;
      dev.sixseven.i.b var2 = this.g;
      var1.a(var2::i);
   }

   @Override
   protected void h() {
      this.n();
   }

   @Override
   protected void i() {
      this.E();
      this.b(false);
   }

   private void n() {
      this.k = ae.a.a;
      this.q = false;
      this.p = 0;
      this.r.clear();
      this.s = 0;
      this.t = 0L;
      this.o();
   }

   private void o() {
      this.m = null;
      this.l = null;
      this.n = 0;
      this.o = 0;
      this.w = 0;
   }

   public boolean k() {
      return this.q;
   }

   public String l() {
      return this.k.name();
   }

   public boolean m() {
      return this.d.i();
   }

   public void a(int var1, class_2338 var2) {
      class_746 var3 = this.j.field_1724;
      class_638 var4 = this.j.field_1687;
      if (!this.q && var3 != null && var4 != null && !this.y() && var1 != var3.method_5628()) {
         class_1297 var11 = var4.method_8469(var1);
         if (var11 instanceof class_1657 var14) {
            if (this.a(var14.method_5477().getString())) {
               return;
            }
         } else if (var11 == null) {
            for (class_1657 var13 : var4.method_18456()) {
               if (var13.method_33571().method_1022(class_243.method_24953(var2)) < 8.0 && this.a(var13.method_5477().getString())) {
                  return;
               }
            }
         }

         double var5;
         double var7;
         double var9;
         if ((
               var9 = Math.sqrt(
                  (var7 = var3.method_23317() - (double)var2.method_10263()) * var7 + (var5 = var3.method_23321() - (double)var2.method_10260()) * var5
               )
            )
            <= this.b.i()) {
            this.q = true;
            this.k = ae.a.b;
            String var15 = var11 != null ? var11.method_5477().getString() : "Invisible/Anti-ESP";
            this.b("\ud83d\udea8 PACKET DETECT: " + var15 + " started breaking! (Horizontal: " + (int)var9 + "m)");
            this.d("\ud83d\udea8 **PACKET DETECT:** `" + var15 + "` started breaking! (Horizontal: " + (int)var9 + "m, Y: " + var2.method_10264() + ").");
         }
      }
   }

   public void a(class_2338 var1, class_2680 var2, boolean var3) {
      class_746 var4 = this.j.field_1724;
      class_638 var5 = this.j.field_1687;
      if (!this.q && var4 != null && var5 != null && !this.y()) {
         for (class_1657 var16 : var5.method_18456()) {
            if (var16.method_33571().method_1022(class_243.method_24953(var1)) < 8.0 && this.a(var16.method_5477().getString())) {
               return;
            }
         }

         double var6;
         double var8;
         double var10;
         class_2680 var14;
         if (var1.method_10264() > -64
            && var2.method_26215()
            && !(var14 = var5.method_8320(var1)).method_26215()
            && !(var14.method_26204() instanceof class_2480)
            && !(var4.method_33571().method_1022(class_243.method_24953(var1)) < 6.0)
            && !(
               (
                     var10 = Math.sqrt(
                        (var8 = var4.method_23317() - (double)var1.method_10263()) * var8 + (var6 = var4.method_23321() - (double)var1.method_10260()) * var6
                     )
                  )
                  > this.b.i()
            )) {
            if (this.g.i()) {
               long var17 = System.currentTimeMillis();
               if (var17 - this.t > (long)this.h.e() * 1000L) {
                  this.s = 0;
               }

               this.s++;
               this.t = var17;
               if (this.s < 2) {
                  return;
               }
            }

            this.q = true;
            this.k = ae.a.b;
            String var18 = var3 ? "multi-block break" : "block break";
            this.b("\ud83d\udea8 REMOTE DETECT: a block broke nearby! (Horizontal: " + (int)var10 + "m, Y: " + var1.method_10264() + ")");
            this.d(
               "\ud83d\udea8 **REMOTE DETECT ("
                  + var18
                  + "):** an invisible or far-away player broke a block! (Horizontal: "
                  + (int)var10
                  + "m, Y: "
                  + var1.method_10264()
                  + ")"
            );
         }
      }
   }

   @Override
   public void j() {
      class_746 var1 = this.j.field_1724;
      class_638 var2 = this.j.field_1687;
      if (var1 != null && var2 != null) {
         if (this.y()) {
            if (this.q) {
               this.n();
            }
         } else {
            if (!this.q) {
               for (class_1657 var10 : var2.method_18456()) {
                  double var3;
                  double var5;
                  double var7;
                  if (var10 != var1
                     && !this.a(var10.method_5477().getString())
                     && !(
                        (
                              var7 = Math.sqrt(
                                 (var5 = var1.method_23317() - var10.method_23317()) * var5 + (var3 = var1.method_23321() - var10.method_23321()) * var3
                              )
                           )
                           > this.b.i()
                     )) {
                     boolean var11 = this.r.contains(var10.method_5628());
                     if (!var11 && var10.method_6115()) {
                        var11 = true;
                        this.r.add(var10.method_5628());
                     }

                     if (var11) {
                        this.q = true;
                        this.k = ae.a.b;
                        String var12 = var10.method_5477().getString();
                        this.b("⚠ PLAYER SPOTTED (verified): " + var12 + " (Horizontal: " + (int)var7 + "m)");
                        var12 = var10.method_5477().getString();
                        this.d("⚠ **PLAYER SPOTTED (verified):** `" + var12 + "` (Horizontal: " + (int)var7 + "m, Y: " + var10.method_31478() + ")!");
                        break;
                     }
                  }
               }
            }

            if (!this.q) {
               for (class_1297 var18 : var2.method_18112()) {
                  class_1297 var13;
                  double var14;
                  double var15;
                  double var16;
                  class_1657 var19;
                  class_1676 var21;
                  if (var18.method_5864() == class_1299.field_6082
                     && (
                        !(var18 instanceof class_1676)
                           || !((var13 = (var21 = (class_1676)var18).method_24921()) instanceof class_1657)
                           || !this.a((var19 = (class_1657)var13).method_5477().getString())
                     )
                     && (
                           var16 = Math.sqrt(
                              (var15 = var1.method_23317() - var18.method_23317()) * var15 + (var14 = var1.method_23321() - var18.method_23321()) * var14
                           )
                        )
                        <= this.b.i()) {
                     this.q = true;
                     this.k = ae.a.b;
                     this.b("⚠ ENDER PEARL SPOTTED! (Horizontal: " + (int)var16 + "m)");
                     this.d("⚠ **ENDER PEARL SPOTTED!** Someone threw a pearl. (Horizontal: " + (int)var16 + "m)!");
                     break;
                  }
               }
            }

            if (this.k != ae.a.a) {
               if (this.k != ae.a.d && this.k != ae.a.e && this.k != ae.a.g) {
                  this.b(true);
               }

               this.p();
               switch (this.k) {
                  case b:
                     this.q();
                     break;
                  case c:
                     this.s();
                     break;
                  case d:
                     this.t();
                     break;
                  case e:
                     this.w();
                     break;
                  case f:
                     this.x();
                     break;
                  case g:
                     this.u();
                     break;
                  case h:
                     this.v();
               }
            }
         }
      }
   }

   private void p() {
      class_746 var1 = this.j.field_1724;
      class_638 var2 = this.j.field_1687;
      if (var1 != null && var2 != null) {
         class_243 var3 = null;
         if (this.k == ae.a.b) {
            class_1542 var4 = this.C();
            if (var4 != null) {
               var3 = var4.method_73189();
            } else {
               if (this.l == null || var2.method_8320(this.l).method_26204() != class_2246.field_10260 || var1.method_24515().method_10262(this.l) > 256.0) {
                  this.l = this.b(class_2246.field_10260, 16);
                  this.w = 0;
               }

               if (this.l != null) {
                  var3 = class_243.method_24953(this.l);
               }
            }
         } else if ((this.k == ae.a.c || this.k == ae.a.d) && this.m != null) {
            var3 = class_243.method_24953(this.m);
         }

         if (var3 != null) {
            this.a(var3);
         }
      }
   }

   private void a(class_243 var1) {
      class_746 var2 = this.j.field_1724;
      if (var2 != null) {
         class_243 var3 = var2.method_33571();
         double var4 = var1.field_1352 - var3.field_1352;
         double var6 = var1.field_1351 - var3.field_1351;
         double var8 = var1.field_1350 - var3.field_1350;
         double var10 = Math.sqrt(var4 * var4 + var8 * var8);
         float var12 = (float)Math.toDegrees(Math.atan2(-var4, var8));
         float var13 = (float)(-Math.toDegrees(Math.atan2(var6, var10)));
         float var14 = this.c.d();
         var2.method_36456(var2.method_36454() + class_3532.method_15363(class_3532.method_15393(var12 - var2.method_36454()), -var14, var14));
         var2.method_36457(var2.method_36455() + class_3532.method_15363(class_3532.method_15393(var13 - var2.method_36455()), -var14, var14));
      }
   }

   private void q() {
      class_746 var1 = this.j.field_1724;
      class_638 var2 = this.j.field_1687;
      if (var1 != null && var2 != null) {
         if (var1.field_7512 != var1.field_7498) {
            var1.method_7346();
         }

         if (this.C() != null) {
            this.p = 0;
            this.D();
            this.j.field_1690.field_1894.method_23481(true);
         } else if (this.A() >= this.a.e() * 64) {
            this.r();
         } else {
            if (this.l == null || var2.method_8320(this.l).method_26204() != class_2246.field_10260 || var1.method_24515().method_10262(this.l) > 256.0) {
               this.l = this.b(class_2246.field_10260, 16);
               this.w = 0;
            }

            if (this.l == null) {
               this.E();
               if (this.p < 40) {
                  this.p++;
               } else if (this.A() > 0) {
                  this.r();
               } else {
                  this.k = ae.a.f;
                  this.p = 0;
               }
            } else {
               this.p = 0;
               double var4 = var1.method_33571().method_1022(class_243.method_24953(this.l));
               if (var4 <= this.f.i()) {
                  this.j.field_1690.field_1894.method_23481(false);
                  this.w++;
                  if (this.w > 60) {
                     this.j
                        .field_1761
                        .method_2896(var1, class_1268.field_5808, new class_3965(class_243.method_24953(this.l), class_2350.field_11036, this.l, false));
                     var1.method_6104(class_1268.field_5808);
                     this.w = 0;
                  }

                  if (this.o <= 0) {
                     this.j.field_1761.method_2902(this.l, class_2350.field_11036);
                     var1.method_6104(class_1268.field_5808);
                     this.j.field_1690.field_1886.method_23481(true);
                     this.o = 6;
                  } else {
                     this.o--;
                  }
               } else {
                  this.D();
                  this.j.field_1690.field_1894.method_23481(true);
               }
            }
         }
      }
   }

   private void r() {
      this.E();
      this.m = this.a(class_2246.field_10443, 4);
      if (this.m != null) {
         this.k = ae.a.c;
      } else if (this.B() > 0) {
         this.k = ae.a.h;
         this.v = 0;
      } else {
         this.k = ae.a.g;
         this.u = 0;
         this.v = 0;
      }
   }

   private void s() {
      class_746 var1 = this.j.field_1724;
      if (var1 != null) {
         if (this.m == null) {
            this.m = this.a(class_2246.field_10443, 4);
         }

         if (this.m == null) {
            this.k = ae.a.b;
         } else {
            this.j.field_1690.field_1894.method_23481(true);
            if (var1.method_24515().method_19771(this.m, 4.0)) {
               this.E();
               this.k = ae.a.d;
            }
         }
      }
   }

   private void t() {
      class_746 var1 = this.j.field_1724;
      if (var1 != null) {
         this.b(false);
         if (this.n % 12 == 0 && this.m != null) {
            this.j.field_1761.method_2896(var1, class_1268.field_5808, new class_3965(class_243.method_24953(this.m), class_2350.field_11036, this.m, false));
         }

         this.n++;
         if (var1.field_7512 instanceof class_1707) {
            this.n = 0;
            this.k = ae.a.e;
            this.p = 0;
         }
      }
   }

   private void u() {
      class_746 var1 = this.j.field_1724;
      if (var1 != null) {
         this.v++;
         if (this.u > 0 && this.j.field_1755 == null && this.v > 60) {
            this.c("Shop screen closed, retrying...");
            this.u = 0;
            this.v = 0;
         } else if (this.v >= 30) {
            switch (this.u) {
               case 0:
                  this.c("Opening shop: /shop");
                  if (this.j.method_1562() != null) {
                     this.j.method_1562().method_45730("shop");
                  }

                  this.u = 1;
                  this.v = 0;
                  break;
               case 1:
                  if (this.j.field_1755 != null && this.z().contains("SHOP")) {
                     this.c("Shop: selecting the End category...");
                     this.a(11, class_1713.field_7790);
                     this.u = 2;
                     this.v = 0;
                  }
                  break;
               case 2:
                  if (this.j.field_1755 != null && this.z().contains("END")) {
                     this.c("Shop: selecting Ender Chest...");
                     this.a(9, class_1713.field_7790);
                     this.u = 3;
                     this.v = 0;
                  }
                  break;
               case 3:
                  if (this.j.field_1755 != null && this.z().contains("ENDER CHEST")) {
                     this.c("Shop: confirming purchase...");
                     this.a(25, class_1713.field_7790);
                     this.u = 4;
                     this.v = 0;
                  }
                  break;
               case 4:
                  if (this.B() > 0) {
                     this.c("Ender Chest purchased.");
                     var1.method_7346();
                     this.k = ae.a.h;
                     this.v = 0;
                  } else if (this.v > 100) {
                     this.c("Purchase failed (timeout).");
                     var1.method_7346();
                     this.u = 0;
                     this.v = 0;
                  }
            }
         }
      }
   }

   private void v() {
      class_746 var1 = this.j.field_1724;
      class_638 var2 = this.j.field_1687;
      if (var1 != null && var2 != null) {
         this.v++;
         if (this.v >= 10) {
            int var4 = -1;

            for (int var3 = 0; var3 < 9; var3++) {
               if (var1.method_31548().method_5438(var3).method_7909() == class_2246.field_10443.method_8389()) {
                  var4 = var3;
                  break;
               }
            }

            if (var4 == -1) {
               for (int var12 = 9; var12 < 36; var12++) {
                  if (var1.method_31548().method_5438(var12).method_7909() == class_2246.field_10443.method_8389()) {
                     this.j.field_1761.method_2906(var1.field_7512.field_7763, var12, 0, class_1713.field_7794, var1);
                     this.v = 0;
                     return;
                  }
               }

               this.k = ae.a.g;
               this.u = 0;
            } else {
               var1.method_31548().method_61496(var4);
               class_2338 var5 = var1.method_24515();
               class_2338 var6 = null;

               for (class_2350 var10 : class_2350.values()) {
                  class_2338 var11;
                  if (var10 != class_2350.field_11036 && var10 != class_2350.field_11033 && var2.method_8320(var11 = var5.method_10093(var10)).method_45474()) {
                     var6 = var11;
                     break;
                  }
               }

               if (var6 != null) {
                  this.j.field_1761.method_2896(var1, class_1268.field_5808, new class_3965(class_243.method_24953(var6), class_2350.field_11036, var6, false));
                  var1.method_6104(class_1268.field_5808);
                  this.m = var6;
                  this.k = ae.a.c;
               } else {
                  this.b("No spot to place the Ender Chest!");
                  this.k = ae.a.f;
                  this.p = 0;
               }
            }
         }
      }
   }

   private void w() {
      class_746 var1 = this.j.field_1724;
      if (var1 != null) {
         if (this.p < 15) {
            this.p++;
         } else if (var1.field_7512 instanceof class_1707 var3) {
            int var4 = var3.field_7761.size() - 36;
            boolean var5 = false;

            for (int var6 = 0; var6 < var4; var6++) {
               class_1799 var7 = var3.method_7611(var6).method_7677();
               if (var7.method_7960() || var7.method_7909() == class_2246.field_10260.method_8389() && var7.method_7947() < var7.method_7914()) {
                  var5 = true;
                  break;
               }
            }

            int var9 = var4;

            for (int var10 = 0; var10 < 36; var10++) {
               int var8 = var9 + var10;
               if (var3.method_7611(var8).method_7677().method_7909() == class_2246.field_10260.method_8389()) {
                  if (!var5) {
                     this.k = ae.a.f;
                     this.p = 0;
                     return;
                  }

                  this.j.field_1761.method_2906(var3.field_7763, var8, 0, class_1713.field_7794, var1);
                  return;
               }
            }

            var1.method_7346();
            if (this.a(class_2246.field_10260, 16) != null) {
               this.k = ae.a.b;
            } else {
               this.k = ae.a.f;
               this.p = 0;
            }
         }
      }
   }

   private void x() {
      if (this.p == 0) {
         this.d("\ud83c\udfc1 **DONE.** Waiting for items to save...");
         this.c("Task done — waiting 2s for the server to save, then disconnecting...");
      }

      this.p++;
      if (this.p > 40) {
         class_634 var1 = this.j.method_1562();
         if (var1 != null) {
            var1.method_48296().method_10747(class_2561.method_43470("[SpawnerProtect] Task complete, safe disconnect."));
         }

         this.n();
      }
   }

   private void b(boolean var1) {
      class_746 var2 = this.j.field_1724;
      if (var2 != null) {
         var2.method_5660(var1);
      }

      this.j.field_1690.field_1832.method_23481(var1);
   }

   private boolean y() {
      class_746 var1 = this.j.field_1724;
      return var1 != null && Math.abs(var1.method_23317()) < 100.0 && Math.abs(var1.method_23321()) < 100.0;
   }

   private boolean a(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (String var5 : this.e.i().split(",")) {
            if (var5.trim().equalsIgnoreCase(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private String z() {
      return this.j.field_1755 == null ? "" : this.j.field_1755.method_25440().getString().toUpperCase(Locale.ROOT);
   }

   private void a(int var1, class_1713 var2) {
      class_746 var3 = this.j.field_1724;
      if (var3 != null) {
         this.j.field_1761.method_2906(var3.field_7512.field_7763, var1, 0, var2, var3);
      }
   }

   private class_2338 a(class_2248 var1, int var2) {
      class_746 var3 = this.j.field_1724;
      class_638 var4 = this.j.field_1687;
      if (var3 != null && var4 != null) {
         class_2338 var5 = var3.method_24515();
         class_2338 var6 = null;
         double var7 = Double.MAX_VALUE;

         for (int var9 = -var2; var9 <= var2; var9++) {
            for (int var10 = -var2; var10 <= var2; var10++) {
               for (int var11 = -var2; var11 <= var2; var11++) {
                  class_2338 var14 = var5.method_10069(var9, var10, var11);
                  double var12;
                  if (var4.method_8320(var14).method_26204() == var1 && (var12 = var5.method_10262(var14)) < var7) {
                     var7 = var12;
                     var6 = var14;
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private class_2338 b(class_2248 var1, int var2) {
      class_746 var3 = this.j.field_1724;
      class_638 var4 = this.j.field_1687;
      if (var3 != null && var4 != null) {
         class_2338 var5 = var3.method_24515();
         long var6 = System.nanoTime();
         int var8 = Math.max(0, var2);
         int var9 = var8 * var8;
         if (var4 == this.x && var1 == this.y && var2 == this.z && var6 - this.A < 500000000L) {
            if (this.B == null) {
               return this.B;
            }

            if (var5.method_10262(this.B) <= (double)var9 && var4.method_8320(this.B).method_26204() == var1) {
               return this.B;
            }
         }

         this.x = var4;
         this.y = var1;
         this.z = var2;
         this.A = var6;
         class_2338 var10 = null;
         int var11 = 0;
         ThreadLocalRandom var12 = ThreadLocalRandom.current();

         for (int var13 = -var8; var13 <= var8; var13++) {
            int var14 = var9 - var13 * var13;
            int var15 = (int)Math.sqrt((double)var14);

            for (int var16 = -var15; var16 <= var15; var16++) {
               int var17 = (int)Math.sqrt((double)(var14 - var16 * var16));

               for (int var18 = -var17; var18 <= var17; var18++) {
                  class_2338 var19 = var5.method_10069(var13, var16, var18);
                  if (var4.method_8320(var19).method_26204() == var1) {
                     if (var12.nextInt(++var11) == 0) {
                        var10 = var19;
                     }
                  }
               }
            }
         }

         this.B = var10;
         return var10;
      } else {
         return null;
      }
   }

   private int A() {
      return this.a(class_2246.field_10260.method_8389(), 36);
   }

   private int B() {
      return this.a(class_2246.field_10443.method_8389(), 45);
   }

   private int a(class_1792 var1, int var2) {
      class_746 var3 = this.j.field_1724;
      if (var3 == null) {
         return 0;
      } else {
         int var4 = 0;

         for (int var5 = 0; var5 < var2; var5++) {
            class_1799 var6 = var3.method_31548().method_5438(var5);
            if (var6.method_7909() == var1) {
               var4 += var6.method_7947();
            }
         }

         return var4;
      }
   }

   private class_1542 C() {
      class_746 var1 = this.j.field_1724;
      class_638 var2 = this.j.field_1687;
      if (var1 != null && var2 != null) {
         class_1542 var3 = null;
         double var4 = Double.MAX_VALUE;

         for (class_1297 var7 : var2.method_18112()) {
            double var8;
            class_1542 var10;
            if (var7 instanceof class_1542
               && (var10 = (class_1542)var7).method_6983().method_7909() == class_2246.field_10260.method_8389()
               && (var8 = (double)var1.method_5739(var10)) < 16.0
               && var8 < var4) {
               var4 = var8;
               var3 = var10;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private void D() {
      this.j.field_1690.field_1886.method_23481(false);
      this.o = 0;
   }

   private void E() {
      this.D();
      this.j.field_1690.field_1894.method_23481(false);
   }

   private void b(String var1) {
      class_746 var2 = this.j.field_1724;
      if (var2 != null) {
         var2.method_7353(class_2561.method_43470("§c[SpawnerProtect] §f" + var1), false);
      }

      try {
         SixSevenClient.notifications().a("SpawnerProtect · " + var1.replaceAll("§.", ""));
      } catch (Exception var4) {
      }
   }

   private void c(String var1) {
      class_746 var2 = this.j.field_1724;
      if (var2 != null) {
         var2.method_7353(class_2561.method_43470("§7[SpawnerProtect] " + var1), false);
      }
   }

   private void d(String var1) {
      String var2 = this.i.i().trim();
      if (!var2.isEmpty()) {
         String var3 = var1.replace("\\", "\\\\");
         String var4 = "\"";
         String var5 = "{\"content\": \"" + var3.replace(var4, "\\\"") + "\"}";
         new Thread(() -> {
         }, "SpawnerProtect-Webhook").start();
      }
   }

   private static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;

      public static ae.a[] a() {
         return (ae.a[])i.clone();
      }

      public static ae.a a(String param0) {
         return Enum.valueOf(ae.a.class, var0);
      }
   }
}
