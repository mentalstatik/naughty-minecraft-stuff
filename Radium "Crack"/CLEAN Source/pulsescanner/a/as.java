package pulsescanner.a;

import pulsescanner.PulseScanner;

public abstract class as extends pulsescanner.f.i implements ad {
   private static int l;
   private static final String[] S;

   protected as(String var1, String var2) {
      this(var1, var2, pulsescanner.f.h.COMBAT);
   }

   protected as(String var1, String var2, pulsescanner.f.h var3) {
      super(var1, var2, var3);
      x.a(this);
   }

   @Override
   protected final void g() {
      try {
         if (a.field_1724 != null) {
            this.a(S[0], this::o);
         }
      } catch (MatchException var1) {
         throw c(var1);
      }
   }

   @Override
   protected final void h() {
      try {
         if (a.field_1724 != null) {
            this.a(S[2], this::p);
         }
      } catch (MatchException var1) {
         throw c(var1);
      }
   }

   protected void o() {
   }

   protected void p() {
   }

   private void a(String var1, Runnable var2) {
      try {
         var2.run();
      } catch (Exception var4) {
         PulseScanner.LOG.error(S[1], new Object[]{this.b, var1, var4});
      }
   }

   public static void c(int var0) {
      l = var0;
   }

   public static int q() {
      return l;
   }

   public static int r() {
      int var0 = q();
      return var0 == 0 ? 80 : 0;
   }

   private static MatchException c(MatchException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0000x:\u0003Al\u0010\u0004\u000f\u001afn\fVd\b\u0004\u007fn\u001eX-\u001f\u001c\n\u0005~/\tCd\u0012\u0000o+";
      int var4 = "\u0000x:\u0003Al\u0010\u0004\u000f\u001afn\fVd\b\u0004\u007fn\u001eX-\u001f\u001c\n\u0005~/\tCd\u0012\u0000o+".length();
      char var1 = '\b';
      c(0);
      int var0 = -1;

      while (true) {
         char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
         int var10004 = var10003.length;
         byte var13 = 22;
         char[] var10002 = var10003;
         int var8 = var10004;

         for (int var6 = 0; var8 > var6; var6++) {
            var10002[var6] = (char)(var10002[var6] ^ var13 ^ switch (var6 % 7) {
               case 0 -> 119;
               case 1 -> 13;
               case 2 -> 88;
               case 3 -> 124;
               case 4 -> 33;
               case 5 -> 27;
               default -> 114;
            });
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            S = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}
