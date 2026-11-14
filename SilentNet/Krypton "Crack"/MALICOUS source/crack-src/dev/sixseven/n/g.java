package dev.sixseven.n;

import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_7923;

public final class g {
   public static final class_3414 a = a("ui.gui_open");
   public static final class_3414 b = a("ui.gui_close");
   public static final class_3414 c = a("ui.hover");
   public static final class_3414 d = a("ui.toggle_on");
   public static final class_3414 e = a("ui.toggle_off");
   public static final class_3414 f = a("ui.slider");
   public static final class_3414 g = a("ui.select");
   public static final class_3414 h = a("ui.keybind");
   public static final class_3414 i = a("ui.notify_on");
   public static final class_3414 j = a("ui.notify_off");
   public static final class_3414 k = a("startup.sad");
   public static final class_3414 l = a("startup.song");
   public static final class_3414 m = a("startup.tiki");
   public static final class_3414 n = a("startup.67");

   private g() {
   }

   private static class_3414 a(String name) {
      class_2960 var1 = class_2960.method_60655("sixsevenclient", name);
      return (class_3414)class_2378.method_10230(class_7923.field_41172, var1, class_3414.method_47908(var1));
   }

   public static void a() {
   }
}
