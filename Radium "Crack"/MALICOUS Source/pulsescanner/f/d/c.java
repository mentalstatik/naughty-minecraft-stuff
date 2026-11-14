/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.d;

import java.util.List;
import java.util.Locale;
import pulsescanner.f.k;

public class c
extends k {
    public final pulsescanner.i.c F;
    public final pulsescanner.i.c G;
    public final pulsescanner.i.c H;
    private static final String[] I;

    public c() {
        String[] stringArray = I;
        super(stringArray[3], stringArray[24], 0, 0, 4.0f, 116.0f);
        this.F = this.a(new pulsescanner.i.c(stringArray[11], stringArray[13], false));
        this.G = this.a(new pulsescanner.i.c(stringArray[15], stringArray[8], true));
        this.H = this.a(new pulsescanner.i.c(stringArray[14], stringArray[23], true));
    }

    private String a(double d2, double d3, double d4) {
        try {
            if (((Boolean)this.F.a()).booleanValue()) {
                return String.format(Locale.ROOT, I[18], d2, d3, d4);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.c.a(matchException);
        }
        String[] stringArray = I;
        return (int)Math.floor(d2) + stringArray[7] + (int)Math.floor(d3) + stringArray[16] + (int)Math.floor(d4);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected List<String[]> w() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 16[SWITCH]
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[27];
                var3_1 = 0;
                var2_2 = "\r8\u0003uz2\u0005-2\u0005iw\u0002h\u0007\u000b\u00002\u0018o{)T\")\u0012n\u0003\u001b\u0004-\u0002n\u0005\t,+\u0012oh/H/9\u0002o}$\u00021\u0004r?3R,*Wiw%\u001a 2\u0019kz2N&9W~p/H'4\u0019|k%Im\u0002n\u0007\u000502\u0002iw\b\u00078\u0014tr!V0\u0006\u0005<\u0014tq'\u0017\u00105\u0018j?/T&}\u0013x|)W\"1Wms!Y&s\t\u00074\u0005x|4S,3\u0010\r8\u0003uz2\u0015\f+\u0012oh/H/9\u0002o}\u0002cu\u0010fsF{3`\u001fml\u00111?e\u0014r;\t\f+\u0012oh/H/9\u0007sqW-3`\n\u0003\u001b\u0004-\u0002h\u0005!\u00105\u0018j?4R&}\u0013tm%Y74\u0018s?9U6z\u0005x?&[ 4\u0019z1\u001b\u001a2\u0002o?0U04\u0003tp.\u001a*3Wiw%\u001a42\u0005q{n";
                var4_3 = "\r8\u0003uz2\u0005-2\u0005iw\u0002h\u0007\u000b\u00002\u0018o{)T\")\u0012n\u0003\u001b\u0004-\u0002n\u0005\t,+\u0012oh/H/9\u0002o}$\u00021\u0004r?3R,*Wiw%\u001a 2\u0019kz2N&9W~p/H'4\u0019|k%Im\u0002n\u0007\u000502\u0002iw\b\u00078\u0014tr!V0\u0006\u0005<\u0014tq'\u0017\u00105\u0018j?/T&}\u0013x|)W\"1Wms!Y&s\t\u00074\u0005x|4S,3\u0010\r8\u0003uz2\u0015\f+\u0012oh/H/9\u0002o}\u0002cu\u0010fsF{3`\u001fml\u00111?e\u0014r;\t\f+\u0012oh/H/9\u0007sqW-3`\n\u0003\u001b\u0004-\u0002h\u0005!\u00105\u0018j?4R&}\u0013tm%Y74\u0018s?9U6z\u0005x?&[ 4\u0019z1\u001b\u001a2\u0002o?0U04\u0003tp.\u001a*3Wiw%\u001a42\u0005q{n".length();
                var1_4 = 6;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 77;
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
                    var2_2 = "*&\u001aw\n)+\f\\o;P5&\u001b";
                    var4_3 = "*&\u001aw\n)+\f\\o;P5&\u001b".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 83;
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
                        v11 = 14;
                        break;
                    }
                    case 1: {
                        v11 = 16;
                        break;
                    }
                    case 2: {
                        v11 = 58;
                        break;
                    }
                    case 3: {
                        v11 = 80;
                        break;
                    }
                    case 4: {
                        v11 = 82;
                        break;
                    }
                    case 5: {
                        v11 = 13;
                        break;
                    }
                    default: {
                        v11 = 119;
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
        pulsescanner.f.d.c.I = var5;
    }
}

