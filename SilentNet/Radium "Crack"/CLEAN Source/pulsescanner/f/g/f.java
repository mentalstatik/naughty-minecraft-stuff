/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.g;

import pulsescanner.f.g.a;
import pulsescanner.f.h;
import pulsescanner.f.i;

public class f
extends i {
    private a l;
    private static final String[] m;

    public f() {
        String[] stringArray = m;
        super(stringArray[2], stringArray[0], pulsescanner.f.h.WORLD);
        this.l = pulsescanner.f.g.a.UNKNOWN;
    }

    @Override
    protected void g() {
        this.l = this.o();
    }

    @Override
    protected void h() {
        this.l = pulsescanner.f.g.a.UNKNOWN;
    }

    @Override
    public void k() {
        this.l = pulsescanner.f.g.a.UNKNOWN;
    }

    @Override
    public void l() {
        this.l = pulsescanner.f.g.a.UNKNOWN;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[TRYBLOCK]], but top level block is 11[SWITCH]
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

    private a o() {
        a a2;
        try {
            if (pulsescanner.f.g.f.a.field_1687 == null) {
                return pulsescanner.f.g.a.UNKNOWN;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.f.a(matchException);
        }
        try {
            if (!pulsescanner.f.g.f.a.field_1687.method_63020()) {
                return pulsescanner.f.g.a.CLEAR;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.f.a(matchException);
        }
        float f2 = pulsescanner.f.g.f.a.field_1687.field_9235;
        try {
            if (pulsescanner.f.g.f.a.field_1687.field_9234 * f2 > 0.9f) {
                return pulsescanner.f.g.a.THUNDERSTORM;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.f.a(matchException);
        }
        try {
            a2 = f2 > 0.2f ? pulsescanner.f.g.a.RAIN : pulsescanner.f.g.a.CLEAR;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.f.a(matchException);
        }
        return a2;
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
                var5 = new String[5];
                var3_1 = 0;
                var2_2 = "!\u0019L\u0019&U#\u001a\t\u0000\u0002=\u00104U\bH\u0010u\u0002?\u0014\bH\u0010'U9\u001d\u001dN\u00120\u0006t\u00106\u0014A\u001b2\u0010>U\bOU\u0016\u0019?\u0014\u000e\r\"\u0019A\u0001=\u0010(U=L\u0010'\u0001";
                var4_3 = "!\u0019L\u0019&U#\u001a\t\u0000\u0002=\u00104U\bH\u0010u\u0002?\u0014\bH\u0010'U9\u001d\u001dN\u00120\u0006t\u00106\u0014A\u001b2\u0010>U\bOU\u0016\u0019?\u0014\u000e\r\"\u0019A\u0001=\u0010(U=L\u0010'\u0001".length();
                var1_4 = 35;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 9;
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
                    var2_2 = "<\u001eK\u00118\u001a4_\u0002E_\u000b\u0017%\u0011\u0012O\r,\u000b?\r\u001b\u000f<\u001eK\u00118\u001a4_\u0002E_\r\u001e9\u0011";
                    var4_3 = "<\u001eK\u00118\u001a4_\u0002E_\u000b\u0017%\u0011\u0012O\r,\u000b?\r\u001b\u000f<\u001eK\u00118\u001a4_\u0002E_\r\u001e9\u0011".length();
                    var1_4 = 23;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 3;
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
                        v11 = 124;
                        break;
                    }
                    case 1: {
                        v11 = 117;
                        break;
                    }
                    case 2: {
                        v11 = 41;
                        break;
                    }
                    case 3: {
                        v11 = 124;
                        break;
                    }
                    case 4: {
                        v11 = 92;
                        break;
                    }
                    case 5: {
                        v11 = 124;
                        break;
                    }
                    default: {
                        v11 = 83;
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
        pulsescanner.f.g.f.m = var5;
    }
}

