/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package pulsescanner.f.e;

import net.minecraft.class_310;
import pulsescanner.f.e.b;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.g;

public class d
extends i {
    private static final int l = 15;
    public final g m;
    private int n;
    private static final String[] o;

    public d() {
        String[] stringArray = o;
        super(stringArray[6], stringArray[5], pulsescanner.f.h.MISC);
        this.m = this.a(new g(stringArray[1], stringArray[3], 1.0, 1.0, 100.0, 1.0));
    }

    @Override
    protected void g() {
        block10: {
            boolean bl;
            block12: {
                block11: {
                    class_310 class_3102;
                    boolean bl2;
                    block8: {
                        block9: {
                            bl2 = pulsescanner.f.e.b.H();
                            try {
                                try {
                                    class_3102 = a;
                                    if (!bl2) break block8;
                                    if (class_3102.method_1562() != null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.e.d.a(matchException);
                                }
                                this.c(o[2]);
                                this.a(false);
                                return;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.d.a(matchException);
                            }
                        }
                        class_3102 = a;
                    }
                    try {
                        try {
                            class_3102.method_1562().method_45730(o[4] + this.m.h());
                            this.n = 15;
                            if (pulsescanner.f.i.n() == null) break block10;
                            if (!bl2) break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.e.d.a(matchException);
                        }
                        bl = false;
                        break block12;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.d.a(matchException);
                    }
                }
                bl = true;
            }
            pulsescanner.f.e.b.b(bl);
        }
    }

    @Override
    protected void h() {
        this.n = 0;
    }

    @Override
    public void i() {
        block11: {
            block13: {
                class_310 class_3102;
                block12: {
                    d d2;
                    boolean bl;
                    block10: {
                        bl = pulsescanner.f.e.b.H();
                        try {
                            try {
                                d2 = this;
                                if (!bl) break block10;
                                if (d2.n <= 0) break block11;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.d.a(matchException);
                            }
                            d2 = this;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.e.d.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (--d2.n > 0) break block11;
                                class_3102 = a;
                                if (!bl) break block12;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.d.a(matchException);
                            }
                            if (class_3102.method_1562() == null) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.e.d.a(matchException);
                        }
                        class_3102 = a;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.d.a(matchException);
                    }
                }
                class_3102.method_1562().method_45730(o[0] + this.m.h());
            }
            this.a(false);
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
                var2_2 = "9N\bbqfdj\u0004\u0002D\u0011o \u0000D\u0015d>j!9N\u000e|{y!(N\u001aeln!?X\u0015dy+I%F\u0019$&\u001eC\u0019*vdl/\u000b\u0012\u007fsid8\u000b\ty{o!(R\\hq\u007fijH\u0013gsjo.XR\b.N\u0010bqfdj";
                var4_3 = "9N\bbqfdj\u0004\u0002D\u0011o \u0000D\u0015d>j!9N\u000e|{y!(N\u001aeln!?X\u0015dy+I%F\u0019$&\u001eC\u0019*vdl/\u000b\u0012\u007fsid8\u000b\ty{o!(R\\hq\u007fijH\u0013gsjo.XR\b.N\u0010bqfdj".length();
                var1_4 = 8;
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
                    var2_2 = "`#m\b\nL\tC);\u0002\u001fL\u001fB9iM\u0011\u0003\u000bH?;\u0019\u0016L\u0011E)i\bY\u0015\tXki\bY\u001f\u0012L\"\u007f\u0004\u0017\u000bH\ne#v\bY!\t[)i";
                    var4_3 = "`#m\b\nL\tC);\u0002\u001fL\u001fB9iM\u0011\u0003\u000bH?;\u0019\u0016L\u0011E)i\bY\u0015\tXki\bY\u001f\u0012L\"\u007f\u0004\u0017\u000bH\ne#v\bY!\t[)i".length();
                    var1_4 = 49;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 59;
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
                        v11 = 22;
                        break;
                    }
                    case 1: {
                        v11 = 119;
                        break;
                    }
                    case 2: {
                        v11 = 32;
                        break;
                    }
                    case 3: {
                        v11 = 86;
                        break;
                    }
                    case 4: {
                        v11 = 66;
                        break;
                    }
                    case 5: {
                        v11 = 87;
                        break;
                    }
                    default: {
                        v11 = 93;
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
        pulsescanner.f.e.d.o = var5;
    }
}

