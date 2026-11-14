package pulsescanner.b;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import native0.Loader;
import native0.hidden.Hidden0;
import pulsescanner.f.i;

public final class a {
   private static final Gson a;
   private static final Path b;
   private static final Path[] c;
   public static final String d;
   private static final String[] e;
   private static JsonObject f;
   private static int[] g;
   private static final String[] h;

   private a() {
   }

   public static native boolean a(pulsescanner.c.a var0);

   public static native JsonObject a();

   public static native JsonObject a(boolean var0);

   public static native void a(JsonObject var0, boolean var1);

   private static native void a(i var0);

   public static native void b();

   public static native void c();

   private static native void d();

   private static native String e();

   private static native JsonObject f();

   private static native void a(JsonObject var0);

   public static native String g();

   public static native void a(String var0);

   static {
      Loader.registerNativesForClass(0, a.class);
      Hidden0.special_clinit_0_140(a.class);
   }

   public static native void b(int[] var0);

   public static native int[] h();

   private static native Exception a(Exception var0);
}
