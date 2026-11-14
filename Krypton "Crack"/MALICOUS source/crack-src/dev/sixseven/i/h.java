package dev.sixseven.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.DoubleFunction;

public class h extends g<Double> {
   private final double a;
   private final double d;
   private final double e;
   private final String f;
   private DoubleFunction<String> g;

   public h(String name, String description, double defaultValue, double min, double max, double step) {
      this(name, description, defaultValue, min, max, step, "");
   }

   public h(String name, String description, double defaultValue, double min, double max, double step, String suffix) {
      super(name, description, defaultValue);
      this.a = min;
      this.d = max;
      this.e = step;
      this.f = suffix;
   }

   public double a() {
      return this.a;
   }

   public double b() {
      return this.d;
   }

   public String c() {
      return this.f;
   }

   public float d() {
      return this.i().floatValue();
   }

   public int e() {
      return (int)Math.round(this.i());
   }

   public double l() {
      return (this.i() - this.a) / (this.d - this.a);
   }

   public void a(double t) {
      this.a(Double.valueOf(this.a + (this.d - this.a) * Math.clamp(t, 0.0, 1.0)));
   }

   public void a(Double newValue) {
      double var2 = (double)Math.round(newValue / this.e) * this.e;
      var2 = (double)Math.round(var2 * 1000000.0) / 1000000.0;
      super.a(Math.clamp(var2, this.a, this.d));
   }

   public h a(DoubleFunction<String> labelFn) {
      this.g = labelFn;
      return this;
   }

   public String m() {
      if (this.g != null) {
         return this.g.apply(this.i());
      } else {
         double var1 = this.i();
         String var3;
         if (this.e >= 1.0 && var1 == Math.floor(var1)) {
            var3 = Long.toString((long)var1);
         } else {
            var3 = String.valueOf((double)Math.round(var1 * 100.0) / 100.0);
            if (var3.endsWith(".0")) {
               var3 = var3.substring(0, var3.length() - 2);
            }
         }

         return var3 + this.f;
      }
   }

   @Override
   public JsonElement f() {
      return new JsonPrimitive(this.b);
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber()) {
         this.a(Double.valueOf(element.getAsDouble()));
      }
   }
}
