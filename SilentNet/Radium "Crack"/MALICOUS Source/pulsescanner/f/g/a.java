package pulsescanner.f.g;

enum a {
   UNKNOWN,
   CLEAR,
   RAIN,
   THUNDERSTORM;

   private static final a[] a;

   private static a[] a() {
      return new a[]{UNKNOWN, CLEAR, RAIN, THUNDERSTORM};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u0006X4z!\u0007\u0010Z:u<\u0005u";
      int var5 = "\u0006X4z!\u0007\u0010Z:u<\u0005u".length();
      char var2 = 5;
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 65;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
            char[] var20 = var10001.toCharArray();
            int var10004 = var20.length;
            byte var21 = var10000;
            char[] var16 = var20;
            int var12 = var10004;

            for (int var6 = 0; var12 > var6; var6++) {
               var16[var6] = (char)(var16[var6] ^ var21 ^ switch (var6 % 7) {
                  case 0 -> 4;
                  case 1 -> 85;
                  case 2 -> 48;
                  case 3 -> 122;
                  case 4 -> 50;
                  case 5 -> 19;
                  default -> 122;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     UNKNOWN = new a();
                     CLEAR = new a();
                     RAIN = new a();
                     THUNDERSTORM = new a();
                     a = a();
                     return;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var23;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label44;
                  }

                  var3 = "\u001c^3~\f\u001aW/~<\u001cb\u001dK5b5";
                  var5 = "\u001c^3~\f\u001aW/~<\u001cb\u001dK5b5".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 74;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
