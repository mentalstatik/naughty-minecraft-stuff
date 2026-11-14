/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_332;
import pulsescanner.c.f;
import pulsescanner.f.d.a;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.i.c;

public class m
extends j {
    public final c x;
    private static final float C = 5.0f;
    private static final float D = 11.0f;
    private final List<String[]> E;
    private final List<Integer> F;
    private static final String[] G;

    public m() {
        String[] stringArray = G;
        super(stringArray[14], stringArray[13], 2, 2, 4.0f, 86.0f);
        this.x = this.a(new c(stringArray[11], stringArray[9], true));
        this.E = new ArrayList<String[]>();
        this.F = new ArrayList<Integer>();
    }

    private static String c(int n2) {
        String string;
        String[] stringArray = new String[11];
        stringArray[0] = "";
        stringArray[1] = "";
        String[] stringArray2 = G;
        stringArray[2] = stringArray2[15];
        stringArray[3] = stringArray2[2];
        stringArray[4] = stringArray2[3];
        stringArray[5] = stringArray2[12];
        stringArray[6] = stringArray2[4];
        stringArray[7] = stringArray2[6];
        stringArray[8] = stringArray2[5];
        stringArray[9] = stringArray2[7];
        stringArray[10] = stringArray2[10];
        String[] stringArray3 = stringArray;
        try {
            string = n2 < stringArray3.length ? stringArray3[n2] : " " + n2;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.m.a(matchException);
        }
        return string;
    }

    private static String a(class_1293 class_12932) {
        try {
            if (class_12932.method_48559()) {
                return G[8];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.m.a(matchException);
        }
        int n2 = class_12932.method_5584() / 20;
        return n2 / 60 + ":" + String.format(G[0], n2 % 60);
    }

    @Override
    public void r() {
        float f2;
        block29: {
            float f3;
            block27: {
                block28: {
                    m m2;
                    block26: {
                        i[] iArray;
                        block24: {
                            boolean bl;
                            block25: {
                                m m3;
                                block22: {
                                    block23: {
                                        i[] iArray2 = pulsescanner.f.d.a.b();
                                        this.E.clear();
                                        iArray = iArray2;
                                        try {
                                            m3 = this;
                                            if (iArray == null) break block22;
                                            m3.F.clear();
                                            if (!this.m()) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.d.m.a(matchException);
                                        }
                                        for (class_1293 class_12932 : pulsescanner.f.d.m.a.field_1724.method_6026()) {
                                            Object object = ((class_1291)class_12932.method_5579().comp_349()).method_5560().getString() + pulsescanner.f.d.m.c(class_12932.method_5578() + 1);
                                            try {
                                                this.E.add(new String[]{object, pulsescanner.f.d.m.a(class_12932)});
                                                this.F.add(0xFF000000 | ((class_1291)class_12932.method_5579().comp_349()).method_5556());
                                                if (iArray != null) {
                                                    if (iArray != null) continue;
                                                    break;
                                                }
                                                break block24;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.d.m.a(matchException);
                                            }
                                        }
                                    }
                                    m3 = this;
                                }
                                try {
                                    try {
                                        bl = m3.E.isEmpty();
                                        if (iArray == null) break block25;
                                        if (!bl) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.d.m.a(matchException);
                                    }
                                    bl = pulsescanner.f.d.m.a.field_1755 instanceof f;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.d.m.a(matchException);
                                }
                            }
                            try {
                                try {
                                    if (iArray == null || !bl) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.d.m.a(matchException);
                                }
                                this.E.add(new String[]{G[16], G[1]});
                                bl = this.F.add(-13374465);
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.m.a(matchException);
                            }
                        }
                        float f4 = 60.0f;
                        for (Object object : this.E) {
                            f4 = Math.max(f4, (float)(8 + pulsescanner.g.e.a(object[0]) + 8 + pulsescanner.g.e.a(object[1])));
                            try {
                                if (iArray != null) {
                                    if (iArray != null) continue;
                                    break;
                                }
                                break block26;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.m.a(matchException);
                            }
                        }
                        try {
                            m2 = this;
                            f3 = f4;
                            if (iArray == null) break block27;
                            m2.A = f3 + 10.0f;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.m.a(matchException);
                        }
                    }
                    try {
                        m2 = this;
                        if (!this.E.isEmpty()) break block28;
                        f2 = 0.0f;
                        break block29;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.m.a(matchException);
                    }
                }
                f3 = 10.0f + (float)this.E.size() * 11.0f;
            }
            f2 = f3 - 3.0f;
        }
        m2.B = f2;
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        try {
            if (this.E.isEmpty()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.m.a(matchException);
        }
        pulsescanner.d.c.a(class_3322, this.y, this.z, this.A, this.B);
        float f3 = this.z + 5.0f;
        for (int i2 = 0; i2 < this.E.size(); ++i2) {
            String[] stringArray = this.E.get(i2);
            pulsescanner.g.b.b(class_3322, this.y + 5.0f + 2.0f, f3 + 3.5f, 4.0f, pulsescanner.g.b.a((int)this.F.get(i2), 70));
            pulsescanner.g.b.a(class_3322, this.y + 5.0f + 2.0f, f3 + 3.5f, 1.8f, (int)this.F.get(i2));
            pulsescanner.d.c.a(class_3322, stringArray[0], this.y + 5.0f + 8.0f, f3, pulsescanner.d.c.d());
            pulsescanner.d.c.a(class_3322, stringArray[1], this.y + this.A - 5.0f - (float)pulsescanner.g.e.a(stringArray[1]), f3, pulsescanner.d.c.c());
            f3 += 11.0f;
        }
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
                var5 = new String[17];
                var3_1 = 0;
                var2_2 = " }pB\u00044wq\u0016\u0004%\u0004\u000bo\u0003%\u0004\u0014\u0003%\u001b\u000b\u0005%\u001b\u000bo_\u0004%\u001b\u000bo\u0003%\u0004\u001a\u0005/gx\f<,M$&C6\n\u0019`m4Gx\u0017\u001di,bCp\u0018\u0014f9bOu\u0011\u001fvm+H6\n\u0019`m!Id\u0010\u0014wc\u0002%\u0015\fM$&C6(\u0010k$.Jw\u0002%\u001b*D.6O`\u001bQv9#Rc\rQ`+$Cu\n\u0002%,,B6\n\u0019`$0\u0006r\u000b\u0003d9+Ix\r_\u000eU\"6Oy\u0010Q@+$Cu\n\u0002";
                var4_3 = " }pB\u00044wq\u0016\u0004%\u0004\u000bo\u0003%\u0004\u0014\u0003%\u001b\u000b\u0005%\u001b\u000bo_\u0004%\u001b\u000bo\u0003%\u0004\u001a\u0005/gx\f<,M$&C6\n\u0019`m4Gx\u0017\u001di,bCp\u0018\u0014f9bOu\u0011\u001fvm+H6\n\u0019`m!Id\u0010\u0014wc\u0002%\u0015\fM$&C6(\u0010k$.Jw\u0002%\u001b*D.6O`\u001bQv9#Rc\rQ`+$Cu\n\u0002%,,B6\n\u0019`$0\u0006r\u000b\u0003d9+Ix\r_\u000eU\"6Oy\u0010Q@+$Cu\n\u0002".length();
                var1_4 = 4;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 17;
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
                    var2_2 = "_~q\b,G]9\b$B6";
                    var4_3 = "_~q\b,G]9\b$B6".length();
                    var1_4 = 3;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 107;
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
                        v11 = 20;
                        break;
                    }
                    case 1: {
                        v11 = 92;
                        break;
                    }
                    case 2: {
                        v11 = 83;
                        break;
                    }
                    case 3: {
                        v11 = 55;
                        break;
                    }
                    case 4: {
                        v11 = 7;
                        break;
                    }
                    case 5: {
                        v11 = 111;
                        break;
                    }
                    default: {
                        v11 = 96;
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
        pulsescanner.f.d.m.G = var5;
    }
}

