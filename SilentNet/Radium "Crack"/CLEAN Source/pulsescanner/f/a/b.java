/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  net.minecraft.class_1923
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3417
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_638
 *  net.minecraft.class_6606
 */
package pulsescanner.f.a;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1923;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3417;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_6606;
import pulsescanner.PulseScanner;
import pulsescanner.f.a.a.c;
import pulsescanner.f.a.a.d;
import pulsescanner.f.a.a.e;
import pulsescanner.f.a.j;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.g.k;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class b
extends i {
    private static final int l = 1;
    private static final int m = 4096;
    public final g n;
    public final pulsescanner.i.d o;
    public final f p;
    public final g q;
    private static final ConcurrentLinkedQueue<j> r;
    private final Long2ObjectOpenHashMap<c> s;
    private final LongOpenHashSet t;
    private final Set<pulsescanner.f.a.i> u;
    private class_638 v;
    private static String[] w;
    private static final String[] x;

    public b() {
        String[] stringArray = x;
        super(stringArray[8], stringArray[2], pulsescanner.f.h.BASEFINDING);
        this.n = this.a(new g(stringArray[1], stringArray[5], 140.0, 0.0, 255.0, 1.0));
        this.o = this.a(new pulsescanner.i.d(stringArray[10], stringArray[13], -1943087484));
        this.p = this.a(new f(stringArray[12], stringArray[17], stringArray[9], stringArray[9], stringArray[16], stringArray[3]));
        this.q = this.a(new g(stringArray[6], stringArray[15], 60.0, -64.0, 320.0, 1.0));
        this.s = new Long2ObjectOpenHashMap();
        this.t = new LongOpenHashSet();
        this.u = new HashSet<pulsescanner.f.a.i>();
    }

    public static void c(int n2, int n3, class_6606 class_66062) {
        try {
            if (class_66062 != null) {
                r.offer(new j(n2, n3, class_66062, System.nanoTime()));
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.b.a(matchException);
        }
    }

    @Override
    protected void g() {
        this.t.clear();
        this.u.clear();
    }

    @Override
    public String f() {
        String string;
        try {
            string = this.t.isEmpty() ? null : Integer.toString(this.t.size());
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.b.a(matchException);
        }
        return string;
    }

    @Override
    public void j() {
        j j2;
        class_638 class_6382 = pulsescanner.f.a.b.a.field_1687;
        try {
            if (class_6382 != this.v) {
                this.s.clear();
                this.t.clear();
                this.u.clear();
                r.clear();
                this.v = class_6382;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.b.a(matchException);
        }
        try {
            if (class_6382 == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.b.a(matchException);
        }
        int n2 = class_6382.method_32890();
        int n3 = class_6382.method_32891();
        int n4 = 0;
        while ((j2 = r.poll()) != null) {
            this.a(j2, n2, n3);
            if (++n4 < 4096) continue;
            break;
        }
    }

    /*
     * Loose catch block
     */
    private void a(j j2, int n2, int n3) {
        c c2;
        long l2;
        block19: {
            block18: {
                l2 = class_1923.method_8331((int)j2.z(), (int)j2.aa());
                c2 = (c)this.s.get(l2);
                if (c2 == null) break block18;
                try {
                    block20: {
                        if (c2.c != n2) break block18;
                        break block20;
                        catch (Throwable throwable) {
                            throw pulsescanner.f.a.b.a(throwable);
                        }
                    }
                    if (c2.d == n3) break block19;
                }
                catch (Throwable throwable) {
                    throw pulsescanner.f.a.b.a(throwable);
                }
            }
            c2 = new c(j2.z(), j2.aa(), n2, n3);
            this.s.put(l2, (Object)c2);
        }
        try {
            pulsescanner.f.a.a.d.a(j2.ab(), c2, j2.ac());
        }
        catch (Throwable throwable) {
            PulseScanner.LOG.error(x[0], new Object[]{j2.z(), j2.aa(), throwable});
            return;
        }
        try {
            if (!this.b()) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw pulsescanner.f.a.b.a(throwable);
        }
        for (int i2 = 1; i2 < c2.c + 1; ++i2) {
            int n4 = (c2.d + i2 - 1) * 16;
            try {
                if (n4 >= 1) {
                    continue;
                }
            }
            catch (Throwable throwable) {
                throw pulsescanner.f.a.b.a(throwable);
            }
            try {
                if (c2.j[i2] == j2.ac()) {
                    this.a(true, j2, l2, n4, c2.f[i2], c2.h[i2]);
                }
            }
            catch (Throwable throwable) {
                throw pulsescanner.f.a.b.a(throwable);
            }
            try {
                if (c2.i[i2] != j2.ac()) continue;
                this.a(false, j2, l2, n4, c2.e[i2], c2.g[i2]);
                continue;
            }
            catch (Throwable throwable) {
                throw pulsescanner.f.a.b.a(throwable);
            }
        }
    }

    private void a(boolean bl, j j2, long l2, int n2, pulsescanner.f.a.a.b b2, e e2) {
        block16: {
            String string;
            block15: {
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    try {
                                        if (e2 == null || b2 == pulsescanner.f.a.a.b.UNKNOWN) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.b.a(matchException);
                                    }
                                    if (b2 == pulsescanner.f.a.a.b.MISSING) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.b.a(matchException);
                                }
                                if (b2 == pulsescanner.f.a.a.b.EMPTY_MASK) break block14;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.b.a(matchException);
                            }
                            if (b2 != pulsescanner.f.a.a.b.NORMAL) break block15;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.b.a(matchException);
                        }
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.b.a(matchException);
                }
            }
            try {
                if (!this.u.add(new pulsescanner.f.a.i(l2, n2, bl)) || !this.t.add(l2)) break block16;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.b.a(matchException);
            }
            int n3 = (j2.z() << 4) + 8;
            int n4 = (j2.aa() << 4) + 8;
            try {
                string = pulsescanner.d.d.a() ? x[4] + n3 + " " + n4 : x[14];
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.b.a(matchException);
            }
            String string2 = string;
            pulsescanner.d.d.a(this, string2, (Integer)this.o.a(), 6.0f, class_3417.field_26979);
        }
    }

    public static float a(float f2) {
        b b2;
        block10: {
            b2 = pulsescanner.f.m.a(b.class);
            try {
                block9: {
                    try {
                        try {
                            try {
                                if (b2 == null || !b2.b()) break block9;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.b.a(matchException);
                            }
                            if (b2.t.isEmpty()) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.b.a(matchException);
                        }
                        if (pulsescanner.f.a.b.a.field_1724 != null) break block10;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.b.a(matchException);
                    }
                }
                return f2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.b.a(matchException);
            }
        }
        double d2 = pulsescanner.f.a.b.a.field_1724.method_23317();
        double d3 = pulsescanner.f.a.b.a.field_1724.method_23321();
        double d4 = f2;
        LongIterator longIterator = b2.t.iterator();
        while (longIterator.hasNext()) {
            class_1923 class_19232 = new class_1923(longIterator.nextLong());
            d4 = Math.max(d4, Math.hypot((double)(class_19232.field_9181 << 4) + 8.0 - d2, (double)(class_19232.field_9180 << 4) + 8.0 - d3) + 256.0);
        }
        return (float)Math.min(d4, 3.0E7);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        boolean bl;
        boolean bl2;
        double d2;
        int n2;
        int n3;
        int n4;
        String[] stringArray;
        block23: {
            block24: {
                boolean bl3;
                block21: {
                    block22: {
                        b b2;
                        block19: {
                            block20: {
                                block18: {
                                    stringArray = pulsescanner.f.a.b.o();
                                    try {
                                        try {
                                            b2 = this;
                                            if (stringArray != null) break block18;
                                            if (b2.t.isEmpty()) return;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.b.a(matchException);
                                        }
                                        b2 = this;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.b.a(matchException);
                                    }
                                }
                                try {
                                    try {
                                        if (stringArray != null) break block19;
                                        if (b2.m()) break block20;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.b.a(matchException);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.b.a(matchException);
                                }
                            }
                            b2 = this;
                        }
                        int n5 = b2.n.h();
                        int n6 = (Integer)this.o.a();
                        n4 = pulsescanner.g.b.a(n6, Math.min(n5, 52));
                        n3 = pulsescanner.g.b.a(pulsescanner.g.b.b(n6, 38), n5);
                        n2 = pulsescanner.g.b.a(n6, Math.min(28, Math.min(n5, 52)));
                        d2 = (Double)this.q.a();
                        try {
                            bl3 = this.p.a(x[7]);
                            if (stringArray != null) break block21;
                            if (bl3) break block22;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.b.a(matchException);
                        }
                        bl3 = true;
                        break block21;
                    }
                    bl3 = false;
                }
                bl2 = bl3;
                try {
                    bl = this.p.a(x[11]);
                    if (stringArray != null) break block23;
                    if (bl) break block24;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.b.a(matchException);
                }
                bl = true;
                break block23;
            }
            bl = false;
        }
        boolean bl4 = bl;
        class_243 class_2432 = class_41842.method_71156();
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_4588 class_45882 = k.b(true);
        class_4588 class_45883 = k.a(true);
        float f3 = k.a(1.5f);
        LongIterator longIterator = this.t.iterator();
        while (longIterator.hasNext()) {
            boolean bl5;
            double d3;
            double d4;
            block25: {
                block26: {
                    class_1923 class_19232 = new class_1923(longIterator.nextLong());
                    d4 = (double)(class_19232.field_9181 << 4) + 0.35;
                    d3 = (double)(class_19232.field_9180 << 4) + 0.35;
                    try {
                        try {
                            bl5 = bl2;
                            if (stringArray != null) break block25;
                            if (!bl5) break block26;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.b.a(matchException);
                        }
                        k.a(class_46652, class_45882, class_45883, new class_238(d4, d2, d3, d4 + 15.3, d2 + 0.035, d3 + 15.3).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n4, n3, f3);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.b.a(matchException);
                    }
                }
                bl5 = bl4;
            }
            if (bl5) {
                double d5 = d4 + 7.65;
                double d6 = d3 + 7.65;
                k.a(class_46652, class_45882, class_45883, new class_238(d5 - 0.34, d2, d6 - 0.34, d5 + 0.34, 320.0, d6 + 0.34).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n2, n3, f3);
            }
            if (stringArray == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[18];
                var3_1 = 0;
                pulsescanner.f.a.b.b(null);
                var2_2 = "9RGsB\u0019\u0010$xAbI\u0000mB]FaD\u0006\u0010\u0001}Nu_\u001bV\u000bt]&O\u0000Q\u0011yJb\f\u001d^BrGsB\u0019\u0010\u0019l\u0003}Q\u0005#}_nM6/p]m_RS\ndAm_RD\np[&A\u0013IByNpIRC\r|JrD\u001b^\u00051GoH\u0016U\f1Mc@\u001dGBH\u000f6\u0002\u0004 ~[n\u0012$}NaK\u0017TBrGsB\u0019\u0010B\u00a6\u000f&!#}_nMR_\u00041[nIRS\ndAm\f\u0002\\\u0003eJ&\u0004B\u001dP$\u001a/\u0002\b/p]mI\u0000\u0010;\u00062xCjM\u0000\f!yZhGRv\u000b\u007fKc^\u00052}NrI\u0005!~Ci^\u00052}NrI\f/p]mI\u0000\u00101yNvI\u001e!~Ci^R_\u00041lnY\u001c[BWFhH\u0017BB|NtG\u0017B\u0011?\r$}NaK\u0017TBrGsB\u00191*tFaD\u0006\u0010\rw\u000frD\u0017\u0010\u0001yZhGR@\u000ep[c\f\u0013^\u00061Mg_\u0017\u0010\rw\u000frD\u0017\u0010\u0012xCjM\u0000\u001e";
                var4_3 = "9RGsB\u0019\u0010$xAbI\u0000mB]FaD\u0006\u0010\u0001}Nu_\u001bV\u000bt]&O\u0000Q\u0011yJb\f\u001d^BrGsB\u0019\u0010\u0019l\u0003}Q\u0005#}_nM6/p]m_RS\ndAm_RD\np[&A\u0013IByNpIRC\r|JrD\u001b^\u00051GoH\u0016U\f1Mc@\u001dGBH\u000f6\u0002\u0004 ~[n\u0012$}NaK\u0017TBrGsB\u0019\u0010B\u00a6\u000f&!#}_nMR_\u00041[nIRS\ndAm\f\u0002\\\u0003eJ&\u0004B\u001dP$\u001a/\u0002\b/p]mI\u0000\u0010;\u00062xCjM\u0000\f!yZhGRv\u000b\u007fKc^\u00052}NrI\u0005!~Ci^\u00052}NrI\f/p]mI\u0000\u00101yNvI\u001e!~Ci^R_\u00041lnY\u001c[BWFhH\u0017BB|NtG\u0017B\u0011?\r$}NaK\u0017TBrGsB\u00191*tFaD\u0006\u0010\rw\u000frD\u0017\u0010\u0001yZhGR@\u000ep[c\f\u0013^\u00061Mg_\u0017\u0010\rw\u000frD\u0017\u0010\u0012xCjM\u0000\u001e".length();
                var1_4 = 54;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 77;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "Z\u0010+\u0002%h2X\u001c)\n!h+*\u0018g\r(\u007f9dY7\u0002%n=&Y&N2\u007f*~\u0010$\u000f(:(c\u0015+\u000f66xe\u000bg\f+n0$";
                    var4_3 = "Z\u0010+\u0002%h2X\u001c)\n!h+*\u0018g\r(\u007f9dY7\u0002%n=&Y&N2\u007f*~\u0010$\u000f(:(c\u0015+\u000f66xe\u000bg\f+n0$".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 37;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (true) ** GOTO lbl72
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v11 = 47;
                        break;
                    }
                    case 1: {
                        v11 = 92;
                        break;
                    }
                    case 2: {
                        v11 = 98;
                        break;
                    }
                    case 3: {
                        v11 = 75;
                        break;
                    }
                    case 4: {
                        v11 = 97;
                        break;
                    }
                    case 5: {
                        v11 = 63;
                        break;
                    }
                    default: {
                        v11 = 125;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl72:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl80:
                // 1 sources

                ** continue;
            }
        }
        pulsescanner.f.a.b.x = var5;
        pulsescanner.f.a.b.r = new ConcurrentLinkedQueue<E>();
    }

    public static void b(String[] stringArray) {
        w = stringArray;
    }

    public static String[] o() {
        return w;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

