/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_490
 */
package pulsescanner.f.c;

import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_490;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.ax;
import pulsescanner.a.u;
import pulsescanner.a.y;
import pulsescanner.d.d;
import pulsescanner.f.c.t;

public class m
extends as {
    private final at m;
    private final ax n;
    private static final String[] o;

    private class_1735 s() {
        class_1661 class_16612 = pulsescanner.f.c.m.a.field_1724.method_31548();
        for (class_1735 class_17352 : pulsescanner.f.c.m.a.field_1724.field_7512.field_7761) {
            int n2 = class_17352.method_34266();
            try {
                try {
                    try {
                        try {
                            try {
                                if (class_17352.field_7871 != class_16612 || n2 < 0) continue;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.m.a(matchException);
                            }
                            if (n2 >= 36) continue;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.m.a(matchException);
                        }
                        if (n2 == -1) continue;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.m.a(matchException);
                    }
                    if (!class_17352.method_7677().method_31574(class_1802.field_8288)) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.m.a(matchException);
                }
                return class_17352;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.m.a(matchException);
            }
        }
        return null;
    }

    private void a(class_1735 class_17352) {
        pulsescanner.f.c.m.a.field_1761.method_2906(pulsescanner.f.c.m.a.field_1724.field_7512.field_7763, class_17352.field_7874, 40, class_1713.field_7791, (class_1657)pulsescanner.f.c.m.a.field_1724);
    }

    public m() {
        String[] stringArray = o;
        super(stringArray[1], stringArray[2]);
        this.n = new ax(this, stringArray[0], 1.0f, 1.0f, 9.0f, 1.0f);
        this.m = new at(this, stringArray[4], false);
    }

    private void a(class_1799 class_17992) {
        try {
            if (class_17992.method_31574(class_1802.field_8288)) {
                pulsescanner.d.d.a(this, o[3], -879028, 2.0f, null);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.m.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    @y
    public void a(u var1_1) {
        block47: {
            block60: {
                block59: {
                    block58: {
                        block57: {
                            block56: {
                                block53: {
                                    block55: {
                                        block54: {
                                            block51: {
                                                block52: {
                                                    block50: {
                                                        block49: {
                                                            block48: {
                                                                block46: {
                                                                    var2_2 = t.y();
                                                                    try {
                                                                        try {
                                                                            v0 = pulsescanner.f.c.m.a;
                                                                            if (var2_2 != null) break block46;
                                                                            if (!(v0.field_1755 instanceof class_490)) break block47;
                                                                        }
                                                                        catch (MatchException v1) {
                                                                            throw pulsescanner.f.c.m.a(v1);
                                                                        }
                                                                        v0 = pulsescanner.f.c.m.a;
                                                                    }
                                                                    catch (MatchException v2) {
                                                                        throw pulsescanner.f.c.m.a(v2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var2_2 != null) break block48;
                                                                        if (v0.field_1724 == null) break block47;
                                                                    }
                                                                    catch (MatchException v3) {
                                                                        throw pulsescanner.f.c.m.a(v3);
                                                                    }
                                                                    v0 = pulsescanner.f.c.m.a;
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw pulsescanner.f.c.m.a(v4);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var2_2 != null) break block49;
                                                                    if (v0.field_1761 == null) break block47;
                                                                }
                                                                catch (MatchException v5) {
                                                                    throw pulsescanner.f.c.m.a(v5);
                                                                }
                                                                v0 = pulsescanner.f.c.m.a;
                                                            }
                                                            catch (MatchException v6) {
                                                                throw pulsescanner.f.c.m.a(v6);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v7 = v0.field_1724.method_5805();
                                                                if (var2_2 != null) break block50;
                                                                if (v7 == 0) break block47;
                                                            }
                                                            catch (MatchException v8) {
                                                                throw pulsescanner.f.c.m.a(v8);
                                                            }
                                                            v7 = Math.round(this.n.g()) - 1;
                                                        }
                                                        catch (MatchException v9) {
                                                            throw pulsescanner.f.c.m.a(v9);
                                                        }
                                                    }
                                                    var3_3 = v7;
                                                    try {
                                                        try {
                                                            v10 = pulsescanner.f.c.m.a.field_1724;
                                                            if (var2_2 != null) break block51;
                                                            if (v10.method_31548().method_67532() == var3_3) break block52;
                                                        }
                                                        catch (MatchException v11) {
                                                            throw pulsescanner.f.c.m.a(v11);
                                                        }
                                                        pulsescanner.f.c.m.a.field_1724.method_31548().method_61496(var3_3);
                                                        pulsescanner.f.c.m.a.field_1761.method_2911();
                                                    }
                                                    catch (MatchException v12) {
                                                        throw pulsescanner.f.c.m.a(v12);
                                                    }
                                                }
                                                v10 = pulsescanner.f.c.m.a.field_1724;
                                            }
                                            try {
                                                v13 = v10.method_6079();
                                                v14 = class_1802.field_8288;
                                                if (var2_2 != null) break block53;
                                                if (!v13.method_31574(v14)) {
                                                }
                                                ** GOTO lbl96
                                            }
                                            catch (MatchException v15) {
                                                throw pulsescanner.f.c.m.a(v15);
                                            }
                                            var4_4 = this.s();
                                            try {
                                                try {
                                                    if (var2_2 != null) break block54;
                                                    if (var4_4 == null) break block55;
                                                }
                                                catch (MatchException v16) {
                                                    throw pulsescanner.f.c.m.a(v16);
                                                }
                                                this.a(var4_4);
                                            }
                                            catch (MatchException v17) {
                                                throw pulsescanner.f.c.m.a(v17);
                                            }
                                        }
                                        this.a(pulsescanner.f.c.m.a.field_1724.method_6079());
                                    }
                                    try {
                                        try {
                                            if (var2_2 == null) break block47;
lbl96:
                                            // 2 sources

                                            v18 = pulsescanner.f.c.m.a;
                                            if (var2_2 != null) break block56;
                                        }
                                        catch (MatchException v19) {
                                            throw pulsescanner.f.c.m.a(v19);
                                        }
                                        v13 = v18.field_1724.method_31548().method_5438(var3_3);
                                        v14 = class_1802.field_8288;
                                    }
                                    catch (MatchException v20) {
                                        throw pulsescanner.f.c.m.a(v20);
                                    }
                                }
                                try {
                                    if (v13.method_31574(v14)) break block47;
                                    v18 = pulsescanner.f.c.m.a;
                                }
                                catch (MatchException v21) {
                                    throw pulsescanner.f.c.m.a(v21);
                                }
                            }
                            try {
                                try {
                                    try {
                                        v22 = v18.field_1724.method_31548().method_5438(var3_3).method_7960();
                                        if (var2_2 != null) break block57;
                                        if (v22) break block58;
                                    }
                                    catch (MatchException v23) {
                                        throw pulsescanner.f.c.m.a(v23);
                                    }
                                    v24 = this;
                                    if (var2_2 != null) break block59;
                                }
                                catch (MatchException v25) {
                                    throw pulsescanner.f.c.m.a(v25);
                                }
                                v22 = v24.m.i();
                            }
                            catch (MatchException v26) {
                                throw pulsescanner.f.c.m.a(v26);
                            }
                        }
                        if (!v22) break block47;
                    }
                    v24 = this;
                }
                var4_4 = v24.s();
                try {
                    try {
                        if (var2_2 != null) break block60;
                        if (var4_4 == null) break block47;
                    }
                    catch (MatchException v27) {
                        throw pulsescanner.f.c.m.a(v27);
                    }
                    this.a(var4_4);
                }
                catch (MatchException v28) {
                    throw pulsescanner.f.c.m.a(v28);
                }
            }
            this.a(pulsescanner.f.c.m.a.field_1724.method_31548().method_5438(var3_3));
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
                var5 = new String[5];
                var3_1 = 0;
                var2_2 = "5L\u0013\u0003\u000f ]\rL\u0013\u000e V\u0013\tBI`\u0017\u00033\t\u0016ec<,L\u0011\u0003\u0011 z\u000eW\u0002\u000b\u0011 g\u000fW\bF\u001bo{\u0013\u0003\b\u0000\u0004ho\u000fGG\u0011\nib\u0004\u0003\u001e\t\u0017r.\bM\u0011\u0003\fta\u0013ZG\u000f\u0011 a\u0011F\tH";
                var4_3 = "5L\u0013\u0003\u000f ]\rL\u0013\u000e V\u0013\tBI`\u0017\u00033\t\u0016ec<,L\u0011\u0003\u0011 z\u000eW\u0002\u000b\u0011 g\u000fW\bF\u001bo{\u0013\u0003\b\u0000\u0004ho\u000fGG\u0011\nib\u0004\u0003\u001e\t\u0017r.\bM\u0011\u0003\fta\u0013ZG\u000f\u0011 a\u0011F\tH".length();
                var1_4 = 10;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 125;
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
                    var2_2 = "C:euyV\u001df x`d\u0013\u001c\u0005Q:csq";
                    var4_3 = "C:euyV\u001df x`d\u0013\u001c\u0005Q:csq".length();
                    var1_4 = 14;
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
                        v11 = 28;
                        break;
                    }
                    case 1: {
                        v11 = 94;
                        break;
                    }
                    case 2: {
                        v11 = 26;
                        break;
                    }
                    case 3: {
                        v11 = 27;
                        break;
                    }
                    case 4: {
                        v11 = 31;
                        break;
                    }
                    case 5: {
                        v11 = 125;
                        break;
                    }
                    default: {
                        v11 = 115;
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
        pulsescanner.f.c.m.o = var5;
    }
}

