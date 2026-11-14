/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11244
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_8030
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 */
package pulsescanner.g;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import net.minecraft.class_11244;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_8030;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import pulsescanner.g.c;
import pulsescanner.g.i;
import pulsescanner.mixin.DrawContextAccessor;

public final class b {
    public static float a = 1.0f;
    private static final Deque<class_8030> b;
    private static float[] c;
    private static int[] d;
    private static int e;
    private static float f;
    private static float g;
    private static float h;
    private static float i;
    public static float j;
    private static int[] k;

    private b() {
    }

    public static float a() {
        return 1.0f / ((float)Math.max(1, class_310.method_1551().method_22683().method_4495()) * j);
    }

    public static int a(int n2, float f2) {
        int n3 = Math.round((float)(n2 >>> 24 & 0xFF) * Math.max(0.0f, Math.min(1.0f, f2)));
        return n3 << 24 | n2 & 0xFFFFFF;
    }

    public static int a(int n2, int n3) {
        return Math.max(0, Math.min(255, n3)) << 24 | n2 & 0xFFFFFF;
    }

    public static int a(int n2, int n3, int n4, int n5) {
        return Math.max(0, Math.min(255, n5)) << 24 | Math.max(0, Math.min(255, n2)) << 16 | Math.max(0, Math.min(255, n3)) << 8 | Math.max(0, Math.min(255, n4));
    }

    public static int b(int n2, int n3) {
        return pulsescanner.g.b.a((n2 >> 16 & 0xFF) + n3, (n2 >> 8 & 0xFF) + n3, (n2 & 0xFF) + n3, n2 >>> 24 & 0xFF);
    }

    public static int a(int n2, int n3, float f2) {
        f2 = Math.max(0.0f, Math.min(1.0f, f2));
        int n4 = n2 >>> 24 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n3 >>> 24 & 0xFF;
        int n9 = n3 >> 16 & 0xFF;
        int n10 = n3 >> 8 & 0xFF;
        int n11 = n3 & 0xFF;
        return Math.round((float)n4 + (float)(n8 - n4) * f2) << 24 | Math.round((float)n5 + (float)(n9 - n5) * f2) << 16 | Math.round((float)n6 + (float)(n10 - n6) * f2) << 8 | Math.round((float)n7 + (float)(n11 - n7) * f2);
    }

    public static void a(class_332 class_3322, int n2, int n3, int n4, int n5) {
        class_3322.method_44379(n2, n3, n2 + n4, n3 + n5);
        class_8030 class_80302 = new class_8030(n2, n3, Math.max(0, n4), Math.max(0, n5)).method_65185((Matrix3x2fc)class_3322.method_51448());
        class_8030 class_80303 = b.peek();
        if (class_80303 != null) {
            class_8030 class_80304;
            class_8030 class_80305 = class_80303.method_49701(class_80302);
            try {
                class_80304 = class_80305 != null ? class_80305 : class_8030.method_48248();
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
            class_80302 = class_80304;
        }
        b.push(class_80302);
    }

    public static void a(class_332 class_3322) {
        class_3322.method_44380();
        b.poll();
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, int n2) {
        block4: {
            try {
                try {
                    if (!(f4 <= 0.0f) && !(f5 <= 0.0f)) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.b.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
        }
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(f2, f3, n2, f2, f3 + f5, n2, f2 + f4, f3 + f5, n2, f2 + f4, f3, n2);
        pulsescanner.g.b.b(class_3322);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, int n2, int n3) {
        block4: {
            try {
                try {
                    if (!(f4 <= 0.0f) && !(f5 <= 0.0f)) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.b.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
        }
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(f2, f3, n2, f2, f3 + f5, n2, f2 + f4, f3 + f5, n3, f2 + f4, f3, n3);
        pulsescanner.g.b.b(class_3322);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, int n2) {
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, (arg_0, arg_1) -> b.lambda$round$0(n2, arg_0, arg_1));
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, int n2, int n3) {
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, (arg_0, arg_1) -> b.lambda$roundGradient$1(n2, n3, f3, f5, arg_0, arg_1));
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, int n2, int n3) {
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, (arg_0, arg_1) -> b.lambda$roundGradientH$2(n2, n3, f2, f4, arg_0, arg_1));
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, c c2) {
        block4: {
            try {
                try {
                    if (!(f4 <= 0.0f) && !(f5 <= 0.0f)) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.b.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
        }
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(pulsescanner.g.b.a(f2, f3, f4, f5, f6), c2);
        pulsescanner.g.b.b(class_3322);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, int n2) {
        block4: {
            try {
                try {
                    if (!(f4 <= 0.0f) && !(f5 <= 0.0f)) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.b.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
        }
        float f8 = f7 / 2.0f;
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(pulsescanner.g.b.a(f2 + f8, f3 + f8, f4 - f7, f5 - f7, Math.max(0.0f, f6 - f8)), true, f7, (arg_0, arg_1) -> b.lambda$roundOutline$3(n2, arg_0, arg_1));
        pulsescanner.g.b.b(class_3322);
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, int n2) {
        pulsescanner.g.b.b();
        float[] fArray = pulsescanner.g.b.a(f2, f3, f4, f5, f6);
        float[] fArray2 = pulsescanner.g.b.a(fArray, true);
        int n3 = n2;
        int n4 = n2 & 0xFFFFFF;
        pulsescanner.g.b.a(fArray, fArray2, true, 0.0f, f7, (arg_0, arg_1) -> b.lambda$shadow$4(n3, arg_0, arg_1), (arg_0, arg_1) -> b.lambda$shadow$5(n4, arg_0, arg_1));
        pulsescanner.g.b.b(class_3322);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, int n2) {
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(pulsescanner.g.b.a(f2, f3, f4), (arg_0, arg_1) -> b.lambda$circle$6(n2, arg_0, arg_1));
        pulsescanner.g.b.b(class_3322);
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, int n2) {
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(pulsescanner.g.b.a(f2, f3, f4 - f5 / 2.0f), true, f5, (arg_0, arg_1) -> b.lambda$ring$7(n2, arg_0, arg_1));
        pulsescanner.g.b.b(class_3322);
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, int n2) {
        pulsescanner.g.b.b();
        float[] fArray = pulsescanner.g.b.a(f2, f3, f4);
        int n3 = n2 & 0xFFFFFF;
        int n4 = fArray.length / 2;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = (i2 + 1) % n4;
            pulsescanner.g.b.a(f2, f3, n2, fArray[i2 * 2], fArray[i2 * 2 + 1], n3, fArray[n5 * 2], fArray[n5 * 2 + 1], n3);
        }
        pulsescanner.g.b.b(class_3322);
    }

    public static void a(class_332 class_3322, float[] fArray, int n2) {
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(pulsescanner.g.b.a(fArray), (arg_0, arg_1) -> b.lambda$polygon$8(n2, arg_0, arg_1));
        pulsescanner.g.b.b(class_3322);
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, int n2) {
        pulsescanner.g.b.a(class_3322, new float[]{f2, f3, f4, f5}, false, f6, n2);
    }

    public static void a(class_332 class_3322, float[] fArray, boolean bl, float f2, int n2) {
        pulsescanner.g.b.b();
        pulsescanner.g.b.a(pulsescanner.g.b.a(fArray), bl, f2, (arg_0, arg_1) -> b.lambda$polyline$9(n2, arg_0, arg_1));
        pulsescanner.g.b.b(class_3322);
    }

    public static void c(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, int n2) {
        block14: {
            try {
                block13: {
                    try {
                        try {
                            try {
                                if (f6 <= 0.0f || f6 >= 1.0f) break block13;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.b.a(matchException);
                            }
                            if (f4 <= 0.0f) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.b.a(matchException);
                        }
                        if (!(f5 <= 0.0f)) break block14;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.b.a(matchException);
                    }
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
        }
        float f7 = f5 * 0.55f;
        float f8 = Math.max(10.0f, Math.min(28.0f, f4 * 0.18f));
        float f9 = f2 - f8 - f7 + (f4 + f8 * 2.0f + f7) * f6;
        int n3 = n2 & 0xFFFFFF;
        int n4 = pulsescanner.g.b.a(n2, 0.35f);
        pulsescanner.g.b.a(class_3322, (int)Math.ceil(f2), (int)Math.ceil(f3), (int)Math.floor(f4), (int)Math.floor(f5));
        pulsescanner.g.b.b();
        float[] fArray = new float[]{f3, f3 + f5 * 0.18f, f3 + f5 * 0.82f, f3 + f5};
        for (int i2 = 0; i2 < 3; ++i2) {
            int n5;
            int n6;
            float f10 = fArray[i2];
            float f11 = fArray[i2 + 1];
            float f12 = f7 * (1.0f - (f10 - f3) / f5);
            float f13 = f7 * (1.0f - (f11 - f3) / f5);
            try {
                n6 = i2 == 0 ? n4 : n2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
            int n7 = n6;
            try {
                n5 = i2 == 2 ? n4 : n2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
            int n8 = n5;
            pulsescanner.g.b.a(f9 - f8 + f12, f10, n3, f9 - f8 + f13, f11, n3, f9 + f13, f11, n8, f9 + f12, f10, n7);
            pulsescanner.g.b.a(f9 + f12, f10, n7, f9 + f13, f11, n8, f9 + f8 + f13, f11, n3, f9 + f8 + f12, f10, n3);
        }
        pulsescanner.g.b.b(class_3322);
        pulsescanner.g.b.a(class_3322);
    }

    public static void d(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, int n2) {
        float f7 = f4 / 2.0f;
        float[] fArray = new float[]{-f7 * 0.5f, -f7, f7 * 0.5f, 0.0f, -f7 * 0.5f, f7};
        float f8 = (float)Math.cos(f5);
        float f9 = (float)Math.sin(f5);
        for (int i2 = 0; i2 < fArray.length; i2 += 2) {
            float f10 = fArray[i2];
            float f11 = fArray[i2 + 1];
            fArray[i2] = f2 + f10 * f8 - f11 * f9;
            fArray[i2 + 1] = f3 + f10 * f9 + f11 * f8;
        }
        pulsescanner.g.b.a(class_3322, fArray, false, f6, n2);
    }

    public static float[] a(float f2, float f3, float f4, float f5, float f6) {
        float[][] fArrayArray;
        int n2;
        f6 = Math.max(0.0f, Math.min(f6, Math.min(f4, f5) / 2.0f));
        try {
            n2 = f6 < 0.3f ? 0 : Math.max(3, (int)Math.ceil(f6 / pulsescanner.g.b.a() * 0.45f));
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        int n3 = n2;
        n3 = Math.min(n3, 24);
        float[] fArray = new float[(n3 + 1) * 4 * 2];
        int n4 = 0;
        block6: for (float[] fArray2 : fArrayArray = new float[][]{{f2 + f6, f3 + f6, (float)Math.PI}, {f2 + f4 - f6, f3 + f6, 4.712389f}, {f2 + f4 - f6, f3 + f5 - f6, 0.0f}, {f2 + f6, f3 + f5 - f6, 1.5707964f}}) {
            int n5 = 0;
            while (true) {
                double d2;
                double d3;
                block9: {
                    block8: {
                        try {
                            try {
                                if (n5 > n3) continue block6;
                                d3 = fArray2[2];
                                if (n3 != 0) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.b.a(matchException);
                            }
                            d2 = 0.0;
                            break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.b.a(matchException);
                        }
                    }
                    d2 = 1.5707963267948966 * (double)n5 / (double)n3;
                }
                double d4 = d3 + d2;
                fArray[n4++] = fArray2[0] + (float)Math.cos(d4) * f6;
                fArray[n4++] = fArray2[1] + (float)Math.sin(d4) * f6;
                ++n5;
            }
        }
        return pulsescanner.g.b.a(fArray);
    }

    public static float[] a(float f2, float f3, float f4) {
        int n2 = Math.max(12, Math.min(96, (int)Math.ceil(f4 / pulsescanner.g.b.a() * 1.6f)));
        float[] fArray = new float[n2 * 2];
        for (int i2 = 0; i2 < n2; ++i2) {
            double d2 = Math.PI * 2 * (double)i2 / (double)n2;
            fArray[i2 * 2] = f2 + (float)Math.cos(d2) * f4;
            fArray[i2 * 2 + 1] = f3 + (float)Math.sin(d2) * f4;
        }
        return fArray;
    }

    private static float[] a(float[] fArray) {
        int n2;
        float[] fArray2;
        block17: {
            fArray2 = new float[fArray.length];
            n2 = 0;
            int n3 = 0;
            while (true) {
                block16: {
                    block15: {
                        try {
                            try {
                                try {
                                    try {
                                        if (n3 >= fArray.length) break;
                                        if (n2 < 2) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.g.b.a(matchException);
                                    }
                                    if (!(Math.abs(fArray2[n2 - 2] - fArray[n3]) < 0.001f)) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.g.b.a(matchException);
                                }
                                if (!(Math.abs(fArray2[n2 - 1] - fArray[n3 + 1]) < 0.001f)) break block15;
                                break block16;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.b.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.b.a(matchException);
                        }
                    }
                    fArray2[n2++] = fArray[n3];
                    fArray2[n2++] = fArray[n3 + 1];
                }
                n3 += 2;
            }
            try {
                try {
                    try {
                        if (n2 < 4 || !(Math.abs(fArray2[0] - fArray2[n2 - 2]) < 0.001f)) break block17;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.b.a(matchException);
                    }
                    if (!(Math.abs(fArray2[1] - fArray2[n2 - 1]) < 0.001f)) break block17;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.b.a(matchException);
                }
                n2 -= 2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.b.a(matchException);
            }
        }
        return Arrays.copyOf(fArray2, n2);
    }

    /*
     * Unable to fully structure code
     */
    private static float[] a(float[] var0, boolean var1_1) {
        block29: {
            block28: {
                block26: {
                    block27: {
                        var3_2 = var0.length / 2;
                        var2_3 = pulsescanner.g.b.c();
                        var4_4 = new float[var3_2 * 2];
                        try {
                            try {
                                v0 = var1_1;
                                if (var2_3 != null) break block26;
                                if (v0 == 0) break block27;
                            }
                            catch (MatchException v1) {
                                throw pulsescanner.g.b.a(v1);
                            }
                            v2 = var3_2;
                            break block28;
                        }
                        catch (MatchException v3) {
                            throw pulsescanner.g.b.a(v3);
                        }
                    }
                    v0 = var3_2;
                }
                v2 = v0 - 1;
            }
            var5_5 = v2;
            var6_6 = 0;
            while (var6_6 < var5_5) {
                block30: {
                    block31: {
                        v4 = var6_6 + 1;
                        v5 = var3_2;
                        if (var2_3 != null) break block29;
                        var7_8 = v4 % v5;
                        var8_9 = var0[var7_8 * 2] - var0[var6_6 * 2];
                        var9_10 = var0[var7_8 * 2 + 1] - var0[var6_6 * 2 + 1];
                        var10_11 = (float)Math.sqrt(var8_9 * var8_9 + var9_10 * var9_10);
                        try {
                            if (var2_3 != null) break block30;
                            if (!(var10_11 < 1.0E-6f)) break block31;
                        }
                        catch (MatchException v6) {
                            throw pulsescanner.g.b.a(v6);
                        }
                        var10_11 = 1.0f;
                    }
                    var4_4[var6_6 * 2] = var9_10 / var10_11;
                    var4_4[var6_6 * 2 + 1] = -var8_9 / var10_11;
                    ++var6_6;
                }
                if (var2_3 == null) continue;
            }
            v4 = var3_2;
            v5 = 2;
        }
        var6_7 = new float[v4 * v5];
        for (var7_8 = 0; var7_8 < var3_2; ++var7_8) {
            block37: {
                block38: {
                    block36: {
                        block34: {
                            block35: {
                                block32: {
                                    block33: {
                                        try {
                                            try {
                                                try {
                                                    v7 = var1_1;
                                                    if (var2_3 != null) break block32;
                                                    if (v7 != 0) break block33;
                                                }
                                                catch (MatchException v8) {
                                                    throw pulsescanner.g.b.a(v8);
                                                }
                                                v7 = var7_8;
                                                if (var2_3 != null) break block32;
                                            }
                                            catch (MatchException v9) {
                                                throw pulsescanner.g.b.a(v9);
                                            }
                                            if (v7 != 0) break block33;
                                        }
                                        catch (MatchException v10) {
                                            throw pulsescanner.g.b.a(v10);
                                        }
                                        var8_9 = var10_11 = var4_4[0];
                                        var9_10 = var11_12 = var4_4[1];
                                        if (var2_3 == null) break block36;
                                    }
                                    v7 = var1_1;
                                }
                                try {
                                    try {
                                        try {
                                            if (var2_3 != null) break block34;
                                            if (v7 == 0) {
                                            }
                                            ** GOTO lbl97
                                        }
                                        catch (MatchException v11) {
                                            throw pulsescanner.g.b.a(v11);
                                        }
                                        v12 = var7_8;
                                        v13 = var3_2;
                                        if (var2_3 != null) break block35;
                                    }
                                    catch (MatchException v14) {
                                        throw pulsescanner.g.b.a(v14);
                                    }
                                    if (v12 == v13 - 1) {
                                    }
                                    ** GOTO lbl97
                                }
                                catch (MatchException v15) {
                                    throw pulsescanner.g.b.a(v15);
                                }
                                var8_9 = var10_11 = var4_4[(var7_8 - 1) * 2];
                                var9_10 = var11_12 = var4_4[(var7_8 - 1) * 2 + 1];
                                try {
                                    if (var2_3 == null) break block36;
lbl97:
                                    // 3 sources

                                    v12 = var7_8 - 1 + var3_2;
                                    v13 = var3_2;
                                }
                                catch (MatchException v16) {
                                    throw pulsescanner.g.b.a(v16);
                                }
                            }
                            v7 = v12 % v13;
                        }
                        var12_14 = v7;
                        var8_9 = var4_4[var12_14 * 2];
                        var9_10 = var4_4[var12_14 * 2 + 1];
                        var10_11 = var4_4[var7_8 * 2];
                        var11_12 = var4_4[var7_8 * 2 + 1];
                    }
                    var12_13 = var8_9 + var10_11;
                    var13_15 = var9_10 + var11_12;
                    var14_16 = (float)Math.sqrt(var12_13 * var12_13 + var13_15 * var13_15);
                    try {
                        v17 = var14_16;
                        if (var2_3 != null) break block37;
                        if (!(v17 < 1.0E-6f)) break block38;
                    }
                    catch (MatchException v18) {
                        throw pulsescanner.g.b.a(v18);
                    }
                    var12_13 = var10_11;
                    var13_15 = var11_12;
                    var14_16 = 1.0f;
                }
                v17 = Math.max(0.25f, (var12_13 /= var14_16) * var10_11 + (var13_15 /= var14_16) * var11_12);
            }
            var15_17 = v17;
            var6_7[var7_8 * 2] = var12_13 / var15_17;
            var6_7[var7_8 * 2 + 1] = var13_15 / var15_17;
            if (var2_3 == null) continue;
        }
        return var6_7;
    }

    private static void a(float[] fArray, c c2) {
        int n2;
        int n3 = fArray.length / 2;
        try {
            if (n3 < 3) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        float f2 = pulsescanner.g.b.a() * 0.5f;
        float[] fArray2 = pulsescanner.g.b.a(fArray, true);
        float[] fArray3 = new float[fArray.length];
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (n2 = 0; n2 < n3; ++n2) {
            fArray3[n2 * 2] = fArray[n2 * 2] - fArray2[n2 * 2] * f2;
            fArray3[n2 * 2 + 1] = fArray[n2 * 2 + 1] - fArray2[n2 * 2 + 1] * f2;
            f3 += fArray[n2 * 2];
            f4 += fArray[n2 * 2 + 1];
        }
        n2 = c2.a(f3 /= (float)n3, f4 /= (float)n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = (i2 + 1) % n3;
            float f5 = fArray3[i2 * 2];
            float f6 = fArray3[i2 * 2 + 1];
            float f7 = fArray3[n4 * 2];
            float f8 = fArray3[n4 * 2 + 1];
            pulsescanner.g.b.a(f3, f4, n2, f5, f6, c2.a(f5, f6), f7, f8, c2.a(f7, f8));
        }
        pulsescanner.g.b.a(fArray, fArray2, true, -f2, f2, c2, (arg_0, arg_1) -> b.lambda$fillConvex$10(c2, arg_0, arg_1));
    }

    private static void a(float[] fArray, boolean bl, float f2, c c2) {
        float f3;
        try {
            if (fArray.length < 4) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        float f4 = pulsescanner.g.b.a();
        c c3 = c2;
        if (f2 < f4) {
            f3 = f2 / f4;
            c3 = (arg_0, arg_1) -> b.lambda$stroke$11(c2, f3, arg_0, arg_1);
            f2 = f4;
        }
        f3 = f2 / 2.0f;
        float[] fArray2 = pulsescanner.g.b.a(fArray, bl);
        c c4 = c3;
        c c5 = (arg_0, arg_1) -> b.lambda$stroke$12(c4, arg_0, arg_1);
        pulsescanner.g.b.a(fArray, fArray2, bl, -f3 - f4 * 0.5f, -f3 + f4 * 0.5f, c5, c4);
        pulsescanner.g.b.a(fArray, fArray2, bl, -f3 + f4 * 0.5f, f3 - f4 * 0.5f, c4, c4);
        pulsescanner.g.b.a(fArray, fArray2, bl, f3 - f4 * 0.5f, f3 + f4 * 0.5f, c4, c5);
    }

    private static void a(float[] fArray, float[] fArray2, boolean bl, float f2, float f3, c c2, c c3) {
        int n2;
        int n3 = fArray.length / 2;
        try {
            n2 = bl ? n3 : n3 - 1;
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        int n4 = n2;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = (i2 + 1) % n3;
            float f4 = fArray[i2 * 2];
            float f5 = fArray[i2 * 2 + 1];
            float f6 = fArray[n5 * 2];
            float f7 = fArray[n5 * 2 + 1];
            float f8 = f4 + fArray2[i2 * 2] * f2;
            float f9 = f5 + fArray2[i2 * 2 + 1] * f2;
            float f10 = f6 + fArray2[n5 * 2] * f2;
            float f11 = f7 + fArray2[n5 * 2 + 1] * f2;
            float f12 = f4 + fArray2[i2 * 2] * f3;
            float f13 = f5 + fArray2[i2 * 2 + 1] * f3;
            float f14 = f6 + fArray2[n5 * 2] * f3;
            float f15 = f7 + fArray2[n5 * 2 + 1] * f3;
            pulsescanner.g.b.a(f8, f9, c2.a(f4, f5), f10, f11, c2.a(f6, f7), f14, f15, c3.a(f6, f7), f12, f13, c3.a(f4, f5));
        }
    }

    private static void b() {
        e = 0;
        g = Float.MAX_VALUE;
        f = Float.MAX_VALUE;
        i = -3.4028235E38f;
        h = -3.4028235E38f;
    }

    private static void a(float f2, float f3, int n2, float f4, float f5, int n3, float f6, float f7, int n4) {
        pulsescanner.g.b.a(f2, f3, n2, f4, f5, n3, f6, f7, n4, f6, f7, n4);
    }

    private static void a(float f2, float f3, int n2, float f4, float f5, int n3, float f6, float f7, int n4, float f8, float f9, int n5) {
        block3: {
            block2: {
                float f10 = (f4 - f2) * (f7 - f3) - (f5 - f3) * (f6 - f2);
                try {
                    if (!(f10 > 0.0f)) break block2;
                    pulsescanner.g.b.a(f8, f9, n5);
                    pulsescanner.g.b.a(f6, f7, n4);
                    pulsescanner.g.b.a(f4, f5, n3);
                    pulsescanner.g.b.a(f2, f3, n2);
                    break block3;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.b.a(matchException);
                }
            }
            pulsescanner.g.b.a(f2, f3, n2);
            pulsescanner.g.b.a(f4, f5, n3);
            pulsescanner.g.b.a(f6, f7, n4);
            pulsescanner.g.b.a(f8, f9, n5);
        }
    }

    private static void a(float f2, float f3, int n2) {
        int n3;
        try {
            if (e * 2 + 2 > c.length) {
                c = Arrays.copyOf(c, c.length * 2);
                d = Arrays.copyOf(d, d.length * 2);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        try {
            pulsescanner.g.b.c[pulsescanner.g.b.e * 2] = f2;
            pulsescanner.g.b.c[pulsescanner.g.b.e * 2 + 1] = f3;
            int[] nArray = d;
            int n4 = e;
            n3 = a >= 1.0f ? n2 : pulsescanner.g.b.a(n2, a);
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        try {
            nArray[n4] = n3;
            ++e;
            if (f2 < f) {
                f = f2;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        try {
            if (f3 < g) {
                g = f3;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        try {
            if (f2 > h) {
                h = f2;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        try {
            if (f3 > i) {
                i = f3;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
    }

    private static void b(class_332 class_3322) {
        try {
            if (e == 0) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        i i2 = new i(new Matrix3x2f((Matrix3x2fc)class_3322.method_51448()), Arrays.copyOf(c, e * 2), Arrays.copyOf(d, e), e, b.peek(), f, g, h, i);
        try {
            if (i2.comp_4274() == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.b.a(matchException);
        }
        ((DrawContextAccessor)class_3322).pulse$getState().method_70919((class_11244)i2);
    }

    private static int lambda$stroke$12(c c2, float f2, float f3) {
        return c2.a(f2, f3) & 0xFFFFFF;
    }

    private static int lambda$stroke$11(c c2, float f2, float f3, float f4) {
        return pulsescanner.g.b.a(c2.a(f3, f4), f2);
    }

    private static int lambda$fillConvex$10(c c2, float f2, float f3) {
        return c2.a(f2, f3) & 0xFFFFFF;
    }

    private static int lambda$polyline$9(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$polygon$8(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$ring$7(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$circle$6(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$shadow$5(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$shadow$4(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$roundOutline$3(int n2, float f2, float f3) {
        return n2;
    }

    private static int lambda$roundGradientH$2(int n2, int n3, float f2, float f3, float f4, float f5) {
        return pulsescanner.g.b.a(n2, n3, (f4 - f2) / f3);
    }

    private static int lambda$roundGradient$1(int n2, int n3, float f2, float f3, float f4, float f5) {
        return pulsescanner.g.b.a(n2, n3, (f5 - f2) / f3);
    }

    private static int lambda$round$0(int n2, float f2, float f3) {
        return n2;
    }

    static {
        pulsescanner.g.b.b(null);
        b = new ArrayDeque<class_8030>();
        c = new float[4096];
        d = new int[2048];
        j = 1.0f;
    }

    public static void b(int[] nArray) {
        k = nArray;
    }

    public static int[] c() {
        return k;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

