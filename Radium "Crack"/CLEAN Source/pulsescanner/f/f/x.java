/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.f;

import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.e;
import pulsescanner.i.g;

public class x
extends i {
    public final e l;
    public final g m;
    public final c n;
    public final c o;
    public final c p;
    private double q;
    private double r;
    private long s;
    private static final String[] t;

    public x() {
        String[] stringArray = t;
        super(stringArray[3], stringArray[8], pulsescanner.f.h.RENDER);
        this.l = this.a(new e(stringArray[6], stringArray[10], 67));
        this.m = this.a(new g(stringArray[11], stringArray[2], 4.0, 1.5, 30.0, 0.5, "x"));
        this.n = this.a(new c(stringArray[9], stringArray[0], true));
        this.o = this.a(new c(stringArray[4], stringArray[5], true));
        this.p = this.a(new c(stringArray[7], stringArray[1], true));
        this.q = 1.0;
        this.r = -1.0;
        this.s = System.nanoTime();
    }

    public boolean o() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.b() || !this.l.h()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw x.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw x.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private double p() {
        double d2;
        try {
            d2 = this.r > 0.0 ? this.r : (Double)this.m.a();
        }
        catch (MatchException matchException) {
            throw x.a(matchException);
        }
        return d2;
    }

    public float a(float f2) {
        double d2;
        double d3;
        block21: {
            block22: {
                double d4;
                i[] iArray;
                block20: {
                    block18: {
                        double d5;
                        boolean bl;
                        double d6;
                        block16: {
                            boolean bl2;
                            block17: {
                                long l2 = System.nanoTime();
                                d6 = Math.min(0.1, (double)(l2 - this.s) / 1.0E9);
                                iArray = pulsescanner.f.f.q.r();
                                this.s = l2;
                                bl2 = this.o();
                                try {
                                    try {
                                        bl = bl2;
                                        if (iArray != null) break block16;
                                        if (bl) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw x.a(matchException);
                                    }
                                    this.r = -1.0;
                                }
                                catch (MatchException matchException) {
                                    throw x.a(matchException);
                                }
                            }
                            bl = bl2;
                        }
                        try {
                            d5 = bl ? 1.0 / this.p() : 1.0;
                        }
                        catch (MatchException matchException) {
                            throw x.a(matchException);
                        }
                        d4 = d5;
                        try {
                            x x2;
                            block19: {
                                try {
                                    try {
                                        x2 = this;
                                        if (iArray != null) break block18;
                                        if (!((Boolean)x2.n.a()).booleanValue()) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw x.a(matchException);
                                    }
                                    this.q += (d4 - this.q) * (1.0 - Math.exp(-d6 * 14.0));
                                    if (iArray == null) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw x.a(matchException);
                                }
                            }
                            x2 = this;
                        }
                        catch (MatchException matchException) {
                            throw x.a(matchException);
                        }
                    }
                    x2.q = d4;
                }
                try {
                    try {
                        d3 = this.q;
                        d2 = d4;
                        if (iArray != null) break block21;
                        if (!(Math.abs(d3 - d2) < 1.0E-4)) break block22;
                    }
                    catch (MatchException matchException) {
                        throw x.a(matchException);
                    }
                    this.q = d4;
                }
                catch (MatchException matchException) {
                    throw x.a(matchException);
                }
            }
            d3 = f2;
            d2 = this.q;
        }
        return (float)(d3 * d2);
    }

    public boolean a(double d2) {
        double d3;
        double d4;
        block9: {
            try {
                block8: {
                    try {
                        try {
                            if (!this.o() || !((Boolean)this.o.a()).booleanValue()) break block8;
                        }
                        catch (MatchException matchException) {
                            throw x.a(matchException);
                        }
                        if (d2 != 0.0) break block9;
                    }
                    catch (MatchException matchException) {
                        throw x.a(matchException);
                    }
                }
                return false;
            }
            catch (MatchException matchException) {
                throw x.a(matchException);
            }
        }
        try {
            d4 = this.p();
            d3 = d2 > 0.0 ? 1.15 : 0.8695652173913044;
        }
        catch (MatchException matchException) {
            throw x.a(matchException);
        }
        double d5 = d4 * d3;
        this.r = Math.max(1.1, Math.min(60.0, d5));
        return true;
    }

    public double q() {
        block7: {
            try {
                block6: {
                    try {
                        try {
                            if (!this.b() || !((Boolean)this.p.a()).booleanValue()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw x.a(matchException);
                        }
                        if (!(this.q >= 0.999)) break block7;
                    }
                    catch (MatchException matchException) {
                        throw x.a(matchException);
                    }
                }
                return 1.0;
            }
            catch (MatchException matchException) {
                throw x.a(matchException);
            }
        }
        return this.q;
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
                var2_2 = "A-6>\u0006\u0005\u000b 90<\n\u0018\u0000gc6=G\u0010\u0000dc0&\u0013_\"S >?\u0002Q\u0003o6,6G\u0002\u000bn06'\u000e\u0007\u0007t:\u007f$\u000e\u0005\u0006 90<\n_\u0013Z,0>G\u001c\u000fg-65\u000e\u0012\u000ft*0=I\u0004Z,0>\rS -<\u000b\u001dNA'5&\u0014\u0005$M,* \u0002Q\u0019h&:?G\u0012\u0006a-86\u0014Q\u0014o,2s\u0010\u0019\u0007l&\u007f;\u0002\u001d\n.\bZ,0>G:\u000by\u0011L,(6\u0015Q=e-,:\u0013\u0018\u0018i7&&H,37G\u0010Nk&&s\u0013\u001eNz,0>G\u0018\u0000,c\u0010#\u0013\u0018(i-:s\u0014\u0005\u0017l&q\u0006S.0<\u0013\u0019";
                var4_3 = "A-6>\u0006\u0005\u000b 90<\n\u0018\u0000gc6=G\u0010\u0000dc0&\u0013_\"S >?\u0002Q\u0003o6,6G\u0002\u000bn06'\u000e\u0007\u0007t:\u007f$\u000e\u0005\u0006 90<\n_\u0013Z,0>G\u001c\u000fg-65\u000e\u0012\u000ft*0=I\u0004Z,0>\rS -<\u000b\u001dNA'5&\u0014\u0005$M,* \u0002Q\u0019h&:?G\u0012\u0006a-86\u0014Q\u0014o,2s\u0010\u0019\u0007l&\u007f;\u0002\u001d\n.\bZ,0>G:\u000by\u0011L,(6\u0015Q=e-,:\u0013\u0018\u0018i7&&H,37G\u0010Nk&&s\u0013\u001eNz,0>G\u0018\u0000,c\u0010#\u0013\u0018(i-:s\u0014\u0005\u0017l&q\u0006S.0<\u0013\u0019".length();
                var1_4 = 27;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 111;
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
                    var2_2 = "{\u001f\u0000\u0004t62\u0013\n\u0003\u000f9l\u0006u\u0011\u000f\u0014;0";
                    var4_3 = "{\u001f\u0000\u0004t62\u0013\n\u0003\u000f9l\u0006u\u0011\u000f\u0014;0".length();
                    var1_4 = 13;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 92;
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
                        v11 = 111;
                        break;
                    }
                    case 1: {
                        v11 = 44;
                        break;
                    }
                    case 2: {
                        v11 = 48;
                        break;
                    }
                    case 3: {
                        v11 = 60;
                        break;
                    }
                    case 4: {
                        v11 = 8;
                        break;
                    }
                    case 5: {
                        v11 = 30;
                        break;
                    }
                    default: {
                        v11 = 1;
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
        x.t = var5;
    }
}

