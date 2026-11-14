package pulsescanner.f.a.a;

public enum b {
   NORMAL,
   EMPTY_MASK,
   ZEROED_PRESENT,
   UNIFORM_MAX,
   MISSING,
   UNKNOWN;

   private final int a;
   private final int b;
   private final int c;
   private static int e;

   private b(int var3, int var4, int var5) {
      this.a = var3;
      this.b = var4;
      this.c = var5;
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[6];
      int var4 = 0;
      String var3 = "/HLM-w\u0018\u000e CUL'd\t*TBP'n\u0002\n?KWW;\u007f\u001b;UL\u00064IUN#l";
      int var5 = "/HLM-w\u0018\u000e CUL'd\t*TBP'n\u0002\n?KWW;\u007f\u001b;UL\u00064IUN#l".length();
      char var2 = 7;
      b(0);
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 36;
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
                  case 0 -> 94;
                  case 1 -> 34;
                  case 2 -> 35;
                  case 3 -> 39;
                  case 4 -> 70;
                  case 5 -> 4;
                  default -> 114;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     NORMAL = new b(0, 220, 0);
                     EMPTY_MASK = new b(255, 220, 0);
                     ZEROED_PRESENT = new b(255, 40, 40);
                     UNIFORM_MAX = new b(0, 220, 255);
                     MISSING = new b(140, 140, 140);
                     UNKNOWN = new b(80, 80, 80);
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

                  var3 = "R538P\u000ffX6;&\u0007J2)-V\u0013l";
                  var5 = "R538P\u000ffX6;&\u0007J2)-V\u0013l".length();
                  var2 = 11;
                  var8 = -1;
            }

            var10000 = 89;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }

   public static void b(int var0) {
      e = var0;
   }

   public static int e() {
      return e;
   }

   public static int f() {
      int var0 = e();
      return var0 == 0 ? 118 : 0;
   }
}
