package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_1109;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_638;

public class ak extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Rain", "Announce when rain starts/stops", true));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Thunder", "Announce when a thunderstorm starts/stops", true));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Sound", "Play a ping on each change", true));
   public final dev.sixseven.i.f d = this.a(new dev.sixseven.i.f("Output", "How the change is shown", "Notification", "Notification", "Chat", "Action Bar"));
   private Boolean e;
   private Boolean f;

   public ak() {
      super("WeatherNotifier", "Themed toast when the weather changes", dev.sixseven.d.b.c);
   }

   @Override
   protected void h() {
      this.e = null;
      this.f = null;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      class_638 var2 = var1.field_1687;
      if (var2 != null && var1.field_1724 != null) {
         boolean var3 = var2.method_8419();
         boolean var4 = var2.method_8546();
         if (this.e != null && this.f != null) {
            if (var4 != this.f) {
               this.f = var4;
               if (this.b.i()) {
                  if (var4) {
                     this.a(var1, "Thunderstorm", "A storm rolls in", dev.sixseven.f.a.b.b, true);
                  } else {
                     this.a(var1, "Storm cleared", "The thunder has passed", dev.sixseven.f.a.b.c, false);
                  }
               }
            }

            if (var3 != this.e) {
               this.e = var3;
               if (this.a.i() && !var4) {
                  if (var3) {
                     this.a(var1, "Rain", "Rain starts to fall", dev.sixseven.f.a.b.a, true);
                  } else {
                     this.a(var1, "Skies cleared", "The rain has stopped", dev.sixseven.f.a.b.c, false);
                  }
               }
            }
         } else {
            this.e = var3;
            this.f = var4;
         }
      }
   }

   private void a(class_310 mc, String title, String subtitle, dev.sixseven.f.a.b weather, boolean started) {
      if (mc.field_1724 != null) {
         if (this.d.a("Notification")) {
            if (SixSevenClient.notifications() != null) {
               SixSevenClient.notifications().a(title, subtitle, weather, started);
            }
         } else {
            boolean var6 = this.d.a("Action Bar");
            mc.field_1724.method_7353(class_2561.method_43470("§b[WINTER] §f" + title + " — " + subtitle), var6);
         }

         if (this.c.i()) {
            float var7 = started ? 1.2F : 0.8F;
            mc.method_1483().method_4873(class_1109.method_4757((class_3414)class_3417.field_14793.comp_349(), var7, 0.6F));
         }
      }
   }
}
