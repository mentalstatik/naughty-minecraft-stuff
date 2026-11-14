/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_2769
 *  net.minecraft.class_3965
 *  net.minecraft.class_4969
 *  org.lwjgl.glfw.GLFW
 */
package pulsescanner.f.c;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_239;
import net.minecraft.class_2769;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import org.lwjgl.glfw.GLFW;
import pulsescanner.a.af;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.ax;
import pulsescanner.a.v;
import pulsescanner.a.y;
import pulsescanner.f.c.c;
import pulsescanner.f.c.k;
import pulsescanner.f.c.t;

public class b
extends as {
    private int m;
    private final at n;
    private boolean o;
    private final at p;
    private boolean q;
    private final ax r;
    private final ax s;
    private final ax t;
    private long u;
    private long v;
    private static final String[] w;

    private void a(class_3965 class_39652) {
        af.c(1);
        class_1269 class_12692 = pulsescanner.f.c.b.a.field_1761.method_2896(pulsescanner.f.c.b.a.field_1724, class_1268.field_5808, class_39652);
        try {
            if (class_12692.method_23665()) {
                pulsescanner.f.c.b.a.field_1724.method_6104(class_1268.field_5808);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.b.a(matchException);
        }
    }

    @Override
    protected void p() {
        this.u();
        super.p();
    }

    private boolean a(int n2, long l2) {
        block8: {
            boolean bl;
            block9: {
                try {
                    try {
                        try {
                            if (n2 < 0 || n2 > 8) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.b.a(matchException);
                        }
                        if (pulsescanner.f.c.b.a.field_1724.method_31548().method_67532() != n2) break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.b.a(matchException);
                    }
                    return this.a(l2);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.b.a(matchException);
                }
            }
            try {
                this.b(n2, l2);
                bl = this.t.g() <= 0.0f;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.b.a(matchException);
            }
            return bl;
        }
        return false;
    }

    public b() {
        String[] stringArray = w;
        super(stringArray[1], stringArray[3]);
        this.t = new ax(this, stringArray[6], 0.0f, 0.0f, 500.0f, 5.0f);
        this.r = new ax(this, stringArray[5], 0.0f, 0.0f, 500.0f, 5.0f);
        this.s = new ax(this, stringArray[2], 1.0f, 1.0f, 9.0f, 1.0f);
        this.n = new at(this, stringArray[4], false);
        this.p = new at(this, stringArray[0], true);
        this.m = -1;
    }

    @Override
    protected void o() {
        this.u();
        super.o();
    }

    private void s() {
        af.a(75L);
        pulsescanner.f.c.b.a.field_1690.field_1904.method_23481(false);
    }

    private boolean t() {
        boolean bl;
        try {
            bl = GLFW.glfwGetMouseButton((long)a.method_22683().method_4490(), (int)1) == 1;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.b.a(matchException);
        }
        return bl;
    }

    private void u() {
        this.v = 0L;
        this.u = 0L;
        this.m = -1;
        this.q = false;
        this.o = false;
    }

    private int a(class_1792 class_17922) {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = pulsescanner.f.c.b.a.field_1724.method_31548().method_5438(i2);
            try {
                if (!class_17992.method_31574(class_17922)) continue;
                return i2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.b.a(matchException);
            }
        }
        return -1;
    }

    private void b(int n2, long l2) {
        block6: {
            try {
                try {
                    try {
                        if (n2 < 0 || n2 > 8) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.b.a(matchException);
                    }
                    if (pulsescanner.f.c.b.a.field_1724.method_31548().method_67532() == n2) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.b.a(matchException);
                }
                pulsescanner.f.c.b.a.field_1724.method_31548().method_61496(n2);
                pulsescanner.f.c.b.a.field_1761.method_2911();
                this.m = n2;
                this.u = l2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.b.a(matchException);
            }
        }
    }

    private boolean a(long l2) {
        boolean bl;
        block5: {
            block4: {
                int n2 = pulsescanner.f.c.b.a.field_1724.method_31548().method_67532();
                try {
                    try {
                        if (n2 == this.m && l2 - this.u < (long)Math.round(this.t.g())) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.b.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.b.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean a(class_1792 class_17922, long l2) {
        boolean bl;
        try {
            if (pulsescanner.f.c.b.a.field_1724.method_6047().method_31574(class_17922)) {
                return this.a(l2);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.b.a(matchException);
        }
        int n2 = this.a(class_17922);
        try {
            if (n2 == -1) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.b.a(matchException);
        }
        try {
            this.b(n2, l2);
            bl = this.t.g() <= 0.0f;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.b.a(matchException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    @y
    public void a(v var1_1) {
        block76: {
            block84: {
                block83: {
                    block82: {
                        block81: {
                            block79: {
                                block78: {
                                    block77: {
                                        block74: {
                                            block73: {
                                                block72: {
                                                    var2_2 = pulsescanner.f.c.t.y();
                                                    try {
                                                        try {
                                                            v0 = pulsescanner.f.c.b.a;
                                                            if (var2_2 != null) break block72;
                                                            if (v0.field_1724 != null) {
                                                            }
                                                            ** GOTO lbl46
                                                        }
                                                        catch (MatchException v1) {
                                                            throw pulsescanner.f.c.b.a(v1);
                                                        }
                                                        v0 = pulsescanner.f.c.b.a;
                                                    }
                                                    catch (MatchException v2) {
                                                        throw pulsescanner.f.c.b.a(v2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var2_2 != null) break block73;
                                                        if (v0.field_1687 != null) {
                                                        }
                                                        ** GOTO lbl46
                                                    }
                                                    catch (MatchException v3) {
                                                        throw pulsescanner.f.c.b.a(v3);
                                                    }
                                                    v0 = pulsescanner.f.c.b.a;
                                                }
                                                catch (MatchException v4) {
                                                    throw pulsescanner.f.c.b.a(v4);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var2_2 != null) break block74;
                                                    if (v0.field_1761 != null) {
                                                    }
                                                    ** GOTO lbl46
                                                }
                                                catch (MatchException v5) {
                                                    throw pulsescanner.f.c.b.a(v5);
                                                }
                                                v0 = pulsescanner.f.c.b.a;
                                            }
                                            catch (MatchException v6) {
                                                throw pulsescanner.f.c.b.a(v6);
                                            }
                                        }
                                        try {
                                            try {
                                                block75: {
                                                    try {
                                                        if (v0.field_1755 == null) break block75;
lbl46:
                                                        // 4 sources

                                                        this.u();
                                                        if (var2_2 == null) break block76;
                                                    }
                                                    catch (MatchException v7) {
                                                        throw pulsescanner.f.c.b.a(v7);
                                                    }
                                                }
                                                v8 = pulsescanner.f.c.c.v();
                                                if (var2_2 != null) break block77;
                                            }
                                            catch (MatchException v9) {
                                                throw pulsescanner.f.c.b.a(v9);
                                            }
                                            if (v8) break block76;
                                        }
                                        catch (MatchException v10) {
                                            throw pulsescanner.f.c.b.a(v10);
                                        }
                                        v8 = k.u();
                                    }
                                    try {
                                        try {
                                            if (var2_2 != null) break block78;
                                            if (v8) break block76;
                                        }
                                        catch (MatchException v11) {
                                            throw pulsescanner.f.c.b.a(v11);
                                        }
                                        v8 = this.t();
                                    }
                                    catch (MatchException v12) {
                                        throw pulsescanner.f.c.b.a(v12);
                                    }
                                }
                                var3_3 = v8;
                                try {
                                    try {
                                        block80: {
                                            try {
                                                try {
                                                    v13 = var3_3;
                                                    if (var2_2 != null) break block79;
                                                    if (v13) break block80;
                                                }
                                                catch (MatchException v14) {
                                                    throw pulsescanner.f.c.b.a(v14);
                                                }
                                                this.q = false;
                                                this.o = false;
                                                this.m = -1;
                                                this.u = 0L;
                                                if (var2_2 == null) break block76;
                                            }
                                            catch (MatchException v15) {
                                                throw pulsescanner.f.c.b.a(v15);
                                            }
                                        }
                                        v16 = this;
                                        if (var2_2 != null) break block81;
                                    }
                                    catch (MatchException v17) {
                                        throw pulsescanner.f.c.b.a(v17);
                                    }
                                    v13 = v16.q;
                                }
                                catch (MatchException v18) {
                                    throw pulsescanner.f.c.b.a(v18);
                                }
                            }
                            if (!v13) break block83;
                            v16 = this;
                        }
                        try {
                            try {
                                if (var2_2 != null) break block82;
                                if (v16.p.i()) break block83;
                            }
                            catch (MatchException v19) {
                                throw pulsescanner.f.c.b.a(v19);
                            }
                            v16 = this;
                        }
                        catch (MatchException v20) {
                            throw pulsescanner.f.c.b.a(v20);
                        }
                    }
                    if (!v16.o) break block76;
                }
                var5_4 = pulsescanner.f.c.b.a.field_1765;
                try {
                    try {
                        v21 = var5_4;
                        if (var2_2 != null) break block84;
                        if (!(v21 instanceof class_3965)) break block76;
                    }
                    catch (MatchException v22) {
                        throw pulsescanner.f.c.b.a(v22);
                    }
                    v21 = var5_4;
                }
                catch (MatchException v23) {
                    throw pulsescanner.f.c.b.a(v23);
                }
            }
            if ((var4_5 = (class_3965)v21).method_17783() == class_239.class_240.field_1332) {
                block96: {
                    block95: {
                        block93: {
                            block94: {
                                block92: {
                                    block87: {
                                        block88: {
                                            block91: {
                                                block89: {
                                                    block90: {
                                                        block85: {
                                                            block86: {
                                                                var5_4 = pulsescanner.f.c.b.a.field_1687.method_8320(var4_5.method_17777());
                                                                try {
                                                                    try {
                                                                        if (var2_2 != null) break block85;
                                                                        if (var5_4.method_27852(class_2246.field_23152)) break block86;
                                                                    }
                                                                    catch (MatchException v24) {
                                                                        throw pulsescanner.f.c.b.a(v24);
                                                                    }
                                                                    return;
                                                                }
                                                                catch (MatchException v25) {
                                                                    throw pulsescanner.f.c.b.a(v25);
                                                                }
                                                            }
                                                            this.q = true;
                                                            this.o = true;
                                                            this.s();
                                                        }
                                                        var6_6 = System.currentTimeMillis();
                                                        try {
                                                            try {
                                                                try {
                                                                    v26 = (Integer)var5_4.method_11654((class_2769)class_4969.field_23153);
                                                                    if (var2_2 != null) break block87;
                                                                    if (v26 != 0) break block88;
                                                                }
                                                                catch (MatchException v27) {
                                                                    throw pulsescanner.f.c.b.a(v27);
                                                                }
                                                                cfr_temp_0 = var6_6 - this.v - (long)Math.round(this.r.g());
                                                                v28 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                if (var2_2 != null) break block89;
                                                            }
                                                            catch (MatchException v29) {
                                                                throw pulsescanner.f.c.b.a(v29);
                                                            }
                                                            if (v28 >= 0) break block90;
                                                        }
                                                        catch (MatchException v30) {
                                                            throw pulsescanner.f.c.b.a(v30);
                                                        }
                                                        return;
                                                    }
                                                    try {
                                                        v31 = this;
                                                        if (var2_2 != null) break block91;
                                                        v28 = (long)v31.a(class_1802.field_8801, var6_6);
                                                    }
                                                    catch (MatchException v32) {
                                                        throw pulsescanner.f.c.b.a(v32);
                                                    }
                                                }
                                                if (v28 == false) {
                                                    return;
                                                }
                                                this.a(var4_5);
                                                v31 = this;
                                            }
                                            v31.v = var6_6;
                                            return;
                                        }
                                        try {
                                            v33 = this;
                                            if (var2_2 != null) break block92;
                                            v26 = (int)v33.a(Math.round(this.s.g()) - 1, var6_6);
                                        }
                                        catch (MatchException v34) {
                                            throw pulsescanner.f.c.b.a(v34);
                                        }
                                    }
                                    if (v26 == 0) {
                                        return;
                                    }
                                    v33 = this;
                                }
                                try {
                                    try {
                                        v35 = v33.n.i();
                                        if (var2_2 != null) break block93;
                                        if (v35) break block94;
                                    }
                                    catch (MatchException v36) {
                                        throw pulsescanner.f.c.b.a(v36);
                                    }
                                    this.o = false;
                                    return;
                                }
                                catch (MatchException v37) {
                                    throw pulsescanner.f.c.b.a(v37);
                                }
                            }
                            try {
                                v38 = pulsescanner.f.c.b.a.field_1724;
                                if (var2_2 != null) break block95;
                                v35 = v38.method_6047().method_31574(class_1802.field_8801);
                            }
                            catch (MatchException v39) {
                                throw pulsescanner.f.c.b.a(v39);
                            }
                        }
                        try {
                            if (v35) break block96;
                            v38 = pulsescanner.f.c.b.a.field_1724;
                        }
                        catch (MatchException v40) {
                            throw pulsescanner.f.c.b.a(v40);
                        }
                    }
                    try {
                        if (!v38.method_6079().method_31574(class_1802.field_8801)) {
                            this.a(var4_5);
                            this.o = false;
                            return;
                        }
                    }
                    catch (MatchException v41) {
                        throw pulsescanner.f.c.b.a(v41);
                    }
                }
                return;
            }
        }
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
                var5 = new String[7];
                var3_1 = 0;
                var2_2 = "Qn\\\u0010\fCp^\u0015\u0011 \u001bO\u007f^\u000f\u0011\nVqI\u0018\u0013rhnqILAv\\\u000f\u00197H\"\u007f\u001d\u000f\u001b!KciS]\u001f<XjqO]\u0007=N\"\u007fO\u0018^>TmuT\u0013\u0019rZv>J\u0014\n:\u001berR\n\r&Tl{\u001d\u001c\u00106\u001bf{I\u0012\u00103Ogm\u001d\u0014\n|\fCkI\u0012^\u0017CrrR\u0019\u001b";
                var4_3 = "Qn\\\u0010\fCp^\u0015\u0011 \u001bO\u007f^\u000f\u0011\nVqI\u0018\u0013rhnqILAv\\\u000f\u00197H\"\u007f\u001d\u000f\u001b!KciS]\u001f<XjqO]\u0007=N\"\u007fO\u0018^>TmuT\u0013\u0019rZv>J\u0014\n:\u001berR\n\r&Tl{\u001d\u001c\u00106\u001bf{I\u0012\u00103Ogm\u001d\u0014\n|\fCkI\u0012^\u0017CrrR\u0019\u001b".length();
                var1_4 = 4;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 11;
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
                    var2_2 = "\u0019.\u0004WAoC\u001e#\tD_\u0005\u001e#\tD_";
                    var4_3 = "\u0019.\u0004WAoC\u001e#\tD_\u0005\u001e#\tD_".length();
                    var1_4 = 12;
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
                        v11 = 9;
                        break;
                    }
                    case 1: {
                        v11 = 21;
                        break;
                    }
                    case 2: {
                        v11 = 54;
                        break;
                    }
                    case 3: {
                        v11 = 118;
                        break;
                    }
                    case 4: {
                        v11 = 117;
                        break;
                    }
                    case 5: {
                        v11 = 89;
                        break;
                    }
                    default: {
                        v11 = 48;
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
        pulsescanner.f.c.b.w = var5;
    }
}

