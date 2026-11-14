package dev.sixseven.c;

import dev.sixseven.g.b.d;
import java.util.function.BooleanSupplier;

public abstract class a {
   public static final float a = 0.5F;
   public static final float b = 2.0F;
   private final String c;
   private final BooleanSupplier d;
   private float e;
   private float f;
   private float g = 1.0F;

   protected a(String var1, float var2, float var3, BooleanSupplier var4) {
      this.c = var1;
      this.e = var2;
      this.f = var3;
      this.d = var4;
   }

   public String a() {
      return this.c;
   }

   public float b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public void a(float var1, float var2) {
      this.e = Math.clamp(var1, 0.0F, 1.0F);
      this.f = Math.clamp(var2, 0.0F, 1.0F);
   }

   public float d() {
      return this.g;
   }

   public void a(float var1) {
      this.g = Math.clamp(var1, 0.5F, 2.0F);
   }

   public final boolean e() {
      return this.d.getAsBoolean();
   }

   public void a(d var1) {
   }

   public abstract float b(d var1);

   public abstract float c(d var1);

   public abstract void a(d var1, float var2, float var3, float var4, float var5);

   public boolean b(float var1, float var2) {
      return false;
   }

   public boolean f() {
      return this.e > 0.5F;
   }
}
