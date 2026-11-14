/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_6606
 */
package pulsescanner.f.a.a;

import java.util.BitSet;
import java.util.List;
import net.minecraft.class_6606;
import pulsescanner.f.a.a.b;
import pulsescanner.f.a.a.c;
import pulsescanner.f.a.a.e;

public final class d {
    private static final int a = 2048;

    private d() {
    }

    public static b a(byte[] byArray) {
        block14: {
            b b2;
            try {
                if (byArray == null || byArray.length != 2048) break block14;
            }
            catch (MatchException matchException) {
                throw d.a(matchException);
            }
            boolean bl = true;
            boolean bl2 = true;
            for (byte by : byArray) {
                if (by != 0) {
                    bl = false;
                }
                if (by != -1) {
                    bl2 = false;
                }
                try {
                    try {
                        if (bl || bl2) continue;
                    }
                    catch (MatchException matchException) {
                        throw d.a(matchException);
                    }
                    return b.NORMAL;
                }
                catch (MatchException matchException) {
                    throw d.a(matchException);
                }
            }
            try {
                if (bl) {
                    return b.ZEROED_PRESENT;
                }
            }
            catch (MatchException matchException) {
                throw d.a(matchException);
            }
            try {
                b2 = bl2 ? b.UNIFORM_MAX : b.NORMAL;
            }
            catch (MatchException matchException) {
                throw d.a(matchException);
            }
            return b2;
        }
        return b.UNKNOWN;
    }

    public static void a(class_6606 class_66062, c c2, long l2) {
        d.a(class_66062.method_38608(), class_66062.method_38609(), class_66062.method_38610(), c2.e, c2.g, c2.i, l2);
        d.a(class_66062.method_38601(), class_66062.method_38604(), class_66062.method_38606(), c2.f, c2.h, c2.j, l2);
    }

    /*
     * Unable to fully structure code
     */
    private static void a(BitSet var0, BitSet var1_1, List<byte[]> var2_2, b[] var3_3, e[] var4_4, long[] var5_5, long var6_6) {
        var9_7 = 0;
        var10_8 = var3_3.length;
        var8_10 = b.e();
        for (var11_9 = 0; var11_9 < var10_8; ++var11_9) {
            block24: {
                block23: {
                    block18: {
                        block21: {
                            block22: {
                                block20: {
                                    block19: {
                                        try {
                                            try {
                                                try {
                                                    v0 = var0;
                                                    v1 = var11_9;
                                                    if (var8_10 != 0) break block18;
                                                    if (v0.get(v1)) {
                                                    }
                                                    ** GOTO lbl46
                                                }
                                                catch (MatchException v2) {
                                                    throw d.a(v2);
                                                }
                                                if (var9_7 >= var2_2.size()) break block19;
                                            }
                                            catch (MatchException v3) {
                                                throw d.a(v3);
                                            }
                                            v4 = var2_2.get(var9_7);
                                            break block20;
                                        }
                                        catch (MatchException v5) {
                                            throw d.a(v5);
                                        }
                                    }
                                    v4 = null;
                                }
                                var12_11 = v4;
                                try {
                                    try {
                                        if (var8_10 != 0) break block21;
                                        ++var9_7;
                                        var3_3[var11_9] = d.a(var12_11);
                                        if (var4_4 == null) break block22;
                                    }
                                    catch (MatchException v6) {
                                        throw d.a(v6);
                                    }
                                    var4_4[var11_9] = e.a(var12_11);
                                }
                                catch (MatchException v7) {
                                    throw d.a(v7);
                                }
                            }
                            var5_5[var11_9] = var6_6;
                        }
                        try {
                            if (var8_10 == 0) continue;
lbl46:
                            // 2 sources

                            v0 = var1_1;
                            v1 = var11_9;
                        }
                        catch (MatchException v8) {
                            throw d.a(v8);
                        }
                    }
                    try {
                        try {
                            if (!v0.get(v1)) continue;
                            var3_3[var11_9] = b.EMPTY_MASK;
                            v9 = var4_4;
                            if (var8_10 != 0) break block23;
                        }
                        catch (MatchException v10) {
                            throw d.a(v10);
                        }
                        if (v9 == null) break block24;
                    }
                    catch (MatchException v11) {
                        throw d.a(v11);
                    }
                    v9 = var4_4;
                }
                v9[var11_9] = e.a();
            }
            var5_5[var11_9] = var6_6;
            if (var8_10 == 0) continue;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

