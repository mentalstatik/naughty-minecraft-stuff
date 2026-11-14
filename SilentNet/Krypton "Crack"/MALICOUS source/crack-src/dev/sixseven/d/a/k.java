package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_310;

public class k extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Mode", "Which request to send.", "TPA", "TPA", "TPAHere"));
   public final dev.sixseven.i.i b = this.a(new dev.sixseven.i.i("Target", "Player to send the request to.", "", 32, "Steve"));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Delay", "Time between requests — lower is faster.", 2000.0, 250.0, 10000.0, 50.0, "ms"));
   public final dev.sixseven.i.h d = this.a(
      new dev.sixseven.i.h("Humanize", "Random +/- swing on each delay so the timing isn't a fixed, bot-like interval. 0 = off.", 25.0, 0.0, 60.0, 5.0, "%")
   );
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Notify", "Show a notification each time a request is sent.", false));
   private long f = -1L;
   private String g;

   public k() {
      super("AutoTPA", "Spams TPA requests at a target on a humanized timer.", dev.sixseven.d.b.c);
   }

   @Override
   protected void h() {
      if (this.b.i().trim().isEmpty()) {
         SixSevenClient.notifications().a("AutoTPA · set a Target first");
      }

      this.g = null;
      this.f = 0L;
   }

   @Override
   protected void i() {
      this.f = -1L;
   }

   @Override
   public void j() {
      if (this.f >= 0L) {
         class_310 var1 = class_310.method_1551();
         if (var1.field_1724 != null && var1.field_1724.field_3944 != null && System.currentTimeMillis() >= this.f) {
            String var2 = this.b.i().trim();
            if (var2.isEmpty()) {
               this.f = this.l();
            } else {
               String var3 = this.a.a("TPAHere") ? "tpahere " : "tpa ";
               String var4 = var3 + var2;
               var1.field_1724.field_3944.method_45730(var4);
               this.g = var4;
               if (this.e.i()) {
                  SixSevenClient.notifications().a("AutoTPA · /" + var4);
               }

               this.f = this.l();
            }
         }
      }
   }

   public String k() {
      return this.g;
   }

   private long l() {
      double var1 = this.c.i();
      double var3 = this.d.i() / 100.0;
      double var5 = var3 <= 0.0 ? 1.0 : 1.0 + (ThreadLocalRandom.current().nextDouble() * 2.0 - 1.0) * var3;
      long var7 = Math.max(0L, Math.round(var1 * var5));
      return System.currentTimeMillis() + var7;
   }
}
