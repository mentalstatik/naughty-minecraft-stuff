/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_5498
 */
package pulsescanner.f.f;

import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5498;
import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;

public class g
extends i {
    public final pulsescanner.i.g l;
    public final c m;
    public final c n;
    private static final double o = 1.2;
    public float p;
    public float q;
    private double r;
    private double s;
    private double t;
    private double u;
    private double v;
    private double w;
    private boolean x;
    private class_5498 y;
    private boolean z;
    private static final String[] A;

    public g() {
        String[] stringArray = A;
        super(stringArray[1], stringArray[8], pulsescanner.f.h.RENDER);
        this.l = this.a(new pulsescanner.i.g(stringArray[3], stringArray[2], 10.0, 0.5, 200.0, 0.1, stringArray[6]));
        this.m = this.a(new c(stringArray[5], stringArray[4], true));
        this.n = this.a(new c(stringArray[9], stringArray[7], false));
        this.z = true;
    }

    public boolean o() {
        return this.x;
    }

    @Override
    protected void g() {
        try {
            if (this.m()) {
                this.p();
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
    }

    @Override
    protected void h() {
        try {
            if (this.x) {
                this.q();
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
    }

    @Override
    public void i() {
        double d2;
        double d3;
        double d4;
        double d5;
        block32: {
            block33: {
                class_310 class_3102;
                i[] iArray;
                block30: {
                    block31: {
                        block28: {
                            block29: {
                                block27: {
                                    g g2;
                                    block26: {
                                        block22: {
                                            block23: {
                                                block25: {
                                                    g g3;
                                                    block24: {
                                                        iArray = pulsescanner.f.f.q.r();
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        g2 = this;
                                                                        if (iArray != null) break block22;
                                                                        if (g2.m()) break block23;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g.a(matchException);
                                                                    }
                                                                    g3 = this;
                                                                    if (iArray != null) break block24;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw g.a(matchException);
                                                                }
                                                                if (!g3.x) break block25;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g.a(matchException);
                                                            }
                                                            g3 = this;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g.a(matchException);
                                                        }
                                                    }
                                                    g3.q();
                                                }
                                                return;
                                            }
                                            g2 = this;
                                        }
                                        try {
                                            try {
                                                if (iArray != null) break block26;
                                                if (g2.x) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw g.a(matchException);
                                            }
                                            g2 = this;
                                        }
                                        catch (MatchException matchException) {
                                            throw g.a(matchException);
                                        }
                                    }
                                    g2.p();
                                }
                                try {
                                    try {
                                        class_3102 = a;
                                        if (iArray != null) break block28;
                                        if (class_3102.field_1690.method_31044() != class_5498.field_26664) break block29;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                    g.a.field_1690.method_31043(class_5498.field_26665);
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                            }
                            this.u = this.r;
                            this.v = this.s;
                            this.w = this.t;
                            class_3102 = a;
                        }
                        try {
                            try {
                                if (iArray != null) break block30;
                                if (class_3102.field_1755 == null) break block31;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    class_3102 = a;
                }
                d5 = g.a(class_3102.field_1690.field_1894.method_1434(), g.a.field_1690.field_1881.method_1434());
                d4 = g.a(g.a.field_1690.field_1913.method_1434(), g.a.field_1690.field_1849.method_1434());
                d3 = g.a(g.a.field_1690.field_1903.method_1434(), g.a.field_1690.field_1832.method_1434());
                double d6 = Math.sqrt(d5 * d5 + d4 * d4);
                try {
                    d2 = d6;
                    if (iArray != null) break block32;
                    if (!(d2 > 1.0)) break block33;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                d5 /= d6;
                d4 /= d6;
            }
            d2 = (Double)this.l.a() / 20.0;
        }
        double d7 = d2;
        float f2 = this.p * ((float)Math.PI / 180);
        double d8 = class_3532.method_15374((double)f2);
        double d9 = class_3532.method_15362((double)f2);
        this.r += (-d8 * d5 + d9 * d4) * d7;
        this.t += (d9 * d5 + d8 * d4) * d7;
        this.s += d3 * d7;
    }

    private static double a(boolean bl, boolean bl2) {
        int n2;
        int n3;
        try {
            n3 = bl ? 1 : 0;
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        try {
            n2 = bl2 ? 1 : 0;
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        return n3 - n2;
    }

    private void p() {
        this.x = true;
        class_243 class_2432 = g.a.field_1724.method_33571();
        try {
            this.r = this.u = class_2432.field_1352;
            this.s = this.v = class_2432.field_1351;
            this.t = this.w = class_2432.field_1350;
            this.p = g.a.field_1724.method_36454();
            this.q = g.a.field_1724.method_36455();
            this.y = g.a.field_1690.method_31044();
            g.a.field_1690.method_31043(class_5498.field_26665);
            this.z = g.a.field_1730;
            g.a.field_1730 = false;
            if (g.a.field_1769 != null) {
                g.a.field_1769.method_3292();
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
    }

    private void q() {
        try {
            this.x = false;
            if (this.y != null) {
                g.a.field_1690.method_31043(this.y);
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        try {
            this.y = null;
            g.a.field_1730 = this.z;
            if (g.a.field_1769 != null) {
                g.a.field_1769.method_3292();
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
    }

    public void a(double d2, double d3) {
        int n2;
        float f2;
        float f3;
        try {
            this.p += (float)(d2 * 0.15);
            g g2 = this;
            g g3 = g2;
            f3 = g2.q;
            f2 = (float)(d3 * 0.15);
            n2 = (Boolean)this.n.a() != false ? -1 : 1;
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        g3.q = f3 + f2 * (float)n2;
        this.q = class_3532.method_15363((float)this.q, (float)-90.0f, (float)90.0f);
    }

    public boolean a(double d2) {
        block11: {
            double d3;
            pulsescanner.i.g g2;
            block10: {
                try {
                    try {
                        if (this.x && d2 != 0.0) break block10;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            try {
                g2 = this.l;
                d3 = d2 > 0.0 ? (Double)this.l.a() * 1.2 : (Double)this.l.a() / 1.2;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            try {
                try {
                    g2.a(d3);
                    if (!((Boolean)this.m.a()).booleanValue() || g.a.field_1724 == null) break block11;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                g.a.field_1724.method_7353((class_2561)class_2561.method_43470((String)(A[0] + this.l.j())), true);
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
        }
        return true;
    }

    public double a(float f2) {
        return class_3532.method_16436((double)f2, (double)this.u, (double)this.r);
    }

    public double b(float f2) {
        return class_3532.method_16436((double)f2, (double)this.v, (double)this.s);
    }

    public double c(float f2) {
        return class_3532.method_16436((double)f2, (double)this.w, (double)this.t);
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
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "18\raLZ;W9\u0018aJ_lW\u000718\raLZ;<?%\u001f$IZ%\u0003j\u001clJ\u001b5\u0016'\rvN\u001b0\u001b#\rw\u0001\u001b\u0005\u00148\u0007hC\u001b!\u001f#\u0004a\u000f]:\u000e#\u0006c\u000fO9W)\u0000eA\\3W#\u001c*\u0005$:\raK4$\"\u0007s\u000fO>\u0012j\u0006aX\u001b%\u0007/\r`\u000fZ4\u0018<\r$[S3W\"\u0007pMZ$W=\u0000aA\u001b/\u0018?HwLI9\u001b&F\n$\"\u0007s\u000fh&\u0012/\f\u0004W(Gw >$\u001ea]Ov\u0001/\u001apFX7\u001bj\u000beB^$\u0016j\u0005kY^;\u0012$\u001c*";
                var4_3 = "18\raLZ;W9\u0018aJ_lW\u000718\raLZ;<?%\u001f$IZ%\u0003j\u001clJ\u001b5\u0016'\rvN\u001b0\u001b#\rw\u0001\u001b\u0005\u00148\u0007hC\u001b!\u001f#\u0004a\u000f]:\u000e#\u0006c\u000fO9W)\u0000eA\\3W#\u001c*\u0005$:\raK4$\"\u0007s\u000fO>\u0012j\u0006aX\u001b%\u0007/\r`\u000fZ4\u0018<\r$[S3W\"\u0007pMZ$W=\u0000aA\u001b/\u0018?HwLI9\u001b&F\n$\"\u0007s\u000fh&\u0012/\f\u0004W(Gw >$\u001ea]Ov\u0001/\u001apFX7\u001bj\u000beB^$\u0016j\u0005kY^;\u0012$\u001c*".length();
                var1_4 = 15;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 51;
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
                    var2_2 = "dsDq\u000e\u0006f\u0002|\\<\u001f\u001cb\u0002~O>\u000f\u0000g\u0002hU8\u0016\u000b#[pH#Z\u001eoCfX#Z\u001dwCfNq\t\u001ajNs\u0013q)\rqMsQq\u000e\u0001#QoX4\u001eNvR?R#Z\u001doMh\u001d5\u0015\u0019m\f\fkqK4\b\u001a#rvI2\u0012";
                    var4_3 = "dsDq\u000e\u0006f\u0002|\\<\u001f\u001cb\u0002~O>\u000f\u0000g\u0002hU8\u0016\u000b#[pH#Z\u001eoCfX#Z\u001dwCfNq\t\u001ajNs\u0013q)\rqMsQq\u000e\u0001#QoX4\u001eNvR?R#Z\u001doMh\u001d5\u0015\u0019m\f\fkqK4\b\u001a#rvI2\u0012".length();
                    var1_4 = 85;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 102;
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
                        v11 = 68;
                        break;
                    }
                    case 1: {
                        v11 = 121;
                        break;
                    }
                    case 2: {
                        v11 = 91;
                        break;
                    }
                    case 3: {
                        v11 = 55;
                        break;
                    }
                    case 4: {
                        v11 = 28;
                        break;
                    }
                    case 5: {
                        v11 = 8;
                        break;
                    }
                    default: {
                        v11 = 101;
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
        g.A = var5;
    }
}

