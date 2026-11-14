/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2586
 *  net.minecraft.class_2589
 *  net.minecraft.class_2595
 *  net.minecraft.class_2601
 *  net.minecraft.class_2608
 *  net.minecraft.class_2609
 *  net.minecraft.class_2611
 *  net.minecraft.class_2614
 *  net.minecraft.class_2627
 *  net.minecraft.class_2806
 *  net.minecraft.class_2818
 *  net.minecraft.class_3417
 *  net.minecraft.class_3719
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_7716
 *  net.minecraft.class_8172
 *  net.minecraft.class_8887
 */
package pulsescanner.f.a;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1923;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2589;
import net.minecraft.class_2595;
import net.minecraft.class_2601;
import net.minecraft.class_2608;
import net.minecraft.class_2609;
import net.minecraft.class_2611;
import net.minecraft.class_2614;
import net.minecraft.class_2627;
import net.minecraft.class_2806;
import net.minecraft.class_2818;
import net.minecraft.class_3417;
import net.minecraft.class_3719;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7716;
import net.minecraft.class_8172;
import net.minecraft.class_8887;
import pulsescanner.d.d;
import pulsescanner.f.a.b;
import pulsescanner.f.a.l;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.g.k;
import pulsescanner.i.c;
import pulsescanner.i.g;

public class e
extends i {
    public final g l;
    public final g m;
    public final c n;
    public final g o;
    public final pulsescanner.i.d p;
    public final g q;
    public final g r;
    private final Map<Long, l> s;
    private final Set<Long> t;
    private int u;
    private static final String[] v;

    public e() {
        String[] stringArray = v;
        super(stringArray[12], stringArray[15], pulsescanner.f.h.BASEFINDING);
        this.l = this.a(new g(stringArray[8], stringArray[0], 8.0, 2.0, 48.0, 1.0));
        this.m = this.a(new g(stringArray[4], stringArray[11], 20.0, 5.0, 60.0, 1.0));
        this.n = this.a(new c(stringArray[13], stringArray[3], true));
        this.o = this.a(new g(stringArray[9], stringArray[1], 96.0, 16.0, 128.0, 1.0));
        this.p = this.a(new pulsescanner.i.d(stringArray[6], stringArray[16], -755003094));
        this.q = this.a(new g(stringArray[7], stringArray[5], -64.0, -64.0, 128.0, 1.0));
        this.r = this.a(new g(stringArray[14], stringArray[10], 320.0, 64.0, 320.0, 1.0));
        this.s = new LinkedHashMap<Long, l>();
        this.t = new HashSet<Long>();
    }

    @Override
    protected void g() {
        this.o();
        this.p();
    }

    @Override
    protected void h() {
        this.o();
    }

    @Override
    public void k() {
        this.o();
    }

    @Override
    public void l() {
        this.o();
    }

    @Override
    public void i() {
        block4: {
            try {
                try {
                    if (!this.m() || ++this.u < this.m.h()) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.e.a(matchException);
                }
                this.u = 0;
                this.p();
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.e.a(matchException);
            }
        }
    }

    @Override
    public String f() {
        String string;
        try {
            string = this.s.isEmpty() ? null : Integer.toString(this.s.size());
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.e.a(matchException);
        }
        return string;
    }

    private void o() {
        this.u = 0;
        this.s.clear();
        this.t.clear();
    }

    private void p() {
        try {
            if (!this.m()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.e.a(matchException);
        }
        LinkedHashMap<Long, l> linkedHashMap = new LinkedHashMap<Long, l>();
        int n2 = (Integer)pulsescanner.f.a.e.a.field_1690.method_42503().method_41753();
        class_1923 class_19232 = pulsescanner.f.a.e.a.field_1724.method_31476();
        for (int i2 = class_19232.field_9181 - n2; i2 <= class_19232.field_9181 + n2; ++i2) {
            for (int i3 = class_19232.field_9180 - n2; i3 <= class_19232.field_9180 + n2; ++i3) {
                String string;
                int n3;
                block21: {
                    block20: {
                        class_2818 class_28182 = pulsescanner.f.a.e.a.field_1687.method_2935().method_2857(i2, i3, class_2806.field_12803, false);
                        try {
                            if (class_28182 == null) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.e.a(matchException);
                        }
                        n3 = 0;
                        for (class_2586 class_25862 : class_28182.method_12214().values()) {
                            try {
                                if (!pulsescanner.f.a.e.a(class_25862)) continue;
                                ++n3;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.e.a(matchException);
                            }
                        }
                        try {
                            if (n3 < this.l.h()) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.e.a(matchException);
                        }
                        long l2 = class_1923.method_8331((int)i2, (int)i3);
                        try {
                            try {
                                try {
                                    linkedHashMap.put(l2, new l(i2, i3, n3));
                                    if (!this.t.add(l2) || !((Boolean)this.n.a()).booleanValue()) continue;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.e.a(matchException);
                                }
                                if (!pulsescanner.d.d.a()) break block20;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.e.a(matchException);
                            }
                            string = v[2] + ((i2 << 4) + 8) + " " + ((i3 << 4) + 8);
                            break block21;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.e.a(matchException);
                        }
                    }
                    string = "";
                }
                String string2 = string;
                pulsescanner.d.d.a(this, n3 + v[17] + string2, (Integer)this.p.a(), 6.0f, class_3417.field_26946);
            }
        }
        this.s.clear();
        this.s.putAll(linkedHashMap);
    }

    private static boolean a(class_2586 class_25862) {
        boolean bl;
        block26: {
            block25: {
                try {
                    block24: {
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
                                                                try {
                                                                    if (class_25862 instanceof class_2595 || class_25862 instanceof class_2611) break block24;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.a.e.a(matchException);
                                                                }
                                                                if (class_25862 instanceof class_2627) break block24;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.a.e.a(matchException);
                                                            }
                                                            if (class_25862 instanceof class_2609) break block24;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.a.e.a(matchException);
                                                        }
                                                        if (class_25862 instanceof class_3719) break block24;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.a.e.a(matchException);
                                                    }
                                                    if (class_25862 instanceof class_2614) break block24;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.a.e.a(matchException);
                                                }
                                                if (class_25862 instanceof class_2601) break block24;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.a.e.a(matchException);
                                            }
                                            if (class_25862 instanceof class_2608) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.e.a(matchException);
                                        }
                                        if (class_25862 instanceof class_2589) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.e.a(matchException);
                                    }
                                    if (class_25862 instanceof class_8887) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.e.a(matchException);
                                }
                                if (class_25862 instanceof class_7716) break block24;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.e.a(matchException);
                            }
                            if (!(class_25862 instanceof class_8172)) break block25;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.e.a(matchException);
                        }
                    }
                    bl = true;
                    break block26;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.e.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        int n2;
        String[] stringArray;
        block13: {
            block14: {
                block12: {
                    stringArray = pulsescanner.f.a.b.o();
                    try {
                        try {
                            if (pulsescanner.f.a.e.a.field_1724 == null) break block12;
                            n2 = this.s.isEmpty();
                            if (stringArray != null) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.e.a(matchException);
                        }
                        if (n2 == 0) break block14;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.e.a(matchException);
                    }
                }
                return;
            }
            n2 = pulsescanner.f.a.e.a.field_1724.method_31476().field_9181;
        }
        int n3 = n2;
        int n4 = pulsescanner.f.a.e.a.field_1724.method_31476().field_9180;
        int n5 = this.o.h();
        int n6 = (Integer)this.p.a();
        int n7 = n6 >>> 24 & 0xFF;
        double d2 = Math.min((Double)this.q.a(), (Double)this.r.a());
        double d3 = Math.max((Double)this.q.a(), (Double)this.r.a());
        int n8 = pulsescanner.g.b.a(n6, Math.min(34, n7));
        int n9 = pulsescanner.g.b.a(n6, Math.min(72, n7));
        int n10 = pulsescanner.g.b.a((n6 >> 16 & 0xFF) + 18, (n6 >> 8 & 0xFF) + 34, (n6 & 0xFF) + 48, n7);
        class_243 class_2432 = class_41842.method_71156();
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_4588 class_45882 = k.b(true);
        class_4588 class_45883 = k.a(true);
        float f3 = k.a(1.5f);
        for (l l2 : this.s.values()) {
            int n11;
            block16: {
                int n12;
                block15: {
                    try {
                        n12 = l2.af;
                        if (stringArray != null) break block15;
                        if (Math.abs(n12 - n3) > n5) continue;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.e.a(matchException);
                    }
                    try {
                        n11 = l2.ag;
                        if (stringArray != null) break block16;
                        n12 = Math.abs(n11 - n4);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.e.a(matchException);
                    }
                }
                try {
                    if (n12 > n5) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.e.a(matchException);
                }
                n11 = l2.af << 4;
            }
            double d4 = (double)n11 + 8.0;
            double d5 = (double)(l2.ag << 4) + 8.0;
            k.a(class_46652, class_45882, class_45883, new class_238(d4 - 0.62, d2, d5 - 0.62, d4 + 0.62, d3, d5 + 0.62).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n8, n10, f3);
            k.a(class_46652, class_45882, class_45883, new class_238(d4 - 0.18, d2, d5 - 0.18, d4 + 0.18, d3, d5 + 0.18).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n9, n10, f3);
            if (stringArray == null) continue;
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
                var5 = new String[18];
                var3_1 = 0;
                var2_2 = "\u0004\u0015<5(*Zi\u000f&37>P,\\00*<\\i\u0019<(,+^,\u000fr5+\u007fX'\u0019r?-*Y\"\\09#0E,\\;(e6Di\u00113..:Sg#\u0004\u001d*5(*Zi\u001f:)+4\u0017-\u0015!($1T,\\437\u007fG \u0010>=7,\u0019\u0005i\\\u00e5|e<\u001a\u0014=+6\u007fX'\u0019r(*>D=\\%4 1\u0017(\\<923Ni\u0010==!:Si\u0018726:\u0017*\u0014'2.\u007f^:\\691:T=\u00196r\n\u001a\u001f32e\u001bR%\u001d+\u001f\u000b\u0013&(*2\u0017\u0010\\=:e:V*\u0014r1$-\\,\u000er,,3[(\u000e|\f\u0019\u0015>0$-\u0017\n\u0013>37\r\u0019\u0015>0$-\u0017\u000b\u0013&(*2\u0011\u001a\b=.$8Ri(:. ,_&\u00106\u000f\u001b\u0019<8 -\u0017\r\u0015!($1T,\u001c\u001d\u0013\"|\u001c\u007fX/\\7=&7\u0017$\u001d 7 -\u00179\u0015>0$-\u0019%\u001d\u0015176\u007fU,\b%9 1\u0017:\u001f326\u007fX/\\>3$;R-\\1401\\:R\f\u001a\b3/-\u007ft!\t<76\u0005\u001d\u00133/1\n\u0019\u0015>0$-\u0017\u001d\u0013\"+\u0004\u001d 76\u007fT!\t<76\u007f@ \b:|$\u007f[&\br3#\u007fD=\u0013 =\":\u0017 \u0012r(-:Zg";
                var4_3 = "\u0004\u0015<5(*Zi\u000f&37>P,\\00*<\\i\u0019<(,+^,\u000fr5+\u007fX'\u0019r?-*Y\"\\09#0E,\\;(e6Di\u00113..:Sg#\u0004\u001d*5(*Zi\u001f:)+4\u0017-\u0015!($1T,\\437\u007fG \u0010>=7,\u0019\u0005i\\\u00e5|e<\u001a\u0014=+6\u007fX'\u0019r(*>D=\\%4 1\u0017(\\<923Ni\u0010==!:Si\u0018726:\u0017*\u0014'2.\u007f^:\\691:T=\u00196r\n\u001a\u001f32e\u001bR%\u001d+\u001f\u000b\u0013&(*2\u0017\u0010\\=:e:V*\u0014r1$-\\,\u000er,,3[(\u000e|\f\u0019\u0015>0$-\u0017\n\u0013>37\r\u0019\u0015>0$-\u0017\u000b\u0013&(*2\u0011\u001a\b=.$8Ri(:. ,_&\u00106\u000f\u001b\u0019<8 -\u0017\r\u0015!($1T,\u001c\u001d\u0013\"|\u001c\u007fX/\\7=&7\u0017$\u001d 7 -\u00179\u0015>0$-\u0019%\u001d\u0015176\u007fU,\b%9 1\u0017:\u001f326\u007fX/\\>3$;R-\\1401\\:R\f\u001a\b3/-\u007ft!\t<76\u0005\u001d\u00133/1\n\u0019\u0015>0$-\u0017\u001d\u0013\"+\u0004\u001d 76\u007fT!\t<76\u007f@ \b:|$\u007f[&\br3#\u007fD=\u0013 =\":\u0017 \u0012r(-:Zg".length();
                var1_4 = 64;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 91;
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
                    var2_2 = "<(\r\u001e\u0011Ne\u00108\r\u0006T\u001eo\u0014!\u0002\u001fT\ri\u0014\"\u0011C\bX>\u0017\u0002\u0006\u000fa\u001d";
                    var4_3 = "<(\r\u001e\u0011Ne\u00108\r\u0006T\u001eo\u0014!\u0002\u001fT\ri\u0014\"\u0011C\bX>\u0017\u0002\u0006\u000fa\u001d".length();
                    var1_4 = 25;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 106;
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
                        v11 = 18;
                        break;
                    }
                    case 1: {
                        v11 = 39;
                        break;
                    }
                    case 2: {
                        v11 = 9;
                        break;
                    }
                    case 3: {
                        v11 = 7;
                        break;
                    }
                    case 4: {
                        v11 = 30;
                        break;
                    }
                    case 5: {
                        v11 = 4;
                        break;
                    }
                    default: {
                        v11 = 108;
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
        pulsescanner.f.a.e.v = var5;
    }
}

