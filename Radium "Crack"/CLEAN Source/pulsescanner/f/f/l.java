/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 */
package pulsescanner.f.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import pulsescanner.f.f.q;
import pulsescanner.f.f.z;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.g.b;
import pulsescanner.g.k;
import pulsescanner.i.d;
import pulsescanner.i.g;

public class l
extends i {
    public final g l;
    public final g m;
    public final g n;
    public final g o;
    public final d p;
    public final d q;
    private final List<z> r;
    private static final String[] s;

    public l() {
        String[] stringArray = s;
        super(stringArray[8], stringArray[2], pulsescanner.f.h.RENDER);
        this.l = this.a(new g(stringArray[9], stringArray[12], 24.0, 8.0, 48.0, 1.0));
        this.m = this.a(new g(stringArray[6], stringArray[4], 18.0, 6.0, 36.0, 1.0));
        this.n = this.a(new g(stringArray[11], stringArray[0], 0.18, 0.04, 0.4, 0.01));
        this.o = this.a(new g(stringArray[5], stringArray[3], 0.09, 0.03, 0.22, 0.01));
        this.p = this.a(new d(stringArray[10], stringArray[1], -335580969));
        this.q = this.a(new d(stringArray[13], stringArray[7], -344997121));
        this.r = new ArrayList<z>();
    }

    @Override
    protected void h() {
        this.r.clear();
    }

    @Override
    public void a(class_1297 class_12972) {
        try {
            if (class_12972 == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.l.a(matchException);
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        double d2 = class_12972.method_23317();
        double d3 = class_12972.method_23318() + 0.82;
        double d4 = class_12972.method_23321();
        double d5 = (Double)this.n.a();
        for (int i2 = 0; i2 < this.l.h(); ++i2) {
            double d6 = threadLocalRandom.nextDouble(Math.PI * 2);
            double d7 = threadLocalRandom.nextDouble(-0.52, 0.86);
            double d8 = Math.cos(d7) * d5 * threadLocalRandom.nextDouble(0.62, 1.28);
            this.r.add(new z(d2 + threadLocalRandom.nextDouble(-0.18, 0.18), d3 + threadLocalRandom.nextDouble(-0.32, 0.42), d4 + threadLocalRandom.nextDouble(-0.18, 0.18), Math.cos(d6) * d8, Math.sin(d7) * d5 + threadLocalRandom.nextDouble(0.035, 0.11), Math.sin(d6) * d8, Math.max(4, this.m.h() + threadLocalRandom.nextInt(-3, 4)), threadLocalRandom.nextBoolean()));
        }
        try {
            while (this.r.size() > 512) {
                this.r.remove(0);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.l.a(matchException);
        }
    }

    @Override
    public void i() {
        Iterator<z> iterator = this.r.iterator();
        while (iterator.hasNext()) {
            z z2 = iterator.next();
            try {
                if (++z2.g >= z2.h) {
                    iterator.remove();
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.l.a(matchException);
            }
            z2.a += z2.d;
            z2.b += z2.e;
            z2.c += z2.f;
            z2.d *= 0.91;
            z2.e = z2.e * 0.91 - 0.012;
            z2.f *= 0.91;
        }
    }

    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        i[] iArray;
        block11: {
            iArray = pulsescanner.f.f.q.r();
            try {
                try {
                    if (pulsescanner.f.f.l.a.field_1724 != null && !this.r.isEmpty()) break block11;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.l.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.l.a(matchException);
            }
        }
        class_243 class_2432 = class_41842.method_71156();
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_4588 class_45882 = k.b(true);
        class_4588 class_45883 = k.a(true);
        float f3 = k.a(1.0f);
        double d2 = (Double)this.o.a();
        for (z z2 : this.r) {
            Integer n2;
            double d3;
            double d4;
            block16: {
                z z3;
                block14: {
                    block15: {
                        int n3;
                        int n4;
                        double d5;
                        block12: {
                            block13: {
                                d4 = 1.0 - (double)z2.g / (double)z2.h;
                                try {
                                    d5 = 0.72;
                                    int n3 = z2.g;
                                    n3 = z2.i;
                                    if (iArray != null) break block12;
                                    if (n3 == 0) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.f.l.a(matchException);
                                }
                                n3 = 2;
                                break block12;
                            }
                            n3 = 0;
                        }
                        double d6 = d5 + Math.sin((double)(n4 + n3) * 0.9) * 0.18;
                        d3 = d2 * Math.max(0.2, d4) * d6;
                        try {
                            try {
                                z3 = z2;
                                if (iArray != null) break block14;
                                if (!z3.i) break block15;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.l.a(matchException);
                            }
                            n2 = (Integer)this.q.a();
                            break block16;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.l.a(matchException);
                        }
                    }
                    z3 = this.p.a();
                }
                n2 = (Integer)((Object)z3);
            }
            int n5 = n2;
            int n6 = n5 >>> 24 & 0xFF;
            int n7 = pulsescanner.g.b.a(n5, (int)((double)n6 * d4));
            int n8 = pulsescanner.g.b.a(n5, (int)((double)n6 * d4 * 0.28));
            double d7 = z2.a - pulsescanner.f.f.l.a.field_1724.method_23317();
            double d8 = z2.c - pulsescanner.f.f.l.a.field_1724.method_23321();
            double d9 = Math.max(0.001, Math.hypot(d7, d8));
            double d10 = d8 / d9;
            double d11 = -d7 / d9;
            float f4 = (float)(z2.a - class_2432.field_1352);
            float f5 = (float)(z2.b - class_2432.field_1351);
            float f6 = (float)(z2.c - class_2432.field_1350);
            pulsescanner.f.f.l.a(class_46652, class_45882, f4, f5, f6, d10, d11, d3 * 2.25, n8);
            pulsescanner.f.f.l.a(class_46652, class_45882, f4, f5, f6, d10, d11, d3, n7);
            int n9 = pulsescanner.g.b.a(255, 255, 255, Math.max(1, (n7 >>> 24 & 0xFF) / 2));
            float f7 = (float)(d3 * 1.4);
            k.a(class_46652, class_45883, f4 - (float)d10 * f7, f5, f6 - (float)d11 * f7, f4 + (float)d10 * f7, f5, f6 + (float)d11 * f7, n9, f3);
            k.a(class_46652, class_45883, f4, f5 - f7, f6, f4, f5 + f7, f6, n9, f3);
            if (iArray == null) continue;
        }
    }

    static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, double d2, double d3, double d4, int n2) {
        float f5 = (float)d4;
        float f6 = (float)(d2 * d4);
        float f7 = (float)(d3 * d4);
        k.a(class_46652, class_45882, f2, f3 + f5, f4, f2 + f6, f3, f4 + f7, f2, f3 - f5, f4, f2 - f6, f3, f4 - f7, n2);
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
                var5 = new String[14];
                var3_1 = 0;
                var2_2 = "\u0003\u001b\u0016\u000f\u001f\u007f?1\u000b\u0001\u0018E\u0014\u0007\u0007\u0016\u000f\u001f\u007f?1\u000f\u0016\u0017\u0007:l\"\u0001\b\u0013\u0019q \u0012\u001e\u0005\u000e\u00003)2N\u0013\u0014\u000e1l8\u0001\u0011\\\u000368a\u001d\u000b\u0011\u000e+$(\u0000\u0003R\u0016\u0013\u000b\n\u0018\u000e-)%N\u0017\f\n-'-\u000bD\u000f\u0002%)o\u001b\u0011\u000f\u0016\b\u0002< $N\b\u0015\r:8(\u0003\u0001\\\u00021l5\u0007\u0007\u0017\u0018q\u0004\u0012\u0007\u001e\u0019\b\r\u0007\u0002\u0019\u001f6!$\u0015\u0012\u000b\u0007\u0013\u0005;l2\u001e\u0005\u000e\u00003)a\r\u000b\u0010\u0004-b\f\t\u0007\u0010\\8/-3\u0005\b\u0019\u0018\u0006\u0000\u0003\u000b\t\u0005+\r\u0011\u001c\r\u0011\n-5a-\u000b\u0010\u0004-\u0005\u0012\u001e\u0001\u0019\u000f";
                var4_3 = "\u0003\u001b\u0016\u000f\u001f\u007f?1\u000b\u0001\u0018E\u0014\u0007\u0007\u0016\u000f\u001f\u007f?1\u000f\u0016\u0017\u0007:l\"\u0001\b\u0013\u0019q \u0012\u001e\u0005\u000e\u00003)2N\u0013\u0014\u000e1l8\u0001\u0011\\\u000368a\u001d\u000b\u0011\u000e+$(\u0000\u0003R\u0016\u0013\u000b\n\u0018\u000e-)%N\u0017\f\n-'-\u000bD\u000f\u0002%)o\u001b\u0011\u000f\u0016\b\u0002< $N\b\u0015\r:8(\u0003\u0001\\\u00021l5\u0007\u0007\u0017\u0018q\u0004\u0012\u0007\u001e\u0019\b\r\u0007\u0002\u0019\u001f6!$\u0015\u0012\u000b\u0007\u0013\u0005;l2\u001e\u0005\u000e\u00003)a\r\u000b\u0010\u0004-b\f\t\u0007\u0010\\8/-3\u0005\b\u0019\u0018\u0006\u0000\u0003\u000b\t\u0005+\r\u0011\u001c\r\u0011\n-5a-\u000b\u0010\u0004-\u0005\u0012\u001e\u0001\u0019\u000f".length();
                var1_4 = 12;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 41;
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
                    var2_2 = "\t\u0017\u000e\u0010\u001a$8<\u0005\\\u0007\u0001\"5-\u0013\u0018D\u0003\"&y\u0017\b\u0010\u0012$?w\u000f\n\u0013\u001f\u000b\u001d#5+\u000f\\'\u001c+;+";
                    var4_3 = "\t\u0017\u000e\u0010\u001a$8<\u0005\\\u0007\u0001\"5-\u0013\u0018D\u0003\"&y\u0017\b\u0010\u0012$?w\u000f\n\u0013\u001f\u000b\u001d#5+\u000f\\'\u001c+;+".length();
                    var1_4 = 29;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 49;
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
                        v11 = 104;
                        break;
                    }
                    case 1: {
                        v11 = 71;
                        break;
                    }
                    case 2: {
                        v11 = 77;
                        break;
                    }
                    case 3: {
                        v11 = 85;
                        break;
                    }
                    case 4: {
                        v11 = 66;
                        break;
                    }
                    case 5: {
                        v11 = 118;
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
        pulsescanner.f.f.l.s = var5;
    }
}

