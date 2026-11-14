package dev.sixseven.b.d;

public class i extends g {
   private static final float a = 34.0F;
   private static final float f = 18.0F;
   private static final float g = 12.0F;
   private final dev.sixseven.i.i h;
   private boolean i;

   public i(dev.sixseven.m.d themes, dev.sixseven.i.i setting) {
      super(themes, setting);
      this.h = setting;
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 34.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      vg.a(this.h.g(), this.c, this.d + 8.0F, 12.5F, var4.l());
      float var5 = this.c;
      float var6 = this.d + 14.0F;
      float var7 = this.e;
      int var8 = dev.sixseven.n.c.a(-16777216, 0.45F);
      vg.a(var5, var6, var7, 18.0F, 9.0F, var8);
      vg.b(var5, var6, var7, 18.0F, 9.0F, 1.1F, dev.sixseven.n.c.a(this.i ? var4.d() : var4.a(), this.i ? 0.9F : 0.35F));
      float var9 = var5 + 8.0F;
      float var10 = var6 + 9.0F;
      String var11 = this.h.i();
      if (var11.isEmpty() && !this.i) {
         vg.a(this.h.b(), var9, var10, 12.0F, var4.m());
      } else {
         float var12 = vg.a(var11, var9, var10, 12.0F, var4.k());
         if (this.i && System.nanoTime() / 400000000L % 2L == 0L) {
            vg.a(var9 + var12 + 1.5F, var10 - 6.0F, 1.4F, 12.0F, 0.7F, var4.d());
         }
      }
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (button == 0 && this.b(mx, my)) {
         this.i = true;
         dev.sixseven.n.h.d();
         return true;
      } else {
         this.i = false;
         return false;
      }
   }

   @Override
   public boolean a(int keyCode) {
      if (!this.i) {
         return false;
      } else {
         switch (keyCode) {
            case 256:
            case 257:
            case 335:
               this.i = false;
               break;
            case 259:
               String var2 = this.h.i();
               if (!var2.isEmpty()) {
                  this.h.a(var2.substring(0, var2.length() - 1));
               }
         }

         return true;
      }
   }

   @Override
   public boolean b(int codepoint) {
      if (!this.i) {
         return false;
      } else if (this.h.i().length() >= this.h.a()) {
         return true;
      } else if (Character.isValidCodePoint(codepoint) && !Character.isISOControl(codepoint)) {
         dev.sixseven.i.i var2 = this.h;
         String var3 = this.h.i();
         var2.a(var3 + new String(Character.toChars(codepoint)));
         return true;
      } else {
         return true;
      }
   }

   @Override
   public boolean c() {
      return this.i;
   }
}
