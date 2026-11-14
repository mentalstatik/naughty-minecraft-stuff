/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 */
package pulsescanner.f.f;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;

public class n
extends i {
    public final pulsescanner.i.h l;
    public final c m;
    private static final String[] n;

    public n() {
        String[] stringArray = n;
        super(stringArray[7], stringArray[2], pulsescanner.f.h.RENDER);
        this.l = this.a(new pulsescanner.i.h(stringArray[3], stringArray[5], stringArray[6]));
        this.m = this.a(new c(stringArray[0], stringArray[4], false));
    }

    public String o() {
        String string;
        block5: {
            String string2;
            block4: {
                string2 = (String)this.l.a();
                try {
                    try {
                        if (string2 != null && !string2.isBlank()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.n.a(matchException);
                    }
                    string = n[1];
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.n.a(matchException);
                }
            }
            string = string2;
        }
        return string;
    }

    public boolean d(String string) {
        block9: {
            block8: {
                try {
                    try {
                        if (string != null && !string.isEmpty()) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.n.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.n.a(matchException);
                }
            }
            try {
                try {
                    if (pulsescanner.f.f.n.a.field_1724 == null || !string.equals(pulsescanner.f.f.n.a.field_1724.method_7334().name())) break block9;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.n.a(matchException);
                }
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.n.a(matchException);
            }
        }
        return (Boolean)this.m.a();
    }

    public class_2561 a(class_2561 class_25612, String string) {
        Object object;
        block6: {
            try {
                try {
                    if (class_25612 != null && this.d(string)) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.n.a(matchException);
                }
                return class_25612;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.n.a(matchException);
            }
        }
        String string2 = class_25612.getString();
        try {
            object = string2.contains(string) ? class_2561.method_43470((String)string2.replace(string, this.o())) : class_25612;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.n.a(matchException);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public class_2561 b(class_2561 class_25612) {
        class_5250 class_52502;
        block27: {
            String string;
            block26: {
                String string2;
                String string3;
                i[] iArray;
                block24: {
                    block25: {
                        block23: {
                            class_310 class_3102;
                            block21: {
                                block22: {
                                    iArray = q.r();
                                    try {
                                        class_2561 class_25613;
                                        block20: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            class_25613 = class_25612;
                                                            if (iArray != null) return class_25613;
                                                            if (class_25613 == null) break block20;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.f.n.a(matchException);
                                                        }
                                                        if (!this.b()) break block20;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.f.n.a(matchException);
                                                    }
                                                    class_3102 = a;
                                                    if (iArray != null) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.f.n.a(matchException);
                                                }
                                                if (class_3102.field_1724 != null) break block22;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.f.n.a(matchException);
                                            }
                                        }
                                        class_25613 = class_25612;
                                        return class_25613;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.f.n.a(matchException);
                                    }
                                }
                                class_3102 = a;
                            }
                            string3 = class_3102.field_1724.method_7334().name();
                            try {
                                string2 = string3;
                                if (iArray != null) break block23;
                                if (string2 == null) return class_25612;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.n.a(matchException);
                            }
                            string2 = string3;
                        }
                        try {
                            try {
                                if (iArray != null) break block24;
                                if (!string2.isEmpty()) break block25;
                                return class_25612;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.n.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.n.a(matchException);
                        }
                    }
                    string2 = class_25612.getString();
                }
                String string4 = string2;
                try {
                    try {
                        string = string4;
                        if (iArray != null) break block26;
                        if (!string.contains(string3)) break block27;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.n.a(matchException);
                    }
                    string = string4.replace(string3, this.o());
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.n.a(matchException);
                }
            }
            class_52502 = class_2561.method_43470((String)string);
            return class_52502;
        }
        class_52502 = class_25612;
        return class_52502;
    }

    public String e(String string) {
        String string2;
        block15: {
            block14: {
                block13: {
                    try {
                        block12: {
                            try {
                                try {
                                    if (string == null || !this.b()) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.f.n.a(matchException);
                                }
                                if (pulsescanner.f.f.n.a.field_1724 != null) break block13;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.n.a(matchException);
                            }
                        }
                        return string;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.n.a(matchException);
                    }
                }
                String string3 = pulsescanner.f.f.n.a.field_1724.method_7334().name();
                try {
                    try {
                        try {
                            if (string3 == null || string3.isEmpty()) break block14;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.n.a(matchException);
                        }
                        if (!string.contains(string3)) break block14;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.n.a(matchException);
                    }
                    string2 = string.replace(string3, this.o());
                    break block15;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.n.a(matchException);
                }
            }
            string2 = string;
        }
        return string2;
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
                var2_2 = "\u0017r\n'Rl^4g\u001b'R?\u0003\u0001i\u0017-\u0010o\u0006'Slw7s\u0010bN-c=&\u000b,\u0000\"o5c\u0016#G?.9h\u0006bT$kxr\u0003 \u0000 g+rL\t\u001eg\t'\u0000\u0002o5c2\u0019j\u0011-\u0000>k(j\u0003!Ela,n\u00070\u0000<b9\u007f\u00070Sk.6g\u000f'S`.6i\u0016bJ9},&\u001b-U>}v&\u000fn\u00036\u00008axu\n-Wlg6u\u0016'A(.7`B6H).*c\u0003.\u0000\"o5cL";
                var4_3 = "\u0017r\n'Rl^4g\u001b'R?\u0003\u0001i\u0017-\u0010o\u0006'Slw7s\u0010bN-c=&\u000b,\u0000\"o5c\u0016#G?.9h\u0006bT$kxr\u0003 \u0000 g+rL\t\u001eg\t'\u0000\u0002o5c2\u0019j\u0011-\u0000>k(j\u0003!Ela,n\u00070\u0000<b9\u007f\u00070Sk.6g\u000f'S`.6i\u0016bJ9},&\u001b-U>}v&\u000fn\u00036\u00008axu\n-Wlg6u\u0016'A(.7`B6H).*c\u0003.\u0000\"o5cL".length();
                var1_4 = 13;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 56;
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
                    var2_2 = "5]#\f\"S;\u00134(H\u0003F3\u0015`";
                    var4_3 = "5]#\f\"S;\u00134(H\u0003F3\u0015`".length();
                    var1_4 = 3;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 12;
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
                        v11 = 96;
                        break;
                    }
                    case 1: {
                        v11 = 62;
                        break;
                    }
                    case 2: {
                        v11 = 90;
                        break;
                    }
                    case 3: {
                        v11 = 122;
                        break;
                    }
                    case 4: {
                        v11 = 24;
                        break;
                    }
                    case 5: {
                        v11 = 116;
                        break;
                    }
                    default: {
                        v11 = 54;
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
        pulsescanner.f.f.n.n = var5;
    }
}

