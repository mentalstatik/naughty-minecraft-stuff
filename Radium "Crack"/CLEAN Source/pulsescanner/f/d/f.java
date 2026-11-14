package pulsescanner.f.d;

import java.util.List;

public class f extends pulsescanner.f.k {
   private static final String[] F;

   public f() {
      String[] var1 = F;
      super(var1[1], var1[2], 0, 0, 4.0F, 42.0F);
   }

   @Override
   protected List<String[]> w() {
      String[] var10000 = new String[2];
      String[] var1 = F;
      var10000[0] = var1[0];
      var10000[1] = pulsescanner.d.f.f() + var1[3];
      return List.of(var10000);
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0018FLU\u0004\u0018FLU";
      int var4 = "\u0018FLU\u0004\u0018FLU".length();
      char var1 = 4;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 92;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            char[] var20 = var10001.toCharArray();
            int var10004 = var20.length;
            byte var21 = var10000;
            char[] var16 = var20;
            int var12 = var10004;

            for (int var6 = 0; var12 > var6; var6++) {
               var16[var6] = (char)(var16[var6] ^ var21 ^ switch (var6 % 7) {
                  case 0 -> 20;
                  case 1 -> 115;
                  case 2 -> 126;
                  case 3 -> 110;
                  case 4 -> 97;
                  case 5 -> 100;
                  default -> 44;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     F = var5;
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var23;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label43;
                  }

                  var2 = "g6!6k\"gJ<:'2nrQy ,.nu[+\"!9`\u0003\u001e4'";
                  var4 = "g6!6k\"gJ<:'2nrQy ,.nu[+\"!9`\u0003\u001e4'".length();
                  var1 = 27;
                  var8 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
