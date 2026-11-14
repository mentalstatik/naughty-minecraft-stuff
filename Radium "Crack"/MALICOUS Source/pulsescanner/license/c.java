package pulsescanner.license;

import com.google.gson.JsonObject;
import java.net.http.HttpClient;
import java.util.Collections;
import java.util.List;

public final class c {
   private static final String a;
   private static final String b;
   private static final int c = 12;
   private static final int d = 128;
   private static final HttpClient e;
   private static volatile boolean f;
   private static volatile List<String> g;
   private static final String[] h;

   private c() {
   }

   public static List a() {
      return Collections.emptyList();
   }

   private static synchronized native void b();

   private static native byte[] a(byte[] var0);

   private static native byte[] b(byte[] var0);

   private static native String c();

   private static native List<String> a(JsonObject var0, String var1);

   private static native Throwable a(Throwable var0);
}
