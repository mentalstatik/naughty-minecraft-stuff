package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.Locale;

public final class a extends dev.sixseven.d.c {
   public final dev.sixseven.i.i a = this.a(
      new dev.sixseven.i.i(
         "Trigger Text", "Phrase the server must explicitly send in chat when Anti-Cheat is disabled", "anti-cheat disabled", 48, "anti-cheat disabled"
      )
   );
   private long b;

   public a() {
      super("AC Status Alert", "Alerts only when server chat explicitly says Anti-Cheat is disabled", dev.sixseven.d.b.g);
   }

   public void a(String var1) {
      if (this.f() && var1 != null) {
         String var2 = b(this.a.i());
         if (var2.length() >= 4 && b(var1).contains(var2)) {
            long var3 = System.nanoTime();
            if (var3 - this.b >= 8000000000L) {
               this.b = var3;
               dev.sixseven.f.a var5 = SixSevenClient.notifications();
               if (var5 != null) {
                  var5.a("AC status · server reports Anti-Cheat disabled");
               }
            }
         }
      }
   }

   private static String b(String var0) {
      return var0 == null ? "" : var0.toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", " ").trim();
   }
}
