package dev.sixseven.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class i extends g<String> {
   private final int a;
   private final String d;

   public i(String name, String description, String defaultValue) {
      this(name, description, defaultValue, 32, "");
   }

   public i(String name, String description, String defaultValue, int maxLength, String placeholder) {
      super(name, description, defaultValue);
      this.a = maxLength;
      this.d = placeholder;
   }

   public int a() {
      return this.a;
   }

   public String b() {
      return this.d;
   }

   @Override
   public JsonElement f() {
      return new JsonPrimitive(this.b);
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         String var2 = element.getAsString();
         this.b = var2.length() > this.a ? var2.substring(0, this.a) : var2;
      }
   }
}
