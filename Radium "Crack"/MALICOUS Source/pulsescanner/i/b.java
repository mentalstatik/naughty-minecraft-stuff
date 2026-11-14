package pulsescanner.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;

public class b extends a<Runnable> {
   public b(String var1, String var2, Runnable var3) {
      super(var1, var2, var3);
   }

   public void g() {
      this.d.run();
   }

   @Override
   public JsonElement e() {
      return JsonNull.INSTANCE;
   }

   @Override
   public void a(JsonElement var1) {
   }
}
