/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_634
 *  net.minecraft.class_640
 *  net.minecraft.class_7532
 *  net.minecraft.class_8685
 */
package pulsescanner.f.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_332;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7532;
import net.minecraft.class_8685;
import pulsescanner.c.f;
import pulsescanner.f.d.a;
import pulsescanner.f.d.t;
import pulsescanner.f.d.u;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.i.c;
import pulsescanner.i.h;

public class p
extends j {
    private static final float x = 6.0f;
    private static final float C = 13.0f;
    private static final float D = 11.0f;
    private static final int E = -12132214;
    private static final int F = -24001;
    public final c G;
    public final c H;
    public final c I;
    public final h J;
    public final h K;
    private final List<u> L;
    private final Map<UUID, Long> M;
    private boolean N;
    private static final String[] O;

    private static List<String> w() {
        return pulsescanner.license.c.a();
    }

    public p() {
        String[] stringArray = O;
        super(stringArray[7], stringArray[2], 0, 0, 90.0f, 40.0f);
        this.G = this.a(new c(stringArray[10], stringArray[5], true));
        this.H = this.a(new c(stringArray[12], stringArray[0], true));
        this.I = this.a(new c(stringArray[14], stringArray[9], true));
        this.J = this.a(new h(stringArray[8], stringArray[13], stringArray[6]));
        this.K = this.a(new h(stringArray[1], stringArray[11], ""));
        this.L = new ArrayList<u>();
        this.M = new HashMap<UUID, Long>();
    }

    @Override
    public String f() {
        return Integer.toString(this.L.size());
    }

    private void x() {
        block23: {
            Collection<String> collection;
            this.L.clear();
            this.N = false;
            class_634 class_6342 = a.method_1562();
            if (class_6342 != null) {
                UUID uUID;
                String string;
                collection = t.a((String)this.K.a());
                long l2 = System.currentTimeMillis();
                HashSet<UUID> hashSet = new HashSet<UUID>();
                for (class_640 class_6402 : class_6342.method_2880()) {
                    string = class_6402.method_2966().name();
                    try {
                        if (!t.a(string, collection)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.p.a(matchException);
                    }
                    uUID = class_6402.method_2966().id();
                    if (uUID == null) continue;
                    try {
                        if (!hashSet.add(uUID)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.p.a(matchException);
                    }
                    a a2 = t.a(class_6342, class_6402);
                    this.L.add(new u(string, class_6402, a2, this.a(a2, uUID, l2)));
                }
                if (pulsescanner.f.d.p.a.field_1687 != null) {
                    for (class_640 class_6402 : pulsescanner.f.d.p.a.field_1687.method_18456()) {
                        string = class_6402.method_7334().name();
                        try {
                            if (!t.a(string, collection)) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.p.a(matchException);
                        }
                        uUID = class_6402.method_7334().id();
                        if (uUID == null) continue;
                        try {
                            if (!hashSet.add(uUID)) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.p.a(matchException);
                        }
                        this.L.add(new u(string, null, pulsescanner.f.d.a.WATCHING, this.a(pulsescanner.f.d.a.WATCHING, uUID, l2)));
                    }
                }
                this.M.keySet().retainAll(hashSet);
                this.L.sort(Comparator.comparingInt(p::lambda$refresh$0).thenComparing(p::lambda$refresh$1, String.CASE_INSENSITIVE_ORDER));
            }
            try {
                if (!this.L.isEmpty() || !(pulsescanner.f.d.p.a.field_1755 instanceof f)) break block23;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.p.a(matchException);
            }
            this.N = true;
            collection = pulsescanner.f.d.p.w();
            int n2 = 0;
            while (true) {
                a a3;
                class_640 class_6403;
                String string;
                u u2;
                u u3;
                List<u> list;
                block25: {
                    block24: {
                        try {
                            try {
                                u u4;
                                if (n2 >= Math.min(3, collection.size())) break;
                                list = this.L;
                                u3 = u4;
                                u2 = u4;
                                string = (String)collection.get(n2);
                                class_6403 = null;
                                if (n2 != 0) break block24;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.p.a(matchException);
                            }
                            a3 = pulsescanner.f.d.a.WATCHING;
                            break block25;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.p.a(matchException);
                        }
                    }
                    a3 = pulsescanner.f.d.a.ONLINE;
                }
                u3(string, class_6403, a3, n2 == 0 ? 8000L : 0L);
                list.add(u2);
                ++n2;
            }
        }
    }

    private long a(a a2, UUID uUID, long l2) {
        try {
            if (a2 != pulsescanner.f.d.a.WATCHING) {
                this.M.remove(uUID);
                return 0L;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.p.a(matchException);
        }
        return l2 - this.M.computeIfAbsent(uUID, arg_0 -> p.lambda$watchMs$2(l2, arg_0));
    }

    private boolean y() {
        for (u u2 : this.L) {
            try {
                if (u2.am() != pulsescanner.f.d.a.WATCHING) continue;
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.p.a(matchException);
            }
        }
        return false;
    }

    private float z() {
        float f2;
        try {
            f2 = (Boolean)this.G.a() != false ? 14.0f : (float)(pulsescanner.g.e.e() + 4);
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.p.a(matchException);
        }
        return f2;
    }

    @Override
    public void r() {
        int n2;
        float f2;
        boolean bl;
        float f3;
        float f4;
        block16: {
            block15: {
                float f5;
                float f6;
                float f7;
                this.x();
                float f8 = pulsescanner.g.e.e();
                float f9 = 17.0f;
                try {
                    f7 = this.L.isEmpty() ? f8 + 4.0f : (float)this.L.size() * this.z();
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.d.p.a(matchException);
                }
                float f10 = f7;
                this.B = 6.0f + f9 + f10 + 6.0f - 2.0f;
                f4 = f6 = (float)(pulsescanner.g.e.b((String)this.J.a()) + 6 + 14);
                try {
                    f5 = (Boolean)this.G.a() != false ? 15.0f : 0.0f;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.d.p.a(matchException);
                }
                f3 = f5;
                try {
                    try {
                        if (!((Boolean)this.I.a()).booleanValue() || !this.y()) break block15;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.p.a(matchException);
                    }
                    bl = true;
                    break block16;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.d.p.a(matchException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            f2 = bl2 ? (float)(pulsescanner.g.e.a(O[15]) + 6) : 0.0f;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.p.a(matchException);
        }
        float f11 = f2;
        try {
            n2 = (Boolean)this.H.a() != false ? 10 : 2;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.p.a(matchException);
        }
        float f12 = (float)n2 + f11;
        if (this.L.isEmpty()) {
            f4 = Math.max(f4, (float)pulsescanner.g.e.a(O[4]));
        } else {
            for (u u2 : this.L) {
                f4 = Math.max(f4, f3 + (float)pulsescanner.g.e.a(u2.ak()) + f12);
            }
        }
        this.A = 12.0f + f4;
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        block47: {
            p p2;
            float f3;
            float f4;
            i[] iArray;
            block45: {
                block46: {
                    int n2;
                    float f5;
                    float f6;
                    String string;
                    class_332 class_3323;
                    block43: {
                        int n3;
                        block44: {
                            int n4;
                            float f7;
                            float f8;
                            float f9;
                            String string2;
                            block41: {
                                block42: {
                                    block39: {
                                        block40: {
                                            iArray = pulsescanner.f.d.a.b();
                                            f4 = pulsescanner.g.b.a;
                                            try {
                                                try {
                                                    if (iArray == null) break block39;
                                                    if (!this.N) break block40;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.d.p.a(matchException);
                                                }
                                                pulsescanner.g.b.a = f4 * 0.6f;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.d.p.a(matchException);
                                            }
                                        }
                                        pulsescanner.d.c.a(class_3322, this.y, this.z, this.A, this.B);
                                        pulsescanner.d.c.b(class_3322, (String)this.J.a(), this.y + 6.0f, this.z + 6.0f + 1.0f, pulsescanner.d.c.d());
                                    }
                                    string2 = Integer.toString(this.L.size());
                                    f9 = Math.max(14, pulsescanner.g.e.a(string2) + 8);
                                    f8 = this.y + this.A - 6.0f - f9;
                                    f7 = this.z + 6.0f - 1.0f;
                                    try {
                                        n4 = this.y();
                                        if (iArray == null) break block41;
                                        if (n4 == 0) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.d.p.a(matchException);
                                    }
                                    n4 = -24001;
                                    break block41;
                                }
                                n4 = pulsescanner.d.c.e();
                            }
                            n3 = n4;
                            try {
                                pulsescanner.g.b.a(class_3322, f8, f7, f9, 11.0f, 5.5f, pulsescanner.g.b.a(n3, 51));
                                class_3323 = class_3322;
                                string = string2;
                                f6 = f8 + f9 / 2.0f;
                                f5 = f7 + 2.0f;
                                n2 = this.L.isEmpty();
                                if (iArray == null) break block43;
                                if (n2 == 0) break block44;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.p.a(matchException);
                            }
                            n2 = pulsescanner.d.c.c();
                            break block43;
                        }
                        n2 = n3;
                    }
                    pulsescanner.g.e.a(class_3323, string, f6, f5, n2, false);
                    float f10 = this.z + 6.0f + 13.0f - 2.0f;
                    pulsescanner.g.b.a(class_3322, this.y + 6.0f, f10, this.A - 12.0f, Math.max(pulsescanner.g.b.a(), 0.5f), 0x22FFFFFF);
                    f3 = this.z + 6.0f + 13.0f + 2.0f;
                    try {
                        try {
                            p2 = this;
                            if (iArray == null) break block45;
                            if (!p2.L.isEmpty()) break block46;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.p.a(matchException);
                        }
                        pulsescanner.d.c.a(class_3322, O[3], this.y + 6.0f, f3 + 1.0f, pulsescanner.d.c.c());
                        pulsescanner.g.b.a = f4;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.p.a(matchException);
                    }
                }
                p2 = this;
            }
            float f11 = p2.z();
            for (u u2 : this.L) {
                block60: {
                    int n5;
                    float f12;
                    float f13;
                    block59: {
                        block57: {
                            int n6;
                            block58: {
                                int n7;
                                float f14;
                                float f15;
                                String string;
                                class_332 class_3324;
                                int n8;
                                block55: {
                                    block56: {
                                        float f16;
                                        block52: {
                                            block54: {
                                                int n9;
                                                block50: {
                                                    block51: {
                                                        int n10;
                                                        block49: {
                                                            block48: {
                                                                try {
                                                                    try {
                                                                        if (iArray == null) break block47;
                                                                        if (u2.am() != pulsescanner.f.d.a.WATCHING) break block48;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.d.p.a(matchException);
                                                                    }
                                                                    n10 = 1;
                                                                    break block49;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.d.p.a(matchException);
                                                                }
                                                            }
                                                            n10 = 0;
                                                        }
                                                        n6 = n10;
                                                        try {
                                                            n9 = n6;
                                                            if (iArray == null) break block50;
                                                            if (n9 == 0) break block51;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.d.p.a(matchException);
                                                        }
                                                        n9 = -24001;
                                                        break block50;
                                                    }
                                                    n9 = -12132214;
                                                }
                                                n8 = n9;
                                                f13 = f3 + f11 / 2.0f;
                                                f16 = this.y + 6.0f;
                                                try {
                                                    block53: {
                                                        try {
                                                            try {
                                                                if (!((Boolean)this.G.a()).booleanValue()) break block52;
                                                                if (u2.al() == null) break block53;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.d.p.a(matchException);
                                                            }
                                                            class_7532.method_52722((class_332)class_3322, (class_8685)u2.al().method_52810(), (int)Math.round(f16), (int)Math.round(f13 - 5.5f), (int)11);
                                                            if (iArray != null) break block54;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.d.p.a(matchException);
                                                        }
                                                    }
                                                    pulsescanner.g.b.a(class_3322, f16, f13 - 5.5f, 11.0f, 11.0f, 3.0f, 0x22FFFFFF);
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.d.p.a(matchException);
                                                }
                                            }
                                            f16 += 15.0f;
                                        }
                                        try {
                                            try {
                                                class_3324 = class_3322;
                                                string = u2.ak();
                                                f15 = f16;
                                                f14 = f13;
                                                n7 = pulsescanner.g.e.e();
                                                if (iArray == null) break block55;
                                                f14 = f14 - (float)n7 / 2.0f;
                                                if (n6 == 0) break block56;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.d.p.a(matchException);
                                            }
                                            n7 = -24001;
                                            break block55;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.d.p.a(matchException);
                                        }
                                    }
                                    n7 = pulsescanner.d.c.d();
                                }
                                pulsescanner.d.c.a(class_3324, string, f15, f14, n7);
                                f12 = this.y + this.A - 6.0f - 2.5f;
                                try {
                                    n5 = ((Boolean)this.H.a()).booleanValue();
                                    if (iArray == null) break block57;
                                    if (n5 == 0) break block58;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.d.p.a(matchException);
                                }
                                pulsescanner.g.b.b(class_3322, f12, f13, 5.0f, pulsescanner.g.b.a(n8, 85));
                                pulsescanner.g.b.a(class_3322, f12, f13, 2.1f, n8);
                                f12 -= 10.0f;
                            }
                            n5 = n6;
                        }
                        try {
                            try {
                                if (iArray == null) break block59;
                                if (n5 == 0) break block60;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.p.a(matchException);
                            }
                            n5 = ((Boolean)this.I.a()).booleanValue() ? 1 : 0;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.p.a(matchException);
                        }
                    }
                    if (n5 != 0) {
                        String string = t.a(u2.an());
                        pulsescanner.d.c.a(class_3322, string, f12 - (float)pulsescanner.g.e.a(string), f13 - (float)pulsescanner.g.e.e() / 2.0f, -24001);
                    }
                }
                f3 += f11;
                if (iArray != null) continue;
            }
            pulsescanner.g.b.a = f4;
        }
        try {
            if (pulsescanner.f.i.n() != null) {
                pulsescanner.f.d.a.b(new i[2]);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.p.a(matchException);
        }
    }

    private static Long lambda$watchMs$2(long l2, UUID uUID) {
        return l2;
    }

    private static String lambda$refresh$1(u u2) {
        return u2.ak();
    }

    private static int lambda$refresh$0(u u2) {
        int n2;
        try {
            n2 = u2.am() == pulsescanner.f.d.a.WATCHING ? 0 : 1;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.p.a(matchException);
        }
        return n2;
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
                var5 = new String[16];
                var3_1 = 0;
                var2_2 = "z}k'|gpZae$)upMzpp2c(]5p?|c1J}$#(g6O;\u000blmp\"=&\u0003]tb6+z}k'/&'A|g8|u$Hsbp=t5\tzj<5h5\tzjp(n5\tfa\"*c\"\u0007\u000fgz$#(g6O5k>0o>L\u000fgz$#(g6O5k>0o>L\u001ez}k'|c1J}$#(g6O5i51d5[2wp4c1M;\ff{h92cpzae6:\tzae6:&\u0018|Q\u0005}|p<91z}k'|n?^5h?2apH5r12o#Ap`p/r1Os$8=upKpa>|q1]vl92a~\u0007hce$=t#+dzv5|u$Hsbp2g=Lf$$3&$[tg;p&3Fxi1|u5Ytv1(c4\u0007\nf{h92cpmzp\u000eytj50&8Lt`92a~";
                var4_3 = "z}k'|gpZae$)upMzpp2c(]5p?|c1J}$#(g6O;\u000blmp\"=&\u0003]tb6+z}k'/&'A|g8|u$Hsbp=t5\tzj<5h5\tzjp(n5\tfa\"*c\"\u0007\u000fgz$#(g6O5k>0o>L\u000fgz$#(g6O5k>0o>L\u001ez}k'|c1J}$#(g6O5i51d5[2wp4c1M;\ff{h92cpzae6:\tzae6:&\u0018|Q\u0005}|p<91z}k'|n?^5h?2apH5r12o#Ap`p/r1Os$8=upKpa>|q1]vl92a~\u0007hce$=t#+dzv5|u$Hsbp2g=Lf$$3&$[tg;p&3Fxi1|u5Ytv1(c4\u0007\nf{h92cpmzp\u000eytj50&8Lt`92a~".length();
                var1_4 = 37;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 68;
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
                    var2_2 = "q{\u007f<;)\u000bOwn\u0005\u0016*1oc";
                    var4_3 = "q{\u007f<;)\u000bOwn\u0005\u0016*1oc".length();
                    var1_4 = 10;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 75;
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
                        v11 = 109;
                        break;
                    }
                    case 1: {
                        v11 = 81;
                        break;
                    }
                    case 2: {
                        v11 = 64;
                        break;
                    }
                    case 3: {
                        v11 = 20;
                        break;
                    }
                    case 4: {
                        v11 = 24;
                        break;
                    }
                    case 5: {
                        v11 = 66;
                        break;
                    }
                    default: {
                        v11 = 20;
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
        pulsescanner.f.d.p.O = var5;
    }
}

