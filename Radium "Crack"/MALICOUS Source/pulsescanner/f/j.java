/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.f;

import net.minecraft.class_332;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.g;

public abstract class j
extends i {
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public final g o;
    public int p;
    public int q;
    public float r;
    public float s;
    private final int t;
    private final int u;
    private final float v;
    private final float w;
    public float y;
    public float z;
    public float A;
    public float B;
    private static final String[] S;

    protected j(String string, String string2, int n2, int n3, float f2, float f3) {
        super(string, string2, pulsescanner.f.h.RENDER);
        String[] stringArray = S;
        this.o = this.a(new g(stringArray[0], stringArray[1], 1.0, 0.5, 2.5, 0.05, "x"));
        this.p = this.t = n2;
        this.q = this.u = n3;
        this.r = this.v = f2;
        this.s = this.w = f3;
    }

    public void o() {
        this.p = this.t;
        this.q = this.u;
        this.r = this.v;
        this.s = this.w;
    }

    public boolean p() {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (this.p != this.t || this.q != this.u) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.j.d(matchException);
                            }
                            if (this.r != this.v) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.j.d(matchException);
                        }
                        if (this.s != this.w) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.j.d(matchException);
                    }
                    bl = true;
                    break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.j.d(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean q() {
        return false;
    }

    public abstract void r();

    public abstract void b(class_332 var1, float var2);

    /*
     * Exception decompiling
     */
    private static float a(int var0, float var1_1, float var2_2, int var3_3) {
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

    public float s() {
        return this.o.g();
    }

    public float t() {
        return this.A * this.s();
    }

    public float u() {
        return this.B * this.s();
    }

    public void a(int n2, int n3) {
        this.r();
        float f2 = this.t();
        float f3 = this.u();
        this.y = Math.round(Math.max(0.0f, Math.min((float)n2 - f2, pulsescanner.f.j.a(this.p, this.r, f2, n2))));
        this.z = Math.round(Math.max(0.0f, Math.min((float)n3 - f3, pulsescanner.f.j.a(this.q, this.s, f3, n3))));
    }

    /*
     * Exception decompiling
     */
    public void a(float var1_1, float var2_2, int var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 9[SWITCH]
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

    public boolean v() {
        boolean bl;
        try {
            bl = this.p == 2;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.j.d(matchException);
        }
        return bl;
    }

    public boolean a(double d2, double d3) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d2 >= (double)this.y) || !(d2 <= (double)(this.y + this.t()))) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.j.d(matchException);
                            }
                            if (!(d3 >= (double)this.z)) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.j.d(matchException);
                        }
                        if (!(d3 <= (double)(this.z + this.u()))) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.j.d(matchException);
                    }
                    bl = true;
                    break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.j.d(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static MatchException d(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "[JF\u001cl\u0019[@]\u0015):y(]O\u0019zuW]m\u0007\u0015e0rmGS^";
            var4_3 = "[JF\u001cl\u0019[@]\u0015):y(]O\u0019zuW]m\u0007\u0015e0rmGS^".length();
            var1_4 = 5;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = 81;
            v0 = v2;
            v4 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl53
            do {
                v3 = v3;
                v0 = v0;
                v5 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 89;
                        break;
                    }
                    case 1: {
                        v6 = 120;
                        break;
                    }
                    case 2: {
                        v6 = 118;
                        break;
                    }
                    case 3: {
                        v6 = 33;
                        break;
                    }
                    case 4: {
                        v6 = 88;
                        break;
                    }
                    case 5: {
                        v6 = 4;
                        break;
                    }
                    default: {
                        v6 = 78;
                    }
                }
                v0[v5] = (char)(v0[v5] ^ (v3 ^ v6));
                ++var6_6;
lbl53:
                // 2 sources

                v4 = v4;
            } while (v4 > var6_6);
            ** while (true)
        }
        pulsescanner.f.j.S = var5;
    }
}

