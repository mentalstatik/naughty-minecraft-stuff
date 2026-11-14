package dev.sixseven.i;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class a extends g<List<dev.sixseven.i.a.a>> {
   public static final int a = -16711736;
   private final Set<class_2960> d = new HashSet<>();

   public a(String name, String description) {
      super(name, description, new ArrayList<>());
   }

   public List<dev.sixseven.i.a.a> a() {
      return this.b;
   }

   public int b() {
      return this.b.size();
   }

   public long c() {
      return this.b.stream().filter(t -> t.a.i()).count();
   }

   public boolean a(class_2960 id) {
      return this.d.contains(id);
   }

   public dev.sixseven.i.a.a a(class_2248 block) {
      if (block == null) {
         return null;
      } else {
         class_2960 var2 = class_7923.field_41175.method_10221(block);
         if (var2 != null && this.d.contains(var2)) {
            for (dev.sixseven.i.a.a var4 : this.b) {
               if (var4.a().equals(var2)) {
                  return var4;
               }
            }

            return null;
         } else {
            return null;
         }
      }
   }

   public boolean b(class_2248 block) {
      dev.sixseven.i.a.a var2 = this.a(block);
      return var2 != null && var2.a.i();
   }

   public dev.sixseven.i.a.a a(class_2248 block, boolean enabled, int color) {
      if (block != null && block != class_2246.field_10124) {
         class_2960 var4 = class_7923.field_41175.method_10221(block);
         if (var4 != null && !this.d.contains(var4)) {
            dev.sixseven.i.a.a var5 = new dev.sixseven.i.a.a(var4, block, enabled, color);
            this.b.add(var5);
            this.d.add(var4);
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(dev.sixseven.i.a.a target) {
      if (this.b.remove(target)) {
         this.d.remove(target.a());
      }
   }

   public void d() {
      this.b.clear();
      this.d.clear();
   }

   public List<class_2248> a(String rawQuery, int limit) {
      String var3 = rawQuery == null ? "" : rawQuery.trim().toLowerCase(Locale.ROOT);
      ArrayList var4 = new ArrayList();
      if (!var3.isEmpty() && limit > 0) {
         for (class_2248 var6 : class_7923.field_41175) {
            if (var6 != class_2246.field_10124 && var6 != class_2246.field_10543 && var6 != class_2246.field_10243) {
               class_2960 var7 = class_7923.field_41175.method_10221(var6);
               if (var7 != null && !this.d.contains(var7)) {
                  String var8 = var7.method_12832().toLowerCase(Locale.ROOT);
                  String var9 = var7.method_12836().toLowerCase(Locale.ROOT);
                  String var10 = c(var6).toLowerCase(Locale.ROOT);
                  if (var8.contains(var3) || var9.contains(var3) || var10.contains(var3)) {
                     var4.add(var6);
                     if (var4.size() >= limit) {
                        break;
                     }
                  }
               }
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   public static String c(class_2248 block) {
      try {
         return block.method_9518().getString();
      } catch (Throwable var3) {
         class_2960 var2 = class_7923.field_41175.method_10221(block);
         return var2 != null ? var2.method_12832() : "block";
      }
   }

   public void e() {
      this.d();
      this.a(class_2246.field_10442, true, -16711736);
      this.a(class_2246.field_29029, true, -16711736);
      this.a(class_2246.field_10013, false, -16711868);
      this.a(class_2246.field_29220, false, -16711868);
      this.a(class_2246.field_22109, true, -39356);
      this.a(class_2246.field_23077, false, -10496);
      this.a(class_2246.field_10571, false, -10496);
      this.a(class_2246.field_29026, false, -10496);
      this.a(class_2246.field_10212, false, -3618616);
      this.a(class_2246.field_29027, false, -3618616);
      this.a(class_2246.field_10418, false, -12303292);
      this.a(class_2246.field_29219, false, -12303292);
      this.a(class_2246.field_27120, false, -4689101);
      this.a(class_2246.field_29221, false, -4689101);
      this.a(class_2246.field_10090, false, -12490271);
      this.a(class_2246.field_29028, false, -12490271);
      this.a(class_2246.field_10080, false, -65536);
      this.a(class_2246.field_29030, false, -65536);
      this.a(class_2246.field_10260, false, -7846657);
      this.a(class_2246.field_10398, false, -12255250);
      this.a(class_2246.field_10034, false, -22016);
   }

   @Override
   public JsonElement f() {
      JsonArray var1 = new JsonArray();

      for (dev.sixseven.i.a.a var3 : this.b) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("id", var3.a().toString());
         var4.addProperty("enabled", var3.a.i());
         var4.addProperty("color", var3.b.i());
         var1.add(var4);
      }

      return var1;
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonArray()) {
         this.d();
         Iterator var2 = element.getAsJsonArray().iterator();

         while (true) {
            JsonObject var3;
            class_2960 var4;
            while (true) {
               if (!var2.hasNext()) {
                  return;
               }

               JsonElement var5 = (JsonElement)var2.next();
               if (var5.isJsonObject()) {
                  var3 = var5.getAsJsonObject();
                  if (var3.has("id")) {
                     try {
                        var4 = class_2960.method_60654(var3.get("id").getAsString());
                        break;
                     } catch (Exception var8) {
                     }
                  }
               }
            }

            class_2248 var9 = (class_2248)class_7923.field_41175.method_63535(var4);
            if (var9 != null && var9 != class_2246.field_10124) {
               boolean var6 = !var3.has("enabled") || var3.get("enabled").getAsBoolean();
               int var7 = var3.has("color") ? var3.get("color").getAsInt() : -16711736;
               this.a(var9, var6, var7);
            }
         }
      }
   }

   public static final class a {
      private final class_2960 c;
      private final class_2248 d;
      public final b a;
      public final c b;

      a(class_2960 id, class_2248 block, boolean enabled, int color) {
         this.c = id;
         this.d = block;
         this.a = new b("Enabled", "Highlight this block", enabled);
         this.b = new c(dev.sixseven.i.a.c(block), "Highlight color", color);
      }

      public class_2960 a() {
         return this.c;
      }

      public class_2248 b() {
         return this.d;
      }

      public String c() {
         return this.b.g();
      }
   }
}
