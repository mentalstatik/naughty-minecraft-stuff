package dev.sixseven.j;

public record b(boolean b, String c, String d, long e, long f, boolean g, boolean h, int i, int j, long k) {
   public static final b a = new b(false, "", "", 0L, 0L, false, false, 0, -1, 0L);

   public long a() {
      if (this.g && this.f > 0L) {
         long var1 = (System.nanoTime() - this.k) / 1000000L;
         return Math.min(this.e + var1, this.f);
      } else {
         return this.e;
      }
   }
}
