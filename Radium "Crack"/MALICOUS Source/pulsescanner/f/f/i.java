package pulsescanner.f.f;

public class i extends pulsescanner.f.i {
   private static final String[] l;

   public i() {
      String[] var1 = l;
      super(var1[0], var1[1], pulsescanner.f.h.RENDER);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "0e\u000f+M\fS\u0011x\u0017#:u\u00174\u000f\u0007U\u00030\u0010\"J^Y\u001au\u00025C\u0007\u001a\u001f~C#N\fQVq\u0011\"N\r\u0014";
      int var4 = "0e\u000f+M\fS\u0011x\u0017#:u\u00174\u000f\u0007U\u00030\u0010\"J^Y\u001au\u00025C\u0007\u001a\u001f~C#N\fQVq\u0011\"N\r\u0014".length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 89;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 47;
               case 1 -> 73;
               case 2 -> 58;
               case 3 -> 30;
               case 4 -> 118;
               case 5 -> 39;
               default -> 99;
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
