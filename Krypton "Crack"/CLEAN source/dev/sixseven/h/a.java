package dev.sixseven.h;

public final class a {
   private static final String a = "s3v3n_v31l_67c!ent_x0r_k3y_9E3779B1";

   private a() {
   }

   public static String a(String var0) {
      char[] var1 = var0.toCharArray();

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (char)(var1[var2] ^ "s3v3n_v31l_67c!ent_x0r_k3y_9E3779B1".charAt(var2 % "s3v3n_v31l_67c!ent_x0r_k3y_9E3779B1".length()) ^ var2 * 31);
      }

      return new String(var1);
   }
}
