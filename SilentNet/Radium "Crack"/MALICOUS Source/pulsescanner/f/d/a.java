package pulsescanner.f.d;

public enum a {
   ONLINE,
   WATCHING;

   private static final a[] a;
   private static pulsescanner.f.i[] b;

   private static a[] a() {
      return new a[]{ONLINE, WATCHING};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[2];
      pulsescanner.f.i[] var10000 = new pulsescanner.f.i[4];
      int var4 = 0;
      b(var10000);
      String var3 = "7&|??\\\b/)d59PJ?";
      int var5 = "7&|??\\\b/)d59PJ?".length();
      char var2 = 6;
      int var1 = -1;

      while (true) {
         char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 30;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 102;
               case 1 -> 118;
               case 2 -> 46;
               case 3 -> 104;
               case 4 -> 111;
               case 5 -> 7;
               default -> 26;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            ONLINE = new a();
            WATCHING = new a();
            a = a();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public static void b(pulsescanner.f.i[] var0) {
      b = var0;
   }

   public static pulsescanner.f.i[] b() {
      return b;
   }
}
