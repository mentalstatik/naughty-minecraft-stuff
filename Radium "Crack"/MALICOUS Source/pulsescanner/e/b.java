/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.e;

import pulsescanner.f.i;

public record b(String o, String p, String q, boolean r, double s, double t, long u, String v) {
    private static i[] b;

    public b(String string, String string2, String string3, boolean bl, double d2, double d3, long l2, String string4) {
        i[] iArray = pulsescanner.e.b.w();
        this.o = string;
        i[] iArray2 = iArray;
        try {
            this.p = string2;
            this.q = string3;
            this.r = bl;
            this.s = d2;
            this.t = d3;
            this.u = l2;
            this.v = string4;
            if (iArray2 != null) {
                i.b(new int[1]);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.e.b.a(matchException);
        }
    }

    public double a() {
        double d2;
        block11: {
            double d3;
            double d4;
            block9: {
                block10: {
                    double d5;
                    double d6;
                    i[] iArray = pulsescanner.e.b.w();
                    try {
                        d6 = this.s;
                        d5 = this.r ? (double)(System.currentTimeMillis() - this.u) / 1000.0 : 0.0;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.e.b.a(matchException);
                    }
                    d4 = d6 + d5;
                    try {
                        try {
                            d3 = this.t;
                            if (iArray != null) break block9;
                            if (!(d3 > 0.0)) break block10;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.e.b.a(matchException);
                        }
                        d2 = Math.min(this.t, Math.max(0.0, d4));
                        break block11;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.e.b.a(matchException);
                    }
                }
                d3 = 0.0;
            }
            d2 = Math.max(d3, d4);
        }
        try {
            if (i.n() != null) {
                pulsescanner.e.b.b(new i[2]);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.e.b.a(matchException);
        }
        return d2;
    }

    public static void b(i[] iArray) {
        b = iArray;
    }

    public static i[] w() {
        return b;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    static {
        if (pulsescanner.e.b.w() != null) {
            pulsescanner.e.b.b(new i[3]);
        }
    }
}

