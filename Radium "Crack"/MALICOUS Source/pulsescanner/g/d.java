/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 */
package pulsescanner.g;

import java.util.List;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import pulsescanner.g.b;
import pulsescanner.g.k;
import pulsescanner.g.m;
import pulsescanner.g.n;

public final class d {
    private d() {
    }

    /*
     * Unable to fully structure code
     */
    public static void a(class_4587 var0, class_4184 var1_1, List<m> var2_2, n var3_3) {
        var4_4 = b.c();
        try {
            if (var2_2.isEmpty()) {
                return;
            }
        }
        catch (MatchException v0) {
            throw d.a(v0);
        }
        var5_5 = class_310.method_1551();
        var6_6 = var1_1.method_71156();
        var7_7 = var0.method_23760();
        var8_8 = k.b(var3_3.aZ());
        var9_9 = k.a(var3_3.aZ());
        var10_10 = var3_3.aU() * Math.max(1.0f, (float)var5_5.method_22683().method_4506() / 1080.0f);
        var11_11 = class_243.method_1030((float)var1_1.method_19329(), (float)var1_1.method_19330());
        var12_12 = var2_2.iterator();
        while (var12_12.hasNext()) {
            v1 = var12_12.next();
            if (var4_4 == null) {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                block39: {
                                    block40: {
                                        var13_13 = v1;
                                        var14_14 = d.a(var13_13, var6_6);
                                        var15_15 = Math.max(1.0f, var10_10 * var14_14);
                                        try {
                                            v2 = var3_3;
                                            if (var4_4 != null) break block39;
                                            if (v2.aV() <= 0) break block40;
                                        }
                                        catch (MatchException v3) {
                                            throw d.a(v3);
                                        }
                                        var16_16 = b.a(var13_13.aT(), var3_3.aV());
                                        var17_18 = b.a(var13_13.aT(), Math.min(255, (int)((float)var3_3.aV() * 1.5f)));
                                        for (class_238 var19_20 : var13_13.aR()) {
                                            try {
                                                if (var4_4 == null) {
                                                    k.a(var7_7, var8_8, var19_20.method_989(-var6_6.field_1352, -var6_6.field_1351, -var6_6.field_1350), var16_16, var17_18);
                                                    if (var4_4 == null) continue;
                                                    break;
                                                }
                                                break block41;
                                            }
                                            catch (MatchException v4) {
                                                throw d.a(v4);
                                            }
                                        }
                                    }
                                    v2 = var3_3;
                                }
                                try {
                                    try {
                                        if (var4_4 != null) break block42;
                                        if (!v2.aW()) break block41;
                                    }
                                    catch (MatchException v5) {
                                        throw d.a(v5);
                                    }
                                    d.a(var7_7, var9_9, var13_13.aQ(), var6_6, b.a(b.b(var13_13.aT(), -150), 115), var15_15 + 1.0f);
                                }
                                catch (MatchException v6) {
                                    throw d.a(v6);
                                }
                            }
                            v2 = var3_3;
                        }
                        try {
                            try {
                                if (var4_4 != null) break block43;
                                if (!v2.aY()) break block44;
                            }
                            catch (MatchException v7) {
                                throw d.a(v7);
                            }
                            v2 = var3_3;
                        }
                        catch (MatchException v8) {
                            throw d.a(v8);
                        }
                    }
                    try {
                        if (v2.aW()) {
                            d.a(var7_7, var9_9, var11_11, var13_13, var6_6, b.a(b.b(var13_13.aT(), -150), 85), var10_10 * 0.6f + 1.0f);
                        }
                    }
                    catch (MatchException v9) {
                        throw d.a(v9);
                    }
                }
                if (var4_4 == null) continue;
            }
            ** GOTO lbl-1000
        }
        for (m v1 : var2_2) lbl-1000:
        // 2 sources

        {
            block49: {
                block48: {
                    block47: {
                        block45: {
                            block46: {
                                var13_13 = v1;
                                var14_14 = d.a(var13_13, var6_6);
                                var15_15 = Math.max(1.0f, var10_10 * var14_14);
                                var16_17 = var13_13.aS().method_1005().method_1022(var6_6);
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var4_4 != null) break block45;
                                                if (!var3_3.aX()) break block46;
                                            }
                                            catch (MatchException v10) {
                                                throw d.a(v10);
                                            }
                                            cfr_temp_0 = var16_17 - 40.0;
                                            v11 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                            if (var4_4 != null) break block47;
                                        }
                                        catch (MatchException v12) {
                                            throw d.a(v12);
                                        }
                                        if (v11 >= 0) break block46;
                                    }
                                    catch (MatchException v13) {
                                        throw d.a(v13);
                                    }
                                    d.a(var7_7, var9_9, var13_13.aQ(), var6_6, b.a(var13_13.aT(), (int)(42.0 * (1.0 - var16_17 / 40.0))), var15_15 * 3.5f);
                                }
                                catch (MatchException v14) {
                                    throw d.a(v14);
                                }
                            }
                            try {
                                v15 = var7_7;
                                if (var4_4 != null) break block48;
                                d.a(v15, var9_9, var13_13.aQ(), var6_6, b.a(var13_13.aT(), 242), var15_15);
                            }
                            catch (MatchException v16) {
                                throw d.a(v16);
                            }
                        }
                        v11 = var3_3.aY();
                    }
                    if (v11 == 0) break block49;
                    v15 = var7_7;
                }
                d.a(v15, var9_9, var11_11, var13_13, var6_6, b.a(var13_13.aT(), 204), var10_10 * 0.6f);
            }
            if (var4_4 == null) continue;
        }
    }

    private static float a(m m2, class_243 class_2432) {
        double d2 = m2.aS().method_1005().method_1022(class_2432);
        return (float)Math.max(0.25, Math.min(1.0, 8.0 / Math.max(1.0, d2)));
    }

    private static void a(class_4587.class_4665 class_46652, class_4588 class_45882, double[] dArray, class_243 class_2432, int n2, float f2) {
        try {
            for (int i2 = 0; i2 < dArray.length; i2 += 6) {
                k.a(class_46652, class_45882, (float)(dArray[i2] - class_2432.field_1352), (float)(dArray[i2 + 1] - class_2432.field_1351), (float)(dArray[i2 + 2] - class_2432.field_1350), (float)(dArray[i2 + 3] - class_2432.field_1352), (float)(dArray[i2 + 4] - class_2432.field_1351), (float)(dArray[i2 + 5] - class_2432.field_1350), n2, f2);
            }
        }
        catch (MatchException matchException) {
            throw d.a(matchException);
        }
    }

    private static void a(class_4587.class_4665 class_46652, class_4588 class_45882, class_243 class_2432, m m2, class_243 class_2433, int n2, float f2) {
        class_243 class_2434 = m2.aS().method_1005().method_1020(class_2433);
        k.a(class_46652, class_45882, (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350, n2, f2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

