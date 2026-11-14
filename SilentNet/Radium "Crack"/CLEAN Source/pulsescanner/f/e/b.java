/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11907
 *  net.minecraft.class_11909
 *  net.minecraft.class_11910
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_9635
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1836
 *  net.minecraft.class_1887
 *  net.minecraft.class_1937
 *  net.minecraft.class_2480
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_364
 *  net.minecraft.class_4069
 *  net.minecraft.class_4264
 *  net.minecraft.class_437
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_7923
 *  net.minecraft.class_7924
 *  net.minecraft.class_9288
 *  net.minecraft.class_9304
 *  net.minecraft.class_9334
 */
package pulsescanner.f.e;

import java.net.http.HttpClient;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_11907;
import net.minecraft.class_11909;
import net.minecraft.class_11910;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1836;
import net.minecraft.class_1887;
import net.minecraft.class_1937;
import net.minecraft.class_2480;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_364;
import net.minecraft.class_4069;
import net.minecraft.class_4264;
import net.minecraft.class_437;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.minecraft.class_7924;
import net.minecraft.class_9288;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import pulsescanner.f.e.f;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.g;
import pulsescanner.mixin.ClientPlayerInteractionManagerAccessor;

public class b
extends i {
    private static final int l = 45;
    private static final int m = 49;
    private static final int n = 20;
    private static final int o = 2;
    private static final int p = 2200;
    private static final Pattern[] q;
    private static final Pattern r;
    private static final String s;
    public final pulsescanner.i.f t;
    public final c u;
    public final g v;
    public final c w;
    public final c x;
    public final c y;
    public final g z;
    public final g A;
    public final pulsescanner.i.h B;
    public final pulsescanner.i.h C;
    public final pulsescanner.i.h D;
    public final pulsescanner.i.h E;
    public final pulsescanner.i.f F;
    public final c G;
    public final pulsescanner.i.h H;
    public final c I;
    private final pulsescanner.i.h[] J;
    private final pulsescanner.i.h[] K;
    private final pulsescanner.i.h[] L;
    private final pulsescanner.i.f[] M;
    private final pulsescanner.i.h[] N;
    public final c O;
    public final pulsescanner.i.h P;
    public final c Q;
    public final pulsescanner.i.h R;
    public final c S;
    public final pulsescanner.i.h T;
    private final List<f> U;
    private final HttpClient V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private String ag;
    private String ah;
    private String ai;
    private double aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private class_1792 aw;
    private static boolean ax;
    private static final String[] cb;

    public b() {
        String[] stringArray;
        block3: {
            b b2;
            boolean bl = pulsescanner.f.e.b.H();
            stringArray = cb;
            super(stringArray[1], stringArray[161], pulsescanner.f.h.MISC);
            this.t = this.a(new pulsescanner.i.f(stringArray[86], stringArray[130], stringArray[6], stringArray[6], stringArray[112]));
            this.u = this.a(new c(stringArray[53], stringArray[141], true));
            this.v = (g)this.a(new g(stringArray[47], stringArray[69], 24.0, 1.0, 72.0, 1.0)).a(this.u::a);
            this.w = (c)this.a(new c(stringArray[87], stringArray[30], false)).a(this::o);
            this.x = this.a(new c(stringArray[118], stringArray[3], true));
            this.y = this.a(new c(stringArray[122], stringArray[102], true));
            this.z = this.a(new g(stringArray[103], stringArray[35], 15.0, 0.0, 53.0, 1.0));
            this.A = this.a(new g(stringArray[78], stringArray[120], 0.0, 0.0, 20.0, 1.0));
            boolean bl2 = bl;
            this.B = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[80], stringArray[127], "")).a(this::o);
            this.C = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[62], stringArray[164], "")).a(this::o);
            this.D = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[43], stringArray[83], "0")).a(this::o);
            this.E = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[126], stringArray[68], stringArray[14])).a(this::o);
            this.F = (pulsescanner.i.f)this.a(new pulsescanner.i.f(stringArray[99], stringArray[142], stringArray[5], stringArray[25], stringArray[5])).a(this::o);
            this.G = (c)this.a(new c(stringArray[45], stringArray[61], false)).a(this::o);
            this.H = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[54], stringArray[19], "")).a(this::lambda$new$0);
            this.I = (c)this.a(new c(stringArray[91], stringArray[65], false)).a(this::lambda$new$1);
            this.J = new pulsescanner.i.h[5];
            this.K = new pulsescanner.i.h[5];
            this.L = new pulsescanner.i.h[5];
            this.M = new pulsescanner.i.f[5];
            this.N = new pulsescanner.i.h[5];
            this.U = new ArrayList<f>();
            HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
            this.V = null;
            this.ag = "";
            this.ah = stringArray[111];
            this.ai = "";
            String[] stringArray2 = new String[]{stringArray[21], stringArray[100], stringArray[149], stringArray[134], stringArray[63]};
            for (int i2 = 0; i2 < 5; ++i2) {
                int n2 = i2;
                try {
                    this.J[i2] = (pulsescanner.i.h)this.a(new pulsescanner.i.h(cb[40] + (i2 + 1), stringArray2[i2] + cb[11], "")).a(this::lambda$new$2);
                    b2 = this;
                    if (!bl2) break block3;
                    b2.K[i2] = (pulsescanner.i.h)this.a(new pulsescanner.i.h(cb[101] + (i2 + 1), cb[58], "0")).a(() -> this.lambda$new$3(n2));
                    this.L[i2] = (pulsescanner.i.h)this.a(new pulsescanner.i.h(cb[60] + (i2 + 1), cb[94], cb[51])).a(() -> this.lambda$new$4(n2));
                    this.M[i2] = (pulsescanner.i.f)this.a(new pulsescanner.i.f(cb[26] + (i2 + 1), cb[48], cb[5], cb[25], cb[5])).a(() -> this.lambda$new$5(n2));
                    this.N[i2] = (pulsescanner.i.h)this.a(new pulsescanner.i.h(cb[95] + (i2 + 1), cb[110], "")).a(() -> this.lambda$new$6(n2));
                    if (bl2) continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                pulsescanner.f.i.b(new int[1]);
                break;
            }
            stringArray = cb;
            this.O = this.a(new c(stringArray[146], stringArray[162], false));
            this.P = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[128], stringArray[144], stringArray[153])).a(this.O::a);
            this.Q = this.a(new c(stringArray[123], stringArray[124], false));
            this.R = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[12], stringArray[143], "", 512)).a(this.Q::a);
            this.S = (c)this.a(new c(stringArray[84], stringArray[157], false)).a(this.Q::a);
            b2 = this;
        }
        stringArray = cb;
        b2.T = (pulsescanner.i.h)this.a(new pulsescanner.i.h(stringArray[89], stringArray[42], "")).a(this::lambda$new$7);
    }

    private boolean o() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.t != null && !this.t.a(cb[64])) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static class_1792 d(String string) {
        class_2960 class_29602;
        block9: {
            String string2;
            try {
                string2 = string == null ? "" : string.trim().toLowerCase(Locale.ROOT).replace(' ', '_');
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            String string3 = string2;
            try {
                if (string3.isEmpty()) {
                    return class_1802.field_8162;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            class_29602 = class_2960.method_12829((String)string3);
            try {
                try {
                    if (class_29602 != null && class_7923.field_41178.method_10250(class_29602)) break block9;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return class_1802.field_8162;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return (class_1792)class_7923.field_41178.method_63535(class_29602);
    }

    private static Set<class_5321<class_1887>> e(String string) {
        HashSet<class_5321<class_1887>> hashSet = new HashSet<class_5321<class_1887>>();
        try {
            if (string == null) {
                return hashSet;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        for (String string2 : string.split(cb[108])) {
            String string3 = string2.trim().toLowerCase(Locale.ROOT).replace(' ', '_');
            try {
                if (string3.isEmpty()) {
                    continue;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            class_2960 class_29602 = class_2960.method_12829((String)string3);
            try {
                if (class_29602 == null) continue;
                hashSet.add((class_5321<class_1887>)class_5321.method_29179((class_5321)class_7924.field_41265, (class_2960)class_29602));
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return hashSet;
    }

    private class_1792 p() {
        return pulsescanner.f.e.b.d((String)this.B.a());
    }

    @Override
    protected void g() {
        class_1792 class_17922;
        block23: {
            String string;
            b b2;
            block25: {
                block24: {
                    try {
                        if (pulsescanner.f.e.b.a.field_1724 == null) {
                            this.c(cb[38]);
                            this.a(false);
                            return;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    this.U.clear();
                    if (!this.o()) {
                        int n2 = 0;
                        while (true) {
                            block21: {
                                class_1792 class_17923;
                                block22: {
                                    block20: {
                                        try {
                                            try {
                                                if (n2 >= 5) break;
                                                if (!((String)this.J[n2].a()).isBlank()) break block20;
                                                break block21;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                            }
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                        }
                                    }
                                    class_17923 = pulsescanner.f.e.b.d((String)this.J[n2].a());
                                    try {
                                        if (class_17923 != class_1802.field_8162) break block22;
                                        this.b(cb[113] + (String)this.J[n2].a() + cb[150] + (n2 + 1) + cb[121]);
                                        break block21;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                }
                                this.U.add(new f(class_17923, (String)this.K[n2].a(), (String)this.L[n2].a(), (String)this.M[n2].a(), Set.copyOf(pulsescanner.f.e.b.e((String)this.N[n2].a()))));
                            }
                            ++n2;
                        }
                        try {
                            if (this.U.isEmpty()) {
                                this.c(cb[23]);
                                this.a(false);
                                return;
                            }
                            break block23;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    try {
                        try {
                            if (this.p() != class_1802.field_8162) break block23;
                            b2 = this;
                            if (!((String)this.B.a()).isBlank()) break block24;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        string = cb[140];
                        break block25;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                String[] stringArray = cb;
                string = stringArray[116] + (String)this.B.a() + stringArray[77];
            }
            b2.c(string);
            this.a(false);
            return;
        }
        try {
            this.q();
            b b3 = this;
            class_17922 = this.o() ? this.p() : null;
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        b3.aw = class_17922;
        this.al = this.w();
    }

    @Override
    protected void h() {
        this.q();
        this.U.clear();
    }

    private void q() {
        this.ab = false;
        this.aa = false;
        this.Z = false;
        this.Y = false;
        this.X = false;
        this.W = false;
        this.af = false;
        this.ae = false;
        this.ad = false;
        this.ac = false;
        this.ao = 0;
        this.an = 0;
        this.am = 0;
        this.ap = -1;
        this.aq = -1;
        this.ar = 0;
        this.as = -1;
        this.av = 0;
        this.au = 0;
        this.at = 0;
        this.ag = "";
        this.ah = cb[2];
        this.aj = 0.0;
        this.ak = 0;
        this.ai = "";
        this.aw = null;
    }

    @Override
    public void i() {
        block48: {
            block53: {
                block50: {
                    class_1707 class_17072;
                    block52: {
                        block51: {
                            class_1703 class_17032;
                            block49: {
                                block47: {
                                    block46: {
                                        block44: {
                                            block45: {
                                                block42: {
                                                    block43: {
                                                        block41: {
                                                            try {
                                                                block40: {
                                                                    try {
                                                                        try {
                                                                            if (pulsescanner.f.e.b.a.field_1724 == null || pulsescanner.f.e.b.a.field_1687 == null) break block40;
                                                                        }
                                                                        catch (NumberFormatException numberFormatException) {
                                                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                                                        }
                                                                        if (pulsescanner.f.e.b.a.field_1761 != null) break block41;
                                                                    }
                                                                    catch (NumberFormatException numberFormatException) {
                                                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            catch (NumberFormatException numberFormatException) {
                                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                                            }
                                                        }
                                                        try {
                                                            if (++this.av >= 2200) {
                                                                this.D();
                                                                return;
                                                            }
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                                        }
                                                        try {
                                                            try {
                                                                if (this.an <= 0) break block42;
                                                                if (--this.an <= 0) break block43;
                                                            }
                                                            catch (NumberFormatException numberFormatException) {
                                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                                            }
                                                            return;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                                        }
                                                    }
                                                    this.ab = false;
                                                }
                                                try {
                                                    try {
                                                        if (this.at <= 0) break block44;
                                                        if (--this.at != 0) break block45;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                                    }
                                                    this.y();
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                                }
                                            }
                                            return;
                                        }
                                        try {
                                            try {
                                                if (!this.ad || !this.A()) break block46;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                            }
                                            return;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                        }
                                    }
                                    class_17032 = pulsescanner.f.e.b.a.field_1724.field_7512;
                                    try {
                                        if (!this.W) break block47;
                                        this.a(class_17032);
                                        break block48;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                }
                                try {
                                    if (!this.X) break block49;
                                    this.x();
                                    break block48;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                            }
                            try {
                                if (this.ac) break block48;
                                if (!(class_17032 instanceof class_1707)) break block50;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            class_17072 = (class_1707)class_17032;
                            try {
                                try {
                                    this.Y = true;
                                    if (class_17072.method_17388() != 6) break block48;
                                    if (this.o()) break block51;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                this.d(class_17072);
                                break block48;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                        }
                        try {
                            if (!((Boolean)this.w.a()).booleanValue()) break block52;
                            this.b(class_17072);
                            break block48;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    this.c(class_17072);
                    break block48;
                }
                try {
                    try {
                        if (!this.Y || this.aa) break block53;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    this.Y = false;
                    this.Z = false;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            try {
                if (!this.Y) {
                    this.u();
                    this.Y = true;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
    }

    @Override
    public void a(class_2561 class_25612) {
        block4: {
            try {
                try {
                    if (!this.W || !this.f(class_25612.getString())) break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                this.af = true;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
    }

    private boolean a(class_1707 class_17072) {
        boolean bl;
        block11: {
            block10: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!this.Z && this.g(class_17072)) break block10;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (this.ab) break block10;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (this.X) break block10;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (this.aa) break block10;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block11;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void b(class_1707 class_17072) {
        block12: {
            block11: {
                try {
                    if (!this.a(class_17072)) {
                        return;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                class_1799 class_17992 = class_17072.method_7611(0).method_7677();
                double d2 = this.j(class_17992);
                class_1792 class_17922 = this.p();
                try {
                    try {
                        try {
                            try {
                                if (!this.a(class_17992, class_17922) || !this.d(class_17992)) break block11;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (!this.e(class_17992)) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (!(d2 >= 0.0)) break block11;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    this.a(class_17072, 0, class_17992, class_17922, d2);
                    break block12;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            this.i(class_17072);
        }
    }

    private void c(class_1707 class_17072) {
        try {
            if (!this.a(class_17072)) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        class_1792 class_17922 = this.p();
        for (int i2 = 0; i2 < 45; ++i2) {
            class_1799 class_17992;
            block14: {
                class_17992 = class_17072.method_7611(i2).method_7677();
                try {
                    try {
                        try {
                            if (!this.a(class_17992, class_17922) || !this.d(class_17992)) continue;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (this.l(class_17992)) break block14;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    if (this.g(class_17992)) continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            double d2 = this.j(class_17992);
            try {
                try {
                    if (!this.e(class_17992) || !(d2 >= 0.0)) continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                this.a(class_17072, i2, class_17992, class_17922, d2);
                return;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        this.i(class_17072);
    }

    private void d(class_1707 class_17072) {
        try {
            if (!this.a(class_17072)) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        for (int i2 = 0; i2 < 45; ++i2) {
            class_1799 class_17992;
            block18: {
                class_17992 = class_17072.method_7611(i2).method_7677();
                try {
                    try {
                        try {
                            if (class_17992.method_7960()) continue;
                            if (this.l(class_17992)) break block18;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (this.g(class_17992)) {
                            continue;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            for (f f2 : this.U) {
                try {
                    if (!this.a(class_17992, f2.ao()) || !this.d(class_17992)) continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                double d2 = this.j(class_17992);
                try {
                    try {
                        if (!this.a(class_17992, f2) || !(d2 >= 0.0)) continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    this.a(class_17072, i2, class_17992, f2.ao(), d2);
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
        }
        this.i(class_17072);
    }

    private void a(class_1707 class_17072, int n2, class_1799 class_17992, class_1792 class_17922, double d2) {
        int n3 = this.b(class_17992, class_17922);
        try {
            if (n3 <= 0) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        this.aw = class_17922;
        this.ag = class_17992.method_7964().getString();
        this.aj = d2;
        this.ak = n3;
        this.ah = this.h(class_17992);
        this.al = this.w();
        this.aa = true;
        this.W = true;
        this.X = false;
        this.am = 0;
        this.ao = 0;
        this.ap = class_17072.field_7763;
        this.aq = n2;
        this.ar = 0;
        this.af = false;
        this.ai = this.F();
        this.as = -1;
        this.av = 0;
        this.a((class_1703)class_17072, n2, 0, class_1713.field_7790);
        String[] stringArray = cb;
        this.h(stringArray[52] + n3 + stringArray[44] + this.ag + ".");
    }

    /*
     * Unable to fully structure code
     */
    private void a(class_1703 var1_1) {
        block102: {
            block118: {
                block117: {
                    block116: {
                        block115: {
                            block114: {
                                block110: {
                                    block113: {
                                        block112: {
                                            block111: {
                                                block108: {
                                                    block106: {
                                                        block104: {
                                                            block103: {
                                                                block101: {
                                                                    ++this.ao;
                                                                    var2_2 = pulsescanner.f.e.b.H();
                                                                    var3_3 = this.s();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var3_3 != null) {
                                                                                    v0 = this;
                                                                                    if (!var2_2) break block101;
                                                                                }
                                                                                ** GOTO lbl41
                                                                            }
                                                                            catch (NumberFormatException v1) {
                                                                                throw pulsescanner.f.e.b.a(v1);
                                                                            }
                                                                            if (!v0.r()) break block102;
                                                                        }
                                                                        catch (NumberFormatException v2) {
                                                                            throw pulsescanner.f.e.b.a(v2);
                                                                        }
                                                                        v0 = this;
                                                                    }
                                                                    catch (NumberFormatException v3) {
                                                                        throw pulsescanner.f.e.b.a(v3);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (!var2_2) break block103;
                                                                        if (!v0.a(var3_3)) break block102;
                                                                    }
                                                                    catch (NumberFormatException v4) {
                                                                        throw pulsescanner.f.e.b.a(v4);
                                                                    }
                                                                    v0 = this;
                                                                }
                                                                catch (NumberFormatException v5) {
                                                                    throw pulsescanner.f.e.b.a(v5);
                                                                }
                                                            }
                                                            try {
                                                                block105: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v0.t();
                                                                                if (var2_2) break block102;
lbl41:
                                                                                // 2 sources

                                                                                v6 = this;
                                                                                if (!var2_2) break block104;
                                                                            }
                                                                            catch (NumberFormatException v7) {
                                                                                throw pulsescanner.f.e.b.a(v7);
                                                                            }
                                                                            if (v6.w() <= this.al) break block105;
                                                                        }
                                                                        catch (NumberFormatException v8) {
                                                                            throw pulsescanner.f.e.b.a(v8);
                                                                        }
                                                                        this.t();
                                                                        if (var2_2) break block102;
                                                                    }
                                                                    catch (NumberFormatException v9) {
                                                                        throw pulsescanner.f.e.b.a(v9);
                                                                    }
                                                                }
                                                                v6 = this;
                                                            }
                                                            catch (NumberFormatException v10) {
                                                                throw pulsescanner.f.e.b.a(v10);
                                                            }
                                                        }
                                                        try {
                                                            block107: {
                                                                try {
                                                                    try {
                                                                        if (!var2_2) break block106;
                                                                        if (!v6.af) break block107;
                                                                    }
                                                                    catch (NumberFormatException v11) {
                                                                        throw pulsescanner.f.e.b.a(v11);
                                                                    }
                                                                    this.h(pulsescanner.f.e.b.cb[98]);
                                                                    this.b(var1_1);
                                                                    if (var2_2) break block102;
                                                                }
                                                                catch (NumberFormatException v12) {
                                                                    throw pulsescanner.f.e.b.a(v12);
                                                                }
                                                            }
                                                            v6 = this;
                                                        }
                                                        catch (NumberFormatException v13) {
                                                            throw pulsescanner.f.e.b.a(v13);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            block109: {
                                                                try {
                                                                    try {
                                                                        v14 = v6.ao;
                                                                        if (!var2_2) break block108;
                                                                        if (v14 < 20) break block109;
                                                                    }
                                                                    catch (NumberFormatException v15) {
                                                                        throw pulsescanner.f.e.b.a(v15);
                                                                    }
                                                                    this.b(pulsescanner.f.e.b.cb[49]);
                                                                    this.b(var1_1);
                                                                    if (var2_2) break block102;
                                                                }
                                                                catch (NumberFormatException v16) {
                                                                    throw pulsescanner.f.e.b.a(v16);
                                                                }
                                                            }
                                                            v17 = var1_1;
                                                            if (!var2_2) break block110;
                                                        }
                                                        catch (NumberFormatException v18) {
                                                            throw pulsescanner.f.e.b.a(v18);
                                                        }
                                                        v14 = v17 instanceof class_1707;
                                                    }
                                                    catch (NumberFormatException v19) {
                                                        throw pulsescanner.f.e.b.a(v19);
                                                    }
                                                }
                                                try {
                                                    if (v14 != 0) {
                                                        v17 = (class_1707)var1_1;
                                                        if (!var2_2) break block110;
                                                    }
                                                    ** GOTO lbl153
                                                }
                                                catch (NumberFormatException v20) {
                                                    throw pulsescanner.f.e.b.a(v20);
                                                }
                                                var4_4 = v17;
                                                try {
                                                    try {
                                                        try {
                                                            if (this.e((class_1707)var4_4)) {
                                                                v21 = this;
                                                                if (!var2_2) break block111;
                                                            }
                                                            ** GOTO lbl153
                                                        }
                                                        catch (NumberFormatException v22) {
                                                            throw pulsescanner.f.e.b.a(v22);
                                                        }
                                                        if (!v21.r()) break block102;
                                                    }
                                                    catch (NumberFormatException v23) {
                                                        throw pulsescanner.f.e.b.a(v23);
                                                    }
                                                    v21 = this;
                                                }
                                                catch (NumberFormatException v24) {
                                                    throw pulsescanner.f.e.b.a(v24);
                                                }
                                            }
                                            var6_5 = v21.f((class_1707)var4_4);
                                            try {
                                                try {
                                                    if (!var2_2) break block112;
                                                    if (var6_5 < 0) break block113;
                                                }
                                                catch (NumberFormatException v25) {
                                                    throw pulsescanner.f.e.b.a(v25);
                                                }
                                                this.a(var4_4, var6_5, 0, class_1713.field_7790);
                                            }
                                            catch (NumberFormatException v26) {
                                                throw pulsescanner.f.e.b.a(v26);
                                            }
                                        }
                                        this.t();
                                    }
                                    try {
                                        if (var2_2) break block102;
lbl153:
                                        // 3 sources

                                        v17 = var1_1;
                                    }
                                    catch (NumberFormatException v27) {
                                        throw pulsescanner.f.e.b.a(v27);
                                    }
                                }
                                try {
                                    try {
                                        if (!var2_2) break block114;
                                        if (!(v17 instanceof class_1707)) break block102;
                                    }
                                    catch (NumberFormatException v28) {
                                        throw pulsescanner.f.e.b.a(v28);
                                    }
                                    v17 = var1_1;
                                }
                                catch (NumberFormatException v29) {
                                    throw pulsescanner.f.e.b.a(v29);
                                }
                            }
                            var5_7 = (class_1707)v17;
                            try {
                                try {
                                    v30 = var5_7;
                                    if (!var2_2) break block115;
                                    if (v30.field_7763 != this.ap) break block102;
                                }
                                catch (NumberFormatException v31) {
                                    throw pulsescanner.f.e.b.a(v31);
                                }
                                v30 = var5_7;
                            }
                            catch (NumberFormatException v32) {
                                throw pulsescanner.f.e.b.a(v32);
                            }
                        }
                        try {
                            try {
                                try {
                                    v33 = v30.method_17388();
                                    if (!var2_2) break block116;
                                    if (v33 != 6) break block102;
                                }
                                catch (NumberFormatException v34) {
                                    throw pulsescanner.f.e.b.a(v34);
                                }
                                v35 = this;
                                if (!var2_2) break block117;
                            }
                            catch (NumberFormatException v36) {
                                throw pulsescanner.f.e.b.a(v36);
                            }
                            v33 = (int)v35.F().equals(this.ai);
                        }
                        catch (NumberFormatException v37) {
                            throw pulsescanner.f.e.b.a(v37);
                        }
                    }
                    if (v33 == 0) break block102;
                    v35 = this;
                }
                try {
                    try {
                        if (!var2_2) break block118;
                        if (v35.aq < 0) break block102;
                    }
                    catch (NumberFormatException v38) {
                        throw pulsescanner.f.e.b.a(v38);
                    }
                    v35 = this;
                }
                catch (NumberFormatException v39) {
                    throw pulsescanner.f.e.b.a(v39);
                }
            }
            if (v35.aq < 45) {
                block128: {
                    block127: {
                        block126: {
                            block124: {
                                block125: {
                                    block123: {
                                        block121: {
                                            block119: {
                                                var6_6 = var5_7.method_7611(this.aq).method_7677();
                                                var7_8 = this.j(var6_6);
                                                try {
                                                    try {
                                                        v40 = this;
                                                        if (!var2_2) break block119;
                                                        if (!v40.a(var6_6, this.aw)) ** break block120
                                                    }
                                                    catch (NumberFormatException v41) {
                                                        throw pulsescanner.f.e.b.a(v41);
                                                    }
                                                    v40 = this;
                                                }
                                                catch (NumberFormatException v42) {
                                                    throw pulsescanner.f.e.b.a(v42);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v43 = v40.d(var6_6);
                                                        if (!var2_2) break block121;
                                                        if (v43 == 0) ** break block120
                                                    }
                                                    catch (NumberFormatException v44) {
                                                        throw pulsescanner.f.e.b.a(v44);
                                                    }
                                                    v45 = var7_8;
                                                    if (!var2_2) break block122;
                                                }
                                                catch (NumberFormatException v46) {
                                                    throw pulsescanner.f.e.b.a(v46);
                                                }
                                                cfr_temp_0 = v45 - 0.0;
                                                v43 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                            }
                                            catch (NumberFormatException v47) {
                                                throw pulsescanner.f.e.b.a(v47);
                                            }
                                        }
                                        if (v43 >= 0) {
                                            block122: {
                                                v45 = var7_8;
                                            }
                                            try {
                                                v48 = Double.compare(v45, this.aj);
                                                if (!var2_2) break block123;
                                                if (v48 != 0) ** break block120
                                            }
                                            catch (NumberFormatException v49) {
                                                throw pulsescanner.f.e.b.a(v49);
                                            }
                                            v48 = 1;
                                        } else {
                                            v48 = 0;
                                        }
                                    }
                                    var9_9 = v48;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v50 = this;
                                                    if (!var2_2) break block124;
                                                    if (v50.ao < 2) break block125;
                                                }
                                                catch (NumberFormatException v51) {
                                                    throw pulsescanner.f.e.b.a(v51);
                                                }
                                                v52 = var9_9;
                                                if (!var2_2) break block126;
                                            }
                                            catch (NumberFormatException v53) {
                                                throw pulsescanner.f.e.b.a(v53);
                                            }
                                            if (v52 != 0) break block125;
                                        }
                                        catch (NumberFormatException v54) {
                                            throw pulsescanner.f.e.b.a(v54);
                                        }
                                        this.h(pulsescanner.f.e.b.cb[158]);
                                        this.b(var1_1);
                                        return;
                                    }
                                    catch (NumberFormatException v55) {
                                        throw pulsescanner.f.e.b.a(v55);
                                    }
                                }
                                v50 = this;
                            }
                            try {
                                if (!var2_2) break block127;
                                v52 = v50.ao;
                            }
                            catch (NumberFormatException v56) {
                                throw pulsescanner.f.e.b.a(v56);
                            }
                        }
                        try {
                            if (v52 < 2) break block102;
                            v50 = this;
                        }
                        catch (NumberFormatException v57) {
                            throw pulsescanner.f.e.b.a(v57);
                        }
                    }
                    try {
                        try {
                            if (!var2_2) break block128;
                            if (v50.ar != 0) break block102;
                        }
                        catch (NumberFormatException v58) {
                            throw pulsescanner.f.e.b.a(v58);
                        }
                        ++this.ar;
                        this.a((class_1703)var5_7, this.aq, 0, class_1713.field_7790);
                        v50 = this;
                    }
                    catch (NumberFormatException v59) {
                        throw pulsescanner.f.e.b.a(v59);
                    }
                }
                v50.av = 0;
            }
        }
    }

    private void b(class_1703 class_17032) {
        block8: {
            block7: {
                this.aa = false;
                this.X = false;
                this.W = false;
                this.am = 0;
                this.ao = 0;
                this.as = -1;
                this.aq = -1;
                this.ar = 0;
                this.af = false;
                this.av = 0;
                if (class_17032 instanceof class_1707) {
                    class_1707 class_17072 = (class_1707)class_17032;
                    try {
                        try {
                            try {
                                if (class_17072.method_17388() != 6 || class_17072.field_7763 != this.ap) break block7;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (!this.F().equals(this.ai)) break block7;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        this.i(class_17072);
                        break block8;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
            }
            this.D();
        }
    }

    private boolean e(class_1707 class_17072) {
        boolean bl;
        block27: {
            block26: {
                String string;
                block24: {
                    block22: {
                        string = this.F();
                        try {
                            try {
                                try {
                                    if (class_17072.field_7763 != this.ap || class_17072.method_17388() != 6) break block22;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!string.equals(this.ai)) break block22;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            return false;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    try {
                        block23: {
                            try {
                                try {
                                    try {
                                        if (string.contains(cb[152]) || string.contains(cb[67])) break block23;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                    if (string.contains(cb[156])) break block23;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!string.contains(cb[41])) break block24;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                        }
                        return true;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                try {
                    block25: {
                        try {
                            try {
                                try {
                                    if (class_17072.method_17388() == 3) break block25;
                                    if (class_17072.field_7763 == this.ap) break block26;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (string.equals(this.ai)) break block26;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (class_17072.method_17388() == 6) break block26;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block27;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean r() {
        try {
            if (this.as < 0) {
                this.as = this.A.h();
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        try {
            if (this.as > 0) {
                --this.as;
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return true;
    }

    private int f(class_1707 class_17072) {
        block12: {
            int n2 = Math.min(class_17072.method_17388() * 9, class_17072.field_7761.size());
            int n3 = 0;
            while (true) {
                block11: {
                    try {
                        try {
                            if (n3 >= n2) break;
                            if (!this.a(class_17072.method_7611(n3).method_7677())) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        return n3;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                ++n3;
            }
            n3 = this.z.h();
            try {
                if (n3 < 0 || n3 >= n2) break block12;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            class_1799 class_17992 = class_17072.method_7611(n3).method_7677();
            try {
                try {
                    if (class_17992.method_7960() || this.b(class_17992)) break block12;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return n3;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return -1;
    }

    private boolean a(class_1799 class_17992) {
        boolean bl;
        block33: {
            block32: {
                String string;
                block30: {
                    block28: {
                        try {
                            if (class_17992.method_7960()) {
                                return false;
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        try {
                            block27: {
                                try {
                                    try {
                                        try {
                                            if (class_17992.method_31574(class_1802.field_8581) || class_17992.method_31574(class_1802.field_8656)) break block27;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                        }
                                        if (class_17992.method_31574(class_1802.field_8131)) break block27;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                    if (!class_17992.method_31574(class_1802.field_8408)) break block28;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                            }
                            return true;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    string = class_17992.method_7964().getString().toLowerCase(Locale.ROOT);
                    try {
                        block29: {
                            try {
                                try {
                                    if (string.equals(cb[114]) || string.contains(cb[133])) break block29;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!string.contains(cb[115])) break block30;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                        }
                        return false;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                try {
                    block31: {
                        try {
                            try {
                                try {
                                    try {
                                        if (string.contains(cb[24]) || string.contains(cb[107])) break block31;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                    if (string.contains(cb[82])) break block31;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (string.contains(cb[93])) break block31;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (!string.contains(cb[71])) break block32;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block33;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean b(class_1799 class_17992) {
        boolean bl;
        block16: {
            block15: {
                block13: {
                    try {
                        if (class_17992.method_7960()) {
                            return false;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    try {
                        try {
                            if (!class_17992.method_31574(class_1802.field_8879) && !class_17992.method_31574(class_1802.field_8077)) break block13;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        return true;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                String string = class_17992.method_7964().getString().toLowerCase(Locale.ROOT);
                try {
                    block14: {
                        try {
                            try {
                                if (string.equals(cb[50]) || string.contains(cb[137])) break block14;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (!string.contains(cb[36])) break block15;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block16;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private class_4264 s() {
        class_4264 class_42642;
        try {
            if (pulsescanner.f.e.b.a.field_1755 == null) {
                return null;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        ArrayList<class_4264> arrayList = new ArrayList<class_4264>();
        this.a(pulsescanner.f.e.b.a.field_1755.method_25396(), arrayList);
        class_4264 class_42643 = this.a(arrayList, true);
        try {
            class_42642 = class_42643 != null ? class_42643 : this.a(arrayList, false);
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return class_42642;
    }

    private void a(List<? extends class_364> list, List<class_4264> list2) {
        for (class_364 class_3642 : list) {
            class_4264 class_42642;
            block6: {
                if (class_3642 instanceof class_4264) {
                    class_42642 = (class_4264)class_3642;
                    try {
                        try {
                            if (!class_42642.field_22763 || !class_42642.field_22764) break block6;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        list2.add(class_42642);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
            }
            if (!(class_3642 instanceof class_4069)) continue;
            class_42642 = (class_4069)class_3642;
            this.a(class_42642.method_25396(), list2);
        }
    }

    private class_4264 a(List<class_4264> list, boolean bl) {
        class_4264 class_42642 = null;
        int n2 = -1;
        for (class_4264 class_42643 : list) {
            boolean bl2;
            block16: {
                block18: {
                    String string;
                    block15: {
                        string = class_42643.method_25369().getString().toLowerCase(Locale.ROOT).trim();
                        String[] stringArray = cb;
                        String string2 = " " + string.replaceAll(stringArray[55], " ").trim() + " ";
                        try {
                            if (!bl) break block15;
                            bl2 = string2.contains(stringArray[145]);
                            break block16;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    try {
                        block17: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (string.contains(cb[152]) || string.contains(cb[76])) break block17;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                        }
                                        if (string.contains(cb[41])) break block17;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                    if (string.contains(cb[156])) break block17;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!string.equals(cb[32])) break block18;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                        }
                        bl2 = true;
                        break block16;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                bl2 = false;
            }
            boolean bl3 = bl2;
            try {
                if (!bl3 || class_42643.method_25368() * class_42643.method_25364() <= n2) continue;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            class_42642 = class_42643;
            n2 = class_42643.method_25368() * class_42643.method_25364();
        }
        return class_42642;
    }

    /*
     * Loose catch block
     */
    private boolean a(class_4264 class_42642) {
        class_437 class_4372 = pulsescanner.f.e.b.a.field_1755;
        try {
            if (class_4372 == null) {
                return false;
            }
        }
        catch (Throwable throwable) {
            throw pulsescanner.f.e.b.a(throwable);
        }
        try {
            block9: {
                class_11909 class_119092 = new class_11909((double)class_42642.method_46426() + (double)class_42642.method_25368() / 2.0, (double)class_42642.method_46427() + (double)class_42642.method_25364() / 2.0, new class_11910(0, 0));
                boolean bl = class_4372.method_25402(class_119092, false);
                if (bl) break block9;
                try {
                    block10: {
                        if (pulsescanner.f.e.b.a.field_1755 != class_4372) break block9;
                        break block10;
                        catch (Throwable throwable) {
                            throw pulsescanner.f.e.b.a(throwable);
                        }
                    }
                    class_42642.method_25306((class_11907)class_119092);
                }
                catch (Throwable throwable) {
                    throw pulsescanner.f.e.b.a(throwable);
                }
            }
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private void t() {
        this.W = false;
        this.X = true;
        this.am = 0;
        this.ao = 0;
        this.as = -1;
        this.av = 0;
    }

    private boolean g(class_1707 class_17072) {
        int n2 = this.h(class_17072);
        try {
            this.Z = true;
            if (n2 < 0) {
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        this.a((class_1703)class_17072, n2, 0, class_1713.field_7790);
        this.an = 1;
        this.av = 0;
        return true;
    }

    private int h(class_1707 class_17072) {
        block9: {
            int n2 = Math.min(45, class_17072.field_7761.size() - 1);
            try {
                try {
                    if (n2 < 0 || !this.c(class_17072.method_7611(n2).method_7677())) break block9;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return n2;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        int n3 = 0;
        while (true) {
            block10: {
                try {
                    try {
                        if (n3 >= class_17072.field_7761.size()) break;
                        if (!this.c(class_17072.method_7611(n3).method_7677())) break block10;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    return n3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            ++n3;
        }
        return -1;
    }

    private boolean c(class_1799 class_17992) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (class_17992.method_7960() || !class_17992.method_7964().getString().toLowerCase(Locale.ROOT).contains(cb[138])) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void i(class_1707 class_17072) {
        try {
            if (class_17072.field_7761.size() > 49) {
                this.a((class_1703)class_17072, 49, 1, class_1713.field_7794);
                this.an = 1;
                this.ab = true;
                this.av = 0;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
    }

    private void a(class_1703 class_17032, int n2, int n3, class_1713 class_17132) {
        block4: {
            try {
                try {
                    if (pulsescanner.f.e.b.a.field_1761 == null || pulsescanner.f.e.b.a.field_1724 == null) break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                pulsescanner.f.e.b.a.field_1761.method_2906(class_17032.field_7763, n2, n3, class_17132, (class_1657)pulsescanner.f.e.b.a.field_1724);
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
    }

    private void u() {
        try {
            if (a.method_1562() == null) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        a.method_1562().method_45730(this.v());
        this.an = 3;
        this.av = 0;
    }

    private String v() {
        String string;
        try {
            if (!this.o()) {
                return cb[119];
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        String string2 = ((String)this.C.a()).trim();
        try {
            string = !string2.isEmpty() ? cb[70] + string2 : cb[75] + class_7923.field_41178.method_10221((Object)this.p()).method_12832().replace('_', ' ');
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return string;
    }

    private boolean d(class_1799 class_17992) {
        boolean bl;
        block9: {
            try {
                try {
                    if (!class_17992.method_7960() && !this.f(class_17992.method_7964().getString())) break block9;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        List<class_2561> list = this.i(class_17992);
        for (class_2561 class_25612 : list) {
            try {
                if (!this.f(class_25612.getString())) continue;
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        try {
            bl = this.a(list) >= 0.0;
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return bl;
    }

    private boolean f(String string) {
        boolean bl;
        block36: {
            block35: {
                String string2 = string.toLowerCase(Locale.ROOT);
                try {
                    block34: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (string2.contains(cb[90]) || string2.contains(cb[96])) break block34;
                                                                                    }
                                                                                    catch (NumberFormatException numberFormatException) {
                                                                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                                                                    }
                                                                                    if (string2.contains(cb[34])) break block34;
                                                                                }
                                                                                catch (NumberFormatException numberFormatException) {
                                                                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                                                                }
                                                                                if (string2.contains(cb[39])) break block34;
                                                                            }
                                                                            catch (NumberFormatException numberFormatException) {
                                                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                                                            }
                                                                            if (string2.contains(cb[97])) break block34;
                                                                        }
                                                                        catch (NumberFormatException numberFormatException) {
                                                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                                                        }
                                                                        if (string2.contains(cb[88])) break block34;
                                                                    }
                                                                    catch (NumberFormatException numberFormatException) {
                                                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                                                    }
                                                                    if (string2.contains(cb[151])) break block34;
                                                                }
                                                                catch (NumberFormatException numberFormatException) {
                                                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                                                }
                                                                if (string2.contains(cb[8])) break block34;
                                                            }
                                                            catch (NumberFormatException numberFormatException) {
                                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                                            }
                                                            if (string2.contains(cb[29])) break block34;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                                        }
                                                        if (string2.contains(cb[106])) break block34;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                                    }
                                                    if (string2.contains(cb[125])) break block34;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                                }
                                                if (string2.contains(cb[109])) break block34;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw pulsescanner.f.e.b.a(numberFormatException);
                                            }
                                            if (string2.contains(cb[0])) break block34;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw pulsescanner.f.e.b.a(numberFormatException);
                                        }
                                        if (string2.contains(cb[9])) break block34;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                    if (string2.contains(cb[56])) break block34;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (string2.contains(cb[72])) break block34;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (!string2.contains(cb[46])) break block35;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block36;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean e(class_1799 class_17992) {
        class_1792 class_17922;
        block16: {
            block15: {
                class_17922 = this.p();
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    if (class_17992.method_7960() || !this.a(class_17992, class_17922)) break block14;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!this.d(class_17992)) break block14;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (this.f(class_17992)) break block15;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    return false;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            try {
                block17: {
                    try {
                        try {
                            if (!((Boolean)this.G.a()).booleanValue()) break block16;
                            if (this.l(class_17992)) break block17;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (this.a(class_17992, pulsescanner.f.e.b.e((String)this.H.a()), (Boolean)this.I.a())) break block16;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return this.a(class_17992, class_17922, (String)this.E.a(), (String)this.D.a(), (String)this.F.a());
    }

    private boolean a(class_1799 class_17992, f f2) {
        block16: {
            block15: {
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    if (class_17992.method_7960() || !this.a(class_17992, f2.ao())) break block14;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!this.d(class_17992)) break block14;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (this.f(class_17992)) break block15;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    return false;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            try {
                block17: {
                    try {
                        try {
                            if (f2.as().isEmpty()) break block16;
                            if (this.l(class_17992)) break block17;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (this.a(class_17992, f2.as(), false)) break block16;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return this.a(class_17992, f2.ao(), f2.aq(), f2.ap(), f2.ar());
    }

    private boolean a(class_1799 class_17992, class_1792 class_17922, String string, String string2, String string3) {
        boolean bl;
        block23: {
            block21: {
                double d2;
                int n2;
                double d3;
                double d4;
                double d5;
                block20: {
                    block19: {
                        d5 = this.j(class_17992);
                        d4 = pulsescanner.f.e.b.j(string);
                        d3 = pulsescanner.f.e.b.j(string2);
                        n2 = this.b(class_17992, class_17922);
                        try {
                            block18: {
                                try {
                                    try {
                                        if (d4 < 0.0 || d5 < 0.0) break block18;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw pulsescanner.f.e.b.a(numberFormatException);
                                    }
                                    if (n2 > 0) break block19;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                            }
                            return false;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    try {
                        try {
                            if (!string3.equals(cb[155]) || n2 == Math.max(1, class_17922.method_7854().method_7914())) break block20;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        return false;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                try {
                    d2 = string3.equals(cb[37]) ? d5 / (double)n2 : d5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                double d6 = d2;
                try {
                    block22: {
                        try {
                            try {
                                if (!(d6 <= d4)) break block21;
                                if (d3 <= 0.0) break block22;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (!(d6 >= d3)) break block21;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block23;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean f(class_1799 class_17992) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (!((Boolean)this.u.a()).booleanValue()) {
                        return true;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                double d2 = this.k(class_17992);
                try {
                    try {
                        if (!(d2 < 0.0) && !(d2 >= (Double)this.v.a())) break block7;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block8;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean a(class_1799 class_17992, Set<class_5321<class_1887>> set, boolean bl) {
        class_9304 class_93042;
        block13: {
            block12: {
                class_93042 = (class_9304)class_17992.method_58694(class_9334.field_49633);
                try {
                    try {
                        if (class_93042 != null && !class_93042.method_57543()) break block12;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    return set.isEmpty();
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            try {
                try {
                    if (!bl || class_93042.method_57541() == set.size()) break block13;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        for (class_5321<class_1887> class_53212 : set) {
            boolean bl2 = false;
            for (class_6880 class_68802 : class_93042.method_57534()) {
                if (!class_68802.method_40225(class_53212)) continue;
                bl2 = true;
                break;
            }
            try {
                if (bl2) continue;
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return true;
    }

    private boolean g(class_1799 class_17992) {
        class_9304 class_93042;
        block7: {
            class_93042 = (class_9304)class_17992.method_58694(class_9334.field_49633);
            try {
                try {
                    if (class_93042 != null && !class_93042.method_57543()) break block7;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        for (class_6880 class_68802 : class_93042.method_57534()) {
            try {
                if (!class_68802.method_40230().map(b::lambda$hasCursedEnchantments$8).orElse(false).booleanValue()) continue;
                return true;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return false;
    }

    private String h(class_1799 class_17992) {
        String string;
        class_9304 class_93042;
        block7: {
            class_93042 = (class_9304)class_17992.method_58694(class_9334.field_49633);
            try {
                try {
                    if (class_93042 != null && !class_93042.method_57543()) break block7;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return cb[2];
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (class_6880 class_68802 : class_93042.method_57534()) {
            String[] stringArray = cb;
            arrayList.add(class_68802.method_40230().map(b::lambda$getEnchantmentsString$9).orElse(stringArray[81]) + " " + class_93042.method_57536(class_68802));
        }
        try {
            string = arrayList.isEmpty() ? cb[2] : String.join((CharSequence)"\n", arrayList);
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return string;
    }

    private List<class_2561> i(class_1799 class_17992) {
        return class_17992.method_7950(class_1792.class_9635.method_59528((class_1937)pulsescanner.f.e.b.a.field_1687), (class_1657)pulsescanner.f.e.b.a.field_1724, (class_1836)class_1836.field_41070);
    }

    private double j(class_1799 class_17992) {
        double d2;
        try {
            d2 = class_17992.method_7960() ? -1.0 : this.a(this.i(class_17992));
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return d2;
    }

    /*
     * Exception decompiling
     */
    private double a(List<class_2561> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 6[SWITCH]
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

    private double k(class_1799 class_17992) {
        double d2;
        StringBuilder stringBuilder = new StringBuilder();
        for (class_2561 class_25612 : this.i(class_17992)) {
            stringBuilder.append('\n').append(class_25612.getString());
        }
        Matcher matcher = r.matcher(stringBuilder);
        try {
            d2 = matcher.find() ? this.g(matcher.group(1)) : -1.0;
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return d2;
    }

    private double g(String string) {
        double d2;
        Matcher matcher;
        double d3 = 0.0;
        String string2 = string.toLowerCase(Locale.ROOT);
        String[] stringArray = cb;
        Matcher matcher2 = Pattern.compile(stringArray[132]).matcher(string2);
        if (matcher2.find()) {
            d3 += Double.parseDouble(matcher2.group(1)) * 24.0;
        }
        if ((matcher = Pattern.compile(cb[147]).matcher(string2)).find()) {
            d3 += Double.parseDouble(matcher.group(1));
        }
        try {
            d2 = d3 > 0.0 ? d3 : -1.0;
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return d2;
    }

    private boolean a(class_1799 class_17992, class_1792 class_17922) {
        boolean bl;
        block10: {
            block8: {
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    if (class_17922 == null || class_17922 == class_1802.field_8162) break block8;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (class_17992.method_31574(class_17922)) break block9;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                            if (this.c(class_17992, class_17922) <= 0) break block8;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private int b(class_1799 class_17992, class_1792 class_17922) {
        int n2;
        try {
            if (class_17922 == null) {
                return 0;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        try {
            n2 = class_17992.method_31574(class_17922) ? class_17992.method_7947() : this.c(class_17992, class_17922);
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return n2;
    }

    private int w() {
        block10: {
            try {
                block9: {
                    try {
                        try {
                            if (pulsescanner.f.e.b.a.field_1724 == null || this.aw == null) break block9;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (this.aw != class_1802.field_8162) break block10;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                return 0;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        int n2 = 0;
        for (int i2 = 0; i2 < pulsescanner.f.e.b.a.field_1724.method_31548().method_5439(); ++i2) {
            int n3;
            int n4;
            class_1799 class_17992 = pulsescanner.f.e.b.a.field_1724.method_31548().method_5438(i2);
            try {
                n4 = n2;
                n3 = class_17992.method_31574(this.aw) ? class_17992.method_7947() : this.c(class_17992, this.aw);
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            n2 = n4 + n3;
        }
        return n2;
    }

    private boolean l(class_1799 class_17992) {
        boolean bl;
        block4: {
            block3: {
                class_1792 class_17922 = class_17992.method_7909();
                if (class_17922 instanceof class_1747) {
                    class_1747 class_17472 = (class_1747)class_17922;
                    try {
                        if (!(class_17472.method_7711() instanceof class_2480)) break block3;
                        bl = true;
                        break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
            }
            bl = false;
        }
        return bl;
    }

    private int c(class_1799 class_17992, class_1792 class_17922) {
        try {
            if (!this.l(class_17992)) {
                return 0;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        class_9288 class_92882 = (class_9288)class_17992.method_58694(class_9334.field_49622);
        try {
            if (class_92882 == null) {
                return 0;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        int n2 = 0;
        for (class_1799 class_17993 : class_92882.method_59714()) {
            if (!class_17993.method_31574(class_17922)) continue;
            n2 += class_17993.method_7947();
        }
        return n2;
    }

    private void x() {
        block16: {
            try {
                if (++this.am < 2) {
                    return;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            int n2 = this.w();
            if (n2 > this.al) {
                block17: {
                    block15: {
                        int n3 = n2 - this.al;
                        try {
                            this.W = false;
                            this.aa = false;
                            this.X = false;
                            this.h(cb[66] + n3 + cb[85] + this.ag + cb[154] + pulsescanner.f.e.b.a(this.aj) + ".");
                            this.a(this.ag, this.aj, n3, this.ah);
                            if (((Boolean)this.x.a()).booleanValue()) {
                                pulsescanner.f.e.b.a.field_1687.method_8396((class_1297)pulsescanner.f.e.b.a.field_1724, pulsescanner.f.e.b.a.field_1724.method_24515(), class_3417.field_14709, class_3419.field_15248, 1.0f, 1.0f);
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        try {
                            this.al = n2;
                            this.E();
                            if (!((Boolean)this.O.a()).booleanValue()) break block15;
                            this.ae = (Boolean)this.y.a();
                            this.ac = true;
                            this.at = 2;
                            break block16;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                    }
                    try {
                        if (!((Boolean)this.y.a()).booleanValue()) break block17;
                        this.h(cb[59]);
                        this.a(false);
                        break block16;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                this.Y = false;
                this.Z = false;
            } else {
                try {
                    if (this.am >= 30) {
                        this.h(cb[92]);
                        this.D();
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
        }
    }

    private void y() {
        double d2;
        block17: {
            int n2;
            int n3;
            block16: {
                block15: {
                    try {
                        block14: {
                            try {
                                try {
                                    if (pulsescanner.f.e.b.a.field_1724 == null || a.method_1562() == null) break block14;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (this.aw != null) break block15;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                        }
                        this.ac = false;
                        this.C();
                        return;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                d2 = pulsescanner.f.e.b.j((String)this.P.a());
                try {
                    if (d2 <= 0.0) {
                        this.c(cb[136] + (String)this.P.a());
                        this.ac = false;
                        this.C();
                        return;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                n3 = this.z();
                try {
                    if (n3 < 0) {
                        this.b(cb[7]);
                        this.ac = false;
                        this.C();
                        return;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                n2 = pulsescanner.f.e.b.a.field_1724.method_31548().method_67532();
                try {
                    if (n3 >= 9) break block16;
                    pulsescanner.f.e.b.a.field_1724.method_31548().method_61496(n3);
                    ((ClientPlayerInteractionManagerAccessor)pulsescanner.f.e.b.a.field_1761).pulse$syncSelectedSlot();
                    break block17;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            pulsescanner.f.e.b.a.field_1761.method_2906(pulsescanner.f.e.b.a.field_1724.field_7498.field_7763, pulsescanner.f.e.b.c(n3), n2, class_1713.field_7791, (class_1657)pulsescanner.f.e.b.a.field_1724);
        }
        a.method_1562().method_45730(cb[18] + (long)d2);
        this.ac = false;
        this.ad = true;
        this.au = 0;
        this.an = 1;
        this.av = 0;
    }

    private static int c(int n2) {
        try {
            if (n2 < 9) {
                return 36 + n2;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        try {
            if (n2 < 36) {
                return n2;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        try {
            if (n2 < 40) {
                return 8 - (n2 - 36);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return 45;
    }

    private int z() {
        for (int i2 = 0; i2 < pulsescanner.f.e.b.a.field_1724.method_31548().method_5439(); ++i2) {
            class_1799 class_17992 = pulsescanner.f.e.b.a.field_1724.method_31548().method_5438(i2);
            try {
                try {
                    if (!class_17992.method_31574(this.aw) && this.c(class_17992, this.aw) <= 0) continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                return i2;
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
        return -1;
    }

    private boolean A() {
        block17: {
            block18: {
                try {
                    if (++this.au > 60) {
                        this.b(cb[31]);
                        this.ad = false;
                        this.Y = false;
                        this.C();
                        return false;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                class_4264 class_42642 = this.s();
                try {
                    try {
                        if (class_42642 == null) break block17;
                        if (!this.a(class_42642)) break block18;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    this.B();
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            return true;
        }
        Object object = pulsescanner.f.e.b.a.field_1724.field_7512;
        if (object instanceof class_1707) {
            class_1707 class_17072;
            block19: {
                class_17072 = (class_1707)object;
                object = this.F();
                try {
                    try {
                        try {
                            if (((String)object).contains(cb[152]) || ((String)object).contains(cb[33])) break block19;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw pulsescanner.f.e.b.a(numberFormatException);
                        }
                        if (((String)object).contains(cb[16])) break block19;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            int n2 = this.j(class_17072);
            try {
                if (n2 < 0) {
                    return true;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
            this.a((class_1703)class_17072, n2, 0, class_1713.field_7790);
            this.E();
            this.B();
        }
        return true;
    }

    private void B() {
        this.ad = false;
        this.Y = false;
        this.Z = false;
        this.an = 5;
        this.av = 0;
        this.C();
    }

    private void C() {
        try {
            if (this.ae) {
                this.ae = false;
                this.h(cb[139]);
                this.a(false);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
    }

    private int j(class_1707 class_17072) {
        int n2;
        block16: {
            block15: {
                int n3 = Math.min(class_17072.method_17388() * 9, class_17072.field_7761.size());
                for (int i2 = 0; i2 < n3; ++i2) {
                    class_1799 class_17992 = class_17072.method_7611(i2).method_7677();
                    try {
                        if (class_17992.method_7960()) {
                            continue;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    String string = class_17992.method_7964().getString().toLowerCase(Locale.ROOT);
                    try {
                        block14: {
                            try {
                                try {
                                    if (string.contains(cb[152]) || string.equals(cb[57])) break block14;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw pulsescanner.f.e.b.a(numberFormatException);
                                }
                                if (!string.contains(cb[4])) continue;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw pulsescanner.f.e.b.a(numberFormatException);
                            }
                        }
                        return i2;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                }
                try {
                    try {
                        if (class_17072.method_17388() != 3 || class_17072.field_7761.size() <= 15) break block15;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    n2 = 15;
                    break block16;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            n2 = -1;
        }
        return n2;
    }

    private void D() {
        this.E();
        boolean bl = this.o();
        try {
            this.q();
            if (bl) {
                this.aw = this.p();
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        this.u();
        this.Y = true;
    }

    private void E() {
        block4: {
            try {
                try {
                    if (pulsescanner.f.e.b.a.field_1724 == null || pulsescanner.f.e.b.a.field_1724.field_7512 == pulsescanner.f.e.b.a.field_1724.field_7498) break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
                pulsescanner.f.e.b.a.field_1724.method_7346();
            }
            catch (NumberFormatException numberFormatException) {
                throw pulsescanner.f.e.b.a(numberFormatException);
            }
        }
    }

    private String F() {
        String string;
        try {
            string = pulsescanner.f.e.b.a.field_1755 == null ? "" : pulsescanner.f.e.b.a.field_1755.method_25440().getString().toLowerCase(Locale.ROOT);
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return string;
    }

    private void h(String string) {
        try {
            if (((Boolean)this.x.a()).booleanValue()) {
                this.a(string);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
    }

    private void a(String string, double d2, int n2, String string2) {
    }

    private static String i(String string) {
        String[] stringArray = cb;
        return string.replace("\\", stringArray[15]).replace("\"", stringArray[13]).replace("\r", stringArray[79]).replace("\n", stringArray[28]);
    }

    private static String a(double d2) {
        String string;
        try {
            if (d2 >= 1.0E9) {
                return String.format(Locale.ROOT, cb[17], d2 / 1.0E9);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        try {
            if (d2 >= 1000000.0) {
                return String.format(Locale.ROOT, cb[74], d2 / 1000000.0);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        try {
            string = d2 >= 1000.0 ? String.format(Locale.ROOT, cb[73], d2 / 1000.0) : String.format(Locale.ROOT, cb[148], d2);
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return string;
    }

    private static double j(String string) {
        String string2 = string.trim().toLowerCase(Locale.ROOT).replace(",", "");
        double d2 = 1.0;
        if (string2.endsWith("b")) {
            d2 = 1.0E9;
            string2 = string2.substring(0, string2.length() - 1);
        } else if (string2.endsWith("m")) {
            d2 = 1000000.0;
            string2 = string2.substring(0, string2.length() - 1);
        } else if (string2.endsWith("k")) {
            d2 = 1000.0;
            string2 = string2.substring(0, string2.length() - 1);
        }
        try {
            return Double.parseDouble(string2) * d2;
        }
        catch (NumberFormatException numberFormatException) {
            return -1.0;
        }
    }

    private static String lambda$getEnchantmentsString$9(class_5321 class_53212) {
        return class_53212.method_29177().method_12832();
    }

    private static Boolean lambda$hasCursedEnchantments$8(class_5321 class_53212) {
        return class_53212.method_29177().method_12832().contains(cb[129]);
    }

    private boolean lambda$new$7() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!((Boolean)this.Q.a()).booleanValue() || !((Boolean)this.S.a()).booleanValue()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$6(int n2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.o() || ((String)this.J[n2].a()).isBlank()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$5(int n2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.o() || ((String)this.J[n2].a()).isBlank()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$4(int n2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.o() || ((String)this.J[n2].a()).isBlank()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$3(int n2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.o() || ((String)this.J[n2].a()).isBlank()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$2() {
        boolean bl;
        try {
            bl = !this.o();
        }
        catch (NumberFormatException numberFormatException) {
            throw pulsescanner.f.e.b.a(numberFormatException);
        }
        return bl;
    }

    private boolean lambda$new$1() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.o() || !((Boolean)this.G.a()).booleanValue()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$0() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.o() || !((Boolean)this.G.a()).booleanValue()) break block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw pulsescanner.f.e.b.a(numberFormatException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw pulsescanner.f.e.b.a(numberFormatException);
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
                var5 = new String[165];
                var3_1 = 0;
                var2_2 = "D0^\u0006\u001fCk\b:L\u001c\u0015H`M=\u000ei,N\u0006\u001fBb\b\nC\u001b\u0006H~\u0004f6C\u00179{1B\u0005\u0005\r|]+N\u001a\u0017^i\b*Y\u0013\u0002X\u007f\b4H\u0001\u0005LkM*\r\u0013\u0018I,X5L\u000b\u0005\rm\b*X\u0011\u0015H\u007f[y^\u001d\u0003Ch\u0006\tD0^\u0006VDxM4\tx<_R%YmK2\u0006{0C\u0015\u001aH0k6X\u001e\u0012\rbG-\r\u0014\u001fCh\b-E\u0017V]yZ:E\u0013\u0005Hh\b0Y\u0017\u001b\rjG+\r\u0013\u0003Yc\u0005*H\u001e\u001a\u0003\u0013F6\r\u001e\u0019CkM+\r\u0013\u0000LeD8O\u001e\u0013\u0013[6@\u0017\u0019Ci\b<A\u0001\u0013\rnG,J\u001a\u0002\u0014a7[\u0013\u001aDh\b.H\u0010\u001eBcCyx :\u0003#\b0Y\u0017\u001b\rxGyO\u0007\u000f\u0001,MwJ\\VCi\\1H\u0000\u001fYiw0C\u0015\u0019Y\"\u000b\u007f<O\u001a\u0019Bg\b\f\u007f>\u0002t{\u0002\u00192\u0002t\u0005\u0004[,_\u0017\u0005\rw\u001c\u00144\bI1\r\u0001\u0013A`\bOm7N\u001a\u0017CxE<C\u0006\u0005\r~M(X\u001b\u0004Hh\b6CR\u0002Ei\b0Y\u0017\u001b\u0001,K6@\u001f\u0017\r\u007fM)L\u0000\u0017YiLu\r\u0017XJ\"\b*E\u0013\u0004]bM*^^VXbJ+H\u0013\u001dDbOw\fk6C\u0006\u0013Cx\u0005\rT\u0002\u0013\u0005n0_\u0001\u0002\u0101S{N\u001d\u0018YiF-\u000fHT\b\u007f\nu\u000f\u0017\u001bOiL*\u000fH-V.\\0Y\u001e\u0013\u000f6\n\u0018eR%CeX<_R7AiZ-\u000f^TIi[:_\u001b\u0006YeG7\u000fHT\b\u007f\nu\u000f\u0011\u0019AcZ{\u0017JE\u00154\u001fj\u001b^TKeM5I\u0001T\u0017WS{C\u0013\u001bH.\u0012{d\u0006\u0013@.\u0004{[\u0013\u001aXi\nc\u000fW\u0005\rt\r=\u000f^TDbD0C\u0017T\u0017xZ,H\u000fZV.F8@\u0017T\u0017.x+D\u0011\u0013\u000f \n/L\u001e\u0003H.\u0012{\b\u0001T\u0001.A7A\u001b\u0018H.\u0012-_\u0007\u0013P S{C\u0013\u001bH.\u0012{h\u001c\u0015EmF-^PZ\u000fzI5X\u0017T\u0017.\r*\u000f^TDbD0C\u0017T\u0017jI5^\u0017\u000bp \n-D\u001f\u0013^xI4]PL\u000f)[{P/\u000b$f6\r\u001f\u0003AxAt^\u001c\u001f]i\b0Y\u0017\u001b^,I+HR\u0015BbN0J\u0007\u0004Hh\u0006\u0003Q<^\bx<_R?YiE\u000bx+D\u0011\u0013\rAG=HR,\u0000\u0002q\u0016Zp'\u0000f\u0017.XvPL\u0004\u0006[I\u0004$s2@\u0010+\u00043t*\u0007ZI\u0017oG0C\u0001IQP\fp\u0002t7\rF6YR\u0017[mA5L\u0010\u001aH7k1H\u0011\u001d^,G7A\u000bVYdMyC\u0017\u0001H\u007f\\yY\u001d\u0006\u0000`M?YR\u001aD\u007f\\0C\u0015VDb\b*D\u001c\u0011Ai\b4B\u0016\u0013\u0003!i,Y\u001d[^iD5\r\u0011\u0019CjA+@\u0013\u0002DcFyY\u001b\u001bHh\b6X\u0006X\u0002G2\u0004[<A\u001e\u000f@8^R\u0014HiFyO\u001d\u0003Jd\\:n8A\u001e\u0014LoCy^\u001e\u0019Y,K5D\u0011\u001dHh\b6CR\u0002Ei\b)X\u0000\u0015Em[<\r\u0011\u0019CjA+@\u0013\u0002DcFy^\u0011\u0004HiFw\u0007L<N\u001e\u001fCi\bx<_R?YiE0b6D\u001cVL,_6_\u001e\u0012\rnM?B\u0000\u0013\riF8O\u001e\u001fCk\b-E\u0017VlyK-D\u001d\u0018\r_F0]\u0017\u0004\u0003\u0012@8^R\u0014HiFy]\u0007\u0004NdI*H\u0016\u0005a-H\u001fV\u0003J,T\u001bl0^\u0011\u0019_h\b,^\u0017\u0004\rElyY\u001dV@iF-D\u001d\u0018\u0003\te0CR&_eK<\u0002Py\u0010m7N\u001a\u0017CxE<C\u0006V`cL<\u000eK8CU\u0002\r|]+N\u001a\u0017^i\u000ee0CR\"DaMye\u001d\u0003_\u007f_x<_R%YmK2\r\u0000\u0013\\yA+H\u0001VBbMyK\u0007\u001aA,[-L\u0011\u001d\rmF=\r\u0011\u001eHoC*\r\u001b\u0002^,\\6Y\u0013\u001a\r|Z0N\u0017X\r\\M+\r;\u0002Ha\b:E\u0017\u0015F\u007f\b6C\u0017VDxM4\n\u0001V]~A:H\\H|1HR\u0015AeK2H\u0016VAe[-D\u001c\u0011\rhA=\r\u001c\u0019Y,G)H\u001cVL,X,_\u0011\u001eL\u007fI;A\u0017VNcF?D\u0000\u001bLxA6C\\V\u007fiN+H\u0001\u001eDbOw\u0002F6\u0002\u00192\u0012i-Y\u0017\u001b]xA7JR\u0002B,J,TR\u000fn0A\u0006\u0013_,d6ZR\"DaM\bm7N\u001a\u0017Cx[\ns\u0007L_\f\u001d!\u0011\u0004\u0006\u0012K6X\u001e\u0012\rbG-\r\u0002\u0003_o@8^\u0017\u0003Q<^.i:N\u0017\u0006YiLy]\u0000\u001fNi\u0006y~\u0007\u0006]cZ-^R\u001d\u0001,Eu\r\u0013\u0018I,Jy^\u0007\u0010KeP<^\\5i,Y\u001d[^xG)\u0017R\u0002X~F0C\u0015VBjNyL\u0014\u0002H~\b-E\u0017V^yK:H\u0001\u0005KyDy]\u0007\u0004NdI*H\\\ne8UR&_eK<\r.z<\\\u0007\u001f_i[y^\u0017\u001aHo\\<IR\u0013Co@8C\u0006\u001bHb\\*\r\u001b\u0018\r\u007fA7J\u001e\u0013\raG=H\\\ta-H\u001fVcmE<\u0005n0K\u0006\u001e\u0006{0C\u0015\u001aH<z<\\\u0007\u001f_i[yY\u001a\u0013\re\\<@R\u0002B,@8[\u0017VHtI:Y\u001e\u000f\rx@<\r\u0001\u0013AiK-H\u0016VHbK1L\u001c\u0002@iF-^\\\u0004o6YR\fI+HR\u000fBy\b*X\u0000\u00136e8U\u001b\u001bXa\b8N\u0011\u0013]xM=\r\u0002\u0004DoMw\r!\u0003]|G+Y\u0001VF \b4\u0001R\u0017Ch\b;\r\u0001\u0003KjA!H\u0001X/e0C\u001b\u001bXa\b7X\u001f\u0014H~\b6KR\u001eByZ*\r\u0000\u0013@mA7D\u001c\u0011\rcFyLR\u001aD\u007f\\0C\u0015X\u0003I1\r\bX,_\u0011\u001eL\u007fM\u000fK8C\u001c\u0019Y,X,_\u0011\u001eL\u007fM\u0005\rw\u001c\u0014=\u0005\rw\u001c\u0014;\u0003I1\r\u0006I:N\u0017\u0006Y\u0002\nw\u000fq<^R5AeK2\r6\u0013AmQ\u0002t+\f{7D\u0002\u001fCk\b\u0010Y\u0017\u001b\u0007]7F\u001c\u0019Zb\u0006I:N\u0017\u0006Y6e0C\u001b\u001bXa\b8N\u0011\u0013]xM=\r\u0002\u0004DoMw\r!\u0003]|G+Y\u0001VF \b4\u0001R\u0017Ch\b;\r\u0001\u0003KjA!H\u0001X\t{<A\u0014V}eF>\u0002Py\n{7D\u0002\u0013\rAG=H\r|6]R:Hj\\yb\u001c\u001aT\fD0^\u0006\u001fCk\b*B\u001e\u0012\nl0^\u0011\u0019_h\b\u0010i\u000eI5_\u0017\u0017Iu\b;B\u0007\u0011Ex\u0012m!L\u0011\u0002\rIF:E\u0013\u0018YaM7Y\u0001\u0013x,_\u0011\u001eL\u007fMyY\u001b\u001bHh\b6X\u0006X\u0003J,T.i:N\u0017\u0006YiLy]\u0000\u001fNi\u0006y~\u0007\u0006]cZ-^R\u001d\u0001,Eu\r\u0013\u0018I,Jy^\u0007\u0010KeP<^\\\tm7N\u001a\u0017Cx[y\u0011I5_\u0017\u0017Iu\b)X\u0000\u0015Em[<I\fX,_\u0011\u001eL\u007fM=\r\u0010\u000fG|1HR\u001aD\u007f\\0C\u0015VZm[yL\u001e\u0004HmL \r\u0010\u0019Xk@-\r\u001d\u0004\re[yC\u001dVAcF>H\u0000V]yZ:E\u0013\u0005LnD<\u0003R$HjZ<^\u001a\u001fCk\u0006\nx+D\u0011\u0013\rAG=H\u0006{<N\u001d\u0018I\ne0CR&_eK<\r3|,_\u001c\u0005\rx@<\r\u0001\u0018D|M+\r\u001d\u0010K,I?Y\u0017\u0004\rcF<\r\u0001\u0003NoM*^\u0014\u0003A,X,_\u0011\u001eL\u007fMw\u0015x,_\u0011\u001eL\u007fMyn\u001d\u0018KeZ4\r!\u001aBx\u0010I)]\u001e\u001fNm\\0B\u001cYG\u007fG7!t}q\u0001\\\u0005Wt=\u0001/]\u00053\u0012\u0005\u0003)*IQ\u0003p\u0012[^vgE;p[I\u000b]7L\u0004\u0017D`I;A\u0017\u0007K6C\u0014\u001f_a\u0004su\u0016/\u0011D0^\u0006\u001fCk\b:L\u001c\u0015H`D<I4m7N\u001a\u0017CxE<C\u0006\u0005\r~M(X\u001b\u0004Hh\b6CR\u0002Ee[yD\u0006\u0013@ \b:B\u001f\u001bL,[<]\u0013\u0004LxM=\u0003\u0004f6C\u0017\u0005e,A\u0006\u001f\u000e}7F\u001c\u0019Zb\b0Y\u0017\u001b\r.\u0002F6\u0007L<N\u001e\u001fCi\u000e}7F\u001c\u0019Zb\b0Y\u0017\u001b\r.\u0002\u0016y\rf6Y\u001b\u0010DoI-D\u001d\u0018^\u0002I1C|0N\u0019\u0005\rxGyZ\u0013\u001fY,J<K\u001d\u0004H,X+H\u0001\u0005DbOyY\u001a\u0013\roG7K\u001b\u0004@m\\0B\u001cV^oZ<H\u001cQ^,q<^R\u0014Xx\\6C\\\u000e\u0004y^\u0019\u001f]|A7JR\u001fY\"\ti,Y\u001dV~xG)\u000f\u007f<O\u001a\u0019Bg\b\u001cC\u0013\u0014AiL6{<C\u0016\u0005\r\u007f]:N\u0017\u0005^j]5\r\u0002\u0003_o@8^\u0017VL`M+Y\u0001VYc\b8\r6\u001f^oG+IR\u0001Hn@6B\u0019X\u000fD0^\u0006\u001fCk\b<U\u0002\u001f_iL\te8UR&_eK<9a-H\u001fVYc\b;X\u000bVDb\b*D\u001c\u0011Ai\b4B\u0016\u0013\u0001,MwJ\\VIeI4B\u001c\u0012r\u007f_6_\u0016VB~\b<A\u000b\u0002_m\u0006\n{<A\u001eV}~A:H\u0005K,_\u0001\u0013:{7D\u0002\u0013^,G7HR\u0015BbN0J\u0007\u0004Hh\b0Y\u0017\u001b\rcZyX\u0002VYc\b?D\u0004\u0013\roG7K\u001b\u0011X~M=\r\u001b\u0002Ha[w\u001ft;\u0005)*I ur\u0005MLq\"s\u0005I/]\u00043\u0001qv\u0019\u001bOQ\u0001\u0005O\t\u0000\u0005IY_q\u007f\u0002=\u0006K8C\u0011\u0013A\u0006n6X\u0000\u0002E=\u0000f\u0017\u0002\u0004DoM%O\u0007\u000fq\u007f\u0003?B\u0000_q\u007f\u0002c\u0012.\u0005\u0007P\ffq\u0001\\\u0005Wt=\u0001/]\u00053\u0012\u0005\u0003)*IQ\u0003p\u0012[^vgE;p[I\u0019a7[\u0013\u001aDh\b8X\u0006\u0019\u0000\u007fM5AR\u0006_eK<\u0017R\u0006K8C\u0011\u0013A\u000fZ<N\u0017\u0018Y`QyA\u001b\u0005YiL4i,Y\u001d[^xG)\u0017R\u0002X~F0C\u0015VBjNyL\u0014\u0002H~\b-E\u0017VNcE)A\u0017\u0002Hh\b)X\u0000\u0015Em[<\u0003\u0019{<YR\u0017\r_F0]\u001b\u0018J,a-H\u001fVKeZ*Y\\@a>C\u001d\u0004H\u007f\b5D\u0001\u0002DbO*\r\u0006\u001eLx\b<U\u0002\u001f_i\b*B\u001d\u0018H~\b-E\u0013\u0018\rx@<\r\u0011\u0019CjA>X\u0000\u0013I,E0C\u001b\u001bXa\u0006_x<_R%YmK2\r\u0000\u0013\\yA+H\u0001VBbMyK\u0007\u001aA,[-L\u0011\u001d\rmF=\r\u0011\u001eHoC*\r\u001b\u0002^,\\6Y\u0013\u001a\r|Z0N\u0017X\r\\M+\r;\u0002Ha\b:E\u0017\u0015F\u007f\b6C\u0017VDxM4\n\u0001V]~A:H\\\u0014l0^\u0011\u0019_h\b.H\u0010\u001eBcCyx :\u00036x+D\u0011\u0013\ry[<IR\u0014T,\u00078ER\u0005H`Dw\r!\u0003]|G+Y\u0001VF \b4\u0001R\u0017Ch\b;\r\u0001\u0003KjA!H\u0001X\u0005\b H\u0001V\ti,Y\u001dV~iD5\t\u0000\u0005IY_q\u007f\u00021\u0004\rw\u001d\u0014\u0005|1D\u0000\u0012\n\nyD\u001cVdxM4\r\b[6A\u0016VBy\\\u0007K6C\u0014\u001f_a\u0003\u0019m@\u0005\b?B\u0000V\tx<_R%YmK2\bX,_\u0011\u001eL\u007fM>e<C\u0006\u001fBb[yY\u001a\u0013\roG7K\u001b\u0011X~M=\r6\u001f^oG+IR\u0003^iZyB\u001cVL,[,N\u0011\u0013^\u007fN,AR\u0006X~K1L\u0001\u0013\u0003I|1HR\u0005H`M:Y\u0017\u0012\r`A*Y\u001b\u0018J,_8^R\u0014ByO1YR\u0014HjG+HR\u001fY,K6X\u001e\u0012\rnMyN\u001d\u0018KeZ4H\u0016X\r^M?_\u0017\u0005EeF>\u0003\u0002\u0014\u0019&[<A\u0014*^&L<^\u0006\u0004Xo\\\u0002\u0017.\u0005p&\u0000\u0002q\u0016*^'LrEY\u001b\u0006\u007fur\u0004Xj,T\u0001VLyK-D\u001d\u0018\rdG,^\u0017VDxM4^R\u0002Em\\y@\u0013\u0002Nd\b B\u0007\u0004\r|Z0N\u0017VLbLyH\u001c\u0015EmF-\r\u0014\u001fAxM+^^VLbLyN\u0013\u0018\r~M5D\u0001\u0002\rx@<@\\>d0^\u0006\u0005\rm\b*X\u0011\u0015H\u007f[?X\u001e\u001aT,X,_\u0011\u001eL\u007fM=\r\u001b\u0002Ha\b;L\u0011\u001d\rcFyY\u001a\u0013\rm]:Y\u001b\u0019C,@6X\u0001\u0013\u0003";
                var4_3 = "D0^\u0006\u001fCk\b:L\u001c\u0015H`M=\u000ei,N\u0006\u001fBb\b\nC\u001b\u0006H~\u0004f6C\u00179{1B\u0005\u0005\r|]+N\u001a\u0017^i\b*Y\u0013\u0002X\u007f\b4H\u0001\u0005LkM*\r\u0013\u0018I,X5L\u000b\u0005\rm\b*X\u0011\u0015H\u007f[y^\u001d\u0003Ch\u0006\tD0^\u0006VDxM4\tx<_R%YmK2\u0006{0C\u0015\u001aH0k6X\u001e\u0012\rbG-\r\u0014\u001fCh\b-E\u0017V]yZ:E\u0013\u0005Hh\b0Y\u0017\u001b\rjG+\r\u0013\u0003Yc\u0005*H\u001e\u001a\u0003\u0013F6\r\u001e\u0019CkM+\r\u0013\u0000LeD8O\u001e\u0013\u0013[6@\u0017\u0019Ci\b<A\u0001\u0013\rnG,J\u001a\u0002\u0014a7[\u0013\u001aDh\b.H\u0010\u001eBcCyx :\u0003#\b0Y\u0017\u001b\rxGyO\u0007\u000f\u0001,MwJ\\VCi\\1H\u0000\u001fYiw0C\u0015\u0019Y\"\u000b\u007f<O\u001a\u0019Bg\b\f\u007f>\u0002t{\u0002\u00192\u0002t\u0005\u0004[,_\u0017\u0005\rw\u001c\u00144\bI1\r\u0001\u0013A`\bOm7N\u001a\u0017CxE<C\u0006\u0005\r~M(X\u001b\u0004Hh\b6CR\u0002Ei\b0Y\u0017\u001b\u0001,K6@\u001f\u0017\r\u007fM)L\u0000\u0017YiLu\r\u0017XJ\"\b*E\u0013\u0004]bM*^^VXbJ+H\u0013\u001dDbOw\fk6C\u0006\u0013Cx\u0005\rT\u0002\u0013\u0005n0_\u0001\u0002\u0101S{N\u001d\u0018YiF-\u000fHT\b\u007f\nu\u000f\u0017\u001bOiL*\u000fH-V.\\0Y\u001e\u0013\u000f6\n\u0018eR%CeX<_R7AiZ-\u000f^TIi[:_\u001b\u0006YeG7\u000fHT\b\u007f\nu\u000f\u0011\u0019AcZ{\u0017JE\u00154\u001fj\u001b^TKeM5I\u0001T\u0017WS{C\u0013\u001bH.\u0012{d\u0006\u0013@.\u0004{[\u0013\u001aXi\nc\u000fW\u0005\rt\r=\u000f^TDbD0C\u0017T\u0017xZ,H\u000fZV.F8@\u0017T\u0017.x+D\u0011\u0013\u000f \n/L\u001e\u0003H.\u0012{\b\u0001T\u0001.A7A\u001b\u0018H.\u0012-_\u0007\u0013P S{C\u0013\u001bH.\u0012{h\u001c\u0015EmF-^PZ\u000fzI5X\u0017T\u0017.\r*\u000f^TDbD0C\u0017T\u0017jI5^\u0017\u000bp \n-D\u001f\u0013^xI4]PL\u000f)[{P/\u000b$f6\r\u001f\u0003AxAt^\u001c\u001f]i\b0Y\u0017\u001b^,I+HR\u0015BbN0J\u0007\u0004Hh\u0006\u0003Q<^\bx<_R?YiE\u000bx+D\u0011\u0013\rAG=HR,\u0000\u0002q\u0016Zp'\u0000f\u0017.XvPL\u0004\u0006[I\u0004$s2@\u0010+\u00043t*\u0007ZI\u0017oG0C\u0001IQP\fp\u0002t7\rF6YR\u0017[mA5L\u0010\u001aH7k1H\u0011\u001d^,G7A\u000bVYdMyC\u0017\u0001H\u007f\\yY\u001d\u0006\u0000`M?YR\u001aD\u007f\\0C\u0015VDb\b*D\u001c\u0011Ai\b4B\u0016\u0013\u0003!i,Y\u001d[^iD5\r\u0011\u0019CjA+@\u0013\u0002DcFyY\u001b\u001bHh\b6X\u0006X\u0002G2\u0004[<A\u001e\u000f@8^R\u0014HiFyO\u001d\u0003Jd\\:n8A\u001e\u0014LoCy^\u001e\u0019Y,K5D\u0011\u001dHh\b6CR\u0002Ei\b)X\u0000\u0015Em[<\r\u0011\u0019CjA+@\u0013\u0002DcFy^\u0011\u0004HiFw\u0007L<N\u001e\u001fCi\bx<_R?YiE0b6D\u001cVL,_6_\u001e\u0012\rnM?B\u0000\u0013\riF8O\u001e\u001fCk\b-E\u0017VlyK-D\u001d\u0018\r_F0]\u0017\u0004\u0003\u0012@8^R\u0014HiFy]\u0007\u0004NdI*H\u0016\u0005a-H\u001fV\u0003J,T\u001bl0^\u0011\u0019_h\b,^\u0017\u0004\rElyY\u001dV@iF-D\u001d\u0018\u0003\te0CR&_eK<\u0002Py\u0010m7N\u001a\u0017CxE<C\u0006V`cL<\u000eK8CU\u0002\r|]+N\u001a\u0017^i\u000ee0CR\"DaMye\u001d\u0003_\u007f_x<_R%YmK2\r\u0000\u0013\\yA+H\u0001VBbMyK\u0007\u001aA,[-L\u0011\u001d\rmF=\r\u0011\u001eHoC*\r\u001b\u0002^,\\6Y\u0013\u001a\r|Z0N\u0017X\r\\M+\r;\u0002Ha\b:E\u0017\u0015F\u007f\b6C\u0017VDxM4\n\u0001V]~A:H\\H|1HR\u0015AeK2H\u0016VAe[-D\u001c\u0011\rhA=\r\u001c\u0019Y,G)H\u001cVL,X,_\u0011\u001eL\u007fI;A\u0017VNcF?D\u0000\u001bLxA6C\\V\u007fiN+H\u0001\u001eDbOw\u0002F6\u0002\u00192\u0012i-Y\u0017\u001b]xA7JR\u0002B,J,TR\u000fn0A\u0006\u0013_,d6ZR\"DaM\bm7N\u001a\u0017Cx[\ns\u0007L_\f\u001d!\u0011\u0004\u0006\u0012K6X\u001e\u0012\rbG-\r\u0002\u0003_o@8^\u0017\u0003Q<^.i:N\u0017\u0006YiLy]\u0000\u001fNi\u0006y~\u0007\u0006]cZ-^R\u001d\u0001,Eu\r\u0013\u0018I,Jy^\u0007\u0010KeP<^\\5i,Y\u001d[^xG)\u0017R\u0002X~F0C\u0015VBjNyL\u0014\u0002H~\b-E\u0017V^yK:H\u0001\u0005KyDy]\u0007\u0004NdI*H\\\ne8UR&_eK<\r.z<\\\u0007\u001f_i[y^\u0017\u001aHo\\<IR\u0013Co@8C\u0006\u001bHb\\*\r\u001b\u0018\r\u007fA7J\u001e\u0013\raG=H\\\ta-H\u001fVcmE<\u0005n0K\u0006\u001e\u0006{0C\u0015\u001aH<z<\\\u0007\u001f_i[yY\u001a\u0013\re\\<@R\u0002B,@8[\u0017VHtI:Y\u001e\u000f\rx@<\r\u0001\u0013AiK-H\u0016VHbK1L\u001c\u0002@iF-^\\\u0004o6YR\fI+HR\u000fBy\b*X\u0000\u00136e8U\u001b\u001bXa\b8N\u0011\u0013]xM=\r\u0002\u0004DoMw\r!\u0003]|G+Y\u0001VF \b4\u0001R\u0017Ch\b;\r\u0001\u0003KjA!H\u0001X/e0C\u001b\u001bXa\b7X\u001f\u0014H~\b6KR\u001eByZ*\r\u0000\u0013@mA7D\u001c\u0011\rcFyLR\u001aD\u007f\\0C\u0015X\u0003I1\r\bX,_\u0011\u001eL\u007fM\u000fK8C\u001c\u0019Y,X,_\u0011\u001eL\u007fM\u0005\rw\u001c\u0014=\u0005\rw\u001c\u0014;\u0003I1\r\u0006I:N\u0017\u0006Y\u0002\nw\u000fq<^R5AeK2\r6\u0013AmQ\u0002t+\f{7D\u0002\u001fCk\b\u0010Y\u0017\u001b\u0007]7F\u001c\u0019Zb\u0006I:N\u0017\u0006Y6e0C\u001b\u001bXa\b8N\u0011\u0013]xM=\r\u0002\u0004DoMw\r!\u0003]|G+Y\u0001VF \b4\u0001R\u0017Ch\b;\r\u0001\u0003KjA!H\u0001X\t{<A\u0014V}eF>\u0002Py\n{7D\u0002\u0013\rAG=H\r|6]R:Hj\\yb\u001c\u001aT\fD0^\u0006\u001fCk\b*B\u001e\u0012\nl0^\u0011\u0019_h\b\u0010i\u000eI5_\u0017\u0017Iu\b;B\u0007\u0011Ex\u0012m!L\u0011\u0002\rIF:E\u0013\u0018YaM7Y\u0001\u0013x,_\u0011\u001eL\u007fMyY\u001b\u001bHh\b6X\u0006X\u0003J,T.i:N\u0017\u0006YiLy]\u0000\u001fNi\u0006y~\u0007\u0006]cZ-^R\u001d\u0001,Eu\r\u0013\u0018I,Jy^\u0007\u0010KeP<^\\\tm7N\u001a\u0017Cx[y\u0011I5_\u0017\u0017Iu\b)X\u0000\u0015Em[<I\fX,_\u0011\u001eL\u007fM=\r\u0010\u000fG|1HR\u001aD\u007f\\0C\u0015VZm[yL\u001e\u0004HmL \r\u0010\u0019Xk@-\r\u001d\u0004\re[yC\u001dVAcF>H\u0000V]yZ:E\u0013\u0005LnD<\u0003R$HjZ<^\u001a\u001fCk\u0006\nx+D\u0011\u0013\rAG=H\u0006{<N\u001d\u0018I\ne0CR&_eK<\r3|,_\u001c\u0005\rx@<\r\u0001\u0018D|M+\r\u001d\u0010K,I?Y\u0017\u0004\rcF<\r\u0001\u0003NoM*^\u0014\u0003A,X,_\u0011\u001eL\u007fMw\u0015x,_\u0011\u001eL\u007fMyn\u001d\u0018KeZ4\r!\u001aBx\u0010I)]\u001e\u001fNm\\0B\u001cYG\u007fG7!t}q\u0001\\\u0005Wt=\u0001/]\u00053\u0012\u0005\u0003)*IQ\u0003p\u0012[^vgE;p[I\u000b]7L\u0004\u0017D`I;A\u0017\u0007K6C\u0014\u001f_a\u0004su\u0016/\u0011D0^\u0006\u001fCk\b:L\u001c\u0015H`D<I4m7N\u001a\u0017CxE<C\u0006\u0005\r~M(X\u001b\u0004Hh\b6CR\u0002Ee[yD\u0006\u0013@ \b:B\u001f\u001bL,[<]\u0013\u0004LxM=\u0003\u0004f6C\u0017\u0005e,A\u0006\u001f\u000e}7F\u001c\u0019Zb\b0Y\u0017\u001b\r.\u0002F6\u0007L<N\u001e\u001fCi\u000e}7F\u001c\u0019Zb\b0Y\u0017\u001b\r.\u0002\u0016y\rf6Y\u001b\u0010DoI-D\u001d\u0018^\u0002I1C|0N\u0019\u0005\rxGyZ\u0013\u001fY,J<K\u001d\u0004H,X+H\u0001\u0005DbOyY\u001a\u0013\roG7K\u001b\u0004@m\\0B\u001cV^oZ<H\u001cQ^,q<^R\u0014Xx\\6C\\\u000e\u0004y^\u0019\u001f]|A7JR\u001fY\"\ti,Y\u001dV~xG)\u000f\u007f<O\u001a\u0019Bg\b\u001cC\u0013\u0014AiL6{<C\u0016\u0005\r\u007f]:N\u0017\u0005^j]5\r\u0002\u0003_o@8^\u0017VL`M+Y\u0001VYc\b8\r6\u001f^oG+IR\u0001Hn@6B\u0019X\u000fD0^\u0006\u001fCk\b<U\u0002\u001f_iL\te8UR&_eK<9a-H\u001fVYc\b;X\u000bVDb\b*D\u001c\u0011Ai\b4B\u0016\u0013\u0001,MwJ\\VIeI4B\u001c\u0012r\u007f_6_\u0016VB~\b<A\u000b\u0002_m\u0006\n{<A\u001eV}~A:H\u0005K,_\u0001\u0013:{7D\u0002\u0013^,G7HR\u0015BbN0J\u0007\u0004Hh\b0Y\u0017\u001b\rcZyX\u0002VYc\b?D\u0004\u0013\roG7K\u001b\u0011X~M=\r\u001b\u0002Ha[w\u001ft;\u0005)*I ur\u0005MLq\"s\u0005I/]\u00043\u0001qv\u0019\u001bOQ\u0001\u0005O\t\u0000\u0005IY_q\u007f\u0002=\u0006K8C\u0011\u0013A\u0006n6X\u0000\u0002E=\u0000f\u0017\u0002\u0004DoM%O\u0007\u000fq\u007f\u0003?B\u0000_q\u007f\u0002c\u0012.\u0005\u0007P\ffq\u0001\\\u0005Wt=\u0001/]\u00053\u0012\u0005\u0003)*IQ\u0003p\u0012[^vgE;p[I\u0019a7[\u0013\u001aDh\b8X\u0006\u0019\u0000\u007fM5AR\u0006_eK<\u0017R\u0006K8C\u0011\u0013A\u000fZ<N\u0017\u0018Y`QyA\u001b\u0005YiL4i,Y\u001d[^xG)\u0017R\u0002X~F0C\u0015VBjNyL\u0014\u0002H~\b-E\u0017VNcE)A\u0017\u0002Hh\b)X\u0000\u0015Em[<\u0003\u0019{<YR\u0017\r_F0]\u001b\u0018J,a-H\u001fVKeZ*Y\\@a>C\u001d\u0004H\u007f\b5D\u0001\u0002DbO*\r\u0006\u001eLx\b<U\u0002\u001f_i\b*B\u001d\u0018H~\b-E\u0013\u0018\rx@<\r\u0011\u0019CjA>X\u0000\u0013I,E0C\u001b\u001bXa\u0006_x<_R%YmK2\r\u0000\u0013\\yA+H\u0001VBbMyK\u0007\u001aA,[-L\u0011\u001d\rmF=\r\u0011\u001eHoC*\r\u001b\u0002^,\\6Y\u0013\u001a\r|Z0N\u0017X\r\\M+\r;\u0002Ha\b:E\u0017\u0015F\u007f\b6C\u0017VDxM4\n\u0001V]~A:H\\\u0014l0^\u0011\u0019_h\b.H\u0010\u001eBcCyx :\u00036x+D\u0011\u0013\ry[<IR\u0014T,\u00078ER\u0005H`Dw\r!\u0003]|G+Y\u0001VF \b4\u0001R\u0017Ch\b;\r\u0001\u0003KjA!H\u0001X\u0005\b H\u0001V\ti,Y\u001dV~iD5\t\u0000\u0005IY_q\u007f\u00021\u0004\rw\u001d\u0014\u0005|1D\u0000\u0012\n\nyD\u001cVdxM4\r\b[6A\u0016VBy\\\u0007K6C\u0014\u001f_a\u0003\u0019m@\u0005\b?B\u0000V\tx<_R%YmK2\bX,_\u0011\u001eL\u007fM>e<C\u0006\u001fBb[yY\u001a\u0013\roG7K\u001b\u0011X~M=\r6\u001f^oG+IR\u0003^iZyB\u001cVL,[,N\u0011\u0013^\u007fN,AR\u0006X~K1L\u0001\u0013\u0003I|1HR\u0005H`M:Y\u0017\u0012\r`A*Y\u001b\u0018J,_8^R\u0014ByO1YR\u0014HjG+HR\u001fY,K6X\u001e\u0012\rnMyN\u001d\u0018KeZ4H\u0016X\r^M?_\u0017\u0005EeF>\u0003\u0002\u0014\u0019&[<A\u0014*^&L<^\u0006\u0004Xo\\\u0002\u0017.\u0005p&\u0000\u0002q\u0016*^'LrEY\u001b\u0006\u007fur\u0004Xj,T\u0001VLyK-D\u001d\u0018\rdG,^\u0017VDxM4^R\u0002Em\\y@\u0013\u0002Nd\b B\u0007\u0004\r|Z0N\u0017VLbLyH\u001c\u0015EmF-\r\u0014\u001fAxM+^^VLbLyN\u0013\u0018\r~M5D\u0001\u0002\rx@<@\\>d0^\u0006\u0005\rm\b*X\u0011\u0015H\u007f[?X\u001e\u001aT,X,_\u0011\u001eL\u007fM=\r\u001b\u0002Ha\b;L\u0011\u001d\rcFyY\u001a\u0013\rm]:Y\u001b\u0019C,@6X\u0001\u0013\u0003".length();
                var1_4 = 16;
                pulsescanner.f.e.b.b(false);
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 84;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "%i\u001a\\M\u0017rSc\u000b\f\r\u0000r\u0010h\u0001\f\r\u0000>9w\u0007EG\u001d3\u001a'\u0010Y[\u0007=\u001b'\u0007IP\u0007r\u0017w\u0003IF\u00177\u0012'\u0007C\b\\3\u001e'\u001aB[\u00077\u0017cSCNS&\u001ebSE\\\u0016?Vi\u0012AM]";
                    var4_3 = "%i\u001a\\M\u0017rSc\u000b\f\r\u0000r\u0010h\u0001\f\r\u0000>9w\u0007EG\u001d3\u001a'\u0010Y[\u0007=\u001b'\u0007IP\u0007r\u0017w\u0003IF\u00177\u0012'\u0007C\b\\3\u001e'\u001aB[\u00077\u0017cSCNS&\u001ebSE\\\u0016?Vi\u0012AM]".length();
                    var1_4 = 20;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 10;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (true) ** GOTO lbl72
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_7;
                switch (var6_7 % 7) {
                    case 0: {
                        v11 = 124;
                        break;
                    }
                    case 1: {
                        v11 = 13;
                        break;
                    }
                    case 2: {
                        v11 = 121;
                        break;
                    }
                    case 3: {
                        v11 = 38;
                        break;
                    }
                    case 4: {
                        v11 = 34;
                        break;
                    }
                    case 5: {
                        v11 = 121;
                        break;
                    }
                    default: {
                        v11 = 88;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_7;
lbl72:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_7);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl80:
                // 1 sources

                ** continue;
            }
        }
        pulsescanner.f.e.b.cb = var5;
        pulsescanner.f.e.b.s = pulsescanner.f.e.b.cb[48];
        v12 = new Pattern[4];
        var0_6 = pulsescanner.f.e.b.cb;
        v12[0] = Pattern.compile(var0_6[105], 2);
        v12[1] = Pattern.compile(var0_6[135], 2);
        v12[2] = Pattern.compile(var0_6[27], 2);
        v12[3] = Pattern.compile(var0_6[131], 2);
        pulsescanner.f.e.b.q = v12;
        pulsescanner.f.e.b.r = Pattern.compile(var0_6[160], 2);
    }

    public static void b(boolean bl) {
        ax = bl;
    }

    public static boolean G() {
        return ax;
    }

    public static boolean H() {
        boolean bl = pulsescanner.f.e.b.G();
        return !bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

