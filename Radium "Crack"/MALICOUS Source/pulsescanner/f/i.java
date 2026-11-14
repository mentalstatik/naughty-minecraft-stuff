/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_1297
 *  net.minecraft.class_2394
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_5250
 *  net.minecraft.class_5251
 *  net.minecraft.class_6606
 */
package pulsescanner.f;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_2394;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_5250;
import net.minecraft.class_5251;
import net.minecraft.class_6606;
import pulsescanner.d.d;
import pulsescanner.f.h;
import pulsescanner.i.a;
import pulsescanner.i.e;

public abstract class i {
    protected static final class_310 a;
    public final String b;
    public final String c;
    public final h d;
    public final List<a<?>> e = new ArrayList();
    public e f;
    private boolean g;
    public float h;
    public float i;
    public float j;
    private static int[] k;
    private static final String[] bb;

    protected i(String string, String string2, h h2) {
        String[] stringArray = bb;
        this.f = new e(stringArray[1], stringArray[0], -1);
        this.b = string;
        this.c = string2;
        this.d = h2;
    }

    protected <S extends a<?>> S a(S s2) {
        this.e.add(s2);
        return s2;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.c() || !pulsescanner.license.d.y) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.i.b(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.i.b(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean c() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.g && this.a()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.i.b(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.i.b(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(boolean bl) {
        i i2;
        block17: {
            i[] iArray;
            block15: {
                block16: {
                    block14: {
                        iArray = pulsescanner.f.h.b();
                        try {
                            try {
                                i2 = this;
                                if (iArray != null) break block14;
                                if (!i2.a()) return;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.i.b(matchException);
                            }
                            i2 = this;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.i.b(matchException);
                        }
                    }
                    try {
                        try {
                            if (iArray != null) break block15;
                            if (i2.g != bl) break block16;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.i.b(matchException);
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.i.b(matchException);
                    }
                }
                i2 = this;
            }
            try {
                block18: {
                    try {
                        try {
                            if (iArray != null) break block17;
                            i2.g = bl;
                            if (!bl) break block18;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.i.b(matchException);
                        }
                        this.g();
                        if (iArray == null) return;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.i.b(matchException);
                    }
                }
                i2 = this;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.i.b(matchException);
            }
        }
        i2.h();
    }

    public void d() {
        boolean bl;
        i i2;
        try {
            i2 = this;
            bl = !this.g;
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.i.b(matchException);
        }
        i2.a(bl);
    }

    public void e() {
        this.d();
        pulsescanner.d.d.a(this);
    }

    public String f() {
        return null;
    }

    protected void g() {
    }

    protected void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void a(int n2) {
    }

    public void a(class_4587 class_45872, class_4184 class_41842, float f2) {
    }

    public void a(class_332 class_3322, float f2) {
    }

    public void k() {
    }

    public void l() {
    }

    public void a(int n2, int n3, class_6606 class_66062) {
    }

    public void b(int n2, int n3, class_6606 class_66062) {
    }

    public void a(class_2561 class_25612) {
    }

    public void a(class_1297 class_12972) {
    }

    public class_243 a(class_1297 class_12972, class_243 class_2432) {
        return class_2432;
    }

    public boolean a(class_2394 class_23942) {
        return false;
    }

    public void a(String string) {
        this.a(string, class_124.field_1080);
    }

    public void b(String string) {
        this.a(string, class_124.field_1054);
    }

    public void c(String string) {
        this.a(string, class_124.field_1061);
    }

    private void a(String string, class_124 class_1242) {
        try {
            if (pulsescanner.f.i.a.field_1705 == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.i.b(matchException);
        }
        class_5250 class_52502 = class_2561.method_43470((String)"[").method_27692(class_124.field_1080).method_10852((class_2561)class_2561.method_43470((String)this.b).method_10862(class_2583.field_24360.method_27703(class_5251.method_27717((int)0xE8E8EC)))).method_10852((class_2561)class_2561.method_43470((String)bb[2]).method_27692(class_124.field_1080));
        pulsescanner.f.i.a.field_1705.method_1743().method_1812((class_2561)class_52502.method_10852((class_2561)class_2561.method_43470((String)string).method_27692(class_1242)));
    }

    public boolean b(int n2) {
        return false;
    }

    protected boolean m() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (pulsescanner.f.i.a.field_1724 == null || pulsescanner.f.i.a.field_1687 == null) break block4;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.i.b(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.i.b(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[3];
            var3_1 = 0;
            pulsescanner.f.i.b(null);
            var2_2 = "\u0006\u0011H{!>Q9TE421\\(\u0007\u0011/=?Cm\u0019^? :Uc\u0007\u0006\u0011H9<8T\u0002\u0010T";
            var4_3 = "\u0006\u0011H{!>Q9TE421\\(\u0007\u0011/=?Cm\u0019^? :Uc\u0007\u0006\u0011H9<8T\u0002\u0010T".length();
            var1_4 = 29;
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
            v3 = 26;
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
                        v6 = 87;
                        break;
                    }
                    case 1: {
                        v6 = 110;
                        break;
                    }
                    case 2: {
                        v6 = 43;
                        break;
                    }
                    case 3: {
                        v6 = 65;
                        break;
                    }
                    case 4: {
                        v6 = 79;
                        break;
                    }
                    case 5: {
                        v6 = 76;
                        break;
                    }
                    default: {
                        v6 = 42;
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
        pulsescanner.f.i.bb = var5;
        pulsescanner.f.i.a = class_310.method_1551();
    }

    public static void b(int[] nArray) {
        k = nArray;
    }

    public static int[] n() {
        return k;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }
}

