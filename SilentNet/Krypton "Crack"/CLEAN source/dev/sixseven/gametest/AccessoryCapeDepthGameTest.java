package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.t;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_5498;

public class AccessoryCapeDepthGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         var2.getServer().runCommand("tp @a 500 -60 500 -90 0");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            SixSevenClient.modules().e.a(false);
            SixSevenClient.modules().d.a(false);
            SixSevenClient.modules().aa.a(false);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-90.0F);
               mc.field_1724.method_5636(-90.0F);
               mc.field_1724.method_36457(0.0F);
            }

            t var1 = SixSevenClient.modules().ac;
            require(var1 != null, "CustomAccessories registered");
            var1.d.a(false);
            var1.a.a(Integer.valueOf(-49508));
            var1.b.a(false);
            var1.c.a(Double.valueOf(75.0));
            var1.e.a(true);
            var1.f.a((String)"Solid");
            var1.g.a(false);
            var1.h.a(false);
            var1.k.a(false);
            var1.m.a(false);
            var1.a(true);
         });
         context.waitTicks(20);
         context.runOnClient(mc -> mc.field_1690.method_31043(class_5498.field_26665));
         context.waitTicks(6);
         context.takeScreenshot("cape-depth-1-solid-back");
         context.runOnClient(mc -> mc.field_1690.method_31043(class_5498.field_26666));
         context.waitTicks(6);
         context.takeScreenshot("cape-depth-2-solid-front");
         context.runOnClient(mc -> SixSevenClient.modules().ac.f.a((String)"67"));
         context.waitTicks(4);
         context.runOnClient(mc -> mc.field_1690.method_31043(class_5498.field_26665));
         context.waitTicks(6);
         context.takeScreenshot("cape-depth-3-67-back");
         context.runOnClient(mc -> mc.field_1690.method_31043(class_5498.field_26666));
         context.waitTicks(6);
         context.takeScreenshot("cape-depth-4-67-front");
         context.runOnClient(mc -> {
            t var1 = SixSevenClient.modules().ac;
            var1.e.a(false);
            var1.k.a(true);
            var1.l.a((String)"Orbit");
            var1.d.a(false);
            mc.field_1690.method_31043(class_5498.field_26664);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36457(60.0F);
            }
         });
         context.waitTicks(6);
         context.takeScreenshot("cape-depth-5-firstperson-aura");
         context.runOnClient(mc -> {
            t var1 = SixSevenClient.modules().ac;
            var1.d.a(false);
            var1.k.a(false);
            var1.e.a(true);
            var1.f.a((String)"67");
            var1.g.a(true);
            var1.a(false);
            mc.field_1690.method_31043(class_5498.field_26664);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36457(0.0F);
            }
         });
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

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
