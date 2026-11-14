package pulsescanner.f.b;

import pulsescanner.PulseScanner;
import pulsescanner.f.h;
import pulsescanner.f.i;

public class b extends i {
   private static final int l = -9699442;
   private static final int m = -41892;
   public final pulsescanner.i.b n;
   public final pulsescanner.i.b o;
   private static final String[] p;

   public b() {
      String[] var1 = p;
      super(var1[1], var1[12], pulsescanner.f.h.CLIENT);
      this.n = this.a(new pulsescanner.i.b(var1[11], var1[2], b::o));
      this.o = this.a(new pulsescanner.i.b(var1[5], var1[15], b::p));
   }

   @Override
   public boolean a() {
      return false;
   }

   private static void o() {
      try {
         String var0 = pulsescanner.b.a.g();
         a.field_1774.method_1455(var0);
         String[] var3 = p;
         pulsescanner.d.d.a(var3[8], var0.length() + var3[6], -9699442, 3.0F);
      } catch (Exception var2) {
         String[] var1 = p;
         PulseScanner.LOG.error(var1[4], var2);
         pulsescanner.d.d.a(var1[13], String.valueOf(var2.getMessage()), -41892, 4.0F);
      }
   }

   private static void p() {
      try {
         pulsescanner.b.a.a(a.field_1774.method_1460());
         String[] var5 = p;
         pulsescanner.d.d.a(var5[14], var5[9], -9699442, 3.0F);
      } catch (IllegalArgumentException var2) {
         String[] var4 = p;
         pulsescanner.d.d.a(var4[7], var2.getMessage(), -41892, 4.0F);
      } catch (Exception var3) {
         String[] var1 = p;
         PulseScanner.LOG.error(var1[10], var3);
         pulsescanner.d.d.a(var1[3], var1[0], -41892, 4.0F);
      }
   }

   static {
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "|R@ \\8^AZ\r2M>C\u000fJ_*F7\u0017NM])Q9YH\u001dY-MpT@YH\u0006lRC#A7elR]<\b)XZO\r2@?[J\u001d^ \\%G\u000f\u0015@*L%[JN\u0001e[5C[TC\"[|\u0017DXT'A>S\\\u0011\r\r}\u0014\u0017NSIeX1YJQ\r)I)XZI\u0004eI#\u0017N\u001dN*L5\u0017[R\r1@5\u0017LQD5J?V]Y\u0003\f\u007f\\^1MpqNTA L\u0014lRC#A7\u0017JE]*Z$\u0017I\\D)M4\f\u007f\\^1Mpt@SK,O\u001d\u000f^E$Z1T[X_6\b?Y\u000fDB0ZpTCT]'G1EK\f\u007f\\^1MpqNTA L\rlRC#A7\u0017lR],M4*vRX7\b#R[H]e_1D\u000fOH5D1TJY\r#Z?Z\u000fIE \b3[FMO*I\"S\u0014lRC#A7\u0017FP]*Z$\u0017I\\D)M4\u000blR]<\b\u0013XA[D\"3|UL7MpN@H_e[5CZM\r$[pV\u000f^B!M|\u0017@O\r)G1S\u000fNB(M?YJ\u001dH)[5\u0010\\\u0013\u000blR]<\b\u0016VFQH!";
      int var4 = "|R@ \\8^AZ\r2M>C\u000fJ_*F7\u0017NM])Q9YH\u001dY-MpT@YH\u0006lRC#A7elR]<\b)XZO\r2@?[J\u001d^ \\%G\u000f\u0015@*L%[JN\u0001e[5C[TC\"[|\u0017DXT'A>S\\\u0011\r\r}\u0014\u0017NSIeX1YJQ\r)I)XZI\u0004eI#\u0017N\u001dN*L5\u0017[R\r1@5\u0017LQD5J?V]Y\u0003\f\u007f\\^1MpqNTA L\u0014lRC#A7\u0017JE]*Z$\u0017I\\D)M4\f\u007f\\^1Mpt@SK,O\u001d\u000f^E$Z1T[X_6\b?Y\u000fDB0ZpTCT]'G1EK\f\u007f\\^1MpqNTA L\rlRC#A7\u0017lR],M4*vRX7\b#R[H]e_1D\u000fOH5D1TJY\r#Z?Z\u000fIE \b3[FMO*I\"S\u0014lRC#A7\u0017FP]*Z$\u0017I\\D)M4\u000blR]<\b\u0013XA[D\"3|UL7MpN@H_e[5CZM\r$[pV\u000f^B!M|\u0017@O\r)G1S\u000fNB(M?YJ\u001dH)[5\u0010\\\u0013\u000blR]<\b\u0016VFQH!"
         .length();
      char var1 = '&';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 98;
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
                  case 0 -> 77;
                  case 1 -> 95;
                  case 2 -> 79;
                  case 3 -> 39;
                  case 4 -> 74;
                  case 5 -> 50;
                  default -> 85;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     p = var5;
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

                  var2 = "!\u001f\u000en\fzZ.\u001f\u0001l\u0000yI.\u001f\u0001lE|Z\u0001\u001f\u000en\fzZ\u0001\u001f\u0004mE{\b\r\u001d@q\nh\bB\u0013\fa\u0015\u007f\u0015\u0003\u0002\u0004&EI\u0012\u000b\u0003@z\u0000m\u0016\u0003\u0013\u0005{Ed\u0015\u0017\u0002@k\u0010o\b\u0007\u001e\u0014(\u0016x\u000e\u0017\u0000N";
                  var4 = "!\u001f\u000en\fzZ.\u001f\u0001l\u0000yI.\u001f\u0001lE|Z\u0001\u001f\u000en\fzZ\u0001\u001f\u0004mE{\b\r\u001d@q\nh\bB\u0013\fa\u0015\u007f\u0015\u0003\u0002\u0004&EI\u0012\u000b\u0003@z\u0000m\u0016\u0003\u0013\u0005{Ed\u0015\u0017\u0002@k\u0010o\b\u0007\u001e\u0014(\u0016x\u000e\u0017\u0000N"
                     .length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 47;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
