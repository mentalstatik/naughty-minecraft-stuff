/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import pulsescanner.f.d.a;
import pulsescanner.f.f.q;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.g.e;
import pulsescanner.i.c;
import pulsescanner.i.f;
import pulsescanner.i.g;

public class n
extends j {
    public final g x;
    public final g C;
    public final f D;
    public final c E;
    public final c F;
    public final c G;
    public final c H;
    private static final String[] I;

    public n() {
        String[] stringArray = I;
        super(stringArray[3], stringArray[6], 0, 2, 4.0f, 96.0f);
        this.x = this.a(new g(stringArray[8], stringArray[1], 96.0, 60.0, 180.0, 2.0));
        this.C = this.a(new g(stringArray[14], stringArray[17], 64.0, 16.0, 256.0, 4.0, "m"));
        this.D = this.a(new f(stringArray[13], stringArray[7], stringArray[16], stringArray[16], stringArray[0]));
        this.E = this.a(new c(stringArray[12], stringArray[10], true));
        this.F = this.a(new c(stringArray[2], stringArray[4], true));
        this.G = this.a(new c(stringArray[11], stringArray[15], true));
        this.H = this.a(new c(stringArray[18], stringArray[9], true));
    }

    @Override
    public void r() {
        this.A = this.B = this.x.g();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void b(class_332 class_3322, float f2) {
        block87: {
            Object object;
            float f3;
            float f4;
            block88: {
                Object object2;
                i[] iArray;
                block86: {
                    void var21_24;
                    float f5;
                    Object object3;
                    float f6;
                    Object object4;
                    float f7;
                    block70: {
                        block71: {
                            float f8;
                            float f9;
                            float f10;
                            boolean bl;
                            float f11;
                            block89: {
                                block69: {
                                    class_310 class_3102;
                                    block68: {
                                        float f12;
                                        block67: {
                                            block66: {
                                                boolean bl2;
                                                int n2;
                                                block63: {
                                                    block64: {
                                                        block65: {
                                                            f12 = this.x.g();
                                                            f11 = f12 / 2.0f;
                                                            f4 = this.y + f11;
                                                            f3 = this.z + f11;
                                                            iArray = pulsescanner.f.d.a.b();
                                                            bl = this.D.a(I[5]);
                                                            pulsescanner.f.b.c c2 = pulsescanner.f.m.a(pulsescanner.f.b.c.class);
                                                            n2 = (int)((Double)c2.n.a() * 2.55);
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            bl2 = (Boolean)c2.q.a();
                                                                            if (iArray == null) break block63;
                                                                            if (!bl2) break block64;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.d.n.a(matchException);
                                                                        }
                                                                        if (!bl) break block65;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.d.n.a(matchException);
                                                                    }
                                                                    pulsescanner.g.b.b(class_3322, f4, f3, f11 + 6.0f, 0x22FFFFFF);
                                                                    if (iArray != null) break block64;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.d.n.a(matchException);
                                                                }
                                                                pulsescanner.f.i.b(new int[5]);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.d.n.a(matchException);
                                                            }
                                                        }
                                                        pulsescanner.g.f.a(class_3322, this.y, this.z, f12, f12, 10.0f, 5.0f, 0.8f, 0xFFFFFF);
                                                    }
                                                    bl2 = bl;
                                                }
                                                try {
                                                    if (!bl2) break block66;
                                                    pulsescanner.g.b.a(class_3322, f4, f3, f11, pulsescanner.g.b.a(0x141418, n2));
                                                    pulsescanner.g.b.b(class_3322, f4, f3, f11, Math.max(pulsescanner.g.b.a(), 0.6f), 0x40FFFFFF);
                                                    pulsescanner.g.b.b(class_3322, f4, f3, f11 * 0.5f, 0.5f, 0x16FFFFFF);
                                                    if (iArray != null) break block67;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.d.n.a(matchException);
                                                }
                                            }
                                            pulsescanner.d.c.a(class_3322, this.y, this.z, f12, f12);
                                            f7 = f11 * 0.5f;
                                            pulsescanner.g.b.a(class_3322, f4 - f7, f3 - f7, f7 * 2.0f, f7 * 2.0f, 4.0f, 0.5f, 0x16FFFFFF);
                                        }
                                        try {
                                            try {
                                                pulsescanner.g.b.a(class_3322, f4 - f11 + 4.0f, f3 - 0.25f, f12 - 8.0f, 0.5f, 0x14FFFFFF);
                                                pulsescanner.g.b.a(class_3322, f4 - 0.25f, f3 - f11 + 4.0f, 0.5f, f12 - 8.0f, 0x14FFFFFF);
                                                class_3102 = a;
                                                if (iArray == null) break block68;
                                                if (class_3102.field_1724 == null) break block69;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.d.n.a(matchException);
                                            }
                                            class_3102 = a;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.d.n.a(matchException);
                                        }
                                    }
                                    f10 = class_3102.field_1724.method_5705(f2);
                                    break block89;
                                }
                                f10 = 0.0f;
                            }
                            f7 = f10;
                            double d2 = Math.toRadians(f7);
                            try {
                                f9 = (Boolean)this.E.a() != false ? f4 + (float)Math.sin(d2) * (f11 - 7.0f) : f4;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.n.a(matchException);
                            }
                            float f13 = f9;
                            try {
                                f8 = (Boolean)this.E.a() != false ? f3 + (float)Math.cos(d2) * (f11 - 7.0f) : f3 - (f11 - 7.0f);
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.n.a(matchException);
                            }
                            float f14 = f8;
                            try {
                                try {
                                    try {
                                        pulsescanner.g.e.a(class_3322, "N", f13 - (float)pulsescanner.g.e.a("N") / 2.0f, f14 - 3.5f, -1711276033);
                                        object4 = a;
                                        if (iArray == null) break block70;
                                        if (object4.field_1724 == null) break block71;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.d.n.a(matchException);
                                    }
                                    object4 = a;
                                    if (iArray == null) break block70;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.d.n.a(matchException);
                                }
                                if (object4.field_1687 == null) break block71;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.d.n.a(matchException);
                            }
                            q q2 = pulsescanner.f.m.a(q.class);
                            class_243 class_2432 = pulsescanner.f.d.n.a.field_1724.method_30950(f2);
                            f6 = (f11 - 5.0f) / this.C.g();
                            object3 = pulsescanner.f.d.n.a.field_1687.method_18456().iterator();
                            while (true) {
                                block85: {
                                    boolean bl3;
                                    float f12;
                                    float d15;
                                    block84: {
                                        double d3;
                                        block82: {
                                            int n2;
                                            block83: {
                                                int n3;
                                                block92: {
                                                    block80: {
                                                        q q3;
                                                        block81: {
                                                            double d4;
                                                            double d5;
                                                            block79: {
                                                                double d6;
                                                                double d7;
                                                                block78: {
                                                                    double d8;
                                                                    block76: {
                                                                        block77: {
                                                                            double d9;
                                                                            block75: {
                                                                                block91: {
                                                                                    double d10;
                                                                                    double d11;
                                                                                    block90: {
                                                                                        class_1657 class_16572;
                                                                                        block72: {
                                                                                            try {
                                                                                                if (!object3.hasNext()) break;
                                                                                                object4 = object3.next();
                                                                                                if (iArray == null) break block70;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.d.n.a(matchException);
                                                                                            }
                                                                                            object = (class_1657)object4;
                                                                                            try {
                                                                                                try {
                                                                                                    class_16572 = object;
                                                                                                    if (iArray == null) break block72;
                                                                                                    if (class_16572 == pulsescanner.f.d.n.a.field_1724) {
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw pulsescanner.f.d.n.a(matchException);
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.f.d.n.a(matchException);
                                                                                            }
                                                                                            class_16572 = object;
                                                                                        }
                                                                                        class_243 class_2433 = class_16572.method_30950(f2);
                                                                                        d11 = class_2433.field_1352 - class_2432.field_1352;
                                                                                        d10 = class_2433.field_1350 - class_2432.field_1350;
                                                                                        if (!((Boolean)this.E.a()).booleanValue()) break block90;
                                                                                        d7 = Math.toRadians(f7);
                                                                                        d5 = -(d11 * Math.cos(d7) + d10 * Math.sin(d7));
                                                                                        d4 = -(-d11 * Math.sin(d7) + d10 * Math.cos(d7));
                                                                                        if (iArray != null) break block91;
                                                                                    }
                                                                                    d5 = d11;
                                                                                    d4 = d10;
                                                                                }
                                                                                double d12 = d5;
                                                                                double d13 = f6;
                                                                                if (iArray != null) {
                                                                                    block74: {
                                                                                        d5 = d12 * d13;
                                                                                        d4 *= (double)f6;
                                                                                        try {
                                                                                            if (!bl) break block74;
                                                                                            d9 = Math.sqrt(d5 * d5 + d4 * d4);
                                                                                            break block75;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.f.d.n.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    d12 = Math.abs(d5);
                                                                                    d13 = Math.abs(d4);
                                                                                }
                                                                                d9 = Math.max(d12, d13);
                                                                            }
                                                                            d7 = d9;
                                                                            try {
                                                                                double d14 = d7 - (double)(f11 - 5.0f);
                                                                                d8 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                                                                if (iArray == null) break block76;
                                                                                if (d8 <= 0) break block77;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw pulsescanner.f.d.n.a(matchException);
                                                                            }
                                                                            d8 = 1.0;
                                                                            break block76;
                                                                        }
                                                                        d8 = 0.0;
                                                                    }
                                                                    d3 = d8;
                                                                    try {
                                                                        try {
                                                                            d6 = d3;
                                                                            if (iArray == null) break block78;
                                                                            if (d6 == false) break block79;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.f.d.n.a(matchException);
                                                                        }
                                                                        d6 = (double)((Boolean)this.G.a()).booleanValue();
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.f.d.n.a(matchException);
                                                                    }
                                                                }
                                                                if (d6 == false) continue;
                                                                double d16 = (double)(f11 - 5.0f) / d7;
                                                                d5 *= d16;
                                                                d4 *= d16;
                                                            }
                                                            d15 = f4 + (float)d5;
                                                            f12 = f3 + (float)d4;
                                                            try {
                                                                try {
                                                                    if (!((Boolean)this.H.a()).booleanValue()) break block80;
                                                                    q3 = q2;
                                                                    if (iArray == null) break block81;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.f.d.n.a(matchException);
                                                                }
                                                                if (q3 == null) break block80;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.f.d.n.a(matchException);
                                                            }
                                                            q3 = q2;
                                                        }
                                                        n3 = q3.a((class_1657)object);
                                                        break block92;
                                                    }
                                                    n3 = -1;
                                                }
                                                n2 = n3;
                                                try {
                                                    if (iArray == null) break block82;
                                                    if (d3 == false) break block83;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.d.n.a(matchException);
                                                }
                                                n2 = pulsescanner.g.b.a(n2, 0.55f);
                                            }
                                            pulsescanner.g.b.b(class_3322, d15, f12, 4.5f, pulsescanner.g.b.a(n2, 85));
                                            pulsescanner.g.b.a(class_3322, d15, f12, 2.0f, n2 | 0xFF000000);
                                        }
                                        try {
                                            bl3 = (Boolean)this.F.a();
                                            if (iArray == null) break block84;
                                            if (!bl3) break block85;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.d.n.a(matchException);
                                        }
                                        bl3 = d3;
                                    }
                                    if (!bl3) {
                                        String string = object.method_5477().getString();
                                        class_3322.method_51448().pushMatrix();
                                        class_3322.method_51448().translate(d15, f12 + 3.5f);
                                        class_3322.method_51448().scale(0.6f, 0.6f);
                                        pulsescanner.g.e.a(class_3322, string, (float)(-pulsescanner.g.e.a(string)) / 2.0f, 0.0f, -570425345);
                                        class_3322.method_51448().popMatrix();
                                    }
                                }
                                if (iArray == null) break;
                            }
                        }
                        object4 = this.E.a();
                    }
                    try {
                        f5 = (Boolean)object4 != false ? 0.0f : (float)Math.toRadians(f7 + 180.0f);
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.n.a(matchException);
                    }
                    float f17 = f5;
                    float f18 = (float)Math.sin(f17);
                    f6 = (float)Math.cos(f17);
                    object3 = new float[]{0.0f, -4.5f, 3.2f, 3.5f, -3.2f, 3.5f};
                    object = new float[6];
                    boolean i2 = false;
                    while (var21_24 < 6) {
                        try {
                            object[var21_24] = (class_1657)(f4 + object3[var21_24] * f6 - object3[var21_24 + true] * f18);
                            object2 = object;
                            if (iArray != null) {
                                object2[var21_24 + true] = (class_1657)(f3 + object3[var21_24] * f18 + object3[var21_24 + true] * f6);
                                var21_24 += 2;
                                if (iArray != null) continue;
                                break;
                            }
                            break block86;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.d.n.a(matchException);
                        }
                    }
                    object2 = object;
                }
                reference var21_25 = (object2[2] - object[0]) * (object[5] - object[1]) - (object[3] - object[1]) * (object[4] - object[0]);
                try {
                    if (iArray == null) break block87;
                    if (!(var21_25 < 0.0f)) break block88;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.d.n.a(matchException);
                }
                object = new float[]{(float)object[0], (float)object[1], (float)object[4], (float)object[5], (float)object[2], (float)object[3]};
            }
            pulsescanner.g.b.b(class_3322, f4, f3, 7.0f, 0x40FFFFFF);
            pulsescanner.g.b.a(class_3322, (float[])object, pulsescanner.d.c.e());
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
                var5 = new String[19];
                var3_1 = 0;
                var2_2 = "GDS@Dv\u000fFTB@D34}TKDBv\":\u0005ZTKDE\u0005FTB@D\u0012G]IV\u0016c<uLCS\u0016}1yPU\u000f\u0006W\\TBZv\u001bY\\HH\u001b~1d\u0015IG\u0016}5uGDX\u0016c<uLCSE=\fFTB@D3#|TVD\u0018\u0004G\\\\D\u001bWZJND34{AU\u0001Zz;q\u0015vMWj5f\u0015crf=&FZR@Bvpc\\RI\u0016j?aG\u0006W_v'4\u001d@NDd1fQ\u0006HE3%d\u001c\b\u0011G]IV\u0016\\%`\u0015iG\u0016A1zRC\u0006FZR@Bv\u0005G]GQS\u0005FTHFS\u001cD\\H\u0001Pr\"4EJ@Ov\"g\u0015RN\u0016g8q\u0015CEQv~\u0006W\\TBZv";
                var4_3 = "GDS@Dv\u000fFTB@D34}TKDBv\":\u0005ZTKDE\u0005FTB@D\u0012G]IV\u0016c<uLCS\u0016}1yPU\u000f\u0006W\\TBZv\u001bY\\HH\u001b~1d\u0015IG\u0016}5uGDX\u0016c<uLCSE=\fFTB@D3#|TVD\u0018\u0004G\\\\D\u001bWZJND34{AU\u0001Zz;q\u0015vMWj5f\u0015crf=&FZR@Bvpc\\RI\u0016j?aG\u0006W_v'4\u001d@NDd1fQ\u0006HE3%d\u001c\b\u0011G]IV\u0016\\%`\u0015iG\u0016A1zRC\u0006FZR@Bv\u0005G]GQS\u0005FTHFS\u001cD\\H\u0001Pr\"4EJ@Ov\"g\u0015RN\u0016g8q\u0015CEQv~\u0006W\\TBZv".length();
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
                    var2_2 = "#,<7(\u0015\u0005\u00072<9c\u0005@\u000f46&c\u0012JA%73&H\u000e436t\u00065uA\u0003<8,\u0014V";
                    var4_3 = "#,<7(\u0015\u0005\u00072<9c\u0005@\u000f46&c\u0012JA%73&H\u000e436t\u00065uA\u0003<8,\u0014V".length();
                    var1_4 = 27;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 55;
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
                        v11 = 86;
                        break;
                    }
                    case 1: {
                        v11 = 119;
                        break;
                    }
                    case 2: {
                        v11 = 100;
                        break;
                    }
                    case 3: {
                        v11 = 99;
                        break;
                    }
                    case 4: {
                        v11 = 116;
                        break;
                    }
                    case 5: {
                        v11 = 81;
                        break;
                    }
                    default: {
                        v11 = 18;
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
        pulsescanner.f.d.n.I = var5;
    }
}

