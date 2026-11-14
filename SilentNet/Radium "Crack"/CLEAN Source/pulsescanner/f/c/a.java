package pulsescanner.f.c;

enum a {
   IDLE,
   PREPARE,
   PLACE_OBSIDIAN,
   PLACE_CRYSTAL,
   WAIT_CRYSTAL,
   BREAK_CRYSTAL;

   private static final a[] a;

   private static a[] a() {
      return new a[]{IDLE, PREPARE, PLACE_OBSIDIAN, PLACE_CRYSTAL, WAIT_CRYSTAL, BREAK_CRYSTAL};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[6];
      int var4 = 0;
      String var3 = "\u0015.P\u001e\u0014_\u0007\u0017;B\t\u0010L\u000e\u0015.P\u001e\u0014_\u000b\u00071X\u0019\u0018A\n\u0007\u00150T\r\u0010R\u0001\f\u0012#X\t\u000eC\u0016\u001c1E\u001c\u001d";
      int var5 = "\u0015.P\u001e\u0014_\u0007\u0017;B\t\u0010L\u000e\u0015.P\u001e\u0014_\u000b\u00071X\u0019\u0018A\n\u0007\u00150T\r\u0010R\u0001\f\u0012#X\t\u000eC\u0016\u001c1E\u001c\u001d"
         .length();
      char var2 = '\r';
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 101;
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
                  case 0 -> 32;
                  case 1 -> 7;
                  case 2 -> 116;
                  case 3 -> 56;
                  case 4 -> 52;
                  case 5 -> 101;
                  default -> 33;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     IDLE = new a();
                     PREPARE = new a();
                     PLACE_OBSIDIAN = new a();
                     PLACE_CRYSTAL = new a();
                     WAIT_CRYSTAL = new a();
                     BREAK_CRYSTAL = new a();
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

                  var3 = "\u0006,W\u0012\r\r:^\u0016\u0010U\r\u001d1H\u0003\u001aF";
                  var5 = "\u0006,W\u0012\r\r:^\u0016\u0010U\r\u001d1H\u0003\u001aF".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 111;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
