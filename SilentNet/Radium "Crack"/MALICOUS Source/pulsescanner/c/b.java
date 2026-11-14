/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 */
package pulsescanner.c;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import pulsescanner.c.a;
import pulsescanner.c.c;
import pulsescanner.c.d;
import pulsescanner.c.f;
import pulsescanner.f.i;
import pulsescanner.i.e;
import pulsescanner.i.g;
import pulsescanner.i.h;

public class b {
    private static final float a = 152.0f;
    private static final float b = 7.0f;
    private static final float c = 16.0f;
    private static final float d = 25.0f;
    private static final float e = 46.0f;
    private static final float f = 10.0f;
    private static final float g = 29.0f;
    private static final Object h;
    public final i i;
    private final a j;
    private final int k;
    private final boolean l;
    private final float m;
    private final float n;
    private final List<String> o = new ArrayList<String>();
    float p;
    float q;
    float r;
    float s;
    boolean t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private g A;
    private pulsescanner.i.d B;
    private int C;
    e D;
    h E;
    String F;
    boolean G;
    private static final String[] H;
    private static final String[] I;

    public b(i i2, a a2, int n2) {
        this.i = i2;
        this.j = a2;
        this.k = n2;
        this.l = false;
        this.n = 0.0f;
        this.m = 0.0f;
        this.u = i2.b() ? 1.0f : 0.0f;
        this.a(i2.c, 136.0f);
    }

    public b(i i2, float f2, float f3) {
        this.i = i2;
        this.j = null;
        this.k = 0;
        this.l = true;
        this.m = f2;
        this.n = f3;
        this.u = i2.b() ? 1.0f : 0.0f;
        this.a(i2.c, 136.0f);
    }

    private void a(String string, float f2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : string.split(" ")) {
            String string3;
            block8: {
                String string4;
                try {
                    string4 = stringBuilder.isEmpty() ? string2 : stringBuilder + " " + string2;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                string3 = string4;
                try {
                    if (!((float)pulsescanner.g.e.a(string3) > f2) || stringBuilder.isEmpty()) break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                this.o.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(string2);
                continue;
            }
            stringBuilder = new StringBuilder(string3);
        }
        try {
            if (!stringBuilder.isEmpty()) {
                this.o.add(stringBuilder.toString());
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
    }

    private boolean a() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.i.a() && !(this.i instanceof pulsescanner.f.b.a)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private List<d> b() {
        ArrayList<d> arrayList = new ArrayList<d>();
        float f2 = 0.0f;
        if (this.i.a()) {
            arrayList.add(new d(h, f2, 16.0f));
            f2 += 16.0f;
        }
        for (pulsescanner.i.a<?> a2 : this.i.e) {
            try {
                if (!a2.d()) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
            float f3 = 16.0f;
            if (a2 instanceof g) {
                f3 = 25.0f;
            } else if (a2 instanceof pulsescanner.i.d) {
                pulsescanner.i.d d2 = (pulsescanner.i.d)a2;
                f3 = 16.0f + 46.0f * d2.h;
            } else if (a2 instanceof pulsescanner.i.b) {
                f3 = 18.0f;
            } else if (a2 instanceof h) {
                f3 = 29.0f;
            }
            arrayList.add(new d(a2, f2, f3));
            f2 += f3;
        }
        if (this.a()) {
            arrayList.add(new d(this.i.f, f2, 16.0f));
            f2 += 16.0f;
        }
        this.y = f2;
        return arrayList;
    }

    public boolean a(double d2, double d3) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(this.s > 0.5f) || !pulsescanner.c.c.a(d2, d3, this.p, this.q, 152.0f, this.r)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void a(int n2, int n3, List<d> list) {
        float f2;
        block12: {
            int n4;
            a a2;
            block9: {
                float f3;
                block11: {
                    block10: {
                        f2 = 17.0f + (float)this.o.size() * 10.0f + 5.0f;
                        float f4 = f2 + 4.0f + this.y + 7.0f;
                        try {
                            try {
                                this.r = Math.min(f4, (float)(n3 - 8));
                                this.z = this.r - f2 - 4.0f - 7.0f;
                                if (!this.l) break block9;
                                b b2 = this;
                                if (!(this.m + 152.0f > (float)(n2 - 4))) break block10;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.b.a(matchException);
                            }
                            f3 = this.m - 152.0f;
                            break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                    }
                    f3 = this.m;
                }
                b2.p = f3;
                this.p = Math.max(4.0f, Math.min(this.p, (float)n2 - 152.0f - 4.0f));
                this.q = Math.max(4.0f, Math.min(this.n, (float)n3 - this.r - 4.0f));
                break block12;
            }
            try {
                this.p = this.j.h + 132.0f + 6.0f;
                if (this.p + 152.0f > (float)(n2 - 4)) {
                    this.p = this.j.h - 152.0f - 6.0f;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
            int n5 = this.j.q.indexOf(this.i);
            try {
                a2 = this.j;
                n4 = n5 >= 0 ? n5 : this.k;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
            float f5 = a2.a(n4) - 8.0f;
            this.q = Math.max(4.0f, Math.min(f5, (float)n3 - this.r - 4.0f));
        }
        this.x = this.q + f2 + 4.0f;
        float f6 = Math.max(0.0f, this.y - this.z);
        this.w = Math.max(0.0f, Math.min(this.w, f6));
        this.v = pulsescanner.j.a.a(this.v, this.w, 18.0f);
    }

    public void a(double d2) {
        this.w -= (float)d2 * 14.0f;
    }

    public void a(class_332 class_3322, int n2, int n3, int n4, int n5) {
        int n6;
        boolean bl;
        float f2;
        float f3;
        float f4;
        List<d> list;
        block39: {
            block38: {
                int n7;
                float f5;
                block37: {
                    block36: {
                        float f6;
                        float f7;
                        float f8;
                        try {
                            b b2 = this;
                            f8 = this.s;
                            f7 = this.t ? 0.0f : 1.0f;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                        try {
                            f6 = this.t ? 20.0f : 16.0f;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                        b2.s = pulsescanner.j.a.a(f8, f7, f6);
                        list = this.b();
                        this.a(n4, n5, list);
                        this.F = null;
                        for (pulsescanner.i.a<?> a2 : this.i.e) {
                            float f9;
                            float f10;
                            if (!(a2 instanceof pulsescanner.i.d)) continue;
                            pulsescanner.i.d d2 = (pulsescanner.i.d)a2;
                            try {
                                pulsescanner.i.d d3 = d2;
                                f10 = d2.h;
                                f9 = d2.g ? 1.0f : 0.0f;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.b.a(matchException);
                            }
                            d3.h = pulsescanner.j.a.a(f10, f9, 16.0f);
                        }
                        this.a(n2);
                        f4 = pulsescanner.g.b.a;
                        try {
                            try {
                                pulsescanner.g.b.a = f4 * this.s;
                                class_3322.method_51448().pushMatrix();
                                f5 = 1.0f - this.s;
                                if (this.j == null || !(this.p > this.j.h)) break block36;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.b.a(matchException);
                            }
                            n7 = -6;
                            break block37;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                    }
                    n7 = 6;
                }
                float f11 = f5 * (float)n7;
                class_3322.method_51448().translate(f11, 0.0f);
                pulsescanner.c.c.c(class_3322, this.p, this.q, 152.0f, this.r, 8.0f);
                pulsescanner.g.e.a(class_3322, this.i.b, this.p + 7.0f + 1.0f, this.q + 7.0f + 1.0f, -592136, true, false);
                f3 = this.p + 152.0f - 7.0f - 4.0f;
                f2 = this.q + 7.0f + 4.5f;
                try {
                    try {
                        if (this.t || !pulsescanner.c.c.a(n2, (double)n3, f3 - 6.0f, f2 - 6.0f, 12.0f, 12.0f)) break block38;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                    bl = true;
                    break block39;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            if (bl2) {
                pulsescanner.g.b.a(class_3322, f3, f2, 6.0f, 0x22FFFFFF);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
        try {
            n6 = bl2 ? -592136 : -6645085;
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
        int n8 = n6;
        pulsescanner.g.b.b(class_3322, f3 - 2.5f, f2 - 2.5f, f3 + 2.5f, f2 + 2.5f, 0.9f, n8);
        pulsescanner.g.b.b(class_3322, f3 - 2.5f, f2 + 2.5f, f3 + 2.5f, f2 - 2.5f, 0.9f, n8);
        float f12 = this.q + 7.0f + 12.0f;
        try {
            for (int i2 = 0; i2 < this.o.size(); ++i2) {
                pulsescanner.g.e.a(class_3322, this.o.get(i2), this.p + 7.0f + 1.0f, f12 + (float)i2 * 10.0f, -6645085);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
        pulsescanner.c.c.a(class_3322, this.p + 8.0f, this.x - 3.0f, 136.0f, 1.0f);
        pulsescanner.g.b.a(class_3322, (int)this.p, (int)this.x - 1, 152, (int)Math.ceil(this.z) + 2);
        for (d d4 : list) {
            boolean bl3;
            float f13;
            block41: {
                block40: {
                    f13 = this.x + d4.e - this.v;
                    if (f13 + d4.f < this.x - 2.0f) continue;
                    try {
                        if (f13 > this.x + this.z + 2.0f) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (this.t || !((float)n3 >= this.x)) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.b.a(matchException);
                                }
                                if (!((float)n3 <= this.x + this.z)) break block40;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.b.a(matchException);
                            }
                            if (!pulsescanner.c.c.a(n2, (double)n3, this.p, f13, 152.0f, d4.f)) break block40;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                        bl3 = true;
                        break block41;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                }
                bl3 = false;
            }
            boolean bl4 = bl3;
            this.a(class_3322, d4.d, f13, d4.f, bl4, n2, n3);
        }
        pulsescanner.g.b.a(class_3322);
        if (this.y > this.z + 1.0f) {
            float f14 = Math.max(12.0f, this.z * this.z / this.y);
            float f15 = this.x + (this.z - f14) * (this.v / (this.y - this.z));
            pulsescanner.g.b.a(class_3322, this.p + 152.0f - 3.5f, f15, 1.5f, f14, 0.75f, 0x40FFFFFF);
        }
        class_3322.method_51448().popMatrix();
        pulsescanner.g.b.a = f4;
    }

    /*
     * Unable to fully structure code
     */
    private void a(class_332 var1_1, Object var2_2, float var3_3, float var4_4, boolean var5_5, int var6_6, int var7_7) {
        block154: {
            block199: {
                block200: {
                    block180: {
                        block198: {
                            block197: {
                                block196: {
                                    block194: {
                                        block191: {
                                            block190: {
                                                block201: {
                                                    block193: {
                                                        block192: {
                                                            block187: {
                                                                block188: {
                                                                    block189: {
                                                                        block185: {
                                                                            block186: {
                                                                                block183: {
                                                                                    block184: {
                                                                                        block182: {
                                                                                            block181: {
                                                                                                block177: {
                                                                                                    block178: {
                                                                                                        block179: {
                                                                                                            block172: {
                                                                                                                block176: {
                                                                                                                    block175: {
                                                                                                                        block173: {
                                                                                                                            block174: {
                                                                                                                                block165: {
                                                                                                                                    block170: {
                                                                                                                                        block171: {
                                                                                                                                            block168: {
                                                                                                                                                block169: {
                                                                                                                                                    block166: {
                                                                                                                                                        block167: {
                                                                                                                                                            block155: {
                                                                                                                                                                block164: {
                                                                                                                                                                    block162: {
                                                                                                                                                                        block163: {
                                                                                                                                                                            block161: {
                                                                                                                                                                                block159: {
                                                                                                                                                                                    block160: {
                                                                                                                                                                                        block157: {
                                                                                                                                                                                            block158: {
                                                                                                                                                                                                block153: {
                                                                                                                                                                                                    block150: {
                                                                                                                                                                                                        block152: {
                                                                                                                                                                                                            block151: {
                                                                                                                                                                                                                block147: {
                                                                                                                                                                                                                    block148: {
                                                                                                                                                                                                                        block149: {
                                                                                                                                                                                                                            var9_8 = this.p + 7.0f + 2.0f;
                                                                                                                                                                                                                            var10_9 = this.p + 152.0f - 7.0f - 2.0f;
                                                                                                                                                                                                                            var11_10 = var3_3 + 8.0f;
                                                                                                                                                                                                                            var12_11 = var11_10 - 3.5f;
                                                                                                                                                                                                                            var8_12 = pulsescanner.c.f.c();
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v0 = var2_2;
                                                                                                                                                                                                                                        if (!var8_12) break block147;
                                                                                                                                                                                                                                        if (v0 != pulsescanner.c.b.h) break block148;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (MatchException v1) {
                                                                                                                                                                                                                                        throw pulsescanner.c.b.a(v1);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (var5_5 == 0) break block149;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (MatchException v2) {
                                                                                                                                                                                                                                    throw pulsescanner.c.b.a(v2);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, 14.0f, 4.0f, 1.0f);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v3) {
                                                                                                                                                                                                                                throw pulsescanner.c.b.a(v3);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            v4 = this;
                                                                                                                                                                                                                            v5 = this.u;
                                                                                                                                                                                                                            v6 = this.i.b() != false ? 1.0f : 0.0f;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException v7) {
                                                                                                                                                                                                                            throw pulsescanner.c.b.a(v7);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v4.u = pulsescanner.j.a.a(v5, v6, 16.0f);
                                                                                                                                                                                                                        var28_13 = pulsescanner.c.b.I;
                                                                                                                                                                                                                        pulsescanner.g.e.a(var1_1, var28_13[1], var9_8, var12_11, -592136);
                                                                                                                                                                                                                        this.a(var1_1, var10_9 - 18.0f, var11_10, this.u);
                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v0 = var2_2;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var13_15 = (pulsescanner.i.a)v0;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v8 = var5_5;
                                                                                                                                                                                                                                        if (!var8_12) break block150;
                                                                                                                                                                                                                                        if (v8 == 0) break block151;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (MatchException v9) {
                                                                                                                                                                                                                                        throw pulsescanner.c.b.a(v9);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v10 = var13_15;
                                                                                                                                                                                                                                    if (!var8_12) break block152;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (MatchException v11) {
                                                                                                                                                                                                                                    throw pulsescanner.c.b.a(v11);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (v10.b == null) break block151;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v12) {
                                                                                                                                                                                                                                throw pulsescanner.c.b.a(v12);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v10 = var13_15;
                                                                                                                                                                                                                            if (!var8_12) break block152;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException v13) {
                                                                                                                                                                                                                            throw pulsescanner.c.b.a(v13);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (v10.b.isEmpty()) break block151;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (MatchException v14) {
                                                                                                                                                                                                                        throw pulsescanner.c.b.a(v14);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    this.F = var13_15.b;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (MatchException v15) {
                                                                                                                                                                                                                    throw pulsescanner.c.b.a(v15);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v10 = var13_15;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (!var8_12) break block153;
                                                                                                                                                                                                            v8 = v10 instanceof pulsescanner.i.c;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v16) {
                                                                                                                                                                                                            throw pulsescanner.c.b.a(v16);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (v8 == 0) ** GOTO lbl102
                                                                                                                                                                                                    var14_16 = (pulsescanner.i.c)var13_15;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if (var5_5 != 0) {
                                                                                                                                                                                                            pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, 14.0f, 4.0f, 1.0f);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v17) {
                                                                                                                                                                                                        throw pulsescanner.c.b.a(v17);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        v18 = var14_16;
                                                                                                                                                                                                        v19 = var14_16.g;
                                                                                                                                                                                                        v20 = (Boolean)var14_16.a() != false ? 1.0f : 0.0f;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v21) {
                                                                                                                                                                                                        throw pulsescanner.c.b.a(v21);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        v18.g = pulsescanner.j.a.a(v19, v20, 16.0f);
                                                                                                                                                                                                        pulsescanner.g.e.a(var1_1, var13_15.a, var9_8, var12_11, -2829095);
                                                                                                                                                                                                        this.a(var1_1, var10_9 - 18.0f, var11_10, var14_16.g);
                                                                                                                                                                                                        if (var8_12) break block154;
lbl102:
                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                        v10 = var13_15;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v22) {
                                                                                                                                                                                                        throw pulsescanner.c.b.a(v22);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    if (!var8_12) break block155;
                                                                                                                                                                                                    if (v10 instanceof g) {
                                                                                                                                                                                                    }
                                                                                                                                                                                                    ** GOTO lbl193
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v23) {
                                                                                                                                                                                                    throw pulsescanner.c.b.a(v23);
                                                                                                                                                                                                }
                                                                                                                                                                                                var15_17 = (g)var13_15;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    block156: {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (var5_5 != 0) break block156;
                                                                                                                                                                                                                v24 = this.A;
                                                                                                                                                                                                                if (!var8_12) break block157;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (MatchException v25) {
                                                                                                                                                                                                                throw pulsescanner.c.b.a(v25);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (v24 != var15_17) break block158;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v26) {
                                                                                                                                                                                                            throw pulsescanner.c.b.a(v26);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, var4_4 - 2.0f, 4.0f, 1.0f);
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v27) {
                                                                                                                                                                                                    throw pulsescanner.c.b.a(v27);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            pulsescanner.g.e.a(var1_1, var13_15.a, var9_8, var12_11 + 1.0f, -2829095);
                                                                                                                                                                                            v24 = var15_17;
                                                                                                                                                                                        }
                                                                                                                                                                                        var20_18 = v24.j();
                                                                                                                                                                                        pulsescanner.g.e.a(var1_1, var20_18, var10_9 - (float)pulsescanner.g.e.a(var20_18), var12_11 + 1.0f, -6645085);
                                                                                                                                                                                        var21_22 = var9_8;
                                                                                                                                                                                        var22_26 = var10_9 - var9_8;
                                                                                                                                                                                        var23_27 = var3_3 + 17.0f;
                                                                                                                                                                                        var24_28 = (float)var15_17.i();
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                v28 = var15_17;
                                                                                                                                                                                                v29 = var15_17.k;
                                                                                                                                                                                                if (!var8_12) break block159;
                                                                                                                                                                                                if (!(v29 < 0.0f)) break block160;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException v30) {
                                                                                                                                                                                                throw pulsescanner.c.b.a(v30);
                                                                                                                                                                                            }
                                                                                                                                                                                            v31 = var24_28;
                                                                                                                                                                                            break block161;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v32) {
                                                                                                                                                                                            throw pulsescanner.c.b.a(v32);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v29 = var15_17.k;
                                                                                                                                                                                }
                                                                                                                                                                                v31 = pulsescanner.j.a.a(v29, var24_28, 22.0f);
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    v28.k = v31;
                                                                                                                                                                                    pulsescanner.g.b.a(var1_1, var21_22, var23_27, var22_26, 3.0f, 1.5f, 0x26FFFFFF);
                                                                                                                                                                                    v33 = var15_17.k;
                                                                                                                                                                                    if (!var8_12) break block162;
                                                                                                                                                                                    if (!(v33 > 0.0f)) break block163;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v34) {
                                                                                                                                                                                    throw pulsescanner.c.b.a(v34);
                                                                                                                                                                                }
                                                                                                                                                                                pulsescanner.g.b.a(var1_1, var21_22, var23_27, Math.max(3.0f, var22_26 * var15_17.k), 3.0f, 1.5f, -420309428);
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v35) {
                                                                                                                                                                                throw pulsescanner.c.b.a(v35);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v33 = var21_22 + var22_26 * var15_17.k;
                                                                                                                                                                    }
                                                                                                                                                                    var25_29 = v33;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            if (var5_5 == 0 && this.A != var15_17) break block164;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v36) {
                                                                                                                                                                            throw pulsescanner.c.b.a(v36);
                                                                                                                                                                        }
                                                                                                                                                                        pulsescanner.g.b.b(var1_1, var25_29, var23_27 + 1.5f, 6.0f, 1727174220);
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v37) {
                                                                                                                                                                        throw pulsescanner.c.b.a(v37);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    pulsescanner.g.b.a(var1_1, var25_29, var23_27 + 1.5f, 3.2f, -723722);
                                                                                                                                                                    if (var8_12) break block154;
lbl193:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    v10 = var13_15;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v38) {
                                                                                                                                                                    throw pulsescanner.c.b.a(v38);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                if (!var8_12) break block165;
                                                                                                                                                                if (v10 instanceof pulsescanner.i.f) {
                                                                                                                                                                }
                                                                                                                                                                ** GOTO lbl263
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v39) {
                                                                                                                                                                throw pulsescanner.c.b.a(v39);
                                                                                                                                                            }
                                                                                                                                                            var16_31 = (pulsescanner.i.f)var13_15;
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (!var8_12) break block166;
                                                                                                                                                                    if (var5_5 == 0) break block167;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v40) {
                                                                                                                                                                    throw pulsescanner.c.b.a(v40);
                                                                                                                                                                }
                                                                                                                                                                pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, 14.0f, 4.0f, 1.0f);
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v41) {
                                                                                                                                                                throw pulsescanner.c.b.a(v41);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        pulsescanner.g.e.a(var1_1, var13_15.a, var9_8, var12_11, -2829095);
                                                                                                                                                    }
                                                                                                                                                    var20_18 = (String)var16_31.a();
                                                                                                                                                    var21_22 = pulsescanner.g.e.a(var20_18);
                                                                                                                                                    try {
                                                                                                                                                        v42 = var1_1;
                                                                                                                                                        v43 = var10_9 - 1.5f;
                                                                                                                                                        v44 = var11_10;
                                                                                                                                                        v45 = 4.5f;
                                                                                                                                                        v46 = 0.0f;
                                                                                                                                                        v47 = 0.8f;
                                                                                                                                                        v48 = var5_5;
                                                                                                                                                        if (!var8_12) break block168;
                                                                                                                                                        if (v48 == 0) break block169;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v49) {
                                                                                                                                                        throw pulsescanner.c.b.a(v49);
                                                                                                                                                    }
                                                                                                                                                    v48 = -1056964609;
                                                                                                                                                    break block168;
                                                                                                                                                }
                                                                                                                                                v48 = -1929379841;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                pulsescanner.g.b.d(v42, v43, v44, v45, v46, v47, v48);
                                                                                                                                                pulsescanner.g.e.a(var1_1, var20_18, var10_9 - 7.0f - var21_22, var12_11, -592136);
                                                                                                                                                v50 = var1_1;
                                                                                                                                                v51 = var10_9 - 12.5f - var21_22;
                                                                                                                                                v52 = var11_10;
                                                                                                                                                v53 = 4.5f;
                                                                                                                                                v54 = 3.1415927f;
                                                                                                                                                v55 = 0.8f;
                                                                                                                                                v56 = var5_5;
                                                                                                                                                if (!var8_12) break block170;
                                                                                                                                                if (v56 == 0) break block171;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v57) {
                                                                                                                                                throw pulsescanner.c.b.a(v57);
                                                                                                                                            }
                                                                                                                                            v56 = -1056964609;
                                                                                                                                            break block170;
                                                                                                                                        }
                                                                                                                                        v56 = -1929379841;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        pulsescanner.g.b.d(v50, v51, v52, v53, v54, v55, v56);
                                                                                                                                        if (var8_12) break block154;
lbl263:
                                                                                                                                        // 2 sources

                                                                                                                                        v10 = var13_15;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v58) {
                                                                                                                                        throw pulsescanner.c.b.a(v58);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (!var8_12) break block172;
                                                                                                                                    if (v10 instanceof pulsescanner.i.d) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl321
                                                                                                                                }
                                                                                                                                catch (MatchException v59) {
                                                                                                                                    throw pulsescanner.c.b.a(v59);
                                                                                                                                }
                                                                                                                                var17_32 = (pulsescanner.i.d)var13_15;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (!var8_12) break block173;
                                                                                                                                                if (var5_5 == 0) break block174;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v60) {
                                                                                                                                                throw pulsescanner.c.b.a(v60);
                                                                                                                                            }
                                                                                                                                            v61 = var7_7;
                                                                                                                                            v62 = var3_3;
                                                                                                                                            if (!var8_12) break block175;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v63) {
                                                                                                                                            throw pulsescanner.c.b.a(v63);
                                                                                                                                        }
                                                                                                                                        if (!(v61 < v62 + 16.0f)) break block174;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v64) {
                                                                                                                                        throw pulsescanner.c.b.a(v64);
                                                                                                                                    }
                                                                                                                                    pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, 14.0f, 4.0f, 1.0f);
                                                                                                                                }
                                                                                                                                catch (MatchException v65) {
                                                                                                                                    throw pulsescanner.c.b.a(v65);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                pulsescanner.g.e.a(var1_1, var13_15.a, var9_8, var12_11, -2829095);
                                                                                                                                pulsescanner.g.b.a(var1_1, var10_9 - 16.0f, var11_10 - 4.0f, 16.0f, 8.0f, 3.0f, -16777216 | (Integer)var17_32.a());
                                                                                                                                if (!var8_12) break block176;
                                                                                                                                pulsescanner.g.b.a(var1_1, var10_9 - 16.0f, var11_10 - 4.0f, 16.0f, 8.0f, 3.0f, pulsescanner.c.c.a(), 0x40FFFFFF);
                                                                                                                            }
                                                                                                                            catch (MatchException v66) {
                                                                                                                                throw pulsescanner.c.b.a(v66);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v61 = var17_32.h;
                                                                                                                        v62 = 0.01f;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (!(v61 > v62)) break block154;
                                                                                                                        this.a(var1_1, var17_32, var3_3 + 16.0f, var9_8, var10_9 - var9_8);
                                                                                                                    }
                                                                                                                    catch (MatchException v67) {
                                                                                                                        throw pulsescanner.c.b.a(v67);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (var8_12) break block154;
lbl321:
                                                                                                                    // 2 sources

                                                                                                                    v10 = var13_15;
                                                                                                                }
                                                                                                                catch (MatchException v68) {
                                                                                                                    throw pulsescanner.c.b.a(v68);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (!var8_12) break block177;
                                                                                                                if (v10 instanceof e) {
                                                                                                                }
                                                                                                                ** GOTO lbl369
                                                                                                            }
                                                                                                            catch (MatchException v69) {
                                                                                                                throw pulsescanner.c.b.a(v69);
                                                                                                            }
                                                                                                            var18_33 = (e)var13_15;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (!var8_12) break block178;
                                                                                                                    if (var5_5 == 0) break block179;
                                                                                                                }
                                                                                                                catch (MatchException v70) {
                                                                                                                    throw pulsescanner.c.b.a(v70);
                                                                                                                }
                                                                                                                pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, 14.0f, 4.0f, 1.0f);
                                                                                                            }
                                                                                                            catch (MatchException v71) {
                                                                                                                throw pulsescanner.c.b.a(v71);
                                                                                                            }
                                                                                                        }
                                                                                                        pulsescanner.g.e.a(var1_1, var13_15.a, var9_8, var12_11, -2829095);
                                                                                                    }
                                                                                                    try {
                                                                                                        v72 = this.D == var18_33;
                                                                                                    }
                                                                                                    catch (MatchException v73) {
                                                                                                        throw pulsescanner.c.b.a(v73);
                                                                                                    }
                                                                                                    var20_19 = v72;
                                                                                                    try {
                                                                                                        v74 = var20_19 != false ? pulsescanner.c.b.I[5] : var18_33.i();
                                                                                                    }
                                                                                                    catch (MatchException v75) {
                                                                                                        throw pulsescanner.c.b.a(v75);
                                                                                                    }
                                                                                                    var21_23 = v74;
                                                                                                    var22_26 = Math.max(14, pulsescanner.g.e.a(var21_23) + 8);
                                                                                                    try {
                                                                                                        v76 = var20_19 != false ? 0.5f + 0.5f * (float)Math.sin((double)System.currentTimeMillis() / 150.0) : 0.0f;
                                                                                                    }
                                                                                                    catch (MatchException v77) {
                                                                                                        throw pulsescanner.c.b.a(v77);
                                                                                                    }
                                                                                                    var23_27 = v76;
                                                                                                    try {
                                                                                                        pulsescanner.g.b.a(var1_1, var10_9 - var22_26, var11_10 - 5.5f, var22_26, 11.0f, 3.0f, pulsescanner.g.b.a(0x1FFFFFFF, 0x40FFFFFF, var23_27));
                                                                                                        pulsescanner.g.b.a(var1_1, var10_9 - var22_26, var11_10 - 5.5f, var22_26, 11.0f, 3.0f, pulsescanner.c.c.a(), 0x26FFFFFF);
                                                                                                        pulsescanner.g.e.a(var1_1, var21_23, var10_9 - var22_26 / 2.0f - (float)pulsescanner.g.e.a(var21_23) / 2.0f, var12_11, -592136);
                                                                                                        if (var8_12) break block154;
lbl369:
                                                                                                        // 2 sources

                                                                                                        v10 = var13_15;
                                                                                                    }
                                                                                                    catch (MatchException v78) {
                                                                                                        throw pulsescanner.c.b.a(v78);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (!var8_12) break block180;
                                                                                                    if (v10 instanceof h) {
                                                                                                    }
                                                                                                    ** GOTO lbl568
                                                                                                }
                                                                                                catch (MatchException v79) {
                                                                                                    throw pulsescanner.c.b.a(v79);
                                                                                                }
                                                                                                var19_34 = (h)var13_15;
                                                                                                try {
                                                                                                    v80 = this.E == var19_34 ? 1 : 0;
                                                                                                }
                                                                                                catch (MatchException v81) {
                                                                                                    throw pulsescanner.c.b.a(v81);
                                                                                                }
                                                                                                var20_20 = v80;
                                                                                                try {
                                                                                                    v82 = var5_5;
                                                                                                    if (!var8_12) break block181;
                                                                                                    if (v82 == 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl399
                                                                                                }
                                                                                                catch (MatchException v83) {
                                                                                                    throw pulsescanner.c.b.a(v83);
                                                                                                }
                                                                                                v82 = var20_20;
                                                                                            }
                                                                                            try {
                                                                                                if (v82 == 0) break block182;
lbl399:
                                                                                                // 2 sources

                                                                                                pulsescanner.c.c.b(var1_1, this.p + 4.0f, var3_3 + 1.0f, 144.0f, var4_4 - 2.0f, 4.0f, 1.0f);
                                                                                            }
                                                                                            catch (MatchException v84) {
                                                                                                throw pulsescanner.c.b.a(v84);
                                                                                            }
                                                                                        }
                                                                                        pulsescanner.g.e.a(var1_1, var13_15.a, var9_8, var12_11, -2829095);
                                                                                        var21_24 = var9_8;
                                                                                        var22_26 = var10_9 - var9_8;
                                                                                        var23_27 = var3_3 + 15.0f;
                                                                                        var24_28 = 11.0f;
                                                                                        try {
                                                                                            v85 = var1_1;
                                                                                            v86 = var21_24;
                                                                                            v87 = var23_27;
                                                                                            v88 = var22_26;
                                                                                            v89 = var24_28;
                                                                                            v90 = 3.0f;
                                                                                            v91 = var20_20;
                                                                                            if (!var8_12) break block183;
                                                                                            if (v91 == 0) break block184;
                                                                                        }
                                                                                        catch (MatchException v92) {
                                                                                            throw pulsescanner.c.b.a(v92);
                                                                                        }
                                                                                        v91 = 0x2EFFFFFF;
                                                                                        break block183;
                                                                                    }
                                                                                    v91 = 0x1AFFFFFF;
                                                                                }
                                                                                try {
                                                                                    pulsescanner.g.b.a(v85, v86, v87, v88, v89, v90, v91);
                                                                                    v93 = var1_1;
                                                                                    v94 = var21_24;
                                                                                    v95 = var23_27;
                                                                                    v96 = var22_26;
                                                                                    v97 = var24_28;
                                                                                    v98 = 3.0f;
                                                                                    v99 = pulsescanner.c.c.a();
                                                                                    v100 = var20_20;
                                                                                    if (!var8_12) break block185;
                                                                                    if (v100 == 0) break block186;
                                                                                }
                                                                                catch (MatchException v101) {
                                                                                    throw pulsescanner.c.b.a(v101);
                                                                                }
                                                                                v100 = 0x59FFFFFF;
                                                                                break block185;
                                                                            }
                                                                            v100 = 0x26FFFFFF;
                                                                        }
                                                                        pulsescanner.g.b.a(v93, v94, v95, v96, v97, v98, v99, v100);
                                                                        var25_30 = (String)var19_34.a();
                                                                        var26_35 = var25_30.isEmpty();
                                                                        var27_36 = var22_26 - 8.0f;
                                                                        try {
                                                                            try {
                                                                                v102 = var20_20;
                                                                                if (!var8_12) break block187;
                                                                                if (v102 == 0) break block188;
                                                                            }
                                                                            catch (MatchException v103) {
                                                                                throw pulsescanner.c.b.a(v103);
                                                                            }
lbl459:
                                                                            // 2 sources

                                                                            while (!var25_30.isEmpty()) {
                                                                                break block189;
                                                                            }
                                                                            break block190;
                                                                        }
                                                                        catch (MatchException v104) {
                                                                            throw pulsescanner.c.b.a(v104);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v105 = pulsescanner.g.e.a(var25_30);
                                                                            if (!var8_12 || !var8_12) break block191;
                                                                        }
                                                                        catch (MatchException v106) {
                                                                            throw pulsescanner.c.b.a(v106);
                                                                        }
                                                                        if (!((float)v105 > var27_36)) break block190;
                                                                    }
                                                                    catch (MatchException v107) {
                                                                        throw pulsescanner.c.b.a(v107);
                                                                    }
                                                                    var25_30 = var25_30.substring(1);
                                                                    if (var8_12) ** GOTO lbl459
                                                                }
                                                                try {
                                                                    v105 = pulsescanner.g.e.a(var25_30);
                                                                    if (!var8_12) break block191;
                                                                    cfr_temp_0 = (float)v105 - var27_36;
                                                                    v102 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                }
                                                                catch (MatchException v108) {
                                                                    throw pulsescanner.c.b.a(v108);
                                                                }
                                                            }
                                                            try {
                                                                if (v102 <= 0) break block190;
lbl490:
                                                                // 2 sources

                                                                while (var25_30.length() > 1) {
                                                                    break block192;
                                                                }
                                                                break block193;
                                                            }
                                                            catch (MatchException v109) {
                                                                throw pulsescanner.c.b.a(v109);
                                                            }
                                                        }
                                                        v110 = new StringBuilder();
                                                        v111 = var25_30;
                                                        if (!var8_12) break block201;
                                                        try {
                                                            v105 = pulsescanner.g.e.a(v110.append(v111).append(pulsescanner.c.b.I[7]).toString());
                                                            if (!var8_12) break block191;
                                                            if (!((float)v105 > var27_36)) break block193;
                                                        }
                                                        catch (MatchException v112) {
                                                            throw pulsescanner.c.b.a(v112);
                                                        }
                                                        var25_30 = var25_30.substring(0, var25_30.length() - 1);
                                                        if (var8_12) ** GOTO lbl490
                                                    }
                                                    v110 = new StringBuilder().append(var25_30);
                                                    var28_14 = pulsescanner.c.b.I;
                                                    v111 = var28_14[7];
                                                }
                                                var25_30 = v110.append(v111).toString();
                                            }
                                            try {
                                                v113 = var1_1;
                                                if (!var8_12) break block194;
                                                pulsescanner.g.b.a(v113, (int)var21_24, (int)var23_27, (int)Math.ceil(var22_26), (int)var24_28);
                                                v105 = (int)var26_35;
                                            }
                                            catch (MatchException v114) {
                                                throw pulsescanner.c.b.a(v114);
                                            }
                                        }
                                        try {
                                            block195: {
                                                try {
                                                    try {
                                                        if (v105 == 0 || var20_20 != 0) break block195;
                                                    }
                                                    catch (MatchException v115) {
                                                        throw pulsescanner.c.b.a(v115);
                                                    }
                                                    pulsescanner.g.e.a(var1_1, pulsescanner.c.b.I[6], var21_24 + 4.0f, var23_27 + 2.0f, 0x66FFFFFF);
                                                    if (var8_12) break block196;
                                                }
                                                catch (MatchException v116) {
                                                    throw pulsescanner.c.b.a(v116);
                                                }
                                            }
                                            v113 = var1_1;
                                        }
                                        catch (MatchException v117) {
                                            throw pulsescanner.c.b.a(v117);
                                        }
                                    }
                                    pulsescanner.g.e.a(v113, var25_30, var21_24 + 4.0f, var23_27 + 2.0f, -592136);
                                }
                                try {
                                    try {
                                        v118 = var20_20;
                                        if (!var8_12) break block197;
                                        if (v118 == 0) break block198;
                                    }
                                    catch (MatchException v119) {
                                        throw pulsescanner.c.b.a(v119);
                                    }
                                    cfr_temp_1 = System.currentTimeMillis() / 500L % 2L - 0L;
                                    v118 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                }
                                catch (MatchException v120) {
                                    throw pulsescanner.c.b.a(v120);
                                }
                            }
                            try {
                                if (v118 == 0) {
                                    pulsescanner.g.b.a(var1_1, var21_24 + 4.0f + (float)pulsescanner.g.e.a(var25_30) + 0.5f, var23_27 + 2.0f, 0.8f, 7.5f, -419430401);
                                }
                            }
                            catch (MatchException v121) {
                                throw pulsescanner.c.b.a(v121);
                            }
                        }
                        try {
                            pulsescanner.g.b.a(var1_1);
                            if (var8_12) break block154;
lbl568:
                            // 2 sources

                            v10 = var13_15;
                        }
                        catch (MatchException v122) {
                            throw pulsescanner.c.b.a(v122);
                        }
                    }
                    if (!(v10 instanceof pulsescanner.i.b)) break block154;
                    var20_21 = this.p + 5.0f;
                    var21_25 = 142.0f;
                    var22_26 = var3_3 + 2.0f;
                    var23_27 = var4_4 - 4.0f;
                    try {
                        v123 = var1_1;
                        v124 = var20_21;
                        v125 = var22_26;
                        v126 = var21_25;
                        v127 = var23_27;
                        v128 = 4.0f;
                        v129 = var5_5;
                        if (!var8_12) break block199;
                        if (v129 == 0) break block200;
                    }
                    catch (MatchException v130) {
                        throw pulsescanner.c.b.a(v130);
                    }
                    v129 = 0x30FFFFFF;
                    break block199;
                }
                v129 = 0x18FFFFFF;
            }
            pulsescanner.g.b.a(v123, v124, v125, v126, v127, v128, v129);
            pulsescanner.g.b.a(var1_1, var20_21, var22_26, var21_25, var23_27, 4.0f, pulsescanner.c.c.a(), 0x1FFFFFFF);
            pulsescanner.g.e.a(var1_1, var13_15.a, this.p + 76.0f, var22_26 + (var23_27 - 8.0f) / 2.0f + 0.5f, -592136, false);
        }
    }

    private void a(class_332 class_3322, float f2, float f3, float f4) {
        float f5 = 18.0f;
        float f6 = 10.0f;
        pulsescanner.g.b.a(class_3322, f2, f3 - f6 / 2.0f, f5, f6, f6 / 2.0f, pulsescanner.g.b.a(0x26FFFFFF, -218982836, f4));
        pulsescanner.g.b.a(class_3322, f2, f3 - f6 / 2.0f, f5, f6, f6 / 2.0f, pulsescanner.c.c.a(), pulsescanner.g.b.a(0x26FFFFFF, 1.0f - f4));
        float f7 = f2 + 5.0f + (f5 - 10.0f) * f4;
        pulsescanner.g.b.a(class_3322, f7, f3, 3.4f, pulsescanner.g.b.a(-2434337, -14412538, f4));
    }

    private void a(class_332 class_3322, pulsescanner.i.d d2, float f2, float f3, float f4) {
        try {
            if (d2.i < 0.0f) {
                d2.g();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
        float f5 = pulsescanner.g.b.a;
        pulsescanner.g.b.a = f5 * d2.h;
        for (int i2 = 0; i2 < 4; ++i2) {
            float f6 = f2 + 3.0f + (float)(i2 * 11);
            float f7 = f3 + 2.0f + (f4 - 4.0f) * (switch (i2) {
                case 0 -> {
                    int var10_11 = 24;
                    for (int var11_13 = 0; var11_13 < var10_11; ++var11_13) {
                        int var12_14 = 0xFF000000 | Color.HSBtoRGB((float)var11_13 / (float)var10_11, 1.0f, 1.0f);
                        int var13_15 = 0xFF000000 | Color.HSBtoRGB((float)(var11_13 + 1) / (float)var10_11, 1.0f, 1.0f);
                        pulsescanner.g.b.a(class_3322, f3 + 2.0f + (f4 - 4.0f) * (float)var11_13 / (float)var10_11, f6, (f4 - 4.0f) / (float)var10_11 + 0.05f, 4.0f, var12_14, var13_15);
                    }
                    pulsescanner.g.b.a(class_3322, f3 + 2.0f, f6 + 2.0f, 2.0f, -65536);
                    pulsescanner.g.b.a(class_3322, f3 + f4 - 2.0f, f6 + 2.0f, 2.0f, -65536);
                    yield d2.i;
                }
                case 1 -> {
                    pulsescanner.g.b.b(class_3322, f3, f6, f4, 4.0f, 2.0f, 0xFF000000 | Color.HSBtoRGB(d2.i, 0.0f, d2.k), 0xFF000000 | Color.HSBtoRGB(d2.i, 1.0f, d2.k));
                    yield d2.j;
                }
                case 2 -> {
                    pulsescanner.g.b.b(class_3322, f3, f6, f4, 4.0f, 2.0f, -16777216, 0xFF000000 | Color.HSBtoRGB(d2.i, d2.j, 1.0f));
                    yield d2.k;
                }
                default -> {
                    int var10_12 = (Integer)d2.a() & 0xFFFFFF;
                    pulsescanner.g.b.b(class_3322, f3, f6, f4, 4.0f, 2.0f, 0x20FFFFFF, 0xFF000000 | var10_12);
                    yield (float)d2.i() / 255.0f;
                }
            });
            pulsescanner.g.b.a(class_3322, f7, f6 + 2.0f, 3.0f, -723722);
            pulsescanner.g.b.b(class_3322, f7, f6 + 2.0f, 3.0f, 0.6f, 0x60000000);
        }
        pulsescanner.g.b.a = f5;
    }

    /*
     * Exception decompiling
     */
    private void a(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(double d2, double d3, int n2) {
        block41: {
            try {
                if (!this.a(d2, d3)) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
            float f2 = this.p + 152.0f - 7.0f - 4.0f;
            float f3 = this.q + 7.0f + 4.5f;
            try {
                if (pulsescanner.c.c.a(d2, d3, f2 - 6.0f, f3 - 6.0f, 12.0f, 12.0f)) {
                    this.G = true;
                    return true;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
            try {
                try {
                    this.E = null;
                    if (!(d3 < (double)this.x) && !(d3 > (double)(this.x + this.z))) break block41;
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
        }
        for (d d4 : this.b()) {
            Object object;
            float f4;
            block43: {
                f4 = this.x + d4.e - this.v;
                try {
                    if (!pulsescanner.c.c.a(d2, d3, this.p, f4, 152.0f, d4.f)) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                object = d4.d;
                if (object instanceof h) {
                    h h2;
                    block42: {
                        h2 = (h)object;
                        try {
                            if (n2 != 1) break block42;
                            h2.b();
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                    }
                    this.E = h2;
                    return true;
                }
                try {
                    if (object != h) break block43;
                    this.i.d();
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            if (object instanceof pulsescanner.i.c) {
                pulsescanner.i.c c2 = (pulsescanner.i.c)object;
                c2.g();
                return true;
            }
            if (object instanceof g) {
                g g2;
                block44: {
                    g2 = (g)object;
                    try {
                        if (n2 != 1) break block44;
                        g2.b();
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                }
                this.A = g2;
                return true;
            }
            if (object instanceof pulsescanner.i.f) {
                int n3;
                pulsescanner.i.f f5;
                pulsescanner.i.f f6 = (pulsescanner.i.f)object;
                try {
                    f5 = f6;
                    n3 = n2 == 1 ? -1 : 1;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                f5.a(n3);
                return true;
            }
            if (object instanceof pulsescanner.i.d) {
                pulsescanner.i.d d5;
                block45: {
                    boolean bl;
                    block47: {
                        block46: {
                            d5 = (pulsescanner.i.d)object;
                            try {
                                try {
                                    if (!(d3 < (double)(f4 + 16.0f))) break block45;
                                    pulsescanner.i.d d6 = d5;
                                    if (d5.g) break block46;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.b.a(matchException);
                                }
                                bl = true;
                                break block47;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.b.a(matchException);
                            }
                        }
                        bl = false;
                    }
                    d6.g = bl;
                    d5.g();
                    return true;
                }
                int n4 = (int)((d3 - (double)(f4 + 16.0f + 1.0f)) / 11.0);
                try {
                    try {
                        if (n4 < 0 || n4 >= 4) return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                    d5.g();
                    this.B = d5;
                    this.C = n4;
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            if (object instanceof e) {
                e e2;
                e e3 = (e)object;
                try {
                    b b2 = this;
                    e2 = n2 == 1 ? null : e3;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                try {
                    b2.D = e2;
                    if (n2 != 1) return true;
                    e3.a(-1);
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            } else {
                if (!(object instanceof pulsescanner.i.b)) return true;
                pulsescanner.i.b b3 = (pulsescanner.i.b)object;
                b3.g();
            }
            return true;
        }
        return true;
    }

    public void c() {
        this.A = null;
        this.B = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2) {
        block43: {
            block42: {
                if (this.E != null) {
                    String string;
                    boolean bl;
                    class_310 class_3102;
                    block41: {
                        block38: {
                            String string2;
                            h h2;
                            block40: {
                                block39: {
                                    block37: {
                                        boolean bl2;
                                        block35: {
                                            block34: {
                                                class_3102 = class_310.method_1551();
                                                try {
                                                    try {
                                                        if (!class_3675.method_15987((class_1041)class_3102.method_22683(), (int)341) && !class_3675.method_15987((class_1041)class_3102.method_22683(), (int)345)) break block34;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.b.a(matchException);
                                                    }
                                                    bl2 = true;
                                                    break block35;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.b.a(matchException);
                                                }
                                            }
                                            bl2 = false;
                                        }
                                        bl = bl2;
                                        string = (String)this.E.a();
                                        try {
                                            block36: {
                                                try {
                                                    try {
                                                        if (n2 == 256 || n2 == 257) break block36;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.b.a(matchException);
                                                    }
                                                    if (n2 != 335) break block37;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.b.a(matchException);
                                                }
                                            }
                                            this.E = null;
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.b.a(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (n2 != 259 || string.isEmpty()) break block38;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.b.a(matchException);
                                            }
                                            h2 = this.E;
                                            if (!bl) break block39;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.b.a(matchException);
                                        }
                                        string2 = "";
                                        break block40;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.b.a(matchException);
                                    }
                                }
                                string2 = string.substring(0, string.length() - 1);
                            }
                            h2.a(string2);
                            return true;
                        }
                        try {
                            if (!bl || n2 != 86) break block41;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                        String string3 = class_3102.field_1774.method_1460();
                        try {
                            if (string3 == null) return true;
                            this.E.a(string + string3.replace("\r", "").replace("\n", " "));
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (!bl || n2 != 67) return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.b.a(matchException);
                        }
                        class_3102.field_1774.method_1455(string);
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                }
                try {
                    if (this.D == null) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                try {
                    if (n2 != 256) break block42;
                    this.D = null;
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            try {
                try {
                    if (n2 != 259 && n2 != 261) break block43;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
                this.D.a(-1);
                this.D = null;
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.b.a(matchException);
            }
        }
        this.D.a(n2);
        this.D = null;
        return true;
    }

    public boolean a(String string) {
        try {
            if (this.E == null) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
        this.E.a((String)this.E.a() + string);
        return true;
    }

    public boolean a(g g2) {
        boolean bl;
        try {
            bl = this.A == g2;
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.b.a(matchException);
        }
        return bl;
    }

    public boolean d() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.A == null && this.B == null) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.b.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.b.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "\u000b[:\u000e\u000fpa,Z \u0007\fG2\u000b\u000bak\u0005\bE#\u0001\u0006\u0003\u0001\\6\n\u001aH'\u001c\u0015e{ F=\u0003g\u0007}";
                var4_3 = "\u000b[:\u000e\u000fpa,Z \u0007\fG2\u000b\u000bak\u0005\bE#\u0001\u0006\u0003\u0001\\6\n\u001aH'\u001c\u0015e{ F=\u0003g\u0007}".length();
                var1_4 = 10;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 62;
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
                    var2_2 = "\u0013\\#\u0013\u0015=b?\u0010>\t\u000ex\u0003~\u001ed";
                    var4_3 = "\u0013\\#\u0013\u0015=b?\u0010>\t\u000ex\u0003~\u001ed".length();
                    var1_4 = 13;
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
            var6_7 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_7;
                switch (var6_7 % 7) {
                    case 0: {
                        v11 = 119;
                        break;
                    }
                    case 1: {
                        v11 = 23;
                        break;
                    }
                    case 2: {
                        v11 = 109;
                        break;
                    }
                    case 3: {
                        v11 = 87;
                        break;
                    }
                    case 4: {
                        v11 = 89;
                        break;
                    }
                    case 5: {
                        v11 = 58;
                        break;
                    }
                    default: {
                        v11 = 49;
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
        pulsescanner.c.b.I = var5;
        pulsescanner.c.b.h = new Object();
        v12 = new String[4];
        var0_6 = pulsescanner.c.b.I;
        v12[0] = var0_6[3];
        v12[1] = var0_6[4];
        v12[2] = var0_6[0];
        v12[3] = var0_6[2];
        pulsescanner.c.b.H = v12;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

