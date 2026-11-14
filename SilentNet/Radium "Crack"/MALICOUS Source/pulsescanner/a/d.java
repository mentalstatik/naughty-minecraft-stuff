/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_3532
 */
package pulsescanner.a;

import net.minecraft.class_1297;
import net.minecraft.class_3532;
import pulsescanner.a.a;
import pulsescanner.a.ad;
import pulsescanner.a.ae;
import pulsescanner.a.ag;
import pulsescanner.a.ak;
import pulsescanner.a.am;
import pulsescanner.a.as;
import pulsescanner.a.p;
import pulsescanner.a.r;
import pulsescanner.a.w;
import pulsescanner.a.x;
import pulsescanner.a.y;

public final class d
implements ad {
    public static final d b = new d();
    public static a c = a.IDLE;
    public static ak d;
    public static int e;
    public static int f;
    public static int g;
    public static float h;
    public static float i;
    public static float j;
    public static float k;

    private d() {
    }

    public static void a() {
        x.a(b);
    }

    public static void a(ak ak2, float f2, float f3, int n2) {
        pulsescanner.a.d.a(ak2, f2, f2, f3, f3, n2, 90, false);
    }

    public static void a(ak ak2, float f2, float f3, float f4, float f5, int n2, int n3, boolean bl) {
        block13: {
            boolean bl2;
            a a2;
            block11: {
                block12: {
                    int n4 = as.q();
                    try {
                        if (e > n3) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.a.d.a(matchException);
                    }
                    try {
                        try {
                            try {
                                try {
                                    a2 = c;
                                    if (n4 != 0) break block11;
                                    if (a2 != a.IDLE) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.a.d.a(matchException);
                                }
                                bl2 = bl;
                                if (n4 != 0) break block13;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.a.d.a(matchException);
                            }
                            if (bl2) break block12;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.a.d.a(matchException);
                        }
                        am.c = true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.a.d.a(matchException);
                    }
                }
                h = f2;
                i = f3;
                j = f4;
                k = f5;
                f = n2;
                e = n3;
                a2 = a.AIM;
            }
            c = a2;
            d = ak2;
            bl2 = pulsescanner.a.d.a(ak2, f2, f3);
        }
    }

    public void b() {
        c = a.IDLE;
        e = 0;
        am.a(false);
    }

    @y
    public void a(r r2) {
        block7: {
            block6: {
                try {
                    try {
                        if (c != a.AIM || g <= f) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.a.d.a(matchException);
                    }
                    c = a.RESET;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.a.d.a(matchException);
                }
            }
            try {
                if (c != a.RESET || !pulsescanner.a.d.a(new ak(am.a, am.b), j, k)) break block7;
            }
            catch (MatchException matchException) {
                throw pulsescanner.a.d.a(matchException);
            }
            this.b();
        }
        ++g;
    }

    @y
    public void a(w w2) {
        this.b();
    }

    @y
    public void a(p p2) {
        block4: {
            try {
                try {
                    if (c != a.RESET || pulsescanner.a.d.a.field_1724 == null) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.a.d.a(matchException);
                }
                ag.a(p2, pulsescanner.a.d.a.field_1724.method_36454(), pulsescanner.a.d.a.field_1773.method_19418().method_19330());
            }
            catch (MatchException matchException) {
                throw pulsescanner.a.d.a(matchException);
            }
        }
    }

    static boolean a(ak ak2, float f2, float f3) {
        boolean bl;
        block7: {
            block8: {
                int n2 = as.r();
                try {
                    if (pulsescanner.a.d.a.field_1724 == null) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.a.d.a(matchException);
                }
                ak ak3 = new ak((class_1297)pulsescanner.a.d.a.field_1724);
                float f4 = ak2.c - ak3.c;
                float f5 = class_3532.method_15393((float)(ak2.b - ak3.b));
                float f6 = Math.min(Math.abs(f5), f2);
                float f7 = Math.min(Math.abs(f4), f3);
                try {
                    try {
                        pulsescanner.a.d.a.field_1724.method_36456(pulsescanner.a.d.a.field_1724.field_6241 += ae.b(class_3532.method_15363((float)f5, (float)(-f6), (float)f6)));
                        pulsescanner.a.d.a.field_1724.method_36457(class_3532.method_15363((float)(pulsescanner.a.d.a.field_1724.method_36455() + ae.b(class_3532.method_15363((float)f4, (float)(-f7), (float)f7))), (float)-90.0f, (float)90.0f));
                        bl = false;
                        if (n2 == 0) break block7;
                        g = bl;
                        ak ak4 = new ak((class_1297)pulsescanner.a.d.a.field_1724);
                        if (!(ak4.a(ak2) < 1.0f)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.a.d.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

