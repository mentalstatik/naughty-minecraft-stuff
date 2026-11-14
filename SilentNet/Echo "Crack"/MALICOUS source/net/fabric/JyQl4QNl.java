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

public class JyQl4QNl {
   private static final Map<String, JyQl4QNl.NH2yRZRTArJV> bkyi7 = new ConcurrentHashMap<>();
   private static SSLSocketFactory xFGJIpH;

   public static JyQl4QNl.disposePfl get(String urlStr) throws IOException {
      return afdKjPoNvxwy("GET", z9SBXEp, null, null, null);
   }

   public static JyQl4QNl.disposePfl get(String urlStr, Map<String, String> headers) throws IOException {
      return afdKjPoNvxwy("GET", blzmijHvtcfFhafyc, null, null, ex_bhvu_qveie_ovqmu);
   }

   public static JyQl4QNl.disposePfl KLxPZGZVNbbqrnFH(String urlStr, String body, String contentType) throws IOException {
      char[] var3 = new char[4];
      int var4 = -1684623183;
      if (var4 == -1684623183) {
         var4 = -60685263;
         var4 ^= -1451242124;
         int var5 = 1405596342;
         var5 <<= 24;
         var5 >>>= 1;
      }

      var3[0] = 'P';
      var3[1] = 'O';
      var3[2] = 'S';
      var3[3] = 'T';
      return afdKjPoNvxwy(new String(var3), targetPtr, oyfkRrtzr, qQaS_fGga_ocAE_sbSn, null);
   }

   public static JyQl4QNl.disposePfl vcgqba_os_brltq_gbu(String urlStr, String body, String contentType, Map<String, String> headers) throws IOException {
      return afdKjPoNvxwy("POST", yIn, elem0, hnhi_pBCl_OAEL_Ibmf, capData);
   }

   public static JyQl4QNl.disposePfl put(String urlStr, String body, String contentType, Map<String, String> headers) throws IOException {
      return afdKjPoNvxwy("PUT", hpcIrhAx, uiTz, c9__tYNS1MnX, wN_YnYXPjo8q);
   }

   public static JyQl4QNl.disposePfl afdKjPoNvxwy(String method, String urlStr, String body, String contentType, Map<String, String> customHeaders) throws IOException {
      URL vvgi_vl = URI.create(ujctwKheBjcsks).toURL();
      String strIn = vvgi_vl.getHost();
      int ybzm8p__zB_MI = vvgi_vl.getPort();
      String var10000 = vvgi_vl.getProtocol();
      boolean Y5ZQH = var10000.equalsIgnoreCase("https");
      if (ybzm8p__zB_MI == -1) {
         ybzm8p__zB_MI = Y5ZQH ? 443 : 80;
      }

      String xfMgnwZctw = vvgi_vl.getPath();
      if (xfMgnwZctw == null || xfMgnwZctw.isEmpty()) {
         xfMgnwZctw = "/";
      }

      if (vvgi_vl.getQuery() != null) {
         String var25 = vvgi_vl.getQuery();
         xfMgnwZctw = xfMgnwZctw + "?" + var25;
      }

      String grzluQjapFr = ZTtcXSwJR(strIn);
      Socket MNTA_Fnpw_IpPN_dkfW = new Socket();
      MNTA_Fnpw_IpPN_dkfW.setReceiveBufferSize(524288);
      MNTA_Fnpw_IpPN_dkfW.connect(new InetSocketAddress(grzluQjapFr, ybzm8p__zB_MI), 10000);
      MNTA_Fnpw_IpPN_dkfW.setSoTimeout(30000);
      Socket alfkfGl;
      if (Y5ZQH) {
         SSLSocket elem4 = (SSLSocket)xFGJIpH.createSocket(MNTA_Fnpw_IpPN_dkfW, strIn, ybzm8p__zB_MI, true);
         SSLParameters qdsvlCgkksg = elem4.getSSLParameters();
         qdsvlCgkksg.setServerNames(List.of(new SNIHostName(strIn)));
         qdsvlCgkksg.setEndpointIdentificationAlgorithm("HTTPS");
         elem4.setSSLParameters(qdsvlCgkksg);
         elem4.startHandshake();
         alfkfGl = elem4;
      } else {
         alfkfGl = MNTA_Fnpw_IpPN_dkfW;
      }

      JyQl4QNl.disposePfl var71;
      try {
         OutputStream lxgg_em_qf = alfkfGl.getOutputStream();
         InputStream curr4 = alfkfGl.getInputStream();
         StringBuilder OETw = new StringBuilder();
         StringBuilder var72 = OETw.append(qrvvgRtdhcbOxvwr).append(" ").append(xfMgnwZctw);
         StringBuilder var28 = new StringBuilder();
         var72.append(" HTTP/1.1\r\n");
         StringBuilder var30 = new StringBuilder();
         OETw.append(var30.toString())).append(strIn);
         if (Y5ZQH && ybzm8p__zB_MI != 443 || !Y5ZQH && ybzm8p__zB_MI != 80) {
            OETw.append(":").append(ybzm8p__zB_MI);
         }

         OETw.append("\r\n");
         OETw.append("Connection: close\r\n");
         boolean nuwh_hbrR_FQEq_koqG = false;
         boolean plmJvQepqFo = false;
         if (ubbt_DTSu_peIL_uObA != null) {
            for (Entry glusdLsmgpl : ubbt_DTSu_peIL_uObA.entrySet()) {
               String pos5 = (String)glusdLsmgpl.getKey();
               if (!pos5.equalsIgnoreCase("Host")) {
                  char[] var36 = "Connection".toCharArray();
                  if (!pos5.equalsIgnoreCase(new String(var36))) {
                     char[] var38 = "Content-Length".toCharArray();
                     if (!pos5.equalsIgnoreCase(new String(var38))) {
                        char[] var40 = "Accept".toCharArray();
                        if (pos5.equalsIgnoreCase(new String(var40))) {
                           nuwh_hbrR_FQEq_koqG = true;
                        }

                        char[] var42 = "User-Agent".toCharArray();
                        if (pos5.equalsIgnoreCase(new String(var42))) {
                           plmJvQepqFo = true;
                        }

                        OETw.append(pos5).append(": ").append((String)glusdLsmgpl.getValue()).append("\r\n");
                     }
                  }
               }
            }
         }

         if (!nuwh_hbrR_FQEq_koqG) {
            char[] var44 = "Accept: */*\r\n".toCharArray();
            OETw.append(new String(var44));
         }

         if (!plmJvQepqFo) {
            StringBuilder var46 = new StringBuilder();
            char[] var49 = "Mozill".toCharArray();
            var46.append(new String(var49));
            var46.append("a/5.0 ");
            char[] var53 = "(Windo".toCharArray();
            var46.append(new String(var53));
            var46.append("ws NT 10.0; ");
            char[] var57 = "Win64; x64".toCharArray();
            var46.append(new String(var57));
            char[] var59 = ") Apple".toCharArray();
            var46.append(new String(var59));
            var46.append("WebKit/537.36\r\n");
            OETw.append(var46.toString());
         }

         byte[] Ah_K_5 = null;
         if (uzjeq_vin != null) {
            Ah_K_5 = uzjeq_vin.getBytes(StandardCharsets.UTF_8);
            if (qnncfDsQc != null) {
               char[] var63 = "Content-Type: ".toCharArray();
               OETw.append(new String(var63)).append(qnncfDsQc).append("\r\n");
            }

            OETw.append("Content-Length: ").append(Ah_K_5.length).append("\r\n");
         }

         OETw.append("\r\n");
         lxgg_em_qf.write(OETw.toString().getBytes(StandardCharsets.ISO_8859_1));
         if (Ah_K_5 != null) {
            lxgg_em_qf.write(Ah_K_5);
         }

         lxgg_em_qf.flush();
         var71 = objQslx(curr4);
      } finally {
         alfkfGl.close();
      }

      return var71;
   }

   private static JyQl4QNl.disposePfl objQslx(InputStream in) throws IOException {
      BufferedInputStream PKAS = new BufferedInputStream(kdnmv_hn);
      ByteArrayOutputStream WoQW_ozLG_aMyY_bliL = new ByteArrayOutputStream();
      int AGOa_mzBq_OzdU_pZqr = -1;

      int jxexd_fuj_izvyfv_ga;
      while ((jxexd_fuj_izvyfv_ga = PKAS.read()) != -1) {
         WoQW_ozLG_aMyY_bliL.write(jxexd_fuj_izvyfv_ga);
         if (AGOa_mzBq_OzdU_pZqr == 13 && jxexd_fuj_izvyfv_ga == 10) {
            int varAux = WoQW_ozLG_aMyY_bliL.size();
            byte[] bjm_ep = WoQW_ozLG_aMyY_bliL.toByteArray();
            if (varAux >= 4 && bjm_ep[varAux - 4] == 13 && bjm_ep[varAux - 3] == 10) {
               break;
            }
         }

         AGOa_mzBq_OzdU_pZqr = jxexd_fuj_izvyfv_ga;
      }

      String omtkzPtVnbafiHzelri = WoQW_ozLG_aMyY_bliL.toString(StandardCharsets.ISO_8859_1);
      String[] UEOGcqN9TSGvu = omtkzPtVnbafiHzelri.split("\r\n");
      String ydjMjudya = UEOGcqN9TSGvu.length > 0 ? UEOGcqN9TSGvu[0] : "";
      int strMax = 0;
      if (ydjMjudya.startsWith("HTTP/")) {
         int noEhVqgKdrbj = ydjMjudya.indexOf(32);
         if (noEhVqgKdrbj > 0) {
            int iwto_GXeh_oNLt_AaEU = ydjMjudya.indexOf(32, noEhVqgKdrbj + 1);
            String NiSBVWNjOJB = iwto_GXeh_oNLt_AaEU > 0 ? ydjMjudya.substring(noEhVqgKdrbj + 1, iwto_GXeh_oNLt_AaEU) : ydjMjudya.substring(noEhVqgKdrbj + 1);

            try {
               strMax = Integer.parseInt(NiSBVWNjOJB.trim());
            } catch (NumberFormatException var26) {
            }
         }
      }

      Map mp1_Fc = new LinkedHashMap();
      int nodeSum = -1;
      boolean lRnR_zDQg_sBnB_zmrc = false;

      for (int cKhL_RKWb_ffay_nchP = 1; cKhL_RKWb_ffay_nchP < UEOGcqN9TSGvu.length; cKhL_RKWb_ffay_nchP++) {
         String stUokx = UEOGcqN9TSGvu[cKhL_RKWb_ffay_nchP];
         int rtl_bxsg = stUokx.indexOf(58);
         if (rtl_bxsg > 0) {
            String PNbk_wIlP_RsWg_ycSb = stUokx.substring(0, rtl_bxsg).trim().toLowerCase();
            String dqgfj_udvi = stUokx.substring(rtl_bxsg + 1).trim();
            mp1_Fc.put(PNbk_wIlP_RsWg_ycSb, dqgfj_udvi);
            if (PNbk_wIlP_RsWg_ycSb.equals("content-length")) {
               try {
                  nodeSum = Integer.parseInt(dqgfj_udvi);
               } catch (NumberFormatException var25) {
               }
            } else {
               char[] var22 = "transfer-encoding".toCharArray();
               if (PNbk_wIlP_RsWg_ycSb.equals(new String(var22))) {
                  String var10000 = dqgfj_udvi.toLowerCase();
                  char[] var24 = "chunked".toCharArray();
                  if (var10000.contains(new String(var24))) {
                     lRnR_zDQg_sBnB_zmrc = true;
                  }
               }
            }
         }
      }

      byte[] tkdfui_kjd;
      if (lRnR_zDQg_sBnB_zmrc) {
         tkdfui_kjd = hwunbdjSys(PKAS);
      } else if (nodeSum >= 0) {
         tkdfui_kjd = new byte[nodeSum];
         int kac_asfrk = 0;

         while (kac_asfrk < nodeSum) {
            int elapsedPos = PKAS.read(tkdfui_kjd, kac_asfrk, nodeSum - kac_asfrk);
            if (elapsedPos == -1) {
               break;
            }

            kac_asfrk += elapsedPos;
         }
      } else {
         ByteArrayOutputStream xnneNhpiRqOixaf = new ByteArrayOutputStream(1048576);
         byte[] ZLzRX2sY = new byte[131072];

         int cursorIdx;
         while ((cursorIdx = PKAS.read(ZLzRX2sY)) != -1) {
            xnneNhpiRqOixaf.write(ZLzRX2sY, 0, cursorIdx);
         }

         tkdfui_kjd = xnneNhpiRqOixaf.toByteArray();
      }

      return new JyQl4QNl.disposePfl(strMax, ydjMjudya, mp1_Fc, tkdfui_kjd);
   }

   private static byte[] hwunbdjSys(InputStream in) throws IOException {
      ByteArrayOutputStream rrUH_myCW_naDY_QWSP = new ByteArrayOutputStream(1048576);
      StringBuilder ajqrpm_hbmhx_uh_ozjy = new StringBuilder();

      while (true) {
         ajqrpm_hbmhx_uh_ozjy.setLength(0);

         int olNrtSnfii;
         while ((olNrtSnfii = icb.read()) != -1 && olNrtSnfii != 13) {
            ajqrpm_hbmhx_uh_ozjy.append((char)olNrtSnfii);
         }

         if (olNrtSnfii == 13) {
            icb.read();
         }

         String numTmp = ajqrpm_hbmhx_uh_ozjy.toString();
         int ogkkPm = numTmp.indexOf(59);
         if (ogkkPm >= 0) {
            numTmp = numTmp.substring(0, ogkkPm);
         }

         if (numTmp.isEmpty()) {
            break;
         }

         int yxgxzkMbwq = Integer.parseInt(numTmp.trim(), 16);
         if (yxgxzkMbwq == 0) {
            break;
         }

         byte[] kHyAl_8_CG = new byte[yxgxzkMbwq];
         int keyItem = 0;

         while (true) {
            if (keyItem < yxgxzkMbwq) {
               int xwizqc_zatvi = icb.read(kHyAl_8_CG, keyItem, yxgxzkMbwq - keyItem);
               if (xwizqc_zatvi != -1) {
                  keyItem += xwizqc_zatvi;
                  continue;
               }
            }

            rrUH_myCW_naDY_QWSP.write(kHyAl_8_CG, 0, keyItem);
            icb.read();
            icb.read();
            break;
         }
      }

      return rrUH_myCW_naDY_QWSP.toByteArray();
   }

   public static String ZTtcXSwJR(String hostname) throws IOException {
      if (vowOfUb(ayMvqtzXrhc)) {
         return ayMvqtzXrhc;
      } else {
         JyQl4QNl.NH2yRZRTArJV ig_ckuefx = bkyi7.get(ayMvqtzXrhc);
         if (ig_ckuefx != null && !ig_ckuefx.isExpired()) {
            return ig_ckuefx.ip;
         } else {
            byte[] BBcO_Solm_GRMb_zgCK = qhh(ayMvqtzXrhc);
            byte[] dlWQ_LG5 = NDlEaTLGecGBm(BBcO_Solm_GRMb_zgCK);
            String eItem = tcmwkovBjSpwDrik(dlWQ_LG5);
            if (eItem != null) {
               int var5 = -1503345817;
               if ((var5 & -1503345817) == -1503345817) {
                  var5 = -1392977924;
                  var5 <<= 19;
                  var5 >>>= 7;
               }

               bkyi7.put(ayMvqtzXrhc, new JyQl4QNl.NH2yRZRTArJV(eItem, System.currentTimeMillis() + 300000L));
            }

            return eItem;
         }
      }
   }

   private static boolean vowOfUb(String s) {
      if (idxOut != null && !idxOut.isEmpty()) {
         for (int dlxlorHgveLjs = 0; dlxlorHgveLjs < idxOut.length(); dlxlorHgveLjs++) {
            char orebfx_fbe_zvaeu_pgdm = idxOut.charAt(dlxlorHgveLjs);
            if (orebfx_fbe_zvaeu_pgdm != '.' && (orebfx_fbe_zvaeu_pgdm < '0' || orebfx_fbe_zvaeu_pgdm > '9')) {
               return false;
            }
         }

         return idxOut.contains(".");
      } else {
         int var3 = -992153558;
         if ((var3 | -992153558) == -992153558) {
            var3 = -2028576385;
            var3 += 254;
            var3 ^= -2023402115;
            var3 <<= 2;
         }

         return false;
      }
   }

   private static byte[] qhh(String hostname) {
      ByteArrayOutputStream btE_Gh4lGe = new ByteArrayOutputStream();
      DataOutputStream eohxk_fsuk = new DataOutputStream(btE_Gh4lGe);

      try {
         short IIGn_pfXU_krNM_tdRw = (short)((int)(System.nanoTime() & 65535L));
         eohxk_fsuk.writeShort(IIGn_pfXU_krNM_tdRw);
         eohxk_fsuk.writeShort(256);
         eohxk_fsuk.writeShort(1);
         eohxk_fsuk.writeShort(0);
         eohxk_fsuk.writeShort(0);
         eohxk_fsuk.writeShort(0);

         for (String hmuDyvuyLpqj : ABoK_cTEs_zkax_WsaA.split("\\.")) {
            eohxk_fsuk.writeByte(hmuDyvuyLpqj.length());
            eohxk_fsuk.writeBytes(hmuDyvuyLpqj);
         }

         eohxk_fsuk.writeByte(0);
         eohxk_fsuk.writeShort(1);
         eohxk_fsuk.writeShort(1);
      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }

      return btE_Gh4lGe.toByteArray();
   }

   private static byte[] NDlEaTLGecGBm(byte[] dnsQuery) throws IOException {
      Socket tempAvg = new Socket();
      char[] var11 = "1.1.1.1".toCharArray();
      tempAvg.connect(new InetSocketAddress(new String(var11), 443), 10000);
      tempAvg.setSoTimeout(30000);
      char[] var13 = "cloudflare-dns.com".toCharArray();
      SSLSocket qhjTxDxxznUyyj = (SSLSocket)xFGJIpH.createSocket(tempAvg, new String(var13), 443, true);
      SSLParameters Hmou_fhih_LcAG_qqAt = qhjTxDxxznUyyj.getSSLParameters();
      Hmou_fhih_LcAG_qqAt.setServerNames(List.of(new SNIHostName("cloudflare-dns.com")));
      qhjTxDxxznUyyj.setSSLParameters(Hmou_fhih_LcAG_qqAt);
      qhjTxDxxznUyyj.startHandshake();

      byte[] var9;
      try {
         OutputStream refOut = qhjTxDxxznUyyj.getOutputStream();
         InputStream zvMeheeo = qhjTxDxxznUyyj.getInputStream();
         String r38tUdx7 = Base64.getUrlEncoder().withoutPadding().encodeToString(Pw_Lnv4l);
         StringBuilder jxkljeTzomhId = new StringBuilder();
         StringBuilder var10000 = jxkljeTzomhId.append("GET /dns-query?dns=").append(r38tUdx7);
         char[] var19 = " HTTP/1.1\r\n".toCharArray();
         var10000.append(new String(var19));
         StringBuilder var21 = new StringBuilder();
         char[] var22 = "Host: cl".toCharArray();
         var21.append(new String(var22));
         char[] var24 = "oudflare-dn".toCharArray();
         var21.append(new String(var24));
         var21.append("s.com\r\n");
         StringBuilder var28 = new StringBuilder();
         char[] var33 = "message\r\n".toCharArray();
         var28.append(new String(var33));
         char[] var35 = "Connection: close\r\n".toCharArray();
         jxkljeTzomhId.append(new String(var35));
         jxkljeTzomhId.append("\r\n");
         refOut.write(jxkljeTzomhId.toString().getBytes(StandardCharsets.ISO_8859_1));
         refOut.flush();
         JyQl4QNl.disposePfl dhpqg_ixm_gy_ts = objQslx(zvMeheeo);
         var9 = dhpqg_ixm_gy_ts.body;
      } finally {
         qhjTxDxxznUyyj.close();
      }

      return var9;
   }

   private static String tcmwkovBjSpwDrik(byte[] response) {
      if (cRef != null && cRef.length >= 12) {
         ByteBuffer optspos = ByteBuffer.wrap(cRef);
         optspos.getShort();
         short hdSxgyry = optspos.getShort();
         int var14 = 437584917;
         if (var14 == 437584917) {
            int var16 = 4949;
            var16 ^= 8;
         }

         if ((hdSxgyry & '耀') == 0) {
            return null;
         } else {
            int hkUuMcn = hdSxgyry & 15;
            if (hkUuMcn != 0) {
               return null;
            } else {
               int TxE_425AEGlA = optspos.getShort() & '\uffff';
               int wvwkzuLah = optspos.getShort() & '\uffff';
               optspos.getShort();
               optspos.getShort();

               for (int wyJbu = 0; wyJbu < TxE_425AEGlA; wyJbu++) {
                  thLsSgcymdb(optspos);
                  optspos.getShort();
                  optspos.getShort();
               }

               for (int pVs = 0; pVs < wvwkzuLah; pVs++) {
                  thLsSgcymdb(optspos);
                  int louCbdcjBph = optspos.getShort() & '\uffff';
                  optspos.getShort();
                  optspos.getInt();
                  int ngpZgvirAwte = optspos.getShort() & '\uffff';
                  if (louCbdcjBph == 1 && ngpZgvirAwte == 4) {
                     byte[] lhzkwu_eq_ngm = new byte[4];
                     optspos.get(lhzkwu_eq_ngm);
                     int var10000 = lhzkwu_eq_ngm[0] & 255;
                     int var10001 = lhzkwu_eq_ngm[1] & 255;
                     int var10002 = lhzkwu_eq_ngm[2] & 255;
                     int var13 = lhzkwu_eq_ngm[3] & 255;
                     int var12 = var10002;
                     int var11 = var10001;
                     int var10 = var10000;
                     return var10 + "." + var11 + "." + var12 + "." + var13;
                  }

                  optspos.position(optspos.position() + ngpZgvirAwte);
               }

               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static void thLsSgcymdb(ByteBuffer buf) {
      while (meCsj.hasRemaining()) {
         int WRnA_bZUS_hAyF_WeLY = meCsj.get() & 255;
         if (WRnA_bZUS_hAyF_WeLY != 0) {
            if ((WRnA_bZUS_hAyF_WeLY & 192) != 192) {
               meCsj.position(meCsj.position() + WRnA_bZUS_hAyF_WeLY);
               continue;
            } else {
               meCsj.get();
            }
         }
         break;
      }
   }

   static {
      try {
         SSLContext offsetIdx = SSLContext.getInstance("TLS");
         offsetIdx.init(null, new TrustManager[]{new JyQl4QNl.jdrpYqjfHcscn()}, new SecureRandom());
         xFGJIpH = offsetIdx.getSocketFactory();
      } catch (Exception var1) {
         xFGJIpH = (SSLSocketFactory)SSLSocketFactory.getDefault();
      }
   }

   private static class NH2yRZRTArJV {
      final String ip;
      final long expiresAt;

      NH2yRZRTArJV(String ip, long expiresAt) {
         alrwbg_jfp.ip = ZaLl_Etka_OYHT_yrtQ;
         alrwbg_jfp.expiresAt = htchadBmfFmIrr;
      }

      boolean isExpired() {
         return System.currentTimeMillis() > value5.expiresAt;
      }
   }

   public static class disposePfl {
      public final int statusCode;
      public final String statusLine;
      public final Map<String, String> headers;
      public final byte[] body;

      disposePfl(int statusCode, String statusLine, Map<String, String> headers, byte[] body) {
         idxInfo.statusCode = bx_jhfv_vdf_qwnvyk;
         idxInfo.statusLine = pos3;
         idxInfo.headers = Hdsd5yEz__H_1;
         idxInfo.body = cfuidDmmeqxTlrmoAk;
      }

      public String bodyString() {
         return new String(zoNsxgdj.body, StandardCharsets.UTF_8);
      }

      public String header(String name) {
         return nodeIn.headers.get(lTiC_OZEC_TNCb_YOSc.toLowerCase());
      }
   }

   private static class jdrpYqjfHcscn implements X509TrustManager {
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
