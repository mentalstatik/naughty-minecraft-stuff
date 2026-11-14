package dev.sixseven.e;

import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9129;
import net.minecraft.class_9135;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

public record b(boolean c) implements class_8710 {
   public static final class_9154<b> a = new class_9154(class_2960.method_60655("sixsevenclient", "nofall_toggle"));
   public static final class_9139<class_9129, b> b = class_9139.method_56434(class_9135.field_48547, b::a, b::new);

   public class_9154<? extends class_8710> method_56479() {
      return a;
   }

   public boolean a() {
      return this.c;
   }
}
