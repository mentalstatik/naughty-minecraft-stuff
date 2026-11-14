/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 */
package pulsescanner.d;

import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import pulsescanner.i.f;

public final class a {
    private static final String[] a;

    private a() {
    }

    public static f a(String string, String string2) {
        String[] stringArray = a;
        return new f(stringArray[10], string, string2, stringArray[0], stringArray[11], stringArray[16], stringArray[3], stringArray[31], stringArray[5], stringArray[4], stringArray[12], stringArray[27], stringArray[20], stringArray[13], stringArray[6], stringArray[32], stringArray[19], stringArray[15], stringArray[21], stringArray[26]);
    }

    /*
     * Exception decompiling
     */
    private static class_3414 a(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 34[SWITCH]
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

    /*
     * Exception decompiling
     */
    private static float b(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public static void a(String string, double d2) {
        class_3414 class_34142;
        class_310 class_3102;
        block10: {
            class_3102 = class_310.method_1551();
            class_34142 = pulsescanner.d.a.a(string);
            try {
                block9: {
                    try {
                        try {
                            if (class_34142 == null || d2 <= 0.0) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.d.a.a(matchException);
                        }
                        if (class_3102.method_1483() != null) break block10;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.a.a(matchException);
                    }
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.a.a(matchException);
            }
        }
        double d3 = d2 / 100.0;
        int n2 = (int)Math.max(1.0, Math.ceil(d3));
        float f2 = (float)Math.min(1.0, d3 / (double)n2);
        try {
            for (int i2 = 0; i2 < n2; ++i2) {
                class_3102.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)class_34142, (float)pulsescanner.d.a.b(string), (float)f2));
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.a.a(matchException);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[34];
                var3_1 = 0;
                var2_2 = "x\\ANq\u0007~ZKKuN}\u0004yQDO\u0003y]\\\u0003tFJ\u0004sUZS\by]O\u0003VEeW\u0003y]\\\u0005kXAMs\by]O\u0003VEeW\u0005h[]Mp\u0005kXAMs\bwQ^Fx\u0000\\K\u0005o[\\Fy\u0006zZKK{R\u0005zZ^Jx\u0004yQDO\tx\\IOxEg\\Q\u0005o[\\Fy\u0006zZKK{R\u0006yQI@{N\nh[FJw\u0000KT[E\tcMDLdHfUQ\u0003tFJ\u0006yQI@{N\u0004sUZS\u0004u[FF\tx\\IOxEg\\Q\u0005zZ^Jx\nh[FJw\u0000KT[E\u0005x\\ANq\tcMDLdHfUQ";
                var4_3 = "x\\ANq\u0007~ZKKuN}\u0004yQDO\u0003y]\\\u0003tFJ\u0004sUZS\by]O\u0003VEeW\u0003y]\\\u0005kXAMs\by]O\u0003VEeW\u0005h[]Mp\u0005kXAMs\bwQ^Fx\u0000\\K\u0005o[\\Fy\u0006zZKK{R\u0005zZ^Jx\u0004yQDO\tx\\IOxEg\\Q\u0005o[\\Fy\u0006zZKK{R\u0006yQI@{N\nh[FJw\u0000KT[E\tcMDLdHfUQ\u0003tFJ\u0006yQI@{N\u0004sUZS\u0004u[FF\tx\\IOxEg\\Q\u0005zZ^Jx\nh[FJw\u0000KT[E\u0005x\\ANq\tcMDLdHfUQ".length();
                var1_4 = 5;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 7;
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
                    var2_2 = ")\r\u001c\u001c\"\u0019*\b \u0006\t\u0011/W\u000b\u001c";
                    var4_3 = ")\r\u001c\u001c\"\u0019*\b \u0006\t\u0011/W\u000b\u001c".length();
                    var1_4 = 7;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 80;
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
                        v11 = 51;
                        break;
                    }
                    case 2: {
                        v11 = 47;
                        break;
                    }
                    case 3: {
                        v11 = 36;
                        break;
                    }
                    case 4: {
                        v11 = 19;
                        break;
                    }
                    case 5: {
                        v11 = 39;
                        break;
                    }
                    default: {
                        v11 = 14;
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
        pulsescanner.d.a.a = var5;
    }
}

