package pulsescanner.a;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class ah {
   private final Map<String, at> a;
   private BooleanSupplier b;
   private static final String c;

   public ah(pulsescanner.f.i var1, String var2, at[] var3) {
      int var10000 = as.r();
      super();
      this.a = new LinkedHashMap<>();
      int var4 = var10000;
      this.b = ah::lambda$new$0;

      for (at var8 : var3) {
         at var9 = new at(var1, var2 + c + var8.a, var8.a());
         var9.a(this::lambda$new$1);
         this.a.put(var8.a.toLowerCase(Locale.ROOT), var9);
         if (var4 == 0) {
            break;
         }
      }
   }

   public ah a(BooleanSupplier var1) {
      this.b = var1;
      return this;
   }

   public boolean a(String var1) {
      int var10000 = as.r();
      at var3 = this.a.get(var1.toLowerCase(Locale.ROOT));
      int var2 = var10000;

      label33: {
         try {
            var6 = var3;
            if (var2 == 0) {
               break label33;
            }

            if (var3 == null) {
               return false;
            }
         } catch (MatchException var5) {
            throw a(var5);
         }

         var6 = var3;
      }

      try {
         boolean var7 = var6.i();
         if (var2 == 0) {
            return var7;
         }

         if (var7) {
            return true;
         }
      } catch (MatchException var4) {
         throw a(var4);
      }

      return false;
   }

   private boolean lambda$new$1() {
      return this.b.getAsBoolean();
   }

   private static boolean lambda$new$0() {
      return true;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      char[] var10003 = "0\u007f".toCharArray();
      int var10004 = var10003.length;
      byte var5 = 94;
      char[] var10002 = var10003;
      int var1 = var10004;

      for (int var0 = 0; var1 > var0; var0++) {
         var10002[var0] = (char)(var10002[var0] ^ var5 ^ switch (var0 % 7) {
            case 0 -> 84;
            case 1 -> 1;
            case 2 -> 6;
            case 3 -> 30;
            case 4 -> 107;
            case 5 -> 69;
            default -> 32;
         });
      }

      String var7 = new String(var10002).intern();
      byte var3 = -1;
      c = var7;
   }
}
