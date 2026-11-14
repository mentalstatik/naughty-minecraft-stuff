package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

public class s extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Format", "Clipboard format.", "X Y Z", "X Y Z", "JSON", "Command"));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Target", "Which coordinates to copy.", "Looked-at Block", "Looked-at Block", "Player"));
   public final dev.sixseven.i.e c = this.a(new dev.sixseven.i.e("Copy Key", "Press to copy the coordinates.", -1));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Notify", "Show a confirmation when copied.", true));
   private String e = "";

   public s() {
      super("CoordSnapper", "Copies looked-at coordinates with one key.", dev.sixseven.d.b.c);
   }

   public String k() {
      return this.e;
   }

   @Override
   public boolean a(int keyCode) {
      if (!this.c.a(keyCode)) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   private void l() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null) {
         class_2338 var2 = this.a(var1);
         if (var2 == null) {
            if (this.d.i()) {
               SixSevenClient.notifications().a("CoordSnapper · no block in view");
            }
         } else {
            String var3 = this.a.i();

            String var5 = switch (var3) {
               case "JSON" -> "{\"x\": " + var2.method_10263() + ", \"y\": " + var2.method_10264() + ", \"z\": " + var2.method_10260() + "}";
               case "Command" -> "/tp " + var2.method_10263() + " " + var2.method_10264() + " " + var2.method_10260();
               default -> var2.method_10263() + " " + var2.method_10264() + " " + var2.method_10260();
            };
            var1.field_1774.method_1455(var5);
            this.e = var5;
            if (this.d.i()) {
               SixSevenClient.notifications().a("Copied · " + var5);
            }
         }
      }
   }

   private class_2338 a(class_310 mc) {
      if (this.b.a("Player")) {
         return mc.field_1724.method_24515();
      } else {
         class_239 var2 = mc.field_1765;
         if (var2 instanceof class_3965 var3 && var2.method_17783() == class_240.field_1332) {
            return var3.method_17777();
         }

         return null;
      }
   }
}
