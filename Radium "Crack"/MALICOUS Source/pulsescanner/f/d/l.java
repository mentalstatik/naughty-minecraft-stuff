/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_315
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import net.minecraft.class_304;
import net.minecraft.class_315;
import net.minecraft.class_332;
import pulsescanner.d.f;
import pulsescanner.f.d.a;
import pulsescanner.f.j;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.i.c;

public class l
extends j {
    public final c x;
    public final c C;
    public final c D;
    private static final float E = 20.0f;
    private static final float F = 2.0f;
    private final float[] G;
    private static final String[] H;

    public l() {
        String[] stringArray = H;
        super(stringArray[8], stringArray[2], 2, 2, 4.0f, 4.0f);
        this.x = this.a(new c(stringArray[3], stringArray[6], true));
        this.C = (c)this.a(new c(stringArray[1], stringArray[10], true)).a(this.x::a);
        this.D = this.a(new c(stringArray[0], stringArray[4], true));
        this.G = new float[7];
    }

    @Override
    public void r() {
        try {
            this.A = 64.0f;
            this.B = 42.0f;
            if (((Boolean)this.x.a()).booleanValue()) {
                this.B += 22.0f;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.l.a(matchException);
        }
        try {
            if (((Boolean)this.D.a()).booleanValue()) {
                this.B += 12.0f;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.l.a(matchException);
        }
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        class_315 class_3152 = pulsescanner.f.d.l.a.field_1690;
        float f3 = this.z;
        this.a(class_3322, 0, class_3152.field_1894, "W", this.y + 20.0f + 2.0f, f3, 20.0f, 20.0f, null);
        this.a(class_3322, 1, class_3152.field_1913, "A", this.y, f3 += 22.0f, 20.0f, 20.0f, null);
        this.a(class_3322, 2, class_3152.field_1881, "S", this.y + 20.0f + 2.0f, f3, 20.0f, 20.0f, null);
        this.a(class_3322, 3, class_3152.field_1849, "D", this.y + 44.0f, f3, 20.0f, 20.0f, null);
        f3 += 22.0f;
        if (((Boolean)this.x.a()).booleanValue()) {
            String string;
            float f4;
            float f5;
            float f6;
            float f7;
            String string2;
            class_304 class_3042;
            int n2;
            class_332 class_3323;
            l l2;
            String string3;
            float f8;
            float f9;
            float f10;
            float f11;
            String string4;
            class_304 class_3043;
            int n3;
            class_332 class_3324;
            l l3;
            float f12 = (this.A - 2.0f) / 2.0f;
            try {
                l3 = this;
                class_3324 = class_3322;
                n3 = 4;
                class_3043 = class_3152.field_1886;
                string4 = H[11];
                f11 = this.y;
                f10 = f3;
                f9 = f12;
                f8 = 20.0f;
                string3 = (Boolean)this.C.a() != false ? pulsescanner.d.f.a() + H[5] : null;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.l.a(matchException);
            }
            try {
                l3.a(class_3324, n3, class_3043, string4, f11, f10, f9, f8, string3);
                l2 = this;
                class_3323 = class_3322;
                n2 = 5;
                class_3042 = class_3152.field_1904;
                string2 = H[9];
                f7 = this.y + f12 + 2.0f;
                f6 = f3;
                f5 = f12;
                f4 = 20.0f;
                string = (Boolean)this.C.a() != false ? pulsescanner.d.f.b() + H[7] : null;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.l.a(matchException);
            }
            l2.a(class_3323, n2, class_3042, string2, f7, f6, f5, f4, string);
            f3 += 22.0f;
        }
        try {
            if (((Boolean)this.D.a()).booleanValue()) {
                this.a(class_3322, 6, class_3152.field_1903, null, this.y, f3, this.A, 10.0f, null);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.l.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(class_332 var1_1, int var2_2, class_304 var3_3, String var4_4, float var5_5, float var6_6, float var7_7, float var8_8, String var9_9) {
        block36: {
            block35: {
                block34: {
                    block33: {
                        block31: {
                            block32: {
                                block28: {
                                    block29: {
                                        block30: {
                                            block26: {
                                                block27: {
                                                    var10_10 = pulsescanner.f.d.a.b();
                                                    try {
                                                        v0 = this.G;
                                                        v1 = var2_2;
                                                        v2 = this.G[var2_2];
                                                        v3 = var3_3.method_1434() != false ? 1.0f : 0.0f;
                                                    }
                                                    catch (MatchException v4) {
                                                        throw pulsescanner.f.d.l.a(v4);
                                                    }
                                                    v0[v1] = pulsescanner.j.a.a(v2, v3, 18.0f);
                                                    var11_11 = this.G[var2_2];
                                                    var12_12 = pulsescanner.f.m.a(pulsescanner.f.b.c.class);
                                                    var13_13 = Math.min(pulsescanner.d.c.b(), var8_8 / 2.0f);
                                                    try {
                                                        try {
                                                            pulsescanner.d.c.a(var1_1, var5_5, var6_6, var7_7, var8_8);
                                                            v5 = ((Boolean)var12_12.m.a()).booleanValue();
                                                            if (var10_10 == null) break block26;
                                                            if (v5 != 0) break block27;
                                                        }
                                                        catch (MatchException v6) {
                                                            throw pulsescanner.f.d.l.a(v6);
                                                        }
                                                        pulsescanner.g.b.a(var1_1, var5_5, var6_6, var7_7, var8_8, var13_13, 0.6f, pulsescanner.g.b.a(0xFFFFFF, 40));
                                                    }
                                                    catch (MatchException v7) {
                                                        throw pulsescanner.f.d.l.a(v7);
                                                    }
                                                }
                                                v5 = (cfr_temp_0 = var11_11 - 0.01f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var10_10 == null) break block28;
                                                        if (v5 <= 0) break block29;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw pulsescanner.f.d.l.a(v8);
                                                    }
                                                    if (!((Boolean)var12_12.q.a()).booleanValue()) break block30;
                                                }
                                                catch (MatchException v9) {
                                                    throw pulsescanner.f.d.l.a(v9);
                                                }
                                                pulsescanner.g.f.a(var1_1, var5_5, var6_6, var7_7, var8_8, var13_13, 6.0f, 1.6f * var11_11, 0xFFFFFF);
                                            }
                                            catch (MatchException v10) {
                                                throw pulsescanner.f.d.l.a(v10);
                                            }
                                        }
                                        pulsescanner.g.b.a(var1_1, var5_5, var6_6, var7_7, var8_8, var13_13, pulsescanner.g.b.a(pulsescanner.d.c.e(), 0.85f * var11_11));
                                    }
                                    v5 = pulsescanner.g.b.a(pulsescanner.d.c.d(), -15461354, var11_11);
                                }
                                var14_14 = v5;
                                try {
                                    v11 = var4_4;
                                    if (var10_10 == null) break block31;
                                    if (v11 != null) break block32;
                                }
                                catch (MatchException v12) {
                                    throw pulsescanner.f.d.l.a(v12);
                                }
                                var15_15 = var7_7 * 0.4f;
                                pulsescanner.g.b.a(var1_1, var5_5 + (var7_7 - var15_15) / 2.0f, var6_6 + var8_8 / 2.0f - 0.75f, var15_15, 1.5f, 0.75f, var14_14);
                                return;
                            }
                            v11 = var9_9;
                        }
                        try {
                            try {
                                try {
                                    if (v11 == null) {
                                        v13 = var1_1;
                                        v14 = var4_4;
                                        v15 = var5_5 + (var7_7 - (float)pulsescanner.g.e.a(var4_4)) / 2.0f;
                                        v16 = var6_6 + (var8_8 - (float)pulsescanner.g.e.e()) / 2.0f;
                                        v17 = var14_14;
                                        v18 = false;
                                        v19 = pulsescanner.d.c.f();
                                        if (var10_10 == null) break block33;
                                    }
                                    ** GOTO lbl104
                                }
                                catch (MatchException v20) {
                                    throw pulsescanner.f.d.l.a(v20);
                                }
                                if (!v19) break block34;
                            }
                            catch (MatchException v21) {
                                throw pulsescanner.f.d.l.a(v21);
                            }
                            cfr_temp_1 = var11_11 - 0.5f;
                            v19 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                        }
                        catch (MatchException v22) {
                            throw pulsescanner.f.d.l.a(v22);
                        }
                    }
                    try {
                        if (var10_10 == null) break block35;
                        if (v19 >= false) break block34;
                    }
                    catch (MatchException v23) {
                        throw pulsescanner.f.d.l.a(v23);
                    }
                    v19 = true;
                    break block35;
                }
                v19 = false;
            }
            try {
                pulsescanner.g.e.a(v13, v14, v15, v16, v17, v18, v19);
                if (var10_10 != null) break block36;
lbl104:
                // 2 sources

                var1_1.method_51448().pushMatrix();
                pulsescanner.g.e.a(var1_1, var4_4, var5_5 + (var7_7 - (float)pulsescanner.g.e.a(var4_4)) / 2.0f, var6_6 + 3.0f, var14_14, false, false);
                var1_1.method_51448().translate(var5_5 + var7_7 / 2.0f, var6_6 + 12.5f);
                var1_1.method_51448().scale(0.65f, 0.65f);
                pulsescanner.g.e.a(var1_1, var9_9, (float)(-pulsescanner.g.e.a(var9_9)) / 2.0f, 0.0f, pulsescanner.g.b.a(var14_14, 0.75f), false, false);
                var1_1.method_51448().popMatrix();
            }
            catch (MatchException v24) {
                throw pulsescanner.f.d.l.a(v24);
            }
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
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "\u001fU0\u0017vhq-W\u0003\u000fu\u0002$\u001fM>\u0003`hJ#P#T~'E)H4\u001aghX)\\\"Tr&WlF=\u001dp#@b\r\u0001J$\u0007vhq9Q%\u001b};\u0012\u001fM>\u00033<[)\u0005;\u0001~8\u0013'@(Z\u0004lf\u0001'\u000f\u001fM>\u00033\u0004~\u000e\u0005~TA\u0005qb\u0004lf\u0001'\n\u0007@(\u0007g:\\'@\"\u0003\u001eh\u0013";
                var4_3 = "\u001fU0\u0017vhq-W\u0003\u000fu\u0002$\u001fM>\u0003`hJ#P#T~'E)H4\u001aghX)\\\"Tr&WlF=\u001dp#@b\r\u0001J$\u0007vhq9Q%\u001b};\u0012\u001fM>\u00033<[)\u0005;\u0001~8\u0013'@(Z\u0004lf\u0001'\u000f\u001fM>\u00033\u0004~\u000e\u0005~TA\u0005qb\u0004lf\u0001'\n\u0007@(\u0007g:\\'@\"\u0003\u001eh\u0013".length();
                var1_4 = 9;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 109;
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
                    var2_2 = "b0C~NV\"X;GzNE+Cx_l\rZ UxCgNX!D+I)\f@:E7Bz@\u0003}\u0015n";
                    var4_3 = "b0C~NV\"X;GzNE+Cx_l\rZ UxCgNX!D+I)\f@:E7Bz@\u0003}\u0015n".length();
                    var1_4 = 40;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 16;
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
                        v11 = 33;
                        break;
                    }
                    case 1: {
                        v11 = 72;
                        break;
                    }
                    case 2: {
                        v11 = 60;
                        break;
                    }
                    case 3: {
                        v11 = 25;
                        break;
                    }
                    case 4: {
                        v11 = 126;
                        break;
                    }
                    case 5: {
                        v11 = 37;
                        break;
                    }
                    default: {
                        v11 = 94;
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
        pulsescanner.f.d.l.H = var5;
    }
}

