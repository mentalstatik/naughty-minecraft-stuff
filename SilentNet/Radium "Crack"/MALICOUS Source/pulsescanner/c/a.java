/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 */
package pulsescanner.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import pulsescanner.c.c;
import pulsescanner.c.f;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.g.g;

public class a {
    public final String a;
    public final String b;
    public final pulsescanner.g.a c;
    public final class_1799 d;
    public List<i> e;
    public h f;
    public int g = -592136;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m = 1.0f;
    boolean n;
    float o;
    float p;
    public List<i> q = List.of();

    public a(h h2, float f2, float f3) {
        this(h2.name(), h2.title, h2.icon, null, pulsescanner.f.m.a(h2), f2, f3);
        this.f = h2;
    }

    public a(String string, String string2, pulsescanner.g.a a2, class_1799 class_17992, List<i> list, float f2, float f3) {
        this.a = string;
        this.b = string2;
        this.c = a2;
        this.d = class_17992;
        this.e = list;
        this.h = this.j = f2;
        this.i = this.k = f3;
    }

    public void a(float f2, float f3) {
        this.h = this.j = f2;
        this.i = this.k = f3;
    }

    public void b(float f2, float f3) {
        this.j = f2;
        this.k = f3;
    }

    public void a(String string) {
        block11: {
            try {
                try {
                    if (string != null && !string.isBlank()) break block11;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.a.a(matchException);
                }
                this.q = this.e;
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.a.a(matchException);
            }
        }
        String string2 = string.toLowerCase(Locale.ROOT).trim();
        ArrayList<i> arrayList = new ArrayList<i>();
        for (i i2 : this.e) {
            try {
                block12: {
                    try {
                        try {
                            if (i2.b.toLowerCase(Locale.ROOT).contains(string2)) break block12;
                            if (i2.c == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.a.a(matchException);
                        }
                        if (!i2.c.toLowerCase(Locale.ROOT).contains(string2)) continue;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.a.a(matchException);
                    }
                }
                arrayList.add(i2);
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.a.a(matchException);
            }
        }
        this.q = arrayList;
    }

    public boolean a() {
        boolean bl;
        try {
            bl = !this.q.isEmpty();
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.a.a(matchException);
        }
        return bl;
    }

    public float b() {
        try {
            if (this.q.isEmpty()) {
                return 0.0f;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.a.a(matchException);
        }
        return 5.0f + (float)this.q.size() * 20.0f - 2.0f + 5.0f;
    }

    public float c() {
        return 25.0f + this.b() * this.m;
    }

    public boolean a(double d2, double d3) {
        return pulsescanner.c.c.a(d2, d3, this.h, this.i, 132.0f, 25.0f);
    }

    public boolean b(double d2, double d3) {
        return pulsescanner.c.c.a(d2, d3, this.h, this.i, 132.0f, this.c());
    }

    public float a(int n2) {
        return this.i + 25.0f + 5.0f + (float)n2 * 20.0f;
    }

    public i c(double d2, double d3) {
        try {
            if (this.m < 0.95f) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.a.a(matchException);
        }
        int n2 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n2 >= this.q.size()) break;
                        if (!pulsescanner.c.c.a(d2, d3, this.h + 5.0f, this.a(n2), 122.0f, 18.0f)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.a.a(matchException);
                    }
                    return this.q.get(n2);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.a.a(matchException);
                }
            }
            ++n2;
        }
        return null;
    }

    public boolean d(double d2, double d3) {
        boolean bl;
        try {
            bl = d2 >= (double)(this.h + 132.0f - 5.0f - 16.0f);
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.a.a(matchException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void a(class_332 var1_1, int var2_2, int var3_3, boolean var4_4, i var5_5) {
        block75: {
            block77: {
                block76: {
                    block69: {
                        block68: {
                            block67: {
                                block66: {
                                    block64: {
                                        block63: {
                                            block61: {
                                                block60: {
                                                    block58: {
                                                        var6_6 = pulsescanner.c.f.c();
                                                        try {
                                                            block59: {
                                                                try {
                                                                    try {
                                                                        v0 = this;
                                                                        if (!var6_6) break block58;
                                                                        if (!v0.n) break block59;
                                                                    }
                                                                    catch (MatchException v1) {
                                                                        throw pulsescanner.c.a.a(v1);
                                                                    }
                                                                    this.h = this.j = (float)var2_2 - this.o;
                                                                    this.i = this.k = (float)var3_3 - this.p;
                                                                    if (var6_6) break block60;
                                                                }
                                                                catch (MatchException v2) {
                                                                    throw pulsescanner.c.a.a(v2);
                                                                }
                                                            }
                                                            this.h = pulsescanner.j.a.a(this.h, this.j, 16.0f);
                                                            v0 = this;
                                                        }
                                                        catch (MatchException v3) {
                                                            throw pulsescanner.c.a.a(v3);
                                                        }
                                                    }
                                                    v0.i = pulsescanner.j.a.a(this.i, this.k, 16.0f);
                                                }
                                                try {
                                                    v4 = this;
                                                    v5 = this.m;
                                                    v6 = this.l != false ? 0.0f : 1.0f;
                                                }
                                                catch (MatchException v7) {
                                                    throw pulsescanner.c.a.a(v7);
                                                }
                                                v4.m = pulsescanner.j.a.a(v5, v6, 14.0f);
                                                var7_7 = this.c();
                                                pulsescanner.c.c.a(var1_1, this.h, this.i, 132.0f, var7_7, 8.0f);
                                                var8_8 = this.i + 12.5f;
                                                try {
                                                    block62: {
                                                        try {
                                                            try {
                                                                v8 = this.g;
                                                                if (!var6_6) break block61;
                                                                if (v8 != -592136) break block62;
                                                            }
                                                            catch (MatchException v9) {
                                                                throw pulsescanner.c.a.a(v9);
                                                            }
                                                            pulsescanner.c.c.c(var1_1, this.h + 14.5f, var8_8, 10.0f);
                                                            if (var6_6) break block63;
                                                        }
                                                        catch (MatchException v10) {
                                                            throw pulsescanner.c.a.a(v10);
                                                        }
                                                    }
                                                    v8 = (cfr_temp_0 = pulsescanner.c.c.b() - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                }
                                                catch (MatchException v11) {
                                                    throw pulsescanner.c.a.a(v11);
                                                }
                                            }
                                            try {
                                                if (v8 > 0) {
                                                    pulsescanner.g.b.b(var1_1, this.h + 14.5f, var8_8, 11.0f, pulsescanner.g.b.a(this.g, Math.min(255, Math.round(85.0f * pulsescanner.c.c.b()))));
                                                }
                                            }
                                            catch (MatchException v12) {
                                                throw pulsescanner.c.a.a(v12);
                                            }
                                        }
                                        try {
                                            block65: {
                                                try {
                                                    try {
                                                        v13 = this;
                                                        if (!var6_6) break block64;
                                                        if (v13.c == null) break block65;
                                                    }
                                                    catch (MatchException v14) {
                                                        throw pulsescanner.c.a.a(v14);
                                                    }
                                                    pulsescanner.g.g.a(var1_1, this.c, this.h + 14.5f, var8_8, 9.5f, this.g);
                                                    if (var6_6) break block66;
                                                }
                                                catch (MatchException v15) {
                                                    throw pulsescanner.c.a.a(v15);
                                                }
                                            }
                                            v13 = this;
                                        }
                                        catch (MatchException v16) {
                                            throw pulsescanner.c.a.a(v16);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!var6_6) break block67;
                                                    if (v13.d == null) break block66;
                                                }
                                                catch (MatchException v17) {
                                                    throw pulsescanner.c.a.a(v17);
                                                }
                                                v13 = this;
                                                if (!var6_6) break block67;
                                            }
                                            catch (MatchException v18) {
                                                throw pulsescanner.c.a.a(v18);
                                            }
                                            if (v13.d.method_7960()) break block66;
                                        }
                                        catch (MatchException v19) {
                                            throw pulsescanner.c.a.a(v19);
                                        }
                                        var1_1.method_51448().pushMatrix();
                                        var1_1.method_51448().translate(this.h + 14.5f - 5.5f, var8_8 - 5.5f);
                                        var1_1.method_51448().scale(0.6875f, 0.6875f);
                                        var1_1.method_51427(this.d, 0, 0);
                                        var1_1.method_51448().popMatrix();
                                    }
                                    catch (MatchException v20) {
                                        throw pulsescanner.c.a.a(v20);
                                    }
                                }
                                try {
                                    v21 = var1_1;
                                    v22 = this;
                                    if (!var6_6) break block68;
                                    pulsescanner.g.e.a(v21, v22.b, this.h + 25.0f, var8_8 - 3.5f, -592136, true, false);
                                    pulsescanner.g.b.d(var1_1, this.h + 132.0f - 13.0f, var8_8, 5.0f, 1.5707964f * this.m, 0.9f, -1929379841);
                                    v13 = this;
                                }
                                catch (MatchException v23) {
                                    throw pulsescanner.c.a.a(v23);
                                }
                            }
                            try {
                                if (v13.m <= 0.01f) {
                                    return;
                                }
                            }
                            catch (MatchException v24) {
                                throw pulsescanner.c.a.a(v24);
                            }
                            pulsescanner.c.c.a(var1_1, this.h + 8.0f, this.i + 25.0f - 1.0f, 116.0f, this.m);
                            v21 = var1_1;
                            v22 = this;
                        }
                        pulsescanner.g.b.a(v21, (int)v22.h, (int)(this.i + 25.0f), (int)Math.ceil(132.0), (int)Math.ceil(var7_7 - 25.0f));
                        for (var9_9 = 0; var9_9 < this.q.size(); ++var9_9) {
                            block74: {
                                block73: {
                                    block72: {
                                        block71: {
                                            block70: {
                                                var10_10 = this.q.get(var9_9);
                                                var11_11 = this.h + 5.0f;
                                                var12_12 = this.a(var9_9);
                                                if (!var6_6) break block69;
                                                var13_13 = 122.0f;
                                                try {
                                                    try {
                                                        try {
                                                            v25 = var4_4;
                                                            if (!var6_6) break block70;
                                                            if (v25) {
                                                            }
                                                            ** GOTO lbl-1000
                                                        }
                                                        catch (MatchException v26) {
                                                            throw pulsescanner.c.a.a(v26);
                                                        }
                                                        v27 = var2_2;
                                                        if (!var6_6) break block71;
                                                    }
                                                    catch (MatchException v28) {
                                                        throw pulsescanner.c.a.a(v28);
                                                    }
                                                    v25 = pulsescanner.c.c.a(v27, (double)var3_3, var11_11, var12_12, var13_13, 18.0f);
                                                }
                                                catch (MatchException v29) {
                                                    throw pulsescanner.c.a.a(v29);
                                                }
                                            }
                                            if (v25) {
                                                v27 = 1;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v27 = 0;
                                            }
                                        }
                                        var14_14 = v27;
                                        try {
                                            v30 = this;
                                            v31 = var1_1;
                                            v32 = var10_10;
                                            v33 = var11_11;
                                            v34 = var12_12;
                                            v35 = var13_13;
                                            v36 = var14_14;
                                            v37 = var10_10 == var5_5;
                                        }
                                        catch (MatchException v38) {
                                            throw pulsescanner.c.a.a(v38);
                                        }
                                        try {
                                            try {
                                                v39 = var14_14;
                                                if (!var6_6) break block72;
                                                if (!v39) break block73;
                                            }
                                            catch (MatchException v40) {
                                                throw pulsescanner.c.a.a(v40);
                                            }
                                            v39 = this.d(var2_2, var3_3);
                                        }
                                        catch (MatchException v41) {
                                            throw pulsescanner.c.a.a(v41);
                                        }
                                    }
                                    try {
                                        if (!var6_6) break block74;
                                        if (!v39) break block73;
                                    }
                                    catch (MatchException v42) {
                                        throw pulsescanner.c.a.a(v42);
                                    }
                                    v39 = true;
                                    break block74;
                                }
                                v39 = false;
                            }
                            v30.a(v31, v32, v33, v34, v35, v36, v37, v39);
                            if (var6_6) continue;
                        }
                        pulsescanner.g.b.a(var1_1);
                    }
                    try {
                        try {
                            if (pulsescanner.f.i.n() == null) break block75;
                            if (!var6_6) break block76;
                        }
                        catch (MatchException v43) {
                            throw pulsescanner.c.a.a(v43);
                        }
                        v44 = false;
                        break block77;
                    }
                    catch (MatchException v45) {
                        throw pulsescanner.c.a.a(v45);
                    }
                }
                v44 = true;
            }
            pulsescanner.c.f.b(v44);
        }
    }

    private void a(class_332 class_3322, i i2, float f2, float f3, float f4, boolean bl, boolean bl2, boolean bl3) {
        float f5;
        int n2;
        int n3;
        float f6;
        block24: {
            block23: {
                int n4;
                float f7;
                float f8;
                block22: {
                    block21: {
                        float f9;
                        float f10;
                        boolean bl4;
                        block20: {
                            block19: {
                                try {
                                    try {
                                        if (!i2.a() || !i2.b()) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.a.a(matchException);
                                    }
                                    bl4 = true;
                                    break block20;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.a.a(matchException);
                                }
                            }
                            bl4 = false;
                        }
                        boolean bl5 = bl4;
                        try {
                            i i3 = i2;
                            f10 = i2.h;
                            f9 = bl5 ? 1.0f : 0.0f;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.a.a(matchException);
                        }
                        try {
                            try {
                                i3.h = pulsescanner.j.a.a(f10, f9, 16.0f);
                                i i4 = i2;
                                f8 = i2.i;
                                if (!bl && !bl2) break block21;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.a.a(matchException);
                            }
                            f7 = 1.0f;
                            break block22;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.a.a(matchException);
                        }
                    }
                    f7 = 0.0f;
                }
                try {
                    i4.i = pulsescanner.j.a.a(f8, f7, 20.0f);
                    pulsescanner.c.c.b(class_3322, f2, f3, f4, 18.0f, 4.5f, i2.i * (1.0f - i2.h * 0.6f));
                    pulsescanner.c.c.a(class_3322, f2, f3, f4, 18.0f, 4.5f, i2.h);
                    n4 = i2.h > 0.01f ? pulsescanner.g.b.a(pulsescanner.g.b.a(-2829095, -592136, i2.i * 0.6f), -879028, i2.h) : pulsescanner.g.b.a(-2829095, -592136, i2.i * 0.6f);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.a.a(matchException);
                }
                int n5 = n4;
                pulsescanner.g.e.a(class_3322, i2.b, f2 + 9.0f, f3 + 5.0f + 0.5f, n5);
                f6 = f3 + 9.0f;
                try {
                    n3 = -1929379841;
                    n2 = -520093697;
                    if (!bl2) break block23;
                    f5 = 1.0f;
                    break block24;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.a.a(matchException);
                }
            }
            try {
                f5 = bl3 ? 0.7f : 0.0f;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.a.a(matchException);
            }
        }
        int n6 = pulsescanner.g.b.a(n3, n2, f5);
        try {
            pulsescanner.g.b.d(class_3322, f2 + f4 - 8.0f, f6, 5.0f, 0.0f, 0.85f, n6);
            if (i2.a()) {
                pulsescanner.c.c.a(class_3322, f2 + f4 - 19.0f, f6, i2.h);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.a.a(matchException);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

