/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_241
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package pulsescanner.a;

import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import pulsescanner.a.ad;
import pulsescanner.a.as;
import pulsescanner.a.p;

public final class ag
implements ad {
    private static final String b;

    public static double a(float f2, float f3, float f4) {
        if (f3 < 0.0f) {
            f2 += 180.0f;
        }
        float f5 = 1.0f;
        if (f3 < 0.0f) {
            f5 = -0.5f;
        }
        if (f3 > 0.0f) {
            f5 = 0.5f;
        }
        if (f4 > 0.0f) {
            f2 -= 90.0f * f5;
        }
        if (f4 < 0.0f) {
            f2 += 90.0f * f5;
        }
        return Math.toRadians(f2);
    }

    public static void a(p p2, float f2, float f3) {
        block9: {
            float f4 = p2.e();
            float f5 = p2.f();
            double d2 = ag.a.field_1724.method_6128() ? class_3532.method_15338((double)Math.toDegrees(ag.a(f2, f4, f5))) : class_3532.method_15338((double)Math.toDegrees(ag.a(f3, f4, f5)));
            try {
                if (f4 == 0.0f && f5 == 0.0f) break block9;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw ag.a(unsupportedOperationException);
            }
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = Float.MAX_VALUE;
            block6: for (float f9 = -1.0f; f9 <= 1.0f; f9 += 1.0f) {
                float f10 = -1.0f;
                while (true) {
                    block11: {
                        double d3;
                        double d4;
                        block10: {
                            try {
                                try {
                                    if (!(f10 <= 1.0f)) continue block6;
                                    if (f10 != 0.0f) break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw ag.a(unsupportedOperationException);
                                }
                                if (f9 == 0.0f) break block11;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ag.a(unsupportedOperationException);
                            }
                        }
                        if ((d4 = Math.abs(d2 - (d3 = class_3532.method_15338((double)Math.toDegrees(ag.a(f2, f9, f10)))))) < (double)f8) {
                            f8 = (float)d4;
                            f6 = f9;
                            f7 = f10;
                        }
                    }
                    f10 += 1.0f;
                }
            }
            p2.a(f6);
            p2.b(f7);
        }
    }

    private ag() {
        throw new UnsupportedOperationException(b);
    }

    public static void a(double d2) {
        block38: {
            double d3;
            double d4;
            block56: {
                float f2;
                block57: {
                    float f3;
                    int n2;
                    block55: {
                        float f4;
                        float f5;
                        block54: {
                            block52: {
                                float f6;
                                block53: {
                                    float f7;
                                    block49: {
                                        block51: {
                                            block50: {
                                                block46: {
                                                    block48: {
                                                        block47: {
                                                            block44: {
                                                                block45: {
                                                                    double d5;
                                                                    block42: {
                                                                        block43: {
                                                                            block41: {
                                                                                float f8;
                                                                                block39: {
                                                                                    block40: {
                                                                                        class_310 class_3102;
                                                                                        block37: {
                                                                                            n2 = as.r();
                                                                                            try {
                                                                                                try {
                                                                                                    class_3102 = a;
                                                                                                    if (n2 == 0) break block37;
                                                                                                    if (class_3102.field_1724 == null) break block38;
                                                                                                }
                                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                    throw ag.a(unsupportedOperationException);
                                                                                                }
                                                                                                class_3102 = a;
                                                                                            }
                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                throw ag.a(unsupportedOperationException);
                                                                                            }
                                                                                        }
                                                                                        f3 = class_3102.field_1724.method_36454();
                                                                                        d5 = Math.toRadians(f3);
                                                                                        d4 = 0.0;
                                                                                        d3 = 0.0;
                                                                                        class_241 class_2412 = ag.a.field_1724.field_3913.method_3128();
                                                                                        f5 = class_2412.field_1342;
                                                                                        f6 = class_2412.field_1343;
                                                                                        try {
                                                                                            f2 = f5;
                                                                                            f8 = 0.0f;
                                                                                            if (n2 == 0) break block39;
                                                                                            if (!(f2 > f8)) break block40;
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            throw ag.a(unsupportedOperationException);
                                                                                        }
                                                                                        d4 -= Math.sin(d5) * d2;
                                                                                        d3 += Math.cos(d5) * d2;
                                                                                    }
                                                                                    try {
                                                                                        f2 = f5;
                                                                                        if (n2 == 0) break block41;
                                                                                        f8 = 0.0f;
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        throw ag.a(unsupportedOperationException);
                                                                                    }
                                                                                }
                                                                                if (f2 < f8) {
                                                                                    d4 += Math.sin(d5) * d2;
                                                                                    d3 -= Math.cos(d5) * d2;
                                                                                }
                                                                                f2 = f6;
                                                                            }
                                                                            try {
                                                                                if (n2 == 0) break block42;
                                                                                if (!(f2 > 0.0f)) break block43;
                                                                            }
                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                throw ag.a(unsupportedOperationException);
                                                                            }
                                                                            d4 += Math.cos(d5) * d2;
                                                                            d3 += Math.sin(d5) * d2;
                                                                        }
                                                                        f2 = f6;
                                                                    }
                                                                    try {
                                                                        if (n2 == 0) break block44;
                                                                        if (!(f2 < 0.0f)) break block45;
                                                                    }
                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                        throw ag.a(unsupportedOperationException);
                                                                    }
                                                                    d4 -= Math.cos(d5) * d2;
                                                                    d3 -= Math.sin(d5) * d2;
                                                                }
                                                                f2 = f6;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        f7 = 0.0f;
                                                                        if (n2 == 0) break block46;
                                                                        if (!(f2 > f7)) break block47;
                                                                    }
                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                        throw ag.a(unsupportedOperationException);
                                                                    }
                                                                    f2 = f5;
                                                                    if (n2 == 0) break block48;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    throw ag.a(unsupportedOperationException);
                                                                }
                                                                if (!(f2 > 0.0f)) break block47;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                throw ag.a(unsupportedOperationException);
                                                            }
                                                            d4 = Math.cos(Math.toRadians(f3 + 45.0f)) * d2;
                                                            d3 = Math.sin(Math.toRadians(f3 + 45.0f)) * d2;
                                                        }
                                                        f2 = f6;
                                                    }
                                                    f7 = 0.0f;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (n2 == 0) break block49;
                                                            if (!(f2 < f7)) break block50;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw ag.a(unsupportedOperationException);
                                                        }
                                                        f2 = f5;
                                                        if (n2 == 0) break block51;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw ag.a(unsupportedOperationException);
                                                    }
                                                    if (!(f2 > 0.0f)) break block50;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw ag.a(unsupportedOperationException);
                                                }
                                                d4 = -Math.cos(Math.toRadians(f3 - 45.0f)) * d2;
                                                d3 = -Math.sin(Math.toRadians(f3 - 45.0f)) * d2;
                                            }
                                            f2 = f6;
                                        }
                                        try {
                                            if (n2 == 0) break block52;
                                            f7 = 0.0f;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw ag.a(unsupportedOperationException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!(f2 > f7)) break block53;
                                            f2 = f5;
                                            f4 = 0.0f;
                                            if (n2 == 0) break block54;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw ag.a(unsupportedOperationException);
                                        }
                                        if (!(f2 < f4)) break block53;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw ag.a(unsupportedOperationException);
                                    }
                                    d4 = -Math.cos(Math.toRadians(f3 + 135.0f)) * d2;
                                    d3 = -Math.sin(Math.toRadians(f3 + 135.0f)) * d2;
                                }
                                f2 = f6;
                            }
                            try {
                                if (n2 == 0) break block55;
                                f4 = 0.0f;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ag.a(unsupportedOperationException);
                            }
                        }
                        try {
                            if (!(f2 < f4)) break block56;
                            f2 = f5;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ag.a(unsupportedOperationException);
                        }
                    }
                    try {
                        if (n2 == 0) break block57;
                        if (!(f2 < 0.0f)) break block56;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ag.a(unsupportedOperationException);
                    }
                    d4 = Math.cos(Math.toRadians(f3 - 135.0f)) * d2;
                    f2 = f3 - 135.0f;
                }
                d3 = Math.sin(Math.toRadians(f2)) * d2;
            }
            ag.a.field_1724.method_18800(d4, ag.a.field_1724.method_18798().field_1351, d3);
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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
                char[] cArray2 = "\u001e\u000e8!E\r%j\u0007q'\u0011\r:#\u0012(r\u0006\b79\u0015q3\u000b\u0000v)\u0007?<\n\u0010v(\u0003q;\u000b\u0017\"+\b%;\u0004\u00103.".toCharArray();
                n4 = 110;
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
                    case 0 -> 36;
                    case 1 -> 8;
                    case 2 -> 63;
                    case 3 -> 60;
                    case 4 -> 11;
                    case 5 -> 10;
                    default -> 56;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        b = new String(cArray).intern();
    }
}

