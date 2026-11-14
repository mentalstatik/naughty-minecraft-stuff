/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package pulsescanner.f.c;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import pulsescanner.a.ak;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.ax;
import pulsescanner.a.d;
import pulsescanner.a.k;
import pulsescanner.a.u;
import pulsescanner.a.y;
import pulsescanner.a.z;
import pulsescanner.f.c.a;
import pulsescanner.f.c.o;
import pulsescanner.f.c.t;

public class g
extends as {
    private final ax m;
    private a n;
    private long o;
    private class_1657 p;
    private static final class_2350[] q;
    private boolean r;
    private class_243 s;
    private long t;
    private class_1511 u;
    private final ax v;
    private final ax w;
    private class_3965 x;
    private int y;
    private final at z;
    private class_2338 A;
    private static final String[] B;

    private void a(long l2) {
        block3: {
            class_1268 class_12682;
            block2: {
                class_12682 = this.t();
                try {
                    if (class_12682 != null) break block2;
                    this.w();
                    break block3;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            class_243 class_2432 = new class_243((double)this.A.method_10263() + 0.5, (double)this.A.method_10264() + 1.0, (double)this.A.method_10260() + 0.5);
            class_3965 class_39652 = new class_3965(class_2432, class_2350.field_11036, this.A, false);
            this.a(class_39652, class_12682, l2);
        }
    }

    private class_243 a(class_2338 class_23382, class_2350 class_23502) {
        double d2 = 0.28 * (double)this.v.g();
        double d3 = (double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10148() * 0.5;
        double d4 = (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10164() * 0.5;
        double d5 = (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10165() * 0.5;
        if (class_23502.method_10148() == 0) {
            d3 += this.a(-d2, d2);
        }
        if (class_23502.method_10164() == 0) {
            d4 += this.a(-d2, d2);
        }
        if (class_23502.method_10165() == 0) {
            d5 += this.a(-d2, d2);
        }
        return new class_243(d3, d4, d5);
    }

    private boolean a(class_3965 class_39652, class_1268 class_12682) {
        block8: {
            try {
                try {
                    try {
                        try {
                            if (class_39652 == null || class_12682 == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        if (this.A == null) break block8;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    if (!this.g(this.A)) break block8;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                g.a.field_1761.method_2896(g.a.field_1724, class_12682, class_39652);
                g.a.field_1724.method_6104(class_12682);
                return true;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
        }
        return false;
    }

    private class_1511 s() {
        for (class_1297 class_12972 : g.a.field_1687.method_18112()) {
            if (!(class_12972 instanceof class_1511)) continue;
            class_1511 class_15112 = (class_1511)class_12972;
            try {
                if (!class_15112.method_5805() || class_15112.method_31481()) continue;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            class_2338 class_23382 = class_2338.method_49637((double)class_15112.method_23317(), (double)(class_15112.method_23318() - 1.0), (double)class_15112.method_23321());
            try {
                try {
                    if (!this.j(class_23382) || !this.a(class_23382)) continue;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                return class_15112;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @y
    public void a(u var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[SWITCH]
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

    private boolean a(class_2338 class_23382) {
        block6: {
            boolean bl;
            block8: {
                block7: {
                    try {
                        if (class_23382 == null || g.a.field_1724 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    class_2338 class_23383 = g.a.field_1724.method_24515();
                    double d2 = class_23382.method_10263() - class_23383.method_10263();
                    double d3 = class_23382.method_10260() - class_23383.method_10260();
                    double d4 = d2 * d2 + d3 * d3;
                    double d5 = Math.abs((double)class_23382.method_10264() - g.a.field_1724.method_23318());
                    try {
                        try {
                            if (!(d4 <= 20.25) || !(d5 <= 4.5)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    protected void p() {
        this.w();
    }

    private class_3965 b(class_2338 class_23382) {
        class_243 class_2432;
        block10: {
            if (this.c(class_23382)) {
                class_2432 = this.f(class_23382);
                try {
                    try {
                        if (this.z.i() && !this.a(class_23382, class_2432)) break block10;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    return new class_3965(class_2432, class_2350.field_11036, class_23382, false);
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
        }
        if (!this.z.i()) {
            class_2432 = this.a(class_23382, class_2350.field_11036);
            return new class_3965(class_2432, class_2350.field_11036, class_23382, false);
        }
        for (class_243 class_2433 : class_2350.values()) {
            for (int i2 = 0; i2 < 4; ++i2) {
                class_243 class_2434 = this.a(class_23382, (class_2350)class_2433);
                class_239 class_2392 = this.a(class_2434);
                if (!(class_2392 instanceof class_3965)) continue;
                class_3965 class_39652 = (class_3965)class_2392;
                try {
                    if (!class_39652.method_17777().equals((Object)class_23382)) continue;
                    return new class_3965(class_39652.method_17784(), class_39652.method_17780(), class_23382, false);
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
        }
        return null;
    }

    private boolean a(class_2338 class_23382, class_243 class_2432) {
        class_239 class_2392 = this.a(class_2432);
        if (class_2392 instanceof class_3965) {
            class_3965 class_39652 = (class_3965)class_2392;
            try {
                if (class_39652.method_17777().equals((Object)class_23382)) {
                    return true;
                }
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
        }
        return false;
    }

    private void a(class_3965 class_39652, class_1268 class_12682, long l2) {
        try {
            g.a.field_1761.method_2896(g.a.field_1724, class_12682, class_39652);
            g.a.field_1724.method_6104(class_12682);
            this.t = l2;
            if (this.n != pulsescanner.f.c.a.WAIT_CRYSTAL) {
                this.a(pulsescanner.f.c.a.WAIT_CRYSTAL);
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
    }

    private boolean a(class_1657 class_16572) {
        boolean bl;
        block11: {
            block10: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (class_16572 == null || class_16572 == g.a.field_1724) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (!class_16572.method_5805()) break block10;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            if (class_16572.method_31481()) break block10;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        if (pulsescanner.a.z.a(class_16572.method_5477().getString())) break block10;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    bl = true;
                    break block11;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean c(class_2338 class_23382) {
        block4: {
            boolean bl;
            try {
                if (class_23382 == null || g.a.field_1724 == null) break block4;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            int n2 = class_2338.method_49637((double)g.a.field_1724.method_23317(), (double)(g.a.field_1724.method_5829().field_1322 + 0.05), (double)g.a.field_1724.method_23321()).method_10264();
            try {
                bl = n2 < class_23382.method_10264();
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            return bl;
        }
        return false;
    }

    private boolean d(class_2338 class_23382) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (class_23382 == null) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                class_2680 class_26802 = g.a.field_1687.method_8320(class_23382);
                try {
                    try {
                        if (!class_26802.method_27852(class_2246.field_10540) && !class_26802.method_27852(class_2246.field_9987)) break block7;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private class_1511 e(class_2338 class_23382) {
        try {
            if (class_23382 == null) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5, (double)class_23382.method_10264() + 1.0, (double)class_23382.method_10260() + 0.5);
        class_1511 class_15112 = null;
        double d2 = Double.MAX_VALUE;
        for (class_1297 class_12972 : g.a.field_1687.method_18112()) {
            if (!(class_12972 instanceof class_1511)) continue;
            class_1511 class_15113 = (class_1511)class_12972;
            try {
                if (!class_15113.method_5805() || class_15113.method_31481()) continue;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            class_243 class_2433 = class_15113.method_73189();
            try {
                try {
                    if (Math.abs(class_2433.field_1352 - class_2432.field_1352) > 0.35 || Math.abs(class_2433.field_1351 - class_2432.field_1351) > 0.75) continue;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                if (Math.abs(class_2433.field_1350 - class_2432.field_1350) > 0.35) continue;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            double d3 = class_2433.method_1025(class_2432);
            if (!(d3 < d2)) continue;
            d2 = d3;
            class_15112 = class_15113;
        }
        return class_15112;
    }

    private class_243 f(class_2338 class_23382) {
        double d2 = (double)class_23382.method_10263() + 0.5;
        double d3 = (double)class_23382.method_10260() + 0.5;
        double d4 = d2 - g.a.field_1724.method_23317();
        double d5 = d3 - g.a.field_1724.method_23321();
        double d6 = Math.hypot(d4, d5);
        double d7 = this.a(-0.06, 0.06);
        double d8 = d6 <= 0.001 ? 0.0 : -d5 / d6 * d7;
        if (d6 <= 0.001) {
            double d9 = 0.0;
            return new class_243(d2 + d8, (double)class_23382.method_10264() + 1.04, d3 + d9);
        }
        double d10 = d4 / d6 * d7;
        return new class_243(d2 + d8, (double)class_23382.method_10264() + 1.04, d3 + d10);
    }

    private void b(class_1657 class_16572) {
        this.w();
        this.p = class_16572;
        this.a(pulsescanner.f.c.a.PREPARE);
    }

    private void b(long l2) {
        block23: {
            block30: {
                int n2;
                block29: {
                    block28: {
                        block26: {
                            block27: {
                                block25: {
                                    block24: {
                                        block22: {
                                            try {
                                                try {
                                                    if (this.j(this.A) && this.a(this.A)) break block22;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g.a(matchException);
                                                }
                                                this.A = null;
                                                this.r = false;
                                                this.a(pulsescanner.f.c.a.PREPARE);
                                                break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw g.a(matchException);
                                            }
                                        }
                                        try {
                                            if (!this.d(this.A)) break block24;
                                            this.a(pulsescanner.f.c.a.PLACE_CRYSTAL);
                                            break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw g.a(matchException);
                                        }
                                    }
                                    try {
                                        if (this.g(this.A)) break block25;
                                        this.A = null;
                                        this.a(pulsescanner.f.c.a.PREPARE);
                                        break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                }
                                try {
                                    try {
                                        if (this.x != null) break block26;
                                        this.x = this.i(this.A);
                                        if (this.x != null) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                            }
                            this.s = this.x.method_17784();
                        }
                        try {
                            try {
                                try {
                                    if (!this.a(this.s, 3.0f)) break block23;
                                    if (!this.z.i()) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (this.a(this.x.method_17777(), this.s)) break block28;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            this.x = null;
                            this.s = null;
                            break block23;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    n2 = this.a(class_1802.field_8281);
                    try {
                        if (n2 != -1) break block29;
                        this.w();
                        break block23;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                try {
                    this.d(n2);
                    if (this.a(this.x, class_1268.field_5808)) break block30;
                    this.w();
                    break block23;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            this.r = true;
            this.a(l2);
        }
    }

    private boolean g(class_2338 class_23382) {
        block10: {
            boolean bl;
            block13: {
                block12: {
                    block11: {
                        try {
                            try {
                                try {
                                    if (class_23382 == null || !g.a.field_1687.method_8320(class_23382).method_45474()) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (g.a.field_1687.method_8320(class_23382.method_10084()).method_26215()) break block11;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    try {
                        if (g.a.field_1687.method_8333(null, new class_238(class_23382), class_1297::method_5805).isEmpty()) break block12;
                        bl = false;
                        break block13;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                try {
                    bl = this.a(class_1802.field_8281) != -1;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            return bl;
        }
        return false;
    }

    private boolean a(class_1511 class_15112) {
        class_243 class_2432 = g.a.field_1724.method_33571();
        class_243 class_2433 = k.a(g.a.field_1724.method_36455(), g.a.field_1724.method_36454());
        double d2 = class_2432.method_1022(class_15112.method_5829().method_1005()) + 1.0;
        class_243 class_2434 = class_2432.method_1019(class_2433.method_1021(d2));
        return class_15112.method_5829().method_1014(0.04).method_992(class_2432, class_2434).isPresent();
    }

    private void c(long l2) {
        block37: {
            block38: {
                block41: {
                    block40: {
                        block35: {
                            block36: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    block34: {
                                                        try {
                                                            try {
                                                                if (this.u == null || !this.u.method_5805()) break block34;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g.a(matchException);
                                                            }
                                                            if (!this.u.method_31481()) break block35;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g.a(matchException);
                                                        }
                                                    }
                                                    this.u = null;
                                                    if (!this.a(this.p)) break block36;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g.a(matchException);
                                                }
                                                if (!this.j(this.A)) break block36;
                                            }
                                            catch (MatchException matchException) {
                                                throw g.a(matchException);
                                            }
                                            if (!this.a(this.A)) break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw g.a(matchException);
                                        }
                                        if (!this.d(this.A)) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                    this.a(pulsescanner.f.c.a.PLACE_CRYSTAL);
                                    break block37;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                            }
                            this.A = null;
                            this.r = false;
                            this.a(pulsescanner.f.c.a.PREPARE);
                            break block37;
                        }
                        try {
                            block39: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!this.a(this.A) || !this.j(this.A)) break block38;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g.a(matchException);
                                                }
                                                if (l2 - this.o < (long)this.m.g()) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw g.a(matchException);
                                            }
                                            if (l2 - this.t < (long)this.m.g()) break block37;
                                        }
                                        catch (MatchException matchException) {
                                            throw g.a(matchException);
                                        }
                                        if (this.s == null) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                    if (this.u.method_5829().method_1014(0.02).method_1006(this.s)) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                            }
                            this.s = this.c(this.u);
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (!this.a(this.s, 2.25f) || !this.a(this.u)) break block37;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (!this.z.i()) break block41;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            if (this.b(this.s)) break block41;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        this.s = this.c(this.u);
                        break block37;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                g.a.field_1761.method_2918((class_1657)g.a.field_1724, (class_1297)this.u);
                g.a.field_1724.method_6104(class_1268.field_5808);
                this.t = l2;
                this.s = this.c(this.u);
                break block37;
            }
            this.u = null;
            this.A = null;
            this.r = false;
            this.a(pulsescanner.f.c.a.PREPARE);
        }
    }

    private class_243 b(class_1511 class_15112) {
        class_238 class_2382 = class_15112.method_5829();
        double d2 = this.v.g();
        double d3 = Math.max(0.04, (class_2382.field_1320 - class_2382.field_1323) * 0.5 * d2);
        double d4 = Math.max(0.04, (class_2382.field_1325 - class_2382.field_1322) * 0.5 * d2);
        double d5 = Math.max(0.04, (class_2382.field_1324 - class_2382.field_1321) * 0.5 * d2);
        class_243 class_2432 = class_2382.method_1005();
        return new class_243(this.a(class_2432.field_1352 - d3, class_2432.field_1352 + d3), this.a(class_2432.field_1351 - d4, class_2432.field_1351 + d4), this.a(class_2432.field_1350 - d5, class_2432.field_1350 + d5));
    }

    private boolean a(class_243 class_2432, float f2) {
        boolean bl;
        try {
            if (class_2432 == null) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        ak ak2 = this.c(class_2432);
        ak ak3 = new ak((class_1297)g.a.field_1724);
        float f3 = class_3532.method_15393((float)(ak2.a() - ak3.a()));
        float f4 = ak2.b() - ak3.b();
        float f5 = Math.min(this.w.g(), 30.0f);
        float f6 = Math.min(this.w.g() * 1.5f, 45.0f);
        float f7 = this.a(f3, f5, 0.65f);
        float f8 = this.a(f4, f6, 0.94f);
        ak ak4 = new ak(ak3.a() + f7, ak3.b() + f8);
        try {
            pulsescanner.a.d.a(ak4, f5, f6, 24.0f, 36.0f, 4, 30, false);
            bl = new ak((class_1297)g.a.field_1724).a(ak2) <= f2;
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        return bl;
    }

    private void d(long l2) {
        block13: {
            block14: {
                block15: {
                    block12: {
                        try {
                            this.u = this.e(this.A);
                            if (this.u == null) break block12;
                            this.a(pulsescanner.f.c.a.BREAK_CRYSTAL);
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (!this.j(this.A) || !this.a(this.A)) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                    if (this.d(this.A)) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (!this.r) break block15;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            if (l2 - this.o <= 1000L) break block15;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        this.A = null;
                        this.r = false;
                        this.a(pulsescanner.f.c.a.PREPARE);
                        break block13;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                this.g(l2);
                break block13;
            }
            this.A = null;
            this.r = false;
            this.a(pulsescanner.f.c.a.PREPARE);
        }
    }

    private boolean h(class_2338 class_23382) {
        block6: {
            boolean bl;
            block8: {
                block7: {
                    try {
                        if (class_23382 == null || g.a.field_1724 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    class_2338 class_23383 = g.a.field_1724.method_24515();
                    double d2 = class_23382.method_10263() - class_23383.method_10263();
                    double d3 = class_23382.method_10260() - class_23383.method_10260();
                    double d4 = d2 * d2 + d3 * d3;
                    try {
                        try {
                            if (!(d4 >= 9.0) || !(d4 <= 16.0)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private class_3965 i(class_2338 class_23382) {
        for (class_2350 class_23502 : q) {
            class_2338 class_23383 = class_23382.method_10093(class_23502);
            class_2680 class_26802 = g.a.field_1687.method_8320(class_23383);
            try {
                if (class_26802.method_26215() || !class_26802.method_26212((class_1922)g.a.field_1687, class_23383)) continue;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            class_2350 class_23503 = class_23502.method_10153();
            for (int i2 = 0; i2 < 4; ++i2) {
                class_243 class_2432 = this.a(class_23383, class_23503);
                try {
                    try {
                        if (this.z.i() && !this.a(class_23383, class_2432)) continue;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    return new class_3965(class_2432, class_23503, class_23383, false);
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
        }
        return null;
    }

    private void d(int n2) {
        block4: {
            block5: {
                int n3 = g.a.field_1724.method_31548().method_67532();
                try {
                    try {
                        if (n3 == n2) break block4;
                        if (this.y != -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    this.y = n3;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            g.a.field_1724.method_31548().method_61496(n2);
            g.a.field_1761.method_2911();
        }
    }

    private class_1268 t() {
        try {
            if (g.a.field_1724.method_6079().method_7909() == class_1802.field_8301) {
                return class_1268.field_5810;
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        int n2 = this.a(class_1802.field_8301);
        try {
            if (n2 == -1) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        this.d(n2);
        return class_1268.field_5808;
    }

    private void a(a a2) {
        this.n = a2;
        this.o = System.currentTimeMillis();
        this.x = null;
        this.s = null;
    }

    private void u() {
        this.n = pulsescanner.f.c.a.IDLE;
        this.p = null;
        this.A = null;
        this.u = null;
        this.x = null;
        this.s = null;
        this.o = 0L;
        this.t = 0L;
        this.y = -1;
        this.r = false;
    }

    private class_239 a(class_243 class_2432) {
        class_243 class_2433 = g.a.field_1724.method_33571();
        class_243 class_2434 = class_2432.method_1020(class_2433);
        try {
            if (class_2434.method_1027() == 0.0) {
                return g.a.field_1687.method_17742(new class_3959(class_2433, class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)g.a.field_1724));
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        class_243 class_2435 = class_2432.method_1019(class_2434.method_1029().method_1021(0.01));
        return g.a.field_1687.method_17742(new class_3959(class_2433, class_2435, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)g.a.field_1724));
    }

    private void e(long l2) {
        block13: {
            a a2;
            g g2;
            block15: {
                block14: {
                    block12: {
                        class_1511 class_15112 = this.s();
                        try {
                            if (class_15112 == null) break block12;
                            this.u = class_15112;
                            this.A = class_2338.method_49637((double)class_15112.method_23317(), (double)(class_15112.method_23318() - 1.0), (double)class_15112.method_23321()).method_10062();
                            this.a(pulsescanner.f.c.a.BREAK_CRYSTAL);
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (g.a.field_1724.method_6079().method_7909() == class_1802.field_8301 || this.a(class_1802.field_8301) != -1) break block14;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        this.w();
                        break block13;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                try {
                    try {
                        this.A = this.v();
                        if (this.A != null) break block15;
                        if (l2 - this.o <= 900L) break block13;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    this.w();
                    break block13;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            try {
                g2 = this;
                a2 = this.d(this.A) ? pulsescanner.f.c.a.PLACE_CRYSTAL : pulsescanner.f.c.a.PLACE_OBSIDIAN;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            g2.a(a2);
        }
    }

    private boolean c(class_1657 class_16572) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (!this.a(class_16572)) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                class_2338 class_23382 = g.a.field_1724.method_24515();
                class_2338 class_23383 = class_16572.method_24515();
                double d2 = class_23383.method_10263() - class_23382.method_10263();
                double d3 = class_23383.method_10260() - class_23382.method_10260();
                double d4 = d2 * d2 + d3 * d3;
                double d5 = 2.0;
                double d6 = 5.0;
                try {
                    try {
                        if (!(d4 >= d5 * d5) || !(d4 <= d6 * d6)) break block7;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean b(class_243 class_2432) {
        boolean bl;
        block5: {
            block4: {
                class_239 class_2392 = this.a(class_2432);
                try {
                    try {
                        if (class_2392.method_17783() != class_239.class_240.field_1333 && !(class_2392.method_17784().method_1025(g.a.field_1724.method_33571()) + 0.002 >= class_2432.method_1025(g.a.field_1724.method_33571()))) break block4;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private class_2338 v() {
        class_2338 class_23382 = class_2338.method_49637((double)this.p.method_23317(), (double)(this.p.method_5829().field_1322 + 0.05), (double)this.p.method_23321());
        class_243 class_2432 = this.p.method_18798();
        double d2 = this.p.method_23317() + class_2432.field_1352 * 3.0;
        double d3 = this.p.method_23321() + class_2432.field_1350 * 3.0;
        String[] stringArray = pulsescanner.f.c.t.y();
        class_2338 class_23383 = null;
        double d4 = Double.MAX_VALUE;
        int n2 = -1;
        while (n2 <= 1) {
            block42: {
                for (int i2 = -1; i2 <= 1; ++i2) {
                    double d5;
                    class_2338 class_23384;
                    block55: {
                        int n3;
                        double d6;
                        block53: {
                            block54: {
                                int n4;
                                int n5;
                                block51: {
                                    block49: {
                                        block48: {
                                            g g2;
                                            block47: {
                                                int n6;
                                                block45: {
                                                    block43: {
                                                        block44: {
                                                            try {
                                                                if (stringArray != null) break block42;
                                                                if (Math.abs(n2) + Math.abs(i2) > 1) continue;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g.a(matchException);
                                                            }
                                                            class_23384 = class_23382.method_10069(n2, -1, i2);
                                                            n5 = this.d(class_23384);
                                                            try {
                                                                try {
                                                                    try {
                                                                        n6 = n5;
                                                                        if (stringArray != null) break block43;
                                                                        if (n6 != 0) break block44;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g.a(matchException);
                                                                    }
                                                                    n6 = this.g(class_23384);
                                                                    if (stringArray != null) break block43;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw g.a(matchException);
                                                                }
                                                                if (n6 == 0) continue;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g.a(matchException);
                                                            }
                                                        }
                                                        n6 = n5;
                                                    }
                                                    try {
                                                        try {
                                                            block46: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (stringArray != null) break block45;
                                                                            if (n6 == 0) break block46;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw g.a(matchException);
                                                                        }
                                                                        n6 = g.a.field_1687.method_8320(class_23384.method_10084()).method_26215();
                                                                        if (stringArray != null) break block45;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g.a(matchException);
                                                                    }
                                                                    if (n6 == 0) continue;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw g.a(matchException);
                                                                }
                                                            }
                                                            g2 = this;
                                                            if (stringArray != null) break block47;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g.a(matchException);
                                                        }
                                                        n6 = g2.h(class_23384);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g.a(matchException);
                                                    }
                                                }
                                                if (n6 == 0) continue;
                                                g2 = this;
                                            }
                                            try {
                                                n4 = g2.a(class_23384);
                                                if (stringArray != null) break block48;
                                                if (n4 == 0) continue;
                                            }
                                            catch (MatchException matchException) {
                                                throw g.a(matchException);
                                            }
                                            n4 = n5;
                                        }
                                        try {
                                            block50: {
                                                try {
                                                    try {
                                                        if (stringArray != null) break block49;
                                                        if (n4 != 0) break block50;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g.a(matchException);
                                                    }
                                                    if (this.i(class_23384) == null) continue;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g.a(matchException);
                                                }
                                            }
                                            n4 = n5;
                                        }
                                        catch (MatchException matchException) {
                                            throw g.a(matchException);
                                        }
                                    }
                                    try {
                                        block52: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (stringArray != null) break block51;
                                                            if (n4 == 0) break block52;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g.a(matchException);
                                                        }
                                                        n4 = this.z.i() ? 1 : 0;
                                                        if (stringArray != null) break block51;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g.a(matchException);
                                                    }
                                                    if (n4 == 0) break block52;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g.a(matchException);
                                                }
                                                if (this.b(class_23384) == null) continue;
                                            }
                                            catch (MatchException matchException) {
                                                throw g.a(matchException);
                                            }
                                        }
                                        n4 = class_23384.method_10263();
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                }
                                double d7 = (double)n4 + 0.5 - d2;
                                double d8 = (double)class_23384.method_10260() + 0.5 - d3;
                                class_2338 class_23385 = g.a.field_1724.method_24515();
                                double d9 = class_23384.method_10263() - class_23385.method_10263();
                                double d10 = class_23384.method_10260() - class_23385.method_10260();
                                double d11 = Math.hypot(d9, d10);
                                d6 = d7 * d7 + d8 * d8 + (4.0 - d11) * 12.0;
                                try {
                                    n3 = n5;
                                    if (stringArray != null) break block53;
                                    if (n3 != 0) break block54;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                d6 += 0.1;
                            }
                            try {
                                d5 = d6;
                                if (stringArray != null) break block55;
                                double d7 = d5 - d4;
                                n3 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                        }
                        if (n3 >= 0) continue;
                        d5 = d6;
                    }
                    d4 = d5;
                    class_23383 = class_23384.method_10062();
                    if (stringArray == null) continue;
                }
                ++n2;
            }
            if (stringArray == null) continue;
        }
        return class_23383;
    }

    public g() {
        String[] stringArray = B;
        super(stringArray[4], stringArray[1]);
        this.m = new ax(this, stringArray[2], 80.0f, 0.0f, 500.0f, 10.0f);
        this.w = new ax(this, stringArray[5], 30.0f, 12.0f, 45.0f, 1.0f);
        this.v = new ax(this, stringArray[0], 0.72f, 0.1f, 1.0f, 0.01f);
        this.z = new at(this, stringArray[3], true);
        this.n = pulsescanner.f.c.a.IDLE;
        this.y = -1;
    }

    private void f(long l2) {
        block27: {
            block26: {
                try {
                    try {
                        if (this.j(this.A) && this.a(this.A)) break block26;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    this.A = null;
                    this.r = false;
                    this.a(pulsescanner.f.c.a.PREPARE);
                    break block27;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            if (this.d(this.A)) {
                class_1268 class_12682;
                block32: {
                    block31: {
                        block29: {
                            block30: {
                                block28: {
                                    class_1511 class_15112 = this.e(this.A);
                                    try {
                                        if (class_15112 == null) break block28;
                                        this.u = class_15112;
                                        this.a(pulsescanner.f.c.a.BREAK_CRYSTAL);
                                        break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (!g.a.field_1687.method_8320(this.A.method_10084()).method_26215()) break block27;
                                            if (this.x != null) break block29;
                                        }
                                        catch (MatchException matchException) {
                                            throw g.a(matchException);
                                        }
                                        this.x = this.b(this.A);
                                        if (this.x != null) break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw g.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                            }
                            this.s = this.x.method_17784();
                        }
                        try {
                            try {
                                try {
                                    if (!this.a(this.s, 3.0f)) break block27;
                                    if (!this.z.i()) break block31;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (this.a(this.A, this.s)) break block31;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            this.x = null;
                            this.s = null;
                            break block27;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    class_12682 = this.t();
                    try {
                        if (class_12682 != null) break block32;
                        this.w();
                        break block27;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                this.a(this.x, class_12682, l2);
            } else {
                block33: {
                    try {
                        try {
                            if (!this.r) break block33;
                            if (l2 - this.t <= 1000L) break block27;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        this.w();
                        break block27;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                this.A = null;
                this.a(pulsescanner.f.c.a.PREPARE);
            }
        }
    }

    private int a(class_1792 class_17922) {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = g.a.field_1724.method_31548().method_5438(i2);
            try {
                if (class_17992.method_7909() != class_17922) continue;
                return i2;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
        }
        return -1;
    }

    private void w() {
        this.y();
        this.u();
    }

    private boolean j(class_2338 class_23382) {
        block6: {
            boolean bl;
            block8: {
                block7: {
                    try {
                        if (class_23382 == null || this.p == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    double d2 = this.p.method_23317() - ((double)class_23382.method_10263() + 0.5);
                    double d3 = this.p.method_23321() - ((double)class_23382.method_10260() + 0.5);
                    double d4 = Math.abs(this.p.method_5829().field_1322 - ((double)class_23382.method_10264() + 1.0));
                    try {
                        try {
                            if (!(d2 * d2 + d3 * d3 <= 16.0) || !(d4 <= 4.5)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private class_1657 x() {
        class_1657 class_16572 = null;
        double d2 = Double.MAX_VALUE;
        for (class_1657 class_16573 : g.a.field_1687.method_18456()) {
            try {
                if (pulsescanner.f.c.o.b((class_1297)class_16573) || !this.c(class_16573)) continue;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
            double d3 = g.a.field_1724.method_5858((class_1297)class_16573);
            if (!(d3 < d2)) continue;
            d2 = d3;
            class_16572 = class_16573;
        }
        return class_16572;
    }

    private void g(long l2) {
        block16: {
            class_3965 class_39652;
            class_1268 class_12682;
            block18: {
                block17: {
                    block15: {
                        class_12682 = this.t();
                        try {
                            if (class_12682 != null) break block15;
                            this.w();
                            break block16;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                    }
                    class_39652 = this.x;
                    try {
                        if (class_39652 != null || !this.d(this.A)) break block17;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    class_39652 = this.b(this.A);
                }
                if (class_39652 == null) {
                    class_243 class_2432 = new class_243((double)this.A.method_10263() + 0.5, (double)this.A.method_10264() + 1.0, (double)this.A.method_10260() + 0.5);
                    class_39652 = new class_3965(class_2432, class_2350.field_11036, this.A, false);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    this.x = class_39652;
                                    if (this.d(this.A) && !this.a(class_39652.method_17784(), 3.0f)) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw g.a(matchException);
                                }
                                if (!this.z.i()) break block18;
                            }
                            catch (MatchException matchException) {
                                throw g.a(matchException);
                            }
                            if (!this.d(this.A)) break block18;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        if (this.a(this.A, class_39652.method_17784())) break block18;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    this.x = null;
                    break block16;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
            }
            this.a(class_39652, class_12682, l2);
        }
    }

    private double a(double d2, double d3) {
        double d4;
        try {
            d4 = d3 <= d2 ? d2 : ThreadLocalRandom.current().nextDouble(d2, d3);
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        return d4;
    }

    private ak c(class_243 class_2432) {
        class_243 class_2433 = class_2432.method_1020(g.a.field_1724.method_33571());
        double d2 = Math.hypot(class_2433.field_1352, class_2433.field_1350);
        float f2 = (float)(Math.toDegrees(Math.atan2(class_2433.field_1350, class_2433.field_1352)) - 90.0);
        float f3 = (float)(-Math.toDegrees(Math.atan2(class_2433.field_1351, d2)));
        return new ak(f2, f3);
    }

    private void y() {
        block6: {
            try {
                try {
                    try {
                        if (this.y == -1 || g.a.field_1724 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                    if (g.a.field_1761 == null) break block6;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                g.a.field_1724.method_31548().method_61496(this.y);
                g.a.field_1761.method_2911();
                this.y = -1;
            }
            catch (MatchException matchException) {
                throw g.a(matchException);
            }
        }
    }

    private float a(float f2, float f3, float f4) {
        float f5 = Math.abs(f2);
        try {
            if (f5 <= 0.08f) {
                return f2;
            }
        }
        catch (MatchException matchException) {
            throw g.a(matchException);
        }
        float f6 = Math.max(0.85f, f5 * f4);
        return Math.copySign(Math.min(f5, Math.min(f3, f6)), f2);
    }

    private class_243 c(class_1511 class_15112) {
        if (this.c(this.A)) {
            class_238 class_2382 = class_15112.method_5829();
            class_243 class_2432 = this.f(this.A);
            return new class_243(class_3532.method_15350((double)class_2432.field_1352, (double)(class_2382.field_1323 + 0.04), (double)(class_2382.field_1320 - 0.04)), class_3532.method_15350((double)class_2432.field_1351, (double)(class_2382.field_1322 + 0.04), (double)(class_2382.field_1325 - 0.04)), class_3532.method_15350((double)class_2432.field_1350, (double)(class_2382.field_1321 + 0.04), (double)(class_2382.field_1324 - 0.04)));
        }
        return this.b(class_15112);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "(:7t\u0014\u0016\u0000\r<7=<\u0016\u001a\u0000<4?(&.;+\u0016\u001a\u00000;8*\u000eN\u0019?;7#\u0004N\b=>t$\u0005\u000b\b8)t%\u0005\u0017\u001a';85W\u000f\u001b</:\"W\u0000\f2(6?W\u001e\u00052#14\u0004@\u000b+!?5-W*\f?;-\u0007;2#7'\u0004\u001a";
                var4_3 = "(:7t\u0014\u0016\u0000\r<7=<\u0016\u001a\u0000<4?(&.;+\u0016\u001a\u00000;8*\u000eN\u0019?;7#\u0004N\b=>t$\u0005\u000b\b8)t%\u0005\u0017\u001a';85W\u000f\u001b</:\"W\u0000\f2(6?W\u001e\u00052#14\u0004@\u000b+!?5-W*\f?;-\u0007;2#7'\u0004\u001a".length();
                var1_4 = 17;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 20;
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
                    var2_2 = "#(*.;\u001f\u000b@\u001b&/.\u000e25'<;\u0017\b\u000ez\u0000-*\u001b\u0003";
                    var4_3 = "#(*.;\u001f\u000b@\u001b&/.\u000e25'<;\u0017\b\u000ez\u0000-*\u001b\u0003".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 29;
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
                        v11 = 125;
                        break;
                    }
                    case 1: {
                        v11 = 71;
                        break;
                    }
                    case 2: {
                        v11 = 78;
                        break;
                    }
                    case 3: {
                        v11 = 64;
                        break;
                    }
                    case 4: {
                        v11 = 82;
                        break;
                    }
                    case 5: {
                        v11 = 99;
                        break;
                    }
                    default: {
                        v11 = 122;
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
        g.B = var5;
        g.q = new class_2350[]{class_2350.field_11033, class_2350.field_11043, class_2350.field_11035, class_2350.field_11034, class_2350.field_11039, class_2350.field_11036};
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

