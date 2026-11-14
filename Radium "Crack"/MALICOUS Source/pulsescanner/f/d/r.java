/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_332;
import pulsescanner.f.d.a;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.g.g;
import pulsescanner.i.c;

public class r
extends j {
    public final c x;
    public final c C;
    public final c D;
    private static final DateTimeFormatter E;
    private static final float F = 16.0f;
    private static final float G = 9.0f;
    private static final float H = 6.0f;
    private static final float I = 9.0f;
    private final List<String> J;
    private static final String[] K;

    public r() {
        String[] stringArray = K;
        super(stringArray[3], stringArray[0], 0, 0, 4.0f, 4.0f);
        this.x = this.a(new c(stringArray[6], stringArray[4], true));
        this.C = this.a(new c(stringArray[7], stringArray[9], false));
        this.D = this.a(new c(stringArray[1], stringArray[2], true));
        this.J = new ArrayList<String>();
    }

    @Override
    public void r() {
        block20: {
            i[] iArray;
            block19: {
                r r2;
                block18: {
                    r r3;
                    block17: {
                        c c2;
                        block15: {
                            block16: {
                                i[] iArray2 = pulsescanner.f.d.a.b();
                                this.J.clear();
                                iArray = iArray2;
                                try {
                                    try {
                                        c2 = this.C;
                                        if (iArray == null) break block15;
                                        if (!((Boolean)c2.a()).booleanValue()) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.d.r.a(matchException);
                                    }
                                    this.J.add(a.method_1548().method_1676());
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.d.r.a(matchException);
                                }
                            }
                            try {
                                r3 = this;
                                if (iArray == null) break block17;
                                c2 = r3.x.a();
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.r.a(matchException);
                            }
                        }
                        try {
                            if (((Boolean)((Object)c2)).booleanValue()) {
                                this.J.add(a.method_47599() + K[10]);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.r.a(matchException);
                        }
                        try {
                            r2 = this;
                            if (iArray == null) break block18;
                            r3 = r2.D.a();
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.r.a(matchException);
                        }
                    }
                    try {
                        if (!((Boolean)((Object)r3)).booleanValue()) break block19;
                        r2 = this;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.r.a(matchException);
                    }
                }
                r2.J.add(LocalTime.now().format(E));
            }
            float f2 = 20.0f + (float)pulsescanner.g.e.b(K[8]);
            for (String string : this.J) {
                if (iArray != null) {
                    f2 += 9.0f + (float)pulsescanner.g.e.a(string);
                    if (iArray != null) continue;
                }
                break block20;
            }
            this.A = f2 + 6.0f;
            this.B = 16.0f;
        }
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        i[] iArray = pulsescanner.f.d.a.b();
        pulsescanner.d.c.a(class_3322, this.y, this.z, this.A, this.B);
        i[] iArray2 = iArray;
        float f3 = this.y + 6.0f + 4.5f;
        float f4 = this.z + 8.0f;
        g.a(class_3322, pulsescanner.g.a.PULSE, f3, f4, 9.0f, pulsescanner.d.c.e());
        float f5 = this.y + 6.0f + 9.0f + 5.0f;
        float f6 = this.z + (16.0f - (float)pulsescanner.g.e.e()) / 2.0f;
        String[] stringArray = K;
        pulsescanner.d.c.b(class_3322, stringArray[11], f5, f6, pulsescanner.d.c.d());
        f5 += (float)pulsescanner.g.e.b(stringArray[8]);
        for (String string : this.J) {
            pulsescanner.g.b.a(class_3322, f5 + 4.5f, f4, 0.9f, pulsescanner.g.b.a(pulsescanner.d.c.c(), 0.7f));
            pulsescanner.d.c.a(class_3322, string, f5 += 9.0f, f6, pulsescanner.d.c.c());
            f5 += (float)pulsescanner.g.e.a(string);
            if (iArray2 != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "\u001f\u0013\u00188\u001c/s2\u001e\u001c8R,:(\u0017Q,\u0007207_\u00183\u00144}\u0004\b\u0016\u001c8\u0015\u000f\u0017\u001e*R)6=\u0013\\*\u001d)?8_\u00054\u001f>}\t\u000b\u001e\u00058\u000062.\u0014\u0017\u000f\u0017\u001e*R=!=\u0012\u0014.R+6._\u00028\u00114=8Q\u0005\u00147K0\u001f\u0003\u001a/\"\b\t\f\u0014/\u001c:>9\r\f\n\u001d.\u0017{\u0000?\u001e\u001f3\u0017)\u0013\u000f\u0017\u001e*R\"<)\rQ(\u0001>!2\u001e\u001c8\\";
                var4_3 = "\u001f\u0013\u00188\u001c/s2\u001e\u001c8R,:(\u0017Q,\u0007207_\u00183\u00144}\u0004\b\u0016\u001c8\u0015\u000f\u0017\u001e*R)6=\u0013\\*\u001d)?8_\u00054\u001f>}\t\u000b\u001e\u00058\u000062.\u0014\u0017\u000f\u0017\u001e*R=!=\u0012\u0014.R+6._\u00028\u00114=8Q\u0005\u00147K0\u001f\u0003\u001a/\"\b\t\f\u0014/\u001c:>9\r\f\n\u001d.\u0017{\u0000?\u001e\u001f3\u0017)\u0013\u000f\u0017\u001e*R\"<)\rQ(\u0001>!2\u001e\u001c8\\".length();
                var1_4 = 28;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 35;
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
                    var2_2 = "u\u0010\b'\r\u0005\u0003\u0014'\u001er\t6\u0017\u0016:\u001e ";
                    var4_3 = "u\u0010\b'\r\u0005\u0003\u0014'\u001er\t6\u0017\u0016:\u001e ".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 42;
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
                        v11 = 127;
                        break;
                    }
                    case 1: {
                        v11 = 92;
                        break;
                    }
                    case 2: {
                        v11 = 82;
                        break;
                    }
                    case 3: {
                        v11 = 126;
                        break;
                    }
                    case 4: {
                        v11 = 81;
                        break;
                    }
                    case 5: {
                        v11 = 120;
                        break;
                    }
                    default: {
                        v11 = 112;
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
        pulsescanner.f.d.r.K = var5;
        pulsescanner.f.d.r.E = DateTimeFormatter.ofPattern(pulsescanner.f.d.r.K[5]);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

