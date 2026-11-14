package pulsescanner.f.f;

public class m extends pulsescanner.f.i {
   public final pulsescanner.i.g l;
   private static final String[] m;

   public m() {
      String[] var1 = m;
      super(var1[0], var1[2], pulsescanner.f.h.RENDER);
      this.l = this.a(new pulsescanner.i.g(var1[3], var1[1], 0.3, 0.0, 0.6, 0.05));
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "rS\u0006NF\u0019\u001e[&vS\u0006Nf\u0011\u001e\u001eH\u001eNp\u0005\u001fV\u001c\u0005\u0006eP\nWN\u0014No\u0006\tLP\u0010\u0017 \u0014\u0003IR_";
      int var4 = "rS\u0006NF\u0019\u001e[&vS\u0006Nf\u0011\u001e\u001eH\u001eNp\u0005\u001fV\u001c\u0005\u0006eP\nWN\u0014No\u0006\tLP\u0010\u0017 \u0014\u0003IR_"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 80;
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
                  case 0 -> 110;
                  case 1 -> 108;
                  case 2 -> 33;
                  case 3 -> 62;
                  case 4 -> 80;
                  case 5 -> 32;
                  default -> 60;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     m = var5;
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

                  var2 = "\u0005$q|\u0005t;=#c9\u0011ni:?+i\u0012uh&%&\u007f\u001eu~i$p|\u0005kz0e\b\u0005$q|\u0005'Y0";
                  var4 = "\u0005$q|\u0005t;=#c9\u0011ni:?+i\u0012uh&%&\u007f\u001eu~i$p|\u0005kz0e\b\u0005$q|\u0005'Y0".length();
                  var1 = '%';
                  var8 = -1;
            }

            var10000 = 39;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
