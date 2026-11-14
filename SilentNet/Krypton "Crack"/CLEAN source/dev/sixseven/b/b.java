package dev.sixseven.b;

import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class b {
   public static final String a = "__themes__";
   private final Map<String, b.a> b = new LinkedHashMap<>();
   private final Set<String> c = new HashSet<>();
   private boolean d;
   private boolean e;
   private float f = -1.0F;
   private float g = -1.0F;
   private static final int h = 5;
   private static final float i = 210.0F;
   private static final float j = 280.0F;

   public void a() {
      this.e = true;
   }

   public b() {
      float var1 = 16.0F;

      for (dev.sixseven.d.b var5 : dev.sixseven.d.b.a()) {
         this.b.put(var5.name(), new b.a(var1, 16.0F));
         var1 += 222.0F;
      }

      this.b.put("__themes__", new b.a(var1, 320.0F));
   }

   public void a(float var1, float var2) {
      if (!this.e && (!this.d || var1 != this.f || var2 != this.g)) {
         this.d = true;
         this.f = var1;
         this.g = var2;
         String[] var3 = new String[]{
            dev.sixseven.d.b.a.name(),
            dev.sixseven.d.b.b.name(),
            dev.sixseven.d.b.c.name(),
            dev.sixseven.d.b.d.name(),
            dev.sixseven.d.b.e.name(),
            dev.sixseven.d.b.f.name(),
            dev.sixseven.d.b.g.name(),
            "__themes__"
         };
         float var4 = 1960.0F;
         if (var1 >= var4) {
            float var5;
            float var6 = var5 = (var1 - 1680.0F - 280.0F) / 9.0F;

            for (int var7 = 0; var7 < var3.length; var7++) {
               b.a var8 = this.a(var3[var7]);
               var8.a = var6;
               var8.b = 16.0F;
               var8.c = false;
               var6 += 210.0F + var5;
               if (var7 == 3) {
                  var6 += 280.0F + var5;
               }
            }
         } else {
            float var9 = 222.0F;
            int var10 = Math.max(1, (int)((var1 - 24.0F) / var9));

            for (int var11 = 0; var11 < var3.length; var11++) {
               b.a var12 = this.a(var3[var11]);
               var12.a = 12.0F + (float)(var11 % var10) * var9;
               var12.b = 58.0F + (float)(var11 / var10) * var2 * 0.44F;
               var12.c = var11 / var10 > 0;
            }
         }
      }
   }

   public b.a a(String var1) {
      return this.b.computeIfAbsent(var1, var0 -> new b.a(16.0F, 16.0F));
   }

   public boolean b(String var1) {
      return this.c.contains(var1);
   }

   public void a(String var1, boolean var2) {
      if (var2) {
         this.c.add(var1);
      } else {
         this.c.remove(var1);
      }
   }

   public JsonObject b() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("v", 5);
      var1.addProperty("custom", this.e);

      for (Entry var3 : this.b.entrySet()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("x", ((b.a)var3.getValue()).a);
         var4.addProperty("y", ((b.a)var3.getValue()).b);
         var4.addProperty("collapsed", ((b.a)var3.getValue()).c);
         var1.add((String)var3.getKey(), var4);
      }

      return var1;
   }

   public void a(JsonObject var1) {
      if (var1.has("v") && var1.get("v").getAsInt() >= 3 && var1.has("custom") && var1.get("custom").getAsBoolean()) {
         this.d = true;
         this.e = true;

         for (Entry var3 : this.b.entrySet()) {
            JsonObject var4 = var1.getAsJsonObject((String)var3.getKey());
            if (var4 != null) {
               if (var4.has("x")) {
                  ((b.a)var3.getValue()).a = var4.get("x").getAsFloat();
               }

               if (var4.has("y")) {
                  ((b.a)var3.getValue()).b = var4.get("y").getAsFloat();
               }

               if (var4.has("collapsed")) {
                  ((b.a)var3.getValue()).c = var4.get("collapsed").getAsBoolean();
               }
            }
         }

         if (!var1.has(dev.sixseven.d.b.g.name())) {
            b.a var5 = this.a(dev.sixseven.d.b.f.name());
            b.a var7 = this.a(dev.sixseven.d.b.g.name());
            var7.a = var5.a;
            var7.b = var5.b + 340.0F;
            var7.c = true;
         }

         if (!var1.has(dev.sixseven.d.b.b.name())) {
            b.a var6 = this.a(dev.sixseven.d.b.a.name());
            b.a var8 = this.a(dev.sixseven.d.b.b.name());
            var8.a = var6.a;
            var8.b = var6.b + 340.0F;
            var8.c = true;
         }
      }
   }

   public static class a {
      public float a;
      public float b;
      public boolean c;

      a(float var1, float var2) {
         this.a = var1;
         this.b = var2;
      }
   }
}
