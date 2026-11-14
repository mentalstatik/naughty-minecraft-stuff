/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_332;
import pulsescanner.c.f;
import pulsescanner.f.d.a;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.i.c;

public class k
extends j {
    public final c x;
    public final c C;
    public final c D;
    private static final float E = 12.0f;
    private static final float F = 1.0f;
    private static final float G = 5.0f;
    private final List<i> H;
    private static final String[] I;

    public k() {
        String[] stringArray = I;
        super(stringArray[6], stringArray[5], 2, 0, 4.0f, 4.0f);
        this.x = this.a(new c(stringArray[2], stringArray[3], false));
        this.C = this.a(new c(stringArray[4], stringArray[8], true));
        this.D = this.a(new c(stringArray[1], stringArray[7], true));
        this.H = new ArrayList<i>();
    }

    private float a(i i2) {
        int n2;
        float f2;
        float f3;
        block4: {
            String string = i2.f();
            f3 = pulsescanner.g.e.a(i2.b);
            try {
                if (!((Boolean)this.C.a()).booleanValue() || string == null) break block4;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            f3 += (float)(4 + pulsescanner.g.e.a(string));
        }
        try {
            f2 = f3 + 10.0f;
            n2 = (Boolean)this.D.a() != false ? 2 : 0;
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        return f2 + (float)n2;
    }

    @Override
    public void r() {
        this.H.clear();
        for (i i2 : pulsescanner.f.m.b()) {
            float f2;
            float f3;
            try {
                if (!i2.a()) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                try {
                    if (i2 instanceof j && !((Boolean)this.x.a()).booleanValue()) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                if (i2 == this) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                i i3 = i2;
                f3 = i2.j;
                f2 = i2.b() ? 1.0f : 0.0f;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                i3.j = pulsescanner.j.a.a(f3, f2, 12.0f);
                if (!(i2.j > 0.01f)) continue;
                this.H.add(i2);
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        this.H.sort(Comparator.comparingDouble(this::lambda$measure$0).thenComparing(k::lambda$measure$1));
        float f4 = 40.0f;
        float f5 = 0.0f;
        for (i i4 : this.H) {
            f4 = Math.max(f4, this.a(i4));
            f5 += 13.0f * i4.j;
        }
        this.A = f4;
        this.B = Math.max(12.0f, f5);
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        block29: {
            boolean bl;
            block38: {
                int n2 = this.v();
                float f3 = this.z;
                float f4 = Math.min(pulsescanner.d.c.b(), 3.5f);
                Iterator<i> iterator = this.H.iterator();
                i[] iArray = pulsescanner.f.d.a.b();
                while (iterator.hasNext()) {
                    float f5;
                    float f6;
                    block37: {
                        float f7;
                        int n3;
                        float f8;
                        float f9;
                        block36: {
                            Boolean bl2;
                            block33: {
                                String string;
                                block35: {
                                    block34: {
                                        int n4;
                                        float f10;
                                        i i2;
                                        block32: {
                                            block31: {
                                                block30: {
                                                    float f11;
                                                    i2 = iterator.next();
                                                    f6 = i2.j;
                                                    f9 = this.a(i2);
                                                    if (iArray == null) break block29;
                                                    float f12 = (1.0f - f6) * (f9 + 4.0f);
                                                    try {
                                                        f11 = n2 != 0 ? this.y + this.A - f9 + f12 : this.y - f12;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw k.a(matchException);
                                                    }
                                                    f8 = f11;
                                                    f5 = pulsescanner.g.b.a;
                                                    try {
                                                        pulsescanner.g.b.a = f5 * f6;
                                                        pulsescanner.d.c.a(class_3322, f8, f3, f9, 12.0f);
                                                        f10 = f8 + 5.0f;
                                                        n4 = ((Boolean)this.D.a()).booleanValue();
                                                        if (iArray == null) break block30;
                                                        if (n4 == 0) break block31;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw k.a(matchException);
                                                    }
                                                    n4 = n2;
                                                }
                                                try {
                                                    if (iArray == null) break block32;
                                                    if (n4 != 0) break block31;
                                                }
                                                catch (MatchException matchException) {
                                                    throw k.a(matchException);
                                                }
                                                n4 = 2;
                                                break block32;
                                            }
                                            n4 = 0;
                                        }
                                        float f13 = f10 + (float)n4;
                                        float f14 = f3 + (12.0f - (float)pulsescanner.g.e.e()) / 2.0f;
                                        pulsescanner.d.c.a(class_3322, i2.b, f13, f14, pulsescanner.d.c.d());
                                        String string2 = i2.f();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl2 = (Boolean)this.C.a();
                                                        if (iArray == null) break block33;
                                                        if (!bl2.booleanValue()) break block34;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw k.a(matchException);
                                                    }
                                                    string = string2;
                                                    if (iArray == null) break block35;
                                                }
                                                catch (MatchException matchException) {
                                                    throw k.a(matchException);
                                                }
                                                if (string == null) break block34;
                                            }
                                            catch (MatchException matchException) {
                                                throw k.a(matchException);
                                            }
                                            pulsescanner.d.c.a(class_3322, string2, f13 + (float)pulsescanner.g.e.a(i2.b) + 4.0f, f14, pulsescanner.d.c.c());
                                        }
                                        catch (MatchException matchException) {
                                            throw k.a(matchException);
                                        }
                                    }
                                    string = this.D.a();
                                }
                                bl2 = (Boolean)((Object)string);
                            }
                            try {
                                n3 = bl2.booleanValue();
                                if (iArray == null) break block36;
                                if (n3 == 0) break block37;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            n3 = n2;
                        }
                        try {
                            f7 = n3 != 0 ? f8 + f9 - 2.5f : f8 + 1.0f;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        float f15 = f7;
                        try {
                            if (((Boolean)pulsescanner.f.m.a(pulsescanner.f.b.c.class).q.a()).booleanValue()) {
                                pulsescanner.g.b.b(class_3322, f15, f3 + 3.0f, 1.5f, 6.0f, 0.75f, 3.5f, pulsescanner.g.b.a(pulsescanner.d.c.e(), 0.45f));
                            }
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        pulsescanner.g.b.a(class_3322, f15, f3 + 3.0f, 1.5f, 6.0f, 0.75f, pulsescanner.d.c.e());
                    }
                    pulsescanner.g.b.a = f5;
                    f3 += 13.0f * f6;
                    if (iArray != null) continue;
                }
                try {
                    try {
                        bl = this.H.isEmpty();
                        if (iArray == null) break block38;
                        if (!bl) break block29;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = k.a.field_1755 instanceof f;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            try {
                if (bl) {
                    pulsescanner.d.c.a(class_3322, this.y, this.z, this.A, 12.0f);
                    pulsescanner.d.c.a(class_3322, I[0], this.y + 5.0f, this.z + 2.0f, pulsescanner.d.c.c());
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private static String lambda$measure$1(i i2) {
        return i2.b;
    }

    private double lambda$measure$0(i i2) {
        return -this.a(i2);
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
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "Dyi>Y'4v\u007f\nDhx:N\u001f}Gji\u000bLex3U\u000f8%CN\u001b\u001eIbh+\u0000\u000e3diw:DK\u0015PO;:L\u000e0`eo,\u0000\u001f2j%\bV~}9I\u00138v\u0016Ibh+SK8kjy3E\u000f}hd\u007f*L\u000e.+\tDyi>Y'4v\u007f";
                var4_3 = "Dyi>Y'4v\u007f\nDhx:N\u001f}Gji\u000bLex3U\u000f8%CN\u001b\u001eIbh+\u0000\u000e3diw:DK\u0015PO;:L\u000e0`eo,\u0000\u001f2j%\bV~}9I\u00138v\u0016Ibh+SK8kjy3E\u000f}hd\u007f*L\u000e.+\tDyi>Y'4v\u007f".length();
                var1_4 = 9;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 58;
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
                    var2_2 = "K{g.QV!{uc,IV\"yd&-SV4ps&-H\u0002%j6c&Z\u0013n\u001dK~i5\u001d\u001b/|s&+S\u0010/8xc:IV4w6h#P\u001336";
                    var4_3 = "K{g.QV!{uc,IV\"yd&-SV4ps&-H\u0002%j6c&Z\u0013n\u001dK~i5\u001d\u001b/|s&+S\u0010/8xc:IV4w6h#P\u001336".length();
                    var1_4 = 35;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 39;
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
                        v11 = 63;
                        break;
                    }
                    case 1: {
                        v11 = 49;
                        break;
                    }
                    case 2: {
                        v11 = 33;
                        break;
                    }
                    case 3: {
                        v11 = 101;
                        break;
                    }
                    case 4: {
                        v11 = 26;
                        break;
                    }
                    case 5: {
                        v11 = 81;
                        break;
                    }
                    default: {
                        v11 = 103;
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
        k.I = var5;
    }
}

