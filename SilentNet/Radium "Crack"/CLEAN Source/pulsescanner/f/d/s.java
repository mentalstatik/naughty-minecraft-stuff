package pulsescanner.f.d;

public class s extends pulsescanner.f.i {
   public final pulsescanner.i.c l;
   public final pulsescanner.i.g m;
   public final pulsescanner.i.g n;
   private static final String[] o;

   public s() {
      String[] var1 = o;
      super(var1[5], var1[2], pulsescanner.f.h.RENDER);
      this.l = this.a(new pulsescanner.i.c(var1[1], var1[3], false));
      this.m = this.a(new pulsescanner.i.g(var1[4], var1[0], 1.0, 0.5, 1.5, 0.05, "x")).a(this::lambda$new$0);
      this.n = this.a(new pulsescanner.i.g(var1[6], var1[7], 0.0, -150.0, 150.0, 1.0)).a(this::lambda$new$1);
   }

   private boolean lambda$new$1() {
      pulsescanner.f.i[] var1 = pulsescanner.f.d.a.b();

      try {
         boolean var10000 = this.l.a();
         if (var1 == null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var2) {
         throw a(var2);
      }

      return false;
   }

   private boolean lambda$new$0() {
      pulsescanner.f.i[] var1 = pulsescanner.f.d.a.b();

      try {
         boolean var10000 = this.l.a();
         if (var1 == null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var2) {
         throw a(var2);
      }

      return false;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "q\u0001\u0007$-\u007f\u001c\u0002\u001b\n;*0\u0004j\u0001\u0007$,p\r\u0010(5{B\u0002\u0005\f7*>\u0001PH\u000b(+{NV\u0000\u0006a<}\u0001P\r\u0001..l\n\u0002\u001b\n%*|\u000fPF\u001cj\u0001\u0007$oj\u0006GH\u0010(+{\fC\u001aC\" s\u001eN\r\u0017$#g@\u0005q\u000b\u0002-*\nq\u000b\f3*|\u0001C\u001a\u0007";
      int var4 = "q\u0001\u0007$-\u007f\u001c\u0002\u001b\n;*0\u0004j\u0001\u0007$,p\r\u0010(5{B\u0002\u0005\f7*>\u0001PH\u000b(+{NV\u0000\u0006a<}\u0001P\r\u0001..l\n\u0002\u001b\n%*|\u000fPF\u001cj\u0001\u0007$oj\u0006GH\u0010(+{\fC\u001aC\" s\u001eN\r\u0017$#g@\u0005q\u000b\u0002-*\nq\u000b\f3*|\u0001C\u001a\u0007"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label43:
      while (true) {
         byte var10000 = 101;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            char[] var20 = var10001.toCharArray();
            int var10004 = var20.length;
            byte var21 = var10000;
            char[] var16 = var20;
            int var12 = var10004;

            for (int var6 = 0; var12 > var6; var6++) {
               var16[var6] = (char)(var16[var6] ^ var21 ^ switch (var6 % 7) {
                  case 0 -> 71;
                  case 1 -> 13;
                  case 2 -> 6;
                  case 3 -> 36;
                  case 4 -> 42;
                  case 5 -> 123;
                  default -> 11;
               });
            }

            String var23 = new String(var16).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var23;
                  if ((var8 += var1) >= var4) {
                     o = var5;
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var23;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label43;
                  }

                  var2 = "`S7<2v\u0010M\u001ct\u001c\u000e?tq\u001d\\S\u000b30`\u0017X\u0001X/$%\u001aKS\u001c5#k[";
                  var4 = "`S7<2v\u0010M\u001ct\u001c\u000e?tq\u001d\\S\u000b30`\u0017X\u0001X/$%\u001aKS\u001c5#k[".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}
