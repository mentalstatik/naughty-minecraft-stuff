package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_7923;

public final class m extends dev.sixseven.d.c {
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 4;
   private static final int q = 8;
   private static final int r = 8192;
   private static final int s = 7200;
   private static final int t = 10;
   private static final int u = 40;
   private static final int v = 10;
   private static final int w = 20;
   private static final int x = 6;
   public final dev.sixseven.i.c a = this.a(new dev.sixseven.i.c("Color", "Base candidate fill, border and zone marker color", -11943937));
   public final dev.sixseven.i.h b = this.a(
      new dev.sixseven.i.h("Chunk Radius", "Maximum radius around you; only chunks already loaded by the game are scanned", 12.0, 2.0, 32.0, 1.0, " ch")
   );
   public final dev.sixseven.i.h c = this.a(
      new dev.sixseven.i.h("Scan Speed", "Maximum chunk sections processed per tick; adapts upward while flying fast", 12.0, 2.0, 48.0, 1.0)
   );
   public final dev.sixseven.i.h d = this.a(
      new dev.sixseven.i.h("Minimum Score", "Raise this to reduce false positives; lower it to catch smaller stashes", 10.0, 4.0, 40.0, 1.0)
   );
   public final dev.sixseven.i.h e = this.a(
      new dev.sixseven.i.h("Merge Radius", "Nearby suspicious chunks are grouped into one zone", 2.0, 1.0, 8.0, 1.0, " ch")
   );
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Render Y", "Height of the map-style chunk overlay", 80.0, -64.0, 320.0, 1.0));
   public final dev.sixseven.i.h g = this.a(new dev.sixseven.i.h("Opacity", "Opacity of candidate chunk overlays", 150.0, 20.0, 255.0, 5.0));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Storage", "Containers, shulkers and stash blocks", true));
   public final dev.sixseven.i.b i = this.a(new dev.sixseven.i.b("Utility", "Crafting, smelting and workstation blocks", true));
   public final dev.sixseven.i.b j = this.a(new dev.sixseven.i.b("Automation", "Hoppers, redstone and transport machinery", true));
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Build Materials", "Signs, beds, glass, colored blocks and other build evidence", true));
   public final dev.sixseven.i.b l = this.a(new dev.sixseven.i.b("Entity Evidence", "Villagers, item frames, armor stands and storage minecarts", true));
   public final dev.sixseven.i.b m = this.a(new dev.sixseven.i.b("Notifications", "Alert once when a new suspicious base zone is found", true));
   private final IdentityHashMap<class_2248, Integer> y = u();
   private final IdentityHashMap<class_1299<?>, Integer> z = v();
   private final LinkedHashMap<Long, m.b> A = new LinkedHashMap<>(256, 0.75F, true);
   private final LinkedHashMap<Long, Integer> B = new LinkedHashMap<>(256, 0.75F, true);
   private final ArrayDeque<Long> C = new ArrayDeque<>();
   private final Set<Long> D = new HashSet<>();
   private final Set<Long> E = new HashSet<>();
   private final Set<Long> F = ConcurrentHashMap.newKeySet();
   private final Map<Long, m.c> G = new HashMap<>();
   private volatile List<m.d> H = List.of();
   private volatile List<m.e> I = List.of();
   private int[][] J = new int[0][2];
   private Object K;
   private class_1923 L;
   private int M = -1;
   private int N = -1;
   private int O;
   private int P;
   private int Q;
   private int R = -10;
   private boolean S = true;
   private long T = Long.MIN_VALUE;
   private int U;
   private m.b V;

   public m() {
      super("BaseFinder", "Ranks suspicious loaded chunks using containers, workstations, redstone, builds and entity evidence", dev.sixseven.d.b.d);
      this.b(this.b.e());
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
      if (var1.field_1687 != null && var1.field_1724 != null) {
         if (this.K != var1.field_1687) {
            this.k();
            this.K = var1.field_1687;
         }

         this.O++;
         int var2 = this.r();
         if (var2 != this.N) {
            this.N = var2;
            this.A.clear();
            this.B.clear();
            this.C.clear();
            this.D.clear();
            this.w();
            this.L = null;
            this.S = true;
         }

         if (var2 == 0) {
            this.H = List.of();
            this.I = List.of();
         } else {
            class_1923 var3 = var1.field_1724.method_31476();
            int var4 = this.b.e();
            if (var4 != this.M) {
               this.M = var4;
               this.b(var4);
               this.L = null;
            }

            int var5 = c(var1) ? 1 : 2;
            boolean var6 = this.L == null || Math.max(Math.abs(var3.field_9181 - this.L.field_9181), Math.abs(var3.field_9180 - this.L.field_9180)) >= var5;
            if (var6 || this.C.isEmpty() && this.O - this.P >= 20) {
               this.a(var3);
            }

            this.s();
            if (this.l.i()) {
               if (this.O - this.Q >= 40) {
                  this.b(var1);
               }
            } else if (!this.G.isEmpty()) {
               this.G.clear();
               this.S = true;
            }

            this.a(var1, var2);
            if (this.O % 10 == 0) {
               this.S = true;
            }

            if (this.S && this.O - this.R >= 10) {
               this.t();
               this.R = this.O;
               this.S = false;
            }
         }
      } else {
         if (this.K != null) {
            this.k();
         }
      }
   }

   private int r() {
      byte var1 = 0;
      if (this.h.i()) {
         var1 |= 1;
      }

      if (this.i.i()) {
         var1 |= 2;
      }

      if (this.j.i()) {
         var1 |= 4;
      }

      if (this.k.i()) {
         var1 |= 8;
      }

      return var1;
   }

   private void b(int var1) {
      ArrayList var2 = new ArrayList((var1 * 2 + 1) * (var1 * 2 + 1));

      for (int var3 = -var1; var3 <= var1; var3++) {
         for (int var4 = -var1; var4 <= var1; var4++) {
            var2.add(new m.a(var3, var4));
         }
      }

      var2.sort(Comparator.comparingInt(var0 -> var0.a * var0.a + var0.b * var0.b));
      this.J = new int[var2.size()][2];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         this.J[var5][0] = ((m.a)var2.get(var5)).a;
         this.J[var5][1] = ((m.a)var2.get(var5)).b;
      }
   }

   private void a(class_1923 var1) {
      this.L = var1;
      this.P = this.O;
      this.C.clear();
      this.D.clear();

      for (int[] var5 : this.J) {
         long var6 = class_1923.method_8331(var1.field_9181 + var5[0], var1.field_9180 + var5[1]);
         Integer var8 = this.B.get(var6);
         if (var8 == null || this.O - var8 >= 7200) {
            this.a(var6);
         }
      }
   }

   private void a(long var1) {
      if (this.D.add(var1)) {
         this.C.addLast(var1);
      }
   }

   private void s() {
      for (long var2 : this.F) {
         if (this.F.remove(var2)) {
            this.A.remove(Long.valueOf(var2));
            this.B.remove(Long.valueOf(var2));
            if (this.T == var2) {
               this.w();
            }

            if (this.D.add(var2)) {
               this.C.addFirst(var2);
            }
         }
      }
   }

   private void a(class_310 var1, int var2) {
      boolean var3 = c(var1);
      int var4 = this.c.e();
      if (var3) {
         var4 = Math.min(64, var4 * 2);
      }

      long var5 = System.nanoTime() + (var3 ? 3500000L : 2500000L);
      int var7 = 0;

      while (var7 < var4 && System.nanoTime() < var5 && (this.T != Long.MIN_VALUE || this.a(var1))) {
         class_2818 var8 = var1.field_1687.method_2935().method_12126(class_1923.method_8325(this.T), class_1923.method_8332(this.T), false);
         if (var8 == null) {
            this.w();
         } else {
            class_2826[] var9 = var8.method_12006();
            if (this.U >= var9.length) {
               this.a(this.T, this.V);
            } else {
               class_2826 var10 = var9[this.U];
               int var11 = var8.method_32891() + this.U;
               this.U++;
               var7++;
               if (var10 != null && !var10.method_38292()) {
                  this.a(var10, var11, var2, this.V);
               }
            }
         }
      }
   }

   private boolean a(class_310 var1) {
      while (!this.C.isEmpty()) {
         long var2 = this.C.removeFirst();
         this.D.remove(var2);
         class_2818 var4 = var1.field_1687.method_2935().method_12126(class_1923.method_8325(var2), class_1923.method_8332(var2), false);
         if (var4 != null) {
            this.T = var2;
            this.U = 0;
            this.V = new m.b();
            return true;
         }
      }

      return false;
   }

   private void a(class_2826 var1, int var2, int var3, m.b var4) {
      Predicate var5 = var2x -> (this.y.getOrDefault(var2x.method_26204(), Integer.valueOf(0)) & var3) != 0;
      if (var1.method_12265().method_19526(var5)) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = (var2 << 4) + var6;

            for (int var8 = 0; var8 < 16; var8++) {
               for (int var9 = 0; var9 < 16; var9++) {
                  class_2680 var10 = var1.method_12254(var9, var6, var8);
                  int var11 = this.y.getOrDefault(var10.method_26204(), Integer.valueOf(0)) & var3;
                  if ((var11 & 1) != 0) {
                     var4.a++;
                  }

                  if ((var11 & 2) != 0) {
                     var4.b++;
                  }

                  if ((var11 & 4) != 0) {
                     var4.c++;
                  }

                  if ((var11 & 8) != 0) {
                     var4.d++;
                     if (var7 >= 180) {
                        var4.e++;
                     }
                  }
               }
            }
         }
      }
   }

   private void a(long var1, m.b var3) {
      this.A.put(Long.valueOf(var1), var3);
      this.B.put(Long.valueOf(var1), Integer.valueOf(this.O));

      while (this.A.size() > 8192) {
         Long var4 = this.A.keySet().iterator().next();
         this.A.remove(var4);
         this.B.remove(var4);
      }

      this.S = true;
      this.w();
   }

   private void b(class_310 var1) {
      this.Q = this.O;
      this.G.clear();
      if (this.l.i()) {
         for (class_1297 var3 : var1.field_1687.method_18112()) {
            Integer var4 = this.z.get(var3.method_5864());
            if (var4 != null && var4 != 0) {
               int var5 = (int)Math.floor(var3.method_23317());
               int var6 = (int)Math.floor(var3.method_23321());
               long var7 = class_1923.method_8331(var5 >> 4, var6 >> 4);
               m.c var9 = this.G.computeIfAbsent(var7, var0 -> new m.c());
               if ((var4 & 1) != 0) {
                  var9.a++;
               }

               if ((var4 & 2) != 0) {
                  var9.b++;
               }

               if ((var4 & 4) != 0) {
                  var9.c++;
               }
            }
         }
      }

      this.S = true;
   }

   private void t() {
      int var1 = this.d.e();
      HashMap var2 = new HashMap();
      HashSet var3 = new HashSet();
      dev.sixseven.d.d var4 = SixSevenClient.modules();
      if (var4 != null && var4.e != null && var4.e.f()) {
         for (dev.sixseven.l.b.b var6 : var4.e.s.a()) {
            int var7 = Math.min(20, (int)Math.ceil(var6.b() * 0.5));
            if (var7 > 0) {
               var2.merge(var6.a(), var7, Math::max);
            }
         }
      }

      if (var4 != null && var4.ad != null && var4.ad.f()) {
         var3.addAll(var4.ad.k());
      }

      HashSet var23 = new HashSet<>(this.A.keySet());
      var23.addAll(var2.keySet());
      var23.addAll(var3);
      HashMap var24 = new HashMap();

      for (long var8 : var23) {
         m.b var10 = this.A.get(var8);
         m.c var11 = this.G.get(var8);
         int var12 = var11 == null ? 0 : var11.a();
         int var13 = var10 == null ? 0 : var10.a;
         int var14 = var10 == null ? 0 : var10.b;
         int var15 = var10 == null ? 0 : var10.c;
         int var16 = var10 == null ? 0 : var10.d;
         int var17 = var10 == null ? 0 : var10.e;
         int var18 = var2.getOrDefault(var8, 0);
         int var19 = var3.contains(var8) ? 6 : 0;
         int var20 = var10 == null ? 0 : var10.a();
         int var21 = var18 <= 0 || var20 <= 0 && var12 <= 0 ? 0 : Math.min(8, var18 / 2);
         int var22 = var20 + var12 + var18 + var19 + var21;
         if (var22 >= var1) {
            var24.put(var8, new m.d(var8, var22, var13, var14, var15, var16, var17, var12, var18, var19, var21));
         }
      }

      ArrayList var26 = new ArrayList(var24.values());
      var26.sort(Comparator.comparingInt(m.d::b).reversed().thenComparingLong(m.d::a));
      this.H = List.copyOf(var26);
      this.I = this.a(var24);
      this.a(this.I, var24);
   }

   private void a(List<m.e> var1, Map<Long, m.d> var2) {
      if (this.m.i()) {
         class_310 var3 = class_310.method_1551();
         if (var3.field_1724 != null) {
            for (m.e var5 : var1) {
               boolean var6 = false;

               for (long var8 : var5.a()) {
                  if (this.E.contains(var8)) {
                     var6 = true;
                     break;
                  }
               }

               this.E.addAll(var5.a());
               if (!var6) {
                  int var17 = (int)Math.round(var5.b());
                  int var18 = (int)Math.round(var5.c());
                  int var9 = (int)Math.hypot((double)var17 - var3.field_1724.method_23317(), (double)var18 - var3.field_1724.method_23321());
                  int var10 = 0;
                  int var11 = 0;
                  boolean var12 = false;

                  for (long var14 : var5.a()) {
                     m.d var16 = (m.d)var2.get(var14);
                     if (var16 != null) {
                        var10 += var16.c();
                        var11 = Math.max(var11, var16.i());
                        var12 |= var16.j() > 0;
                     }
                  }

                  StringBuilder var19 = new StringBuilder("Base Finder · ");
                  var19.append(var5.a().size() == 1 ? "candidate" : var5.a().size() + " chunks");
                  var19.append(" · ").append(var17).append(", ").append(var18).append(" · ").append(var9).append("m · score ").append(var5.d());
                  if (var10 > 0) {
                     var19.append(" · storage ").append(var10);
                  }

                  if (var11 > 0) {
                     var19.append(" · SusChunk");
                  }

                  if (var12) {
                     var19.append(" · rare signal");
                  }

                  dev.sixseven.f.a var20 = SixSevenClient.notifications();
                  if (var20 != null) {
                     var20.a(var19.toString());
                  }

                  dev.sixseven.n.h.c(true);
               }
            }
         }
      }
   }

   private List<m.e> a(Map<Long, m.d> var1) {
      if (var1.isEmpty()) {
         return List.of();
      } else {
         int var2 = Math.max(1, this.e.e());
         HashSet var3 = new HashSet();
         ArrayList var4 = new ArrayList();

         for (m.d var6 : var1.values()) {
            if (var3.add(var6.a())) {
               ArrayDeque var7 = new ArrayDeque();
               ArrayList var8 = new ArrayList();
               var7.add(var6.a());
               int var9 = 0;
               int var10 = 0;
               double var11 = 0.0;
               double var13 = 0.0;

               while (!var7.isEmpty()) {
                  long var15 = (Long)var7.removeFirst();
                  m.d var17 = (m.d)var1.get(var15);
                  if (var17 != null) {
                     var8.add(var15);
                     var9 = Math.max(var9, var17.b());
                     var10 += var17.b();
                     double var18 = (double)var17.b();
                     var11 += ((double)class_1923.method_8325(var15) * 16.0 + 8.0) * var18;
                     var13 += ((double)class_1923.method_8332(var15) * 16.0 + 8.0) * var18;
                     int var20 = class_1923.method_8325(var15);
                     int var21 = class_1923.method_8332(var15);

                     for (int var22 = -var2; var22 <= var2; var22++) {
                        for (int var23 = -var2; var23 <= var2; var23++) {
                           long var24 = class_1923.method_8331(var20 + var22, var21 + var23);
                           if ((var22 != 0 || var23 != 0) && var1.containsKey(var24) && var3.add(var24)) {
                              var7.addLast(var24);
                           }
                        }
                     }
                  }
               }

               var4.add(new m.e(Set.copyOf(var8), var11 / (double)var10, var13 / (double)var10, var9, var10));
            }
         }

         var4.sort(Comparator.comparingInt(m.e::e).reversed());
         return List.copyOf(var4);
      }
   }

   private static IdentityHashMap<class_2248, Integer> u() {
      IdentityHashMap var0 = new IdentityHashMap();

      for (class_2248 var2 : class_7923.field_41175) {
         class_2960 var3 = class_7923.field_41175.method_10221(var2);
         if (var3 != null && "minecraft".equals(var3.method_12836())) {
            int var4 = a(var3.method_12832());
            if (var4 != 0) {
               var0.put(var2, var4);
            }
         }
      }

      return var0;
   }

   private static int a(String var0) {
      byte var1 = 0;
      if (var0.equals("chest") || var0.equals("trapped_chest") || var0.equals("barrel") || var0.equals("ender_chest") || var0.endsWith("_shulker_box")) {
         var1 |= 1;
      }

      if (var0.equals("crafting_table")
         || var0.equals("furnace")
         || var0.equals("blast_furnace")
         || var0.equals("smoker")
         || var0.equals("enchanting_table")
         || var0.contains("anvil")
         || var0.equals("smithing_table")
         || var0.equals("stonecutter")
         || var0.equals("cartography_table")
         || var0.equals("loom")
         || var0.equals("grindstone")
         || var0.equals("brewing_stand")
         || var0.equals("beacon")
         || var0.equals("lectern")
         || var0.equals("bell")
         || var0.equals("respawn_anchor")) {
         var1 |= 2;
      }

      if (var0.equals("hopper")
         || var0.equals("dispenser")
         || var0.equals("dropper")
         || var0.equals("observer")
         || var0.equals("piston")
         || var0.equals("sticky_piston")
         || var0.equals("repeater")
         || var0.equals("comparator")
         || var0.equals("redstone_wire")
         || var0.equals("redstone_block")
         || var0.equals("lever")
         || var0.equals("tripwire_hook")
         || var0.equals("daylight_detector")
         || var0.equals("target")
         || var0.equals("crafter")
         || var0.equals("sculk_sensor")
         || var0.equals("calibrated_sculk_sensor")
         || var0.equals("copper_bulb")
         || var0.equals("exposed_copper_bulb")
         || var0.equals("weathered_copper_bulb")
         || var0.equals("oxidized_copper_bulb")
         || var0.endsWith("_rail")) {
         var1 |= 4;
      }

      if (var0.endsWith("_sign")
         || var0.endsWith("_banner")
         || var0.endsWith("_bed")
         || var0.endsWith("_stained_glass")
         || var0.equals("glass")
         || var0.endsWith("_glass_pane")
         || var0.endsWith("_concrete")
         || var0.endsWith("_wool")
         || var0.endsWith("_terracotta")
         || var0.endsWith("_glazed_terracotta")
         || var0.endsWith("_planks")
         || var0.endsWith("_door")
         || var0.endsWith("_trapdoor")
         || var0.equals("obsidian")
         || var0.equals("crying_obsidian")
         || var0.equals("note_block")
         || var0.equals("jukebox")
         || var0.equals("ladder")
         || var0.equals("scaffolding")
         || var0.equals("iron_bars")
         || var0.equals("lantern")
         || var0.equals("soul_lantern")
         || var0.equals("campfire")
         || var0.equals("soul_campfire")
         || var0.equals("flower_pot")
         || var0.equals("decorated_pot")
         || var0.equals("chain")
         || var0.equals("torch")
         || var0.equals("soul_torch")
         || var0.endsWith("_stairs")
         || var0.endsWith("_slab")
         || var0.endsWith("_fence")
         || var0.endsWith("_fence_gate")
         || var0.endsWith("_wall")
         || var0.endsWith("_candle")
         || var0.endsWith("_carpet")) {
         var1 |= 8;
      }

      return var1;
   }

   private static IdentityHashMap<class_1299<?>, Integer> v() {
      IdentityHashMap var0 = new IdentityHashMap();

      for (class_1299 var2 : class_7923.field_41177) {
         class_2960 var3 = class_7923.field_41177.method_10221(var2);
         if (var3 != null && "minecraft".equals(var3.method_12836())) {
            String var4 = var3.method_12832();
            byte var5 = 0;
            if (var4.equals("villager") || var4.equals("wandering_trader") || var4.equals("iron_golem")) {
               var5 |= 1;
            }

            if (var4.equals("item_frame") || var4.equals("glow_item_frame") || var4.equals("armor_stand") || var4.equals("painting")) {
               var5 |= 2;
            }

            if (var4.equals("chest_minecart") || var4.equals("hopper_minecart")) {
               var5 |= 4;
            }

            if (var5 != 0) {
               var0.put(var2, Integer.valueOf(var5));
            }
         }
      }

      return var0;
   }

   private static boolean c(class_310 var0) {
      double var1 = var0.field_1724.method_18798().field_1352;
      double var3 = var0.field_1724.method_18798().field_1350;
      return var1 * var1 + var3 * var3 >= 0.16;
   }

   public void a(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      if (this.A.containsKey(Long.valueOf(var3)) || this.T == var3) {
         this.F.add(var3);
      }
   }

   private void w() {
      this.T = Long.MIN_VALUE;
      this.U = 0;
      this.V = null;
   }

   public void k() {
      this.A.clear();
      this.B.clear();
      this.C.clear();
      this.D.clear();
      this.E.clear();
      this.F.clear();
      this.G.clear();
      this.H = List.of();
      this.I = List.of();
      this.L = null;
      this.M = -1;
      this.N = -1;
      this.O = 0;
      this.P = 0;
      this.Q = 0;
      this.R = -10;
      this.S = true;
      this.K = null;
      this.w();
   }

   public List<m.d> l() {
      return this.H;
   }

   public List<m.e> m() {
      return this.I;
   }

   public int n() {
      return this.d.e();
   }

   public float o() {
      return this.g.d();
   }

   public double p() {
      return this.f.i();
   }

   public double q() {
      return (double)this.b.e();
   }

   private static record a(int a, int b) {
   }

   private static final class b {
      int a;
      int b;
      int c;
      int d;
      int e;

      int a() {
         return Math.min(this.a, 10) * 6 + Math.min(this.b, 16) * 2 + Math.min(this.c, 16) * 3 + Math.min(this.d, 24) / 2 + Math.min(this.e, 8) * 2;
      }
   }

   private static final class c {
      int a;
      int b;
      int c;

      int a() {
         return Math.min(this.a, 4) * 2 + Math.min(this.b, 4) * 2 + Math.min(this.c, 3) * 3;
      }
   }

   public static record d(long a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k) {
   }

   public static record e(Set<Long> a, double b, double c, int d, int e) {
   }
}
