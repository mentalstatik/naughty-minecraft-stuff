package dev.sixseven.d.a;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.minecraft.class_1263;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_465;
import net.minecraft.class_7923;

public final class am extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Filter", "Choose which item ids are taken", "All", "All", "Whitelist", "Blacklist"));
   public final dev.sixseven.i.i b = this.a(
      new dev.sixseven.i.i("Item IDs", "Comma-separated ids used by Whitelist or Blacklist", "", 512, "minecraft:diamond, minecraft:emerald")
   );
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Drop Overflow", "Drop remaining loot when no player inventory space is available", true));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Auto Close", "Close the storage screen after all matching items are taken", false));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Action Delay", "Ticks between container actions", 1.0, 1.0, 10.0, 1.0));
   private final Set<Integer> f = new HashSet<>();
   private int g = -1;
   private int h;
   private int i;
   private int j = -1;
   private int k;
   private int l;
   private boolean m;
   private class_1799 n = class_1799.field_8037;

   public am() {
      super("Auto Loot", "Automatically take selected items from storage containers", dev.sixseven.d.b.b);
      this.b.a(() -> !this.a.a("All"));
   }

   @Override
   protected void h() {
      this.k();
   }

   @Override
   protected void i() {
      this.k();
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 instanceof class_465 var2 && ao.a(var2)) {
         class_1703 var9 = var2.method_17577();
         if (var9.field_7763 != this.g) {
            this.k();
            this.g = var9.field_7763;
         }

         if (!ao.a(var9)) {
            if (this.j >= 0) {
               class_1735 var10 = var9.method_7611(this.j);
               int var11 = var10 != null && var10.method_7681() ? var10.method_7677().method_7947() : 0;
               if (var11 >= this.l && (var10 == null || !var10.method_7681() || class_1799.method_7973(var10.method_7677(), this.n))) {
                  if (++this.k >= 5) {
                     class_1661 var13 = var1.field_1724.method_31548();
                     if (var10 != null && var10.method_7681() && this.c.i() && this.a(var13, var10.method_7677()) == 0 && !this.m) {
                        var1.field_1761.method_2906(var9.field_7763, this.j, 1, class_1713.field_7795, var1.field_1724);
                        this.m = true;
                        this.k = 0;
                     } else {
                        this.f.add(this.j);
                        this.j = -1;
                        this.k = 0;
                     }

                     this.h = 0;
                  }
               } else {
                  this.j = -1;
                  this.k = 0;
                  this.m = false;
                  this.h = this.e.e();
                  this.i = 0;
               }
            } else if (this.h > 0) {
               this.h--;
            } else {
               class_1661 var4 = var1.field_1724.method_31548();
               int var5 = -1;

               for (int var6 = 0; var6 < var9.field_7761.size(); var6++) {
                  class_1735 var7 = (class_1735)var9.field_7761.get(var6);
                  if (this.a(var7, var4) && var7.method_7681() && !this.f.contains(var6)) {
                     class_1799 var8 = var7.method_7677();
                     if (this.a(var8)) {
                        if (this.a(var4, var8) != 0) {
                           var5 = var6;
                           break;
                        }

                        if (this.c.i() && !var8.method_7960()) {
                           this.j = var6;
                           this.l = var8.method_7947();
                           this.n = var8.method_7972();
                           this.k = 0;
                           this.m = true;
                           var1.field_1761.method_2906(var9.field_7763, var6, 1, class_1713.field_7795, var1.field_1724);
                           this.i = 0;
                           return;
                        }

                        this.f.add(var6);
                     }
                  }
               }

               if (var5 >= 0) {
                  class_1735 var12 = var9.method_7611(var5);
                  this.j = var5;
                  this.l = var12.method_7677().method_7947();
                  this.n = var12.method_7677().method_7972();
                  this.k = 0;
                  this.m = false;
                  var1.field_1761.method_2906(var9.field_7763, var5, 0, class_1713.field_7794, var1.field_1724);
                  this.i = 0;
               } else {
                  if (this.d.i() && ++this.i >= 8) {
                     var1.field_1724.method_7346();
                     this.i = 0;
                  }
               }
            }
         }
      } else {
         this.k();
      }
   }

   private boolean a(class_1799 var1) {
      if (this.a.a("All")) {
         return true;
      } else {
         String var2 = this.b.i().toLowerCase(Locale.ROOT).trim();
         HashSet var3 = new HashSet();
         if (!var2.isEmpty()) {
            Arrays.stream(var2.split(","))
               .map(String::trim)
               .filter(var0 -> !var0.isEmpty())
               .map(var0 -> (String)(var0.contains(":") ? var0 : "minecraft:" + var0))
               .forEach(var3::add);
         }

         String var4 = class_7923.field_41178.method_10221(var1.method_7909()).toString().toLowerCase(Locale.ROOT);
         boolean var5 = var3.contains(var4);
         return this.a.a("Whitelist") ? var5 : !var5;
      }
   }

   private int a(class_1661 var1, class_1799 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 36 && var3 < var2.method_7947(); var4++) {
         class_1799 var5 = var1.method_5438(var4);
         if (var5.method_7960()) {
            var3 += Math.min(var2.method_7914(), 64);
         } else if (class_1799.method_7973(var5, var2)) {
            var3 += Math.max(0, Math.min(var5.method_7914(), var2.method_7914()) - var5.method_7947());
         }
      }

      return var3;
   }

   private boolean a(class_1735 var1, class_1661 var2) {
      return var1.field_7871 instanceof class_1263 && var1.field_7871 != var2;
   }

   private void k() {
      this.f.clear();
      this.g = -1;
      this.h = 0;
      this.i = 0;
      this.j = -1;
      this.k = 0;
      this.l = 0;
      this.m = false;
      this.n = class_1799.field_8037;
   }
}
