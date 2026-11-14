/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_1923
 *  net.minecraft.class_1944
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2680
 *  net.minecraft.class_2806
 *  net.minecraft.class_2818
 *  net.minecraft.class_2826
 *  net.minecraft.class_332
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_638
 *  net.minecraft.class_6606
 */
package pulsescanner.f.g;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_124;
import net.minecraft.class_1923;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2806;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_6606;
import pulsescanner.d.a;
import pulsescanner.f.g.h;
import pulsescanner.f.g.i;
import pulsescanner.f.g.j;
import pulsescanner.f.g.k;
import pulsescanner.f.g.l;
import pulsescanner.i.b;
import pulsescanner.i.c;
import pulsescanner.i.f;
import pulsescanner.i.g;
import pulsescanner.mixin.ChunkSectionAccessor;

public class d
extends pulsescanner.f.i {
    private static final int l = 40;
    private static final double m = 7.0;
    private static final int n = 4;
    private static final int o = 100;
    private static final int p = 600;
    private static final class_2350[] q;
    public final g r;
    public final g s;
    public final g t;
    public final g u;
    public final g v;
    public final g w;
    public final g x;
    public final g y;
    public final f z;
    public final g A;
    public final c B;
    public final c C;
    public final pulsescanner.i.d D;
    public final g E;
    public final g F;
    public final c G;
    public final c H;
    public final c I;
    public final pulsescanner.i.d J;
    public final c K;
    public final g L;
    public final c M;
    public final c N;
    public final pulsescanner.i.d O;
    public final g P;
    public final c Q;
    public final f R;
    public final g S;
    public final b T;
    public final c U;
    private final Map<Long, h> V;
    private final Set<Long> W;
    private final LinkedHashMap<Long, Integer> X;
    private final LinkedHashSet<Long> Y;
    private final Set<Long> Z;
    private final Map<Long, l> aa;
    private final Set<Long> ab;
    private List<j> ac;
    private List<k> ad;
    private List<i> ae;
    private final class_2338.class_2339 af;
    private class_638 ag;
    private int ah;
    private boolean ai;
    private static String aj;
    private static final String[] cb;

    public d() {
        String[] stringArray = cb;
        super(stringArray[57], stringArray[43], pulsescanner.f.h.BASEFINDING);
        this.r = this.a(new g(stringArray[24], stringArray[72], 128.0, 32.0, 512.0, 16.0, "m"));
        this.s = this.a(new g(stringArray[63], stringArray[39], 6.0, 1.0, 15.0, 1.0, stringArray[60]));
        this.t = this.a(new g(stringArray[73], stringArray[54], 80.0, 40.0, 100.0, 1.0, "%"));
        this.u = this.a(new g(stringArray[2], stringArray[64], 18.0, 1.0, 80.0, 1.0));
        this.v = this.a(new g(stringArray[13], stringArray[46], 2.0, 1.0, 8.0, 1.0));
        this.w = this.a(new g(stringArray[52], stringArray[82], 64.0, 16.0, 160.0, 4.0, "m"));
        this.x = this.a(new g(stringArray[49], stringArray[53], 25.0, 0.0, 64.0, 1.0, "m"));
        this.y = this.a(new g(stringArray[77], stringArray[69], 6.0, 3.0, 24.0, 1.0));
        this.z = this.a(new f(stringArray[31], stringArray[83], stringArray[32], stringArray[55], stringArray[25], stringArray[16]));
        this.A = (g)this.a(new g(stringArray[70], stringArray[47], 3.0, 1.0, 15.0, 1.0)).a(this::lambda$new$0);
        this.B = this.a(new c(stringArray[8], stringArray[14], true));
        this.C = this.a(new c(stringArray[18], stringArray[34], true));
        this.D = (pulsescanner.i.d)this.a(new pulsescanner.i.d(stringArray[61], stringArray[35], -49240)).a(this.C::a);
        this.E = (g)this.a(new g(stringArray[67], stringArray[17], 42.0, 5.0, 100.0, 1.0, "%")).a(this.C::a);
        this.F = (g)this.a(new g(stringArray[6], stringArray[28], 50.0, 0.0, 100.0, 5.0, "%")).a(this.C::a);
        this.G = (c)this.a(new c(stringArray[9], stringArray[11], true)).a(this.C::a);
        this.H = (c)this.a(new c(stringArray[22], stringArray[71], true)).a(this.C::a);
        this.I = this.a(new c(stringArray[20], stringArray[26], true));
        this.J = (pulsescanner.i.d)this.a(new pulsescanner.i.d(stringArray[36], stringArray[5], -12739585)).a(this.I::a);
        String string = pulsescanner.f.g.d.u();
        try {
            this.K = this.a(new c(stringArray[21], stringArray[38], true));
            this.L = this.a(new g(stringArray[12], stringArray[80], 1.0, 0.5, 2.0, 0.05, "x"));
            this.M = this.a(new c(stringArray[76], stringArray[4], true));
            this.N = this.a(new c(stringArray[78], stringArray[10], true));
            this.O = (pulsescanner.i.d)this.a(new pulsescanner.i.d(stringArray[68], stringArray[0], -49240)).a(this.N::a);
            this.P = (g)this.a(new g(stringArray[40], stringArray[23], 30.0, 5.0, 80.0, 1.0, "%")).a(this.N::a);
            this.Q = this.a(new c(stringArray[59], stringArray[19], true));
            this.R = this.a(pulsescanner.d.a.a(stringArray[37], stringArray[45]));
            this.S = (g)this.a(new g(stringArray[44], stringArray[58], 150.0, 0.0, 400.0, 5.0, "%")).a(this::lambda$new$1);
            this.T = (b)this.a(new b(stringArray[81], stringArray[33], this::t)).a(this::lambda$new$2);
            this.U = this.a(new c(stringArray[75], stringArray[42], false));
            this.V = new HashMap<Long, h>();
            this.W = new HashSet<Long>();
            this.X = new LinkedHashMap();
            this.Y = new LinkedHashSet();
            this.Z = new HashSet<Long>();
            this.aa = new HashMap<Long, l>();
            this.ab = new HashSet<Long>();
            this.ac = new ArrayList<j>();
            this.ad = new ArrayList<k>();
            this.ae = new ArrayList<i>();
            this.af = new class_2338.class_2339();
            if (string != null) {
                pulsescanner.f.i.b(new int[1]);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
    }

    @Override
    public String f() {
        int n2 = 0;
        for (i i2 : this.ae) {
            try {
                if (!this.a(i2)) continue;
                ++n2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
        return String.valueOf(n2);
    }

    @Override
    protected void h() {
        this.o();
    }

    private void o() {
        this.V.clear();
        this.W.clear();
        this.X.clear();
        this.Y.clear();
        this.Z.clear();
        this.aa.clear();
        this.ab.clear();
        this.ac = new ArrayList<j>();
        this.ad = new ArrayList<k>();
        this.ae = new ArrayList<i>();
        this.ai = false;
    }

    @Override
    public void i() {
        block22: {
            block18: {
                block20: {
                    try {
                        block19: {
                            try {
                                try {
                                    if (this.m()) break block18;
                                    if (this.ag != null) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                                if (this.V.isEmpty()) break block20;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        this.o();
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                this.ag = null;
                return;
            }
            try {
                if (pulsescanner.f.g.d.a.field_1687 != this.ag) {
                    this.o();
                    this.ag = pulsescanner.f.g.d.a.field_1687;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            try {
                ++this.ah;
                if (this.ah % 5 == 0) {
                    this.q();
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            try {
                block21: {
                    try {
                        try {
                            this.r();
                            if (this.ai && this.ah % 10 == 0) break block21;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                        if (this.ah % 40 != 0) break block22;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                this.ai = false;
                this.s();
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
    }

    private int p() {
        return Math.min(pulsescanner.f.g.d.a.field_1690.method_38521(), (int)Math.ceil((Double)this.r.a() / 16.0));
    }

    private boolean a(int n2, int n3) {
        boolean bl;
        try {
            bl = pulsescanner.f.g.d.a.field_1687.method_2935().method_2857(n2, n3, class_2806.field_12803, false) != null;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    private boolean b(int n2, int n3) {
        boolean bl;
        int n4 = this.p();
        try {
            bl = Math.max(Math.abs(n2 - (pulsescanner.f.g.d.a.field_1724.method_31477() >> 4)), Math.abs(n3 - (pulsescanner.f.g.d.a.field_1724.method_31479() >> 4))) <= n4;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    @Override
    public void a(int n2, int n3, class_6606 class_66062) {
        try {
            if (!this.m()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        long l2 = class_1923.method_8331((int)n2, (int)n3);
        try {
            this.W.remove(l2);
            if (this.b(n2, n3)) {
                this.Y.remove(l2);
                this.X.put(l2, this.ah + 4);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        for (int i2 = 2; i2 < 6; ++i2) {
            long l3 = class_1923.method_8331((int)(n2 + q[i2].method_10148()), (int)(n3 + q[i2].method_10165()));
            try {
                try {
                    if (!this.Z.remove(l3) || this.X.containsKey(l3)) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                this.Y.remove(l3);
                this.X.put(l3, this.ah + 4);
                continue;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
    }

    private void q() {
        int n2 = this.p();
        int n3 = pulsescanner.f.g.d.a.field_1724.method_31477() >> 4;
        int n4 = pulsescanner.f.g.d.a.field_1724.method_31479() >> 4;
        ArrayList<long[]> arrayList = new ArrayList<long[]>();
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                int n5 = n3 + i2;
                int n6 = n4 + i3;
                long l2 = class_1923.method_8331((int)n5, (int)n6);
                try {
                    try {
                        try {
                            if (this.X.containsKey(l2) || this.Y.contains(l2)) continue;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                        if (this.W.contains(l2)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                h h2 = this.V.get(l2);
                try {
                    try {
                        if (h2 != null && (long)this.ah - h2.d <= 100L) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                try {
                    if (!this.a(n5, n6)) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                try {
                    if (h2 == null) {
                        arrayList.add(new long[]{l2, Math.max(Math.abs(i2), Math.abs(i3))});
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                this.Y.add(l2);
            }
        }
        arrayList.sort(Comparator.comparingLong(d::lambda$discover$3));
        for (long[] lArray : arrayList) {
            this.X.put(lArray[0], this.ah + 4);
        }
        try {
            if (this.ah % 100 == 0) {
                this.W.removeIf(this::lambda$discover$4);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
    }

    private void r() {
        long l2 = System.nanoTime() + (long)((Double)this.s.a() * 1000000.0);
        Iterator<Map.Entry<Long, Integer>> iterator = this.X.entrySet().iterator();
        while (true) {
            try {
                if (!iterator.hasNext() || System.nanoTime() >= l2) break;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            Map.Entry<Long, Integer> entry = iterator.next();
            try {
                if (entry.getValue() > this.ah) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            iterator.remove();
            this.a(entry.getKey());
        }
        iterator = this.Y.iterator();
        while (true) {
            try {
                if (!iterator.hasNext() || System.nanoTime() >= l2) break;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            long l3 = (Long)((Object)iterator.next());
            iterator.remove();
            this.a(l3);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void a(long var1_1) {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block24: {
                            block25: {
                                var3_2 = class_1923.method_8325((long)var1_1);
                                var4_3 = class_1923.method_8332((long)var1_1);
                                var5_4 = pulsescanner.f.g.d.a.field_1687.method_2935().method_2857(var3_2, var4_3, class_2806.field_12803, false);
                                try {
                                    if (var5_4 == null) {
                                        return;
                                    }
                                }
                                catch (MatchException v0) {
                                    throw pulsescanner.f.g.d.a(v0);
                                }
                                var6_5 = this.a(var5_4);
                                try {
                                    try {
                                        if (var6_5.c) break block24;
                                        this.W.add(var1_1);
                                        this.Z.remove(var1_1);
                                        if (this.V.remove(var1_1) == null) break block25;
                                    }
                                    catch (MatchException v1) {
                                        throw pulsescanner.f.g.d.a(v1);
                                    }
                                    this.ai = true;
                                }
                                catch (MatchException v2) {
                                    throw pulsescanner.f.g.d.a(v2);
                                }
                            }
                            return;
                        }
                        var7_6 = false;
                        var8_7 = 2;
                        while (true) {
                            block27: {
                                block26: {
                                    try {
                                        try {
                                            try {
                                                if (var8_7 >= 6 || var7_6) break;
                                            }
                                            catch (MatchException v3) {
                                                throw pulsescanner.f.g.d.a(v3);
                                            }
                                            if (this.a(var3_2 + pulsescanner.f.g.d.q[var8_7].method_10148(), var4_3 + pulsescanner.f.g.d.q[var8_7].method_10165())) break block26;
                                        }
                                        catch (MatchException v4) {
                                            throw pulsescanner.f.g.d.a(v4);
                                        }
                                        v5 = true;
                                        break block27;
                                    }
                                    catch (MatchException v6) {
                                        throw pulsescanner.f.g.d.a(v6);
                                    }
                                }
                                v5 = false;
                            }
                            var7_6 = v5;
                            ++var8_7;
                        }
                        try {
                            if (!var7_6) break block28;
                            this.Z.add(var1_1);
                            break block29;
                        }
                        catch (MatchException v7) {
                            throw pulsescanner.f.g.d.a(v7);
                        }
                    }
                    this.Z.remove(var1_1);
                }
                var8_8 = this.V.put(var1_1, var6_5);
                try {
                    try {
                        if (var8_8 != null) break block30;
                        if (var6_5.a.length <= 0) break block31;
                        ** GOTO lbl81
                    }
                    catch (MatchException v8) {
                        throw pulsescanner.f.g.d.a(v8);
                    }
                }
                catch (MatchException v9) {
                    throw pulsescanner.f.g.d.a(v9);
                }
            }
            try {
                try {
                    if (Arrays.equals(var8_8.a, var6_5.a) && Arrays.equals(var8_8.b, var6_5.b)) break block31;
                }
                catch (MatchException v10) {
                    throw pulsescanner.f.g.d.a(v10);
                }
lbl81:
                // 2 sources

                this.ai = true;
            }
            catch (MatchException v11) {
                throw pulsescanner.f.g.d.a(v11);
            }
        }
    }

    private static boolean a(class_2680 class_26802) {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (class_26802.method_27852(class_2246.field_27159) || class_26802.method_27852(class_2246.field_27160)) break block6;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            if (!class_26802.method_27852(class_2246.field_27114)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean b(class_2680 class_26802) {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (class_26802.method_27852(class_2246.field_10340) || class_26802.method_27852(class_2246.field_28888)) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                                if (class_26802.method_27852(class_2246.field_27165)) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            if (!class_26802.method_27852(class_2246.field_29031)) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean c(class_2680 class_26802) {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (class_26802.method_27852(class_2246.field_27161) || class_26802.method_27852(class_2246.field_27162)) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                                if (class_26802.method_27852(class_2246.field_27163)) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            if (!class_26802.method_27852(class_2246.field_27164)) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean d(class_2680 class_26802) {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (class_26802.method_26215()) break block6;
                                if (!class_26802.method_27852(class_2246.field_10382)) break block7;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            if (!class_26802.method_26227().method_15771()) break block7;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean e(class_2680 class_26802) {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (pulsescanner.f.g.d.a(class_26802)) break block6;
                                if (!((Boolean)this.B.a()).booleanValue()) break block7;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            if (!pulsescanner.f.g.d.b(class_26802)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    private h a(class_2818 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [70[DOLOOP]], but top level block is 74[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void a(class_2826[] class_2826Array, int n2, Set<Long> set, Map<Integer, Set<Long>> map, Map<Long, Float> map2) {
        HashSet<Integer> hashSet = new HashSet<Integer>(map.keySet());
        HashMap hashMap = new HashMap();
        if (((Boolean)this.B.a()).booleanValue()) {
            for (long l2 : set) {
                int n3 = (class_2338.method_10071((long)l2) >> 4) - n2;
                hashSet.add(n3);
                hashMap.computeIfAbsent(n3, d::lambda$countLeak$6).add(l2);
            }
        }
        Iterator<Long> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            long l3;
            Iterator<Object> iterator2;
            Set<Long> set2;
            int n4;
            block23: {
                int n5 = (Integer)((Object)iterator.next());
                if (n5 < 0 || n5 >= class_2826Array.length) continue;
                try {
                    if (class_2826Array[n5] == null) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                n4 = pulsescanner.f.g.d.a(class_2826Array[n5]);
                try {
                    if (n4 <= 0) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                set2 = map.get(n5);
                try {
                    try {
                        if (set2 != null && !set2.isEmpty()) break block23;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    if (!((Boolean)this.B.a()).booleanValue()) break block23;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                set2 = new HashSet<Long>();
                class_2338.class_2339 class_23392 = new class_2338.class_2339();
                iterator2 = hashMap.getOrDefault(n5, List.of()).iterator();
                while (iterator2.hasNext()) {
                    l3 = (Long)iterator2.next();
                    try {
                        if (!this.b((class_2338)class_23392.method_16363(l3))) continue;
                        set2.add(l3);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
            }
            if (set2 == null) continue;
            try {
                if (set2.isEmpty()) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            try {
                if (n4 > set2.size()) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            float f2 = (float)n4 / (float)set2.size();
            iterator2 = set2.iterator();
            while (iterator2.hasNext()) {
                l3 = (Long)iterator2.next();
                map2.merge(l3, Float.valueOf(f2), Math::max);
            }
        }
    }

    private static int a(class_2826 class_28262) {
        short s2 = ((ChunkSectionAccessor)class_28262).pulse$getNonEmptyBlockCount();
        int n2 = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    class_2680 class_26802 = class_28262.method_12254(i4, i2, i3);
                    try {
                        if (!class_26802.method_26215()) {
                            ++n2;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    try {
                        if (class_26802.method_26227().method_15769()) continue;
                        ++n2;
                        continue;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
            }
        }
        return s2 - n2;
    }

    private boolean a(class_2338 class_23382) {
        boolean bl;
        block170: {
            block169: {
                int n2;
                block168: {
                    boolean bl2;
                    int n3;
                    block167: {
                        int n4;
                        boolean bl3;
                        block166: {
                            block165: {
                                int n5;
                                block164: {
                                    block163: {
                                        int n6;
                                        int n7;
                                        block162: {
                                            block161: {
                                                block160: {
                                                    block159: {
                                                        int n8;
                                                        block158: {
                                                            int n9;
                                                            block157: {
                                                                block156: {
                                                                    block155: {
                                                                        int n10;
                                                                        block154: {
                                                                            block153: {
                                                                                int n11;
                                                                                int[] nArray;
                                                                                block151: {
                                                                                    boolean bl4;
                                                                                    block150: {
                                                                                        block149: {
                                                                                            try {
                                                                                                if (class_23382.method_10264() > 40) {
                                                                                                    return false;
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                                            }
                                                                                            n3 = pulsescanner.f.g.d.a.field_1687.method_8314(class_1944.field_9282, class_23382);
                                                                                            try {
                                                                                                if (pulsescanner.f.g.d.a.field_1687.method_8314(class_1944.field_9284, class_23382) > 1) {
                                                                                                    return false;
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                                            }
                                                                                            nArray = new int[6];
                                                                                            n7 = 0;
                                                                                            n6 = 15;
                                                                                            for (n9 = 0; n9 < 6; ++n9) {
                                                                                                nArray[n9] = pulsescanner.f.g.d.a.field_1687.method_8314(class_1944.field_9282, class_23382.method_10093(q[n9]));
                                                                                                n7 = Math.max(n7, nArray[n9]);
                                                                                                n6 = Math.min(n6, nArray[n9]);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (n3 >= 2 || n7 >= 2) break block149;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                                                }
                                                                                                return false;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (n7 <= 5 && n3 <= 5) break block150;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                                            }
                                                                                            return false;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    n9 = 0;
                                                                                    n10 = 0;
                                                                                    n8 = 0;
                                                                                    for (int n12 : nArray) {
                                                                                        try {
                                                                                            if (n12 == 4) {
                                                                                                ++n10;
                                                                                            }
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                                        }
                                                                                        try {
                                                                                            if (n12 >= 3) {
                                                                                                ++n9;
                                                                                            }
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                                        }
                                                                                        try {
                                                                                            if (n12 != 5) continue;
                                                                                            ++n8;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        bl4 = n3 == 0;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                                    }
                                                                                    bl3 = bl4;
                                                                                    try {
                                                                                        block152: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (n3 == 5 && n7 <= 4) break block151;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                                                    }
                                                                                                    if (!bl3) break block152;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                                                }
                                                                                                if (n10 > 0) break block151;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                                    }
                                                                                }
                                                                                boolean[] blArray = new boolean[6];
                                                                                n5 = 0;
                                                                                class_2350 class_23502 = null;
                                                                                for (n11 = 0; n11 < 6; ++n11) {
                                                                                    class_2680 class_26802 = pulsescanner.f.g.d.a.field_1687.method_8320(class_23382.method_10093(q[n11]));
                                                                                    try {
                                                                                        blArray[n11] = class_26802.method_26215();
                                                                                        if (!this.e(class_26802)) continue;
                                                                                        ++n5;
                                                                                        if (class_23502 != null) continue;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                                    }
                                                                                    class_23502 = q[n11];
                                                                                }
                                                                                try {
                                                                                    if (class_23502 == null) {
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                                }
                                                                                n11 = class_23502.method_10153().ordinal();
                                                                                n4 = nArray[n11];
                                                                                bl2 = blArray[n11];
                                                                                n2 = 0;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (!bl3 || !bl2) break block153;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                                        }
                                                                                        if (n4 != 4) break block153;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                                    }
                                                                                    ++n2;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (!bl3 || n10 < 1) break block154;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                                }
                                                                                ++n2;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (!bl3 || n10 < 2) break block155;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                            }
                                                                            ++n2;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (!bl3 || !bl2) break block156;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.g.d.a(matchException);
                                                                            }
                                                                            if (n4 != 3) break block156;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.g.d.a(matchException);
                                                                        }
                                                                        ++n2;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (!bl3 || n9 < 1) break block157;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.g.d.a(matchException);
                                                                    }
                                                                    ++n2;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (!bl3 || n9 < 2) break block158;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.g.d.a(matchException);
                                                                }
                                                                ++n2;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.g.d.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (!bl3 || n8 < 1) break block159;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.g.d.a(matchException);
                                                            }
                                                            ++n2;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.g.d.a(matchException);
                                                        }
                                                    }
                                                    try {
                                                        if (n3 == 5) {
                                                            ++n2;
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.g.d.a(matchException);
                                                    }
                                                    try {
                                                        if (n3 == 4) {
                                                            ++n2;
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.g.d.a(matchException);
                                                    }
                                                    try {
                                                        if (n3 == 3) {
                                                            ++n2;
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.g.d.a(matchException);
                                                    }
                                                    try {
                                                        try {
                                                            if (n3 < 1 || n3 > 4) break block160;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.g.d.a(matchException);
                                                        }
                                                        ++n2;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.g.d.a(matchException);
                                                    }
                                                }
                                                try {
                                                    if (n3 >= 3) {
                                                        ++n2;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                                try {
                                                    if (n7 - n3 == 4) {
                                                        ++n2;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                                try {
                                                    if (n7 - n3 >= 3) {
                                                        ++n2;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                                try {
                                                    if (n7 - n3 >= 2) {
                                                        ++n2;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                                try {
                                                    try {
                                                        if (!bl2 || n4 < 4) break block161;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.g.d.a(matchException);
                                                    }
                                                    ++n2;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (!bl2 || n4 < 3) break block162;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                                ++n2;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.g.d.a(matchException);
                                            }
                                        }
                                        try {
                                            if (n7 - n6 >= 4) {
                                                ++n2;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                        try {
                                            if (n7 - n6 >= 3) {
                                                ++n2;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (!bl2 || n4 < 3) break block163;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.g.d.a(matchException);
                                                }
                                                if (n4 != n7) break block163;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.g.d.a(matchException);
                                            }
                                            ++n2;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (n5 != 1 || !bl2) break block164;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.g.d.a(matchException);
                                            }
                                            if (n4 < 3) break block164;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                        ++n2;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.d.a(matchException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n5 < 2 || !bl2) break block165;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                        if (n4 < 3) break block165;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.d.a(matchException);
                                    }
                                    ++n2;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (!bl3 || !bl2) break block166;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.d.a(matchException);
                                    }
                                    if (n4 != 4) break block166;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                                ++n2;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (!bl3 || !bl2) break block167;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                                if (n4 < 3) break block167;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            ++n2;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (n3 < 3 || !bl2) break block168;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                        ++n2;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                try {
                    try {
                        if (n2 < this.A.h() || !this.b(class_23382)) break block169;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    bl = true;
                    break block170;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean b(class_2338 class_23382) {
        int n2 = 0;
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                for (int i4 = -2; i4 <= 2; ++i4) {
                    block13: {
                        class_2680 class_26802;
                        block12: {
                            class_26802 = pulsescanner.f.g.d.a.field_1687.method_8320((class_2338)class_23392.method_10103(class_23382.method_10263() + i2, class_23382.method_10264() + i3, class_23382.method_10260() + i4));
                            try {
                                try {
                                    if (!class_26802.method_27852(class_2246.field_27159) && !class_26802.method_27852(class_2246.field_27160)) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                                n2 += 2;
                                break block13;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        try {
                            if (class_26802.method_27852(class_2246.field_27114)) {
                                ++n2;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    try {
                        if (n2 < 4) continue;
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
            }
        }
        return false;
    }

    private void s() {
        class_243 class_2432 = pulsescanner.f.g.d.a.field_1724.method_33571();
        double d2 = (Double)this.r.a() * (Double)this.r.a();
        HashMap<Long, Float> hashMap = new HashMap<Long, Float>();
        for (h object2 : this.V.values()) {
            try {
                for (int arrayList3 = 0; arrayList3 < object2.a.length; ++arrayList3) {
                    hashMap.merge(object2.a[arrayList3], Float.valueOf(object2.b[arrayList3]), Math::max);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        float[] fArray = new float[hashMap.size()];
        ArrayList<j> arrayList = new ArrayList<j>();
        int n2 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            class_2338 class_23382 = class_2338.method_10092((long)((Long)entry.getKey()));
            try {
                try {
                    try {
                        arrayList2.add(class_23382);
                        fArray[n2++] = ((Float)entry.getValue()).floatValue();
                        if (!(((Float)entry.getValue()).floatValue() > 0.0f) || !((double)(((Float)entry.getValue()).floatValue() * 100.0f) >= (Double)this.F.a())) continue;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    if (!(class_243.method_24953((class_2382)class_23382).method_1025(class_2432) <= d2)) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                arrayList.add(new j(class_23382, ((Float)entry.getValue()).floatValue()));
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
        this.ac = arrayList;
        this.ad = pulsescanner.f.g.d.a(arrayList2, fArray);
        ArrayList arrayList3 = new ArrayList();
        for (k k2 : this.ad) {
            try {
                if (!this.a(k2)) continue;
                arrayList3.add(k2);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
        this.ae = this.a(arrayList3);
        ArrayList<i> arrayList4 = new ArrayList<i>();
        for (i i2 : this.ae) {
            try {
                if (!this.a(i2)) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            boolean bl = false;
            for (long l2 : this.ab) {
                try {
                    if (Math.abs(class_1923.method_8325((long)l2) - i2.aB()) > 1 || Math.abs(class_1923.method_8332((long)l2) - i2.aC()) > 1) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                bl = true;
                break;
            }
            try {
                if (bl) continue;
                this.ab.add(i2.a());
                arrayList4.add(i2);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
        try {
            if (!arrayList4.isEmpty()) {
                this.b(arrayList4);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
    }

    private static List<k> a(List<class_2338> list, float[] fArray) {
        int n2 = (int)Math.ceil(7.0);
        HashMap<Long, List> hashMap = new HashMap<Long, List>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            class_2338 class_23382 = list.get(i2);
            hashMap.computeIfAbsent(class_2338.method_10064((int)Math.floorDiv(class_23382.method_10263(), n2), (int)Math.floorDiv(class_23382.method_10264(), n2), (int)Math.floorDiv(class_23382.method_10260(), n2)), d::lambda$groupGeodes$7).add(i2);
        }
        boolean[] blArray = new boolean[list.size()];
        double d2 = 49.0;
        ArrayList<k> arrayList = new ArrayList<k>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        int n3 = 0;
        while (true) {
            block21: {
                double d3;
                double d4;
                double d5;
                double d6;
                int n4;
                int n5;
                block22: {
                    block20: {
                        try {
                            try {
                                if (n3 >= list.size()) break;
                                if (!blArray[n3]) break block20;
                                break block21;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    blArray[n3] = true;
                    arrayDeque.add(n3);
                    n5 = 0;
                    n4 = Integer.MIN_VALUE;
                    d6 = 0.0;
                    d5 = 0.0;
                    d4 = 0.0;
                    d3 = 0.0;
                    while (!arrayDeque.isEmpty()) {
                        int n6 = (Integer)arrayDeque.poll();
                        class_2338 class_23383 = list.get(n6);
                        ++n5;
                        d3 += (double)fArray[n6];
                        d6 += (double)class_23383.method_10263() + 0.5;
                        d5 += (double)class_23383.method_10264() + 0.5;
                        d4 += (double)class_23383.method_10260() + 0.5;
                        n4 = Math.max(n4, class_23383.method_10264());
                        int n7 = Math.floorDiv(class_23383.method_10263(), n2);
                        int n8 = Math.floorDiv(class_23383.method_10264(), n2);
                        int n9 = Math.floorDiv(class_23383.method_10260(), n2);
                        for (int i3 = -1; i3 <= 1; ++i3) {
                            for (int i4 = -1; i4 <= 1; ++i4) {
                                for (int i5 = -1; i5 <= 1; ++i5) {
                                    List list2 = (List)hashMap.get(class_2338.method_10064((int)(n7 + i3), (int)(n8 + i4), (int)(n9 + i5)));
                                    try {
                                        if (list2 == null) {
                                            continue;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.d.a(matchException);
                                    }
                                    Iterator iterator = list2.iterator();
                                    while (iterator.hasNext()) {
                                        int n10 = (Integer)iterator.next();
                                        try {
                                            try {
                                                if (blArray[n10] || !(list.get(n10).method_10262((class_2382)class_23383) <= d2)) continue;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.g.d.a(matchException);
                                            }
                                            blArray[n10] = true;
                                            arrayDeque.add(n10);
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    try {
                        if (!(d3 <= 0.0)) break block22;
                        break block21;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                arrayList.add(new k((int)Math.round(d3), d3 / (double)n5, d6 / (double)n5, d5 / (double)n5, d4 / (double)n5, n4));
            }
            ++n3;
        }
        return arrayList;
    }

    private List<i> a(List<k> list) {
        ArrayList<i> arrayList = new ArrayList<i>();
        boolean[] blArray = new boolean[list.size()];
        double d2 = (Double)this.w.a() * (Double)this.w.a();
        int n2 = 0;
        while (true) {
            block18: {
                double d3;
                ArrayList<k> arrayList2;
                block21: {
                    block17: {
                        try {
                            try {
                                if (n2 >= list.size()) break;
                                if (!blArray[n2]) break block17;
                                break block18;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    blArray[n2] = true;
                    arrayList2 = new ArrayList<k>();
                    ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
                    arrayDeque.add(n2);
                    block13: while (!arrayDeque.isEmpty()) {
                        k k2 = list.get((Integer)arrayDeque.poll());
                        arrayList2.add(k2);
                        int n3 = 0;
                        while (true) {
                            block20: {
                                block19: {
                                    try {
                                        try {
                                            if (n3 >= list.size()) continue block13;
                                            if (!blArray[n3]) break block19;
                                            break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.d.a(matchException);
                                    }
                                }
                                k k3 = list.get(n3);
                                double d4 = k3.aK() - k2.aK();
                                double d5 = k3.aL() - k2.aL();
                                d3 = k3.aM() - k2.aM();
                                try {
                                    if (d4 * d4 + d5 * d5 + d3 * d3 <= d2) {
                                        blArray[n3] = true;
                                        arrayDeque.add(n3);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.d.a(matchException);
                                }
                            }
                            ++n3;
                        }
                    }
                    try {
                        if (arrayList2.size() >= this.v.h()) break block21;
                        break block18;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                double d6 = 0.0;
                double d7 = 0.0;
                double d8 = 0.0;
                int n4 = Integer.MIN_VALUE;
                d3 = Double.MAX_VALUE;
                for (k k4 : arrayList2) {
                    d6 += k4.aK();
                    d7 += k4.aL();
                    d8 += k4.aM();
                    n4 = Math.max(n4, k4.aN());
                    d3 = Math.min(d3, this.b(k4));
                }
                int n5 = arrayList2.size();
                arrayList.add(new i(arrayList2, (int)Math.floor(d6 / (double)n5) >> 4, (int)Math.floor(d8 / (double)n5) >> 4, d7 / (double)n5, n4, d3));
            }
            ++n2;
        }
        return arrayList;
    }

    private boolean a(k k2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (k2.aI() < this.u.h() || !(k2.aJ() * 100.0 >= (Double)this.t.a())) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean a(i i2) {
        boolean bl;
        try {
            bl = i2.aF() > (Double)this.x.a();
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    private double b(k k2) {
        double d2;
        double d3 = (Double)this.x.a();
        try {
            if (d3 <= 0.0) {
                return Double.MAX_VALUE;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        double d4 = Double.MAX_VALUE;
        int n2 = (int)Math.floor(k2.aK() - d3) >> 4;
        int n3 = (int)Math.floor(k2.aK() + d3) >> 4;
        int n4 = (int)Math.floor(k2.aM() - d3) >> 4;
        int n5 = (int)Math.floor(k2.aM() + d3) >> 4;
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                for (long l2 : this.c(i2, i3)) {
                    class_2338 class_23382 = class_2338.method_10092((long)l2);
                    double d5 = (double)class_23382.method_10263() + 0.5 - k2.aK();
                    double d6 = (double)class_23382.method_10264() + 0.5 - k2.aL();
                    double d7 = (double)class_23382.method_10260() + 0.5 - k2.aM();
                    d4 = Math.min(d4, Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7));
                }
            }
        }
        try {
            d2 = d4 <= d3 ? d4 : Double.MAX_VALUE;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return d2;
    }

    private long[] c(int n2, int n3) {
        class_2818 class_28182;
        long l2;
        block9: {
            long[] lArray;
            block11: {
                block10: {
                    l l3;
                    block8: {
                        l2 = class_1923.method_8331((int)n2, (int)n3);
                        l3 = this.aa.get(l2);
                        try {
                            try {
                                if (l3 == null || (long)this.ah - l3.aP() >= 600L) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                            return l3.aO();
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                    }
                    class_28182 = pulsescanner.f.g.d.a.field_1687.method_2935().method_2857(n2, n3, class_2806.field_12803, false);
                    try {
                        try {
                            if (class_28182 != null) break block9;
                            if (l3 == null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.d.a(matchException);
                        }
                        lArray = l3.aO();
                        break block11;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                }
                lArray = new long[]{};
            }
            return lArray;
        }
        long[] lArray = this.b(class_28182);
        this.aa.put(l2, new l(lArray, this.ah));
        return lArray;
    }

    private long[] b(class_2818 class_28182) {
        class_1923 class_19232 = class_28182.method_12004();
        int n2 = class_19232.method_8326();
        int n3 = class_19232.method_8328();
        int n4 = class_28182.method_31607();
        int n5 = Math.min(class_28182.method_31607() + class_28182.method_31605() - 1, 100);
        int n6 = this.y.h();
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (int i2 = 0; i2 < 16; ++i2) {
            block11: for (int i3 = 0; i3 < 16; ++i3) {
                int n7 = n2 + i2;
                int n8 = n3 + i3;
                int n9 = 0;
                int n10 = n5;
                while (true) {
                    block18: {
                        block17: {
                            boolean bl;
                            block16: {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                if (n10 < n4 - 1) continue block11;
                                                if (n10 < n4) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.g.d.a(matchException);
                                            }
                                            if (!this.a(class_28182, n7, n10, n8)) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.g.d.a(matchException);
                                        }
                                        bl = true;
                                        break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.d.a(matchException);
                                    }
                                }
                                bl = false;
                            }
                            boolean bl2 = bl;
                            try {
                                if (!bl2) break block17;
                                ++n9;
                                break block18;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        if (n9 >= n6) {
                            try {
                                for (int i4 = 1; i4 <= n9; i4 += 2) {
                                    arrayList.add(class_2338.method_10064((int)n7, (int)(n10 + i4), (int)n8));
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.d.a(matchException);
                            }
                        }
                        n9 = 0;
                    }
                    --n10;
                }
            }
        }
        return arrayList.stream().mapToLong(Long::longValue).toArray();
    }

    private boolean a(class_2818 class_28182, int n2, int n3, int n4) {
        boolean bl;
        int n5;
        try {
            if (!class_28182.method_8320((class_2338)this.af.method_10103(n2, n3, n4)).method_26215()) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        class_2350 class_23502 = null;
        int n6 = 0;
        for (n5 = 2; n5 < 6; ++n5) {
            class_2350 class_23503 = q[n5];
            try {
                if (this.b(class_28182, n2 + class_23503.method_10148(), n3, n4 + class_23503.method_10165())) {
                    ++n6;
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            class_23502 = class_23503;
        }
        try {
            if (n6 == 4) {
                return true;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        try {
            if (n6 != 3) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        n5 = n2 + class_23502.method_10148();
        int n7 = n4 + class_23502.method_10165();
        try {
            if (!this.c(class_28182, n5, n3, n7).method_26215()) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        int n8 = 0;
        for (int i2 = 2; i2 < 6; ++i2) {
            class_2350 class_23504 = q[i2];
            try {
                if (class_23504 == class_23502.method_10153()) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            try {
                if (!this.b(class_28182, n5 + class_23504.method_10148(), n3, n7 + class_23504.method_10165())) continue;
                ++n8;
                continue;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
        }
        try {
            bl = n8 == 3;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    private boolean b(class_2818 class_28182, int n2, int n3, int n4) {
        boolean bl;
        block5: {
            block4: {
                class_2680 class_26802 = this.c(class_28182, n2, n3, n4);
                try {
                    try {
                        if (class_26802.method_26215() || !class_26802.method_26227().method_15769()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private class_2680 c(class_2818 class_28182, int n2, int n3, int n4) {
        class_2680 class_26802;
        block5: {
            block4: {
                class_1923 class_19232 = class_28182.method_12004();
                try {
                    try {
                        this.af.method_10103(n2, n3, n4);
                        if (n2 >> 4 != class_19232.field_9181 || n4 >> 4 != class_19232.field_9180) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    class_26802 = class_28182.method_8320((class_2338)this.af);
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
            }
            class_26802 = pulsescanner.f.g.d.a.field_1687.method_8320((class_2338)this.af);
        }
        return class_26802;
    }

    private String b(i i2) {
        return i2.aB() * 16 + 8 + " " + (int)Math.round(i2.aD()) + " " + (i2.aC() * 16 + 8);
    }

    private int a(double d2, double d3, double d4) {
        return (int)Math.round(Math.sqrt(pulsescanner.f.g.d.a.field_1724.method_33571().method_1028(d2, d3, d4)));
    }

    private void b(List<i> list) {
        block5: {
            String[] stringArray;
            int n2 = (Integer)this.O.a();
            if (((Boolean)this.Q.a()).booleanValue()) {
                for (i i2 : list.subList(0, Math.min(3, list.size()))) {
                    stringArray = cb;
                    pulsescanner.d.d.a(stringArray[1], i2.aA().size() + stringArray[15] + this.b(i2) + stringArray[48] + this.a((double)(i2.aB() * 16 + 8), i2.aD(), (double)(i2.aC() * 16 + 8)) + "m", n2, 6.0f);
                }
            }
            try {
                if (!((Boolean)this.U.a()).booleanValue() || pulsescanner.f.g.d.a.field_1724 == null) break block5;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            for (i i2 : list) {
                stringArray = cb;
                pulsescanner.f.g.d.a.field_1724.method_7353((class_2561)class_2561.method_43470((String)stringArray[51]).method_27692(class_124.field_1076).method_10852((class_2561)class_2561.method_43470((String)(i2.aA().size() + stringArray[65] + this.b(i2))).method_27692(class_124.field_1080)), false);
            }
        }
        this.t();
    }

    private void t() {
        pulsescanner.d.a.a((String)this.R.a(), (Double)this.S.a());
    }

    public void a(class_4587 class_45872, class_4184 class_41842) {
        block10: {
            int n2;
            int n3;
            int n4;
            class_4588 class_45882;
            class_4587.class_4665 class_46652;
            class_243 class_2432;
            block9: {
                class_2432 = class_41842.method_71156();
                class_46652 = class_45872.method_23760();
                try {
                    if (!((Boolean)this.N.a()).booleanValue() || this.ae.isEmpty()) break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                class_45882 = pulsescanner.g.k.b(true);
                n4 = (Integer)this.O.a();
                n3 = (int)((Double)this.P.a() * 2.55);
                for (i object : this.ae) {
                    if (!this.a(object)) continue;
                    try {
                        if (!this.d(object.aB(), object.aC())) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.d.a(matchException);
                    }
                    float j2 = (float)((double)(object.aB() * 16) - class_2432.field_1352);
                    float class_23382 = (float)((double)(object.aC() * 16) - class_2432.field_1350);
                    float n6 = (float)((double)object.aE() + 1.02 - class_2432.field_1351);
                    pulsescanner.g.k.a(class_46652, class_45882, j2, n6, class_23382, j2 + 16.0f, class_23382 + 16.0f, pulsescanner.g.b.a(n4, n3));
                    n2 = pulsescanner.g.b.a(pulsescanner.g.b.a(n4, -1, 0.2f), Math.min(255, n3 + 40));
                    pulsescanner.g.k.a(class_46652, class_45882, j2, n6, class_23382, j2 + 16.0f, class_23382 + 0.35f, n2);
                    pulsescanner.g.k.a(class_46652, class_45882, j2, n6, class_23382 + 15.65f, j2 + 16.0f, class_23382 + 16.0f, n2);
                    pulsescanner.g.k.a(class_46652, class_45882, j2, n6, class_23382 + 0.35f, j2 + 0.35f, class_23382 + 15.65f, n2);
                    pulsescanner.g.k.a(class_46652, class_45882, j2 + 15.65f, n6, class_23382 + 0.35f, j2 + 16.0f, class_23382 + 15.65f, n2);
                }
            }
            try {
                if (!((Boolean)this.C.a()).booleanValue() || this.ac.isEmpty()) break block10;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.d.a(matchException);
            }
            class_45882 = pulsescanner.g.k.b((Boolean)this.H.a());
            n4 = (Integer)this.D.a() | 0xFF000000;
            n3 = (int)((Double)this.E.a() * 2.55);
            int n5 = pulsescanner.g.b.a(n4, -1, 0.28f);
            for (j j2 : this.ac) {
                double d2;
                class_2338 class_23382 = j2.aG();
                int n6 = (int)((float)n3 * (0.35f + 0.65f * j2.aH()));
                n2 = pulsescanner.g.b.a(n4, n6);
                int n7 = pulsescanner.g.b.a(n5, Math.min(255, (int)((float)n6 * 1.3f)));
                class_238 class_2383 = new class_238(class_23382).method_1011(0.04).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
                pulsescanner.g.k.a(class_46652, class_45882, class_2383, n2, n7);
                if (!((Boolean)this.G.a()).booleanValue() || !((d2 = Math.sqrt(class_243.method_24953((class_2382)class_23382).method_1025(class_2432))) < 14.0)) continue;
                float f2 = (float)(1.0 - d2 / 14.0);
                int n8 = pulsescanner.g.b.a(n4, (int)((float)n6 * 0.38f * f2));
                pulsescanner.g.k.a(class_46652, class_45882, class_2383.method_1014(0.09), n8, n8);
                pulsescanner.g.k.a(class_46652, class_45882, class_2383.method_1014(0.2), pulsescanner.g.b.a(n4, (int)((float)n6 * 0.16f * f2)), pulsescanner.g.b.a(n4, (int)((float)n6 * 0.16f * f2)));
            }
        }
    }

    private boolean d(int n2, int n3) {
        boolean bl;
        try {
            if (pulsescanner.f.g.d.a.field_1724 == null) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        int n4 = pulsescanner.f.g.d.a.field_1690.method_38521();
        try {
            bl = Math.max(Math.abs(n2 - (pulsescanner.f.g.d.a.field_1724.method_31477() >> 4)), Math.abs(n3 - (pulsescanner.f.g.d.a.field_1724.method_31479() >> 4))) <= n4;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    public void a(class_332 class_3322) {
        String[] stringArray;
        float f2 = this.L.g();
        if (((Boolean)this.I.a()).booleanValue()) {
            int n2 = this.u.h();
            for (k k2 : this.ad) {
                String string;
                StringBuilder stringBuilder;
                if (k2.aI() < n2) continue;
                try {
                    if (!this.d((int)Math.floor(k2.aK()) >> 4, (int)Math.floor(k2.aM()) >> 4)) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                float[] fArray = pulsescanner.g.h.a(new class_243(k2.aK(), (double)k2.aN() + 1.2, k2.aM()));
                try {
                    if (!pulsescanner.g.h.a(fArray, 60.0f)) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                try {
                    stringBuilder = new StringBuilder().append(Math.round(k2.aJ() * 100.0)).append(cb[7]).append(k2.aI()).append(cb[41]);
                    string = (Boolean)this.M.a() != false ? cb[50] + this.a(k2.aK(), k2.aL(), k2.aM()) + "m" : "";
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                String string2 = stringBuilder.append(string).toString();
                stringArray = cb;
                pulsescanner.g.l.a(class_3322, fArray[0], fArray[1], stringArray[74], string2, (Integer)this.J.a(), f2, this.a(k2), true);
            }
        }
        if (((Boolean)this.K.a()).booleanValue()) {
            for (i i2 : this.ae) {
                Integer n2;
                String string;
                String string3;
                float f3;
                float f4;
                class_332 class_3323;
                try {
                    if (!this.d(i2.aB(), i2.aC())) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                double d2 = i2.aB() * 16 + 8;
                double d3 = i2.aC() * 16 + 8;
                float[] fArray = pulsescanner.g.h.a(new class_243(d2, (double)i2.aE() + 4.5, d3));
                try {
                    if (!pulsescanner.g.h.a(fArray, 80.0f)) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                boolean bl = this.a(i2);
                stringArray = cb;
                StringBuilder stringBuilder = new StringBuilder().append(i2.aA().size()).append(stringArray[56]);
                try {
                    if (((Boolean)this.M.a()).booleanValue()) {
                        stringBuilder.append(stringArray[48]).append(this.a(d2, i2.aD(), d3)).append("m");
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                try {
                    stringBuilder.append(cb[48]).append(this.b(i2));
                    if (!bl) {
                        stringBuilder.append(cb[66]).append((int)Math.round(i2.aF())).append("m");
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                try {
                    class_3323 = class_3322;
                    f4 = fArray[0];
                    f3 = fArray[1];
                    string3 = bl ? cb[3] : cb[27];
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                try {
                    string = stringBuilder.toString();
                    n2 = bl ? (Integer)this.O.a() : (Integer)this.J.a();
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.d.a(matchException);
                }
                pulsescanner.g.l.a(class_3323, f4, f3, string3, string, n2, f2, true, true);
            }
        }
    }

    private static List lambda$groupGeodes$7(Long l2) {
        return new ArrayList();
    }

    private static List lambda$countLeak$6(Integer n2) {
        return new ArrayList();
    }

    private static Set lambda$scan$5(Integer n2) {
        return new HashSet();
    }

    private boolean lambda$discover$4(Long l2) {
        boolean bl;
        try {
            bl = !this.a(class_1923.method_8325((long)l2), class_1923.method_8332((long)l2));
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    private static long lambda$discover$3(long[] lArray) {
        return lArray[1];
    }

    private boolean lambda$new$2() {
        boolean bl;
        try {
            bl = !this.R.a(cb[79]);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    private boolean lambda$new$1() {
        boolean bl;
        try {
            bl = !this.R.a(cb[29]);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    private boolean lambda$new$0() {
        boolean bl;
        try {
            bl = !this.z.a(cb[55]);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.d.a(matchException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[84];
                var3_1 = 0;
                var2_2 = "l\u000bY\u007f\u0018\u007fWQ\u0015\n<\u0014{MMP\u000fl\u000bY\u007f8\u007fWQ\u0015\n\u0019\u0014bL[\fr\u0017D\u007f8{WL\nO-\b\tl\u000bY\u007f8\u007fWQ\u0015\u001cl\u0016E([cJZ^N6\bcCQ\u001dO\u007f\u0014y\u0002O\u0012K+\u001ed\f\u0012x\u001bE;\u001e7RS\u001f^:[tMS\u0011Xq\u000er\u0017D\u007f8xLY\u0017N:\u0015tG\f\u001a^M-\u0014`L\u001f^\u009d\u007f[\u000fl\u000eE0\u001drF\u001f<_;\u001f~LX\u0004x\u0012E(.y\u0017F3[dWL^I7\u000eyIL^]6\u000f\u007f\u0002^^L3\u001ac\u0002L\u001bOr\u000f\u007fPP\u000bM7[{CF\u001bXq*l\u0011L+[pNP\t\n>\txWQ\u001a\n<\u0017bQK\u001bX,[nMJYX:[tNP\rO\u007f\u000fx\f\u000bo\u0012K+\u001e7q\\\u001fF:\nr\u0017D\u007f<rM[\u001bY^|\u0011_1\u000f7QK\u0011D:W7FZ\u001bZ,\u0017vVZ^K1\u001f7VJ\u0018L\u007f\u0012yQV\u001aO\u007f\u001crM[\u001bY\u007f\u001ad\u0002H\u001fF3\b7\n^\u0010^6VoP^\u0007\n;\u0012dEJ\u0017Y:\u001f7@J\u001aN6\u0015p\u0002^\u0013O+\u0013nQKW\u0004\f\u001f\u0019O0\u001frQ\u001f^\u009d\u007f[\u0004}\u0011^7 w\u0011]\u007f\bxNV\u001a\n+\u0013r\u0002\\\u0012_,\u000frP\u001f\u001cE'\u001ed\u0002^\fOq\u000b|\u0012_,\u000frP\u001f;y\u000f2l\u0016E([v\u0002Q\u0011^6\u001d~A^\nC0\u00157UW\u001bD\u007f\u001a7LZ\t\n,\u000ed\u0002\\\u0016_1\u00107KL^L0\u000eyF\u0011\fx\u001bE;\u001e7rS\u001f^:\b\nl\u000bY\u007f+{CK\u001bY\rk\u0016X0\u000epJ\u001f)K3\u0017d\u001dw\u0011]\u007f\bxNV\u001a\n+\u0013r\u0002\\\u0016_1\u00107N^\u0007O-[~Q\u0011\u0005m\u001fD8\u001e\ns\u0017M7\u000f7nZ\u001fA:}\u0012_:[gN^\nO\u007f\u001auMI\u001b\n:\rrPF^L0\u000eyF\u001f\u0019O0\u001fr\u0002H\u0017^7[~VL^I3\u000edVZ\f\n<\u0014bLKP\nx\u001bE;\u001e7cM\u001bK\u0096|\u0011_1\u000f7nZ\u001fA\u007f\u0014yNF^A1\u0014`Q\u001f\u0016E([zCQ\u0007\n=\u0017xAT\r\n>[dG\\\nC0\u00157JV\u001aO,W7LP\n\n(\u0013rPZP\n\u0019\u001atGL^H:\u0017xU\u001f\nB6\b7AW\u001fD<\u001e7MY^B0\u0017sKQ\u0019\n0\u0015r\u0002X\u001b^\u007f\u0015x\u0002]\u0011R\u007fScJZ\u0007\n,\u000f~NS^I0\u000eyV\u001f\nE(\u001aeF\u001f9X0\fy\u0002\u001aW\u0004\u0004q\u0011D:\ns\u0017M7\u000f7nZ\u001fA\u0006r\u001b^7\u0014s\u0004}\u0011^7\u0019o\u0012K&[cJZ^K3\u001eeV\u001f\rE*\u0015s\u0002Q\u0011]q&y\u0017F3\u001es\u0002]\u0011R:\b7MQ^O)\u001ee[\u001f\u0018F>\u001cpG[^I3\u000edVZ\f\u0004\u0012|\u0012_,\u000frP\u001f\u001cE'[tMS\u0011Xq\u000bx\u001bE;\u001e7aP\u0012E-'l\u0011_1\u001f7RS\u001fS:\u001f7UW\u001bD\u007f\u001a7QJ\r\n<\u0013bLT^C,[qMJ\u0010Nq\u001eo\u0012K+\u001e7MI\u001bX\u007f\u001eaGM\u0007\n9\u0017vEX\u001bN\u007f\u001aeG^P@k\u0017G:[gGM^^6\u0018|\u0002L\u000eO1\u000f7Q\\\u001fD1\u0012yE\u001f\u001dB*\u0015|Q\u0011^b6\u001c\u007fGM^L6\u0015sQ\u001f\nB6\u0015pQ\u001f\u0018K,\u000frP\u0011\r|\u0016_1\u00107mO\u001fI6\u000fn\t\u001f\u001dF*\bcGM\r ~\u0012Y0[gPV\u0010^\u007f\u000f\u007fG\u001f\u0012E<\u001acKP\u0010\n6\u00157AW\u001f^q`l\u0016E(\b7JV\u001aN:\u00157CR\u001b^7\u0002dV\u001f\u001dF*\bcGM\r\n>\u0015s\u0002Y\u0012K8\b7CM\u001bK,[`KK\u0016\n7\u001evTV\u0012S\u007f\u001ceMH\u0010\n8\u001exFZ\r\n+\u0013vV\u001f\u0010E=\u0014s[\u001f\u0016K,[sWX^^0U\u0006i\u0011F*\u0016r\u0005|\u0016C2\u001e,|\u0011_1\u000f~LX^M:\u0014sGL^K1[vPZ\u001f\n1\u001erFL^^0[uG\u001f\u0018F>\u001cpG[PIs\u0017M7\u000f7AW\u001bI4\b7VW\u001f^\u007f\u0016bQK^K8\trG\u001f\u001cO9\u0014eG\u001f\u001f\n<\u0017bQK\u001bX\u007f\u0012d\u0002Y\u0012K8\u001crF\u001fV\u0019\u007f\trAP\u0013G:\u0015sG[W\u0004\u0005\u001f^\u009d\u007f[\u000bw\u0011F:[EC[\u0017_,\u0005\u001f^\u009d\u007f[\nl\u000bY\u007f\u0018\u007fWQ\u0015\n\rx\u001bE;\u001e7qO\u001fI6\u0015p;~^N*\u001c7JP\u0012O\u007f\u000f\u007fKL^I3\u0014dG\u001f\nE\u007f\u000f\u007fG\u001f\u0019O0\u001frQ\u001f\u001dK1\u0018rNL^^7\u001e7RV\u0010A\u007f\u0018\u007fWQ\u0015\u0004\u0082l\u0016K-\u001e7MY^K\u007f\u001crM[\u001b\r,[uW[\u001aC1\u001c7D^\u001dO,[cJ^\n\n2\u000edV\u001f\u0016K)\u001e7QP\u0013O+\u0013~LX^E1[cJZ\u0013\u0004\u007f=eGL\u0016\n8\u001exFZ\r\n>\tr\u0002^\u001cE*\u000f7\u0011\n[\u0006\u007f\u0014yGL^Y6\u0016bN^\nO;[qMM^B0\u000eeQ\u001f\u0010O>\t7\u0013\u000fN\u000fq\n|\u0011_1\u000f7nZ\u001fA\u0007\u001f\u0019O0\u001frQ\u0010l\u000bY\u007f8\u007fWQ\u0015\n\u0019\u0012yFZ\f=~\u0012O-\u000f7TP\u0012_2\u001e7\n^\u001cE)\u001e7\u0013\u000fN\u000f\u007f\u0017v[Z\fY\u007f\u000f\u007fG\u001f\rE*\u0015s\u0002K\u0011\n2\u001a|G\u001f\u0017^\u007f\u0017xW[\u001bXvU\u0005k\u0011K,\u000f\u0002R\r\r|\u0012_,\u000frP\u001f=E3\u0014e\n|\u0011_1\u000f7nZ\u001fA\nl\u001dK1[DRZ\u001bNHy\u0017F3\u001es\u0002Y\u001fI:\b7C\u001f\u0019O0\u001fr\u0002Q\u001bO;\b7CL^]:\u0017{\u000e\u001f\rE\u007f\u000f~LF^M:\u0014sG\u001f\u0018X>\u001czGQ\nY\u007f\u001fxL\u0018\n\n<\u0014bLKP\n\u001f\u0019O0\u001frQ\u001f\u0002\n\n\u001f^\u009d\u007f[\u007fMS\u001b\n\fy\u0017F3[XR^\u001dC+\u0002\u000b|\u0016_1\u00107aP\u0012E-:}\u0012E<\u0010d\u0002P\u0018\n(\u001a{NZ\u001a\u00076\u00157TZ\f^6\u0018vN\u001f\u001fC-[cJ^\n\n<\u0014bLK^K,[v\u0002[\u000bM\u007f\u0013xNZP\u000br\u001b^7\u0014s\u0002w\u0017^,\u001bl\u001bO\u007f\u0018{WL\nO-\b7@Z\u0016C1\u001f7@S\u0011I4\b9^l\u001dK1[vL[^N-\u001a`\u0002\\\u0012_,\u000frPL^]6\u000f\u007fKQ^^7\u0012d\u0002[\u0017Y+\u001ayAZP\n\u0019\u0014bL[^M:\u0014sGL^K1\u001f7QJ\r\n<\u0013bLT\r\n,\u000fv[\u001f\u000bD+\u0012{\u0002F\u0011_\u007f\u0017rCI\u001b\u0004\tr\u0017D\u007f<eMH\u0010\u0005x\u001bE;\u001e\f|\u0016K+[ZGL\rK8\u001e\u000eo\u0012K+\u001e7fV\r^>\u0015tG\nw\u0011F:[SGO\nB\n|\u0016_1\u00107dV\u0012F\u0004q\u0011D:\u0013l\u0017P:[xD\u001f\nB:[gN^\nO,U\nk\u001bY+[DMJ\u0010N";
                var4_3 = "l\u000bY\u007f\u0018\u007fWQ\u0015\n<\u0014{MMP\u000fl\u000bY\u007f8\u007fWQ\u0015\n\u0019\u0014bL[\fr\u0017D\u007f8{WL\nO-\b\tl\u000bY\u007f8\u007fWQ\u0015\u001cl\u0016E([cJZ^N6\bcCQ\u001dO\u007f\u0014y\u0002O\u0012K+\u001ed\f\u0012x\u001bE;\u001e7RS\u001f^:[tMS\u0011Xq\u000er\u0017D\u007f8xLY\u0017N:\u0015tG\f\u001a^M-\u0014`L\u001f^\u009d\u007f[\u000fl\u000eE0\u001drF\u001f<_;\u001f~LX\u0004x\u0012E(.y\u0017F3[dWL^I7\u000eyIL^]6\u000f\u007f\u0002^^L3\u001ac\u0002L\u001bOr\u000f\u007fPP\u000bM7[{CF\u001bXq*l\u0011L+[pNP\t\n>\txWQ\u001a\n<\u0017bQK\u001bX,[nMJYX:[tNP\rO\u007f\u000fx\f\u000bo\u0012K+\u001e7q\\\u001fF:\nr\u0017D\u007f<rM[\u001bY^|\u0011_1\u000f7QK\u0011D:W7FZ\u001bZ,\u0017vVZ^K1\u001f7VJ\u0018L\u007f\u0012yQV\u001aO\u007f\u001crM[\u001bY\u007f\u001ad\u0002H\u001fF3\b7\n^\u0010^6VoP^\u0007\n;\u0012dEJ\u0017Y:\u001f7@J\u001aN6\u0015p\u0002^\u0013O+\u0013nQKW\u0004\f\u001f\u0019O0\u001frQ\u001f^\u009d\u007f[\u0004}\u0011^7 w\u0011]\u007f\bxNV\u001a\n+\u0013r\u0002\\\u0012_,\u000frP\u001f\u001cE'\u001ed\u0002^\fOq\u000b|\u0012_,\u000frP\u001f;y\u000f2l\u0016E([v\u0002Q\u0011^6\u001d~A^\nC0\u00157UW\u001bD\u007f\u001a7LZ\t\n,\u000ed\u0002\\\u0016_1\u00107KL^L0\u000eyF\u0011\fx\u001bE;\u001e7rS\u001f^:\b\nl\u000bY\u007f+{CK\u001bY\rk\u0016X0\u000epJ\u001f)K3\u0017d\u001dw\u0011]\u007f\bxNV\u001a\n+\u0013r\u0002\\\u0016_1\u00107N^\u0007O-[~Q\u0011\u0005m\u001fD8\u001e\ns\u0017M7\u000f7nZ\u001fA:}\u0012_:[gN^\nO\u007f\u001auMI\u001b\n:\rrPF^L0\u000eyF\u001f\u0019O0\u001fr\u0002H\u0017^7[~VL^I3\u000edVZ\f\n<\u0014bLKP\nx\u001bE;\u001e7cM\u001bK\u0096|\u0011_1\u000f7nZ\u001fA\u007f\u0014yNF^A1\u0014`Q\u001f\u0016E([zCQ\u0007\n=\u0017xAT\r\n>[dG\\\nC0\u00157JV\u001aO,W7LP\n\n(\u0013rPZP\n\u0019\u001atGL^H:\u0017xU\u001f\nB6\b7AW\u001fD<\u001e7MY^B0\u0017sKQ\u0019\n0\u0015r\u0002X\u001b^\u007f\u0015x\u0002]\u0011R\u007fScJZ\u0007\n,\u000f~NS^I0\u000eyV\u001f\nE(\u001aeF\u001f9X0\fy\u0002\u001aW\u0004\u0004q\u0011D:\ns\u0017M7\u000f7nZ\u001fA\u0006r\u001b^7\u0014s\u0004}\u0011^7\u0019o\u0012K&[cJZ^K3\u001eeV\u001f\rE*\u0015s\u0002Q\u0011]q&y\u0017F3\u001es\u0002]\u0011R:\b7MQ^O)\u001ee[\u001f\u0018F>\u001cpG[^I3\u000edVZ\f\u0004\u0012|\u0012_,\u000frP\u001f\u001cE'[tMS\u0011Xq\u000bx\u001bE;\u001e7aP\u0012E-'l\u0011_1\u001f7RS\u001fS:\u001f7UW\u001bD\u007f\u001a7QJ\r\n<\u0013bLT^C,[qMJ\u0010Nq\u001eo\u0012K+\u001e7MI\u001bX\u007f\u001eaGM\u0007\n9\u0017vEX\u001bN\u007f\u001aeG^P@k\u0017G:[gGM^^6\u0018|\u0002L\u000eO1\u000f7Q\\\u001fD1\u0012yE\u001f\u001dB*\u0015|Q\u0011^b6\u001c\u007fGM^L6\u0015sQ\u001f\nB6\u0015pQ\u001f\u0018K,\u000frP\u0011\r|\u0016_1\u00107mO\u001fI6\u000fn\t\u001f\u001dF*\bcGM\r ~\u0012Y0[gPV\u0010^\u007f\u000f\u007fG\u001f\u0012E<\u001acKP\u0010\n6\u00157AW\u001f^q`l\u0016E(\b7JV\u001aN:\u00157CR\u001b^7\u0002dV\u001f\u001dF*\bcGM\r\n>\u0015s\u0002Y\u0012K8\b7CM\u001bK,[`KK\u0016\n7\u001evTV\u0012S\u007f\u001ceMH\u0010\n8\u001exFZ\r\n+\u0013vV\u001f\u0010E=\u0014s[\u001f\u0016K,[sWX^^0U\u0006i\u0011F*\u0016r\u0005|\u0016C2\u001e,|\u0011_1\u000f~LX^M:\u0014sGL^K1[vPZ\u001f\n1\u001erFL^^0[uG\u001f\u0018F>\u001cpG[PIs\u0017M7\u000f7AW\u001bI4\b7VW\u001f^\u007f\u0016bQK^K8\trG\u001f\u001cO9\u0014eG\u001f\u001f\n<\u0017bQK\u001bX\u007f\u0012d\u0002Y\u0012K8\u001crF\u001fV\u0019\u007f\trAP\u0013G:\u0015sG[W\u0004\u0005\u001f^\u009d\u007f[\u000bw\u0011F:[EC[\u0017_,\u0005\u001f^\u009d\u007f[\nl\u000bY\u007f\u0018\u007fWQ\u0015\n\rx\u001bE;\u001e7qO\u001fI6\u0015p;~^N*\u001c7JP\u0012O\u007f\u000f\u007fKL^I3\u0014dG\u001f\nE\u007f\u000f\u007fG\u001f\u0019O0\u001frQ\u001f\u001dK1\u0018rNL^^7\u001e7RV\u0010A\u007f\u0018\u007fWQ\u0015\u0004\u0082l\u0016K-\u001e7MY^K\u007f\u001crM[\u001b\r,[uW[\u001aC1\u001c7D^\u001dO,[cJ^\n\n2\u000edV\u001f\u0016K)\u001e7QP\u0013O+\u0013~LX^E1[cJZ\u0013\u0004\u007f=eGL\u0016\n8\u001exFZ\r\n>\tr\u0002^\u001cE*\u000f7\u0011\n[\u0006\u007f\u0014yGL^Y6\u0016bN^\nO;[qMM^B0\u000eeQ\u001f\u0010O>\t7\u0013\u000fN\u000fq\n|\u0011_1\u000f7nZ\u001fA\u0007\u001f\u0019O0\u001frQ\u0010l\u000bY\u007f8\u007fWQ\u0015\n\u0019\u0012yFZ\f=~\u0012O-\u000f7TP\u0012_2\u001e7\n^\u001cE)\u001e7\u0013\u000fN\u000f\u007f\u0017v[Z\fY\u007f\u000f\u007fG\u001f\rE*\u0015s\u0002K\u0011\n2\u001a|G\u001f\u0017^\u007f\u0017xW[\u001bXvU\u0005k\u0011K,\u000f\u0002R\r\r|\u0012_,\u000frP\u001f=E3\u0014e\n|\u0011_1\u000f7nZ\u001fA\nl\u001dK1[DRZ\u001bNHy\u0017F3\u001es\u0002Y\u001fI:\b7C\u001f\u0019O0\u001fr\u0002Q\u001bO;\b7CL^]:\u0017{\u000e\u001f\rE\u007f\u000f~LF^M:\u0014sG\u001f\u0018X>\u001czGQ\nY\u007f\u001fxL\u0018\n\n<\u0014bLKP\n\u001f\u0019O0\u001frQ\u001f\u0002\n\n\u001f^\u009d\u007f[\u007fMS\u001b\n\fy\u0017F3[XR^\u001dC+\u0002\u000b|\u0016_1\u00107aP\u0012E-:}\u0012E<\u0010d\u0002P\u0018\n(\u001a{NZ\u001a\u00076\u00157TZ\f^6\u0018vN\u001f\u001fC-[cJ^\n\n<\u0014bLK^K,[v\u0002[\u000bM\u007f\u0013xNZP\u000br\u001b^7\u0014s\u0002w\u0017^,\u001bl\u001bO\u007f\u0018{WL\nO-\b7@Z\u0016C1\u001f7@S\u0011I4\b9^l\u001dK1[vL[^N-\u001a`\u0002\\\u0012_,\u000frPL^]6\u000f\u007fKQ^^7\u0012d\u0002[\u0017Y+\u001ayAZP\n\u0019\u0014bL[^M:\u0014sGL^K1\u001f7QJ\r\n<\u0013bLT\r\n,\u000fv[\u001f\u000bD+\u0012{\u0002F\u0011_\u007f\u0017rCI\u001b\u0004\tr\u0017D\u007f<eMH\u0010\u0005x\u001bE;\u001e\f|\u0016K+[ZGL\rK8\u001e\u000eo\u0012K+\u001e7fV\r^>\u0015tG\nw\u0011F:[SGO\nB\n|\u0016_1\u00107dV\u0012F\u0004q\u0011D:\u0013l\u0017P:[xD\u001f\nB:[gN^\nO,U\nk\u001bY+[DMJ\u0010N".length();
                pulsescanner.f.g.d.d(null);
                var1_4 = 16;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 105;
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
                    var2_2 = "K-aC!Jl##f\u00025_>d'y\u0007\"X>j,6\f)N>b0s\u0002gH\u007fmbt\u0006i{@-c\r3\u000bRf#}Yg_vfbe\u00065]{qeeC%Gq`)6\u0000(^pwbf\u00065\u000bmf!b\n(E>j16\u000b.Lvf06\u0017/Jp#6~\u0006gIrl!}\u0010gBj#1s\r3\u0005>O+q\u000b3\u000bRf#}YgGwd*bC!Yqnb~\n#O{mbu\u000f2Xjf0eM";
                    var4_3 = "K-aC!Jl##f\u00025_>d'y\u0007\"X>j,6\f)N>b0s\u0002gH\u007fmbt\u0006i{@-c\r3\u000bRf#}Yg_vfbe\u00065]{qeeC%Gq`)6\u0000(^pwbf\u00065\u000bmf!b\n(E>j16\u000b.Lvf06\u0017/Jp#6~\u0006gIrl!}\u0010gBj#1s\r3\u0005>O+q\u000b3\u000bRf#}YgGwd*bC!Yqnb~\n#O{mbu\u000f2Xjf0eM".length();
                    var1_4 = 40;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 85;
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
                        v11 = 86;
                        break;
                    }
                    case 1: {
                        v11 = 23;
                        break;
                    }
                    case 2: {
                        v11 = 67;
                        break;
                    }
                    case 3: {
                        v11 = 54;
                        break;
                    }
                    case 4: {
                        v11 = 18;
                        break;
                    }
                    case 5: {
                        v11 = 126;
                        break;
                    }
                    default: {
                        v11 = 75;
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
        pulsescanner.f.g.d.cb = var5;
        pulsescanner.f.g.d.q = class_2350.values();
    }

    public static void d(String string) {
        aj = string;
    }

    public static String u() {
        return aj;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

