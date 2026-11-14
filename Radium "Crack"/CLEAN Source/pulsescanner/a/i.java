/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import pulsescanner.a.as;
import pulsescanner.a.h;

public final class i {
    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public static final h n;
    public static final h o;
    public static final h p;
    public static final h q;
    public static final h r;
    public static final h s;
    public static final h t;
    public static final h u;
    public static final h v;
    public static final h w;
    public static final h x;
    public static final h y;
    public static final h z;
    public static final h A;
    public static final h B;
    public static final h C;
    public static final h D;
    public static final h E;
    public static final h F;
    private static final String G;

    public static h a(double d2) {
        return arg_0 -> i.lambda$inOutPower$20(d2, arg_0);
    }

    public static h a(int n2) {
        return pulsescanner.a.i.b((double)n2);
    }

    public static h b(double d2) {
        return arg_0 -> i.lambda$outPower$21(d2, arg_0);
    }

    public static h b(int n2) {
        return pulsescanner.a.i.c(n2);
    }

    public static h c(double d2) {
        return arg_0 -> i.lambda$inPower$22(d2, arg_0);
    }

    private i() {
        throw new UnsupportedOperationException(G);
    }

    private static double lambda$inPower$22(double d2, double d3) {
        return Math.pow(d3, d2);
    }

    private static double lambda$outPower$21(double d2, double d3) {
        return 1.0 - Math.pow(1.0 - d3, d2);
    }

    private static double lambda$inOutPower$20(double d2, double d3) {
        double d4;
        try {
            d4 = d3 < 0.5 ? Math.pow(2.0, d2 - 1.0) * Math.pow(d3, d2) : 1.0 - Math.pow(-2.0 * d3 + 2.0, d2) / 2.0;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.i.a(unsupportedOperationException);
        }
        return d4;
    }

    private static double lambda$static$19(double d2) {
        return 1.0 - Math.sqrt(1.0 - Math.pow(d2, 2.0));
    }

    private static double lambda$static$18(double d2) {
        return Math.sin(d2 * Math.PI / 2.0);
    }

    private static double lambda$static$17(double d2) {
        double d3;
        block5: {
            block4: {
                try {
                    try {
                        if (d2 == 0.0 || d2 == 1.0) break block4;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.i.a(unsupportedOperationException);
                    }
                    d3 = Math.pow(-2.0, 10.0 * d2 - 10.0) * Math.sin((d2 * 10.0 - 10.75) * 2.0943951023931953);
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.i.a(unsupportedOperationException);
                }
            }
            d3 = d2;
        }
        return d3;
    }

    private static double lambda$static$16(double d2) {
        return Math.sqrt(1.0 - Math.pow(d2 - 1.0, 2.0));
    }

    private static double lambda$static$15(double d2) {
        return 1.0 + 2.70158 * Math.pow(d2 - 1.0, 3.0) + 1.70158 * Math.pow(d2 - 1.0, 2.0);
    }

    private static double lambda$static$14(double d2) {
        block6: {
            double d3;
            block8: {
                block7: {
                    try {
                        try {
                            try {
                                if (d2 == 0.0 || d2 == 1.0) break block6;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.i.a(unsupportedOperationException);
                            }
                            if (!(d2 < 0.5)) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.i.a(unsupportedOperationException);
                        }
                        d3 = Math.pow(2.0, 20.0 * d2 - 10.0) / 2.0;
                        break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.i.a(unsupportedOperationException);
                    }
                }
                d3 = (2.0 - Math.pow(2.0, -20.0 * d2 + 10.0)) / 2.0;
            }
            return d3;
        }
        return d2;
    }

    private static double lambda$static$13(double d2) {
        return d2;
    }

    private static double lambda$static$12(double d2) {
        double d3;
        try {
            d3 = d2 != 1.0 ? 1.0 - Math.pow(2.0, -10.0 * d2) : d2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.i.a(unsupportedOperationException);
        }
        return d3;
    }

    private static double lambda$static$11(double d2) {
        double d3;
        try {
            d3 = d2 < 0.5 ? (1.0 - i.a(1.0 - 2.0 * d2)) / 2.0 : (1.0 + i.a(2.0 * d2 - 1.0)) / 2.0;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.i.a(unsupportedOperationException);
        }
        return d3;
    }

    private static double lambda$static$10(double d2) {
        block6: {
            double d3;
            block8: {
                block7: {
                    try {
                        try {
                            try {
                                if (d2 == 0.0 || d2 == 1.0) break block6;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.i.a(unsupportedOperationException);
                            }
                            if (!(d2 < 0.5)) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.i.a(unsupportedOperationException);
                        }
                        d3 = -(Math.pow(2.0, 20.0 * d2 - 10.0) * Math.sin((20.0 * d2 - 11.125) * 1.3962634015954636)) / 2.0;
                        break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.i.a(unsupportedOperationException);
                    }
                }
                d3 = Math.pow(2.0, -20.0 * d2 + 10.0) * Math.sin((20.0 * d2 - 11.125) * 1.3962634015954636) / 2.0 + 1.0;
            }
            return d3;
        }
        return d2;
    }

    private static double lambda$static$9(double d2) {
        double d3;
        block5: {
            block4: {
                try {
                    try {
                        if (d2 == 0.0 || d2 == 1.0) break block4;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.i.a(unsupportedOperationException);
                    }
                    d3 = Math.pow(2.0, -10.0 * d2) * Math.sin((d2 * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.i.a(unsupportedOperationException);
                }
            }
            d3 = d2;
        }
        return d3;
    }

    private static double lambda$static$8(double d2) {
        double d3;
        try {
            d3 = d2 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * d2, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * d2 + 2.0, 2.0)) + 1.0) / 2.0;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.i.a(unsupportedOperationException);
        }
        return d3;
    }

    private static double lambda$static$7(double d2) {
        return 1.0 - i.a(1.0 - d2);
    }

    private static double lambda$static$6(double d2) {
        double d3;
        block18: {
            double d4;
            double d5;
            block16: {
                double d6;
                double d7;
                block17: {
                    double d8;
                    block14: {
                        int n2;
                        block15: {
                            double d9;
                            double d10;
                            block12: {
                                block13: {
                                    d7 = 7.5625;
                                    n2 = as.q();
                                    d6 = 2.75;
                                    try {
                                        try {
                                            d5 = d2;
                                            d10 = 1.0;
                                            d9 = d6;
                                            if (n2 != 0) break block12;
                                            if (!(d5 < d10 / d9)) break block13;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw pulsescanner.a.i.a(unsupportedOperationException);
                                        }
                                        return d7 * Math.pow(d2, 2.0);
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw pulsescanner.a.i.a(unsupportedOperationException);
                                    }
                                }
                                d5 = d2;
                                d10 = 2.0;
                                d9 = d6;
                            }
                            try {
                                try {
                                    d8 = d10 / d9;
                                    if (n2 != 0) break block14;
                                    if (!(d5 < d8)) break block15;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw pulsescanner.a.i.a(unsupportedOperationException);
                                }
                                return d7 * Math.pow(d2 - 1.5 / d6, 2.0) + 0.75;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.i.a(unsupportedOperationException);
                            }
                        }
                        try {
                            d5 = d2;
                            d4 = 2.5;
                            if (n2 != 0) break block16;
                            d8 = d4 / d6;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.i.a(unsupportedOperationException);
                        }
                    }
                    try {
                        if (!(d5 < d8)) break block17;
                        d3 = d7 * Math.pow(d2 - 2.25 / d6, 2.0) + 0.9375;
                        break block18;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.i.a(unsupportedOperationException);
                    }
                }
                d5 = d7 * Math.pow(d2 - 2.625 / d6, 2.0);
                d4 = 0.984375;
            }
            d3 = d5 + d4;
        }
        return d3;
    }

    private static double lambda$static$5(double d2) {
        double d3;
        try {
            d3 = d2 < 0.5 ? Math.pow(2.0 * d2, 2.0) * (7.189819 * d2 - 2.5949095) / 2.0 : (Math.pow(2.0 * d2 - 2.0, 2.0) * (3.5949095 * (d2 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.i.a(unsupportedOperationException);
        }
        return d3;
    }

    private static double lambda$static$4(double d2) {
        return 1.0 - Math.cos(d2 * Math.PI / 2.0);
    }

    private static double lambda$static$3(double d2) {
        return 1.0 + 2.70158 * Math.pow(d2 - 1.0, 3.0) + 1.70158 * Math.pow(d2 - 1.0, 2.0);
    }

    private static double lambda$static$2(double d2) {
        return 2.70158 * Math.pow(d2, 3.0) - 1.70158 * Math.pow(d2, 2.0);
    }

    private static double lambda$static$1(double d2) {
        double d3;
        try {
            d3 = d2 != 0.0 ? Math.pow(2.0, 10.0 * d2 - 10.0) : d2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.i.a(unsupportedOperationException);
        }
        return d3;
    }

    private static double lambda$static$0(double d2) {
        return -(Math.cos(Math.PI * d2) - 1.0) / 2.0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block11: {
            int n2;
            int n3;
            int n4;
            block10: {
                char[] cArray2 = "uMft#=v\u0001D/rw=iHQv'`8dRV/fm0%BDail %C@/nm'q@K{nb `E".toCharArray();
                n4 = 120;
                cArray = cArray2;
                n3 = cArray2.length;
                n2 = 0;
                if (!true) break block10;
                n3 = n3;
                if (n3 <= n2) break block11;
            }
            do {
                n4 = n4;
                cArray = cArray;
                int n5 = n2;
                cArray[n5] = (char)(cArray[n5] ^ (n4 ^ (switch (n2 % 7) {
                    case 0 -> 89;
                    case 1 -> 93;
                    case 2 -> 119;
                    case 3 -> 127;
                    case 4 -> 123;
                    case 5 -> 44;
                    default -> 125;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        G = new String(cArray).intern();
        a = i::lambda$static$0;
        b = i::lambda$static$1;
        c = i::lambda$static$2;
        d = pulsescanner.a.i.b(3);
        e = pulsescanner.a.i.a(2.0);
        f = i::lambda$static$3;
        g = i::lambda$static$4;
        h = i::lambda$static$5;
        i = i::lambda$static$6;
        j = pulsescanner.a.i.a(3);
        k = pulsescanner.a.i.a(5.0);
        l = i::lambda$static$7;
        m = pulsescanner.a.i.b(4);
        n = pulsescanner.a.i.b(2);
        o = pulsescanner.a.i.a(3.0);
        p = i::lambda$static$8;
        q = pulsescanner.a.i.a(4.0);
        r = i::lambda$static$9;
        s = i::lambda$static$10;
        t = i::lambda$static$11;
        u = i::lambda$static$12;
        v = i::lambda$static$13;
        w = pulsescanner.a.i.a(4);
        x = i::lambda$static$14;
        y = pulsescanner.a.i.a(2);
        z = i::lambda$static$15;
        A = i::lambda$static$16;
        B = i::lambda$static$17;
        C = i::lambda$static$18;
        D = i::lambda$static$19;
        E = pulsescanner.a.i.a(5);
        F = pulsescanner.a.i.b(5);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

