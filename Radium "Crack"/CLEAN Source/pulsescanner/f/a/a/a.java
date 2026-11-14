package pulsescanner.f.a.a;

enum a {
   PAYLOAD,
   EMPTY_MASK,
   INVALID;

   private static final a[] a;

   private static a[] a() {
      return new a[]{PAYLOAD, EMPTY_MASK, INVALID};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "eO+\t\u0012XC\niL-\u001c\u0007NJmR6\u0007|@$\u0004\u0011PC";
      int var5 = "eO+\t\u0012XC\niL-\u001c\u0007NJmR6\u0007|@$\u0004\u0011PC".length();
      char var2 = 7;
      int var1 = -1;

      while (true) {
         char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 10;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 38;
               case 1 -> 11;
               case 2 -> 119;
               case 3 -> 66;
               case 4 -> 84;
               case 5 -> 27;
               default -> 13;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            PAYLOAD = new a();
            EMPTY_MASK = new a();
            INVALID = new a();
            a = a();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
