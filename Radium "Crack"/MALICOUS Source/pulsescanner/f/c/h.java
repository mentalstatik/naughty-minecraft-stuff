/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_265
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 */
package pulsescanner.f.c;

import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_265;
import net.minecraft.class_2828;
import pulsescanner.a.as;
import pulsescanner.a.aw;
import pulsescanner.a.ax;
import pulsescanner.a.o;
import pulsescanner.a.y;

public class h
extends as {
    public final aw m;
    public final ax n;
    public final ax o;
    public final aw p;
    public final ax q;
    public final aw r;
    private static final String[] s;

    public h() {
        String[] stringArray = s;
        super(stringArray[7], stringArray[23]);
        this.p = new aw(this, stringArray[6], new String[]{stringArray[20], stringArray[24], stringArray[22], stringArray[25], stringArray[0], stringArray[5]});
        this.r = new aw(this, stringArray[12], new String[]{stringArray[1], stringArray[2]});
        this.m = (aw)new aw(this, stringArray[14], new String[]{stringArray[15], stringArray[13], stringArray[16]}).a(this::lambda$new$0);
        this.n = new ax(this, stringArray[19], 20.0f, 5.0f, 150.0f, 1.0f);
        this.q = (ax)new ax(this, stringArray[18], 2.0f, 1.0f, 15.0f, 1.0f).a(this::lambda$new$1);
        this.o = (ax)new ax(this, stringArray[29], 8.9f, 0.1f, 20.0f, 0.1f).a(this::lambda$new$2);
    }

    private float[] b(class_1297 class_12972) {
        block5: {
            try {
                if (this.m.c(s[8])) {
                    return new float[]{pulsescanner.f.c.h.a.field_1724.field_5982, pulsescanner.f.c.h.a.field_1724.field_6004};
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.h.a(matchException);
            }
            try {
                if (!this.m.c(s[4]) || class_12972 == null) break block5;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.h.a(matchException);
            }
            class_243 class_2432 = class_12972.method_5829().method_1005().method_1020(pulsescanner.f.c.h.a.field_1724.method_33571());
            double d2 = Math.sqrt(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350);
            float f2 = (float)Math.toDegrees(Math.atan2(class_2432.field_1350, class_2432.field_1352)) - 90.0f;
            float f3 = (float)(-Math.toDegrees(Math.atan2(class_2432.field_1351, d2)));
            return new float[]{f2, f3};
        }
        return new float[]{pulsescanner.f.c.h.a.field_1724.method_36454(), pulsescanner.f.c.h.a.field_1724.method_36455()};
    }

    private int s() {
        class_238 class_2382 = pulsescanner.f.c.h.a.field_1724.method_5829();
        int n2 = Math.round(this.n.g());
        int n3 = 0;
        int n4 = 1;
        while (n4 <= n2) {
            boolean bl = true;
            for (class_265 class_2652 : pulsescanner.f.c.h.a.field_1687.method_20812((class_1297)pulsescanner.f.c.h.a.field_1724, class_2382.method_989(0.0, (double)n4, 0.0))) {
                if (class_2652.method_1110()) continue;
                bl = false;
                break;
            }
            try {
                if (!bl) {
                    break;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.h.a(matchException);
            }
            n3 = n4++;
        }
        return n3;
    }

    /*
     * Exception decompiling
     */
    @y
    public void a(o var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[TRYBLOCK]], but top level block is 18[SWITCH]
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

    private int d(int n2) {
        int n3;
        try {
            if (n2 < 11) {
                return 1;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        try {
            n3 = n2 < 31 ? 2 : (int)Math.ceil((double)n2 / 10.0);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        return n3;
    }

    private void a(double d2, double d3, double d4, int n2, float[] fArray) {
        int n3;
        int n4 = Math.max(1, (int)Math.ceil((float)n2 / Math.max(0.1f, this.o.g())));
        double d5 = (double)n2 / (double)n4;
        try {
            for (n3 = 1; n3 <= n4; ++n3) {
                this.a(d2, d3 + d5 * (double)n3, d4, false, fArray);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        try {
            for (n3 = n4 - 1; n3 >= 0; --n3) {
                this.a(d2, d3 + d5 * (double)n3, d4, false, fArray);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
    }

    private void a(double d2, double d3, double d4, int n2, boolean bl, float[] fArray) {
        int n3;
        int n4;
        if (n2 > 10) {
            n4 = (int)Math.ceil((double)n2 / 10.0);
            n3 = 0;
        } else {
            n4 = 2;
            n3 = 0;
        }
        try {
            while (n3 < n4) {
                this.a(d2, d3, d4, bl, fArray);
                ++n3;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        this.a(d2, d3 + (double)n2, d4, false, fArray);
        this.a(d2, d3, d4, false, fArray);
    }

    private void a(double d2, double d3, double d4, int n2, boolean bl, int n3, float[] fArray) {
        int n4;
        double d5;
        double d6;
        try {
            d6 = d3;
            d5 = bl ? 0.5 : 0.0;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        double d7 = d6 + d5;
        try {
            for (n4 = 0; n4 < n3; ++n4) {
                this.a(d2, d7, d4, false, fArray);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        this.a(d2, d3 + (double)n2, d4, false, fArray);
        try {
            for (n4 = 0; n4 < n3; ++n4) {
                this.a(d2, d7, d4, false, fArray);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.h.a(matchException);
        }
        this.a(d2, d3, d4, false, fArray);
    }

    private void a(double d2, double d3, double d4, boolean bl, float[] fArray) {
        block4: {
            block5: {
                try {
                    try {
                        if (a.method_1562() == null) break block4;
                        if (!this.r.c(s[21])) break block5;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.h.a(matchException);
                    }
                    a.method_1562().method_52787((class_2596)new class_2828.class_2829(d2, d3, d4, bl, false));
                    break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.h.a(matchException);
                }
            }
            a.method_1562().method_52787((class_2596)new class_2828.class_2830(d2, d3, d4, fArray[0], fArray[1], bl, false));
        }
    }

    @Override
    public String f() {
        return (String)this.p.a();
    }

    private boolean lambda$new$2() {
        return this.p.c(s[17]);
    }

    private boolean lambda$new$1() {
        return this.p.c(s[27]);
    }

    private boolean lambda$new$0() {
        return this.r.c(s[11]);
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
                var5 = new String[30];
                var3_1 = 0;
                var2_2 = "[s5\u0016p\u0015GXQ\u0011\bF}2\rm\u0004\bx\u0004Pg-\b\t'<sU9 \u0006uw\u000bWg3\u000599\u0006du$\u0010\u0006Es,\u0014u\b\u0004[}%\u0001\u000b[s\"\u0001\\\u0015\u0017z}(\u0010\bF`$\u0012p\u0002\u0012e\tUs-\u0007l\u0001\u0006bw\u0007Rw'\u0005l\u0001\u0013\u0004Pg-\b\u000bFs\"\u000f|\u0019GBk1\u0001\u000bWg3\u000599\u0006du$\u0010\u0006W|&\b|\u001e\bF`$\u0012p\u0002\u0012e\u0007Ug3\u0016|\u0003\u0013\n[s5\u0016p\u0015GXQ\u0011\fFs\"\u000f|\u0019GU}4\nm\u000bPs-\b9%\u0002\u007fu)\u0010\u0007Rw'\u0005l\u0001\u0013\bF}2\rm\u0004\bx\tUs-\u0007l\u0001\u0006bw:Ew/\u0000jM\u00066t \u000f|M\u0001w~-D{\b\u0001y`$Dt\f\u0004s2)\rm\u001eGp}3D|\u0015\u0013dsa\u0017t\f\u0014~2%\u0005t\f\u0000s<\u0006Ug2\u0010v\u0000\u0006[s5\u0016p\u0015\u0006[s5\u0016p\u0015\u0006Ug2\u0010v\u0000";
                var4_3 = "[s5\u0016p\u0015GXQ\u0011\bF}2\rm\u0004\bx\u0004Pg-\b\t'<sU9 \u0006uw\u000bWg3\u000599\u0006du$\u0010\u0006Es,\u0014u\b\u0004[}%\u0001\u000b[s\"\u0001\\\u0015\u0017z}(\u0010\bF`$\u0012p\u0002\u0012e\tUs-\u0007l\u0001\u0006bw\u0007Rw'\u0005l\u0001\u0013\u0004Pg-\b\u000bFs\"\u000f|\u0019GBk1\u0001\u000bWg3\u000599\u0006du$\u0010\u0006W|&\b|\u001e\bF`$\u0012p\u0002\u0012e\u0007Ug3\u0016|\u0003\u0013\n[s5\u0016p\u0015GXQ\u0011\fFs\"\u000f|\u0019GU}4\nm\u000bPs-\b9%\u0002\u007fu)\u0010\u0007Rw'\u0005l\u0001\u0013\bF}2\rm\u0004\bx\tUs-\u0007l\u0001\u0006bw:Ew/\u0000jM\u00066t \u000f|M\u0001w~-D{\b\u0001y`$Dt\f\u0004s2)\rm\u001eGp}3D|\u0015\u0013dsa\u0017t\f\u0014~2%\u0005t\f\u0000s<\u0006Ug2\u0010v\u0000\u0006[s5\u0016p\u0015\u0006[s5\u0016p\u0015\u0006Ug2\u0010v\u0000".length();
                var1_4 = 10;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 15;
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
                    var2_2 = "Aw(\u0010q\f\u0010Zs,\u0007u\u001dCAs5\u0001o\b\u0017}d";
                    var4_3 = "Aw(\u0010q\f\u0010Zs,\u0007u\u001dCAs5\u0001o\b\u0017}d".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 11;
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
                        v11 = 25;
                        break;
                    }
                    case 1: {
                        v11 = 29;
                        break;
                    }
                    case 2: {
                        v11 = 78;
                        break;
                    }
                    case 3: {
                        v11 = 107;
                        break;
                    }
                    case 4: {
                        v11 = 22;
                        break;
                    }
                    case 5: {
                        v11 = 98;
                        break;
                    }
                    default: {
                        v11 = 104;
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
        pulsescanner.f.c.h.s = var5;
    }
}

