package dev.sixseven.d.a;

import java.util.Locale;
import java.util.Objects;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_5250;

public class C extends dev.sixseven.d.c {
   private static final int n = 11184810;
   private static final int o = 5635925;
   private static final String[] p = new String[]{"money", "balance", "coins", "cash"};
   private static final String[] q = new String[]{"shard"};
   private static final String[] r = new String[]{"kill"};
   private static final String[] s = new String[]{"death"};
   private static final String[] t = new String[]{"playtime", "play time", "time played", "played"};
   public final dev.sixseven.i.i a = this.a(
      new dev.sixseven.i.i("Money", "Your fake balance (1m, 67k, 250000). Wired to FakePay. Blank = off.", "1m", 32, "e.g. 1m, 250k")
   );
   public final dev.sixseven.i.h b = this.a(
      new dev.sixseven.i.h("Money Line", "Which sidebar line is money (count from the top). 0 = auto by name.", 1.0, 0.0, 15.0, 1.0).a(C::b)
   );
   public final dev.sixseven.i.i c = this.a(new dev.sixseven.i.i("Shards", "Fake shard count. Blank = off.", "", 32, "e.g. 9,999"));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Shards Line", "Which sidebar line is shards. 0 = auto by name.", 2.0, 0.0, 15.0, 1.0).a(C::b));
   public final dev.sixseven.i.i e = this.a(new dev.sixseven.i.i("Kills", "Fake kill count. Blank = off.", "", 32, "e.g. 1,000"));
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Kills Line", "Which sidebar line is kills. 0 = auto by name.", 3.0, 0.0, 15.0, 1.0).a(C::b));
   public final dev.sixseven.i.i g = this.a(new dev.sixseven.i.i("Deaths", "Fake death count. Blank = off.", "", 32, "e.g. 0"));
   public final dev.sixseven.i.h h = this.a(new dev.sixseven.i.h("Deaths Line", "Which sidebar line is deaths. 0 = auto by name.", 4.0, 0.0, 15.0, 1.0).a(C::b));
   public final dev.sixseven.i.i i = this.a(new dev.sixseven.i.i("Playtime", "Fake playtime, any text. Blank = off.", "", 32, "e.g. 365d 12h"));
   public final dev.sixseven.i.h j = this.a(
      new dev.sixseven.i.h("Playtime Line", "Which sidebar line is playtime. 0 = auto by name.", 5.0, 0.0, 15.0, 1.0).a(C::b)
   );
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Sidebar", "Rewrite the server scoreboard (leaderboard) on the right.", true));
   public final dev.sixseven.i.b l = this.a(new dev.sixseven.i.b("Balance Command", "Intercept /bal & /balance to show your fake balance.", true));
   public final dev.sixseven.i.b m = this.a(new dev.sixseven.i.b("Deduct On Pay", "FakePay subtracts what you pay from Money.", true));
   private String u;
   private double v;
   private int w;
   private int x;

   public C() {
      super("FakeStats", "Fake balance + editable leaderboard, wired to FakePay", dev.sixseven.d.b.c);
      this.b.a(() -> this.k.i() && !this.a.i().isBlank());
      this.d.a(() -> this.k.i() && !this.c.i().isBlank());
      this.f.a(() -> this.k.i() && !this.e.i().isBlank());
      this.h.a(() -> this.k.i() && !this.g.i().isBlank());
      this.j.a(() -> this.k.i() && !this.i.i().isBlank());
   }

   @Override
   protected void h() {
      this.u = null;
      this.m();
   }

   private static String b(double v) {
      return (int)vx == 0 ? "Auto" : "Line " + (int)vx;
   }

   private void m() {
      String var1 = this.a.i();
      if (!Objects.equals(var1, this.u)) {
         this.u = var1;
         double var2 = dev.sixseven.n.a.a(var1);
         this.v = Double.isNaN(var2) ? 0.0 : Math.max(0.0, var2);
      }
   }

   public double k() {
      this.m();
      return this.v;
   }

   public void a(double amount) {
      this.m();
      this.v = Math.max(0.0, this.v - Math.max(0.0, amount));
   }

   public void l() {
      this.w = 0;
      this.x = 0;
   }

   public class_2561 a(class_2561 comp) {
      return this.a(comp, true);
   }

   public class_2561 b(class_2561 comp) {
      return this.a(comp, false);
   }

   private class_2561 a(class_2561 comp, boolean widthPass) {
      if (this.f() && this.k.i()) {
         String var3 = b(comp.getString());
         if (var3.isBlank()) {
            return comp;
         } else {
            int var4;
            if (widthPass) {
               int var5 = this.w;
               var4 = var5;
               this.w = var5 + 1;
            } else {
               int var6 = this.x;
               var4 = var6;
               this.x = var6 + 1;
            }

            return this.a(var4, var3.toLowerCase(Locale.ROOT), comp);
         }
      } else {
         return comp;
      }
   }

   private class_2561 a(int line, String lower, class_2561 comp) {
      if (!this.a.i().isBlank() && a(this.b, line, lower, p)) {
         return dev.sixseven.n.a.a(comp, dev.sixseven.n.a.a(this.k()));
      } else if (!this.c.i().isBlank() && a(this.d, line, lower, q)) {
         return dev.sixseven.n.a.a(comp, this.c.i().trim());
      } else if (!this.e.i().isBlank() && a(this.f, line, lower, r)) {
         return dev.sixseven.n.a.a(comp, this.e.i().trim());
      } else if (!this.g.i().isBlank() && a(this.h, line, lower, s)) {
         return dev.sixseven.n.a.a(comp, this.g.i().trim());
      } else {
         return !this.i.i().isBlank() && a(this.j, line, lower, t) ? dev.sixseven.n.a.b(comp, this.i.i().trim()) : comp;
      }
   }

   private static boolean a(dev.sixseven.i.h lineSetting, int line, String lower, String[] keys) {
      int var4 = lineSetting.e();
      return var4 > 0 ? line + 1 == var4 : a(lower, keys);
   }

   private static boolean a(String haystack, String[] keys) {
      for (String var5 : keys) {
         if (haystack.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(String command) {
      if (this.f() && this.l.i()) {
         String[] var2 = command.trim().split("\\s+");
         if (var2.length == 0) {
            return false;
         } else {
            String var3 = var2[0];
            if (var3.startsWith("/")) {
               var3 = var3.substring(1);
            }

            if (!var3.equalsIgnoreCase("bal") && !var3.equalsIgnoreCase("balance")) {
               return false;
            } else {
               class_310 var4 = class_310.method_1551();
               if (var4.field_1724 == null) {
                  return false;
               } else if (var2.length >= 2 && !var2[1].equalsIgnoreCase(var4.field_1724.method_7334().name())) {
                  return false;
               } else {
                  String var5 = dev.sixseven.n.a.a(this.k());
                  class_5250 var6 = class_2561.method_43473()
                     .method_10852(class_2561.method_43470("You have ").method_54663(11184810))
                     .method_10852(class_2561.method_43470(var5).method_54663(5635925));
                  var4.field_1724.method_7353(var6, false);
                  var4.field_1724.method_7353(var6, true);
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private static String b(String s) {
      return sx == null ? "" : sx.replaceAll("(?i)§[0-9A-FK-OR]", "");
   }
}
