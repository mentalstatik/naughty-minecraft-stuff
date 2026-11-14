/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2394
 *  net.minecraft.class_243
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 */
package pulsescanner.f.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_2394;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import pulsescanner.f.f.l;
import pulsescanner.f.f.y;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.g.k;
import pulsescanner.i.c;
import pulsescanner.i.d;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class b
extends i {
    public final f l;
    public final f m;
    public final f n;
    public final c o;
    public final f p;
    public final d q;
    public final d r;
    public final g s;
    public final g t;
    public final g u;
    public final g v;
    public final g w;
    public final g x;
    public final g y;
    public final c z;
    private final List<y> A;
    private int B;
    private static final String[] C;

    public b() {
        String[] stringArray = C;
        super(stringArray[94], stringArray[15], pulsescanner.f.h.RENDER);
        this.l = this.a(new f(stringArray[64], stringArray[98], stringArray[38], stringArray[81], stringArray[114], stringArray[68], stringArray[103], stringArray[33], stringArray[117], stringArray[86], stringArray[29], stringArray[112], stringArray[49], stringArray[91], stringArray[87], stringArray[35], stringArray[19], stringArray[41], stringArray[77], stringArray[45], stringArray[42], stringArray[99], stringArray[0], stringArray[111], stringArray[48], stringArray[22], stringArray[8], stringArray[71], stringArray[24]));
        this.m = this.a(new f(stringArray[39], stringArray[92], stringArray[14], stringArray[1], stringArray[93], stringArray[61], stringArray[82], stringArray[90], stringArray[16], stringArray[44], stringArray[27], stringArray[73]));
        this.n = this.a(new f(stringArray[30], stringArray[67], stringArray[10], stringArray[53], stringArray[23], stringArray[54], stringArray[63], stringArray[2]));
        this.o = this.a(new c(stringArray[51], stringArray[76], true));
        this.p = this.a(new f(stringArray[5], stringArray[60], stringArray[101], stringArray[85], stringArray[106], stringArray[28], stringArray[46]));
        this.q = (d)this.a(new d(stringArray[37], stringArray[78], -3289641)).a(this::lambda$new$0);
        this.r = (d)this.a(new d(stringArray[102], stringArray[3], -6864129)).a(this::lambda$new$1);
        this.s = this.a(new g(stringArray[69], stringArray[31], 8.0, 1.0, 20.0, 1.0));
        this.t = this.a(new g(stringArray[32], stringArray[18], 2.0, 1.0, 20.0, 1.0));
        this.u = this.a(new g(stringArray[100], stringArray[17], 5.0, 0.5, 15.0, 0.5));
        this.v = this.a(new g(stringArray[107], stringArray[83], 2.5, 0.0, 8.0, 0.1));
        this.w = this.a(new g(stringArray[47], stringArray[56], 4.0, 0.5, 10.0, 0.5));
        this.x = this.a(new g(stringArray[109], stringArray[55], 0.025, 0.0, 0.1, 0.005));
        this.y = this.a(new g(stringArray[13], stringArray[40], 0.8, 0.1, 2.0, 0.05));
        this.z = this.a(new c(stringArray[108], stringArray[4], false));
        this.A = new ArrayList<y>();
    }

    @Override
    protected void h() {
        this.A.clear();
    }

    @Override
    public void k() {
        this.A.clear();
    }

    @Override
    public boolean a(class_2394 class_23942) {
        return (Boolean)this.z.a();
    }

    @Override
    public void i() {
        try {
            if (!this.m()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.b.a(matchException);
        }
        Iterator<y> iterator = this.A.iterator();
        while (iterator.hasNext()) {
            y y2 = iterator.next();
            try {
                if (++y2.h >= y2.k) {
                    iterator.remove();
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.b.a(matchException);
            }
            y2.a += y2.d;
            y2.b += y2.e;
            y2.c += y2.f;
            y2.d *= 0.992;
            y2.e *= 0.992;
            y2.f *= 0.992;
        }
        try {
            if (++this.B >= this.t.h()) {
                this.B = 0;
                this.o();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.b.a(matchException);
        }
    }

    /*
     * Exception decompiling
     */
    private void o() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 30[SWITCH]
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
    private int a(int var1_1, ThreadLocalRandom var2_2) {
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

    /*
     * Exception decompiling
     */
    private int[] p() {
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

    /*
     * Exception decompiling
     */
    private int q() {
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

    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        block9: {
            try {
                try {
                    if (pulsescanner.f.f.b.a.field_1724 != null && !this.A.isEmpty()) break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.b.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.b.a(matchException);
            }
        }
        class_243 class_2432 = class_41842.method_71156();
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_4588 class_45882 = k.b(true);
        class_4588 class_45883 = k.a(true);
        float f3 = k.a(1.0f);
        double d2 = pulsescanner.f.f.b.a.field_1724.method_23317();
        double d3 = pulsescanner.f.f.b.a.field_1724.method_23321();
        for (y y2 : this.A) {
            float f4;
            double d4 = 1.0 - (double)y2.h / (double)y2.k;
            double d5 = Math.min(1.0, Math.min(d4 * 4.0, (double)(y2.h + 1) / 5.0));
            double d6 = y2.g * (0.88 + Math.sin((double)(y2.h + y2.k) * 0.24) * 0.12);
            double d7 = y2.a - d2;
            double d8 = y2.c - d3;
            double d9 = Math.max(0.001, Math.hypot(d7, d8));
            double d10 = d8 / d9;
            double d11 = -d7 / d9;
            int n2 = pulsescanner.g.b.a(y2.i, (int)((double)(y2.i >>> 24 & 0xFF) * d5));
            int n3 = n2 >>> 24 & 0xFF;
            float f5 = (float)(y2.a - class_2432.field_1352);
            float f6 = (float)(y2.b - class_2432.field_1351);
            float f7 = (float)(y2.c - class_2432.field_1350);
            pulsescanner.f.f.l.a(class_46652, class_45882, f5, f6, f7, d10, d11, d6 * 1.9, pulsescanner.g.b.a(n2, Math.max(1, n3 / 6)));
            pulsescanner.f.f.l.a(class_46652, class_45882, f5, f6, f7, d10, d11, d6, n2);
            if (y2.j == 1) {
                int n4 = pulsescanner.g.b.a(n2, Math.max(1, n3 * 3 / 4));
                f4 = (float)(d6 * 1.5);
                k.a(class_46652, class_45883, f5 - (float)d10 * f4, f6, f7 - (float)d11 * f4, f5 + (float)d10 * f4, f6, f7 + (float)d11 * f4, n4, f3);
                k.a(class_46652, class_45883, f5, f6 - f4, f7, f5, f6 + f4, f7, n4, f3);
                continue;
            }
            try {
                if (y2.j == 2) {
                    pulsescanner.f.f.l.a(class_46652, class_45882, f5, f6, f7, -d11, d10, d6 * 0.72, pulsescanner.g.b.a(255, 255, 255, n3 / 2));
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.b.a(matchException);
            }
            if (y2.j != 3) continue;
            float f8 = (float)d6;
            f4 = (float)(d6 * 0.3);
            k.a(class_46652, class_45882, f5 - f8, f6, f7 - f4, f5 + f8, f7 + f4, n2);
        }
    }

    private boolean lambda$new$1() {
        return this.p.a(C[65]);
    }

    private boolean lambda$new$0() {
        boolean bl;
        try {
            bl = !this.p.a(C[96]);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.b.a(matchException);
        }
        return bl;
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
                var5 = new String[118];
                var3_1 = 0;
                var2_2 = "~hYB\n\u0005nuDA\u0013\tyoBR\u000b|\nXt'ybNH\t|OIhAH\u00158\u001aYbI\u0007\u0005aO^oH\u0007\u0000j\u000eNnHI\u00138\u0002EcH\t.bnIB\u00148\u0001Eu@F\u000b8\u0018EuACGh\u000eXsDD\u000b}\u001c\npEN\u000b}O^oDTGq\u001c\nhC\t\nihAH\u00158\"EcH\u0004lfAK\u0006bbLU\u0013k\u0006ikBR\u0003k\u0006nuL@\bv\u0004kr_F\tln_B\u0001t\u0006Ot\u0005yhXK\u0014\u0004ynWB\u0005nuDA\u00138ywLP\tkOK'NK\u000e}\u0001^*BI\u000baOIr^S\bu\u0006PfOK\u00028\u000e^jBT\u0017p\nXb\rF\u0015w\u001aDc\r^\bmA\u0005hr_T\u0013-bh_N\u001dw\u0001^fA\u0007\u0017y\u001d^nNK\u00028\u001cZuHF\u00038\u000eXhXI\u00038\u001bBb\rW\u000by\u0016Ou\u0003\u001e~nNL\u00148\rOsZB\u0002vOZf_S\u000e{\u0003O'OR\u0015k\u001bY)\u0004|hDC\u0005ydXK\f\u0006ikBR\u0003k\u0006mhAC\u0002v\u0005~uLN\u000b\u0004ejHI\u0006zh_S\u0006t\u0004ejHI\u0006ciZF\u0015|\fir^S\buOihAH\u0015\u0006zh_S\u0006t\u0006ffTH\u0012l\u001czf_S\u000e{\u0003Ot\rT\u0017y\u0018DbI\u0007\u0017}\u001d\neXU\u0014lA\bciYB\u0015n\u000eF\u0004yiBP\u000bmuBR\t|OxnC@\u0005gfJN\u0004\u0004yiBP\u000ezf_S\u000e{\u0003O'nH\u000bw\u001d\u0007xfIN\u0006v\u001b\u0006ghYN\bv\u0016ynWBGw\t\nsEBGh\u000eXsDD\u000b}\u001c\u0004\u0006ojOB\u0015k\u0007iuDJ\u0014w\u0001\u0005gfJN\u0004\u0005bbAN\u001f\u0006ih]W\u0002j\bmuLC\u000e}\u0001^\u0006bbD@\u000fl\u0005ydXK\f\u0005yhXK\u0014\u0005edHF\t\u0011gh[B\n}\u0001^'\u007fB\u0006{\u001bCqH\u0003ktE\u0004kr_F\u000bmuBR\t|OxnC@ gh[B\n}\u0001^'^W\u0002}\u000b\nhK\u0007\u0013p\n\nwLU\u0013q\fFb^\t+|b_S\u000e{\u000eF']F\u0015l\u0006IkH\u0007\u0014h\u001dOfI\u0007\u0006j\u0000_iI\u0007\u0013p\n\nwAF\u001e}\u001d\u0004\boiI\u00075w\u000bY\u0007iuDJ\u0014w\u0001\u0006mhAC\u0002vkabHW\u00148\u001bBb\rT\u0013a\u0003O ^\u0007\u0004w\u0003Eu^\u000bGy\u000bNt\r^\bm\u001d\ndBK\bjOKt\rFG\u007f\u0003Ep\u0001\u0007\u0015}\u001fFfNB\u00148\u001bBb@\u0007\u0010q\u001bB'TH\u0012jOIhAH\u00154OEu\rF\tq\u0002KsHTGyOMuLC\u000e}\u0001^)\u0004lfAK\u0005~hYB\n\u0004bfAH\u0005ysTK\u0002\bmuLC\u000e}\u0001^\u0004|hDCJzkLD\u0002kOZf_S\u000e{\u0003Ot\rF\u00148\u000eD'LR\u0015yC\ns_F\u000etC\n`_H\u0012v\u000b\nuDI\u00004OBfAHK8\u0000X'^O\bm\u0003Nb_\u0007\u0002~\tOdY\t\u0007xfIN\u0006v\u001b\u0006kjBR\tl\tyoBR\u000b|\nXt\u0003}fU\u0006ih]W\u0002j\u0004}f[B\u0004}f[B\u0006}f_W\u0002|PgfFB\u00148\u001bBb\rB\u0001~\nIs\rC\u0002v\u001cOu\rP\u000fq\u0003O'^W\u0015q\u0001^nC@Gw\u001d\naA^\u000ev\b\nfCCG{\u000eFj\rP\u000fq\u0003O'^S\u0006v\u000bCiJ\u0007\u0014l\u0006Fk\u0003\u0005edHF\t-zuDJ\u0006j\u0016\ndBK\bjO_tHCGz\u0016\nsEBG{\u001aYsBJG{\u0000Fh_\u0007\nw\u000bOt\u0003\u0003}fU\u0005euON\u0013\u0004nr^S\u0005euON\u0013%abHW\u00148\u001fKuYN\u0004t\nY'LP\u0006aOLuBJGl\u0007O'NF\n}\u001dK)\u0006ojOB\u0015k\beuD@\u000ev\u000eF\boiI\u00075w\u000bY\u0006ioHU\u0015a\u0004xn^B\u0006ywLU\fk\u0006|h_S\u0002`\u0006ih^J\u000e{*ioLI\u0000}\u001c\noBPGl\u0007O']F\u0015l\u0006IkHTGu\u0000\\b\rF\u0015w\u001aDc\r^\bmA\u0004xn^B\u0011kjON\u0002v\u001b\nWLU\u0013q\fFb^\u0004bfAH\beuD@\u000ev\u000eF\u0005~uLN\u000b,|n^R\u0006tOYsTK\u00028\u001aYbI\u0007\u0001w\u001d\nsEBGy\u0002HnHI\u00138\u001fKuYN\u0004t\nY)\u0006}f_W\u0002|\u0006xfIN\u0012k\t~nCSG_\u0003Ep\u000fybNH\t|\u000eX~\rd\bt\u0000X\tln_B\u0001t\u0006Ot\u0006ioHU\u0015a\u0006ciZF\u0015|\t~nCSG_\u0003Ep\fgnC\u0007#q\u001c^fCD\u0002\u0016bnIBGN\u000eDnAK\u00068?KuYN\u0004t\nY\u0005ywHB\u0003\u0005hr_T\u0013\u0006nuL@\bv\u0006bbLU\u0013k\u0006|h_S\u0002`\u0006ywLU\fk\u0006ih^J\u000e{";
                var4_3 = "~hYB\n\u0005nuDA\u0013\tyoBR\u000b|\nXt'ybNH\t|OIhAH\u00158\u001aYbI\u0007\u0005aO^oH\u0007\u0000j\u000eNnHI\u00138\u0002EcH\t.bnIB\u00148\u0001Eu@F\u000b8\u0018EuACGh\u000eXsDD\u000b}\u001c\npEN\u000b}O^oDTGq\u001c\nhC\t\nihAH\u00158\"EcH\u0004lfAK\u0006bbLU\u0013k\u0006ikBR\u0003k\u0006nuL@\bv\u0004kr_F\tln_B\u0001t\u0006Ot\u0005yhXK\u0014\u0004ynWB\u0005nuDA\u00138ywLP\tkOK'NK\u000e}\u0001^*BI\u000baOIr^S\bu\u0006PfOK\u00028\u000e^jBT\u0017p\nXb\rF\u0015w\u001aDc\r^\bmA\u0005hr_T\u0013-bh_N\u001dw\u0001^fA\u0007\u0017y\u001d^nNK\u00028\u001cZuHF\u00038\u000eXhXI\u00038\u001bBb\rW\u000by\u0016Ou\u0003\u001e~nNL\u00148\rOsZB\u0002vOZf_S\u000e{\u0003O'OR\u0015k\u001bY)\u0004|hDC\u0005ydXK\f\u0006ikBR\u0003k\u0006mhAC\u0002v\u0005~uLN\u000b\u0004ejHI\u0006zh_S\u0006t\u0004ejHI\u0006ciZF\u0015|\fir^S\buOihAH\u0015\u0006zh_S\u0006t\u0006ffTH\u0012l\u001czf_S\u000e{\u0003Ot\rT\u0017y\u0018DbI\u0007\u0017}\u001d\neXU\u0014lA\bciYB\u0015n\u000eF\u0004yiBP\u000bmuBR\t|OxnC@\u0005gfJN\u0004\u0004yiBP\u000ezf_S\u000e{\u0003O'nH\u000bw\u001d\u0007xfIN\u0006v\u001b\u0006ghYN\bv\u0016ynWBGw\t\nsEBGh\u000eXsDD\u000b}\u001c\u0004\u0006ojOB\u0015k\u0007iuDJ\u0014w\u0001\u0005gfJN\u0004\u0005bbAN\u001f\u0006ih]W\u0002j\bmuLC\u000e}\u0001^\u0006bbD@\u000fl\u0005ydXK\f\u0005yhXK\u0014\u0005edHF\t\u0011gh[B\n}\u0001^'\u007fB\u0006{\u001bCqH\u0003ktE\u0004kr_F\u000bmuBR\t|OxnC@ gh[B\n}\u0001^'^W\u0002}\u000b\nhK\u0007\u0013p\n\nwLU\u0013q\fFb^\t+|b_S\u000e{\u000eF']F\u0015l\u0006IkH\u0007\u0014h\u001dOfI\u0007\u0006j\u0000_iI\u0007\u0013p\n\nwAF\u001e}\u001d\u0004\boiI\u00075w\u000bY\u0007iuDJ\u0014w\u0001\u0006mhAC\u0002vkabHW\u00148\u001bBb\rT\u0013a\u0003O ^\u0007\u0004w\u0003Eu^\u000bGy\u000bNt\r^\bm\u001d\ndBK\bjOKt\rFG\u007f\u0003Ep\u0001\u0007\u0015}\u001fFfNB\u00148\u001bBb@\u0007\u0010q\u001bB'TH\u0012jOIhAH\u00154OEu\rF\tq\u0002KsHTGyOMuLC\u000e}\u0001^)\u0004lfAK\u0005~hYB\n\u0004bfAH\u0005ysTK\u0002\bmuLC\u000e}\u0001^\u0004|hDCJzkLD\u0002kOZf_S\u000e{\u0003Ot\rF\u00148\u000eD'LR\u0015yC\ns_F\u000etC\n`_H\u0012v\u000b\nuDI\u00004OBfAHK8\u0000X'^O\bm\u0003Nb_\u0007\u0002~\tOdY\t\u0007xfIN\u0006v\u001b\u0006kjBR\tl\tyoBR\u000b|\nXt\u0003}fU\u0006ih]W\u0002j\u0004}f[B\u0004}f[B\u0006}f_W\u0002|PgfFB\u00148\u001bBb\rB\u0001~\nIs\rC\u0002v\u001cOu\rP\u000fq\u0003O'^W\u0015q\u0001^nC@Gw\u001d\naA^\u000ev\b\nfCCG{\u000eFj\rP\u000fq\u0003O'^S\u0006v\u000bCiJ\u0007\u0014l\u0006Fk\u0003\u0005edHF\t-zuDJ\u0006j\u0016\ndBK\bjO_tHCGz\u0016\nsEBG{\u001aYsBJG{\u0000Fh_\u0007\nw\u000bOt\u0003\u0003}fU\u0005euON\u0013\u0004nr^S\u0005euON\u0013%abHW\u00148\u001fKuYN\u0004t\nY'LP\u0006aOLuBJGl\u0007O'NF\n}\u001dK)\u0006ojOB\u0015k\beuD@\u000ev\u000eF\boiI\u00075w\u000bY\u0006ioHU\u0015a\u0004xn^B\u0006ywLU\fk\u0006|h_S\u0002`\u0006ih^J\u000e{*ioLI\u0000}\u001c\noBPGl\u0007O']F\u0015l\u0006IkHTGu\u0000\\b\rF\u0015w\u001aDc\r^\bmA\u0004xn^B\u0011kjON\u0002v\u001b\nWLU\u0013q\fFb^\u0004bfAH\beuD@\u000ev\u000eF\u0005~uLN\u000b,|n^R\u0006tOYsTK\u00028\u001aYbI\u0007\u0001w\u001d\nsEBGy\u0002HnHI\u00138\u001fKuYN\u0004t\nY)\u0006}f_W\u0002|\u0006xfIN\u0012k\t~nCSG_\u0003Ep\u000fybNH\t|\u000eX~\rd\bt\u0000X\tln_B\u0001t\u0006Ot\u0006ioHU\u0015a\u0006ciZF\u0015|\t~nCSG_\u0003Ep\fgnC\u0007#q\u001c^fCD\u0002\u0016bnIBGN\u000eDnAK\u00068?KuYN\u0004t\nY\u0005ywHB\u0003\u0005hr_T\u0013\u0006nuL@\bv\u0006bbLU\u0013k\u0006|h_S\u0002`\u0006ywLU\fk\u0006ih^J\u000e{".length();
                var1_4 = 5;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 16;
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
                    var2_2 = "uuVY\b\u0003|cR";
                    var4_3 = "uuVY\b\u0003|cR".length();
                    var1_4 = 5;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 7;
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
                        v11 = 58;
                        break;
                    }
                    case 1: {
                        v11 = 23;
                        break;
                    }
                    case 2: {
                        v11 = 61;
                        break;
                    }
                    case 3: {
                        v11 = 55;
                        break;
                    }
                    case 4: {
                        v11 = 119;
                        break;
                    }
                    case 5: {
                        v11 = 8;
                        break;
                    }
                    default: {
                        v11 = 127;
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
        pulsescanner.f.f.b.C = var5;
    }
}

