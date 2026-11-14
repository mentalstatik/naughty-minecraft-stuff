package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.e;
import dev.sixseven.d.a.H;
import dev.sixseven.d.a.L;
import dev.sixseven.d.a.T;
import dev.sixseven.d.a.U;
import dev.sixseven.d.a.V;
import dev.sixseven.d.a.ad;
import dev.sixseven.d.a.ah;
import dev.sixseven.d.a.t;
import dev.sixseven.d.a.v;
import dev.sixseven.d.a.w;
import dev.sixseven.g.d;
import dev.sixseven.g.r;
import dev.sixseven.g.u;
import dev.sixseven.l.a;
import dev.sixseven.l.b;
import dev.sixseven.n.c;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1531;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_408;
import net.minecraft.class_437;
import net.minecraft.class_490;
import net.minecraft.class_5498;

public class SixSevenClientGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();

         for (int var4 = -60; var4 <= -58; var4++) {
            for (int var5 = 8; var5 <= 10; var5++) {
               var3.runCommand("setblock " + var4 + " 0 " + var5 + " minecraft:budding_amethyst");
               var3.runCommand("setblock " + var4 + " 1 " + var5 + " minecraft:amethyst_cluster");
            }
         }

         for (int var14 = 8; var14 <= 12; var14++) {
            for (int var19 = 8; var19 <= 11; var19++) {
               var3.runCommand("setblock " + var14 + " 0 " + var19 + " minecraft:budding_amethyst");
            }
         }

         for (int var15 = 20; var15 <= 23; var15++) {
            for (int var20 = 8; var20 <= 10; var20++) {
               var3.runCommand("setblock " + var15 + " 0 " + var20 + " minecraft:budding_amethyst");
            }
         }

         for (int var16 = 14; var16 <= 17; var16++) {
            var3.runCommand("setblock " + var16 + " 0 64 minecraft:budding_amethyst");
         }

         for (int var17 = 97; var17 <= 99; var17++) {
            for (int var21 = 9; var21 <= 11; var21++) {
               var3.runCommand("setblock " + var17 + " -1 " + var21 + " minecraft:dirt");
               var3.runCommand("setblock " + var17 + " 0 " + var21 + " minecraft:sweet_berry_bush[age=3]");
            }
         }

         var3.runCommand("setblock 40 0 40 minecraft:beehive[honey_level=5]");
         var3.runCommand("setblock 40 0 72 minecraft:beehive[honey_level=5]");
         var3.runCommand("setblock 72 0 40 minecraft:beehive[honey_level=0]");
         context.waitTicks(10);
         context.runOnClient(mc -> {
            e.f var1 = SixSevenClient.modules().e;
            var1.b.a(Double.valueOf(3.0));
            var1.r.a((String)"Toast");
            var1.n.a(true);
            var1.l.a(true);
            var1.q.a(true);
            var1.j.a(Double.valueOf(-59.0));
            var1.a(true);
         });
         var3.runCommand("tp @a 3000 -58 3000");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-90.0F);
               mc.field_1724.method_36457(0.0F);
            }
         });
         context.waitTicks(60);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.modules().e.s;
            assertThat(var1.a().isEmpty(), "fresh area must produce zero flags, got " + var1.a().size());
         });
         context.takeScreenshot("01-fresh-area-clean");
         var3.runCommand("tp @a -14 -58 -10");
         var2.getClientWorld().waitForChunksRender();
         context.waitTicks(80);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.modules().e.s;
            boolean var2x = var1.a().stream().anyMatch(f -> f.a() == class_1923.method_8331(-4, 0));
            assertThat(var2x, "REAL geode (visible clusters, packet light) must flag after chunk reload");
         });
         context.runOnClient(mc -> {
            for (int var1 = 8; var1 <= 12; var1++) {
               for (int var2x = 8; var2x <= 11; var2x++) {
                  a.a().a(var1, 1, var2x, 5);
               }
            }

            for (int var3x = 20; var3x <= 23; var3x++) {
               for (int var4x = 8; var4x <= 10; var4x++) {
                  a.a().a(var3x, 1, var4x, 5);
               }
            }
         });
         context.waitTicks(30);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.modules().e.s;
            boolean var2x = var1.a().size() == 3;
            int var3x = var1.a().size();
            assertThat(var2x, "real geode + two synth chunks must flag, got " + var3x);
            assertThat(var1.b().size() == 2, "expected 2 zones (real geode; merged synth pair), got " + var1.b().size());
         });
         var3.runCommand("tp @a 16 -58 64");
         var2.getClientWorld().waitForChunksRender();
         context.waitTicks(25);
         context.runOnClient(mc -> {
            for (int var1 = 14; var1 <= 17; var1++) {
               a.a().a(var1, 1, 64, 5);
            }
         });
         context.waitTicks(30);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.modules().e.s;
            boolean var2x = var1.a().stream().anyMatch(f -> f.a() == class_1923.method_8331(0, 4));
            boolean var3x = var1.a().stream().anyMatch(f -> f.a() == class_1923.method_8331(1, 4));
            assertThat(var2x && var3x, "split geode: BOTH 2-cluster sub-chunks must flag via per-geode counting");
            boolean var4x = var1.b().stream().anyMatch(z -> z.a().contains(class_1923.method_8331(0, 4)) && z.a().contains(class_1923.method_8331(1, 4)));
            assertThat(var4x, "split geode's two chunks must share one zone");
         });
         var3.runCommand("tp @a 16 -33 92");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(180.0F);
               mc.field_1724.method_36457(46.0F);
            }
         });
         context.waitTicks(3);
         context.takeScreenshot("02b-split-geode-both-chunks");
         var3.runCommand("tp @a -58 -42 35");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(180.0F);
               mc.field_1724.method_36457(36.0F);
            }
         });
         context.waitTicks(3);
         context.takeScreenshot("02-real-geode-flagged");
         var3.runCommand("tp @a -20 -35 -8");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-66.0F);
               mc.field_1724.method_36457(33.0F);
            }
         });
         context.waitTicks(3);
         context.takeScreenshot("03-smart-merged-quad");
         context.runOnClient(mc -> SixSevenClient.modules().e.n.a(false));
         var3.runCommand("tp @a -20 -35 -8");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-66.0F);
               mc.field_1724.method_36457(33.0F);
            }
         });
         context.waitTicks(3);
         context.takeScreenshot("04-per-chunk");
         context.runOnClient(mc -> SixSevenClient.modules().e.n.a(true));
         var3.runCommand("tp @a -20 -58 -8");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-66.0F);
               mc.field_1724.method_36457(10.0F);
            }
         });
         context.waitTicks(10);
         context.takeScreenshot("05-radar-inrange");
         var3.runCommand("tp @a 100 -58 8");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-90.0F);
               mc.field_1724.method_36457(5.0F);
            }
         });
         context.waitTicks(25);
         context.takeScreenshot("06-radar-clamped-label");
         context.runOnClient(mc -> {
            e.f var1 = SixSevenClient.modules().e;
            var1.r.a((String)"Chat");
            var1.b.a(Double.valueOf(2.0));
         });
         context.waitTicks(30);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.modules().e.s;
            boolean var2x = var1.a().stream().anyMatch(f -> f.a() == class_1923.method_8331(6, 0));
            assertThat(var2x, "berry chunk must join at sensitivity 2");
         });
         context.takeScreenshot("07-berries-sens2-chat");
         context.runOnClient(mc -> {
            e.f var1 = SixSevenClient.modules().e;
            var1.b.a(Double.valueOf(3.0));
            var1.r.a((String)"Toast");
            dev.sixseven.b.a.a().a("SusChunkFinder@RENDER", true);
         });
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(10);
         context.takeScreenshot("08-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().e.a(false);
            dev.sixseven.b.a.a().a("SusChunkFinder@RENDER", false);
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         String[] var18 = new String[]{
            "chest",
            "trapped_chest",
            "barrel",
            "white_shulker_box",
            "furnace",
            "blast_furnace",
            "smoker",
            "hopper",
            "dropper",
            "dispenser",
            "ender_chest",
            "brewing_stand",
            "spawner"
         };

         for (int var22 = 0; var22 < var18.length; var22++) {
            var3.runCommand("setblock " + (2 + var22) + " -59 25 minecraft:" + var18[var22]);
         }

         var3.runCommand("tp @a 3000 -58 3000");
         var2.getClientWorld().waitForChunksRender();
         var3.runCommand("tp @a 8 -57 18");
         var2.getClientWorld().waitForChunksRender();
         context.waitTicks(10);
         context.runOnClient(mc -> {
            ah var1 = SixSevenClient.modules().v;
            var1.d.a(false);
            var1.a(true);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(12.0F);
            }
         });
         context.waitTicks(40);
         context.runOnClient(
            mc -> {
               int var2x = u.b();
               long var3x = u.c();
               StringBuilder var5x = new StringBuilder();
               if (mc.field_1687 != null) {
                  for (int var6x = 0; var6x < var18.length; var6x++) {
                     var5x.append(mc.field_1687.method_8320(new class_2338(2 + var6x, -59, 25)).method_26204().method_9518().getString()).append(' ');
                  }
               }

               String var7x = " [cache="
                  + var2x
                  + "/"
                  + var18.length
                  + " shulkers="
                  + var3x
                  + " playerChunk="
                  + (mc.field_1724 != null ? mc.field_1724.method_31476() : "null")
                  + " clientBlocks="
                  + var5x.toString().trim()
                  + "]";
               assertThat(var2x >= var18.length, "StorageESP must detect every container type," + var7x);
               assertThat(var3x >= 1L, "StorageESP must detect the shulker box," + var7x);
            }
         );
         context.takeScreenshot("10-storage-esp-all-types");
         context.runOnClient(mc -> SixSevenClient.modules().v.a(false));
         var3.runCommand("tp @a 8 -57 18");
         context.runOnClient(mc -> {
            ah var1 = SixSevenClient.modules().v;
            var1.d.a(true);
            var1.a(true);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(8.0F);
            }
         });
         context.waitTicks(20);
         context.takeScreenshot("10b-tracers-front-crosshair");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(90.0F);
            }
         });
         context.waitTicks(20);
         context.takeScreenshot("10c-tracers-offcamera-side");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(180.0F);
            }
         });
         context.waitTicks(20);
         context.takeScreenshot("10d-tracers-behind");
         context.runOnClient(mc -> {
            ah var1 = SixSevenClient.modules().v;
            var1.d.a(false);
            var1.a(false);
         });
         var3.runCommand("tp @a 8 -57 18");
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(0.0F);
            }

            dev.sixseven.d.a.u var1 = SixSevenClient.modules().W;
            var1.j.a(true);
            var1.f.a(false);
            var1.a(true);
         });
         String[] var23 = new String[]{"Cross", "Dot", "Circle", "T-Shape", "Brackets", "Chevron", "67"};

         for (int var6 = 0; var6 < var23.length; var6++) {
            String var7 = var23[var6];
            context.runOnClient(mc -> SixSevenClient.modules().W.a.a((String)var7));
            context.waitTicks(2);
            context.takeScreenshot(String.format("11%c-crosshair-%s", (char)(97 + var6), var7.toLowerCase()));
         }

         context.runOnClient(mc -> assertThat(SixSevenClient.modules().W.a.a("67"), "crosshair style must be the 67 logo for the final shot"));
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.method_1507(new class_490(mc.field_1724));
            }
         });
         context.waitTicks(2);
         context.takeScreenshot("11h-crosshair-hidden-in-inventory");
         context.runOnClient(mc -> {
            mc.method_1507((class_437)null);
            SixSevenClient.modules().W.a(false);
         });
         var3.runCommand("tp @a 8 -57 18");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(0.0F);
            }
         });
         context.waitTicks(4);
         context.takeScreenshot("12a-zoom-off");
         context.runOnClient(mc -> SixSevenClient.modules().X.a(true));
         context.waitTicks(40);
         context.takeScreenshot("12b-zoom-on-4x");
         context.runOnClient(mc -> assertThat(SixSevenClient.modules().X.k() > 3.9, "Zoom must ease to the 4x target, was " + SixSevenClient.modules().X.k()));
         context.runOnClient(mc -> SixSevenClient.modules().X.a(false));
         context.runOnClient(mc -> {
            e.e var1 = SixSevenClient.modules().c;
            var1.a.a((String)"Demo");
            var1.b.a(true);
            var1.c.a(true);
            var1.a(true);
         });
         context.waitTicks(5);
         context.takeScreenshot("13-spotify-volume-slider");
         context.runOnClient(mc -> SixSevenClient.modules().c.a(false));
         var3.runCommand("tp @a 8 -57 18");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(0.0F);
            }
         });
         context.waitTicks(4);
         context.takeScreenshot("14a-fov-off");
         context.runOnClient(mc -> {
            v var1 = SixSevenClient.modules().Y;
            var1.a.a(Double.valueOf(140.0));
            var1.a(true);
         });
         context.waitTicks(40);
         context.takeScreenshot("14b-fov-140-fisheye");
         context.runOnClient(mc -> assertThat(SixSevenClient.modules().Y.k() > 135.0, "CustomFOV must ease to 140, was " + SixSevenClient.modules().Y.k()));
         context.runOnClient(mc -> SixSevenClient.modules().Y.a.a(Double.valueOf(40.0)));
         context.waitTicks(40);
         context.takeScreenshot("14c-fov-40-tunnel");
         context.runOnClient(mc -> assertThat(SixSevenClient.modules().Y.k() < 45.0, "CustomFOV must ease to 40, was " + SixSevenClient.modules().Y.k()));
         context.runOnClient(mc -> SixSevenClient.modules().Y.a(false));
         var3.runCommand("tp @a 8 -57 18");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(7.0F);
            }

            L var1 = SixSevenClient.modules().Z;
            var1.f.a(Double.valueOf(20.0));
            var1.g.a(Double.valueOf(1.4));
            var1.i.a(Double.valueOf(1.1));
            var1.h.a(Double.valueOf(1.0));
            var1.l.a(Double.valueOf(80.0));
            var1.m.a(true);
            var1.k.a(false);
            var1.a(true);
         });
         context.waitTicks(15);
         String[] var24 = new String[]{"Sparks", "Hearts", "Lightning", "67"};

         for (int var25 = 0; var25 < var24.length; var25++) {
            String var8 = var24[var25];
            context.runOnClient(mc -> {
               L var2x = SixSevenClient.modules().Z;
               var2x.m();
               var2x.e.a((String)var8);
               if (mc.field_1724 != null) {
                  class_243 var3x = mc.field_1724.method_5836(1.0F);
                  class_243 var4x = mc.field_1724.method_5828(1.0F);
                  class_243 var5x = var3x.method_1019(var4x.method_1021(3.0));
                  class_243 var6x = var3x.method_1019(var4x.method_1021(3.9));
                  var2x.a(var5x.field_1352 - 0.4, var5x.field_1351, var5x.field_1350);
                  var2x.a(var6x.field_1352 + 0.4, var6x.field_1351 - 0.3, var6x.field_1350);
               }
            });
            context.runOnClient(mc -> assertThat(!SixSevenClient.modules().Z.k().isEmpty(), "HitParticles must spawn particles for style " + var8));
            context.waitTicks(3);
            context.takeScreenshot(String.format("15%c-hitparticles-%s", (char)(97 + var25), var8.toLowerCase()));
         }

         context.runOnClient(mc -> {
            SixSevenClient.modules().Z.m();
            SixSevenClient.modules().Z.e.a((String)"Sparks");
         });
         var3.runCommand("summon minecraft:armor_stand 8.5 -57 22 {NoGravity:1b}");
         context.waitTicks(10);
         context.runOnClient(mc -> {
            if (mc.field_1724 != null && mc.field_1687 != null && mc.field_1761 != null) {
               class_1297 var1 = null;

               for (class_1297 var3x : mc.field_1687.method_18112()) {
                  if (var3x instanceof class_1531) {
                     var1 = var3x;
                     break;
                  }
               }

               if (var1 != null) {
                  mc.field_1761.method_2918(mc.field_1724, var1);
                  assertThat(!SixSevenClient.modules().Z.k().isEmpty(), "attack() mixin must feed HitParticles a burst on a real hit");
               }
            }
         });
         context.waitTicks(3);
         context.takeScreenshot("15e-hitparticles-real-hit");
         context.runOnClient(mc -> {
            L var1 = SixSevenClient.modules().Z;
            var1.e.a((String)"67");
            dev.sixseven.b.a.a().a("HitParticles@VISUALS", true);
         });
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(8);
         context.takeScreenshot("15f-hitparticles-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().Z.a(false);
            dev.sixseven.b.a.a().a("HitParticles@VISUALS", false);
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> {
            e.c var1 = SixSevenClient.modules().b;
            var1.q.a(true);
            var1.r.a(Double.valueOf(6.0));
            dev.sixseven.f.a var2x = SixSevenClient.notifications();
            var2x.a(0.99F, 0.71F);
            var2x.a(1.0F);
            var2x.a("SpeedMine", true);
            var2x.a("Sus chunk found  ·  1,247 blocks");
            var2x.a("Thunderstorm", "brewing overhead", dev.sixseven.f.a.b.b, true);
         });
         context.waitTicks(12);
         context.takeScreenshot("16a-toasts-default-anchor");
         context.runOnClient(mc -> mc.method_1507(new class_408("", false)));
         context.waitForScreen(class_408.class);
         context.waitTicks(5);
         context.takeScreenshot("16b-toasts-editor-outline");
         context.runOnClient(mc -> {
            dev.sixseven.f.a var1 = SixSevenClient.notifications();
            var1.a(0.1F, 0.32F);
            var1.a(1.3F);
         });
         context.waitTicks(8);
         context.takeScreenshot("16c-toasts-moved-scaled");
         context.runOnClient(mc -> {
            dev.sixseven.f.a var1 = SixSevenClient.notifications();
            assertThat(Math.abs(var1.b() - 0.1F) < 0.001F && Math.abs(var1.d() - 1.3F) < 0.001F, "notification anchor must hold its dragged position & scale");
         });
         context.runOnClient(mc -> mc.method_1507((class_437)null));
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> {
            SixSevenClient.notifications().a(0.99F, 0.71F);
            SixSevenClient.notifications().a(1.0F);
         });
         var3.runCommand("tp @a 8 -57 18");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(0.0F);
            }

            T var1 = SixSevenClient.modules().aa;
            var1.a.a(Double.valueOf(85.0));
            var1.b.a(true);
            var1.c.a(Double.valueOf(45.0));
            var1.d.a(false);
            var1.a(true);
         });
         context.waitTicks(6);
         context.takeScreenshot("17a-motionblur-static");

         for (int var26 = 0; var26 < 12; var26++) {
            float var28 = (float)var26 * 22.0F;
            context.runOnClient(mc -> {
               if (mc.field_1724 != null) {
                  mc.field_1724.method_36456(var28);
               }
            });
            context.waitTicks(1);
         }

         context.runOnClient(mc -> {
            boolean var1 = r.b() > 0 && r.c() > 0.0F;
            int var2x = r.b();
            assertThat(var1, "MotionBlur render path must run with retention > 0, frames=" + var2x + " retention=" + r.c());
         });
         context.takeScreenshot("17b-motionblur-spin-trails");
         context.runOnClient(mc -> dev.sixseven.b.a.a().a("MotionBlur@VISUALS", true));
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(8);
         context.takeScreenshot("17c-motionblur-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().aa.a(false);
            dev.sixseven.b.a.a().a("MotionBlur@VISUALS", false);
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         var3.runCommand("setblock 6 -59 30 minecraft:spawner{SpawnData:{entity:{id:\"minecraft:zombie\"}}}");
         var3.runCommand("setblock 11 -59 30 minecraft:trial_spawner");
         var3.runCommand("tp @a 3000 -58 3000");
         var2.getClientWorld().waitForChunksRender();
         var3.runCommand("tp @a 8 -57 22");
         var2.getClientWorld().waitForChunksRender();
         context.waitTicks(10);
         var3.runCommand("summon item 7 -58 28 {Item:{id:\"minecraft:diamond\",count:32}}");
         var3.runCommand("summon item 9 -58 28 {Item:{id:\"minecraft:golden_apple\",count:3}}");
         var3.runCommand("summon item 8 -58 27 {Item:{id:\"minecraft:netherite_ingot\",count:1}}");
         context.waitTicks(10);
         context.runOnClient(mc -> {
            V var1 = SixSevenClient.modules().L;
            var1.c.a(true);
            var1.j.a(true);
            var1.a(true);
            ad var2x = SixSevenClient.modules().R;
            var2x.a.a(true);
            var2x.a(true);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(12.0F);
            }
         });
         context.waitTicks(20);
         context.runOnClient(mc -> assertThat(!SixSevenClient.modules().R.g.a().isEmpty(), "SpawnerNametags scan must find the placed spawners"));
         context.takeScreenshot("18a-nametags-items-spawners");
         context.runOnClient(mc -> {
            U var1 = SixSevenClient.modules().J;
            var1.a.a("SixSeven");
            var1.a(true);
            dev.sixseven.b.a.a().a("NameTags@MISC", true);
         });
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(8);
         context.takeScreenshot("18b-nametags-settings");
         context.runOnClient(mc -> dev.sixseven.b.a.a().a("NameTags@MISC", false));
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> {
            SixSevenClient.modules().L.a(false);
            SixSevenClient.modules().R.a(false);
            U var1 = SixSevenClient.modules().J;
            var1.d.a(false);
            var1.a(true);
            if (mc.field_1724 != null) {
               String var2x = mc.field_1724.method_7334().name();
               String var3x = var1.b(class_2561.method_43470(var2x + " left the game")).getString();
               assertThat(!var3x.contains(var2x) && var3x.contains("SixSeven"), "NameProtect must censor the player's name in chat, got: " + var3x);
               mc.field_1705.method_1743().method_1812(class_2561.method_43470("<" + var2x + "> gg wp"));
               mc.field_1705.method_1743().method_1812(class_2561.method_43470(var2x + " joined the game"));
            }
         });
         context.waitTicks(6);
         context.takeScreenshot("18c-nameprotect-chat");
         context.runOnClient(mc -> SixSevenClient.modules().J.a(false));
         var3.runCommand("item replace entity @a armor.head with minecraft:diamond_helmet");
         var3.runCommand("item replace entity @a armor.chest with minecraft:netherite_chestplate");
         var3.runCommand("item replace entity @a armor.legs with minecraft:iron_leggings");
         var3.runCommand("item replace entity @a armor.feet with minecraft:golden_boots");
         var3.runCommand("item replace entity @a weapon.mainhand with minecraft:diamond_sword");
         var3.runCommand("item replace entity @a weapon.offhand with minecraft:shield");
         context.waitTicks(6);
         context.runOnClient(
            mc -> {
               V var1 = SixSevenClient.modules().L;
               var1.a(true);
               var1.b.a(true);
               var1.g.a(true);
               var1.h.a(true);
               mc.field_1690.method_31043(class_5498.field_26666);
               if (mc.field_1724 != null) {
                  mc.field_1724.method_36456(0.0F);
                  mc.field_1724.method_36457(0.0F);
                  assertThat(
                     !mc.field_1724.method_6047().method_7960() && !mc.field_1724.method_6118(class_1304.field_6169).method_7960(),
                     "self player must be geared up for the armor/held-item tag"
                  );
               }
            }
         );
         context.waitTicks(15);
         context.takeScreenshot("18d-self-tag-armor-held-item");
         context.runOnClient(mc -> mc.field_1690.method_31043(class_5498.field_26664));
         context.waitTicks(15);
         context.takeScreenshot("18d2-self-tag-hidden-first-person");
         context.runOnClient(mc -> {
            SixSevenClient.modules().R.a(true);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(0.0F);
               mc.field_1724.method_36457(12.0F);
            }
         });
         context.waitTicks(6);
         context.runOnClient(mc -> mc.method_1507(new class_490(mc.field_1724)));
         context.waitForScreen(class_490.class);
         context.waitTicks(5);
         context.takeScreenshot("18e-nametags-hidden-in-inventory");
         context.runOnClient(mc -> {
            mc.method_1507((class_437)null);
            SixSevenClient.modules().L.a(false);
            SixSevenClient.modules().R.a(false);
         });
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> SixSevenClient.modules().ab.a(false));
         String[] var27 = new String[]{"netherite_sword", "diamond_chestplate", "diamond_pickaxe", "bow", "golden_apple", "elytra"};

         for (String var11 : var27) {
            var3.runCommand("give @a minecraft:" + var11 + "[enchantment_glint_override=true] 1");
         }

         context.waitTicks(10);
         context.runOnClient(mc -> mc.method_1507(new class_490(mc.field_1724)));
         context.waitForScreen(class_490.class);
         context.waitTicks(5);
         context.takeScreenshot("19a-glint-vanilla-off");
         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            var1.b.a((String)"Solid");
            var1.c.a(Integer.valueOf(-49508));
            var1.d.a(Double.valueOf(100.0));
            var1.a(true);
         });
         context.waitTicks(3);
         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            assertThat(var1.k(), "CustomGlint must report active once enabled");
            assertThat(var1.o() == -49508, "solid pink @100% must compute to PINK, got " + Integer.toHexString(var1.o()));
         });
         context.takeScreenshot("19b-glint-solid-pink");
         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            var1.d.a(Double.valueOf(0.0));
            assertThat(var1.o() == c.a(0, 0, 0), "0% strength must zero the glint RGB, got " + Integer.toHexString(var1.o()));
            var1.d.a(Double.valueOf(100.0));
         });
         context.runOnClient(mc -> {
            for (dev.sixseven.m.c var2x : SixSevenClient.themes().b()) {
               if (var2x.b().equals("Blue")) {
                  SixSevenClient.themes().a(var2x);
               }
            }

            SixSevenClient.modules().ab.b.a((String)"Theme");
         });
         context.waitTicks(3);
         context.runOnClient(
            mc -> {
               int var1 = SixSevenClient.themes().a().a();
               assertThat(
                  SixSevenClient.modules().ab.o() == var1,
                  "theme mode @100% must equal the live accent, got " + Integer.toHexString(SixSevenClient.modules().ab.o())
               );
            }
         );
         context.takeScreenshot("19c-glint-theme-blue");
         context.runOnClient(mc -> {
            for (dev.sixseven.m.c var2x : SixSevenClient.themes().b()) {
               if (var2x.b().equals("Pink")) {
                  SixSevenClient.themes().a(var2x);
               }
            }
         });
         context.runOnClient(mc -> SixSevenClient.modules().ab.b.a((String)"Rainbow"));
         context.waitTicks(3);
         context.takeScreenshot("19d-glint-rainbow");
         context.runOnClient(mc -> mc.method_1507((class_437)null));
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> {
            SixSevenClient.modules().ab.b.a((String)"Solid");
            dev.sixseven.b.a.a().a("CustomGlint@MISC", true);
         });
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(8);
         context.takeScreenshot("19e-glint-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().ab.a(false);
            dev.sixseven.b.a.a().a("CustomGlint@MISC", false);
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         var3.runCommand("tp @a 500 -60 500 -90 0");
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> {
            SixSevenClient.modules().e.a(false);
            SixSevenClient.modules().d.a(false);
            SixSevenClient.modules().aa.a(false);
            mc.field_1690.method_31043(class_5498.field_26665);
            if (mc.field_1724 != null) {
               mc.field_1724.method_36456(-90.0F);
               mc.field_1724.method_5636(-90.0F);
               mc.field_1724.method_36457(0.0F);
            }

            t var1 = SixSevenClient.modules().ac;
            var1.a.a(Integer.valueOf(-49508));
            var1.b.a(false);
            var1.c.a(Double.valueOf(75.0));
            var1.e.a(true);
            var1.g.a(true);
            var1.h.a(false);
            var1.k.a(false);
            var1.m.a(false);
            var1.a(true);
         });
         context.waitTicks(20);

         for (String var36 : new String[]{"67", "Wave", "Grid", "Solid"}) {
            context.runOnClient(mc -> SixSevenClient.modules().ac.f.a((String)var36));
            context.waitTicks(6);
            context.takeScreenshot("20-cape-" + var36.toLowerCase());
         }

         context.runOnClient(mc -> {
            t var1 = SixSevenClient.modules().ac;
            var1.e.a(false);
            var1.h.a(true);
            var1.j.a(Double.valueOf(2.0));
            var1.i.a((String)"Ribbon");
         });
         walkEast(context, 500.0);
         context.runOnClient(mc -> assertThat(!SixSevenClient.modules().ac.k().isEmpty(), "CustomAccessories must record trail nodes while moving"));
         context.takeScreenshot("20-trail-ribbon");
         context.runOnClient(mc -> SixSevenClient.modules().ac.i.a((String)"Sparkle"));
         walkEast(context, 510.0);
         context.takeScreenshot("20-trail-sparkle");
         context.runOnClient(mc -> SixSevenClient.modules().ac.i.a((String)"Echo"));
         walkEast(context, 520.0);
         context.takeScreenshot("20-trail-echo");
         context.runOnClient(mc -> {
            t var1 = SixSevenClient.modules().ac;
            var1.h.a(false);
            var1.k.a(true);
            var1.l.a((String)"Orbit");
         });
         context.waitTicks(10);
         context.takeScreenshot("20-aura-orbit");
         context.runOnClient(mc -> SixSevenClient.modules().ac.l.a((String)"Ring"));
         context.waitTicks(10);
         context.takeScreenshot("20-aura-ring");
         context.runOnClient(mc -> {
            t var1 = SixSevenClient.modules().ac;
            var1.k.a(false);
            var1.m.a(true);
         });
         context.waitTicks(12);
         context.takeScreenshot("20-crown");
         context.runOnClient(mc -> {
            t var1 = SixSevenClient.modules().ac;
            var1.e.a(true);
            var1.f.a((String)"67");
            var1.h.a(true);
            var1.i.a((String)"Ribbon");
            var1.k.a(true);
            var1.l.a((String)"Orbit");
            var1.m.a(true);
         });
         walkEast(context, 500.0);
         context.takeScreenshot("20-all-combined");
         context.runOnClient(mc -> {
            mc.field_1690.method_31043(class_5498.field_26664);
            dev.sixseven.b.a.a().a("CustomAccessories@VISUALS", true);
         });
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(8);
         context.takeScreenshot("20-accessories-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().ac.a(false);
            dev.sixseven.b.a.a().a("CustomAccessories@VISUALS", false);
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         int[] var31 = new int[]{12};
         context.runOnClient(mc -> {
            SixSevenClient.modules().e.a(false);
            SixSevenClient.modules().d.a(false);
            SixSevenClient.modules().aa.a(false);
            mc.field_1690.method_31043(class_5498.field_26664);
            var31[0] = (Integer)mc.field_1690.method_42503().method_41753();
            mc.field_1690.method_42503().method_41748(8);
         });
         var3.runCommand("tp @a 34 -59 40 0 0");
         var2.getClientWorld().waitForChunksRender();
         context.waitTicks(10);
         context.runOnClient(mc -> {
            class_2680 var1 = mc.field_1687.method_8320(new class_2338(40, 0, 40));
            class_2680 var2x = mc.field_1687.method_8320(new class_2338(40, 0, 72));
            boolean var3x = mc.field_1687.method_2935().method_12126(2, 2, false) != null;
            boolean var4x = mc.field_1687.method_2935().method_12126(2, 4, false) != null;
            boolean var5x = var1.method_27852(class_2246.field_20422);
            String var6x = String.valueOf(var1);
            assertThat(var5x, "test setup: client must see the beehive at (40,0,40); saw " + var6x + " (chunk loaded=" + var3x + ")");
            var5x = var2x.method_27852(class_2246.field_20422);
            var6x = String.valueOf(var2x);
            assertThat(var5x, "test setup: client must see the second beehive at (40,0,72); saw " + var6x + " (chunk loaded=" + var4x + ")");
         });
         context.runOnClient(mc -> {
            dev.sixseven.d.a.r var1 = SixSevenClient.modules().ad;
            var1.b.a(Double.valueOf(1.0));
            var1.l();
            var1.a(true);
         });
         context.waitTicks(260);
         context.runOnClient(mc -> {
            dev.sixseven.d.a.r var1 = SixSevenClient.modules().ad;
            long var2x = class_1923.method_8331(2, 2);
            long var4x = class_1923.method_8331(2, 4);
            long var6x = class_1923.method_8331(4, 2);
            boolean var8x = var1.k().contains(var2x) && var1.k().contains(var4x);
            String var9 = String.valueOf(var1.k());
            assertThat(var8x, "radius 1 must leave BOTH full-honey beehive chunks flagged (unmerged); flags=" + var9);
            assertThat(!var1.k().contains(var6x), "an empty (honey 0) beehive must NOT flag");
         });
         var3.runCommand("tp @a 40 78 26 0 42");
         context.waitTicks(20);
         context.takeScreenshot("21-chunkfinder-fullhoney");
         context.runOnClient(mc -> SixSevenClient.modules().ad.b.a(Double.valueOf(4.0)));
         context.waitTicks(10);
         context.runOnClient(
            mc -> {
               dev.sixseven.d.a.r var1 = SixSevenClient.modules().ad;
               long var2x = class_1923.method_8331(2, 3);
               long var4x = class_1923.method_8331(2, 2);
               long var6x = class_1923.method_8331(2, 4);
               assertThat(var1.k().contains(var2x), "Smart must flag the middle chunk (2,3) between the two hives; flags=" + var1.k());
               assertThat(
                  !var1.k().contains(var4x) && !var1.k().contains(var6x), "Smart must merge the hive chunks away, leaving only the middle; flags=" + var1.k()
               );
            }
         );
         var3.runCommand("tp @a 40 78 26 0 42");
         context.waitTicks(20);
         context.takeScreenshot("21b-chunkfinder-smart");
         context.runOnClient(mc -> {
            H var1 = SixSevenClient.modules().T;
            var1.d.a(false);
            var1.c.a(false);
            var1.a(true);
         });
         context.waitTicks(30);
         context.runOnClient(
            mc -> {
               assertThat(SixSevenClient.modules().T.m(), "Freecam must be active for the regression shot");
               assertThat(
                  !SixSevenClient.modules().ad.k().isEmpty(), "chunk finder must still hold its flag under freecam; flags=" + SixSevenClient.modules().ad.k()
               );
            }
         );
         context.takeScreenshot("21c-chunkfinder-freecam");
         context.runOnClient(mc -> SixSevenClient.modules().T.a(false));
         context.waitTicks(5);
         context.runOnClient(mc -> {
            SixSevenClient.modules().ad.a(false);
            mc.field_1690.method_42503().method_41748(var31[0]);
         });
         context.runOnClient(mc -> {
            SixSevenClient.modules().d.a(false);
            mc.field_1690.method_31043(class_5498.field_26664);
         });
         var3.runCommand("tp @a 2 -58 0 0 0");
         context.waitTicks(20);

         for (int var33 = 1; var33 <= 3; var33++) {
            for (int var35 = -59; var35 <= -57; var35++) {
               var3.runCommand("setblock " + var33 + " " + var35 + " 6 minecraft:diamond_ore");
            }
         }

         var3.runCommand("setblock 6 -58 6 minecraft:emerald_ore");
         context.waitTicks(5);
         context.runOnClient(
            mc -> assertThat(
                  mc.field_1687.method_8320(new class_2338(2, -58, 6)).method_27852(class_2246.field_10442),
                  "test setup: client must see the placed diamond ore"
               )
         );
         context.runOnClient(mc -> SixSevenClient.modules().w.a(true));
         context.waitTicks(20);
         context.runOnClient(mc -> assertThat(d.b() > 0, "BlockESP must detect the enabled diamond ore (emerald is off); cached=" + d.b()));
         var3.runCommand("tp @a 2 -55 -4 0 22");
         context.waitTicks(20);
         context.takeScreenshot("30-blockesp-boxes");
         context.runOnClient(mc -> dev.sixseven.b.a.a().a("BlockESP@RENDER", true));
         context.getInput().pressKey(344);
         context.waitForScreen(dev.sixseven.b.a.class);
         context.waitTicks(8);
         context.takeScreenshot("31-blockesp-settings");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof dev.sixseven.b.a var2x) {
               var2x.a(SixSevenClient.modules().w.a);
            }
         });
         context.waitForScreen(dev.sixseven.b.e.class);
         context.waitTicks(8);
         context.takeScreenshot("32-blockpicker-grid");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof dev.sixseven.b.e var2x) {
               var2x.a("ore");
            }
         });
         context.waitTicks(8);
         context.takeScreenshot("33-blockpicker-search");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof dev.sixseven.b.e var2x) {
               var2x.a(0);
            }
         });
         context.waitTicks(8);
         context.takeScreenshot("34-blockpicker-color");
         context.runOnClient(mc -> {
            mc.method_1507((class_437)null);
            SixSevenClient.modules().w.a(false);
            dev.sixseven.b.a.a().a("BlockESP@RENDER", false);
         });
         context.waitForScreen((Class)null);
      } catch (Throwable var13) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   private static void walkEast(ClientGameTestContext context, double startX) {
      for (int var3 = 0; var3 < 10; var3++) {
         double var4 = startX + (double)var3 * 0.45;
         context.runOnClient(mc -> {
            if (mc.field_1724 != null) {
               mc.field_1724.method_5814(var4, -60.0, 500.0);
            }
         });
         context.waitTicks(1);
      }

      context.waitTicks(4);
   }

   private static void assertThat(boolean condition, String message) {
      if (!condition) {
         throw new AssertionError(message);
      }
   }
}
