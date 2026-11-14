package pulsescanner.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.awt.Color;

public class d extends a<Integer> {
   public boolean g;
   public float h;
   public float i = -1.0F;
   public float j;
   public float k;
   private static final String l;

   public void g() {
      float[] var1 = this.h();
      this.i = var1[0];
      this.j = var1[1];
      this.k = var1[2];
   }

   public d(String var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   public float[] h() {
      int var1 = this.a();
      return Color.RGBtoHSB(var1 >> 16 & 0xFF, var1 >> 8 & 0xFF, var1 & 0xFF, null);
   }

   public int i() {
      return this.a() >>> 24 & 0xFF;
   }

   public void a(float var1, float var2, float var3, int var4) {
      int var5 = Color.HSBtoRGB(var1, var2, var3) & 16777215;
      this.a(Math.max(0, Math.min(255, var4)) << 24 | var5);
   }

   @Override
   public JsonElement e() {
      return new JsonPrimitive(String.format(l, this.a()));
   }

   @Override
   public void a(JsonElement var1) {
      try {
         String var2 = var1.getAsString().replace("#", "");
         this.a((int)Long.parseLong(var2, 16));
      } catch (Exception var3) {
      }
   }

   static {
      char[] var10003 = "J!\u0003\u0002b".toCharArray();
      int var10004 = var10003.length;
      byte var5 = 28;
      char[] var10002 = var10003;
      int var1 = var10004;

      for (int var0 = 0; var1 > var0; var0++) {
         var10002[var0] = (char)(var10002[var0] ^ var5 ^ switch (var0 % 7) {
            case 0 -> 117;
            case 1 -> 24;
            case 2 -> 47;
            case 3 -> 38;
            case 4 -> 38;
            case 5 -> 97;
            default -> 110;
         });
      }

      String var7 = new String(var10002).intern();
      byte var3 = -1;
      l = var7;
   }
}
