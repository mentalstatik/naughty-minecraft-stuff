package pulsescanner.a;

public enum b {
   SEND,
   RECEIVE;

   private static final b[] a;

   private static b[] a() {
      return new b[]{SEND, RECEIVE};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "/tn.\u0007.tc/K\u000ei";
      int var5 = "/tn.\u0007.tc/K\u000ei".length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 125;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 1;
               case 1 -> 76;
               case 2 -> 93;
               case 3 -> 23;
               case 4 -> 127;
               case 5 -> 37;
               default -> 81;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            SEND = new b();
            RECEIVE = new b();
            a = a();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
