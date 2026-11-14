/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3414
 */
package pulsescanner.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import pulsescanner.c.c;
import pulsescanner.d.e;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.j.a;

public final class d {
    private static final List<e> a;
    private static final float b = 110.0f;
    private static final float c = 28.0f;
    private static final float d = 4.0f;
    private static final float e = 6.0f;
    private static i[] f;
    private static final String[] g;

    private d() {
    }

    public static void a(String string, String string2, boolean bl) {
        try {
            a.removeIf(arg_0 -> d.lambda$push$0(string, arg_0));
            a.add(new e(string, string2, bl, 0, -1L));
            if (a.size() > 6) {
                a.remove(0);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.d.a(matchException);
        }
    }

    public static void a(String string, String string2, int n2, float f2) {
        try {
            a.removeIf(arg_0 -> d.lambda$alert$1(string, string2, arg_0));
            a.add(new e(string, string2, true, n2, (long)(f2 * 1000.0f)));
            if (a.size() > 6) {
                a.remove(0);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.d.a(matchException);
        }
    }

    public static void a(i i2, String string, int n2, float f2, class_3414 class_34142) {
        block12: {
            block13: {
                pulsescanner.f.b.e e2;
                block11: {
                    e2 = m.a(pulsescanner.f.b.e.class);
                    try {
                        try {
                            if (e2 == null || ((Boolean)e2.o.a()).booleanValue()) break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.d.d.a(matchException);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                }
                try {
                    try {
                        pulsescanner.d.d.a(i2.b, string, 0xFF000000 | n2, f2);
                        if (class_34142 == null) break block12;
                        if (e2 == null) break block13;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                    if (!((Boolean)e2.q.a()).booleanValue()) break block12;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.d.a(matchException);
                }
            }
            class_310 class_3102 = class_310.method_1551();
            try {
                if (class_3102.method_1483() != null) {
                    class_3102.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)class_34142, (float)1.0f, (float)1.0f));
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.d.a(matchException);
            }
        }
    }

    public static boolean a() {
        boolean bl;
        block5: {
            block4: {
                pulsescanner.f.b.e e2 = m.a(pulsescanner.f.b.e.class);
                try {
                    try {
                        if (e2 != null && !((Boolean)e2.p.a()).booleanValue()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void a(i i2) {
        String string;
        String string2;
        block9: {
            pulsescanner.f.b.e e2 = m.a(pulsescanner.f.b.e.class);
            try {
                block8: {
                    try {
                        try {
                            if (e2 == null || !((Boolean)e2.l.a()).booleanValue()) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.d.d.a(matchException);
                        }
                        if (i2.a()) break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.d.a(matchException);
            }
        }
        try {
            string2 = i2.b;
            string = i2.b() ? g[1] : g[3];
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.d.a(matchException);
        }
        pulsescanner.d.d.a(string2, string, i2.b());
    }

    public static void a(class_332 class_3322) {
        long l2;
        e e2;
        List<e> list;
        long l3;
        i[] iArray;
        block38: {
            iArray = pulsescanner.d.d.b();
            try {
                if (a.isEmpty()) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.d.a(matchException);
            }
            pulsescanner.f.b.e e3 = m.a(pulsescanner.f.b.e.class);
            l3 = (long)((Double)e3.m.a() * 1000.0);
            String string = (String)e3.n.a();
            String[] stringArray = g;
            int n2 = string.startsWith(stringArray[2]);
            int n3 = string.endsWith(stringArray[0]);
            int n4 = class_3322.method_51421();
            int n5 = class_3322.method_51443();
            float f2 = 0.0f;
            for (int i2 = a.size() - 1; i2 >= 0; --i2) {
                float f3;
                float f4;
                block50: {
                    int n6;
                    float f5;
                    block48: {
                        block49: {
                            float f6;
                            block46: {
                                e e4;
                                block47: {
                                    float f7;
                                    block45: {
                                        int n7;
                                        block43: {
                                            block44: {
                                                float f8;
                                                float f9;
                                                float f10;
                                                long l4;
                                                block41: {
                                                    block42: {
                                                        long l5;
                                                        block55: {
                                                            block40: {
                                                                e e5;
                                                                block39: {
                                                                    list = a;
                                                                    if (iArray == null) break block38;
                                                                    e2 = list.get(i2);
                                                                    try {
                                                                        try {
                                                                            e5 = e2;
                                                                            if (iArray == null) break block39;
                                                                            if (e5.e <= 0L) break block40;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.d.d.a(matchException);
                                                                        }
                                                                        e5 = e2;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.d.d.a(matchException);
                                                                    }
                                                                }
                                                                l5 = e5.e;
                                                                break block55;
                                                            }
                                                            l5 = l3;
                                                        }
                                                        l2 = l5;
                                                        try {
                                                            long l6 = System.currentTimeMillis() - e2.f - l2;
                                                            l4 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                                                            if (iArray == null) break block41;
                                                            if (l4 >= 0) break block42;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.d.d.a(matchException);
                                                        }
                                                        l4 = 1;
                                                        break block41;
                                                    }
                                                    l4 = 0;
                                                }
                                                long l7 = l4;
                                                try {
                                                    e e6 = e2;
                                                    f10 = e2.g;
                                                    f9 = l7 != false ? 1.0f : 0.0f;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.d.d.a(matchException);
                                                }
                                                try {
                                                    f8 = l7 != false ? 14.0f : 10.0f;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.d.d.a(matchException);
                                                }
                                                e6.g = pulsescanner.j.a.a(f10, f9, f8);
                                                f4 = Math.max(110.0f, (float)(Math.max(pulsescanner.g.e.b(e2.a), pulsescanner.g.e.a(e2.b)) + 34));
                                                try {
                                                    try {
                                                        n7 = n2;
                                                        if (iArray == null) break block43;
                                                        if (n7 == 0) break block44;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.d.d.a(matchException);
                                                    }
                                                    f7 = 6.0f + f2;
                                                    break block45;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.d.d.a(matchException);
                                                }
                                            }
                                            n7 = n5;
                                        }
                                        f7 = (float)n7 - 6.0f - 28.0f - f2;
                                    }
                                    f6 = f7;
                                    try {
                                        try {
                                            e4 = e2;
                                            if (iArray == null) break block46;
                                            if (!(e4.h < 0.0f)) break block47;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.d.d.a(matchException);
                                        }
                                        e2.h = f6;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.d.d.a(matchException);
                                    }
                                }
                                e4 = e2;
                            }
                            e4.h = pulsescanner.j.a.a(e2.h, f6, 16.0f);
                            f5 = (1.0f - e2.g) * (f4 + 6.0f);
                            try {
                                try {
                                    n6 = n3;
                                    if (iArray == null) break block48;
                                    if (n6 == 0) break block49;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.d.d.a(matchException);
                                }
                                f3 = 6.0f - f5;
                                break block50;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.d.d.a(matchException);
                            }
                        }
                        n6 = n4;
                    }
                    f3 = (float)n6 - 6.0f - f4 + f5;
                }
                float f11 = f3;
                pulsescanner.d.d.a(class_3322, e2, f11, e2.h, f4, l2);
                f2 += 32.0f * e2.g;
                if (iArray != null) continue;
            }
            list = a;
        }
        Iterator<e> iterator = list.iterator();
        while (iterator.hasNext()) {
            block54: {
                long l8;
                block53: {
                    long l9;
                    block56: {
                        block52: {
                            e e7;
                            block51: {
                                e2 = iterator.next();
                                try {
                                    try {
                                        e7 = e2;
                                        if (iArray == null) break block51;
                                        if (e7.e <= 0L) break block52;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.d.d.a(matchException);
                                    }
                                    e7 = e2;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.d.d.a(matchException);
                                }
                            }
                            l9 = e7.e;
                            break block56;
                        }
                        l9 = l3;
                    }
                    l2 = l9;
                    try {
                        try {
                            long l10 = System.currentTimeMillis() - e2.f - l2;
                            l8 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                            if (iArray == null) break block53;
                            if (l8 <= 0) break block54;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.d.d.a(matchException);
                        }
                        float f12 = e2.g - 0.001f;
                        l8 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                }
                try {
                    if (l8 <= 0) {
                        iterator.remove();
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.d.a(matchException);
                }
            }
            if (iArray != null) continue;
        }
    }

    private static void a(class_332 class_3322, e e2, float f2, float f3, float f4, long l2) {
        int n2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        class_332 class_3323;
        int n3;
        float f10;
        float f11;
        float f12;
        block16: {
            int n4;
            int n5;
            float f13;
            float f14;
            float f15;
            class_332 class_3324;
            block18: {
                block17: {
                    int n6;
                    block15: {
                        block14: {
                            f12 = pulsescanner.g.b.a;
                            pulsescanner.g.b.a = f12 * Math.min(1.0f, e2.g * 1.5f);
                            pulsescanner.c.c.a(class_3322, f2, f3, f4, 28.0f, 6.0f);
                            f11 = f2 + 12.0f;
                            f10 = f3 + 14.0f;
                            try {
                                if (e2.d == 0) break block14;
                                n6 = e2.d;
                                break block15;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.d.d.a(matchException);
                            }
                        }
                        try {
                            n6 = e2.c ? -1052689 : -9539980;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.d.d.a(matchException);
                        }
                    }
                    n3 = n6;
                    try {
                        try {
                            if (!e2.c) break block16;
                            class_3324 = class_3322;
                            f15 = f11;
                            f14 = f10;
                            if (e2.d == 0) break block17;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.d.d.a(matchException);
                        }
                        f13 = 7.0f;
                        break block18;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                }
                f13 = 5.5f;
            }
            try {
                n5 = e2.d != 0 ? e2.d : 0xFFFFFF;
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.d.a(matchException);
            }
            try {
                n4 = e2.d != 0 ? 112 : 85;
            }
            catch (MatchException matchException) {
                throw pulsescanner.d.d.a(matchException);
            }
            pulsescanner.g.b.b(class_3324, f15, f14, f13, pulsescanner.g.b.a(n5, n4));
        }
        pulsescanner.g.b.a(class_3322, f11, f10, 2.1f, n3);
        pulsescanner.g.e.a(class_3322, e2.a, f2 + 22.0f, f3 + 5.0f, -592136, true, false);
        pulsescanner.g.e.a(class_3322, e2.b, f2 + 22.0f, f3 + 15.0f, -6645085, false, false);
        float f16 = 1.0f - Math.min(1.0f, (float)(System.currentTimeMillis() - e2.f) / (float)l2);
        try {
            class_3323 = class_3322;
            f9 = f2 + 6.0f;
            f8 = f3 + 28.0f - 2.5f;
            f7 = (f4 - 12.0f) * f16;
            f6 = 1.0f;
            f5 = 0.5f;
            n2 = e2.d != 0 ? pulsescanner.g.b.a(e2.d, 144) : 0x40FFFFFF;
        }
        catch (MatchException matchException) {
            throw pulsescanner.d.d.a(matchException);
        }
        pulsescanner.g.b.a(class_3323, f9, f8, f7, f6, f5, n2);
        pulsescanner.g.b.a = f12;
    }

    private static boolean lambda$alert$1(String string, String string2, e e2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!e2.a.equals(string) || !e2.b.equals(string2)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.d.d.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.d.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean lambda$push$0(String string, e e2) {
        return e2.a.equals(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "\u0002\t\u0004t\u0007\u000b\u0002\u0003b!yb";
                var4_3 = "\u0002\t\u0004t\u0007\u000b\u0002\u0003b!yb".length();
                pulsescanner.d.d.b(new i[5]);
                var1_4 = 4;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 110;
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
                    var2_2 = "2+:\b\"-9I\u0007XK\u0002";
                    var4_3 = "2+:\b\"-9I\u0007XK\u0002".length();
                    var1_4 = 3;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 70;
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
                        v11 = 32;
                        break;
                    }
                    case 1: {
                        v11 = 2;
                        break;
                    }
                    case 2: {
                        v11 = 12;
                        break;
                    }
                    case 3: {
                        v11 = 110;
                        break;
                    }
                    case 4: {
                        v11 = 35;
                        break;
                    }
                    case 5: {
                        v11 = 114;
                        break;
                    }
                    default: {
                        v11 = 104;
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
        pulsescanner.d.d.g = var5;
        pulsescanner.d.d.a = new ArrayList<e>();
    }

    public static void b(i[] iArray) {
        f = iArray;
    }

    public static i[] b() {
        return f;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

