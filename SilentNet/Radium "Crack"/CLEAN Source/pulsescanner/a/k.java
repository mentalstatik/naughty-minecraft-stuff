/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package pulsescanner.a;

import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import pulsescanner.a.ad;
import pulsescanner.a.as;

public final class k
implements ad {
    private static final String b;

    public static class_243 a(float f2, float f3) {
        float f4 = -f3 * ((float)Math.PI / 180) - (float)Math.PI;
        float f5 = -f2 * ((float)Math.PI / 180);
        float f6 = class_3532.method_15362((double)f4);
        float f7 = class_3532.method_15374((double)f4);
        float f8 = -class_3532.method_15362((double)f5);
        float f9 = class_3532.method_15374((double)f5);
        return new class_243((double)(f7 * f8), (double)f9, (double)(f6 * f8));
    }

    public static boolean a(float f2, float f3, double d2, class_1297 class_12972) {
        boolean bl;
        block20: {
            block22: {
                block21: {
                    class_746 class_7462;
                    class_243 class_2432;
                    int n2;
                    class_243 class_2433;
                    block18: {
                        block19: {
                            float f4 = a.method_61966().method_60637(true);
                            class_2433 = k.a.field_1724.method_5836(f4);
                            class_243 class_2434 = k.a(f3, f2);
                            n2 = as.r();
                            class_2432 = class_2433.method_1019(class_2434.method_1021(d2));
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    class_7462 = k.a.field_1724;
                                                    if (n2 == 0) break block18;
                                                    if (class_7462 == null) break block19;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw k.a(unsupportedOperationException);
                                                }
                                                class_7462 = k.a.field_1724;
                                                if (n2 == 0) break block18;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw k.a(unsupportedOperationException);
                                            }
                                            if (!class_7462.method_6128()) break block19;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw k.a(unsupportedOperationException);
                                        }
                                        class_7462 = class_12972;
                                        if (n2 == 0) break block18;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw k.a(unsupportedOperationException);
                                    }
                                    if (!((double)class_7462.method_5739(class_12972) > d2 * 3.0)) break block19;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw k.a(unsupportedOperationException);
                                }
                                return true;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw k.a(unsupportedOperationException);
                            }
                        }
                        class_7462 = class_12972;
                    }
                    class_238 class_2382 = class_7462.method_5829();
                    try {
                        try {
                            try {
                                bl = class_2382.method_1006(class_2433);
                                if (n2 == 0) break block20;
                                if (bl) break block21;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw k.a(unsupportedOperationException);
                            }
                            bl = class_2382.method_992(class_2433, class_2432).isPresent();
                            if (n2 == 0) break block20;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw k.a(unsupportedOperationException);
                        }
                        if (!bl) break block22;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw k.a(unsupportedOperationException);
                    }
                }
                bl = true;
                break block20;
            }
            bl = false;
        }
        return bl;
    }

    private k() {
        throw new UnsupportedOperationException(b);
    }

    private static boolean a(class_1297 class_12972) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (class_12972.method_7325() || !class_12972.method_5805()) break block6;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw k.a(unsupportedOperationException);
                        }
                        if (!class_12972.method_5863()) break block6;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw k.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block7;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw k.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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
                char[] cArray2 = "_h\u0005)dXF+aL/0XYbt\u0015z']TxsL;*U\u0015ha\u00024+E\u0015ieL3*BAjn\u00183%EPo".toCharArray();
                n4 = 86;
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
                    case 0 -> 93;
                    case 1 -> 86;
                    case 2 -> 58;
                    case 3 -> 12;
                    case 4 -> 18;
                    case 5 -> 103;
                    default -> 99;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        b = new String(cArray).intern();
    }
}

