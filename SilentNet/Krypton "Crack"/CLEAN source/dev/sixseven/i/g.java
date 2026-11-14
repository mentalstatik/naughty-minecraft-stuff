package dev.sixseven.i;

import com.google.gson.JsonElement;
import java.util.function.BooleanSupplier;

public abstract class g<T> {
   private final String a;
   private final String d;
   protected volatile T b;
   protected final T c;
   private BooleanSupplier e = () -> true;

   protected g(String var1, String var2, T var3) {
      this.a = var1;
      this.d = var2;
      this.b = (T)var3;
      this.c = (T)var3;
   }

   public String g() {
      return this.a;
   }

   public String h() {
      return this.d;
   }

   public T i() {
      return this.b;
   }

   public void a(T var1) {
      this.b = (T)var1;
   }

   public void j() {
      this.b = this.c;
   }

   public void a(BooleanSupplier var1) {
      this.e = var1;
   }

   public boolean k() {
      return this.e.getAsBoolean();
   }

   public abstract JsonElement f();

   public abstract void a(JsonElement var1);
}
