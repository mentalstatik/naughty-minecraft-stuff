package pulsescanner.f.b;

import pulsescanner.f.h;
import pulsescanner.f.i;

public class a extends i {
   public final pulsescanner.i.g l;
   public final pulsescanner.i.c m;
   public final pulsescanner.i.g n;
   public final pulsescanner.i.c o;
   public final pulsescanner.i.g p;
   public final pulsescanner.i.c q;
   public final pulsescanner.i.c r;
   public final pulsescanner.i.g s;
   public final pulsescanner.i.c t;
   public final pulsescanner.i.c u;
   public final pulsescanner.i.b v;
   private static final String[] w;

   public a() {
      String[] var2 = w;
      super(var2[9], var2[3], pulsescanner.f.h.CLIENT);
      this.l = this.a(new pulsescanner.i.g(var2[16], var2[4], 1.0, 0.5, 2.0, 0.05, "x"));
      this.m = this.a(new pulsescanner.i.c(var2[21], var2[11], true));
      this.n = this.a(new pulsescanner.i.g(var2[20], var2[18], 15.0, 0.0, 80.0, 1.0, "%"));
      boolean var10000 = pulsescanner.f.b.c.p();
      this.o = this.a(new pulsescanner.i.c(var2[10], var2[22], true));
      this.p = this.a(new pulsescanner.i.g(var2[5], var2[15], 100.0, 10.0, 200.0, 5.0, "%")).a(this.o::a);
      this.q = this.a(new pulsescanner.i.c(var2[2], var2[12], true));
      boolean var1 = var10000;

      try {
         this.r = this.a(new pulsescanner.i.c(var2[23], var2[17], true));
         this.s = this.a(new pulsescanner.i.g(var2[8], var2[13], 1.0, 0.25, 3.0, 0.05, "x"));
         this.t = this.a(new pulsescanner.i.c(var2[6], var2[0], true));
         this.u = this.a(new pulsescanner.i.c(var2[1], var2[7], false));
         this.v = this.a(new pulsescanner.i.b(var2[19], var2[14], a::lambda$new$0));
         this.f.a(Integer.valueOf(344));
         if (var1) {
            pulsescanner.f.i.b(new int[3]);
         }
      } catch (MatchException var3) {
         throw a(var3);
      }
   }

   @Override
   public boolean a() {
      return false;
   }

   private static void lambda$new$0() {
      boolean var10000 = pulsescanner.f.b.c.p();
      float var1 = 12.0F;
      boolean var0 = var10000;

      for (pulsescanner.c.a var3 : pulsescanner.c.e.a) {
         var3.h = var1;
         var3.i = 12.0F;
         var3.l = false;
         var1 += 144.0F;
         if (var0) {
            break;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[24];
      int var3 = 0;
      String var2 = "\u0012q1/\u000b{V%l2=\u000br\\2z,1[bP.w-xDx\u0019)v(=Y8\u0011\u0006L\u0017xeyM(\u007f7;JbP.w-\u0005\u0012q76N\u001b\rv13\u000bwW%98=Nz\u0019.\u007f~,C\u007fJat;6^88\u0012p$=\u000by_am61X6T$w+t\u000b\u007fW%|.=Er\\/m~7M6t(w;;Yw_5>-xlCpaj=9Gs\u0017\r\u0006u1/\u000bEM3|0?_~\f\u0005|-;Y\u007fI5p16X0\u0012q1/\u000bbV&~2=\u000bxV5p81HwM(v0+\u000bpV39=4BuR2976\u000bbQ$9\u0019\rb8\u000f\u0000w75JbP.w~\u000b[s\\%\b\u0002u7;@Ql\b\u0004\u0006u1/\u001e\u0003u+*\u000bbQ$9)7Yz]a{;0Bx]am6=\u000bQl\b71\u0006u?+X6K$\u007f2=HbP.w~9Er\u0019 921L~Maj)=Nf\u0019 z,7Xe\u00191x0=Ge\u0017\u001e\tv)xXxX1i'xlCpax01FwM(v0+\u000bwK$70\fv(=\u000bwU-9.9EsU29<9H}\u00195v~,CsP39:=MwL-m~(DeP5p16X8\u0017\tv)xIdP&q*x_~\\a~27\\6P27\t\u0006L\u0017xxuX-|4\u0014j;x_~\\aP0,Nd\u0019\u0014P~>DxMap0+_sX%91>\u000bbQ$9\u00131EsZ3x8,\u000bpV/mp\u0016\u0005x,3Nx\u00195q;xIwZ*~,7^x]o\f\u0013|-=_6i w;4X\u0003\u0005p3\u0004\u0003u+*";
      int var4 = "\u0012q1/\u000b{V%l2=\u000br\\2z,1[bP.w-xDx\u0019)v(=Y8\u0011\u0006L\u0017xeyM(\u007f7;JbP.w-\u0005\u0012q76N\u001b\rv13\u000bwW%98=Nz\u0019.\u007f~,C\u007fJat;6^88\u0012p$=\u000by_am61X6T$w+t\u000b\u007fW%|.=Er\\/m~7M6t(w;;Yw_5>-xlCpaj=9Gs\u0017\r\u0006u1/\u000bEM3|0?_~\f\u0005|-;Y\u007fI5p16X0\u0012q1/\u000bbV&~2=\u000bxV5p81HwM(v0+\u000bpV39=4BuR2976\u000bbQ$9\u0019\rb8\u000f\u0000w75JbP.w~\u000b[s\\%\b\u0002u7;@Ql\b\u0004\u0006u1/\u001e\u0003u+*\u000bbQ$9)7Yz]a{;0Bx]am6=\u000bQl\b71\u0006u?+X6K$\u007f2=HbP.w~9Er\u0019 921L~Maj)=Nf\u0019 z,7Xe\u00191x0=Ge\u0017\u001e\tv)xXxX1i'xlCpax01FwM(v0+\u000bwK$70\fv(=\u000bwU-9.9EsU29<9H}\u00195v~,CsP39:=MwL-m~(DeP5p16X8\u0017\tv)xIdP&q*x_~\\a~27\\6P27\t\u0006L\u0017xxuX-|4\u0014j;x_~\\aP0,Nd\u0019\u0014P~>DxMap0+_sX%91>\u000bbQ$9\u00131EsZ3x8,\u000bpV/mp\u0016\u0005x,3Nx\u00195q;xIwZ*~,7^x]o\f\u0013|-=_6i w;4X\u0003\u0005p3\u0004\u0003u+*"
         .length();
      char var1 = '"';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 48;
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
                  case 0 -> 113;
                  case 1 -> 41;
                  case 2 -> 110;
                  case 3 -> 104;
                  case 4 -> 27;
                  case 5 -> 38;
                  default -> 9;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     w = var5;
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

                  var2 = "\u007f\u001bUAf\f<E\u0000V\u0015!\u0017;[TRG)\u000e:HTCT(\u001e8_TR[\"[1B\u0015QY#\u001ftA\u001bW@*\u001e'\u0002\u000bo\u0001@A)\u0016tj\u001b]A";
                  var4 = "\u007f\u001bUAf\f<E\u0000V\u0015!\u0017;[TRG)\u000e:HTCT(\u001e8_TR[\"[1B\u0015QY#\u001ftA\u001bW@*\u001e'\u0002\u000bo\u0001@A)\u0016tj\u001b]A"
                     .length();
                  var1 = '2';
                  var8 = -1;
            }

            var10000 = 93;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
