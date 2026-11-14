/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package pulsescanner.g;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import pulsescanner.f.f.f;
import pulsescanner.g.b;
import pulsescanner.g.h;
import pulsescanner.g.k;

public final class j {
    private static final int a = 320;
    private static final float b = 10.0f;
    private static final Vector3f[] c;
    private static final double[] d;
    private static final double[] e;
    private static class_4587.class_4665 f;
    private static class_4588 g;
    private static class_4588 h;
    private static float i;
    private static float j;
    private static float k;
    private static float l;
    private static float m;
    private static final String[] n;

    private j() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(f f2, class_4184 class_41842) {
        class_310 class_3102;
        block7: {
            class_3102 = class_310.method_1551();
            i = class_3102.method_22683().method_4489();
            j = class_3102.method_22683().method_4506();
            if (i < 1.0f) return;
            try {
                if (!(j < 1.0f)) break block7;
                return;
                catch (MatchException matchException) {
                    throw pulsescanner.g.j.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.j.a(matchException);
            }
        }
        Matrix4f matrix4f = class_3102.field_1773.method_22973(pulsescanner.g.h.a);
        k = matrix4f.m00();
        l = matrix4f.m11();
        m = pulsescanner.g.k.a(1.0f);
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.identity();
        try {
            f = new class_4587().method_23760();
            g = pulsescanner.g.k.b(true);
            h = pulsescanner.g.k.a(true);
            pulsescanner.g.j.a((String)f2.l.a(), f2.m.h(), (Boolean)f2.n.a(), (Integer)f2.o.a(), class_41842);
            pulsescanner.g.k.b();
            return;
        }
        finally {
            matrix4fStack.popMatrix();
            f = null;
            h = null;
            g = null;
        }
    }

    private static float a(double d2) {
        return (float)((d2 / (double)i * 2.0 - 1.0) * 10.0 / (double)k);
    }

    private static float b(double d2) {
        return (float)((1.0 - d2 / (double)j * 2.0) * 10.0 / (double)l);
    }

    private static void a(double d2, double d3, double d4, double d5, int n2) {
        pulsescanner.g.j.a(d2, d3, d4, d5, n2, n2);
    }

    private static void a(double d2, double d3, double d4, double d5, int n2, int n3) {
        block4: {
            try {
                try {
                    if (!(d4 <= 0.0) && !(d5 <= 0.0)) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.j.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.j.a(matchException);
            }
        }
        float f2 = pulsescanner.g.j.a(d2);
        float f3 = pulsescanner.g.j.a(d2 + d4);
        float f4 = pulsescanner.g.j.b(d3);
        float f5 = pulsescanner.g.j.b(d3 + d5);
        pulsescanner.g.k.a(f, g, f2, f4, -10.0f, f2, f5, -10.0f, f3, f5, -10.0f, f3, f4, -10.0f, n2, n3, n3, n2);
    }

    private static void b(double d2, double d3, double d4, double d5, int n2) {
        pulsescanner.g.k.a(f, h, pulsescanner.g.j.a(d2), pulsescanner.g.j.b(d3), -10.0f, pulsescanner.g.j.a(d4), pulsescanner.g.j.b(d5), -10.0f, n2, m);
    }

    private static void a(double d2, double d3, double d4, double d5, double d6, double d7, int n2) {
        pulsescanner.g.k.a(f, g, pulsescanner.g.j.a(d2), pulsescanner.g.j.b(d3), -10.0f, pulsescanner.g.j.a(d4), pulsescanner.g.j.b(d5), -10.0f, pulsescanner.g.j.a(d6), pulsescanner.g.j.b(d7), -10.0f, n2);
    }

    private static void a(double d2, double d3, double d4, int n2) {
        int n3 = 24;
        for (int i2 = 0; i2 < n3; ++i2) {
            double d5 = Math.PI * 2 * (double)i2 / (double)n3;
            double d6 = Math.PI * 2 * (double)(i2 + 1) / (double)n3;
            pulsescanner.g.j.a(d2, d3, d2 + Math.cos(d5) * d4, d3 + Math.sin(d5) * d4, d2 + Math.cos(d6) * d4, d3 + Math.sin(d6) * d4, n2);
        }
    }

    /*
     * Exception decompiling
     */
    private static void a(String var0, int var1_1, boolean var2_2, int var3_3, class_4184 var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 10[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a(class_4184 class_41842, int n2, double d2, String string) {
        block55: {
            int n3;
            int n4;
            int[] nArray;
            double[] dArray;
            double[] dArray2;
            int[] nArray2;
            block72: {
                int n5;
                block71: {
                    Quaternionf quaternionf = new Quaternionf((Quaternionfc)class_41842.method_23767()).conjugate();
                    double d3 = (double)j / (2.0 * Math.tan(Math.toRadians(70.0) * 0.5));
                    nArray2 = new int[]{5, 18, 32, 43, 59, 72, 94, 105, 121, 143, 160, 178};
                    dArray2 = new double[nArray2.length];
                    dArray = new double[nArray2.length];
                    String[] stringArray = n;
                    int n6 = string.equals(stringArray[3]);
                    nArray = pulsescanner.g.b.c();
                    boolean bl = string.equals(stringArray[4]);
                    n4 = 0;
                    while (n4 < n2) {
                        block69: {
                            block58: {
                                int n7;
                                double d4;
                                double d5;
                                block67: {
                                    int n8;
                                    block68: {
                                        int n9;
                                        int n10;
                                        double d6;
                                        int n11;
                                        block65: {
                                            block66: {
                                                block63: {
                                                    block64: {
                                                        double d7;
                                                        double d8;
                                                        block61: {
                                                            block62: {
                                                                double d9;
                                                                block60: {
                                                                    block59: {
                                                                        float f2;
                                                                        Vector3f vector3f;
                                                                        block56: {
                                                                            block57: {
                                                                                if (nArray != null) break block55;
                                                                                vector3f = new Vector3f((Vector3fc)c[n4]).rotate((Quaternionfc)quaternionf);
                                                                                try {
                                                                                    try {
                                                                                        f2 = vector3f.z;
                                                                                        if (nArray != null) break block56;
                                                                                        if (!(f2 >= -0.08f)) break block57;
                                                                                        break block58;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.g.j.a(matchException);
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.g.j.a(matchException);
                                                                                }
                                                                            }
                                                                            f2 = i;
                                                                        }
                                                                        d5 = (double)f2 * 0.5 + (double)(vector3f.x / -vector3f.z) * d3;
                                                                        if (nArray != null) break block69;
                                                                        d4 = (double)j * 0.5 - (double)(vector3f.y / -vector3f.z) * d3;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (d5 < -8.0) break block58;
                                                                                    d8 = d5;
                                                                                    if (nArray != null) break block59;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.g.j.a(matchException);
                                                                                }
                                                                                if (d8 > (double)(i + 8.0f)) break block58;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.g.j.a(matchException);
                                                                            }
                                                                            d8 = d4;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.g.j.a(matchException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                d9 = -8.0;
                                                                                if (nArray != null) break block60;
                                                                                if (d8 < d9) break block58;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.g.j.a(matchException);
                                                                            }
                                                                            d8 = d4;
                                                                            if (nArray != null) break block61;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.g.j.a(matchException);
                                                                        }
                                                                        d9 = j + 8.0f;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.g.j.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (!(d8 > d9)) break block62;
                                                                    break block58;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.g.j.a(matchException);
                                                                }
                                                            }
                                                            d8 = 0.79 + 0.21 * Math.sin(d2 * (0.55 + d[n4] * 0.17) + e[n4]);
                                                        }
                                                        double d10 = d8;
                                                        try {
                                                            d7 = bl ? 75.0 * d10 : 186.0 * d10;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.g.j.a(matchException);
                                                        }
                                                        n11 = (int)d7;
                                                        d6 = d[n4] * ((double)j / 1080.0 + 0.45);
                                                        try {
                                                            n10 = n6;
                                                            if (nArray != null) break block63;
                                                            if (n10 == 0) break block64;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.g.j.a(matchException);
                                                        }
                                                        n10 = 210;
                                                        break block63;
                                                    }
                                                    n10 = 233;
                                                }
                                                try {
                                                    n9 = n6;
                                                    if (nArray != null) break block65;
                                                    if (n9 == 0) break block66;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.g.j.a(matchException);
                                                }
                                                n9 = 240;
                                                break block65;
                                            }
                                            n9 = 235;
                                        }
                                        int n12 = pulsescanner.g.b.a(n10, n9, 255, n11);
                                        try {
                                            try {
                                                pulsescanner.g.j.a(d5 - d6 * 0.5, d4 - d6 * 0.5, d6, d6, n12);
                                                n8 = n4;
                                                if (nArray != null) break block67;
                                                if (n8 % 19 != 0) break block68;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.g.j.a(matchException);
                                            }
                                            pulsescanner.g.j.a(d5 - d6 * 2.5, d4 - d6 * 2.5, d6 * 5.0, d6 * 5.0, pulsescanner.g.b.a(n12, n11 / 8));
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.g.j.a(matchException);
                                        }
                                    }
                                    n8 = n7 = 0;
                                }
                                while (n7 < nArray2.length) {
                                    block70: {
                                        try {
                                            try {
                                                if (nArray != null) break block69;
                                                if (nArray2[n7] != n4) break block70;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.g.j.a(matchException);
                                            }
                                            dArray2[n7] = d5;
                                            dArray[n7] = d4;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.g.j.a(matchException);
                                        }
                                    }
                                    ++n7;
                                    if (nArray == null) continue;
                                }
                            }
                            ++n4;
                        }
                        if (nArray == null) continue;
                    }
                    try {
                        n5 = string.equals(n[1]);
                        if (nArray != null) break block71;
                        if (n5 == 0) break block55;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.j.a(matchException);
                    }
                    n5 = n2;
                }
                try {
                    if (nArray != null) break block72;
                    if (n5 <= 180) break block55;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.j.a(matchException);
                }
                n4 = pulsescanner.g.b.a(146, 174, 232, 46);
                n5 = n3 = 0;
            }
            while (n3 < nArray2.length - 1) {
                block74: {
                    int n13;
                    double[] dArray3;
                    double d11;
                    double d12;
                    block77: {
                        int n14;
                        int n15;
                        double[] dArray4;
                        block76: {
                            int n16;
                            block75: {
                                int n17;
                                block73: {
                                    try {
                                        try {
                                            try {
                                                n17 = n3;
                                                if (nArray != null) break block73;
                                                if (n17 % 4 == 3) break block74;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.g.j.a(matchException);
                                            }
                                            dArray4 = dArray2;
                                            n16 = n3;
                                            if (nArray != null) break block75;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.g.j.a(matchException);
                                        }
                                        double d13 = dArray4[n16] - 0.0;
                                        n17 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.g.j.a(matchException);
                                    }
                                }
                                try {
                                    try {
                                        if (n17 == 0) break block74;
                                        dArray4 = dArray2;
                                        n15 = n3;
                                        n14 = 1;
                                        if (nArray != null) break block76;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.g.j.a(matchException);
                                    }
                                    n16 = n15 + n14;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.g.j.a(matchException);
                                }
                            }
                            try {
                                if (dArray4[n16] == 0.0) break block74;
                                dArray4 = dArray2;
                                n15 = n3;
                                n14 = 1;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.j.a(matchException);
                            }
                        }
                        try {
                            try {
                                d12 = dArray4[n15 + n14] - dArray2[n3];
                                d11 = dArray[n3 + 1];
                                dArray3 = dArray;
                                n13 = n3;
                                if (nArray != null) break block77;
                                if (!(Math.hypot(d12, d11 - dArray3[n13]) < (double)i * 0.24)) break block74;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.j.a(matchException);
                            }
                            d12 = dArray2[n3];
                            d11 = dArray[n3];
                            dArray3 = dArray2;
                            n13 = n3 + 1;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.j.a(matchException);
                        }
                    }
                    pulsescanner.g.j.b(d12, d11, dArray3[n13], dArray[n3 + 1], n4);
                }
                ++n3;
                if (nArray == null) continue;
            }
        }
    }

    private static void a(double d2, int n2) {
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        int n6 = 0;
        while (true) {
            block11: {
                double d3;
                block10: {
                    double d4;
                    double d5;
                    block9: {
                        block8: {
                            try {
                                try {
                                    if (n6 >= 2) break;
                                    d5 = d2;
                                    if (n6 != 0) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.g.j.a(matchException);
                                }
                                d4 = 0.028;
                                break block9;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.j.a(matchException);
                            }
                        }
                        d4 = 0.017;
                    }
                    d3 = (d5 * d4 + (double)n6 * 0.53) % 1.0;
                    try {
                        if (!(d3 > 0.48)) break block10;
                        break block11;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.j.a(matchException);
                    }
                }
                double d6 = (double)i * (0.12 + d3 * 1.55);
                double d7 = (double)j * (0.12 + (double)n6 * 0.18 + d3 * 0.27);
                for (int i2 = 0; i2 < 14; ++i2) {
                    double d8 = (double)i2 / 14.0;
                    pulsescanner.g.j.b(d6 - (double)(i2 * 5), d7 - (double)(i2 * 2), d6 - (double)((i2 + 1) * 5), d7 - (double)((i2 + 1) * 2), pulsescanner.g.b.a(n3, n4, n5 + 28, (int)(102.0 * (1.0 - d8) * (1.0 - d8))));
                }
                pulsescanner.g.j.a(d6, d7, 2.2, pulsescanner.g.b.a(232, 244, 255, 220));
            }
            ++n6;
        }
    }

    private static void a(int n2, double d2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            double d3 = (pulsescanner.g.j.a((long)i2 * 8419L + 7L) * (double)i + d2 * (double)(8 + i2 % 9)) % (double)i;
            double d4 = (pulsescanner.g.j.a((long)i2 * 1789L + 19L) * (double)j + d2 * (double)(10 + i2 % 13)) % (double)j;
            double d5 = 1.0 + pulsescanner.g.j.a((long)i2 * 3911L + 67L) * 3.2;
            pulsescanner.g.j.a(d3, d4, d5, d5, pulsescanner.g.b.a(229, 245, 255, 100 + i2 % 70));
        }
        pulsescanner.g.j.a(0.0, (double)j * 0.68, i, (double)j * 0.32, pulsescanner.g.b.a(211, 237, 245, 0), pulsescanner.g.b.a(211, 237, 245, 70));
    }

    private static void b(int n2, double d2) {
        block13: {
            int n3;
            int n4;
            int n5;
            int n6;
            double d3;
            double d4;
            double d5;
            double d6;
            block15: {
                block14: {
                    int n7;
                    try {
                        for (n7 = 0; n7 < 4; ++n7) {
                            pulsescanner.g.j.a(0.0, (double)j * (0.13 + (double)n7 * 0.21), i, (double)j * 0.12, pulsescanner.g.b.a(7, 12, 23, 0), pulsescanner.g.b.a(7, 12, 23, 28));
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.j.a(matchException);
                    }
                    for (n7 = 0; n7 < n2 / 2; ++n7) {
                        double d7 = (pulsescanner.g.j.a((long)n7 * 4013L + 11L) * (double)i + d2 * 65.0) % (double)i;
                        double d8 = (pulsescanner.g.j.a((long)n7 * 1867L + 29L) * (double)j + d2 * 125.0) % (double)j;
                        pulsescanner.g.j.b(d7, d8, d7 - 5.0, d8 + 14.0, pulsescanner.g.b.a(171, 204, 219, 52));
                    }
                    double d9 = d2 % 13.0;
                    try {
                        try {
                            if (!(d9 < 0.16)) break block13;
                            d6 = 0.0;
                            d5 = 0.0;
                            d4 = i;
                            d3 = j;
                            n6 = 203;
                            n5 = 219;
                            n4 = 245;
                            if (!(d9 < 0.07)) break block14;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.j.a(matchException);
                        }
                        n3 = 49;
                        break block15;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.j.a(matchException);
                    }
                }
                n3 = 18;
            }
            pulsescanner.g.j.a(d6, d5, d4, d3, pulsescanner.g.b.a(n6, n5, n4, n3));
            double d10 = (double)i * (0.27 + pulsescanner.g.j.a((long)(d2 / 13.0) * 53L + 17L) * 0.45);
            double d11 = 0.0;
            int n8 = 0;
            while (true) {
                double d12;
                double d13;
                double d14;
                block17: {
                    block16: {
                        try {
                            try {
                                if (n8 >= 6) break;
                                d14 = d10;
                                d13 = i;
                                if (n8 % 2 != 0) break block16;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.j.a(matchException);
                            }
                            d12 = 0.021;
                            break block17;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.j.a(matchException);
                        }
                    }
                    d12 = -0.012;
                }
                double d15 = d14 + d13 * d12;
                double d16 = (double)(j * (float)(n8 + 1)) * 0.11;
                pulsescanner.g.j.b(d10, d11, d15, d16, pulsescanner.g.b.a(221, 230, 255, 170 - n8 * 17));
                d10 = d15;
                d11 = d16;
                ++n8;
            }
        }
    }

    private static void a(double d2, double d3) {
        int n2 = 0;
        while (true) {
            int n3;
            int n4;
            block9: {
                block8: {
                    try {
                        try {
                            if (n2 >= 4) break;
                            if (n2 % 2 != 0) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.j.a(matchException);
                        }
                        n4 = 71;
                        break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.g.j.a(matchException);
                    }
                }
                n4 = 119;
            }
            try {
                n3 = n2 % 2 == 0 ? 223 : 164;
            }
            catch (MatchException matchException) {
                throw pulsescanner.g.j.a(matchException);
            }
            int n5 = pulsescanner.g.b.a(n4, n3, 192, 30 - n2 * 4);
            double d4 = 0.0;
            double d5 = (double)j * (0.12 + (double)n2 * 0.08);
            for (int i2 = 1; i2 <= 24; ++i2) {
                double d6 = (double)(i * (float)i2) / 24.0;
                double d7 = (double)j * (0.12 + (double)n2 * 0.08) + Math.sin((double)i2 * 0.47 + d3 * 0.23 + (double)n2) * (double)j * 0.06;
                double d8 = Math.min((double)j, Math.max(d7 + 8.0, d2 + (double)j * 0.08));
                double d9 = Math.min(d5, d7);
                pulsescanner.g.j.a(d4, d9, d6 - d4 + 1.0, Math.max(0.0, d8 - d9), n5, n5 & 0xFFFFFF);
                d4 = d6;
                d5 = d7;
            }
            ++n2;
        }
    }

    private static void c(double d2) {
        double d3 = (double)i * 0.72;
        double d4 = Math.max((double)(-j) * 0.1, Math.min((double)j * 0.92, d2 - (double)j * 0.09));
        pulsescanner.g.j.a(d3, d4, (double)j * 0.1, pulsescanner.g.b.a(255, 188, 140, 15));
        pulsescanner.g.j.a(d3, d4, (double)j * 0.067, pulsescanner.g.b.a(255, 205, 155, 25));
        pulsescanner.g.j.a(d3, d4, (double)j * 0.031, pulsescanner.g.b.a(255, 225, 182, 215));
    }

    private static double a(long l2) {
        long l3 = l2 ^ l2 >>> 33;
        l3 *= -49064778989728563L;
        l3 ^= l3 >>> 33;
        l3 *= -4265267296055464877L;
        l3 ^= l3 >>> 33;
        return (float)(l3 & 0x1FFFFFFFFFFFFFL) / 9.007199E15f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "\u0004c*p\\1R%`\r\u0014b+t[ Q;l1n@+\r\u0014b+t[ Q;l1n@+\u0006\u0016x7h]$\u0004\u0013x6l\f\u0003e0iK O$y*uB\u0004\u0013x6l\u0006\u0016x7h]$";
                var4_3 = "\u0004c*p\\1R%`\r\u0014b+t[ Q;l1n@+\r\u0014b+t[ Q;l1n@+\u0006\u0016x7h]$\u0004\u0013x6l\f\u0003e0iK O$y*uB\u0004\u0013x6l\u0006\u0016x7h]$".length();
                var1_4 = 9;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 55;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = ">X\rTv\u001dr\u0019D\u0017H\u007f\t9^\u0017Ma\fo\u0018]";
                    var4_3 = ">X\rTv\u001dr\u0019D\u0017H\u007f\t9^\u0017Ma\fo\u0018]".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 10;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v0;
            v8 = v6;
            v9 = v6.length;
            var6_6 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v11 = 96;
                        break;
                    }
                    case 1: {
                        v11 = 58;
                        break;
                    }
                    case 2: {
                        v11 = 114;
                        break;
                    }
                    case 3: {
                        v11 = 48;
                        break;
                    }
                    case 4: {
                        v11 = 24;
                        break;
                    }
                    case 5: {
                        v11 = 114;
                        break;
                    }
                    default: {
                        v11 = 10;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl71:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl79:
                // 1 sources

                ** continue;
            }
        }
        pulsescanner.g.j.n = var5;
        pulsescanner.g.j.c = new Vector3f[320];
        pulsescanner.g.j.d = new double[320];
        pulsescanner.g.j.e = new double[320];
        for (var7_7 = 0; var7_7 < 320; ++var7_7) {
            var8_8 = pulsescanner.g.j.a((long)var7_7 * 2654435769L + 17L) * 3.141592653589793 * 2.0;
            var10_9 = 0.04 + pulsescanner.g.j.a((long)var7_7 * 1663821211L + 31L) * 1.38;
            var12_10 = Math.cos(var10_9);
            pulsescanner.g.j.c[var7_7] = new Vector3f((float)(Math.cos(var8_8) * var12_10), (float)Math.sin(var10_9), (float)(Math.sin(var8_8) * var12_10));
            pulsescanner.g.j.d[var7_7] = 0.7 + pulsescanner.g.j.a((long)var7_7 * 1284865837L + 71L) * 1.8;
            pulsescanner.g.j.e[var7_7] = pulsescanner.g.j.a((long)var7_7 * 668265263L + 113L) * 3.141592653589793 * 2.0;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

