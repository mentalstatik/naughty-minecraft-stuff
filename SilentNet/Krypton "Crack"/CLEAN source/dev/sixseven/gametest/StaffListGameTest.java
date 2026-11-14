package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.k.a;
import dev.sixseven.k.b;
import dev.sixseven.k.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_2561;
import net.minecraft.class_5250;

public class StaffListGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      verifyDetection();
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         context.runOnClient(mc -> {
            d var1 = SixSevenClient.modules();
            require(var1.an != null, "StaffList registered");
            var1.an.a(true);
            var1.an.f.a(true);
            var1.an.g.a(true);
            c.a(roster());
         });
         context.waitTicks(10);
         context.takeScreenshot("stafflist-roster");
         context.runOnClient(mc -> c.a(bigRoster()));
         context.waitTicks(10);
         context.takeScreenshot("stafflist-overflow");
         context.runOnClient(mc -> c.a(List.of()));
         context.waitTicks(10);
         context.takeScreenshot("stafflist-empty");
         context.runOnClient(mc -> c.e());
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

   private static void verifyDetection() {
      a.a var0 = new a.a("Star + Rank", Set.of("knownstaff"), a.f, "★☆✦✧✪✩✫✬✭✮✯⭐✰❂⚝✴✵✶✷✸✹⍟", true, true);
      class_5250 var1 = class_2561.method_43473()
         .method_10852(class_2561.method_43470("★ ").method_54663(16733525))
         .method_10852(class_2561.method_43470("StaffGuy"));
      b var2 = a.a("StaffGuy", var1, (class_2561)null, (class_2561)null, (String)null, false, 30, var0);
      require(var2 != null, "star-marked player detected");
      boolean var3 = var2.d() == -43691;
      String var4 = Integer.toHexString(var2 == null ? 0 : var2.d());
      require(var3, "star colour captured (got " + var4 + ")");
      require(var2.c().isEmpty(), "star-only entry has no rank label");
      b var5 = a.a("AdminDude", class_2561.method_43470("Admin | AdminDude"), (class_2561)null, (class_2561)null, (String)null, false, 40, var0);
      require(var5 != null, "text-rank player detected");
      var3 = "Admin".equals(var5.c());
      var4 = var5 == null ? "null" : var5.c();
      require(var3, "rank label resolves to Admin (got " + var4 + ")");
      b var6 = a.a("KnownStaff", class_2561.method_43470("KnownStaff"), (class_2561)null, (class_2561)null, (String)null, false, 50, var0);
      require(var6 != null, "allowlisted player detected");
      b var7 = a.a("PuaMod", class_2561.method_43470("\ue001 PuaMod"), (class_2561)null, (class_2561)null, (String)null, false, 60, var0);
      require(var7 != null, "PUA font-icon staff detected");
      b var8 = a.a("RandomKid", class_2561.method_43470("RandomKid"), (class_2561)null, (class_2561)null, (String)null, false, 70, var0);
      require(var8 == null, "ordinary player is not flagged");
      b var9 = a.a("xX_admin_Xx", class_2561.method_43470("xX_admin_Xx"), (class_2561)null, (class_2561)null, (String)null, false, 70, var0);
      require(var9 == null, "username containing 'admin' is not flagged as staff");
      a.a var10 = new a.a("Star Only", Set.of(), a.f, "★☆✦✧✪✩✫✬✭✮✯⭐✰❂⚝✴✵✶✷✸✹⍟", true, true);
      require(
         a.a("AdminDude", class_2561.method_43470("Admin | AdminDude"), (class_2561)null, (class_2561)null, (String)null, false, 40, var10) == null,
         "Star Only ignores text ranks"
      );
      require(a.a("StaffGuy", var1, (class_2561)null, (class_2561)null, (String)null, false, 30, var10) != null, "Star Only still detects the star");
   }

   private static List<b> roster() {
      return List.of(
         new b("Owner_Jeff", "Owner", -45747, false, 22, 19),
         new b("Admin_Kate", "Admin", -26368, false, 48, 17),
         new b("ModSquad", "Mod", -11141291, false, 130, 11),
         new b("HelperHank", "Helper", -11141121, false, 250, 8),
         new b("StealthWatch", "Mod", -11141291, true, 90, 11),
         new b("Twinkles", "", 0, false, 70, 1)
      );
   }

   private static List<b> bigRoster() {
      ArrayList var0 = new ArrayList<>(roster());
      var0.add(new b("BuilderBob", "Builder", -11143, false, 40, 4));
      var0.add(new b("SupportSue", "Support", -6584321, false, 55, 3));
      var0.add(new b("TrialTom", "Trial", -5197648, false, 300, 2));
      return var0;
   }

   private static void require(boolean condition, String message) {
      if (!condition) {
         throw new AssertionError(message);
      }
   }
}
