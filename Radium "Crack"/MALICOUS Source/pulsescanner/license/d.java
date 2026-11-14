package pulsescanner.license;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;

public final class d {
   private static final String a;
   private static final String b;
   private static final String c;
   private static final String d;
   private static final String e;
   private static final String f;
   private static final String g;
   public static final Duration h;
   private static final Duration i;
   public static final String j;
   private static final Path k;
   private static final Gson l;
   private static final HttpClient m;
   private static final SecureRandom n;
   private static volatile a o;
   private static volatile String p;
   private static volatile String q;
   private static volatile Instant r;
   private static volatile boolean s;
   private static volatile int t;
   private static long u;
   private static JsonObject v;
   private static volatile byte[] w;
   private static volatile boolean x;
   public static volatile boolean y = true;
   private static final byte[] z;
   private static final byte[] A;
   private static final String B;
   private static boolean C;
   private static final String[] D;

   private d() {
   }

   public static boolean a() {
      return true;
   }

   public static a b() {
      return null;
   }

   public static native boolean c();

   public static native String d();

   public static native String e();

   public static byte[] f() {
      return new byte[0];
   }

   public static boolean g() {
      return true;
   }

   private static native void a(byte[] var0);

   private static native void h();

   public static native int i();

   public static String j() {
      return "";
   }

   public static void k() {
   }

   public static native boolean l();

   public static native void m();

   public static void n() {
   }

   private static native String o();

   private static native void a(String var0);

   private static native void a(String var0, e var1);

   private static native byte[] a(JsonObject var0);

   private static native e b(String var0);

   private static native e a(f var0, String var1);

   private static native Instant b(JsonObject var0);

   private static native f a(String var0, String var1) throws IOException, InterruptedException;

   private static native String a(String var0, String var1, String var2) throws IOException, InterruptedException;

   private static native HttpRequest a(String var0, JsonObject var1, String var2);

   private static native String p();

   private static native e b(String var0, String var1);

   private static native JsonObject a(String var0, HttpResponse<byte[]> var1);

   private static native void a(String var0, String var1, byte[] var2, String var3, String var4);

   private static native PublicKey q() throws Exception;

   private static native String b(byte[] var0);

   private static native Map<String, String> c(String var0);

   private static native String c(String var0, String var1);

   private static native String a(JsonObject var0, String var1);

   private static native String b(JsonObject var0, String var1);

   private static native void r();

   private static native void s();

   private static native void lambda$verify$6(String var0, String var1);

   private static native SecurityException lambda$verify$5();

   private static native SecurityException lambda$verify$4();

   private static native void lambda$check$3(String var0, e var1);

   private static native void lambda$check$2(String var0, e var1);

   private static native e lambda$check$1(Throwable var0);

   private static native e lambda$check$0(String var0);

   public static native void b(boolean var0);

   public static native boolean t();

   public static native boolean u();

   private static native Throwable a(Throwable var0);
}
