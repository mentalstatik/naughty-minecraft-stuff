/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package pulsescanner.a;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.joml.Matrix4f;
import pulsescanner.a.ad;
import pulsescanner.a.ai;
import pulsescanner.a.as;

public final class ac
implements ad {
    public static final Matrix4f b;
    private static final Random c;
    public static final Matrix4f d;
    public static final Matrix4f e;
    private static final double[] f;
    private static final String[] g;

    private static void a(double d2, double d3) {
        try {
            if (d3 < d2) {
                throw new IllegalArgumentException(g[0]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ac.a(illegalArgumentException);
        }
    }

    public static double a(double d2, double d3, double d4) {
        return Math.max(d2, Math.min(d3, d4));
    }

    public static float b(double d2, double d3, double d4) {
        return (float)(d2 + (d3 - d2) * d4);
    }

    public static boolean a(float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2;
        block18: {
            block15: {
                float f8;
                float f9;
                int n3;
                block17: {
                    block16: {
                        block14: {
                            n3 = as.r();
                            try {
                                try {
                                    f9 = f2;
                                    if (n3 == 0) break block14;
                                    if (!(f9 > f4)) break block15;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ac.a(illegalArgumentException);
                                }
                                f9 = f2;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ac.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                f8 = f4;
                                if (n3 == 0) break block16;
                                if (!(f9 < f8 + f6)) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ac.a(illegalArgumentException);
                            }
                            f9 = f3;
                            f8 = f5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ac.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (n3 == 0) break block17;
                            if (!(f9 > f8)) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ac.a(illegalArgumentException);
                        }
                        f9 = f3;
                        f8 = f5 + f7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ac.a(illegalArgumentException);
                    }
                }
                try {
                    float f10 = f9 - f8;
                    n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                    if (n3 == 0) break block18;
                    if (n2 >= 0) break block15;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ac.a(illegalArgumentException);
                }
                n2 = 1;
                break block18;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    public static float a(float f2, float f3) {
        return (float)Math.round(f2 / f3) * f3;
    }

    private ac() {
        throw new UnsupportedOperationException(g[1]);
    }

    public static float b(double d2, double d3) {
        return (float)(d2 + (d3 - d2) * Math.random());
    }

    public static int a(int n2, int n3) {
        return n2 + (int)(Math.random() * (double)(n3 - n2 + 1));
    }

    public static float b(float f2, float f3) {
        ac.a((double)f2, (double)f3);
        return f2 + ThreadLocalRandom.current().nextFloat() * (f3 - f2);
    }

    public static float c(float f2, float f3) {
        return ((Float)ai.a(Float.valueOf(f3), Float.valueOf(f2), new SecureRandom().nextFloat())).floatValue();
    }

    public static float a(float f2, float f3, float f4) {
        float f5;
        try {
            if (f2 < f3) {
                return f3;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ac.a(illegalArgumentException);
        }
        try {
            f5 = f2 > f4 ? f4 : f2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ac.a(illegalArgumentException);
        }
        return f5;
    }

    public static double c(double d2, double d3, double d4) {
        return Math.max(d3, Math.min(d4, d2));
    }

    public static double c(double d2, double d3) {
        ac.a(d2, d3);
        return d2 + ThreadLocalRandom.current().nextDouble() * (d3 - d2);
    }

    public static float d(float f2, float f3) {
        return (float)Math.round(f2 / f3) * f3;
    }

    public static float e(float f2, float f3) {
        return (float)(Math.random() * (double)(f3 - f2) + (double)f2);
    }

    public static double a(double d2) {
        int n2 = (int)(d2 * 10430.378350470453) & 0xFFFF;
        return f[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "_-pLU\b\u0014\\#|LT\fZ^){\u001f\u0016\u001d\u0012S\"(\u0001_\u0007T2f$a\u001f\u0016\u0000\t\u0012-(\u0019B\u0000\u0016[8qLU\u0005\u001bA?(\rX\rZQ-f\u0002Y\u001dZP)(\u0005X\u001a\u000eS\"|\u0005W\u001d\u001fV";
            var4_3 = "_-pLU\b\u0014\\#|LT\fZ^){\u001f\u0016\u001d\u0012S\"(\u0001_\u0007T2f$a\u001f\u0016\u0000\t\u0012-(\u0019B\u0000\u0016[8qLU\u0005\u001bA?(\rX\rZQ-f\u0002Y\u001dZP)(\u0005X\u001a\u000eS\"|\u0005W\u001d\u001fV".length();
            var1_4 = 28;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block15;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = 11;
            v0 = v2;
            v4 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl53
            do {
                v3 = v3;
                v0 = v0;
                v5 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 57;
                        break;
                    }
                    case 1: {
                        v6 = 71;
                        break;
                    }
                    case 2: {
                        v6 = 3;
                        break;
                    }
                    case 3: {
                        v6 = 103;
                        break;
                    }
                    case 4: {
                        v6 = 61;
                        break;
                    }
                    case 5: {
                        v6 = 98;
                        break;
                    }
                    default: {
                        v6 = 113;
                    }
                }
                v0[v5] = (char)(v0[v5] ^ (v3 ^ v6));
                ++var6_6;
lbl53:
                // 2 sources

                v4 = v4;
            } while (v4 > var6_6);
            ** while (true)
        }
        ac.g = var5;
        ac.b = new Matrix4f();
        ac.c = new Random();
        ac.d = new Matrix4f();
        ac.e = new Matrix4f();
        ac.f = new double[65536];
        try {
            for (var7_7 = 0; var7_7 < 65536; ++var7_7) {
                ac.f[var7_7] = Math.sin((double)var7_7 * 6.283185307179586 / 65536.0);
            }
        }
        catch (IllegalArgumentException v7) {
            throw ac.a(v7);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

