package dev.sixseven.k;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5251;

public final class a {
   public static final String a = "Star + Rank";
   public static final String b = "Star Only";
   public static final String c = "Rank Only";
   public static final String d = "Names Only";
   public static final String e = "★☆✦✧✪✩✫✬✭✮✯⭐✰❂⚝✴✵✶✷✸✹⍟";
   public static final List<String> f = List.of(
      "coowner",
      "owner",
      "manager",
      "administrator",
      "admin",
      "developer",
      "dev",
      "srmod",
      "seniormod",
      "moderator",
      "mod",
      "srhelper",
      "seniorhelper",
      "helper",
      "trialmod",
      "trial",
      "builder",
      "support",
      "staff"
   );
   public static final String g = String.join(", ", f);
   private static final Map<String, String> h = Map.ofEntries(
      Map.entry("coowner", "Co-Owner"),
      Map.entry("owner", "Owner"),
      Map.entry("manager", "Manager"),
      Map.entry("administrator", "Admin"),
      Map.entry("admin", "Admin"),
      Map.entry("developer", "Dev"),
      Map.entry("dev", "Dev"),
      Map.entry("srmod", "Sr.Mod"),
      Map.entry("seniormod", "Sr.Mod"),
      Map.entry("moderator", "Mod"),
      Map.entry("mod", "Mod"),
      Map.entry("srhelper", "Sr.Helper"),
      Map.entry("seniorhelper", "Sr.Helper"),
      Map.entry("helper", "Helper"),
      Map.entry("trialmod", "Trial"),
      Map.entry("trial", "Trial"),
      Map.entry("builder", "Builder"),
      Map.entry("support", "Support"),
      Map.entry("staff", "Staff")
   );

   private a() {
   }

   public static dev.sixseven.k.b a(
      String name, class_2561 display, class_2561 teamPrefix, class_2561 teamSuffix, String teamName, boolean vanished, int latency, dev.sixseven.k.a.a cfg
   ) {
      if (name != null && !name.isEmpty()) {
         boolean var8 = cfg.b().contains(name.toLowerCase(Locale.ROOT));
         Integer var9 = a(display, cfg);
         if (var9 == null) {
            var9 = a(teamPrefix, cfg);
         }

         if (var9 == null) {
            var9 = a(teamSuffix, cfg);
         }

         boolean var10 = var9 != null;
         String var11 = a(display);
         String var12 = var11 + " " + a(teamPrefix) + " " + a(teamSuffix) + " " + (teamName == null ? "" : teamName);
         dev.sixseven.k.a.b var13 = a(a(var12, name), cfg.c());
         boolean var14 = var13 != null;
         String var15 = cfg.a();

         if (!var8 && !(switch (var15) {
            case "Star Only" -> var10;
            case "Rank Only" -> var14;
            case "Names Only" -> false;
            default -> var10 || var14;
         })) {
            return null;
         } else {
            int var19 = var10 ? var9 : 0;
            String var20 = var14 ? var13.a() : "";
            int var21 = var14 ? var13.b() : (var10 ? 1 : 0);
            return new dev.sixseven.k.b(name, var20, var19, vanished, latency, var21);
         }
      } else {
         return null;
      }
   }

   static Integer a(class_2561 c, dev.sixseven.k.a.a cfg) {
      return cx == null ? null : (Integer)cx.method_27658((style, str) -> {
         int var3 = 0;

         while (var3 < str.length()) {
            int var4 = str.codePointAt(var3);
            var3 += Character.charCount(var4);
            if (a(var4, cfg)) {
               class_5251 var5 = style.method_10973();
               return Optional.of(var5 != null ? 0xFF000000 | var5.method_27716() : 0);
            }
         }

         return Optional.empty();
      }, class_2583.field_24360).orElse(null);
   }

   private static boolean a(int cp, dev.sixseven.k.a.a cfg) {
      if (cfg.d().indexOf(cp) >= 0) {
         return true;
      } else {
         return !cfg.e() ? false : cp >= 57344 && cp <= 63743 || cp >= 983040 && cp <= 1048573 || cp >= 1048576 && cp <= 1114109;
      }
   }

   private static dev.sixseven.k.a.b a(String tagText, List<String> keywords) {
      String var2 = b(tagText.toLowerCase(Locale.ROOT));
      if (var2.isEmpty()) {
         return null;
      } else {
         for (int var3 = 0; var3 < keywords.size(); var3++) {
            String var4 = (String)keywords.get(var3);
            if (!var4.isEmpty() && var2.contains(var4)) {
               return new dev.sixseven.k.a.b(a(var4), keywords.size() - var3);
            }
         }

         return null;
      }
   }

   private static String a(String keyword) {
      String var1 = h.get(keyword);
      if (var1 != null) {
         return var1;
      } else if (keyword.isEmpty()) {
         return "Staff";
      } else {
         char var2 = Character.toUpperCase(keyword.charAt(0));
         return var2 + keyword.substring(1);
      }
   }

   private static String a(class_2561 c) {
      return cx == null ? "" : cx.getString();
   }

   private static String b(String s) {
      StringBuilder var1 = new StringBuilder(s.length());

      for (int var2 = 0; var2 < s.length(); var2++) {
         char var3 = s.charAt(var2);
         if (var3 >= 'a' && var3 <= 'z') {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   private static String a(String text, String name) {
      return name != null && !name.isEmpty() ? text.replaceAll("(?i)" + Pattern.quote(name), " ") : text;
   }

   public static record a(String a, Set<String> b, List<String> c, String d, boolean e, boolean f) {
   }

   private static record b(String a, int b) {
   }
}
