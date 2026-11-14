/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_1835
 *  net.minecraft.class_239
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3489
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  net.minecraft.class_9362
 */
package pulsescanner.f.e;

import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_239;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_9362;
import pulsescanner.f.e.b;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;

public class e
extends i {
    public final c l;
    public final c m;
    public final c n;
    private int o;
    private int p;
    private static final String[] q;

    public e() {
        String[] stringArray = q;
        super(stringArray[8], stringArray[1], pulsescanner.f.h.MISC);
        this.l = this.a(new c(stringArray[2], stringArray[7], true));
        this.m = this.a(new c(stringArray[4], stringArray[5], true));
        this.n = this.a(new c(stringArray[3], stringArray[6], true));
        this.o = -1;
    }

    @Override
    protected void h() {
        this.p();
    }

    @Override
    public String f() {
        String string;
        try {
            string = this.o != -1 ? q[0] : null;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.e.a(matchException);
        }
        return string;
    }

    @Override
    public void i() {
        block81: {
            e e2;
            block80: {
                boolean bl;
                block79: {
                    int n2;
                    block68: {
                        block69: {
                            block74: {
                                block76: {
                                    e e3;
                                    block75: {
                                        e e4;
                                        int n3;
                                        block78: {
                                            int n4;
                                            int n5;
                                            block77: {
                                                int n6;
                                                class_2680 class_26802;
                                                block73: {
                                                    block71: {
                                                        class_2680 class_26803;
                                                        class_1799 class_17992;
                                                        block72: {
                                                            class_1799 class_17993;
                                                            block70: {
                                                                class_3966 class_39662;
                                                                class_239 class_2392;
                                                                block64: {
                                                                    block65: {
                                                                        block66: {
                                                                            block67: {
                                                                                class_310 class_3102;
                                                                                block62: {
                                                                                    block63: {
                                                                                        e e5;
                                                                                        block60: {
                                                                                            bl = pulsescanner.f.e.b.G();
                                                                                            try {
                                                                                                block61: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                e5 = this;
                                                                                                                if (bl) break block60;
                                                                                                                if (!e5.m()) break block61;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw pulsescanner.f.e.e.a(matchException);
                                                                                                            }
                                                                                                            class_3102 = a;
                                                                                                            if (bl) break block62;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw pulsescanner.f.e.e.a(matchException);
                                                                                                        }
                                                                                                        if (class_3102.field_1761 != null) break block63;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw pulsescanner.f.e.e.a(matchException);
                                                                                                    }
                                                                                                }
                                                                                                e5 = this;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.e.e.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        e5.p();
                                                                                        return;
                                                                                    }
                                                                                    class_3102 = a;
                                                                                }
                                                                                class_2392 = class_3102.field_1765;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            n2 = ((Boolean)this.l.a()).booleanValue();
                                                                                            if (bl) break block64;
                                                                                            if (n2 == 0) break block65;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.e.e.a(matchException);
                                                                                        }
                                                                                        n2 = class_2392 instanceof class_3966;
                                                                                        if (bl) break block64;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.e.e.a(matchException);
                                                                                    }
                                                                                    if (n2 == 0) break block65;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.e.e.a(matchException);
                                                                                }
                                                                                class_39662 = (class_3966)class_2392;
                                                                                try {
                                                                                    n2 = class_39662.method_17782() instanceof class_1309;
                                                                                    if (bl) break block64;
                                                                                    if (n2 == 0) break block65;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.e.e.a(matchException);
                                                                                }
                                                                                int n7 = this.o();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (bl) break block66;
                                                                                            if (n7 == -1) break block67;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.e.e.a(matchException);
                                                                                        }
                                                                                        if (n7 == pulsescanner.f.e.e.a.field_1724.method_31548().method_67532()) break block67;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.e.e.a(matchException);
                                                                                    }
                                                                                    this.c(n7);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.e.e.a(matchException);
                                                                                }
                                                                            }
                                                                            this.o = -1;
                                                                            this.p = 0;
                                                                        }
                                                                        return;
                                                                    }
                                                                    n2 = pulsescanner.f.e.e.a.field_1761.method_2923();
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (bl) break block68;
                                                                            if (n2 == 0) break block69;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.e.e.a(matchException);
                                                                        }
                                                                        n2 = class_2392 instanceof class_3965;
                                                                        if (bl) break block68;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.e.e.a(matchException);
                                                                    }
                                                                    if (n2 == 0) break block69;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.e.e.a(matchException);
                                                                }
                                                                class_39662 = (class_3965)class_2392;
                                                                class_26802 = pulsescanner.f.e.e.a.field_1687.method_8320(class_39662.method_17777());
                                                                n5 = pulsescanner.f.e.e.a.field_1724.method_31548().method_67532();
                                                                class_17993 = pulsescanner.f.e.e.a.field_1724.method_31548().method_5438(n5);
                                                                try {
                                                                    try {
                                                                        class_17992 = class_17993;
                                                                        if (bl) break block70;
                                                                        if (class_17992.method_7960()) break block71;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.e.e.a(matchException);
                                                                    }
                                                                    class_17992 = class_17993;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.e.e.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    class_26803 = class_26802;
                                                                    if (bl) break block72;
                                                                    if (!class_17992.method_7951(class_26803)) break block71;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.e.e.a(matchException);
                                                                }
                                                                class_17992 = class_17993;
                                                                class_26803 = class_26802;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.e.e.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            float f2 = class_17992.method_7924(class_26803) - 1.0f;
                                                            n6 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                                            if (bl) break block73;
                                                            if (n6 <= 0) break block71;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.e.e.a(matchException);
                                                        }
                                                        n6 = 1;
                                                        break block73;
                                                    }
                                                    n6 = 0;
                                                }
                                                int n8 = n6;
                                                try {
                                                    try {
                                                        if (bl) break block74;
                                                        if (n8 != 0) break block75;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.e.e.a(matchException);
                                                    }
                                                    e3 = this;
                                                    if (bl) break block76;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.e.e.a(matchException);
                                                }
                                                n3 = e3.a(class_26802);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n3 == -1) break block75;
                                                                n4 = n3;
                                                                if (bl) break block77;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.e.e.a(matchException);
                                                            }
                                                            if (n4 == n5) break block75;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.e.e.a(matchException);
                                                        }
                                                        e4 = this;
                                                        if (bl) break block78;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.e.e.a(matchException);
                                                    }
                                                    n4 = e4.o;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.e.e.a(matchException);
                                                }
                                            }
                                            try {
                                                if (n4 == -1) {
                                                    this.o = n5;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.e.e.a(matchException);
                                            }
                                            e4 = this;
                                        }
                                        e4.c(n3);
                                    }
                                    e3 = this;
                                }
                                e3.p = 3;
                            }
                            return;
                        }
                        try {
                            e2 = this;
                            if (bl) break block79;
                            n2 = e2.p;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.e.e.a(matchException);
                        }
                    }
                    if (n2 <= 0) break block81;
                    e2 = this;
                }
                try {
                    try {
                        if (bl) break block80;
                        if (e2.p-- != 1) break block81;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.e.a(matchException);
                    }
                    e2 = this;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.e.e.a(matchException);
                }
            }
            e2.p();
        }
    }

    private int a(class_2680 class_26802) {
        int n2 = -1;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < 9; ++i2) {
            float f3;
            float f4;
            block12: {
                block11: {
                    class_1799 class_17992 = pulsescanner.f.e.e.a.field_1724.method_31548().method_5438(i2);
                    try {
                        if (class_17992.method_7960()) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.e.a(matchException);
                    }
                    float f5 = class_17992.method_7924(class_26802);
                    try {
                        if (f5 <= 1.0f) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.e.a(matchException);
                    }
                    try {
                        try {
                            f4 = f5;
                            if (!((Boolean)this.m.a()).booleanValue() || !class_17992.method_7951(class_26802)) break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.e.e.a(matchException);
                        }
                        f3 = 1000.0f;
                        break block12;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.e.a(matchException);
                    }
                }
                f3 = 0.0f;
            }
            float f6 = f4 + f3;
            if (!(f6 > f2)) continue;
            f2 = f6;
            n2 = i2;
        }
        return n2;
    }

    private int o() {
        int n2 = -1;
        int n3 = 0;
        for (int i2 = 0; i2 < 9; ++i2) {
            int n4 = pulsescanner.f.e.e.a(pulsescanner.f.e.e.a.field_1724.method_31548().method_5438(i2));
            if (n4 <= n3) continue;
            n3 = n4;
            n2 = i2;
        }
        return n2;
    }

    private static int a(class_1799 class_17992) {
        try {
            if (class_17992.method_7960()) {
                return 0;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.e.a(matchException);
        }
        try {
            if (class_17992.method_7909() instanceof class_9362) {
                return 4;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.e.a(matchException);
        }
        try {
            if (class_17992.method_31573(class_3489.field_42611)) {
                return 3;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.e.a(matchException);
        }
        try {
            if (class_17992.method_7909() instanceof class_1835) {
                return 2;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.e.a(matchException);
        }
        try {
            if (class_17992.method_31573(class_3489.field_42612)) {
                return 1;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.e.a(matchException);
        }
        return 0;
    }

    private void c(int n2) {
        pulsescanner.f.e.e.a.field_1724.method_31548().method_61496(n2);
        pulsescanner.f.e.e.a.field_1761.method_2911();
    }

    private void p() {
        block9: {
            try {
                this.p = 0;
                if (this.o == -1) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.e.e.a(matchException);
            }
            try {
                try {
                    try {
                        if (!((Boolean)this.n.a()).booleanValue() || pulsescanner.f.e.e.a.field_1724 == null) break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.e.a(matchException);
                    }
                    if (pulsescanner.f.e.e.a.field_1761 == null) break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.e.e.a(matchException);
                }
                this.c(this.o);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.e.e.a(matchException);
            }
        }
        this.o = -1;
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
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "+\\\u007f\u001cKoW\u0019Hb\u0001^b'9\u001f\u007f\u001a\u001d~*/\u001fi\u0010N~b>Pd\u0019\u001dl-8\u001f\u007f\u001dX* &Ph\u001e\u001ds-?\u0018y\u0010\u001dg+$Ve\u0012\u0011*-8\u001fr\u001aHxb(Zx\u0001\u001d}'+Od\u001b\u001de,j^+\u0001\\x%/K%\u0006\u001dZj\u0005Rd\u000b\u0019Hb\u0001^bb\b^h\u001e\r\u0001Zn\u0005\u001dO,)Wj\u001bIyo\u001aMn\u0013Xxb+\u001f\u007f\u001aRfb>Wj\u0001\u001ayb9Jb\u0001\\h./\u001fm\u001aO*6\"Z+\u0017Qe!!\u001f#\u0006R*\u0011#S`Uie7)W+Z\u001dL-8K~\u001bX*1>Vg\u0019\u001dk2:Sr\\\u001de4/M+\u0014\u001dl#9Kn\u0007\u001d\u007f,9Jb\u0001\\h./\u001fd\u001bX$H\u0018Z\u007f\u0000Odb>P+\fR\u007f0jOy\u0010Kc-?L+\u0006Qe6jLc\u001aO~.3\u001fj\u0013Io0jFd\u0000\u001dy6%O+\u0018Td+$X+]Ie-&L+\u001aSf;c\u0011";
                var4_3 = "+\\\u007f\u001cKoW\u0019Hb\u0001^b'9\u001f\u007f\u001a\u001d~*/\u001fi\u0010N~b>Pd\u0019\u001dl-8\u001f\u007f\u001dX* &Ph\u001e\u001ds-?\u0018y\u0010\u001dg+$Ve\u0012\u0011*-8\u001fr\u001aHxb(Zx\u0001\u001d}'+Od\u001b\u001de,j^+\u0001\\x%/K%\u0006\u001dZj\u0005Rd\u000b\u0019Hb\u0001^bb\b^h\u001e\r\u0001Zn\u0005\u001dO,)Wj\u001bIyo\u001aMn\u0013Xxb+\u001f\u007f\u001aRfb>Wj\u0001\u001ayb9Jb\u0001\\h./\u001fm\u001aO*6\"Z+\u0017Qe!!\u001f#\u0006R*\u0011#S`Uie7)W+Z\u001dL-8K~\u001bX*1>Vg\u0019\u001dk2:Sr\\\u001de4/M+\u0014\u001dl#9Kn\u0007\u001d\u007f,9Jb\u0001\\h./\u001fd\u001bX$H\u0018Z\u007f\u0000Odb>P+\fR\u007f0jOy\u0010Kc-?L+\u0006Qe6jLc\u001aO~.3\u001fj\u0013Io0jFd\u0000\u001dy6%O+\u0018Td+$X+]Ie-&L+\u001aSf;c\u0011".length();
                var1_4 = 6;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 2;
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
                    var2_2 = "2cI*uII\u0015{\u0000'yT\u001bAvE-b\u0001\u001e\u0004uP1x\u0001\u001e\tqN~wH\u0004\bzG~wUI\u00004M1t\u0001\u0006\u00134P2wX\f\u00134\b?xEI\nqE.6H\u001dA{U*?\u000f\u000f-qG7b\u0001(\u0014`O~BN\u0006\r";
                    var4_3 = "2cI*uII\u0015{\u0000'yT\u001bAvE-b\u0001\u001e\u0004uP1x\u0001\u001e\tqN~wH\u0004\bzG~wUI\u00004M1t\u0001\u0006\u00134P2wX\f\u00134\b?xEI\nqE.6H\u001dA{U*?\u000f\u000f-qG7b\u0001(\u0014`O~BN\u0006\r".length();
                    var1_4 = 76;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 41;
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
                        v11 = 72;
                        break;
                    }
                    case 1: {
                        v11 = 61;
                        break;
                    }
                    case 2: {
                        v11 = 9;
                        break;
                    }
                    case 3: {
                        v11 = 119;
                        break;
                    }
                    case 4: {
                        v11 = 63;
                        break;
                    }
                    case 5: {
                        v11 = 8;
                        break;
                    }
                    default: {
                        v11 = 64;
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
        pulsescanner.f.e.e.q = var5;
    }
}

