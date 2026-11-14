package dev.sixseven.d.a;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2588;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7417;
import net.minecraft.class_742;
import net.minecraft.class_8828;

public class U extends dev.sixseven.d.c {
   public final dev.sixseven.i.i a = this.a(new dev.sixseven.i.i("Your Alias", "What your own name is replaced with", "You", 16, "You"));
   public final dev.sixseven.i.f b = this.a(
      new dev.sixseven.i.f("Others", "How other players' names are replaced when full hiding is off", "Aliases", "Aliases", "Blank", "Player #")
   );
   public final dev.sixseven.i.b c = this.a(
      new dev.sixseven.i.b("Hide Names Completely", "Replace player names with empty text while keeping other tag text", true)
   );
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Self Only", "Only hide your own name, leave others alone", false));
   public final dev.sixseven.i.f e = this.a(
      new dev.sixseven.i.f("Sidebar Name", "Change your name in the scoreboard on the right", "Off", "Off", "Black", "Replace", "Blank")
   );
   public final dev.sixseven.i.i f = this.a(
      new dev.sixseven.i.i("Sidebar Alias", "Replacement text for your name in the right scoreboard", "Player", 16, "Player")
   );
   private static final int g = 256;
   private final LinkedHashMap<String, String> h = new LinkedHashMap<String, String>(16, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Entry<String, String> var1) {
         return this.size() > 256;
      }
   };
   private String i = null;
   private Map<String, String> j = Map.of();
   private Pattern k = null;
   private class_634 l = null;

   public U() {
      super("NameProtect", "Hides player names in clips", dev.sixseven.d.b.c);
      this.f.a(() -> this.e.a("Replace"));
   }

   private String k() {
      class_310 var1 = class_310.method_1551();
      return var1.field_1724 == null ? null : var1.field_1724.method_7334().name();
   }

   private boolean c(String var1) {
      String var2 = this.k();
      return var2 != null && var2.equalsIgnoreCase(var1);
   }

   public String a(String var1) {
      if (this.c.i() || this.b.a("Blank")) {
         return "";
      } else if (this.c(var1)) {
         String var3 = this.a.i();
         return var3 != null && !var3.isBlank() ? var3 : "You";
      } else if (this.b.a("Player #")) {
         int var2 = Math.floorMod(var1.toLowerCase(Locale.ROOT).hashCode(), 99);
         return "Player " + (var2 + 1);
      } else {
         return "Player";
      }
   }

   private Map<String, String> l() {
      LinkedHashMap var3 = new LinkedHashMap();
      class_310 var4 = class_310.method_1551();
      class_634 var5 = var4.method_1562();
      if (var5 != this.l) {
         this.h.clear();
         this.l = var5;
      }

      String var2;
      if ((var2 = this.k()) != null && !var2.isEmpty()) {
         this.h.put(var2.toLowerCase(Locale.ROOT), var2);
         var3.put(var2, this.a(var2));
      }

      boolean var1 = !this.d.i();
      if (var5 != null) {
         for (class_640 var8 : var5.method_2880()) {
            GameProfile var9 = var8.method_2966();
            String var10 = var9 == null ? null : var9.name();
            if (var10 != null && !var10.isEmpty()) {
               this.h.put(var10.toLowerCase(Locale.ROOT), var10);
               if (var1) {
                  var3.putIfAbsent(var10, this.a(var10));
               }
            }
         }
      }

      if (var1 && var4.field_1687 != null) {
         for (class_742 var13 : var4.field_1687.method_18456()) {
            GameProfile var15 = var13.method_7334();
            String var16 = var15 == null ? null : var15.name();
            if (var16 != null && !var16.isEmpty()) {
               this.h.put(var16.toLowerCase(Locale.ROOT), var16);
               var3.putIfAbsent(var16, this.a(var16));
            }
         }
      }

      if (var1) {
         for (String var14 : new ArrayList<>(this.h.values())) {
            var3.putIfAbsent(var14, this.a(var14));
         }
      }

      var3.entrySet().removeIf(var0 -> ((String)var0.getKey()).equalsIgnoreCase((String)var0.getValue()));
      return var3;
   }

   private void m() {
      class_310 var1 = class_310.method_1551();
      int var2 = var1.field_1724 == null ? -1 : var1.field_1724.field_6012;
      String var3 = var2 + "|" + this.d.i() + "|" + this.c.i() + "|" + this.b.i() + "|" + this.a.i();
      if (!var3.equals(this.i)) {
         this.i = var3;
         this.j = this.l();
         this.k = a(this.j);
      }
   }

   private static Pattern a(Map<String, String> var0) {
      if (var0.isEmpty()) {
         return null;
      } else {
         ArrayList var1 = new ArrayList(var0.keySet());
         var1.sort((var0x, var1x) -> Integer.compare(var1x.length(), var0x.length()));
         StringBuilder var2 = new StringBuilder("(?i)(?<![A-Za-z0-9_])(");

         for (int var3 = 0; var3 < var1.size(); var3++) {
            if (var3 > 0) {
               var2.append('|');
            }

            var2.append(Pattern.quote((String)var1.get(var3)));
         }

         var2.append(")(?![A-Za-z0-9_])");
         return Pattern.compile(var2.toString());
      }
   }

   public String b(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.m();
         if (this.k == null) {
            return null;
         } else {
            String var2 = this.e(var1);
            return var2.equals(var1) ? null : var2;
         }
      } else {
         return null;
      }
   }

   public class_2561 a(class_2561 var1) {
      if (var1 != null && this.f()) {
         String var2 = this.e.i();
         if (var2 != null && !var2.equals("Off")) {
            String var3 = this.k();
            return var3 != null && !var3.isEmpty() && a(var1.getString(), var3) ? this.a(var1, var3, var2) : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private class_2561 a(class_2561 var1, String var2, String var3) {
      class_7417 var5 = var1.method_10851();
      class_5250 var4;
      if (var5 instanceof class_8828 var6) {
         var4 = this.a(var6.comp_737(), var2, var3, var1.method_10866());
      } else if (var5 instanceof class_2588 var7) {
         Object[] var8 = var7.method_11023();
         Object[] var9 = new Object[var8.length];

         for (int var10 = 0; var10 < var8.length; var10++) {
            Object var11 = var8[var10];
            if (var11 instanceof class_2561 var12) {
               var9[var10] = this.a(var12, var2, var3);
            } else {
               if (var11 instanceof String) {
                  String var13 = (String)var11;
                  if (a(var13, var2)) {
                     if (var3.equals("Black")) {
                        var9[var10] = this.a(var13, var2, var3, var1.method_10866());
                     } else {
                        var9[var10] = a(var13, var2, var3, this.f.i());
                     }
                     continue;
                  }
               }

               var9[var10] = var11;
            }
         }

         var4 = class_5250.method_43477(new class_2588(var7.method_11022(), var7.method_48323(), var9));
      } else {
         var4 = class_5250.method_43477(var5);
      }

      var4.method_10862(var1.method_10866());

      for (class_2561 var15 : var1.method_10855()) {
         var4.method_10852(this.a(var15, var2, var3));
      }

      return var4;
   }

   private class_5250 a(String var1, String var2, String var3, class_2583 var4) {
      Pattern var5 = d(var2);
      Matcher var6 = var5.matcher(var1);
      if (!var6.find()) {
         return class_2561.method_43470(var1).method_10862(var4);
      } else {
         class_5250 var7 = class_2561.method_43473();
         int var8 = 0;

         do {
            a(var7, var1.substring(var8, var6.start()), var4);
            String var9 = var3.equals("Black") ? var6.group() : (var3.equals("Replace") ? this.f.i() : "");
            if (!var9.isEmpty()) {
               class_2583 var10 = var3.equals("Black") ? var4.method_36139(0) : var4;
               a(var7, var9, var10);
            }

            var8 = var6.end();
         } while (var6.find());

         a(var7, var1.substring(var8), var4);
         return var7.method_10862(var4);
      }
   }

   private static boolean a(String var0, String var1) {
      return var0 != null && !var0.isEmpty() && d(var1).matcher(var0).find();
   }

   private static Pattern d(String var0) {
      return Pattern.compile("(?i)(?<![A-Za-z0-9_])" + Pattern.quote(var0) + "(?![A-Za-z0-9_])");
   }

   private static String a(String var0, String var1, String var2, String var3) {
      Matcher var4 = d(var1).matcher(var0);
      return var2.equals("Blank") ? var4.replaceAll("") : var4.replaceAll(Matcher.quoteReplacement(var3 == null ? "" : var3));
   }

   private static void a(class_5250 var0, String var1, class_2583 var2) {
      if (var1 != null && !var1.isEmpty()) {
         var0.method_10852(class_2561.method_43470(var1).method_10862(var2));
      }
   }

   public class_2561 b(class_2561 var1) {
      if (var1 == null) {
         return null;
      } else {
         this.m();
         return this.k == null ? var1 : this.c(var1);
      }
   }

   private class_2561 c(class_2561 var1) {
      class_7417 var3 = var1.method_10851();
      class_5250 var2;
      if (var3 instanceof class_8828 var4) {
         var2 = class_5250.method_43477(class_8828.method_54232(this.e(var4.comp_737())));
      } else if (var3 instanceof class_2588 var10) {
         Object[] var5 = var10.method_11023();
         Object[] var6 = new Object[var5.length];

         for (int var7 = 0; var7 < var5.length; var7++) {
            Object var8 = var5[var7];
            if (var8 instanceof class_2561 var9) {
               var6[var7] = this.c(var9);
            } else if (var8 instanceof String var13) {
               var6[var7] = this.e(var13);
            } else {
               var6[var7] = var8;
            }
         }

         var2 = class_5250.method_43477(new class_2588(var10.method_11022(), var10.method_48323(), var6));
      } else {
         var2 = class_5250.method_43477(var3);
      }

      var2.method_10862(var1.method_10866());

      for (class_2561 var12 : var1.method_10855()) {
         var2.method_10852(this.c(var12));
      }

      return var2;
   }

   private String e(String var1) {
      if (var1 != null && !var1.isEmpty() && this.k != null) {
         Matcher var2 = this.k.matcher(var1);
         if (!var2.find()) {
            return var1;
         } else {
            StringBuilder var3 = new StringBuilder(var1.length());
            int var4 = 0;

            do {
               String var5 = var2.group(1);
               String var6 = this.f(var5);
               var3.append(var1, var4, var2.start());
               var3.append(var6 != null ? var6 : var5);
               var4 = var2.end();
            } while (var2.find());

            var3.append(var1, var4, var1.length());
            return var3.toString();
         }
      } else {
         return var1;
      }
   }

   private String f(String var1) {
      String var2 = this.j.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         for (Entry var4 : this.j.entrySet()) {
            if (((String)var4.getKey()).equalsIgnoreCase(var1)) {
               return (String)var4.getValue();
            }
         }

         return null;
      }
   }
}
