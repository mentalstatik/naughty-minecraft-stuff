/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 */
package pulsescanner.f.f;

import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.g.b;
import pulsescanner.g.k;
import pulsescanner.i.g;

public class d
extends i {
    private static final int l = 96;
    public final g m;
    public final g n;
    public final g o;
    public final g p;
    public final g q;
    public final pulsescanner.i.d r;
    private float s;
    private float t;
    private long u;
    private static final String[] v;

    public d() {
        String[] stringArray = v;
        super(stringArray[10], stringArray[5], pulsescanner.f.h.RENDER);
        this.m = this.a(new g(stringArray[9], stringArray[11], 0.62, 0.35, 1.0, 0.01));
        this.n = this.a(new g(stringArray[12], stringArray[2], 0.36, 0.12, 0.65, 0.01));
        this.o = this.a(new g(stringArray[0], stringArray[13], -0.03, -0.45, 0.45, 0.01));
        this.p = this.a(new g(stringArray[6], stringArray[3], 158.0, 20.0, 255.0, 1.0));
        this.q = this.a(new g(stringArray[1], stringArray[14], 50.0, 0.0, 360.0, 5.0, stringArray[4]));
        this.r = this.a(new pulsescanner.i.d(stringArray[7], stringArray[8], -2718465));
    }

    @Override
    protected void g() {
        float f2;
        block8: {
            block6: {
                try {
                    block7: {
                        try {
                            try {
                                d d2 = this;
                                if (pulsescanner.f.f.d.a.field_1724 == null) break block6;
                                if (pulsescanner.f.f.d.a.field_1724.method_6128()) break block7;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.d.a(matchException);
                            }
                            if (!pulsescanner.f.f.d.a.field_1724.method_20232()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.d.a(matchException);
                        }
                    }
                    f2 = 1.0f;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.d.a(matchException);
                }
            }
            f2 = 0.0f;
        }
        d2.s = f2;
        this.t = 0.0f;
        this.u = System.nanoTime();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        d d2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        i[] iArray;
        block28: {
            block29: {
                float f9;
                float f10;
                boolean bl;
                double d3;
                double d4;
                double d5;
                double d6;
                double d7;
                double d8;
                class_243 class_2432;
                float f11;
                block25: {
                    block27: {
                        block26: {
                            class_310 class_3102;
                            block24: {
                                iArray = pulsescanner.f.f.q.r();
                                try {
                                    try {
                                        class_3102 = a;
                                        if (iArray != null) break block24;
                                        if (class_3102.field_1724 == null) return;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.f.d.a(matchException);
                                    }
                                    class_3102 = a;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.f.d.a(matchException);
                                }
                            }
                            try {
                                if (class_3102.field_1690.method_31044().method_31034()) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.d.a(matchException);
                            }
                            long l2 = System.nanoTime();
                            f11 = Math.min(0.1f, (float)(l2 - this.u) / 1.0E9f);
                            this.u = l2;
                            class_2432 = class_41842.method_71156();
                            class_243 class_2433 = pulsescanner.f.f.d.a.field_1724.method_30950(f2);
                            d8 = class_2433.field_1352;
                            d7 = class_2433.field_1350;
                            d6 = class_2433.field_1351 + (double)pulsescanner.f.f.d.a.field_1724.method_18381(pulsescanner.f.f.d.a.field_1724.method_18376()) + 0.21;
                            class_243 class_2434 = pulsescanner.f.f.d.a.field_1724.method_5828(f2);
                            d5 = class_2433.field_1352 + class_2434.field_1352;
                            d4 = class_2433.field_1350 + class_2434.field_1350;
                            d3 = class_2433.field_1351 + 0.55 + class_2434.field_1351;
                            try {
                                try {
                                    try {
                                        bl = pulsescanner.f.f.d.a.field_1724.method_6128();
                                        if (iArray != null) break block25;
                                        if (bl) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.f.d.a(matchException);
                                    }
                                    bl = pulsescanner.f.f.d.a.field_1724.method_20232();
                                    if (iArray != null) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.f.d.a(matchException);
                                }
                                if (!bl) break block27;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.d.a(matchException);
                            }
                        }
                        bl = true;
                        break block25;
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    d d9 = this;
                    float f9 = this.s;
                    f9 = bl2 ? f11 : -f11;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.d.a(matchException);
                }
                d9.s = class_3532.method_15363((float)(f10 + f9 * 6.0f), (float)0.0f, (float)1.0f);
                float f12 = this.s * this.s * (3.0f - 2.0f * this.s);
                f8 = (float)(class_3532.method_16436((double)f12, (double)d8, (double)d5) - class_2432.field_1352);
                f7 = (float)(class_3532.method_16436((double)f12, (double)d7, (double)d4) - class_2432.field_1350);
                f6 = (float)(class_3532.method_16436((double)f12, (double)d6, (double)d3) + (Double)this.o.a() - class_2432.field_1351);
                f5 = f6 + this.n.g();
                f4 = this.m.g();
                f3 = f4 * 1.12f;
                try {
                    try {
                        d2 = this;
                        if (iArray != null) break block28;
                        d2.t += (float)Math.toRadians((Double)this.q.a()) * f11;
                        if (!(this.t > (float)Math.PI * 2)) break block29;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.d.a(matchException);
                    }
                    this.t -= (float)Math.PI * 2;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.d.a(matchException);
                }
            }
            d2 = this.r.a();
        }
        int n2 = (Integer)((Object)d2);
        int n3 = this.p.h();
        int n4 = pulsescanner.g.b.a(pulsescanner.g.b.b(n2, 26), Math.min(255, n3 + 36));
        int n5 = pulsescanner.g.b.a(n2, n3);
        int n6 = pulsescanner.g.b.a(pulsescanner.g.b.b(n2, -40), Math.max(16, n3 / 2));
        int n7 = pulsescanner.g.b.a(pulsescanner.g.b.b(n2, 40), Math.min(255, n3 + 80));
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_4588 class_45882 = k.b(true);
        class_4588 class_45883 = k.a(true);
        float f13 = k.a(1.1f);
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        int n8 = 0;
        int n9 = 0;
        while (n9 <= 96) {
            block30: {
                int n10;
                float f18;
                float f19;
                float f20;
                float f21;
                block31: {
                    double d10 = Math.PI * 2 * (double)n9 / 96.0;
                    float f22 = (float)Math.cos(d10);
                    float f23 = (float)Math.sin(d10);
                    f21 = f8 + f22 * f4;
                    f20 = f7 + f23 * f4;
                    f19 = f8 + f22 * f3;
                    f18 = f7 + f23 * f3;
                    float f24 = (float)(0.5 + 0.5 * Math.cos(d10 - (double)this.t));
                    int n11 = (int)(f24 * 46.0f);
                    n10 = pulsescanner.g.b.b(n5, n11);
                    int n12 = pulsescanner.g.b.b(n4, n11 / 2);
                    try {
                        try {
                            if (iArray != null) break block30;
                            if (n9 <= 0) break block31;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.d.a(matchException);
                        }
                        k.a(class_46652, class_45882, f14, f6, f15, f21, f6, f20, f8, f5, f7, f8, f5, f7, n8, n10, n12, n12);
                        k.a(class_46652, class_45882, f14, f6, f15, f21, f6, f20, f19, f6, f18, f16, f6, f17, n8, n10, n10, n8);
                        k.a(class_46652, class_45882, f8, f6, f7, f8, f6, f7, f14, f6, f15, f21, f6, f20, n6, n6, n8, n10);
                        k.a(class_46652, class_45883, f14, f6, f15, f21, f6, f20, pulsescanner.g.b.b(n7, n11), f13);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.d.a(matchException);
                    }
                }
                f14 = f21;
                f15 = f20;
                f16 = f19;
                f17 = f18;
                n8 = n10;
                ++n9;
            }
            if (iArray == null) continue;
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
                var5 = new String[15];
                var3_1 = 0;
                var2_2 = "\\vD\rO\u0003\nq\nV>n\u000eGP<u?e\u0017M3b\fA\u0004Oj0+\u001fA\u0015Om7\u007fKJ\u001f\u0001`x\u0014M7\u007fKZ\u0005\u001dc7h\u000e\t\u001f\u001fd5b\u001fP^\u0003\u00b5yx\u001dU#\u007f\u0018\t\u0011Of9e\u000e\t\u0018\u000eqvd\u0005\t\t\u0000p$+\u0003L\u0011\u000b+\u0007J&j\b@\u0004\u0016\u0005F9g\u0004[\u0011M7\u007fKH\u0013\f`8\u007fKJ\u001f\u0003j$%\u0006W7o\u0002\\\u0003\bF9e\u000e\t8\u000eq\u000bM7\u007fK[\u0011\u000bl#xE\u0006M3b\fA\u0004";
                var4_3 = "\\vD\rO\u0003\nq\nV>n\u000eGP<u?e\u0017M3b\fA\u0004Oj0+\u001fA\u0015Om7\u007fKJ\u001f\u0001`x\u0014M7\u007fKZ\u0005\u001dc7h\u000e\t\u001f\u001fd5b\u001fP^\u0003\u00b5yx\u001dU#\u007f\u0018\t\u0011Of9e\u000e\t\u0018\u000eqvd\u0005\t\t\u0000p$+\u0003L\u0011\u000b+\u0007J&j\b@\u0004\u0016\u0005F9g\u0004[\u0011M7\u007fKH\u0013\f`8\u007fKJ\u001f\u0003j$%\u0006W7o\u0002\\\u0003\bF9e\u000e\t8\u000eq\u000bM7\u007fK[\u0011\u000bl#xE\u0006M3b\fA\u0004".length();
                var1_4 = 8;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 39;
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
                    var2_2 = "%E\u000fi6ex\u001f\u0000\u0015x>b9\u001cF\u001bn:r7;;O\n=9gj\u0007\u0000\tu:&u\u001aG\u0015i\u007fuq\u0016E\u0013=,q|\u0016P\u000e=>tv\u0006N\u0019=+n|SH\u001ci\u007f.)S\u001d]n+ou\u001f\tS";
                    var4_3 = "%E\u000fi6ex\u001f\u0000\u0015x>b9\u001cF\u001bn:r7;;O\n=9gj\u0007\u0000\tu:&u\u001aG\u0015i\u007fuq\u0016E\u0013=,q|\u0016P\u000e=>tv\u0006N\u0019=+n|SH\u001ci\u007f.)S\u001d]n+ou\u001f\tS".length();
                    var1_4 = 21;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 81;
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
                        v11 = 34;
                        break;
                    }
                    case 1: {
                        v11 = 113;
                        break;
                    }
                    case 2: {
                        v11 = 44;
                        break;
                    }
                    case 3: {
                        v11 = 76;
                        break;
                    }
                    case 4: {
                        v11 = 14;
                        break;
                    }
                    case 5: {
                        v11 = 87;
                        break;
                    }
                    default: {
                        v11 = 72;
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
        pulsescanner.f.f.d.v = var5;
    }
}

