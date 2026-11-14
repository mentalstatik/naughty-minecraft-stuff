/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package pulsescanner.c;

import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import pulsescanner.c.b;
import pulsescanner.c.c;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.f.m;
import pulsescanner.g.e;
import pulsescanner.j.a;

public class f
extends class_437 {
    private static final float a = 4.0f;
    private final class_437 b;
    private j c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private float h;
    private b i;
    private b j;
    private static boolean k;
    private static final String[] l;

    public f(class_437 class_4372) {
        super((class_2561)class_2561.method_43470((String)l[0]));
        this.b = class_4372;
    }

    public boolean method_25421() {
        return false;
    }

    public void method_25420(class_332 class_3322, int n2, int n3, float f2) {
        class_3322.method_25294(0, 0, this.field_22789, this.field_22790, 0x38000000);
    }

    private j a(double d2, double d3) {
        j j2 = null;
        for (j j3 : m.c()) {
            try {
                try {
                    if (!j3.b() || !(j3.A > 0.0f)) continue;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
                if (!j3.a(d2, d3)) continue;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.f.a(matchException);
            }
            j2 = j3;
        }
        return j2;
    }

    public void method_25394(class_332 class_3322, int n2, int n3, float f2) {
        block102: {
            f f3;
            block101: {
                boolean bl;
                block99: {
                    block100: {
                        j j2;
                        float f4;
                        float f5;
                        block84: {
                            f f6;
                            block85: {
                                block86: {
                                    block88: {
                                        j j3;
                                        i i2;
                                        block87: {
                                            block82: {
                                                block83: {
                                                    block80: {
                                                        block81: {
                                                            block78: {
                                                                block79: {
                                                                    block68: {
                                                                        block69: {
                                                                            float f7;
                                                                            float f8;
                                                                            float f9;
                                                                            block77: {
                                                                                float f10;
                                                                                float f11;
                                                                                float f12;
                                                                                block76: {
                                                                                    float f13;
                                                                                    block75: {
                                                                                        float f14;
                                                                                        block74: {
                                                                                            float f15;
                                                                                            block72: {
                                                                                                block73: {
                                                                                                    f f16;
                                                                                                    float f17;
                                                                                                    block70: {
                                                                                                        block71: {
                                                                                                            bl = pulsescanner.c.f.c();
                                                                                                            try {
                                                                                                                f6 = this;
                                                                                                                if (!bl) break block68;
                                                                                                                f6.h = pulsescanner.j.a.a(this.h, 1.0f, 12.0f);
                                                                                                                pulsescanner.g.b.a = this.h;
                                                                                                                this.g = false;
                                                                                                                this.f = false;
                                                                                                                if (this.c == null) break block69;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw pulsescanner.c.f.a(matchException);
                                                                                                            }
                                                                                                            f12 = this.c.t();
                                                                                                            f11 = this.c.u();
                                                                                                            f9 = (float)n2 - this.d;
                                                                                                            f8 = (float)n3 - this.e;
                                                                                                            f5 = f9 + f12 / 2.0f;
                                                                                                            f4 = f8 + f11 / 2.0f;
                                                                                                            try {
                                                                                                                f17 = f5;
                                                                                                                f16 = this;
                                                                                                                if (!bl) break block70;
                                                                                                                if (!(Math.abs(f17 - (float)f16.field_22789 / 2.0f) < 4.0f)) break block71;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw pulsescanner.c.f.a(matchException);
                                                                                                            }
                                                                                                            f9 = (float)this.field_22789 / 2.0f - f12 / 2.0f;
                                                                                                            this.f = true;
                                                                                                        }
                                                                                                        f17 = f4;
                                                                                                        f16 = this;
                                                                                                    }
                                                                                                    try {
                                                                                                        f15 = Math.abs(f17 - (float)f16.field_22790 / 2.0f);
                                                                                                        if (!bl) break block72;
                                                                                                        if (!(f15 < 4.0f)) break block73;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw pulsescanner.c.f.a(matchException);
                                                                                                    }
                                                                                                    f8 = (float)this.field_22790 / 2.0f - f11 / 2.0f;
                                                                                                    this.g = true;
                                                                                                }
                                                                                                try {
                                                                                                    f14 = f9;
                                                                                                    if (!bl) break block74;
                                                                                                    f15 = Math.abs(f14 - 4.0f);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw pulsescanner.c.f.a(matchException);
                                                                                                }
                                                                                            }
                                                                                            if (f15 < 4.0f) {
                                                                                                f9 = 4.0f;
                                                                                            }
                                                                                            try {
                                                                                                f13 = f8 - 4.0f;
                                                                                                if (!bl) break block75;
                                                                                                f14 = Math.abs(f13);
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw pulsescanner.c.f.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        if (f14 < 4.0f) {
                                                                                            f8 = 4.0f;
                                                                                        }
                                                                                        try {
                                                                                            f10 = f9 + f12;
                                                                                            if (!bl) break block76;
                                                                                            f13 = Math.abs(f10 - (float)(this.field_22789 - 4));
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw pulsescanner.c.f.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    if (f13 < 4.0f) {
                                                                                        f9 = (float)(this.field_22789 - 4) - f12;
                                                                                    }
                                                                                    try {
                                                                                        f7 = f8 + f11;
                                                                                        if (!bl) break block77;
                                                                                        f10 = Math.abs(f7 - (float)(this.field_22790 - 4));
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw pulsescanner.c.f.a(matchException);
                                                                                    }
                                                                                }
                                                                                if (f10 < 4.0f) {
                                                                                    f8 = (float)(this.field_22790 - 4) - f11;
                                                                                }
                                                                                f9 = Math.max(0.0f, Math.min((float)this.field_22789 - f12, f9));
                                                                                f7 = Math.max(0.0f, Math.min((float)this.field_22790 - f11, f8));
                                                                            }
                                                                            f8 = f7;
                                                                            this.c.a(f9, f8, this.field_22789, this.field_22790);
                                                                            this.c.a(this.field_22789, this.field_22790);
                                                                        }
                                                                        f6 = this;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (!bl) break block78;
                                                                            if (!f6.f) break block79;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw pulsescanner.c.f.a(matchException);
                                                                        }
                                                                        pulsescanner.g.b.a(class_3322, (float)this.field_22789 / 2.0f - 0.25f, 0.0f, 0.5f, this.field_22790, 0x70FFFFFF);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw pulsescanner.c.f.a(matchException);
                                                                    }
                                                                }
                                                                f6 = this;
                                                            }
                                                            try {
                                                                try {
                                                                    if (!bl) break block80;
                                                                    if (!f6.g) break block81;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.c.f.a(matchException);
                                                                }
                                                                pulsescanner.g.b.a(class_3322, 0.0f, (float)this.field_22790 / 2.0f - 0.25f, this.field_22789, 0.5f, 0x70FFFFFF);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.c.f.a(matchException);
                                                            }
                                                        }
                                                        f6 = this;
                                                    }
                                                    try {
                                                        try {
                                                            if (!bl) break block82;
                                                            if (f6.c == null) break block83;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.c.f.a(matchException);
                                                        }
                                                        j2 = this.c;
                                                        break block84;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.f.a(matchException);
                                                    }
                                                }
                                                f6 = this;
                                            }
                                            try {
                                                if (!bl) break block85;
                                                if (f6.i == null) break block86;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.f.a(matchException);
                                            }
                                            i i3 = this.i.i;
                                            try {
                                                try {
                                                    i2 = i3;
                                                    if (!bl) break block87;
                                                    if (!(i2 instanceof j)) break block88;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.f.a(matchException);
                                                }
                                                i2 = i3;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.f.a(matchException);
                                            }
                                        }
                                        j2 = j3 = (j)i2;
                                        break block84;
                                    }
                                    j2 = null;
                                    break block84;
                                }
                                f6 = this;
                            }
                            j2 = f6.a(n2, n3);
                        }
                        j j4 = j2;
                        for (j j5 : m.c()) {
                            block95: {
                                float f18;
                                float f19;
                                block98: {
                                    j j6;
                                    block96: {
                                        block97: {
                                            int n4;
                                            block94: {
                                                int n5;
                                                float f20;
                                                float f21;
                                                float f22;
                                                float f23;
                                                float f24;
                                                float f25;
                                                class_332 class_3323;
                                                int n6;
                                                block92: {
                                                    block93: {
                                                        int n7;
                                                        j j7;
                                                        block90: {
                                                            block89: {
                                                                try {
                                                                    j7 = j5;
                                                                    if (!bl) break block89;
                                                                    if (!j7.b()) continue;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.c.f.a(matchException);
                                                                }
                                                                j7 = j5;
                                                            }
                                                            try {
                                                                try {
                                                                    if (!bl) break block90;
                                                                    if (j7.A <= 0.0f) {
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw pulsescanner.c.f.a(matchException);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw pulsescanner.c.f.a(matchException);
                                                            }
                                                            j7 = j5;
                                                        }
                                                        try {
                                                            n7 = j7 == j4 ? 1 : 0;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.c.f.a(matchException);
                                                        }
                                                        n6 = n7;
                                                        f5 = j5.t();
                                                        f4 = j5.u();
                                                        try {
                                                            class_3323 = class_3322;
                                                            f25 = j5.y - 2.0f;
                                                            f24 = j5.z - 2.0f;
                                                            f23 = f5 + 4.0f;
                                                            f22 = f4 + 4.0f;
                                                            f21 = 5.0f;
                                                            f20 = 0.75f;
                                                            n5 = n6;
                                                            if (!bl) break block92;
                                                            if (n5 == 0) break block93;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw pulsescanner.c.f.a(matchException);
                                                        }
                                                        n5 = -1325400065;
                                                        break block92;
                                                    }
                                                    n5 = 0x38FFFFFF;
                                                }
                                                try {
                                                    try {
                                                        pulsescanner.g.b.a(class_3323, f25, f24, f23, f22, f21, f20, n5);
                                                        n4 = n6;
                                                        if (!bl) break block94;
                                                        if (n4 == 0) break block95;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw pulsescanner.c.f.a(matchException);
                                                    }
                                                    n4 = pulsescanner.g.e.a(j5.b) + 10;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.f.a(matchException);
                                                }
                                            }
                                            f19 = n4;
                                            try {
                                                try {
                                                    j6 = j5;
                                                    if (!bl) break block96;
                                                    if (!(j6.z - 16.0f < 0.0f)) break block97;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.c.f.a(matchException);
                                                }
                                                f18 = j5.z + f4 + 4.0f;
                                                break block98;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.c.f.a(matchException);
                                            }
                                        }
                                        j6 = j5;
                                    }
                                    f18 = j6.z - 16.0f;
                                }
                                float f26 = f18;
                                pulsescanner.c.c.a(class_3322, j5.y - 2.0f, f26, f19, 12.0f, 6.0f);
                                pulsescanner.g.e.a(class_3322, j5.b, j5.y + 3.0f, f26 + 2.5f, -592136);
                            }
                            if (bl) continue;
                            pulsescanner.f.i.b(new int[5]);
                            break;
                        }
                        String string = l[1];
                        float f27 = pulsescanner.g.e.a(string) + 18;
                        float f28 = 16.0f;
                        f5 = (float)this.field_22789 / 2.0f - f27 / 2.0f;
                        f4 = (float)this.field_22790 - f28 - 10.0f;
                        try {
                            try {
                                try {
                                    try {
                                        pulsescanner.c.c.a(class_3322, f5, f4, f27, f28, f28 / 2.0f);
                                        pulsescanner.g.e.a(class_3322, string, f5 + 9.0f, f4 + 4.5f, -2829095);
                                        f3 = this;
                                        if (!bl) break block99;
                                        if (f3.j == null) break block100;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.f.a(matchException);
                                    }
                                    this.j.a(class_3322, n2, n3, this.field_22789, this.field_22790);
                                    f3 = this;
                                    if (!bl) break block99;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.f.a(matchException);
                                }
                                if (!(f3.j.s < 0.02f)) break block100;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.f.a(matchException);
                            }
                            this.j = null;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.f.a(matchException);
                        }
                    }
                    f3 = this;
                }
                try {
                    try {
                        if (!bl) break block101;
                        if (f3.i == null) break block102;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.f.a(matchException);
                    }
                    f3 = this;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
            }
            f3.i.a(class_3322, n2, n3, this.field_22789, this.field_22790);
        }
        pulsescanner.g.b.a = 1.0f;
    }

    private void a(j j2, float f2, float f3) {
        block4: {
            try {
                try {
                    if (this.i == null || this.i.i != j2) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
                this.a();
                return;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.f.a(matchException);
            }
        }
        this.a();
        this.i = new b((i)j2, f2, f3);
    }

    private void a() {
        try {
            if (this.i == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.f.a(matchException);
        }
        this.i.t = true;
        this.i.D = null;
        this.i.E = null;
        this.i.c();
        this.j = this.i;
        this.i = null;
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        block21: {
            j j2;
            int n2;
            double d2;
            double d3;
            block20: {
                block16: {
                    block18: {
                        block19: {
                            block17: {
                                d3 = class_119092.comp_4798();
                                d2 = class_119092.comp_4799();
                                n2 = class_119092.method_74245();
                                try {
                                    try {
                                        if (this.i == null) break block16;
                                        if (this.i.D == null) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.c.f.a(matchException);
                                    }
                                    this.i.D = null;
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.f.a(matchException);
                                }
                            }
                            try {
                                try {
                                    if (!this.i.a(d3, d2, n2)) break block18;
                                    if (!this.i.G) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.c.f.a(matchException);
                                }
                                this.a();
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.f.a(matchException);
                            }
                        }
                        return true;
                    }
                    this.a();
                }
                j2 = this.a(d3, d2);
                try {
                    if (j2 == null) {
                        return true;
                    }
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
                try {
                    if (n2 != 0) break block20;
                    this.c = j2;
                    this.d = (float)(d3 - (double)j2.y);
                    this.e = (float)(d2 - (double)j2.z);
                    break block21;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
            }
            try {
                if (n2 == 1) {
                    this.a(j2, (float)d3, (float)d2);
                }
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.f.a(matchException);
            }
        }
        return true;
    }

    public boolean method_25406(class_11909 class_119092) {
        try {
            this.c = null;
            if (this.i != null) {
                this.i.c();
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.f.a(matchException);
        }
        return true;
    }

    public boolean method_25401(double d2, double d3, double d4, double d5) {
        block4: {
            try {
                try {
                    if (this.i == null || !this.i.a(d2, d3)) break block4;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
                this.i.a(d5);
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.f.a(matchException);
            }
        }
        return super.method_25401(d2, d3, d4, d5);
    }

    public boolean method_25404(class_11908 class_119082) {
        block9: {
            block11: {
                block10: {
                    int n2;
                    block8: {
                        n2 = class_119082.comp_4795();
                        try {
                            try {
                                if (this.i == null || !this.i.b(n2)) break block8;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.c.f.a(matchException);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.f.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (n2 != 256) break block9;
                            if (this.i == null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.c.f.a(matchException);
                        }
                        this.a();
                        break block11;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.f.a(matchException);
                    }
                }
                this.method_25419();
            }
            return true;
        }
        return super.method_25404(class_119082);
    }

    public boolean method_25400(class_11905 class_119052) {
        block6: {
            try {
                try {
                    try {
                        if (this.i == null || !class_119052.method_74227()) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.c.f.a(matchException);
                    }
                    if (!this.i.a(class_119052.method_74226())) break block6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.c.f.a(matchException);
                }
                return true;
            }
            catch (MatchException matchException) {
                throw pulsescanner.c.f.a(matchException);
            }
        }
        return super.method_25400(class_119052);
    }

    public void method_25419() {
        try {
            pulsescanner.b.a.b();
            if (this.field_22787 != null) {
                this.field_22787.method_1507(this.b);
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.c.f.a(matchException);
        }
    }

    public static void b(boolean bl) {
        k = bl;
    }

    public static boolean b() {
        return k;
    }

    public static boolean c() {
        boolean bl = pulsescanner.c.f.b();
        return !bl;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\\\u0005M#mKe`?{<P\"hd\b[c4=fuM\u000f,\u00a3p)QAHd`}joALg4$f#KZ\u007f`?djRJ,4\u00e7)#m\\o4$f#O@,v1jh";
            var4_3 = "\\\u0005M#mKe`?{<P\"hd\b[c4=fuM\u000f,\u00a3p)QAHd`}joALg4$f#KZ\u007f`?djRJ,4\u00e7)#m\\o4$f#O@,v1jh".length();
            pulsescanner.c.f.b(false);
            var1_4 = 10;
            var0_5 = -1;
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v3 = 32;
            v0 = v2;
            v4 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl54
            do {
                v3 = v3;
                v0 = v0;
                v5 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 52;
                        break;
                    }
                    case 1: {
                        v6 = 112;
                        break;
                    }
                    case 2: {
                        v6 = 41;
                        break;
                    }
                    case 3: {
                        v6 = 35;
                        break;
                    }
                    case 4: {
                        v6 = 8;
                        break;
                    }
                    case 5: {
                        v6 = 15;
                        break;
                    }
                    default: {
                        v6 = 44;
                    }
                }
                v0[v5] = (char)(v0[v5] ^ (v3 ^ v6));
                ++var6_6;
lbl54:
                // 2 sources

                v4 = v4;
            } while (v4 > var6_6);
            ** while (true)
        }
        pulsescanner.c.f.l = var5;
    }
}

