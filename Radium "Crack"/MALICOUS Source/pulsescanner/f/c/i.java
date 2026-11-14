/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1511
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2824$class_5908
 *  net.minecraft.class_3489
 *  net.minecraft.class_3966
 */
package pulsescanner.f.c;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_3489;
import net.minecraft.class_3966;
import pulsescanner.a.as;
import pulsescanner.a.q;
import pulsescanner.a.y;
import pulsescanner.f.c.t;
import pulsescanner.f.c.v;

public class i
extends as {
    private static final String[] m;

    public i() {
        String[] stringArray = m;
        super(stringArray[0], stringArray[1]);
    }

    @y
    public void a(q q2) {
        block5: {
            try {
                try {
                    if (!q2.f() || pulsescanner.f.c.i.a.field_1724 == null) break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.i.a(matchException);
                }
                if (pulsescanner.f.c.i.a.field_1687 == null) break block5;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.i.a(matchException);
            }
            class_2596<?> class_25962 = q2.d();
            if (class_25962 instanceof class_2824) {
                class_2824 class_28242 = (class_2824)class_25962;
                class_28242.method_34209((class_2824.class_5908)new v(this));
            }
        }
    }

    private void s() {
        class_1297 class_12972;
        class_3966 class_39662;
        class_239 class_2392 = pulsescanner.f.c.i.a.field_1765;
        if (class_2392 instanceof class_3966 && (class_39662 = (class_3966)class_2392).method_17783() == class_239.class_240.field_1331 && (class_12972 = class_39662.method_17782()) instanceof class_1511) {
            class_2392 = (class_1511)class_12972;
            try {
                if (this.t()) {
                    class_2392.method_31472();
                    class_2392.method_31745(class_1297.class_5529.field_26998);
                    class_2392.method_36209();
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.i.a(matchException);
            }
        }
    }

    private boolean t() {
        boolean bl;
        block41: {
            block43: {
                block42: {
                    String[] stringArray;
                    block39: {
                        int n2;
                        block40: {
                            class_1293 class_12932;
                            class_1293 class_12933;
                            block38: {
                                class_1293 class_12934;
                                block36: {
                                    block37: {
                                        class_12933 = pulsescanner.f.c.i.a.field_1724.method_6112(class_1294.field_5911);
                                        stringArray = t.y();
                                        try {
                                            try {
                                                class_12934 = class_12933;
                                                if (stringArray != null) break block36;
                                                if (class_12934 != null) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.i.a(matchException);
                                            }
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.i.a(matchException);
                                        }
                                    }
                                    class_12934 = pulsescanner.f.c.i.a.field_1724.method_6112(class_1294.field_5910);
                                }
                                class_1293 class_12935 = class_12934;
                                try {
                                    class_12932 = class_12935;
                                    if (stringArray != null) break block38;
                                    if (class_12932 == null) break block39;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.i.a(matchException);
                                }
                                class_12932 = class_12935;
                            }
                            try {
                                try {
                                    n2 = class_12932.method_5578();
                                    if (stringArray != null) break block40;
                                    if (n2 <= class_12933.method_5578()) break block39;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.i.a(matchException);
                                }
                                n2 = 1;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.i.a(matchException);
                            }
                        }
                        return n2 != 0;
                    }
                    class_1799 class_17992 = pulsescanner.f.c.i.a.field_1724.method_6047();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        bl = class_17992.method_31573(class_3489.field_42611);
                                                                        if (stringArray != null) break block41;
                                                                        if (bl) break block42;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.c.i.a(matchException);
                                                                    }
                                                                    bl = class_17992.method_31573(class_3489.field_42612);
                                                                    if (stringArray != null) break block41;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.c.i.a(matchException);
                                                                }
                                                                if (bl) break block42;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.i.a(matchException);
                                                            }
                                                            bl = class_17992.method_31573(class_3489.field_42614);
                                                            if (stringArray != null) break block41;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.c.i.a(matchException);
                                                        }
                                                        if (bl) break block42;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.c.i.a(matchException);
                                                    }
                                                    bl = class_17992.method_31573(class_3489.field_42615);
                                                    if (stringArray != null) break block41;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.i.a(matchException);
                                                }
                                                if (bl) break block42;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.i.a(matchException);
                                            }
                                            bl = class_17992.method_31573(class_3489.field_42613);
                                            if (stringArray != null) break block41;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.i.a(matchException);
                                        }
                                        if (bl) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.i.a(matchException);
                                    }
                                    bl = class_17992.method_31574(class_1802.field_49814);
                                    if (stringArray != null) break block41;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.i.a(matchException);
                                }
                                if (bl) break block42;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.i.a(matchException);
                            }
                            bl = class_17992.method_31574(class_1802.field_8547);
                            if (stringArray != null) break block41;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.i.a(matchException);
                        }
                        if (!bl) break block43;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.i.a(matchException);
                    }
                }
                bl = true;
                break block41;
            }
            bl = false;
        }
        return bl;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = " k\u0002Q\u0016s$\n\u007fV{\tc-\u001bz\u001aKK=~\u001bW\r\u007f-Ox\u0004A\bn?\u0003hVL\u0013\u007f~\u0006u\u0005L\u001at*Ob\u0019M[r7\u001b;\u0002P\u001ew~\u0006u\u0005L\u001e{:Ot\u0010\u0018\f{7\u001br\u0018_[u0Oo\u001e][i;\u001dm\u0013JU";
            var4_3 = " k\u0002Q\u0016s$\n\u007fV{\tc-\u001bz\u001aKK=~\u001bW\r\u007f-Ox\u0004A\bn?\u0003hVL\u0013\u007f~\u0006u\u0005L\u001at*Ob\u0019M[r7\u001b;\u0002P\u001ew~\u0006u\u0005L\u001e{:Ot\u0010\u0018\f{7\u001br\u0018_[u0Oo\u001e][i;\u001dm\u0013JU".length();
            var1_4 = 18;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = 112;
            v0 = v2;
            v4 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl53
            do {
                v3 = v3;
                v0 = v0;
                v5 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 31;
                        break;
                    }
                    case 1: {
                        v6 = 107;
                        break;
                    }
                    case 2: {
                        v6 = 6;
                        break;
                    }
                    case 3: {
                        v6 = 72;
                        break;
                    }
                    case 4: {
                        v6 = 11;
                        break;
                    }
                    case 5: {
                        v6 = 106;
                        break;
                    }
                    default: {
                        v6 = 46;
                    }
                }
                v0[v5] = (char)(v0[v5] ^ (v3 ^ v6));
                ++var6_6;
lbl53:
                // 2 sources

                v4 = v4;
            } while (v4 > var6_6);
            ** while (true)
        }
        pulsescanner.f.c.i.m = var5;
    }
}

