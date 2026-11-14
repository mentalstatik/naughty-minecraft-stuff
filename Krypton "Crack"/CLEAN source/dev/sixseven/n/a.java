package dev.sixseven.n;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;

public final class a {
   private static final String[] a = new String[]{"qt", "q", "t", "b", "m", "k"};
   private static final String[] b = new String[]{"QT", "Q", "T", "B", "M", "k"};
   private static final int[] c = new int[]{18, 15, 12, 9, 6, 3};
   private static final Pattern d = Pattern.compile("\\d[\\d.,]*(?:\\s?(?:[qQ][tT]|[kKmMbBtTqQ]))?");

   private a() {
   }

   public static double a(String raw) {
      if (raw == null) {
         return Double.NaN;
      } else {
         String var1 = raw.trim().toLowerCase(Locale.ROOT).replaceAll("[,\\s_]", "");

         while (!var1.isEmpty() && (var1.charAt(0) == '$' || var1.charAt(0) == 8364 || var1.charAt(0) == 163)) {
            var1 = var1.substring(1);
         }

         if (var1.isEmpty()) {
            return Double.NaN;
         } else {
            for (int var2 = 0; var2 < a.length; var2++) {
               if (var1.endsWith(a[var2]) && var1.length() > a[var2].length()) {
                  String var3 = var1.substring(0, var1.length() - a[var2].length());

                  try {
                     return Double.parseDouble(var3) * Math.pow(10.0, (double)c[var2]);
                  } catch (NumberFormatException var5) {
                     return Double.NaN;
                  }
               }
            }

            try {
               return Double.parseDouble(var1);
            } catch (NumberFormatException var6) {
               return Double.NaN;
            }
         }
      }
   }

   public static String a(double n) {
      double var2 = Math.abs(n);

      for (int var4 = 0; var4 < c.length; var4++) {
         double var5 = Math.pow(10.0, (double)c[var4]);
         if (var2 >= var5) {
            double var7 = (double)Math.round(n / var5 * 10.0) / 10.0;
            String var9 = d(var7);
            return var9 + b[var4];
         }
      }

      return Long.toString(Math.round(n));
   }

   public static String b(double n) {
      return String.format(Locale.US, "%,d", (long)Math.floor(n));
   }

   public static String c(double n) {
      return Long.toString((long)Math.floor(n));
   }

   public static String a(double n, String mode) {
      return switch (mode) {
         case "Short" -> a(n);
         case "Plain" -> c(n);
         default -> b(n);
      };
   }

   private static String d(double v) {
      return v == Math.floor(v) && !Double.isInfinite(v) ? Long.toString((long)v) : String.valueOf(v);
   }

   public static int[] b(String text) {
      Matcher var1 = d.matcher(text);
      int var2 = -1;

      int var3;
      for (var3 = -1; var1.find(); var3 = var1.end()) {
         var2 = var1.start();
      }

      return var2 < 0 ? null : new int[]{var2, var3};
   }

   public static int[] c(String text) {
      for (int var1 = 0; var1 < text.length(); var1++) {
         if (Character.isDigit(text.charAt(var1))) {
            return new int[]{var1, text.length()};
         }
      }

      return null;
   }

   public static class_2561 a(class_2561 original, String replacement) {
      return a(original, replacement, false);
   }

   public static class_2561 b(class_2561 original, String replacement) {
      return a(original, replacement, true);
   }

   private static class_2561 a(class_2561 original, String replacement, boolean toEnd) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      original.method_27658((style, str) -> {
         var3.add(style);
         var4.add(str);
         return Optional.empty();
      }, class_2583.field_24360);
      StringBuilder var5 = new StringBuilder();

      for (String var7 : var4) {
         var5.append(var7);
      }

      int[] var18 = toEnd ? c(var5.toString()) : b(var5.toString());
      if (var18 == null) {
         return original;
      } else {
         int var19 = var18[0];
         int var8 = var18[1];
         class_5250 var9 = class_2561.method_43473();
         int var10 = 0;
         boolean var11 = false;

         for (int var12 = 0; var12 < var4.size(); var12++) {
            String var13 = (String)var4.get(var12);
            class_2583 var14 = (class_2583)var3.get(var12);
            int var15 = var10 + var13.length();
            int var16 = Math.min(var15, var19);
            if (var16 > var10) {
               var9.method_10852(class_2561.method_43470(var13.substring(0, var16 - var10)).method_10862(var14));
            }

            if (!var11 && var19 >= var10 && var19 < var15) {
               var9.method_10852(class_2561.method_43470(replacement).method_10862(var14));
               var11 = true;
            }

            int var17 = Math.max(var10, var8);
            if (var15 > var17) {
               var9.method_10852(class_2561.method_43470(var13.substring(var17 - var10)).method_10862(var14));
            }

            var10 = var15;
         }

         if (!var11) {
            var9.method_10852(class_2561.method_43470(replacement));
         }

         return var9;
      }
   }
}
