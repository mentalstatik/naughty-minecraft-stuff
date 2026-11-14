/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_332;
import pulsescanner.c.f;
import pulsescanner.f.d.a;
import pulsescanner.g.e;
import pulsescanner.i.c;

public class j
extends pulsescanner.f.j {
    public final pulsescanner.i.f x;
    public final c C;
    public final pulsescanner.i.f D;
    public final c E;
    private static final class_1304[] F;
    private static final float G = 4.0f;
    private static final float H = 17.0f;
    private final List<class_1799> I;
    private static final String[] J;

    public j() {
        String[] stringArray = J;
        super(stringArray[7], stringArray[1], 1, 2, 0.0f, 58.0f);
        this.x = this.a(new pulsescanner.i.f(stringArray[15], stringArray[11], stringArray[3], stringArray[0], stringArray[4]));
        this.C = this.a(new c(stringArray[8], stringArray[16], true));
        this.D = (pulsescanner.i.f)this.a(new pulsescanner.i.f(stringArray[13], stringArray[5], stringArray[12], stringArray[12], stringArray[9])).a(this.C::a);
        this.E = this.a(new c(stringArray[14], stringArray[10], true));
        this.I = new ArrayList<class_1799>();
    }

    private String a(class_1799 class_17992) {
        String string;
        block6: {
            String string2;
            block8: {
                block7: {
                    try {
                        try {
                            if (class_17992.method_7963()) break block6;
                            if (class_17992.method_7947() <= 1) break block7;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.j.a(matchException);
                        }
                        string2 = String.valueOf(class_17992.method_7947());
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.j.a(matchException);
                    }
                }
                string2 = "";
            }
            return string2;
        }
        int n2 = class_17992.method_7936() - class_17992.method_7919();
        try {
            string = this.D.a(J[2]) ? Math.round(100.0f * (float)n2 / (float)class_17992.method_7936()) + "%" : String.valueOf(n2);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.j.a(matchException);
        }
        return string;
    }

    private int b(class_1799 class_17992) {
        try {
            if (!class_17992.method_7963()) {
                return pulsescanner.d.c.d();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.j.a(matchException);
        }
        float f2 = 1.0f - (float)class_17992.method_7919() / (float)class_17992.method_7936();
        try {
            if (f2 > 0.5f) {
                return pulsescanner.d.c.d();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.j.a(matchException);
        }
        try {
            if (f2 > 0.2f) {
                return -11930;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.j.a(matchException);
        }
        return -38037;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void r() {
        block58: {
            block59: {
                block60: {
                    block54: {
                        block56: {
                            block57: {
                                block55: {
                                    block52: {
                                        block53: {
                                            block48: {
                                                block51: {
                                                    block44: {
                                                        block45: {
                                                            block47: {
                                                                block46: {
                                                                    var1_1 = pulsescanner.f.d.a.b();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v0 = this;
                                                                                    if (var1_1 == null) break block44;
                                                                                    v0.I.clear();
                                                                                    if (!this.m()) break block45;
                                                                                }
                                                                                catch (MatchException v1) {
                                                                                    throw pulsescanner.f.d.j.a(v1);
                                                                                }
                                                                                v2 = (Boolean)this.E.a();
                                                                                if (var1_1 == null) break block46;
                                                                            }
                                                                            catch (MatchException v3) {
                                                                                throw pulsescanner.f.d.j.a(v3);
                                                                            }
                                                                            if (!v2) break block47;
                                                                        }
                                                                        catch (MatchException v4) {
                                                                            throw pulsescanner.f.d.j.a(v4);
                                                                        }
                                                                        v2 = pulsescanner.f.d.j.a.field_1724.method_6047().method_7960();
                                                                    }
                                                                    catch (MatchException v5) {
                                                                        throw pulsescanner.f.d.j.a(v5);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var1_1 == null || v2) break block47;
                                                                    }
                                                                    catch (MatchException v6) {
                                                                        throw pulsescanner.f.d.j.a(v6);
                                                                    }
                                                                    v2 = this.I.add(pulsescanner.f.d.j.a.field_1724.method_6047());
                                                                }
                                                                catch (MatchException v7) {
                                                                    throw pulsescanner.f.d.j.a(v7);
                                                                }
                                                            }
                                                            var2_2 = pulsescanner.f.d.j.F;
                                                            var3_4 = var2_2.length;
                                                            var4_7 = 0;
                                                            while (var4_7 < var3_4) {
                                                                block49: {
                                                                    block50: {
                                                                        var5_9 = var2_2[var4_7];
                                                                        if (var1_1 == null) break block48;
                                                                        var6_10 = pulsescanner.f.d.j.a.field_1724.method_6118(var5_9);
                                                                        try {
                                                                            try {
                                                                                if (var1_1 == null) break block49;
                                                                                if (var6_10.method_7960()) break block50;
                                                                            }
                                                                            catch (MatchException v8) {
                                                                                throw pulsescanner.f.d.j.a(v8);
                                                                            }
                                                                            this.I.add(var6_10);
                                                                        }
                                                                        catch (MatchException v9) {
                                                                            throw pulsescanner.f.d.j.a(v9);
                                                                        }
                                                                    }
                                                                    ++var4_7;
                                                                }
                                                                if (var1_1 != null) continue;
                                                            }
                                                        }
                                                        v0 = this;
                                                    }
                                                    try {
                                                        try {
                                                            v10 = v0.I.isEmpty();
                                                            if (var1_1 == null) break block51;
                                                            if (!v10) break block48;
                                                        }
                                                        catch (MatchException v11) {
                                                            throw pulsescanner.f.d.j.a(v11);
                                                        }
                                                        v10 = pulsescanner.f.d.j.a.field_1755 instanceof f;
                                                    }
                                                    catch (MatchException v12) {
                                                        throw pulsescanner.f.d.j.a(v12);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var1_1 == null || !v10) break block48;
                                                    }
                                                    catch (MatchException v13) {
                                                        throw pulsescanner.f.d.j.a(v13);
                                                    }
                                                    this.I.add(new class_1799((class_1935)class_1802.field_8805));
                                                    v10 = this.I.add(new class_1799((class_1935)class_1802.field_8058));
                                                }
                                                catch (MatchException v14) {
                                                    throw pulsescanner.f.d.j.a(v14);
                                                }
                                            }
                                            var2_3 = 0.0f;
                                            try {
                                                v15 = this;
                                                if (var1_1 == null) break block52;
                                                if (!((Boolean)v15.C.a()).booleanValue()) break block53;
                                            }
                                            catch (MatchException v16) {
                                                throw pulsescanner.f.d.j.a(v16);
                                            }
                                            for (class_1799 var4_8 : this.I) {
                                                v17 = var2_3;
                                                if (var1_1 != null) {
                                                    var2_3 = Math.max(v17, (float)pulsescanner.g.e.a(this.a(var4_8)));
                                                    if (var1_1 != null) continue;
                                                }
                                                break block54;
                                            }
                                        }
                                        v15 = this;
                                    }
                                    try {
                                        try {
                                            if (var1_1 == null) break block55;
                                            if (v15.x.a(pulsescanner.f.d.j.J[6])) {
                                            }
                                            ** GOTO lbl140
                                        }
                                        catch (MatchException v18) {
                                            throw pulsescanner.f.d.j.a(v18);
                                        }
                                        v15 = this;
                                    }
                                    catch (MatchException v19) {
                                        throw pulsescanner.f.d.j.a(v19);
                                    }
                                }
                                try {
                                    try {
                                        v20 = 24.0f;
                                        v21 = var2_3;
                                        if (var1_1 == null) break block56;
                                        if (!(v21 > 0.0f)) break block57;
                                    }
                                    catch (MatchException v22) {
                                        throw pulsescanner.f.d.j.a(v22);
                                    }
                                    v21 = 4.0f + var2_3;
                                    break block56;
                                }
                                catch (MatchException v23) {
                                    throw pulsescanner.f.d.j.a(v23);
                                }
                            }
                            v21 = 0.0f;
                        }
                        try {
                            v15.A = v20 + v21;
                            this.B = 8.0f + (float)Math.max(1, this.I.size()) * 17.0f - 1.0f;
                            if (var1_1 != null) break block58;
lbl140:
                            // 2 sources

                            v17 = Math.max(17.0f, var2_3 + 3.0f);
                        }
                        catch (MatchException v24) {
                            throw pulsescanner.f.d.j.a(v24);
                        }
                    }
                    var3_6 = v17;
                    try {
                        try {
                            v25 = this;
                            v26 = 8.0f;
                            v27 = Math.max(1, this.I.size());
                            if (var1_1 == null) break block59;
                            v25.A = v26 + (float)v27 * var3_6 - 1.0f;
                            v25 = this;
                            v26 = 24.0f;
                            if (!((Boolean)this.C.a()).booleanValue()) break block60;
                        }
                        catch (MatchException v28) {
                            throw pulsescanner.f.d.j.a(v28);
                        }
                        v27 = 10;
                        break block59;
                    }
                    catch (MatchException v29) {
                        throw pulsescanner.f.d.j.a(v29);
                    }
                }
                v27 = 0;
            }
            v25.B = v26 + (float)v27;
        }
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        float f3;
        try {
            if (this.I.isEmpty()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.j.a(matchException);
        }
        pulsescanner.d.c.a(class_3322, this.y, this.z, this.A, this.B);
        boolean bl = this.x.a(J[0]);
        float f4 = 0.0f;
        if (((Boolean)this.C.a()).booleanValue()) {
            for (class_1799 class_17992 : this.I) {
                f4 = Math.max(f4, (float)pulsescanner.g.e.a(this.a(class_17992)));
            }
        }
        try {
            f3 = bl ? 17.0f : Math.max(17.0f, f4 + 3.0f);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.j.a(matchException);
        }
        float f5 = f3;
        for (int i2 = 0; i2 < this.I.size(); ++i2) {
            int n2;
            int n3;
            class_1799 class_17993 = this.I.get(i2);
            if (bl) {
                n3 = Math.round(this.y + 4.0f);
                n2 = Math.round(this.z + 4.0f + (float)i2 * 17.0f);
            } else {
                n3 = Math.round(this.y + 4.0f + (float)i2 * f5 + (f5 - 1.0f - 16.0f) / 2.0f);
                n2 = Math.round(this.z + 4.0f);
            }
            try {
                class_3322.method_51427(class_17993, n3, n2);
                if (!((Boolean)this.C.a()).booleanValue()) {
                    class_3322.method_51431(pulsescanner.g.e.d(), class_17993, n3, n2);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.j.a(matchException);
            }
            if (!((Boolean)this.C.a()).booleanValue()) continue;
            String string = this.a(class_17993);
            try {
                if (bl) {
                    pulsescanner.d.c.a(class_3322, string, (float)(n3 + 20), (float)n2 + 4.5f, this.b(class_17993));
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.j.a(matchException);
            }
            pulsescanner.d.c.a(class_3322, string, (float)(n3 + 8) - (float)pulsescanner.g.e.a(string) / 2.0f, (float)(n2 + 18), this.b(class_17993));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[17];
                var3_1 = 0;
                var2_2 = "[@M\n\u0004Y\\a\u001eTJJ\fM[O`JM^\fTY-LK\rM^H\u007fD]\u0017\u0001SIt\u000b\u0007]@M\u001d\bTI\nEJM\u0017\u0017USyDS\nEJM\u0017\u0017USyDS\u0012IPM\u001f\u000fSQdQF^\u000bUO`DKP\b[@M\n\u0004Y\\a\tLWR\u0011\u001f\u001auXa\nIPM\u001f\u000fSQdQF\u0005[DS\u000b\b#DK\\\u0012\u0018^X-QW\u001bMSIhH\u001f\u0017\u0003\u001aDbPM^\u0000[Tc\u0005W\u001f\u0003^\u0013\fLWM\u001f\u0003]X`@Q\nC\u0007]@M\u001d\bTI\u0006KJM\u0013\fN\tE@S\u001aMsIhH";
                var4_3 = "[@M\n\u0004Y\\a\u001eTJJ\fM[O`JM^\fTY-LK\rM^H\u007fD]\u0017\u0001SIt\u000b\u0007]@M\u001d\bTI\nEJM\u0017\u0017USyDS\nEJM\u0017\u0017USyDS\u0012IPM\u001f\u000fSQdQF^\u000bUO`DKP\b[@M\n\u0004Y\\a\tLWR\u0011\u001f\u001auXa\nIPM\u001f\u000fSQdQF\u0005[DS\u000b\b#DK\\\u0012\u0018^X-QW\u001bMSIhH\u001f\u0017\u0003\u001aDbPM^\u0000[Tc\u0005W\u001f\u0003^\u0013\fLWM\u001f\u0003]X`@Q\nC\u0007]@M\u001d\bTI\u0006KJM\u0013\fN\tE@S\u001aMsIhH".length();
                var1_4 = 8;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 121;
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
                    var2_2 = "=8:md2\u001a\"1,u14$\u001c8*lx(&Q=6pp$(\u001d07{?";
                    var4_3 = "=8:md2\u001a\"1,u14$\u001c8*lx(&Q=6pp$(\u001d07{?".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 5;
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
                        v11 = 116;
                        break;
                    }
                    case 1: {
                        v11 = 92;
                        break;
                    }
                    case 2: {
                        v11 = 70;
                        break;
                    }
                    case 3: {
                        v11 = 7;
                        break;
                    }
                    case 4: {
                        v11 = 20;
                        break;
                    }
                    case 5: {
                        v11 = 67;
                        break;
                    }
                    default: {
                        v11 = 68;
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
        pulsescanner.f.d.j.J = var5;
        pulsescanner.f.d.j.F = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

