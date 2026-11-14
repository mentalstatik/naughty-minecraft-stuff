/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.c;

import pulsescanner.f.c.t;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.g;

public class u
extends i {
    public final g l;
    public final c m;
    private static final String[] n;

    public u() {
        String[] stringArray = n;
        super(stringArray[4], stringArray[2], pulsescanner.f.h.COMBAT);
        this.l = this.a(new g(stringArray[0], stringArray[1], 1.0, 0.0, 1.0, 0.05));
        String[] stringArray2 = t.y();
        try {
            this.m = this.a(new c(stringArray[5], stringArray[3], true));
            if (pulsescanner.f.i.n() != null) {
                t.b(new String[4]);
            }
        }
        catch (MatchException matchException) {
            throw u.a(matchException);
        }
    }

    public boolean o() {
        boolean bl;
        block8: {
            block7: {
                u u2;
                String[] stringArray;
                block6: {
                    stringArray = t.y();
                    try {
                        try {
                            u2 = this;
                            if (stringArray != null) break block6;
                            if (!u2.b()) break block7;
                        }
                        catch (MatchException matchException) {
                            throw u.a(matchException);
                        }
                        u2 = this.m.a();
                    }
                    catch (MatchException matchException) {
                        throw u.a(matchException);
                    }
                }
                try {
                    bl = (Boolean)((Object)u2);
                    if (stringArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (MatchException matchException) {
                    throw u.a(matchException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public int c(int n2) {
        int n3;
        block6: {
            int n4;
            block4: {
                block5: {
                    String[] stringArray = t.y();
                    try {
                        try {
                            n4 = this.b();
                            if (stringArray != null) break block4;
                            if (n4 != 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw u.a(matchException);
                        }
                        n3 = n2;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw u.a(matchException);
                    }
                }
                n4 = 1;
            }
            n3 = Math.max(n4, (int)Math.round((double)n2 * (Double)this.l.a()));
        }
        return n3;
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
                var2_2 = "w\u0018\\IR\u0010g\u0014RIS\nQJ[[DT\u0011IVUFh\u001eIV\u0017\u001cIQ[OLG\u0011O@\u001e\u001dR^\u0011NK\u000eI\u0005E\u0004OJ[RW\u0017\u0012GP\u001eO\u0005V\u000bB\u0004\u0018UDE\u0002C\u0004\u0002RPEERV\u0012Y@Y\u0011\u0006B\u001aNQR\u0017\b)e\u0017QJ@\u0016\u0006v\u0012MQ^\u0001C\u0004\u000eN@\u0017\nSP\bTAREQE\u000fXW\u0017\nT\u0004\t\\LYK";
                var4_3 = "w\u0018\\IR\u0010g\u0014RIS\nQJ[[DT\u0011IVUFh\u001eIV\u0017\u001cIQ[OLG\u0011O@\u001e\u001dR^\u0011NK\u000eI\u0005E\u0004OJ[RW\u0017\u0012GP\u001eO\u0005V\u000bB\u0004\u0018UDE\u0002C\u0004\u0002RPEERV\u0012Y@Y\u0011\u0006B\u001aNQR\u0017\b)e\u0017QJ@\u0016\u0006v\u0012MQ^\u0001C\u0004\u000eN@\u0017\nSP\bTAREQE\u000fXW\u0017\nT\u0004\t\\LYK".length();
                var1_4 = 5;
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
                    var2_2 = "\u0012v)5:e'`O54 \b\u000epy\u00162u'2";
                    var4_3 = "\u0012v)5:e'`O54 \b\u000epy\u00162u'2".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 56;
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
                        v11 = 120;
                        break;
                    }
                    case 1: {
                        v11 = 39;
                        break;
                    }
                    case 2: {
                        v11 = 97;
                        break;
                    }
                    case 3: {
                        v11 = 121;
                        break;
                    }
                    case 4: {
                        v11 = 107;
                        break;
                    }
                    case 5: {
                        v11 = 57;
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
        u.n = var5;
    }
}

