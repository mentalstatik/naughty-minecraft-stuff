/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.minecraft.class_10799
 *  net.minecraft.class_11231
 *  net.minecraft.class_11244
 *  net.minecraft.class_4588
 *  net.minecraft.class_8030
 *  org.jetbrains.annotations.Nullable
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 */
package pulsescanner.g;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.minecraft.class_10799;
import net.minecraft.class_11231;
import net.minecraft.class_11244;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import pulsescanner.g.b;

public final class i
implements class_11244 {
    private final Matrix3x2fc a;
    private final float[] b;
    private final int[] c;
    private final int d;
    @Nullable
    private final class_8030 e;
    @Nullable
    private final class_8030 f;

    public i(Matrix3x2f matrix3x2f, float[] fArray, int[] nArray, int n2, @Nullable class_8030 class_80302, float f2, float f3, float f4, float f5) {
        class_8030 class_80303;
        block4: {
            class_8030 class_80304;
            block5: {
                this.a = matrix3x2f;
                this.b = fArray;
                this.c = nArray;
                this.d = n2;
                this.e = class_80302;
                int n3 = (int)Math.floor(f2);
                int n4 = (int)Math.floor(f3);
                int n5 = (int)Math.ceil(f4);
                int n6 = (int)Math.ceil(f5);
                class_80304 = new class_8030(n3, n4, Math.max(1, n5 - n3), Math.max(1, n6 - n4)).method_71523((Matrix3x2fc)matrix3x2f);
                int[] nArray2 = pulsescanner.g.b.c();
                try {
                    try {
                        i i2 = this;
                        class_80303 = class_80302;
                        if (nArray2 != null) break block4;
                        if (class_80303 == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw i.a(matchException);
                    }
                    class_80303 = class_80302.method_49701(class_80304);
                    break block4;
                }
                catch (MatchException matchException) {
                    throw i.a(matchException);
                }
            }
            class_80303 = class_80304;
        }
        i2.f = class_80303;
    }

    public void method_70917(class_4588 class_45882) {
        int[] nArray = pulsescanner.g.b.c();
        for (int i2 = 0; i2 < this.d; ++i2) {
            class_45882.method_70815(this.a, this.b[i2 * 2], this.b[i2 * 2 + 1]).method_39415(this.c[i2]);
            if (nArray == null) continue;
        }
    }

    public RenderPipeline comp_4055() {
        return class_10799.field_56879;
    }

    public class_11231 comp_4056() {
        return class_11231.method_70899();
    }

    @Nullable
    public class_8030 comp_4069() {
        return this.e;
    }

    @Nullable
    public class_8030 comp_4274() {
        return this.f;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

