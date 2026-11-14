package dev.sixseven.d.a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2343;
import net.minecraft.class_2586;
import net.minecraft.class_2591;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_4970.class_4971;

public class n extends dev.sixseven.d.c {
   private static final String k = "other";
   private static final int l = 8192;
   public final dev.sixseven.i.d a = this.a(new dev.sixseven.i.d("Block Entities", "Which block-entity types to highlight"));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Mode", "Box style — hollow outline or translucent fill", "Full", "Full", "Outline"));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Range", "Max distance a block entity is highlighted", 128.0, 16.0, 512.0, 8.0));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Highlight Alpha", "Box opacity (0-255)", 180.0, 0.0, 255.0, 1.0));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Tracers", "Draw lines from the crosshair to each block entity", false));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Show Ghosts", "Keep entries the server sent but that are gone client-side", true));
   public final dev.sixseven.i.c g = this.a(new dev.sixseven.i.c("Ghost Tint", "Color blended into ghost entries", -922791856));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Chunk Packets", "Read block entities from chunk-data packets", true));
   public final dev.sixseven.i.b i = this.a(new dev.sixseven.i.b("BE Update Packets", "Read block entities from block-entity update packets", true));
   public final dev.sixseven.i.b j = this.a(new dev.sixseven.i.b("World Rescan", "Also snapshot already-loaded chunks when enabled", true));
   private final Map<String, String> m = new HashMap<>();
   private final Map<Long, n.a> n = new ConcurrentHashMap<>();
   private final ArrayDeque<n.b> o = new ArrayDeque<>();
   private final AtomicBoolean p = new AtomicBoolean();
   private final AtomicBoolean q = new AtomicBoolean(true);
   private volatile List<n.c> r = List.of();
   private volatile int s = 8704;
   private class_638 t;
   private int u = Integer.MIN_VALUE;
   private int v = Integer.MIN_VALUE;
   private boolean w;
   private int x;
   private int y;

   public n() {
      super("BlockEntityESP", "Highlights block entities from raw packets", dev.sixseven.d.b.d);
      dev.sixseven.i.c var1 = this.g;
      dev.sixseven.i.b var2 = this.f;
      var1.a(var2::i);
      this.a("minecraft:chest", "Chest", class_1802.field_8106, -22016, true);
      this.a("minecraft:trapped_chest", "Trapped Chest", class_1802.field_8247, -65536, true);
      this.a("minecraft:ender_chest", "Ender Chest", class_1802.field_8466, -8912641, true);
      this.a("minecraft:shulker_box", "Shulker Box", class_1802.field_8545, -47873, true);
      this.a("minecraft:barrel", "Barrel", class_1802.field_16307, -7842560, true);
      this.a("minecraft:mob_spawner", "Spawner", class_1802.field_8849, -16711936, true);
      this.a("minecraft:hopper", "Hopper", class_1802.field_8239, -7829368, false);
      this.a("minecraft:furnace", "Furnace", class_1802.field_8732, -7566196, false);
      this.a("minecraft:blast_furnace", "minecraft:furnace");
      this.a("minecraft:smoker", "minecraft:furnace");
      this.a("minecraft:dispenser", "Dispenser", class_1802.field_8357, -10066330, false);
      this.a("minecraft:dropper", "minecraft:dispenser");
      this.a("minecraft:brewing_stand", "Brewing Stand", class_1802.field_8740, -3372801, false);
      this.a("minecraft:beehive", "Beehive", class_1802.field_20416, -13312, false);
      this.a("minecraft:enchanting_table", "Enchanting Table", class_1802.field_8657, -7864065, false);
      this.a("minecraft:sign", "Sign", class_1802.field_8788, -3355444, false);
      this.a("minecraft:hanging_sign", "minecraft:sign");
      this.a("minecraft:bed", "Bed", class_1802.field_8789, -30584, false);
      this.a("minecraft:skull", "Skull", class_1802.field_8398, -2236963, false);
      this.a("minecraft:banner", "Banner", class_1802.field_8539, -1118482, false);
      this.a("minecraft:crafter", "Crafter", class_1802.field_46791, -12276993, false);
      this.a("minecraft:vault", "Vault", class_1802.field_48847, -10496, false);
      this.a("minecraft:trial_spawner", "Trial Spawner", class_1802.field_47314, -16711766, false);
      this.a("other", "Other", class_1802.field_8542, -5592406, true);
   }

   private void a(String var1, String var2, class_1792 var3, int var4, boolean var5) {
      this.a.a(var1, var2, var3, var5, var4);
   }

   private void a(String var1, String var2) {
      this.m.put(var1, var2);
   }

   private String a(String var1) {
      if (this.a.a(var1) != null) {
         return var1;
      } else {
         String var2 = this.m.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            int var3 = var1.indexOf(58);
            if (var3 >= 0) {
               String var4 = var1.substring(var3 + 1);
               String var5 = "minecraft:" + var4;
               if (this.a.a(var5) != null) {
                  return var5;
               }

               if (this.m.containsKey(var5)) {
                  return this.m.get(var5);
               }
            }

            return "other";
         }
      }
   }

   public boolean k() {
      return this.h.i();
   }

   public boolean l() {
      return this.i.i();
   }

   public void a(class_2338 var1, class_2591<?> var2) {
      if (var1 != null && var2 != null) {
         class_2960 var3 = class_7923.field_41181.method_10221(var2);
         String var4 = this.a(var3 != null ? var3.toString() : String.valueOf(var2));
         this.n.put(var1.method_10063(), new n.a(var1.method_10062(), var4, System.currentTimeMillis()));
         this.q.set(true);
         int var5 = this.n.size();
         if (var5 >= this.s && this.p.compareAndSet(false, true)) {
            try {
               this.q();
               this.s = Math.max(8704, this.n.size() + 512);
            } finally {
               this.p.set(false);
            }
         }
      }
   }

   private void q() {
      PriorityQueue var1 = new PriorityQueue<>(512, Comparator.<Entry>comparingLong(var0 -> ((n.a)var0.getValue()).c()).reversed());

      for (Entry var3 : this.n.entrySet()) {
         var1.offer(var3);
         if (var1.size() > 512) {
            var1.poll();
         }
      }

      while (!var1.isEmpty()) {
         Entry var4 = (Entry)var1.poll();
         this.n.remove(var4.getKey(), var4.getValue());
      }
   }

   public Collection<n.a> m() {
      return this.n.values();
   }

   public List<n.c> n() {
      return this.r;
   }

   public void o() {
      this.n.clear();
      this.r = List.of();
      this.q.set(true);
      this.o.clear();
      this.t = null;
      this.w = this.f() && this.j.i();
   }

   public int p() {
      return this.n.size();
   }

   @Override
   protected void h() {
      this.n.clear();
      this.r = List.of();
      this.q.set(true);
      this.o.clear();
      this.t = null;
      this.u = Integer.MIN_VALUE;
      this.v = Integer.MIN_VALUE;
      this.w = this.j.i();
      this.x = 0;
      this.y = 0;
      this.s = 8704;
      this.r();
   }

   @Override
   protected void i() {
      this.n.clear();
      this.r = List.of();
      this.q.set(true);
      this.o.clear();
      this.t = null;
      this.w = false;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      if (var1.field_1687 != null && var2 != null) {
         if (!this.w && this.t == var1.field_1687) {
            int var3 = var2.method_31476().field_9181;
            int var4 = var2.method_31476().field_9180;
            if (Math.max(Math.abs(var3 - this.u), Math.abs(var4 - this.v)) >= 4) {
               this.r();
            }
         } else {
            this.r();
         }

         this.a(var1.field_1687);
         boolean var14 = ++this.y >= 4;
         if (var14) {
            this.y = 0;
         }

         if (this.q.getAndSet(false) || var14) {
            this.a(var1.field_1687, var2);
         }

         if (++this.x < 10) {
            return;
         }

         this.x = 0;
         double var15 = this.c.i();
         double var6 = var15 * var15;
         double var8 = var2.method_23317();
         double var10 = var2.method_23318();
         double var12 = var2.method_23321();
         this.n
            .values()
            .removeIf(
               var8x -> {
                  class_2338 var13 = var8x.a();
                  double var14x = (double)var13.method_10263() + 0.5 - var8;
                  double var9;
                  double var11;
                  return var14x * var14x
                        + (var11 = (double)var13.method_10264() + 0.5 - var10) * var11
                        + (var9 = (double)var13.method_10260() + 0.5 - var12) * var9
                     > var6;
               }
            );
         this.q.set(true);
      }
   }

   private void a(class_638 var1, class_746 var2) {
      double var3 = this.c.i();
      double var5 = var3 * var3;
      boolean var7 = this.f.i();
      double var8 = var2.method_23317();
      double var10 = var2.method_23318();
      double var12 = var2.method_23321();
      ArrayList var14 = new ArrayList();

      for (n.a var16 : this.n.values()) {
         class_2338 var17 = var16.a();
         double var18 = (double)var17.method_10263() + 0.5 - var8;
         double var20 = (double)var17.method_10264() + 0.5 - var10;
         double var22 = (double)var17.method_10260() + 0.5 - var12;
         if (!(var18 * var18 + var20 * var20 + var22 * var22 > var5)) {
            boolean var24 = var1.method_8321(var17) == null;
            if (!var24 || var7) {
               var14.add(new n.c(var17, var16.b(), var24));
            }
         }
      }

      this.r = List.copyOf(var14);
   }

   private void r() {
      class_310 var1 = class_310.method_1551();
      class_638 var2 = var1.field_1687;
      class_746 var3 = var1.field_1724;
      if (var2 != null && var3 != null) {
         this.o.clear();
         int var4 = Math.min(32, (int)Math.ceil(this.c.i() / 16.0) + 2);
         int var5 = var3.method_31476().field_9181;
         int var6 = var3.method_31476().field_9180;
         ArrayList var7 = new ArrayList();

         for (int var8 = var5 - var4; var8 <= var5 + var4; var8++) {
            for (int var9 = var6 - var4; var9 <= var6 + var4; var9++) {
               if (var2.method_2935().method_12123(var8, var9)) {
                  var7.add(new n.b(var8, var9));
               }
            }
         }

         var7.sort(Comparator.comparingLong(var2x -> (long)(var2x.a() - var5) * (long)(var2x.a() - var5) + (long)(var2x.b() - var6) * (long)(var2x.b() - var6)));
         this.o.addAll(var7);
         this.t = var2;
         this.u = var5;
         this.v = var6;
         this.w = false;
      }
   }

   private void a(class_638 var1) {
      if (!this.o.isEmpty()) {
         class_2339 var2 = new class_2339();
         long var3 = System.nanoTime() + 2000000L;
         int var5 = 0;

         while (var5 < 4 && System.nanoTime() < var3 && !this.o.isEmpty()) {
            n.b var6 = this.o.pollFirst();
            var5++;
            if (var1.method_2935().method_12123(var6.a(), var6.b())) {
               class_2818 var7 = var1.method_8497(var6.a(), var6.b());
               class_2826[] var8 = var7.method_12006();
               int var9 = var7.method_32891();
               int var10 = var7.method_12004().method_8326();
               int var11 = var7.method_12004().method_8328();

               for (int var12 = 0; var12 < var8.length && System.nanoTime() < var3; var12++) {
                  class_2826 var13 = var8[var12];
                  if (!var13.method_38292() && var13.method_19523(class_4971::method_31709)) {
                     int var14 = var9 + var12 << 4;

                     for (int var15 = 0; var15 < 16; var15++) {
                        for (int var16 = 0; var16 < 16; var16++) {
                           for (int var17 = 0; var17 < 16; var17++) {
                              class_2680 var18 = var13.method_12254(var17, var15, var16);
                              if (var18.method_31709()) {
                                 class_2248 var20 = var18.method_26204();
                                 if (var20 instanceof class_2343) {
                                    class_2343 var19 = (class_2343)var20;
                                    var2.method_10103(var10 + var17, var14 + var15, var11 + var16);

                                    try {
                                       class_2586 var22 = var19.method_10123(var2.method_10062(), var18);
                                       if (var22 != null) {
                                          this.a(var2, var22.method_11017());
                                       }
                                    } catch (Exception var21) {
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static record a(class_2338 a, String b, long c) {
   }

   private static record b(int a, int b) {
   }

   public static record c(class_2338 a, String b, boolean c) {
   }
}
