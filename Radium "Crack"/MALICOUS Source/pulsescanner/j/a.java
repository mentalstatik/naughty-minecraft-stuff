/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.j;

import pulsescanner.f.i;
import pulsescanner.f.m;

public final class a {
    private static long a = System.nanoTime();
    private static float b = 0.016666668f;
    private static String c;

    private a() {
    }

    public static void a() {
        long l2 = System.nanoTime();
        b = (float)Math.min(0.1, Math.max(0.0, (double)(l2 - a) / 1.0E9));
        String string = pulsescanner.j.a.d();
        try {
            a = l2;
            if (i.n() != null) {
                pulsescanner.j.a.b("WnchQb");
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.j.a.a(matchException);
        }
    }

    public static float b() {
        return b;
    }

    private static float c() {
        float f2;
        block6: {
            pulsescanner.f.b.a a2;
            block4: {
                pulsescanner.f.b.a a3;
                block5: {
                    a3 = m.a(pulsescanner.f.b.a.class);
                    String string = pulsescanner.j.a.d();
                    try {
                        try {
                            a2 = a3;
                            if (string == null) break block4;
                            if (a2 != null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.j.a.a(matchException);
                        }
                        f2 = 1.0f;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.j.a.a(matchException);
                    }
                }
                a2 = a3;
            }
            f2 = a2.s.g();
        }
        return f2;
    }

    public static float a(float f2, float f3, float f4) {
        float f5;
        String string;
        block7: {
            float f6;
            block8: {
                float f7 = 1.0f - (float)Math.exp(-b * f4 * pulsescanner.j.a.c());
                f6 = f2 + (f3 - f2) * f7;
                string = pulsescanner.j.a.d();
                try {
                    try {
                        f5 = f3;
                        if (string == null) break block7;
                        if (!(Math.abs(f5 - f6) < 0.001f)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.j.a.a(matchException);
                    }
                    f5 = f3;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.j.a.a(matchException);
                }
            }
            f5 = f6;
        }
        try {
            if (string == null) {
                i.b(new int[1]);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.j.a.a(matchException);
        }
        return f5;
    }

    static {
        pulsescanner.j.a.b("dIiAGb");
    }

    public static void b(String string) {
        c = string;
    }

    public static String d() {
        return c;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

