package dev.sixseven.d.a;

import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_310;

public class ah extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Mode", "Box style — hollow outline or translucent fill", "Outline", "Outline", "Full"));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Range", "Max distance a container is highlighted", 128.0, 16.0, 256.0, 8.0));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Highlight Alpha", "Box opacity (0-255)", 200.0, 0.0, 255.0, 1.0));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Tracers", "Draw lines from the crosshair to each container", false));
   public final dev.sixseven.i.d e = this.a(new dev.sixseven.i.d("Containers", "Which container types to highlight"));
   public final dev.sixseven.i.b f;
   private final LongOpenHashSet g = new LongOpenHashSet();
   private int h;

   public ah() {
      super("StorageESP", "Highlights chests, barrels, shulkers", dev.sixseven.d.b.d);

      for (ah.a var4 : ah.a.a()) {
         this.e.a(var4.i, var4.j, var4.k, var4.m, var4.l);
      }

      this.f = this.a(new dev.sixseven.i.b("Hide Opened", "Don't highlight containers you've already opened", false));
   }

   public boolean a(ah.a var1) {
      return this.e.b(var1.i);
   }

   public int b(ah.a var1) {
      return this.e.c(var1.i);
   }

   public boolean k() {
      return this.f.i();
   }

   public boolean a(int var1, int var2, int var3) {
      return !this.g.isEmpty() && this.g.contains(class_2338.method_10064(var1, var2, var3));
   }

   public void a(class_2338 var1) {
      if (var1 != null) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1687 != null) {
            this.g.add(var1.method_10063());
            class_2586 var5 = var2.field_1687.method_8321(var1);
            class_2745 var3;
            class_2680 var4;
            if (var5 instanceof class_2595
               && (var4 = var2.field_1687.method_8320(var1)).method_26204() instanceof class_2281
               && (var3 = (class_2745)var4.method_11654(class_2281.field_10770)) != class_2745.field_12569) {
               class_2350 var6 = (class_2350)var4.method_11654(class_2281.field_10768);
               class_2338 var7 = var1.method_10093(var3 == class_2745.field_12574 ? var6.method_10170() : var6.method_10160());
               this.g.add(var7.method_10063());
            }
         }
      }
   }

   @Override
   protected void h() {
      this.g.clear();
      this.h = 0;
   }

   @Override
   public void j() {
      dev.sixseven.g.u.a(this);
      if (++this.h >= 20) {
         this.h = 0;
         class_310 var1 = class_310.method_1551();
         if (var1.field_1724 != null && !this.g.isEmpty()) {
            double var2 = this.b.i();
            double var4 = var2 * var2;
            double var6 = var1.field_1724.method_23317();
            double var8 = var1.field_1724.method_23318();
            double var10 = var1.field_1724.method_23321();
            LongIterator var12 = this.g.iterator();

            while (var12.hasNext()) {
               long var13 = var12.nextLong();
               class_2338 var15 = class_2338.method_10092(var13);
               double var16 = (double)var15.method_10263() + 0.5 - var6;
               double var18 = (double)var15.method_10264() + 0.5 - var8;
               double var20 = (double)var15.method_10260() + 0.5 - var10;
               if (var16 * var16 + var18 * var18 + var20 * var20 > var4) {
                  var12.remove();
               }
            }
         }
      }
   }

   @Override
   protected void i() {
      dev.sixseven.g.u.a();
      this.g.clear();
      this.h = 0;
   }

   public static enum a {
      a("chest", "Chest", class_1802.field_8106, -22016, true),
      b("trapped", "Trapped Chest", class_1802.field_8247, -65536, true),
      c("ender", "Ender Chest", class_1802.field_8466, -8912641, true),
      d("shulker", "Shulker Box", class_1802.field_8545, -47873, true),
      e("barrel", "Barrel", class_1802.field_16307, -7842560, true),
      f("spawner", "Spawner", class_1802.field_8849, -16711936, true),
      g("hopper", "Hopper", class_1802.field_8239, -7829368, false),
      h("furnace", "Furnace", class_1802.field_8732, -7566196, false);

      final String i;
      final String j;
      final class_1792 k;
      final int l;
      final boolean m;

      public static ah.a[] a() {
         return (ah.a[])n.clone();
      }

      public static ah.a a(String param0) {
         return Enum.valueOf(ah.a.class, var0);
      }

      private a(String nullxx, String nullxxx, class_1792 nullxxxx, int nullxxxxx, boolean nullxxxxxx) {
         this.i = nullxx;
         this.j = nullxxx;
         this.k = nullxxxx;
         this.l = nullxxxxx;
         this.m = nullxxxxxx;
      }
   }
}
