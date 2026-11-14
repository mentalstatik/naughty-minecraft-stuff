package pulsescanner.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import pulsescanner.f.i;

public class c extends a<Boolean> {
   public float g;
   private static String h;

   public c(String var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.g = var3 ? 1.0F : 0.0F;
   }

   public void g() {
      i[] var1 = pulsescanner.i.a.f();

      c var10000;
      boolean var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = this.a();
               if (var1 == null) {
                  break label22;
               }

               if (!var10001) {
                  break label21;
               }
            } catch (MatchException var2) {
               throw a(var2);
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var10000.a(var10001);
   }

   @Override
   public JsonElement e() {
      return new JsonPrimitive(this.a());
   }

   @Override
   public void a(JsonElement var1) {
      try {
         if (var1.isJsonPrimitive()) {
            this.a(var1.getAsBoolean());
         }
      } catch (MatchException var2) {
         throw a(var2);
      }
   }

   public static void b(String var0) {
      h = var0;
   }

   public static String h() {
      return h;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      if (h() == null) {
         b("kUWOYb");
      }
   }
}
