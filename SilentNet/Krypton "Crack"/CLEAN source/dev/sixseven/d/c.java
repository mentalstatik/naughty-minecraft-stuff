package dev.sixseven.d;

import dev.sixseven.i.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

public abstract class c {
   private final String a;
   private final String b;
   private final b c;
   private final dev.sixseven.i.e d;
   private final List<g<?>> e = new ArrayList<>();
   private volatile boolean f;
   private BiConsumer<c, Boolean> g;

   protected c(String var1, String var2, b var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = new dev.sixseven.i.e("Keybind", "Toggles " + var1, -1);
   }

   protected <T extends g<?>> T a(T var1) {
      this.e.add(var1);
      return (T)var1;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public b c() {
      return this.c;
   }

   public dev.sixseven.i.e d() {
      return this.d;
   }

   public List<g<?>> e() {
      return Collections.unmodifiableList(this.e);
   }

   public boolean f() {
      return this.f;
   }

   public void a(boolean var1) {
      if (this.f != var1) {
         this.f = var1;
         if (var1) {
            this.h();
         } else {
            this.i();
         }

         if (this.g != null) {
            this.g.accept(this, var1);
         }
      }
   }

   void a(BiConsumer<c, Boolean> var1) {
      this.g = var1;
   }

   public void g() {
      this.a(!this.f);
   }

   protected void h() {
   }

   protected void i() {
   }

   public void j() {
   }

   public boolean a(int var1) {
      return false;
   }
}
