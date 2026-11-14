package pulsescanner.f.d;

import java.util.List;
import java.util.Locale;

public class i extends pulsescanner.f.k {
   private static final String[] F;

   public i() {
      String[] var1 = F;
      super(var1[2], var1[3], 0, 0, 4.0F, 60.0F);
   }

   @Override
   protected List<String[]> w() {
      String[] var10000 = new String[2];
      String[] var1 = F;
      var10000[0] = var1[0];
      var10000[1] = String.format(Locale.ROOT, var1[1], pulsescanner.d.f.d());
      return List.of(var10000);
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "K$\u0004\u0004:Zf\u000b";
      int var4 = "K$\u0004\u0004:Zf\u000b".length();
      char var1 = 3;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 101;
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
                  case 0 -> 122;
                  case 1 -> 17;
                  case 2 -> 50;
                  case 3 -> 8;
                  case 4 -> 56;
                  case 5 -> 102;
                  default -> 70;
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

                  var2 = "t\u001b;\"e8\u001c;\u000f]hE/H!\u0007NjE9H&\u000b_wSk\u00187\u0010\u001coE(\u0007<\u0006\u0012";
                  var4 = "t\u001b;\"e8\u001c;\u000f]hE/H!\u0007NjE9H&\u000b_wSk\u00187\u0010\u001coE(\u0007<\u0006\u0012".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 90;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
