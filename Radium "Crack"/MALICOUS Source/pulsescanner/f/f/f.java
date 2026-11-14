package pulsescanner.f.f;

public class f extends pulsescanner.f.i {
   public final pulsescanner.i.f l;
   public final pulsescanner.i.g m;
   public final pulsescanner.i.c n;
   public final pulsescanner.i.d o;
   private static final String[] p;

   public f() {
      String[] var1 = p;
      super(var1[10], var1[5], pulsescanner.f.h.RENDER);
      this.l = this.a(new pulsescanner.i.f(var1[4], var1[7], var1[3], var1[8], var1[11], var1[2], var1[15], var1[13]));
      this.m = this.a(new pulsescanner.i.g(var1[12], var1[6], 220.0, 64.0, 320.0, 1.0));
      this.n = this.a(new pulsescanner.i.c(var1[16], var1[9], true)).a(this::lambda$new$0);
      this.o = this.a(new pulsescanner.i.d(var1[14], var1[1], -8605185)).a(this::lambda$new$1);
   }

   private boolean lambda$new$1() {
      return this.l.a(p[0]);
   }

   private boolean lambda$new$0() {
      return this.l.a(p[0]);
   }

   static {
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "\u001bs\\-bw`4}F7y|\f\u001bs_;b2o7p],8\u0004\u001ciA5\u0006\u0019i@1ds\u0004\u0015sV;\"\u000bkS.e2x0y\u0012-}k,>s@~w|,9r[3wfi<<]0s<\"\u000bhS,:2\u007f6sEr6sb<<@?\u007f|,<yF?\u007f~,4yD;z<\u0016\u001biA*y\u007f,+wK~wfa7oB6s`iv\r\u001bs\\-bw`4}F7y|+\u0019xV-6sb1qS*sv,;s_;ba,1r\u0012=y|\u007f,y^2wfe7r\u00123yviv\n\u001biA*y\u007f,\u000bwK\u0006\u0019i@1ds\u0006\u001cyF?\u007f~\f\ftG0rw~+h],{\u0006\u0019\u007fQ;xf";
      int var4 = "\u001bs\\-bw`4}F7y|\f\u001bs_;b2o7p],8\u0004\u001ciA5\u0006\u0019i@1ds\u0004\u0015sV;\"\u000bkS.e2x0y\u0012-}k,>s@~w|,9r[3wfi<<]0s<\"\u000bhS,:2\u007f6sEr6sb<<@?\u007f|,<yF?\u007f~,4yD;z<\u0016\u001biA*y\u007f,+wK~wfa7oB6s`iv\r\u001bs\\-bw`4}F7y|+\u0019xV-6sb1qS*sv,;s_;ba,1r\u0012=y|\u007f,y^2wfe7r\u00123yviv\n\u001biA*y\u007f,\u000bwK\u0006\u0019i@1ds\u0006\u001cyF?\u007f~\f\ftG0rw~+h],{\u0006\u0019\u007fQ;xf"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 34;
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
                  case 1 -> 62;
                  case 2 -> 16;
                  case 3 -> 124;
                  case 4 -> 52;
                  case 5 -> 48;
                  default -> 46;
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

                  var2 = "\u000fvY-abg.u\u0006\u001fw[?fe";
                  var4 = "\u000fvY-abg.u\u0006\u001fw[?fe".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
