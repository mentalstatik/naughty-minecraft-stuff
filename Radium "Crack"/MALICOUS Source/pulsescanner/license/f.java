package pulsescanner.license;

import com.google.gson.JsonObject;
import native0.Loader;
import native0.hidden.Hidden0;

record f(JsonObject l, int m, JsonObject n) {
   @Override
   public final native String toString();

   @Override
   public final native int hashCode();

   @Override
   public final native boolean equals(Object var1);

   public native JsonObject l();

   public native int m();

   public native JsonObject n();

   static {
      Loader.registerNativesForClass(6, f.class);
      Hidden0.special_clinit_6_70(f.class);
   }
}
