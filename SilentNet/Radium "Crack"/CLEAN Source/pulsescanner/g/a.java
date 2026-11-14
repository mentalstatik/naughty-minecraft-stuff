package pulsescanner.g;

public enum a {
   EYE,
   GRID,
   GLOBE,
   GEAR,
   SNOW,
   AMETHYST,
   PULSE,
   SWORD,
   SEARCH,
   TARGET;

   private static final a[] a;

   private static a[] a() {
      return new a[]{EYE, GRID, GLOBE, GEAR, SNOW, AMETHYST, PULSE, SWORD, SEARCH, TARGET};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[10];
      int var4 = 0;
      String var3 = "t8p\u001b:d\u0005s.m\u000e;\u0005g5m\u001e:\u0006s<c\u000e<x\u0004g<c\u000e\ba4g\b7izt\u0005p,n\u000f:\u0003e g";
      int var5 = "t8p\u001b:d\u0005s.m\u000e;\u0005g5m\u001e:\u0006s<c\u000e<x\u0004g<c\u000e\ba4g\b7izt\u0005p,n\u000f:\u0003e g".length();
      char var2 = 6;
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 75;
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
                  case 0 -> 107;
                  case 1 -> 50;
                  case 2 -> 105;
                  case 3 -> 23;
                  case 4 -> 52;
                  case 5 -> 123;
                  default -> 98;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     EYE = new a();
                     GRID = new a();
                     GLOBE = new a();
                     GEAR = new a();
                     SNOW = new a();
                     AMETHYST = new a();
                     PULSE = new a();
                     SWORD = new a();
                     SEARCH = new a();
                     TARGET = new a();
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

                  var3 = "\u0003O\u000f|\u0004\u0017S\to";
                  var5 = "\u0003O\u000f|\u0004\u0017S\to".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 47;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
