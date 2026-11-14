package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.d.a.J;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_1268;
import net.minecraft.class_1703;
import net.minecraft.class_1716;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import net.minecraft.class_480;

public class GambleRiggerGameTest implements FabricClientGameTest {
   private static final class_2338 DISPENSER = new class_2338(2, -59, 4);
   private static final class_1792[] ITEM = new class_1792[]{
      class_1802.field_8477,
      class_1802.field_8687,
      class_1802.field_8695,
      class_1802.field_8620,
      class_1802.field_8725,
      class_1802.field_8759,
      class_1802.field_8713,
      class_1802.field_8155,
      class_1802.field_8601
   };
   private static final String[] ID = new String[]{
      "minecraft:diamond",
      "minecraft:emerald",
      "minecraft:gold_ingot",
      "minecraft:iron_ingot",
      "minecraft:redstone",
      "minecraft:lapis_lazuli",
      "minecraft:coal",
      "minecraft:quartz",
      "minecraft:glowstone_dust"
   };
   private static final int[] COUNT = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         var3.runCommand("gamemode survival @a");
         var3.runCommand("clear @a");
         var3.runCommand("setblock 2 -59 4 minecraft:dispenser");

         for (int var4 = 0; var4 < 9; var4++) {
            var3.runCommand("item replace block 2 -59 4 container." + var4 + " with " + ID[var4] + " " + COUNT[var4]);
         }

         var3.runCommand("tp @a 2 -58 2 0 0");
         context.waitTicks(20);
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            J var1 = SixSevenClient.modules().aq;
            require(var1 != null, "GambleRigger registered");
            require(!var1.f(), "starts disabled");
            var1.a.a(Double.valueOf(0.0));
            var1.c.a(false);
            var1.b.a(true);
            var1.a(true);
         });
         openDispenser(context);
         context.waitTicks(3);
         context.runOnClient(
            mc -> {
               class_1703 var1 = mc.field_1724.field_7512;
               require(var1 instanceof class_1716, "dispenser menu open, got " + var1.getClass().getSimpleName());

               for (int var2x = 0; var2x < 9; var2x++) {
                  class_1799 var3x = var1.method_7611(var2x).method_7677();
                  require(
                     var3x.method_31574(ITEM[var2x]) && var3x.method_7947() == COUNT[var2x],
                     "grid slot " + var2x + " should be " + ITEM[var2x] + " x" + COUNT[var2x] + ", got " + describe(var3x)
                  );
               }
            }
         );
         context.takeScreenshot("gamblerigger-01-panel");
         context.runOnClient(mc -> SixSevenClient.modules().aq.b(5));
         context.waitTicks(40);
         context.runOnClient(
            mc -> {
               J var1 = SixSevenClient.modules().aq;
               require(var1.k() == J.a.c, "after taking, phase should be EXTRACTED, got " + var1.k());
               class_1703 var2x = mc.field_1724.field_7512;
               require(
                  var2x.method_7611(5).method_7677().method_31574(ITEM[5]) && var2x.method_7611(5).method_7677().method_7947() == COUNT[5],
                  "kept slot #6 must stay in place, got " + describe(var2x.method_7611(5).method_7677())
               );

               for (int var3x = 0; var3x < 9; var3x++) {
                  if (var3x != 5) {
                     require(
                        var2x.method_7611(var3x).method_7677().method_7960(),
                        "grid slot " + var3x + " should be empty after taking, got " + describe(var2x.method_7611(var3x).method_7677())
                     );
                     boolean var4x = invHas(var2x, ITEM[var3x], COUNT[var3x]);
                     String var5x = String.valueOf(ITEM[var3x]);
                     require(var4x, "inventory must now hold " + var5x + " x" + COUNT[var3x] + " pulled from slot " + var3x);
                  }
               }
            }
         );
         context.takeScreenshot("gamblerigger-02-taken-keep6");
         context.runOnClient(mc -> SixSevenClient.modules().aq.q());
         context.waitTicks(40);
         context.runOnClient(
            mc -> {
               J var1 = SixSevenClient.modules().aq;
               require(var1.k() == J.a.a, "after restore, phase should be IDLE, got " + var1.k());
               class_1703 var2x = mc.field_1724.field_7512;

               for (int var3x = 0; var3x < 9; var3x++) {
                  class_1799 var4x = var2x.method_7611(var3x).method_7677();
                  require(
                     var4x.method_31574(ITEM[var3x]) && var4x.method_7947() == COUNT[var3x],
                     "restored grid slot " + var3x + " should be " + ITEM[var3x] + " x" + COUNT[var3x] + ", got " + describe(var4x)
                  );
               }
            }
         );
         context.takeScreenshot("gamblerigger-03-restored");
         context.runOnClient(mc -> {
            J var1 = SixSevenClient.modules().aq;
            var1.b.a(false);
            var1.b(2);
         });
         context.waitTicks(40);
         context.runOnClient(
            mc -> {
               class_1703 var1 = mc.field_1724.field_7512;

               for (int var2x = 0; var2x < 9; var2x++) {
                  require(
                     var1.method_7611(var2x).method_7677().method_7960(),
                     "keep-stays OFF: slot " + var2x + " should be empty after taking, got " + describe(var1.method_7611(var2x).method_7677())
                  );
               }
            }
         );
         context.runOnClient(mc -> SixSevenClient.modules().aq.q());
         context.waitTicks(40);
         context.runOnClient(
            mc -> {
               class_1703 var1 = mc.field_1724.field_7512;
               require(
                  var1.method_7611(2).method_7677().method_7960(),
                  "keep-stays OFF: picked slot #3 must be left empty, got " + describe(var1.method_7611(2).method_7677())
               );
               boolean var2x = invHas(var1, ITEM[2], COUNT[2]);
               String var3x = String.valueOf(ITEM[2]);
               require(var2x, "keep-stays OFF: you must still hold the picked stack " + var3x + " x" + COUNT[2]);

               for (int var4x = 0; var4x < 9; var4x++) {
                  if (var4x != 2) {
                     class_1799 var5x = var1.method_7611(var4x).method_7677();
                     require(
                        var5x.method_31574(ITEM[var4x]) && var5x.method_7947() == COUNT[var4x],
                        "keep-stays OFF: slot " + var4x + " should be restored to " + ITEM[var4x] + " x" + COUNT[var4x] + ", got " + describe(var5x)
                     );
                  }
               }
            }
         );
         context.takeScreenshot("gamblerigger-04-keepoff-slot3-empty");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_7346();
            }

            SixSevenClient.modules().aq.b.a(true);
            SixSevenClient.modules().aq.r();
         });
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> a.a().a("GambleRigger@MISC", true));
         context.getInput().pressKey(344);
         context.waitForScreen(a.class);
         context.waitTicks(8);
         context.takeScreenshot("gamblerigger-05-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().aq.a(false);
            a.a().a("GambleRigger@MISC", false);
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
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

   private static void openDispenser(ClientGameTestContext context) {
      context.runOnClient(
         mc -> {
            if (mc.field_1724 != null && mc.field_1761 != null) {
               mc.field_1761
                  .method_2896(
                     mc.field_1724, class_1268.field_5808, new class_3965(class_243.method_24953(DISPENSER), class_2350.field_11036, DISPENSER, false)
                  );
            }
         }
      );
      context.waitForScreen(class_480.class);
   }

   private static boolean invHas(class_1703 menu, class_1792 item, int count) {
      for (int var3 = 9; var3 < 45; var3++) {
         class_1799 var4 = menu.method_7611(var3).method_7677();
         if (var4.method_31574(item) && var4.method_7947() == count) {
            return true;
         }
      }

      return false;
   }

   private static String describe(class_1799 s) {
      return s.method_7960() ? "empty" : s.method_7909() + " x" + s.method_7947();
   }

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
