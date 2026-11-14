/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.g;

import pulsescanner.f.g.d;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.g;

public class e
extends i {
    public final g l;
    public final c m;
    public final g n;
    private long o;
    private double p;
    private static final String[] q;

    public e() {
        String[] stringArray = q;
        super(stringArray[3], stringArray[5], pulsescanner.f.h.WORLD);
        this.l = this.a(new g(stringArray[1], stringArray[2], 6000.0, 0.0, 24000.0, 100.0));
        this.m = this.a(new c(stringArray[6], stringArray[7], false));
        this.n = (g)this.a(new g(stringArray[4], stringArray[0], 1.0, 0.1, 50.0, 0.1, "x")).a(this.m::a);
        this.o = -1L;
    }

    @Override
    protected void g() {
        try {
            this.p = (Double)this.l.a();
            if (this.m()) {
                this.o = pulsescanner.f.g.e.a.field_1687.method_28104().method_217();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.e.a(matchException);
        }
    }

    @Override
    protected void h() {
        block4: {
            try {
                try {
                    if (!this.m() || this.o < 0L) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.e.a(matchException);
                }
                pulsescanner.f.g.e.a.field_1687.method_28104().method_165(this.o);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.e.a(matchException);
            }
        }
    }

    public void a(long l2) {
        this.o = l2;
        this.o();
    }

    @Override
    public void i() {
        block20: {
            block18: {
                e e2;
                e e3;
                String string;
                block16: {
                    block17: {
                        block14: {
                            block15: {
                                string = pulsescanner.f.g.d.u();
                                try {
                                    try {
                                        e3 = this;
                                        if (string != null) break block14;
                                        if (e3.m()) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.e.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.e.a(matchException);
                                }
                            }
                            e3 = this;
                        }
                        try {
                            try {
                                if (string != null) break block16;
                                if (e3.o < 0L) break block17;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.e.a(matchException);
                            }
                            ++this.o;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.e.a(matchException);
                        }
                    }
                    try {
                        e2 = this;
                        if (string != null) break block18;
                        e3 = e2.m.a();
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.e.a(matchException);
                    }
                }
                try {
                    block19: {
                        try {
                            if (!((Boolean)((Object)e3)).booleanValue()) break block19;
                            this.p = (this.p + (Double)this.n.a()) % 24000.0;
                            if (string == null) break block20;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.e.a(matchException);
                        }
                    }
                    e2 = this;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.e.a(matchException);
                }
            }
            e2.p = (Double)this.l.a();
        }
        this.o();
    }

    private void o() {
        try {
            if (this.m()) {
                pulsescanner.f.g.e.a.field_1687.method_28104().method_165((long)this.p);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.e.a(matchException);
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
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "X\u0011\u0002}\u000e{fjX\u0015\u007f\u0010>)|\u001d\u00136\u001a:diX\u0015\u007f\u001e0'\u0004X\u0011\fsEO\u0014\bs\u0013/$\u007f\u0011\u0005s]/`a\u001dAy\u001b{mm\u0001A>M{4,\u000b\u0014x\u000f2ziTA Mk9,EAx\u00124g XP.Mk9,EA{\u0014?ge\u001f\tbTu\fX\u0011\fs]\u0018am\u0016\u0006s\u000f\u000bO\u0001\u0002z\u0018{Z|\u001d\u0004r+O\u0010\u0000x\u001a>)x\u0010\u00046\t2diX\u000ep]?huX\u000ex]\"fy\nAu\u00112lb\fAy\u00137p\"";
                var4_3 = "X\u0011\u0002}\u000e{fjX\u0015\u007f\u0010>)|\u001d\u00136\u001a:diX\u0015\u007f\u001e0'\u0004X\u0011\fsEO\u0014\bs\u0013/$\u007f\u0011\u0005s]/`a\u001dAy\u001b{mm\u0001A>M{4,\u000b\u0014x\u000f2ziTA Mk9,EAx\u00124g XP.Mk9,EA{\u0014?ge\u001f\tbTu\fX\u0011\fs]\u0018am\u0016\u0006s\u000f\u000bO\u0001\u0002z\u0018{Z|\u001d\u0004r+O\u0010\u0000x\u001a>)x\u0010\u00046\t2diX\u000ep]?huX\u000ex]\"fy\nAu\u00112lb\fAy\u00137p\"".length();
                var1_4 = 28;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 42;
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
                    var2_2 = "z47O-+u( \u0003<\u0007Q\\m?F-\u001e\u001cT\"\"J&\t\u001c_?;Nh\u001aT\\m7K'\u001dYWm\"B$\u001bY\u0017";
                    var4_3 = "z47O-+u( \u0003<\u0007Q\\m?F-\u001e\u001cT\"\"J&\t\u001c_?;Nh\u001aT\\m7K'\u001dYWm\"B$\u001bY\u0017".length();
                    var1_4 = 5;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 31;
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
                        v11 = 38;
                        break;
                    }
                    case 1: {
                        v11 = 82;
                        break;
                    }
                    case 2: {
                        v11 = 75;
                        break;
                    }
                    case 3: {
                        v11 = 60;
                        break;
                    }
                    case 4: {
                        v11 = 87;
                        break;
                    }
                    case 5: {
                        v11 = 113;
                        break;
                    }
                    default: {
                        v11 = 35;
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
        pulsescanner.f.g.e.q = var5;
    }
}

