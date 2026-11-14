package pulsescanner.f.b;

import pulsescanner.f.h;
import pulsescanner.f.i;

public class f extends i {
   public final pulsescanner.i.c l;
   public final pulsescanner.i.g m;
   public final pulsescanner.i.c n;
   private static final String[] o;

   public f() {
      String[] var1 = o;
      super(var1[1], var1[5], pulsescanner.f.h.CLIENT);
      this.l = this.a(new pulsescanner.i.c(var1[6], var1[2], true));
      this.m = this.a(new pulsescanner.i.g(var1[4], var1[7], 15.0, 1.0, 60.0, 1.0)).a(this.l::a);
      this.n = this.a(new pulsescanner.i.c(var1[3], var1[0], true));
   }

   @Override
   public boolean a() {
      return false;
   }

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "E1\u000fmvPYed\u000bua\u0015\\w*\u0016qhT\nb1\u000brv\\Kzd\u0017tjAY8\u000bF!\r{kGGw*\u001cx'U%\u000f=Bey63\u0017thP\nb,\u001a=s\\Dr+\b=mFD10_{kV_e!\u001b3\u0014^-\u001bx$a_b+\rteY\nB+\u001enpF\rC*\u0019rg@Ys _[Tf?U%\u000fn$szEd\bua[\nb,\u001a=cTGsd\u0016nj\u0012^6\"\u0010~qFOrd\u001es`\u0015B\u007f \u001an$A_b+\rteY\nf+\u000fhtF\u0004";
      int var4 = "E1\u000fmvPYed\u000bua\u0015\\w*\u0016qhT\nb1\u000brv\\Kzd\u0017tjAY8\u000bF!\r{kGGw*\u001cx'U%\u000f=Bey63\u0017thP\nb,\u001a=s\\Dr+\b=mFD10_{kV_e!\u001b3\u0014^-\u001bx$a_b+\rteY\nB+\u001enpF\rC*\u0019rg@Ys _[Tf?U%\u000fn$szEd\bua[\nb,\u001a=cTGsd\u0016nj\u0012^6\"\u0010~qFOrd\u001es`\u0015B\u007f \u001an$A_b+\rteY\nf+\u000fhtF\u0004"
         .length();
      char var1 = '$';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 37;
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
                  case 0 -> 51;
                  case 1 -> 97;
                  case 2 -> 90;
                  case 3 -> 56;
                  case 4 -> 33;
                  case 5 -> 16;
                  default -> 15;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     o = var5;
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

                  var2 = "G0\u000fim\bbe?\rcl[Roy$PJ\u0018M\t1 zIG+.\niuM\u0017~7\u0004oz]Dn=L";
                  var4 = "G0\u000fim\bbe?\rcl[Roy$PJ\u0018M\t1 zIG+.\niuM\u0017~7\u0004oz]Dn=L".length();
                  var1 = 19;
                  var8 = -1;
            }

            var10000 = 56;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
