package pulsescanner.f.a.a;

import java.util.Arrays;
import pulsescanner.f.i;

public final class c {
   public final int a;
   public final int b;
   public final int c;
   public final int d;
   public final b[] e;
   public final b[] f;
   public final e[] g;
   public final e[] h;
   public final long[] i;
   public final long[] j;

   public c(int var1, int var2, int var3, int var4) {
      int var10000 = pulsescanner.f.a.a.b.f();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      int var6 = var3 + 2;
      this.e = new b[var6];
      int var5 = var10000;

      try {
         this.f = new b[var6];
         this.g = new e[var6];
         this.h = new e[var6];
         this.i = new long[var6];
         this.j = new long[var6];
         Arrays.fill(this.e, pulsescanner.f.a.a.b.UNKNOWN);
         Arrays.fill(this.f, pulsescanner.f.a.a.b.UNKNOWN);
         if (var5 == 0) {
            pulsescanner.f.i.b(new int[2]);
         }
      } catch (MatchException var7) {
         throw a(var7);
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
