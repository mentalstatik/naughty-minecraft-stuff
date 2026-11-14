package pulsescanner.a;

public class g {
   private long a;

   public void a() {
      this.a = System.currentTimeMillis();
   }

   public boolean a(double var1) {
      int var3 = as.r();

      try {
         double var5;
         int var10000 = (var5 = (double)System.currentTimeMillis() - var1 - (double)this.a) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (MatchException var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   public g() {
      this.a();
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
