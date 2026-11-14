package pulsescanner.f.f;

enum a {
   CHEST,
   ENDER_CHEST,
   SHULKER,
   SPAWNER,
   FURNACE,
   BARREL,
   ENCHANTING_TABLE,
   PISTON,
   HOPPER,
   DISPENSER,
   DROPPER,
   BREWING_STAND,
   CRAFTER,
   CHISELED_BOOKSHELF,
   DECORATED_POT;

   private static final a[] a;

   private static a[] a() {
      return new a[]{
         CHEST,
         ENDER_CHEST,
         SHULKER,
         SPAWNER,
         FURNACE,
         BARREL,
         ENCHANTING_TABLE,
         PISTON,
         HOPPER,
         DISPENSER,
         DROPPER,
         BREWING_STAND,
         CRAFTER,
         CHISELED_BOOKSHELF,
         DECORATED_POT
      };
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      String[] var0 = new String[15];
      int var4 = 0;
      String var3 = "\u0000\f72\u0001\u0010l\u0007\u001b<.\u000b\u0017z\u000b\u00012'\r\u0007\u0001=.\u0016\u001d}\u0006\u0000!1\u000b\b\u000b\u0006\n:$\u0016\u0003j\u000b\u0001-5\u0007\u0005\u0011,/\u0005\u001fl\u0006\u000b\u000b.1\u0001\u000e\r\u0001\u0016;6\r\u0012n\u001c\u0017* \n\u0018\u0010\u0006\n=)\u0005\u0012}\n\n9>\u0010\u001dk\u000f\u0001\u0006\u0013\r-5\u000b\u0012\u0007\u0007\u001611\u0014\u0019{\u0006\u0001\u0005,3\u0001\u0010\u0007\u0000\u0016?'\u0010\u0019{\t\u0007\r-1\u0001\u0012z\u0006\u0016\u0007\u0010\f+-\u000f\u0019{";
      int var5 = "\u0000\f72\u0001\u0010l\u0007\u001b<.\u000b\u0017z\u000b\u00012'\r\u0007\u0001=.\u0016\u001d}\u0006\u0000!1\u000b\b\u000b\u0006\n:$\u0016\u0003j\u000b\u0001-5\u0007\u0005\u0011,/\u0005\u001fl\u0006\u000b\u000b.1\u0001\u000e\r\u0001\u0016;6\r\u0012n\u001c\u0017* \n\u0018\u0010\u0006\n=)\u0005\u0012}\n\n9>\u0010\u001dk\u000f\u0001\u0006\u0013\r-5\u000b\u0012\u0007\u0007\u001611\u0014\u0019{\u0006\u0001\u0005,3\u0001\u0010\u0007\u0000\u0016?'\u0010\u0019{\t\u0007\r-1\u0001\u0012z\u0006\u0016\u0007\u0010\f+-\u000f\u0019{"
         .length();
      char var2 = 18;
      int var8 = -1;

      label44:
      while (true) {
         byte var10000 = 36;
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
                  case 0 -> 103;
                  case 1 -> 96;
                  case 2 -> 90;
                  case 3 -> 69;
                  case 4 -> 96;
                  case 5 -> 120;
                  default -> 13;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var23;
                  if ((var8 += var2) >= var5) {
                     CHEST = new a();
                     ENDER_CHEST = new a();
                     SHULKER = new a();
                     SPAWNER = new a();
                     FURNACE = new a();
                     BARREL = new a();
                     ENCHANTING_TABLE = new a();
                     PISTON = new a();
                     HOPPER = new a();
                     DISPENSER = new a();
                     DROPPER = new a();
                     BREWING_STAND = new a();
                     CRAFTER = new a();
                     CHISELED_BOOKSHELF = new a();
                     DECORATED_POT = new a();
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

                  var3 = "yuBKi\u0007imFOs`\u0002";
                  var5 = "yuBKi\u0007imFOs`\u0002".length();
                  var2 = 5;
                  var8 = -1;
            }

            var10000 = 93;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
