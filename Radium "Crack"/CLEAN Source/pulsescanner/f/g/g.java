/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.g;

import pulsescanner.f.g.d;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.f;

public class g
extends i {
    public final f l;
    public final pulsescanner.i.g m;
    private static final String[] n;

    public g() {
        String[] stringArray = n;
        super(stringArray[10], stringArray[9], pulsescanner.f.h.WORLD);
        this.l = this.a(new f(stringArray[6], stringArray[1], stringArray[2], stringArray[2], stringArray[5], stringArray[7]));
        this.m = (pulsescanner.i.g)this.a(new pulsescanner.i.g(stringArray[8], stringArray[4], 1.0, 0.1, 1.0, 0.05)).a(this::lambda$new$0);
    }

    public float o() {
        float f2;
        block6: {
            g g2;
            block4: {
                block5: {
                    String string = pulsescanner.f.g.d.u();
                    try {
                        try {
                            g2 = this;
                            if (string != null) break block4;
                            if (!g2.l.a(n[0])) break block5;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        f2 = 0.0f;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                g2 = this;
            }
            f2 = g2.m.g();
        }
        return f2;
    }

    public float p() {
        float f2;
        block6: {
            block5: {
                g g2;
                block4: {
                    String string = pulsescanner.f.g.d.u();
                    try {
                        try {
                            g2 = this;
                            if (string != null) break block4;
                            if (!g2.l.a(n[3])) break block5;
                        }
                        catch (MatchException matchException) {
                            throw g.a(matchException);
                        }
                        g2 = this;
                    }
                    catch (MatchException matchException) {
                        throw g.a(matchException);
                    }
                }
                f2 = g2.m.g();
                break block6;
            }
            f2 = 0.0f;
        }
        return f2;
    }

    @Override
    public String f() {
        return (String)this.l.a();
    }

    private boolean lambda$new$0() {
        boolean bl;
        block2: {
            block3: {
                String string = pulsescanner.f.g.d.u();
                try {
                    bl = this.l.a(n[2]);
                    if (string != null) break block2;
                    if (bl) break block3;
                }
                catch (MatchException matchException) {
                    throw g.a(matchException);
                }
                bl = true;
                break block2;
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
        block19: {
            block18: {
                var5 = new String[11];
                var3_1 = 0;
                var2_2 = ">ve!6\u0014>vi%*=\u0019\u000esd%d>Q\u001cnh%6g\u0005>ve!6\u0007)ru. ,F\u000f/{i.d Z\t\u007fn3-=MS\u0004/{i.\u0007*\u007fa4,,F\u0007)ru. ,F\b.nr%*.@\u0015";
                var4_3 = ">ve!6\u0014>vi%*=\u0019\u000esd%d>Q\u001cnh%6g\u0005>ve!6\u0007)ru. ,F\u000f/{i.d Z\t\u007fn3-=MS\u0004/{i.\u0007*\u007fa4,,F\u0007)ru. ,F\b.nr%*.@\u0015".length();
                var1_4 = 5;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 60;
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
                    var2_2 = "m3:mi\u007f\u000fGe+w~6\u001cG$+w~dKM+\u007fftc\u0019\u0002&3v~x\u001f\u0002*1sb8\u000fu >kss\u0019\u0002\u00067~uq\u000eP";
                    var4_3 = "m3:mi\u007f\u000fGe+w~6\u001cG$+w~dKM+\u007fftc\u0019\u0002&3v~x\u001f\u0002*1sb8\u000fu >kss\u0019\u0002\u00067~uq\u000eP".length();
                    var1_4 = 41;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 99;
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
                        v11 = 65;
                        break;
                    }
                    case 1: {
                        v11 = 38;
                        break;
                    }
                    case 2: {
                        v11 = 60;
                        break;
                    }
                    case 3: {
                        v11 = 124;
                        break;
                    }
                    case 4: {
                        v11 = 120;
                        break;
                    }
                    case 5: {
                        v11 = 117;
                        break;
                    }
                    default: {
                        v11 = 8;
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
        g.n = var5;
    }
}

