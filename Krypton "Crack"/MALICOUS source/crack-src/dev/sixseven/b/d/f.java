package dev.sixseven.b.d;

import java.util.ArrayList;
import java.util.List;

public class f extends g {
   private static final float a = 16.0F;
   private static final float f = 12.5F;
   private static final float g = 10.0F;
   private final dev.sixseven.i.f h;
   private final List<float[]> i = new ArrayList<>();
   private int j = 1;

   public f(dev.sixseven.m.d themes, dev.sixseven.i.f setting) {
      super(themes, setting);
      this.h = setting;
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 17.0F + (float)this.j * 16.0F + 3.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      vg.a(this.h.g(), this.c, this.d + 8.0F, 12.5F, var4.l());
      this.i.clear();
      float var5 = this.c;
      float var6 = this.d + 17.0F + 8.0F;
      this.j = 1;

      for (String var8 : this.h.a()) {
         float var9 = vg.a(var8, 12.5F);
         if (var5 + var9 > this.c + this.e && var5 > this.c) {
            var5 = this.c;
            var6 += 16.0F;
            this.j++;
         }

         boolean var10 = this.h.a(var8);
         boolean var11 = mx >= var5 && mx <= var5 + var9 && my >= var6 - 8.0F && my <= var6 + 8.0F;
         if (var10) {
            vg.a(var8, var5, var6, 12.5F, var4.d(), var4.a());
         } else {
            vg.a(var8, var5, var6, 12.5F, var11 ? var4.k() : var4.m());
         }

         this.i.add(new float[]{var5, var6 - 8.0F, var9});
         var5 += var9 + 10.0F;
      }
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (button != 0) {
         return false;
      } else {
         List var4 = this.h.a();

         for (int var5 = 0; var5 < this.i.size() && var5 < var4.size(); var5++) {
            float[] var6 = this.i.get(var5);
            if (mx >= var6[0] && mx <= var6[0] + var6[2] && my >= var6[1] && my <= var6[1] + 16.0F) {
               this.h.a((String)((String)var4.get(var5)));
               dev.sixseven.n.h.d();
               return true;
            }
         }

         return false;
      }
   }
}
