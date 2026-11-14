package dev.sixseven.k;

public record b(String a, String b, int c, boolean d, int e, int f) {
   public boolean a() {
      return (this.c & 16777215) != 0;
   }

   public String b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }
}
