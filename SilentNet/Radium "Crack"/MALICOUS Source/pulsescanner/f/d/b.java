package pulsescanner.f.d;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class b extends pulsescanner.f.k {
   public final pulsescanner.i.c F;
   private static final DateTimeFormatter G;
   private static final DateTimeFormatter H;
   private static final String[] I;

   public b() {
      String[] var1 = I;
      super(var1[1], var1[6], 1, 0, 0.0F, 4.0F);
      this.F = this.a(new pulsescanner.i.c(var1[0], var1[2], false));
   }

   @Override
   protected List<String[]> w() {
      String[] var10000;
      String[] var10001;
      byte var10002;
      LocalTime var10003;
      DateTimeFormatter var10004;
      label16: {
         try {
            var10000 = new String[]{I[3], null};
            var10001 = var10000;
            var10002 = 1;
            var10003 = LocalTime.now();
            if (this.F.a()) {
               var10004 = H;
               break label16;
            }
         } catch (MatchException var1) {
            throw a(var1);
         }

         var10004 = G;
      }

      var10001[var10002] = var10003.format(var10004);
      return List.of(var10000);
   }

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "28\u00001]u\\\u0005@fO\u001aY\nVyEYsM\u0001SG\u000e\u0004WcM\u001c\u0005KB\u001a\u0014_";
      int var4 = "28\u00001]u\\\u0005@fO\u001aY\nVyEYsM\u0001SG\u000e\u0004WcM\u001c\u0005KB\u001a\u0014_".length();
      char var1 = 7;
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 47;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            char[] var21 = var10001.toCharArray();
            int var10004 = var21.length;
            byte var22 = var10000;
            char[] var17 = var21;
            int var13 = var10004;

            for (int var6 = 0; var13 > var6; var6++) {
               var17[var6] = (char)(var17[var6] ^ var22 ^ switch (var6 % 7) {
                  case 0 -> 44;
                  case 1 -> 37;
                  case 2 -> 15;
                  case 3 -> 86;
                  case 4 -> 29;
                  case 5 -> 47;
                  default -> 1;
               });
            }

            String var24 = new String(var17).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var24;
                  if ((var8 += var1) >= var4) {
                     I = var5;
                     String[] var9 = I;
                     G = DateTimeFormatter.ofPattern(var9[4]);
                     H = DateTimeFormatter.ofPattern(var9[5]);
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var24;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label43;
                  }

                  var2 = "\bS.wq\u0002\u00102\f\"v|\u0014\"\u0012\u0005':%\n \u0005G";
                  var4 = "\bS.wq\u0002\u00102\f\"v|\u0014\"\u0012\u0005':%\n \u0005G".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 76;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
