package pulsescanner.license;

import native0.Loader;
import native0.hidden.Hidden0;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;

public class g extends class_437 {
   private class_4185 a;
   private static final String[] b;

   public g() {
      super(class_2561.method_43470(b[1]));
   }

   protected native void method_25426();

   public native void method_25393();

   public native void method_25394(class_332 var1, int var2, int var3, float var4);

   public native boolean method_25422();

   private native void lambda$init$1(class_4185 var1);

   private static native void lambda$init$0(class_4185 var0);

   private static native MatchException a(MatchException var0);

   static {
      Loader.registerNativesForClass(8, g.class);
      Hidden0.special_clinit_8_80(g.class);
   }
}
