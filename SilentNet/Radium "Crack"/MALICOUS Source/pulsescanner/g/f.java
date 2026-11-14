/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.g;

import net.minecraft.class_332;
import pulsescanner.g.b;

public final class f {
    private static final float a = 5.5f;
    private static final float b = 1.1f;
    public static final int c = 15898188;

    private f() {
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        f.a(class_3322, f2, f3, f4, f5, f6, f7, f8, 15898188);
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2) {
        float f9;
        block2: {
            block3: {
                int[] nArray = pulsescanner.g.b.c();
                try {
                    float f10 = f8 - 0.0f;
                    f9 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                    if (nArray != null) break block2;
                    if (f9 > 0) break block3;
                }
                catch (MatchException matchException) {
                    throw f.a(matchException);
                }
                return;
            }
            f9 = Math.min(255, Math.round(44.0f * f8));
        }
        float f11 = f9;
        pulsescanner.g.b.b(class_3322, f2, f3, f4, f5, f6, f7, pulsescanner.g.b.a(n2, (int)f11));
    }

    public static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = Math.min(f5, 20.0f);
        int n2 = pulsescanner.g.b.a(0xFFFFFF, Math.min(255, Math.round(28.0f * f7)));
        pulsescanner.g.b.a(class_3322, f2, f3, f4, f5, f6, (arg_0, arg_1) -> f.lambda$topShine$0(n2, f3, f8, arg_0, arg_1));
        float f9 = Math.max(f6, 2.0f);
        pulsescanner.g.b.a(class_3322, f2 + f9, f3 + Math.max(pulsescanner.g.b.a(), 0.5f), (f4 - f9 * 2.0f) / 2.0f, Math.max(pulsescanner.g.b.a(), 0.5f), 0xFFFFFF, pulsescanner.g.b.a(0xFFFFFF, Math.min(255, Math.round(85.0f * f7))));
        pulsescanner.g.b.a(class_3322, f2 + f4 / 2.0f, f3 + Math.max(pulsescanner.g.b.a(), 0.5f), (f4 - f9 * 2.0f) / 2.0f, Math.max(pulsescanner.g.b.a(), 0.5f), pulsescanner.g.b.a(0xFFFFFF, Math.min(255, Math.round(85.0f * f7))), 0xFFFFFF);
    }

    public static void b(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        block4: {
            float f9;
            block5: {
                double d2 = (double)System.currentTimeMillis() / 1000.0 + (double)f6;
                f9 = (float)(d2 % 5.5) / 1.1f;
                int[] nArray = pulsescanner.g.b.c();
                try {
                    try {
                        f8 = f9;
                        if (nArray != null) break block4;
                        if (!(f8 >= 1.0f)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw f.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw f.a(matchException);
                }
            }
            f8 = f9 * f9 * (3.0f - 2.0f * f9);
        }
        float f10 = f8;
        pulsescanner.g.b.c(class_3322, f2, f3, f4, f5, f10, pulsescanner.g.b.a(0xFFFFFF, Math.min(255, Math.round(38.0f * f7))));
    }

    private static int lambda$topShine$0(int n2, float f2, float f3, float f4, float f5) {
        return pulsescanner.g.b.a(n2, Math.max(0.0f, 1.0f - (f5 - f2) / f3));
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

