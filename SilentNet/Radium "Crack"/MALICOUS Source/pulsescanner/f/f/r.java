/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.f.f;

import net.minecraft.class_332;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.d;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class r
extends i {
    public final f l;
    public final g m;
    public final d n;
    private static final String[] o;

    public r() {
        String[] stringArray = o;
        super(stringArray[13], stringArray[12], pulsescanner.f.h.RENDER);
        this.l = this.a(new f(stringArray[6], stringArray[16], stringArray[4], stringArray[14], stringArray[5], stringArray[10], stringArray[1], stringArray[15]));
        this.m = this.a(new g(stringArray[2], stringArray[3], 0.22, 0.03, 0.5, 0.01));
        this.n = this.a(new d(stringArray[7], stringArray[9], -1274541552));
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(class_332 var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 13[SWITCH]
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
                var5 = new String[17];
                var3_1 = 0;
                var2_2 = "qc\u0010\u0018M,s]~\u0015\noa\u0007\u001dD,vNe\u0002\box\u0014\u0014FkET\u0019je\u0015\u0018Je]Ux\u001fQGj\u0011Hd\u0003QNe]Hi\u0014_\nxm\u0014\u001a\bIU[i\u0015\nqc\u0010\u0018M,s]~\u0015\u0006ze\n\u0005M~\u0005\u007fc\n\u001eZ\noa\u0007\u001dD,vNe\u0002\u0018he\b\u0005\byBYhF\u0013Q,ETiF\u0017A`EY~H\too\u0007\u001fDe_Y\u007f\too\u0007\u001fDe_Y\u007f+}h\u0002\u0002\bm\u0011_e\b\u0014EmEUoF\u001dIuTN,\u0012\u001e\bxYY,\u000f\u001f\u0005kPQiF\u0007AiF\u0012\roo\u0014\u0014Mb\u0011ze\n\u0005M~\nxm\u0014\u001a\bIU[i\u0015";
                var4_3 = "qc\u0010\u0018M,s]~\u0015\noa\u0007\u001dD,vNe\u0002\box\u0014\u0014FkET\u0019je\u0015\u0018Je]Ux\u001fQGj\u0011Hd\u0003QNe]Hi\u0014_\nxm\u0014\u001a\bIU[i\u0015\nqc\u0010\u0018M,s]~\u0015\u0006ze\n\u0005M~\u0005\u007fc\n\u001eZ\noa\u0007\u001dD,vNe\u0002\u0018he\b\u0005\byBYhF\u0013Q,ETiF\u0017A`EY~H\too\u0007\u001fDe_Y\u007f\too\u0007\u001fDe_Y\u007f+}h\u0002\u0002\bm\u0011_e\b\u0014EmEUoF\u001dIuTN,\u0012\u001e\bxYY,\u000f\u001f\u0005kPQiF\u0007AiF\u0012\roo\u0014\u0014Mb\u0011ze\n\u0005M~\nxm\u0014\u001a\bIU[i\u0015".length();
                var1_4 = 10;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 115;
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
                    var2_2 = "FK&+!]T--jCf2F:>qL?}T--&Vww\u0002/>kG?dK-((";
                    var4_3 = "FK&+!]T--jCf2F:>qL?}T--&Vww\u0002/>kG?dK-((".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 93;
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
                        v11 = 79;
                        break;
                    }
                    case 1: {
                        v11 = 127;
                        break;
                    }
                    case 2: {
                        v11 = 21;
                        break;
                    }
                    case 3: {
                        v11 = 2;
                        break;
                    }
                    case 4: {
                        v11 = 91;
                        break;
                    }
                    case 5: {
                        v11 = 127;
                        break;
                    }
                    default: {
                        v11 = 66;
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
        r.o = var5;
    }
}

