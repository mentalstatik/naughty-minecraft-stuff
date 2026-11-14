package pulsescanner.f.b;

import pulsescanner.f.h;
import pulsescanner.f.i;

public class e extends i {
   public final pulsescanner.i.c l;
   public final pulsescanner.i.g m;
   public final pulsescanner.i.f n;
   public final pulsescanner.i.c o;
   public final pulsescanner.i.c p;
   public final pulsescanner.i.c q;
   private static final String[] r;

   public e() {
      String[] var1 = r;
      super(var1[4], var1[14], pulsescanner.f.h.CLIENT);
      this.l = this.a(new pulsescanner.i.c(var1[5], var1[8], true));
      this.m = this.a(new pulsescanner.i.g(var1[6], var1[1], 2.0, 0.5, 6.0, 0.1, "s"));
      this.n = this.a(new pulsescanner.i.f(var1[10], var1[9], var1[12], var1[17], var1[2], var1[7], var1[11]));
      this.o = this.a(new pulsescanner.i.c(var1[0], var1[3], true));
      this.p = this.a(new pulsescanner.i.c(var1[15], var1[13], true)).a(this.o::a);
      this.q = this.a(new pulsescanner.i.c(var1[18], var1[16], true)).a(this.o::a);
   }

   @Override
   public boolean a() {
      return false;
   }

   static {
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "Nwa]O\"kBt`ZW4\u001dP}fGM#8#y%FL3\"eqfIW.$m8v\\B>8-\tWwu\bq.,kl^Wwd[W4kejjE\u0003!\"m|`Z\f&'fjq\bN(/vt`[\u0003o\u0018wyv@\u0003\u0004#vvn[\u000fg\u001boy|MQg\no}w\\\u000fg\u001cfyq@F5kBt`ZWkk@ppFHg\rjvaMQie-1+\rMwqAE.(bllGM4\u000eNwa]O\"kWwbOO\"8\bGmwIW.$m\u000bAwq\\L*kO}c\\'MwqAE>ktp`F\u0003&knwa]O\"kjk%\\L ,o}a\bA>kh}|\u0006\u000eP{wMF)k`wwFF5e\bSwvAW.$m\bWwu\bo\"-w\fAwq\\L*kQqb@W\"Ppj_\u0003$$ljaAM&?fk%AMg&l|pDFg*o}w\\Pi\u001fWwd[Wg;lhpXPg-lj%KO..ml%MU\"%wk+\u0011Bt`ZWg\blwwLJ)*w}v StdQ\u0003&kpwpFGg<jlm\bN(/vt`\bB+.qlv\u0006";
      int var4 = "Nwa]O\"kBt`ZW4\u001dP}fGM#8#y%FL3\"eqfIW.$m8v\\B>8-\tWwu\bq.,kl^Wwd[W4kejjE\u0003!\"m|`Z\f&'fjq\bN(/vt`[\u0003o\u0018wyv@\u0003\u0004#vvn[\u000fg\u001boy|MQg\no}w\\\u000fg\u001cfyq@F5kBt`ZWkk@ppFHg\rjvaMQie-1+\rMwqAE.(bllGM4\u000eNwa]O\"kWwbOO\"8\bGmwIW.$m\u000bAwq\\L*kO}c\\'MwqAE>ktp`F\u0003&knwa]O\"kjk%\\L ,o}a\bA>kh}|\u0006\u000eP{wMF)k`wwFF5e\bSwvAW.$m\bWwu\bo\"-w\fAwq\\L*kQqb@W\"Ppj_\u0003$$ljaAM&?fk%AMg&l|pDFg*o}w\\Pi\u001fWwd[Wg;lhpXPg-lj%KO..ml%MU\"%wk+\u0011Bt`ZWg\blwwLJ)*w}v StdQ\u0003&kpwpFGg<jlm\bN(/vt`\bB+.qlv\u0006"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 82;
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
                  case 0 -> 81;
                  case 1 -> 74;
                  case 2 -> 87;
                  case 3 -> 122;
                  case 4 -> 113;
                  case 5 -> 21;
                  default -> 25;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     r = var5;
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

                  var2 = "}KM`p\u0016WmM^|k\f~H\\fk[$PQWpl";
                  var4 = "}KM`p\u0016WmM^|k\f~H\\fk[$PQWpl".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 110;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
