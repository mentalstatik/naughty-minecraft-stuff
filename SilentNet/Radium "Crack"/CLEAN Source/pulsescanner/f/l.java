/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2394
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_6606
 */
package pulsescanner.f;

import net.minecraft.class_1297;
import net.minecraft.class_2394;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6606;
import pulsescanner.PulseScanner;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.license.d;

public final class l {
    private static final String[] a;

    private l() {
    }

    private static void a(i i2, String string, Runnable runnable) {
        try {
            runnable.run();
        }
        catch (Exception exception) {
            PulseScanner.LOG.error(a[0], new Object[]{i2.b, string, exception});
        }
    }

    public static void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        i[] iArray = h.b();
        try {
            if (!d.y) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            block9: {
                i i3;
                block8: {
                    try {
                        try {
                            i3 = i2;
                            if (iArray != null) break block8;
                            if (!i3.b()) break block9;
                        }
                        catch (MatchException matchException) {
                            throw l.a(matchException);
                        }
                        i3 = i2;
                    }
                    catch (MatchException matchException) {
                        throw l.a(matchException);
                    }
                }
                l.a(i3, a[9], () -> l.lambda$render3D$0(i2, class_45872, class_41842, f2));
            }
            if (iArray == null) continue;
        }
    }

    public static void a(class_332 class_3322, float f2) {
        try {
            if (!d.y) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[3], () -> l.lambda$render2D$1(i2, class_3322, f2));
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    public static void a() {
        try {
            if (!d.g()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[2], i2::k);
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    public static void b() {
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[7], i2::l);
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    public static void a(int n2, int n3, class_6606 class_66062) {
        try {
            if (!d.y) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[1], () -> l.lambda$chunkData$2(i2, n2, n3, class_66062));
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    public static void b(int n2, int n3, class_6606 class_66062) {
        try {
            if (!d.y) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[5], () -> l.lambda$lightUpdate$3(i2, n2, n3, class_66062));
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    public static void a(class_2561 class_25612) {
        try {
            if (!d.g()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[8], () -> l.lambda$chatMessage$4(i2, class_25612));
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    public static void a(class_1297 class_12972) {
        try {
            if (!d.g()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                if (!i2.b()) continue;
                l.a(i2, a[4], () -> l.lambda$attack$5(i2, class_12972));
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
    }

    /*
     * Loose catch block
     */
    public static class_243 a(class_1297 class_12972, class_243 class_2432) {
        i[] iArray = h.b();
        try {
            if (!d.y) {
                return class_2432;
            }
        }
        catch (Exception exception) {
            throw l.a(exception);
        }
        for (i i2 : m.b()) {
            block11: {
                block12: {
                    if (iArray != null) break block11;
                    try {
                        if (!i2.b()) {
                            continue;
                        }
                        break block12;
                        catch (Exception exception) {
                            throw l.a(exception);
                        }
                    }
                    catch (Exception exception) {
                        throw l.a(exception);
                    }
                }
                try {
                    class_2432 = i2.a(class_12972, class_2432);
                }
                catch (Exception exception) {
                    PulseScanner.LOG.error(a[6], (Object)i2.b, (Object)exception);
                }
            }
            if (iArray == null) continue;
        }
        return class_2432;
    }

    public static boolean a(class_2394 class_23942) {
        try {
            if (!d.y) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw l.a(matchException);
        }
        for (i i2 : m.b()) {
            try {
                try {
                    if (!i2.b() || !i2.a(class_23942)) continue;
                }
                catch (MatchException matchException) {
                    throw l.a(matchException);
                }
                return true;
            }
            catch (MatchException matchException) {
                throw l.a(matchException);
            }
        }
        return false;
    }

    private static void lambda$attack$5(i i2, class_1297 class_12972) {
        i2.a(class_12972);
    }

    private static void lambda$chatMessage$4(i i2, class_2561 class_25612) {
        i2.a(class_25612);
    }

    private static void lambda$lightUpdate$3(i i2, int n2, int n3, class_6606 class_66062) {
        i2.b(n2, n3, class_66062);
    }

    private static void lambda$chunkData$2(i i2, int n2, int n3, class_6606 class_66062) {
        i2.a(n2, n3, class_66062);
    }

    private static void lambda$render2D$1(i i2, class_332 class_3322, float f2) {
        i2.a(class_3322, f2);
    }

    private static void lambda$render3D$0(i i2, class_4587 class_45872, class_4184 class_41842, float f2) {
        i2.a(class_45872, class_41842, f2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "!bA\f_C.?{A\u0003P\n9'\t9w\u0014\u0004Un#.~\u00040p\b\u0004\b(z\u000f\u000e[Xp\u001e\u0006;k\u0015\u000b]A\u000b6v\u0006\u0002J\u007f2>~\u0015\u000f\u0011!bA\f_C.?{A\u0003P\n/5i\u0004\u00056z\u0000\u001c[";
                var4_3 = "!bA\f_C.?{A\u0003P\n9'\t9w\u0014\u0004Un#.~\u00040p\b\u0004\b(z\u000f\u000e[Xp\u001e\u0006;k\u0015\u000b]A\u000b6v\u0006\u0002J\u007f2>~\u0015\u000f\u0011!bA\f_C.?{A\u0003P\n/5i\u0004\u00056z\u0000\u001c[".length();
                var1_4 = 15;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 45;
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
                    var2_2 = "*d\u0013\r`\\\":m\u0015\u001c\b;i\u001c\u001dHKb\r";
                    var4_3 = "*d\u0013\r`\\\":m\u0015\u001c\b;i\u001c\u001dHKb\r".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 62;
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
                        v11 = 119;
                        break;
                    }
                    case 1: {
                        v11 = 50;
                        break;
                    }
                    case 2: {
                        v11 = 76;
                        break;
                    }
                    case 3: {
                        v11 = 71;
                        break;
                    }
                    case 4: {
                        v11 = 19;
                        break;
                    }
                    case 5: {
                        v11 = 7;
                        break;
                    }
                    default: {
                        v11 = 111;
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
        l.a = var5;
    }
}

