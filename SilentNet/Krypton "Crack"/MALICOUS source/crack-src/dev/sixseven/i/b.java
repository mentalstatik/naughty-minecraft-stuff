package dev.sixseven.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class b extends g<Boolean> {
   public b(String name, String description, boolean defaultValue) {
      super(name, description, defaultValue);
   }

   public void a() {
      this.a(!this.i());
   }

   @Override
   public JsonElement f() {
      return new JsonPrimitive(this.b);
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonPrimitive() && element.getAsJsonPrimitive().isBoolean()) {
         this.b = element.getAsBoolean();
      }
   }
}
