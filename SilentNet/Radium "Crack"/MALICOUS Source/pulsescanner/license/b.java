package pulsescanner.license;

import native0.Loader;
import native0.hidden.Hidden0;

public final class b {
   private static String a;
   private static final String[] b;

   private b() {
   }

   public static synchronized native String a();

   private static native String b();

   private static native String a(String var0, String var1);

   private static native String a(String... var0) throws Exception;

   private static native String c();

   static native String a(String var0);

   private static native Throwable a(Throwable var0);

   static {
      Loader.registerNativesForClass(1, b.class);
      Hidden0.special_clinit_1_80(b.class);
   }
}
