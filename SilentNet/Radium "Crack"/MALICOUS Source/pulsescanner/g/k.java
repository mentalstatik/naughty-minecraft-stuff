/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  net.minecraft.class_10799
 *  net.minecraft.class_12247
 *  net.minecraft.class_1921
 *  net.minecraft.class_238
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_9799
 *  org.joml.Vector3f
 */
package pulsescanner.g;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import java.lang.invoke.LambdaMetafactory;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_238;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import org.joml.Vector3f;
import pulsescanner.PulseScanner;
import pulsescanner.f.i;
import pulsescanner.g.b;

public final class k {
    private static class_1921 a;
    private static class_1921 b;
    private static class_1921 c;
    private static class_1921 d;
    private static class_4597.class_4598 e;
    private static final String[] f;

    private k() {
    }

    private static RenderPipeline a(RenderPipeline renderPipeline, String string, boolean bl) {
        return k.a(renderPipeline, string, bl, renderPipeline.getVertexShader(), renderPipeline.getFragmentShader());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static RenderPipeline a(RenderPipeline var0, String var1_1, boolean var2_2, class_2960 var3_3, class_2960 var4_4) {
        block15: {
            var5_5 = pulsescanner.g.b.c();
            try {
                v0 = RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[0]).withLocation(class_2960.method_60655((String)k.f[3], (String)(k.f[5] + var1_1))).withVertexShader(var3_3).withFragmentShader(var4_4).withVertexFormat(var0.getVertexFormat(), var0.getVertexFormatMode()).withCull(false).withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false);
                v1 = var2_2 != false ? DepthTestFunction.NO_DEPTH_TEST : DepthTestFunction.LEQUAL_DEPTH_TEST;
            }
            catch (NumberFormatException v2) {
                throw k.a(v2);
            }
            var6_6 = v0.withDepthTestFunction(v1);
            var7_7 = var0.getSamplers().iterator();
            while (var7_7.hasNext()) {
                v3 /* !! */  = (String)var7_7.next();
                if (var5_5 == null) {
                    var8_8 = v3 /* !! */ ;
                    var6_6.withSampler(var8_8);
                    if (var5_5 == null) continue;
                }
                ** GOTO lbl-1000
            }
            for (String v3 : var0.getUniforms()) lbl-1000:
            // 2 sources

            {
                block17: {
                    block16: {
                        var8_8 = (RenderPipeline.UniformDescription)v3 /* !! */ ;
                        try {
                            try {
                                try {
                                    if (var5_5 != null) break block15;
                                    if (var5_5 != null) break block16;
                                }
                                catch (NumberFormatException v4) {
                                    throw k.a(v4);
                                }
                                if (var8_8.textureFormat() != null) {
                                }
                                ** GOTO lbl40
                            }
                            catch (NumberFormatException v5) {
                                throw k.a(v5);
                            }
                            var6_6.withUniform(var8_8.name(), var8_8.type(), var8_8.textureFormat());
                        }
                        catch (NumberFormatException v6) {
                            throw k.a(v6);
                        }
                    }
                    try {
                        if (var5_5 == null) break block17;
lbl40:
                        // 2 sources

                        var6_6.withUniform(var8_8.name(), var8_8.type());
                    }
                    catch (NumberFormatException v7) {
                        throw k.a(v7);
                    }
                }
                if (var5_5 == null) continue;
            }
            var0.getShaderDefines().comp_3103().forEach((BiConsumer<String, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$copy$0(com.mojang.blaze3d.pipeline.RenderPipeline$Builder java.lang.String java.lang.String ), (Ljava/lang/String;Ljava/lang/String;)V)((RenderPipeline.Builder)var6_6));
            var0.getShaderDefines().comp_3104().forEach((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, withShaderDefine(java.lang.String ), (Ljava/lang/String;)V)((RenderPipeline.Builder)var6_6));
        }
        return var6_6.build();
    }

    private static void a() {
        try {
            if (a != null) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
        String[] stringArray = f;
        class_2960 class_29602 = class_2960.method_60655((String)stringArray[1], (String)stringArray[8]);
        a = class_1921.method_75940((String)stringArray[4], (class_12247)class_12247.method_75927((RenderPipeline)k.a(class_10799.field_56833, stringArray[7], true, class_29602, class_29602)).method_75937().method_75938());
        b = class_1921.method_75940((String)stringArray[2], (class_12247)class_12247.method_75927((RenderPipeline)k.a(class_10799.field_56833, stringArray[9], false, class_29602, class_29602)).method_75937().method_75938());
        class_2960 class_29603 = class_2960.method_60656((String)stringArray[0]);
        c = class_1921.method_75940((String)stringArray[13], (class_12247)class_12247.method_75927((RenderPipeline)k.a(class_10799.field_56865, stringArray[12], true, class_29603, class_29603)).method_75937().method_75938());
        d = class_1921.method_75940((String)stringArray[11], (class_12247)class_12247.method_75927((RenderPipeline)k.a(class_10799.field_56865, stringArray[6], false, class_29603, class_29603)).method_75937().method_75938());
        LinkedHashMap<class_1921, class_9799> linkedHashMap = new LinkedHashMap<class_1921, class_9799>();
        linkedHashMap.put(d, new class_9799(262144));
        linkedHashMap.put(c, new class_9799(262144));
        linkedHashMap.put(b, new class_9799(262144));
        linkedHashMap.put(a, new class_9799(262144));
        e = class_4597.method_22992(linkedHashMap, (class_9799)new class_9799(65536));
        PulseScanner.LOG.info(stringArray[10], (Object)class_10799.field_56865.getVertexFormatMode(), (Object)class_10799.field_56833.getVertexFormatMode());
    }

    public static class_4588 a(boolean bl) {
        class_1921 class_19212;
        class_4597.class_4598 class_45982;
        try {
            k.a();
            class_45982 = e;
            class_19212 = bl ? a : b;
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
        return class_45982.method_73477(class_19212);
    }

    public static class_4588 b(boolean bl) {
        class_1921 class_19212;
        class_4597.class_4598 class_45982;
        try {
            k.a();
            class_45982 = e;
            class_19212 = bl ? c : d;
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
        return class_45982.method_73477(class_19212);
    }

    public static void b() {
        try {
            if (a == null) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
        e.method_22994(d);
        e.method_22994(c);
        e.method_22994(b);
        e.method_22994(a);
        e.method_22993();
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, float f7, int n2, float f8) {
        Vector3f vector3f = new Vector3f(f5 - f2, f6 - f3, f7 - f4);
        try {
            if (vector3f.lengthSquared() < 1.0E-8f) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
        vector3f.normalize();
        class_45882.method_56824(class_46652, f2, f3, f4).method_39415(n2).method_61959(class_46652, vector3f).method_75298(f8);
        class_45882.method_56824(class_46652, f5, f6, f7).method_39415(n2).method_61959(class_46652, vector3f).method_75298(f8);
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, class_238 class_2383, int n2, float f2) {
        float f3 = (float)class_2383.field_1323;
        float f4 = (float)class_2383.field_1322;
        float f5 = (float)class_2383.field_1321;
        float f6 = (float)class_2383.field_1320;
        float f7 = (float)class_2383.field_1325;
        int[] nArray = pulsescanner.g.b.c();
        float f8 = (float)class_2383.field_1324;
        try {
            k.a(class_46652, class_45882, f3, f4, f5, f6, f4, f5, n2, f2);
            k.a(class_46652, class_45882, f6, f4, f5, f6, f4, f8, n2, f2);
            k.a(class_46652, class_45882, f6, f4, f8, f3, f4, f8, n2, f2);
            k.a(class_46652, class_45882, f3, f4, f8, f3, f4, f5, n2, f2);
            k.a(class_46652, class_45882, f3, f7, f5, f6, f7, f5, n2, f2);
            k.a(class_46652, class_45882, f6, f7, f5, f6, f7, f8, n2, f2);
            k.a(class_46652, class_45882, f6, f7, f8, f3, f7, f8, n2, f2);
            k.a(class_46652, class_45882, f3, f7, f8, f3, f7, f5, n2, f2);
            k.a(class_46652, class_45882, f3, f4, f5, f3, f7, f5, n2, f2);
            k.a(class_46652, class_45882, f6, f4, f5, f6, f7, f5, n2, f2);
            k.a(class_46652, class_45882, f6, f4, f8, f6, f7, f8, n2, f2);
            k.a(class_46652, class_45882, f3, f4, f8, f3, f7, f8, n2, f2);
            if (nArray != null) {
                i.b(new int[1]);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, class_238 class_2383, int n2, int n3) {
        float f2 = (float)class_2383.field_1323;
        float f3 = (float)class_2383.field_1322;
        float f4 = (float)class_2383.field_1321;
        float f5 = (float)class_2383.field_1320;
        float f6 = (float)class_2383.field_1325;
        float f7 = (float)class_2383.field_1324;
        k.a(class_46652, class_45882, f2, f3, f4, f5, f3, f4, f5, f3, f7, f2, f3, f7, n2);
        k.a(class_46652, class_45882, f2, f6, f4, f2, f6, f7, f5, f6, f7, f5, f6, f4, n3);
        k.a(class_46652, class_45882, f2, f3, f4, f2, f6, f4, f5, f6, f4, f5, f3, f4, n2);
        k.a(class_46652, class_45882, f2, f3, f7, f5, f3, f7, f5, f6, f7, f2, f6, f7, n2);
        k.a(class_46652, class_45882, f2, f3, f4, f2, f3, f7, f2, f6, f7, f2, f6, f4, n2);
        k.a(class_46652, class_45882, f5, f3, f4, f5, f6, f4, f5, f6, f7, f5, f3, f7, n2);
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, int n2) {
        k.a(class_46652, class_45882, f2, f3, f4, f2, f3, f6, f5, f3, f6, f5, f3, f4, n2);
    }

    public static void b(class_4587.class_4665 class_46652, class_4588 class_45882, class_238 class_2383, int n2, int n3) {
        float f2 = (float)class_2383.field_1323;
        float f3 = (float)class_2383.field_1322;
        float f4 = (float)class_2383.field_1321;
        float f5 = (float)class_2383.field_1320;
        float f6 = (float)class_2383.field_1325;
        float f7 = (float)class_2383.field_1324;
        k.a(class_46652, class_45882, f2, f4, f5, f4, f3, f6, n2, n3);
        k.a(class_46652, class_45882, f5, f4, f5, f7, f3, f6, n2, n3);
        k.a(class_46652, class_45882, f5, f7, f2, f7, f3, f6, n2, n3);
        k.a(class_46652, class_45882, f2, f7, f2, f4, f3, f6, n2, n3);
    }

    public static float a(float f2) {
        return f2 * Math.max(1.0f, (float)class_310.method_1551().method_22683().method_4506() / 1080.0f);
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, class_4588 class_45883, class_238 class_2383, int n2, int n3, float f2) {
        try {
            if (n2 >>> 24 != 0) {
                k.a(class_46652, class_45882, class_2383, n2, n2);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
        try {
            if (n3 >>> 24 != 0) {
                k.a(class_46652, class_45883, class_2383, n3, f2);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw k.a(numberFormatException);
        }
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int n2, int n3, int n4, int n5) {
        class_45882.method_56824(class_46652, f2, f3, f4).method_39415(n2);
        class_45882.method_56824(class_46652, f5, f6, f7).method_39415(n3);
        class_45882.method_56824(class_46652, f8, f9, f10).method_39415(n4);
        class_45882.method_56824(class_46652, f11, f12, f13).method_39415(n5);
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int n2) {
        k.a(class_46652, class_45882, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, n2, n2, n2, n2);
    }

    public static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int n2) {
        k.a(class_46652, class_45882, f2, f3, f4, f5, f6, f7, f8, f9, f10, f8, f9, f10, n2);
    }

    private static void a(class_4587.class_4665 class_46652, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, float f7, int n2, int n3) {
        class_45882.method_56824(class_46652, f2, f6, f3).method_39415(n2);
        class_45882.method_56824(class_46652, f4, f6, f5).method_39415(n2);
        class_45882.method_56824(class_46652, f4, f7, f5).method_39415(n3);
        class_45882.method_56824(class_46652, f2, f7, f3).method_39415(n3);
    }

    private static void lambda$copy$0(RenderPipeline.Builder builder, String string, String string2) {
        try {
            builder.withShaderDefine(string, Integer.parseInt(string2));
        }
        catch (NumberFormatException numberFormatException) {
            builder.withShaderDefine(string, Float.parseFloat(string2));
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[14];
                var3_1 = 0;
                var2_2 = "bU6%Eg+rS0)\u0005y\u001bbU(/\u0018\fqO(3\u000fd'`T*%\u0018\u000bqO(3\u000fH(hT!3\fqO(3\u000fd'`T*%\u0018\u0010qO(3\u000fH(hT!35o6`C\tqS4%\u0006~*d\u0015\u0005pO%$\u0019\nmS*%\u0019H<s[=\u000ebU6%Er7qe()\u0004r7\u0005mS*%\u00196VU6,\u000e$\u0000!J-0\u000f{-o_7`\u0018r%eCdh\u001bb%eId-\u0005s!!A9lJ{-o_7`\u0007x d\u001a?=C\u000bqO(3\u000fH5t[ 3";
                var4_3 = "bU6%Eg+rS0)\u0005y\u001bbU(/\u0018\fqO(3\u000fd'`T*%\u0018\u000bqO(3\u000fH(hT!3\fqO(3\u000fd'`T*%\u0018\u0010qO(3\u000fH(hT!35o6`C\tqS4%\u0006~*d\u0015\u0005pO%$\u0019\nmS*%\u0019H<s[=\u000ebU6%Er7qe()\u0004r7\u0005mS*%\u00196VU6,\u000e$\u0000!J-0\u000f{-o_7`\u0018r%eCdh\u001bb%eId-\u0005s!!A9lJ{-o_7`\u0007x d\u001a?=C\u000bqO(3\u000fH5t[ 3".length();
                var1_4 = 19;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 61;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
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
                    var2_2 = "\u0014+A@},X\u0017?Y\u0010\u0015+LWk,Q\u0010?DWQ\u000bR\u0004'";
                    var4_3 = "\u0014+A@},X\u0017?Y\u0010\u0015+LWk,Q\u0010?DWQ\u000bR\u0004'".length();
                    var1_4 = 10;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 89;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
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
                    break block19;
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
                        v11 = 60;
                        break;
                    }
                    case 1: {
                        v11 = 7;
                        break;
                    }
                    case 2: {
                        v11 = 121;
                        break;
                    }
                    case 3: {
                        v11 = 125;
                        break;
                    }
                    case 4: {
                        v11 = 87;
                        break;
                    }
                    case 5: {
                        v11 = 42;
                        break;
                    }
                    default: {
                        v11 = 121;
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
        k.f = var5;
    }
}

