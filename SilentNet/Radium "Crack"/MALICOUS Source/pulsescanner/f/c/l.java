/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3966
 */
package pulsescanner.f.c;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import pulsescanner.a.ac;
import pulsescanner.a.aj;
import pulsescanner.a.ak;
import pulsescanner.a.am;
import pulsescanner.a.as;
import pulsescanner.a.aw;
import pulsescanner.a.ax;
import pulsescanner.a.d;
import pulsescanner.a.o;
import pulsescanner.a.u;
import pulsescanner.a.y;
import pulsescanner.f.c.t;
import pulsescanner.f.m;

public class l
extends as {
    public static int m;
    public aw n;
    public ax o;
    public aw p;
    public static class_1309 q;
    private static final String[] r;

    public static l s() {
        return pulsescanner.f.m.a(l.class);
    }

    @y
    public void a(o o2) {
        try {
            if (this.n.c(r[7])) {
                q = (class_1309)o2.d();
                m = 0;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
    }

    public void a(class_1309 class_13092) {
        ak ak2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        class_243 class_2432;
        String string;
        aw aw2;
        block3: {
            block4: {
                String[] stringArray = t.y();
                try {
                    aw2 = this.n;
                    string = r[3];
                    if (stringArray != null) break block3;
                    if (!aw2.c(string)) break block4;
                }
                catch (MatchException matchException) {
                    throw l.a(matchException);
                }
                class_2432 = aj.a(class_13092.method_5829(), false).method_1020(l.a.field_1724.method_33571());
                f7 = (float)Math.toDegrees(Math.atan2(-class_2432.field_1352, class_2432.field_1350));
                f6 = (float)class_3532.method_15350((double)(-Math.toDegrees(Math.atan2(class_2432.field_1351, Math.hypot(class_2432.field_1352, class_2432.field_1350)))), (double)-90.0, (double)90.0);
                f5 = (float)Math.cos((double)System.currentTimeMillis() / 40.0);
                f4 = (float)Math.sin((double)System.currentTimeMillis() / 70.0);
                f3 = f5 * ac.c(1.0f, 2.0f);
                f2 = f4 * ac.c(1.0f, 2.0f);
                ak2 = new ak(f7 + f3, am.b + f2);
                pulsescanner.a.d.a(ak2, ac.c(12.0f, 25.0f), ac.c(22.0f, 25.0f), ac.c(24.0f, 26.0f), ac.c(24.0f, 26.0f), 0, 15, false);
            }
            aw2 = this.n;
            string = r[10];
        }
        if (aw2.c(string)) {
            class_2432 = class_13092.method_73189().method_1031(0.0, (double)(class_13092.method_17682() / 2.0f), 0.0).method_1020(l.a.field_1724.method_33571()).method_1029();
            f7 = (float)Math.toDegrees(Math.atan2(-class_2432.field_1352, class_2432.field_1350));
            f6 = (float)class_3532.method_15350((double)(-Math.toDegrees(Math.atan2(class_2432.field_1351, Math.hypot(class_2432.field_1352, class_2432.field_1350)))), (double)-90.0, (double)90.0);
            f5 = (float)Math.cos((double)System.currentTimeMillis() / 180.0);
            f4 = (float)Math.sin((double)System.currentTimeMillis() / 180.0);
            f3 = f5 * ac.c(2.0f, 4.0f);
            f2 = f4 * ac.c(2.0f, 4.0f);
            ak2 = new ak(f7 + f3, f6 + f2);
            pulsescanner.a.d.a(ak2, ac.c(152.0f, 255.0f), ac.c(125.0f, 255.0f), ac.c(152.0f, 255.0f), ac.c(152.0f, 255.0f), 0, 15, false);
        }
    }

    /*
     * Unable to fully structure code
     */
    @y
    public void a(u var1_1) {
        block50: {
            block64: {
                block62: {
                    block63: {
                        block61: {
                            block60: {
                                block52: {
                                    block59: {
                                        block58: {
                                            block56: {
                                                block57: {
                                                    block55: {
                                                        block54: {
                                                            block53: {
                                                                block51: {
                                                                    block49: {
                                                                        var2_2 = t.y();
                                                                        try {
                                                                            try {
                                                                                v0 = l.a;
                                                                                if (var2_2 != null) break block49;
                                                                                if (v0.field_1724 == null) break block50;
                                                                            }
                                                                            catch (MatchException v1) {
                                                                                throw l.a(v1);
                                                                            }
                                                                            v0 = l.a;
                                                                        }
                                                                        catch (MatchException v2) {
                                                                            throw l.a(v2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (v0.field_1687 == null) break block50;
                                                                                    v3 = this.p;
                                                                                    v4 = l.r[1];
                                                                                    if (var2_2 != null) break block51;
                                                                                }
                                                                                catch (MatchException v5) {
                                                                                    throw l.a(v5);
                                                                                }
                                                                                if (!v3.c(v4)) break block50;
                                                                            }
                                                                            catch (MatchException v6) {
                                                                                throw l.a(v6);
                                                                            }
                                                                            v7 = this;
                                                                            if (var2_2 != null) break block52;
                                                                        }
                                                                        catch (MatchException v8) {
                                                                            throw l.a(v8);
                                                                        }
                                                                        v3 = v7.n;
                                                                        v4 = l.r[3];
                                                                    }
                                                                    catch (MatchException v9) {
                                                                        throw l.a(v9);
                                                                    }
                                                                }
                                                                if (!v3.c(v4)) break block59;
                                                                var4_3 = l.a.field_1765;
                                                                try {
                                                                    if (var2_2 != null) break block53;
                                                                    if (var4_3 instanceof class_3966) {
                                                                    }
                                                                    ** GOTO lbl53
                                                                }
                                                                catch (MatchException v10) {
                                                                    throw l.a(v10);
                                                                }
                                                                var3_4 = (class_3966)var4_3;
                                                                try {
                                                                    if (var2_2 == null) break block54;
lbl53:
                                                                    // 2 sources

                                                                    l.q = null;
                                                                }
                                                                catch (MatchException v11) {
                                                                    throw l.a(v11);
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        var5_5 = var3_4.method_17782();
                                                        try {
                                                            if (var2_2 != null) break block55;
                                                            if (var5_5 instanceof class_1309) {
                                                            }
                                                            ** GOTO lbl77
                                                        }
                                                        catch (MatchException v12) {
                                                            throw l.a(v12);
                                                        }
                                                        var4_3 = (class_1309)var5_5;
                                                        try {
                                                            try {
                                                                v13 = l.a.field_1724;
                                                                if (var2_2 != null) break block56;
                                                                if (!(v13.method_5739((class_1297)var4_3) > 4.0f)) break block57;
                                                            }
                                                            catch (MatchException v14) {
                                                                throw l.a(v14);
                                                            }
lbl77:
                                                            // 2 sources

                                                            l.q = null;
                                                        }
                                                        catch (MatchException v15) {
                                                            throw l.a(v15);
                                                        }
                                                    }
                                                    return;
                                                }
                                                v13 = var4_3;
                                            }
                                            try {
                                                try {
                                                    if (var2_2 != null) break block58;
                                                    if (v13 instanceof class_1657) {
                                                    }
                                                    ** GOTO lbl104
                                                }
                                                catch (MatchException v16) {
                                                    throw l.a(v16);
                                                }
                                                v13 = var4_3;
                                            }
                                            catch (MatchException v17) {
                                                throw l.a(v17);
                                            }
                                        }
                                        var5_5 = (class_1657)v13;
                                        try {
                                            l.q = var5_5;
                                            this.a((class_1309)var5_5);
                                            if (var2_2 == null) break block59;
lbl104:
                                            // 2 sources

                                            l.q = null;
                                        }
                                        catch (MatchException v18) {
                                            throw l.a(v18);
                                        }
                                    }
                                    v7 = this;
                                }
                                try {
                                    try {
                                        if (!v7.n.c(l.r[10])) break block50;
                                        v19 = l.q;
                                        if (var2_2 != null) break block60;
                                    }
                                    catch (MatchException v20) {
                                        throw l.a(v20);
                                    }
                                    if (v19 == null) break block50;
                                }
                                catch (MatchException v21) {
                                    throw l.a(v21);
                                }
                                v19 = l.q;
                            }
                            try {
                                try {
                                    v22 = v19.method_5805();
                                    if (var2_2 != null) break block61;
                                    if (v22 != 0) {
                                    }
                                    ** GOTO lbl147
                                }
                                catch (MatchException v23) {
                                    throw l.a(v23);
                                }
                                cfr_temp_0 = l.a.field_1724.method_5739((class_1297)l.q) - 4.0f;
                                v22 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            }
                            catch (MatchException v24) {
                                throw l.a(v24);
                            }
                        }
                        try {
                            try {
                                if (var2_2 != null) break block62;
                                if (v22 <= 0) break block63;
                            }
                            catch (MatchException v25) {
                                throw l.a(v25);
                            }
lbl147:
                            // 2 sources

                            l.q = null;
                            return;
                        }
                        catch (MatchException v26) {
                            throw l.a(v26);
                        }
                    }
                    try {
                        this.a(l.q);
                        if (var2_2 != null) break block64;
                        v22 = ++l.m;
                    }
                    catch (MatchException v27) {
                        throw l.a(v27);
                    }
                }
                try {
                    if (v22 < 3) break block50;
                    l.q = null;
                }
                catch (MatchException v28) {
                    throw l.a(v28);
                }
            }
            l.m = 0;
        }
    }

    public l() {
        String[] stringArray = r;
        super(stringArray[11], stringArray[2]);
        this.o = new ax(this, stringArray[5], 0.3f, 0.1f, 1.0f, 0.1f);
        this.p = new aw(this, stringArray[8], new String[]{stringArray[0], stringArray[9]});
        this.n = (aw)new aw(this, stringArray[6], new String[]{stringArray[4], stringArray[10]}).a(this::lambda$new$0);
    }

    @Override
    public String f() {
        return this.o.j();
    }

    private boolean lambda$new$0() {
        return this.p.c(r[1]);
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
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "\u001by\u000euG\u000f\b\u0007y\byR\nC;<\u0018w\u0017}UCC!~\u0019j\u0006\u0013@4o\u0019jUCI4e\u0015}TCX:6\u0014qRCN,6\u0019vJ\u0002^2\u007f\u0012\u007f\u0006\u0017D0\u007f\u000e8N\nX7y\u00046\b\u0016y\u0012kR\u0002B!\b\u0016y\u0012kR\u0002B!\u000b\u001d\u007f\bzI\u001b\f\u0006\u007f\u0006}\r\u0007y\byR\nC;61wB\u0006\u0006\u001ax\\PO\u0017\u0004\u0018y\u0018}\b\u0007y\byR\nC;";
                var4_3 = "\u001by\u000euG\u000f\b\u0007y\byR\nC;<\u0018w\u0017}UCC!~\u0019j\u0006\u0013@4o\u0019jUCI4e\u0015}TCX:6\u0014qRCN,6\u0019vJ\u0002^2\u007f\u0012\u007f\u0006\u0017D0\u007f\u000e8N\nX7y\u00046\b\u0016y\u0012kR\u0002B!\b\u0016y\u0012kR\u0002B!\u000b\u001d\u007f\bzI\u001b\f\u0006\u007f\u0006}\r\u0007y\byR\nC;61wB\u0006\u0006\u001ax\\PO\u0017\u0004\u0018y\u0018}\b\u0007y\byR\nC;".length();
                var1_4 = 6;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 67;
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
                    var2_2 = "4Vr~a9\b3Q&Tg5g\b";
                    var4_3 = "4Vr~a9\b3Q&Tg5g\b".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 109;
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
                        v11 = 22;
                        break;
                    }
                    case 1: {
                        v11 = 85;
                        break;
                    }
                    case 2: {
                        v11 = 63;
                        break;
                    }
                    case 3: {
                        v11 = 91;
                        break;
                    }
                    case 4: {
                        v11 = 101;
                        break;
                    }
                    case 5: {
                        v11 = 32;
                        break;
                    }
                    default: {
                        v11 = 111;
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
        l.r = var5;
    }
}

