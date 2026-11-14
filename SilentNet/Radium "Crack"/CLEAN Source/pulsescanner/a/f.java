/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2868
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 *  net.minecraft.class_3486
 *  net.minecraft.class_3532
 *  net.minecraft.class_5134
 */
package pulsescanner.a;

import java.lang.invoke.LambdaMetafactory;
import java.security.SecureRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import pulsescanner.a.ad;
import pulsescanner.a.aq;
import pulsescanner.a.as;
import pulsescanner.a.e;
import pulsescanner.a.g;
import pulsescanner.a.k;
import pulsescanner.f.c.r;

public final class f
implements ad {
    private static int b;
    private static final SecureRandom c;
    public static long d;
    private static boolean e;
    private static final g f;
    private static final class_310 g;
    private static final String[] h;

    public static boolean a(class_1309 class_13092, boolean bl, boolean bl2, long l2, float[] fArray) {
        return pulsescanner.a.f.a(class_13092, bl, true, bl2, l2, fArray);
    }

    public static boolean a(long l2) {
        return f.a(l2);
    }

    private static int a() {
        return 3;
    }

    public static void b() {
        ++d;
    }

    public static boolean a(class_1309 class_13092, double d2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (class_13092 == null || !k.a(class_3532.method_15393((float)pulsescanner.a.f.g.field_1724.method_36454()), pulsescanner.a.f.g.field_1724.method_36455(), (float)d2, (class_1297)class_13092)) break block4;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean a(class_1309 class_13092, float[] fArray) {
        boolean bl;
        block11: {
            block10: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (class_13092 == null || !pulsescanner.a.f.a(class_13092, false, false, -50L, fArray)) break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw pulsescanner.a.f.a(unsupportedOperationException);
                                }
                                if (pulsescanner.a.f.g.field_1724.method_24828()) break block10;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.f.a(unsupportedOperationException);
                            }
                            if (pulsescanner.a.f.g.field_1724.method_5777(class_3486.field_15517)) break block10;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        if (!(pulsescanner.a.f.g.field_1724.method_18798().field_1351 <= 0.0030162615090425808)) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block11;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static long c() {
        long l2;
        block8: {
            block7: {
                try {
                    if (pulsescanner.a.f.g.field_1724 == null) {
                        return 500L;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
                double d2 = pulsescanner.a.f.g.field_1724.method_45325(class_5134.field_23723);
                float f2 = 0.2f;
                l2 = (long)(1.0 / d2 * 1000.0 * (double)(1.0f - Math.min(f2, 1.0f)));
                try {
                    try {
                        if (d2 == 4.0 || d2 == 4.4000000059604645) break block7;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    if (d2 != 4.800000011920929) break block8;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            l2 = 450L;
        }
        return Math.max(l2, 450L);
    }

    public static boolean a(boolean bl) {
        boolean bl2;
        block25: {
            block24: {
                boolean bl3;
                block23: {
                    block22: {
                        try {
                            if (pulsescanner.a.f.g.field_1724 == null) {
                                return true;
                            }
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        try {
                            if (pulsescanner.a.f.g.field_1724.method_6047().method_7909() == class_1802.field_49814) {
                                return true;
                            }
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        try {
                            if (!bl) {
                                return true;
                            }
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        boolean bl4 = pulsescanner.a.e.b();
                        try {
                            if (bl4) {
                                return true;
                            }
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        try {
                            try {
                                try {
                                    if (!r.s().x.a(h[2]) || !pulsescanner.a.f.g.field_1724.method_24828()) break block22;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw pulsescanner.a.f.a(unsupportedOperationException);
                                }
                                if (pulsescanner.a.f.g.field_1690.field_1903.method_1434()) break block22;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.f.a(unsupportedOperationException);
                            }
                            bl3 = true;
                            break block23;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                    }
                    bl3 = false;
                }
                boolean bl5 = bl3;
                try {
                    try {
                        if (!bl5 && !pulsescanner.a.e.a()) break block24;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    bl2 = true;
                    break block25;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static Runnable[] b(boolean bl) {
        Runnable[] runnableArray;
        block7: {
            block8: {
                runnableArray = new Runnable[]{f::lambda$blockingActions$0, f::lambda$blockingActions$1};
                try {
                    try {
                        if (!bl || pulsescanner.a.f.g.field_1724 == null) break block7;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    if (!pulsescanner.a.f.g.field_1724.method_6039()) break block8;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
                class_1268 class_12682 = pulsescanner.a.f.g.field_1724.method_6058();
                try {
                    if (class_12682 == null) {
                        return runnableArray;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
                runnableArray[0] = f::lambda$blockingActions$2;
                runnableArray[1] = () -> f.lambda$blockingActions$3(class_12682);
            }
            return runnableArray;
        }
        return runnableArray;
    }

    public static Runnable[] c(boolean bl) {
        Runnable[] runnableArray;
        block10: {
            block11: {
                runnableArray = new Runnable[]{f::lambda$sprintActions$4, f::lambda$sprintActions$5};
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!bl || pulsescanner.a.f.g.field_1724 == null) break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw pulsescanner.a.f.a(unsupportedOperationException);
                                }
                                if (!pulsescanner.a.f.g.field_1724.method_5624()) break block11;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.f.a(unsupportedOperationException);
                            }
                            if (pulsescanner.a.f.g.field_1724.method_24828()) break block11;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        if (pulsescanner.a.e.a()) break block11;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    runnableArray[0] = f::lambda$sprintActions$6;
                    runnableArray[1] = f::lambda$sprintActions$7;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            return runnableArray;
        }
        return runnableArray;
    }

    private f() {
        throw new UnsupportedOperationException(h[1]);
    }

    /*
     * Unable to fully structure code
     */
    public static void a(class_1309 var0, boolean var1_1, boolean var2_2, boolean var3_3) {
        block40: {
            block42: {
                block41: {
                    block39: {
                        try {
                            block38: {
                                try {
                                    try {
                                        try {
                                            if (var0 == null || pulsescanner.a.f.b == 0) break block38;
                                        }
                                        catch (UnsupportedOperationException v0) {
                                            throw pulsescanner.a.f.a(v0);
                                        }
                                        if (!var3_3) break block38;
                                    }
                                    catch (UnsupportedOperationException v1) {
                                        throw pulsescanner.a.f.a(v1);
                                    }
                                    if (var0.field_6235 == 0) break block39;
                                }
                                catch (UnsupportedOperationException v2) {
                                    throw pulsescanner.a.f.a(v2);
                                }
                            }
                            pulsescanner.a.f.e();
                        }
                        catch (UnsupportedOperationException v3) {
                            throw pulsescanner.a.f.a(v3);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (!var3_3 || var0 == null) break block40;
                                }
                                catch (UnsupportedOperationException v4) {
                                    throw pulsescanner.a.f.a(v4);
                                }
                                if (!pulsescanner.a.f.g()) break block41;
                            }
                            catch (UnsupportedOperationException v5) {
                                throw pulsescanner.a.f.a(v5);
                            }
                            if (!pulsescanner.a.f.a(250L)) break block40;
                            ** GOTO lbl48
                        }
                        catch (UnsupportedOperationException v6) {
                            throw pulsescanner.a.f.a(v6);
                        }
                    }
                    catch (UnsupportedOperationException v7) {
                        throw pulsescanner.a.f.a(v7);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!pulsescanner.a.f.a(150L)) break block40;
lbl48:
                                    // 2 sources

                                    if (!pulsescanner.a.f.g.field_1724.field_6252) break block40;
                                }
                                catch (UnsupportedOperationException v8) {
                                    throw pulsescanner.a.f.a(v8);
                                }
                                if (pulsescanner.a.f.e) break block42;
                            }
                            catch (UnsupportedOperationException v9) {
                                throw pulsescanner.a.f.a(v9);
                            }
                            if (pulsescanner.a.f.b != 0) break block42;
                        }
                        catch (UnsupportedOperationException v10) {
                            throw pulsescanner.a.f.a(v10);
                        }
                        if (var0.field_6235 != 0) break block42;
                    }
                    catch (UnsupportedOperationException v11) {
                        throw pulsescanner.a.f.a(v11);
                    }
                    pulsescanner.a.f.e = true;
                    pulsescanner.a.f.b = 3;
                }
                catch (UnsupportedOperationException v12) {
                    throw pulsescanner.a.f.a(v12);
                }
            }
            try {
                try {
                    block43: {
                        try {
                            try {
                                try {
                                    try {
                                        if (!pulsescanner.a.f.e || pulsescanner.a.f.b <= 0) break block40;
                                    }
                                    catch (UnsupportedOperationException v13) {
                                        throw pulsescanner.a.f.a(v13);
                                    }
                                    if (var0 == null) break block40;
                                }
                                catch (UnsupportedOperationException v14) {
                                    throw pulsescanner.a.f.a(v14);
                                }
                                if (!var2_2) break block43;
                            }
                            catch (UnsupportedOperationException v15) {
                                throw pulsescanner.a.f.a(v15);
                            }
                            if (!pulsescanner.a.f.a(var0, 6.0)) break block40;
                        }
                        catch (UnsupportedOperationException v16) {
                            throw pulsescanner.a.f.a(v16);
                        }
                    }
                    if (!pulsescanner.a.f.a(var0, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$tryComboAttack$8(), ()V)(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$tryComboAttack$9(), ()V)(), class_1268.field_5808, var1_1)) break block40;
                }
                catch (UnsupportedOperationException v17) {
                    throw pulsescanner.a.f.a(v17);
                }
                --pulsescanner.a.f.b;
            }
            catch (UnsupportedOperationException v18) {
                throw pulsescanner.a.f.a(v18);
            }
        }
    }

    public static void d() {
        d = 0L;
    }

    public static void e() {
        e = false;
        b = 0;
    }

    /*
     * Unable to fully structure code
     */
    public static Runnable[] a(class_1309 var0, boolean var1_1) {
        block36: {
            block39: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                block44: {
                                    block43: {
                                        block42: {
                                            block40: {
                                                block41: {
                                                    block38: {
                                                        block37: {
                                                            var3_2 = new Runnable[]{(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$shieldBreakActions$10(), ()V)(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$shieldBreakActions$11(), ()V)()};
                                                            var2_3 = as.r();
                                                            try {
                                                                try {
                                                                    if (!var1_1) break block36;
                                                                    v0 = pulsescanner.a.f.g.field_1724;
                                                                    if (var2_3 == 0) break block37;
                                                                }
                                                                catch (UnsupportedOperationException v1) {
                                                                    throw pulsescanner.a.f.a(v1);
                                                                }
                                                                if (v0 == null) break block36;
                                                            }
                                                            catch (UnsupportedOperationException v2) {
                                                                throw pulsescanner.a.f.a(v2);
                                                            }
                                                            v0 = var0;
                                                        }
                                                        try {
                                                            try {
                                                                if (var2_3 == 0) break block38;
                                                                if (!(v0 instanceof class_1657)) break block39;
                                                            }
                                                            catch (UnsupportedOperationException v3) {
                                                                throw pulsescanner.a.f.a(v3);
                                                            }
                                                            v0 = var0;
                                                        }
                                                        catch (UnsupportedOperationException v4) {
                                                            throw pulsescanner.a.f.a(v4);
                                                        }
                                                    }
                                                    var4_4 = (class_1657)v0;
                                                    try {
                                                        try {
                                                            v5 = var4_4;
                                                            if (var2_3 == 0) break block40;
                                                            if (v5.method_6039()) break block41;
                                                        }
                                                        catch (UnsupportedOperationException v6) {
                                                            throw pulsescanner.a.f.a(v6);
                                                        }
                                                        return var3_2;
                                                    }
                                                    catch (UnsupportedOperationException v7) {
                                                        throw pulsescanner.a.f.a(v7);
                                                    }
                                                }
                                                v5 = var4_4;
                                            }
                                            var5_5 = v5.method_6047();
                                            var6_6 = var4_4.method_6079();
                                            try {
                                                v8 = var5_5;
                                                if (var2_3 == 0) break block42;
                                                if (v8.method_7960()) {
                                                }
                                                ** GOTO lbl57
                                            }
                                            catch (UnsupportedOperationException v9) {
                                                throw pulsescanner.a.f.a(v9);
                                            }
                                            var7_7 = null;
                                            try {
                                                if (var2_3 != 0) break block43;
lbl57:
                                                // 2 sources

                                                v8 = var5_5;
                                            }
                                            catch (UnsupportedOperationException v10) {
                                                throw pulsescanner.a.f.a(v10);
                                            }
                                        }
                                        var7_7 = v8.method_7909();
                                    }
                                    try {
                                        v11 = var6_6;
                                        if (var2_3 == 0) break block44;
                                        if (v11.method_7960()) {
                                        }
                                        ** GOTO lbl75
                                    }
                                    catch (UnsupportedOperationException v12) {
                                        throw pulsescanner.a.f.a(v12);
                                    }
                                    var8_8 = null;
                                    try {
                                        if (var2_3 != 0) break block45;
lbl75:
                                        // 2 sources

                                        v11 = var6_6;
                                    }
                                    catch (UnsupportedOperationException v13) {
                                        throw pulsescanner.a.f.a(v13);
                                    }
                                }
                                var8_8 = v11.method_7909();
                            }
                            try {
                                try {
                                    v14 = var7_7;
                                    if (var2_3 == 0) break block46;
                                    if (v14 == class_1802.field_8255) break block47;
                                }
                                catch (UnsupportedOperationException v15) {
                                    throw pulsescanner.a.f.a(v15);
                                }
                                v14 = var8_8;
                            }
                            catch (UnsupportedOperationException v16) {
                                throw pulsescanner.a.f.a(v16);
                            }
                        }
                        if (v14 != class_1802.field_8255) break block39;
                    }
                    var9_9 = pulsescanner.a.f.f();
                    var10_10 = pulsescanner.a.f.g.field_1724.method_31548().method_67532();
                    try {
                        try {
                            v17 = var9_9;
                            if (var2_3 == 0) break block48;
                            if (v17 == -1) break block39;
                        }
                        catch (UnsupportedOperationException v18) {
                            throw pulsescanner.a.f.a(v18);
                        }
                        v17 = var9_9;
                    }
                    catch (UnsupportedOperationException v19) {
                        throw pulsescanner.a.f.a(v19);
                    }
                }
                try {
                    if (v17 != var10_10) {
                        var3_2[0] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$shieldBreakActions$12(int ), ()V)((int)var9_9);
                        var3_2[1] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$shieldBreakActions$13(int ), ()V)((int)var10_10);
                    }
                }
                catch (UnsupportedOperationException v20) {
                    throw pulsescanner.a.f.a(v20);
                }
            }
            return var3_2;
        }
        return var3_2;
    }

    public static boolean a(class_1309 class_13092, Runnable runnable, Runnable runnable2, class_1268 class_12682, boolean bl) {
        boolean bl2;
        block18: {
            block21: {
                block20: {
                    block19: {
                        try {
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (class_13092 == null || pulsescanner.a.f.g.field_1761 == null) break block18;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw pulsescanner.a.f.a(unsupportedOperationException);
                                    }
                                    if (pulsescanner.a.f.g.field_1724 == null) break block18;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw pulsescanner.a.f.a(unsupportedOperationException);
                                }
                                pulsescanner.a.f.g.field_1761.method_2918((class_1657)pulsescanner.a.f.g.field_1724, (class_1297)class_13092);
                                if (class_12682 == null) break block19;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw pulsescanner.a.f.a(unsupportedOperationException);
                            }
                            pulsescanner.a.f.g.field_1724.method_6104(class_12682);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                    }
                    try {
                        if (!bl) break block20;
                        pulsescanner.a.f.b();
                        break block21;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                }
                pulsescanner.a.f.d();
            }
            f.a();
        }
        try {
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.f.a(unsupportedOperationException);
        }
        try {
            bl2 = class_13092 != null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.f.a(unsupportedOperationException);
        }
        return bl2;
    }

    public static boolean a(class_1309 class_13092, boolean bl, boolean bl2, boolean bl3, long l2, float[] fArray) {
        boolean bl4;
        block14: {
            block13: {
                try {
                    try {
                        try {
                            if (!bl2 || class_13092 == null) break block13;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw pulsescanner.a.f.a(unsupportedOperationException);
                        }
                        if (aq.a((class_1297)class_13092, fArray[0], true)) break block13;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    return false;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            try {
                if (!pulsescanner.a.f.b(l2)) {
                    return false;
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw pulsescanner.a.f.a(unsupportedOperationException);
            }
            bl4 = pulsescanner.a.f.a(bl3);
            try {
                try {
                    if (!bl4 || !bl) break block14;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
                if (pulsescanner.a.f.a(class_13092, fArray[0])) break block14;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw pulsescanner.a.f.a(unsupportedOperationException);
            }
            bl4 = false;
        }
        return bl4;
    }

    public static int f() {
        try {
            if (pulsescanner.a.f.g.field_1724 == null) {
                return -1;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.f.a(unsupportedOperationException);
        }
        int n2 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n2 >= 9) break;
                        if (!(pulsescanner.a.f.g.field_1724.method_31548().method_5438(n2).method_7909() instanceof class_1743)) break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw pulsescanner.a.f.a(unsupportedOperationException);
                    }
                    return n2;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            ++n2;
        }
        return -1;
    }

    public static boolean b(long l2) {
        return f.a(pulsescanner.a.f.c() + l2);
    }

    public static boolean g() {
        boolean bl;
        try {
            bl = d % 7L == 3L;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.f.a(unsupportedOperationException);
        }
        return bl;
    }

    private static void lambda$shieldBreakActions$13(int n2) {
        try {
            if (g.method_1562() != null) {
                g.method_1562().method_52787((class_2596)new class_2868(n2));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.f.a(unsupportedOperationException);
        }
    }

    private static void lambda$shieldBreakActions$12(int n2) {
        try {
            if (g.method_1562() != null) {
                g.method_1562().method_52787((class_2596)new class_2868(n2));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw pulsescanner.a.f.a(unsupportedOperationException);
        }
    }

    private static void lambda$shieldBreakActions$11() {
    }

    private static void lambda$shieldBreakActions$10() {
    }

    private static void lambda$tryComboAttack$9() {
    }

    private static void lambda$tryComboAttack$8() {
    }

    private static void lambda$sprintActions$7() {
        pulsescanner.a.f.g.field_1690.field_1867.method_23481(true);
        pulsescanner.a.f.g.field_1724.method_5728(true);
    }

    private static void lambda$sprintActions$6() {
        block3: {
            block2: {
                try {
                    if (!r.s().v.c(h[0])) break block2;
                    pulsescanner.a.f.g.field_1690.field_1867.method_23481(false);
                    break block3;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw pulsescanner.a.f.a(unsupportedOperationException);
                }
            }
            pulsescanner.a.f.g.field_1690.field_1867.method_23481(false);
            pulsescanner.a.f.g.field_1724.method_5728(false);
        }
    }

    private static void lambda$sprintActions$5() {
    }

    private static void lambda$sprintActions$4() {
    }

    private static void lambda$blockingActions$3(class_1268 class_12682) {
        g.method_1562().method_52787((class_2596)new class_2886(class_12682, 0, pulsescanner.a.f.g.field_1724.method_36454(), pulsescanner.a.f.g.field_1724.method_36455()));
    }

    private static void lambda$blockingActions$2() {
        g.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
    }

    private static void lambda$blockingActions$1() {
    }

    private static void lambda$blockingActions$0() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "f%#}*[2a$&kdFm\u0015-om0Fr\\868'C\u007fF?oy*K>V-!v+[>W)oq*\\jT\";q%[{Q\u000bf!.j0\u000f]G%;k";
            var4_3 = "f%#}*[2a$&kdFm\u0015-om0Fr\\868'C\u007fF?oy*K>V-!v+[>W)oq*\\jT\";q%[{Q\u000bf!.j0\u000f]G%;k".length();
            var1_4 = 6;
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
            v3 = 84;
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
                        v6 = 97;
                        break;
                    }
                    case 1: {
                        v6 = 24;
                        break;
                    }
                    case 2: {
                        v6 = 27;
                        break;
                    }
                    case 3: {
                        v6 = 76;
                        break;
                    }
                    case 4: {
                        v6 = 16;
                        break;
                    }
                    case 5: {
                        v6 = 123;
                        break;
                    }
                    default: {
                        v6 = 74;
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
        pulsescanner.a.f.h = var5;
        pulsescanner.a.f.c = new SecureRandom();
        pulsescanner.a.f.f = new g();
        pulsescanner.a.f.g = class_310.method_1551();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

