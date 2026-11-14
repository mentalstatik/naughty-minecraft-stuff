package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.g;
import dev.sixseven.i.e;
import java.util.List;
import java.util.Locale;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_1511;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public class AutoCrystalGameTest implements FabricClientGameTest {
   private static final int TRIGGER_KEY = 71;
   private static final class_2338 BASE = new class_2338(0, 1, 0);
   private static final class_238 CRYSTAL_BOX = new class_238(-0.5, 1.5, -0.5, 1.5, 5.5, 2.5);

   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1280, 720);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> require(SixSevenClient.modules().A != null, "AutoCrystal registered"));
         this.buildArena(context, var3, "obsidian");
         context.runOnClient(mc -> {
            g var1 = SixSevenClient.modules().A;
            var1.a.a(Integer.valueOf(71));
            var1.c.a(Double.valueOf(0.0));
            var1.b.a(Double.valueOf(0.0));
            var1.e.a(Double.valueOf(0.0));
            var1.d.a(true);
            var1.g.a(false);
            var1.f.a(Double.valueOf(1.0));
            var1.a(true);
         });
         context.takeScreenshot("autocrystal-aim");
         context.runOnClient(mc -> require(isAimingAtBase(mc.field_1765), "aim lands on the base, got " + describeHit(mc.field_1765)));
         context.getInput().holdKey(71);
         context.waitTicks(6);
         int[] var4 = new int[1];
         context.runOnClient(
            mc -> {
               List var2x = mc.field_1687.method_18467(class_1511.class, CRYSTAL_BOX);
               if (var2x.size() != 1) {
                  String var3x = String.valueOf(mc.field_1724.method_6047().method_7909());
                  String var4x = "hand="
                     + var3x
                     + " off="
                     + mc.field_1724.method_6079().method_7909()
                     + " sel="
                     + mc.field_1724.method_31548().method_67532()
                     + " base="
                     + mc.field_1687.method_8320(new class_2338(0, 1, 0))
                     + " above="
                     + mc.field_1687.method_8320(new class_2338(0, 2, 0))
                     + " trigHeld="
                     + class_3675.method_15987(mc.method_22683(), 71)
                     + " enabled="
                     + SixSevenClient.modules().A.f()
                     + " hit="
                     + describeHit(mc.field_1765);
                  int var5x = var2x.size();
                  require(false, "one crystal placed on the obsidian base, got " + var5x + " | " + var4x);
               }

               var4[0] = ((class_1511)var2x.get(0)).method_5628();
            }
         );
         context.takeScreenshot("autocrystal-placed");
         context.runOnClient(mc -> SixSevenClient.modules().A.f.a(Double.valueOf(3.0)));
         context.waitTicks(6);
         context.runOnClient(
            mc -> {
               List var2x = mc.field_1687.method_18467(class_1511.class, CRYSTAL_BOX).stream().filter(c -> c.method_5628() == var4[0]).toList();
               if (!var2x.isEmpty()) {
                  double var3x = mc.field_1724.method_33571().method_1022(((class_1511)var2x.get(0)).method_73189());
                  require(
                     false,
                     "crystal id "
                        + var4[0]
                        + " should have been broken | dist="
                        + String.format(Locale.ROOT, "%.2f", var3x)
                        + " hit="
                        + describeHit(mc.field_1765)
                        + " hand="
                        + mc.field_1724.method_6047().method_7909()
                  );
               }
            }
         );
         context.takeScreenshot("autocrystal-broken");
         context.getInput().releaseKey(71);
         context.waitTicks(2);
         this.buildArena(context, var3, "stone");
         context.runOnClient(mc -> SixSevenClient.modules().A.f.a(Double.valueOf(1.0)));
         context.runOnClient(mc -> require(isAimingAtBase(mc.field_1765), "aim lands on the stone block, got " + describeHit(mc.field_1765)));
         context.getInput().holdKey(71);
         context.waitTicks(8);
         context.runOnClient(mc -> {
            boolean var1 = mc.field_1687.method_8320(new class_2338(0, 2, 0)).method_27852(class_2246.field_10540);
            boolean var2x = mc.field_1687.method_8320(new class_2338(0, 1, 1)).method_27852(class_2246.field_10540);
            require(var1 || var2x, "auto-obsidian laid a base (expected at 0,2,0 or 0,1,1)");
            int var3x = mc.field_1687.method_18467(class_1511.class, new class_238(-0.5, 1.5, -0.5, 1.5, 6.5, 2.5)).size();
            require(var3x >= 1, "a crystal was placed on the auto-laid obsidian, got " + var3x);
         });
         context.takeScreenshot("autocrystal-obsidian");
         context.getInput().releaseKey(71);
         context.runOnClient(mc -> SixSevenClient.modules().A.a(false));
         context.waitTicks(2);
         context.runOnClient(mc -> {
            e var1 = new e("Test", "", -1);
            dev.sixseven.b.d.e var2x = new dev.sixseven.b.d.e(SixSevenClient.themes(), var1);
            var2x.a(0.0F, 0.0F, 100.0F);
            require(var2x.a(10.0F, 10.0F, 0), "arming left-click is consumed");
            require(var2x.c(), "widget listens after the arming click");
            require(var2x.a(10.0F, 10.0F, 1), "the bind right-click is consumed");
            require(!var2x.c(), "widget stops listening once bound");
            boolean var3x = var1.i() == 1;
            String var4x = String.valueOf(var1.i());
            require(var3x, "right-click bound RMB, got " + var4x);
            var3x = var1.b().equals("RMB");
            var4x = var1.b();
            require(var3x, "the bind shows as 'RMB', got " + var4x);
            var2x.a(10.0F, 10.0F, 0);
            require(var2x.a(86), "a keyboard key still binds");
            var3x = var1.i() == 86;
            var4x = String.valueOf(var1.i());
            require(var3x, "V bound, got " + var4x);
            var2x.a(10.0F, 10.0F, 0);
            var2x.a(256);
            require(var1.i() == -1, "ESC clears the bind");
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

   private void buildArena(ClientGameTestContext context, TestServerContext server, String baseBlock) {
      server.runCommand("kill @e[type=minecraft:end_crystal]");
      server.runCommand("fill -20 0 -20 20 0 20 minecraft:stone");
      server.runCommand("fill -20 1 -20 20 8 20 minecraft:air");
      server.runCommand("setblock 0 1 0 minecraft:" + baseBlock);
      server.runCommand("gamemode creative @a");
      server.runCommand("clear @a");
      server.runCommand("give @a minecraft:end_crystal 64");
      server.runCommand("give @a minecraft:obsidian 64");
      server.runCommand("tp @a 0.5 1 2.5 180 15");
      context.waitTicks(5);
      context.runOnClient(mc -> aimAt(mc.field_1724, 0.5, 2.0, 0.5));
      context.waitTicks(3);
   }

   private static void aimAt(class_746 player, double tx, double ty, double tz) {
      class_243 var7 = player.method_33571();
      double var8 = tx - var7.field_1352;
      double var10 = ty - var7.field_1351;
      double var12 = tz - var7.field_1350;
      double var14 = Math.sqrt(var8 * var8 + var12 * var12);
      float var16 = (float)Math.toDegrees(Math.atan2(-var8, var12));
      float var17 = (float)(-Math.toDegrees(Math.atan2(var10, var14)));
      player.method_36456(var16);
      player.method_36457(var17);
      player.method_5847(var16);
   }

   private static boolean isAimingAtBase(class_239 hit) {
      if (hit instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(BASE)) {
         return true;
      }

      return false;
   }

   private static String describeHit(class_239 hit) {
      if (hit instanceof class_3965 var1 && var1.method_17783() == class_240.field_1332) {
         String var2 = String.valueOf(var1.method_17777());
         return "block " + var2 + " face " + var1.method_17780();
      }

      return hit == null ? "null" : hit.method_17783().toString();
   }

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
