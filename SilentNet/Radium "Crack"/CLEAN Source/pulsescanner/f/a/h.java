/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_2818
 *  net.minecraft.class_2826
 */
package pulsescanner.f.a;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import pulsescanner.f.a.b;
import pulsescanner.f.a.d;
import pulsescanner.f.a.k;
import pulsescanner.f.i;

final class h
implements Runnable {
    private final class_2818 a;
    private final class_1923 b;
    final d c;

    h(d d2, class_2818 class_28182) {
        this.c = d2;
        this.a = class_28182;
        this.b = class_28182.method_12004();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void run() {
        block71: {
            block72: {
                block87: {
                    block86: {
                        block70: {
                            block68: {
                                block69: {
                                    block67: {
                                        block83: {
                                            block64: {
                                                block65: {
                                                    block66: {
                                                        block81: {
                                                            block80: {
                                                                block79: {
                                                                    block63: {
                                                                        block59: {
                                                                            block60: {
                                                                                block61: {
                                                                                    block62: {
                                                                                        block77: {
                                                                                            block76: {
                                                                                                block75: {
                                                                                                    block58: {
                                                                                                        var2_1 = this.b.method_8324();
                                                                                                        var4_2 = d.o.get();
                                                                                                        var1_3 = pulsescanner.f.a.b.o();
                                                                                                        var4_2[0] = false;
                                                                                                        var5_4 = 0;
                                                                                                        try {
                                                                                                            v0 = Thread.currentThread().isInterrupted();
                                                                                                            if (var1_3 != null) break block58;
                                                                                                            if (v0 == 0) break block59;
                                                                                                            v0 = var5_4;
                                                                                                        }
                                                                                                        catch (Throwable var8_7) {
                                                                                                            if (var1_3 == null) {
                                                                                                                block73: {
                                                                                                                    try {
                                                                                                                        block74: {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var5_4 == 0) break block73;
                                                                                                                                        v1 = var4_2[0];
                                                                                                                                        if (var1_3 != null) break block73;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v2) {
                                                                                                                                        throw h.a(v2);
                                                                                                                                    }
                                                                                                                                    if (!v1) break block74;
                                                                                                                                }
                                                                                                                                catch (MatchException v3) {
                                                                                                                                    throw h.a(v3);
                                                                                                                                }
                                                                                                                                this.c.E.add(var2_1);
                                                                                                                                if (var1_3 == null) break block73;
                                                                                                                            }
                                                                                                                            catch (MatchException v4) {
                                                                                                                                throw h.a(v4);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v1 = this.c.D.add(var2_1);
                                                                                                                    }
                                                                                                                    catch (MatchException v5) {
                                                                                                                        throw h.a(v5);
                                                                                                                    }
                                                                                                                }
                                                                                                                this.c.F.remove(var2_1);
                                                                                                                this.c.H.decrementAndGet();
                                                                                                            }
                                                                                                            throw var8_7;
                                                                                                        }
                                                                                                    }
                                                                                                    if (var1_3 != null) break block60;
                                                                                                    if (v0 == 0) break block61;
                                                                                                    break block75;
                                                                                                    catch (MatchException v6) {
                                                                                                        throw h.a(v6);
                                                                                                    }
                                                                                                }
                                                                                                v7 = var4_2[0];
                                                                                                if (var1_3 != null) break block61;
                                                                                                break block76;
                                                                                                catch (MatchException v8) {
                                                                                                    throw h.a(v8);
                                                                                                }
                                                                                            }
                                                                                            if (!v7) break block62;
                                                                                            break block77;
                                                                                            catch (MatchException v9) {
                                                                                                throw h.a(v9);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block78: {
                                                                                                this.c.E.add(var2_1);
                                                                                                if (var1_3 == null) break block61;
                                                                                                break block78;
                                                                                                catch (MatchException v10) {
                                                                                                    throw h.a(v10);
                                                                                                }
                                                                                            }
                                                                                            i.b(new int[4]);
                                                                                        }
                                                                                        catch (MatchException v11) {
                                                                                            throw h.a(v11);
                                                                                        }
                                                                                    }
                                                                                    v7 = this.c.D.add(var2_1);
                                                                                }
                                                                                this.c.F.remove(var2_1);
                                                                                v0 = this.c.H.decrementAndGet();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var6_5 = this.a();
                                                                        try {
                                                                            v12 = var6_5.isEmpty() != false ? null : this.a(var6_5);
                                                                        }
                                                                        catch (MatchException v13) {
                                                                            throw h.a(v13);
                                                                        }
                                                                        var7_6 = v12;
                                                                        try {
                                                                            v14 = Thread.currentThread().isInterrupted();
                                                                            if (var1_3 != null) break block63;
                                                                            if (v14 == 0) break block64;
                                                                        }
                                                                        catch (MatchException v15) {
                                                                            throw h.a(v15);
                                                                        }
                                                                        v14 = var5_4;
                                                                    }
                                                                    if (var1_3 != null) break block65;
                                                                    if (v14 == 0) break block66;
                                                                    break block79;
                                                                    catch (MatchException v16) {
                                                                        throw h.a(v16);
                                                                    }
                                                                }
                                                                v17 = var4_2[0];
                                                                if (var1_3 != null) break block66;
                                                                break block80;
                                                                catch (MatchException v18) {
                                                                    throw h.a(v18);
                                                                }
                                                            }
                                                            if (!v17) ** GOTO lbl131
                                                            break block81;
                                                            catch (MatchException v19) {
                                                                throw h.a(v19);
                                                            }
                                                        }
                                                        try {
                                                            block82: {
                                                                this.c.E.add(var2_1);
                                                                if (var1_3 == null) break block66;
                                                                break block82;
                                                                catch (MatchException v20) {
                                                                    throw h.a(v20);
                                                                }
                                                            }
                                                            v17 = this.c.D.add(var2_1);
                                                        }
                                                        catch (MatchException v21) {
                                                            throw h.a(v21);
                                                        }
                                                    }
                                                    this.c.F.remove(var2_1);
                                                    v14 = this.c.H.decrementAndGet();
                                                }
                                                return;
                                            }
                                            v22 /* !! */  = var7_6;
                                            if (var1_3 != null) break block67;
                                            if (v22 /* !! */  == null) break block68;
                                            break block83;
                                            catch (MatchException v23) {
                                                throw h.a(v23);
                                            }
                                        }
                                        try {
                                            block84: {
                                                v24 = this;
                                                if (var1_3 != null) break block69;
                                                break block84;
                                                catch (MatchException v25) {
                                                    throw h.a(v25);
                                                }
                                            }
                                            v22 /* !! */  = v24.c.s.a();
                                        }
                                        catch (MatchException v26) {
                                            throw h.a(v26);
                                        }
                                    }
                                    try {
                                        if (((Boolean)v22 /* !! */ ).booleanValue()) {
                                            v24 = this;
                                        }
                                        ** GOTO lbl181
                                    }
                                    catch (MatchException v27) {
                                        throw h.a(v27);
                                    }
                                }
                                v28 = (int)v24.c.b(this.a);
                                if (var1_3 != null) break block70;
                                try {
                                    block85: {
                                        if (v28 != 0) break block68;
                                        break block85;
                                        catch (MatchException v29) {
                                            throw h.a(v29);
                                        }
                                    }
                                    d.p().execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$run$0(pulsescanner.f.a.k ), ()V)((h)this, (k)var7_6));
                                }
                                catch (MatchException v30) {
                                    throw h.a(v30);
                                }
                            }
                            v31 = 1;
                            if (var1_3 != null) break block71;
                            v28 = var5_4 = v31;
                        }
                        if (v28 == 0) break block72;
                        v32 = var4_2[0];
                        if (var1_3 != null) break block72;
                        break block86;
                        catch (MatchException v33) {
                            throw h.a(v33);
                        }
                    }
                    if (!v32) ** GOTO lbl213
                    break block87;
                    catch (MatchException v34) {
                        throw h.a(v34);
                    }
                }
                try {
                    block88: {
                        this.c.E.add(var2_1);
                        if (var1_3 == null) break block72;
                        break block88;
                        catch (MatchException v35) {
                            throw h.a(v35);
                        }
                    }
                    v32 = this.c.D.add(var2_1);
                }
                catch (MatchException v36) {
                    throw h.a(v36);
                }
            }
            this.c.F.remove(var2_1);
            v31 = this.c.H.decrementAndGet();
        }
    }

    private List<class_2338> a() {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int n2 = this.b.method_8326();
        int n3 = this.b.method_8328();
        class_2826[] class_2826Array = this.a.method_12006();
        int n4 = this.a.method_31607();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        int n5 = 0;
        while (true) {
            block13: {
                int n6;
                block12: {
                    try {
                        try {
                            if (n5 >= class_2826Array.length) break;
                            if (d.a(class_2826Array[n5])) break block12;
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw h.a(matchException);
                        }
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                }
                for (int i2 = n6 = n4 + n5 * 16; i2 < n6 + 16; ++i2) {
                    block10: for (int i3 = 0; i3 < 16; ++i3) {
                        int n7 = 0;
                        while (true) {
                            block14: {
                                try {
                                    try {
                                        if (n7 >= 16) continue block10;
                                        class_23392.method_10103(n2 + i3, i2, n3 + n7);
                                        if (!this.c.a(this.a.method_8320((class_2338)class_23392).method_26204(), (class_2338)class_23392)) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw h.a(matchException);
                                    }
                                    arrayList.add(class_23392.method_10062());
                                }
                                catch (MatchException matchException) {
                                    throw h.a(matchException);
                                }
                            }
                            ++n7;
                        }
                    }
                }
            }
            ++n5;
        }
        return arrayList;
    }

    private k a(List<class_2338> list) {
        int n2 = Math.max(2, this.c.r.h());
        ConcurrentHashMap<class_2338, class_2248> concurrentHashMap = new ConcurrentHashMap<class_2338, class_2248>();
        for (class_2338 class_23382 : list) {
            int n3;
            int n4;
            class_2248 class_22482;
            block25: {
                block24: {
                    try {
                        if (Thread.currentThread().isInterrupted()) {
                            return null;
                        }
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                    class_22482 = this.a(class_23382, concurrentHashMap);
                    if (!this.c.a(class_22482, class_23382)) continue;
                    try {
                        if (this.a(class_23382.method_10084(), concurrentHashMap).equals(class_22482)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                    n4 = 1;
                    class_2338 class_23383 = class_23382.method_10074();
                    while (true) {
                        try {
                            if (n4 > 21 || !this.a(class_23383, concurrentHashMap).equals(class_22482)) break;
                        }
                        catch (MatchException matchException) {
                            throw h.a(matchException);
                        }
                        ++n4;
                        class_23383 = class_23383.method_10074();
                    }
                    try {
                        try {
                            if (class_22482 == class_2246.field_10566 || class_22482 == class_2246.field_10102) break block24;
                        }
                        catch (MatchException matchException) {
                            throw h.a(matchException);
                        }
                        n3 = n2;
                        break block25;
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                }
                n3 = Math.max(5, n2);
            }
            int n5 = n3;
            try {
                if (n4 < n5) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw h.a(matchException);
            }
            boolean bl = true;
            int n6 = 0;
            while (true) {
                try {
                    if (n6 >= n4 || !bl) break;
                }
                catch (MatchException matchException) {
                    throw h.a(matchException);
                }
                class_2338 class_23384 = class_23382.method_10087(n6);
                for (class_2350 class_23502 : d.l) {
                    if (this.a(class_23384.method_10093(class_23502), concurrentHashMap).equals(class_2246.field_10340)) continue;
                    bl = false;
                    break;
                }
                ++n6;
            }
            if (!bl) continue;
            ArrayList<class_2338> arrayList = new ArrayList<class_2338>(n4);
            try {
                for (int i2 = 0; i2 < n4; ++i2) {
                    arrayList.add(class_23382.method_10087(i2));
                }
            }
            catch (MatchException matchException) {
                throw h.a(matchException);
            }
            return new k(class_22482, arrayList);
        }
        return null;
    }

    private class_2248 a(class_2338 class_23382, Map<class_2338, class_2248> map) {
        return map.computeIfAbsent(class_23382, this::lambda$blockAt$1);
    }

    private class_2248 lambda$blockAt$1(class_2338 class_23382) {
        block4: {
            try {
                try {
                    if (class_23382.method_10263() >> 4 != this.b.field_9181 || class_23382.method_10260() >> 4 != this.b.field_9180) break block4;
                }
                catch (MatchException matchException) {
                    throw h.a(matchException);
                }
                return this.a.method_8320(class_23382).method_26204();
            }
            catch (MatchException matchException) {
                throw h.a(matchException);
            }
        }
        return d.a(class_23382).method_26204();
    }

    private void lambda$run$0(k k2) {
        this.c.a(this.b, k2.ad(), k2.ae());
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

