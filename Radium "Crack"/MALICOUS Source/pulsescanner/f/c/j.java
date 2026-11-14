/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.c;

import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.ay;
import pulsescanner.a.o;
import pulsescanner.a.y;
import pulsescanner.a.z;
import pulsescanner.f.c.t;
import pulsescanner.f.h;

public class j
extends as {
    public final ay m;
    public final at n;
    private static final String[] o;

    public j() {
        String[] stringArray = o;
        super(stringArray[1], stringArray[3], pulsescanner.f.h.CLIENT);
        this.m = new ay(this, stringArray[0], "");
        this.n = new at(this, stringArray[2], true);
    }

    @Override
    public boolean a() {
        return false;
    }

    @y
    public void a(o o2) {
        block9: {
            o o3;
            block10: {
                boolean bl;
                block8: {
                    String[] stringArray = t.y();
                    try {
                        try {
                            try {
                                bl = (Boolean)this.n.a();
                                if (stringArray != null) break block8;
                                if (!bl) break block9;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.j.a(matchException);
                            }
                            o3 = o2;
                            if (stringArray != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.j.a(matchException);
                        }
                        bl = z.a(o3.d().method_5477().getString());
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.j.a(matchException);
                    }
                }
                if (!bl) break block9;
                o3 = o2;
            }
            o3.b();
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
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "\u00032CY)*?\u0007\u00032CY)*?";
                var4_3 = "\u00032CY)*?\u0007\u00032CY)*?".length();
                var1_4 = 7;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 118;
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
                    var2_2 = "\u0015>WM>|\u001f#&YM>/?\u0007>YW0.-w1WC7=*w?WJ 0;$rTK4*;w3TA;9pw\u0001]^4.?#7\u0018@41;$rOG!4~4=UC4/p";
                    var4_3 = "\u0015>WM>|\u001f#&YM>/?\u0007>YW0.-w1WC7=*w?WJ 0;$rTK4*;w3TA;9pw\u0001]^4.?#7\u0018@41;$rOG!4~4=UC4/p".length();
                    var1_4 = 13;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 100;
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
                        v11 = 51;
                        break;
                    }
                    case 1: {
                        v11 = 54;
                        break;
                    }
                    case 2: {
                        v11 = 92;
                        break;
                    }
                    case 3: {
                        v11 = 74;
                        break;
                    }
                    case 4: {
                        v11 = 49;
                        break;
                    }
                    case 5: {
                        v11 = 56;
                        break;
                    }
                    default: {
                        v11 = 58;
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
        pulsescanner.f.c.j.o = var5;
    }
}

