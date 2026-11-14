/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10185
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1802
 */
package pulsescanner.f.c;

import net.minecraft.class_10185;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1802;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.ax;
import pulsescanner.a.m;
import pulsescanner.a.u;
import pulsescanner.a.w;
import pulsescanner.a.y;
import pulsescanner.d.d;

public class t
extends as {
    public final ax m;
    public final at n;
    private static t o;
    private boolean p;
    private boolean q;
    private static String[] r;
    private static final String[] s;

    @y
    public void a(w w2) {
        this.p = false;
        this.q = false;
    }

    public static boolean s() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (o == null || !o.b()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw t.a(matchException);
                        }
                        if (!t.o.p) break block6;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @y
    public void a(u u2) {
        block15: {
            boolean bl;
            block18: {
                block17: {
                    try {
                        try {
                            block16: {
                                try {
                                    try {
                                        try {
                                            try {
                                                this.t();
                                                this.p = false;
                                                this.q = false;
                                                if (t.a.field_1724 == null || t.a.field_1761 == null) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw t.a(matchException);
                                            }
                                            if (!t.a.field_1724.method_5805()) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw t.a(matchException);
                                        }
                                        if (!t.a.field_1724.method_6079().method_31574(class_1802.field_8288)) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw t.a(matchException);
                                    }
                                    if (!this.u()) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw t.a(matchException);
                                }
                            }
                            t t2 = this;
                            if (this.v() == null) break block17;
                        }
                        catch (MatchException matchException) {
                            throw t.a(matchException);
                        }
                        bl = true;
                        break block18;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                }
                bl = false;
            }
            try {
                t2.p = bl;
                if (this.p) {
                    t.a.field_1724.method_5728(false);
                }
            }
            catch (MatchException matchException) {
                throw t.a(matchException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void t() {
        block68: {
            block74: {
                block75: {
                    block73: {
                        block93: {
                            block71: {
                                block72: {
                                    block70: {
                                        block69: {
                                            block91: {
                                                block67: {
                                                    var1_1 = t.y();
                                                    v0 = t.s();
                                                    if (var1_1 != null) break block67;
                                                    try {
                                                        block90: {
                                                            if (!v0) break block68;
                                                            break block90;
                                                            catch (MatchException v1) {
                                                                throw t.a(v1);
                                                            }
                                                        }
                                                        v0 = this.q;
                                                    }
                                                    catch (MatchException v2) {
                                                        throw t.a(v2);
                                                    }
                                                }
                                                if (!v0) break block68;
                                                v3 = t.a;
                                                if (var1_1 != null) break block69;
                                                break block91;
                                                catch (MatchException v4) {
                                                    throw t.a(v4);
                                                }
                                            }
                                            try {
                                                block92: {
                                                    if (v3.field_1724 == null) break block68;
                                                    break block92;
                                                    catch (MatchException v5) {
                                                        throw t.a(v5);
                                                    }
                                                }
                                                v3 = t.a;
                                            }
                                            catch (MatchException v6) {
                                                throw t.a(v6);
                                            }
                                        }
                                        try {
                                            if (var1_1 == null) {
                                                if (v3.field_1761 == null) break block68;
                                            }
                                            ** GOTO lbl45
                                        }
                                        catch (MatchException v7) {
                                            throw t.a(v7);
                                        }
                                        v3 = t.a;
lbl45:
                                        // 2 sources

                                        try {
                                            if (var1_1 == null) {
                                                if (v3.field_1724.method_5805()) break block70;
                                            }
                                            ** GOTO lbl60
                                        }
                                        catch (MatchException v8) {
                                            throw t.a(v8);
                                        }
                                        this.p = false;
                                        this.q = false;
                                        return;
                                    }
                                    v3 = t.a;
lbl60:
                                    // 2 sources

                                    try {
                                        v9 = v3.field_1724.method_6079().method_31574(class_1802.field_8288);
                                        if (var1_1 != null) break block71;
                                        if (v9 != 0) break block72;
                                    }
                                    catch (MatchException v10) {
                                        throw t.a(v10);
                                    }
                                    v9 = 1;
                                    break block71;
                                }
                                v9 = 0;
                            }
                            var2_2 = v9;
                            v11 = var2_2;
                            if (var1_1 != null) break block73;
                            if (v11 != 0) break block74;
                            break block93;
                            catch (MatchException v12) {
                                throw t.a(v12);
                            }
                        }
                        try {
                            block94: {
                                v13 = this;
                                if (var1_1 != null) break block75;
                                break block94;
                                catch (MatchException v14) {
                                    throw t.a(v14);
                                }
                            }
                            v11 = v13.u();
                        }
                        catch (MatchException v15) {
                            throw t.a(v15);
                        }
                    }
                    if (v11 != 0) break block74;
                    this.p = false;
                    v13 = this;
                }
                v13.q = false;
                return;
            }
            try {
                block89: {
                    block87: {
                        block88: {
                            block85: {
                                block86: {
                                    block84: {
                                        block83: {
                                            block99: {
                                                block76: {
                                                    block82: {
                                                        block81: {
                                                            block80: {
                                                                block79: {
                                                                    block78: {
                                                                        block77: {
                                                                            block96: {
                                                                                block95: {
                                                                                    var3_3 = t.a.field_1724.field_3913.field_54155;
                                                                                    if (var1_1 != null) break block76;
                                                                                    if (var3_3.comp_3159()) break block76;
                                                                                    break block95;
                                                                                    catch (MatchException v16) {
                                                                                        throw t.a(v16);
                                                                                    }
                                                                                }
                                                                                v17 = var3_3;
                                                                                if (var1_1 != null) break block77;
                                                                                break block96;
                                                                                catch (MatchException v18) {
                                                                                    throw t.a(v18);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block97: {
                                                                                    if (v17.comp_3160()) break block76;
                                                                                    break block97;
                                                                                    catch (MatchException v19) {
                                                                                        throw t.a(v19);
                                                                                    }
                                                                                }
                                                                                v17 = var3_3;
                                                                                if (var1_1 != null) break block78;
                                                                            }
                                                                            catch (MatchException v20) {
                                                                                throw t.a(v20);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v17.comp_3161()) break block76;
                                                                            v17 = var3_3;
                                                                            if (var1_1 != null) break block79;
                                                                        }
                                                                        catch (MatchException v21) {
                                                                            throw t.a(v21);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v17.comp_3162()) break block76;
                                                                        v17 = var3_3;
                                                                        if (var1_1 != null) break block80;
                                                                    }
                                                                    catch (MatchException v22) {
                                                                        throw t.a(v22);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v17.comp_3163()) break block76;
                                                                    v17 = var3_3;
                                                                    if (var1_1 != null) break block81;
                                                                }
                                                                catch (MatchException v23) {
                                                                    throw t.a(v23);
                                                                }
                                                            }
                                                            try {
                                                                if (v17.comp_3164()) break block76;
                                                                v17 = var3_3;
                                                            }
                                                            catch (MatchException v24) {
                                                                throw t.a(v24);
                                                            }
                                                        }
                                                        v25 = v17.comp_3165();
                                                        if (var1_1 != null) break block82;
                                                        try {
                                                            block98: {
                                                                if (v25) break block76;
                                                                break block98;
                                                                catch (MatchException v26) {
                                                                    throw t.a(v26);
                                                                }
                                                            }
                                                            v25 = t.a.field_1724.method_5624();
                                                        }
                                                        catch (MatchException v27) {
                                                            throw t.a(v27);
                                                        }
                                                    }
                                                    if (!v25) break block99;
                                                }
                                                return;
                                            }
                                            var4_4 = this.v();
                                            try {
                                                if (var1_1 != null) break block83;
                                                if (var4_4 != null) break block84;
                                            }
                                            catch (MatchException v28) {
                                                throw t.a(v28);
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        v29 = var2_2;
                                        if (var1_1 != null) break block85;
                                        if (v29 == 0) break block86;
                                    }
                                    catch (MatchException v30) {
                                        throw t.a(v30);
                                    }
                                    v29 = 40;
                                    break block85;
                                }
                                v29 = t.a.field_1724.method_31548().method_67532();
                            }
                            var5_5 = v29;
                            v31 = t.a;
                            if (var1_1 != null) break block87;
                            try {
                                block100: {
                                    v31.field_1761.method_2906(t.a.field_1724.field_7512.field_7763, var4_4.field_7874, var5_5, class_1713.field_7791, (class_1657)t.a.field_1724);
                                    if (var2_2 == 0) break block88;
                                    break block100;
                                    catch (MatchException v32) {
                                        throw t.a(v32);
                                    }
                                }
                                v33 = t.a.field_1724.method_6079();
                                break block89;
                            }
                            catch (MatchException v34) {
                                throw t.a(v34);
                            }
                        }
                        v31 = t.a;
                    }
                    v33 = v31.field_1724.method_6047();
                }
                var6_6 = v33;
                if (var1_1 != null) break block68;
                try {
                    block101: {
                        if (!var6_6.method_31574(class_1802.field_8288)) break block68;
                        break block101;
                        catch (MatchException v35) {
                            throw t.a(v35);
                        }
                    }
                    pulsescanner.d.d.a(this, t.s[3], -879028, 2.0f, null);
                }
                catch (MatchException v36) {
                    throw t.a(v36);
                }
            }
            finally {
                this.p = false;
                this.q = false;
            }
        }
    }

    private boolean u() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!this.n.i() || !(t.a.field_1724.method_6032() / 2.0f <= this.m.g())) break block6;
                        }
                        catch (MatchException matchException) {
                            throw t.a(matchException);
                        }
                        if (t.a.field_1724.method_6047().method_31574(class_1802.field_8288)) break block6;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    protected void p() {
        this.p = false;
        this.q = false;
    }

    public t() {
        String[] stringArray = s;
        super(stringArray[4], stringArray[1]);
        this.n = new at(this, stringArray[0], false);
        this.m = (ax)new ax(this, stringArray[2], 10.0f, 0.0f, 10.0f, 0.1f).a(this::lambda$new$0);
        o = this;
    }

    private class_1735 v() {
        class_1661 class_16612 = t.a.field_1724.method_31548();
        for (class_1735 class_17352 : t.a.field_1724.field_7512.field_7761) {
            try {
                try {
                    try {
                        try {
                            if (class_17352.field_7871 != class_16612 || class_17352.method_34266() < 0) continue;
                        }
                        catch (MatchException matchException) {
                            throw t.a(matchException);
                        }
                        if (class_17352.method_34266() >= 36) continue;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                    if (!class_17352.method_7677().method_31574(class_1802.field_8288)) continue;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
                return class_17352;
            }
            catch (MatchException matchException) {
                throw t.a(matchException);
            }
        }
        return null;
    }

    public void w() {
        block4: {
            try {
                try {
                    if (!t.s() || t.a.field_1724 == null) break block4;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
                t.a.field_1724.field_3913.field_54155 = new class_10185(false, false, false, false, false, false, false);
                t.a.field_1724.method_5728(false);
                this.q = true;
            }
            catch (MatchException matchException) {
                throw t.a(matchException);
            }
        }
    }

    public static t x() {
        return o;
    }

    @y(a=-500)
    public void a(m m2) {
        block4: {
            try {
                try {
                    if (!t.s() || t.a.field_1724 == null) break block4;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
                t.a.field_1724.method_5728(false);
                m2.a(false);
            }
            catch (MatchException matchException) {
                throw t.a(matchException);
            }
        }
    }

    private boolean lambda$new$0() {
        return this.n.i();
    }

    public static void b(String[] stringArray) {
        r = stringArray;
    }

    public static String[] y() {
        return r;
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
                var5 = new String[5];
                var3_1 = 0;
                var2_2 = "@\f,? 5mL\u0002796V\u0006?4 <>$\u001a6(>p\"b\u00051<\"4mp\f-8!p9l\u0006y0#=(j\u0017y$#%mw\u00176-l=\"r\n7:b\u0006L\u00068188";
                var4_3 = "@\f,? 5mL\u0002796V\u0006?4 <>$\u001a6(>p\"b\u00051<\"4mp\f-8!p9l\u0006y0#=(j\u0017y$#%mw\u00176-l=\"r\n7:b\u0006L\u00068188".length();
                t.b(null);
                var1_4 = 11;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 19;
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
                    var2_2 = "5iH]D\u0015M\u0010sUHYPL\n sHW\taG\u0015cQ";
                    var4_3 = "5iH]D\u0015M\u0010sUHYPL\n sHW\taG\u0015cQ".length();
                    var1_4 = 14;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 118;
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
                        v11 = 23;
                        break;
                    }
                    case 1: {
                        v11 = 112;
                        break;
                    }
                    case 2: {
                        v11 = 74;
                        break;
                    }
                    case 3: {
                        v11 = 78;
                        break;
                    }
                    case 4: {
                        v11 = 95;
                        break;
                    }
                    case 5: {
                        v11 = 67;
                        break;
                    }
                    default: {
                        v11 = 94;
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
        t.s = var5;
    }
}

