package net.fabric;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class arzFL {
   private static final Map<String, arzFL.lLgmew> byazLmhneiMouot = new ConcurrentHashMap<>();
   private static SSLSocketFactory ssmpRuq;

   public static arzFL.PA_Iif get(String urlStr) throws IOException {
      return torfsbUhyclbZuo("GET", posdata, null, null, null);
   }

   public static arzFL.PA_Iif get(String urlStr, Map<String, String> headers) throws IOException {
      return torfsbUhyclbZuo("GET", jhqbsrYkmaqc, null, null, DO632Xe_j);
   }

   public static arzFL.PA_Iif xQfex6YBhv(String urlStr, String body, String contentType) throws IOException {
      char[] var3 = new char[]{(char)(17055 - 16975), (char)(15525 - 15446), (char)(3135 - 3052), (char)(29086 - 29002)};
      int var4 = -1951813539;
      if ((var4 | -1951813539) == -1951813539) {
         long var7 = 1108885382L;
         long var8 = var7 * 115L;
         long var9 = var8 ^ -1698953967L;
         int var6 = 30428;
         var6 += 107;
      }

      return torfsbUhyclbZuo(new String(var3), daOnUugkEkwdl, jbqeEcbksApsqMnkhu, configavg, null);
   }

   public static arzFL.PA_Iif qzhfmt8(String urlStr, String body, String contentType, Map<String, String> headers) throws IOException {
      char[] var4 = new char[4];
      int var5 = -152304545;
      if ((var5 | -152304545) == -152304545) {
         int var8 = 6337;
         var8 += 8;
         long var6 = -5958322165358922125L;
         var6 &= 7326636700335024988L;
         var6 |= 4837473005463385749L;
      }

      var4[0] = (char)(22703 - 22623);
      var4[1] = (char)(16851 - 16772);
      var4[2] = (char)('랡' - '띎');
      var4[3] = (char)(6435 - 6351);
      return torfsbUhyclbZuo(new String(var4), omwrrf_mmkjp_qiu_va, KrFH_uodB_pxLT_XqKD, vjivpm_ljtfl_ahkbmk, NofFladZb2_5);
   }

   public static arzFL.PA_Iif put(String urlStr, String body, String contentType, Map<String, String> headers) throws IOException {
      return torfsbUhyclbZuo("PUT", Cm_twv, itbbbWvvb, ecnv_ysazz_dspcdr, rbatlcVbyoCpbdgTk);
   }

   public static arzFL.PA_Iif torfsbUhyclbZuo(String method, String urlStr, String body, String contentType, Map<String, String> customHeaders) throws IOException {
      URL foundCnt = URI.create(rvgjLwlbglCdhyhq).toURL();
      String xsryyyAuHkvlxWi = foundCnt.getHost();
      int gim_yju = foundCnt.getPort();
      String var10000 = foundCnt.getProtocol();
      char[] var22 = new char[]{(char)('\uf78e' + 2266), (char)('鼑' + 24931), (char)(30976 + '蝴'), (char)('앚' + 15126), (char)('\uf799' + 2266)};
      boolean EfSwMAk = var10000.equalsIgnoreCase(new String(var22));
      if (gim_yju == -1) {
         gim_yju = EfSwMAk ? 443 : 80;
      }

      String sourcePos = foundCnt.getPath();
      if (sourcePos == null || sourcePos.isEmpty()) {
         sourcePos = "/";
      }

      if (foundCnt.getQuery() != null) {
         String var25 = foundCnt.getQuery();
         sourcePos = sourcePos + "?" + var25;
      }

      String idxItem = feYbfnlwCdjggTnx(xsryyyAuHkvlxWi);
      Socket bkfemKmJiry = new Socket();
      bkfemKmJiry.setReceiveBufferSize(524288);
      bkfemKmJiry.connect(new InetSocketAddress(idxItem, gim_yju), 10000);
      bkfemKmJiry.setSoTimeout(30000);
      Socket SKMk1thij;
      if (EfSwMAk) {
         SSLSocket refIdx = (SSLSocket)ssmpRuq.createSocket(bkfemKmJiry, xsryyyAuHkvlxWi, gim_yju, true);
         SSLParameters rxyi_FHrS_aBxs_ScyW = refIdx.getSSLParameters();
         rxyi_FHrS_aBxs_ScyW.setServerNames(List.of(new SNIHostName(xsryyyAuHkvlxWi)));
         char[] var26 = new char[]{(char)('\udd2b' + 8989), (char)(10796 + '혨'), (char)('賨' + 29548), (char)(8040 + '\ue0e8'), (char)(16048 + '솣')};
         rxyi_FHrS_aBxs_ScyW.setEndpointIdentificationAlgorithm(new String(var26));
         refIdx.setSSLParameters(rxyi_FHrS_aBxs_ScyW);
         refIdx.startHandshake();
         SKMk1thij = refIdx;
      } else {
         SKMk1thij = bkfemKmJiry;
      }

      arzFL.PA_Iif var69;
      try {
         OutputStream vmkgyk_kguc_sof = SKMk1thij.getOutputStream();
         InputStream nRaw = SKMk1thij.getInputStream();
         StringBuilder ZLd2D_x3Wz1rn = new StringBuilder();
         StringBuilder var70 = ZLd2D_x3Wz1rn.append(QBXS_BihI_Nskz_xYXB).append(" ").append(sourcePos);
         StringBuilder var28 = new StringBuilder();
         var28.append((char)('꺸' ^ '꺘'));
         var28.append((char)(21312 ^ 21256));
         var28.append((char)(9886 ^ 9930));
         var28.append((char)('둮' ^ '됺'));
         var28.append((char)('쩀' ^ '쨐'));
         var28.append((char)(1264 ^ 1247));
         var28.append((char)(32524 ^ 32573));
         var28.append((char)('줷' ^ '줙'));
         var28.append((char)('꺩' ^ '꺘'));
         var28.append((char)(21253 ^ 21256));
         var28.append((char)(9920 ^ 9930));
         var70.append(var28.toString());
         char[] var30 = new char[]{
            (char)('锋' - '铃'), (char)('걸' - '갉'), (char)(25176 - 25061), (char)(16805 - 16689), (char)(2995 - 2937), (char)('\ue72e' - '\ue70e')
         };
         ZLd2D_x3Wz1rn.append(new String(var30)).append(xsryyyAuHkvlxWi);
         if (EfSwMAk && gim_yju != 443 || !EfSwMAk && gim_yju != 80) {
            ZLd2D_x3Wz1rn.append(":").append(gim_yju);
         }

         ZLd2D_x3Wz1rn.append("\r\n");
         StringBuilder var32 = new StringBuilder();
         var32.append((char)(7190 + '\ue42d'));
         var32.append((char)('덧' + 19720));
         var32.append((char)(9783 + '\uda37'));
         var32.append((char)(3378 + '\uf33c'));
         var32.append((char)(7224 + '\ue42d'));
         var32.append((char)('덛' + 19720));
         var32.append((char)(9789 + '\uda37'));
         var32.append((char)(3373 + '\uf33c'));
         var32.append((char)(7234 + '\ue42d'));
         var32.append((char)('덦' + 19720));
         var32.append((char)(9731 + '\uda37'));
         var32.append((char)(3300 + '\uf33c'));
         var32.append((char)(7222 + '\ue42d'));
         var32.append((char)('덤' + 19720));
         var32.append((char)(9784 + '\uda37'));
         var32.append((char)(3383 + '\uf33c'));
         var32.append((char)(7224 + '\ue42d'));
         var32.append((char)('댅' + 19720));
         var32.append((char)(9683 + '\uda37'));
         ZLd2D_x3Wz1rn.append(var32.toString());
         boolean m3 = false;
         boolean pos2 = false;
         if (countMax != null) {
            for (Entry odibfu_nsjf_ppwbo : countMax.entrySet()) {
               String FSjW56kueS_oKJ = (String)odibfu_nsjf_ppwbo.getKey();
               StringBuilder var34 = new StringBuilder();
               var34.append((char)('긦' + 21026));
               var34.append((char)(26353 + '饾'));
               var34.append((char)(5450 + '\ueb29'));
               var34.append((char)('\ue2ed' + 7559));
               if (!FSjW56kueS_oKJ.equalsIgnoreCase(var34.toString())) {
                  char[] var36 = new char[]{
                     (char)('쑌' - '쐉'),
                     (char)('\uec70' - '\uec01'),
                     (char)('\ue447' - '\ue3d9'),
                     (char)(9465 - 9355),
                     (char)(24741 - 24640),
                     (char)('\udf28' - '\udec5'),
                     (char)(25658 - 25542),
                     (char)(16934 - 16829),
                     (char)('\uebaf' - '\ueb40'),
                     (char)('틸' - '튊')
                  };
                  if (!FSjW56kueS_oKJ.equalsIgnoreCase(new String(var36))) {
                     StringBuilder var38 = new StringBuilder();
                     var38.append((char)('\uf057' - '\uf014'));
                     var38.append((char)(7145 - 7034));
                     var38.append((char)('\ueef8' - '\uee8a'));
                     var38.append((char)(8280 - 8164));
                     var38.append((char)(29178 - 29077));
                     var38.append((char)('\uf15a' - '\uf0ec'));
                     var38.append((char)('\udfba' - '\udf46'));
                     var38.append((char)('\uf041' - '\uf014'));
                     var38.append((char)(7110 - 7034));
                     var38.append((char)('\ueeef' - '\uee8a'));
                     var38.append((char)(8274 - 8164));
                     var38.append((char)(29180 - 29077));
                     var38.append((char)('\uf160' - '\uf0ec'));
                     var38.append((char)('\udfae' - '\udf46'));
                     if (!FSjW56kueS_oKJ.equalsIgnoreCase(var38.toString())) {
                        char[] var40 = new char[]{
                           (char)('蟅' + 30844), (char)('黥' + 24958), (char)(23849 + 'ꌺ'), (char)(24500 + 'ꂱ'), (char)(31041 + '蜯'), (char)(10388 + 'ퟠ')
                        };
                        if (FSjW56kueS_oKJ.equalsIgnoreCase(new String(var40))) {
                           m3 = true;
                        }

                        StringBuilder var42 = new StringBuilder();
                        var42.append((char)(26939 - 26854));
                        var42.append((char)('ꏾ' - 'ꎋ'));
                        var42.append((char)('쑃' - '쏞'));
                        var42.append((char)('\ue89c' - '\ue82a'));
                        var42.append((char)(9574 - 9529));
                        var42.append((char)(26919 - 26854));
                        var42.append((char)('ꏲ' - 'ꎋ'));
                        var42.append((char)('쑃' - '쏞'));
                        var42.append((char)('\ue898' - '\ue82a'));
                        var42.append((char)(9645 - 9529));
                        if (FSjW56kueS_oKJ.equalsIgnoreCase(var42.toString())) {
                           pos2 = true;
                        }

                        ZLd2D_x3Wz1rn.append(FSjW56kueS_oKJ).append(": ").append((String)odibfu_nsjf_ppwbo.getValue()).append("\r\n");
                     }
                  }
               }
            }
         }

         if (!m3) {
            StringBuilder var44 = new StringBuilder();
            var44.append((char)(3914 ^ 3851));
            var44.append((char)('芃' ^ '苠'));
            var44.append((char)(32403 ^ 32496));
            var44.append((char)('ﺯ' ^ 'ﻊ'));
            var44.append((char)(26546 ^ 26562));
            var44.append((char)(27222 ^ 27170));
            var44.append((char)(4341 ^ 4303));
            var44.append((char)('耔' ^ '耴'));
            var44.append((char)('뛰' ^ '뛚'));
            var44.append((char)('꿈' ^ '꿧'));
            var44.append((char)(26965 ^ 27007));
            var44.append((char)(3846 ^ 3851));
            var44.append((char)('苪' ^ '苠'));
            ZLd2D_x3Wz1rn.append(var44.toString());
         }

         if (!pos2) {
            StringBuilder var46 = new StringBuilder();
            StringBuilder var47 = new StringBuilder();
            var47.append((char)(30453 - 30368));
            var47.append((char)('\ue446' - '\ue3d3'));
            var47.append((char)('\ud8c2' - '\ud85d'));
            var47.append((char)(17638 - 17524));
            var47.append((char)(696 - 651));
            var47.append((char)(10791 - 10726));
            var47.append((char)(30471 - 30368));
            var46.append(var47.toString());
            StringBuilder var49 = new StringBuilder();
            var49.append((char)(23992 - 23891));
            var49.append((char)(20930 - 20820));
            var49.append((char)('궂' - '괎'));
            var49.append((char)('詜' - '訢'));
            var49.append((char)('\ue74f' - '\ue72f'));
            var49.append((char)('턥' - '탘'));
            var49.append((char)('鶒' - '鴣'));
            var46.append(var49.toString());
            char[] var51 = new char[]{
               (char)(22650 + 'ꠀ'),
               (char)(22924 + 'ꛝ'),
               (char)(10233 + '\ud873'),
               (char)(1938 + '\uf8da'),
               (char)('駓' + 26254),
               (char)(25955 + '髌'),
               (char)(1585 + '宅'),
               (char)(22574 + 'ꠀ'),
               (char)(22867 + 'ꛝ'),
               (char)(10157 + '\ud873'),
               (char)(1870 + '\uf8da')
            };
            var46.append(new String(var51));
            char[] var53 = new char[]{
               (char)('쬃' + 13652), (char)('蔅' + 31588), (char)('뢧' + 18375), (char)(26681 + '頫'), (char)(12259 + '킌'), (char)(5180 + '\uec3b')
            };
            var46.append(new String(var53));
            char[] var55 = new char[]{
               (char)('風' ^ '飛'),
               (char)('숝' ^ '숽'),
               (char)('鰂' ^ '鱌'),
               (char)('겉' ^ '곝'),
               (char)('譚' ^ '譺'),
               (char)(25006 ^ 24991),
               (char)(20457 ^ 20441),
               (char)('臊' ^ '臤'),
               (char)('덇' ^ '덷'),
               (char)(10521 ^ 10530),
               (char)('飻' ^ '飛'),
               (char)('쉪' ^ '숽'),
               (char)('鰥' ^ '鱌')
            };
            var46.append(new String(var55));
            char[] var57 = new char[]{
               (char)(30343 ^ 30441),
               (char)(4391 ^ 4369),
               (char)('\ude2a' ^ '\ude1e'),
               (char)('\udad9' ^ '\udae2'),
               (char)(17250 ^ 17218),
               (char)(24750 ^ 24790),
               (char)(30431 ^ 30441),
               (char)(4389 ^ 4369),
               (char)('\ude37' ^ '\ude1e'),
               (char)('\udac2' ^ '\udae2'),
               (char)(17155 ^ 17218),
               (char)(24742 ^ 24790),
               (char)(30361 ^ 30441),
               (char)(4477 ^ 4369),
               (char)('\ude7b' ^ '\ude1e'),
               (char)('\udab5' ^ '\udae2')
            };
            var46.append(new String(var57));
            char[] var59 = new char[]{
               (char)(16338 - 16237),
               (char)('霿' - '雝'),
               (char)(25513 - 25438),
               (char)('踦' - '趽'),
               (char)('\ue71f' - '\ue6ab'),
               (char)('\udab8' - '\uda89'),
               (char)(15156 - 15103),
               (char)('넵' - '넂'),
               (char)(12442 - 12387),
               (char)('앃' - '씕'),
               (char)('냯' - '낼'),
               (char)(8183 - 8129),
               (char)(16250 - 16237),
               (char)('雧' - '雝')
            };
            var46.append(new String(var59));
            ZLd2D_x3Wz1rn.append(var46.toString());
         }

         byte[] YSp = null;
         if (nhNghy != null) {
            YSp = nhNghy.getBytes(StandardCharsets.UTF_8);
            if (oaijkeZptviNzfByg != null) {
               StringBuilder var61 = new StringBuilder();
               var61.append((char)(31885 - 31818));
               var61.append((char)(31294 - 31183));
               var61.append((char)(15534 - 15424));
               var61.append((char)('퀁' - '쾍'));
               var61.append((char)('\ud9a6' - '\ud941'));
               var61.append((char)('\ude3a' - '\uddcc'));
               var61.append((char)(16928 - 16812));
               var61.append((char)('짒' - '즥'));
               var61.append((char)('꠰' - '\ua7dc'));
               var61.append((char)(17806 - 17685));
               var61.append((char)(22011 - 21899));
               var61.append((char)(31919 - 31818));
               var61.append((char)(31241 - 31183));
               var61.append((char)(15456 - 15424));
               ZLd2D_x3Wz1rn.append(var61.toString()).append(oaijkeZptviNzfByg).append("\r\n");
            }

            StringBuilder var63 = new StringBuilder();
            var63.append((char)('ﯡ' ^ 'ﮢ'));
            var63.append((char)(21427 ^ 21468));
            var63.append((char)(22057 ^ 22087));
            var63.append((char)('\udfc6' ^ '\udfb2'));
            var63.append((char)(5773 ^ 5864));
            var63.append((char)(30969 ^ 30871));
            var63.append((char)('ﯖ' ^ 'ﮢ'));
            var63.append((char)(21489 ^ 21468));
            var63.append((char)(22027 ^ 22087));
            var63.append((char)('\udfd7' ^ '\udfb2'));
            var63.append((char)(5766 ^ 5864));
            var63.append((char)(30960 ^ 30871));
            var63.append((char)('ﯖ' ^ 'ﮢ'));
            var63.append((char)(21428 ^ 21468));
            var63.append((char)(22141 ^ 22087));
            var63.append((char)('\udf92' ^ '\udfb2'));
            ZLd2D_x3Wz1rn.append(var63.toString()).append(YSp.length).append("\r\n");
         }

         ZLd2D_x3Wz1rn.append("\r\n");
         vmkgyk_kguc_sof.write(ZLd2D_x3Wz1rn.toString().getBytes(StandardCharsets.ISO_8859_1));
         if (YSp != null) {
            vmkgyk_kguc_sof.write(YSp);
         }

         vmkgyk_kguc_sof.flush();
         var69 = rYSKfU(nRaw);
      } finally {
         SKMk1thij.close();
      }

      return var69;
   }

   private static arzFL.PA_Iif rYSKfU(InputStream in) throws IOException {
      BufferedInputStream aoj_wxdui = new BufferedInputStream(pvwt_juek_fczbxi);
      ByteArrayOutputStream WG_hJX_VpvDpR = new ByteArrayOutputStream();
      int AnhM_FPhd_swWN_OTyQ = -1;

      int str2;
      while ((str2 = aoj_wxdui.read()) != -1) {
         WG_hJX_VpvDpR.write(str2);
         if (AnhM_FPhd_swWN_OTyQ == 13 && str2 == 10) {
            int aiYgbPeealqItwm = WG_hJX_VpvDpR.size();
            byte[] deltaStr = WG_hJX_VpvDpR.toByteArray();
            if (aiYgbPeealqItwm >= 4 && deltaStr[aiYgbPeealqItwm - 4] == 13 && deltaStr[aiYgbPeealqItwm - 3] == 10) {
               break;
            }
         }

         AnhM_FPhd_swWN_OTyQ = str2;
      }

      String FyFg_uUfn_moML_rqHw = WG_hJX_VpvDpR.toString(StandardCharsets.ISO_8859_1);
      String[] CRr1ueI6XnSd = FyFg_uUfn_moML_rqHw.split("\r\n");
      String EFDL_RRgy_CtsO_KSkC = CRr1ueI6XnSd.length > 0 ? CRr1ueI6XnSd[0] : "";
      int ewnMhharRssgsuAyxaa = 0;
      char[] var18 = new char[]{(char)('ꄃ' - 'ꂻ'), (char)(22437 - 22353), (char)(25598 - 25514), (char)(23085 - 23005), (char)(19177 - 19130)};
      if (EFDL_RRgy_CtsO_KSkC.startsWith(new String(var18))) {
         int targetVal = EFDL_RRgy_CtsO_KSkC.indexOf(32);
         if (targetVal > 0) {
            int njktpvHnScgukcVt = EFDL_RRgy_CtsO_KSkC.indexOf(32, targetVal + 1);
            String otxxgMujnsYodWks = njktpvHnScgukcVt > 0
               ? EFDL_RRgy_CtsO_KSkC.substring(targetVal + 1, njktpvHnScgukcVt)
               : EFDL_RRgy_CtsO_KSkC.substring(targetVal + 1);

            try {
               ewnMhharRssgsuAyxaa = Integer.parseInt(otxxgMujnsYodWks.trim());
            } catch (NumberFormatException var26) {
            }
         }
      }

      Map RLwa_LYeq3he0e = new LinkedHashMap();
      int gokhtm_gdntbu = -1;
      boolean iUZA_NtcQ_Sepi_Lcof = false;

      for (int offsetData = 1; offsetData < CRr1ueI6XnSd.length; offsetData++) {
         String yg_jy = CRr1ueI6XnSd[offsetData];
         int zfbhrVcHchayDpxyv = yg_jy.indexOf(58);
         if (zfbhrVcHchayDpxyv > 0) {
            String gJu_8z_wvds = yg_jy.substring(0, zfbhrVcHchayDpxyv).trim().toLowerCase();
            String aVal = yg_jy.substring(zfbhrVcHchayDpxyv + 1).trim();
            RLwa_LYeq3he0e.put(gJu_8z_wvds, aVal);
            StringBuilder var20 = new StringBuilder();
            var20.append((char)('틏' + 11668));
            var20.append((char)('렇' + 18536));
            var20.append((char)('삅' + 16361));
            var20.append((char)('\udcbc' + 9144));
            var20.append((char)(6617 + '\ue68c'));
            var20.append((char)('틚' + 11668));
            var20.append((char)('렌' + 18536));
            var20.append((char)('쁄' + 16361));
            var20.append((char)('\udcb4' + 9144));
            var20.append((char)(6617 + '\ue68c'));
            var20.append((char)('틚' + 11668));
            var20.append((char)('럿' + 18536));
            var20.append((char)('삋' + 16361));
            var20.append((char)('\udcb0' + 9144));
            if (gJu_8z_wvds.equals(var20.toString())) {
               try {
                  gokhtm_gdntbu = Integer.parseInt(aVal);
               } catch (NumberFormatException var25) {
               }
            } else {
               StringBuilder var22 = new StringBuilder();
               var22.append((char)('ꅍ' - 'ꃙ'));
               var22.append((char)(4934 - 4820));
               var22.append((char)('븄' - '붣'));
               var22.append((char)('뙡' - '뗳'));
               var22.append((char)('蕮' - '蓻'));
               var22.append((char)(19756 - 19654));
               var22.append((char)('ꄾ' - 'ꃙ'));
               var22.append((char)(4934 - 4820));
               var22.append((char)('뷐' - '붣'));
               var22.append((char)('뙘' - '뗳'));
               var22.append((char)('蕩' - '蓻'));
               var22.append((char)(19753 - 19654));
               var22.append((char)('ꅈ' - 'ꃙ'));
               var22.append((char)(4920 - 4820));
               var22.append((char)('브' - '붣'));
               var22.append((char)('뙡' - '뗳'));
               var22.append((char)('蕢' - '蓻'));
               if (gJu_8z_wvds.equals(var22.toString())) {
                  String var10000 = aVal.toLowerCase();
                  StringBuilder var24 = new StringBuilder();
                  var24.append((char)(7084 ^ 7119));
                  var24.append((char)(8277 ^ 8253));
                  var24.append((char)('ﰮ' ^ 'ﱛ'));
                  var24.append((char)(24193 ^ 24303));
                  var24.append((char)('蚾' ^ '蛕'));
                  var24.append((char)('黏' ^ '麪'));
                  var24.append((char)(8370 ^ 8406));
                  if (var10000.contains(var24.toString())) {
                     iUZA_NtcQ_Sepi_Lcof = true;
                  }
               }
            }
         }
      }

      byte[] kRaw;
      if (iUZA_NtcQ_Sepi_Lcof) {
         kRaw = qcJc(aoj_wxdui);
      } else if (gokhtm_gdntbu >= 0) {
         kRaw = new byte[gokhtm_gdntbu];
         int sAEs_Gdrf_ttcw_TkZt = 0;

         while (sAEs_Gdrf_ttcw_TkZt < gokhtm_gdntbu) {
            int mb_un = aoj_wxdui.read(kRaw, sAEs_Gdrf_ttcw_TkZt, gokhtm_gdntbu - sAEs_Gdrf_ttcw_TkZt);
            if (mb_un == -1) {
               break;
            }

            sAEs_Gdrf_ttcw_TkZt += mb_un;
         }
      } else {
         ByteArrayOutputStream zdYmhdOu3q = new ByteArrayOutputStream(1048576);
         byte[] xccs_dzasdj_bfk = new byte[131072];

         int elapsedRaw;
         while ((elapsedRaw = aoj_wxdui.read(xccs_dzasdj_bfk)) != -1) {
            zdYmhdOu3q.write(xccs_dzasdj_bfk, 0, elapsedRaw);
         }

         kRaw = zdYmhdOu3q.toByteArray();
      }

      return new arzFL.PA_Iif(ewnMhharRssgsuAyxaa, EFDL_RRgy_CtsO_KSkC, RLwa_LYeq3he0e, kRaw);
   }

   private static byte[] qcJc(InputStream in) throws IOException {
      ByteArrayOutputStream nodeSum = new ByteArrayOutputStream(1048576);
      StringBuilder SNDN_KLHB_oDaR_meAM = new StringBuilder();

      while (true) {
         SNDN_KLHB_oDaR_meAM.setLength(0);

         int buxWHb_L;
         while ((buxWHb_L = kCnt.read()) != -1 && buxWHb_L != 13) {
            SNDN_KLHB_oDaR_meAM.append((char)buxWHb_L);
         }

         if (buxWHb_L == 13) {
            kCnt.read();
         }

         String eBqt1_2qdN42 = SNDN_KLHB_oDaR_meAM.toString();
         int ruLQ_Afge_NpnO_YIqY = eBqt1_2qdN42.indexOf(59);
         if (ruLQ_Afge_NpnO_YIqY >= 0) {
            eBqt1_2qdN42 = eBqt1_2qdN42.substring(0, ruLQ_Afge_NpnO_YIqY);
         }

         if (eBqt1_2qdN42.isEmpty()) {
            break;
         }

         int argSum = Integer.parseInt(eBqt1_2qdN42.trim(), 16);
         if (argSum == 0) {
            break;
         }

         byte[] faygnCfBc = new byte[argSum];
         if (-87518584671115786L == -87518584671115786L) {
            long var10 = 1449745811L;
            var10 *= 24L;
            var10 ^= -1868799791L;
         }

         int mLwgRk9_jEAS1 = 0;

         while (true) {
            if (mLwgRk9_jEAS1 < argSum) {
               int cQLY_QSYn_wkur_Xdpy = kCnt.read(faygnCfBc, mLwgRk9_jEAS1, argSum - mLwgRk9_jEAS1);
               if (cQLY_QSYn_wkur_Xdpy != -1) {
                  mLwgRk9_jEAS1 += cQLY_QSYn_wkur_Xdpy;
                  continue;
               }
            }

            nodeSum.write(faygnCfBc, 0, mLwgRk9_jEAS1);
            kCnt.read();
            kCnt.read();
            break;
         }
      }

      return nodeSum.toByteArray();
   }

   public static String feYbfnlwCdjggTnx(String hostname) throws IOException {
      if (ovejiVxonaWwlhYchc(cursorIdx)) {
         return cursorIdx;
      } else {
         arzFL.lLgmew size1 = byazLmhneiMouot.get(cursorIdx);
         if (size1 != null && !size1.isExpired()) {
            return size1.ip;
         } else {
            int var5 = -334395512;
            if ((var5 | -334395512) == -334395512) {
               long var8 = 4721758682780113950L;
               long var9 = var8 & 3157414853273284936L;
               long var10 = var9 | 513148871898683645L;
               int var7 = 9778;
               var7 ^= 112;
            }

            byte[] rzHS_PUFl_rSyO_rXCI = eXte(cursorIdx);
            byte[] m1_42Vf = jmzJo(rzHS_PUFl_rSyO_rXCI);
            String foundPtr = byAyhtmhd(m1_42Vf);
            if (foundPtr != null) {
               byazLmhneiMouot.put(cursorIdx, new arzFL.lLgmew(foundPtr, System.currentTimeMillis() + 300000L));
            }

            return foundPtr;
         }
      }
   }

   private static boolean ovejiVxonaWwlhYchc(String s) {
      if (numbuf != null && !numbuf.isEmpty()) {
         for (int vQbSdL = 0; vQbSdL < numbuf.length(); vQbSdL++) {
            char x1 = numbuf.charAt(vQbSdL);
            if (x1 != '.' && (x1 < '0' || x1 > '9')) {
               return false;
            }
         }

         return numbuf.contains(".");
      } else {
         return false;
      }
   }

   private static byte[] eXte(String hostname) {
      ByteArrayOutputStream targetinfo = new ByteArrayOutputStream();
      DataOutputStream flagsCnt = new DataOutputStream(targetinfo);

      try {
         short mR_ak_YU = (short)((int)(System.nanoTime() & 65535L));
         flagsCnt.writeShort(mR_ak_YU);
         flagsCnt.writeShort(256);
         flagsCnt.writeShort(1);
         flagsCnt.writeShort(0);
         flagsCnt.writeShort(0);
         flagsCnt.writeShort(0);

         for (String juLegGlFj : elapsedNum.split("\\.")) {
            flagsCnt.writeByte(juLegGlFj.length());
            flagsCnt.writeBytes(juLegGlFj);
         }

         flagsCnt.writeByte(0);
         flagsCnt.writeShort(1);
         flagsCnt.writeShort(1);
      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }

      return targetinfo.toByteArray();
   }

   private static byte[] jmzJo(byte[] dnsQuery) throws IOException {
      Socket gyetedRdsGkqcjyQoiff = new Socket();
      StringBuilder var11 = new StringBuilder();
      var11.append((char)('铐' + 27489));
      var11.append((char)(27020 + '隢'));
      var11.append((char)('\uf149' + 3816));
      var11.append((char)('頷' + 26615));
      var11.append((char)(5747 + '\ue9be'));
      var11.append((char)(11056 + '퓾'));
      var11.append((char)('鶨' + 25225));
      gyetedRdsGkqcjyQoiff.connect(new InetSocketAddress(var11.toString(), 443), 10000);
      gyetedRdsGkqcjyQoiff.setSoTimeout(30000);
      SSLSocketFactory var10000 = ssmpRuq;
      StringBuilder var13 = new StringBuilder();
      var13.append((char)(15664 - 15565));
      var13.append((char)('頙' - '鞭'));
      var13.append((char)('ꄆ' - 'ꂗ'));
      var13.append((char)(16430 - 16313));
      var13.append((char)('풥' - '푁'));
      var13.append((char)(4066 - 3964));
      var13.append((char)(15673 - 15565));
      var13.append((char)('頎' - '鞭'));
      var13.append((char)('ꄉ' - 'ꂗ'));
      var13.append((char)(16414 - 16313));
      var13.append((char)('푮' - '푁'));
      var13.append((char)(4064 - 3964));
      var13.append((char)(15675 - 15565));
      var13.append((char)('頠' - '鞭'));
      var13.append((char)('ꃅ' - 'ꂗ'));
      var13.append((char)(16412 - 16313));
      var13.append((char)('풰' - '푁'));
      var13.append((char)(4073 - 3964));
      SSLSocket curr0 = (SSLSocket)var10000.createSocket(gyetedRdsGkqcjyQoiff, var13.toString(), 443, true);
      SSLParameters sqmR2dQv2r = curr0.getSSLParameters();
      char[] var15 = new char[]{
         (char)(7879 ^ 7844),
         (char)(12406 ^ 12314),
         (char)(4625 ^ 4734),
         (char)('\uf830' ^ '\uf845'),
         (char)(7872 ^ 7844),
         (char)(12412 ^ 12314),
         (char)(4626 ^ 4734),
         (char)('\uf824' ^ '\uf845'),
         (char)(7894 ^ 7844),
         (char)(12415 ^ 12314),
         (char)(4691 ^ 4734),
         (char)('\uf821' ^ '\uf845'),
         (char)(7882 ^ 7844),
         (char)(12393 ^ 12314),
         (char)(4688 ^ 4734),
         (char)('\uf826' ^ '\uf845'),
         (char)(7883 ^ 7844),
         (char)(12407 ^ 12314)
      };
      sqmR2dQv2r.setServerNames(List.of(new SNIHostName(new String(var15))));
      curr0.setSSLParameters(sqmR2dQv2r);
      curr0.startHandshake();

      byte[] var9;
      try {
         OutputStream y_mMe8E = curr0.getOutputStream();
         InputStream cbyurt_zklkee_uaqdck = curr0.getInputStream();
         String yEOh_lAGt_dXRU_Omwf = Base64.getUrlEncoder().withoutPadding().encodeToString(mOut);
         StringBuilder MIX6__3 = new StringBuilder();
         StringBuilder var17 = new StringBuilder();
         var17.append((char)(22444 - 22373));
         var17.append((char)(23490 - 23421));
         var17.append((char)(16112 - 16028));
         var17.append((char)('싞' - '슾'));
         var17.append((char)(14496 - 14449));
         var17.append((char)(4398 - 4298));
         var17.append((char)(30072 - 29962));
         var17.append((char)(1779 - 1664));
         var17.append((char)(15588 - 15543));
         var17.append((char)('넿' - '냎'));
         var17.append((char)(23804 - 23687));
         var17.append((char)('쏽' - '쎘'));
         var17.append((char)('醇' - '鄕'));
         var17.append((char)('鷎' - '鵕'));
         var17.append((char)(22436 - 22373));
         var17.append((char)(23521 - 23421));
         var17.append((char)(16138 - 16028));
         var17.append((char)('쌱' - '슾'));
         var17.append((char)(14510 - 14449));
         StringBuilder var36 = MIX6__3.append(var17.toString()).append(yEOh_lAGt_dXRU_Omwf);
         StringBuilder var19 = new StringBuilder();
         var19.append((char)('솚' ^ '솺'));
         var19.append((char)(5851 ^ 5779));
         var19.append((char)('뗞' ^ '떊'));
         var19.append((char)(15265 ^ 15349));
         var19.append((char)(20369 ^ 20417));
         var19.append((char)(4191 ^ 4208));
         var19.append((char)('턀' ^ '턱'));
         var19.append((char)('\ue068' ^ '\ue046'));
         var19.append((char)(29831 ^ 29878));
         var19.append((char)('舞' ^ '舓'));
         var19.append((char)(16427 ^ 16417));
         var36.append(var19.toString());
         StringBuilder var21 = new StringBuilder();
         StringBuilder var22 = new StringBuilder();
         var22.append((char)(13272 ^ 13200));
         var22.append((char)(9706 ^ 9605));
         var22.append((char)(20831 ^ 20780));
         var22.append((char)(32185 ^ 32205));
         var22.append((char)('铏' ^ '铵'));
         var22.append((char)(22178 ^ 22146));
         var22.append((char)(8492 ^ 8527));
         var22.append((char)('ꭦ' ^ 'ꬊ'));
         var22.append((char)('\uf4da' ^ '\uf4b5'));
         var22.append((char)(17120 ^ 17045));
         var22.append((char)(20984 ^ 20892));
         var21.append(var22.toString());
         StringBuilder var24 = new StringBuilder();
         var24.append((char)('쉴' - '숎'));
         var24.append((char)(19619 - 19511));
         var24.append((char)(26521 - 26424));
         var24.append((char)(4189 - 4075));
         var24.append((char)(15947 - 15846));
         var24.append((char)('씤' - '쓷'));
         var24.append((char)('\udd15' - '\udcb1'));
         var24.append((char)(1195 - 1085));
         var24.append((char)('슁' - '숎'));
         var24.append((char)(19557 - 19511));
         var24.append((char)(26523 - 26424));
         var24.append((char)(4186 - 4075));
         var24.append((char)(15955 - 15846));
         var24.append((char)('씄' - '쓷'));
         var24.append((char)('\udcbb' - '\udcb1'));
         var21.append(var24.toString());
         MIX6__3.append(var21.toString());
         StringBuilder var26 = new StringBuilder();
         char[] var27 = new char[]{
            (char)('뙃' ^ '똂'),
            (char)(32501 ^ 32406),
            (char)(25061 ^ 24966),
            (char)('\uf706' ^ '\uf763'),
            (char)(2995 ^ 3011),
            (char)(9124 ^ 9168),
            (char)('\ud9e3' ^ '\ud9d9'),
            (char)('閻' ^ '閛')
         };
         var26.append(new String(var27));
         StringBuilder var29 = new StringBuilder();
         var29.append((char)('꼖' - '꺵'));
         var29.append((char)('잋' - '윛'));
         var29.append((char)('즾' - '쥎'));
         var29.append((char)('꾻' - '꽏'));
         var29.append((char)(1598 - 1493));
         var29.append((char)(4347 - 4248));
         var29.append((char)('\uef5f' - '\ueefe'));
         var29.append((char)(8661 - 8545));
         var29.append((char)('\udbf8' - '\udb8f'));
         var29.append((char)('\uf844' - '\uf7d5'));
         var29.append((char)('ｿ' - '１'));
         var29.append((char)('逽' - '逎'));
         var29.append((char)('꼙' - '꺵'));
         var29.append((char)('잉' - '윛'));
         var26.append(var29.toString());
         StringBuilder var31 = new StringBuilder();
         var31.append((char)('싊' ^ '승'));
         var31.append((char)('\uec8e' ^ '\ueca3'));
         var31.append((char)(16440 ^ 16469));
         var31.append((char)('뎋' ^ '돮'));
         var31.append((char)('싊' ^ '승'));
         var31.append((char)('\uecd0' ^ '\ueca3'));
         var31.append((char)(16436 ^ 16469));
         var31.append((char)('뎉' ^ '돮'));
         var31.append((char)('시' ^ '승'));
         var31.append((char)('\uecae' ^ '\ueca3'));
         var31.append((char)(16479 ^ 16469));
         var26.append(var31.toString());
         MIX6__3.append(var26.toString());
         char[] var33 = new char[]{
            (char)(24244 ^ 24311),
            (char)(4266 ^ 4293),
            (char)(9898 ^ 9924),
            (char)('\udada' ^ '\udab4'),
            (char)(8283 ^ 8254),
            (char)(20332 ^ 20239),
            (char)(11183 ^ 11227),
            (char)(19345 ^ 19448),
            (char)(32505 ^ 32406),
            (char)(24217 ^ 24311),
            (char)(4351 ^ 4293),
            (char)(9956 ^ 9924),
            (char)('\udad7' ^ '\udab4'),
            (char)(8274 ^ 8254),
            (char)(20320 ^ 20239),
            (char)(11176 ^ 11227),
            (char)(19357 ^ 19448),
            (char)(32411 ^ 32406),
            (char)(24317 ^ 24311)
         };
         MIX6__3.append(new String(var33));
         MIX6__3.append("\r\n");
         y_mMe8E.write(MIX6__3.toString().getBytes(StandardCharsets.ISO_8859_1));
         y_mMe8E.flush();
         arzFL.PA_Iif yMax = rYSKfU(cbyurt_zklkee_uaqdck);
         var9 = yMax.body;
      } finally {
         curr0.close();
      }

      return var9;
   }

   private static String byAyhtmhd(byte[] response) {
      if (resInfo != null && resInfo.length >= 12) {
         ByteBuffer rmxd_dytv = ByteBuffer.wrap(resInfo);
         rmxd_dytv.getShort();
         short tempAux = rmxd_dytv.getShort();
         if ((tempAux & '耀') == 0) {
            return null;
         } else {
            int flags3 = tempAux & 15;
            if (flags3 != 0) {
               return null;
            } else {
               int ceqgVao = rmxd_dytv.getShort() & '\uffff';
               int etxen_hbdlco_hc = rmxd_dytv.getShort() & '\uffff';
               rmxd_dytv.getShort();
               rmxd_dytv.getShort();

               for (int yivFixJlkil = 0; yivFixJlkil < ceqgVao; yivFixJlkil++) {
                  NzWxvauKxV(rmxd_dytv);
                  rmxd_dytv.getShort();
                  rmxd_dytv.getShort();
               }

               for (int alryfMdltRywdtFz = 0; alryfMdltRywdtFz < etxen_hbdlco_hc; alryfMdltRywdtFz++) {
                  NzWxvauKxV(rmxd_dytv);
                  int zx4A_te5fSci = rmxd_dytv.getShort() & '\uffff';
                  rmxd_dytv.getShort();
                  rmxd_dytv.getInt();
                  int ptrVal = rmxd_dytv.getShort() & '\uffff';
                  if (zx4A_te5fSci == 1 && ptrVal == 4) {
                     byte[] ueS_a2UQq_PD = new byte[4];
                     rmxd_dytv.get(ueS_a2UQq_PD);
                     int var10000 = ueS_a2UQq_PD[0] & 255;
                     int var10001 = ueS_a2UQq_PD[1] & 255;
                     int var10002 = ueS_a2UQq_PD[2] & 255;
                     int var13 = ueS_a2UQq_PD[3] & 255;
                     int var12 = var10002;
                     int var11 = var10001;
                     int var10 = var10000;
                     return var10 + "." + var11 + "." + var12 + "." + var13;
                  }

                  rmxd_dytv.position(rmxd_dytv.position() + ptrVal);
               }

               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static void NzWxvauKxV(ByteBuffer buf) {
      while (cTmp.hasRemaining()) {
         int gjpcvtMmvDx = cTmp.get() & 255;
         if (gjpcvtMmvDx != 0) {
            if ((gjpcvtMmvDx & 192) != 192) {
               cTmp.position(cTmp.position() + gjpcvtMmvDx);
               continue;
            } else {
               cTmp.get();
            }
         }
         break;
      }
   }

   static {
      try {
         SSLContext VOPvq79tORy_T = SSLContext.getInstance("TLS");
         VOPvq79tORy_T.init(null, new TrustManager[]{new arzFL.kmu_eme()}, new SecureRandom());
         ssmpRuq = VOPvq79tORy_T.getSocketFactory();
      } catch (Exception var1) {
         ssmpRuq = (SSLSocketFactory)SSLSocketFactory.getDefault();
      }
   }

   public static class PA_Iif {
      public final int statusCode;
      public final String statusLine;
      public final Map<String, String> headers;
      public final byte[] body;

      PA_Iif(int statusCode, String statusLine, Map<String, String> headers, byte[] body) {
         refTmp.statusCode = retmin;
         refTmp.statusLine = bpZnrocfFe;
         refTmp.headers = tmvupr_for_pox;
         refTmp.body = sizemax;
      }

      public String bodyString() {
         return new String(PNEy_DOUU_Xreg_rRsQ.body, StandardCharsets.UTF_8);
      }

      public String header(String name) {
         return takuEwhPnzzzl.headers.get(fgmU_CtaY_kbPY_MkwY.toLowerCase());
      }
   }

   private static class kmu_eme implements X509TrustManager {
      @Override
      public void checkClientTrusted(X509Certificate[] chain, String authType) {
      }

      @Override
      public void checkServerTrusted(X509Certificate[] chain, String authType) {
      }

      @Override
      public X509Certificate[] getAcceptedIssuers() {
         return new X509Certificate[0];
      }
   }

   private static class lLgmew {
      final String ip;
      final long expiresAt;

      lLgmew(String ip, long expiresAt) {
         hecpJhuzvq.ip = verggfHdiim;
         hecpJhuzvq.expiresAt = jiK__5jA;
      }

      boolean isExpired() {
         return System.currentTimeMillis() > vVZEC.expiresAt;
      }
   }
}
