package pulsescanner.d;

import pulsescanner.f.i;

final class e {
   final String a;
   final String b;
   final boolean c;
   final int d;
   final long e;
   final long f = System.currentTimeMillis();
   float g;
   float h;

   e(String var1, String var2, boolean var3, int var4, long var5) {
      pulsescanner.d.d.b();
      this.h = -1.0F;

      try {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         if (i.n() != null) {
            pulsescanner.d.d.b(new i[4]);
         }
      } catch (MatchException var8) {
         throw a(var8);
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
