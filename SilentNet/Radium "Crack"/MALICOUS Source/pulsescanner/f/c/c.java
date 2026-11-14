/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_2885
 *  net.minecraft.class_3675
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4969
 *  net.minecraft.class_7204
 *  org.lwjgl.glfw.GLFW
 */
package pulsescanner.f.c;

import java.lang.invoke.LambdaMetafactory;
import net.minecraft.class_1041;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_2885;
import net.minecraft.class_3675;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_7204;
import org.lwjgl.glfw.GLFW;
import pulsescanner.a.af;
import pulsescanner.a.as;
import pulsescanner.a.av;
import pulsescanner.a.j;
import pulsescanner.a.s;
import pulsescanner.a.v;
import pulsescanner.a.w;
import pulsescanner.a.y;
import pulsescanner.f.c.k;
import pulsescanner.f.c.n;
import pulsescanner.f.c.p;
import pulsescanner.f.c.q;
import pulsescanner.f.c.t;

public class c
extends as {
    private int m;
    private int n;
    public final av o;
    private int p;
    private int q;
    private class_2338 r;
    private static c s;
    private boolean t;
    private static final String[] u;

    private class_3965 s() {
        class_3965 class_39652;
        block5: {
            block4: {
                class_3965 class_39653 = this.A();
                try {
                    try {
                        if (class_39653 == null || !class_39653.method_17777().method_10093(class_39653.method_17780()).equals((Object)this.r)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    class_39652 = class_39653;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            class_39652 = null;
        }
        return class_39652;
    }

    private void d(int n2) {
        this.n = n2;
        this.p = pulsescanner.f.c.c.a.field_1724.field_6012;
    }

    private int a(class_1792 class_17922) {
        int n2 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n2 >= 9) break;
                        if (!pulsescanner.f.c.c.a.field_1724.method_31548().method_5438(n2).method_31574(class_17922)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    return n2;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            ++n2;
        }
        return -1;
    }

    private boolean a(class_3965 class_39652) {
        class_1269 class_12692 = pulsescanner.f.c.c.a.field_1761.method_2896(pulsescanner.f.c.c.a.field_1724, class_1268.field_5808, class_39652);
        try {
            if (!class_12692.method_23665()) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.c.a(matchException);
        }
        pulsescanner.f.c.c.a.field_1724.method_6104(class_1268.field_5808);
        return true;
    }

    @y
    public void a(s s2) {
        block6: {
            int n2 = this.o.j();
            try {
                try {
                    try {
                        if (pulsescanner.f.c.c.a.field_1755 != null || n2 <= 7) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    if (s2.b() != n2) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
                this.m = 4;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.c.a(matchException);
            }
        }
    }

    public c() {
        String[] stringArray = u;
        super(stringArray[1], stringArray[0]);
        this.o = new av(this, stringArray[2], 1);
        this.q = -1;
        s = this;
    }

    private class_3965 t() {
        class_3965 class_39652;
        block5: {
            block4: {
                class_3965 class_39653 = this.z();
                try {
                    try {
                        if (class_39653 == null || !class_39653.method_17777().equals((Object)this.r)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    class_39652 = class_39653;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            class_39652 = null;
        }
        return class_39652;
    }

    private boolean u() {
        boolean bl;
        block9: {
            int n2;
            block7: {
                block8: {
                    n2 = this.o.j();
                    try {
                        if (n2 < 0) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    try {
                        try {
                            if (n2 > 7) break block7;
                            if (GLFW.glfwGetMouseButton((long)a.method_22683().method_4490(), (int)n2) != 1) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.c.a(matchException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                }
                bl = false;
                break block9;
            }
            bl = class_3675.method_15987((class_1041)a.method_22683(), (int)n2);
        }
        return bl;
    }

    public static boolean v() {
        boolean bl;
        block19: {
            block18: {
                block17: {
                    try {
                        block16: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (s == null || !s.b()) break block16;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.c.a(matchException);
                                            }
                                            if (pulsescanner.f.c.c.a.field_1724 == null) break block16;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.c.a(matchException);
                                        }
                                        if (pulsescanner.f.c.c.a.field_1687 == null) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.c.a(matchException);
                                    }
                                    if (pulsescanner.f.c.c.a.field_1755 != null) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.c.a(matchException);
                                }
                                if (s.x()) break block17;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.c.a(matchException);
                            }
                        }
                        return false;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                }
                try {
                    if (pulsescanner.f.c.c.s.n == 0) break block18;
                    bl = true;
                    break block19;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            try {
                bl = s.A() != null;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.c.a(matchException);
            }
        }
        return bl;
    }

    public static boolean w() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (s == null || !s.b()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.c.a(matchException);
                        }
                        if (pulsescanner.f.c.c.s.n == 0) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @y
    public void a(pulsescanner.a.t t2) {
        block10: {
            int n2 = this.o.j();
            try {
                try {
                    try {
                        try {
                            try {
                                if (t2.d() != null || n2 < 0) break block10;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.c.a(matchException);
                            }
                            if (n2 > 7) break block10;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.c.a(matchException);
                        }
                        if (t2.b() != n2) break block10;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    if (t2.c() != 1) break block10;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
                this.m = 4;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.c.a(matchException);
            }
        }
    }

    @Override
    protected void p() {
        this.b(true);
        this.t = false;
    }

    @y
    public void a(w w2) {
        this.b(false);
        this.t = false;
    }

    private boolean x() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.m <= 0 && !this.u()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void y() {
        af.a(75L);
        pulsescanner.f.c.c.a.field_1690.field_1904.method_23481(false);
    }

    @y
    public void a(v v2) {
        block44: {
            block42: {
                block50: {
                    block46: {
                        class_3965 class_39652;
                        block49: {
                            block48: {
                                boolean bl;
                                block45: {
                                    block43: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (pulsescanner.f.c.c.a.field_1724 == null || pulsescanner.f.c.c.a.field_1687 == null) break block42;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.c.c.a(matchException);
                                                        }
                                                        if (pulsescanner.f.c.c.a.field_1761 == null) break block42;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.c.c.a(matchException);
                                                    }
                                                    if (pulsescanner.f.c.c.a.field_1755 != null) break block42;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.c.a(matchException);
                                                }
                                                if (this.m <= 0) break block43;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.c.a(matchException);
                                            }
                                            --this.m;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.c.a(matchException);
                                        }
                                    }
                                    try {
                                        if (this.n == 0 && k.u()) break block44;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.c.a(matchException);
                                    }
                                    bl = this.x();
                                    try {
                                        if (!bl) {
                                            this.t = false;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.c.a(matchException);
                                    }
                                    try {
                                        try {
                                            if (this.n == 0 || !pulsescanner.f.c.t.s()) break block45;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.c.a(matchException);
                                        }
                                        this.b(true);
                                        break block44;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.c.a(matchException);
                                    }
                                }
                                try {
                                    block47: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (this.n != 0) break block46;
                                                                if (!bl) break block47;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.c.a(matchException);
                                                            }
                                                            if (this.t) break block47;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.c.c.a(matchException);
                                                        }
                                                        if (pulsescanner.f.c.t.s()) break block47;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.c.c.a(matchException);
                                                    }
                                                    if (pulsescanner.f.c.n.w()) break block47;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.c.a(matchException);
                                                }
                                                if (pulsescanner.f.c.q.s()) break block47;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.c.a(matchException);
                                            }
                                            if (!pulsescanner.f.c.p.s()) break block48;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.c.a(matchException);
                                        }
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.c.a(matchException);
                                }
                            }
                            class_39652 = this.A();
                            try {
                                if (class_39652 == null) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.c.a(matchException);
                            }
                            try {
                                try {
                                    if (this.a(class_1802.field_23141) != -1 && this.a(class_1802.field_8801) != -1) break block49;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.c.a(matchException);
                                }
                                return;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.c.a(matchException);
                            }
                        }
                        this.r = class_39652.method_17777().method_10093(class_39652.method_17780()).method_10062();
                        this.q = pulsescanner.f.c.c.a.field_1724.method_31548().method_67532();
                        this.n = 1;
                        this.p = pulsescanner.f.c.c.a.field_1724.field_6012;
                        this.t = true;
                        this.m = 0;
                    }
                    try {
                        this.y();
                        if (pulsescanner.f.c.c.a.field_1724.field_6012 - this.p <= 40) break block50;
                        this.b(true);
                        break block44;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                }
                this.B();
                break block44;
            }
            this.b(true);
        }
    }

    private class_3965 z() {
        class_3965 class_39652;
        block5: {
            block4: {
                class_243 class_2432 = pulsescanner.f.c.c.a.field_1724.method_33571();
                double d2 = pulsescanner.f.c.c.a.field_1724.method_55754();
                float f2 = pulsescanner.f.c.c.a.field_1773.method_19418().method_19329();
                float f3 = pulsescanner.f.c.c.a.field_1773.method_19418().method_19330();
                class_243 class_2433 = pulsescanner.a.k.a(f2, f3);
                class_3965 class_39653 = pulsescanner.f.c.c.a.field_1687.method_17742(new class_3959(class_2432, class_2432.method_1019(class_2433.method_1021(d2)), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)pulsescanner.f.c.c.a.field_1724));
                try {
                    try {
                        if (class_39653.method_17783() != class_239.class_240.field_1332 || class_39653.method_17781()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    class_39652 = class_39653;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            class_39652 = null;
        }
        return class_39652;
    }

    private void b(boolean bl) {
        block6: {
            try {
                try {
                    try {
                        if (!bl || pulsescanner.f.c.c.a.field_1724 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    if (this.q < 0) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
                pulsescanner.a.j.a(this.q);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.c.a(matchException);
            }
        }
        this.r = null;
        this.n = 0;
        this.q = -1;
        this.p = 0;
        this.m = 0;
    }

    private boolean b(class_1792 class_17922) {
        try {
            if (pulsescanner.f.c.c.a.field_1724.method_6047().method_31574(class_17922)) {
                return true;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.c.a(matchException);
        }
        int n2 = this.a(class_17922);
        try {
            if (n2 == -1) {
                return false;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.c.a(matchException);
        }
        pulsescanner.a.j.a(n2);
        return false;
    }

    private class_3965 A() {
        class_3965 class_39652;
        block10: {
            block9: {
                class_3965 class_39653 = this.z();
                try {
                    if (class_39653 == null) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
                class_2338 class_23382 = class_39653.method_17777().method_10093(class_39653.method_17780());
                try {
                    try {
                        try {
                            if (!pulsescanner.f.c.c.a.field_1687.method_24794(class_23382) || !pulsescanner.f.c.c.a.field_1687.method_8621().method_11952(class_23382)) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.c.a(matchException);
                        }
                        if (!pulsescanner.f.c.c.a.field_1687.method_8320(class_23382).method_45474()) break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    class_39652 = class_39653;
                    break block10;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            class_39652 = null;
        }
        return class_39652;
    }

    /*
     * Unable to fully structure code
     */
    private void B() {
        block104: {
            block127: {
                block125: {
                    block126: {
                        block124: {
                            block123: {
                                block117: {
                                    block122: {
                                        block121: {
                                            block119: {
                                                block118: {
                                                    block113: {
                                                        block116: {
                                                            block115: {
                                                                block114: {
                                                                    block107: {
                                                                        block112: {
                                                                            block111: {
                                                                                block109: {
                                                                                    block108: {
                                                                                        block102: {
                                                                                            block106: {
                                                                                                block105: {
                                                                                                    block103: {
                                                                                                        block128: {
                                                                                                            block101: {
                                                                                                                block100: {
                                                                                                                    var1_1 = pulsescanner.f.c.t.y();
                                                                                                                    try {
                                                                                                                        v0 = this;
                                                                                                                        if (var1_1 != null) break block100;
                                                                                                                        if (v0.n == 1) {
                                                                                                                        }
                                                                                                                        ** GOTO lbl13
                                                                                                                    }
                                                                                                                    catch (MatchException v1) {
                                                                                                                        throw pulsescanner.f.c.c.a(v1);
                                                                                                                    }
                                                                                                                    var2_2 = this.s();
                                                                                                                    try {
                                                                                                                        if (var1_1 == null) break block101;
lbl13:
                                                                                                                        // 2 sources

                                                                                                                        v0 = this;
                                                                                                                    }
                                                                                                                    catch (MatchException v2) {
                                                                                                                        throw pulsescanner.f.c.c.a(v2);
                                                                                                                    }
                                                                                                                }
                                                                                                                var2_2 = v0.t();
                                                                                                            }
                                                                                                            if (var2_2 != null) break block128;
                                                                                                            var3_3 = this.u();
                                                                                                            this.b(true);
                                                                                                            this.t = var3_3;
                                                                                                            if (var1_1 == null) break block104;
                                                                                                        }
                                                                                                        var3_4 = pulsescanner.f.c.c.a.field_1687.method_8320(this.r);
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v3 = this.n;
                                                                                                                            if (var1_1 != null) break block102;
                                                                                                                            if (v3 == 1) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl76
                                                                                                                        }
                                                                                                                        catch (MatchException v4) {
                                                                                                                            throw pulsescanner.f.c.c.a(v4);
                                                                                                                        }
                                                                                                                        v5 = var3_4.method_45474();
                                                                                                                        if (var1_1 != null) break block103;
                                                                                                                    }
                                                                                                                    catch (MatchException v6) {
                                                                                                                        throw pulsescanner.f.c.c.a(v6);
                                                                                                                    }
                                                                                                                    if (!v5) break block104;
                                                                                                                }
                                                                                                                catch (MatchException v7) {
                                                                                                                    throw pulsescanner.f.c.c.a(v7);
                                                                                                                }
                                                                                                                v8 = this;
                                                                                                                if (var1_1 != null) break block105;
                                                                                                            }
                                                                                                            catch (MatchException v9) {
                                                                                                                throw pulsescanner.f.c.c.a(v9);
                                                                                                            }
                                                                                                            v5 = v8.b(class_1802.field_23141);
                                                                                                        }
                                                                                                        catch (MatchException v10) {
                                                                                                            throw pulsescanner.f.c.c.a(v10);
                                                                                                        }
                                                                                                    }
                                                                                                    if (!v5) break block104;
                                                                                                    v8 = this;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var1_1 != null) break block106;
                                                                                                        if (!v8.a(var2_2)) break block104;
                                                                                                    }
                                                                                                    catch (MatchException v11) {
                                                                                                        throw pulsescanner.f.c.c.a(v11);
                                                                                                    }
                                                                                                    v8 = this;
                                                                                                }
                                                                                                catch (MatchException v12) {
                                                                                                    throw pulsescanner.f.c.c.a(v12);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                v8.d(2);
                                                                                                if (var1_1 == null) break block104;
lbl76:
                                                                                                // 2 sources

                                                                                                v3 = this.n;
                                                                                            }
                                                                                            catch (MatchException v13) {
                                                                                                throw pulsescanner.f.c.c.a(v13);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var1_1 != null) break block107;
                                                                                                        if (v3 == 2) {
                                                                                                        }
                                                                                                        ** GOTO lbl149
                                                                                                    }
                                                                                                    catch (MatchException v14) {
                                                                                                        throw pulsescanner.f.c.c.a(v14);
                                                                                                    }
                                                                                                    v15 = var3_4;
                                                                                                    if (var1_1 != null) break block108;
                                                                                                }
                                                                                                catch (MatchException v16) {
                                                                                                    throw pulsescanner.f.c.c.a(v16);
                                                                                                }
                                                                                                if (!v15.method_27852(class_2246.field_23152)) break block104;
                                                                                            }
                                                                                            catch (MatchException v17) {
                                                                                                throw pulsescanner.f.c.c.a(v17);
                                                                                            }
                                                                                            v15 = var3_4;
                                                                                        }
                                                                                        catch (MatchException v18) {
                                                                                            throw pulsescanner.f.c.c.a(v18);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            block110: {
                                                                                                try {
                                                                                                    try {
                                                                                                        v19 = (Integer)v15.method_11654((class_2769)class_4969.field_23153);
                                                                                                        if (var1_1 != null) break block109;
                                                                                                        if (v19 <= 0) break block110;
                                                                                                    }
                                                                                                    catch (MatchException v20) {
                                                                                                        throw pulsescanner.f.c.c.a(v20);
                                                                                                    }
                                                                                                    this.d(3);
                                                                                                    if (var1_1 == null) break block104;
                                                                                                }
                                                                                                catch (MatchException v21) {
                                                                                                    throw pulsescanner.f.c.c.a(v21);
                                                                                                }
                                                                                            }
                                                                                            v22 = this;
                                                                                            if (var1_1 != null) break block111;
                                                                                        }
                                                                                        catch (MatchException v23) {
                                                                                            throw pulsescanner.f.c.c.a(v23);
                                                                                        }
                                                                                        v19 = (int)v22.b(class_1802.field_8801);
                                                                                    }
                                                                                    catch (MatchException v24) {
                                                                                        throw pulsescanner.f.c.c.a(v24);
                                                                                    }
                                                                                }
                                                                                if (v19 == 0) break block104;
                                                                                v22 = this;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var1_1 != null) break block112;
                                                                                    if (!v22.a(var2_2)) break block104;
                                                                                }
                                                                                catch (MatchException v25) {
                                                                                    throw pulsescanner.f.c.c.a(v25);
                                                                                }
                                                                                v22 = this;
                                                                            }
                                                                            catch (MatchException v26) {
                                                                                throw pulsescanner.f.c.c.a(v26);
                                                                            }
                                                                        }
                                                                        try {
                                                                            v22.d(3);
                                                                            if (var1_1 == null) break block104;
lbl149:
                                                                            // 2 sources

                                                                            v3 = this.n;
                                                                        }
                                                                        catch (MatchException v27) {
                                                                            throw pulsescanner.f.c.c.a(v27);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var1_1 != null) break block113;
                                                                                    if (v3 == 3) {
                                                                                    }
                                                                                    ** GOTO lbl197
                                                                                }
                                                                                catch (MatchException v28) {
                                                                                    throw pulsescanner.f.c.c.a(v28);
                                                                                }
                                                                                v29 = this;
                                                                                if (var1_1 != null) break block114;
                                                                            }
                                                                            catch (MatchException v30) {
                                                                                throw pulsescanner.f.c.c.a(v30);
                                                                            }
                                                                            if (!v29.a(this.r)) break block104;
                                                                        }
                                                                        catch (MatchException v31) {
                                                                            throw pulsescanner.f.c.c.a(v31);
                                                                        }
                                                                        v29 = this;
                                                                    }
                                                                    catch (MatchException v32) {
                                                                        throw pulsescanner.f.c.c.a(v32);
                                                                    }
                                                                }
                                                                if (!v29.b(class_1802.field_23141)) break block104;
                                                                var4_5 = new class_3965(var2_2.method_17784(), var2_2.method_17780(), this.r, false);
                                                                try {
                                                                    try {
                                                                        if (var1_1 != null) break block115;
                                                                        if (!this.a(var2_2)) break block116;
                                                                    }
                                                                    catch (MatchException v33) {
                                                                        throw pulsescanner.f.c.c.a(v33);
                                                                    }
                                                                    pulsescanner.f.c.c.a.field_1761.method_41931(pulsescanner.f.c.c.a.field_1687, (class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, lambda$tickSequence$0(net.minecraft.class_3965 int ), (I)Lnet/minecraft/class_2596;)((class_3965)var4_5));
                                                                    pulsescanner.f.c.c.a.field_1724.method_6104(class_1268.field_5808);
                                                                }
                                                                catch (MatchException v34) {
                                                                    throw pulsescanner.f.c.c.a(v34);
                                                                }
                                                            }
                                                            this.d(4);
                                                        }
                                                        try {
                                                            if (var1_1 == null) break block104;
lbl197:
                                                            // 2 sources

                                                            v3 = this.n;
                                                        }
                                                        catch (MatchException v35) {
                                                            throw pulsescanner.f.c.c.a(v35);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var1_1 != null) break block117;
                                                                    if (v3 == 4) {
                                                                    }
                                                                    ** GOTO lbl271
                                                                }
                                                                catch (MatchException v36) {
                                                                    throw pulsescanner.f.c.c.a(v36);
                                                                }
                                                                v37 = var3_4;
                                                                if (var1_1 != null) break block118;
                                                            }
                                                            catch (MatchException v38) {
                                                                throw pulsescanner.f.c.c.a(v38);
                                                            }
                                                            if (!v37.method_27852(class_2246.field_23152)) break block104;
                                                        }
                                                        catch (MatchException v39) {
                                                            throw pulsescanner.f.c.c.a(v39);
                                                        }
                                                        v37 = var3_4;
                                                    }
                                                    catch (MatchException v40) {
                                                        throw pulsescanner.f.c.c.a(v40);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        block120: {
                                                            try {
                                                                try {
                                                                    v41 = (Integer)v37.method_11654((class_2769)class_4969.field_23153);
                                                                    if (var1_1 != null) break block119;
                                                                    if (v41 <= 0) break block120;
                                                                }
                                                                catch (MatchException v42) {
                                                                    throw pulsescanner.f.c.c.a(v42);
                                                                }
                                                                this.d(5);
                                                                if (var1_1 == null) break block104;
                                                            }
                                                            catch (MatchException v43) {
                                                                throw pulsescanner.f.c.c.a(v43);
                                                            }
                                                        }
                                                        v44 = this;
                                                        if (var1_1 != null) break block121;
                                                    }
                                                    catch (MatchException v45) {
                                                        throw pulsescanner.f.c.c.a(v45);
                                                    }
                                                    v41 = (int)v44.b(class_1802.field_8801);
                                                }
                                                catch (MatchException v46) {
                                                    throw pulsescanner.f.c.c.a(v46);
                                                }
                                            }
                                            if (v41 == 0) break block104;
                                            v44 = this;
                                        }
                                        try {
                                            try {
                                                if (var1_1 != null) break block122;
                                                if (!v44.a(var2_2)) break block104;
                                            }
                                            catch (MatchException v47) {
                                                throw pulsescanner.f.c.c.a(v47);
                                            }
                                            v44 = this;
                                        }
                                        catch (MatchException v48) {
                                            throw pulsescanner.f.c.c.a(v48);
                                        }
                                    }
                                    try {
                                        try {
                                            v44.d(5);
                                            if (var1_1 == null) break block104;
lbl271:
                                            // 2 sources

                                            v49 = this;
                                            if (var1_1 != null) break block123;
                                        }
                                        catch (MatchException v50) {
                                            throw pulsescanner.f.c.c.a(v50);
                                        }
                                        v3 = v49.n;
                                    }
                                    catch (MatchException v51) {
                                        throw pulsescanner.f.c.c.a(v51);
                                    }
                                }
                                try {
                                    if (v3 != 5) break block104;
                                    v49 = this;
                                }
                                catch (MatchException v52) {
                                    throw pulsescanner.f.c.c.a(v52);
                                }
                            }
                            try {
                                try {
                                    if (var1_1 != null) break block124;
                                    if (v49.a(this.r)) {
                                    }
                                    ** GOTO lbl308
                                }
                                catch (MatchException v53) {
                                    throw pulsescanner.f.c.c.a(v53);
                                }
                                v49 = this;
                            }
                            catch (MatchException v54) {
                                throw pulsescanner.f.c.c.a(v54);
                            }
                        }
                        try {
                            try {
                                if (var1_1 != null) break block125;
                                if (v49.b(class_1802.field_23141)) break block126;
                            }
                            catch (MatchException v55) {
                                throw pulsescanner.f.c.c.a(v55);
                            }
lbl308:
                            // 2 sources

                            return;
                        }
                        catch (MatchException v56) {
                            throw pulsescanner.f.c.c.a(v56);
                        }
                    }
                    v49 = this;
                }
                try {
                    try {
                        if (var1_1 != null) break block127;
                        if (!v49.a(var2_2)) break block104;
                    }
                    catch (MatchException v57) {
                        throw pulsescanner.f.c.c.a(v57);
                    }
                    v49 = this;
                }
                catch (MatchException v58) {
                    throw pulsescanner.f.c.c.a(v58);
                }
            }
            v49.b(true);
        }
    }

    private boolean a(class_2338 class_23382) {
        boolean bl;
        block5: {
            block4: {
                class_2680 class_26802 = pulsescanner.f.c.c.a.field_1687.method_8320(class_23382);
                try {
                    try {
                        if (!class_26802.method_27852(class_2246.field_23152) || (Integer)class_26802.method_11654((class_2769)class_4969.field_23153) <= 0) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.c.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.c.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static class_2596 lambda$tickSequence$0(class_3965 class_39652, int n2) {
        return new class_2885(class_1268.field_5808, class_39652, n2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "/\rxrD'S_\u0002qpS3\u001a\fAx\u007fEt\u001b\u001a\u0015v\u007f@ \u001a\fAmfNt\r\u001a\u0012ipV:_\u001e\u000fzyN&\f_\bw1N:\u001a_\n|hQ&\u001a\f\u00127\r;\u000elsM1_>\u000fzyN&\u000e>\u0002mxW5\u000b\u0016\u000ew1j1\u0006";
            var4_3 = "/\rxrD'S_\u0002qpS3\u001a\fAx\u007fEt\u001b\u001a\u0015v\u007f@ \u001a\fAmfNt\r\u001a\u0012ipV:_\u001e\u000fzyN&\f_\bw1N:\u001a_\n|hQ&\u001a\f\u00127\r;\u000elsM1_>\u000fzyN&\u000e>\u0002mxW5\u000b\u0016\u000ew1j1\u0006".length();
            var1_4 = 66;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = 59;
            v0 = v2;
            v4 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl53
            do {
                v3 = v3;
                v0 = v0;
                v5 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 68;
                        break;
                    }
                    case 1: {
                        v6 = 90;
                        break;
                    }
                    case 2: {
                        v6 = 34;
                        break;
                    }
                    case 3: {
                        v6 = 42;
                        break;
                    }
                    case 4: {
                        v6 = 26;
                        break;
                    }
                    case 5: {
                        v6 = 111;
                        break;
                    }
                    default: {
                        v6 = 68;
                    }
                }
                v0[v5] = (char)(v0[v5] ^ (v3 ^ v6));
                ++var6_6;
lbl53:
                // 2 sources

                v4 = v4;
            } while (v4 > var6_6);
            ** while (true)
        }
        pulsescanner.f.c.c.u = var5;
    }
}

