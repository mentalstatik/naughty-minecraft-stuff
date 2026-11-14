package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_1109;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_5250;

public class A extends dev.sixseven.d.c {
   private static final int h = 16777215;
   private static final int i = 16733525;
   public final dev.sixseven.i.i a = this.a(new dev.sixseven.i.i("Command", "Command name to hijack, without the slash.", "pay", 32, "pay"));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Feedback", "Where the confirmation shows.", "Both", "Both", "Action Bar", "Chat"));
   public final dev.sixseven.i.i c = this.a(new dev.sixseven.i.i("Currency", "Symbol before the amount (colored).", "$", 4, "$"));
   public final dev.sixseven.i.c d = this.a(new dev.sixseven.i.c("Currency Color", "Color of the currency symbol (DonutSMP blue by default).", -16740609));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Sounds", "Level-up on success, villager 'no' when it fails.", true));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Check Balance", "With FakeStats on, refuse pays you can't afford.", true));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Self-Pay Guard", "Block paying your own name, like the real command.", true));

   public A() {
      super("FakePay", "Fakes a /pay for clips — blocks the real command", dev.sixseven.d.b.c);
   }

   public boolean a(String rawCommand) {
      if (this.f() && rawCommand != null) {
         String[] var2 = rawCommand.trim().split("\\s+");
         if (var2.length == 0) {
            return false;
         } else {
            String var3 = var2[0];
            if (var3.startsWith("/")) {
               var3 = var3.substring(1);
            }

            String var4 = this.a.i().trim();
            if (!var4.isEmpty() && var3.equalsIgnoreCase(var4)) {
               this.a(var2);
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void a(String[] parts) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1724 != null) {
         if (parts.length < 3) {
            this.a(var2, class_2561.method_43470("Usage: /" + parts[0] + " <player> <amount>").method_54663(16733525));
            this.b(var2);
         } else {
            String var3 = parts[1];
            double var4 = dev.sixseven.n.a.a(parts[2]);
            if (Double.isNaN(var4) || var4 <= 0.0) {
               this.a(var2, class_2561.method_43470("Invalid amount: " + parts[2]).method_54663(16733525));
               this.b(var2);
            } else if (this.g.i() && var3.equalsIgnoreCase(var2.field_1724.method_7334().name())) {
               this.a(var2, class_2561.method_43470("You can't pay yourself!").method_54663(16733525));
               this.b(var2);
            } else {
               C var6 = this.k();
               boolean var7 = var6 != null && var6.f() && var6.m.i();
               if (var7 && this.f.i() && var6.k() < var4) {
                  this.a(var2, class_2561.method_43470("You don't have enough money!").method_54663(16733525));
                  this.b(var2);
               } else {
                  if (var7) {
                     var6.a(var4);
                  }

                  class_5250 var8 = class_2561.method_43473().method_10852(class_2561.method_43470("You paid " + var3).method_54663(16777215));
                  String var9 = this.c.i();
                  if (!var9.isEmpty()) {
                     var8.method_10852(class_2561.method_43470(" " + var9).method_54663(this.d.i() & 16777215))
                        .method_10852(class_2561.method_43470(dev.sixseven.n.a.a(var4)).method_54663(16777215));
                  } else {
                     var8.method_10852(class_2561.method_43470(" " + dev.sixseven.n.a.a(var4)).method_54663(16777215));
                  }

                  this.a(var2, var8);
                  this.a(var2);
               }
            }
         }
      }
   }

   private void a(class_310 mc, class_2561 component) {
      if (mc.field_1724 != null) {
         String var3 = this.b.i();
         if (var3.equals("Action Bar") || var3.equals("Both")) {
            mc.field_1724.method_7353(component, true);
         }

         if (var3.equals("Chat") || var3.equals("Both")) {
            mc.field_1724.method_7353(component, false);
         }
      }
   }

   private void a(class_310 mc) {
      if (this.e.i()) {
         this.a(mc, class_3417.field_14709, 1.0F);
      }
   }

   private void b(class_310 mc) {
      if (this.e.i()) {
         this.a(mc, class_3417.field_15008, 1.0F);
      }
   }

   private void a(class_310 mc, class_3414 event, float pitch) {
      mc.method_1483().method_4873(class_1109.method_4757(event, pitch, 1.0F));
   }

   private C k() {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      return var1 == null ? null : var1.al;
   }
}
