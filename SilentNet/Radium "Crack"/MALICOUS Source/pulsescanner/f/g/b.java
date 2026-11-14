/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_5250
 */
package pulsescanner.f.g;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import pulsescanner.f.g.d;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class b
extends i {
    public final c l;
    public final f m;
    public final c n;
    public final g o;
    private static final DateTimeFormatter p;
    private static final DateTimeFormatter q;
    private static final DateTimeFormatter r;
    private static final String[] s;

    public b() {
        String[] stringArray = s;
        super(stringArray[4], stringArray[16], pulsescanner.f.h.WORLD);
        this.l = this.a(new c(stringArray[0], stringArray[14], true));
        this.m = (f)this.a(new f(stringArray[11], stringArray[2], stringArray[10], stringArray[5], stringArray[15], stringArray[13])).a(this.l::a);
        this.n = this.a(new c(stringArray[18], stringArray[9], true));
        this.o = (g)this.a(new g(stringArray[3], stringArray[7], 1000.0, 100.0, 5000.0, 100.0)).a(this.n::a);
        String string = pulsescanner.f.g.d.u();
        try {
            if (pulsescanner.f.i.n() != null) {
                pulsescanner.f.g.d.d("SiM3b");
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.g.b.a(matchException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public class_2561 b(class_2561 class_25612) {
        DateTimeFormatter dateTimeFormatter;
        block19: {
            String string;
            f f2;
            block17: {
                block18: {
                    b b2;
                    String string2;
                    block16: {
                        b b3;
                        block15: {
                            string2 = pulsescanner.f.g.d.u();
                            try {
                                try {
                                    try {
                                        b3 = this;
                                        if (string2 != null) break block15;
                                        if (!b3.b()) return class_25612;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.g.b.a(matchException);
                                    }
                                    b2 = this;
                                    if (string2 != null) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.g.b.a(matchException);
                                }
                                b3 = b2.l.a();
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.g.b.a(matchException);
                            }
                        }
                        try {
                            if (!((Boolean)((Object)b3)).booleanValue()) {
                                return class_25612;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.b.a(matchException);
                        }
                        b2 = this;
                    }
                    try {
                        try {
                            f2 = b2.m;
                            string = s[17];
                            if (string2 != null) break block17;
                            if (!f2.a(string)) break block18;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.g.b.a(matchException);
                        }
                        dateTimeFormatter = q;
                        break block19;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.b.a(matchException);
                    }
                }
                f2 = this.m;
                string = s[12];
            }
            try {
                dateTimeFormatter = f2.a(string) ? r : p;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.g.b.a(matchException);
            }
        }
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        class_5250 class_52502 = class_2561.method_43470((String)(LocalTime.now().format(dateTimeFormatter2) + " ")).method_27692(class_124.field_1063);
        return class_52502.method_10852(class_25612);
    }

    public int c(int n2) {
        int n3;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.b() || !((Boolean)this.n.a()).booleanValue()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.g.b.a(matchException);
                    }
                    n3 = this.o.h();
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.g.b.a(matchException);
                }
            }
            n3 = n2;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[19];
                var3_1 = 0;
                var2_2 = "\u001e\u0006Y!+ \u0016'\u001fG\u0005\u0002'\u000e)5\u0011\u001e\u0006Y!+ \u0016'\u001f\u0014\"7&\u001a+\u001b\u001a\f\u0002\u0006G07&\u000ej<]>=\u000b\t\u0007U0x\u0000\u0000/\u000e_7\u0003x[\\\b\u0002'\u000e)5n\u00049\u0018\u0007\u000eL-5!\u001aj\f\\%,t\u001b#\u0001Q7x?\u0012:\u001b\u001a\u0006\"UY)x5\u0015\u0001\nQ4x9\u00188\n\u0014'05\u0003j\u0003]*='Y\u0003x[\\\u000b\u001e\u0006Y!x\u0012\u00188\u0002U0\u0007\u0019\nW+60\u0004\u0007\u0019\nW+60\u0004\u001e\u001a\u001dQ\"1,W'\nG793\u00129OC-,<W>\u0007Qd,=\u001a/A\u0003{]\\%\u001e\u0006Y!+ \u0016'\u001fGd9:\u0013j\u000e\u0014(7:\u0010/\u001d\u0014'05\u0003j\u0007]7,;\u00053A";
                var4_3 = "\u001e\u0006Y!+ \u0016'\u001fG\u0005\u0002'\u000e)5\u0011\u001e\u0006Y!+ \u0016'\u001f\u0014\"7&\u001a+\u001b\u001a\f\u0002\u0006G07&\u000ej<]>=\u000b\t\u0007U0x\u0000\u0000/\u000e_7\u0003x[\\\b\u0002'\u000e)5n\u00049\u0018\u0007\u000eL-5!\u001aj\f\\%,t\u001b#\u0001Q7x?\u0012:\u001b\u001a\u0006\"UY)x5\u0015\u0001\nQ4x9\u00188\n\u0014'05\u0003j\u0003]*='Y\u0003x[\\\u000b\u001e\u0006Y!x\u0012\u00188\u0002U0\u0007\u0019\nW+60\u0004\u0007\u0019\nW+60\u0004\u001e\u001a\u001dQ\"1,W'\nG793\u00129OC-,<W>\u0007Qd,=\u001a/A\u0003{]\\%\u001e\u0006Y!+ \u0016'\u001fGd9:\u0013j\u000e\u0014(7:\u0010/\u001d\u0014'05\u0003j\u0007]7,;\u00053A".length();
                var1_4 = 10;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 102;
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
                    var2_2 = "y_^\f\u0004\u0002X!z\u001e\u001c;\u0019Y4#";
                    var4_3 = "y_^\f\u0004\u0002X!z\u001e\u001c;\u0019Y4#".length();
                    var1_4 = 3;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 100;
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
            var6_7 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_7;
                switch (var6_7 % 7) {
                    case 0: {
                        v11 = 44;
                        break;
                    }
                    case 1: {
                        v11 = 9;
                        break;
                    }
                    case 2: {
                        v11 = 82;
                        break;
                    }
                    case 3: {
                        v11 = 34;
                        break;
                    }
                    case 4: {
                        v11 = 62;
                        break;
                    }
                    case 5: {
                        v11 = 50;
                        break;
                    }
                    default: {
                        v11 = 17;
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
        pulsescanner.f.g.b.s = var5;
        var0_6 = pulsescanner.f.g.b.s;
        pulsescanner.f.g.b.p = DateTimeFormatter.ofPattern(var0_6[1]);
        pulsescanner.f.g.b.q = DateTimeFormatter.ofPattern(var0_6[8]);
        pulsescanner.f.g.b.r = DateTimeFormatter.ofPattern(var0_6[6]);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

