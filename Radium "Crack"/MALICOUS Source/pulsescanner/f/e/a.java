/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_640
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 */
package pulsescanner.f.e;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_746;
import pulsescanner.f.d.t;
import pulsescanner.f.e.b;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;

public class a
extends i {
    public final c l;
    public final c m;
    public final c n;
    public final c o;
    private final Map<UUID, pulsescanner.f.d.a> p;
    private final Map<UUID, String> q;
    private final Set<String> r;
    private boolean s;
    private int t;
    private static final String[] u;

    public a() {
        String[] stringArray = u;
        super(stringArray[12], stringArray[11], pulsescanner.f.h.MISC);
        this.l = this.a(new c(stringArray[9], stringArray[15], true));
        this.m = this.a(new c(stringArray[13], stringArray[7], true));
        this.n = this.a(new c(stringArray[2], stringArray[8], false));
        this.o = this.a(new c(stringArray[3], stringArray[0], false));
        this.p = new HashMap<UUID, pulsescanner.f.d.a>();
        this.q = new HashMap<UUID, String>();
        this.r = new HashSet<String>();
    }

    @Override
    protected void g() {
        this.o();
    }

    @Override
    protected void h() {
        this.o();
    }

    @Override
    public void l() {
        this.o();
    }

    private void o() {
        this.p.clear();
        this.q.clear();
        this.r.clear();
        this.s = false;
        this.t = 0;
    }

    @Override
    public String f() {
        String string;
        try {
            string = this.t > 0 ? this.t + u[16] : null;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.e.a.a(matchException);
        }
        return string;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void i() {
        block120: {
            block119: {
                block117: {
                    block110: {
                        block111: {
                            block97: {
                                block109: {
                                    block105: {
                                        block104: {
                                            block95: {
                                                block96: {
                                                    var2_1 = pulsescanner.f.e.a.a.method_1562();
                                                    var1_2 = pulsescanner.f.e.b.G();
                                                    try {
                                                        block94: {
                                                            try {
                                                                try {
                                                                    if (var2_1 == null) break block94;
                                                                    v0 = pulsescanner.f.e.a.a;
                                                                    if (var1_2) break block95;
                                                                }
                                                                catch (MatchException v1) {
                                                                    throw pulsescanner.f.e.a.a(v1);
                                                                }
                                                                if (v0.field_1724 != null) break block96;
                                                            }
                                                            catch (MatchException v2) {
                                                                throw pulsescanner.f.e.a.a(v2);
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw pulsescanner.f.e.a.a(v3);
                                                    }
                                                }
                                                v0 = pulsescanner.f.e.a.a;
                                            }
                                            var3_3 = v0.field_1724.method_7334().name();
                                            var4_4 = pulsescanner.f.d.t.a("");
                                            var5_5 = new HashMap<UUID, pulsescanner.f.d.a>();
                                            var6_6 = new HashMap<UUID, Object>();
                                            var7_7 = new HashSet<String>();
                                            var8_8 = var2_1.method_2880().iterator();
                                            while (var8_8.hasNext()) {
                                                block101: {
                                                    block102: {
                                                        block99: {
                                                            block98: {
                                                                v4 = var9_9 = (class_640)var8_8.next();
                                                                if (var1_2) break block97;
                                                                var10_10 = v4.method_2966().name();
                                                                try {
                                                                    v5 = var10_10;
                                                                    if (var1_2) break block98;
                                                                    if (v5 == null) continue;
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw pulsescanner.f.e.a.a(v6);
                                                                }
                                                                v5 = var10_10;
                                                            }
                                                            try {
                                                                try {
                                                                    if (var1_2) break block99;
                                                                    if (v5.equals(var3_3)) {
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (MatchException v7) {
                                                                    throw pulsescanner.f.e.a.a(v7);
                                                                }
                                                            }
                                                            catch (MatchException v8) {
                                                                throw pulsescanner.f.e.a.a(v8);
                                                            }
                                                            v5 = var10_10;
                                                        }
                                                        try {
                                                            v9 = pulsescanner.f.d.t.a(v5, var4_4);
                                                            if (var1_2) break block101;
                                                            if (v9) {
                                                            }
                                                            ** GOTO lbl82
                                                        }
                                                        catch (MatchException v10) {
                                                            throw pulsescanner.f.e.a.a(v10);
                                                        }
                                                        var11_11 /* !! */  = var9_9.method_2966().id();
                                                        try {
                                                            try {
                                                                if (var1_2) break block102;
                                                                if (var11_11 /* !! */  == null) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (MatchException v11) {
                                                                throw pulsescanner.f.e.a.a(v11);
                                                            }
                                                        }
                                                        catch (MatchException v12) {
                                                            throw pulsescanner.f.e.a.a(v12);
                                                        }
                                                        var5_5.put(var11_11 /* !! */ , pulsescanner.f.d.t.a(var2_1, (class_640)var9_9));
                                                        var6_6.put(var11_11 /* !! */ , var10_10);
                                                    }
                                                    try {
                                                        if (!var1_2) break block101;
lbl82:
                                                        // 2 sources

                                                        v9 = var7_7.add((String)var10_10);
                                                    }
                                                    catch (MatchException v13) {
                                                        throw pulsescanner.f.e.a.a(v13);
                                                    }
                                                }
                                                if (!var1_2) continue;
                                            }
                                            try {
                                                try {
                                                    v14 = pulsescanner.f.e.a.a;
                                                    if (var1_2) break block104;
                                                    if (v14.field_1687 == null) break block105;
                                                }
                                                catch (MatchException v15) {
                                                    throw pulsescanner.f.e.a.a(v15);
                                                }
                                                v14 = pulsescanner.f.e.a.a;
                                            }
                                            catch (MatchException v16) {
                                                throw pulsescanner.f.e.a.a(v16);
                                            }
                                        }
                                        var8_8 = v14.field_1687.method_18456().iterator();
                                        while (true) {
                                            block108: {
                                                block107: {
                                                    block106: {
                                                        try {
                                                            if (!var8_8.hasNext()) break;
                                                            v4 = (class_742)var8_8.next();
                                                            if (var1_2) break block97;
                                                        }
                                                        catch (MatchException v17) {
                                                            throw pulsescanner.f.e.a.a(v17);
                                                        }
                                                        var9_9 = v4;
                                                        var10_10 = var9_9.method_7334().name();
                                                        try {
                                                            v18 = var10_10;
                                                            if (var1_2) break block106;
                                                            if (v18 == null) continue;
                                                        }
                                                        catch (MatchException v19) {
                                                            throw pulsescanner.f.e.a.a(v19);
                                                        }
                                                        v18 = var10_10;
                                                    }
                                                    try {
                                                        if (var1_2) break block107;
                                                        if (v18.equals(var3_3)) continue;
                                                    }
                                                    catch (MatchException v20) {
                                                        throw pulsescanner.f.e.a.a(v20);
                                                    }
                                                    v18 = var10_10;
                                                }
                                                try {
                                                    if (!pulsescanner.f.d.t.a((String)v18, var4_4)) {
                                                        continue;
                                                    }
                                                }
                                                catch (MatchException v21) {
                                                    throw pulsescanner.f.e.a.a(v21);
                                                }
                                                var11_11 /* !! */  = var9_9.method_7334().id();
                                                try {
                                                    try {
                                                        try {
                                                            if (var11_11 /* !! */  == null) break block108;
                                                            v22 = var5_5;
                                                            if (var1_2) break block108;
                                                        }
                                                        catch (MatchException v23) {
                                                            throw pulsescanner.f.e.a.a(v23);
                                                        }
                                                        if (v22.containsKey(var11_11 /* !! */ )) break block108;
                                                    }
                                                    catch (MatchException v24) {
                                                        throw pulsescanner.f.e.a.a(v24);
                                                    }
                                                    var5_5.put(var11_11 /* !! */ , pulsescanner.f.d.a.WATCHING);
                                                    v22 = var6_6.put(var11_11 /* !! */ , var10_10);
                                                }
                                                catch (MatchException v25) {
                                                    throw pulsescanner.f.e.a.a(v25);
                                                }
                                            }
                                            if (var1_2) break;
                                        }
                                    }
                                    this.t = 0;
                                    var8_8 = var5_5.values().iterator();
                                    while (var8_8.hasNext()) {
                                        v4 = var8_8;
                                        if (var1_2) break block97;
                                        var9_9 = (pulsescanner.f.d.a)v4.next();
                                        try {
                                            if (var9_9 == pulsescanner.f.d.a.WATCHING) {
                                                ++this.t;
                                            }
                                        }
                                        catch (MatchException v26) {
                                            throw pulsescanner.f.e.a.a(v26);
                                        }
                                        if (!var1_2) continue;
                                    }
                                    try {
                                        try {
                                            v4 = this;
                                            if (var1_2) break block97;
                                            if (v4.s) break block109;
                                        }
                                        catch (MatchException v27) {
                                            throw pulsescanner.f.e.a.a(v27);
                                        }
                                        this.p.putAll(var5_5);
                                        this.q.putAll(var6_6);
                                        this.r.addAll(var7_7);
                                        this.s = true;
                                        return;
                                    }
                                    catch (MatchException v28) {
                                        throw pulsescanner.f.e.a.a(v28);
                                    }
                                }
                                v4 = this.l.a();
                            }
                            try {
                                if (var1_2) break block110;
                                if (!((Boolean)v4).booleanValue()) break block111;
                            }
                            catch (MatchException v29) {
                                throw pulsescanner.f.e.a.a(v29);
                            }
                            for (Object v4 : var5_5.entrySet()) {
                                block114: {
                                    block115: {
                                        block112: {
                                            if (var1_2) break block110;
                                            var9_9 = (Map.Entry)v4;
                                            var10_10 = (UUID)var9_9.getKey();
                                            var11_11 /* !! */  = (pulsescanner.f.d.a)var9_9.getValue();
                                            var12_12 = this.p.get(var10_10);
                                            var13_13 = (String)var6_6.get(var10_10);
                                            try {
                                                block113: {
                                                    try {
                                                        try {
                                                            try {
                                                                v30 /* !! */  = var12_12;
                                                                if (var1_2) break block112;
                                                                if (v30 /* !! */  != null) break block113;
                                                            }
                                                            catch (MatchException v31) {
                                                                throw pulsescanner.f.e.a.a(v31);
                                                            }
                                                            if (var11_11 /* !! */  != pulsescanner.f.d.a.WATCHING) break block114;
                                                        }
                                                        catch (MatchException v32) {
                                                            throw pulsescanner.f.e.a.a(v32);
                                                        }
                                                        this.a(var13_13 + pulsescanner.f.e.a.u[4], true);
                                                        if (!var1_2) break block114;
                                                    }
                                                    catch (MatchException v33) {
                                                        throw pulsescanner.f.e.a.a(v33);
                                                    }
                                                }
                                                v30 /* !! */  = var12_12;
                                            }
                                            catch (MatchException v34) {
                                                throw pulsescanner.f.e.a.a(v34);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var1_2) break block115;
                                                if (v30 /* !! */  == var11_11 /* !! */ ) break block114;
                                            }
                                            catch (MatchException v35) {
                                                throw pulsescanner.f.e.a.a(v35);
                                            }
                                            v30 /* !! */  = var11_11 /* !! */ ;
                                        }
                                        catch (MatchException v36) {
                                            throw pulsescanner.f.e.a.a(v36);
                                        }
                                    }
                                    try {
                                        block116: {
                                            try {
                                                if (v30 /* !! */  != pulsescanner.f.d.a.WATCHING) break block116;
                                                this.a(var13_13 + pulsescanner.f.e.a.u[17], true);
                                                if (!var1_2) break block114;
                                            }
                                            catch (MatchException v37) {
                                                throw pulsescanner.f.e.a.a(v37);
                                            }
                                        }
                                        this.a(var13_13 + pulsescanner.f.e.a.u[10], false);
                                    }
                                    catch (MatchException v38) {
                                        throw pulsescanner.f.e.a.a(v38);
                                    }
                                }
                                if (!var1_2) continue;
                            }
                            var8_8 = this.p.keySet().iterator();
                            while (var8_8.hasNext()) {
                                v4 = var8_8;
                                if (var1_2) break block110;
                                var9_9 = (UUID)v4.next();
                                try {
                                    if (!var5_5.containsKey(var9_9)) {
                                        this.a(this.q.getOrDefault(var9_9, pulsescanner.f.e.a.u[14]) + pulsescanner.f.e.a.u[6], false);
                                    }
                                }
                                catch (MatchException v39) {
                                    throw pulsescanner.f.e.a.a(v39);
                                }
                                if (!var1_2) continue;
                            }
                        }
                        try {
                            v40 = this.m;
                            if (var1_2) break block117;
                            v4 = v40.a();
                        }
                        catch (MatchException v41) {
                            throw pulsescanner.f.e.a.a(v41);
                        }
                    }
                    if (((Boolean)v4).booleanValue()) {
                        for (Object var9_9 : this.r) {
                            block118: {
                                try {
                                    try {
                                        v40 = var7_7;
                                        if (var1_2) break block117;
                                        if (v40.contains(var9_9)) break block118;
                                    }
                                    catch (MatchException v42) {
                                        throw pulsescanner.f.e.a.a(v42);
                                    }
                                    this.a((String)var9_9 + pulsescanner.f.e.a.u[1], true);
                                }
                                catch (MatchException v43) {
                                    throw pulsescanner.f.e.a.a(v43);
                                }
                            }
                            if (!var1_2) continue;
                        }
                    }
                    try {
                        v44 = this;
                        if (var1_2) break block119;
                        v40 = v44.n.a();
                    }
                    catch (MatchException v45) {
                        throw pulsescanner.f.e.a.a(v45);
                    }
                }
                if (((Boolean)v40).booleanValue()) {
                    for (Object var9_9 : var7_7) {
                        block122: {
                            block121: {
                                try {
                                    try {
                                        try {
                                            if (var1_2) break block120;
                                            v46 = this;
                                            if (var1_2) break block121;
                                        }
                                        catch (MatchException v47) {
                                            throw pulsescanner.f.e.a.a(v47);
                                        }
                                        if (v46.r.contains(var9_9)) break block122;
                                    }
                                    catch (MatchException v48) {
                                        throw pulsescanner.f.e.a.a(v48);
                                    }
                                    v46 = this;
                                }
                                catch (MatchException v49) {
                                    throw pulsescanner.f.e.a.a(v49);
                                }
                            }
                            v46.a((String)var9_9 + pulsescanner.f.e.a.u[5], false);
                        }
                        if (!var1_2) continue;
                    }
                }
                this.p.clear();
                this.p.putAll(var5_5);
                this.q.clear();
                this.q.putAll(var6_6);
                this.r.clear();
                v44 = this;
            }
            v44.r.addAll(var7_7);
        }
    }

    private void a(String string, boolean bl) {
        block10: {
            float f2;
            float f3;
            class_3414 class_34142;
            class_746 class_7462;
            block12: {
                block11: {
                    block9: {
                        block8: {
                            try {
                                if (!bl) break block8;
                                this.b(string);
                                break block9;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.a.a(matchException);
                            }
                        }
                        this.a(string);
                    }
                    try {
                        try {
                            try {
                                if (!((Boolean)this.o.a()).booleanValue() || pulsescanner.f.e.a.a.field_1724 == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.e.a.a(matchException);
                            }
                            class_7462 = pulsescanner.f.e.a.a.field_1724;
                            class_34142 = (class_3414)class_3417.field_14622.comp_349();
                            f3 = 1.0f;
                            if (!bl) break block11;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.e.a.a(matchException);
                        }
                        f2 = 0.7f;
                        break block12;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.e.a.a(matchException);
                    }
                }
                f2 = 1.4f;
            }
            class_7462.method_5783(class_34142, f3, f2);
        }
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
                var5 = new String[18];
                var3_1 = 0;
                var2_2 = "\u0001\u0010md\u001a$\u0013!\u0015bz\u001a2Z%\u0014,x[&[q\u0012ciS#Z2\u001dxtU+\u001d\u0012q\u0010i{NeG9\u0019,i['\u0013=\u0015\u007fi\t\u001e\u0012,\\J5V0\u000e\u0005\u0002\u0013ys^\u0017q\u0015\u007f=M$G2\u0014es]e\u001b'\u001dbtI-V5U\tq\u001d|m_$A4\u0018\u0005q\u0010i{N1\u001f\u0013xt\\<\u0013&\u0014is\u001a$](\\ciR Aq\f`|C Aq\u0010i|L @q\bdx\u001a1R3\\`tI1\u001d9\u001f\u0013xt\\<\u0013&\u0014is\u001a$](\\ciR Aq\f`|C AqT~x\u0013$C!\u0019moIe\\?\\xu_eG0\u001e,qS6G\u007f\f\u0002\bm{\\er=\u0019~iI\u0011q\u0015\u007f=L,@8\u001e`x\u001a$T0\u0015bR\u0017\u0010mzIeC=\u001duxH6\u0013'\u001dbtI-Z?\u001b,{H*^q\bdx\u001a1R3\\`tI1\u001fq\u001dby\u001a6G0\u001aj=M-\\q\nmsS6[q\u001eyi\u001a.V4\f,j[1P9\u0015bz\u0014\u000b\u0010\u0012xt\u001a\u0013R?\u0015\u007fu\t\u001e\u0012,K[+Z\"\u0014\u000e\u0010\\\u007fi[#Uq\u0011ipX A<\u0010\u0010ioNeD9\u0019b=Q+\\&\u0012,nN$U7\\z|T,@9P,nN$A%\\{|N&[8\u0012k1\u001a*Aq\u001fcp_eQ0\u001fg3";
                var4_3 = "\u0001\u0010md\u001a$\u0013!\u0015bz\u001a2Z%\u0014,x[&[q\u0012ciS#Z2\u001dxtU+\u001d\u0012q\u0010i{NeG9\u0019,i['\u0013=\u0015\u007fi\t\u001e\u0012,\\J5V0\u000e\u0005\u0002\u0013ys^\u0017q\u0015\u007f=M$G2\u0014es]e\u001b'\u001dbtI-V5U\tq\u001d|m_$A4\u0018\u0005q\u0010i{N1\u001f\u0013xt\\<\u0013&\u0014is\u001a$](\\ciR Aq\f`|C Aq\u0010i|L @q\bdx\u001a1R3\\`tI1\u001d9\u001f\u0013xt\\<\u0013&\u0014is\u001a$](\\ciR Aq\f`|C AqT~x\u0013$C!\u0019moIe\\?\\xu_eG0\u001e,qS6G\u007f\f\u0002\bm{\\er=\u0019~iI\u0011q\u0015\u007f=L,@8\u001e`x\u001a$T0\u0015bR\u0017\u0010mzIeC=\u001duxH6\u0013'\u001dbtI-Z?\u001b,{H*^q\bdx\u001a1R3\\`tI1\u001fq\u001dby\u001a6G0\u001aj=M-\\q\nmsS6[q\u001eyi\u001a.V4\f,j[1P9\u0015bz\u0014\u000b\u0010\u0012xt\u001a\u0013R?\u0015\u007fu\t\u001e\u0012,K[+Z\"\u0014\u000e\u0010\\\u007fi[#Uq\u0011ipX A<\u0010\u0010ioNeD9\u0019b=Q+\\&\u0012,nN$U7\\z|T,@9P,nN$A%\\{|N&[8\u0012k1\u001a*Aq\u001fcp_eQ0\u001fg3".length();
                var1_4 = 35;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 1;
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
                    var2_2 = "f\u001cz~N:M(\f\u001af\u001dzdD!L#\u000f;\u201e\r!P/\u0007w*Z3P%\u0003rdJ";
                    var4_3 = "f\u001cz~N:M(\f\u001af\u001dzdD!L#\u000f;\u201e\r!P/\u0007w*Z3P%\u0003rdJ".length();
                    var1_4 = 9;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 22;
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
                        v11 = 80;
                        break;
                    }
                    case 1: {
                        v11 = 125;
                        break;
                    }
                    case 2: {
                        v11 = 13;
                        break;
                    }
                    case 3: {
                        v11 = 28;
                        break;
                    }
                    case 4: {
                        v11 = 59;
                        break;
                    }
                    case 5: {
                        v11 = 68;
                        break;
                    }
                    default: {
                        v11 = 50;
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
        pulsescanner.f.e.a.u = var5;
    }
}

