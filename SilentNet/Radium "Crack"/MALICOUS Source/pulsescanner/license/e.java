package pulsescanner.license;

import com.google.gson.JsonObject;
import java.time.Instant;
import native0.Loader;
import native0.hidden.Hidden0;

record e(boolean g, String h, Instant i, JsonObject j, byte[] k) {
   static native e a(String var0);

   @Override
   public final native String toString();

   @Override
   public final native int hashCode();

   @Override
   public final native boolean equals(Object var1);

   public native boolean g();

   public native String h();

   public native Instant i();

   public native JsonObject j();

   public native byte[] k();

   private static native MatchException a(MatchException var0);

   static {
      Loader.registerNativesForClass(5, e.class);
      Hidden0.special_clinit_5_110(e.class);
   }
}
