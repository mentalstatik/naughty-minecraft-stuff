package pulsescanner.f.d;

import java.util.List;
import java.util.Locale;

public class h extends pulsescanner.f.k {
   public final pulsescanner.i.f F;
   private static final String[] G;

   public h() {
      String[] var1 = G;
      super(var1[8], var1[9], 0, 0, 4.0F, 96.0F);
      this.F = this.a(new pulsescanner.i.f(var1[6], var1[0], var1[5], var1[10], var1[4]));
   }

   @Override
   protected List<String[]> w() {
      double var1 = pulsescanner.d.f.h();

      String var10000;
      label17: {
         try {
            if (this.F.a(G[7])) {
               var10000 = String.format(Locale.ROOT, G[1], var1 * 3.6);
               break label17;
            }
         } catch (MatchException var5) {
            throw a(var5);
         }

         String[] var4 = G;
         var10000 = String.format(Locale.ROOT, var4[3], var1);
      }

      String var3 = var10000;
      return List.of(new String[]{G[2], var3});
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "A\u0005*QuK\u0000|\u001c;\u001a\t7[~R1\u0000\u0018=\u001d\u0005A\u0005*Qu\b7[}R1\u0006Za\u0004y\u0018`\\\u0003\u007fZ<\u0004G\u001b&@\u0004y\u0018`\\\u000bA\u0005*Qu\u0004\u0018w\u0001*F";
      int var4 = "A\u0005*QuK\u0000|\u001c;\u001a\t7[~R1\u0000\u0018=\u001d\u0005A\u0005*Qu\b7[}R1\u0006Za\u0004y\u0018`\\\u0003\u007fZ<\u0004G\u001b&@\u0004y\u0018`\\\u000bA\u0005*Qu\u0004\u0018w\u0001*F"
         .length();
      char var1 = 11;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 108;
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
                  case 0 -> 126;
                  case 1 -> 25;
                  case 2 -> 35;
                  case 3 -> 88;
                  case 4 -> 125;
                  case 5 -> 7;
                  default -> 25;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     G = var5;
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

                  var2 = "Z\u000b+W \u0012\u000bq\r$Jn\u000e\u0005oD-Ue\u001f\u0000-\u0003nK-";
                  var4 = "Z\u000b+W \u0012\u000bq\r$Jn\u000e\u0005oD-Ue\u001f\u0000-\u0003nK-".length();
                  var1 = 22;
                  var8 = -1;
            }

            var10000 = 125;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
