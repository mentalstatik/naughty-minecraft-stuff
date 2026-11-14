package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.b.e;
import dev.sixseven.d.d;
import dev.sixseven.d.a.S;
import dev.sixseven.d.a.n;
import dev.sixseven.g.u;
import java.util.function.Function;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_310;
import net.minecraft.class_437;

public class EspPickerGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> {
            d var1 = SixSevenClient.modules();
            require(var1.Q != null, "BlockEntityESP registered");
            require(var1.v != null, "StorageESP registered");
            require(var1.Q.a.b() > 15, "BlockEntityESP seeded its type list");
            require(var1.v.e.b() == 8, "StorageESP seeded its 8 container groups");
         });
         var3.runCommand("fill -8 0 -2 8 0 12 minecraft:stone");
         var3.runCommand("setblock 0 1 5 minecraft:chest");
         var3.runCommand("setblock 2 1 5 minecraft:trapped_chest");
         var3.runCommand("setblock 4 1 5 minecraft:ender_chest");
         var3.runCommand("setblock -2 1 5 minecraft:barrel");
         var3.runCommand("setblock -4 1 5 minecraft:shulker_box");
         var3.runCommand("setblock 6 1 5 minecraft:furnace");
         var3.runCommand("setblock -6 1 5 minecraft:hopper");
         var3.runCommand("setblock 0 1 8 minecraft:spawner");
         var3.runCommand("setblock 2 1 8 minecraft:oak_sign");
         var3.runCommand("summon minecraft:zombie 3 1 8 {NoAI:1b}");
         var3.runCommand("tp @a 0 3 -2 0 18");
         context.waitTicks(20);
         context.runOnClient(mc -> {
            n var1 = SixSevenClient.modules().Q;
            var1.b.a((String)"Full");
            var1.a(false);
            var1.a(true);
         });
         context.waitTicks(6);
         context.runOnClient(mc -> {
            int var1 = SixSevenClient.modules().Q.p();
            require(var1 >= 6, "BlockEntityESP cached block entities on enable, got " + var1);
         });
         context.takeScreenshot("be-esp-boxes");
         context.runOnClient(mc -> SixSevenClient.modules().Q.e.a(true));
         context.waitTicks(3);
         context.takeScreenshot("be-esp-tracers");
         var3.runCommand("setblock 6 1 8 minecraft:diamond_ore");
         context.runOnClient(mc -> {
            d var1 = SixSevenClient.modules();
            var1.v.a(false);
            var1.v.a(true);
            var1.w.a(false);
            var1.w.a(true);
         });
         context.waitTicks(30);
         context.runOnClient(mc -> {
            int var1 = u.b();
            int var2x = dev.sixseven.g.d.b();
            require(var1 >= 6, "StorageESP incremental scan found containers, got " + var1);
            require(var2x >= 1, "BlockESP incremental scan found the diamond ore, got " + var2x);
         });
         context.takeScreenshot("storage-blockesp-incremental");
         context.runOnClient(mc -> {
            SixSevenClient.modules().v.a(false);
            SixSevenClient.modules().w.a(false);
         });
         context.runOnClient(mc -> {
            SixSevenClient.modules().Q.o();
            require(SixSevenClient.modules().Q.p() == 0, "cache cleared");
         });
         var3.runCommand("tp @a 3000 -60 3000");
         context.waitTicks(40);
         var3.runCommand("tp @a 0 3 -2 0 18");
         context.waitTicks(50);
         context.runOnClient(mc -> {
            int var1 = SixSevenClient.modules().Q.p();
            require(var1 >= 6, "raw chunk packet refilled BlockEntityESP cache, got " + var1);
         });
         context.takeScreenshot("be-esp-after-reload");
         context.runOnClient(mc -> {
            S var1 = SixSevenClient.modules().P;
            var1.d.a(true);
            var1.a(true);
         });
         context.waitTicks(3);
         context.takeScreenshot("mob-esp-tracer");
         context.runOnClient(mc -> SixSevenClient.modules().P.a(false));
         context.runOnClient(mc -> {
            a.a().a("BlockEntityESP@RENDER", true);
            mc.method_1507(new a());
         });
         context.waitTicks(3);
         context.takeScreenshot("be-esp-settings");
         openPicker(context, mc -> SixSevenClient.modules().Q.a);
         context.takeScreenshot("be-esp-picker-grid");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof e var2x) {
               var2x.a("chest");
            }
         });
         context.waitTicks(4);
         context.takeScreenshot("be-esp-picker-search");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof e var2x) {
               var2x.a("");
               var2x.a(true);
               require(var2x.a() > 0 && var2x.a() < 20, "Selected-only filter narrowed the grid, showing " + var2x.a());
            }
         });
         context.waitTicks(4);
         context.takeScreenshot("be-esp-picker-selected-only");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof e var2x) {
               var2x.a(0);
            }
         });
         context.waitTicks(4);
         context.takeScreenshot("be-esp-picker-color");
         context.runOnClient(mc -> mc.method_1507(new a()));
         context.waitTicks(2);
         openPicker(context, mc -> SixSevenClient.modules().v.e);
         context.takeScreenshot("storage-esp-picker-grid");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof e var2x) {
               var2x.a(true);
            }
         });
         context.waitTicks(4);
         context.takeScreenshot("storage-esp-picker-selected-only");
         context.runOnClient(mc -> mc.method_1507((class_437)null));
         context.waitTicks(2);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   private static void openPicker(ClientGameTestContext context, Function<class_310, dev.sixseven.i.d> pick) {
      context.runOnClient(mc -> {
         if (mc.field_1755 instanceof a var3) {
            var3.a((dev.sixseven.i.d)pick.apply(mc));
         }
      });
      context.waitForScreen(e.class);
      context.waitTicks(6);
   }

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
