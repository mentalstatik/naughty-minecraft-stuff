package pulsescanner.a;

public enum a {
   AIM,
   RESET,
   IDLE;

   private static final a[] a;

   private static a[] a() {
      return new a[]{AIM, RESET, IDLE};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "cQg\u0004k\\f#\u0005p]y#;";
      int var5 = "cQg\u0004k\\f#\u0005p]y#;".length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 20;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 54;
               case 1 -> 12;
               case 2 -> 62;
               case 3 -> 114;
               case 4 -> 123;
               case 5 -> 96;
               default -> 50;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            AIM = new a();
            RESET = new a();
            IDLE = new a();
            a = a();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
