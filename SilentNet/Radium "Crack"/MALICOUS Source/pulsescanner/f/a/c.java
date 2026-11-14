/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1944
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2804
 *  net.minecraft.class_3562
 *  net.minecraft.class_4076
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_631
 *  net.minecraft.class_638
 *  net.minecraft.class_6606
 */
package pulsescanner.f.a;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1944;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2804;
import net.minecraft.class_3562;
import net.minecraft.class_4076;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_631;
import net.minecraft.class_638;
import net.minecraft.class_6606;
import pulsescanner.f.a.b;
import pulsescanner.f.a.f;
import pulsescanner.f.a.g;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.g.k;

public class c
extends i {
    private static final int l = 2048;
    private static final int m = 600;
    private static final int n = 2048;
    private static final int o = 5000;
    private static final int p = 32;
    private static final byte[] q;
    private static final int r = 1090584410;
    private static final int s = -16711846;
    private static final int t = 1107243560;
    private static final int u = -52696;
    private final LinkedHashMap<Long, Map<Integer, byte[]>> v;
    private final LinkedHashMap<Long, g> w;
    private static final String[] x;

    public c() {
        String[] stringArray = x;
        super(stringArray[8], stringArray[0], pulsescanner.f.h.BASEFINDING);
        this.v = new LinkedHashMap(256, 0.75f, true);
        this.w = new LinkedHashMap();
    }

    @Override
    protected void g() {
        this.t();
        this.o();
    }

    @Override
    protected void h() {
        this.t();
    }

    @Override
    public void k() {
        this.t();
    }

    @Override
    public void l() {
        this.t();
    }

    @Override
    public void a(int n2, int n3, class_6606 class_66062) {
        try {
            if (pulsescanner.f.a.c.a.field_1687 != null) {
                this.c(n2, n3, class_66062);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
    }

    @Override
    public void b(int n2, int n3, class_6606 class_66062) {
        try {
            if (pulsescanner.f.a.c.a.field_1687 != null) {
                this.d(n2, n3, class_66062);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
    }

    @Override
    public void i() {
        Iterator<g> iterator = this.w.values().iterator();
        while (true) {
            block4: {
                try {
                    while (iterator.hasNext()) {
                        if (--iterator.next().f > 0) continue;
                        break block4;
                    }
                    break;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
            }
            iterator.remove();
        }
    }

    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        try {
            if (this.w.isEmpty()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
        class_243 class_2432 = class_41842.method_71156();
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_4588 class_45882 = k.b(true);
        class_4588 class_45883 = k.a(true);
        float f3 = k.a(1.5f);
        for (g g2 : this.w.values()) {
            int n2;
            int n3;
            class_238 class_2382;
            class_4588 class_45884;
            class_4588 class_45885;
            class_4587.class_4665 class_46653;
            boolean bl;
            try {
                bl = g2.e > g2.d;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
            boolean bl2 = bl;
            class_238 class_2383 = new class_238((double)g2.a, (double)g2.b, (double)g2.c, (double)(g2.a + 1), (double)(g2.b + 1), (double)(g2.c + 1)).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            try {
                class_46653 = class_46652;
                class_45885 = class_45882;
                class_45884 = class_45883;
                class_2382 = class_2383;
                n3 = bl2 ? 1090584410 : 1107243560;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
            try {
                n2 = bl2 ? -16711846 : -52696;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
            k.a(class_46653, class_45885, class_45884, class_2382, n3, n2, f3);
        }
    }

    private void o() {
        try {
            if (!this.m()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
        int n2 = pulsescanner.f.a.c.a.field_1724.method_31477() >> 4;
        int n3 = pulsescanner.f.a.c.a.field_1724.method_31479() >> 4;
        for (int i2 = n2 - 32; i2 <= n2 + 32; ++i2) {
            for (int i3 = n3 - 32; i3 <= n3 + 32; ++i3) {
                Map<Integer, byte[]> map = this.a(i2, i3);
                try {
                    if (map == null) continue;
                    this.v.put(pulsescanner.f.a.c.b(i2, i3), map);
                    continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
            }
        }
        this.s();
    }

    private Map<Integer, byte[]> a(int n2, int n3) {
        class_638 class_6382 = pulsescanner.f.a.c.a.field_1687;
        try {
            if (class_6382 == null) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
        class_631 class_6312 = class_6382.method_2935();
        try {
            if (!class_6312.method_12123(n2, n3)) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
        class_3562 class_35622 = class_6312.method_12130().method_15562(class_1944.field_9282);
        Map<Integer, byte[]> map = this.p();
        for (int i2 = this.q(); i2 <= this.r(); ++i2) {
            class_2804 class_28042 = class_35622.method_15544(class_4076.method_18676((int)n2, (int)i2, (int)n3));
            try {
                try {
                    if (class_28042 == null || class_28042.method_51379(0)) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
                map.put(i2, Arrays.copyOf(class_28042.method_12137(), 2048));
                continue;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
        }
        return map;
    }

    private void c(int n2, int n3, class_6606 class_66062) {
        Map<Integer, byte[]> map = this.p();
        this.a(class_66062, map, n2, n3, false, null);
        this.b(class_66062, map, n2, n3, false, null);
        this.v.put(pulsescanner.f.a.c.b(n2, n3), map);
        this.s();
    }

    private void d(int n2, int n3, class_6606 class_66062) {
        block23: {
            f f2;
            f f3;
            block21: {
                boolean bl;
                Map<Integer, byte[]> map;
                String[] stringArray;
                long l2;
                block20: {
                    Map<Integer, byte[]> map2;
                    block19: {
                        boolean bl2;
                        Map<Integer, byte[]> map3;
                        block17: {
                            block18: {
                                l2 = pulsescanner.f.a.c.b(n2, n3);
                                stringArray = pulsescanner.f.a.b.o();
                                map = this.v.get(l2);
                                try {
                                    map3 = map;
                                    if (stringArray != null) break block17;
                                    if (map3 != null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.c.a(matchException);
                                }
                                map = this.a(n2, n3);
                            }
                            map3 = map;
                        }
                        try {
                            bl2 = map3 != null;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.c.a(matchException);
                        }
                        bl = bl2;
                        try {
                            try {
                                map2 = map;
                                if (stringArray != null) break block19;
                                if (map2 != null) break block20;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.c.a(matchException);
                            }
                            map2 = this.p();
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.c.a(matchException);
                        }
                    }
                    map = map2;
                }
                f3 = new f();
                try {
                    block22: {
                        try {
                            try {
                                this.a(class_66062, map, n2, n3, bl, f3);
                                this.b(class_66062, map, n2, n3, bl, f3);
                                this.v.put(l2, map);
                                this.s();
                                f2 = f3;
                                if (stringArray != null) break block21;
                                if (f2.a != 1) break block22;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.c.a(matchException);
                            }
                            this.a(x[3] + f3.b + x[7] + f3.c + x[2] + f3.d + x[6] + f3.e + x[4] + f3.f);
                            if (stringArray == null) break block23;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.c.a(matchException);
                        }
                    }
                    f2 = f3;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
            }
            try {
                if (f2.a > 1) {
                    this.a(f3.a + x[9] + n2 + x[2] + n3 + x[1] + f3.b + x[2] + f3.c + x[2] + f3.d + " " + f3.e + x[5] + f3.f);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
        }
    }

    private void a(class_6606 class_66062, Map<Integer, byte[]> map, int n2, int n3, boolean bl, f f2) {
        BitSet bitSet = class_66062.method_38608();
        List list = class_66062.method_38610();
        int n4 = 0;
        int n5 = bitSet.nextSetBit(0);
        while (true) {
            block7: {
                try {
                    if (n5 < 0 || n4 >= list.size()) break;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
                byte[] byArray = (byte[])list.get(n4++);
                int n6 = this.c(n5);
                try {
                    try {
                        if (!this.d(n6) || byArray.length != 2048) break block7;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.c.a(matchException);
                    }
                    this.a(map, n2, n3, n6, Arrays.copyOf(byArray, 2048), bl, f2);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
            }
            n5 = bitSet.nextSetBit(n5 + 1);
        }
    }

    private void b(class_6606 class_66062, Map<Integer, byte[]> map, int n2, int n3, boolean bl, f f2) {
        BitSet bitSet = class_66062.method_38609();
        int n4 = bitSet.nextSetBit(0);
        while (n4 >= 0) {
            int n5 = this.c(n4);
            try {
                if (this.d(n5)) {
                    this.a(map, n2, n3, n5, q, bl, f2);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
            n4 = bitSet.nextSetBit(n4 + 1);
        }
    }

    private void a(Map<Integer, byte[]> map, int n2, int n3, int n4, byte[] byArray, boolean bl, f f2) {
        block6: {
            byte[] byArray2 = map.get(n4);
            try {
                try {
                    try {
                        if (!bl || byArray2 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.c.a(matchException);
                    }
                    if (f2 == null) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
                this.a(byArray2, byArray, n2, n3, n4, f2);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
        }
        map.put(n4, byArray);
    }

    private void a(byte[] byArray, byte[] byArray2, int n2, int n3, int n4, f f2) {
        for (int i2 = 0; i2 < 2048; ++i2) {
            int n5 = byArray[i2] & 0xFF;
            int n6 = byArray2[i2] & 0xFF;
            int n7 = n5 ^ n6;
            try {
                if ((n7 & 0xF) != 0) {
                    this.a(n2, n3, n4, i2 << 1, n5 & 0xF, n6 & 0xF, f2);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
            try {
                if ((n7 & 0xF0) == 0) continue;
                this.a(n2, n3, n4, (i2 << 1) + 1, n5 >>> 4 & 0xF, n6 >>> 4 & 0xF, f2);
                continue;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.c.a(matchException);
            }
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, f f2) {
        int n8 = n5 & 0xF;
        int n9 = n5 >>> 4 & 0xF;
        int n10 = n5 >>> 8 & 0xF;
        int n11 = (n2 << 4) + n8;
        int n12 = (n4 << 4) + n10;
        int n13 = (n3 << 4) + n9;
        f2.a(n11, n12, n13, n6, n7);
        this.w.put(class_2338.method_10064((int)n11, (int)n12, (int)n13), new g(n11, n12, n13, n6, n7, 600));
        while (this.w.size() > 2048) {
            Iterator<Long> iterator = this.w.keySet().iterator();
            iterator.next();
            iterator.remove();
        }
    }

    private Map<Integer, byte[]> p() {
        HashMap<Integer, byte[]> hashMap = new HashMap<Integer, byte[]>();
        try {
            for (int i2 = this.q(); i2 <= this.r(); ++i2) {
                hashMap.put(i2, q);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
        return hashMap;
    }

    private int c(int n2) {
        int n3;
        try {
            n3 = pulsescanner.f.a.c.a.field_1687 == null ? Integer.MIN_VALUE : pulsescanner.f.a.c.a.field_1687.method_2935().method_12130().method_31929() + n2;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.c.a(matchException);
        }
        return n3;
    }

    private int q() {
        return pulsescanner.f.a.c.a.field_1687.method_32891();
    }

    private int r() {
        return pulsescanner.f.a.c.a.field_1687.method_31597();
    }

    private boolean d(int n2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (n2 < this.q() || n2 > this.r()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.c.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.c.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void s() {
        while (this.v.size() > 5000) {
            Iterator<Long> iterator = this.v.keySet().iterator();
            iterator.next();
            iterator.remove();
        }
    }

    private void t() {
        this.v.clear();
        this.w.clear();
    }

    private static long b(int n2, int n3) {
        return (long)n2 & 0xFFFFFFFFL | ((long)n3 & 0xFFFFFFFFL) << 32;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "E\u001cA\u0004\u0016\u0003S~\f\r\u0001\u000b\u0003Iy\u0018YH\u0012KO\u007fY^\u0007\bF^y\u0010C\u000fE@Bp\u0017J\r\u0016\u0003C\u007fYLH\tLKu\u001cIH\u0006K_\u007f\u0012\u0001H\u0016L\nh\u0016XH\u0006BD1\u001aL\u001c\u0006K\na\u001cB\u0018\tF\np\u001aY\u0001\u0013F\n\u007f\u001cL\u001a\u0007Z\u0004\t?Yk\u0001\u0017P^+Y\u0002=Y\u0017S\u0015B\u000b\u000e\u0003Fx\u001eE\u001cE@Bp\u0017J\r\u0001\u0003KeY\u00041T\u0013H\u00041T\u0013H\u0002+Y\u0002=Y";
                var4_3 = "E\u001cA\u0004\u0016\u0003S~\f\r\u0001\u000b\u0003Iy\u0018YH\u0012KO\u007fY^\u0007\bF^y\u0010C\u000fE@Bp\u0017J\r\u0016\u0003C\u007fYLH\tLKu\u001cIH\u0006K_\u007f\u0012\u0001H\u0016L\nh\u0016XH\u0006BD1\u001aL\u001c\u0006K\na\u001cB\u0018\tF\np\u001aY\u0001\u0013F\n\u007f\u001cL\u001a\u0007Z\u0004\t?Yk\u0001\u0017P^+Y\u0002=Y\u0017S\u0015B\u000b\u000e\u0003Fx\u001eE\u001cE@Bp\u0017J\r\u0001\u0003KeY\u00041T\u0013H\u00041T\u0013H\u0002+Y\u0002=Y".length();
                var1_4 = 98;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 36;
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
                    var2_2 = ">}4jbo\u0011\u001ca\"l%]w-kj$k\u0011|&l}o0\u001cy4azo%\u0015t/cl+f\u0014{aga:(\u00165";
                    var4_3 = ">}4jbo\u0011\u001ca\"l%]w-kj$k\u0011|&l}o0\u001cy4azo%\u0015t/cl+f\u0014{aga:(\u00165".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 72;
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
                        v11 = 53;
                        break;
                    }
                    case 1: {
                        v11 = 93;
                        break;
                    }
                    case 2: {
                        v11 = 9;
                        break;
                    }
                    case 3: {
                        v11 = 76;
                        break;
                    }
                    case 4: {
                        v11 = 65;
                        break;
                    }
                    case 5: {
                        v11 = 7;
                        break;
                    }
                    default: {
                        v11 = 14;
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
        pulsescanner.f.a.c.x = var5;
        pulsescanner.f.a.c.q = new byte[2048];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

