/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5498
 */
package pulsescanner.f.f;

import net.minecraft.class_5498;
import pulsescanner.f.f.q;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.e;
import pulsescanner.i.f;

public class h
extends i {
    public final f l;
    public final e m;
    public final c n;
    public final c o;
    public float p;
    public float q;
    private boolean r;
    private class_5498 s;
    private static final String[] t;

    public h() {
        String[] stringArray = t;
        super(stringArray[7], stringArray[8], pulsescanner.f.h.RENDER);
        this.l = this.a(new f(stringArray[4], stringArray[6], stringArray[11], stringArray[11], stringArray[0]));
        this.m = this.a(new e(stringArray[5], stringArray[1], 342));
        this.n = this.a(new c(stringArray[2], stringArray[10], true));
        this.o = this.a(new c(stringArray[12], stringArray[13], false));
    }

    public boolean o() {
        return this.r;
    }

    @Override
    public boolean b(int n2) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.m.g() || n2 != (Integer)this.m.a()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.h.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.h.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public String f() {
        return (String)this.l.a();
    }

    @Override
    public void i() {
        block38: {
            h h2;
            block40: {
                boolean bl;
                block39: {
                    i[] iArray;
                    block36: {
                        h h3;
                        block34: {
                            block35: {
                                block30: {
                                    block31: {
                                        block33: {
                                            h h4;
                                            block32: {
                                                iArray = pulsescanner.f.f.q.r();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                h3 = this;
                                                                if (iArray != null) break block30;
                                                                if (h3.m()) break block31;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.f.h.a(matchException);
                                                            }
                                                            h4 = this;
                                                            if (iArray != null) break block32;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.f.f.h.a(matchException);
                                                        }
                                                        if (!h4.r) break block33;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.f.f.h.a(matchException);
                                                    }
                                                    h4 = this;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.f.h.a(matchException);
                                                }
                                            }
                                            h4.q();
                                        }
                                        return;
                                    }
                                    h3 = this;
                                }
                                try {
                                    try {
                                        if (iArray != null) break block34;
                                        if (h3.l.a(t[9])) break block35;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.f.h.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.f.h.a(matchException);
                                }
                            }
                            h3 = this;
                        }
                        boolean bl2 = h3.m.h();
                        try {
                            block37: {
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = bl2;
                                                if (iArray != null) break block36;
                                                if (!bl) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.f.h.a(matchException);
                                            }
                                            bl = this.r;
                                            if (iArray != null) break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.f.h.a(matchException);
                                        }
                                        if (bl) break block37;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.f.h.a(matchException);
                                    }
                                    this.p();
                                    if (iArray == null) break block38;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.f.h.a(matchException);
                                }
                            }
                            bl = bl2;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.h.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (iArray != null) break block39;
                                if (bl) break block38;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.h.a(matchException);
                            }
                            h2 = this;
                            if (iArray != null) break block40;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.h.a(matchException);
                        }
                        bl = h2.r;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.h.a(matchException);
                    }
                }
                if (!bl) break block38;
                h2 = this;
            }
            h2.q();
        }
    }

    @Override
    public void a(int n2) {
        block8: {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (!this.l.a(t[3]) || n2 != (Integer)this.m.a()) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.f.h.a(matchException);
                            }
                            if (!this.m()) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.f.h.a(matchException);
                        }
                        if (!this.r) break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.h.a(matchException);
                    }
                    this.q();
                    break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.h.a(matchException);
                }
            }
            this.p();
        }
    }

    @Override
    protected void h() {
        try {
            if (this.r) {
                this.q();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.h.a(matchException);
        }
    }

    private void p() {
        block8: {
            h h2;
            block7: {
                this.r = true;
                i[] iArray = pulsescanner.f.f.q.r();
                try {
                    try {
                        this.p = pulsescanner.f.f.h.a.field_1724.method_36454();
                        h2 = this;
                        if (iArray != null) break block7;
                        h2.q = pulsescanner.f.f.h.a.field_1724.method_36455();
                        this.s = pulsescanner.f.f.h.a.field_1690.method_31044();
                        if (!((Boolean)this.n.a()).booleanValue()) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.f.h.a(matchException);
                    }
                    h2 = this;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.f.h.a(matchException);
                }
            }
            try {
                if (h2.s == class_5498.field_26664) {
                    pulsescanner.f.f.h.a.field_1690.method_31043(class_5498.field_26665);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.f.h.a(matchException);
            }
        }
    }

    private void q() {
        try {
            this.r = false;
            if (this.s != null) {
                pulsescanner.f.f.h.a.field_1690.method_31043(this.s);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.h.a(matchException);
        }
        this.s = null;
    }

    public void a(double d2, double d3) {
        int n2;
        float f2;
        float f3;
        try {
            this.p += (float)(d2 * 0.15);
            h h2 = this;
            h h3 = h2;
            f3 = h2.q;
            f2 = (float)(d3 * 0.15);
            n2 = (Boolean)this.o.a() != false ? -1 : 1;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.f.h.a(matchException);
        }
        h3.q = f3 + f2 * (float)n2;
        this.q = Math.max(-90.0f, Math.min(90.0f, this.q));
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
                var5 = new String[14];
                var3_1 = 0;
                var2_2 = "N\u0004\rWVf\u001cQ\u000e\u0013\u0010Nk^nK\u000bSNjI{\u001f\u000fC\u001aeM\u007f\u000e\u0006_Uh\u0011\fN\u0003\u0003B^#o\u007f\u0019\u0019_T\u0006N\u0004\rWVf\u0004W\u0004\u000eU\bV\u0004\u0005[\u001aHZcLR\u0004\u0006T\u001awW\u007fK\u0001UC/\u001fu\u0019J@HfLiK\u0003D\u001alQy\u000eJDU#Ko\u0019\u0004\u0010\\qZ\u007f\u0007\u0005_Q#PtK\u000b^^#^}\n\u0003^\u001awP:\u001f\u001fBT#VnK\u0005V\\-\b\\\u0019\u000fUVlPq.H\u0004\u001eQNf\u001fn\u0003\u000f\u0010YbR\u007f\u0019\u000b\u0010MjKr\u0004\u001fD\u001awJh\u0005\u0003^]#Fu\u001e\u0018\u0010Jo^c\u000e\u0018\u001e\u0004R\u0004\u0006T)I\u001c\u0003DYk\u001fn\u0004JDRjM~K\u001aUHpPtK\u001dXSoZ:\r\u0018U_oPu\u0000\u0003^]-\u0004R\u0004\u0006T";
                var4_3 = "N\u0004\rWVf\u001cQ\u000e\u0013\u0010Nk^nK\u000bSNjI{\u001f\u000fC\u001aeM\u007f\u000e\u0006_Uh\u0011\fN\u0003\u0003B^#o\u007f\u0019\u0019_T\u0006N\u0004\rWVf\u0004W\u0004\u000eU\bV\u0004\u0005[\u001aHZcLR\u0004\u0006T\u001awW\u007fK\u0001UC/\u001fu\u0019J@HfLiK\u0003D\u001alQy\u000eJDU#Ko\u0019\u0004\u0010\\qZ\u007f\u0007\u0005_Q#PtK\u000b^^#^}\n\u0003^\u001awP:\u001f\u001fBT#VnK\u0005V\\-\b\\\u0019\u000fUVlPq.H\u0004\u001eQNf\u001fn\u0003\u000f\u0010YbR\u007f\u0019\u000b\u0010MjKr\u0004\u001fD\u001awJh\u0005\u0003^]#Fu\u001e\u0018\u0010Jo^c\u000e\u0018\u001e\u0004R\u0004\u0006T)I\u001c\u0003DYk\u001fn\u0004JDRjM~K\u001aUHpPtK\u001dXSoZ:\r\u0018U_oPu\u0000\u0003^]-\u0004R\u0004\u0006T".length();
                var1_4 = 6;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 66;
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
                    var2_2 = "A\u0017\u000eGZe\rX\u0010\fA@ A\u0017\u000eGZe\r~\u001c\nVArLdY\u001bCEt_iY\u0015M^t@m\u0017\f\f";
                    var4_3 = "A\u0017\u000eGZe\rX\u0010\fA@ A\u0017\u000eGZe\r~\u001c\nVArLdY\u001bCEt_iY\u0015M^t@m\u0017\f\f".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 80;
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
                        v11 = 88;
                        break;
                    }
                    case 1: {
                        v11 = 41;
                        break;
                    }
                    case 2: {
                        v11 = 40;
                        break;
                    }
                    case 3: {
                        v11 = 114;
                        break;
                    }
                    case 4: {
                        v11 = 120;
                        break;
                    }
                    case 5: {
                        v11 = 65;
                        break;
                    }
                    default: {
                        v11 = 125;
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
        pulsescanner.f.f.h.t = var5;
    }
}

