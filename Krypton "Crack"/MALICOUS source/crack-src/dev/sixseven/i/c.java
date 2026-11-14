package dev.sixseven.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class c extends g<Integer> {
   public c(String name, String description, int defaultArgb) {
      super(name, description, defaultArgb);
   }

   public int a() {
      return this.i() >> 16 & 0xFF;
   }

   public int b() {
      return this.i() >> 8 & 0xFF;
   }

   public int c() {
      return this.i() & 0xFF;
   }

   public int d() {
      return this.i() >>> 24 & 0xFF;
   }

   public void a(int r) {
      this.a(Integer.valueOf(this.i() & -16711681 | (r & 0xFF) << 16));
   }

   public void b(int g) {
      this.a(Integer.valueOf(this.i() & -65281 | (g & 0xFF) << 8));
   }

   public void c(int b) {
      this.a(Integer.valueOf(this.i() & -256 | b & 0xFF));
   }

   public String e() {
      return String.format("#%06X", this.i() & 16777215);
   }

   @Override
   public JsonElement f() {
      return new JsonPrimitive(this.b);
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber()) {
         this.b = element.getAsInt();
      }
   }
}
