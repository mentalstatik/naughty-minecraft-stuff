/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.c;

import net.minecraft.class_332;
import pulsescanner.c.f;
import pulsescanner.f.b.a;
import pulsescanner.f.m;
import pulsescanner.g.b;

public final class c {
    public static final int a = -592136;
    public static final int b = -2829095;
    public static final int c = -6645085;
    public static final int d = -1929379841;
    public static final int e = 0x2BFFFFFF;
    public static final int f = -879028;
    public static final int g = -5215692;
    public static final int h = -879028;
    public static final int i = -13354421;
    public static final int j = -854536;
    public static final float k = 132.0f;
    public static final float l = 25.0f;
    public static final float m = 18.0f;
    public static final float n = 2.0f;
    public static final float o = 5.0f;
    public static final float p = 8.0f;
    public static final float q = 4.5f;

    private c() {
    }

    public static float a() {
        return Math.max(pulsescanner.g.b.a(), 0.5f);
    }

    public static float b() {
        float f2;
        block5: {
            a a2;
            block4: {
                a2 = pulsescanner.f.m.a(a.class);
                try {
                    try {
                        if (a2 != null && ((Boolean)a2.o.a()).booleanValue()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.c.a(matchException);
                    }
                    f2 = 0.0f;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.c.a(matchException);
                }
            }
            f2 = a2.p.g() / 100.0f;
        }
        return f2;
    }

    public static boolean c() {
        boolean bl;
        block5: {
            block4: {
                a a2 = pulsescanner.f.m.a(a.class);
                try {
                    try {
                        if (a2 != null && !((Boolean)a2.q.a()).booleanValue()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.c.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.c.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6) {
        float f7 = pulsescanner.c.c.b();
        try {
            pulsescanner.g.b.b(class_3322, f2, f3 + 1.5f, f4, f5, f6, 10.0f, 0x30000000);
            pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 7.0f, f7);
            pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, -1708250586, -1709566445);
            if (pulsescanner.c.c.c()) {
                pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 1.0f);
                pulsescanner.g.f.b(class_3322, f2, f3, f4, f5, f2 * 0.011f + f3 * 0.007f, 1.0f);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, pulsescanner.c.c.a(), pulsescanner.g.b.a(0xFFFFFF, 38 + Math.round(24.0f * Math.min(1.0f, f7))));
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, float f6) {
        float f7 = pulsescanner.c.c.b();
        try {
            pulsescanner.g.b.b(class_3322, f2, f3 + 1.5f, f4, f5, f6, 10.0f, 0x30000000);
            pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 7.0f, f7);
            pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, -316401393, -317453049);
            if (pulsescanner.c.c.c()) {
                pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 0.8f);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, pulsescanner.c.c.a(), pulsescanner.g.b.a(15120783, 34 + Math.round(28.0f * Math.min(1.0f, f7))));
    }

    public static void c(class_332 class_3322, float f2, float f3, float f4, float f5, float f6) {
        try {
            pulsescanner.g.b.b(class_3322, f2, f3 + 2.0f, f4, f5, f6, 16.0f, 0x70000000);
            pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 8.0f, pulsescanner.c.c.b() * 1.2f);
            pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, -181787358, -149219821);
            if (pulsescanner.c.c.c()) {
                pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 1.1f);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, pulsescanner.c.c.a(), pulsescanner.g.b.a(0xFFFFFF, 51 + Math.round(24.0f * Math.min(1.0f, pulsescanner.c.c.b()))));
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7) {
        try {
            if (f7 <= 0.005f) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        float f8 = pulsescanner.c.c.b();
        try {
            if (f8 > 0.0f) {
                pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 5.0f, f8 * 0.9f * f7);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        int n2 = pulsescanner.g.b.a(1307743820, f7);
        int n3 = pulsescanner.g.b.a(586323532, f7);
        try {
            pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, (arg_0, arg_1) -> c.lambda$activeRow$0(n2, n3, f2, f4, f3, f5, arg_0, arg_1));
            if (pulsescanner.c.c.c()) {
                pulsescanner.g.f.a(class_3322, f2, f3, f4, f5, f6, 0.8f * f7);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, pulsescanner.c.c.a(), pulsescanner.g.b.a(1307743820, f7));
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7) {
        try {
            if (f7 <= 0.005f) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, pulsescanner.g.b.a(452105804, f7));
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5) {
        int n2 = pulsescanner.g.b.a(0x2BFFFFFF, f5);
        pulsescanner.g.b.a(class_3322, f2, f3, f4 / 2.0f, pulsescanner.c.c.a(), n2 & 0xFFFFFF, n2);
        pulsescanner.g.b.a(class_3322, f2 + f4 / 2.0f, f3, f4 / 2.0f, pulsescanner.c.c.a(), n2, n2 & 0xFFFFFF);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4) {
        try {
            if (f4 <= 0.005f) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        float f5 = Math.max(0.6f, pulsescanner.c.c.b());
        pulsescanner.g.b.b(class_3322, f2, f3, 4.5f + 1.5f * f5, pulsescanner.g.b.a(pulsescanner.g.b.a(-879028, Math.min(255, Math.round(102.0f * f5))), f4));
        pulsescanner.g.b.a(class_3322, f2, f3, 1.7f, pulsescanner.g.b.a(-879028, f4));
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4) {
        block15: {
            float f5;
            float f6;
            block16: {
                float f7;
                boolean bl;
                block14: {
                    float f8;
                    float f9;
                    block12: {
                        float f10;
                        float f11;
                        block13: {
                            f9 = 15.0f;
                            f11 = 8.0f;
                            bl = pulsescanner.c.f.b();
                            f6 = f11 / 2.0f;
                            f8 = f2 - f9;
                            f10 = f3 - f11 / 2.0f;
                            float f12 = pulsescanner.c.c.b();
                            try {
                                try {
                                    try {
                                        try {
                                            if (bl) break block12;
                                            if (!(f12 > 0.0f)) break block13;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.c.a(matchException);
                                        }
                                        f7 = f4;
                                        if (bl) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.c.a(matchException);
                                    }
                                    if (!(f7 > 0.02f)) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.c.a(matchException);
                                }
                                pulsescanner.g.f.a(class_3322, f8, f10, f9, f11, f6, 4.0f, f12 * 0.8f * f4);
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.c.a(matchException);
                            }
                        }
                        pulsescanner.g.b.a(class_3322, f8, f10, f9, f11, f6, pulsescanner.g.b.a(-13354421, -879028, f4));
                        pulsescanner.g.b.a(class_3322, f8, f10, f9, f11, f6, pulsescanner.c.c.a(), pulsescanner.g.b.a(0x40FFFFFF, 0.7f));
                    }
                    f7 = f8 + f6 + (f9 - f6 * 2.0f) * f4;
                }
                f5 = f7;
                try {
                    try {
                        if (bl) break block15;
                        if (!(f4 > 0.02f)) break block16;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.c.a(matchException);
                    }
                    pulsescanner.g.b.b(class_3322, f5, f3, f6 + 1.6f, pulsescanner.g.b.a(pulsescanner.g.b.a(-879028, 102), f4));
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.c.a(matchException);
                }
            }
            pulsescanner.g.b.a(class_3322, f5, f3, f6 - 1.3f, -854536);
        }
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5) {
        try {
            if (f5 <= 0.005f) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        try {
            if (pulsescanner.c.c.b() > 0.0f) {
                pulsescanner.g.b.b(class_3322, f2 + 1.0f, f3 + f4 / 2.0f, 5.0f, pulsescanner.g.b.a(pulsescanner.g.b.a(-879028, 64), f5));
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2, f3 + 3.0f, 2.0f, f4 - 6.0f, 1.0f, pulsescanner.g.b.a(-879028, f5));
    }

    public static void c(class_332 class_3322, float f2, float f3, float f4) {
        float f5 = pulsescanner.c.c.b();
        try {
            if (f5 > 0.0f) {
                pulsescanner.g.b.b(class_3322, f2, f3, f4, pulsescanner.g.b.a(-879028, Math.min(255, Math.round(52.0f * f5))));
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.c.a(matchException);
        }
    }

    public static boolean a(double d2, double d3, float f2, float f3, float f4, float f5) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d2 >= (double)f2) || !(d2 < (double)(f2 + f4))) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.c.a(matchException);
                            }
                            if (!(d3 >= (double)f3)) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.c.a(matchException);
                        }
                        if (!(d3 < (double)(f3 + f5))) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.c.a(matchException);
                    }
                    bl = true;
                    break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.c.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int lambda$activeRow$0(int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        return pulsescanner.g.b.a(n2, n3, (f6 - f2) / f3 * 0.75f + (f7 - f4) / f5 * 0.25f);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

