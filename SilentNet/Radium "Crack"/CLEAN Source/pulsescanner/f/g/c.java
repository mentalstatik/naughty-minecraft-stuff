/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1922
 */
package pulsescanner.f.g;

import net.minecraft.class_1657;
import net.minecraft.class_1922;
import pulsescanner.f.g.d;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.g;
import pulsescanner.mixin.ClientPlayerInteractionManagerAccessor;

public class c
extends i {
    public final g l;
    public final pulsescanner.i.c m;
    public final pulsescanner.i.c n;
    private static final String[] o;

    public c() {
        String[] stringArray = o;
        super(stringArray[4], stringArray[1], pulsescanner.f.h.WORLD);
        this.l = this.a(new g(stringArray[0], stringArray[6], 2.0, 1.0, 3.0, 0.05, "x"));
        this.m = this.a(new pulsescanner.i.c(stringArray[2], stringArray[3], true));
        this.n = (pulsescanner.i.c)this.a(new pulsescanner.i.c(stringArray[5], stringArray[7], true)).a(this.m::a);
    }

    @Override
    public String f() {
        return this.l.j();
    }

    @Override
    public void i() {
        pulsescanner.f.g.c.a((Double)this.l.a(), (Boolean)this.m.a(), (Boolean)this.n.a());
    }

    /*
     * Unable to fully structure code
     */
    public static void a(double var0, boolean var2_1, boolean var3_2) {
        block59: {
            block60: {
                block58: {
                    block57: {
                        block55: {
                            block54: {
                                block56: {
                                    block53: {
                                        block51: {
                                            block52: {
                                                block50: {
                                                    block49: {
                                                        var4_3 = pulsescanner.f.g.d.u();
                                                        try {
                                                            try {
                                                                v0 = pulsescanner.f.g.c.a;
                                                                if (var4_3 != null) break block49;
                                                                if (v0.field_1724 != null) {
                                                                }
                                                                ** GOTO lbl36
                                                            }
                                                            catch (MatchException v1) {
                                                                throw pulsescanner.f.g.c.a(v1);
                                                            }
                                                            v0 = pulsescanner.f.g.c.a;
                                                        }
                                                        catch (MatchException v2) {
                                                            throw pulsescanner.f.g.c.a(v2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block50;
                                                            if (v0.field_1687 != null) {
                                                            }
                                                            ** GOTO lbl36
                                                        }
                                                        catch (MatchException v3) {
                                                            throw pulsescanner.f.g.c.a(v3);
                                                        }
                                                        v0 = pulsescanner.f.g.c.a;
                                                    }
                                                    catch (MatchException v4) {
                                                        throw pulsescanner.f.g.c.a(v4);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var4_3 != null) break block51;
                                                        if (v0.field_1761 != null) break block52;
                                                    }
                                                    catch (MatchException v5) {
                                                        throw pulsescanner.f.g.c.a(v5);
                                                    }
lbl36:
                                                    // 3 sources

                                                    return;
                                                }
                                                catch (MatchException v6) {
                                                    throw pulsescanner.f.g.c.a(v6);
                                                }
                                            }
                                            v0 = pulsescanner.f.g.c.a;
                                        }
                                        var5_4 = (ClientPlayerInteractionManagerAccessor)v0.field_1761;
                                        var6_5 = var5_4.pulse$getBreakingPos();
                                        try {
                                            if (var6_5 == null) {
                                                return;
                                            }
                                        }
                                        catch (MatchException v7) {
                                            throw pulsescanner.f.g.c.a(v7);
                                        }
                                        var7_6 = pulsescanner.f.g.c.a.field_1687.method_8320(var6_5).method_26165((class_1657)pulsescanner.f.g.c.a.field_1724, (class_1922)pulsescanner.f.g.c.a.field_1687, var6_5);
                                        try {
                                            try {
                                                try {
                                                    v8 = var2_1;
                                                    if (var4_3 != null) break block53;
                                                    if (v8 == 0) break block54;
                                                }
                                                catch (MatchException v9) {
                                                    throw pulsescanner.f.g.c.a(v9);
                                                }
                                                v10 = var5_4;
                                                if (var4_3 != null) break block55;
                                            }
                                            catch (MatchException v11) {
                                                throw pulsescanner.f.g.c.a(v11);
                                            }
                                            v8 = v10.pulse$getCooldown();
                                        }
                                        catch (MatchException v12) {
                                            throw pulsescanner.f.g.c.a(v12);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (v8 <= 0) break block54;
                                                    v13 = var3_2;
                                                    if (var4_3 != null) break block56;
                                                }
                                                catch (MatchException v14) {
                                                    throw pulsescanner.f.g.c.a(v14);
                                                }
                                                if (v13 != 0) {
                                                }
                                                ** GOTO lbl98
                                            }
                                            catch (MatchException v15) {
                                                throw pulsescanner.f.g.c.a(v15);
                                            }
                                            v16 = var7_6;
                                            if (var4_3 != null) break block57;
                                        }
                                        catch (MatchException v17) {
                                            throw pulsescanner.f.g.c.a(v17);
                                        }
                                        cfr_temp_0 = v16 - 1.0f;
                                        v13 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                    }
                                    catch (MatchException v18) {
                                        throw pulsescanner.f.g.c.a(v18);
                                    }
                                }
                                try {
                                    if (v13 >= 0) break block54;
lbl98:
                                    // 2 sources

                                    var5_4.pulse$setCooldown(0);
                                }
                                catch (MatchException v19) {
                                    throw pulsescanner.f.g.c.a(v19);
                                }
                            }
                            v10 = var5_4;
                        }
                        v16 = v10.pulse$getBreakingProgress();
                    }
                    var8_7 = v16;
                    try {
                        try {
                            try {
                                v20 = var5_4.pulse$isBreaking();
                                if (var4_3 != null) break block58;
                                if (v20 == 0) break block59;
                            }
                            catch (MatchException v21) {
                                throw pulsescanner.f.g.c.a(v21);
                            }
                            v22 = var8_7;
                            if (var4_3 != null) break block60;
                        }
                        catch (MatchException v23) {
                            throw pulsescanner.f.g.c.a(v23);
                        }
                        cfr_temp_1 = v22 - 0.0f;
                        v20 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    catch (MatchException v24) {
                        throw pulsescanner.f.g.c.a(v24);
                    }
                }
                if (v20 <= 0) break block59;
                v22 = var8_7;
            }
            try {
                if ((double)v22 + (double)var7_6 * var0 >= 0.699999988079071) {
                    var5_4.pulse$setBreakingProgress(1.0f);
                }
            }
            catch (MatchException v25) {
                throw pulsescanner.f.g.c.a(v25);
            }
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
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "\u0019nD%E&{&2\u0016sE-Ho|8nC'Pox5rT)Qc>#hT$\u0003!qteE B6>6dT;F*ptcL#@$mz\u000b\u001an\u0000\u000fL r0nW\"\u000e:n\u0000.Q*\u007f?!D)O.g\n\u0007qE)GoS=oE\u000e\u001an\u0000\u0005M<j5!b>F.u";
                var4_3 = "\u0019nD%E&{&2\u0016sE-Ho|8nC'Pox5rT)Qc>#hT$\u0003!qteE B6>6dT;F*ptcL#@$mz\u000b\u001an\u0000\u000fL r0nW\"\u000e:n\u0000.Q*\u007f?!D)O.g\n\u0007qE)GoS=oE\u000e\u001an\u0000\u0005M<j5!b>F.u".length();
                var1_4 = 8;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 26;
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
                    var2_2 = "k\"\u001da\u0013b{8\u007fY$\u000ew\u001f=cC5\u000e0v4c[$\u000e&v5mTaA,30b^5O a<mF";
                    var4_3 = "k\"\u001da\u0013b{8\u007fY$\u000ew\u001f=cC5\u000e0v4c[$\u000e&v5mTaA,30b^5O a<mF".length();
                    var1_4 = 13;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 23;
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
                        v11 = 78;
                        break;
                    }
                    case 1: {
                        v11 = 27;
                        break;
                    }
                    case 2: {
                        v11 = 58;
                        break;
                    }
                    case 3: {
                        v11 = 86;
                        break;
                    }
                    case 4: {
                        v11 = 57;
                        break;
                    }
                    case 5: {
                        v11 = 85;
                        break;
                    }
                    default: {
                        v11 = 4;
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
        pulsescanner.f.g.c.o = var5;
    }
}

