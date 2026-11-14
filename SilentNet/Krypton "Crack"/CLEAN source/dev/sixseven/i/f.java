package dev.sixseven.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.List;

public class f extends g<String> {
   private final List<String> a;

   public f(String name, String description, String defaultValue, String... modes) {
      super(name, description, defaultValue);
      this.a = List.of(modes);
      if (!this.a.contains(defaultValue)) {
         throw new IllegalArgumentException("Default mode '" + defaultValue + "' not in modes for " + name);
      }
   }

   public List<String> a() {
      return this.a;
   }

   public boolean a(String mode) {
      return this.i().equals(mode);
   }

   public void b() {
      int var1 = (this.a.indexOf(this.i()) + 1) % this.a.size();
      this.a((String)this.a.get(var1));
   }

   @Override
   public JsonElement f() {
      return new JsonPrimitive(this.b);
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonPrimitive() && this.a.contains(element.getAsString())) {
         this.b = element.getAsString();
      }
   }
}
