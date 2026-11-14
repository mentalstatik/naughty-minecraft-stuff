package pulsescanner.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Locale;
import pulsescanner.f.i;

public class g extends a<Double> {
   public final double g;
   public final double h;
   public final double i;
   public final String j;
   public float k = -1.0F;
   private static final String[] l;

   public g(String var1, String var2, double var3, double var5, double var7, double var9) {
      this(var1, var2, var3, var5, var7, var9, "");
   }

   public g(String var1, String var2, double var3, double var5, double var7, double var9, String var11) {
      super(var1, var2, var3);
      this.g = var5;
      this.h = var7;
      this.i = var9;
      this.j = var11;
   }

   public void a(Double var1) {
      double var2 = Math.max(this.g, Math.min(this.h, var1));
      if (this.i > 0.0) {
         var2 = (double)Math.round(var2 / this.i) * this.i;
      }

      super.a(Math.max(this.g, Math.min(this.h, var2)));
   }

   public float g() {
      return this.a().floatValue();
   }

   public int h() {
      return (int)Math.round(this.a());
   }

   public double i() {
      return (this.a() - this.g) / (this.h - this.g);
   }

   public String j() {
      i[] var1 = pulsescanner.i.a.f();

      g var10000;
      label38: {
         label44: {
            try {
               var10000 = this;
               if (var1 == null) {
                  break label38;
               }

               if (!(this.i >= 1.0)) {
                  break label44;
               }
            } catch (MatchException var5) {
               throw a(var5);
            }

            String var2 = String.valueOf(Math.round(this.a()));

            try {
               if (var1 != null) {
                  return var2 + this.j;
               }

               pulsescanner.f.i.b(new int[1]);
            } catch (MatchException var4) {
               throw a(var4);
            }
         }

         var10000 = this;
      }

      if (var10000.i >= 0.1) {
         String[] var3 = l;
         String var6 = String.format(Locale.ROOT, var3[1], this.a());
         if (var1 != null) {
            return var6 + this.j;
         }
      }

      String var7 = String.format(Locale.ROOT, l[0], this.a());
      return var7 + this.j;
   }

   @Override
   public JsonElement e() {
      return new JsonPrimitive(this.a());
   }

   @Override
   public void a(JsonElement var1) {
      try {
         if (var1.isJsonPrimitive()) {
            this.a(var1.getAsDouble());
         }
      } catch (MatchException var2) {
         throw a(var2);
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\t4A!\u0004\t4B!";
      int var4 = "\t4A!\u0004\t4B!".length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 51;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 31;
               case 1 -> 41;
               case 2 -> 64;
               case 3 -> 116;
               case 4 -> 45;
               case 5 -> 14;
               default -> 47;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            l = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}
