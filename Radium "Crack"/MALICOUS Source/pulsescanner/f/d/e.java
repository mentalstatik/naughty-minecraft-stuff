package pulsescanner.f.d;

import java.util.List;

public class e extends pulsescanner.f.k {
   private static final String[] F;

   public e() {
      String[] var1 = F;
      super(var1[1], var1[2], 0, 0, 4.0F, 24.0F);
   }

   @Override
   protected List<String[]> w() {
      return List.of(new String[]{F[0], String.valueOf(a.method_47599())});
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "hy\u0000\u0003hy\u0000\u0012h[2\u007f#H:^L!25^yAG7<";
      int var4 = "hy\u0000\u0003hy\u0000\u0012h[2\u007f#H:^L!25^yAG7<".length();
      char var1 = 3;
      int var0 = -1;

      while (true) {
         char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 106;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 68;
               case 1 -> 67;
               case 2 -> 57;
               case 3 -> 120;
               case 4 -> 44;
               case 5 -> 81;
               default -> 112;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            F = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}
