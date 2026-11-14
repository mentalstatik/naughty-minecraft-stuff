package pulsescanner.f.b;

import pulsescanner.f.h;
import pulsescanner.f.i;

public class d extends i {
   public final pulsescanner.i.b l;
   public final pulsescanner.i.b m;
   private static final String[] n;

   public d() {
      String[] var1 = n;
      super(var1[2], var1[3], pulsescanner.f.h.CLIENT);
      this.l = this.a(new pulsescanner.i.b(var1[0], var1[1], d::lambda$new$0));
      this.m = this.a(new pulsescanner.i.b(var1[4], var1[5], pulsescanner.license.d::m));
   }

   @Override
   public boolean a() {
      return false;
   }

   private static void lambda$new$0() {
      boolean var0 = pulsescanner.f.b.c.q();

      String var10000;
      String var10001;
      int var10002;
      label22: {
         label21: {
            try {
               var10000 = n[6];
               var10001 = pulsescanner.license.d.j();
               var10002 = pulsescanner.license.d.a();
               if (!var0) {
                  break label22;
               }

               if (var10002 != 0) {
                  break label21;
               }
            } catch (MatchException var1) {
               throw a(var1);
            }

            var10002 = -42406;
            break label22;
         }

         var10002 = -9706614;
      }

      pulsescanner.d.d.a(var10000, var10001, var10002, 5.0F);
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "!\u00179\u0012[aO\u0013\u000b#\u00169!\u00179\u0012\b\u0012L\u001a\u001a\"\r\u001e@\u001b\u000b\u0010#\u0017[^R\u0011\u001a8\u0016\u001e\u0012R\u0001_7\u0006\u000f[M\u0017_7\u000b\u001f\u0012L\u001a\u001a8E\u0012F\u001b\u0017\u0007&\f\tWH\\\u0007>\u00165\u0000\u0015A^\u001b+\u0010#\u0017[bN\u001e\f3E(QZ\u001c\u00113\u0017[^R\u0011\u001a8\u0016\u001e\u001c\t1\u00173\u0006\u0010\u0012u\u001d\b";
      int var4 = "!\u00179\u0012[aO\u0013\u000b#\u00169!\u00179\u0012\b\u0012L\u001a\u001a\"\r\u001e@\u001b\u000b\u0010#\u0017[^R\u0011\u001a8\u0016\u001e\u0012R\u0001_7\u0006\u000f[M\u0017_7\u000b\u001f\u0012L\u001a\u001a8E\u0012F\u001b\u0017\u0007&\f\tWH\\\u0007>\u00165\u0000\u0015A^\u001b+\u0010#\u0017[bN\u001e\f3E(QZ\u001c\u00113\u0017[^R\u0011\u001a8\u0016\u001e\u001c\t1\u00173\u0006\u0010\u0012u\u001d\b"
         .length();
      char var1 = 11;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 76;
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
                  case 0 -> 62;
                  case 1 -> 51;
                  case 2 -> 26;
                  case 3 -> 41;
                  case 4 -> 55;
                  case 5 -> 126;
                  default -> 119;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     n = var5;
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

                  var2 = "oImXN\u001fEUN}I\u0005\u0000\fODfH@L\u0012EU`\u001bQ\u0004\u0000\fRmIS\t\u0017\fSa\\M\u0018EMViB\u000b\u0007`Hk^K\u001f\u0000";
                  var4 = "oImXN\u001fEUN}I\u0005\u0000\fODfH@L\u0012EU`\u001bQ\u0004\u0000\fRmIS\t\u0017\fSa\\M\u0018EMViB\u000b\u0007`Hk^K\u001f\u0000"
                     .length();
                  var1 = '/';
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
