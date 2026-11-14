package pulsescanner.i;

import com.google.gson.JsonElement;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import pulsescanner.f.i;

public abstract class a<T> {
   public final String a;
   public final String b;
   protected final T c;
   protected T d;
   private BooleanSupplier e = a::lambda$new$0;
   private static i[] f;

   protected a(String var1, String var2, T var3) {
      this.a = var1;
      this.b = var2;
      this.c = (T)var3;
      this.d = (T)var3;
   }

   public T a() {
      return this.d;
   }

   public void a(T var1) {
      this.d = (T)var1;
   }

   public void b() {
      this.a(this.c);
   }

   public boolean c() {
      return Objects.equals(this.a(), this.c);
   }

   public boolean d() {
      return this.e.getAsBoolean();
   }

   public <S extends a<T>> S a(BooleanSupplier var1) {
      this.e = var1;
      return (S)this;
   }

   public abstract JsonElement e();

   public abstract void a(JsonElement var1);

   private static boolean lambda$new$0() {
      return true;
   }

   public static void b(i[] var0) {
      f = var0;
   }

   public static i[] f() {
      return f;
   }

   static {
      if (f() == null) {
         b(new i[1]);
      }
   }
}
