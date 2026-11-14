/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_1923
 *  net.minecraft.class_1959
 *  net.minecraft.class_1972
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_2826
 *  net.minecraft.class_310
 *  net.minecraft.class_3417
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_5321
 *  net.minecraft.class_6606
 *  net.minecraft.class_6880
 */
package pulsescanner.f.a;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import net.minecraft.class_1922;
import net.minecraft.class_1923;
import net.minecraft.class_1959;
import net.minecraft.class_1972;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_3417;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5321;
import net.minecraft.class_6606;
import net.minecraft.class_6880;
import pulsescanner.f.a.b;
import pulsescanner.f.a.h;
import pulsescanner.f.i;
import pulsescanner.g.k;
import pulsescanner.i.c;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class d
extends i {
    private static final class_2350[] l;
    private static final class_2248[] m;
    private static final int n;
    private static final ThreadLocal<boolean[]> o;
    public final g p;
    public final g q;
    public final g r;
    public final c s;
    public final c t;
    public final pulsescanner.i.d u;
    public final g v;
    public final f w;
    public final g x;
    public final c y;
    public final c z;
    public final pulsescanner.i.d A;
    private final ConcurrentHashMap<class_1923, class_2248> B;
    private final ConcurrentHashMap<class_1923, List<class_2338>> C;
    private final Set<Long> D;
    private final Set<Long> E;
    private final Set<Long> F;
    private final Deque<class_1923> G;
    private final AtomicInteger H;
    private ExecutorService I;
    private class_1923 J;
    private int K;
    private static final String[] L;

    public d() {
        String[] stringArray = L;
        super(stringArray[6], stringArray[31], pulsescanner.f.h.BASEFINDING);
        this.p = this.a(new g(stringArray[14], stringArray[25], 24.0, 1.0, 32.0, 1.0));
        this.q = this.a(new g(stringArray[21], stringArray[2], 16.0, 1.0, 64.0, 1.0));
        this.r = this.a(new g(stringArray[36], stringArray[34], 5.0, 2.0, 21.0, 1.0));
        this.s = this.a(new c(stringArray[9], stringArray[12], false));
        this.t = this.a(new c(stringArray[18], stringArray[16], true));
        this.u = this.a(new pulsescanner.i.d(stringArray[22], stringArray[42], -1943087484));
        this.v = this.a(new g(stringArray[0], stringArray[7], 140.0, 0.0, 255.0, 1.0));
        this.w = this.a(new f(stringArray[27], stringArray[10], stringArray[39], stringArray[39], stringArray[3], stringArray[8]));
        this.x = this.a(new g(stringArray[5], stringArray[19], 60.0, -64.0, 320.0, 1.0));
        this.y = this.a(new c(stringArray[13], stringArray[15], false));
        this.z = this.a(new c(stringArray[37], stringArray[26], false));
        this.A = (pulsescanner.i.d)this.a(new pulsescanner.i.d(stringArray[28], stringArray[17], -42406)).a(this.z::a);
        this.B = new ConcurrentHashMap();
        this.C = new ConcurrentHashMap();
        this.D = ConcurrentHashMap.newKeySet();
        this.E = ConcurrentHashMap.newKeySet();
        this.F = ConcurrentHashMap.newKeySet();
        this.G = new ArrayDeque<class_1923>();
        this.H = new AtomicInteger();
    }

    @Override
    public String f() {
        String string;
        try {
            string = this.B.isEmpty() ? null : Integer.toString(this.B.size());
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        return string;
    }

    @Override
    protected void g() {
        this.o();
        AtomicInteger atomicInteger = new AtomicInteger();
        this.I = Executors.newFixedThreadPool(n, arg_0 -> d.lambda$onEnable$1(atomicInteger, arg_0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void h() {
        block4: {
            try {
                if (this.I == null) break block4;
                this.I.shutdownNow();
                try {
                    this.I.awaitTermination(1L, TimeUnit.SECONDS);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
            this.I = null;
        }
        this.o();
    }

    @Override
    public void l() {
        this.o();
    }

    private void o() {
        this.G.clear();
        this.B.clear();
        this.C.clear();
        this.D.clear();
        this.E.clear();
        this.F.clear();
        this.J = null;
        this.H.set(0);
    }

    @Override
    public void a(int n2, int n3, class_6606 class_66062) {
        long l2 = class_1923.method_8331((int)n2, (int)n3);
        this.D.remove(l2);
        this.E.remove(l2);
        this.b(n2, n3);
        for (class_2350 class_23502 : l) {
            int n4 = n2 + class_23502.method_10148();
            int n5 = n3 + class_23502.method_10165();
            try {
                if (!this.E.remove(class_1923.method_8331((int)n4, (int)n5))) continue;
                this.b(n4, n5);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void i() {
        block35: {
            block40: {
                block34: {
                    block38: {
                        if (pulsescanner.f.a.d.a.field_1724 == null) ** GOTO lbl14
                        if (pulsescanner.f.a.d.a.field_1687 == null) ** GOTO lbl14
                        break block38;
                        catch (Throwable v0) {
                            throw pulsescanner.f.a.d.a(v0);
                        }
                    }
                    try {
                        block39: {
                            if (!pulsescanner.f.a.d.a.method_1493()) break block34;
                            break block39;
                            catch (Throwable v1) {
                                throw pulsescanner.f.a.d.a(v1);
                            }
                        }
                        return;
                    }
                    catch (Throwable v2) {
                        throw pulsescanner.f.a.d.a(v2);
                    }
                }
                var1_1 = pulsescanner.f.a.d.a.field_1724.method_31476();
                if (this.J == null) ** GOTO lbl33
                if (!this.J.equals((Object)var1_1)) ** GOTO lbl33
                break block40;
                catch (Throwable v3) {
                    throw pulsescanner.f.a.d.a(v3);
                }
            }
            try {
                block41: {
                    if (++this.K < 20) break block35;
                    break block41;
                    catch (Throwable v4) {
                        throw pulsescanner.f.a.d.a(v4);
                    }
                }
                this.J = var1_1;
                this.K = 0;
                this.a(var1_1);
            }
            catch (Throwable v5) {
                throw pulsescanner.f.a.d.a(v5);
            }
        }
        var2_2 = Math.max(1, this.q.h());
        var3_3 = Math.max(var2_2 * 2, pulsescanner.f.a.d.n * 2);
        var4_4 = 0;
        while (true) {
            block37: {
                block36: {
                    block44: {
                        block43: {
                            if (var4_4 >= var2_2) break;
                            try {
                                block42: {
                                    if (this.H.get() >= var3_3) break;
                                    break block42;
                                    catch (Throwable v6) {
                                        throw pulsescanner.f.a.d.a(v6);
                                    }
                                }
                                if (this.G.isEmpty()) break;
                            }
                            catch (Throwable v7) {
                                throw pulsescanner.f.a.d.a(v7);
                            }
                            var5_5 = this.G.poll();
                            try {
                                if (var5_5 == null) {
                                    break;
                                }
                            }
                            catch (Throwable v8) {
                                throw pulsescanner.f.a.d.a(v8);
                            }
                            var6_6 = var5_5.method_8324();
                            if (!pulsescanner.f.a.d.a.field_1687.method_8393(var5_5.field_9181, var5_5.field_9180)) ** GOTO lbl84
                            if (this.B.containsKey(var5_5)) ** GOTO lbl84
                            break block43;
                            catch (Throwable v9) {
                                throw pulsescanner.f.a.d.a(v9);
                            }
                        }
                        if (this.D.contains(var6_6)) ** GOTO lbl84
                        break block44;
                        catch (Throwable v10) {
                            throw pulsescanner.f.a.d.a(v10);
                        }
                    }
                    try {
                        block45: {
                            if (this.a(var5_5, var1_1)) break block36;
                            break block45;
                            catch (Throwable v11) {
                                throw pulsescanner.f.a.d.a(v11);
                            }
                        }
                        this.F.remove(var6_6);
                        continue;
                    }
                    catch (Throwable v12) {
                        throw pulsescanner.f.a.d.a(v12);
                    }
                }
                try {
                    var8_7 = pulsescanner.f.a.d.a.field_1687.method_8497(var5_5.field_9181, var5_5.field_9180);
                }
                catch (Throwable var9_8) {
                    this.F.remove(var6_6);
                    continue;
                }
                try {
                    try {
                        if (var8_7 == null || var8_7.method_12223()) break block37;
                    }
                    catch (Throwable v13) {
                        throw pulsescanner.f.a.d.a(v13);
                    }
                    this.a(var8_7);
                    ++var4_4;
                    continue;
                }
                catch (Throwable v14) {
                    throw pulsescanner.f.a.d.a(v14);
                }
            }
            this.F.remove(var6_6);
        }
    }

    private boolean a(class_1923 class_19232, class_1923 class_19233) {
        boolean bl;
        block5: {
            block4: {
                int n2 = Math.max(1, this.p.h());
                try {
                    try {
                        if (Math.abs(class_19232.field_9181 - class_19233.field_9181) > n2 || Math.abs(class_19232.field_9180 - class_19233.field_9180) > n2) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void a(class_1923 class_19232) {
        int n2 = Math.max(1, this.p.h());
        block8: for (int i2 = 0; i2 <= n2; ++i2) {
            int n3 = -i2;
            while (true) {
                block11: {
                    try {
                        try {
                            if (n3 > i2) break;
                            this.a(class_19232.field_9181 + n3, class_19232.field_9180 - i2);
                            if (i2 == 0) break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        this.a(class_19232.field_9181 + n3, class_19232.field_9180 + i2);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                }
                ++n3;
            }
            n3 = -i2 + 1;
            while (true) {
                block12: {
                    try {
                        try {
                            if (n3 >= i2) continue block8;
                            this.a(class_19232.field_9181 - i2, class_19232.field_9180 + n3);
                            if (i2 == 0) break block12;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        this.a(class_19232.field_9181 + i2, class_19232.field_9180 + n3);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                }
                ++n3;
            }
        }
    }

    private void a(int n2, int n3) {
        block14: {
            long l2;
            block13: {
                block12: {
                    try {
                        try {
                            if (pulsescanner.f.a.d.a.field_1687 != null && pulsescanner.f.a.d.a.field_1687.method_8393(n2, n3)) break block12;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                }
                l2 = class_1923.method_8331((int)n2, (int)n3);
                try {
                    try {
                        if (!this.D.contains(l2) && !this.E.contains(l2)) break block13;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            class_1923 class_19232 = new class_1923(n2, n3);
            try {
                try {
                    if (this.B.containsKey(class_19232) || !this.F.add(l2)) break block14;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                this.G.offer(class_19232);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
    }

    private void b(int n2, int n3) {
        block3: {
            class_1923 class_19232;
            block2: {
                long l2 = class_1923.method_8331((int)n2, (int)n3);
                class_19232 = new class_1923(n2, n3);
                try {
                    if (!this.F.add(l2)) break block2;
                    this.G.offerFirst(class_19232);
                    break block3;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            this.G.remove(class_19232);
            this.G.offerFirst(class_19232);
        }
    }

    private void a(class_2818 class_28182) {
        block4: {
            try {
                try {
                    if (this.I != null && !this.I.isShutdown()) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                this.F.remove(class_28182.method_12004().method_8324());
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
        this.H.incrementAndGet();
        this.I.submit(new h(this, class_28182));
    }

    private boolean a(class_2248 class_22482) {
        for (class_2248 class_22483 : m) {
            try {
                if (class_22482 != class_22483) continue;
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
        return false;
    }

    private boolean a(class_2248 class_22482, class_2338 class_23382) {
        boolean bl;
        block21: {
            block19: {
                block20: {
                    block16: {
                        boolean bl2;
                        block18: {
                            block17: {
                                try {
                                    if (pulsescanner.f.a.d.a.field_1687 == null) {
                                        return this.a(class_22482);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                try {
                                    if (class_22482 == class_2246.field_10460) {
                                        return pulsescanner.f.a.d.a((class_6880<class_1959>)pulsescanner.f.a.d.a.field_1687.method_23753(class_23382), true);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                try {
                                    try {
                                        try {
                                            if (class_22482 != class_2246.field_10102) break block16;
                                            if (pulsescanner.f.a.d.a((class_6880<class_1959>)pulsescanner.f.a.d.a.field_1687.method_23753(class_23382), false)) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                        if (class_23382.method_10264() >= 50) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    bl2 = true;
                                    break block18;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    try {
                        try {
                            if (class_22482 != class_2246.field_10566) break block19;
                            if (class_23382.method_10264() >= 50) break block20;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        bl = true;
                        break block21;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                }
                bl = false;
                break block21;
            }
            bl = this.a(class_22482);
        }
        return bl;
    }

    private static boolean a(class_6880<class_1959> class_68802, boolean bl) {
        try {
            if (class_68802 == null) {
                return false;
            }
        }
        catch (Throwable throwable) {
            throw pulsescanner.f.a.d.a(throwable);
        }
        try {
            class_5321 class_53212;
            class_6880<class_1959> class_68803;
            try {
                class_68803 = class_68802;
                class_53212 = bl ? class_1972.field_9438 : class_1972.field_9424;
            }
            catch (Throwable throwable) {
                throw pulsescanner.f.a.d.a(throwable);
            }
            return class_68803.method_40225(class_53212);
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private class_2680 a(class_2818 class_28182, class_2338 class_23382) {
        block4: {
            try {
                try {
                    if (class_23382.method_10263() >> 4 != class_28182.method_12004().field_9181 || class_23382.method_10260() >> 4 != class_28182.method_12004().field_9180) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                return class_28182.method_8320(class_23382);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
        return pulsescanner.f.a.d.a(class_23382);
    }

    private boolean b(class_2818 class_28182, class_2338 class_23382) {
        boolean bl;
        block7: {
            block6: {
                Object object;
                class_2680 class_26802;
                try {
                    class_26802 = this.a(class_28182, class_23382);
                    object = pulsescanner.f.a.d.a.field_1687 != null ? pulsescanner.f.a.d.a.field_1687 : class_28182.method_12200();
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                class_265 class_2652 = class_26802.method_26220((class_1922)object, class_23382);
                try {
                    try {
                        if (!class_2652.method_1110() && class_259.method_1077().equals((Object)class_2652)) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean c(class_2818 class_28182, class_2338 class_23382) {
        boolean bl;
        block11: {
            block10: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!this.b(class_28182, class_23382) || this.b(class_28182, class_23382.method_10095())) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                if (this.b(class_28182, class_23382.method_10072())) break block10;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                            if (this.b(class_28182, class_23382.method_10078())) break block10;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        if (this.b(class_28182, class_23382.method_10067())) break block10;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block11;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean d(class_2818 class_28182, class_2338 class_23382) {
        boolean bl;
        block23: {
            block22: {
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
                                                            if (!this.b(class_28182, class_23382) || !this.b(class_28182, class_23382.method_10089(1))) break block22;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.a.d.a(matchException);
                                                        }
                                                        if (!this.b(class_28182, class_23382.method_10089(2))) break block22;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.a.d.a(matchException);
                                                    }
                                                    if (this.b(class_28182, class_23382.method_10095())) break block22;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.a.d.a(matchException);
                                                }
                                                if (this.b(class_28182, class_23382.method_10072())) break block22;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.a.d.a(matchException);
                                            }
                                            if (this.b(class_28182, class_23382.method_10089(3))) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                        if (this.b(class_28182, class_23382.method_10067())) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    if (this.b(class_28182, class_23382.method_10089(1).method_10095())) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                if (this.b(class_28182, class_23382.method_10089(1).method_10072())) break block22;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                            if (this.b(class_28182, class_23382.method_10089(2).method_10095())) break block22;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        if (this.b(class_28182, class_23382.method_10089(2).method_10072())) break block22;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block23;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean e(class_2818 class_28182, class_2338 class_23382) {
        boolean bl;
        block23: {
            block22: {
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
                                                            if (!this.b(class_28182, class_23382) || !this.b(class_28182, class_23382.method_10077(1))) break block22;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.a.d.a(matchException);
                                                        }
                                                        if (!this.b(class_28182, class_23382.method_10077(2))) break block22;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.a.d.a(matchException);
                                                    }
                                                    if (this.b(class_28182, class_23382.method_10078())) break block22;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.a.d.a(matchException);
                                                }
                                                if (this.b(class_28182, class_23382.method_10067())) break block22;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.a.d.a(matchException);
                                            }
                                            if (this.b(class_28182, class_23382.method_10077(3))) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                        if (this.b(class_28182, class_23382.method_10095())) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    if (this.b(class_28182, class_23382.method_10077(1).method_10078())) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                if (this.b(class_28182, class_23382.method_10077(1).method_10067())) break block22;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                            if (this.b(class_28182, class_23382.method_10077(2).method_10078())) break block22;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        if (this.b(class_28182, class_23382.method_10077(2).method_10067())) break block22;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block23;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean b(class_2818 class_28182) {
        block28: {
            try {
                try {
                    if (class_28182 != null && !class_28182.method_12223()) break block28;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                return false;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
        int n2 = class_28182.method_12004().method_8326();
        int n3 = class_28182.method_12004().method_8328();
        int n4 = class_28182.method_31607();
        int n5 = n4 + class_28182.method_31605();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        for (int i2 = n2; i2 < n2 + 16; ++i2) {
            for (int i3 = n3; i3 < n3 + 16; ++i3) {
                int n6 = n4;
                while (n6 < n5) {
                    int n7;
                    int n8;
                    block32: {
                        block31: {
                            int n9;
                            boolean bl;
                            block30: {
                                block29: {
                                    class_23392.method_10103(i2, n6, i3);
                                    bl = false;
                                    n9 = 0;
                                    if (this.c(class_28182, (class_2338)class_23392)) {
                                        n9 = this.a(class_28182, i2, n6, i3, n5, 0);
                                        try {
                                            if (n9 >= 4) {
                                                return true;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                        if (n9 > 0) {
                                            bl = true;
                                        }
                                    }
                                    try {
                                        if (bl || !this.d(class_28182, (class_2338)class_23392)) break block29;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    n9 = this.a(class_28182, i2, n6, i3, n5, 1);
                                    try {
                                        if (n9 >= 4) {
                                            return true;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    if (n9 > 0) {
                                        bl = true;
                                    }
                                }
                                try {
                                    if (bl || !this.e(class_28182, (class_2338)class_23392)) break block30;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                n9 = this.a(class_28182, i2, n6, i3, n5, 2);
                                try {
                                    if (n9 >= 4) {
                                        return true;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                if (n9 > 0) {
                                    bl = true;
                                }
                            }
                            try {
                                try {
                                    n8 = n6;
                                    if (!bl || n9 <= 0) break block31;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                n7 = n9;
                                break block32;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                        }
                        n7 = 1;
                    }
                    n6 = n8 + n7;
                }
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private int a(class_2818 var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    private void a(class_1923 class_19232, class_2248 class_22482, List<class_2338> list) {
        String string;
        d d2;
        String string2;
        String string3;
        block20: {
            block19: {
                String string4;
                class_2338 class_23382;
                block18: {
                    block17: {
                        try {
                            if (this.B.putIfAbsent(class_19232, class_22482) != null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        try {
                            this.C.put(class_19232, list);
                            if (pulsescanner.f.a.d.a.field_1724 == null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        try {
                            try {
                                if (list == null || list.isEmpty()) break block17;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                            class_23382 = list.get(0);
                            break block18;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                    }
                    class_23382 = null;
                }
                class_2338 class_23383 = class_23382;
                try {
                    string4 = class_23383 != null ? class_23383.method_10263() + " " + class_23383.method_10264() + " " + class_23383.method_10260() : class_19232.method_8326() + 8 + " " + (class_19232.method_8328() + 8);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                string3 = string4;
                string2 = pulsescanner.f.a.d.b(class_22482);
                try {
                    d2 = this;
                    if (!pulsescanner.d.d.a()) break block19;
                    string = string2 + L[41] + string3;
                    break block20;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            String[] stringArray = L;
            string = string2 + stringArray[4];
        }
        try {
            pulsescanner.d.d.a(d2, string, (Integer)this.u.a(), 6.0f, class_3417.field_26979);
            if (((Boolean)this.t.a()).booleanValue()) {
                this.a(L[33] + string2.toLowerCase(Locale.ROOT) + L[20] + string3);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
    }

    private static String b(class_2248 class_22482) {
        String string;
        try {
            if (class_22482 == class_2246.field_10508) {
                return L[1];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        try {
            if (class_22482 == class_2246.field_10115) {
                return L[38];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        try {
            if (class_22482 == class_2246.field_10255) {
                return L[30];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        try {
            if (class_22482 == class_2246.field_10102) {
                return L[24];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        try {
            if (class_22482 == class_2246.field_10566) {
                return L[11];
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        try {
            string = class_22482 == class_2246.field_10460 ? L[40] : L[23];
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        d d2;
        float f3;
        class_4588 class_45882;
        class_4588 class_45883;
        class_4587.class_4665 class_46652;
        class_243 class_2432;
        String[] stringArray;
        block42: {
            boolean bl;
            boolean bl2;
            double d3;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            block36: {
                block37: {
                    boolean bl3;
                    block34: {
                        block35: {
                            d d4;
                            block32: {
                                block33: {
                                    block31: {
                                        stringArray = pulsescanner.f.a.b.o();
                                        try {
                                            try {
                                                d4 = this;
                                                if (stringArray != null) break block31;
                                                if (d4.B.isEmpty()) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.a.d.a(matchException);
                                            }
                                            d4 = this;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (stringArray != null) break block32;
                                            if (d4.m()) break block33;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                }
                                d4 = this;
                            }
                            n6 = d4.v.h();
                            n5 = (Integer)this.u.a();
                            n4 = pulsescanner.g.b.a(n5, Math.min(n6, 52));
                            n3 = pulsescanner.g.b.a(pulsescanner.g.b.b(n5, 38), n6);
                            n2 = pulsescanner.g.b.a(n5, Math.min(28, Math.min(n6, 52)));
                            d3 = (Double)this.x.a();
                            try {
                                bl3 = this.w.a(L[35]);
                                if (stringArray != null) break block34;
                                if (bl3) break block35;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                            bl3 = true;
                            break block34;
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    try {
                        bl = this.w.a(L[32]);
                        if (stringArray != null) break block36;
                        if (bl) break block37;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block36;
                }
                bl = false;
            }
            boolean bl4 = bl;
            class_2432 = class_41842.method_71156();
            class_46652 = class_45872.method_23760();
            class_45883 = k.b(true);
            class_45882 = k.a(true);
            f3 = k.a(1.5f);
            class_243 class_2433 = class_243.method_1030((float)class_41842.method_19329(), (float)class_41842.method_19330());
            for (class_1923 class_19232 : this.B.keySet()) {
                boolean bl5;
                double d5;
                double d6;
                block40: {
                    block41: {
                        block38: {
                            block39: {
                                d6 = (double)class_19232.method_8326() + 0.35;
                                if (stringArray != null) return;
                                d5 = (double)class_19232.method_8328() + 0.35;
                                try {
                                    try {
                                        bl5 = bl2;
                                        if (stringArray != null) break block38;
                                        if (!bl5) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    k.a(class_46652, class_45883, class_45882, new class_238(d6, d3, d5, d6 + 15.3, d3 + 0.035, d5 + 15.3).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n4, n3, f3);
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                            }
                            bl5 = bl4;
                        }
                        try {
                            if (stringArray != null) break block40;
                            if (!bl5) break block41;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                        double d7 = d6 + 7.65;
                        double d8 = d5 + 7.65;
                        k.a(class_46652, class_45883, class_45882, new class_238(d7 - 0.34, d3, d8 - 0.34, d7 + 0.34, 320.0, d8 + 0.34).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n2, n3, f3);
                    }
                    bl5 = (Boolean)this.y.a();
                }
                try {
                    if (bl5) {
                        k.a(class_46652, class_45882, (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350, (float)(d6 + 7.65 - class_2432.field_1352), (float)(d3 - class_2432.field_1351), (float)(d5 + 7.65 - class_2432.field_1350), pulsescanner.g.b.a(n5, Math.max(90, n6)), f3);
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                if (stringArray == null) continue;
            }
            try {
                try {
                    d2 = this;
                    if (stringArray != null) break block42;
                    if (!((Boolean)d2.z.a()).booleanValue()) return;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                d2 = this.A.a();
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.a.d.a(matchException);
            }
        }
        int n7 = (Integer)((Object)d2);
        int n8 = pulsescanner.g.b.a(n7, 46);
        int n9 = pulsescanner.g.b.a(pulsescanner.g.b.b(n7, 38), 230);
        block27: for (List<class_2338> list : this.C.values()) {
            List<class_2338> list2;
            block43: {
                try {
                    list2 = list;
                    if (stringArray != null) break block43;
                    if (list2 == null) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
                list2 = list;
            }
            for (class_2338 class_23382 : list2) {
                if (stringArray != null) continue block27;
                k.a(class_46652, class_45883, class_45882, new class_238(class_23382).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350), n8, n9, f3);
                if (stringArray == null) continue;
            }
            if (stringArray == null) continue;
        }
    }

    private static class_2680 a(class_2338 class_23382) {
        try {
            if (pulsescanner.f.a.d.a.field_1687 == null) {
                return class_2246.field_10124.method_9564();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        try {
            if (!pulsescanner.f.a.d.a.field_1687.method_8393(class_23382.method_10263() >> 4, class_23382.method_10260() >> 4)) {
                pulsescanner.f.a.d.o.get()[0] = true;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.a.d.a(matchException);
        }
        return pulsescanner.f.a.d.a.field_1687.method_8320(class_23382);
    }

    private static boolean a(class_2826 class_28262) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (class_28262.method_38292() || !class_28262.method_12265().method_19526(d::lambda$mayHoldCandidates$2)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.d.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean lambda$mayHoldCandidates$2(class_2680 class_26802) {
        boolean bl;
        block14: {
            block13: {
                class_2248 class_22482 = class_26802.method_26204();
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (class_22482 == class_2246.field_10508 || class_22482 == class_2246.field_10115) break block12;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.a.d.a(matchException);
                                        }
                                        if (class_22482 == class_2246.field_10255) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.a.d.a(matchException);
                                    }
                                    if (class_22482 == class_2246.field_10102) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.a.d.a(matchException);
                                }
                                if (class_22482 == class_2246.field_10566) break block12;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.a.d.a(matchException);
                            }
                            if (class_22482 != class_2246.field_10460) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.a.d.a(matchException);
                        }
                    }
                    bl = true;
                    break block14;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.d.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Thread lambda$onEnable$1(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, L[29] + atomicInteger.incrementAndGet());
        thread.setDaemon(true);
        thread.setPriority(4);
        return thread;
    }

    private static boolean[] lambda$static$0() {
        return new boolean[1];
    }

    static class_310 p() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[43];
                var3_1 = 0;
                var2_2 = "],8n<\u0007X)'t4G\u0019)T/?&0R\u0012e`+n(]\u0017o`;r<A\b<3+g3]\u0015r'hc<P\u0014<4!e6\u001d\u0006L)$j<A\u0005<6-o3\bQ!:m8A\\E\fL5$u8\u0013:u.,c/!],8n<\u0013\u0013z`<n8\u0013\u001ft5&m}C\u0010}4-&u\u0003Q.u}/s\u0004^/<n\bR/hN2_\u0019o2N%&b8A\u000f<!he1V\u001dr`8j<G\u00190`)&+V\u000eh)+g1\u0013\fu,$g/\u001f\\s2hd2G\u00142\u0004X):r-O+!v}P\u0014i.#u}G\u0014}4hg1@\u0013<()p8\u0013\u0013l%&&0Z\u0012u./&5\\\u0010y3f\u0007H2)e8A\u000f\u000bO#)h}a\u001dx)=u*P)&c.\u0013\u001an/%&$\\\tn`+t2@\u000ft!!t}G\u0013<&'s3W\\\u007f(=h6@R\u0019],;i}C\u000eu.<&;Z\u0012x3ho3\u0013\u001ft!<(%_/$i/\u0013\u0013z`<n8\u0013\u0014u' j4T\u0014h%,&+V\u0015r`*j2P\u0017on\f_()r}~\u0019o3)a81T%!a5G\\s&hr5V\\\u007f(=h6\u0013\fp!<c}R\u0012x`*g.V\\s&hr5V\\l)$j<AR\t<6-o3\u0013\u001dh`\u000f_(=h6@\\L%:&\tZ\u001fw\u0005_/$i/\u0007I.#h2D\u0012\u0004O!&b\u001a_(=h6@\\}2's3W\\e/=&)\\\\o#)hs+S5<j4]\u0019<4 c}Q\u0010s##u}G\u0014}4hr/Z\u001b{%:c9\u0013\bt%h`4]\u00182\fQ!:m8A\\O()v8\nJ%!h}p\u0013p/:\rl5$u8\u001e\u001au.,c/\u001e\u0006[2)p8_ZZ)&b.\u0013\u001au,$c9\u001e\u0015r`<s3]\u0019p3r&>\\\u0010i-&u}\\\u001a<':g+V\u00100`,o/GP<$!i/Z\by`)h9\u0013\bt%hj4X\u0019<7)j1V\u0018<)&&?J\\o4'h8\u001d\u0005L,)r8\bZ/=h9\u0013\u001d<#O('t)V\u000fh`.o1_\u0019x`+i1F\u0011r`<n<G\\\u007f/=h)@R\u0006L)$j<A\u000fQ)&&\u000bV\u0015r`\u0004c3T\bt\u000eT)/n1Z\u001bt4hP8Z\u0012\b].,c.Z\by\u0005L,)r8\nN)>c/\u0013\u001fp!1";
                var4_3 = "],8n<\u0007X)'t4G\u0019)T/?&0R\u0012e`+n(]\u0017o`;r<A\b<3+g3]\u0015r'hc<P\u0014<4!e6\u001d\u0006L)$j<A\u0005<6-o3\bQ!:m8A\\E\fL5$u8\u0013:u.,c/!],8n<\u0013\u0013z`<n8\u0013\u001ft5&m}C\u0010}4-&u\u0003Q.u}/s\u0004^/<n\bR/hN2_\u0019o2N%&b8A\u000f<!he1V\u001dr`8j<G\u00190`)&+V\u000eh)+g1\u0013\fu,$g/\u001f\\s2hd2G\u00142\u0004X):r-O+!v}P\u0014i.#u}G\u0014}4hg1@\u0013<()p8\u0013\u0013l%&&0Z\u0012u./&5\\\u0010y3f\u0007H2)e8A\u000f\u000bO#)h}a\u001dx)=u*P)&c.\u0013\u001an/%&$\\\tn`+t2@\u000ft!!t}G\u0013<&'s3W\\\u007f(=h6@R\u0019],;i}C\u000eu.<&;Z\u0012x3ho3\u0013\u001ft!<(%_/$i/\u0013\u0013z`<n8\u0013\u0014u' j4T\u0014h%,&+V\u0015r`*j2P\u0017on\f_()r}~\u0019o3)a81T%!a5G\\s&hr5V\\\u007f(=h6\u0013\fp!<c}R\u0012x`*g.V\\s&hr5V\\l)$j<AR\t<6-o3\u0013\u001dh`\u000f_(=h6@\\L%:&\tZ\u001fw\u0005_/$i/\u0007I.#h2D\u0012\u0004O!&b\u001a_(=h6@\\}2's3W\\e/=&)\\\\o#)hs+S5<j4]\u0019<4 c}Q\u0010s##u}G\u0014}4hr/Z\u001b{%:c9\u0013\bt%h`4]\u00182\fQ!:m8A\\O()v8\nJ%!h}p\u0013p/:\rl5$u8\u001e\u001au.,c/\u001e\u0006[2)p8_ZZ)&b.\u0013\u001au,$c9\u001e\u0015r`<s3]\u0019p3r&>\\\u0010i-&u}\\\u001a<':g+V\u00100`,o/GP<$!i/Z\by`)h9\u0013\bt%hj4X\u0019<7)j1V\u0018<)&&?J\\o4'h8\u001d\u0005L,)r8\bZ/=h9\u0013\u001d<#O('t)V\u000fh`.o1_\u0019x`+i1F\u0011r`<n<G\\\u007f/=h)@R\u0006L)$j<A\u000fQ)&&\u000bV\u0015r`\u0004c3T\bt\u000eT)/n1Z\u001bt4hP8Z\u0012\b].,c.Z\by\u0005L,)r8\nN)>c/\u0013\u001fp!1".length();
                var1_4 = 5;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 87;
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
                    var2_2 = "OE^\u001c@`/\u00d8\u0013\u001b\u001b,\\W\u001a\\``\t\u0013O\u001dK`l\u0007FU\u001e\u000e-n\u001dX^\u0007]n";
                    var4_3 = "OE^\u001c@`/\u00d8\u0013\u001b\u001b,\\W\u001a\\``\t\u0013O\u001dK`l\u0007FU\u001e\u000e-n\u001dX^\u0007]n".length();
                    var1_4 = 10;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 36;
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
                        v11 = 75;
                        break;
                    }
                    case 1: {
                        v11 = 23;
                        break;
                    }
                    case 2: {
                        v11 = 31;
                        break;
                    }
                    case 3: {
                        v11 = 81;
                        break;
                    }
                    case 4: {
                        v11 = 10;
                        break;
                    }
                    case 5: {
                        v11 = 100;
                        break;
                    }
                    default: {
                        v11 = 43;
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
        pulsescanner.f.a.d.L = var5;
        pulsescanner.f.a.d.l = new class_2350[]{class_2350.field_11043, class_2350.field_11035, class_2350.field_11034, class_2350.field_11039};
        pulsescanner.f.a.d.m = new class_2248[]{class_2246.field_10508, class_2246.field_10115, class_2246.field_10255, class_2246.field_10102, class_2246.field_10566};
        pulsescanner.f.a.d.n = Math.max(1, Math.min(4, Runtime.getRuntime().availableProcessors() - 1));
        pulsescanner.f.a.d.o = ThreadLocal.withInitial((Supplier<boolean[]>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$static$0(), ()[Z)());
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

