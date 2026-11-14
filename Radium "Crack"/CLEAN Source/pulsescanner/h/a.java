package pulsescanner.h;

public final class a {
   public static volatile byte[] a;
   private static String b;

   private a() {
   }

   public static void b(String var0) {
      b = var0;
   }

   public static String b() {
      return b;
   }

   static {
      if (b() == null) {
         b("spyWpc");
      }
   }
}
