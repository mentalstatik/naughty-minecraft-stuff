/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_10799
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 */
package pulsescanner.f.d;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_10799;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import pulsescanner.c.f;
import pulsescanner.f.d.a;
import pulsescanner.f.j;
import pulsescanner.f.m;
import pulsescanner.g.b;
import pulsescanner.i.c;
import pulsescanner.i.e;

public class o
extends j {
    public final c x;
    public final c C;
    public final c D;
    public final c E;
    public final e F;
    public final e G;
    public final e H;
    private static final float I = 168.0f;
    private static final float J = 46.0f;
    private static final float K = 6.0f;
    private static final float L = 34.0f;
    private static final class_2960 M;
    private String N;
    private boolean O;
    private float P;
    private float Q;
    private final float[] R;
    private static final String[] T;

    public o() {
        String[] stringArray = T;
        super(stringArray[21], stringArray[24], 1, 0, 0.0f, 44.0f);
        this.x = this.a(new c(stringArray[13], stringArray[22], true));
        this.C = this.a(new c(stringArray[6], stringArray[8], true));
        this.D = this.a(new c(stringArray[17], stringArray[0], true));
        this.E = this.a(new c(stringArray[11], stringArray[5], true));
        this.F = this.a(new e(stringArray[19], stringArray[7], -1));
        this.G = this.a(new e(stringArray[3], stringArray[10], -1));
        this.H = this.a(new e(stringArray[20], stringArray[14], -1));
        this.N = "";
        this.Q = -1.0f;
        this.R = new float[3];
    }

    @Override
    protected void h() {
        pulsescanner.e.a.b();
    }

    @Override
    public void i() {
        block6: {
            try {
                try {
                    try {
                        if (!pulsescanner.e.a.a || pulsescanner.e.a.c()) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.o.a(matchException);
                    }
                    if (a.method_22683() == null) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.d.o.a(matchException);
                }
                pulsescanner.e.a.a(pulsescanner.e.a.d());
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.o.a(matchException);
            }
        }
    }

    @Override
    public void a(int n2) {
        block8: {
            block9: {
                block7: {
                    try {
                        if (n2 != (Integer)this.F.a()) break block7;
                        pulsescanner.e.a.a(T[1]);
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.d.o.a(matchException);
                    }
                }
                try {
                    if (n2 != (Integer)this.G.a()) break block9;
                    pulsescanner.e.a.a(T[4]);
                    break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.d.o.a(matchException);
                }
            }
            try {
                if (n2 == (Integer)this.H.a()) {
                    pulsescanner.e.a.a(T[16]);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.o.a(matchException);
            }
        }
    }

    @Override
    public void r() {
        this.A = 168.0f;
        this.B = 46.0f;
    }

    private void d(String string) {
        if (string == null) {
            string = "";
        }
        try {
            if (string.equals(this.N)) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw pulsescanner.f.d.o.a(throwable);
        }
        try {
            this.N = string;
            this.O = false;
            a.method_1531().method_4615(M);
            if (string.isEmpty()) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw pulsescanner.f.d.o.a(throwable);
        }
        try (InputStream inputStream = Files.newInputStream(Path.of(string, new String[0]), new OpenOption[0]);){
            class_1011 class_10112 = class_1011.method_4309((InputStream)inputStream);
            a.method_1531().method_4616(M, (class_1044)new class_1043(o::lambda$updateArt$0, class_10112));
            this.O = true;
        }
        catch (Exception exception) {
            this.N = "";
        }
    }

    private static String a(double d2) {
        int n2 = (int)Math.max(0.0, d2);
        return n2 / 60 + ":" + String.format(T[2], n2 % 60);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void b(class_332 var1_1, float var2_2) {
        block118: {
            block135: {
                block129: {
                    block130: {
                        block131: {
                            block132: {
                                block125: {
                                    block127: {
                                        block128: {
                                            block138: {
                                                block124: {
                                                    block123: {
                                                        block137: {
                                                            block122: {
                                                                block121: {
                                                                    block136: {
                                                                        block120: {
                                                                            block119: {
                                                                                block114: {
                                                                                    block112: {
                                                                                        block113: {
                                                                                            block117: {
                                                                                                block116: {
                                                                                                    block115: {
                                                                                                        block104: {
                                                                                                            block105: {
                                                                                                                block134: {
                                                                                                                    block108: {
                                                                                                                        block109: {
                                                                                                                            block106: {
                                                                                                                                block107: {
                                                                                                                                    block103: {
                                                                                                                                        block102: {
                                                                                                                                            block101: {
                                                                                                                                                block133: {
                                                                                                                                                    block100: {
                                                                                                                                                        block99: {
                                                                                                                                                            block98: {
                                                                                                                                                                block97: {
                                                                                                                                                                    block96: {
                                                                                                                                                                        block95: {
                                                                                                                                                                            block93: {
                                                                                                                                                                                block94: {
                                                                                                                                                                                    block91: {
                                                                                                                                                                                        block92: {
                                                                                                                                                                                            block90: {
                                                                                                                                                                                                var4_3 = pulsescanner.e.a.a();
                                                                                                                                                                                                var5_4 = pulsescanner.f.d.o.a.field_1755 instanceof f;
                                                                                                                                                                                                var3_5 = pulsescanner.f.d.a.b();
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (var4_3 != null) break block90;
                                                                                                                                                                                                                v0 = var5_4;
                                                                                                                                                                                                                if (var3_5 == null) break block91;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (MatchException v1) {
                                                                                                                                                                                                                throw pulsescanner.f.d.o.a(v1);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (v0) break block90;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v2) {
                                                                                                                                                                                                            throw pulsescanner.f.d.o.a(v2);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v0 = (Boolean)this.E.a();
                                                                                                                                                                                                        if (var3_5 == null) break block91;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v3) {
                                                                                                                                                                                                        throw pulsescanner.f.d.o.a(v3);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (v0) break block92;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v4) {
                                                                                                                                                                                                    throw pulsescanner.f.d.o.a(v4);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            v0 = true;
                                                                                                                                                                                            break block91;
                                                                                                                                                                                        }
                                                                                                                                                                                        v0 = false;
                                                                                                                                                                                    }
                                                                                                                                                                                    var6_6 = v0;
                                                                                                                                                                                    try {
                                                                                                                                                                                        v5 = this;
                                                                                                                                                                                        v6 = this.P;
                                                                                                                                                                                        v7 = var6_6 != false ? 1.0f : 0.0f;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v8) {
                                                                                                                                                                                        throw pulsescanner.f.d.o.a(v8);
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            v5.P = pulsescanner.j.a.a(v6, v7, 12.0f);
                                                                                                                                                                                            v9 = this.P;
                                                                                                                                                                                            if (var3_5 == null) break block93;
                                                                                                                                                                                            if (!(v9 < 0.01f)) break block94;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v10) {
                                                                                                                                                                                            throw pulsescanner.f.d.o.a(v10);
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v11) {
                                                                                                                                                                                        throw pulsescanner.f.d.o.a(v11);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                v9 = pulsescanner.g.b.a;
                                                                                                                                                                            }
                                                                                                                                                                            var7_7 = v9;
                                                                                                                                                                            try {
                                                                                                                                                                                pulsescanner.g.b.a = var7_7 * this.P;
                                                                                                                                                                                pulsescanner.d.c.a(var1_1, this.y, this.z, 168.0f, 46.0f);
                                                                                                                                                                                v12 = var4_3;
                                                                                                                                                                                if (var3_5 == null) break block95;
                                                                                                                                                                                if (v12 == null) break block96;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v13) {
                                                                                                                                                                                throw pulsescanner.f.d.o.a(v13);
                                                                                                                                                                            }
                                                                                                                                                                            v12 = var4_3;
                                                                                                                                                                        }
                                                                                                                                                                        v14 = v12.o();
                                                                                                                                                                        break block98;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (!pulsescanner.e.a.a) break block97;
                                                                                                                                                                        v14 = pulsescanner.f.d.o.T[9];
                                                                                                                                                                        break block98;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v15) {
                                                                                                                                                                        throw pulsescanner.f.d.o.a(v15);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var29_8 = pulsescanner.f.d.o.T;
                                                                                                                                                                v14 = var29_8[23];
                                                                                                                                                            }
                                                                                                                                                            var8_9 = v14;
                                                                                                                                                            try {
                                                                                                                                                                v16 = var4_3;
                                                                                                                                                                if (var3_5 == null) break block99;
                                                                                                                                                                if (v16 == null) break block100;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v17) {
                                                                                                                                                                throw pulsescanner.f.d.o.a(v17);
                                                                                                                                                            }
                                                                                                                                                            v16 = var4_3;
                                                                                                                                                        }
                                                                                                                                                        v18 = v16.p();
                                                                                                                                                        break block133;
                                                                                                                                                    }
                                                                                                                                                    v18 = pulsescanner.f.d.o.T[27];
                                                                                                                                                }
                                                                                                                                                var9_10 = v18;
                                                                                                                                                try {
                                                                                                                                                    v19 = var4_3;
                                                                                                                                                    if (var3_5 == null) break block101;
                                                                                                                                                    if (v19 == null) break block102;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v20) {
                                                                                                                                                    throw pulsescanner.f.d.o.a(v20);
                                                                                                                                                }
                                                                                                                                                v19 = var4_3;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                v21 = v19.r();
                                                                                                                                                if (var3_5 == null) break block103;
                                                                                                                                                if (v21 == 0) break block102;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v22) {
                                                                                                                                                throw pulsescanner.f.d.o.a(v22);
                                                                                                                                            }
                                                                                                                                            v21 = 1;
                                                                                                                                            break block103;
                                                                                                                                        }
                                                                                                                                        v21 = 0;
                                                                                                                                    }
                                                                                                                                    var10_11 = v21;
                                                                                                                                    var11_12 = this.y + 6.0f;
                                                                                                                                    var12_13 = this.z + 6.0f;
                                                                                                                                    var13_14 = this.y + 6.0f;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v23 = this;
                                                                                                                                                    if (var3_5 == null) break block104;
                                                                                                                                                    if (!((Boolean)v23.x.a()).booleanValue()) break block105;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v24) {
                                                                                                                                                    throw pulsescanner.f.d.o.a(v24);
                                                                                                                                                }
                                                                                                                                                v25 = var4_3;
                                                                                                                                                if (var3_5 == null) break block106;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v26) {
                                                                                                                                                throw pulsescanner.f.d.o.a(v26);
                                                                                                                                            }
                                                                                                                                            if (v25 == null) break block107;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v27) {
                                                                                                                                            throw pulsescanner.f.d.o.a(v27);
                                                                                                                                        }
                                                                                                                                        this.d(var4_3.v());
                                                                                                                                    }
                                                                                                                                    catch (MatchException v28) {
                                                                                                                                        throw pulsescanner.f.d.o.a(v28);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v25 = var4_3;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (v25 == null) break block108;
                                                                                                                                        v29 = this.O;
                                                                                                                                        if (var3_5 == null) break block109;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v30) {
                                                                                                                                        throw pulsescanner.f.d.o.a(v30);
                                                                                                                                    }
                                                                                                                                    if (v29 == 0) break block108;
                                                                                                                                }
                                                                                                                                catch (MatchException v31) {
                                                                                                                                    throw pulsescanner.f.d.o.a(v31);
                                                                                                                                }
                                                                                                                                v29 = pulsescanner.g.b.a(-1, pulsescanner.g.b.a);
                                                                                                                            }
                                                                                                                            catch (MatchException v32) {
                                                                                                                                throw pulsescanner.f.d.o.a(v32);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var14_15 = v29;
                                                                                                                        var1_1.method_25291(class_10799.field_56883, pulsescanner.f.d.o.M, Math.round(var11_12), Math.round(var12_13), 0.0f, 0.0f, 34, 34, 34, 34, var14_15);
                                                                                                                        if (var3_5 != null) break block134;
                                                                                                                    }
                                                                                                                    pulsescanner.g.b.a(var1_1, var11_12, var12_13, 34.0f, 34.0f, 6.0f, 0x1FFFFFFF);
                                                                                                                    var14_16 = var11_12 + 17.0f;
                                                                                                                    var15_18 = var12_13 + 17.0f;
                                                                                                                    pulsescanner.g.b.a(var1_1, var14_16 - 3.0f, var15_18 + 5.0f, 3.0f, -1325400065);
                                                                                                                    pulsescanner.g.b.a(var1_1, var14_16 - 0.5f, var15_18 - 8.0f, 1.2f, 13.0f, -1325400065);
                                                                                                                    pulsescanner.g.b.b(var1_1, var14_16 + 0.1f, var15_18 - 7.5f, var14_16 + 5.0f, var15_18 - 5.0f, 1.2f, -1325400065);
                                                                                                                }
                                                                                                                var13_14 = var11_12 + 34.0f + 7.0f;
                                                                                                            }
                                                                                                            v23 = this;
                                                                                                        }
                                                                                                        var14_17 = v23.y + 168.0f - 6.0f;
                                                                                                        var15_18 = var14_17 - 9.0f;
                                                                                                        var16_19 = this.z + 6.0f + 8.0f;
                                                                                                        for (var17_20 = 0; var17_20 < 3; ++var17_20) {
                                                                                                            block110: {
                                                                                                                block111: {
                                                                                                                    try {
                                                                                                                        v33 = var10_11 != 0 ? 0.35f + 0.65f * (float)Math.abs(Math.sin((double)System.currentTimeMillis() / (170.0 + (double)(var17_20 * 55)) + (double)var17_20 * 1.7)) : 0.25f;
                                                                                                                    }
                                                                                                                    catch (MatchException v34) {
                                                                                                                        throw pulsescanner.f.d.o.a(v34);
                                                                                                                    }
                                                                                                                    var18_22 = v33;
                                                                                                                    this.R[var17_20] = pulsescanner.j.a.a(this.R[var17_20], var18_22, 14.0f);
                                                                                                                    var19_23 = 8.0f * this.R[var17_20];
                                                                                                                    try {
                                                                                                                        v35 = var1_1;
                                                                                                                        v36 = var15_18 + (float)var17_20 * 3.2f;
                                                                                                                        v37 = var16_19 - var19_23;
                                                                                                                        v38 = 2.0f;
                                                                                                                        v39 = var19_23;
                                                                                                                        v40 = 1.0f;
                                                                                                                        v41 = var10_11;
                                                                                                                        if (var3_5 == null) break block110;
                                                                                                                        if (v41 == 0) break block111;
                                                                                                                    }
                                                                                                                    catch (MatchException v42) {
                                                                                                                        throw pulsescanner.f.d.o.a(v42);
                                                                                                                    }
                                                                                                                    v41 = pulsescanner.d.c.e();
                                                                                                                    break block110;
                                                                                                                }
                                                                                                                v41 = -2130706433;
                                                                                                            }
                                                                                                            pulsescanner.g.b.a(v35, v36, v37, v38, v39, v40, v41);
                                                                                                            if (var3_5 != null) continue;
                                                                                                        }
                                                                                                        var17_21 = var15_18 - 4.0f - var13_14;
                                                                                                        pulsescanner.g.b.a(var1_1, (int)var13_14, (int)this.z, (int)Math.ceil(var17_21), 46);
                                                                                                        var18_22 = pulsescanner.g.e.b(var8_9);
                                                                                                        var19_23 = 0.0f;
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v43 /* !! */  = this;
                                                                                                                    if (var3_5 == null) break block112;
                                                                                                                    if (!((Boolean)v43 /* !! */ .D.a()).booleanValue()) break block113;
                                                                                                                }
                                                                                                                catch (MatchException v44) {
                                                                                                                    throw pulsescanner.f.d.o.a(v44);
                                                                                                                }
                                                                                                                v45 = var18_22 == var17_21 ? 0 : (var18_22 > var17_21 ? 1 : -1);
                                                                                                                if (var3_5 == null) break block114;
                                                                                                            }
                                                                                                            catch (MatchException v46) {
                                                                                                                throw pulsescanner.f.d.o.a(v46);
                                                                                                            }
                                                                                                            if (v45 <= 0) break block113;
                                                                                                        }
                                                                                                        catch (MatchException v47) {
                                                                                                            throw pulsescanner.f.d.o.a(v47);
                                                                                                        }
                                                                                                        var20_24 = var18_22 - var17_21 + 6.0f;
                                                                                                        var21_25 = (double)var20_24 / 18.0 * 2.0 + 3.0;
                                                                                                        var23_27 = (double)System.currentTimeMillis() / 1000.0 % var21_25;
                                                                                                        var25_28 = (double)var20_24 / 18.0;
                                                                                                        try {
                                                                                                            v48 = var23_27;
                                                                                                            v49 = 1.5;
                                                                                                            if (var3_5 == null) break block115;
                                                                                                            if (v48 < v49) {
                                                                                                            }
                                                                                                            ** GOTO lbl250
                                                                                                        }
                                                                                                        catch (MatchException v50) {
                                                                                                            throw pulsescanner.f.d.o.a(v50);
                                                                                                        }
                                                                                                        var19_23 = 0.0f;
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var3_5 != null) break block113;
lbl250:
                                                                                                                // 2 sources

                                                                                                                v48 = var23_27;
                                                                                                                v51 = 1.5;
                                                                                                                v52 = var25_28;
                                                                                                                if (var3_5 == null) break block116;
                                                                                                            }
                                                                                                            catch (MatchException v53) {
                                                                                                                throw pulsescanner.f.d.o.a(v53);
                                                                                                            }
                                                                                                            v49 = v51 + v52;
                                                                                                        }
                                                                                                        catch (MatchException v54) {
                                                                                                            throw pulsescanner.f.d.o.a(v54);
                                                                                                        }
                                                                                                    }
                                                                                                    if (!(v48 < v49)) ** GOTO lbl267
                                                                                                    var19_23 = (float)((var23_27 - 1.5) * 18.0);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var3_5 != null) break block113;
lbl267:
                                                                                                            // 2 sources

                                                                                                            v48 = var23_27;
                                                                                                            if (var3_5 == null) break block117;
                                                                                                        }
                                                                                                        catch (MatchException v55) {
                                                                                                            throw pulsescanner.f.d.o.a(v55);
                                                                                                        }
                                                                                                        v51 = 3.0;
                                                                                                        v52 = var25_28;
                                                                                                    }
                                                                                                    catch (MatchException v56) {
                                                                                                        throw pulsescanner.f.d.o.a(v56);
                                                                                                    }
                                                                                                }
                                                                                                if (!(v48 < v51 + v52)) ** GOTO lbl282
                                                                                                var19_23 = var20_24;
                                                                                                try {
                                                                                                    if (var3_5 != null) break block113;
lbl282:
                                                                                                    // 2 sources

                                                                                                    v48 = Math.max(0.0, (double)var20_24 - (var23_27 - 3.0 - var25_28) * 18.0);
                                                                                                }
                                                                                                catch (MatchException v57) {
                                                                                                    throw pulsescanner.f.d.o.a(v57);
                                                                                                }
                                                                                            }
                                                                                            var19_23 = (float)v48;
                                                                                        }
                                                                                        try {
                                                                                            pulsescanner.d.c.b(var1_1, var8_9, var13_14 - var19_23, this.z + 6.0f + 1.0f, pulsescanner.d.c.d());
                                                                                            pulsescanner.d.c.a(var1_1, pulsescanner.f.d.o.a(var9_10, var17_21), var13_14, this.z + 6.0f + 12.0f, pulsescanner.d.c.c());
                                                                                            if (var3_5 == null) break block118;
                                                                                            pulsescanner.g.b.a(var1_1);
                                                                                            v43 /* !! */  = this.C.a();
                                                                                        }
                                                                                        catch (MatchException v58) {
                                                                                            throw pulsescanner.f.d.o.a(v58);
                                                                                        }
                                                                                    }
                                                                                    v45 = ((Boolean)v43 /* !! */ ).booleanValue();
                                                                                }
                                                                                if (v45 == 0) break block135;
                                                                                var20_24 = this.z + 46.0f - 6.0f - 9.0f;
                                                                                var21_26 = var14_17 - var13_14;
                                                                                try {
                                                                                    v59 = var4_3;
                                                                                    if (var3_5 == null) break block119;
                                                                                    if (v59 == null) break block120;
                                                                                }
                                                                                catch (MatchException v60) {
                                                                                    throw pulsescanner.f.d.o.a(v60);
                                                                                }
                                                                                v59 = var4_3;
                                                                            }
                                                                            v61 = v59.t();
                                                                            break block136;
                                                                        }
                                                                        v61 = 0.0;
                                                                    }
                                                                    var22_29 = v61;
                                                                    try {
                                                                        v62 = var4_3;
                                                                        if (var3_5 == null) break block121;
                                                                        if (v62 == null) break block122;
                                                                    }
                                                                    catch (MatchException v63) {
                                                                        throw pulsescanner.f.d.o.a(v63);
                                                                    }
                                                                    v62 = var4_3;
                                                                }
                                                                v64 = v62.a();
                                                                break block137;
                                                            }
                                                            v64 = 0.0;
                                                        }
                                                        var24_30 = v64;
                                                        try {
                                                            try {
                                                                v65 = var22_29;
                                                                if (var3_5 == null) break block123;
                                                                if (!(v65 > 0.0)) break block124;
                                                            }
                                                            catch (MatchException v66) {
                                                                throw pulsescanner.f.d.o.a(v66);
                                                            }
                                                            v65 = var24_30 / var22_29;
                                                        }
                                                        catch (MatchException v67) {
                                                            throw pulsescanner.f.d.o.a(v67);
                                                        }
                                                    }
                                                    v68 = (float)v65;
                                                    break block138;
                                                }
                                                v68 = 0.0f;
                                            }
                                            var26_31 = v68;
                                            try {
                                                block126: {
                                                    try {
                                                        try {
                                                            try {
                                                                v69 = this;
                                                                v70 = this.Q;
                                                                if (var3_5 == null) break block125;
                                                                if (v70 < 0.0f) break block126;
                                                            }
                                                            catch (MatchException v71) {
                                                                throw pulsescanner.f.d.o.a(v71);
                                                            }
                                                            v72 = var26_31;
                                                            if (var3_5 == null) break block127;
                                                        }
                                                        catch (MatchException v73) {
                                                            throw pulsescanner.f.d.o.a(v73);
                                                        }
                                                        if (!(Math.abs(v72 - this.Q) > 0.2f)) break block128;
                                                    }
                                                    catch (MatchException v74) {
                                                        throw pulsescanner.f.d.o.a(v74);
                                                    }
                                                }
                                                v70 = var26_31;
                                                break block125;
                                            }
                                            catch (MatchException v75) {
                                                throw pulsescanner.f.d.o.a(v75);
                                            }
                                        }
                                        v72 = this.Q;
                                    }
                                    v70 = pulsescanner.j.a.a(v72, var26_31, 10.0f);
                                }
                                try {
                                    v69.Q = v70;
                                    if (var3_5 == null) break block129;
                                    pulsescanner.g.b.a(var1_1, var13_14, var20_24, var21_26, 2.5f, 1.25f, 0x26FFFFFF);
                                    if (!(this.Q > 0.0f)) break block130;
                                }
                                catch (MatchException v76) {
                                    throw pulsescanner.f.d.o.a(v76);
                                }
                                var27_32 = Math.max(2.5f, var21_26 * this.Q);
                                try {
                                    try {
                                        if (var3_5 == null) break block131;
                                        if (!((Boolean)pulsescanner.f.m.a(pulsescanner.f.b.c.class).q.a()).booleanValue()) break block132;
                                    }
                                    catch (MatchException v77) {
                                        throw pulsescanner.f.d.o.a(v77);
                                    }
                                    pulsescanner.g.b.b(var1_1, var13_14, var20_24, var27_32, 2.5f, 1.25f, 3.0f, pulsescanner.g.b.a(pulsescanner.d.c.e(), 0.35f));
                                }
                                catch (MatchException v78) {
                                    throw pulsescanner.f.d.o.a(v78);
                                }
                            }
                            pulsescanner.g.b.a(var1_1, var13_14, var20_24, var27_32, 2.5f, 1.25f, pulsescanner.d.c.e());
                        }
                        pulsescanner.g.b.a(var1_1, var13_14 + var27_32, var20_24 + 1.25f, 2.2f, pulsescanner.d.c.e());
                    }
                    var1_1.method_51448().pushMatrix();
                    var1_1.method_51448().translate(var13_14, var20_24 + 4.5f);
                    var1_1.method_51448().scale(0.7f, 0.7f);
                }
                var27_33 = pulsescanner.f.d.o.a(var24_30);
                var28_34 = pulsescanner.f.d.o.a(var22_29);
                pulsescanner.g.e.a(var1_1, var27_33, 0.0f, 0.0f, pulsescanner.d.c.c());
                pulsescanner.g.e.a(var1_1, var28_34, var21_26 / 0.7f - (float)pulsescanner.g.e.a(var28_34), 0.0f, pulsescanner.d.c.c());
                var1_1.method_51448().popMatrix();
            }
            pulsescanner.g.b.a = var7_7;
        }
    }

    private static String a(String string, float f2) {
        try {
            if ((float)pulsescanner.g.e.a(string) <= f2) {
                return string;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.d.o.a(matchException);
        }
        while (true) {
            try {
                if (string.length() <= 1) break;
                StringBuilder stringBuilder = new StringBuilder();
                if (!((float)pulsescanner.g.e.a(stringBuilder.append(string).append(T[25]).toString()) > f2)) break;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.d.o.a(matchException);
            }
            string = string.substring(0, string.length() - 1);
        }
        return string + T[18];
    }

    private static String lambda$updateArt$0() {
        return T[26];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[28];
                var3_1 = 0;
                var2_2 = "h56\u0019\f\u001c[H:+\u0001\f\t[O0-\u0002\u0005\u0016[O18\u001a@\u0001\u0014U~-N\u0006\f\u000f\u0015\u0006O6>\t\f\u0000\u0004\u001eik\n\bu<!\u001a@.\u001eB\u0004U<!\u001a&s0=\u000b@\u0011\u0013^y:\u000f\u0012\u0001[L1<\u0000@6\u000bT-0\b\u0019E\u0012H7~\u001a@\n\u000b^7w\fk+6\t\u0012\u0000\bHy\u001b\u000f\u0012\u0010o6>\t\f\u0000[K58\u0017\u0002\u0004\u0018Pw\u001dh16\u0019@\u0016\u0014U>y\u001e\u0012\n\u001cI<*\u001d@\u0004\u0015_y-\u0007\r\u0000\b\u0015\u000fu6-\u0006\t\u000b\u001c\u001b)5\u000f\u0019\f\u0015\\\u0016h20\u001e@\u0011\u0014\u001b-1\u000b@\u000b\u001eC-y\u001d\u000f\u000b\u001c\u0015\u000es0=\u000b@2\u0013^7y'\u0004\t\u001e\u000bH)6\u001a\t\u0003\u0002d8+\u001a\tz5;\u001b\rE:I-\u0018|6y\u001a\u000fE\u000fS<y\u001e\u0012\u0000\rR6,\u001d@\u0016\u0014U>w\fK,5\u001d\u0005\u0016\u0018Z77\u000b\u0012\u0004K+<\u0018\u0012h:+\u0001\f\t[w67\t@1\u0012O5<\u001d\u0003\u0015ww\u000ek58\u0017O5\u001aN*<N+\u0000\u0002\fk+<\u0018\t\n\u000eHy\u0012\u000b\u0019\u0007h)6\u001a\t\u0003\u0002\u0015h16\u0019@\u0011\u0013^y8\u0002\u0002\u0010\u0016\u001b:6\u0018\u0005\u0017U\fl07\n\u000f\u0012\b\u001b67\u0002\u0019*h16\u0019\u0013E\fS8-I\u0013E\u000bW8 \u0007\u000e\u0002[R7y=\u0010\n\u000fR? NH2\u0012U=6\u0019\u0013LU\u0003\u0015ww";
                var4_3 = "h56\u0019\f\u001c[H:+\u0001\f\t[O0-\u0002\u0005\u0016[O18\u001a@\u0001\u0014U~-N\u0006\f\u000f\u0015\u0006O6>\t\f\u0000\u0004\u001eik\n\bu<!\u001a@.\u001eB\u0004U<!\u001a&s0=\u000b@\u0011\u0013^y:\u000f\u0012\u0001[L1<\u0000@6\u000bT-0\b\u0019E\u0012H7~\u001a@\n\u000b^7w\fk+6\t\u0012\u0000\bHy\u001b\u000f\u0012\u0010o6>\t\f\u0000[K58\u0017\u0002\u0004\u0018Pw\u001dh16\u0019@\u0016\u0014U>y\u001e\u0012\n\u001cI<*\u001d@\u0004\u0015_y-\u0007\r\u0000\b\u0015\u000fu6-\u0006\t\u000b\u001c\u001b)5\u000f\u0019\f\u0015\\\u0016h20\u001e@\u0011\u0014\u001b-1\u000b@\u000b\u001eC-y\u001d\u000f\u000b\u001c\u0015\u000es0=\u000b@2\u0013^7y'\u0004\t\u001e\u000bH)6\u001a\t\u0003\u0002d8+\u001a\tz5;\u001b\rE:I-\u0018|6y\u001a\u000fE\u000fS<y\u001e\u0012\u0000\rR6,\u001d@\u0016\u0014U>w\fK,5\u001d\u0005\u0016\u0018Z77\u000b\u0012\u0004K+<\u0018\u0012h:+\u0001\f\t[w67\t@1\u0012O5<\u001d\u0003\u0015ww\u000ek58\u0017O5\u001aN*<N+\u0000\u0002\fk+<\u0018\t\n\u000eHy\u0012\u000b\u0019\u0007h)6\u001a\t\u0003\u0002\u0015h16\u0019@\u0011\u0013^y8\u0002\u0002\u0010\u0016\u001b:6\u0018\u0005\u0017U\fl07\n\u000f\u0012\b\u001b67\u0002\u0019*h16\u0019\u0013E\fS8-I\u0013E\u000bW8 \u0007\u000e\u0002[R7y=\u0010\n\u000fR? NH2\u0012U=6\u0019\u0013LU\u0003\u0015ww".length();
                var1_4 = 36;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 105;
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
                    var2_2 = "\u001a}dLT\u0014Y\u001ag|VWM\n\u000bz|\u001e%xmQ\u0011gZ\u0005|aYH\u0014^\u0005({ZT\u0014S\u0005}z\u001f\\AY\u0003k";
                    var4_3 = "\u001a}dLT\u0014Y\u001ag|VWM\n\u000bz|\u001e%xmQ\u0011gZ\u0005|aYH\u0014^\u0005({ZT\u0014S\u0005}z\u001f\\AY\u0003k".length();
                    var1_4 = 17;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 56;
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
            var6_7 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_7;
                switch (var6_7 % 7) {
                    case 0: {
                        v11 = 82;
                        break;
                    }
                    case 1: {
                        v11 = 48;
                        break;
                    }
                    case 2: {
                        v11 = 48;
                        break;
                    }
                    case 3: {
                        v11 = 7;
                        break;
                    }
                    case 4: {
                        v11 = 9;
                        break;
                    }
                    case 5: {
                        v11 = 12;
                        break;
                    }
                    default: {
                        v11 = 18;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_7;
lbl71:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_7);
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
        pulsescanner.f.d.o.T = var5;
        var0_6 = pulsescanner.f.d.o.T;
        pulsescanner.f.d.o.M = class_2960.method_60655((String)var0_6[15], (String)var0_6[12]);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

