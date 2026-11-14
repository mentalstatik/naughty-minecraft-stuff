package pulsescanner.f.f;

public class j extends pulsescanner.f.i {
   public final pulsescanner.i.g l;
   public final pulsescanner.i.g m;
   public final pulsescanner.i.g n;
   public final pulsescanner.i.g o;
   private static final String[] p;

   public j() {
      String[] var1 = p;
      super(var1[2], var1[5], pulsescanner.f.h.RENDER);
      this.l = this.a(new pulsescanner.i.g(var1[3], var1[6], 1.0, 0.1, 2.0, 0.05, "x"));
      this.m = this.a(new pulsescanner.i.g("X", var1[4], 0.0, -1.0, 1.0, 0.05));
      this.n = this.a(new pulsescanner.i.g("Y", var1[0], 0.0, -1.0, 1.0, 0.05));
      this.o = this.a(new pulsescanner.i.g("Z", var1[1], 0.0, -1.0, 1.0, 0.05));
   }

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "}pb\u001eY\u0007FG5\u007f\fV\u0017B_;\rop`\u001eXDHMsc\u000fDJ\tct~\u000e\u00102NNb\u0005xvq\u0006U\u0012czb\u0003J\u000bI_t|J_\u0002AXpdD";
      int var4 = "}pb\u001eY\u0007FG5\u007f\fV\u0017B_;\rop`\u001eXDHMsc\u000fDJ\tct~\u000e\u00102NNb\u0005xvq\u0006U\u0012czb\u0003J\u000bI_t|J_\u0002AXpdD"
         .length();
      char var1 = 16;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 122;
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
                  case 1 -> 111;
                  case 2 -> 106;
                  case 3 -> 16;
                  case 4 -> 74;
                  case 5 -> 30;
                  default -> 93;
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

                  var2 = "%9%LSF\n\fv J\u0012K\u0001H/<\\\u0001\u0007\f\r:7\t\u001aS\u0001\u0005%}\u000f 3?MSN\u0010\r;sZ\u001a]\u0001F";
                  var4 = "%9%LSF\n\fv J\u0012K\u0001H/<\\\u0001\u0007\f\r:7\t\u001aS\u0001\u0005%}\u000f 3?MSN\u0010\r;sZ\u001a]\u0001F".length();
                  var1 = 31;
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
