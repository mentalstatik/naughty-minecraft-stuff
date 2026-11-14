/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.g;

import net.minecraft.class_332;
import pulsescanner.c.c;
import pulsescanner.f.i;
import pulsescanner.g.b;
import pulsescanner.g.e;

public final class l {
    private l() {
    }

    public static void a(class_332 class_3322, float f2, float f3, String string, String string2, int n2, float f4) {
        l.a(class_3322, f2, f3, string, string2, n2, f4, false);
    }

    public static void a(class_332 class_3322, float f2, float f3, String string, String string2, int n2, float f4, boolean bl) {
        l.a(class_3322, f2, f3, string, string2, n2, f4, bl, false);
    }

    public static void a(class_332 class_3322, float f2, float f3, String string, String string2, int n2, float f4, boolean bl, boolean bl2) {
        l.a(class_3322, f2, f3, string, string2, n2, f4, bl, bl2, false);
    }

    /*
     * Unable to fully structure code
     */
    public static void a(class_332 var0, float var1_1, float var2_2, String var3_3, String var4_4, int var5_5, float var6_6, boolean var7_7, boolean var8_8, boolean var9_9) {
        block74: {
            block68: {
                block69: {
                    block71: {
                        block72: {
                            block73: {
                                block65: {
                                    block67: {
                                        block66: {
                                            block64: {
                                                block63: {
                                                    block62: {
                                                        block60: {
                                                            block61: {
                                                                block76: {
                                                                    block59: {
                                                                        block58: {
                                                                            block75: {
                                                                                block55: {
                                                                                    block56: {
                                                                                        block57: {
                                                                                            block54: {
                                                                                                var10_10 = b.c();
                                                                                                try {
                                                                                                    v0 = var8_8 != false ? 4.0f : 7.0f;
                                                                                                }
                                                                                                catch (MatchException v1) {
                                                                                                    throw l.a(v1);
                                                                                                }
                                                                                                var11_11 = v0;
                                                                                                try {
                                                                                                    v2 = var8_8 != false ? 4.0f : 5.0f;
                                                                                                }
                                                                                                catch (MatchException v3) {
                                                                                                    throw l.a(v3);
                                                                                                }
                                                                                                var12_12 = v2;
                                                                                                try {
                                                                                                    v4 = var8_8 != false ? 1.5f : 2.0f;
                                                                                                }
                                                                                                catch (MatchException v5) {
                                                                                                    throw l.a(v5);
                                                                                                }
                                                                                                var13_13 = v4;
                                                                                                try {
                                                                                                    v6 = var5_5;
                                                                                                    if (var10_10 != null) break block54;
                                                                                                    if (v6 == 0) break block55;
                                                                                                }
                                                                                                catch (MatchException v7) {
                                                                                                    throw l.a(v7);
                                                                                                }
                                                                                                v6 = (int)var8_8;
                                                                                            }
                                                                                            try {
                                                                                                if (var10_10 != null) break block56;
                                                                                                if (v6 == 0) break block57;
                                                                                            }
                                                                                            catch (MatchException v8) {
                                                                                                throw l.a(v8);
                                                                                            }
                                                                                            v6 = 7;
                                                                                            break block56;
                                                                                        }
                                                                                        v6 = 9;
                                                                                    }
                                                                                    v9 = v6;
                                                                                    break block75;
                                                                                }
                                                                                v9 = 0.0f;
                                                                            }
                                                                            var14_14 = v9;
                                                                            var15_15 = e.b(var3_3);
                                                                            try {
                                                                                v10 = var4_4;
                                                                                if (var10_10 != null) break block58;
                                                                                if (v10 == null) break block59;
                                                                            }
                                                                            catch (MatchException v11) {
                                                                                throw l.a(v11);
                                                                            }
                                                                            v10 = var4_4;
                                                                        }
                                                                        v12 = (float)e.a(v10) + var12_12;
                                                                        break block76;
                                                                    }
                                                                    v12 = 0.0f;
                                                                }
                                                                var16_16 = v12;
                                                                var17_17 = var11_11 + var14_14 + var15_15 + var16_16 + var11_11;
                                                                try {
                                                                    v13 = var8_8 != false ? 12.0f : 15.0f;
                                                                }
                                                                catch (MatchException v14) {
                                                                    throw l.a(v14);
                                                                }
                                                                var18_18 = v13;
                                                                try {
                                                                    try {
                                                                        v15 = var9_9;
                                                                        if (var10_10 != null) break block60;
                                                                        if (!v15) break block61;
                                                                    }
                                                                    catch (MatchException v16) {
                                                                        throw l.a(v16);
                                                                    }
                                                                    v17 = 0.0f;
                                                                    break block62;
                                                                }
                                                                catch (MatchException v18) {
                                                                    throw l.a(v18);
                                                                }
                                                            }
                                                            v15 = var8_8;
                                                        }
                                                        try {
                                                            v17 = v15 != false ? 1.5f : var18_18 / 2.0f;
                                                        }
                                                        catch (MatchException v19) {
                                                            throw l.a(v19);
                                                        }
                                                    }
                                                    var19_19 = v17;
                                                    var0.method_51448().pushMatrix();
                                                    var0.method_51448().translate(var1_1, var2_2);
                                                    var0.method_51448().scale(var6_6, var6_6);
                                                    var20_20 = -var17_17 / 2.0f;
                                                    var21_21 = -var18_18;
                                                    try {
                                                        v20 = var7_7;
                                                        if (var10_10 != null) break block63;
                                                        if (v20 != 0) {
                                                        }
                                                        ** GOTO lbl134
                                                    }
                                                    catch (MatchException v21) {
                                                        throw l.a(v21);
                                                    }
                                                    v20 = var5_5;
                                                }
                                                try {
                                                    try {
                                                        if (var10_10 != null) break block64;
                                                        if (v20 != 0) {
                                                        }
                                                        ** GOTO lbl134
                                                    }
                                                    catch (MatchException v22) {
                                                        throw l.a(v22);
                                                    }
                                                    v20 = var5_5 | -16777216;
                                                }
                                                catch (MatchException v23) {
                                                    throw l.a(v23);
                                                }
                                            }
                                            var22_22 = v20;
                                            try {
                                                v24 = var0;
                                                v25 = var20_20;
                                                v26 = var21_21 + 1.0f;
                                                v27 = var17_17;
                                                v28 = var18_18;
                                                v29 = var19_19;
                                                v30 = var8_8 != false ? 4.0f : 7.0f;
                                            }
                                            catch (MatchException v31) {
                                                throw l.a(v31);
                                            }
                                            try {
                                                try {
                                                    b.b(v24, v25, v26, v27, v28, v29, v30, b.a(var22_22, 48));
                                                    b.a(var0, var20_20, var21_21, var17_17, var18_18, var19_19, b.a(b.a(-14671836, var22_22, 0.34f), 224), b.a(b.a(-15461350, var22_22, 0.22f), 224));
                                                    b.a(var0, var20_20, var21_21, var17_17, var18_18, var19_19, c.a(), b.a(b.a(var22_22, -1, 0.3f), 153));
                                                    if (var10_10 == null) break block65;
lbl134:
                                                    // 3 sources

                                                    v32 = var0;
                                                    v33 = var20_20;
                                                    v34 = var21_21 + 1.0f;
                                                    v35 = var17_17;
                                                    v36 = var18_18;
                                                    v37 = var19_19;
                                                    if (!var8_8) break block66;
                                                }
                                                catch (MatchException v38) {
                                                    throw l.a(v38);
                                                }
                                                v39 = 4.0f;
                                                break block67;
                                            }
                                            catch (MatchException v40) {
                                                throw l.a(v40);
                                            }
                                        }
                                        v39 = 6.0f;
                                    }
                                    b.b(v32, v33, v34, v35, v36, v37, v39, 0x40000000);
                                    b.a(var0, var20_20, var21_21, var17_17, var18_18, var19_19, -668983260, -669772774);
                                    b.a(var0, var20_20, var21_21, var17_17, var18_18, var19_19, c.a(), 0x33FFFFFF);
                                }
                                var22_23 = var20_20 + var11_11;
                                var23_24 = var21_21 + (var18_18 - 7.0f) / 2.0f;
                                try {
                                    try {
                                        try {
                                            block70: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var10_10 != null) break block68;
                                                            if (var5_5 == 0) break block69;
                                                        }
                                                        catch (MatchException v41) {
                                                            throw l.a(v41);
                                                        }
                                                        if (!var9_9) break block70;
                                                    }
                                                    catch (MatchException v42) {
                                                        throw l.a(v42);
                                                    }
                                                    b.a(var0, var22_23 + 0.5f, var21_21 + var18_18 / 2.0f - 2.0f, 4.0f, 4.0f, var5_5 | -16777216);
                                                    if (var10_10 == null) break block71;
                                                }
                                                catch (MatchException v43) {
                                                    throw l.a(v43);
                                                }
                                            }
                                            v44 = var0;
                                            v45 = var22_23 + 2.5f;
                                            v46 = var21_21;
                                            v47 = var18_18;
                                            if (var10_10 != null) break block72;
                                        }
                                        catch (MatchException v48) {
                                            throw l.a(v48);
                                        }
                                        v46 = v46 + v47 / 2.0f;
                                        if (!var8_8) break block73;
                                    }
                                    catch (MatchException v49) {
                                        throw l.a(v49);
                                    }
                                    v47 = 4.0f;
                                    break block72;
                                }
                                catch (MatchException v50) {
                                    throw l.a(v50);
                                }
                            }
                            v47 = 5.0f;
                        }
                        b.b(v44, v45, v46, v47, b.a(var5_5, 102));
                        b.a(var0, var22_23 + 2.5f, var21_21 + var18_18 / 2.0f, var13_13, var5_5 | -16777216);
                    }
                    var22_23 += var14_14;
                }
                try {
                    v51 = var0;
                    if (var10_10 != null) break block74;
                    e.a(v51, var3_3, var22_23, var23_24, -592136, true, false);
                }
                catch (MatchException v52) {
                    throw l.a(v52);
                }
            }
            try {
                if (var4_4 != null) {
                    e.a(var0, var4_4, var22_23 + var15_15 + var12_12, var23_24, -6645085, false, false);
                }
            }
            catch (MatchException v53) {
                throw l.a(v53);
            }
            v51 = var0;
        }
        try {
            v51.method_51448().popMatrix();
            if (i.n() != null) {
                b.b(new int[2]);
            }
        }
        catch (MatchException v54) {
            throw l.a(v54);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

