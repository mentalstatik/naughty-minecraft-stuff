package pulsescanner.f.f;

public class s extends pulsescanner.f.i {
   public final pulsescanner.i.c l;
   private static final String[] m;

   public s() {
      String[] var1 = m;
      super(var1[2], var1[1], pulsescanner.f.h.RENDER);
      this.l = this.a(new pulsescanner.i.c(var1[0], var1[3], false));
   }

   public boolean o() {
      return this.l.a();
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "4U\\\u0014KsF\u0017@M\u0014K %)DD\u001dX0s\b\u0001G\u001aP=e[V]\u0005Qsb\u0013D\u0014\u0015\\5w\u000eM@QJ8\u007f\u0015\u000f";
      int var4 = "4U\\\u0014KsF\u0017@M\u0014K %)DD\u001dX0s\b\u0001G\u001aP=e[V]\u0005Qsb\u0013D\u0014\u0015\\5w\u000eM@QJ8\u007f\u0015\u000f".length();
      char var1 = '\r';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 14;
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
                  case 0 -> 117;
                  case 1 -> 47;
                  case 2 -> 58;
                  case 3 -> 127;
                  case 4 -> 55;
                  case 5 -> 93;
                  default -> 24;
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

                  var2 = "i\u000b\u001c^XB%U\u0014\u0010S\f2{\f\u0006_Xv2\\\u0001\u0000\\\f28N\b\u0010BXb;[\u0019\u0010B\u000b5wI\u000b\u001c^\u000b>wT\u000f\u0001\u0010\u0012g$N@\f_\r`$\u0014";
                  var4 = "i\u000b\u001c^XB%U\u0014\u0010S\f2{\f\u0006_Xv2\\\u0001\u0000\\\f28N\b\u0010BXb;[\u0019\u0010B\u000b5wI\u000b\u001c^\u000b>wT\u000f\u0001\u0010\u0012g$N@\f_\r`$\u0014"
                     .length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
