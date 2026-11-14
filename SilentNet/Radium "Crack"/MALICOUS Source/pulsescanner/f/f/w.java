/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 */
package pulsescanner.f.f;

import net.minecraft.class_1309;
import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.g;

public class w
extends i {
    public final g l;
    public final c m;
    private static final String[] n;

    public w() {
        String[] stringArray = n;
        super(stringArray[5], stringArray[0], pulsescanner.f.h.RENDER);
        this.l = this.a(new g(stringArray[1], stringArray[3], 2.0, 0.25, 6.0, 0.05, "x"));
        this.m = this.a(new c(stringArray[4], stringArray[2], false));
    }

    @Override
    public String f() {
        return this.l.a() + "x";
    }

    public int a(int n2, class_1309 class_13092) {
        int n3;
        block16: {
            double d2;
            double d3;
            block14: {
                block15: {
                    Object object;
                    i[] iArray;
                    block12: {
                        block13: {
                            iArray = q.r();
                            try {
                                try {
                                    try {
                                        try {
                                            object = class_13092;
                                            if (iArray != null) break block12;
                                            if (object == w.a.field_1724) break block13;
                                        }
                                        catch (MatchException matchException) {
                                            throw w.a(matchException);
                                        }
                                        object = this.m.a();
                                        if (iArray != null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw w.a(matchException);
                                    }
                                    if (((Boolean)object).booleanValue()) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw w.a(matchException);
                                }
                                return n2;
                            }
                            catch (MatchException matchException) {
                                throw w.a(matchException);
                            }
                        }
                        object = this.l.a();
                    }
                    d3 = (Double)object;
                    try {
                        try {
                            double d4 = d3 - 0.0;
                            d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                            if (iArray != null) break block14;
                            if (d2 > 0) break block15;
                        }
                        catch (MatchException matchException) {
                            throw w.a(matchException);
                        }
                        n3 = n2;
                        break block16;
                    }
                    catch (MatchException matchException) {
                        throw w.a(matchException);
                    }
                }
                d2 = 1.0;
            }
            n3 = Math.max((int)d2, (int)Math.round((double)n2 / d3));
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
                var2_2 = "\u001aQ6X\u0010@hyQ8AWCz*MwO\u0018PiyQ6X\u0013\u0005h.P9Q\u0004\u000b\u0005\nI2S\u00134\u0018U$YWVk<\\3\u0016\u0002U;6M?S\u0005\u0005k5X.S\u0005V<yJ _\u0019Bhu\u00199Y\u0003\u0005q,J#\u0016\u000eJn+JyA\nN>X\u0010\u0005z7P:W\u0003Lt7\u0019$F\u0012@\u007fyT\"Z\u0003Lk5P2DW\r)y\u0004wB\u0000Lx<\u00196EWCz*M{\u0016G\u000b.y\u0004w^\u0016I}p\u0017";
                var4_3 = "\u001aQ6X\u0010@hyQ8AWCz*MwO\u0018PiyQ6X\u0013\u0005h.P9Q\u0004\u000b\u0005\nI2S\u00134\u0018U$YWVk<\\3\u0016\u0002U;6M?S\u0005\u0005k5X.S\u0005V<yJ _\u0019Bhu\u00199Y\u0003\u0005q,J#\u0016\u000eJn+JyA\nN>X\u0010\u0005z7P:W\u0003Lt7\u0019$F\u0012@\u007fyT\"Z\u0003Lk5P2DW\r)y\u0004wB\u0000Lx<\u00196EWCz*M{\u0016G\u000b.y\u0004w^\u0016I}p\u0017".length();
                var1_4 = 34;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 50;
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
                    var2_2 = "\u0004_-A\u0017\u0017Y'J<A\u0017D\u000b\u0018\\,J\u0002\u0017Z;N @";
                    var4_3 = "\u0004_-A\u0017\u0017Y'J<A\u0017D\u000b\u0018\\,J\u0002\u0017Z;N @".length();
                    var1_4 = 13;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 32;
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
                        v11 = 107;
                        break;
                    }
                    case 1: {
                        v11 = 11;
                        break;
                    }
                    case 2: {
                        v11 = 101;
                        break;
                    }
                    case 3: {
                        v11 = 4;
                        break;
                    }
                    case 4: {
                        v11 = 69;
                        break;
                    }
                    case 5: {
                        v11 = 23;
                        break;
                    }
                    default: {
                        v11 = 41;
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
        w.n = var5;
    }
}

