/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1750
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2626
 *  net.minecraft.class_2637
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_2828
 *  net.minecraft.class_3532
 *  net.minecraft.class_3675
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4969
 *  net.minecraft.class_638
 *  org.lwjgl.glfw.GLFW
 */
package pulsescanner.f.c;

import net.minecraft.class_1041;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_2828;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import org.lwjgl.glfw.GLFW;
import pulsescanner.a.a;
import pulsescanner.a.af;
import pulsescanner.a.ag;
import pulsescanner.a.ak;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.av;
import pulsescanner.a.ax;
import pulsescanner.a.d;
import pulsescanner.a.p;
import pulsescanner.a.q;
import pulsescanner.a.s;
import pulsescanner.a.t;
import pulsescanner.a.v;
import pulsescanner.a.w;
import pulsescanner.a.y;
import pulsescanner.f.c.c;

public class k
extends as {
    private long m;
    private class_3965 n;
    private class_1792 o;
    private final av p;
    private float q;
    private boolean r;
    private boolean s;
    private class_2338 t;
    private boolean u;
    private final ax v;
    private boolean w;
    private static k x;
    private long y;
    private float z;
    private boolean A;
    private int B;
    private class_3965 C;
    private boolean D;
    private final ax E;
    private long F;
    private static final double[] G;
    private boolean H;
    private final at I;
    private boolean J;
    private long K;
    private final ax L;
    private boolean M;
    private final ax N;
    private long O;
    private class_2338 P;
    private class_2338 Q;
    private class_3965 R;
    private static final String[] T;

    private void a(int n2, long l2) {
        block6: {
            try {
                try {
                    try {
                        if (n2 < 0 || n2 > 8) break block6;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (k.a.field_1724.method_31548().method_67532() == n2) break block6;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                k.a.field_1724.method_31548().method_61496(n2);
                k.a.field_1761.method_2911();
                this.B = n2;
                this.m = l2;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private void s() {
        this.P = null;
        this.o = null;
        this.O = 0L;
        this.J = false;
    }

    private class_3965 t() {
        block5: {
            class_239 class_2392 = k.a.field_1765;
            if (class_2392 instanceof class_3965) {
                class_3965 class_39652 = (class_3965)class_2392;
                try {
                    try {
                        if (class_39652.method_17783() != class_239.class_240.field_1332 || class_39652.method_17781()) break block5;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    return class_39652;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
        }
        return null;
    }

    private boolean a(class_2338 class_23382, class_1792 class_17922) {
        class_1799 class_17992 = this.a(class_17922);
        try {
            if (class_17992.method_7960()) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        class_3965 class_39652 = new class_3965(class_23382.method_46558().method_1031(0.0, 0.5, 0.0), class_2350.field_11036, class_23382, false);
        class_1750 class_17502 = new class_1750((class_1657)k.a.field_1724, class_1268.field_5808, class_17992, class_39652);
        return k.a.field_1687.method_8320(class_23382).method_26166(class_17502);
    }

    public static boolean u() {
        boolean bl;
        block22: {
            block21: {
                block20: {
                    block19: {
                        try {
                            block18: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (x == null || !x.b()) break block18;
                                            }
                                            catch (MatchException matchException) {
                                                throw k.a(matchException);
                                            }
                                            if (k.a.field_1724 == null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw k.a(matchException);
                                        }
                                        if (k.a.field_1687 == null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    if (k.a.field_1755 == null) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (!k.x.s && !k.x.D) break block20;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                try {
                    try {
                        if (k.x.H || !x.v()) break block21;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = x.a(x.t());
                    break block22;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(class_3965 class_39652, class_2680 class_26802, long l2) {
        class_2338 class_23382;
        block30: {
            block28: {
                class_23382 = this.t;
                try {
                    try {
                        block29: {
                            try {
                                try {
                                    if ((Integer)class_26802.method_11654((class_2769)class_4969.field_23153) != 0) break block28;
                                    if (!class_23382.equals((Object)this.Q)) break block29;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                                if (l2 - this.F < 500L) return;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                        }
                        if (l2 - this.F < (long)Math.round(this.v.g())) return;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (!this.a(class_1802.field_8801, l2)) return;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                class_3965 class_39653 = this.d(class_39652);
                try {
                    try {
                        if (class_39653 == null || !this.b(class_39653)) return;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    this.Q = class_23382;
                    this.F = l2;
                    return;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            if (!this.a(class_23382, l2)) return;
            int n2 = Math.round(this.N.g()) - 1;
            try {
                try {
                    if (!this.b(n2, l2)) return;
                    if (this.I.i()) break block30;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                this.C();
                return;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        try {
            block31: {
                try {
                    try {
                        try {
                            if (this.u) break block31;
                            if (!this.J) return;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (!this.z()) return;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (!this.a(class_23382, this.P)) return;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            if (k.a.field_1724.method_6047().method_31574(class_1802.field_8801)) return;
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        class_3965 class_39654 = this.c(class_39652);
        try {
            try {
                if (class_39654 == null || !this.b(class_39654)) return;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            this.C();
            return;
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
    }

    private class_3965 a(class_243 class_2432, class_243 class_2433) {
        return k.a.field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)k.a.field_1724));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @y
    public void a(v v2) {
        block34: {
            long l2;
            block39: {
                class_3965 class_39652;
                block38: {
                    block36: {
                        block37: {
                            boolean bl;
                            block35: {
                                try {
                                    try {
                                        try {
                                            if (k.a.field_1724 == null || k.a.field_1687 == null) break block34;
                                        }
                                        catch (MatchException matchException) {
                                            throw k.a(matchException);
                                        }
                                        if (k.a.field_1761 == null) break block34;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    if (k.a.field_1755 != null) break block34;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                                this.w = false;
                                bl = this.v();
                                try {
                                    try {
                                        if (bl || this.D) break block35;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    this.H = false;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                            }
                            if (pulsescanner.f.c.c.w()) return;
                            l2 = System.currentTimeMillis();
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.s) break block36;
                                            if (this.D) break block37;
                                        }
                                        catch (MatchException matchException) {
                                            throw k.a(matchException);
                                        }
                                        if (!bl) break block37;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    if (this.H) break block37;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                                this.B();
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                        }
                        try {
                            if (!this.D) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        class_39652 = this.R;
                        try {
                            this.D = false;
                            this.R = null;
                            if (!this.a(class_39652, l2)) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                    }
                    try {
                        this.y();
                        if (l2 - this.K <= 6000L) break block38;
                        this.C();
                        return;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                class_39652 = k.a.field_1687.method_8320(this.t);
                if (class_39652.method_27852(class_2246.field_23152)) {
                    this.M = true;
                    class_3965 class_39653 = this.b(this.t);
                    try {
                        if (class_39653 != null) {
                            this.C = class_39653;
                        }
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    try {
                        if (this.C == null) return;
                        this.a(this.C, (class_2680)class_39652, l2);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                try {
                    if (!this.M) break block39;
                    this.C();
                    return;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            this.b(l2);
            return;
        }
        this.A();
    }

    private boolean a(class_3965 class_39652, class_2338 class_23382, class_1792 class_17922) {
        block13: {
            boolean bl;
            block15: {
                block14: {
                    try {
                        try {
                            try {
                                if (class_39652 == null || class_23382 == null) break block13;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (class_39652.method_17783() != class_239.class_240.field_1332) break block13;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (class_39652.method_17781()) break block13;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    class_1799 class_17992 = this.a(class_17922);
                    try {
                        if (class_17992.method_7960()) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    class_1750 class_17502 = new class_1750((class_1657)k.a.field_1724, class_1268.field_5808, class_17992, class_39652);
                    try {
                        try {
                            if (!class_17502.method_8037().equals((Object)class_23382) || !class_17502.method_7716()) break block14;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        bl = true;
                        break block15;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private boolean v() {
        boolean bl;
        block9: {
            int n2;
            block7: {
                block8: {
                    n2 = this.p.j();
                    try {
                        if (n2 < 0) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    try {
                        try {
                            if (n2 > 7) break block7;
                            if (GLFW.glfwGetMouseButton((long)a.method_22683().method_4490(), (int)n2) != 1) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                bl = false;
                break block9;
            }
            bl = class_3675.method_15987((class_1041)a.method_22683(), (int)n2);
        }
        return bl;
    }

    public k() {
        String[] stringArray = T;
        super(stringArray[5], stringArray[3]);
        this.p = new av(this, stringArray[1], 1);
        this.E = new ax(this, stringArray[6], 0.0f, 0.0f, 500.0f, 5.0f);
        this.v = new ax(this, stringArray[7], 0.0f, 0.0f, 500.0f, 5.0f);
        this.N = new ax(this, stringArray[0], 1.0f, 1.0f, 9.0f, 1.0f);
        this.L = new ax(this, stringArray[2], 0.0f, 0.0f, 1.0f, 0.05f);
        this.I = new at(this, stringArray[4], true);
        this.B = -1;
        x = this;
    }

    private ak a(class_243 class_2432) {
        class_243 class_2433 = class_2432.method_1020(k.a.field_1724.method_33571());
        return new ak((float)(Math.toDegrees(Math.atan2(class_2433.field_1350, class_2433.field_1352)) - 90.0), (float)(-Math.toDegrees(Math.atan2(class_2433.field_1351, Math.hypot(class_2433.field_1352, class_2433.field_1350)))));
    }

    private class_3965 b(class_2338 class_23382, class_1792 class_17922) {
        class_2338 class_23383;
        try {
            if (!this.a(class_23382, class_17922)) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        for (class_2350 class_23502 : class_2350.values()) {
            class_23383 = class_23382.method_10093(class_23502);
            class_2680 class_26802 = k.a.field_1687.method_8320(class_23383);
            try {
                try {
                    try {
                        if (!class_26802.method_26212((class_1922)k.a.field_1687, class_23383) || class_26802.method_31709()) continue;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (class_26802.method_27852(class_2246.field_23152)) continue;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                if (class_26802.method_27852(class_2246.field_9980)) continue;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            class_3965 class_39652 = this.a(class_23383, class_23502.method_10153());
            try {
                try {
                    if (class_39652 == null || !this.a(class_39652, class_23382, class_17922)) continue;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                return class_39652;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        for (class_2350 class_23502 : class_2350.values()) {
            class_23383 = this.a(class_23382, class_23502);
            try {
                try {
                    if (class_23383 == null || !this.a((class_3965)class_23383, class_23382, class_17922)) continue;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                return class_23383;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        return null;
    }

    private boolean a(long l2) {
        boolean bl;
        block5: {
            block4: {
                int n2 = k.a.field_1724.method_31548().method_67532();
                try {
                    try {
                        if (n2 == this.B && l2 - this.m < (long)Math.round(this.E.g())) break block4;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean a(class_3965 class_39652) {
        block12: {
            block14: {
                boolean bl;
                block16: {
                    block15: {
                        block13: {
                            try {
                                try {
                                    try {
                                        if (class_39652 == null || !this.w()) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    if (!k.a.field_1687.method_8320(class_39652.method_17777()).method_27852(class_2246.field_23152)) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                        }
                        class_1799 class_17992 = k.a.field_1724.method_6047();
                        try {
                            if (class_17992.method_7960() || this.b(class_1802.field_8801) == -1) break block14;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        class_1750 class_17502 = new class_1750((class_1657)k.a.field_1724, class_1268.field_5808, class_17992, class_39652);
                        try {
                            try {
                                if (!class_17502.method_7716() || !this.a(class_17502.method_8037())) break block15;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            bl = true;
                            break block16;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                    }
                    bl = false;
                }
                return bl;
            }
            return false;
        }
        return false;
    }

    @Override
    protected void o() {
        this.A();
        super.o();
    }

    private class_1799 a(class_1792 class_17922) {
        class_1799 class_17992;
        try {
            if (class_17922 == null) {
                return class_1799.field_8037;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        int n2 = this.b(class_17922);
        try {
            class_17992 = n2 == -1 ? class_1799.field_8037 : k.a.field_1724.method_31548().method_5438(n2);
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        return class_17992;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @y(a=-500)
    public void a(q q2) {
        block8: {
            try {
                if (q2.c()) return;
                if (!q2.f()) break block8;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            class_2596<?> class_25962 = q2.d();
            if (!(class_25962 instanceof class_2828)) return;
            class_2828 class_28282 = (class_2828)class_25962;
            try {
                try {
                    if (k.a.field_1724 == null || !class_28282.method_36172()) return;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                this.q = class_28282.method_12271(k.a.field_1724.method_36454());
                this.z = class_28282.method_12270(k.a.field_1724.method_36455());
                this.A = true;
                return;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        class_2596<?> class_25963 = q2.d();
        if (class_25963 instanceof class_2626) {
            class_2626 class_26262 = (class_2626)class_25963;
            this.b(class_26262.method_11309(), class_26262.method_11308());
            return;
        } else {
            class_25963 = q2.d();
            if (!(class_25963 instanceof class_2637)) return;
            class_2637 class_26372 = (class_2637)class_25963;
            class_26372.method_30621(this::b);
        }
    }

    /*
     * Exception decompiling
     */
    private class_3965 a(class_2338 var1_1, class_2350 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 12[SWITCH]
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

    private boolean a(class_2338 class_23382) {
        boolean bl;
        block9: {
            block8: {
                class_238 class_2382 = new class_238(class_23382);
                try {
                    try {
                        try {
                            try {
                                if (!k.a.field_1687.method_24794(class_23382) || !k.a.field_1687.method_8621().method_11952(class_23382)) break block8;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (k.a.field_1724.method_5829().method_994(class_2382)) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (!k.a.field_1687.method_8333(null, class_2382, k::lambda$isPlacementSpaceClear$0).isEmpty()) break block8;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = true;
                    break block9;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    protected void p() {
        this.A();
        super.p();
    }

    private class_3965 a(float f2, float f3) {
        class_243 class_2432 = k.a.field_1724.method_33571();
        class_243 class_2433 = pulsescanner.a.k.a(f2, f3);
        class_2433 = class_2433.method_1021(k.a.field_1724.method_55754());
        class_243 class_2434 = class_2432.method_1019(class_2433);
        return this.a(class_2432, class_2434);
    }

    private boolean a(class_1792 class_17922, long l2) {
        boolean bl;
        try {
            if (class_17922 == null) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        try {
            if (k.a.field_1724.method_6047().method_31574(class_17922)) {
                return this.a(l2);
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        int n2 = this.b(class_17922);
        try {
            if (n2 == -1) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        try {
            this.a(n2, l2);
            bl = this.E.g() <= 0.0f;
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        return bl;
    }

    private boolean a(class_2338 class_23382, class_2680 class_26802) {
        block13: {
            boolean bl;
            block15: {
                block14: {
                    try {
                        try {
                            if (class_26802.method_26215() || class_26802.method_45474()) break block13;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (class_26802.method_27852(class_2246.field_23152)) break block13;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    class_265 class_2652 = class_26802.method_26220((class_1922)k.a.field_1687, class_23382);
                    try {
                        if (class_2652.method_1110()) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    class_238 class_2382 = class_2652.method_1107();
                    try {
                        try {
                            try {
                                if (!(class_2382.method_17939() >= 0.9) || !(class_2382.method_17940() >= 0.9)) break block14;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (!(class_2382.method_17941() >= 0.9)) break block14;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        bl = true;
                        break block15;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private boolean w() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (k.a.field_1724 == null || !k.a.field_1724.method_6047().method_31574(class_1802.field_23141)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private int b(class_1792 class_17922) {
        int n2 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n2 >= 9) break;
                        if (!k.a.field_1724.method_31548().method_5438(n2).method_31574(class_17922)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    return n2;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            ++n2;
        }
        return -1;
    }

    @y
    public void a(s s2) {
        block8: {
            int n2 = this.p.j();
            try {
                try {
                    try {
                        try {
                            if (k.a.field_1755 != null || n2 <= 7) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (s2.b() != n2) break block8;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (!this.v()) break block8;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                this.B();
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private boolean b(int n2, long l2) {
        block8: {
            boolean bl;
            block9: {
                try {
                    try {
                        try {
                            if (n2 < 0 || n2 > 8) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (k.a.field_1724.method_31548().method_67532() != n2) break block9;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    return this.a(l2);
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            try {
                this.a(n2, l2);
                bl = this.E.g() <= 0.0f;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            return bl;
        }
        return false;
    }

    private class_3965 b(class_2338 class_23382) {
        block9: {
            class_3965 class_39652 = this.a(k.a.field_1724.method_36455(), k.a.field_1724.method_36454());
            try {
                try {
                    try {
                        if (class_39652.method_17783() != class_239.class_240.field_1332 || class_39652.method_17781()) break block9;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (!class_39652.method_17777().equals((Object)class_23382)) break block9;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                return class_39652;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        for (class_2350 class_23502 : class_2350.values()) {
            class_3965 class_39653 = this.a(class_23382, class_23502);
            try {
                if (class_39653 == null) continue;
                return class_39653;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        return null;
    }

    private boolean b(class_3965 class_39652) {
        try {
            if (this.w) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        this.w = true;
        class_1269 class_12692 = k.a.field_1761.method_2896(k.a.field_1724, class_1268.field_5808, class_39652);
        try {
            if (!class_12692.method_23665()) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        k.a.field_1724.method_6104(class_1268.field_5808);
        return true;
    }

    private class_2338 c(class_2338 class_23382) {
        class_2338 class_23383 = k.a.field_1724.method_24515();
        class_2338 class_23384 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                int n2 = Math.abs(i2) + Math.abs(i3);
                try {
                    if (n2 < 1 || n2 > 2) continue;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                class_2338 class_23385 = class_23383.method_10069(i2, 0, i3);
                try {
                    if (!this.a(class_23382, class_23385) || !this.a(class_23385, k.a.field_1687.method_8320(class_23385))) continue;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                double d3 = class_23385.method_46558().method_1025(k.a.field_1724.method_73189());
                if (d3 >= d2) continue;
                d2 = d3;
                class_23384 = class_23385;
            }
        }
        return class_23384;
    }

    private void x() {
        block4: {
            try {
                try {
                    this.t = null;
                    this.n = null;
                    this.C = null;
                    this.M = false;
                    this.y = 0L;
                    this.Q = null;
                    this.u = false;
                    this.s();
                    if (!this.r || pulsescanner.a.d.e != 35) break block4;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                pulsescanner.a.d.c = pulsescanner.a.a.RESET;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        this.r = false;
    }

    private void y() {
        af.a(75L);
        k.a.field_1690.field_1904.method_23481(false);
    }

    @y
    public void a(t t2) {
        block12: {
            int n2 = this.p.j();
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (t2.d() != null || n2 < 0) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                                if (n2 > 7) break block12;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (t2.b() != n2) break block12;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (t2.c() != 1) break block12;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (af.a(n2)) break block12;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                this.B();
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private boolean a(class_3965 class_39652, class_3965 class_39653) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (class_39652.method_17783() != class_239.class_240.field_1332 || class_39652.method_17781()) break block8;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (!class_39652.method_17777().equals((Object)class_39653.method_17777())) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (class_39652.method_17780() != class_39653.method_17780()) break block8;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = true;
                    break block9;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean z() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.P == null || !this.a(this.P, k.a.field_1687.method_8320(this.P))) break block4;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean a(class_2338 class_23382, long l2) {
        class_3965 class_39652;
        block69: {
            class_2338 class_23383;
            block65: {
                Object object;
                block67: {
                    block66: {
                        block63: {
                            block64: {
                                block61: {
                                    try {
                                        if (Math.abs(class_23382.method_10264() - k.a.field_1724.method_24515().method_10264()) >= 1) {
                                            this.P = null;
                                            this.o = null;
                                            this.O = 0L;
                                            this.J = false;
                                            this.u = true;
                                            return true;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    this.u = false;
                                    class_2338 class_23384 = this.c(class_23382);
                                    try {
                                        if (class_23384 != null) {
                                            this.P = class_23384;
                                            this.o = null;
                                            this.O = 0L;
                                            this.J = true;
                                            return true;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    try {
                                        block62: {
                                            try {
                                                try {
                                                    try {
                                                        if (this.P == null) break block61;
                                                        if (!this.a(class_23382, this.P)) break block62;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw k.a(matchException);
                                                    }
                                                    if (!this.J) break block61;
                                                }
                                                catch (MatchException matchException) {
                                                    throw k.a(matchException);
                                                }
                                                if (this.z()) break block61;
                                            }
                                            catch (MatchException matchException) {
                                                throw k.a(matchException);
                                            }
                                        }
                                        this.s();
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (this.P == null || this.O == 0L) break block63;
                                        }
                                        catch (MatchException matchException) {
                                            throw k.a(matchException);
                                        }
                                        if (!this.z()) break block64;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                    this.J = true;
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                            }
                            try {
                                if (l2 - this.O < 500L) {
                                    return false;
                                }
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            this.s();
                        }
                        try {
                            try {
                                if (this.P != null) break block65;
                                k k2 = this;
                                if (this.b(class_1802.field_8801) == -1) break block66;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            object = class_1802.field_8801;
                            break block67;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                    }
                    try {
                        object = this.b(class_1802.field_8281) != -1 ? class_1802.field_8281 : null;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                try {
                    k2.o = object;
                    if (this.o == null) {
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                class_23383 = k.a.field_1724.method_24515();
                double d2 = Double.MAX_VALUE;
                for (int i2 = -2; i2 <= 2; ++i2) {
                    for (int i3 = -2; i3 <= 2; ++i3) {
                        int n2 = Math.abs(i2) + Math.abs(i3);
                        try {
                            if (n2 < 1 || n2 > 2) continue;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        class_2338 class_23385 = class_23383.method_10069(i2, 0, i3);
                        try {
                            try {
                                if (!this.a(class_23382, class_23385) || !this.d(class_23385)) continue;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (this.b(class_23385, this.o) == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        double d3 = class_23385.method_46558().method_1025(k.a.field_1724.method_73189());
                        if (d3 >= d2) continue;
                        d2 = d3;
                        this.P = class_23385;
                        this.J = false;
                    }
                }
            }
            try {
                if (this.P == null) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                if (!this.d(this.P)) {
                    this.s();
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                if (!this.a(this.o, l2)) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            class_23383 = this.b(this.P, this.o);
            try {
                if (class_23383 == null) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            class_39652 = this.d((class_3965)class_23383);
            try {
                block68: {
                    try {
                        try {
                            if (class_39652 == null || !this.a(class_39652, this.P, this.o)) break block68;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (this.d(this.P)) break block69;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                return false;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        try {
            if (!this.b(class_39652)) {
                this.s();
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        this.O = l2;
        this.J = this.z();
        return false;
    }

    @y
    public void a(w w2) {
        this.A();
    }

    @y
    public void a(p p2) {
        block8: {
            try {
                try {
                    try {
                        try {
                            if (!this.r || k.a.field_1724 == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (pulsescanner.a.d.e != 35) break block8;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (pulsescanner.a.d.c != pulsescanner.a.a.AIM) break block8;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                ag.a(p2, k.a.field_1724.method_36454(), k.a.field_1773.method_19418().method_19330());
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private boolean a(class_2338 class_23382, class_2338 class_23383) {
        block8: {
            boolean bl;
            block10: {
                block9: {
                    try {
                        if (class_23383 == null || class_23382.equals((Object)class_23383)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    class_243 class_2432 = class_23382.method_46558();
                    class_243 class_2433 = k.a.field_1724.method_73189().method_1031(0.0, 0.5, 0.0);
                    class_238 class_2382 = new class_238(class_23383);
                    try {
                        try {
                            try {
                                if (class_2382.method_994(k.a.field_1724.method_5829()) || class_2382.method_1006(class_2432)) break block9;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (!class_2382.method_992(class_2432, class_2433).isPresent()) break block9;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        bl = true;
                        break block10;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private boolean b(long l2) {
        class_3965 class_39652;
        block24: {
            block22: {
                try {
                    try {
                        if (this.y == 0L || l2 - this.y >= 500L) break block22;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            try {
                if (!this.a(class_1802.field_23141, l2)) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                if (!this.a(this.n, this.t, class_1802.field_23141)) {
                    this.n = this.b(this.t, class_1802.field_23141);
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            try {
                if (this.n == null) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            class_39652 = this.d(this.n);
            try {
                block23: {
                    try {
                        try {
                            if (class_39652 == null || !this.a(class_39652, this.t, class_1802.field_23141)) break block23;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (this.a(this.t)) break block24;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                return false;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
        try {
            if (!this.b(class_39652)) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        this.y = l2;
        return k.a.field_1687.method_8320(this.t).method_27852(class_2246.field_23152);
    }

    private void a(ak ak2) {
        this.r = true;
        float f2 = this.L.g();
        pulsescanner.a.d.a(ak2, class_3532.method_16439((float)f2, (float)180.0f, (float)65.0f), class_3532.method_16439((float)f2, (float)180.0f, (float)70.0f), class_3532.method_16439((float)f2, (float)180.0f, (float)50.0f), class_3532.method_16439((float)f2, (float)180.0f, (float)55.0f), 1, 35, false);
    }

    private void A() {
        this.s = false;
        this.D = false;
        this.H = false;
        this.R = null;
        this.K = 0L;
        this.F = 0L;
        this.m = 0L;
        this.B = -1;
        this.w = false;
        this.A = false;
        this.q = 0.0f;
        this.z = 0.0f;
        this.x();
    }

    private boolean d(class_2338 class_23382) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.o == null || !this.a(class_23382)) break block6;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (!this.a(class_23382, this.o)) break block6;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_3965 c(class_3965 class_39652) {
        try {
            if (pulsescanner.a.d.e > 35) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        class_3965 class_39653 = this.d(class_39652);
        try {
            if (class_39653 != null) {
                return class_39653;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        try {
            try {
                try {
                    if (this.u) return null;
                    if (!this.J) return null;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                if (this.P == null) return null;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            if (!this.z()) return null;
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        double d2 = k.a.field_1724.method_55754();
        try {
            if (k.a.field_1724.method_33571().method_1025(class_39652.method_17784()) > d2 * d2) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        ak ak2 = this.a(class_39652.method_17784());
        try {
            if (!this.A) return null;
            if (new ak((class_1297)k.a.field_1724).a(ak2) > 1.5f) return null;
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
        }
        if (new ak(this.q, this.z).a(ak2) > 2.5f) return null;
        class_3965 class_39654 = class_39652;
        return class_39654;
    }

    private void B() {
        block15: {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (k.a.field_1724 == null || k.a.field_1687 == null) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                                if (k.a.field_1761 == null) break block15;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (this.s) break block15;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (this.D) break block15;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (pulsescanner.f.c.c.w()) break block15;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                if (!this.w()) break block15;
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
            class_3965 class_39652 = this.t();
            try {
                if (this.a(class_39652)) {
                    this.R = class_39652;
                    this.D = true;
                    this.H = true;
                }
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private class_3965 d(class_3965 class_39652) {
        block7: {
            block8: {
                try {
                    if (class_39652 == null || pulsescanner.a.d.e > 35) break block7;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                class_3965 class_39653 = this.a(k.a.field_1724.method_36455(), k.a.field_1724.method_36454());
                if (this.A) {
                    class_3965 class_39654 = this.a(this.z, this.q);
                    try {
                        try {
                            if (!this.a(class_39653, class_39652) || !this.a(class_39654, class_39652)) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        this.a(new ak((class_1297)k.a.field_1724));
                        return class_39653;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
            }
            this.a(this.a(class_39652.method_17784()));
            return null;
        }
        return null;
    }

    private boolean a(class_3965 class_39652, long l2) {
        block13: {
            block15: {
                class_2338 class_23382;
                block17: {
                    class_1750 class_17502;
                    block16: {
                        block14: {
                            try {
                                if (class_39652 == null || !this.w()) break block13;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            this.x();
                            class_2680 class_26802 = k.a.field_1687.method_8320(class_39652.method_17777());
                            try {
                                if (!class_26802.method_27852(class_2246.field_23152)) break block14;
                                this.t = class_39652.method_17777().method_10062();
                                this.C = class_39652;
                                this.M = true;
                                break block15;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                        }
                        class_1799 class_17992 = k.a.field_1724.method_6047();
                        try {
                            if (class_17992.method_7960()) {
                                return false;
                            }
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        class_17502 = new class_1750((class_1657)k.a.field_1724, class_1268.field_5808, class_17992, class_39652);
                        class_23382 = class_17502.method_8037().method_10062();
                        class_2680 class_26803 = k.a.field_1687.method_8320(class_23382);
                        try {
                            if (!class_26803.method_27852(class_2246.field_23152)) break block16;
                            this.t = class_23382;
                            this.C = this.b(class_23382);
                            this.M = true;
                            break block15;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (class_17502.method_7716() && this.a(class_23382)) break block17;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        return false;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                }
                this.t = class_23382;
                this.n = class_39652;
            }
            this.K = l2;
            this.s = true;
            this.H = true;
            return true;
        }
        return false;
    }

    private void C() {
        block5: {
            block4: {
                try {
                    try {
                        this.s = false;
                        this.D = false;
                        this.R = null;
                        this.K = 0L;
                        if (k.a.field_1724 == null || !this.v()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    this.H = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
            }
            this.H = false;
        }
        this.x();
    }

    private void b(class_2338 class_23382, class_2680 class_26802) {
        class_2338 class_23383 = class_23382.method_10062();
        class_638 class_6382 = k.a.field_1687;
        a.execute(() -> this.lambda$handleBlockUpdate$1(class_6382, class_23383, class_26802));
    }

    private void lambda$handleBlockUpdate$1(class_638 class_6382, class_2338 class_23382, class_2680 class_26802) {
        block10: {
            try {
                try {
                    try {
                        try {
                            try {
                                if (!this.b() || class_6382 == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw k.a(matchException);
                            }
                            if (k.a.field_1687 != class_6382) break block10;
                        }
                        catch (MatchException matchException) {
                            throw k.a(matchException);
                        }
                        if (this.P == null) break block10;
                    }
                    catch (MatchException matchException) {
                        throw k.a(matchException);
                    }
                    if (!this.P.equals((Object)class_23382)) break block10;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                this.J = this.a(class_23382, class_26802);
            }
            catch (MatchException matchException) {
                throw k.a(matchException);
            }
        }
    }

    private static boolean lambda$isPlacementSpaceClear$0(class_1297 class_12972) {
        boolean bl;
        try {
            bl = !class_12972.method_7325();
        }
        catch (MatchException matchException) {
            throw k.a(matchException);
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
                var2_2 = ":|pX@d^:gvX\u000e(hmEUm\n\u0000dw\fhi\u0007\b;dmMWe\u0011\u0007O9gxOF\u007f^\be9MMo\u0016\u0006y5\f@c\b\fyj\fZc\u000b\u001b+uID\u007f^\u001ebmD\u0003m^\u000bgvOH ^\u001dc|B\u0003o\u0016\by~IP,\u001f\u0007o9HFx\u0011\u0007jmIP,\u0017\u001d%\f(~mC\u0003I\u0006\u0019gvHF\u000b:j\u007fI\u0003M\u0010\ncv^";
                var4_3 = ":|pX@d^:gvX\u000e(hmEUm\n\u0000dw\fhi\u0007\b;dmMWe\u0011\u0007O9gxOF\u007f^\be9MMo\u0016\u0006y5\f@c\b\fyj\fZc\u000b\u001b+uID\u007f^\u001ebmD\u0003m^\u000bgvOH ^\u001dc|B\u0003o\u0016\by~IP,\u001f\u0007o9HFx\u0011\u0007jmIP,\u0017\u001d%\f(~mC\u0003I\u0006\u0019gvHF\u000b:j\u007fI\u0003M\u0010\ncv^".length();
                var1_4 = 11;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 69;
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
                    var2_2 = "%f}ER\f\"kpVLaV%f}ER";
                    var4_3 = "%f}ER\f\"kpVLaV%f}ER".length();
                    var1_4 = 5;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 77;
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
                        v11 = 44;
                        break;
                    }
                    case 1: {
                        v11 = 78;
                        break;
                    }
                    case 2: {
                        v11 = 92;
                        break;
                    }
                    case 3: {
                        v11 = 105;
                        break;
                    }
                    case 4: {
                        v11 = 102;
                        break;
                    }
                    case 5: {
                        v11 = 73;
                        break;
                    }
                    default: {
                        v11 = 59;
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
        k.T = var5;
        k.G = new double[]{0.5, 0.2, 0.8};
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

