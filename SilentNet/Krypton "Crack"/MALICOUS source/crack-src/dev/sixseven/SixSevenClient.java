package dev.sixseven;

import dev.sixseven.a.a;
import dev.sixseven.a.b;
import dev.sixseven.c.c;
import dev.sixseven.d.d;
import dev.sixseven.d.a.H;
import dev.sixseven.g.r;
import dev.sixseven.g.t;
import dev.sixseven.g.v;
import dev.sixseven.n.g;
import dev.sixseven.n.h;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Join;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterInit;
import net.minecraft.class_310;
import net.minecraft.class_442;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SixSevenClient implements ClientModInitializer {
   public static final String MOD_ID = "sixsevenclient";
   public static final String NAME = "WINTER CLIENT";
   public static final String VERSION = "1.6.2";
   public static final Logger LOGGER = LoggerFactory.getLogger("WINTER CLIENT");
   private static d modules;
   private static dev.sixseven.m.d themes;
   private static a config;
   private static b configStore;
   private static c hud;
   private static dev.sixseven.f.a notifications;
   private static dev.sixseven.j.a spotify;
   private static dev.sixseven.m.b soundSettings;
   private static boolean startupSoundPlayed;

   public static d modules() {
      return modules;
   }

   public static dev.sixseven.m.d themes() {
      return themes;
   }

   public static a config() {
      return config;
   }

   public static b configStore() {
      return configStore;
   }

   public static c hud() {
      return hud;
   }

   public static dev.sixseven.j.a spotify() {
      return spotify;
   }

   public static dev.sixseven.m.b sounds() {
      return soundSettings;
   }

   public static dev.sixseven.f.a notifications() {
      return notifications;
   }

   public void onInitializeClient() {
      LOGGER.info("{} {} initializing", "WINTER CLIENT", "1.6.2");
      dev.sixseven.e.a.a();
      g.a();
      themes = new dev.sixseven.m.d();
      soundSettings = new dev.sixseven.m.b();
      modules = new d();
      spotify = new dev.sixseven.j.a();
      notifications = new dev.sixseven.f.a(themes, modules.b);
      hud = new c(modules, themes, spotify, notifications);
      config = new a(modules, themes);
      config.a("hud", hud::c, hud::a);
      config.a("panels", dev.sixseven.b.a.a()::b, dev.sixseven.b.a.a()::a);
      config.a("sounds", soundSettings::c, soundSettings::a);
      config.c();
      configStore = new b(config);
      configStore.d();
      h.a(soundSettings);
      modules.a(() -> class_310.method_1551().method_1507(new dev.sixseven.b.a()));
      modules.a((var0, var1) -> {
         if (!b.d && var0.c() != dev.sixseven.d.b.f && class_310.method_1551().field_1687 != null && modules.b.q.i()) {
            notifications.a(var0.a(), var1);
            h.c(var1);
         }
      });
      t.a(hud, notifications);
      ScreenEvents.AFTER_INIT.register((AfterInit)(var0, var1, var2, var3) -> {
         if (var1 instanceof class_442 && !startupSoundPlayed) {
            startupSoundPlayed = true;
            h.h();
         }
      });
      dev.sixseven.b.d.a();
      spotify.c();
      ClientPlayConnectionEvents.JOIN.register((Join)(var0, var1, var2) -> clearSusState());
      ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(var0, var1) -> clearSusState());
      ClientTickEvents.END_CLIENT_TICK.register((EndTick)var0 -> modules.b());
      ClientTickEvents.START_CLIENT_TICK.register((StartTick)var0 -> {
         H var1 = modules.T;
         if (var1 != null && var1.m()) {
            H.c(var0);
         }

         modules.c();
      });
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientStopping)var0 -> {
         config.b();
         spotify.d();
      });
   }

   private static void clearSusState() {
      dev.sixseven.l.a.a().b();
      modules.e.s.d();
      v.a();
      if (modules.ad != null) {
         modules.ad.l();
      }

      if (modules.ae != null) {
         modules.ae.k();
      }

      if (modules.Q != null) {
         modules.Q.o();
      }

      if (modules.V != null) {
         modules.V.l();
      }

      if (modules.Z != null) {
         modules.Z.m();
      }

      if (modules.ac != null) {
         modules.ac.l();
      }

      r.a();
   }
}
