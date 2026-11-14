/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package pulsescanner.a;

import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import pulsescanner.a.ac;
import pulsescanner.a.aj;
import pulsescanner.a.ak;
import pulsescanner.a.al;
import pulsescanner.a.am;
import pulsescanner.a.aq;
import pulsescanner.a.as;
import pulsescanner.a.d;
import pulsescanner.a.f;
import pulsescanner.f.c.r;

public class ap
implements al {
    private static final String b;

    private void a(r r2, class_1309 class_13092, boolean bl) {
        float f2;
        float f3;
        float f4;
        float f5;
        block6: {
            block4: {
                block5: {
                    class_243 class_2432 = aj.a(class_13092.method_5829(), false).method_1031((double)0.3f * Math.sin((double)System.currentTimeMillis() / 50.0), (double)0.1f * Math.sin((double)System.currentTimeMillis() / 50.0) + (double)0.3f * Math.cos((double)System.currentTimeMillis() / 50.0), (double)0.3f * Math.cos((double)System.currentTimeMillis() / 50.0)).method_1020(ap.a.field_1724.method_33571());
                    int n2 = as.r();
                    f5 = (float)Math.toDegrees(Math.atan2(-class_2432.field_1352, class_2432.field_1350));
                    f4 = (float)class_3532.method_15350((double)(-Math.toDegrees(Math.atan2(class_2432.field_1351, Math.hypot(class_2432.field_1352, class_2432.field_1350)))), (double)-90.0, (double)90.0);
                    f3 = (float)Math.cos((double)System.currentTimeMillis() / 40.0) * 4.0f;
                    f2 = (float)Math.sin((double)System.currentTimeMillis() / 70.0) * 4.0f;
                    try {
                        try {
                            if (n2 == 0) break block4;
                            if (!bl) break block5;
                        }
                        catch (MatchException matchException) {
                            throw ap.a(matchException);
                        }
                        if (!(r2.b(class_13092) >= (double)r2.t.g())) break block6;
                    }
                    catch (MatchException matchException) {
                        throw ap.a(matchException);
                    }
                }
                f3 = 0.0f;
                f2 = 0.0f;
                f5 = am.a;
            }
            f4 = am.b;
        }
        d.a(new ak(f5 + f3, f4 + f2), 30.0f, 30.0f, 30.0f, 30.0f, 1, 15, false);
    }

    private void a(r r2, class_1309 class_13092, float[] fArray) {
        int n2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        block9: {
            int n3;
            block10: {
                int n4;
                block7: {
                    float f8;
                    block8: {
                        int n5 = f.a(class_13092, false, true, true, -100L, fArray);
                        class_243 class_2432 = aq.a(class_13092);
                        f7 = (float)Math.toDegrees(Math.atan2(-class_2432.field_1352, class_2432.field_1350));
                        f6 = (float)class_3532.method_15350((double)(-Math.toDegrees(Math.atan2(class_2432.field_1351, Math.hypot(class_2432.field_1352, class_2432.field_1350)))), (double)-90.0, (double)90.0);
                        f5 = ac.c(80.0f, 90.0f);
                        f4 = ac.c(80.0f, 90.0f);
                        float f9 = (float)Math.cos((double)System.currentTimeMillis() / 30.0);
                        float f10 = (float)Math.sin((double)System.currentTimeMillis() / 30.0);
                        f3 = f9 * ac.c(8.0f, 16.0f);
                        f2 = f10 * ac.c(8.0f, 16.0f);
                        n4 = as.r();
                        n3 = 0;
                        try {
                            try {
                                n2 = n5;
                                if (n4 == 0) break block7;
                                if (n2 == 0) break block8;
                            }
                            catch (MatchException matchException) {
                                throw ap.a(matchException);
                            }
                            r2.B = 1.0f;
                        }
                        catch (MatchException matchException) {
                            throw ap.a(matchException);
                        }
                    }
                    n2 = (f8 = r2.B - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                }
                try {
                    if (n4 == 0) break block9;
                    if (n2 <= 0) break block10;
                }
                catch (MatchException matchException) {
                    throw ap.a(matchException);
                }
                n3 = 1;
                r2.B -= 1.0f;
            }
            n2 = n3;
        }
        if (n2 == 0) {
            f3 = 0.0f;
            f2 = 0.0f;
            f7 = am.a;
            f6 = am.b;
        }
        ak ak2 = new ak(f7 + f3, f6 + f2);
        d.a(ak2, f5, f4, ac.a(90, 180), ac.a(90, 180), ac.a(0, 3), 15, false);
    }

    @Override
    public void a(r r2, class_1309 class_13092, float[] fArray, boolean bl) {
        block3: {
            block2: {
                try {
                    if (!r2.s.c(b)) break block2;
                    this.a(r2, class_13092, bl);
                    break block3;
                }
                catch (MatchException matchException) {
                    throw ap.a(matchException);
                }
            }
            this.a(r2, class_13092, fArray);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block11: {
            int n2;
            int n3;
            int n4;
            block10: {
                char[] cArray2 = "j%M".toCharArray();
                n4 = 45;
                cArray = cArray2;
                n3 = cArray2.length;
                n2 = 0;
                if (!true) break block10;
                n3 = n3;
                if (n3 <= n2) break block11;
            }
            do {
                n4 = n4;
                cArray = cArray;
                int n5 = n2;
                cArray[n5] = (char)(cArray[n5] ^ (n4 ^ (switch (n2 % 7) {
                    case 0 -> 1;
                    case 1 -> 103;
                    case 2 -> 22;
                    case 3 -> 106;
                    case 4 -> 87;
                    case 5 -> 88;
                    default -> 58;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        b = new String(cArray).intern();
    }
}

