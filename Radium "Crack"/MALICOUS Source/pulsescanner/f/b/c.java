/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_437
 */
package pulsescanner.f.b;

import java.util.Iterator;
import net.minecraft.class_437;
import pulsescanner.c.f;
import pulsescanner.f.b.g;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.f.m;
import pulsescanner.i.b;
import pulsescanner.i.d;

public class c
extends i {
    public final b l;
    public final pulsescanner.i.c m;
    public final pulsescanner.i.g n;
    public final pulsescanner.i.c o;
    public final pulsescanner.i.g p;
    public final pulsescanner.i.c q;
    public final pulsescanner.i.c r;
    public final pulsescanner.i.c s;
    public final d t;
    public final d u;
    public final d v;
    public final b w;
    private static boolean x;
    private static final String[] y;

    public c() {
        block12: {
            boolean bl;
            block14: {
                block13: {
                    String[] stringArray = y;
                    super(stringArray[16], stringArray[6], pulsescanner.f.h.CLIENT);
                    this.l = this.a(new b(stringArray[14], stringArray[10], c::lambda$new$0));
                    this.m = this.a(new pulsescanner.i.c(stringArray[27], stringArray[11], true));
                    this.n = this.a(new pulsescanner.i.g(stringArray[13], stringArray[23], 78.0, 0.0, 100.0, 1.0, "%"));
                    boolean bl2 = pulsescanner.f.b.c.q();
                    this.o = this.a(new pulsescanner.i.c(stringArray[18], stringArray[3], true));
                    this.p = this.a(new pulsescanner.i.g(stringArray[19], stringArray[9], 5.0, 0.0, 8.0, 0.5));
                    this.q = this.a(new pulsescanner.i.c(stringArray[12], stringArray[20], true));
                    this.r = this.a(new pulsescanner.i.c(stringArray[21], stringArray[15], true));
                    this.s = this.a(new pulsescanner.i.c(stringArray[2], stringArray[7], false));
                    this.t = this.a(new d(stringArray[8], stringArray[24], -6052947));
                    this.u = this.a(new d(stringArray[26], stringArray[0], -855310));
                    this.v = this.a(new d(stringArray[17], stringArray[1], -879028));
                    this.w = this.a(new b(stringArray[5], stringArray[25], c::o));
                    for (j j2 : pulsescanner.f.m.c()) {
                        block10: {
                            try {
                                try {
                                    if (!bl2) break block10;
                                    if (j2.q()) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.b.c.a(matchException);
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.b.c.a(matchException);
                            }
                            stringArray = y;
                            this.a(new g(this, j2.b, stringArray[4] + j2.b + stringArray[22], j2.b(), j2));
                        }
                        if (bl2) continue;
                    }
                    try {
                        try {
                            if (pulsescanner.f.i.n() == null) break block12;
                            if (!bl2) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.b.c.a(matchException);
                        }
                        bl = false;
                        break block14;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.b.c.a(matchException);
                    }
                }
                bl = true;
            }
            pulsescanner.f.b.c.b(bl);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    private static void o() {
        Iterator<j> iterator = pulsescanner.f.m.c().iterator();
        boolean bl = pulsescanner.f.b.c.p();
        while (iterator.hasNext()) {
            j j2 = iterator.next();
            j2.o();
            if (!bl) continue;
        }
    }

    private static void lambda$new$0() {
        a.method_1507((class_437)new f(pulsescanner.f.b.c.a.field_1755));
    }

    public static void b(boolean bl) {
        x = bl;
    }

    public static boolean p() {
        return x;
    }

    public static boolean q() {
        boolean bl = pulsescanner.f.b.c.p();
        return !bl;
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
                var5 = new String[28];
                var3_1 = 0;
                var2_2 = "\u0010\u0015@)JT\u00015ZZ'T\u0001\u000b T#\u0012\u0019O#V\u0000N&\tI\"\u0018\u0016\u0017s\u0018M4KT\u000f=\u001e\f.Q\u0013\u0006?\u0013K.L\u0007@\u000b\u0007\u001fT2\u0018'\u00062\u001eC1%\u0007\u0012E(\u0018\u0018\u00074\u0012XfZ\u001b\u001c7\u001f^fY\u0006\u0001&\u0014HfZ\u0015\r8\u001d^)M\u001a\n T\t\u0000\u0012C1\u0018\u0000\u00066Z\f\u0001\u001f_#LT\"2\u0003C3L5\u0007\u000f^(\u0018<;\u0017ZI*]\u0019\u000b=\u000e_fW\u001aN<\b\f)^\u0012N2\u0014Hf[\u001c\u000f=\u001dIfP\u001b\u0019s\u000eD#AT\u0002<\u0015Gh\u001b\u0017\bC6\u0018\u0007\u00062\u001eC1\u0018\u0001\u00007\u001f^fp!*s\u000eI>LZ\u000b\u001f\u001bN#TT-<\u0016C4\u000e\u0010\u0015^(]\u0006N!\u001bH/M\u0007@\u0019\u0017\bM!\u0018<;\u0017ZI*]\u0019\u000b=\u000e_fY\u0006\u0001&\u0014Hh&\u0014\u0016M5KT\f2\u0019G!J\u001b\u001b=\u001e_fZ\u0011\u0006:\u0014Hfp!*s\u001f@#U\u0011\u0000'\t\u0002\u0004\u0014\u0016C1\u0007\u001c\nM%Q\u0000\u0017\u000b\u0016\u001eE2\u00188\u000f*\u0015Y27\u0014\u0016M5KT\u001c6\u001c@#[\u0000\u0007<\u0014\f'V\u0010N2Z@/_\u001c\u001as\t[#]\u0004N2\u0019^)K\u0007N\u001b/hf]\u0018\u000b>\u001fB2KZ\u0003\u001b/h\u0006\u0012\u0019O#V\u0000\u0006\u0011\u0015^\"]\u0006\u0006\u0001\u001bH/M\u0007$\u0000\u0015J2\u0018\u0003\u0006:\u000eIf_\u0018\u0001$ZM4W\u0001\u00007Zd\u0013|T\u000b?\u001fA#V\u0000\u001d}\u0005\u0000\u0012E(]\rs2y\u0002\u0018\u0011\u00026\u0017I(LZ\u0013\u0011\u001bO-_\u0006\u0001&\u0014HfW\u0004\u000f0\u0013X?\u0016\u001e\u0010\u0015@)JT\u00015Z@'Z\u0011\u0002 Z_3[\u001cN2\t\fd~$=qT\u001a\u0001\u001f_2W\u0006\u000bs\u001eI Y\u0001\u0002'Z\\)K\u001d\u001a:\u0015B5\u0016";
                var4_3 = "\u0010\u0015@)JT\u00015ZZ'T\u0001\u000b T#\u0012\u0019O#V\u0000N&\tI\"\u0018\u0016\u0017s\u0018M4KT\u000f=\u001e\f.Q\u0013\u0006?\u0013K.L\u0007@\u000b\u0007\u001fT2\u0018'\u00062\u001eC1%\u0007\u0012E(\u0018\u0018\u00074\u0012XfZ\u001b\u001c7\u001f^fY\u0006\u0001&\u0014HfZ\u0015\r8\u001d^)M\u001a\n T\t\u0000\u0012C1\u0018\u0000\u00066Z\f\u0001\u001f_#LT\"2\u0003C3L5\u0007\u000f^(\u0018<;\u0017ZI*]\u0019\u000b=\u000e_fW\u001aN<\b\f)^\u0012N2\u0014Hf[\u001c\u000f=\u001dIfP\u001b\u0019s\u000eD#AT\u0002<\u0015Gh\u001b\u0017\bC6\u0018\u0007\u00062\u001eC1\u0018\u0001\u00007\u001f^fp!*s\u000eI>LZ\u000b\u001f\u001bN#TT-<\u0016C4\u000e\u0010\u0015^(]\u0006N!\u001bH/M\u0007@\u0019\u0017\bM!\u0018<;\u0017ZI*]\u0019\u000b=\u000e_fY\u0006\u0001&\u0014Hh&\u0014\u0016M5KT\f2\u0019G!J\u001b\u001b=\u001e_fZ\u0011\u0006:\u0014Hfp!*s\u001f@#U\u0011\u0000'\t\u0002\u0004\u0014\u0016C1\u0007\u001c\nM%Q\u0000\u0017\u000b\u0016\u001eE2\u00188\u000f*\u0015Y27\u0014\u0016M5KT\u001c6\u001c@#[\u0000\u0007<\u0014\f'V\u0010N2Z@/_\u001c\u001as\t[#]\u0004N2\u0019^)K\u0007N\u001b/hf]\u0018\u000b>\u001fB2KZ\u0003\u001b/h\u0006\u0012\u0019O#V\u0000\u0006\u0011\u0015^\"]\u0006\u0006\u0001\u001bH/M\u0007$\u0000\u0015J2\u0018\u0003\u0006:\u000eIf_\u0018\u0001$ZM4W\u0001\u00007Zd\u0013|T\u000b?\u001fA#V\u0000\u001d}\u0005\u0000\u0012E(]\rs2y\u0002\u0018\u0011\u00026\u0017I(LZ\u0013\u0011\u001bO-_\u0006\u0001&\u0014HfW\u0004\u000f0\u0013X?\u0016\u001e\u0010\u0015@)JT\u00015Z@'Z\u0011\u0002 Z_3[\u001cN2\t\fd~$=qT\u001a\u0001\u001f_2W\u0006\u000bs\u001eI Y\u0001\u0002'Z\\)K\u001d\u001a:\u0015B5\u0016".length();
                var1_4 = 16;
                pulsescanner.f.b.c.b(false);
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 33;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "^@\u001bh\u0006\u000fvgM\u0018o\nJ@\u0014v\u0004]Z}O\u0013";
                    var4_3 = "^@\u001bh\u0006\u000fvgM\u0018o\nJ@\u0014v\u0004]Z}O\u0013".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 122;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (true) ** GOTO lbl72
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v11 = 114;
                        break;
                    }
                    case 1: {
                        v11 = 91;
                        break;
                    }
                    case 2: {
                        v11 = 13;
                        break;
                    }
                    case 3: {
                        v11 = 103;
                        break;
                    }
                    case 4: {
                        v11 = 25;
                        break;
                    }
                    case 5: {
                        v11 = 85;
                        break;
                    }
                    default: {
                        v11 = 79;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl72:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl80:
                // 1 sources

                ** continue;
            }
        }
        pulsescanner.f.b.c.y = var5;
    }
}

