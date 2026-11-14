package pulsescanner.f.f;

public class o extends pulsescanner.f.i {
   private static final String[] l;

   public o() {
      String[] var1 = l;
      super(var1[0], var1[1], pulsescanner.f.h.RENDER);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "&U\u0005S\u0010i[HyDv.:_Ht\u0013~\\HNM~ExN\u0005_WzEhG\tQ@;\u0012sJ\u0006\u001a\\t\u0010;[\tQ@;\u0001zB\t]@5";
      int var4 = "&U\u0005S\u0010i[HyDv.:_Ht\u0013~\\HNM~ExN\u0005_WzEhG\tQ@;\u0012sJ\u0006\u001a\\t\u0010;[\tQ@;\u0001zB\t]@5".length();
      char var1 = 11;
      int var0 = -1;

      while (true) {
         char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 95;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 55;
               case 1 -> 101;
               case 2 -> 122;
               case 3 -> 68;
               case 4 -> 58;
               case 5 -> 68;
               default -> 112;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            l = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}
