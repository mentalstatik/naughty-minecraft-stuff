package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.d.a.w;
import dev.sixseven.n.c;
import java.util.Locale;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_437;
import net.minecraft.class_5498;

public class CustomGlintGameTest implements FabricClientGameTest {
   private static final String GLINT = "[enchantment_glint_override=true]";
   private static final String[] STYLES = new String[]{"Ender", "Void", "Galaxy", "Toxic", "Amethyst", "Cyber", "Solar", "Prismatic", "Abyss"};

   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> require(SixSevenClient.modules().ab != null, "CustomGlint registered"));
         var3.runCommand("gamemode creative @a");
         var3.runCommand("time set day");
         var3.runCommand("weather clear");
         var3.runCommand("fill -8 0 -8 8 0 8 minecraft:white_concrete");
         var3.runCommand("tp @a 0 1 0 0 0");
         var3.runCommand("item replace entity @a armor.head with minecraft:netherite_helmet[enchantment_glint_override=true]");
         var3.runCommand("item replace entity @a armor.chest with minecraft:netherite_chestplate[enchantment_glint_override=true]");
         var3.runCommand("item replace entity @a armor.legs with minecraft:netherite_leggings[enchantment_glint_override=true]");
         var3.runCommand("item replace entity @a armor.feet with minecraft:netherite_boots[enchantment_glint_override=true]");
         var3.runCommand("item replace entity @a weapon.mainhand with minecraft:netherite_sword[enchantment_glint_override=true]");
         context.runOnClient(mc -> {
            mc.field_1690.method_31043(class_5498.field_26665);
            SixSevenClient.modules().d.a(false);
            SixSevenClient.modules().ab.a(false);
         });
         context.waitTicks(10);
         context.takeScreenshot("glint-00-vanilla-off");
         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            var1.a.a((String)"Default");
            var1.b.a((String)"Solid");
            var1.c.a(Integer.valueOf(-49508));
            var1.d.a(Double.valueOf(100.0));
            var1.a(true);
         });
         context.waitTicks(3);
         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            require(var1.k(), "CustomGlint must report active once enabled");
            require(!var1.l(), "Default style must not be a texture style");
            require(var1.o() == -49508, "solid pink @100% must compute to PINK, got " + Integer.toHexString(var1.o()));
         });
         context.takeScreenshot("glint-01-solid-pink");
         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            var1.d.a(Double.valueOf(0.0));
            require(var1.o() == c.a(0, 0, 0), "0% strength must zero the glint RGB, got " + Integer.toHexString(var1.o()));
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
         context.runOnClient(mc -> {
            int var1 = SixSevenClient.themes().a().a();
            require(SixSevenClient.modules().ab.o() == var1, "theme mode @100% must equal the live accent");
         });
         context.takeScreenshot("glint-02-theme-blue");
         context.runOnClient(mc -> {
            for (dev.sixseven.m.c var2x : SixSevenClient.themes().b()) {
               if (var2x.b().equals("Pink")) {
                  SixSevenClient.themes().a(var2x);
               }
            }

            SixSevenClient.modules().ab.b.a((String)"Rainbow");
         });
         context.waitTicks(3);
         context.takeScreenshot("glint-03-rainbow");

         for (int var4 = 0; var4 < STYLES.length; var4++) {
            String var5 = STYLES[var4];
            context.runOnClient(mc -> {
               w var2x = SixSevenClient.modules().ab;
               var2x.a.a((String)var5);
               var2x.d.a(Double.valueOf(100.0));
            });
            context.waitTicks(4);
            context.runOnClient(mc -> {
               w var2x = SixSevenClient.modules().ab;
               require(var2x.l(), "style " + var5 + " must report a custom texture");
               require(var2x.m().equals(var5.toLowerCase(Locale.ROOT)), "textureName must match the selected style, got " + var2x.m());
            });
            context.takeScreenshot(String.format("glint-1%d-%s", var4, var5.toLowerCase(Locale.ROOT)));
         }

         context.runOnClient(mc -> {
            w var1 = SixSevenClient.modules().ab;
            var1.a.a((String)"Default");
            var1.b.a((String)"Solid");
            a.a().a("CustomGlint@MISC", true);
            mc.method_1507(new a());
         });
         context.waitForScreen(a.class);
         context.waitTicks(8);
         context.takeScreenshot("glint-20-settings");
         context.runOnClient(mc -> {
            SixSevenClient.modules().ab.a(false);
            a.a().a("CustomGlint@MISC", false);
            mc.method_1507((class_437)null);
         });
         context.waitForScreen((Class)null);
      } catch (Throwable var7) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
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
