/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.a.a;

import java.util.Arrays;
import java.util.StringJoiner;
import pulsescanner.f.a.a.a;
import pulsescanner.f.a.a.b;

public final class e {
    private final a a;
    private final int b;
    private final int[] c;
    private static final String[] d;

    private e(a a2, int n2, int[] nArray) {
        this.a = a2;
        this.b = n2;
        this.c = nArray;
    }

    public static e a(byte[] byArray) {
        int n2;
        a a2;
        e e2;
        e e3;
        block5: {
            try {
                if (byArray == null || byArray.length != 2048) break block5;
            }
            catch (MatchException matchException) {
                throw e.a(matchException);
            }
            int[] nArray = new int[16];
            for (byte by : byArray) {
                int n3 = by & 0xFF;
                int n4 = n3 & 0xF;
                nArray[n4] = nArray[n4] + 1;
                int n5 = n3 >>> 4 & 0xF;
                nArray[n5] = nArray[n5] + 1;
            }
            return new e(pulsescanner.f.a.a.a.PAYLOAD, byArray.length, nArray);
        }
        try {
            e e4;
            e3 = e4;
            e2 = e4;
            a2 = pulsescanner.f.a.a.a.INVALID;
            n2 = byArray == null ? -1 : byArray.length;
        }
        catch (MatchException matchException) {
            throw e.a(matchException);
        }
        e3(a2, n2, new int[16]);
        return e2;
    }

    public static e a() {
        return new e(pulsescanner.f.a.a.a.EMPTY_MASK, 0, new int[16]);
    }

    public String b() {
        block16: {
            String string;
            block18: {
                block17: {
                    e e2;
                    block15: {
                        a a2;
                        block13: {
                            int n2;
                            block14: {
                                n2 = pulsescanner.f.a.a.b.e();
                                try {
                                    try {
                                        a2 = this.a;
                                        if (n2 != 0) break block13;
                                        if (a2 != pulsescanner.f.a.a.a.EMPTY_MASK) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw e.a(matchException);
                                    }
                                    return d[6];
                                }
                                catch (MatchException matchException) {
                                    throw e.a(matchException);
                                }
                            }
                            try {
                                e2 = this;
                                if (n2 != 0) break block15;
                                a2 = e2.a;
                            }
                            catch (MatchException matchException) {
                                throw e.a(matchException);
                            }
                        }
                        try {
                            if (a2 != pulsescanner.f.a.a.a.INVALID) break block16;
                            e2 = this;
                        }
                        catch (MatchException matchException) {
                            throw e.a(matchException);
                        }
                    }
                    try {
                        if (e2.b >= 0) break block17;
                        string = d[5];
                        break block18;
                    }
                    catch (MatchException matchException) {
                        throw e.a(matchException);
                    }
                }
                String[] stringArray = d;
                string = stringArray[3] + this.b + stringArray[1];
            }
            return string;
        }
        String[] stringArray = d;
        StringJoiner stringJoiner = new StringJoiner(stringArray[2], "{", "}");
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            try {
                if (this.c[i2] <= 0) continue;
                stringJoiner.add(i2 + "=" + this.c[i2]);
                continue;
            }
            catch (MatchException matchException) {
                throw e.a(matchException);
            }
        }
        stringArray = d;
        return stringArray[4] + stringJoiner + stringArray[0];
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            try {
                if (this == object) {
                    return true;
                }
            }
            catch (MatchException matchException) {
                throw e.a(matchException);
            }
            if (object instanceof e) {
                block11: {
                    e e2 = (e)object;
                    try {
                        try {
                            try {
                                if (this.a != e2.a || this.b != e2.b) break block11;
                            }
                            catch (MatchException matchException) {
                                throw e.a(matchException);
                            }
                            if (!Arrays.equals(this.c, e2.c)) break block11;
                        }
                        catch (MatchException matchException) {
                            throw e.a(matchException);
                        }
                        bl = true;
                        break block12;
                    }
                    catch (MatchException matchException) {
                        throw e.a(matchException);
                    }
                }
                bl = false;
            } else {
                bl = false;
            }
        }
        return bl;
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + this.b;
        return 31 * n2 + Arrays.hashCode(this.c);
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
                var2_2 = "k:_O\u007fI$%{\t\u001d*\u001awb\u0010g2\u000e\u00076\u001ag?w\u000fBtO0s;\u0002g2\u0017\u0002\\=>\n6@k:\u001b\u001e?\u0013k*vK\u001d?\u000ba8/\u0007=s\u0007\n#\f9";
                var4_3 = "k:_O\u007fI$%{\t\u001d*\u001awb\u0010g2\u000e\u00076\u001ag?w\u000fBtO0s;\u0002g2\u0017\u0002\\=>\n6@k:\u001b\u001e?\u0013k*vK\u001d?\u000ba8/\u0007=s\u0007\n#\f9".length();
                var1_4 = 15;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 54;
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
                    var2_2 = "<b\u0003\u00004\b~U\u00048(\u000b2S\u001bKu/\u0011#X\u0019Iu1\u00198V\u001aM1h\u001e0a\u0005\u0015!\u001ew4\u007f\u001eaP/UUB<#\u001a-_U\\48\u0014.[\u0011\u0005";
                    var4_3 = "<b\u0003\u00004\b~U\u00048(\u000b2S\u001bKu/\u0011#X\u0019Iu1\u00198V\u001aM1h\u001e0a\u0005\u0015!\u001ew4\u007f\u001eaP/UUB<#\u001a-_U\\48\u0014.[\u0011\u0005".length();
                    var1_4 = 32;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 8;
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
                        v11 = 125;
                        break;
                    }
                    case 1: {
                        v11 = 36;
                        break;
                    }
                    case 2: {
                        v11 = 93;
                        break;
                    }
                    case 3: {
                        v11 = 73;
                        break;
                    }
                    case 4: {
                        v11 = 112;
                        break;
                    }
                    case 5: {
                        v11 = 73;
                        break;
                    }
                    default: {
                        v11 = 50;
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
        e.d = var5;
    }
}

