package dev.sixseven.e;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Join;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.class_310;

public final class a {
   private static Boolean a;

   private a() {
   }

   public static void a() {
      PayloadTypeRegistry.playC2S().register(b.a, b.b);
      ClientPlayConnectionEvents.JOIN.register((Join)(var0, var1, var2) -> a = null);
      ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(var0, var1) -> a = null);
      ClientTickEvents.END_CLIENT_TICK.register(a::a);
   }

   private static void a(class_310 var0) {
      if (var0.field_1724 != null && var0.field_1687 != null) {
         d var1 = SixSevenClient.modules();
         boolean var2 = var1 != null && var1.n != null && var1.n.f();
         if (a == null || a != var2) {
            if (ClientPlayNetworking.canSend(b.a)) {
               ClientPlayNetworking.send(new b(var2));
               a = var2;
            }
         }
      } else {
         a = null;
      }
   }
}
