/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1934
 *  net.minecraft.class_634
 *  net.minecraft.class_640
 */
package pulsescanner.f.d;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import net.minecraft.class_1934;
import net.minecraft.class_634;
import net.minecraft.class_640;
import pulsescanner.f.d.a;
import pulsescanner.f.i;
import pulsescanner.license.c;

public final class t {
    private static final String[] a;

    private t() {
    }

    public static Set<String> a(String string) {
        LinkedHashSet<String> linkedHashSet;
        block11: {
            String string2;
            i[] iArray;
            block12: {
                linkedHashSet = new LinkedHashSet<String>();
                iArray = pulsescanner.f.d.a.b();
                for (String string3 : c.a()) {
                    try {
                        linkedHashSet.add(string3.toLowerCase(Locale.ROOT));
                        if (iArray != null) {
                            if (iArray != null) continue;
                            break;
                        }
                        break block11;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                }
                try {
                    string2 = string;
                    if (iArray == null) break block12;
                    if (string2 == null) break block11;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
                string2 = string;
            }
            String[] stringArray = string2.split(",");
            int n2 = stringArray.length;
            int n3 = 0;
            while (n3 < n2) {
                block13: {
                    block14: {
                        String string4 = stringArray[n3];
                        String string5 = string4.trim().toLowerCase(Locale.ROOT);
                        try {
                            try {
                                if (iArray == null) break block13;
                                if (string5.isEmpty()) break block14;
                            }
                            catch (MatchException matchException) {
                                throw t.a(matchException);
                            }
                            linkedHashSet.add(string5);
                        }
                        catch (MatchException matchException) {
                            throw t.a(matchException);
                        }
                    }
                    ++n3;
                }
                if (iArray != null) continue;
            }
        }
        return linkedHashSet;
    }

    public static boolean a(String string, Set<String> set) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (string == null || !set.contains(string.toLowerCase(Locale.ROOT))) break block4;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static a a(class_634 class_6342, class_640 class_6402) {
        a a2;
        block7: {
            block6: {
                boolean bl;
                boolean bl2 = class_6342.method_45732().contains(class_6402);
                try {
                    bl = class_6402.method_2958() == class_1934.field_9219;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
                boolean bl3 = bl;
                try {
                    try {
                        if (!bl2 || bl3) break block6;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                    a2 = pulsescanner.f.d.a.ONLINE;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw t.a(matchException);
                }
            }
            a2 = pulsescanner.f.d.a.WATCHING;
        }
        return a2;
    }

    public static String a(long l2) {
        long l3;
        block11: {
            String string;
            StringBuilder stringBuilder;
            block14: {
                block12: {
                    long l4;
                    long l5;
                    long l6;
                    block8: {
                        block9: {
                            String string2;
                            StringBuilder stringBuilder2;
                            String string3;
                            StringBuilder stringBuilder3;
                            block13: {
                                block10: {
                                    long l7 = Math.max(0L, l2) / 1000L;
                                    long l8 = l7 / 3600L;
                                    l6 = l7 / 60L % 60L;
                                    l3 = l7 % 60L;
                                    i[] iArray = pulsescanner.f.d.a.b();
                                    try {
                                        try {
                                            l5 = l8;
                                            l4 = 0L;
                                            if (iArray == null) break block8;
                                            if (l5 <= l4) break block9;
                                        }
                                        catch (MatchException matchException) {
                                            throw t.a(matchException);
                                        }
                                        stringBuilder3 = new StringBuilder().append(l8);
                                        if (l6 >= 10L) break block10;
                                    }
                                    catch (MatchException matchException) {
                                        throw t.a(matchException);
                                    }
                                    String[] stringArray = a;
                                    string3 = stringArray[1];
                                    break block13;
                                }
                                string3 = ":";
                            }
                            try {
                                stringBuilder2 = stringBuilder3.append(string3).append(l6);
                                string2 = l3 < 10L ? a[0] : ":";
                            }
                            catch (MatchException matchException) {
                                throw t.a(matchException);
                            }
                            return stringBuilder2.append(string2).append(l3).toString();
                        }
                        l5 = l6;
                        l4 = 0L;
                    }
                    try {
                        if (l5 <= l4) break block11;
                        stringBuilder = new StringBuilder().append(l6);
                        if (l3 >= 10L) break block12;
                    }
                    catch (MatchException matchException) {
                        throw t.a(matchException);
                    }
                    string = a[0];
                    break block14;
                }
                string = ":";
            }
            return stringBuilder.append(string).append(l3).toString();
        }
        return l3 + "s";
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
            var2_2 = "Qv\u0002Qv";
            var4_3 = "Qv\u0002Qv".length();
            var1_4 = 2;
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
            v3 = 120;
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
                        v6 = 19;
                        break;
                    }
                    case 1: {
                        v6 = 62;
                        break;
                    }
                    case 2: {
                        v6 = 71;
                        break;
                    }
                    case 3: {
                        v6 = 71;
                        break;
                    }
                    case 4: {
                        v6 = 2;
                        break;
                    }
                    case 5: {
                        v6 = 56;
                        break;
                    }
                    default: {
                        v6 = 37;
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
        t.a = var5;
    }
}

