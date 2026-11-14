/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_412
 *  net.minecraft.class_419
 *  net.minecraft.class_437
 *  net.minecraft.class_442
 *  net.minecraft.class_500
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 */
package pulsescanner.f.e;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_412;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_639;
import net.minecraft.class_642;
import pulsescanner.f.e.b;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.g;

public class c
extends i {
    private static final long l = 3000L;
    private static final int m = 10;
    private static final long n = 30000L;
    private static final int o = 5;
    private static final long p = 30000L;
    public final g q;
    public final g r;
    public final pulsescanner.i.c s;
    public final g t;
    private class_642 u;
    private boolean v;
    private boolean w;
    private boolean x;
    private long y;
    private int z;
    private long A;
    private int B;
    private int C;
    private long D;
    private static final String[] E;

    public c() {
        String[] stringArray = E;
        super(stringArray[2], stringArray[11], pulsescanner.f.h.MISC);
        this.q = this.a(new g(stringArray[13], stringArray[3], -1.0, -64.0, 320.0, 1.0));
        this.r = this.a(new g(stringArray[14], stringArray[8], 1.0, 0.0, 30.0, 0.5, "s"));
        this.s = this.a(new pulsescanner.i.c(stringArray[1], stringArray[9], true));
        this.t = this.a(new g(stringArray[12], stringArray[10], 10.0, 0.0, 100.0, 1.0));
        this.v = true;
    }

    @Override
    protected void g() {
        boolean bl;
        try {
            this.v = true;
            this.x = false;
            this.y = 0L;
            this.z = 0;
            this.B = 0;
            this.C = 0;
            this.D = 0L;
            c c2 = this;
            bl = pulsescanner.f.e.c.a.field_1687 != null;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.c.a(matchException);
        }
        try {
            c2.w = bl;
            this.A = System.currentTimeMillis() + 3000L;
            if (a.method_1558() != null) {
                this.u = a.method_1558();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.c.a(matchException);
        }
    }

    @Override
    protected void h() {
        this.y = 0L;
        this.x = false;
        this.z = 0;
    }

    @Override
    public String f() {
        try {
            if (this.y != 0L) {
                return E[5];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.c.a(matchException);
        }
        try {
            if (System.currentTimeMillis() < this.A) {
                return E[0];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.c.a(matchException);
        }
        return E[6] + this.q.h();
    }

    @Override
    public void i() {
        block27: {
            long l2;
            block28: {
                double d2;
                block24: {
                    block26: {
                        block25: {
                            block23: {
                                try {
                                    try {
                                        if (pulsescanner.f.e.c.a.field_1724 != null && a.method_1562() != null) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.e.c.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.e.c.a(matchException);
                                }
                            }
                            class_642 class_6422 = a.method_1558();
                            try {
                                if (class_6422 == null) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.c.a(matchException);
                            }
                            this.u = class_6422;
                            l2 = System.currentTimeMillis();
                            try {
                                if (l2 < this.A) {
                                    this.B = 0;
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.c.a(matchException);
                            }
                            d2 = pulsescanner.f.e.c.a.field_1724.method_23318();
                            try {
                                try {
                                    try {
                                        if (this.v) break block24;
                                        if (!(d2 > (Double)this.q.a())) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.e.c.a(matchException);
                                    }
                                    if (++this.B < 10) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.e.c.a(matchException);
                                }
                                this.v = true;
                                break block26;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.c.a(matchException);
                            }
                        }
                        this.B = 0;
                    }
                    return;
                }
                try {
                    try {
                        if (!(d2 <= (Double)this.q.a())) break block27;
                        if (l2 - this.D <= 30000L) break block28;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.c.a(matchException);
                    }
                    this.D = l2;
                    this.C = 0;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.e.c.a(matchException);
                }
            }
            try {
                if (++this.C > 5) {
                    this.b(E[4]);
                    this.A = l2 + 30000L;
                    this.C = 0;
                    this.D = l2;
                    this.v = false;
                    this.B = 0;
                    return;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.e.c.a(matchException);
            }
            this.v = false;
            this.B = 0;
            this.x = true;
            this.z = 0;
            this.y = l2 + this.o();
            a.method_1562().method_48296().method_10747((class_2561)class_2561.method_43470((String)E[7]));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void j() {
        block71: {
            c c2;
            int n2;
            block69: {
                boolean bl;
                block70: {
                    block67: {
                        block68: {
                            c c3;
                            block66: {
                                long l2;
                                block65: {
                                    block63: {
                                        block64: {
                                            block61: {
                                                block62: {
                                                    block57: {
                                                        block60: {
                                                            c c4;
                                                            block58: {
                                                                block59: {
                                                                    class_310 class_3102;
                                                                    block56: {
                                                                        bl = pulsescanner.f.e.b.H();
                                                                        try {
                                                                            if (!this.b()) {
                                                                                return;
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.e.c.a(matchException);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                class_3102 = a;
                                                                                if (!bl) break block56;
                                                                                if (class_3102.field_1687 == null) break block57;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.e.c.a(matchException);
                                                                            }
                                                                            class_3102 = a;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.e.c.a(matchException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (class_3102.method_1558() != null) {
                                                                            this.u = a.method_1558();
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.e.c.a(matchException);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            c4 = this;
                                                                            if (!bl) break block58;
                                                                            if (c4.w) break block59;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.e.c.a(matchException);
                                                                        }
                                                                        this.A = System.currentTimeMillis() + 3000L;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.e.c.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    this.w = true;
                                                                    if (!bl) break block60;
                                                                    c4 = this;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.e.c.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                if (c4.z <= 0) return;
                                                                this.y = 0L;
                                                                this.x = false;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.e.c.a(matchException);
                                                            }
                                                        }
                                                        this.z = 0;
                                                        return;
                                                    }
                                                    try {
                                                        try {
                                                            c3 = this;
                                                            if (!bl) break block61;
                                                            if (!c3.w) break block62;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.e.c.a(matchException);
                                                        }
                                                        this.w = false;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.e.c.a(matchException);
                                                    }
                                                }
                                                c3 = this;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (!bl) break block63;
                                                                                    if (c3.y != 0L) break block64;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.e.c.a(matchException);
                                                                                }
                                                                                c3 = this;
                                                                                if (!bl) break block63;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.e.c.a(matchException);
                                                                            }
                                                                            if (c3.x) break block64;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.e.c.a(matchException);
                                                                        }
                                                                        c3 = this;
                                                                        if (!bl) break block63;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.e.c.a(matchException);
                                                                    }
                                                                    if (!((Boolean)c3.s.a()).booleanValue()) break block64;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.e.c.a(matchException);
                                                                }
                                                                c3 = this;
                                                                if (!bl) break block63;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.e.c.a(matchException);
                                                            }
                                                            if (c3.u == null) break block64;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.e.c.a(matchException);
                                                        }
                                                        l2 = pulsescanner.f.e.c.a.field_1755 instanceof class_419;
                                                        if (!bl) break block65;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.e.c.a(matchException);
                                                    }
                                                    if (l2 == false) break block64;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.e.c.a(matchException);
                                                }
                                                this.z = 0;
                                                this.y = System.currentTimeMillis() + this.o();
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.e.c.a(matchException);
                                            }
                                        }
                                        c3 = this;
                                    }
                                    try {
                                        if (!bl) break block66;
                                        long l3 = c3.y - 0L;
                                        l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.e.c.a(matchException);
                                    }
                                }
                                if (l2 == false) return;
                                c3 = this;
                            }
                            try {
                                if (c3.u == null) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.c.a(matchException);
                            }
                            try {
                                n2 = pulsescanner.f.e.c.a.field_1755 instanceof class_412;
                                if (!bl) break block67;
                                if (n2 == 0) break block68;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.c.a(matchException);
                            }
                        }
                        long l4 = System.currentTimeMillis() - this.y;
                        n2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    }
                    try {
                        if (!bl) break block69;
                        if (n2 >= 0) break block70;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.c.a(matchException);
                    }
                }
                try {
                    c2 = this;
                    if (!bl) break block71;
                    n2 = c2.z;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.e.c.a(matchException);
                }
            }
            try {
                if (n2 > this.t.h()) {
                    this.y = 0L;
                    this.x = false;
                    return;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.e.c.a(matchException);
            }
            ++this.z;
            class_412.method_36877((class_437)new class_500((class_437)new class_442()), (class_310)a, (class_639)class_639.method_2950((String)this.u.field_3761), (class_642)this.u, (boolean)false, null);
            c2 = this;
        }
        c2.y = System.currentTimeMillis() + Math.max(2000L, this.o());
    }

    private long o() {
        return (long)((Double)this.r.a() * 1000.0);
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
                var5 = new String[15];
                var3_1 = 0;
                var2_2 = "%T\u0010\"1RI1\u000e\u0017D\u00109}iB5^\n88XS\n\u0017D\u00109}iB:^\u0003[\u0004T\b9:\u001bS9\u0011\u001631TF2\u0011\u0007>(UL%\u0011\u0013>8U\u0007/^\u0011$}b\u0007?BD7)\u001bH$\u0011\u000631TPvE\f?.\u001b\u000f%T\u0010v)T\u0007{\u0007Pv)T\u00073W\u00023>ON T\b/}_N%P\u0006:8\u0012\t=\u0017D\u00109}iB:^\u0003v-ZR%T\u0000vn\u000bTv\u0019\u001631T@v]\u000b9-\u001bC3E\u00015)^C\u007f\u001fD\u0004<RT3\u00110$4\\@3CD\u000fs\t$T\u000e94UN8V\u0002\u000f\u0011\u001c\u0017D\u00109}iB:^\u0003l}IB:^\u000524U@vR\f#3PT!\u0005T\u000793_TvE\u000bv*ZN\"\u0011\u00063;TU3\u0011\u001637TN8X\n1s:\u0004T\u000e94U\u00077D\u001090ZS?R\u0005:1B\u0007?WD/2N\u00071T\u0010v6RD=T\u0000v2I\u0007:^\u00173}XH8_\u00015)RH8\u001f9\u001e^\u0013v0ZI/\u0011\u0010?0^TvE\u000bv/^S$HD7}]F?]\u00012}IB<^\r8}YB0^\u00163}\\N X\n1}NWxI\u0004T\b9:H\u00077ED7}HB\"\u0011=v)T\u0007$T\b9<_\u00075Y\u001186H\u000bvP\n2}IB5^\n88XS%\u0011\u0006/}RS%T\b0}RAvH\u000b#}_U9AJ\u0007\u0004T\u0010$4^T";
                var4_3 = "%T\u0010\"1RI1\u000e\u0017D\u00109}iB5^\n88XS\n\u0017D\u00109}iB:^\u0003[\u0004T\b9:\u001bS9\u0011\u001631TF2\u0011\u0007>(UL%\u0011\u0013>8U\u0007/^\u0011$}b\u0007?BD7)\u001bH$\u0011\u000631TPvE\f?.\u001b\u000f%T\u0010v)T\u0007{\u0007Pv)T\u00073W\u00023>ON T\b/}_N%P\u0006:8\u0012\t=\u0017D\u00109}iB:^\u0003v-ZR%T\u0000vn\u000bTv\u0019\u001631T@v]\u000b9-\u001bC3E\u00015)^C\u007f\u001fD\u0004<RT3\u00110$4\\@3CD\u000fs\t$T\u000e94UN8V\u0002\u000f\u0011\u001c\u0017D\u00109}iB:^\u0003l}IB:^\u000524U@vR\f#3PT!\u0005T\u000793_TvE\u000bv*ZN\"\u0011\u00063;TU3\u0011\u001637TN8X\n1s:\u0004T\u000e94U\u00077D\u001090ZS?R\u0005:1B\u0007?WD/2N\u00071T\u0010v6RD=T\u0000v2I\u0007:^\u00173}XH8_\u00015)RH8\u001f9\u001e^\u0013v0ZI/\u0011\u0010?0^TvE\u000bv/^S$HD7}]F?]\u00012}IB<^\r8}YB0^\u00163}\\N X\n1}NWxI\u0004T\b9:H\u00077ED7}HB\"\u0011=v)T\u0007$T\b9<_\u00075Y\u001186H\u000bvP\n2}IB5^\n88XS%\u0011\u0006/}RS%T\b0}RAvH\u000b#}_U9AJ\u0007\u0004T\u0010$4^T".length();
                var1_4 = 8;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 92;
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
                    var2_2 = "i(fZQ5>\u001d\u0003\fo?eR_>ly?c\\O";
                    var4_3 = "i(fZQ5>\u001d\u0003\fo?eR_>ly?c\\O".length();
                    var1_4 = 9;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 55;
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
                        v11 = 10;
                        break;
                    }
                    case 1: {
                        v11 = 109;
                        break;
                    }
                    case 2: {
                        v11 = 56;
                        break;
                    }
                    case 3: {
                        v11 = 10;
                        break;
                    }
                    case 4: {
                        v11 = 1;
                        break;
                    }
                    case 5: {
                        v11 = 103;
                        break;
                    }
                    default: {
                        v11 = 123;
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
        pulsescanner.f.e.c.E = var5;
    }
}

