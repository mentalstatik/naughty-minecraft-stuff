package dev.sixseven.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import org.lwjgl.glfw.GLFW;

public class e extends g<Integer> {
   public static final int a = -1;

   public e(String name, String description, int defaultKey) {
      super(name, description, defaultKey);
   }

   public boolean a() {
      return this.i() != -1;
   }

   public boolean a(int keyCode) {
      return this.a() && this.i() == keyCode;
   }

   public String b() {
      int var1 = this.i();
      if (var1 == -1) {
         return "None";
      } else if (var1 >= 0 && var1 <= 7) {
         return switch (var1) {
            case 0 -> "LMB";
            case 1 -> "RMB";
            case 2 -> "MMB";
            default -> "MB" + (var1 + 1);
         };
      } else {
         String var2 = GLFW.glfwGetKeyName(var1, 0);
         if (var2 != null) {
            return var2.toUpperCase();
         } else {
            return switch (var1) {
               case 32 -> "SPACE";
               case 257 -> "ENTER";
               case 258 -> "TAB";
               case 259 -> "BACK";
               case 260 -> "INSERT";
               case 261 -> "DELETE";
               case 262 -> "RIGHT";
               case 263 -> "LEFT";
               case 264 -> "DOWN";
               case 265 -> "UP";
               case 266 -> "PGUP";
               case 267 -> "PGDN";
               case 268 -> "HOME";
               case 269 -> "END";
               case 280 -> "CAPS";
               case 340 -> "LSHIFT";
               case 341 -> "LCTRL";
               case 342 -> "LALT";
               case 344 -> "RSHIFT";
               case 345 -> "RCTRL";
               case 346 -> "RALT";
               default -> var1 >= 290 && var1 <= 314 ? "F" + (var1 - 290 + 1) : "KEY" + var1;
            };
         }
      }
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
