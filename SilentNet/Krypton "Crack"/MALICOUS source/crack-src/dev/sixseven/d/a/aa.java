package dev.sixseven.d.a;

import net.minecraft.class_310;
import net.minecraft.class_746;

public class aa extends dev.sixseven.d.c {
   public static final int a = 9;
   private static final double f = 50000.0;
   private static final double g = 225000.0;
   private static final String[] h = new String[]{"EU-C", "EU-W", "NA-E", "NA-W", "Asia", "Oce"};
   private static final int[] i = new int[]{a(159, 206, 99), a(0, 166, 99), a(79, 173, 234), a(47, 110, 186), a(245, 194, 66), a(252, 136, 3)};
   private static final int[][] j = new int[][]{
      {82, 5},
      {100, 3},
      {101, 3},
      {102, 3},
      {103, 2},
      {104, 2},
      {105, 2},
      {106, 2},
      {91, 2},
      {83, 5},
      {44, 3},
      {75, 3},
      {42, 3},
      {41, 2},
      {40, 2},
      {39, 2},
      {38, 2},
      {92, 2},
      {84, 5},
      {45, 3},
      {14, 3},
      {13, 3},
      {12, 2},
      {11, 2},
      {10, 2},
      {37, 2},
      {93, 2},
      {85, 5},
      {46, 5},
      {74, 5},
      {3, 3},
      {2, 2},
      {1, 2},
      {25, 2},
      {36, 2},
      {94, 2},
      {86, 4},
      {47, 4},
      {72, 4},
      {71, 4},
      {5, 2},
      {4, 2},
      {24, 2},
      {35, 2},
      {95, 2},
      {87, 4},
      {51, 1},
      {17, 1},
      {9, 0},
      {8, 0},
      {7, 0},
      {23, 0},
      {34, 0},
      {96, 2},
      {88, 4},
      {54, 1},
      {18, 1},
      {61, 0},
      {62, 0},
      {21, 0},
      {22, 0},
      {33, 0},
      {97, 0},
      {89, 0},
      {26, 1},
      {27, 0},
      {28, 0},
      {29, 0},
      {30, 0},
      {59, 0},
      {32, 0},
      {98, 0},
      {90, 0},
      {107, 1},
      {108, 1},
      {109, 1},
      {110, 1},
      {111, 1},
      {112, 1},
      {113, 1},
      {99, 0}
   };
   private static final int[] k = new int[81];
   private static final int[] l = new int[81];
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Opacity", "Region cell fill opacity.", 90.0, 10.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Grid Lines", "Draw the accent lines between region cells.", true));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Cell Numbers", "Show each region's ID number in its cell.", true));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Legend", "Show the region-type colour legend below the grid.", true));

   public aa() {
      super("RegionMap", "DonutSMP server region map on the HUD.", dev.sixseven.d.b.d);
   }

   private static int a(int r, int g, int b) {
      return r << 16 | gx << 8 | bx;
   }

   public boolean k() {
      return true;
   }

   public int l() {
      return 9;
   }

   public int m() {
      return h.length;
   }

   public String b(int type) {
      return type >= 0 && type < h.length ? h[type] : "";
   }

   public int c(int type) {
      return type >= 0 && type < i.length ? i[type] : 16777215;
   }

   public int d(int index) {
      return index >= 0 && index < l.length ? l[index] : -1;
   }

   public int e(int index) {
      return index >= 0 && index < k.length ? k[index] : -1;
   }

   public int[] a(double worldX, double worldZ) {
      int var5 = (int)Math.floor((worldX + 225000.0) / 50000.0);
      int var6 = (int)Math.floor((worldZ + 225000.0) / 50000.0);
      return new int[]{var5, var6};
   }

   public double[] b(double worldX, double worldZ) {
      double var5 = (worldX + 225000.0) % 50000.0 / 50000.0;
      double var7 = (worldZ + 225000.0) % 50000.0 / 50000.0;
      if (var5 < 0.0) {
         var5++;
      }

      if (var7 < 0.0) {
         var7++;
      }

      return new double[]{Math.clamp(var5, 0.0, 1.0), Math.clamp(var7, 0.0, 1.0)};
   }

   public int c(double worldX, double worldZ) {
      int[] var5 = this.a(worldX, worldZ);
      return var5[0] >= 0 && var5[0] < 9 && var5[1] >= 0 && var5[1] < 9 ? this.e(var5[1] * 9 + var5[0]) : -1;
   }

   public int d(double worldX, double worldZ) {
      int[] var5 = this.a(worldX, worldZ);
      return var5[0] >= 0 && var5[0] < 9 && var5[1] >= 0 && var5[1] < 9 ? this.d(var5[1] * 9 + var5[0]) : -1;
   }

   public int n() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 == null ? -1 : this.c(var1.method_23317(), var1.method_23321());
   }

   static {
      for (int var0 = 0; var0 < j.length && var0 < k.length; var0++) {
         if (j[var0].length >= 2) {
            k[var0] = j[var0][0];
            l[var0] = Math.min(j[var0][1], h.length - 1);
         } else {
            l[var0] = -1;
         }
      }
   }
}
