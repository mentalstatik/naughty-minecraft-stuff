package dev.sixseven.d.a;

import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2588;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_7417;
import net.minecraft.class_8828;

public class B extends dev.sixseven.d.c {
   public static final String a = "None";
   public static final String b = "SR.MOD";
   public static final String c = "MEDIA";
   public static final String d = "SR.ADMIN";
   private static final int i = 8355711;
   private static final int j = 5635925;
   private static final int k = 16733695;
   private static final int l = 16733269;
   private static final int m = 16777215;
   public final dev.sixseven.i.f e = this.a(
      new dev.sixseven.i.f("Role", "Which fake rank tag to wear in front of your name", "None", "None", "SR.MOD", "MEDIA", "SR.ADMIN")
   );
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Nametag", "Show the tag on your floating nametag (3rd person)", true));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Tab List", "Show the tag before your name in the player list (Tab)", true));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Chat", "Show the tag before your name in chat messages", true));

   public B() {
      super("FakeRoles", "Fake [SR.MOD] / [MEDIA] / [SR.ADMIN] rank tag on your own name", dev.sixseven.d.b.c);
   }

   public boolean k() {
      class_310 var1 = class_310.method_1551();
      return this.f() && !this.e.a("None") && var1.field_1724 != null;
   }

   private String m() {
      class_310 var1 = class_310.method_1551();
      return var1.field_1724 == null ? null : var1.field_1724.method_7334().name();
   }

   private boolean b(String exactName) {
      String var2 = this.m();
      return var2 != null && !var2.isEmpty() && var2.equals(exactName);
   }

   private int n() {
      String var1 = this.e.i();

      return switch (var1) {
         case "SR.MOD" -> 5635925;
         case "MEDIA" -> 16733695;
         case "SR.ADMIN" -> 16733269;
         default -> 16777215;
      };
   }

   private class_2583 o() {
      return class_2583.field_24360.method_36139(8355711).method_10982(false);
   }

   private class_2583 p() {
      return class_2583.field_24360.method_36139(this.n()).method_10982(true);
   }

   private class_2583 q() {
      String var1 = this.e.i();

      return switch (var1) {
         case "SR.MOD" -> class_2583.field_24360.method_36139(5635925).method_10982(true);
         case "SR.ADMIN" -> class_2583.field_24360.method_36139(16733269).method_10982(true);
         case "MEDIA" -> class_2583.field_24360.method_36139(16777215).method_10982(false);
         default -> class_2583.field_24360;
      };
   }

   public class_2561 l() {
      return class_2561.method_43473()
         .method_10852(class_2561.method_43470("[").method_10862(this.o()))
         .method_10852(class_2561.method_43470(this.e.i()).method_10862(this.p()))
         .method_10852(class_2561.method_43470("] ").method_10862(this.o()));
   }

   public class_2561 a(String name) {
      return this.k() && name != null
         ? class_2561.method_43473().method_10852(this.l()).method_10852(class_2561.method_43470(name).method_10862(this.q()))
         : null;
   }

   public class_2561 a(class_2561 tag) {
      return this.k() && this.f.i() ? this.c(tag) : tag;
   }

   public class_2561 a(class_2561 display, String realName) {
      if (this.k() && this.g.i()) {
         class_2561 var3 = this.b(realName) ? this.a(realName) : null;
         return var3 != null ? var3 : display;
      } else {
         return display;
      }
   }

   public class_2561 b(class_2561 input) {
      return this.k() && this.h.i() ? this.c(input) : input;
   }

   private class_2561 c(class_2561 input) {
      if (input == null) {
         return null;
      } else {
         String var2 = this.m();
         return var2 != null && !var2.isBlank() && input.getString().contains(var2) ? this.a(input, var2, new boolean[]{false}) : input;
      }
   }

   private class_2561 a(class_2561 c, String name, boolean[] done) {
      class_7417 var4 = cx.method_10851();
      class_5250 var5;
      if (!done[0] && var4 instanceof class_8828 var6) {
         String var19 = var6.comp_737();
         int var20 = var19.indexOf(name);
         if (var20 >= 0) {
            done[0] = true;
            var5 = class_2561.method_43473();
            if (var20 > 0) {
               var5.method_10852(class_2561.method_43470(var19.substring(0, var20)).method_10862(cx.method_10866()));
            }

            var5.method_10852(this.a(name));
            int var21 = var20 + name.length();
            if (var21 < var19.length()) {
               var5.method_10852(class_2561.method_43470(var19.substring(var21)).method_10862(cx.method_10866()));
            }
         } else {
            var5 = class_5250.method_43477(var4).method_10862(cx.method_10866());
         }
      } else if (!done[0] && var4 instanceof class_2588 var7) {
         Object[] var8 = var7.method_11023();
         Object[] var9 = new Object[var8.length];

         for (int var10 = 0; var10 < var8.length; var10++) {
            Object var11 = var8[var10];
            if (var11 instanceof class_2561 var12) {
               var9[var10] = this.a(var12, name, done);
            } else {
               if (!done[0] && var11 instanceof String) {
                  String var13 = (String)var11;
                  if (var13.contains(name)) {
                     done[0] = true;
                     int var14 = var13.indexOf(name);
                     class_5250 var15 = class_2561.method_43473();
                     if (var14 > 0) {
                        var15.method_10852(class_2561.method_43470(var13.substring(0, var14)));
                     }

                     var15.method_10852(this.a(name));
                     int var16 = var14 + name.length();
                     if (var16 < var13.length()) {
                        var15.method_10852(class_2561.method_43470(var13.substring(var16)));
                     }

                     var9[var10] = var15;
                     continue;
                  }
               }

               var9[var10] = var11;
            }
         }

         var5 = class_5250.method_43477(new class_2588(var7.method_11022(), var7.method_48323(), var9)).method_10862(cx.method_10866());
      } else {
         var5 = class_5250.method_43477(var4).method_10862(cx.method_10866());
      }

      for (class_2561 var18 : cx.method_10855()) {
         var5.method_10852(this.a(var18, name, done));
      }

      return var5;
   }
}
