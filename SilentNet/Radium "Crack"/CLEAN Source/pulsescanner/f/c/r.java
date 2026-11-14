/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1422
 *  net.minecraft.class_1429
 *  net.minecraft.class_1433
 *  net.minecraft.class_1477
 *  net.minecraft.class_1481
 *  net.minecraft.class_1531
 *  net.minecraft.class_1569
 *  net.minecraft.class_1621
 *  net.minecraft.class_1646
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_259
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_5762
 *  net.minecraft.class_746
 */
package pulsescanner.f.c;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1422;
import net.minecraft.class_1429;
import net.minecraft.class_1433;
import net.minecraft.class_1477;
import net.minecraft.class_1481;
import net.minecraft.class_1531;
import net.minecraft.class_1569;
import net.minecraft.class_1621;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_5762;
import net.minecraft.class_746;
import pulsescanner.a.ag;
import pulsescanner.a.ah;
import pulsescanner.a.ak;
import pulsescanner.a.aq;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.au;
import pulsescanner.a.aw;
import pulsescanner.a.ax;
import pulsescanner.a.c;
import pulsescanner.a.f;
import pulsescanner.a.p;
import pulsescanner.a.u;
import pulsescanner.a.w;
import pulsescanner.a.y;
import pulsescanner.a.z;
import pulsescanner.c.e;
import pulsescanner.f.c.d;
import pulsescanner.f.c.o;
import pulsescanner.f.c.t;
import pulsescanner.f.i;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.g.n;

public class r
extends as {
    public static class_1309 m;
    public static int n;
    public final ax o;
    public final ax p;
    public final ah q;
    public final aw r;
    public final aw s;
    public final ax t;
    public final at u;
    public final aw v;
    public final aw w;
    public final ah x;
    public final ah y;
    public final at z;
    public final au A;
    public float B;
    public boolean C;
    public long D;
    public boolean E;
    public long F;
    private int G;
    private int H;
    private float I;
    private class_1309 J;
    private static final String[] K;

    public r() {
        String[] stringArray = K;
        super(stringArray[20], stringArray[7]);
        this.o = new ax(this, stringArray[33], 3.0f, 2.5f, 6.0f, 0.1f);
        this.p = new ax(this, stringArray[24], 1.0f, 0.0f, 3.0f, 0.1f);
        this.q = new ah(this, stringArray[43], new at[]{new at(stringArray[39], true), new at(stringArray[15], true), new at(stringArray[40], false), new at(stringArray[21], false)});
        this.r = new aw(this, stringArray[37], new String[]{stringArray[18], stringArray[32], stringArray[29], stringArray[9]});
        this.s = (aw)new aw(this, stringArray[38], new String[]{stringArray[6], stringArray[11]}).a(this::lambda$new$0);
        this.t = (ax)new ax(this, stringArray[11], 50.0f, 25.0f, 90.0f, 1.0f).a(this::lambda$new$1);
        this.u = (at)new at(this, stringArray[2], false).a(this::lambda$new$2);
        String[] stringArray2 = pulsescanner.f.c.t.y();
        try {
            this.v = new aw(this, stringArray[41], new String[]{stringArray[10], stringArray[47], stringArray[12]});
            this.w = new aw(this, stringArray[31], new String[]{stringArray[8], stringArray[19]});
            this.x = new ah(this, stringArray[23], new at[]{new at(stringArray[46], false), new at(stringArray[35], false)});
            this.y = new ah(this, stringArray[34], new at[]{new at(stringArray[36], false), new at(stringArray[0], false)});
            this.z = new at(this, stringArray[45], true);
            this.A = (au)new au(this, stringArray[44], -879028).a(this.z::a);
            this.H = ThreadLocalRandom.current().nextInt(14, 19);
            if (stringArray2 != null) {
                pulsescanner.f.i.b(new int[1]);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.r.a(matchException);
        }
    }

    public static r s() {
        return pulsescanner.f.m.a(r.class);
    }

    @Override
    public String f() {
        return (String)this.r.a();
    }

    public float[] t() {
        return new float[]{this.o.g(), this.p.g()};
    }

    private float u() {
        return this.o.g() + this.p.g();
    }

    @y
    public void a(u u2) {
        block12: {
            block11: {
                try {
                    try {
                        if (m != null && this.a(m)) break block11;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                    this.v();
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
            }
            try {
                if (n != 0) {
                    --n;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            try {
                try {
                    if (this.w() || m == null) break block12;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
                this.x();
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(class_1309 class_13092) {
        class_1309 class_13093;
        String[] stringArray;
        block124: {
            block123: {
                boolean bl;
                block121: {
                    block122: {
                        boolean bl2;
                        block118: {
                            block120: {
                                block119: {
                                    class_1309 class_13094;
                                    block107: {
                                        String[] stringArray2;
                                        int n2;
                                        block104: {
                                            block106: {
                                                block105: {
                                                    block102: {
                                                        block103: {
                                                            block100: {
                                                                block101: {
                                                                    stringArray = pulsescanner.f.c.t.y();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                boolean bl3 = class_13092 instanceof class_746;
                                                                                if (stringArray != null) return bl3;
                                                                                if (bl3) return false;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.c.r.a(matchException);
                                                                            }
                                                                            n2 = pulsescanner.f.c.o.b((class_1297)class_13092);
                                                                            if (stringArray != null) break block100;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.c.r.a(matchException);
                                                                        }
                                                                        if (n2 == 0) break block101;
                                                                        return false;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                    }
                                                                }
                                                                float f2 = pulsescanner.f.c.r.a.field_1724.method_5739((class_1297)class_13092) - this.u();
                                                                n2 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                                            }
                                                            try {
                                                                try {
                                                                    if (stringArray != null) break block102;
                                                                    if (n2 <= 0) break block103;
                                                                    return false;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.r.a(matchException);
                                                            }
                                                        }
                                                        stringArray2 = K;
                                                        n2 = this.x.a(stringArray2[3]) ? 1 : 0;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (stringArray != null) break block104;
                                                                    if (n2 != 0) break block105;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                }
                                                                class_13094 = pulsescanner.f.c.r.a.field_1724;
                                                                if (stringArray != null) break block106;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.r.a(matchException);
                                                            }
                                                            if (class_13094.method_6057((class_1297)class_13092)) break block105;
                                                            return false;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.c.r.a(matchException);
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.c.r.a(matchException);
                                                    }
                                                }
                                                class_13094 = class_13092;
                                            }
                                            try {
                                                if (stringArray != null) break block107;
                                                n2 = class_13094 instanceof class_1657;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.r.a(matchException);
                                            }
                                        }
                                        if (n2 != 0) {
                                            boolean bl4;
                                            block117: {
                                                block115: {
                                                    class_1657 class_16572;
                                                    block116: {
                                                        int n3;
                                                        block113: {
                                                            block114: {
                                                                block110: {
                                                                    ah ah2;
                                                                    block112: {
                                                                        block111: {
                                                                            block108: {
                                                                                block109: {
                                                                                    class_16572 = (class_1657)class_13092;
                                                                                    try {
                                                                                        try {
                                                                                            n3 = pulsescanner.f.c.d.t().a((class_1309)class_16572);
                                                                                            if (stringArray != null) break block108;
                                                                                            if (n3 == 0) break block109;
                                                                                            return false;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.c.r.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                                    }
                                                                                }
                                                                                n3 = pulsescanner.a.z.a(class_16572.method_5477().getString());
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (stringArray != null) break block110;
                                                                                            if (n3 == 0) break block111;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.c.r.a(matchException);
                                                                                        }
                                                                                        ah2 = this.q;
                                                                                        if (stringArray != null) break block112;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                                    }
                                                                                    if (ah2.a(K[26])) break block111;
                                                                                    return false;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.c.r.a(matchException);
                                                                            }
                                                                        }
                                                                        ah2 = this.q;
                                                                    }
                                                                    stringArray2 = K;
                                                                    n3 = ah2.a(stringArray2[22]) ? 1 : 0;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (stringArray != null) break block113;
                                                                        if (n3 != 0) break block114;
                                                                        return false;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                class_13094 = class_16572;
                                                                if (stringArray != null) break block115;
                                                                float f3 = class_13094.method_18396() - 0.0f;
                                                                n3 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.r.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n3 > 0) break block116;
                                                                    bl4 = this.q.a(K[17]);
                                                                    if (stringArray != null) break block117;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                }
                                                                if (bl4) break block116;
                                                                return false;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.r.a(matchException);
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.c.r.a(matchException);
                                                        }
                                                    }
                                                    class_13094 = class_16572;
                                                }
                                                try {
                                                    if (stringArray != null) break block107;
                                                    bl4 = class_13094.method_68878();
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.r.a(matchException);
                                                }
                                            }
                                            try {
                                                if (bl4) {
                                                    return false;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.r.a(matchException);
                                            }
                                        }
                                        class_13094 = class_13092;
                                    }
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
                                                                                                    try {
                                                                                                        bl2 = class_13094 instanceof class_1569;
                                                                                                        if (stringArray != null) break block118;
                                                                                                        if (bl2) break block119;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                                                    }
                                                                                                    bl2 = class_13092 instanceof class_1621;
                                                                                                    if (stringArray != null) break block118;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                                                }
                                                                                                if (bl2) break block119;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.c.r.a(matchException);
                                                                                            }
                                                                                            bl2 = class_13092 instanceof class_1646;
                                                                                            if (stringArray != null) break block118;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.c.r.a(matchException);
                                                                                        }
                                                                                        if (bl2) break block119;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                                    }
                                                                                    bl2 = class_13092 instanceof class_1429;
                                                                                    if (stringArray != null) break block118;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                                }
                                                                                if (bl2) break block119;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.c.r.a(matchException);
                                                                            }
                                                                            bl2 = class_13092 instanceof class_1422;
                                                                            if (stringArray != null) break block118;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.c.r.a(matchException);
                                                                        }
                                                                        if (bl2) break block119;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.c.r.a(matchException);
                                                                    }
                                                                    bl2 = class_13092 instanceof class_1477;
                                                                    if (stringArray != null) break block118;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.c.r.a(matchException);
                                                                }
                                                                if (bl2) break block119;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.c.r.a(matchException);
                                                            }
                                                            bl2 = class_13092 instanceof class_1433;
                                                            if (stringArray != null) break block118;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.c.r.a(matchException);
                                                        }
                                                        if (bl2) break block119;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.c.r.a(matchException);
                                                    }
                                                    bl2 = class_13092 instanceof class_1481;
                                                    if (stringArray != null) break block118;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.r.a(matchException);
                                                }
                                                if (bl2) break block119;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.r.a(matchException);
                                            }
                                            bl2 = class_13092 instanceof class_5762;
                                            if (stringArray != null) break block118;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.r.a(matchException);
                                        }
                                        if (!bl2) break block120;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.r.a(matchException);
                                    }
                                }
                                bl2 = true;
                                break block118;
                            }
                            bl2 = false;
                        }
                        boolean bl5 = bl2;
                        try {
                            try {
                                try {
                                    try {
                                        bl = bl5;
                                        if (stringArray != null) break block121;
                                        if (!bl) break block122;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.r.a(matchException);
                                    }
                                    bl = this.q.a(K[27]);
                                    if (stringArray != null) break block121;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.r.a(matchException);
                                }
                                if (bl) break block122;
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.r.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.r.a(matchException);
                        }
                    }
                    try {
                        class_13093 = class_13092;
                        if (stringArray != null) break block123;
                        bl = class_13093.method_5655();
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                }
                if (bl) return false;
                class_13093 = class_13092;
            }
            try {
                try {
                    if (stringArray != null) break block124;
                    if (!class_13093.method_5805()) return false;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
                class_13093 = class_13092;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
        }
        try {
            boolean bl = class_13093 instanceof class_1531;
            if (stringArray != null) return bl;
            if (bl) return false;
            return true;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.r.a(matchException);
        }
    }

    private void v() {
        class_1309 class_13092 = null;
        double d2 = Double.MAX_VALUE;
        class_243 class_2432 = pulsescanner.f.c.r.a.field_1724.method_33571();
        class_243 class_2433 = pulsescanner.f.c.r.a.field_1724.method_5828(1.0f).method_1029();
        for (class_1297 class_12972 : pulsescanner.f.c.r.a.field_1687.method_18112()) {
            if (!(class_12972 instanceof class_1309)) continue;
            class_1309 class_13093 = (class_1309)class_12972;
            try {
                if (!this.a(class_13093)) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            class_243 class_2434 = class_13093.method_73189().method_1031(0.0, (double)class_13093.method_17682() * 0.5, 0.0).method_1020(class_2432).method_1029();
            double d3 = Math.acos(class_3532.method_15350((double)class_2433.method_1026(class_2434), (double)-1.0, (double)1.0));
            if (!(d3 < d2)) continue;
            d2 = d3;
            class_13092 = class_13093;
        }
        m = class_13092;
    }

    private boolean w() {
        boolean bl;
        block19: {
            block18: {
                boolean bl2;
                boolean bl3;
                block17: {
                    block16: {
                        boolean bl4;
                        block15: {
                            block14: {
                                try {
                                    try {
                                        if (!pulsescanner.f.c.r.a.field_1724.method_6115() || !this.y.a(K[42])) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.r.a(matchException);
                                    }
                                    bl4 = true;
                                    break block15;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.r.a(matchException);
                                }
                            }
                            bl4 = false;
                        }
                        bl3 = bl4;
                        try {
                            try {
                                try {
                                    if (!this.y.a(K[1]) || pulsescanner.f.c.r.a.field_1755 == null) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.r.a(matchException);
                                }
                                if (pulsescanner.f.c.r.a.field_1755 instanceof e) break block16;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.r.a(matchException);
                            }
                            bl2 = true;
                            break block17;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.r.a(matchException);
                        }
                    }
                    bl2 = false;
                }
                boolean bl5 = bl2;
                try {
                    try {
                        if (!bl3 && !bl5) break block18;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                    bl = true;
                    break block19;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void x() {
        boolean bl;
        Runnable[] runnableArray;
        Runnable[] runnableArray2;
        block16: {
            block15: {
                boolean bl2;
                class_1309 class_13092;
                try {
                    if (aq.a((class_1297)m) >= (double)this.o.g()) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
                float[] fArray = this.t();
                float[] fArray2 = new float[]{fArray[0], fArray[1], fArray[0] + fArray[1]};
                try {
                    pulsescanner.a.f.a(m, false, true, false);
                    class_13092 = m;
                    bl2 = !this.r.c(K[4]);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
                boolean bl3 = pulsescanner.a.f.a(class_13092, bl2, true, true, 0L, fArray2);
                try {
                    if (!bl3) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
                runnableArray2 = pulsescanner.a.f.a(m, true);
                runnableArray = pulsescanner.a.f.b(true);
                try {
                    try {
                        if (!this.v.c(K[5]) && !this.v.c(K[25])) break block15;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                    bl = true;
                    break block16;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
            }
            bl = false;
        }
        Runnable[] runnableArray3 = pulsescanner.a.f.c(bl);
        try {
            pulsescanner.a.f.a(m, () -> r.lambda$attackTarget$3(runnableArray3, runnableArray, runnableArray2), () -> r.lambda$attackTarget$4(runnableArray2, runnableArray, runnableArray3), class_1268.field_5808, false);
            this.C = true;
            this.D = System.currentTimeMillis() + 250L;
            if (++this.G >= this.H) {
                this.G = 0;
                this.H = ThreadLocalRandom.current().nextInt(15, 19);
                this.E = true;
                this.F = System.currentTimeMillis() + (long)ThreadLocalRandom.current().nextInt(50, 70);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.r.a(matchException);
        }
    }

    @y
    public void a(pulsescanner.a.r r2) {
        block10: {
            try {
                block9: {
                    try {
                        try {
                            if (m == null || pulsescanner.f.c.r.a.field_1724 == null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.r.a(matchException);
                        }
                        if (pulsescanner.f.c.r.a.field_1687 != null) break block10;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
        }
        float[] fArray = this.t();
        float[] fArray2 = new float[]{fArray[0], fArray[1], fArray[0] + fArray[1]};
        boolean bl = pulsescanner.a.f.a(m, false, true, true, -350L, fArray2);
        for (c c2 : pulsescanner.a.c.values()) {
            try {
                if (!this.r.c(c2.b())) continue;
                c2.a().a(this, m, fArray2, bl);
                break;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
        }
    }

    @y
    public void a(p p2) {
        block20: {
            block19: {
                block18: {
                    try {
                        block17: {
                            try {
                                try {
                                    if (m == null || pulsescanner.f.c.r.a.field_1724 == null) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.r.a(matchException);
                                }
                                if (pulsescanner.f.c.r.a.field_1687 != null) break block18;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.r.a(matchException);
                            }
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                }
                try {
                    try {
                        try {
                            if (!this.v.c(K[30]) || !pulsescanner.a.f.a(m, this.t())) break block19;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.r.a(matchException);
                        }
                        if (pulsescanner.a.e.a()) break block19;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                    p2.a(0.0f);
                    p2.b(0.0f);
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
            }
            try {
                if (this.w.c(K[16])) {
                    ag.a(p2, pulsescanner.f.c.r.a.field_1724.method_36454(), pulsescanner.f.c.r.a.field_1773.method_19418().method_19330());
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            try {
                if (!this.w.c(K[13]) || pulsescanner.f.c.r.a.field_1724.method_5869()) break block20;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            class_243 class_2432 = m.method_73189().method_1020(pulsescanner.f.c.r.a.field_1724.method_33571()).method_1029();
            ag.a(p2, pulsescanner.f.c.r.a.field_1724.method_36454(), (float)Math.toDegrees(Math.atan2(-class_2432.field_1352, class_2432.field_1350)));
        }
    }

    public double b(class_1309 class_13092) {
        class_243 class_2432 = class_13092.method_73189().method_1031(0.0, (double)class_13092.method_17682() * 0.5, 0.0).method_1020(pulsescanner.f.c.r.a.field_1724.method_33571());
        float f2 = (float)Math.toDegrees(Math.atan2(-class_2432.field_1352, class_2432.field_1350));
        float f3 = (float)class_3532.method_15350((double)(-Math.toDegrees(Math.atan2(class_2432.field_1351, Math.hypot(class_2432.field_1352, class_2432.field_1350)))), (double)-90.0, (double)90.0);
        return Math.hypot(class_3532.method_15393((float)(f2 - ak.c())), f3 - ak.d());
    }

    @y
    public void a(w w2) {
        this.y();
    }

    @Override
    protected void p() {
        this.y();
    }

    private void y() {
        m = null;
        this.J = null;
        this.I = 0.0f;
        this.G = 0;
        this.E = false;
    }

    @Override
    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
        block12: {
            float f3;
            float f4;
            try {
                if (!((Boolean)this.z.a()).booleanValue()) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            try {
                if (m != null) {
                    this.J = m;
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            try {
                r r2 = this;
                f4 = this.I;
                f3 = m != null ? 0.08f : -0.08f;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
            try {
                try {
                    r2.I = class_3532.method_15363((float)(f4 + f3), (float)0.0f, (float)1.0f);
                    if (this.J != null && !(this.I <= 0.01f)) break block12;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
        }
        class_1309 class_13092 = this.J;
        class_243 class_2432 = class_13092.method_30950(f2);
        class_238 class_2382 = class_13092.method_5829().method_997(class_2432.method_1020(class_13092.method_73189())).method_1014(0.05);
        float f5 = (float)class_13092.field_6235 / 10.0f;
        int n2 = pulsescanner.g.b.a((Integer)this.A.a() | 0xFF000000, -42406, f5);
        n2 = pulsescanner.g.b.a(n2, this.I);
        pulsescanner.g.d.a(class_45872, class_41842, List.of(pulsescanner.g.m.a(class_259.method_1078((class_238)class_2382), n2)), new n(2.0f, (int)(45.0f * this.I), true, true, false, true));
    }

    @Override
    public void a(class_332 class_3322, float f2) {
        int n2;
        block12: {
            try {
                block11: {
                    try {
                        try {
                            if (!this.u.i() || !this.r.c(K[14])) break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.r.a(matchException);
                        }
                        if (this.s.c(K[28])) break block12;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                }
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.r.a(matchException);
            }
        }
        float f3 = class_3322.method_51421();
        float f4 = class_3322.method_51443();
        double d2 = Math.toRadians(((Integer)pulsescanner.f.c.r.a.field_1690.method_41808().method_41753()).intValue());
        double d3 = 1.0 / ((double)(f3 / f4) * Math.tan(d2 / 2.0));
        float f5 = (float)(Math.tan(Math.toRadians(this.t.g() - 15.0f)) * (double)(f3 / 2.0f) * d3);
        try {
            if (f5 <= 1.0f) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.r.a(matchException);
        }
        try {
            n2 = m != null ? pulsescanner.g.b.a(-879028, -42406, (float)pulsescanner.f.c.r.m.field_6235 / 10.0f) : -879028;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.r.a(matchException);
        }
        int n3 = n2;
        pulsescanner.g.b.b(class_3322, f3 / 2.0f, f4 / 2.0f, f5, 1.0f, pulsescanner.g.b.a(n3, 144));
    }

    private static void lambda$attackTarget$4(Runnable[] runnableArray, Runnable[] runnableArray2, Runnable[] runnableArray3) {
        runnableArray[1].run();
        runnableArray2[1].run();
        runnableArray3[1].run();
    }

    private static void lambda$attackTarget$3(Runnable[] runnableArray, Runnable[] runnableArray2, Runnable[] runnableArray3) {
        runnableArray[0].run();
        runnableArray2[0].run();
        runnableArray3[0].run();
    }

    private boolean lambda$new$2() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r.c(K[29]) || !this.s.c(K[11])) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$1() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r.c(K[29]) || !this.s.c(K[11])) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.r.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.r.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$0() {
        return this.r.c(K[29]);
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
                var5 = new String[48];
                var3_1 = 0;
                var2_2 = "* |1\u0012H]\f=2\n\u0003D]\u000e* |1\u0012H]\f=2\n\u0003D]\b:'}2Sg|?\u0012!&fe\u0007IA\u0006:u-SC_\u0006,y6\u0003!9Z\u00069.q.\u0016U\u0003Zy\"F9&q.\u0000\u0001G\u0001*2'\u0016RGI!w$\u0001CJI;s7\u0014DGEo`*\u0007@G\f<2*\u001dU\\I&fe\u0012OWI.f1\u0012BX\u001ao}+SB\\\u0006#v*\u0004O\u001d\u0007/ q0\u0000DW\u0003!9Z\u00069.q.\u0016U\u0003/\u0000D\u0005%*u,\u0007\u0007/ q0\u0000DW\u0004:!s5\u0011<!s7\u001eNA\f+2\u0015\u001f@J\f=a\u0004/=w \u0011<!s7\u001eNA\f+2\u0015\u001f@J\f=a\t<!{3\u0016S@\b#\u0004/=w \u000b(;f$\u0010J\u0013(:`$\u0007/={ \u001dE@\u00079#s<\u0016S@\u0006*'w&\u0018R\u0015,7f7\u0012\u0001w\f;w&\u0007H\\\u0007o@$\u001dFV\u0006:&~ \u001dU\u0007/={ \u001dE@\u0004$ p6\u0003/\u0000D\u0004:!s5\u0005%*u,\u0007\u0013$ d \u001eD]\u001doQ*\u0001SV\n;{*\u001d\u0004.={(\f(;f$\u0010J\u0013;.|\"\u0016\u00059.g6\u0016\u0012!&fe\u0007IA\u0006:u-SC_\u0006,y6\u0006,.f,\u001dF\r; f$\u0007H\\\u0007o_*\u0017D\t:!s5Sl\\\r*\u00079#s<\u0016S@\u0004$ p6\u000b:?`,\u001dU\u0013$ v \u0006,.f,\u001dF\u0007=.`\"\u0016U@\u000f!&u-\u001fHT\u0001;2\u0006\u001cM\\\u001b\u0010!&u-\u001fHT\u0001;2\u0011\u0012ST\f;";
                var4_3 = "* |1\u0012H]\f=2\n\u0003D]\u000e* |1\u0012H]\f=2\n\u0003D]\b:'}2Sg|?\u0012!&fe\u0007IA\u0006:u-SC_\u0006,y6\u0003!9Z\u00069.q.\u0016U\u0003Zy\"F9&q.\u0000\u0001G\u0001*2'\u0016RGI!w$\u0001CJI;s7\u0014DGEo`*\u0007@G\f<2*\u001dU\\I&fe\u0012OWI.f1\u0012BX\u001ao}+SB\\\u0006#v*\u0004O\u001d\u0007/ q0\u0000DW\u0003!9Z\u00069.q.\u0016U\u0003/\u0000D\u0005%*u,\u0007\u0007/ q0\u0000DW\u0004:!s5\u0011<!s7\u001eNA\f+2\u0015\u001f@J\f=a\u0004/=w \u0011<!s7\u001eNA\f+2\u0015\u001f@J\f=a\t<!{3\u0016S@\b#\u0004/=w \u000b(;f$\u0010J\u0013(:`$\u0007/={ \u001dE@\u00079#s<\u0016S@\u0006*'w&\u0018R\u0015,7f7\u0012\u0001w\f;w&\u0007H\\\u0007o@$\u001dFV\u0006:&~ \u001dU\u0007/={ \u001dE@\u0004$ p6\u0003/\u0000D\u0004:!s5\u0005%*u,\u0007\u0013$ d \u001eD]\u001doQ*\u0001SV\n;{*\u001d\u0004.={(\f(;f$\u0010J\u0013;.|\"\u0016\u00059.g6\u0016\u0012!&fe\u0007IA\u0006:u-SC_\u0006,y6\u0006,.f,\u001dF\r; f$\u0007H\\\u0007o_*\u0017D\t:!s5Sl\\\r*\u00079#s<\u0016S@\u0004$ p6\u000b:?`,\u001dU\u0013$ v \u0006,.f,\u001dF\u0007=.`\"\u0016U@\u000f!&u-\u001fHT\u0001;2\u0006\u001cM\\\u001b\u0010!&u-\u001fHT\u0001;2\u0011\u0012ST\f;".length();
                var1_4 = 14;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 26;
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
                    var2_2 = "4,}9\t\u000f~\u0015(h8\u00064(p.\u0013[";
                    var4_3 = "4,}9\t\u000f~\u0015(h8\u00064(p.\u0013[".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 20;
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
                        v11 = 115;
                        break;
                    }
                    case 1: {
                        v11 = 85;
                        break;
                    }
                    case 2: {
                        v11 = 8;
                        break;
                    }
                    case 3: {
                        v11 = 95;
                        break;
                    }
                    case 4: {
                        v11 = 105;
                        break;
                    }
                    case 5: {
                        v11 = 59;
                        break;
                    }
                    default: {
                        v11 = 41;
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
        pulsescanner.f.c.r.K = var5;
    }
}

