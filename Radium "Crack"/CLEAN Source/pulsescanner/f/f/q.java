/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_259
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_640
 *  org.joml.Matrix3x2fStack
 */
package pulsescanner.f.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_640;
import org.joml.Matrix3x2fStack;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.g.b;
import pulsescanner.g.d;
import pulsescanner.g.e;
import pulsescanner.g.m;
import pulsescanner.g.n;
import pulsescanner.i.c;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class q
extends i {
    public final g l;
    public final c m;
    public final c n;
    public final f o;
    public final pulsescanner.i.d p;
    public final c q;
    public final g r;
    public final g s;
    public final c t;
    public final c u;
    public final c v;
    public final c w;
    public final c x;
    public final c y;
    public final g z;
    public final c A;
    public final c B;
    public final c C;
    public final c D;
    public final c E;
    public final f F;
    public final g G;
    public final g H;
    private static i[] I;
    private static final String[] J;

    public q() {
        String[] stringArray = J;
        super(stringArray[18], stringArray[32], pulsescanner.f.h.ESP);
        this.l = this.a(new g(stringArray[60], stringArray[35], 256.0, 16.0, 512.0, 8.0, "m"));
        this.m = this.a(new c(stringArray[4], stringArray[3], true));
        this.n = this.a(new c(stringArray[9], stringArray[23], false));
        this.o = this.a(new f(stringArray[53], stringArray[55], stringArray[31], stringArray[31], stringArray[24], stringArray[10], stringArray[11]));
        this.p = (pulsescanner.i.d)this.a(new pulsescanner.i.d(stringArray[12], stringArray[29], -1)).a(this::lambda$new$0);
        this.q = this.a(new c(stringArray[14], stringArray[42], true));
        this.r = (g)this.a(new g(stringArray[26], stringArray[13], 0.0, 0.0, 60.0, 1.0, "%")).a(this.q::a);
        this.s = (g)this.a(new g(stringArray[1], stringArray[28], 2.0, 0.5, 6.0, 0.1)).a(this.q::a);
        this.t = this.a(new c(stringArray[21], stringArray[8], true));
        this.u = (c)this.a(new c(stringArray[41], stringArray[49], false)).a(this.q::a);
        this.v = this.a(new c(stringArray[47], stringArray[44], false));
        this.w = this.a(new c(stringArray[19], stringArray[6], true));
        this.x = this.a(new c(stringArray[27], stringArray[30], true));
        this.y = (c)this.a(new c(stringArray[45], stringArray[37], true)).a(this.x::a);
        this.z = (g)this.a(new g(stringArray[46], stringArray[51], 1.0, 0.5, 2.0, 0.05, "x")).a(this.x::a);
        this.A = (c)this.a(new c(stringArray[5], stringArray[0], true)).a(this.x::a);
        this.B = (c)this.a(new c(stringArray[40], stringArray[38], true)).a(this.x::a);
        this.C = (c)this.a(new c(stringArray[56], stringArray[34], false)).a(this.x::a);
        this.D = (c)this.a(new c(stringArray[52], stringArray[54], true)).a(this.x::a);
        this.E = (c)this.a(new c(stringArray[58], stringArray[59], true)).a(this.x::a);
        this.F = this.a(new f(stringArray[15], stringArray[7], stringArray[22], stringArray[22], stringArray[2], stringArray[43]));
        this.G = (g)this.a(new g(stringArray[36], stringArray[57], 60.0, 20.0, 200.0, 2.0)).a(this::lambda$new$1);
        this.H = (g)this.a(new g(stringArray[25], stringArray[17], 6.0, 3.0, 14.0, 0.5)).a(this::lambda$new$2);
    }

    private List<class_1657> o() {
        ArrayList<class_1657> arrayList = new ArrayList<class_1657>();
        try {
            if (!this.m()) {
                return arrayList;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.q.a(matchException);
        }
        double d2 = (Double)this.l.a() * (Double)this.l.a();
        boolean bl = pulsescanner.f.f.q.a.field_1690.method_31044().method_31034();
        for (class_1657 class_16572 : pulsescanner.f.f.q.a.field_1687.method_18456()) {
            block17: {
                try {
                    if (class_16572 != pulsescanner.f.f.q.a.field_1724) break block17;
                    if (!((Boolean)this.n.a()).booleanValue()) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.q.a(matchException);
                }
                try {
                    if (bl) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.q.a(matchException);
                }
            }
            try {
                try {
                    if (class_16572.method_5767() && !((Boolean)this.m.a()).booleanValue()) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.q.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.q.a(matchException);
            }
            try {
                if (class_16572.method_5858((class_1297)pulsescanner.f.f.q.a.field_1724) > d2) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.q.a(matchException);
            }
            arrayList.add(class_16572);
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    public int a(class_1657 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    public boolean p() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.b() || !((Boolean)this.v.a()).booleanValue()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.q.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.q.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean q() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!this.b() || !((Boolean)this.x.a()).booleanValue()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.q.a(matchException);
                        }
                        if (!((Boolean)this.y.a()).booleanValue()) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.q.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.q.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void b(class_4587 class_45872, class_4184 class_41842, float f2) {
        Object object;
        block7: {
            try {
                try {
                    if (((Boolean)this.q.a()).booleanValue() || ((Boolean)this.v.a()).booleanValue()) break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.q.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.q.a(matchException);
            }
        }
        Object object2 = new ArrayList<m>();
        for (class_1657 object3 : this.o()) {
            object = object3.method_30950(f2);
            class_238 class_2382 = object3.method_5829().method_997(object.method_1020(object3.method_73189()));
            object2.add(pulsescanner.g.m.a(class_259.method_1078((class_238)class_2382), this.a(object3)));
        }
        if (!((Boolean)this.q.a()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                object = (m)iterator.next();
                arrayList.add(new m(new double[0], List.of(), ((m)object).aS(), ((m)object).aT()));
            }
            object2 = arrayList;
        }
        pulsescanner.g.d.a(class_45872, class_41842, object2, new n(this.s.g(), (int)((Double)this.r.a() * 2.55), (Boolean)this.t.a(), (Boolean)this.u.a(), (Boolean)this.v.a(), (Boolean)this.w.a()));
    }

    public void b(class_332 class_3322, float f2) {
        List<class_1657> list = this.o();
        try {
            if (list.isEmpty()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.q.a(matchException);
        }
        if (((Boolean)this.x.a()).booleanValue()) {
            for (class_1657 class_16572 : list) {
                this.a(class_3322, class_16572, f2);
            }
        }
        if (!this.F.a(J[43])) {
            for (class_1657 class_16572 : list) {
                this.b(class_3322, class_16572, f2);
            }
        }
    }

    private void a(class_332 class_3322, class_1657 class_16572, float f2) {
        block75: {
            Matrix3x2fStack matrix3x2fStack;
            block77: {
                ArrayList<class_1799> arrayList;
                float f3;
                ArrayList<class_1799> arrayList2;
                i[] iArray;
                block76: {
                    float f4;
                    ArrayList<String[]> arrayList3;
                    block73: {
                        String string;
                        block74: {
                            float f5;
                            float f6;
                            int n2;
                            float f7;
                            block66: {
                                float[] fArray;
                                block67: {
                                    class_1657 class_16573;
                                    block70: {
                                        int n3;
                                        block68: {
                                            block69: {
                                                float f8;
                                                block65: {
                                                    float f9;
                                                    q q2;
                                                    block62: {
                                                        block63: {
                                                            class_310 class_3102;
                                                            block64: {
                                                                Object t2;
                                                                block60: {
                                                                    block61: {
                                                                        block55: {
                                                                            block56: {
                                                                                int n4;
                                                                                float f10;
                                                                                block59: {
                                                                                    float f11;
                                                                                    block57: {
                                                                                        block58: {
                                                                                            class_243 class_2432 = class_16572.method_30950(f2).method_1031(0.0, (double)class_16572.method_17682() + 0.35, 0.0);
                                                                                            iArray = pulsescanner.f.f.q.r();
                                                                                            fArray = pulsescanner.g.h.a(class_2432);
                                                                                            try {
                                                                                                if (!pulsescanner.g.h.a(fArray, 60.0f)) {
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.f.q.a(matchException);
                                                                                            }
                                                                                            string = class_16572.method_5477().getString();
                                                                                            arrayList3 = new ArrayList<String[]>();
                                                                                            try {
                                                                                                t2 = this.A.a();
                                                                                                if (iArray != null) break block55;
                                                                                                if (!((Boolean)t2).booleanValue()) break block56;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.f.q.a(matchException);
                                                                                            }
                                                                                            f10 = class_16572.method_6032() + class_16572.method_6067();
                                                                                            f7 = Math.max(0.0f, Math.min(1.0f, f10 / class_16572.method_6063()));
                                                                                            try {
                                                                                                try {
                                                                                                    float f11 = f7 - 0.5f;
                                                                                                    f11 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                                                                    if (iArray != null) break block57;
                                                                                                    if (f11 <= 0) break block58;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw pulsescanner.f.f.q.a(matchException);
                                                                                                }
                                                                                                n4 = pulsescanner.g.b.a(-11930, -9699442, (f7 - 0.5f) * 2.0f);
                                                                                                break block59;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.f.q.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        f11 = -41892;
                                                                                    }
                                                                                    n4 = pulsescanner.g.b.a((int)f11, -11930, f7 * 2.0f);
                                                                                }
                                                                                int n5 = n4;
                                                                                String[] stringArray = new String[2];
                                                                                String[] stringArray2 = J;
                                                                                stringArray[0] = String.format(Locale.ROOT, stringArray2[48], Float.valueOf(f10));
                                                                                stringArray[1] = Integer.toHexString(n5);
                                                                                arrayList3.add(stringArray);
                                                                            }
                                                                            t2 = this.B.a();
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (iArray != null) break block60;
                                                                                if (!((Boolean)t2).booleanValue()) break block61;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.f.q.a(matchException);
                                                                            }
                                                                            arrayList3.add(new String[]{Math.round(pulsescanner.f.f.q.a.field_1724.method_5739((class_1297)class_16572)) + "m", Integer.toHexString(-6645085)});
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.f.q.a(matchException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        q2 = this;
                                                                        if (iArray != null) break block62;
                                                                        t2 = q2.C.a();
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.f.q.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (!((Boolean)t2).booleanValue()) break block63;
                                                                            class_3102 = a;
                                                                            if (iArray != null) break block64;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.f.q.a(matchException);
                                                                        }
                                                                        if (class_3102.method_1562() == null) break block63;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.f.q.a(matchException);
                                                                    }
                                                                    class_3102 = a;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.f.q.a(matchException);
                                                                }
                                                            }
                                                            class_640 class_6402 = class_3102.method_1562().method_2871(class_16572.method_5667());
                                                            try {
                                                                if (class_6402 != null) {
                                                                    arrayList3.add(new String[]{class_6402.method_2959() + J[20], Integer.toHexString(-6645085)});
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.f.q.a(matchException);
                                                            }
                                                        }
                                                        q2 = this;
                                                    }
                                                    n2 = q2.a(class_16572);
                                                    try {
                                                        f9 = (Boolean)this.E.a() != false ? 9.0f : 0.0f;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.f.q.a(matchException);
                                                    }
                                                    f7 = f9;
                                                    f6 = 7.0f + f7 + (float)pulsescanner.g.e.b(string) + 7.0f;
                                                    for (String[] object22 : arrayList3) {
                                                        f8 = f6;
                                                        if (iArray == null) {
                                                            f6 = f8 + (float)(pulsescanner.g.e.a(object22[0]) + 6);
                                                            if (iArray == null) continue;
                                                        }
                                                        break block65;
                                                    }
                                                    f8 = 15.0f;
                                                }
                                                f5 = f8;
                                                arrayList2 = new ArrayList<class_1799>();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (iArray != null) break block66;
                                                                if (!((Boolean)this.D.a()).booleanValue()) break block67;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.f.q.a(matchException);
                                                            }
                                                            n3 = class_16572.method_6047().method_7960();
                                                            if (iArray != null) break block68;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.f.q.a(matchException);
                                                        }
                                                        if (n3 != 0) break block69;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.f.q.a(matchException);
                                                    }
                                                    arrayList2.add(class_16572.method_6047());
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.f.q.a(matchException);
                                                }
                                            }
                                            n3 = 4;
                                        }
                                        class_1304[] class_1304Array = new class_1304[n3];
                                        class_1304Array[0] = class_1304.field_6169;
                                        class_1304Array[1] = class_1304.field_6174;
                                        class_1304Array[2] = class_1304.field_6172;
                                        class_1304Array[3] = class_1304.field_6166;
                                        class_1304[] f13 = class_1304Array;
                                        int f14 = f13.length;
                                        int f32 = 0;
                                        while (f32 < f14) {
                                            block71: {
                                                block72: {
                                                    class_1304 f42 = f13[f32];
                                                    class_16573 = class_16572;
                                                    if (iArray != null) break block70;
                                                    class_1799 f15 = class_16573.method_6118(f42);
                                                    try {
                                                        try {
                                                            if (iArray != null) break block71;
                                                            if (f15.method_7960()) break block72;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.f.q.a(matchException);
                                                        }
                                                        arrayList2.add(f15);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.f.q.a(matchException);
                                                    }
                                                }
                                                ++f32;
                                            }
                                            if (iArray == null) continue;
                                        }
                                        class_16573 = class_16572;
                                    }
                                    try {
                                        boolean bl;
                                        try {
                                            bl = class_16573.method_6079().method_7960();
                                            if (iArray != null || bl) break block67;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.f.q.a(matchException);
                                        }
                                        bl = arrayList2.add(class_16572.method_6079());
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.f.q.a(matchException);
                                    }
                                }
                                class_3322.method_51448().pushMatrix();
                                class_3322.method_51448().translate(fArray[0], fArray[1]);
                            }
                            float f13 = this.z.g();
                            class_3322.method_51448().scale(f13, f13);
                            float f14 = -f6 / 2.0f;
                            f3 = -f5;
                            pulsescanner.g.b.b(class_3322, f14, f3 + 1.0f, f6, f5, f5 / 2.0f, 6.0f, 0x40000000);
                            pulsescanner.g.b.a(class_3322, f14, f3, f6, f5, f5 / 2.0f, -668983260, -669772774);
                            pulsescanner.g.b.a(class_3322, f14, f3, f6, f5, f5 / 2.0f, pulsescanner.c.c.a(), 0x33FFFFFF);
                            f4 = f14 + 7.0f;
                            try {
                                if (iArray != null) break block73;
                                if (!((Boolean)this.E.a()).booleanValue()) break block74;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.q.a(matchException);
                            }
                            pulsescanner.g.b.b(class_3322, f4 + 2.5f, f3 + f5 / 2.0f, 5.0f, pulsescanner.g.b.a(n2, 102));
                            pulsescanner.g.b.a(class_3322, f4 + 2.5f, f3 + f5 / 2.0f, 2.0f, n2 | 0xFF000000);
                            f4 += f7;
                        }
                        pulsescanner.g.e.a(class_3322, string, f4, f3 + 4.0f, -592136, true, false);
                        f4 += (float)(pulsescanner.g.e.b(string) + 6);
                    }
                    for (String[] f16 : arrayList3) {
                        pulsescanner.g.e.a(class_3322, f16[0], f4, f3 + 4.0f, (int)Long.parseLong(f16[1], 16));
                        if (iArray == null) {
                            f4 += (float)(pulsescanner.g.e.a(f16[0]) + 6);
                            if (iArray == null) continue;
                        }
                        break block75;
                    }
                    try {
                        try {
                            arrayList = arrayList2;
                            if (iArray != null) break block76;
                            if (arrayList.isEmpty()) break block77;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.q.a(matchException);
                        }
                        arrayList = arrayList2;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.q.a(matchException);
                    }
                }
                float f15 = (float)arrayList.size() * 13.0f;
                float f16 = -f15 / 2.0f;
                float f17 = f3 - 15.0f;
                for (class_1799 class_17992 : arrayList2) {
                    matrix3x2fStack = class_3322.method_51448().pushMatrix();
                    if (iArray == null) {
                        class_3322.method_51448().translate(f16, f17);
                        class_3322.method_51448().scale(0.75f, 0.75f);
                        class_3322.method_51427(class_17992, 0, 0);
                        class_3322.method_51448().popMatrix();
                        f16 += 13.0f;
                        if (iArray == null) continue;
                    }
                    break block75;
                }
            }
            matrix3x2fStack = class_3322.method_51448().popMatrix();
        }
    }

    private void b(class_332 class_3322, class_1657 class_16572, float f2) {
        float f3;
        float f4;
        int n2;
        Object object;
        class_243 class_2432 = class_16572.method_30950(f2).method_1031(0.0, (double)(class_16572.method_17682() / 2.0f), 0.0);
        if (this.F.a(J[16])) {
            object = pulsescanner.g.h.a(class_2432);
            try {
                if (pulsescanner.g.h.a((float[])object, -8.0f)) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.q.a(matchException);
            }
        }
        object = pulsescanner.g.h.b();
        double d2 = class_2432.field_1352 - object.field_1352;
        double d3 = class_2432.field_1350 - object.field_1350;
        float f5 = (float)Math.toDegrees(Math.atan2(-d2, d3));
        float f6 = (float)Math.toRadians(f5 - pulsescanner.g.h.c());
        float f7 = (float)class_3322.method_51421() / 2.0f;
        float f8 = (float)class_3322.method_51443() / 2.0f;
        float f9 = this.G.g();
        float f10 = this.H.g();
        float f11 = f7 + (float)Math.sin(f6) * f9;
        float f12 = f8 - (float)Math.cos(f6) * f9;
        float f13 = (float)Math.sin(f6);
        float f14 = (float)Math.cos(f6);
        float[] fArray = new float[]{0.0f, -f10, f10 * 0.8f, f10 * 0.7f, 0.0f, f10 * 0.25f, -f10 * 0.8f, f10 * 0.7f};
        float[] fArray2 = new float[fArray.length];
        for (n2 = 0; n2 < fArray.length; n2 += 2) {
            f4 = fArray[n2];
            f3 = fArray[n2 + 1];
            fArray2[n2] = f11 + f4 * f14 - f3 * f13;
            fArray2[n2 + 1] = f12 + f4 * f13 + f3 * f14;
        }
        n2 = this.a(class_16572);
        f4 = pulsescanner.f.f.q.a.field_1724.method_5739((class_1297)class_16572);
        f3 = (float)Math.max(0.45, Math.min(1.0, 1.2 - (double)f4 / (Double)this.l.a()));
        float[] fArray3 = new float[]{fArray2[0], fArray2[1], fArray2[4], fArray2[5], fArray2[6], fArray2[7]};
        float[] fArray4 = new float[]{fArray2[0], fArray2[1], fArray2[2], fArray2[3], fArray2[4], fArray2[5]};
        try {
            pulsescanner.g.b.b(class_3322, f11, f12, f10 * 1.6f, pulsescanner.g.b.a(n2, (int)(64.0f * f3)));
            if (((Boolean)this.t.a()).booleanValue()) {
                pulsescanner.g.b.a(class_3322, fArray2, true, 1.6f, pulsescanner.g.b.a(0, (int)(112.0f * f3)));
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.q.a(matchException);
        }
        pulsescanner.g.b.a(class_3322, pulsescanner.f.f.q.a(fArray3), pulsescanner.g.b.a(n2 | 0xFF000000, f3));
        pulsescanner.g.b.a(class_3322, pulsescanner.f.f.q.a(fArray4), pulsescanner.g.b.a(n2 | 0xFF000000, f3));
    }

    private static float[] a(float[] fArray) {
        float f2 = (fArray[2] - fArray[0]) * (fArray[5] - fArray[1]) - (fArray[3] - fArray[1]) * (fArray[4] - fArray[0]);
        try {
            if (f2 < 0.0f) {
                return new float[]{fArray[0], fArray[1], fArray[4], fArray[5], fArray[2], fArray[3]};
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.q.a(matchException);
        }
        return fArray;
    }

    private boolean lambda$new$2() {
        boolean bl;
        try {
            bl = !this.F.a(J[39]);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.q.a(matchException);
        }
        return bl;
    }

    private boolean lambda$new$1() {
        boolean bl;
        try {
            bl = !this.F.a(J[43]);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.q.a(matchException);
        }
        return bl;
    }

    private boolean lambda$new$0() {
        return this.o.a(J[33]);
    }

    public static void b(i[] iArray) {
        I = iArray;
    }

    public static i[] r() {
        return I;
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
                var5 = new String[61];
                var3_1 = 0;
                var2_2 = "sXx}3r\u0014A\\cb3u\u001f\u0000^vgvn\u0010GC9\nlYyo3M\u0018DD\u007f\u0006a\\`kji\u001ai^tff~\u0014\u0000Yy|zi\u0018B\\r*cv\u0010YUey=\u000esXx}3S\u001fVYdcqv\u0014\u0006hUvfgr\u001asUr*cv\u0010YUey3x\u0014HYyn3x\u001dOS|y=6s]vf\u007f:\u0010RBx}`:\u0010R_bdw:\u0005HU7iau\u0002SXvca:\u0001OYy~zt\u0016\u0000Qc*cv\u0010YUey=\u001etX~d3~\u0010R[7fzt\u0014\u0000EynvhQOEcfzt\u0014S\u001e\tsXx}3I\u0014LV\bdYd~rt\u0012E\u0004tUvg\u0005c_{ea$b_o*u{\u0012E\u0010xzry\u0018TI7\"#:L\u0000_b~\u007fs\u001fE\u0010xd\u007fcX\u000e\u0003b_o\u0006aBeedi\noVq'@y\u0003EUy\u0013sYmo3u\u0017\u0000D\u007fo3{\u0003R_`y=\np\\vsvhQecG\rtXeef}\u0019\u0000gvf\u007fi\u0002MC\u0010c_y~a{\u0002T\u0010X\u007fgv\u0018NU\noVq'@y\u0003EUy!i^tff~\u0014\u0000Ix\u007fai\u0014LV7c}:\u0005HYen3j\u0014RCxd=\u0006hUvfgr\naBeed:\"IJr\u0004fY{f\bnQzog{\u0016S\u0012oEcfzt\u0014\u0000D\u007fcpq\u001fECd$\rp\\vsvhQC_{ea4#c\\rk}:\u0016LQdy3t\u0010MUcktiQARx|v:\u0001LQnoai_\u0006cEd~|w4oEcfzt\u0014S\u001c7drw\u0014TQpy3{\u001fD\u0010sca\u007f\u0012TYxd3{\u0003R_`y3|\u001eR\u0010gfrc\u0014RC9\u0006cEd~|w\u0016sXx}3j\u0018NW7e}:\u001fA]r~r}\u0002\u000e\u001bmQoc~o\u001c\u0000T~yg{\u001fCU7c}:\u0013L_ta`4\faBeed:#AT~\u007f`\u001ehYso3W\u0018NUtxr|\u0005\u0007C7edtQNQzog{\u0016S\u001e\u001asXx}3~\u0018SDvdp\u007fQO^7drw\u0014TQpy=\u0003oVq\bdYd~rt\u0012E\u0004g\\x}\u0017oEcfzt\u0014\u0000Qeeft\u0015\u0000@{kj\u007f\u0003S\u001e\u0003oVq lYyo`:\u0017R_z*ju\u0004R\u0010acvmQT_7z\u007f{\bEBd$\u0011hYso3L\u0010NY{fr:%AWd\ttQp*@y\u0010LU\u0007tBvivh\u0002\u0004\u0005\u001e&l s_q~3}\u001dOG7kau\u0004NT7dv{\u0003BI7z\u007f{\bEBd$\u0004tUvg\rnQzog{\u0016\u0000C~pv4\u0005iDrg`\nc_{ea:<OTr(sXx}3r\u0014LT7cg\u007f\u001cS\u0010vdw:\u0010R]xx3o\u001fDUe*gr\u0014\u0000Dvm=\u0018h_`*cv\u0010YUey3{\u0003E\u0010te\u007fu\u0003ET9\u0004pYym&dYd~rt\u0012E\u0010xl3{\u0003R_`y3|\u0003O]7~{\u007fQCBxy`r\u0010IB9\tc_{ea:5OD";
                var4_3 = "sXx}3r\u0014A\\cb3u\u001f\u0000^vgvn\u0010GC9\nlYyo3M\u0018DD\u007f\u0006a\\`kji\u001ai^tff~\u0014\u0000Yy|zi\u0018B\\r*cv\u0010YUey=\u000esXx}3S\u001fVYdcqv\u0014\u0006hUvfgr\u001asUr*cv\u0010YUey3x\u0014HYyn3x\u001dOS|y=6s]vf\u007f:\u0010RBx}`:\u0010R_bdw:\u0005HU7iau\u0002SXvca:\u0001OYy~zt\u0016\u0000Qc*cv\u0010YUey=\u001etX~d3~\u0010R[7fzt\u0014\u0000EynvhQOEcfzt\u0014S\u001e\tsXx}3I\u0014LV\bdYd~rt\u0012E\u0004tUvg\u0005c_{ea$b_o*u{\u0012E\u0010xzry\u0018TI7\"#:L\u0000_b~\u007fs\u001fE\u0010xd\u007fcX\u000e\u0003b_o\u0006aBeedi\noVq'@y\u0003EUy\u0013sYmo3u\u0017\u0000D\u007fo3{\u0003R_`y=\np\\vsvhQecG\rtXeef}\u0019\u0000gvf\u007fi\u0002MC\u0010c_y~a{\u0002T\u0010X\u007fgv\u0018NU\noVq'@y\u0003EUy!i^tff~\u0014\u0000Ix\u007fai\u0014LV7c}:\u0005HYen3j\u0014RCxd=\u0006hUvfgr\naBeed:\"IJr\u0004fY{f\bnQzog{\u0016S\u0012oEcfzt\u0014\u0000D\u007fcpq\u001fECd$\rp\\vsvhQC_{ea4#c\\rk}:\u0016LQdy3t\u0010MUcktiQARx|v:\u0001LQnoai_\u0006cEd~|w4oEcfzt\u0014S\u001c7drw\u0014TQpy3{\u001fD\u0010sca\u007f\u0012TYxd3{\u0003R_`y3|\u001eR\u0010gfrc\u0014RC9\u0006cEd~|w\u0016sXx}3j\u0018NW7e}:\u001fA]r~r}\u0002\u000e\u001bmQoc~o\u001c\u0000T~yg{\u001fCU7c}:\u0013L_ta`4\faBeed:#AT~\u007f`\u001ehYso3W\u0018NUtxr|\u0005\u0007C7edtQNQzog{\u0016S\u001e\u001asXx}3~\u0018SDvdp\u007fQO^7drw\u0014TQpy=\u0003oVq\bdYd~rt\u0012E\u0004g\\x}\u0017oEcfzt\u0014\u0000Qeeft\u0015\u0000@{kj\u007f\u0003S\u001e\u0003oVq lYyo`:\u0017R_z*ju\u0004R\u0010acvmQT_7z\u007f{\bEBd$\u0011hYso3L\u0010NY{fr:%AWd\ttQp*@y\u0010LU\u0007tBvivh\u0002\u0004\u0005\u001e&l s_q~3}\u001dOG7kau\u0004NT7dv{\u0003BI7z\u007f{\bEBd$\u0004tUvg\rnQzog{\u0016\u0000C~pv4\u0005iDrg`\nc_{ea:<OTr(sXx}3r\u0014LT7cg\u007f\u001cS\u0010vdw:\u0010R]xx3o\u001fDUe*gr\u0014\u0000Dvm=\u0018h_`*cv\u0010YUey3{\u0003E\u0010te\u007fu\u0003ET9\u0004pYym&dYd~rt\u0012E\u0010xl3{\u0003R_`y3|\u0003O]7~{\u007fQCBxy`r\u0010IB9\tc_{ea:5OD".length();
                pulsescanner.f.f.q.b(null);
                var1_4 = 24;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 76;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "5\t-37)CV\u0002.(e#IV\u0012)9e8F\u0011H\u0005$\u0007/; ";
                    var4_3 = "5\t-37)CV\u0002.(e#IV\u0012)9e8F\u0011H\u0005$\u0007/; ".length();
                    var1_4 = 23;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 26;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (true) ** GOTO lbl72
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v11 = 108;
                        break;
                    }
                    case 1: {
                        v11 = 124;
                        break;
                    }
                    case 2: {
                        v11 = 91;
                        break;
                    }
                    case 3: {
                        v11 = 70;
                        break;
                    }
                    case 4: {
                        v11 = 95;
                        break;
                    }
                    case 5: {
                        v11 = 86;
                        break;
                    }
                    default: {
                        v11 = 61;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl72:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl80:
                // 1 sources

                ** continue;
            }
        }
        pulsescanner.f.f.q.J = var5;
    }
}

