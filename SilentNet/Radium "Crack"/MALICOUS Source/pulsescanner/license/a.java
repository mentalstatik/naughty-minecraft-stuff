package pulsescanner.license;

import native0.Loader;
import native0.hidden.Hidden0;

public enum a {
   NO_KEY,
   CHECKING,
   LICENSED,
   INVALID;

   private static final a[] a;

   private static native a[] a();

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      Loader.registerNativesForClass(7, a.class);
      Hidden0.special_clinit_7_40(a.class);
   }
}
