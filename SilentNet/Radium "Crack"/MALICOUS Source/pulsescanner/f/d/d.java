/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.d;

import java.util.List;
import pulsescanner.d.f;
import pulsescanner.f.d.a;
import pulsescanner.f.i;
import pulsescanner.f.k;
import pulsescanner.i.c;

public class d
extends k {
    public final c F;
    private static final String[] G;

    public d() {
        String[] stringArray = G;
        super(stringArray[3], stringArray[1], 0, 0, 4.0f, 78.0f);
        this.F = this.a(new c(stringArray[4], stringArray[5], true));
    }

    @Override
    protected List<String[]> w() {
        String string;
        block6: {
            int n2;
            block4: {
                block5: {
                    i[] iArray = pulsescanner.f.d.a.b();
                    try {
                        try {
                            n2 = ((Boolean)this.F.a()).booleanValue();
                            if (iArray == null) break block4;
                            if (n2 == 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.d.a(matchException);
                        }
                        string = pulsescanner.d.f.a() + G[2] + pulsescanner.d.f.b();
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.d.a(matchException);
                    }
                }
                n2 = pulsescanner.d.f.a();
            }
            string = String.valueOf(n2);
        }
        String string2 = string;
        return List.of(new String[]{G[0], string2});
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
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = ",;)\u0012,\u0007\u0013\u001eU/o\u001f\u000e\b]M9,\u0000\u0005\u001eS\u0003O\u0017Z\u0003,;)";
                var4_3 = ",;)\u0012,\u0007\u0013\u001eU/o\u001f\u000e\b]M9,\u0000\u0005\u001eS\u0003O\u0017Z\u0003,;)".length();
                var1_4 = 3;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 7;
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
                    var2_2 = "tKT\\\u00035EJKP_\u001agN@[WfnIU\u0013F\u001ernR\u000fPX\u001evm\u0006acgY";
                    var4_3 = "tKT\\\u00035EJKP_\u001agN@[WfnIU\u0013F\u001ernR\u000fPX\u001evm\u0006acgY".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 78;
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
                        v11 = 104;
                        break;
                    }
                    case 1: {
                        v11 = 108;
                        break;
                    }
                    case 2: {
                        v11 = 125;
                        break;
                    }
                    case 3: {
                        v11 = 122;
                        break;
                    }
                    case 4: {
                        v11 = 57;
                        break;
                    }
                    case 5: {
                        v11 = 91;
                        break;
                    }
                    default: {
                        v11 = 72;
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
        pulsescanner.f.d.d.G = var5;
    }
}

