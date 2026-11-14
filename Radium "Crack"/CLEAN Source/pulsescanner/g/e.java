/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11719
 *  net.minecraft.class_11719$class_11721
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_327
 *  net.minecraft.class_3298
 *  net.minecraft.class_332
 *  net.minecraft.class_5250
 *  net.minecraft.class_5348
 *  org.joml.Vector2f
 */
package pulsescanner.g;

import java.io.IOException;
import net.minecraft.class_11719;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_3298;
import net.minecraft.class_332;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import org.joml.Vector2f;
import pulsescanner.PulseScanner;
import pulsescanner.f.b.a;
import pulsescanner.f.m;
import pulsescanner.g.b;

public final class e {
    private static final class_2960 a;
    private static final int b = 8;
    private static final class_11719.class_11721[] c;
    private static Boolean d;
    private static final String[] e;

    private static int a() {
        return Math.max(1, Math.min(8, class_310.method_1551().method_22683().method_4495()));
    }

    private e() {
    }

    public static void b() {
        d = null;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean a(class_2960 var0) {
        block50: {
            block49: {
                block48: {
                    block47: {
                        block46: {
                            block55: {
                                block54: {
                                    block45: {
                                        block44: {
                                            block52: {
                                                block51: {
                                                    block43: {
                                                        var1_1 = class_310.method_1551().method_1478().method_14486(var0);
                                                        try {
                                                            if (var1_1.isEmpty()) {
                                                                return false;
                                                            }
                                                        }
                                                        catch (Throwable v0) {
                                                            throw pulsescanner.g.e.a(v0);
                                                        }
                                                        var2_2 = ((class_3298)var1_1.get()).method_14482();
                                                        var3_4 = var2_2.readNBytes(4);
                                                        if (var3_4.length >= 4) break block43;
                                                        var4_6 = false;
                                                        try {
                                                            if (var2_2 != null) {
                                                                var2_2.close();
                                                            }
                                                        }
                                                        catch (Throwable v1) {
                                                            throw pulsescanner.g.e.a(v1);
                                                        }
                                                        return var4_6;
                                                    }
                                                    if (var3_4[0] != 0) break block44;
                                                    if (var3_4[1] != 1) break block44;
                                                    break block51;
                                                    catch (Throwable v2) {
                                                        throw pulsescanner.g.e.a(v2);
                                                    }
                                                }
                                                if (var3_4[2] != 0) break block44;
                                                break block52;
                                                catch (Throwable v3) {
                                                    throw pulsescanner.g.e.a(v3);
                                                }
                                            }
                                            try {
                                                block53: {
                                                    if (var3_4[3] != 0) break block44;
                                                    break block53;
                                                    catch (Throwable v4) {
                                                        throw pulsescanner.g.e.a(v4);
                                                    }
                                                }
                                                v5 = true;
                                                break block45;
                                            }
                                            catch (Throwable v6) {
                                                throw pulsescanner.g.e.a(v6);
                                            }
                                        }
                                        v5 = false;
                                    }
                                    var4_7 = v5;
                                    if (var3_4[0] != 116) break block46;
                                    if (var3_4[1] != 114) break block46;
                                    break block54;
                                    catch (Throwable v7) {
                                        throw pulsescanner.g.e.a(v7);
                                    }
                                }
                                if (var3_4[2] != 117) break block46;
                                break block55;
                                catch (Throwable v8) {
                                    throw pulsescanner.g.e.a(v8);
                                }
                            }
                            try {
                                block56: {
                                    if (var3_4[3] != 101) break block46;
                                    break block56;
                                    catch (Throwable v9) {
                                        throw pulsescanner.g.e.a(v9);
                                    }
                                }
                                v10 = true;
                                break block47;
                            }
                            catch (Throwable v11) {
                                throw pulsescanner.g.e.a(v11);
                            }
                        }
                        v10 = false;
                    }
                    var5_9 = v10;
                    if (var4_7) break block48;
                    try {
                        block57: {
                            if (var5_9) break block48;
                            break block57;
                            catch (Throwable v12) {
                                throw pulsescanner.g.e.a(v12);
                            }
                        }
                        PulseScanner.LOG.warn(pulsescanner.g.e.e[1], (Object)var0);
                    }
                    catch (Throwable v13) {
                        throw pulsescanner.g.e.a(v13);
                    }
                }
                if (var4_7) ** GOTO lbl100
                try {
                    block58: {
                        if (!var5_9) break block49;
                        break block58;
                        catch (Throwable v14) {
                            throw pulsescanner.g.e.a(v14);
                        }
                    }
                    v15 = true;
                    break block50;
                }
                catch (Throwable v16) {
                    throw pulsescanner.g.e.a(v16);
                }
            }
            v15 = false;
        }
        var6_10 = v15;
        {
            catch (Throwable var3_5) {
                try {
                    if (var2_2 != null) {
                        try {
                            var2_2.close();
                        }
                        catch (Throwable var4_8) {
                            var3_5.addSuppressed(var4_8);
                        }
                    }
                    throw var3_5;
                }
                catch (IOException var2_3) {
                    return false;
                }
            }
        }
        try {
            if (var2_2 != null) {
                var2_2.close();
            }
        }
        catch (Throwable v17) {
            throw pulsescanner.g.e.a(v17);
        }
        return var6_10;
    }

    private static boolean c() {
        boolean bl;
        block11: {
            block9: {
                try {
                    if (d == null) {
                        d = pulsescanner.g.e.a(a);
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.e.a(matchException);
                }
                a a2 = m.a(a.class);
                try {
                    block10: {
                        try {
                            try {
                                if (!d.booleanValue()) break block9;
                                if (a2 == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.g.e.a(matchException);
                            }
                            if (!((Boolean)a2.r.a()).booleanValue()) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.g.e.a(matchException);
                        }
                    }
                    bl = true;
                    break block11;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.g.e.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static class_2561 a(String string, boolean bl) {
        class_5250 class_52502 = class_2561.method_43470((String)string);
        class_2583 class_25832 = class_2583.field_24360;
        if (pulsescanner.g.e.c()) {
            class_25832 = class_25832.method_27704((class_11719)c[pulsescanner.g.e.a()]);
        }
        if (bl) {
            class_25832 = class_25832.method_10982(Boolean.valueOf(true));
        }
        return class_52502.method_10862(class_25832);
    }

    public static class_327 d() {
        return class_310.method_1551().field_1772;
    }

    public static int a(String string) {
        return pulsescanner.g.e.d().method_27525((class_5348)pulsescanner.g.e.a(string, false));
    }

    public static int b(String string) {
        return pulsescanner.g.e.d().method_27525((class_5348)pulsescanner.g.e.a(string, true));
    }

    public static int e() {
        return 8;
    }

    public static void a(class_332 class_3322, String string, float f2, float f3, int n2) {
        pulsescanner.g.e.a(class_3322, string, f2, f3, n2, false, false);
    }

    /*
     * Unable to fully structure code
     */
    public static void a(class_332 var0, String var1_1, float var2_2, float var3_3, int var4_4, boolean var5_5, boolean var6_6) {
        block39: {
            block37: {
                block35: {
                    block36: {
                        block34: {
                            block32: {
                                block33: {
                                    var7_7 = pulsescanner.g.b.c();
                                    try {
                                        try {
                                            cfr_temp_0 = pulsescanner.g.b.a - 1.0f;
                                            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            if (var7_7 != null) break block32;
                                            if (v0 < 0) break block33;
                                        }
                                        catch (MatchException v1) {
                                            throw pulsescanner.g.e.a(v1);
                                        }
                                        v2 = var4_4;
                                        break block34;
                                    }
                                    catch (MatchException v3) {
                                        throw pulsescanner.g.e.a(v3);
                                    }
                                }
                                v0 = var4_4;
                            }
                            v2 = pulsescanner.g.b.a((int)v0, pulsescanner.g.b.a);
                        }
                        var8_8 = v2;
                        try {
                            if ((var8_8 >>> 24 & 255) < 5) {
                                return;
                            }
                        }
                        catch (MatchException v4) {
                            throw pulsescanner.g.e.a(v4);
                        }
                        var9_9 = pulsescanner.g.e.a(var1_1, var5_5);
                        if (pulsescanner.g.e.c()) {
                            var3_3 -= 0.5f;
                        }
                        var10_10 = var0.method_51448();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v5 = var10_10.m01;
                                                    if (var7_7 != null) break block35;
                                                    if (!(Math.abs(v5) < 1.0E-4f)) break block36;
                                                }
                                                catch (MatchException v6) {
                                                    throw pulsescanner.g.e.a(v6);
                                                }
                                                v5 = Math.abs(var10_10.m10);
                                                if (var7_7 != null) break block35;
                                            }
                                            catch (MatchException v7) {
                                                throw pulsescanner.g.e.a(v7);
                                            }
                                            if (!(v5 < 1.0E-4f)) break block36;
                                        }
                                        catch (MatchException v8) {
                                            throw pulsescanner.g.e.a(v8);
                                        }
                                        v5 = var10_10.m00;
                                        if (var7_7 != null) break block35;
                                    }
                                    catch (MatchException v9) {
                                        throw pulsescanner.g.e.a(v9);
                                    }
                                    if (!(v5 > 0.0f)) break block36;
                                }
                                catch (MatchException v10) {
                                    throw pulsescanner.g.e.a(v10);
                                }
                                v5 = var10_10.m11;
                                if (var7_7 != null) break block35;
                            }
                            catch (MatchException v11) {
                                throw pulsescanner.g.e.a(v11);
                            }
                            if (!(v5 > 0.0f)) break block36;
                        }
                        catch (MatchException v12) {
                            throw pulsescanner.g.e.a(v12);
                        }
                        var11_11 = pulsescanner.g.e.a();
                        var12_13 = var10_10.transformPosition(var2_2, var3_3, new Vector2f());
                        var2_2 += ((float)Math.round(var12_13.x * var11_11) / var11_11 - var12_13.x) / var10_10.m00;
                        var3_3 += ((float)Math.round(var12_13.y * var11_11) / var11_11 - var12_13.y) / var10_10.m11;
                    }
                    v5 = var2_2;
                }
                var11_12 = (int)v5;
                var12_14 = (int)var3_3;
                var13_15 = var2_2 - (float)var11_12;
                var14_16 = var3_3 - (float)var12_14;
                try {
                    block38: {
                        try {
                            try {
                                if (var7_7 != null) break block37;
                                if (var13_15 != 0.0f) break block38;
                            }
                            catch (MatchException v13) {
                                throw pulsescanner.g.e.a(v13);
                            }
                            if (var14_16 != 0.0f) {
                            }
                            ** GOTO lbl109
                        }
                        catch (MatchException v14) {
                            throw pulsescanner.g.e.a(v14);
                        }
                    }
                    var0.method_51448().pushMatrix();
                    var0.method_51448().translate(var2_2, var3_3);
                    var0.method_51439(pulsescanner.g.e.d(), var9_9, 0, 0, var8_8, var6_6);
                    var0.method_51448().popMatrix();
                }
                catch (MatchException v15) {
                    throw pulsescanner.g.e.a(v15);
                }
            }
            try {
                if (var7_7 == null) break block39;
lbl109:
                // 2 sources

                var0.method_51439(pulsescanner.g.e.d(), var9_9, var11_12, var12_14, var8_8, var6_6);
            }
            catch (MatchException v16) {
                throw pulsescanner.g.e.a(v16);
            }
        }
    }

    public static void a(class_332 class_3322, String string, float f2, float f3, int n2, boolean bl) {
        float f4;
        try {
            f4 = bl ? (float)pulsescanner.g.e.b(string) : (float)pulsescanner.g.e.a(string);
        }
        catch (MatchException matchException) {
            throw pulsescanner.g.e.a(matchException);
        }
        float f5 = f4;
        pulsescanner.g.e.a(class_3322, string, f2 - f5 / 2.0f, f3, n2, bl, false);
    }

    public static void b(class_332 class_3322, String string, float f2, float f3, int n2) {
        pulsescanner.g.e.a(class_3322, string, f2 - (float)pulsescanner.g.e.a(string), f3, n2, false, false);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                var5 = new String[5];
                var3_1 = 0;
                var2_2 = "QT5Ht8&@O7^cXZ\\yRbk+NUyZ1\u001f7TD\rBa.eGN7O1c\u0006ggvtE\reHR7\u001cek6TQ)Tc? E\u0001;B1\u0006,OD:Ip-1\b\u001ayNb\"+F\u0001-Stk3@O0W}*eGN7O\u0003TH\u0006";
                var4_3 = "QT5Ht8&@O7^cXZ\\yRbk+NUyZ1\u001f7TD\rBa.eGN7O1c\u0006ggvtE\reHR7\u001cek6TQ)Tc? E\u0001;B1\u0006,OD:Ip-1\b\u001ayNb\"+F\u0001-Stk3@O0W}*eGN7O\u0003TH\u0006".length();
                var1_4 = 12;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 12;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block21;
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
                    var2_2 = "dm\u0014l\u001d\u001d\u000f,v\u000e~\frw\u0016kW\u001b\u0005cl\u0014}@";
                    var4_3 = "dm\u0014l\u001d\u001d\u000f,v\u000e~\frw\u0016kW\u001b\u0005cl\u0014}@".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 47;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block21;
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
                    break block22;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v0;
            v8 = v6;
            v9 = v6.length;
            var6_7 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_7;
                switch (var6_7 % 7) {
                    case 0: {
                        v11 = 45;
                        break;
                    }
                    case 1: {
                        v11 = 45;
                        break;
                    }
                    case 2: {
                        v11 = 85;
                        break;
                    }
                    case 3: {
                        v11 = 55;
                        break;
                    }
                    case 4: {
                        v11 = 29;
                        break;
                    }
                    case 5: {
                        v11 = 71;
                        break;
                    }
                    default: {
                        v11 = 73;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_7;
lbl71:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_7);
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
        pulsescanner.g.e.e = var5;
        var0_6 = pulsescanner.g.e.e;
        pulsescanner.g.e.a = class_2960.method_60655((String)var0_6[0], (String)var0_6[3]);
        pulsescanner.g.e.c = new class_11719.class_11721[9];
        try {
            for (var7_8 = 1; var7_8 <= 8; ++var7_8) {
                pulsescanner.g.e.c[var7_8] = new class_11719.class_11721(class_2960.method_60655((String)pulsescanner.g.e.e[4], (String)(pulsescanner.g.e.e[2] + var7_8)));
            }
        }
        catch (MatchException v12) {
            throw pulsescanner.g.e.a(v12);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

