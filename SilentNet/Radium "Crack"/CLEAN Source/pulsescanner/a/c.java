package pulsescanner.a;

public enum c {
   UNIVERSAL,
   GRIM,
   SNAP,
   HVH;

   private final al a;
   private final String b;

   public al a() {
      return this.a;
   }

   private c(String var3, al var4) {
      this.b = var3;
      this.a = var4;
   }

   public String b() {
      return this.b;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[8];
      int var4 = 0;
      String var3 = "Z/k\tG7jSW/BS5\u0004U\u000bJh\u0004A7bU\u0004A\u0017Bu\tG\u0017Jsw\u000fbs\u0015";
      int var5 = "Z/k\tG7jSW/BS5\u0004U\u000bJh\u0004A7bU\u0004A\u0017Bu\tG\u0017Jsw\u000fbs\u0015".length();
      char var2 = 3;
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 52;
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
                  case 0 -> 38;
                  case 1 -> 77;
                  case 2 -> 23;
                  case 3 -> 49;
                  case 4 -> 38;
                  case 5 -> 73;
                  default -> 37;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     UNIVERSAL = new c(var0[5], new ar());
                     GRIM = new c(var0[2], new aa());
                     SNAP = new c(var0[4], new ap());
                     HVH = new c(var0[6], new ab());
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

                  var3 = "c6R\u0004l\u0012Sq";
                  var5 = "c6R\u0004l\u0012Sq".length();
                  var2 = 3;
                  var8 = -1;
            }

            var10000 = 13;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
