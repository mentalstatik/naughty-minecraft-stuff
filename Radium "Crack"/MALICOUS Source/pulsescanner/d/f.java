/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 *  net.minecraft.class_640
 */
package pulsescanner.d;

import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_640;
import pulsescanner.d.d;

public final class f {
    private static final class_310 a = class_310.method_1551();
    private static final Deque<Long> b = new ArrayDeque<Long>();
    private static final Deque<Long> c = new ArrayDeque<Long>();
    private static final float[] d = new float[10];
    private static int e;
    private static int f;
    private static long g;
    private static double h;
    private static class_1309 i;
    private static long j;

    private f() {
    }

    public static void a(int n2) {
        block6: {
            long l2;
            block5: {
                l2 = System.currentTimeMillis();
                try {
                    if (n2 != 0) break block5;
                    b.add(l2);
                    break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.f.a(matchException);
                }
            }
            try {
                if (n2 == 1) {
                    c.add(l2);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.f.a(matchException);
            }
        }
    }

    public static int a() {
        return pulsescanner.d.f.a(b);
    }

    public static int b() {
        return pulsescanner.d.f.a(c);
    }

    private static int a(Deque<Long> deque) {
        long l2 = System.currentTimeMillis() - 1000L;
        try {
            while (true) {
                try {
                    if (deque.isEmpty() || deque.peekFirst() >= l2) break;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.f.a(matchException);
                }
                deque.pollFirst();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.f.a(matchException);
        }
        return deque.size();
    }

    public static void c() {
        long l2 = System.nanoTime();
        if (g > 0L) {
            double d2 = (double)(l2 - g) / 1.0E9;
            try {
                if (d2 > 0.05) {
                    pulsescanner.d.f.d[pulsescanner.d.f.e] = (float)Math.max(0.0, Math.min(20.0, 20.0 / d2));
                    e = (e + 1) % d.length;
                    f = Math.min(d.length, f + 1);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.f.a(matchException);
            }
        }
        g = l2;
    }

    public static float d() {
        try {
            if (f == 0) {
                return 20.0f;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.f.a(matchException);
        }
        float f2 = 0.0f;
        for (int i2 = 0; i2 < f; ++i2) {
            f2 += d[i2];
        }
        return f2 / (float)f;
    }

    public static void e() {
        f = 0;
        e = 0;
        g = -1L;
        i = null;
    }

    public static int f() {
        int n2;
        block6: {
            try {
                try {
                    if (pulsescanner.d.f.a.field_1724 != null && a.method_1562() != null) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.f.a(matchException);
                }
                return 0;
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.f.a(matchException);
            }
        }
        class_640 class_6402 = a.method_1562().method_2871(pulsescanner.d.f.a.field_1724.method_5667());
        try {
            n2 = class_6402 == null ? 0 : class_6402.method_2959();
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.f.a(matchException);
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    public static void g() {
        block22: {
            block24: {
                block23: {
                    block21: {
                        block19: {
                            block20: {
                                var0 = pulsescanner.d.d.b();
                                try {
                                    try {
                                        v0 = pulsescanner.d.f.a;
                                        if (var0 == null) break block19;
                                        if (v0.field_1724 != null) break block20;
                                    }
                                    catch (MatchException v1) {
                                        throw pulsescanner.d.f.a(v1);
                                    }
                                    pulsescanner.d.f.h = 0.0;
                                    return;
                                }
                                catch (MatchException v2) {
                                    throw pulsescanner.d.f.a(v2);
                                }
                            }
                            v0 = pulsescanner.d.f.a;
                        }
                        var1_1 = v0.field_1724.method_23317() - pulsescanner.d.f.a.field_1724.field_6014;
                        var3_2 = pulsescanner.d.f.a.field_1724.method_23321() - pulsescanner.d.f.a.field_1724.field_5969;
                        try {
                            pulsescanner.d.f.h = Math.sqrt(var1_1 * var1_1 + var3_2 * var3_2) * 20.0;
                            v3 = pulsescanner.d.f.i;
                            if (var0 == null) break block21;
                            if (v3 == null) break block22;
                        }
                        catch (MatchException v4) {
                            throw pulsescanner.d.f.a(v4);
                        }
                        v3 = pulsescanner.d.f.i;
                    }
                    try {
                        try {
                            if (var0 == null) break block23;
                            if (!v3.method_31481()) {
                            }
                            ** GOTO lbl59
                        }
                        catch (MatchException v5) {
                            throw pulsescanner.d.f.a(v5);
                        }
                        v3 = pulsescanner.d.f.i;
                    }
                    catch (MatchException v6) {
                        throw pulsescanner.d.f.a(v6);
                    }
                }
                try {
                    try {
                        v7 = v3.method_5805();
                        if (var0 == null) break block24;
                        if (v7 != 0) {
                        }
                        ** GOTO lbl59
                    }
                    catch (MatchException v8) {
                        throw pulsescanner.d.f.a(v8);
                    }
                    cfr_temp_0 = System.currentTimeMillis() - pulsescanner.d.f.j - 6000L;
                    v7 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                }
                catch (MatchException v9) {
                    throw pulsescanner.d.f.a(v9);
                }
            }
            try {
                if (v7 <= 0) break block22;
lbl59:
                // 3 sources

                pulsescanner.d.f.i = null;
            }
            catch (MatchException v10) {
                throw pulsescanner.d.f.a(v10);
            }
        }
    }

    public static double h() {
        return h;
    }

    public static void a(class_1297 class_12972) {
        if (class_12972 instanceof class_1309) {
            class_1309 class_13092;
            i = class_13092 = (class_1309)class_12972;
            j = System.currentTimeMillis();
        }
    }

    public static class_1309 i() {
        return i;
    }

    static {
        g = -1L;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

