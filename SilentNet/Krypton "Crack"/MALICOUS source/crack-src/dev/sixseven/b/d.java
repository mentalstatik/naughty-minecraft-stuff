package dev.sixseven.b;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.J;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterRender;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseClick;
import net.minecraft.class_480;

public final class d {
   private d() {
   }

   public static void a() {
      ScreenEvents.AFTER_INIT.register((AfterInit)(client, screen, scaledWidth, scaledHeight) -> {
         if (screen instanceof class_480 var4) {
            J var5 = SixSevenClient.modules() == null ? null : SixSevenClient.modules().aq;
            if (var5 != null && var5.f()) {
               c var6 = new c(var4, var5);
               ScreenEvents.afterRender(screen).register((AfterRender)(s, graphics, mouseX, mouseY, tickDelta) -> var6.a(graphics, mouseX, mouseY));
               ScreenMouseEvents.allowMouseClick(screen).register((AllowMouseClick)(s, ctx) -> !var6.a(ctx.comp_4798(), ctx.comp_4799(), ctx.method_74245()));
            }
         }
      });
   }
}
