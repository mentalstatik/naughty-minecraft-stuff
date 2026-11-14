/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.d;

import java.util.List;
import pulsescanner.f.d.a;
import pulsescanner.f.k;
import pulsescanner.i.c;

public class g
extends k {
    public final c F;
    private static final String[] G;

    public g() {
        String[] stringArray = G;
        super(stringArray[5], stringArray[6], 1, 0, 0.0f, 24.0f);
        this.F = this.a(new c(stringArray[7], stringArray[4], true));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected List<String[]> w() {
        block29: {
            block30: {
                block31: {
                    block26: {
                        block28: {
                            block27: {
                                block25: {
                                    var1_1 = pulsescanner.f.d.a.b();
                                    try {
                                        v0 = g.a;
                                        if (var1_1 == null) break block25;
                                        if (v0.method_1542()) {
                                        }
                                        ** GOTO lbl14
                                    }
                                    catch (MatchException v1) {
                                        throw g.a(v1);
                                    }
                                    var3_2 = g.G;
                                    var2_3 = var3_2[8];
                                    try {
                                        if (var1_1 != null) break block26;
lbl14:
                                        // 2 sources

                                        v0 = g.a;
                                    }
                                    catch (MatchException v2) {
                                        throw g.a(v2);
                                    }
                                }
                                try {
                                    try {
                                        if (var1_1 == null) break block27;
                                        if (v0.method_1558() == null) break block28;
                                    }
                                    catch (MatchException v3) {
                                        throw g.a(v3);
                                    }
                                    v0 = g.a;
                                }
                                catch (MatchException v4) {
                                    throw g.a(v4);
                                }
                            }
                            var2_3 = v0.method_1558().field_3761;
                            if (var1_1 != null) break block26;
                        }
                        var3_2 = g.G;
                        var2_3 = var3_2[3];
                    }
                    try {
                        try {
                            try {
                                try {
                                    v5 = ((Boolean)this.F.a()).booleanValue();
                                    if (var1_1 == null) break block29;
                                    if (v5 == 0) break block30;
                                }
                                catch (MatchException v6) {
                                    throw g.a(v6);
                                }
                                v7 = g.a;
                                if (var1_1 == null) break block31;
                            }
                            catch (MatchException v8) {
                                throw g.a(v8);
                            }
                            if (v7.method_1562() == null) break block30;
                        }
                        catch (MatchException v9) {
                            throw g.a(v9);
                        }
                        v7 = g.a;
                    }
                    catch (MatchException v10) {
                        throw g.a(v10);
                    }
                }
                try {
                    try {
                        v5 = (int)v7.method_1542();
                        if (var1_1 == null) break block29;
                        if (v5 != 0) break block30;
                    }
                    catch (MatchException v11) {
                        throw g.a(v11);
                    }
                    return List.of(new String[]{g.G[2], var2_3}, new String[]{g.G[1], String.valueOf(g.a.method_1562().method_2880().size())});
                }
                catch (MatchException v12) {
                    throw g.a(v12);
                }
            }
            v5 = 2;
        }
        v13 = new String[v5];
        v13[0] = g.G[0];
        v13[1] = var2_3;
        return List.of(v13);
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
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "y$bw\u0010<\u0007z-qx\u0010<i\u0006y$bw\u0010<\u0007e'vm\u001c \u007f\u0019y)\u007fvU!tF(~dU>vK8usU-u_/d/\u000by$bw\u0010<:c/vn\u0017i4bs\u0010 n\n2us\u0003+h\n te\u0007+iYo";
                var4_3 = "y$bw\u0010<\u0007z-qx\u0010<i\u0006y$bw\u0010<\u0007e'vm\u001c \u007f\u0019y)\u007fvU!tF(~dU>vK8usU-u_/d/\u000by$bw\u0010<:c/vn\u0017i4bs\u0010 n\n2us\u0003+h\n te\u0007+iYo".length();
                var1_4 = 6;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 92;
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
                    var2_2 = "X\u000fSZ2\u001eK\f[\n\\D;\tHd\u0002KF%";
                    var4_3 = "X\u000fSZ2\u001eK\f[\n\\D;\tHd\u0002KF%".length();
                    var1_4 = 7;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 126;
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
                        v11 = 118;
                        break;
                    }
                    case 1: {
                        v11 = 29;
                        break;
                    }
                    case 2: {
                        v11 = 76;
                        break;
                    }
                    case 3: {
                        v11 = 93;
                        break;
                    }
                    case 4: {
                        v11 = 41;
                        break;
                    }
                    case 5: {
                        v11 = 18;
                        break;
                    }
                    default: {
                        v11 = 70;
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
        g.G = var5;
    }
}

