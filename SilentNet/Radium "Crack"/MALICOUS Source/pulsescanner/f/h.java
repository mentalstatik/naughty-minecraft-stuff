package pulsescanner.f;

import pulsescanner.g.a;

public enum h {
   COMBAT,
   BASEFINDING,
   RENDER,
   ESP,
   WORLD,
   MISC,
   CLIENT;

   public final String title;
   public final a icon;
   private static final h[] a;
   private static i[] b;

   private h(String var3, a var4) {
      this.title = var3;
      this.icon = var4;
   }

   private static h[] a() {
      return new h[]{COMBAT, BASEFINDING, RENDER, ESP, WORLD, MISC, CLIENT};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[14];
      int var4 = 0;
      String var3 = "]L72G%\u0006LF44C#\u0005IL(<B\u0006]O35H%\u000b\\b\t\u0015`\u0018;Zj\u0014\u0017\u0006]o\u0013\u0015h\u0005\u0006Lf\u0014\u0014c\u0003\u0004Sj\t\u0013\u0004SJ)3\u0003[p\n\u0005Il\b\u001cb\f\\B)5\u0006\u0017\u001cpG3>A";
      int var5 = "]L72G%\u0006LF44C#\u0005IL(<B\u0006]O35H%\u000b\\b\t\u0015`\u0018;Zj\u0014\u0017\u0006]o\u0013\u0015h\u0005\u0006Lf\u0014\u0014c\u0003\u0004Sj\t\u0013\u0004SJ)3\u0003[p\n\u0005Il\b\u001cb\f\\B)5\u0006\u0017\u001cpG3>A"
         .length();
      b(null);
      char var2 = 6;
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 77;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
            char[] var20 = var10001.toCharArray();
            int var10004 = var20.length;
            byte var21 = var10000;
            char[] var16 = var20;
            int var12 = var10004;

            for (int var6 = 0; var12 > var6; var6++) {
               var16[var6] = (char)(var16[var6] ^ var21 ^ switch (var6 % 7) {
                  case 0 -> 83;
                  case 1 -> 110;
                  case 2 -> 23;
                  case 3 -> 29;
                  case 4 -> 107;
                  case 5 -> 28;
                  default -> 56;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     COMBAT = new h(var0[0], pulsescanner.g.a.SWORD);
                     BASEFINDING = new h(var0[11], pulsescanner.g.a.SEARCH);
                     RENDER = new h(var0[1], pulsescanner.g.a.EYE);
                     ESP = new h(var0[9], pulsescanner.g.a.TARGET);
                     WORLD = new h(var0[2], pulsescanner.g.a.GLOBE);
                     MISC = new h(var0[8], pulsescanner.g.a.GRID);
                     CLIENT = new h(var0[3], pulsescanner.g.a.GEAR);
                     a = a();
                     return;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var23;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label44;
                  }

                  var3 = "Fw\f\t|\u001e\u0003@k\u0011";
                  var5 = "Fw\f\t|\u001e\u0003@k\u0011".length();
                  var2 = 6;
                  var8 = -1;
            }

            var10000 = 86;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }

   public static void b(i[] var0) {
      b = var0;
   }

   public static i[] b() {
      return b;
   }
}
