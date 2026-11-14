/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.d;

import net.minecraft.class_332;
import pulsescanner.d.d;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.g.f;
import pulsescanner.i.a;

public final class c {
    private c() {
    }

    private static pulsescanner.f.b.c a() {
        return m.a(pulsescanner.f.b.c.class);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5) {
        block26: {
            float f6;
            float f7;
            int n2;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            class_332 class_3323;
            block28: {
                block27: {
                    Object object;
                    float f14;
                    int n3;
                    pulsescanner.f.b.c c2;
                    block24: {
                        block25: {
                            Boolean bl;
                            float f15;
                            i[] iArray;
                            block22: {
                                block23: {
                                    pulsescanner.f.b.c c3;
                                    block20: {
                                        block21: {
                                            c2 = c.a();
                                            iArray = d.b();
                                            try {
                                                try {
                                                    c3 = c2;
                                                    if (iArray == null) break block20;
                                                    if (((Boolean)c3.m.a()).booleanValue()) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c.a(matchException);
                                                }
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw c.a(matchException);
                                            }
                                        }
                                        c3 = c2.n.a();
                                    }
                                    n3 = (int)((Double)((Object)c3) * 2.55);
                                    f14 = c2.p.g();
                                    f15 = b.a;
                                    try {
                                        try {
                                            bl = (Boolean)c2.q.a();
                                            if (iArray == null) break block22;
                                            if (!bl.booleanValue()) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw c.a(matchException);
                                        }
                                        f.a(class_3322, f2, f3, f4, f5, f14, 5.0f, 0.8f, 0xFFFFFF);
                                    }
                                    catch (MatchException matchException) {
                                        throw c.a(matchException);
                                    }
                                }
                                try {
                                    b.a(class_3322, f2, f3, f4, f5, f14, b.a(0x1A1A1F, n3), b.a(855312, n3));
                                    object = c2.r;
                                    if (iArray == null) break block24;
                                    bl = (Boolean)((a)object).a();
                                }
                                catch (MatchException matchException) {
                                    throw c.a(matchException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (!bl.booleanValue()) break block25;
                                        object = class_3322;
                                        if (iArray == null) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw c.a(matchException);
                                    }
                                    f.a((class_332)object, f2, f3, f4, f5, f14, 0.9f);
                                    if (!(f15 >= 0.99f)) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw c.a(matchException);
                                }
                                f.b(class_3322, f2, f3, f4, f5, f2 * 0.013f + f3 * 0.009f, 1.0f);
                            }
                            catch (MatchException matchException) {
                                throw c.a(matchException);
                            }
                        }
                        object = c2.o.a();
                    }
                    try {
                        try {
                            if (!((Boolean)object).booleanValue()) break block26;
                            class_3323 = class_3322;
                            f13 = f2;
                            f12 = f3;
                            f11 = f4;
                            f10 = f5;
                            f9 = f14;
                            f8 = Math.max(b.a(), 0.5f);
                            n2 = 15898188;
                            f7 = n3;
                            if (!((Boolean)c2.q.a()).booleanValue()) break block27;
                        }
                        catch (MatchException matchException) {
                            throw c.a(matchException);
                        }
                        f6 = 0.42f;
                        break block28;
                    }
                    catch (MatchException matchException) {
                        throw c.a(matchException);
                    }
                }
                f6 = 0.28f;
            }
            b.a(class_3323, f13, f12, f11, f10, f9, f8, b.a(n2, (int)(f7 * f6)));
        }
    }

    public static float b() {
        return c.a().p.g();
    }

    public static int c() {
        return (Integer)c.a().t.a();
    }

    public static int d() {
        return (Integer)c.a().u.a();
    }

    public static int e() {
        return (Integer)c.a().v.a();
    }

    public static boolean f() {
        return (Boolean)c.a().s.a();
    }

    public static void a(class_332 class_3322, String string, float f2, float f3, int n2) {
        e.a(class_3322, string, f2, f3, n2, false, c.f());
    }

    public static void b(class_332 class_3322, String string, float f2, float f3, int n2) {
        e.a(class_3322, string, f2, f3, n2, true, c.f());
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

