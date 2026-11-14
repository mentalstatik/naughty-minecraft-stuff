package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.d.a.A;
import dev.sixseven.i.i;
import java.util.stream.IntStream;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_437;

public class StringInputGameTest implements FabricClientGameTest {
   private static final String EURO = codePoint(8364);
   private static final String POUND = codePoint(163);
   private static final String YEN = codePoint(165);

   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         context.runOnClient(mc -> {
            A var1 = SixSevenClient.modules().ak;
            require(var1 != null, "FakePay registered");
            i var2x = var1.c;
            dev.sixseven.b.d.i var3 = new dev.sixseven.b.d.i(SixSevenClient.themes(), var2x);
            var3.a(0.0F, 0.0F, 200.0F);
            require(var3.a(5.0F, 5.0F, 0), "left click focuses the field");
            require(var3.c(), "focused field listens for typing");
            var2x.a("");
            type(var3, EURO);
            boolean var4 = var2x.i().equals(EURO);
            String var5x = var2x.i();
            require(var4, "euro sign typed, got '" + var5x + "'");
            var2x.a("");
            var5x = POUND;
            type(var3, var5x + YEN);
            String var6x = var2x.i();
            var5x = POUND;
            boolean var7 = var6x.equals(var5x + YEN);
            var5x = var2x.i();
            require(var7, "pound+yen typed, got '" + var5x + "'");
            var2x.a("$");
            var3.a(259);
            require(var2x.i().isEmpty(), "backspace cleared the '$'");
            type(var3, "$");
            var7 = var2x.i().equals("$");
            var5x = var2x.i();
            require(var7, "'$' retyped after clearing, got '" + var5x + "'");
            var2x.a("");
            type(var3, "USD");
            var7 = var2x.i().equals("USD");
            var5x = var2x.i();
            require(var7, "letters still accepted, got '" + var5x + "'");
            var2x.a("");
            type(var3, "$$$$$$");
            require(var2x.i().length() == 4, "maxLength caps at 4, got " + var2x.i().length());
            var2x.a(EURO);
         });
         context.runOnClient(mc -> mc.method_1507(new a()));
         context.waitTicks(3);
         context.takeScreenshot("stringinput-clickgui-open");
         context.runOnClient(mc -> mc.method_1507((class_437)null));
         context.waitTicks(2);
         context.runOnClient(mc -> {
            A var1 = SixSevenClient.modules().ak;
            var1.b.a((String)"Both");
            var1.a(true);
            require(var1.c.i().equals(EURO), "currency persisted as euro");
            mc.field_1724.field_3944.method_45730("pay Notch 250k");
         });
         context.waitTicks(2);
         context.takeScreenshot("stringinput-fakepay-euro-receipt");
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

   private static String codePoint(int cp) {
      return new String(Character.toChars(cp));
   }

   private static void type(dev.sixseven.b.d.i widget, String text) {
      IntStream var2 = text.codePoints();
      var2.forEach(widget::b);
   }

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
