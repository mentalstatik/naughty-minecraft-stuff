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
import pulsescanner.g.b;
import pulsescanner.i.c;
import pulsescanner.i.d;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class e
extends i {
    public final f l;
    public final d m;
    public final g n;
    public final g o;
    public final g p;
    public final c q;
    public final c r;
    public final c s;
    public final d t;
    public final c u;
    private float v;
    private static final String[] w;

    public e() {
        String[] stringArray = w;
        super(stringArray[6], stringArray[21], pulsescanner.f.h.RENDER);
        this.l = this.a(new f(stringArray[35], stringArray[18], stringArray[7], stringArray[7], stringArray[38], stringArray[27], stringArray[33], stringArray[0], stringArray[5], stringArray[22], stringArray[8], stringArray[36], stringArray[3]));
        this.m = this.a(new d(stringArray[9], stringArray[17], -1));
        this.n = this.a(new g(stringArray[14], stringArray[2], 4.0, 1.0, 12.0, 0.5));
        this.o = this.a(new g(stringArray[10], stringArray[15], 2.0, 0.0, 8.0, 0.5));
        this.p = this.a(new g(stringArray[1], stringArray[34], 1.0, 0.5, 4.0, 0.25));
        this.q = this.a(new c(stringArray[29], stringArray[4], true));
        this.r = this.a(new c(stringArray[19], stringArray[20], false));
        this.s = this.a(new c(stringArray[23], stringArray[28], false));
        this.t = (d)this.a(new d(stringArray[13], stringArray[31], -167810711)).a(this.s::a);
        this.u = this.a(new c(stringArray[25], stringArray[30], false));
    }

    /*
     * Exception decompiling
     */
    public void a(class_332 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    private static void a(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    private static void a(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, int n2, boolean bl) {
        float f8 = f6 / 2.0f;
        try {
            pulsescanner.g.b.a(class_3322, f2 - f4 - f5 - f7, f3 - f8 - f7, f5 + f7 * 2.0f, f6 + f7 * 2.0f, n2);
            pulsescanner.g.b.a(class_3322, f2 + f4 - f7, f3 - f8 - f7, f5 + f7 * 2.0f, f6 + f7 * 2.0f, n2);
            if (bl) {
                pulsescanner.g.b.a(class_3322, f2 - f8 - f7, f3 - f4 - f5 - f7, f6 + f7 * 2.0f, f5 + f7 * 2.0f, n2);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.e.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, f2 - f8 - f7, f3 + f4 - f7, f6 + f7 * 2.0f, f5 + f7 * 2.0f, n2);
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
                var5 = new String[40];
                var3_1 = 0;
                var2_2 = "2a+\u0005t'gZ(\u001d\tl\t%`0\u0005s,\"\u0002{\u000b0z4Ft')\u0016|1H\t7g,\u00148\u0006(\u0005{\u001a5i+\r8-2\u0005d0\b}b!\u001ezy\u0005w,3\u0003i*\u00126\u0007%%\n\u000ey2\"\u00102}*\u0012w/g2z6\u0015k*&\u0018z\u00052z6\u0015k\u00075a8\u000bw,#\u00052g5\tj\u00036i)\u00072`<\u0010j-)\u00075a8\u000bw,#\u0012%i+\u0001}6g2g5\tjb\u0011\u0010d,\u0003\u0004\"a#\u0003\u0018\"x8\u0005}b&\u0003g,\b|b3\u0019my\u0005},3\u0014zw\u00062a+\u0005t'\u00102z6\u0015k*&\u0018zy\u0005w.(\u0003&\u00102z6\u0015k*&\u0018zy\u0015p#7\u0014&\u00075q7\u0007u+$\u00186i)Fo+#\u0014f*Fo*.\u001dmy\u000bw4.\u001fow6#m)\ny!\"Q|1\u000384&\u001fa5\nyb$\u0003g*\u0015p#.\u0003(.\u000fl*g\u0010(:\tv$.\u0016}+\u0007z.\"Qg7\u00036\b3z8\u0005s'3\u0002\f%i+\u0001}6g2g5\tj\t7g,\u00148\u0006(\u0005{\u0005!}5\u0015}\u00052z6\u0015k\u00035g-32`8\b\u007f'4Qk6\nw0g\u0006`<\b86/\u0014(:\u0014w14\u0019i0\u00148+4Qg/\u0003jb&\u001f(<\bl+3\b&\u0007>}-\nq,\"\u00190l=\u00158#g\u0002};\u0012t'g\u0002a#\u0003822\u001d{<H*2z6\u0015k*&\u0018zy\u0005w.(\u0003(.\u000eq.\"Qi0\u000bq, Qi-Fy,g\u0014f-\u000fl;i\u00035g-\u00062a+\u0005t'\u000f=a7\u000386/\u0018k2\b}14_\u0005\"| \n}\u00072`<\u0010j-)\b3z8\u0005s'3\u0002";
                var4_3 = "2a+\u0005t'gZ(\u001d\tl\t%`0\u0005s,\"\u0002{\u000b0z4Ft')\u0016|1H\t7g,\u00148\u0006(\u0005{\u001a5i+\r8-2\u0005d0\b}b!\u001ezy\u0005w,3\u0003i*\u00126\u0007%%\n\u000ey2\"\u00102}*\u0012w/g2z6\u0015k*&\u0018z\u00052z6\u0015k\u00075a8\u000bw,#\u00052g5\tj\u00036i)\u00072`<\u0010j-)\u00075a8\u000bw,#\u0012%i+\u0001}6g2g5\tjb\u0011\u0010d,\u0003\u0004\"a#\u0003\u0018\"x8\u0005}b&\u0003g,\b|b3\u0019my\u0005},3\u0014zw\u00062a+\u0005t'\u00102z6\u0015k*&\u0018zy\u0005w.(\u0003&\u00102z6\u0015k*&\u0018zy\u0015p#7\u0014&\u00075q7\u0007u+$\u00186i)Fo+#\u0014f*Fo*.\u001dmy\u000bw4.\u001fow6#m)\ny!\"Q|1\u000384&\u001fa5\nyb$\u0003g*\u0015p#.\u0003(.\u000fl*g\u0010(:\tv$.\u0016}+\u0007z.\"Qg7\u00036\b3z8\u0005s'3\u0002\f%i+\u0001}6g2g5\tj\t7g,\u00148\u0006(\u0005{\u0005!}5\u0015}\u00052z6\u0015k\u00035g-32`8\b\u007f'4Qk6\nw0g\u0006`<\b86/\u0014(:\u0014w14\u0019i0\u00148+4Qg/\u0003jb&\u001f(<\bl+3\b&\u0007>}-\nq,\"\u00190l=\u00158#g\u0002};\u0012t'g\u0002a#\u0003822\u001d{<H*2z6\u0015k*&\u0018zy\u0005w.(\u0003(.\u000eq.\"Qi0\u000bq, Qi-Fy,g\u0014f-\u000fl;i\u00035g-\u00062a+\u0005t'\u000f=a7\u000386/\u0018k2\b}14_\u0005\"| \n}\u00072`<\u0010j-)\b3z8\u0005s'3\u0002".length();
                var1_4 = 12;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 73;
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
                    var2_2 = "/g+\bv\u007fqLQ+\u000f\u000788\u0017\u0013d/?";
                    var4_3 = "/g+\bv\u007fqLQ+\u000f\u000788\u0017\u0013d/?".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 84;
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
                        v11 = 56;
                        break;
                    }
                    case 1: {
                        v11 = 65;
                        break;
                    }
                    case 2: {
                        v11 = 16;
                        break;
                    }
                    case 3: {
                        v11 = 47;
                        break;
                    }
                    case 4: {
                        v11 = 81;
                        break;
                    }
                    case 5: {
                        v11 = 11;
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
        pulsescanner.f.f.e.w = var5;
    }
}

