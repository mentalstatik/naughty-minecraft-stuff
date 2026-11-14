/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2DoubleMap
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1320
 *  net.minecraft.class_1657
 *  net.minecraft.class_1690
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2399
 *  net.minecraft.class_243
 *  net.minecraft.class_2533
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_3481
 *  net.minecraft.class_3486
 *  net.minecraft.class_3532
 *  net.minecraft.class_3610
 *  net.minecraft.class_3611
 *  net.minecraft.class_5134
 *  net.minecraft.class_5635
 *  net.minecraft.class_6862
 *  net.minecraft.class_6880
 *  net.minecraft.class_746
 */
package pulsescanner.a;

import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1320;
import net.minecraft.class_1657;
import net.minecraft.class_1690;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import net.minecraft.class_5134;
import net.minecraft.class_5635;
import net.minecraft.class_6862;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import pulsescanner.a.a0;
import pulsescanner.a.ad;
import pulsescanner.a.as;

public class ao
implements ad {
    public class_243 b;
    public boolean c;
    public boolean d;
    private final Object2DoubleMap<class_6862<class_3611>> e;
    private final HashSet<class_6862<class_3611>> f;
    public boolean g;
    public boolean h;
    public class_238 i;
    public final class_1657 j;
    public class_243 k;
    public boolean l;
    public float m;
    public float n;
    public final a0 o;
    public float p;
    public int q;
    public boolean r;
    public boolean s;
    private int t = 0;
    public boolean u;
    public boolean v;

    private void a() {
        this.n = 0.0f;
    }

    private float b() {
        return 0.1f;
    }

    private boolean a(class_238 class_2382) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.j.method_73183().method_8587((class_1297)this.j, class_2382) || this.j.method_73183().method_22345(class_2382)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public class_2680 a(class_2338 class_23382) {
        return this.j.method_73183().method_8320(class_23382);
    }

    private boolean c() {
        boolean bl;
        class_238 class_2382 = this.i.method_1014(1.0);
        int n2 = class_3532.method_15357((double)class_2382.field_1323);
        int n3 = class_3532.method_15384((double)class_2382.field_1320);
        int n4 = class_3532.method_15357((double)class_2382.field_1321);
        int n5 = class_3532.method_15384((double)class_2382.field_1324);
        try {
            bl = !this.j.method_73183().method_33597(n2, n4, n3, n5);
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return bl;
    }

    private float d() {
        float f2;
        float f3 = 0.02f;
        try {
            f2 = this.o.b.comp_3165() ? f3 + 0.006f : f3;
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return f2;
    }

    private boolean a(class_2338 class_23382, class_2680 class_26802) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (!((Boolean)class_26802.method_11654((class_2769)class_2533.field_11631)).booleanValue()) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                class_2680 class_26803 = this.j.method_73183().method_8320(class_23382.method_10074());
                try {
                    try {
                        if (!class_26803.method_27852(class_2246.field_9983) || !((class_2350)class_26803.method_11654((class_2769)class_2399.field_11253)).equals((Object)class_26802.method_11654((class_2769)class_2533.field_11177))) break block7;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public class_2338 a(class_243 class_2432) {
        return new class_2338(class_3532.method_15357((double)class_2432.field_1352), class_3532.method_15357((double)class_2432.field_1351), class_3532.method_15357((double)class_2432.field_1350));
    }

    private boolean a(class_6862<class_3611> class_68622, double d2) {
        boolean bl;
        double d3;
        block13: {
            class_243 class_2432;
            block15: {
                block14: {
                    try {
                        if (this.c()) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    class_238 class_2382 = this.i.method_1011(0.001);
                    int n2 = class_3532.method_15357((double)class_2382.field_1323);
                    int n3 = class_3532.method_15384((double)class_2382.field_1320);
                    int n4 = class_3532.method_15357((double)class_2382.field_1322);
                    int n5 = class_3532.method_15384((double)class_2382.field_1325);
                    int n6 = class_3532.method_15357((double)class_2382.field_1321);
                    int n7 = class_3532.method_15384((double)class_2382.field_1324);
                    d3 = 0.0;
                    boolean bl2 = true;
                    bl = false;
                    class_2432 = class_243.field_1353;
                    int n8 = 0;
                    class_2338.class_2339 class_23392 = new class_2338.class_2339();
                    for (int i2 = n2; i2 < n3; ++i2) {
                        for (int i3 = n4; i3 < n5; ++i3) {
                            for (int i4 = n6; i4 < n7; ++i4) {
                                double d4;
                                class_23392.method_10103(i2, i3, i4);
                                class_3610 class_36102 = this.j.method_73183().method_8316((class_2338)class_23392);
                                if (!class_36102.method_15767(class_68622) || !((d4 = (double)((float)i3 + class_36102.method_15763((class_1922)this.j.method_73183(), (class_2338)class_23392))) >= class_2382.field_1322)) continue;
                                bl = true;
                                d3 = Math.max(d4 - class_2382.field_1322, d3);
                                if (!bl2) continue;
                                class_243 class_2433 = class_36102.method_15758((class_1922)this.j.method_73183(), (class_2338)class_23392);
                                if (d3 < 0.4) {
                                    class_2433 = class_2433.method_1021(d3);
                                }
                                class_2432 = class_2432.method_1019(class_2433);
                                ++n8;
                            }
                        }
                    }
                    try {
                        if (!(class_2432.method_1033() > 0.0)) break block13;
                        if (n8 <= 0) break block14;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    class_2432 = class_2432.method_1021(1.0 / (double)n8);
                }
                class_2432 = class_2432.method_1021(d2);
                try {
                    try {
                        if (!(Math.abs(this.k.field_1352) < 0.003) || !(Math.abs(this.k.field_1350) < 0.003)) break block15;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    if (!(class_2432.method_1033() < 0.0045)) break block15;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                class_2432 = class_2432.method_1029().method_1021(0.0045);
            }
            this.k = this.k.method_1019(class_2432);
        }
        this.e.put(class_68622, d3);
        return bl;
    }

    private double e() {
        return this.b.field_1351 + (double)this.j.method_5751();
    }

    private void f() {
        class_1690 class_16902;
        class_1297 class_12972;
        double d2;
        block10: {
            this.r = this.f.contains(class_3486.field_15517);
            this.f.clear();
            d2 = this.e() - 0.1111111119389534;
            class_12972 = this.j.method_5854();
            if (class_12972 instanceof class_1690) {
                class_16902 = (class_1690)class_12972;
                try {
                    try {
                        try {
                            if (class_16902.method_5869() || !(class_16902.method_5829().field_1325 >= d2)) break block10;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        if (!(class_16902.method_5829().field_1322 <= d2)) break block10;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
        }
        class_16902 = class_2338.method_49637((double)this.b.field_1352, (double)d2, (double)this.b.field_1350);
        class_12972 = this.j.method_73183().method_8316((class_2338)class_16902);
        double d3 = (float)class_16902.method_10264() + class_12972.method_15763((class_1922)this.j.method_73183(), (class_2338)class_16902);
        try {
            if (d3 > d2) {
                this.f.addAll(class_12972.method_40181().toList());
            }
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
    }

    private void b(class_243 class_2432) {
        block37: {
            double d2;
            class_243 class_2433;
            class_243 class_2434;
            class_243 class_2435;
            boolean bl;
            block39: {
                block38: {
                    boolean bl2;
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    class_243 class_2436;
                                    block32: {
                                        block31: {
                                            boolean bl3;
                                            boolean bl4;
                                            class_243 class_2437 = this.e(class_2432);
                                            class_2436 = this.d(class_2437);
                                            try {
                                                if (class_2436.method_1027() > 1.0E-7) {
                                                    this.b = this.b.method_1019(class_2436);
                                                    this.i = this.j.field_18065.method_30757(this.b);
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                            try {
                                                bl4 = !class_3532.method_20390((double)class_2432.field_1352, (double)class_2436.field_1352);
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                            bl2 = bl4;
                                            try {
                                                bl3 = !class_3532.method_20390((double)class_2432.field_1350, (double)class_2436.field_1350);
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                            bl = bl3;
                                            try {
                                                try {
                                                    if (bl2 || bl) break block31;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ao.a(matchException);
                                                }
                                                this.g = false;
                                                break block32;
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                        }
                                        this.g = true;
                                    }
                                    try {
                                        this.s = class_2432.field_1351 != class_2436.field_1351;
                                    }
                                    catch (MatchException matchException) {
                                        throw ao.a(matchException);
                                    }
                                    try {
                                        try {
                                            if (!this.s || !(class_2432.field_1351 < 0.0)) break block33;
                                        }
                                        catch (MatchException matchException) {
                                            throw ao.a(matchException);
                                        }
                                        this.v = true;
                                        break block34;
                                    }
                                    catch (MatchException matchException) {
                                        throw ao.a(matchException);
                                    }
                                }
                                this.v = false;
                            }
                            try {
                                if (!this.p()) {
                                    this.m();
                                }
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            try {
                                if (!this.v) break block35;
                                this.a();
                                break block36;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                        }
                        try {
                            if (class_2432.field_1351 < 0.0) {
                                this.n -= (float)class_2432.field_1351;
                            }
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                    }
                    class_2435 = this.k;
                    try {
                        try {
                            class_243 class_2438;
                            try {
                                if (!this.g && !this.s) break block37;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            ao ao2 = this;
                            class_2434 = class_2438;
                            class_2433 = class_2438;
                            if (!bl2) break block38;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        d2 = 0.0;
                        break block39;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                }
                d2 = class_2435.field_1352;
            }
            class_2434(d2, this.v ? 0.0 : class_2435.field_1351, bl ? 0.0 : class_2435.field_1350);
            ao2.k = class_2433;
        }
    }

    private boolean a(double d2, double d3, double d4) {
        return this.a(this.i.method_989(d2, d3, d4));
    }

    private float g() {
        return 0.42f * this.i() + this.j();
    }

    private void a(class_6862<class_3611> class_68622) {
        this.k = this.k.method_1031(0.0, (double)0.04f, 0.0);
    }

    protected boolean h() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.o.b.comp_3164() && !this.o.a) break block4;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private float i() {
        float f2;
        float f3 = 0.0f;
        class_2248 class_22482 = this.a(this.a(this.b)).method_26204();
        if (class_22482 != null) {
            f3 = class_22482.method_23350();
        }
        float f4 = 0.0f;
        class_2248 class_22483 = this.a(this.v()).method_26204();
        if (class_22483 != null) {
            f4 = class_22483.method_23350();
        }
        try {
            f2 = f3 == 1.0f ? f4 : f3;
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return f2;
    }

    private class_243 a(float f2, float f3) {
        float f4 = (float)((double)f2 * Math.PI / 180.0);
        float f5 = (float)((double)(-f3) * Math.PI / 180.0);
        float f6 = class_3532.method_15362((double)f5);
        float f7 = class_3532.method_15374((double)f5);
        float f8 = class_3532.method_15362((double)f4);
        float f9 = class_3532.method_15374((double)f4);
        return new class_243((double)(f7 * f8), (double)(-f9), (double)(f6 * f8));
    }

    private float j() {
        if (this.a((class_6880<class_1291>)class_1294.field_5913)) {
            class_1293 class_12932 = this.c((class_6880<class_1291>)class_1294.field_5913);
            return 0.1f * (float)(class_12932.method_5578() + 1);
        }
        return 0.0f;
    }

    public boolean k() {
        boolean bl;
        block7: {
            block8: {
                class_2680 class_26802;
                class_2338 class_23382;
                block6: {
                    class_23382 = this.a(this.b);
                    class_26802 = this.a(class_23382);
                    try {
                        if (!class_26802.method_26164(class_3481.field_22414)) break block6;
                        bl = true;
                        break block7;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                }
                try {
                    try {
                        if (!(class_26802.method_26204() instanceof class_2533) || !this.a(class_23382, class_26802)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean l() {
        return this.h;
    }

    private void m() {
        block7: {
            block6: {
                if (this.j.method_5854() instanceof class_1690) {
                    class_1690 class_16902 = (class_1690)this.j.method_5854();
                    try {
                        if (!class_16902.method_5869()) {
                            this.l = false;
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                }
                try {
                    if (!this.a((class_6862<class_3611>)class_3486.field_15517, 0.014)) break block6;
                    this.a();
                    this.l = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            this.l = false;
        }
    }

    public static ao a(int n2) {
        ao ao2 = ao.a(a0.a(ao.a.field_1724.field_3913.field_54155));
        try {
            for (int i2 = 0; i2 < n2; ++i2) {
                ao2.w();
            }
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return ao2;
    }

    private float a(float f2) {
        float f3;
        try {
            f3 = this.v ? this.b() * (0.21600002f / (f2 * f2 * f2)) : this.d();
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return f3;
    }

    public boolean a(class_6880<class_1291> class_68802) {
        boolean bl;
        block5: {
            block4: {
                class_1293 class_12932 = this.j.method_6112(class_68802);
                try {
                    try {
                        if (class_12932 == null || class_12932.method_5584() < this.t) break block4;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public double b(class_6880<class_1320> class_68802) {
        return this.j.method_6127().method_26852(class_68802);
    }

    private double b(class_6862<class_3611> class_68622) {
        return this.e.getDouble(class_68622);
    }

    public boolean n() {
        boolean bl;
        try {
            bl = this.e.getDouble((Object)class_3486.field_15518) > 0.0;
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return bl;
    }

    private class_243 o() {
        return this.a(this.m, this.p);
    }

    private boolean p() {
        return this.l;
    }

    public static ao a(a0 a02) {
        class_746 class_7462 = ao.a.field_1724;
        return new ao((class_1657)class_7462, a02, class_7462.method_73189(), class_7462.method_18798(), class_7462.method_5829(), class_7462.method_36454(), class_7462.method_36455(), class_7462.method_5624(), (float)class_7462.field_6017, class_7462.field_6228, class_7462.field_6282, class_7462.method_6128(), class_7462.method_24828(), class_7462.field_5976, class_7462.field_5992, class_7462.method_5799(), class_7462.method_5681(), class_7462.method_5869(), (Object2DoubleMap<class_6862<class_3611>>)new Object2DoubleArrayMap(class_7462.field_5964), new HashSet<class_6862<class_3611>>(class_7462.field_25599));
    }

    private class_243 c(class_243 class_2432) {
        double d2;
        double d3;
        double d4;
        block7: {
            try {
                if (!this.k()) {
                    return class_2432;
                }
            }
            catch (MatchException matchException) {
                throw ao.a(matchException);
            }
            this.a();
            d4 = class_3532.method_15350((double)class_2432.field_1352, (double)-0.15f, (double)0.15f);
            d3 = class_3532.method_15350((double)class_2432.field_1350, (double)-0.15f, (double)0.15f);
            d2 = Math.max(class_2432.field_1351, (double)-0.15f);
            try {
                try {
                    if (!(d2 < 0.0) || this.a(this.a(this.b)).method_27852(class_2246.field_16492)) break block7;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                if (!this.j.method_21754()) break block7;
            }
            catch (MatchException matchException) {
                throw ao.a(matchException);
            }
            d2 = 0.0;
        }
        return new class_243(d4, d2, d3);
    }

    public ao(class_1657 class_16572, a0 a02, class_243 class_2432, class_243 class_2433, class_238 class_2382, float f2, float f3, boolean bl, float f4, int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, Object2DoubleMap<class_6862<class_3611>> object2DoubleMap, HashSet<class_6862<class_3611>> hashSet) {
        this.j = class_16572;
        this.o = a02;
        this.b = class_2432;
        this.k = class_2433;
        this.i = class_2382;
        this.p = f2;
        this.m = f3;
        this.h = bl;
        this.n = f4;
        this.q = n2;
        this.c = bl2;
        this.d = bl3;
        this.v = bl4;
        this.g = bl5;
        this.s = bl6;
        this.l = bl7;
        this.u = bl8;
        this.r = bl9;
        this.e = object2DoubleMap;
        this.f = hashSet;
    }

    public boolean q() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r || !this.p()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void r() {
        block18: {
            block19: {
                block16: {
                    block17: {
                        try {
                            try {
                                try {
                                    try {
                                        if (!this.u) break block16;
                                        if (!this.l()) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw ao.a(matchException);
                                    }
                                    if (!this.p()) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw ao.a(matchException);
                                }
                                if (this.j.method_5765()) break block17;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            this.u = true;
                            break block18;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                    }
                    this.u = false;
                    break block18;
                }
                try {
                    try {
                        try {
                            try {
                                if (!this.l() || !this.q()) break block19;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            if (this.j.method_5765()) break block19;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        if (!this.j.method_73183().method_8316(this.a(this.b)).method_15767(class_3486.field_15517)) break block19;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    this.u = true;
                    break block18;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            this.u = false;
        }
    }

    private boolean s() {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (this.v) break block6;
                                if (!((double)this.n < 0.5)) break block7;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            if (this.j.method_73183().method_8587((class_1297)this.j, this.i.method_989(0.0, (double)this.n - 0.5, 0.0))) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private class_1293 c(class_6880<class_1291> class_68802) {
        class_1293 class_12932;
        block5: {
            block4: {
                class_1293 class_12933 = this.j.method_6112(class_68802);
                try {
                    try {
                        if (class_12933 == null || class_12933.method_5584() < this.t) break block4;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    class_12932 = class_12933;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            class_12932 = null;
        }
        return class_12932;
    }

    private double t() {
        double d2;
        try {
            d2 = (double)this.j.method_5751() < 0.4 ? 0.0 : 0.4;
        }
        catch (MatchException matchException) {
            throw ao.a(matchException);
        }
        return d2;
    }

    public void u() {
        this.k = this.k.method_1031(0.0, (double)this.g() - this.k.field_1351, 0.0);
        if (this.l()) {
            float f2 = (float)Math.toRadians(this.p);
            this.k = this.k.method_1031((double)(-class_3532.method_15374((double)f2)) * 0.2, 0.0, (double)class_3532.method_15362((double)f2) * 0.2);
        }
    }

    private class_2338 v() {
        return class_2338.method_49637((double)this.b.field_1352, (double)(this.i.field_1322 - 0.5000001), (double)this.b.field_1350);
    }

    public void w() {
        block38: {
            float f2;
            float f3;
            float f4;
            block48: {
                block40: {
                    block44: {
                        block46: {
                            double d2;
                            boolean bl;
                            double d3;
                            block50: {
                                block42: {
                                    block49: {
                                        block41: {
                                            block39: {
                                                try {
                                                    try {
                                                        ++this.t;
                                                        if (this.b.field_1351 <= -70.0) break block38;
                                                        this.o.a();
                                                        this.m();
                                                        this.f();
                                                        this.r();
                                                        if (this.q <= 0) break block39;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ao.a(matchException);
                                                    }
                                                    --this.q;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ao.a(matchException);
                                                }
                                            }
                                            this.c = this.o.b.comp_3163();
                                            double d4 = this.k.field_1352;
                                            double d5 = this.k.field_1351;
                                            double d6 = this.k.field_1350;
                                            if (Math.abs(this.k.field_1352) < 0.003) {
                                                d4 = 0.0;
                                            }
                                            if (Math.abs(this.k.field_1351) < 0.003) {
                                                d5 = 0.0;
                                            }
                                            if (Math.abs(this.k.field_1350) < 0.003) {
                                                d6 = 0.0;
                                            }
                                            try {
                                                if (this.v) {
                                                    this.d = false;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                            try {
                                                this.k = new class_243(d4, d5, d6);
                                                if (!this.c) break block40;
                                                if (!this.n()) break block41;
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                            d3 = this.b((class_6862<class_3611>)class_3486.field_15518);
                                            break block49;
                                        }
                                        d3 = this.b((class_6862<class_3611>)class_3486.field_15517);
                                    }
                                    try {
                                        if (!this.p() || !(d3 > 0.0)) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw ao.a(matchException);
                                    }
                                    bl = true;
                                    d2 = this.t();
                                    break block50;
                                }
                                bl = false;
                                d2 = this.t();
                            }
                            try {
                                try {
                                    block47: {
                                        try {
                                            try {
                                                try {
                                                    block45: {
                                                        try {
                                                            try {
                                                                try {
                                                                    block43: {
                                                                        try {
                                                                            try {
                                                                                if (!bl) break block43;
                                                                                if (!this.v) break block44;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ao.a(matchException);
                                                                            }
                                                                            if (d3 > d2) break block44;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ao.a(matchException);
                                                                        }
                                                                    }
                                                                    if (!this.n()) break block45;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ao.a(matchException);
                                                                }
                                                                if (!this.v) break block46;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ao.a(matchException);
                                                            }
                                                            if (d3 > d2) break block46;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ao.a(matchException);
                                                        }
                                                    }
                                                    if (this.v) break block47;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ao.a(matchException);
                                                }
                                                if (!bl) break block40;
                                            }
                                            catch (MatchException matchException) {
                                                throw ao.a(matchException);
                                            }
                                            if (!(d3 <= d2)) break block40;
                                        }
                                        catch (MatchException matchException) {
                                            throw ao.a(matchException);
                                        }
                                    }
                                    if (this.q != 0) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw ao.a(matchException);
                                }
                                this.u();
                                this.q = 10;
                                break block40;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                        }
                        this.a((class_6862<class_3611>)class_3486.field_15518);
                        break block40;
                    }
                    this.a((class_6862<class_3611>)class_3486.field_15517);
                }
                f4 = this.o.d * 0.98f;
                f3 = this.o.c * 0.98f;
                f2 = 0.0f;
                try {
                    try {
                        if (!this.a((class_6880<class_1291>)class_1294.field_5906) && !this.a((class_6880<class_1291>)class_1294.field_5902)) break block48;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    this.a();
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            this.f(new class_243((double)f4, (double)f2, (double)f3));
        }
    }

    private class_243 d(class_243 class_2432) {
        class_243 class_2433;
        block26: {
            class_243 class_2434;
            List list;
            class_238 class_2382;
            block28: {
                block27: {
                    boolean bl;
                    boolean bl2;
                    boolean bl3;
                    block25: {
                        block24: {
                            boolean bl4;
                            boolean bl5;
                            boolean bl6;
                            class_2382 = new class_238(-0.3, 0.0, -0.3, 0.3, 1.8, 0.3).method_997(this.b);
                            list = Collections.emptyList();
                            class_2433 = class_2432.method_1027() == 0.0 ? class_2432 : class_1297.method_20736((class_1297)this.j, (class_243)class_2432, (class_238)class_2382, (class_1937)this.j.method_73183(), list);
                            try {
                                bl6 = class_2432.field_1352 != class_2433.field_1352;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            bl3 = bl6;
                            try {
                                bl5 = class_2432.field_1351 != class_2433.field_1351;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            boolean bl7 = bl5;
                            try {
                                bl4 = class_2432.field_1350 != class_2433.field_1350;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            bl2 = bl4;
                            try {
                                block23: {
                                    try {
                                        try {
                                            if (this.v) break block23;
                                            if (!bl7) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw ao.a(matchException);
                                        }
                                        if (!(class_2432.field_1351 < 0.0)) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw ao.a(matchException);
                                    }
                                }
                                bl = true;
                                break block25;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                        }
                        bl = false;
                    }
                    boolean bl8 = bl;
                    try {
                        try {
                            try {
                                if (!(this.j.method_49476() > 0.0f) || !bl8) break block26;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            if (bl3) break block27;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        if (!bl2) break block26;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                }
                class_2434 = class_1297.method_20736((class_1297)this.j, (class_243)new class_243(class_2432.field_1352, (double)this.j.method_49476(), class_2432.field_1350), (class_238)class_2382, (class_1937)this.j.method_73183(), list);
                class_243 class_2435 = class_1297.method_20736((class_1297)this.j, (class_243)new class_243(0.0, (double)this.j.method_49476(), 0.0), (class_238)class_2382.method_1012(class_2432.field_1352, 0.0, class_2432.field_1350), (class_1937)this.j.method_73183(), list);
                class_243 class_2436 = class_1297.method_20736((class_1297)this.j, (class_243)new class_243(class_2432.field_1352, 0.0, class_2432.field_1350), (class_238)class_2382.method_997(class_2435), (class_1937)this.j.method_73183(), list).method_1019(class_2435);
                try {
                    if (!(class_2435.field_1351 < (double)this.j.method_49476()) || !(class_2436.method_37268() > class_2434.method_37268())) break block28;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                class_2434 = class_2436;
            }
            try {
                if (class_2434.method_37268() > class_2433.method_37268()) {
                    return class_2434.method_1019(class_1297.method_20736((class_1297)this.j, (class_243)new class_243(0.0, -class_2434.field_1351 + class_2432.field_1351, 0.0), (class_238)class_2382.method_997(class_2434), (class_1937)this.j.method_73183(), list));
                }
            }
            catch (MatchException matchException) {
                throw ao.a(matchException);
            }
        }
        return class_2433;
    }

    private class_243 e(class_243 class_2432) {
        block37: {
            try {
                if (!(class_2432.field_1351 <= 0.0) || !this.s()) break block37;
            }
            catch (MatchException matchException) {
                throw ao.a(matchException);
            }
            double d2 = class_2432.field_1352;
            double d3 = class_2432.field_1350;
            double d4 = 0.05;
            while (true) {
                double d5;
                double d6;
                block38: {
                    try {
                        try {
                            try {
                                if (d2 == 0.0 || !this.j.method_73183().method_8587((class_1297)this.j, this.i.method_989(d2, -0.5, 0.0))) break;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            if (!(d2 < d4)) break block38;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        if (!(d2 >= -d4)) break block38;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    d2 = 0.0;
                    break;
                }
                try {
                    d6 = d2;
                    d5 = d2 > 0.0 ? -d4 : d4;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                d2 = d6 + d5;
            }
            while (true) {
                double d7;
                double d8;
                block39: {
                    try {
                        try {
                            try {
                                if (d3 == 0.0 || !this.j.method_73183().method_8587((class_1297)this.j, this.i.method_989(0.0, -0.5, d3))) break;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            if (!(d3 < d4)) break block39;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        if (!(d3 >= -d4)) break block39;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    d3 = 0.0;
                    break;
                }
                try {
                    d8 = d3;
                    d7 = d3 > 0.0 ? -d4 : d4;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                d3 = d8 + d7;
            }
            while (true) {
                double d9;
                double d10;
                block41: {
                    block42: {
                        block40: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (d2 == 0.0 || d3 == 0.0) break;
                                        }
                                        catch (MatchException matchException) {
                                            throw ao.a(matchException);
                                        }
                                        if (!this.j.method_73183().method_8587((class_1297)this.j, this.i.method_989(d2, -0.5, d3))) break;
                                    }
                                    catch (MatchException matchException) {
                                        throw ao.a(matchException);
                                    }
                                    if (!(d2 < d4)) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw ao.a(matchException);
                                }
                                if (!(d2 >= -d4)) break block40;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            d2 = 0.0;
                            break block42;
                        }
                        d2 = d2 > 0.0 ? (d2 -= d4) : (d2 += d4);
                    }
                    try {
                        if (!(d3 < d4) || !(d3 >= -d4)) break block41;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    d3 = 0.0;
                    break;
                }
                try {
                    d10 = d3;
                    d9 = d3 > 0.0 ? -d4 : d4;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
                d3 = d10 + d9;
            }
            try {
                if (class_2432.field_1352 == d2 && class_2432.field_1350 != d3) {
                    // empty if block
                }
            }
            catch (MatchException matchException) {
                throw ao.a(matchException);
            }
            if (this.h()) {
                class_2432 = new class_243(d2, class_2432.field_1351, d3);
            }
        }
        return class_2432;
    }

    /*
     * Unable to fully structure code
     */
    private void f(class_243 var1_1) {
        block213: {
            block214: {
                block212: {
                    block186: {
                        block210: {
                            block209: {
                                block205: {
                                    block207: {
                                        block206: {
                                            block208: {
                                                block204: {
                                                    block218: {
                                                        block217: {
                                                            block196: {
                                                                block201: {
                                                                    block203: {
                                                                        block202: {
                                                                            block200: {
                                                                                block197: {
                                                                                    block198: {
                                                                                        block187: {
                                                                                            block194: {
                                                                                                block195: {
                                                                                                    block193: {
                                                                                                        block191: {
                                                                                                            block192: {
                                                                                                                block190: {
                                                                                                                    block188: {
                                                                                                                        block174: {
                                                                                                                            block184: {
                                                                                                                                block185: {
                                                                                                                                    block183: {
                                                                                                                                        block182: {
                                                                                                                                            block180: {
                                                                                                                                                block181: {
                                                                                                                                                    block179: {
                                                                                                                                                        block177: {
                                                                                                                                                            block178: {
                                                                                                                                                                block175: {
                                                                                                                                                                    block176: {
                                                                                                                                                                        block216: {
                                                                                                                                                                            block215: {
                                                                                                                                                                                block172: {
                                                                                                                                                                                    block173: {
                                                                                                                                                                                        block170: {
                                                                                                                                                                                            block171: {
                                                                                                                                                                                                block169: {
                                                                                                                                                                                                    block162: {
                                                                                                                                                                                                        block163: {
                                                                                                                                                                                                            block167: {
                                                                                                                                                                                                                block166: {
                                                                                                                                                                                                                    block165: {
                                                                                                                                                                                                                        block164: {
                                                                                                                                                                                                                            var2_2 = as.r();
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v0 = this;
                                                                                                                                                                                                                                        if (var2_2 == 0) break block162;
                                                                                                                                                                                                                                        if (!v0.u) break block163;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (MatchException v1) {
                                                                                                                                                                                                                                        throw ao.a(v1);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v0 = this;
                                                                                                                                                                                                                                    if (var2_2 == 0) break block162;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (MatchException v2) {
                                                                                                                                                                                                                                    throw ao.a(v2);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (v0.j.method_5765()) break block163;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v3) {
                                                                                                                                                                                                                                throw ao.a(v3);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var3_3 = this.o().field_1351;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v4 = var3_3;
                                                                                                                                                                                                                                if (var2_2 == 0) break block164;
                                                                                                                                                                                                                                if (v4 < -0.2) {
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ** GOTO lbl32
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v5) {
                                                                                                                                                                                                                                throw ao.a(v5);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var5_4 = 0.085;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                if (var2_2 != 0) break block165;
lbl32:
                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                v4 = 0.06;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v6) {
                                                                                                                                                                                                                                throw ao.a(v6);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var5_4 = v4;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var7_5 = new class_2338(class_3532.method_15357((double)this.b.field_1352), class_3532.method_15357((double)(this.b.field_1351 + 1.0 - 0.1)), class_3532.method_15357((double)this.b.field_1350));
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                cfr_temp_0 = var3_3 - 0.0;
                                                                                                                                                                                                                                v7 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                                                                                                                                                                if (var2_2 == 0) break block166;
                                                                                                                                                                                                                                if (v7 > 0) {
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ** GOTO lbl74
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v8) {
                                                                                                                                                                                                                                throw ao.a(v8);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v9 = this;
                                                                                                                                                                                                                            if (var2_2 == 0) break block167;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException v10) {
                                                                                                                                                                                                                            throw ao.a(v10);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v7 = (double)v9.o.b.comp_3163();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (MatchException v11) {
                                                                                                                                                                                                                        throw ao.a(v11);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    block168: {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                if (v7 != false) break block168;
                                                                                                                                                                                                                                v12 = this;
                                                                                                                                                                                                                                if (var2_2 == 0) break block169;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v13) {
                                                                                                                                                                                                                                throw ao.a(v13);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (v12.j.method_73183().method_8320(var7_5).method_26227().method_15769()) break block163;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException v14) {
                                                                                                                                                                                                                            throw ao.a(v14);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v9 = this;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (MatchException v15) {
                                                                                                                                                                                                                    throw ao.a(v15);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v9.k = this.k.method_1031(0.0, (var3_3 - this.k.field_1351) * var5_4, 0.0);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v0 = this;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var3_3 = v0.k.field_1351;
                                                                                                                                                                                                    var5_4 = 0.08;
                                                                                                                                                                                                    v12 = this;
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    cfr_temp_1 = v12.k.field_1351 - 0.0;
                                                                                                                                                                                                    v16 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                                                                                                                                    if (var2_2 == 0) break block170;
                                                                                                                                                                                                    if (v16 > 0) break block171;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v17) {
                                                                                                                                                                                                    throw ao.a(v17);
                                                                                                                                                                                                }
                                                                                                                                                                                                v16 = (double)true;
                                                                                                                                                                                                break block170;
                                                                                                                                                                                            }
                                                                                                                                                                                            v16 = (double)false;
                                                                                                                                                                                        }
                                                                                                                                                                                        var7_6 = v16;
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v18 = this;
                                                                                                                                                                                                    if (var2_2 == 0) break block172;
                                                                                                                                                                                                    if (!(v18.k.field_1351 <= 0.0)) break block173;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v19) {
                                                                                                                                                                                                    throw ao.a(v19);
                                                                                                                                                                                                }
                                                                                                                                                                                                v18 = this;
                                                                                                                                                                                                if (var2_2 == 0) break block172;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException v20) {
                                                                                                                                                                                                throw ao.a(v20);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!v18.a((class_6880<class_1291>)class_1294.field_5906)) break block173;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v21) {
                                                                                                                                                                                            throw ao.a(v21);
                                                                                                                                                                                        }
                                                                                                                                                                                        var5_4 = 0.01;
                                                                                                                                                                                        this.a();
                                                                                                                                                                                    }
                                                                                                                                                                                    v18 = this;
                                                                                                                                                                                }
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            if (var2_2 == 0) break block174;
                                                                                                                                                                                            if (v18.p()) {
                                                                                                                                                                                            }
                                                                                                                                                                                            ** GOTO lbl244
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v22) {
                                                                                                                                                                                            throw ao.a(v22);
                                                                                                                                                                                        }
                                                                                                                                                                                        v18 = this;
                                                                                                                                                                                        if (var2_2 == 0) break block174;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v23) {
                                                                                                                                                                                        throw ao.a(v23);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v18.j.method_29920()) {
                                                                                                                                                                                    }
                                                                                                                                                                                    ** GOTO lbl244
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v24) {
                                                                                                                                                                                    throw ao.a(v24);
                                                                                                                                                                                }
                                                                                                                                                                                var8_7 = this.b.field_1351;
                                                                                                                                                                                if (!this.l()) break block215;
                                                                                                                                                                                var10_10 = 0.9f;
                                                                                                                                                                                var11_11 = 0.02f;
                                                                                                                                                                                var12_14 = (float)this.b((class_6880<class_1320>)class_5134.field_51578);
                                                                                                                                                                                if (var2_2 != 0) break block216;
                                                                                                                                                                            }
                                                                                                                                                                            var10_10 = 0.8f;
                                                                                                                                                                            var11_11 = 0.02f;
                                                                                                                                                                            var12_14 = (float)this.b((class_6880<class_1320>)class_5134.field_51578);
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            v25 = this.v;
                                                                                                                                                                            if (var2_2 == 0) break block175;
                                                                                                                                                                            if (v25 != 0) break block176;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v26) {
                                                                                                                                                                            throw ao.a(v26);
                                                                                                                                                                        }
                                                                                                                                                                        var12_14 *= 0.5f;
                                                                                                                                                                    }
                                                                                                                                                                    v25 = (cfr_temp_2 = var12_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (var2_2 == 0) break block177;
                                                                                                                                                                    if (v25 <= 0) break block178;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v27) {
                                                                                                                                                                    throw ao.a(v27);
                                                                                                                                                                }
                                                                                                                                                                var10_10 += (0.54600006f - var10_10) * var12_14 / 3.0f;
                                                                                                                                                                var11_11 += (this.b() - var11_11) * var12_14 / 3.0f;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                v28 = this;
                                                                                                                                                                if (var2_2 == 0) break block179;
                                                                                                                                                                v25 = (int)v28.a((class_6880<class_1291>)class_1294.field_5900);
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v29) {
                                                                                                                                                                throw ao.a(v29);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (v25 != 0) {
                                                                                                                                                            var10_10 = 0.96f;
                                                                                                                                                        }
                                                                                                                                                        this.a(var11_11, var1_1);
                                                                                                                                                        this.b(this.k);
                                                                                                                                                        v28 = this;
                                                                                                                                                    }
                                                                                                                                                    var13_16 = v28.k;
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (var2_2 == 0) break block180;
                                                                                                                                                                if (!this.g) break block181;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v30) {
                                                                                                                                                                throw ao.a(v30);
                                                                                                                                                            }
                                                                                                                                                            v31 = this;
                                                                                                                                                            if (var2_2 == 0) break block182;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v32) {
                                                                                                                                                            throw ao.a(v32);
                                                                                                                                                        }
                                                                                                                                                        if (!v31.k()) break block181;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v33) {
                                                                                                                                                        throw ao.a(v33);
                                                                                                                                                    }
                                                                                                                                                    var13_16 = new class_243(var13_16.field_1352, 0.2, var13_16.field_1350);
                                                                                                                                                }
                                                                                                                                                this.k = var13_16.method_18805((double)var10_10, 0.8, (double)var10_10);
                                                                                                                                            }
                                                                                                                                            v31 = this;
                                                                                                                                        }
                                                                                                                                        var14_18 = v31.j.method_26317(var5_4, (boolean)var7_6, this.k);
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v34 = this;
                                                                                                                                                if (var2_2 == 0) break block183;
                                                                                                                                                v34.k = var14_18;
                                                                                                                                                if (!this.g) break block184;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v35) {
                                                                                                                                                throw ao.a(v35);
                                                                                                                                            }
                                                                                                                                            v34 = this;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v36) {
                                                                                                                                            throw ao.a(v36);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (var2_2 == 0) break block185;
                                                                                                                                            if (!v34.a(var14_18.field_1352, var14_18.field_1351 + 0.6 - this.b.field_1351 + var8_7, var14_18.field_1350)) break block184;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v37) {
                                                                                                                                            throw ao.a(v37);
                                                                                                                                        }
                                                                                                                                        v34 = this;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v38) {
                                                                                                                                        throw ao.a(v38);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v34.k = new class_243(var14_18.field_1352, 0.3, var14_18.field_1350);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (var2_2 != 0) break block186;
lbl244:
                                                                                                                                // 3 sources

                                                                                                                                v18 = this;
                                                                                                                            }
                                                                                                                            catch (MatchException v39) {
                                                                                                                                throw ao.a(v39);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var2_2 == 0) break block187;
                                                                                                                                    if (v18.n()) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl337
                                                                                                                                }
                                                                                                                                catch (MatchException v40) {
                                                                                                                                    throw ao.a(v40);
                                                                                                                                }
                                                                                                                                v18 = this;
                                                                                                                                if (var2_2 == 0) break block187;
                                                                                                                            }
                                                                                                                            catch (MatchException v41) {
                                                                                                                                throw ao.a(v41);
                                                                                                                            }
                                                                                                                            if (v18.j.method_29920()) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl337
                                                                                                                        }
                                                                                                                        catch (MatchException v42) {
                                                                                                                            throw ao.a(v42);
                                                                                                                        }
                                                                                                                        var8_7 = this.b.field_1351;
                                                                                                                        try {
                                                                                                                            block189: {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v43 = this;
                                                                                                                                        if (var2_2 == 0) break block188;
                                                                                                                                        v43.a(0.02f, var1_1);
                                                                                                                                        this.b(this.k);
                                                                                                                                        if (!(this.b((class_6862<class_3611>)class_3486.field_15518) <= this.t())) break block189;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v44) {
                                                                                                                                        throw ao.a(v44);
                                                                                                                                    }
                                                                                                                                    this.k = this.k.method_18805(0.5, 0.8, 0.5);
                                                                                                                                    this.k = this.j.method_26317(var5_4, (boolean)var7_6, this.k);
                                                                                                                                    if (var2_2 != 0) break block190;
                                                                                                                                }
                                                                                                                                catch (MatchException v45) {
                                                                                                                                    throw ao.a(v45);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v43 = this;
                                                                                                                        }
                                                                                                                        catch (MatchException v46) {
                                                                                                                            throw ao.a(v46);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v43.k = this.k.method_1021(0.5);
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v47 = this;
                                                                                                                        if (var2_2 == 0) break block191;
                                                                                                                        if (v47.j.method_5740()) break block192;
                                                                                                                    }
                                                                                                                    catch (MatchException v48) {
                                                                                                                        throw ao.a(v48);
                                                                                                                    }
                                                                                                                    this.k = this.k.method_1031(0.0, -var5_4 / 4.0, 0.0);
                                                                                                                }
                                                                                                                catch (MatchException v49) {
                                                                                                                    throw ao.a(v49);
                                                                                                                }
                                                                                                            }
                                                                                                            v47 = this;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var2_2 == 0) break block193;
                                                                                                                if (!v47.g) break block194;
                                                                                                            }
                                                                                                            catch (MatchException v50) {
                                                                                                                throw ao.a(v50);
                                                                                                            }
                                                                                                            v47 = this;
                                                                                                        }
                                                                                                        catch (MatchException v51) {
                                                                                                            throw ao.a(v51);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var2_2 == 0) break block195;
                                                                                                            if (!v47.a(this.k.field_1352, this.k.field_1351 + 0.6 - this.b.field_1351 + var8_7, this.k.field_1350)) break block194;
                                                                                                        }
                                                                                                        catch (MatchException v52) {
                                                                                                            throw ao.a(v52);
                                                                                                        }
                                                                                                        v47 = this;
                                                                                                    }
                                                                                                    catch (MatchException v53) {
                                                                                                        throw ao.a(v53);
                                                                                                    }
                                                                                                }
                                                                                                v47.k = new class_243(this.k.field_1352, 0.3, this.k.field_1350);
                                                                                            }
                                                                                            try {
                                                                                                if (var2_2 != 0) break block186;
lbl337:
                                                                                                // 3 sources

                                                                                                v18 = this;
                                                                                            }
                                                                                            catch (MatchException v54) {
                                                                                                throw ao.a(v54);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (var2_2 == 0) break block196;
                                                                                            if (v18.d) {
                                                                                            }
                                                                                            ** GOTO lbl426
                                                                                        }
                                                                                        catch (MatchException v55) {
                                                                                            throw ao.a(v55);
                                                                                        }
                                                                                        var8_8 = this.k;
                                                                                        try {
                                                                                            try {
                                                                                                v56 = var8_8;
                                                                                                if (var2_2 == 0) break block197;
                                                                                                if (!(v56.field_1351 > -0.5)) break block198;
                                                                                            }
                                                                                            catch (MatchException v57) {
                                                                                                throw ao.a(v57);
                                                                                            }
                                                                                            this.n = 1.0f;
                                                                                        }
                                                                                        catch (MatchException v58) {
                                                                                            throw ao.a(v58);
                                                                                        }
                                                                                    }
                                                                                    v56 = this.o();
                                                                                }
                                                                                var9_19 = v56;
                                                                                var10_10 = this.m * 0.017453292f;
                                                                                var11_12 = Math.sqrt(var9_19.field_1352 * var9_19.field_1352 + var9_19.field_1350 * var9_19.field_1350);
                                                                                var13_17 = this.k.method_37267();
                                                                                var15_21 = var9_19.method_1033();
                                                                                var17_22 = class_3532.method_15362((double)var10_10);
                                                                                v59 = (float)((double)var17_22 * (double)var17_22 * Math.min(1.0, var15_21 / 0.4));
                                                                                if (var2_2 != 0) {
                                                                                    block199: {
                                                                                        var17_22 = v59;
                                                                                        var8_8 = this.k.method_1031(0.0, var5_4 * (-1.0 + (double)var17_22 * 0.75), 0.0);
                                                                                        try {
                                                                                            try {
                                                                                                if (!(var8_8.field_1351 < 0.0)) break block199;
                                                                                                cfr_temp_3 = var11_12 - 0.0;
                                                                                                v60 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                                                                if (var2_2 == 0) break block200;
                                                                                            }
                                                                                            catch (MatchException v61) {
                                                                                                throw ao.a(v61);
                                                                                            }
                                                                                            if (v60 <= 0) break block199;
                                                                                        }
                                                                                        catch (MatchException v62) {
                                                                                            throw ao.a(v62);
                                                                                        }
                                                                                        var18_23 = var8_8.field_1351 * -0.1 * (double)var17_22;
                                                                                        var8_8 = var8_8.method_1031(var9_19.field_1352 * var18_23 / var11_12, var18_23, var9_19.field_1350 * var18_23 / var11_12);
                                                                                    }
                                                                                    v59 = var10_10;
                                                                                }
                                                                                v60 = (cfr_temp_4 = v59 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var2_2 == 0) break block201;
                                                                                        if (v60 >= 0) break block202;
                                                                                    }
                                                                                    catch (MatchException v63) {
                                                                                        throw ao.a(v63);
                                                                                    }
                                                                                    v64 = var11_12;
                                                                                    v65 = 0.0;
                                                                                    if (var2_2 == 0) break block203;
                                                                                }
                                                                                catch (MatchException v66) {
                                                                                    throw ao.a(v66);
                                                                                }
                                                                                if (!(v64 > v65)) break block202;
                                                                            }
                                                                            catch (MatchException v67) {
                                                                                throw ao.a(v67);
                                                                            }
                                                                            var18_23 = var13_17 * (double)(-class_3532.method_15374((double)var10_10)) * 0.04;
                                                                            var8_8 = var8_8.method_1031(-var9_19.field_1352 * var18_23 / var11_12, var18_23 * 3.2, -var9_19.field_1350 * var18_23 / var11_12);
                                                                        }
                                                                        v64 = var11_12;
                                                                        v65 = 0.0;
                                                                    }
                                                                    v60 = (cfr_temp_5 = v64 - v65) == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                                }
                                                                if (v60 > 0) {
                                                                    var8_8 = var8_8.method_1031((var9_19.field_1352 / var11_12 * var13_17 - var8_8.field_1352) * 0.1, 0.0, (var9_19.field_1350 / var11_12 * var13_17 - var8_8.field_1350) * 0.1);
                                                                }
                                                                try {
                                                                    this.k = var8_8.method_18805(0.99, 0.98, 0.99);
                                                                    this.b(this.k);
                                                                    if (var2_2 != 0) break block186;
lbl426:
                                                                    // 2 sources

                                                                    v18 = this;
                                                                }
                                                                catch (MatchException v68) {
                                                                    throw ao.a(v68);
                                                                }
                                                            }
                                                            var8_9 = v18.v();
                                                            var9_20 = this.j.method_73183().method_8320(var8_9).method_26204().method_9499();
                                                            if (!this.v) break block217;
                                                            var10_10 = var9_20 * 0.91f;
                                                            var11_13 = this.a(var1_1, var9_20);
                                                            var12_15 = var11_13.field_1351;
                                                            if (var2_2 != 0) break block218;
                                                        }
                                                        var10_10 = 0.91f;
                                                        var11_13 = this.a(var1_1, var9_20);
                                                        var12_15 = var11_13.field_1351;
                                                    }
                                                    try {
                                                        v69 = this;
                                                        if (var2_2 == 0) break block204;
                                                        if (v69.a((class_6880<class_1291>)class_1294.field_5902)) {
                                                        }
                                                        ** GOTO lbl456
                                                    }
                                                    catch (MatchException v70) {
                                                        throw ao.a(v70);
                                                    }
                                                    var14_18 = this.c((class_6880<class_1291>)class_1294.field_5902);
                                                    if (var14_18 != null) {
                                                        var12_15 += (0.05 * (double)(var14_18.method_5578() + 1) - var11_13.field_1351) * 0.2;
                                                    }
                                                    try {
                                                        if (var2_2 != 0) break block205;
lbl456:
                                                        // 2 sources

                                                        v69 = this;
                                                    }
                                                    catch (MatchException v71) {
                                                        throw ao.a(v71);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var2_2 == 0) break block206;
                                                                    if (v69.j.method_73183().method_8608()) {
                                                                    }
                                                                    ** GOTO lbl503
                                                                }
                                                                catch (MatchException v72) {
                                                                    throw ao.a(v72);
                                                                }
                                                                v73 = this.j;
                                                                if (var2_2 == 0) break block207;
                                                            }
                                                            catch (MatchException v74) {
                                                                throw ao.a(v74);
                                                            }
                                                            if (!v73.method_73183().method_22340(var8_9)) {
                                                            }
                                                            ** GOTO lbl503
                                                        }
                                                        catch (MatchException v75) {
                                                            throw ao.a(v75);
                                                        }
                                                        v76 = this.b.field_1351;
                                                        if (var2_2 == 0) break block208;
                                                    }
                                                    catch (MatchException v77) {
                                                        throw ao.a(v77);
                                                    }
                                                    if (v76 > (double)this.j.method_73183().method_31607()) {
                                                    }
                                                    ** GOTO lbl495
                                                }
                                                catch (MatchException v78) {
                                                    throw ao.a(v78);
                                                }
                                                var12_15 = -0.1;
                                                try {
                                                    if (var2_2 != 0) break block205;
lbl495:
                                                    // 2 sources

                                                    v76 = 0.0;
                                                }
                                                catch (MatchException v79) {
                                                    throw ao.a(v79);
                                                }
                                            }
                                            var12_15 = v76;
                                            try {
                                                if (var2_2 != 0) break block205;
lbl503:
                                                // 3 sources

                                                v69 = this;
                                            }
                                            catch (MatchException v80) {
                                                throw ao.a(v80);
                                            }
                                        }
                                        try {
                                            if (var2_2 == 0) break block209;
                                            v73 = v69.j;
                                        }
                                        catch (MatchException v81) {
                                            throw ao.a(v81);
                                        }
                                    }
                                    if (!v73.method_5740()) {
                                        var12_15 -= var5_4;
                                    }
                                }
                                v69 = this;
                            }
                            try {
                                block211: {
                                    try {
                                        try {
                                            if (var2_2 == 0) break block210;
                                            if (!v69.j.method_35053()) break block211;
                                        }
                                        catch (MatchException v82) {
                                            throw ao.a(v82);
                                        }
                                        this.k = new class_243(var11_13.field_1352, var12_15, var11_13.field_1350);
                                        if (var2_2 != 0) break block186;
                                    }
                                    catch (MatchException v83) {
                                        throw ao.a(v83);
                                    }
                                }
                                v69 = this;
                            }
                            catch (MatchException v84) {
                                throw ao.a(v84);
                            }
                        }
                        v69.k = new class_243(var11_13.field_1352 * (double)var10_10, var12_15 * 0.9800000190734863, var11_13.field_1350 * (double)var10_10);
                    }
                    try {
                        try {
                            try {
                                v85 = this.j;
                                if (var2_2 == 0) break block212;
                                if (!v85.method_31549().field_7479) break block213;
                            }
                            catch (MatchException v86) {
                                throw ao.a(v86);
                            }
                            v87 = this;
                            if (var2_2 == 0) break block214;
                        }
                        catch (MatchException v88) {
                            throw ao.a(v88);
                        }
                        v85 = v87.j;
                    }
                    catch (MatchException v89) {
                        throw ao.a(v89);
                    }
                }
                try {
                    if (v85.method_5765()) break block213;
                    this.k = new class_243(this.k.field_1352, var3_3 * 0.6, this.k.field_1350);
                    v87 = this;
                }
                catch (MatchException v90) {
                    throw ao.a(v90);
                }
            }
            v87.a();
        }
    }

    private void a(float f2, class_243 class_2432) {
        class_243 class_2433 = class_1297.method_18795((class_243)class_2432, (float)f2, (float)this.p);
        this.k = this.k.method_1019(class_2433);
    }

    private class_243 a(class_243 class_2432, float f2) {
        class_243 class_2433;
        block10: {
            block11: {
                this.a(this.a(f2), class_2432);
                this.k = this.c(this.k);
                this.b(this.k);
                class_2433 = this.k;
                class_2338 class_23382 = this.a(this.b);
                class_2680 class_26802 = this.a(class_23382);
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!this.g && !this.c) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw ao.a(matchException);
                                }
                                if (this.k()) break block11;
                            }
                            catch (MatchException matchException) {
                                throw ao.a(matchException);
                            }
                            if (class_26802 == null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw ao.a(matchException);
                        }
                        if (!class_26802.method_27852(class_2246.field_27879)) break block10;
                    }
                    catch (MatchException matchException) {
                        throw ao.a(matchException);
                    }
                    if (!class_5635.method_32355((class_1297)this.j)) break block10;
                }
                catch (MatchException matchException) {
                    throw ao.a(matchException);
                }
            }
            class_2433 = new class_243(class_2433.field_1352, 0.2, class_2433.field_1350);
        }
        return class_2433;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

