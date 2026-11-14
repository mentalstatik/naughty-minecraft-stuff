/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector4f
 */
package pulsescanner.g;

import net.minecraft.class_1041;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector4f;
import pulsescanner.g.b;

public final class h {
    public static float a = 70.0f;
    private static final Matrix4f b = new Matrix4f();
    private static class_243 c = class_243.field_1353;
    private static float d;
    private static boolean e;

    private h() {
    }

    public static void a(class_4184 class_41842) {
        class_310 class_3102 = class_310.method_1551();
        Matrix4f matrix4f = class_3102.field_1773.method_22973(a);
        Matrix4f matrix4f2 = new Matrix4f().rotation((Quaternionfc)class_41842.method_23767().conjugate(new Quaternionf()));
        b.set((Matrix4fc)matrix4f).mul((Matrix4fc)matrix4f2);
        c = class_41842.method_71156();
        d = class_41842.method_19330();
        e = true;
    }

    public static void a() {
        e = false;
    }

    public static class_243 b() {
        return c;
    }

    public static float c() {
        return d;
    }

    public static float[] a(class_243 class_2432) {
        float f2;
        Vector4f vector4f;
        block7: {
            block8: {
                int[] nArray = pulsescanner.g.b.c();
                try {
                    if (!e) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw h.a(matchException);
                }
                vector4f = new Vector4f((float)(class_2432.field_1352 - h.c.field_1352), (float)(class_2432.field_1351 - h.c.field_1351), (float)(class_2432.field_1350 - h.c.field_1350), 1.0f);
                try {
                    try {
                        b.transform(vector4f);
                        f2 = vector4f.w;
                        if (nArray != null) break block7;
                        if (!(f2 <= 0.05f)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw h.a(matchException);
                }
            }
            f2 = vector4f.x / vector4f.w;
        }
        float f3 = f2;
        float f4 = vector4f.y / vector4f.w;
        class_310 class_3102 = class_310.method_1551();
        float f5 = class_3102.method_22683().method_4486();
        float f6 = class_3102.method_22683().method_4502();
        return new float[]{(f3 * 0.5f + 0.5f) * f5, (1.0f - (f4 * 0.5f + 0.5f)) * f6};
    }

    public static boolean a(float[] fArray, float f2) {
        int n2;
        block21: {
            block18: {
                class_1041 class_10412;
                float f3;
                int[] nArray;
                block20: {
                    float f4;
                    class_310 class_3102;
                    block19: {
                        float f5;
                        block17: {
                            nArray = pulsescanner.g.b.c();
                            try {
                                if (fArray == null) {
                                    return false;
                                }
                            }
                            catch (MatchException matchException) {
                                throw h.a(matchException);
                            }
                            class_3102 = class_310.method_1551();
                            try {
                                try {
                                    try {
                                        f3 = fArray[0];
                                        f5 = f2;
                                        if (nArray != null) break block17;
                                        if (!(f3 >= -f5)) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw h.a(matchException);
                                    }
                                    f3 = fArray[1];
                                    f4 = f2;
                                    if (nArray != null) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw h.a(matchException);
                                }
                                f5 = -f4;
                            }
                            catch (MatchException matchException) {
                                throw h.a(matchException);
                            }
                        }
                        try {
                            try {
                                if (!(f3 >= f5)) break block18;
                                f3 = fArray[0];
                                class_10412 = class_3102.method_22683();
                                if (nArray != null) break block20;
                            }
                            catch (MatchException matchException) {
                                throw h.a(matchException);
                            }
                            f4 = (float)class_10412.method_4486() + f2;
                        }
                        catch (MatchException matchException) {
                            throw h.a(matchException);
                        }
                    }
                    try {
                        if (!(f3 <= f4)) break block18;
                        f3 = fArray[1];
                        class_10412 = class_3102.method_22683();
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                }
                try {
                    float f6 = f3 - ((float)class_10412.method_4502() + f2);
                    n2 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                    if (nArray != null) break block21;
                    if (n2 > 0) break block18;
                }
                catch (MatchException matchException) {
                    throw h.a(matchException);
                }
                n2 = 1;
                break block21;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

