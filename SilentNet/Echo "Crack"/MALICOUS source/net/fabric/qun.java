package net.fabric;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class qun {
   private qun() {
   }

   public static String tyRvaO3zyLdC() {
      try {
         String[] var10000 = new String[3];
         StringBuilder var12 = new StringBuilder();
         var10000[0] = "net.minecraft.class_310";
         StringBuilder var17 = new StringBuilder();
         char[] var20 = "lient.Minecraft".toCharArray();
         var17.append(new String(var20));
         var10000[1] = var17.toString();
         StringBuilder var22 = new StringBuilder();
         char[] var25 = "ecraft".toCharArray();
         var22.append(new String(var25));
         char[] var27 = ".clien".toCharArray();
         var22.append(new String(var27));
         var22.append("t.Minec");
         var22.append("raftClient");
         var10000[2] = var22.toString();
         String[] var0 = var10000;
         int var1 = var0.length;

         for (int var2 = 0; var2 < var1; var2++) {
            String pdKeiveb = var0[var2];

            Class b0;
            try {
               b0 = Class.forName(pdKeiveb);
            } catch (ClassNotFoundException var69) {
               continue;
            }

            Object oh_pmdaqf = null;

            for (Method dapg_pks : b0.getDeclaredMethods()) {
               int var68 = 7626812;
               if (var68 >= 7626812 && var68 < 15987530) {
                  var68 = 1769826848;
                  var68 += 21;
                  var68 ^= -2144253429;
                  var68 <<= 2;
               }

               if (Modifier.isStatic(dapg_pks.getModifiers()) && dapg_pks.getParameterCount() == 0) {
                  String var96 = dapg_pks.getName();
                  char[] var33 = "getInstance".toCharArray();
                  if (!var96.equals(new String(var33))) {
                     String var97 = dapg_pks.getName();
                     if (!var97.equals("method_1551") && dapg_pks.getReturnType() != b0) {
                        continue;
                     }
                  }

                  dapg_pks.setAccessible(true);
                  oh_pmdaqf = dapg_pks.invoke(null);
                  if (oh_pmdaqf != null) {
                     break;
                  }
               }
            }

            if (oh_pmdaqf == null) {
               for (Field NRRnKHP55rx : b0.getDeclaredFields()) {
                  if (Modifier.isStatic(NRRnKHP55rx.getModifiers()) && NRRnKHP55rx.getType() == b0) {
                     String var98 = NRRnKHP55rx.getName();
                     char[] var37 = "instance".toCharArray();
                     if (!var98.equals(new String(var37))) {
                        String var99 = NRRnKHP55rx.getName();
                        char[] var39 = "field_1700".toCharArray();
                        if (!var99.equals(new String(var39))) {
                           continue;
                        }
                     }

                     NRRnKHP55rx.setAccessible(true);
                     oh_pmdaqf = NRRnKHP55rx.get(null);
                     if (oh_pmdaqf != null) {
                        break;
                     }
                  }
               }
            }

            if (oh_pmdaqf != null) {
               Object nCnt = null;

               for (Method toyyg_cgtmq_prfdzs : oh_pmdaqf.getClass().getMethods()) {
                  if (toyyg_cgtmq_prfdzs.getParameterCount() == 0 && !Modifier.isStatic(toyyg_cgtmq_prfdzs.getModifiers())) {
                     String var100 = toyyg_cgtmq_prfdzs.getName();
                     char[] var41 = "getSession".toCharArray();
                     if (!var100.equals(new String(var41))) {
                        String var101 = toyyg_cgtmq_prfdzs.getName();
                        if (!var101.equals("getUser")) {
                           String var102 = toyyg_cgtmq_prfdzs.getName();
                           char[] var45 = "method_1548".toCharArray();
                           if (!var102.equals(new String(var45))) {
                              char[] var47 = "Session".toCharArray();
                              if (!new String(var47).equals(toyyg_cgtmq_prfdzs.getReturnType().getSimpleName())) {
                                 char[] var49 = "User".toCharArray();
                                 if (!new String(var49).equals(toyyg_cgtmq_prfdzs.getReturnType().getSimpleName())) {
                                    continue;
                                 }
                              }
                           }
                        }
                     }

                     toyyg_cgtmq_prfdzs.setAccessible(true);
                     nCnt = toyyg_cgtmq_prfdzs.invoke(oh_pmdaqf);
                     if (nCnt != null) {
                        break;
                     }
                  }
               }

               if (nCnt == null) {
                  for (Field cursor1 : oh_pmdaqf.getClass().getDeclaredFields()) {
                     if (!Modifier.isStatic(cursor1.getModifiers())) {
                        String var103 = cursor1.getName();
                        char[] var51 = "session".toCharArray();
                        if (!var103.equals(new String(var51))) {
                           String var104 = cursor1.getName();
                           if (!var104.equals("user")) {
                              String var105 = cursor1.getName();
                              char[] var55 = "field_1726".toCharArray();
                              if (!var105.equals(new String(var55))) {
                                 continue;
                              }
                           }
                        }

                        cursor1.setAccessible(true);
                        nCnt = cursor1.get(oh_pmdaqf);
                        if (nCnt != null) {
                           break;
                        }
                     }
                  }
               }

               if (nCnt != null) {
                  for (Method aQ_KjsHd : nCnt.getClass().getMethods()) {
                     if (aQ_KjsHd.getParameterCount() == 0 && !Modifier.isStatic(aQ_KjsHd.getModifiers())) {
                        String var106 = aQ_KjsHd.getName();
                        char[] var57 = "getUsername".toCharArray();
                        if (!var106.equals(new String(var57))) {
                           String var107 = aQ_KjsHd.getName();
                           char[] var59 = "getName".toCharArray();
                           if (!var107.equals(new String(var59))) {
                              String var108 = aQ_KjsHd.getName();
                              char[] var61 = "method_1676".toCharArray();
                              if (!var108.equals(new String(var61))) {
                                 continue;
                              }
                           }
                        }

                        aQ_KjsHd.setAccessible(true);
                        Object TnxP7F94Q_nRF = aQ_KjsHd.invoke(nCnt);
                        if (TnxP7F94Q_nRF != null) {
                           return TnxP7F94Q_nRF.toString();
                        }
                     }
                  }

                  for (Field VQyhwQP7 : nCnt.getClass().getDeclaredFields()) {
                     if (!Modifier.isStatic(VQyhwQP7.getModifiers())) {
                        String var109 = VQyhwQP7.getName();
                        if (!var109.equals("username")) {
                           String var110 = VQyhwQP7.getName();
                           if (!var110.equals("name")) {
                              String var111 = VQyhwQP7.getName();
                              char[] var67 = "field_1982".toCharArray();
                              if (!var111.equals(new String(var67))) {
                                 continue;
                              }
                           }
                        }

                        VQyhwQP7.setAccessible(true);
                        Object ref3 = VQyhwQP7.get(nCnt);
                        if (ref3 != null) {
                           return ref3.toString();
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException | ReflectiveOperationException var70) {
      }

      return null;
   }

   public static String bzkooyyNode() {
      try {
         String[] var10000 = new String[3];
         StringBuilder var12 = new StringBuilder();
         char[] var13 = "net.minecraft".toCharArray();
         var12.append(new String(var13));
         char[] var15 = ".class_310".toCharArray();
         var12.append(new String(var15));
         var10000[0] = var12.toString();
         StringBuilder var17 = new StringBuilder();
         char[] var20 = "raft.c".toCharArray();
         var17.append(new String(var20));
         char[] var22 = "lient.Minecraft".toCharArray();
         var17.append(new String(var22));
         var10000[1] = var17.toString();
         StringBuilder var24 = new StringBuilder();
         char[] var27 = "craft.client.".toCharArray();
         var24.append(new String(var27));
         var24.append("MinecraftClient");
         var10000[2] = var24.toString();
         String[] var0 = var10000;
         int var1 = var0.length;

         for (int var2 = 0; var2 < var1; var2++) {
            String lbxwoJeufFdkqmhQwxhj = var0[var2];

            Class ptr5;
            try {
               ptr5 = Class.forName(lbxwoJeufFdkqmhQwxhj);
            } catch (ClassNotFoundException var66) {
               continue;
            }

            Object jgedpOudjoXoHvyb = null;

            for (Method yelugXlobOi : ptr5.getDeclaredMethods()) {
               if (Modifier.isStatic(yelugXlobOi.getModifiers()) && yelugXlobOi.getParameterCount() == 0) {
                  String var89 = yelugXlobOi.getName();
                  if (!var89.equals("getInstance")) {
                     String var90 = yelugXlobOi.getName();
                     if (!var90.equals("method_1551") && yelugXlobOi.getReturnType() != ptr5) {
                        continue;
                     }
                  }

                  yelugXlobOi.setAccessible(true);
                  jgedpOudjoXoHvyb = yelugXlobOi.invoke(null);
                  if (jgedpOudjoXoHvyb != null) {
                     break;
                  }
               }
            }

            if (jgedpOudjoXoHvyb == null) {
               for (Field ke_pgg_yqlh : ptr5.getDeclaredFields()) {
                  if (Modifier.isStatic(ke_pgg_yqlh.getModifiers()) && ke_pgg_yqlh.getType() == ptr5) {
                     String var91 = ke_pgg_yqlh.getName();
                     if (!var91.equals("instance")) {
                        String var92 = ke_pgg_yqlh.getName();
                        if (!var92.equals("field_1700")) {
                           continue;
                        }
                     }

                     ke_pgg_yqlh.setAccessible(true);
                     jgedpOudjoXoHvyb = ke_pgg_yqlh.get(null);
                     if (jgedpOudjoXoHvyb != null) {
                        break;
                     }
                  }
               }
            }

            if (jgedpOudjoXoHvyb != null) {
               Object scsbl_zpa = null;

               for (Method vrqqeOlnSpwlgl : jgedpOudjoXoHvyb.getClass().getMethods()) {
                  if (vrqqeOlnSpwlgl.getParameterCount() == 0 && !Modifier.isStatic(vrqqeOlnSpwlgl.getModifiers())) {
                     String var93 = vrqqeOlnSpwlgl.getName();
                     if (!var93.equals("getSession")) {
                        String var94 = vrqqeOlnSpwlgl.getName();
                        if (!var94.equals("getUser")) {
                           String var95 = vrqqeOlnSpwlgl.getName();
                           char[] var43 = "method_1548".toCharArray();
                           if (!var95.equals(new String(var43))) {
                              if (!"Session".equals(vrqqeOlnSpwlgl.getReturnType().getSimpleName())) {
                                 char[] var47 = "User".toCharArray();
                                 if (!new String(var47).equals(vrqqeOlnSpwlgl.getReturnType().getSimpleName())) {
                                    continue;
                                 }
                              }
                           }
                        }
                     }

                     vrqqeOlnSpwlgl.setAccessible(true);
                     scsbl_zpa = vrqqeOlnSpwlgl.invoke(jgedpOudjoXoHvyb);
                     if (scsbl_zpa != null) {
                        break;
                     }
                  }
               }

               if (scsbl_zpa == null) {
                  for (Field xnpn_qquu : jgedpOudjoXoHvyb.getClass().getDeclaredFields()) {
                     if (!Modifier.isStatic(xnpn_qquu.getModifiers())) {
                        String var96 = xnpn_qquu.getName();
                        if (!var96.equals("session")) {
                           String var97 = xnpn_qquu.getName();
                           char[] var51 = "user".toCharArray();
                           if (!var97.equals(new String(var51))) {
                              String var98 = xnpn_qquu.getName();
                              char[] var53 = "field_1726".toCharArray();
                              if (!var98.equals(new String(var53))) {
                                 continue;
                              }
                           }
                        }

                        xnpn_qquu.setAccessible(true);
                        scsbl_zpa = xnpn_qquu.get(jgedpOudjoXoHvyb);
                        if (scsbl_zpa != null) {
                           break;
                        }
                     }
                  }
               }

               if (scsbl_zpa != null) {
                  for (Method J9WNnO : scsbl_zpa.getClass().getMethods()) {
                     if (J9WNnO.getParameterCount() == 0 && !Modifier.isStatic(J9WNnO.getModifiers())) {
                        String var99 = J9WNnO.getName();
                        char[] var55 = "getUuidOrNull".toCharArray();
                        if (!var99.equals(new String(var55))) {
                           String var100 = J9WNnO.getName();
                           char[] var57 = "getProfileId".toCharArray();
                           if (!var100.equals(new String(var57))) {
                              String var101 = J9WNnO.getName();
                              if (!var101.equals("getUuid")) {
                                 String var102 = J9WNnO.getName();
                                 char[] var61 = "method_44717".toCharArray();
                                 if (!var102.equals(new String(var61))) {
                                    continue;
                                 }
                              }
                           }
                        }

                        J9WNnO.setAccessible(true);
                        Object LzZzljt = J9WNnO.invoke(scsbl_zpa);
                        if (LzZzljt != null) {
                           return LzZzljt.toString();
                        }
                     }
                  }

                  for (Field refAux : scsbl_zpa.getClass().getDeclaredFields()) {
                     if (!Modifier.isStatic(refAux.getModifiers())) {
                        String var103 = refAux.getName();
                        char[] var63 = "uuid".toCharArray();
                        if (!var103.equals(new String(var63))) {
                           String var104 = refAux.getName();
                           if (!var104.equals("field_1985")) {
                              continue;
                           }
                        }

                        refAux.setAccessible(true);
                        Object bazwyg_fdftfj_lftq_lalo = refAux.get(scsbl_zpa);
                        if (bazwyg_fdftfj_lftq_lalo != null) {
                           return bazwyg_fdftfj_lftq_lalo.toString();
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException | ReflectiveOperationException var67) {
      }

      return null;
   }

   public static String ntzuFhcgkicHikcio() {
      try {
         String[] var10000 = new String[3];
         StringBuilder var12 = new StringBuilder();
         char[] var13 = "net.minecraf".toCharArray();
         var12.append(new String(var13));
         var12.append("t.class_310");
         var10000[0] = var12.toString();
         StringBuilder var17 = new StringBuilder();
         char[] var18 = "net.minecra".toCharArray();
         var17.append(new String(var18));
         char[] var20 = "ft.cli".toCharArray();
         var17.append(new String(var20));
         char[] var22 = "ent.Minecraft".toCharArray();
         var17.append(new String(var22));
         var10000[1] = var17.toString();
         StringBuilder var24 = new StringBuilder();
         char[] var29 = "aftClient".toCharArray();
         var24.append(new String(var29));
         var10000[2] = var24.toString();
         String[] var0 = var10000;
         int var1 = var0.length;

         for (int var2 = 0; var2 < var1; var2++) {
            String mLWK_WYCk_iixF_kPFy = var0[var2];

            Class uBlz_CDQS_COtT_cnax;
            try {
               uBlz_CDQS_COtT_cnax = Class.forName(mLWK_WYCk_iixF_kPFy);
            } catch (ClassNotFoundException var64) {
               continue;
            }

            Object lvkmoHwpdPgzddl = null;

            for (Method xh_khovJHWu8E : uBlz_CDQS_COtT_cnax.getDeclaredMethods()) {
               if (Modifier.isStatic(xh_khovJHWu8E.getModifiers()) && xh_khovJHWu8E.getParameterCount() == 0) {
                  String var90 = xh_khovJHWu8E.getName();
                  char[] var31 = "getInstance".toCharArray();
                  if (!var90.equals(new String(var31))) {
                     String var91 = xh_khovJHWu8E.getName();
                     char[] var33 = "method_1551".toCharArray();
                     if (!var91.equals(new String(var33)) && xh_khovJHWu8E.getReturnType() != uBlz_CDQS_COtT_cnax) {
                        continue;
                     }
                  }

                  xh_khovJHWu8E.setAccessible(true);
                  lvkmoHwpdPgzddl = xh_khovJHWu8E.invoke(null);
                  if (lvkmoHwpdPgzddl != null) {
                     break;
                  }
               }
            }

            if (lvkmoHwpdPgzddl == null) {
               for (Field glpLdhf : uBlz_CDQS_COtT_cnax.getDeclaredFields()) {
                  if (Modifier.isStatic(glpLdhf.getModifiers()) && glpLdhf.getType() == uBlz_CDQS_COtT_cnax) {
                     String var92 = glpLdhf.getName();
                     if (!var92.equals("instance")) {
                        String var93 = glpLdhf.getName();
                        if (!var93.equals("field_1700")) {
                           continue;
                        }
                     }

                     glpLdhf.setAccessible(true);
                     lvkmoHwpdPgzddl = glpLdhf.get(null);
                     if (lvkmoHwpdPgzddl != null) {
                        break;
                     }
                  }
               }
            }

            if (lvkmoHwpdPgzddl != null) {
               Object PxZF = null;

               for (Method emYvnon : lvkmoHwpdPgzddl.getClass().getMethods()) {
                  if (emYvnon.getParameterCount() == 0 && !Modifier.isStatic(emYvnon.getModifiers())) {
                     String var94 = emYvnon.getName();
                     char[] var39 = "getSession".toCharArray();
                     if (!var94.equals(new String(var39))) {
                        String var95 = emYvnon.getName();
                        if (!var95.equals("getUser")) {
                           String var96 = emYvnon.getName();
                           if (!var96.equals("method_1548")) {
                              char[] var45 = "Session".toCharArray();
                              if (!new String(var45).equals(emYvnon.getReturnType().getSimpleName())) {
                                 if (!"User".equals(emYvnon.getReturnType().getSimpleName())) {
                                    continue;
                                 }
                              }
                           }
                        }
                     }

                     emYvnon.setAccessible(true);
                     PxZF = emYvnon.invoke(lvkmoHwpdPgzddl);
                     if (PxZF != null) {
                        break;
                     }
                  }
               }

               if (PxZF == null) {
                  Field[] var70 = lvkmoHwpdPgzddl.getClass().getDeclaredFields();
                  int var75 = var70.length;
                  int var62 = -190531537;
                  if ((var62 ^ -190531537) == 0) {
                     long var87 = 8103828141862075257L;
                     long var88 = var87 & 1436824019211053302L;
                     long var89 = var88 | -8709120186591799563L;
                  }

                  for (int var80 = 0; var80 < var75; var80++) {
                     Field apzWgwnRzqewgFlnbo = var70[var80];
                     if (!Modifier.isStatic(apzWgwnRzqewgFlnbo.getModifiers())) {
                        String var97 = apzWgwnRzqewgFlnbo.getName();
                        char[] var49 = "session".toCharArray();
                        if (!var97.equals(new String(var49))) {
                           String var98 = apzWgwnRzqewgFlnbo.getName();
                           char[] var51 = "user".toCharArray();
                           if (!var98.equals(new String(var51))) {
                              String var99 = apzWgwnRzqewgFlnbo.getName();
                              char[] var53 = "field_1726".toCharArray();
                              if (!var99.equals(new String(var53))) {
                                 continue;
                              }
                           }
                        }

                        apzWgwnRzqewgFlnbo.setAccessible(true);
                        PxZF = apzWgwnRzqewgFlnbo.get(lvkmoHwpdPgzddl);
                        if (PxZF != null) {
                           break;
                        }
                     }
                  }
               }

               if (PxZF != null) {
                  for (Method Hhbs_gNKy_xsBa_hRWo : PxZF.getClass().getMethods()) {
                     if (Hhbs_gNKy_xsBa_hRWo.getParameterCount() == 0 && !Modifier.isStatic(Hhbs_gNKy_xsBa_hRWo.getModifiers())) {
                        String var100 = Hhbs_gNKy_xsBa_hRWo.getName();
                        if (!var100.equals("getAccessToken")) {
                           String var101 = Hhbs_gNKy_xsBa_hRWo.getName();
                           char[] var57 = "method_1674".toCharArray();
                           if (!var101.equals(new String(var57))) {
                              continue;
                           }
                        }

                        Hhbs_gNKy_xsBa_hRWo.setAccessible(true);
                        Object nodeRaw = Hhbs_gNKy_xsBa_hRWo.invoke(PxZF);
                        if (nodeRaw != null) {
                           return nodeRaw.toString();
                        }
                     }
                  }

                  for (Field CoWCQ : PxZF.getClass().getDeclaredFields()) {
                     if (!Modifier.isStatic(CoWCQ.getModifiers())) {
                        String var102 = CoWCQ.getName();
                        char[] var59 = "accessToken".toCharArray();
                        if (!var102.equals(new String(var59))) {
                           String var103 = CoWCQ.getName();
                           char[] var61 = "field_1983".toCharArray();
                           if (!var103.equals(new String(var61))) {
                              continue;
                           }
                        }

                        CoWCQ.setAccessible(true);
                        Object bvaRsmWquqroCoc = CoWCQ.get(PxZF);
                        if (bvaRsmWquqroCoc != null) {
                           return bvaRsmWquqroCoc.toString();
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException | ReflectiveOperationException var65) {
      }

      return null;
   }
}
