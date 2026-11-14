package pulsescanner.f.f;

public class c extends pulsescanner.f.i {
   public final pulsescanner.i.d l;
   public final pulsescanner.i.g m;
   private static final String[] n;

   public c() {
      String[] var1 = n;
      super(var1[2], var1[1], pulsescanner.f.h.RENDER);
      this.l = this.a(new pulsescanner.i.d(var1[5], var1[0], -1275068417));
      this.m = this.a(new pulsescanner.i.g(var1[4], var1[3], 2.5, 0.5, 8.0, 0.5));
   }

   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "ng|\u000f\u0004\u0006f\u0001qg\u000f\u0002\u001a-6bg{\u0017\u0002\u0005#B}d\f\u001fHbOv(\u0014\u0004\fwI2n\f\u001fHwIw(\u0017\f\u001adDfm\u0007M\noNqcC\u0002\u001dwM{f\u0006C\rc~g\u0000\u0006HLTfd\n\u0003\r\u000bm{f\u0006M\u001fjEf`M";
      int var4 = "ng|\u000f\u0004\u0006f\u0001qg\u000f\u0002\u001a-6bg{\u0017\u0002\u0005#B}d\f\u001fHbOv(\u0014\u0004\fwI2n\f\u001fHwIw(\u0017\f\u001adDfm\u0007M\noNqcC\u0002\u001dwM{f\u0006C\rc~g\u0000\u0006HLTfd\n\u0003\r\u000bm{f\u0006M\u001fjEf`M"
         .length();
      char var1 = 14;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 9;
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
                  case 0 -> 40;
                  case 1 -> 27;
                  case 2 -> 1;
                  case 3 -> 106;
                  case 4 -> 100;
                  case 5 -> 97;
                  default -> 10;
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

                  var2 = "gj}\u0006\u0014\u0005slu\u001d\u000e";
                  var4 = "gj}\u0006\u0014\u0005slu\u001d\u000e".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 24;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
