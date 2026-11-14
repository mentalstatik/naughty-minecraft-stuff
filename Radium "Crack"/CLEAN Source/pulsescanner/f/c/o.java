/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_238
 *  net.minecraft.class_259
 *  net.minecraft.class_2596
 *  net.minecraft.class_2678
 *  net.minecraft.class_2724
 *  net.minecraft.class_2799
 *  net.minecraft.class_2799$class_2800
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_745
 */
package pulsescanner.f.c;

import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_238;
import net.minecraft.class_259;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2799;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_745;
import pulsescanner.a.as;
import pulsescanner.a.au;
import pulsescanner.a.aw;
import pulsescanner.a.ax;
import pulsescanner.a.q;
import pulsescanner.a.r;
import pulsescanner.f.c.t;
import pulsescanner.f.c.y;
import pulsescanner.g.d;
import pulsescanner.g.m;
import pulsescanner.g.n;

public class o
extends as {
    private static o m;
    private long n;
    private final ax o;
    private class_745 p;
    private final aw q;
    private final au r;
    private class_238 s;
    private final List<class_2596<?>> t;
    private boolean u;
    private static final String[] v;

    @pulsescanner.a.y
    public void a(q q2) {
        block17: {
            if (!this.u) {
                class_2596<?> class_25962;
                block18: {
                    block16: {
                        class_25962 = q2.d();
                        try {
                            try {
                                if (!(class_25962 instanceof class_2724) && !(class_25962 instanceof class_2678)) break block16;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.o.a(matchException);
                            }
                            this.t.clear();
                            this.n = 0L;
                            this.s = null;
                            this.y();
                            break block17;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                    }
                    try {
                        if (!q2.f()) break block17;
                        if (!(class_25962 instanceof class_2799)) break block18;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                    class_2799 class_27992 = (class_2799)class_25962;
                    try {
                        if (class_27992.method_12119() == class_2799.class_2800.field_12774) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                }
                try {
                    try {
                        try {
                            if (pulsescanner.f.c.o.a.field_1724 == null || pulsescanner.f.c.o.a.field_1687 == null) break block17;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                        if (a.method_1562() == null) break block17;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                    this.t.add(class_25962);
                    q2.b();
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
            }
        }
    }

    public o() {
        String[] stringArray = v;
        super(stringArray[4], stringArray[9]);
        this.o = new ax(this, stringArray[1], 1000.0f, 50.0f, 5000.0f, 50.0f);
        this.q = new aw(this, stringArray[2], new String[]{stringArray[0], stringArray[8]});
        this.r = (au)new au(this, stringArray[6], -879028).a(this::lambda$new$0);
        this.t = new CopyOnWriteArrayList();
        m = this;
    }

    public static boolean b(class_1297 class_12972) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (m == null || pulsescanner.f.c.o.m.p != class_12972) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void s() {
        block2: {
            try {
                if (this.p == null || pulsescanner.f.c.o.a.field_1724 == null) break block2;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.o.a(matchException);
            }
            double d2 = (this.s.field_1323 + this.s.field_1320) * 0.5;
            double d3 = (this.s.field_1321 + this.s.field_1324) * 0.5;
            this.p.method_5808(d2, this.s.field_1322, d3, pulsescanner.f.c.o.a.field_1724.method_36454(), pulsescanner.f.c.o.a.field_1724.method_36455());
            this.p.method_5847(pulsescanner.f.c.o.a.field_1724.method_5791());
            this.p.method_5636(pulsescanner.f.c.o.a.field_1724.method_73188());
            this.p.method_74090(pulsescanner.f.c.o.a.field_1724.method_6068());
            this.p.method_5660(pulsescanner.f.c.o.a.field_1724.method_5715());
            this.p.method_6122(class_1268.field_5808, pulsescanner.f.c.o.a.field_1724.method_6047().method_7972());
            this.p.method_6122(class_1268.field_5810, pulsescanner.f.c.o.a.field_1724.method_6079().method_7972());
            this.p.method_5673(class_1304.field_6169, pulsescanner.f.c.o.a.field_1724.method_6118(class_1304.field_6169).method_7972());
            this.p.method_5673(class_1304.field_6174, pulsescanner.f.c.o.a.field_1724.method_6118(class_1304.field_6174).method_7972());
            this.p.method_5673(class_1304.field_6172, pulsescanner.f.c.o.a.field_1724.method_6118(class_1304.field_6172).method_7972());
            this.p.method_5673(class_1304.field_6166, pulsescanner.f.c.o.a.field_1724.method_6118(class_1304.field_6166).method_7972());
        }
    }

    private void t() {
        block7: {
            block6: {
                try {
                    if (a.method_1562() != null) break block6;
                    this.t.clear();
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
            }
            this.u = true;
            try {
                for (class_2596 class_25962 : this.t) {
                    a.method_1562().method_52787(class_25962);
                }
            }
            finally {
                this.t.clear();
                this.u = false;
            }
            this.x();
        }
    }

    @Override
    protected void p() {
        this.t();
        this.n = 0L;
        this.s = null;
        this.y();
        super.p();
    }

    private void u() {
        block13: {
            class_310 class_3102;
            block14: {
                class_310 class_3103;
                String[] stringArray;
                block12: {
                    stringArray = pulsescanner.f.c.t.y();
                    try {
                        try {
                            class_3103 = a;
                            if (stringArray != null) break block12;
                            if (class_3103.field_1724 == null) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                        class_3103 = a;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (class_3103.field_1687 == null || this.s == null) break block13;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.o.a(matchException);
                            }
                            class_3102 = a;
                            if (stringArray != null) break block14;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                        if (class_3102.field_1690.method_31044().method_31034()) break block13;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                    this.y();
                    class_3102 = a;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
            }
            GameProfile gameProfile = class_3102.field_1724.method_7334();
            GameProfile gameProfile2 = new GameProfile(UUID.randomUUID(), gameProfile.name(), new PropertyMap((Multimap)gameProfile.properties()));
            this.p = new y(this, pulsescanner.f.c.o.a.field_1687, gameProfile2);
            this.p.method_5875(true);
            this.s();
            pulsescanner.f.c.o.a.field_1687.method_53875((class_1297)this.p);
        }
    }

    private void v() {
        this.n = System.currentTimeMillis() + Math.max(50L, (long)Math.round(this.o.g()));
    }

    private void w() {
        block4: {
            try {
                try {
                    if (this.p != null && !this.p.method_31481()) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
                this.u();
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.o.a(matchException);
            }
        }
    }

    private void x() {
        block6: {
            try {
                try {
                    try {
                        if (pulsescanner.f.c.o.a.field_1724 == null || pulsescanner.f.c.o.a.field_1687 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                    this.s = pulsescanner.f.c.o.a.field_1724.method_5829();
                    if (!this.q.c(v[8])) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
                this.s();
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.o.a(matchException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        aw aw2;
        block21: {
            block22: {
                o o2;
                String[] stringArray;
                block19: {
                    block20: {
                        class_310 class_3102;
                        block18: {
                            stringArray = pulsescanner.f.c.t.y();
                            try {
                                try {
                                    class_3102 = a;
                                    if (stringArray != null) break block18;
                                    if (class_3102.field_1724 == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.o.a(matchException);
                                }
                                class_3102 = a;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.o.a(matchException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (class_3102.field_1687 == null) return;
                                    o2 = this;
                                    if (stringArray != null) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.o.a(matchException);
                                }
                                if (o2.s != null) break block20;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.o.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                    }
                    o2 = this;
                }
                try {
                    block23: {
                        try {
                            try {
                                try {
                                    aw2 = o2.q;
                                    if (stringArray != null) break block21;
                                    if (!aw2.c(v[3])) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.o.a(matchException);
                                }
                                if (!pulsescanner.f.c.o.a.field_1690.method_31044().method_31034()) break block23;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.o.a(matchException);
                            }
                            this.y();
                            if (stringArray == null) return;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                    }
                    this.w();
                    return;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
            }
            this.y();
            aw2 = this.r.a();
        }
        int n2 = (Integer)((Object)aw2) | 0xFF000000;
        pulsescanner.g.d.a(class_45872, class_41842, List.of(pulsescanner.g.m.a(class_259.method_1078((class_238)this.s), n2)), new n(1.6f, 40, true, true, false, true));
    }

    @Override
    protected void o() {
        class_238 class_2382;
        try {
            this.t.clear();
            o o2 = this;
            class_2382 = pulsescanner.f.c.o.a.field_1724 == null ? null : pulsescanner.f.c.o.a.field_1724.method_5829();
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.o.a(matchException);
        }
        try {
            o2.s = class_2382;
            this.n = 0L;
            this.u = false;
            this.v();
            if (this.q.c(v[8])) {
                this.u();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.o.a(matchException);
        }
        super.o();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @pulsescanner.a.y
    public void a(r r2) {
        block13: {
            block14: {
                try {
                    try {
                        try {
                            try {
                                if (pulsescanner.f.c.o.a.field_1724 == null || pulsescanner.f.c.o.a.field_1687 == null) break block13;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.o.a(matchException);
                            }
                            if (a.method_1562() == null) break block13;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.o.a(matchException);
                        }
                        if (!pulsescanner.f.c.o.a.field_1690.method_31044().method_31034()) break block14;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.o.a(matchException);
                    }
                    this.y();
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.o.a(matchException);
                }
            }
            try {
                if (this.n == 0L) {
                    this.v();
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.o.a(matchException);
            }
            try {
                if (System.currentTimeMillis() < this.n) return;
                this.t();
                this.v();
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.o.a(matchException);
            }
        }
        this.t.clear();
        this.y();
        this.n = 0L;
    }

    private void y() {
        try {
            if (this.p != null) {
                this.p.method_31472();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.o.a(matchException);
        }
        this.p = null;
    }

    @Override
    public String f() {
        return Math.round(this.o.g()) + v[5];
    }

    private boolean lambda$new$0() {
        return this.q.c(v[7]);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "7\u0011j.e;\u0014\u0005<\u0001r#u\t*\u0001p&i'\u0018\u0016\u0003\u00055\u000bz'`\u0007>\u0005u'@4\u0016\u0002\u0015\u0017\r7\u0011j.e;\u0014X'q.c'\u00077\u0011j.e;\u0014";
                var4_3 = "7\u0011j.e;\u0014\u0005<\u0001r#u\t*\u0001p&i'\u0018\u0016\u0003\u00055\u000bz'`\u0007>\u0005u'@4\u0016\u0002\u0015\u0017\r7\u0011j.e;\u0014X'q.c'\u00077\u0011j.e;\u0014".length();
                var1_4 = 7;
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
                    var2_2 = "~@1l+8{@9m4>C\\Z')(kNT@<g >JRL>l3m\u001aRA1)5{VVN&l4>N[J8).p\u001aQZ'z3m\u0014";
                    var4_3 = "~@1l+8{@9m4>C\\Z')(kNT@<g >JRL>l3m\u001aRA1)5{VVN&l4>N[J8).p\u001aQZ'z3m\u0014".length();
                    var1_4 = 5;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 54;
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
                        v11 = 5;
                        break;
                    }
                    case 1: {
                        v11 = 25;
                        break;
                    }
                    case 2: {
                        v11 = 99;
                        break;
                    }
                    case 3: {
                        v11 = 63;
                        break;
                    }
                    case 4: {
                        v11 = 113;
                        break;
                    }
                    case 5: {
                        v11 = 40;
                        break;
                    }
                    default: {
                        v11 = 12;
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
        pulsescanner.f.c.o.v = var5;
    }
}

