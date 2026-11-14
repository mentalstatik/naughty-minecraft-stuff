package dev.sixseven.c.a;

import dev.sixseven.d.a.aa;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class g extends dev.sixseven.c.a {
   private static final float c = 8.0F;
   private static final float d = 12.0F;
   private static final float e = 108.0F;
   private static final float f = 15.0F;
   private static final float g = 5.0F;
   private static final float h = 8.0F;
   private static final float i = 12.0F;
   private static final int j = 2;
   private final aa k;
   private final dev.sixseven.m.d l;

   public g(aa module, dev.sixseven.m.d themes) {
      super("regionMap", 0.008F, 0.05F, module::f);
      this.k = module;
      this.l = themes;
   }

   private float g() {
      return (float)Math.ceil((double)this.k.m() / 2.0);
   }

   @Override
   public float b(dev.sixseven.g.b.d vg) {
      return 124.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d vg) {
      float var2 = 144.0F;
      if (this.k.e.i()) {
         var2 += 8.0F + this.g() * 12.0F;
      }

      return var2;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float x, float y, float w, float h) {
      dev.sixseven.m.c var6 = this.l.a();
      class_746 var7 = class_310.method_1551().field_1724;
      if (var7 != null) {
         float var8 = 10.0F;
         vg.c(x, y, w, hx, 13.0F, 8.0F, dev.sixseven.n.c.a(-16777216, 0.3F));
         vg.a(x, y, w, hx, var8, var6.f(), var6.g(), true);
         int var9 = this.k.n();
         int var10 = this.k.d(var7.method_23317(), var7.method_23321());
         this.a(vg, var6, x, y, w, var9);
         float var11 = x + 8.0F;
         float var12 = y + 8.0F + 15.0F + 5.0F;
         this.a(vg, var6, var7, var11, var12);
         if (this.k.e.i()) {
            this.a(vg, var6, var11, var12 + 108.0F + 8.0F, var10);
         }
      }
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float x, float y, float w, int currentId) {
      float var7 = y + 8.0F + 7.5F;
      vg.a("REGION MAP", x + 8.0F, var7, 9.0F, theme.k());
      String var8 = currentId >= 0 ? "#" + currentId : "N/A";
      float var9 = vg.a(var8, 8.5F);
      float var10 = var9 + 9.0F;
      float var11 = 12.5F;
      float var12 = x + w - 8.0F - var10;
      float var13 = var7 - var11 / 2.0F;
      boolean var14 = currentId >= 0;
      vg.a(var12, var13, var10, var11, 6.0F, dev.sixseven.n.c.a(theme.a(), var14 ? 0.18F : 0.1F));
      vg.b(var12, var13, var10, var11, 6.0F, 1.0F, dev.sixseven.n.c.a(theme.a(), var14 ? 0.45F : 0.2F));
      vg.a(var8, var12 + 4.5F, var7, 8.5F, var14 ? theme.d() : theme.l());
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, class_746 player, float gridX, float gridY) {
      int var6 = this.k.l();
      int var7 = (int)(Math.clamp(this.k.b.d() / 100.0F, 0.0F, 1.0F) * 255.0F);
      vg.a(gridX, gridY, 108.0F, 108.0F, 4.0F, dev.sixseven.n.c.a(-16054000, 0.92F));
      vg.e();
      vg.a(gridX, gridY, 108.0F, 108.0F);

      for (int var8 = 0; var8 < var6; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            int var10 = this.k.d(var8 * var6 + var9);
            if (var10 >= 0) {
               int var11 = dev.sixseven.n.c.a(0xFF000000 | this.k.c(var10), var7);
               float var12 = gridX + (float)var9 * 12.0F;
               float var13 = gridY + (float)var8 * 12.0F;
               vg.a(var12 + 1.0F, var13 + 1.0F, 10.0F, 10.0F, 1.5F, var11);
            }
         }
      }

      if (this.k.c.i()) {
         int var18 = dev.sixseven.n.c.a(theme.a(), 0.14F);

         for (int var20 = 0; var20 <= var6; var20++) {
            float var22 = (float)var20 * 12.0F;
            vg.b(gridX + var22, gridY, gridX + var22, gridY + 108.0F, 1.0F, var18);
            vg.b(gridX, gridY + var22, gridX + 108.0F, gridY + var22, 1.0F, var18);
         }
      }

      int[] var19 = this.k.a(player.method_23317(), player.method_23321());
      boolean var21 = var19[0] >= 0 && var19[0] < var6 && var19[1] >= 0 && var19[1] < var6;
      if (var21) {
         float var23 = gridX + (float)var19[0] * 12.0F;
         float var26 = gridY + (float)var19[1] * 12.0F;
         vg.c(var23, var26, 12.0F, 12.0F, 2.0F, 3.0F, dev.sixseven.n.c.a(theme.a(), 0.35F));
         vg.b(var23 + 0.5F, var26 + 0.5F, 11.0F, 11.0F, 2.0F, 1.2F, theme.d());
      }

      if (this.k.d.i()) {
         for (int var24 = 0; var24 < var6; var24++) {
            for (int var27 = 0; var27 < var6; var27++) {
               int var29 = this.k.d(var24 * var6 + var27);
               if (var29 >= 0) {
                  String var31 = String.valueOf(this.k.e(var24 * var6 + var27));
                  float var14 = var31.length() >= 3 ? 5.5F : 6.5F;
                  float var15 = vg.a(var31, var14);
                  float var16 = gridX + (float)var27 * 12.0F + (12.0F - var15) / 2.0F;
                  float var17 = gridY + (float)var24 * 12.0F + 6.0F;
                  vg.a(var31, var16 + 0.5F, var17 + 0.5F, var14, dev.sixseven.n.c.a(-16777216, 0.55F));
                  vg.a(var31, var16, var17, var14, -790280);
               }
            }
         }
      }

      if (var21) {
         double[] var25 = this.k.b(player.method_23317(), player.method_23321());
         float var28 = gridX + (float)(((double)var19[0] + var25[0]) * 12.0);
         float var30 = gridY + (float)(((double)var19[1] + var25[1]) * 12.0);
         vg.a(var28, var30, 2.2F, 3.5F, dev.sixseven.n.c.a(theme.a(), 0.75F));
         vg.e();
         vg.a(var28, var30);
         vg.c((float)Math.toRadians((double)(player.method_36454() + 180.0F)));
         vg.a(0.0F, -4.9F, 3.3F, 2.9F, -3.3F, 2.9F, dev.sixseven.n.c.a(-16777216, 0.55F));
         vg.a(0.0F, -4.0F, 2.6F, 2.2F, -2.6F, 2.2F, theme.d());
         vg.f();
      }

      vg.f();
      vg.b(gridX, gridY, 108.0F, 108.0F, 4.0F, 1.0F, dev.sixseven.n.c.a(theme.a(), 0.5F));
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float lx, float ly, int currentType) {
      float var6 = 54.0F;

      for (int var7 = 0; var7 < this.k.m(); var7++) {
         int var8 = var7 % 2;
         int var9 = var7 / 2;
         float var10 = lx + (float)var8 * var6;
         float var11 = ly + (float)var9 * 12.0F + 6.0F;
         vg.a(var10, var11 - 2.5F, 5.0F, 5.0F, 1.2F, 0xFF000000 | this.k.c(var7));
         boolean var12 = var7 == currentType;
         vg.a(this.k.b(var7), var10 + 8.0F, var11, 7.5F, var12 ? theme.d() : theme.l());
      }
   }
}
