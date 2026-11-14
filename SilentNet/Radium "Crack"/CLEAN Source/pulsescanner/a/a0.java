/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10185
 *  net.minecraft.class_744
 */
package pulsescanner.a;

import net.minecraft.class_10185;
import net.minecraft.class_744;
import pulsescanner.a.as;
import pulsescanner.f.i;

public class a0
extends class_744 {
    public boolean a = false;
    public class_10185 b;
    public float c;
    public float d;
    private static final String[] e;

    public static a0 a(class_10185 class_101852) {
        return new a0(class_101852);
    }

    public String toString() {
        String string;
        boolean bl = this.b.comp_3159();
        boolean bl2 = this.b.comp_3160();
        boolean bl3 = this.b.comp_3161();
        boolean bl4 = this.b.comp_3162();
        boolean bl5 = this.b.comp_3163();
        boolean bl6 = this.b.comp_3164();
        boolean bl7 = this.b.comp_3165();
        boolean bl8 = bl5;
        int n2 = as.q();
        boolean bl9 = bl4;
        boolean bl10 = bl3;
        boolean bl11 = bl2;
        boolean bl12 = bl;
        try {
            string = e[4] + bl12 + e[5] + bl11 + e[6] + bl10 + e[2] + bl9 + e[3] + bl8 + e[1] + bl7 + e[0] + bl6 + ")";
            if (i.n() != null) {
                as.c(++n2);
            }
        }
        catch (MatchException matchException) {
            throw a0.a(matchException);
        }
        return string;
    }

    public a0(class_10185 class_101852) {
        this.b = class_101852;
    }

    /*
     * Unable to fully structure code
     */
    public void a() {
        block29: {
            block28: {
                block27: {
                    block25: {
                        block24: {
                            block21: {
                                block23: {
                                    block22: {
                                        var1_1 = as.q();
                                        try {
                                            try {
                                                try {
                                                    v0 = this;
                                                    if (var1_1 != 0) break block21;
                                                    if (v0.b.comp_3159() != this.b.comp_3160()) {
                                                    }
                                                    ** GOTO lbl27
                                                }
                                                catch (MatchException v1) {
                                                    throw a0.a(v1);
                                                }
                                                v2 = this;
                                                if (!this.b.comp_3159()) break block22;
                                            }
                                            catch (MatchException v3) {
                                                throw a0.a(v3);
                                            }
                                            v4 = 1.0f;
                                            break block23;
                                        }
                                        catch (MatchException v5) {
                                            throw a0.a(v5);
                                        }
                                    }
                                    v4 = -1.0f;
                                }
                                try {
                                    v2.c = v4;
                                    if (var1_1 == 0) break block24;
lbl27:
                                    // 2 sources

                                    v0 = this;
                                }
                                catch (MatchException v6) {
                                    throw a0.a(v6);
                                }
                            }
                            v0.c = 0.0f;
                        }
                        try {
                            block26: {
                                try {
                                    try {
                                        v7 = this;
                                        if (var1_1 != 0) break block25;
                                        if (v7.b.comp_3161() != this.b.comp_3162()) break block26;
                                    }
                                    catch (MatchException v8) {
                                        throw a0.a(v8);
                                    }
                                    this.d = 0.0f;
                                    if (var1_1 == 0) break block27;
                                }
                                catch (MatchException v9) {
                                    throw a0.a(v9);
                                }
                            }
                            v7 = this;
                        }
                        catch (MatchException v10) {
                            throw a0.a(v10);
                        }
                    }
                    try {
                        v11 = this.b.comp_3161() != false ? 1.0f : -1.0f;
                    }
                    catch (MatchException v12) {
                        throw a0.a(v12);
                    }
                    v7.d = v11;
                }
                try {
                    try {
                        v13 = this;
                        if (var1_1 != 0) break block28;
                        if (!v13.b.comp_3164()) break block29;
                    }
                    catch (MatchException v14) {
                        throw a0.a(v14);
                    }
                    this.d *= 0.3f;
                    v13 = this;
                }
                catch (MatchException v15) {
                    throw a0.a(v15);
                }
            }
            v13.c *= 0.3f;
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
                var2_2 = "Zunr;N\u0002\u0019\"s#\r\u000by=m$K/\u0018!tp3\u0004\n\u000by=l=^.\u0002hf\f\u000by=t!T6\u001f;z#/\u001f%<pk8X2\u00131Mr5@#\u0004\u001csn!Mn\u0010:oi5K\"\u0005hf";
                var4_3 = "Zunr;N\u0002\u0019\"s#\r\u000by=m$K/\u0018!tp3\u0004\n\u000by=l=^.\u0002hf\f\u000by=t!T6\u001f;z#/\u001f%<pk8X2\u00131Mr5@#\u0004\u001csn!Mn\u0010:oi5K\"\u0005hf".length();
                var1_4 = 11;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 90;
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
                    var2_2 = "\u0011c'f/@7\u001b.u`=\u001e'\t\u0011c'h+E(Q4";
                    var4_3 = "\u0011c'f/@7\u001b.u`=\u001e'\t\u0011c'h+E(Q4".length();
                    var1_4 = 14;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 64;
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
                        v11 = 44;
                        break;
                    }
                    case 1: {
                        v11 = 15;
                        break;
                    }
                    case 2: {
                        v11 = 71;
                        break;
                    }
                    case 3: {
                        v11 = 68;
                        break;
                    }
                    case 4: {
                        v11 = 14;
                        break;
                    }
                    case 5: {
                        v11 = 99;
                        break;
                    }
                    default: {
                        v11 = 28;
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
        a0.e = var5;
    }
}

