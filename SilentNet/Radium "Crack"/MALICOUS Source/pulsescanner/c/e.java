/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package pulsescanner.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import pulsescanner.a.av;
import pulsescanner.c.a;
import pulsescanner.c.b;
import pulsescanner.c.c;
import pulsescanner.c.f;
import pulsescanner.d.d;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.g.g;

public class e
extends class_437 {
    public static final List<a> a;
    private b b;
    private b c;
    private float d;
    private boolean e;
    private i f;
    private float g;
    private float h;
    private String i = "";
    private static final float j = 86.0f;
    private static final float k = 18.0f;
    private static final float l = 150.0f;
    private static final float m = 8.0f;
    private static final float n = 82.0f;
    private float o;
    private float p;
    private String q = "";
    private boolean r;
    private float s;
    private float t;
    private static float u;
    private static final String[] v;

    public e() {
        super((class_2561)class_2561.method_43470((String)v[0]));
    }

    public static void a() {
        a.clear();
        float f2 = 12.0f;
        for (h h2 : pulsescanner.f.h.values()) {
            a.add(new a(h2, f2, 12.0f));
            f2 += 144.0f;
        }
    }

    public static a a(i i2) {
        for (a a2 : a) {
            try {
                if (!a2.e.contains(i2)) continue;
                return a2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        return null;
    }

    public static a a(String string) {
        for (a a2 : a) {
            try {
                if (!a2.a.equals(string)) continue;
                return a2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        return null;
    }

    public static void a(a a2, int n2, int n3) {
        float f2 = 144.0f;
        for (float f3 = 12.0f; f3 < Math.max(13.0f, (float)n3 - 25.0f); f3 += 16.0f) {
            float f4 = 12.0f;
            while (f4 + 132.0f <= Math.max(144.0f, (float)(n2 - 4))) {
                boolean bl = true;
                for (a a3 : a) {
                    try {
                        if (a3 == a2) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    try {
                        try {
                            try {
                                if (!(f4 < a3.h + 132.0f + 6.0f) || !(f4 + 132.0f + 6.0f > a3.h)) continue;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            if (!(f3 < a3.i + a3.c() + 6.0f)) continue;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        if (!(f3 + a2.c() + 6.0f > a3.i)) continue;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    bl = false;
                    break;
                }
                try {
                    if (bl) {
                        a2.a(f4, f3);
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                f4 += f2;
            }
        }
        a2.a(12.0f, 12.0f);
    }

    protected void method_25426() {
        this.a(false);
    }

    private void a(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        for (a a2 : a) {
            try {
                a2.a(this.q);
                if (!a2.a()) continue;
                arrayList.add(a2);
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        arrayList.sort(Comparator.comparingInt(e::lambda$arrangePanels$0).thenComparing(e::lambda$arrangePanels$1));
        float f2 = 10.0f;
        float f3 = 12.0f;
        int n2 = Math.max(1, Math.min(arrayList.size(), (int)((this.c() - f3 * 2.0f + f2) / (132.0f + f2))));
        float f4 = (float)n2 * 132.0f + (float)(n2 - 1) * f2;
        float f5 = Math.max(f3, (this.c() - f4) / 2.0f);
        float[] fArray = new float[n2];
        Arrays.fill(fArray, f3);
        for (a a3 : arrayList) {
            int n3;
            block14: {
                float f6;
                float f7;
                block13: {
                    n3 = 0;
                    int n4 = 1;
                    while (true) {
                        block12: {
                            try {
                                if (n4 >= n2) break;
                                if (!(fArray[n4] < fArray[n3] - 0.5f)) break block12;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            n3 = n4;
                        }
                        ++n4;
                    }
                    f7 = f5 + (float)n3 * (132.0f + f2);
                    f6 = fArray[n3];
                    try {
                        if (!bl) break block13;
                        a3.b(f7, f6);
                        break block14;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                }
                a3.a(f7, f6);
            }
            int n5 = n3;
            fArray[n5] = fArray[n5] + (a3.c() + f2);
        }
    }

    private static float b() {
        float f2;
        try {
            f2 = u > 0.0f ? u : pulsescanner.c.e.e().l.g();
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        return f2;
    }

    private float c() {
        return (float)this.field_22789 / pulsescanner.c.e.b();
    }

    private float d() {
        return (float)this.field_22790 / pulsescanner.c.e.b();
    }

    private static pulsescanner.f.b.a e() {
        return pulsescanner.f.m.a(pulsescanner.f.b.a.class);
    }

    public boolean method_25421() {
        return false;
    }

    public void method_25420(class_332 class_3322, int n2, int n3, float f2) {
        try {
            if (((Boolean)pulsescanner.c.e.e().m.a()).booleanValue()) {
                this.method_57734(class_3322);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        int n4 = (int)((Double)pulsescanner.c.e.e().n.a() * 2.55 * (double)this.d);
        try {
            if (n4 > 0) {
                class_3322.method_25294(0, 0, this.field_22789, this.field_22790, n4 << 24 | 0xF0A05);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
    }

    public void method_25394(class_332 class_3322, int n2, int n3, float f2) {
        a a22;
        block56: {
            i i2;
            a a3;
            block53: {
                block52: {
                    boolean bl;
                    block51: {
                        block50: {
                            block49: {
                                boolean bl2;
                                block48: {
                                    boolean bl3;
                                    block47: {
                                        block46: {
                                            block44: {
                                                block45: {
                                                    float f3;
                                                    float f4;
                                                    float f5;
                                                    try {
                                                        e e2 = this;
                                                        f5 = this.d;
                                                        f4 = this.e ? 0.0f : 1.0f;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.e.a(matchException);
                                                    }
                                                    try {
                                                        f3 = this.e ? 22.0f : 13.0f;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.e.a(matchException);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                e2.d = pulsescanner.j.a.a(f5, f4, f3);
                                                                if (!this.e || !(this.d <= 0.02f)) break block44;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.c.e.a(matchException);
                                                            }
                                                            if (this.field_22787 == null) break block45;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.c.e.a(matchException);
                                                        }
                                                        this.field_22787.method_1507(null);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.e.a(matchException);
                                                    }
                                                }
                                                return;
                                            }
                                            try {
                                                try {
                                                    if (this.b == null || !this.b.a(pulsescanner.c.e.e().l)) break block46;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.e.a(matchException);
                                                }
                                                bl3 = true;
                                                break block47;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.e.a(matchException);
                                            }
                                        }
                                        bl3 = false;
                                    }
                                    bl2 = bl3;
                                    try {
                                        try {
                                            if (!bl2 || !(u < 0.0f)) break block48;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.e.a(matchException);
                                        }
                                        u = pulsescanner.c.e.e().l.g();
                                        break block49;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.e.a(matchException);
                                    }
                                }
                                try {
                                    if (!bl2) {
                                        u = -1.0f;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.e.a(matchException);
                                }
                            }
                            float f6 = pulsescanner.c.e.b();
                            n2 = (int)((float)n2 / f6);
                            n3 = (int)((float)n3 / f6);
                            pulsescanner.g.b.j = f6;
                            pulsescanner.g.b.a = this.d;
                            class_3322.method_51448().pushMatrix();
                            class_3322.method_51448().scale(f6, f6);
                            float f7 = 0.965f + 0.035f * this.d;
                            class_3322.method_51448().translate(this.c() / 2.0f, this.d() / 2.0f);
                            class_3322.method_51448().scale(f7, f7);
                            class_3322.method_51448().translate(-this.c() / 2.0f, -this.d() / 2.0f);
                            for (a a22 : a) {
                                a22.a(this.q);
                            }
                            try {
                                try {
                                    if (this.b == null || !this.b.a(n2, (double)n3)) break block50;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.e.a(matchException);
                                }
                                bl = true;
                                break block51;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                        }
                        bl = false;
                    }
                    boolean bl4 = bl;
                    try {
                        try {
                            if (!bl4 && !this.e) break block52;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        a3 = null;
                        break block53;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                }
                a3 = this.a(n2, n3);
            }
            a22 = a3;
            try {
                i2 = this.b != null ? this.b.i : null;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
            i i3 = i2;
            for (a a4 : a) {
                boolean bl;
                int n4;
                int n5;
                class_332 class_3323;
                a a5;
                block55: {
                    block54: {
                        try {
                            try {
                                if (!a4.a()) continue;
                                a5 = a4;
                                class_3323 = class_3322;
                                n5 = n2;
                                n4 = n3;
                                if (a4 != a22) break block54;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            bl = true;
                            break block55;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                    }
                    bl = false;
                }
                a5.a(class_3323, n5, n4, bl, i3);
            }
            try {
                try {
                    if (this.c == null) break block56;
                    this.c.a(class_3322, n2, n3, (int)this.c(), (int)this.d());
                    if (!(this.c.s < 0.02f)) break block56;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                this.c = null;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        try {
            if (this.b != null) {
                this.b.a(class_3322, n2, n3, (int)this.c(), (int)this.d());
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        this.c(class_3322, n2, n3);
        this.a(class_3322, n2, n3);
        this.b(class_3322, n2, n3);
        this.a(class_3322, n2, n3, a22);
        class_3322.method_51448().popMatrix();
        pulsescanner.g.b.a = 1.0f;
        pulsescanner.g.b.j = 1.0f;
    }

    private float f() {
        return this.c() / 2.0f - 167.0f;
    }

    private float g() {
        return this.f() + 150.0f + 8.0f;
    }

    private float h() {
        return this.g() + 86.0f + 8.0f;
    }

    private float i() {
        return this.d() - 18.0f - 10.0f;
    }

    private void a(class_332 class_3322, int n2, int n3) {
        float f2;
        float f3;
        float f4;
        float f5;
        block5: {
            block4: {
                f5 = this.g();
                f4 = this.i();
                try {
                    try {
                        e e2 = this;
                        f3 = this.o;
                        if (!pulsescanner.c.c.a(n2, (double)n3, f5, f4, 86.0f, 18.0f) || this.e) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    f2 = 1.0f;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
            }
            f2 = 0.0f;
        }
        e2.o = pulsescanner.j.a.a(f3, f2, 18.0f);
        pulsescanner.c.c.a(class_3322, f5, f4, 86.0f, 18.0f, 9.0f);
        pulsescanner.c.c.b(class_3322, f5, f4, 86.0f, 18.0f, 9.0f, this.o);
        pulsescanner.g.g.a(class_3322, pulsescanner.g.a.GRID, f5 + 14.0f, f4 + 9.0f, 7.5f, -592136);
        pulsescanner.g.e.a(class_3322, v[4], f5 + 24.0f, f4 + 5.0f + 0.5f, -592136);
    }

    private void b(class_332 class_3322, int n2, int n3) {
        float f2;
        float f3;
        float f4;
        float f5;
        block5: {
            block4: {
                f5 = this.h();
                f4 = this.i();
                try {
                    try {
                        e e2 = this;
                        f3 = this.p;
                        if (!pulsescanner.c.c.a(n2, (double)n3, f5, f4, 82.0f, 18.0f) || this.e) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    f2 = 1.0f;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
            }
            f2 = 0.0f;
        }
        e2.p = pulsescanner.j.a.a(f3, f2, 18.0f);
        pulsescanner.c.c.a(class_3322, f5, f4, 82.0f, 18.0f, 9.0f);
        pulsescanner.c.c.b(class_3322, f5, f4, 82.0f, 18.0f, 9.0f, this.p);
        pulsescanner.g.e.a(class_3322, v[3], f5 + 41.0f, f4 + 5.0f + 0.5f, -592136, false);
    }

    /*
     * Unable to fully structure code
     */
    private void c(class_332 var1_1, int var2_2, int var3_3) {
        block58: {
            block57: {
                block56: {
                    block54: {
                        block55: {
                            block60: {
                                block53: {
                                    block52: {
                                        block50: {
                                            block51: {
                                                block48: {
                                                    block49: {
                                                        block46: {
                                                            block47: {
                                                                block44: {
                                                                    block45: {
                                                                        var5_4 = this.f();
                                                                        var4_5 = pulsescanner.c.f.c();
                                                                        var6_6 = this.i();
                                                                        var7_7 = 18.0f;
                                                                        try {
                                                                            v0 = this.q.isEmpty();
                                                                            if (!var4_5) break block44;
                                                                            if (v0 != 0) break block45;
                                                                        }
                                                                        catch (MatchException v1) {
                                                                            throw pulsescanner.c.e.a(v1);
                                                                        }
                                                                        v0 = 1;
                                                                        break block44;
                                                                    }
                                                                    v0 = 0;
                                                                }
                                                                var8_8 = v0;
                                                                try {
                                                                    v2 = this;
                                                                    v3 = this.s;
                                                                    v4 = var8_8 != 0 ? 1.0f : 0.0f;
                                                                }
                                                                catch (MatchException v5) {
                                                                    throw pulsescanner.c.e.a(v5);
                                                                }
                                                                try {
                                                                    try {
                                                                        v2.s = pulsescanner.j.a.a(v3, v4, 16.0f);
                                                                        pulsescanner.c.c.a(var1_1, var5_4, var6_6, 150.0f, var7_7, var7_7 / 2.0f);
                                                                        v6 = this.s;
                                                                        if (!var4_5) break block46;
                                                                        if (!(v6 > 0.01f)) break block47;
                                                                    }
                                                                    catch (MatchException v7) {
                                                                        throw pulsescanner.c.e.a(v7);
                                                                    }
                                                                    pulsescanner.g.b.a(var1_1, var5_4, var6_6, 150.0f, var7_7, var7_7 / 2.0f, pulsescanner.c.c.a(), pulsescanner.g.b.a(0x66FFFFFF, this.s));
                                                                }
                                                                catch (MatchException v8) {
                                                                    throw pulsescanner.c.e.a(v8);
                                                                }
                                                            }
                                                            v6 = var5_4 + 12.0f;
                                                        }
                                                        var9_9 = v6;
                                                        var10_10 = var6_6 + var7_7 / 2.0f - 0.5f;
                                                        try {
                                                            v9 = var1_1;
                                                            v10 = var9_9 - 0.8f;
                                                            v11 = var10_10 - 0.8f;
                                                            v12 = 3.2f;
                                                            v13 = 0.9f;
                                                            v14 = var8_8;
                                                            if (!var4_5) break block48;
                                                            if (v14 == 0) break block49;
                                                        }
                                                        catch (MatchException v15) {
                                                            throw pulsescanner.c.e.a(v15);
                                                        }
                                                        v14 = -592136;
                                                        break block48;
                                                    }
                                                    v14 = -6645085;
                                                }
                                                try {
                                                    pulsescanner.g.b.b(v9, v10, v11, v12, v13, v14);
                                                    v16 = var1_1;
                                                    v17 = var9_9 + 1.5f;
                                                    v18 = var10_10 + 1.5f;
                                                    v19 = var9_9 + 3.6f;
                                                    v20 = var10_10 + 3.6f;
                                                    v21 = 1.0f;
                                                    v22 = var8_8;
                                                    if (!var4_5) break block50;
                                                    if (v22 == 0) break block51;
                                                }
                                                catch (MatchException v23) {
                                                    throw pulsescanner.c.e.a(v23);
                                                }
                                                v22 = -592136;
                                                break block50;
                                            }
                                            v22 = -6645085;
                                        }
                                        pulsescanner.g.b.b(v16, v17, v18, v19, v20, v21, v22);
                                        var11_11 = var5_4 + 21.0f;
                                        var12_12 = var6_6 + (var7_7 - 8.0f) / 2.0f + 0.5f;
                                        var13_13 = 113.0f;
                                        if (var8_8 == 0) ** GOTO lbl140
                                        var14_14 = this.q;
                                        while ((float)pulsescanner.g.e.a(var14_14) > var13_13) {
                                            try {
                                                try {
                                                    v24 = var14_14.length();
                                                    if (!var4_5 || !var4_5) break block52;
                                                }
                                                catch (MatchException v25) {
                                                    throw pulsescanner.c.e.a(v25);
                                                }
                                                if (v24 <= 1) break;
                                            }
                                            catch (MatchException v26) {
                                                throw pulsescanner.c.e.a(v26);
                                            }
                                            var14_14 = var14_14.substring(1);
                                            if (var4_5) continue;
                                        }
                                        try {
                                            v27 = var1_1;
                                            if (!var4_5) break block53;
                                            pulsescanner.g.e.a(v27, var14_14, var11_11, var12_12, -592136);
                                            cfr_temp_0 = System.currentTimeMillis() / 500L % 2L - 0L;
                                            v24 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                        }
                                        catch (MatchException v28) {
                                            throw pulsescanner.c.e.a(v28);
                                        }
                                    }
                                    if (v24 != 0) break block60;
                                    v27 = var1_1;
                                }
                                pulsescanner.g.b.a(v27, var11_11 + (float)pulsescanner.g.e.a(var14_14) + 1.0f, var6_6 + 4.5f, 0.8f, var7_7 - 9.0f, -855638017);
                            }
                            var15_16 = var5_4 + 150.0f - 10.0f;
                            var16_18 = var6_6 + var7_7 / 2.0f;
                            try {
                                v29 = this;
                                v30 = this.t;
                                v31 = pulsescanner.c.c.a(var2_2, (double)var3_3, var15_16 - 6.0f, var16_18 - 6.0f, 12.0f, 12.0f) != false ? 1.0f : 0.0f;
                            }
                            catch (MatchException v32) {
                                throw pulsescanner.c.e.a(v32);
                            }
                            try {
                                try {
                                    v29.t = pulsescanner.j.a.a(v30, v31, 18.0f);
                                    if (!var4_5) break block54;
                                    if (!(this.t > 0.01f)) break block55;
                                }
                                catch (MatchException v33) {
                                    throw pulsescanner.c.e.a(v33);
                                }
                                pulsescanner.g.b.a(var1_1, var15_16, var16_18, 5.5f, pulsescanner.g.b.a(0x22FFFFFF, this.t));
                            }
                            catch (MatchException v34) {
                                throw pulsescanner.c.e.a(v34);
                            }
                        }
                        pulsescanner.g.b.b(var1_1, var15_16 - 2.2f, var16_18 - 2.2f, var15_16 + 2.2f, var16_18 + 2.2f, 0.9f, -6645085);
                        pulsescanner.g.b.b(var1_1, var15_16 - 2.2f, var16_18 + 2.2f, var15_16 + 2.2f, var16_18 - 2.2f, 0.9f, -6645085);
                    }
                    try {
                        if (var4_5) break block56;
lbl140:
                        // 2 sources

                        pulsescanner.g.e.a(var1_1, pulsescanner.c.e.v[2], var11_11, var12_12, -6645085);
                    }
                    catch (MatchException v35) {
                        throw pulsescanner.c.e.a(v35);
                    }
                }
                try {
                    v36 = var8_8;
                    if (!var4_5) break block57;
                    if (v36 == 0) break block58;
                }
                catch (MatchException v37) {
                    throw pulsescanner.c.e.a(v37);
                }
                v36 = 0;
            }
            var14_15 = v36;
            for (a var16_19 : pulsescanner.c.e.a) {
                block59: {
                    try {
                        try {
                            if (!var4_5) break block59;
                            if (!var4_5) break block58;
                        }
                        catch (MatchException v38) {
                            throw pulsescanner.c.e.a(v38);
                        }
                        if (!var16_19.q.isEmpty()) {
                        }
                        ** GOTO lbl172
                    }
                    catch (MatchException v39) {
                        throw pulsescanner.c.e.a(v39);
                    }
                    var14_15 = 1;
                }
                try {
                    if (var4_5) break;
lbl172:
                    // 2 sources

                    if (var4_5) continue;
                    break;
                }
                catch (MatchException v40) {
                    throw pulsescanner.c.e.a(v40);
                }
            }
            if (var14_15 == 0) {
                var15_17 = pulsescanner.c.e.v[1] + this.q + "\"";
                var16_20 = pulsescanner.g.e.a(var15_17) + 16;
                pulsescanner.c.c.a(var1_1, this.c() / 2.0f - var16_20 / 2.0f, this.d() / 2.0f - 9.0f, var16_20, 18.0f, 9.0f);
                pulsescanner.g.e.a(var1_1, var15_17, this.c() / 2.0f - var16_20 / 2.0f + 8.0f, this.d() / 2.0f - 3.5f, -2829095);
            }
        }
    }

    private void a(class_332 class_3322, int n2, int n3, a a2) {
        block22: {
            float f2;
            float f3;
            String string;
            block21: {
                i i2;
                block20: {
                    block19: {
                        block18: {
                            i i3;
                            try {
                                i3 = a2 != null ? a2.c(n2, n3) : null;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            i2 = i3;
                            try {
                                if (i2 == this.f) break block18;
                                this.f = i2;
                                this.g = 0.0f;
                                break block19;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                        }
                        this.g += pulsescanner.j.a.b();
                    }
                    string = null;
                    try {
                        if (this.b == null || this.b.F == null) break block20;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    string = this.b.F;
                    break block21;
                }
                try {
                    if (i2 == null || !(this.g > 0.45f)) break block21;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                string = i2.c;
            }
            if (!((Boolean)pulsescanner.c.e.e().t.a()).booleanValue()) {
                string = null;
            }
            try {
                if (string != null) {
                    this.i = string;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
            try {
                e e2 = this;
                f3 = this.h;
                f2 = string != null ? 1.0f : 0.0f;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
            try {
                try {
                    e2.h = pulsescanner.j.a.a(f3, f2, 16.0f);
                    if (!(this.h < 0.01f) && !this.i.isEmpty()) break block22;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        float f4 = pulsescanner.g.b.a;
        pulsescanner.g.b.a = f4 * this.h;
        float f5 = pulsescanner.g.e.a(this.i) + 16;
        float f6 = 16.0f;
        float f7 = this.c() / 2.0f - f5 / 2.0f;
        float f8 = this.i() - f6 - 6.0f + (1.0f - this.h) * 4.0f;
        pulsescanner.c.c.a(class_3322, f7, f8, f5, f6, f6 / 2.0f);
        pulsescanner.g.e.a(class_3322, this.i, f7 + 8.0f, f8 + 4.5f, -2829095);
        pulsescanner.g.b.a = f4;
    }

    private a a(double d2, double d3) {
        int n2 = a.size() - 1;
        while (true) {
            block7: {
                try {
                    try {
                        try {
                            if (n2 < 0) break;
                            if (!a.get(n2).a()) break block7;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        if (!a.get(n2).b(d2, d3)) break block7;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    return a.get(n2);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
            }
            --n2;
        }
        return null;
    }

    private void a(a a2, i i2) {
        block4: {
            try {
                try {
                    if (this.b == null || this.b.i != i2) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                this.j();
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        this.j();
        this.b = new b(i2, a2, Math.max(0, a2.q.indexOf(i2)));
    }

    public void b(i i2) {
        a a2 = pulsescanner.c.e.a(i2);
        try {
            if (a2 == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        a2.l = false;
        a2.m = 1.0f;
        this.a(a2);
        this.a(a2, i2);
    }

    private void j() {
        try {
            if (this.b == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        this.b.t = true;
        this.b.D = null;
        this.b.E = null;
        this.b.c();
        this.c = this.b;
        this.b = null;
    }

    private void a(a a2) {
        a.remove(a2);
        a.add(a2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean method_25402(class_11909 class_119092, boolean bl) {
        int n2;
        double d2;
        double d3;
        block75: {
            block74: {
                block73: {
                    block71: {
                        block72: {
                            try {
                                if (this.e) {
                                    return true;
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            d3 = class_119092.comp_4798() / (double)pulsescanner.c.e.b();
                            d2 = class_119092.comp_4799() / (double)pulsescanner.c.e.b();
                            n2 = class_119092.method_74245();
                            try {
                                if (this.b == null) break block71;
                                if (this.b.D == null) break block72;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            pulsescanner.i.e e2 = this.b.D;
                            if (e2 instanceof av) {
                                av av2 = (av)e2;
                                av2.a(n2);
                            }
                            this.b.D = null;
                            return true;
                        }
                        try {
                            try {
                                if (!this.b.a(d3, d2, n2)) break block71;
                                if (!this.b.G) return true;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            this.j();
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n2 != 0 || this.q.isEmpty()) break block73;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            if (!pulsescanner.c.c.a(d3, d2, this.f() + 150.0f - 16.0f, this.i(), 16.0f, 18.0f)) break block73;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        this.q = "";
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                }
                try {
                    if (pulsescanner.c.c.a(d3, d2, this.f(), this.i(), 150.0f, 18.0f)) {
                        return true;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                try {
                    try {
                        try {
                            if (n2 != 0 || !pulsescanner.c.c.a(d3, d2, this.g(), this.i(), 86.0f, 18.0f)) break block74;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        if (this.field_22787 == null) return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    this.field_22787.method_1507((class_437)new f(this));
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
            }
            try {
                try {
                    if (n2 != 0 || !pulsescanner.c.c.a(d3, d2, this.h(), this.i(), 82.0f, 18.0f)) break block75;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                this.a(true);
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        for (int i2 = a.size() - 1; i2 >= 0; --i2) {
            i i3;
            block85: {
                a a2;
                block83: {
                    block82: {
                        block76: {
                            block78: {
                                boolean bl2;
                                block80: {
                                    block79: {
                                        a2 = a.get(i2);
                                        try {
                                            if (!a2.a()) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.e.a(matchException);
                                        }
                                        try {
                                            try {
                                                block77: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (!a2.a(d3, d2)) break block76;
                                                                this.a(a2);
                                                                if (n2 == 1) break block77;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.c.e.a(matchException);
                                                            }
                                                            if (n2 != 0) break block78;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.c.e.a(matchException);
                                                        }
                                                        if (!(d3 > (double)(a2.h + 132.0f - 24.0f))) break block78;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.e.a(matchException);
                                                    }
                                                }
                                                a a3 = a2;
                                                if (a2.l) break block79;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.e.a(matchException);
                                            }
                                            bl2 = true;
                                            break block80;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.e.a(matchException);
                                        }
                                    }
                                    bl2 = false;
                                }
                                try {
                                    try {
                                        try {
                                            a3.l = bl2;
                                            if (this.b == null || !a2.e.contains(this.b.i)) return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.e.a(matchException);
                                        }
                                        if (!a2.l) return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.e.a(matchException);
                                    }
                                    this.j();
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.e.a(matchException);
                                }
                            }
                            try {
                                if (n2 != 0) return true;
                                a2.n = true;
                                a2.o = (float)(d3 - (double)a2.h);
                                a2.p = (float)(d2 - (double)a2.i);
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                        }
                        if (!a2.b(d3, d2)) continue;
                        this.a(a2);
                        i3 = a2.c(d3, d2);
                        try {
                            block81: {
                                try {
                                    try {
                                        try {
                                            if (i3 == null) return true;
                                            if (n2 == 1) break block81;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.e.a(matchException);
                                        }
                                        if (a2.d(d3, d2)) break block81;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.e.a(matchException);
                                    }
                                    if (i3.a()) break block82;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.e.a(matchException);
                                }
                            }
                            this.a(a2, i3);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (n2 != 0) break block83;
                            i3.d();
                            if (!((Boolean)pulsescanner.c.e.e().u.a()).booleanValue()) return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        pulsescanner.d.d.a(i3);
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                }
                try {
                    block84: {
                        try {
                            try {
                                if (n2 != 2) return true;
                                if (this.b == null) break block84;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                            if (this.b.i == i3) break block85;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                    }
                    this.a(a2, i3);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
            }
            try {
                if (this.b == null) return true;
                this.b.D = i3.f;
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        this.j();
        return true;
    }

    public boolean method_25406(class_11909 class_119092) {
        for (a a2 : a) {
            a2.n = false;
        }
        try {
            if (this.b != null) {
                this.b.c();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        return true;
    }

    public boolean method_25401(double d2, double d3, double d4, double d5) {
        block7: {
            double d6 = d2 / (double)pulsescanner.c.e.b();
            double d7 = d3 / (double)pulsescanner.c.e.b();
            try {
                try {
                    if (this.b == null || !this.b.a(d6, d7)) break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                this.b.a(d5);
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        float f2 = Float.MAX_VALUE;
        float f3 = -3.4028235E38f;
        for (a object : a) {
            f2 = Math.min(f2, object.i);
            f3 = Math.max(f3, object.i + object.c());
        }
        float f4 = (float)d5 * 14.0f;
        f4 = f4 < 0.0f ? Math.max(f4, Math.min(0.0f, this.d() - 8.0f - f3)) : Math.min(f4, Math.max(0.0f, 12.0f - f2));
        if (f4 != 0.0f) {
            for (a a2 : a) {
                a2.i += f4;
                a2.k += f4;
            }
        }
        return true;
    }

    public boolean method_25404(class_11908 class_119082) {
        block49: {
            int n2;
            block48: {
                block45: {
                    String string;
                    boolean bl;
                    boolean bl2;
                    block47: {
                        block46: {
                            block41: {
                                block43: {
                                    block44: {
                                        block42: {
                                            block38: {
                                                boolean bl3;
                                                block40: {
                                                    block39: {
                                                        n2 = class_119082.comp_4795();
                                                        try {
                                                            try {
                                                                this.r = false;
                                                                if (this.b == null) break block38;
                                                                if (this.b.D == null) break block39;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.c.e.a(matchException);
                                                            }
                                                            bl3 = true;
                                                            break block40;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.c.e.a(matchException);
                                                        }
                                                    }
                                                    bl3 = false;
                                                }
                                                bl2 = bl3;
                                                try {
                                                    if (this.b.b(n2)) {
                                                        this.r = bl2;
                                                        return true;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.e.a(matchException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (n2 != 256) break block41;
                                                    if (this.b == null) break block42;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.e.a(matchException);
                                                }
                                                this.j();
                                                break block43;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.e.a(matchException);
                                            }
                                        }
                                        try {
                                            if (this.q.isEmpty()) break block44;
                                            this.q = "";
                                            break block43;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.c.e.a(matchException);
                                        }
                                    }
                                    this.method_25419();
                                }
                                return true;
                            }
                            try {
                                try {
                                    try {
                                        if (n2 != 259 || this.q.isEmpty()) break block45;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.e.a(matchException);
                                    }
                                    if ((class_119082.comp_4797() & 2) == 0) break block46;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.e.a(matchException);
                                }
                                bl = true;
                                break block47;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.e.a(matchException);
                            }
                        }
                        bl = false;
                    }
                    bl2 = bl;
                    try {
                        e e2 = this;
                        string = bl2 ? "" : this.q.substring(0, this.q.length() - 1);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    e2.q = string;
                    return true;
                }
                try {
                    try {
                        if (n2 != 257 && n2 != 335) break block48;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    if (this.q.isEmpty()) break block48;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                for (a a2 : a) {
                    try {
                        if (a2.q.isEmpty()) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    i i2 = a2.q.get(0);
                    try {
                        if (i2.a()) {
                            i2.e();
                            break;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    this.a(a2, i2);
                    break;
                }
                return true;
            }
            try {
                try {
                    try {
                        if (n2 != (Integer)pulsescanner.c.e.e().f.a() || n2 == -1) break block49;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    if (!this.q.isEmpty()) break block49;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                this.method_25419();
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        return super.method_25404(class_119082);
    }

    public boolean method_25400(class_11905 class_119052) {
        String string;
        block23: {
            block22: {
                block21: {
                    try {
                        if (this.r) {
                            this.r = false;
                            return true;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    try {
                        try {
                            if (this.b == null || this.b.D == null) break block21;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.e.a(matchException);
                        }
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                }
                try {
                    if (!class_119052.method_74227()) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                string = class_119052.method_74226();
                try {
                    try {
                        if (this.b == null || !this.b.a(string)) break block22;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.e.a(matchException);
                    }
                    return true;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
            }
            try {
                try {
                    if (!this.q.isEmpty() || !string.isBlank()) break block23;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.e.a(matchException);
                }
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.e.a(matchException);
            }
        }
        try {
            if (this.q.length() < 32) {
                this.q = this.q + string;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        return true;
    }

    public void method_25419() {
        try {
            if (this.e) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        this.e = true;
        this.j();
        pulsescanner.b.a.b();
    }

    public void method_25432() {
        pulsescanner.b.a.b();
    }

    private static String lambda$arrangePanels$1(a a2) {
        return a2.b.toLowerCase(Locale.ROOT);
    }

    private static int lambda$arrangePanels$0(a a2) {
        int n2;
        try {
            n2 = a2.f != null ? a2.f.ordinal() : Integer.MAX_VALUE;
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.e.a(matchException);
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[5];
                var3_1 = 0;
                var2_2 = "I(Q.tjOz<S3t8\u0012W2\u001d0~.iu8N}|+hz5\u001d\u007f\u0011M$M81>s9.X<c)t7s\u0013";
                var4_3 = "I(Q.tjOz<S3t8\u0012W2\u001d0~.iu8N}|+hz5\u001d\u007f\u0011M$M81>s9.X<c)t7s\u0013".length();
                var1_4 = 13;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 125;
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
                    var2_2 = "/\\8]\u001f[\u000b\t\b8]0MUf-9";
                    var4_3 = "/\\8]\u001f[\u000b\t\b8]0MUf-9".length();
                    var1_4 = 8;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 25;
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
                        v11 = 100;
                        break;
                    }
                    case 1: {
                        v11 = 32;
                        break;
                    }
                    case 2: {
                        v11 = 64;
                        break;
                    }
                    case 3: {
                        v11 = 32;
                        break;
                    }
                    case 4: {
                        v11 = 108;
                        break;
                    }
                    case 5: {
                        v11 = 55;
                        break;
                    }
                    default: {
                        v11 = 97;
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
        pulsescanner.c.e.v = var5;
        pulsescanner.c.e.v[2] = "CrackedByLorex";
        pulsescanner.c.e.a = new ArrayList<a>();
        pulsescanner.c.e.u = -1.0f;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

