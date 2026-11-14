package dev.sixseven.b.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a extends c {
   private static final float g = 3.0F;
   private static final float h = 6.0F;
   private final dev.sixseven.d.b i;
   private final List<b> j = new ArrayList<>();
   private String k = "";

   public a(dev.sixseven.d.b category, dev.sixseven.d.d modules, dev.sixseven.m.d themes, dev.sixseven.b.b state) {
      super(themes, state.a(category.name()));
      this.i = category;

      for (dev.sixseven.d.c var6 : modules.a(category)) {
         this.j.add(new b(var6, themes, state));
      }
   }

   public void a(String query) {
      this.k = query == null ? "" : query.toLowerCase(Locale.ROOT).trim();
   }

   private List<b> i() {
      return this.k.isEmpty() ? this.j : this.j.stream().filter(e -> e.a().a().toLowerCase(Locale.ROOT).contains(this.k)).toList();
   }

   @Override
   protected String a() {
      return this.i.b();
   }

   @Override
   protected int b() {
      return dev.sixseven.g.b.b.a(this.i);
   }

   @Override
   protected float a(dev.sixseven.g.b.d vg) {
      float var2 = 12.0F;

      for (b var4 : this.i()) {
         var2 += var4.a(vg) + 3.0F;
      }

      return var2 - 3.0F;
   }

   @Override
   protected void a(dev.sixseven.g.b.d vg, float startY, float mx, float my, float viewTop, float viewBottom) {
      float var7 = startY;
      float var8 = 198.0F;

      for (b var10 : this.i()) {
         float var11 = var10.a(vg);
         var10.a(this.f.a + 6.0F, var7, var8);
         if (var7 + var11 >= viewTop - 20.0F && var7 <= viewBottom + 20.0F) {
            float var12 = this.a(var7, var7 + var11, viewTop, viewBottom);
            var10.a(vg, mx, my, var12);
         }

         var7 += var11 + 3.0F;
      }
   }

   @Override
   public boolean a(float mx, float my, int button) {
      for (b var5 : this.i()) {
         if (var5.a(mx, my, button)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void a(float mx, float my) {
      for (b var4 : this.i()) {
         var4.a(mx, my);
      }
   }

   @Override
   public void c() {
      for (b var2 : this.i()) {
         var2.b();
      }
   }

   @Override
   public boolean a(int keyCode) {
      for (b var3 : this.i()) {
         if (var3.a(keyCode)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean b(int codepoint) {
      for (b var3 : this.i()) {
         if (var3.b(codepoint)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean d() {
      for (b var2 : this.i()) {
         if (var2.c()) {
            return true;
         }
      }

      return false;
   }
}
