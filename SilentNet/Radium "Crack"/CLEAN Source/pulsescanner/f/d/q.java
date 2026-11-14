/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_332
 *  net.minecraft.class_742
 *  net.minecraft.class_7532
 *  net.minecraft.class_8685
 */
package pulsescanner.f.d;

import java.util.Locale;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_7532;
import net.minecraft.class_8685;
import pulsescanner.d.f;
import pulsescanner.f.d.a;
import pulsescanner.f.j;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.i.c;

public class q
extends j {
    public final c x;
    private static final float C = 126.0f;
    private static final float D = 36.0f;
    private static final float E = 6.0f;
    private static final float F = 24.0f;
    private float G;
    private float H;
    private class_1309 I;
    private static final String[] J;

    public q() {
        String[] stringArray = J;
        super(stringArray[0], stringArray[3], 1, 1, 0.0f, 50.0f);
        this.x = this.a(new c(stringArray[2], stringArray[5], true));
        this.G = -1.0f;
    }

    private class_1309 w() {
        class_1309 class_13092;
        block2: {
            class_13092 = pulsescanner.d.f.i();
            try {
                if (class_13092 != null || !(pulsescanner.f.d.q.a.field_1755 instanceof pulsescanner.c.f)) break block2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.q.a(matchException);
            }
            class_13092 = pulsescanner.f.d.q.a.field_1724;
        }
        return class_13092;
    }

    @Override
    public void r() {
        this.A = 126.0f;
        this.B = 36.0f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void b(class_332 var1_1, float var2_2) {
        block54: {
            block55: {
                block51: {
                    block52: {
                        block53: {
                            block49: {
                                block50: {
                                    block47: {
                                        block46: {
                                            block44: {
                                                block45: {
                                                    block43: {
                                                        block42: {
                                                            block41: {
                                                                var4_3 = this.w();
                                                                var3_4 = pulsescanner.f.d.a.b();
                                                                try {
                                                                    v0 = this;
                                                                    v1 = this.H;
                                                                    v2 = var4_3 != null ? 1.0f : 0.0f;
                                                                }
                                                                catch (MatchException v3) {
                                                                    throw pulsescanner.f.d.q.a(v3);
                                                                }
                                                                try {
                                                                    v0.H = pulsescanner.j.a.a(v1, v2, 14.0f);
                                                                    v4 = var4_3;
                                                                    if (var3_4 == null) break block41;
                                                                    if (v4 == null) break block42;
                                                                }
                                                                catch (MatchException v5) {
                                                                    throw pulsescanner.f.d.q.a(v5);
                                                                }
                                                                v4 = var4_3;
                                                            }
                                                            try {
                                                                if (v4 != this.I) {
                                                                    this.I = var4_3;
                                                                    this.G = -1.0f;
                                                                }
                                                            }
                                                            catch (MatchException v6) {
                                                                throw pulsescanner.f.d.q.a(v6);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v7 = this;
                                                                if (var3_4 == null) break block43;
                                                                if (!(v7.H < 0.01f)) {
                                                                }
                                                                ** GOTO lbl48
                                                            }
                                                            catch (MatchException v8) {
                                                                throw pulsescanner.f.d.q.a(v8);
                                                            }
                                                            v7 = this;
                                                        }
                                                        catch (MatchException v9) {
                                                            throw pulsescanner.f.d.q.a(v9);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var3_4 == null) break block44;
                                                            if (v7.I != null) break block45;
                                                        }
                                                        catch (MatchException v10) {
                                                            throw pulsescanner.f.d.q.a(v10);
                                                        }
lbl48:
                                                        // 2 sources

                                                        return;
                                                    }
                                                    catch (MatchException v11) {
                                                        throw pulsescanner.f.d.q.a(v11);
                                                    }
                                                }
                                                v7 = this;
                                            }
                                            var5_5 = v7.I;
                                            var6_6 = pulsescanner.g.b.a;
                                            pulsescanner.g.b.a = var6_6 * this.H;
                                            var1_1.method_51448().pushMatrix();
                                            var7_7 = 0.92f + 0.08f * this.H;
                                            var1_1.method_51448().translate(this.y + 63.0f, this.z + 18.0f);
                                            var1_1.method_51448().scale(var7_7, var7_7);
                                            var1_1.method_51448().translate(-(this.y + 63.0f), -(this.z + 18.0f));
                                            pulsescanner.d.c.a(var1_1, this.y, this.z, 126.0f, 36.0f);
                                            var8_8 = this.y + 6.0f;
                                            var9_9 = this.z + 6.0f;
                                            try {
                                                if (var3_4 == null) break block46;
                                                if (var5_5 instanceof class_742) {
                                                }
                                                ** GOTO lbl80
                                            }
                                            catch (MatchException v12) {
                                                throw pulsescanner.f.d.q.a(v12);
                                            }
                                            var10_10 = (class_742)var5_5;
                                            try {
                                                class_7532.method_52722((class_332)var1_1, (class_8685)var10_10.method_52814(), (int)Math.round(var8_8), (int)Math.round(var9_9), (int)24);
                                                if (var3_4 != null) break block47;
lbl80:
                                                // 2 sources

                                                pulsescanner.g.b.a(var1_1, var8_8, var9_9, 24.0f, 24.0f, 4.0f, pulsescanner.g.b.a(0xFFFFFF, 26));
                                            }
                                            catch (MatchException v13) {
                                                throw pulsescanner.f.d.q.a(v13);
                                            }
                                        }
                                        var11_12 = var5_5.method_5477().getString().substring(0, 1).toUpperCase(Locale.ROOT);
                                        pulsescanner.g.e.a(var1_1, var11_12, var8_8 + (24.0f - (float)pulsescanner.g.e.b(var11_12)) / 2.0f, var9_9 + 8.0f, pulsescanner.d.c.d(), true, false);
                                    }
                                    var10_11 = var8_8 + 24.0f + 6.0f;
                                    var11_13 = this.y + 126.0f - 6.0f - var10_11;
                                    var12_14 = var5_5.method_5477().getString();
                                    while ((float)pulsescanner.g.e.b(var12_14) > var11_13) {
                                        block48: {
                                            try {
                                                try {
                                                    v14 = var12_14;
                                                    if (var3_4 == null) break block48;
                                                    if (v14.length() <= 3) break;
                                                }
                                                catch (MatchException v15) {
                                                    throw pulsescanner.f.d.q.a(v15);
                                                }
                                                v14 = var12_14.substring(0, var12_14.length() - 1);
                                            }
                                            catch (MatchException v16) {
                                                throw pulsescanner.f.d.q.a(v16);
                                            }
                                        }
                                        var12_14 = v14;
                                        if (var3_4 != null) continue;
                                    }
                                    pulsescanner.d.c.b(var1_1, var12_14, var10_11, this.z + 6.0f + 1.0f, pulsescanner.d.c.d());
                                    var13_15 = Math.max(1.0f, var5_5.method_6063());
                                    var14_16 = Math.max(0.0f, var5_5.method_6032() + var5_5.method_6067());
                                    try {
                                        try {
                                            if (var3_4 == null) break block49;
                                            if (!(this.G < 0.0f)) break block50;
                                        }
                                        catch (MatchException v17) {
                                            throw pulsescanner.f.d.q.a(v17);
                                        }
                                        this.G = var14_16;
                                    }
                                    catch (MatchException v18) {
                                        throw pulsescanner.f.d.q.a(v18);
                                    }
                                }
                                this.G = pulsescanner.j.a.a(this.G, var14_16, 8.0f);
                            }
                            var19_17 = pulsescanner.f.d.q.J;
                            var15_18 = String.format(Locale.ROOT, var19_17[1], new Object[]{Float.valueOf(var14_16)});
                            try {
                                try {
                                    try {
                                        if (var3_4 == null) break block51;
                                        if (!((Boolean)this.x.a()).booleanValue()) break block52;
                                    }
                                    catch (MatchException v19) {
                                        throw pulsescanner.f.d.q.a(v19);
                                    }
                                    v20 = pulsescanner.f.d.q.a.field_1724;
                                    if (var3_4 == null) break block53;
                                }
                                catch (MatchException v21) {
                                    throw pulsescanner.f.d.q.a(v21);
                                }
                                if (v20 == null) break block52;
                            }
                            catch (MatchException v22) {
                                throw pulsescanner.f.d.q.a(v22);
                            }
                            v20 = var5_5;
                        }
                        if (v20 != pulsescanner.f.d.q.a.field_1724) {
                            var15_18 = var15_18 + String.format(Locale.ROOT, pulsescanner.f.d.q.J[4], new Object[]{Float.valueOf(pulsescanner.f.d.q.a.field_1724.method_5739((class_1297)var5_5))});
                        }
                    }
                    pulsescanner.d.c.a(var1_1, var15_18, var10_11, this.z + 6.0f + 11.0f, pulsescanner.d.c.c());
                }
                var16_19 = this.z + 36.0f - 6.0f - 3.0f;
                pulsescanner.g.b.a(var1_1, var10_11, var16_19, var11_13, 3.0f, 1.5f, pulsescanner.g.b.a(0xFFFFFF, 30));
                var17_20 = Math.min(1.0f, this.G / var13_15);
                var18_21 = pulsescanner.g.b.a(-38037, pulsescanner.d.c.e(), Math.min(1.0f, var17_20 * 1.4f));
                try {
                    try {
                        if (var3_4 == null) break block54;
                        if (!(var17_20 > 0.0f)) break block55;
                    }
                    catch (MatchException v23) {
                        throw pulsescanner.f.d.q.a(v23);
                    }
                    pulsescanner.g.b.a(var1_1, var10_11, var16_19, Math.max(3.0f, var11_13 * var17_20), 3.0f, 1.5f, var18_21);
                }
                catch (MatchException v24) {
                    throw pulsescanner.f.d.q.a(v24);
                }
            }
            var1_1.method_51448().popMatrix();
            pulsescanner.g.b.a = var6_6;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "\u0018\u0015M{Pn>\u0004!{\u0007iZ\u000ez\u0015RN\b\b\u001dLhTt})&\u0005\u001aYs\u0015{|#\u0001K<Ar{l\u0011Qh\\ngl\rPi\u0012h{l\u0012V{]nw\"\u0013\u0011";
                var4_3 = "\u0018\u0015M{Pn>\u0004!{\u0007iZ\u000ez\u0015RN\b\b\u001dLhTt})&\u0005\u001aYs\u0015{|#\u0001K<Ar{l\u0011Qh\\ngl\rPi\u0012h{l\u0012V{]nw\"\u0013\u0011".length();
                var1_4 = 10;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 88;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = ".\u0016XpF>1\u001c]^\u0012)W<5}B\u001c0\u0014=|zY]*\u001f=|zW\u000f9\u0012,r";
                    var4_3 = ".\u0016XpF>1\u001c]^\u0012)W<5}B\u001c0\u0014=|zY]*\u001f=|zW\u000f9\u0012,r".length();
                    var1_4 = 7;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 26;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block19;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v0;
            v8 = v6;
            v9 = v6.length;
            var6_6 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v11 = 20;
                        break;
                    }
                    case 1: {
                        v11 = 44;
                        break;
                    }
                    case 2: {
                        v11 = 103;
                        break;
                    }
                    case 3: {
                        v11 = 68;
                        break;
                    }
                    case 4: {
                        v11 = 109;
                        break;
                    }
                    case 5: {
                        v11 = 66;
                        break;
                    }
                    default: {
                        v11 = 70;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl71:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl79:
                // 1 sources

                ** continue;
            }
        }
        pulsescanner.f.d.q.J = var5;
    }
}

