/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_239
 *  net.minecraft.class_3966
 */
package pulsescanner.f.c;

import java.lang.invoke.LambdaMetafactory;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import pulsescanner.a.ah;
import pulsescanner.a.an;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.u;
import pulsescanner.a.y;
import pulsescanner.a.z;
import pulsescanner.f.c.t;

public class e
extends as {
    public final at m;
    public final ah n;
    public static class_1309 o;
    private int p;
    private int q;
    private static final int[] r;
    private static final String[] s;

    private boolean a(class_1309 class_13092) {
        block15: {
            block17: {
                try {
                    block16: {
                        try {
                            try {
                                try {
                                    try {
                                        if (class_13092 == pulsescanner.f.c.e.a.field_1724 || !class_13092.method_5805()) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.e.a(matchException);
                                    }
                                    if (class_13092.method_5655()) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.e.a(matchException);
                                }
                                if (pulsescanner.f.c.e.a.field_1724.method_5739((class_1297)class_13092) > 4.0f) break block16;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.e.a(matchException);
                            }
                            if (pulsescanner.f.c.e.a.field_1724.method_6057((class_1297)class_13092)) break block17;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.e.a(matchException);
                        }
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.e.a(matchException);
                }
            }
            if (class_13092 instanceof class_1657) {
                boolean bl;
                block19: {
                    class_1657 class_16572;
                    block18: {
                        class_16572 = (class_1657)class_13092;
                        try {
                            if (!class_16572.method_68878()) break block18;
                            bl = false;
                            break block19;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.e.a(matchException);
                        }
                    }
                    try {
                        bl = !z.a(class_16572.method_5477().getString());
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.e.a(matchException);
                    }
                }
                return bl;
            }
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void b(class_1309 var1_1) {
        block30: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block31: {
                                block29: {
                                    block27: {
                                        block28: {
                                            var2_2 = t.y();
                                            try {
                                                try {
                                                    try {
                                                        v0 = this;
                                                        if (var2_2 != null) break block27;
                                                        if (!v0.n.a(pulsescanner.f.c.e.s[5])) break block28;
                                                    }
                                                    catch (MatchException v1) {
                                                        throw pulsescanner.f.c.e.a(v1);
                                                    }
                                                    v2 = pulsescanner.f.c.e.a.field_1724.method_6115();
                                                    if (var2_2 != null) break block29;
                                                }
                                                catch (MatchException v3) {
                                                    throw pulsescanner.f.c.e.a(v3);
                                                }
                                                if (v2) break block30;
                                            }
                                            catch (MatchException v4) {
                                                throw pulsescanner.f.c.e.a(v4);
                                            }
                                        }
                                        v0 = this;
                                    }
                                    try {
                                        if (var2_2 != null) break block31;
                                        v2 = v0.n.a(pulsescanner.f.c.e.s[3]);
                                    }
                                    catch (MatchException v5) {
                                        throw pulsescanner.f.c.e.a(v5);
                                    }
                                }
                                try {
                                    block32: {
                                        try {
                                            try {
                                                if (!v2) break block32;
                                                v0 = this;
                                                if (var2_2 != null) break block31;
                                            }
                                            catch (MatchException v6) {
                                                throw pulsescanner.f.c.e.a(v6);
                                            }
                                            if (!v0.b(this.n.a(pulsescanner.f.c.e.s[4]))) break block30;
                                        }
                                        catch (MatchException v7) {
                                            throw pulsescanner.f.c.e.a(v7);
                                        }
                                    }
                                    v0 = this;
                                }
                                catch (MatchException v8) {
                                    throw pulsescanner.f.c.e.a(v8);
                                }
                            }
                            try {
                                try {
                                    v9 = v0.q;
                                    if (var2_2 != null) break block33;
                                    if (v9 > 0) break block30;
                                }
                                catch (MatchException v10) {
                                    throw pulsescanner.f.c.e.a(v10);
                                }
                                cfr_temp_0 = pulsescanner.f.c.e.a.field_1724.method_7261(0.5f) - 0.9f;
                                v9 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                            }
                            catch (MatchException v11) {
                                throw pulsescanner.f.c.e.a(v11);
                            }
                        }
                        try {
                            try {
                                if (var2_2 != null) break block34;
                                if (v9 <= 0) break block30;
                            }
                            catch (MatchException v12) {
                                throw pulsescanner.f.c.e.a(v12);
                            }
                            v9 = (int)this.m.i();
                        }
                        catch (MatchException v13) {
                            throw pulsescanner.f.c.e.a(v13);
                        }
                    }
                    try {
                        if (var2_2 != null) break block35;
                        if (v9 != 0) {
                        }
                        ** GOTO lbl85
                    }
                    catch (MatchException v14) {
                        throw pulsescanner.f.c.e.a(v14);
                    }
                    var3_3 = an.a(var1_1, true);
                    try {
                        if (var2_2 == null) break block36;
lbl85:
                        // 2 sources

                        v9 = 2;
                    }
                    catch (MatchException v15) {
                        throw pulsescanner.f.c.e.a(v15);
                    }
                }
                v16 = new Runnable[v9];
                v16[0] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$attackTarget$0(), ()V)();
                v16[1] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$attackTarget$1(), ()V)();
                var3_3 = v16;
            }
            var3_3[0].run();
            pulsescanner.f.c.e.a.field_1761.method_2918((class_1657)pulsescanner.f.c.e.a.field_1724, (class_1297)var1_1);
            pulsescanner.f.c.e.a.field_1724.method_6104(class_1268.field_5808);
            var3_3[1].run();
            this.q = pulsescanner.f.c.e.r[this.p % pulsescanner.f.c.e.r.length];
            ++this.p;
        }
    }

    @Override
    protected void p() {
        o = null;
        this.q = 0;
        this.p = 0;
    }

    private boolean b(boolean bl) {
        boolean bl2;
        block27: {
            block28: {
                block26: {
                    boolean bl3;
                    block25: {
                        block24: {
                            try {
                                block23: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (pulsescanner.f.c.e.a.field_1724.method_6101() || pulsescanner.f.c.e.a.field_1724.method_5799()) break block23;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.e.a(matchException);
                                                }
                                                if (pulsescanner.f.c.e.a.field_1724.method_5771()) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.e.a(matchException);
                                            }
                                            if (pulsescanner.f.c.e.a.field_1724.method_5765()) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.e.a(matchException);
                                        }
                                        if (!pulsescanner.f.c.e.a.field_1724.method_31549().field_7479) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.e.a(matchException);
                                    }
                                }
                                bl3 = true;
                                break block25;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.e.a(matchException);
                            }
                        }
                        bl3 = false;
                    }
                    boolean bl4 = bl3;
                    try {
                        if (bl4) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.e.a(matchException);
                    }
                    try {
                        try {
                            try {
                                if (!bl || !pulsescanner.f.c.e.a.field_1724.method_24828()) break block26;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.e.a(matchException);
                            }
                            if (pulsescanner.f.c.e.a.field_1690.field_1903.method_1434()) break block26;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.e.a(matchException);
                        }
                        bl2 = true;
                        break block27;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.e.a(matchException);
                    }
                }
                try {
                    try {
                        if (pulsescanner.f.c.e.a.field_1724.method_24828() || !(pulsescanner.f.c.e.a.field_1724.field_6017 > 0.0)) break block28;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.e.a(matchException);
                    }
                    bl2 = true;
                    break block27;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.e.a(matchException);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @y
    public void a(u u2) {
        block10: {
            block9: {
                class_3966 class_39662;
                try {
                    if (this.q > 0) {
                        --this.q;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.e.a(matchException);
                }
                try {
                    if (pulsescanner.f.c.e.a.field_1724 == null || pulsescanner.f.c.e.a.field_1687 == null) break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.e.a(matchException);
                }
                class_239 class_2392 = pulsescanner.f.c.e.a.field_1765;
                if (class_2392 instanceof class_3966 && (class_2392 = (class_39662 = (class_3966)class_2392).method_17782()) instanceof class_1309) {
                    class_1309 class_13092 = (class_1309)class_2392;
                    try {
                        if (this.a(class_13092)) {
                            o = class_13092;
                            this.b(class_13092);
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.e.a(matchException);
                    }
                }
                o = null;
                break block10;
            }
            o = null;
        }
    }

    public e() {
        String[] stringArray = s;
        super(stringArray[0], stringArray[6]);
        this.n = new ah(this, stringArray[9], new at[]{new at(stringArray[7], false), new at(stringArray[1], true), new at(stringArray[2], true)});
        this.m = new at(this, stringArray[8], true);
    }

    private static void lambda$attackTarget$1() {
    }

    private static void lambda$attackTarget$0() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "\nH(OL\u000e3~x.\\\u000f\rW Z_K\u0002,S5AH\n--\u0015\u0010Uai_\u001f =Qa\u007fC\u0002-;\u001a\u0014[B\u0005&\r\u0011T-Q\u000b(37N(KJ\u0007\u000f\rW Z_K\u0002,S5AH\n--\u0015\u0010Uai_\u001f =Qa\u007fC\u0002-;\u001a\u0014[B\u0005&6\u001fN5IH\u00002~M)I_\u000e7;Ha^J\u0007(:\u001a5IY\f$*\u001a([\u000b\u001e/:_3\bR\u00044,\u001a\"ZD\u001826[(Z\u0005\r\u0011T-Q\u000b(37N(KJ\u0007";
                var4_3 = "\nH(OL\u000e3~x.\\\u000f\rW Z_K\u0002,S5AH\n--\u0015\u0010Uai_\u001f =Qa\u007fC\u0002-;\u001a\u0014[B\u0005&\r\u0011T-Q\u000b(37N(KJ\u0007\u000f\rW Z_K\u0002,S5AH\n--\u0015\u0010Uai_\u001f =Qa\u007fC\u0002-;\u001a\u0014[B\u0005&6\u001fN5IH\u00002~M)I_\u000e7;Ha^J\u0007(:\u001a5IY\f$*\u001a([\u000b\u001e/:_3\bR\u00044,\u001a\"ZD\u001826[(Z\u0005\r\u0011T-Q\u000b(37N(KJ\u0007".length();
                var1_4 = 11;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 68;
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
                    var2_2 = "m2H-'o\u0001|(D) \u000f\u007f.U)(`\u0001m?U<\"eFM";
                    var4_3 = "m2H-'o\u0001|(D) \u000f\u007f.U)(`\u0001m?U<\"eFM".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 36;
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
                        v11 = 26;
                        break;
                    }
                    case 1: {
                        v11 = 126;
                        break;
                    }
                    case 2: {
                        v11 = 5;
                        break;
                    }
                    case 3: {
                        v11 = 108;
                        break;
                    }
                    case 4: {
                        v11 = 111;
                        break;
                    }
                    case 5: {
                        v11 = 47;
                        break;
                    }
                    default: {
                        v11 = 5;
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
        pulsescanner.f.c.e.s = var5;
        pulsescanner.f.c.e.r = new int[]{10, 10, 10, 10, 12};
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

