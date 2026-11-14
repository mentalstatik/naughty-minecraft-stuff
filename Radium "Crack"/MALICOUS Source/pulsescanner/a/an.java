/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_746
 */
package pulsescanner.a;

import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_746;
import pulsescanner.a.ad;
import pulsescanner.a.as;

public final class an
implements ad {
    private static final String b;

    private an() {
        throw new UnsupportedOperationException(b);
    }

    public static Runnable[] a(class_1309 class_13092, boolean bl) {
        Runnable[] runnableArray;
        block25: {
            block32: {
                int n2;
                int n3;
                int n4;
                block31: {
                    int n5;
                    int n6;
                    block29: {
                        block30: {
                            class_1657 class_16572;
                            class_1657 class_16573;
                            block28: {
                                class_746 class_7462;
                                block27: {
                                    block26: {
                                        runnableArray = new Runnable[]{an::lambda$swapActions$0, an::lambda$swapActions$1};
                                        n6 = as.q();
                                        try {
                                            try {
                                                if (!bl) break block25;
                                                class_7462 = an.a.field_1724;
                                                if (n6 != 0) break block26;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw an.a(unsupportedOperationException);
                                            }
                                            if (class_7462 == null) break block25;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw an.a(unsupportedOperationException);
                                        }
                                        class_7462 = class_13092;
                                    }
                                    try {
                                        try {
                                            if (n6 != 0) break block27;
                                            if (!(class_7462 instanceof class_1657)) break block25;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw an.a(unsupportedOperationException);
                                        }
                                        class_7462 = class_13092;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw an.a(unsupportedOperationException);
                                    }
                                }
                                class_16573 = (class_1657)class_7462;
                                try {
                                    try {
                                        class_16572 = class_16573;
                                        if (n6 != 0) break block28;
                                        if (!class_16572.method_6039()) break block25;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw an.a(unsupportedOperationException);
                                    }
                                    class_16572 = class_16573;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw an.a(unsupportedOperationException);
                                }
                            }
                            class_1799 class_17992 = class_16572.method_6047();
                            class_1799 class_17993 = class_16573.method_6079();
                            try {
                                try {
                                    try {
                                        try {
                                            n5 = class_17992.method_31574(class_1802.field_8255);
                                            if (n6 != 0) break block29;
                                            if (n5 != 0) break block30;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw an.a(unsupportedOperationException);
                                        }
                                        n5 = class_17993.method_31574(class_1802.field_8255) ? 1 : 0;
                                        if (n6 != 0) break block29;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw an.a(unsupportedOperationException);
                                    }
                                    if (n5 != 0) break block30;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw an.a(unsupportedOperationException);
                                }
                                return runnableArray;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw an.a(unsupportedOperationException);
                            }
                        }
                        n5 = an.a();
                    }
                    n4 = n5;
                    n3 = an.a.field_1724.method_31548().method_67532();
                    try {
                        n2 = n4;
                        if (n6 != 0) break block31;
                        if (n2 < 0) break block32;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw an.a(unsupportedOperationException);
                    }
                    n2 = n4;
                }
                try {
                    if (n2 != n3) {
                        runnableArray[0] = () -> an.lambda$swapActions$2(n4);
                        runnableArray[1] = () -> an.lambda$swapActions$3(n3);
                        return runnableArray;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw an.a(unsupportedOperationException);
                }
            }
            return runnableArray;
        }
        return runnableArray;
    }

    public static int a() {
        try {
            if (an.a.field_1724 == null) {
                return -1;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw an.a(unsupportedOperationException);
        }
        int n2 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n2 >= 9) break;
                        if (!(an.a.field_1724.method_31548().method_5438(n2).method_7909() instanceof class_1743)) break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw an.a(unsupportedOperationException);
                    }
                    return n2;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw an.a(unsupportedOperationException);
                }
            }
            ++n2;
        }
        return -1;
    }

    private static void lambda$swapActions$3(int n2) {
        try {
            if (a.method_1562() != null) {
                a.method_1562().method_52787((class_2596)new class_2868(n2));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw an.a(unsupportedOperationException);
        }
    }

    private static void lambda$swapActions$2(int n2) {
        try {
            if (a.method_1562() != null) {
                a.method_1562().method_52787((class_2596)new class_2868(n2));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw an.a(unsupportedOperationException);
        }
    }

    private static void lambda$swapActions$1() {
    }

    private static void lambda$swapActions$0() {
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
                char[] cArray2 = "ia|C;}z\u001dh5Eo}eT}l\u0010xxhNz5Qup)^h{^t`)_l5Yug}\\gaYz`lY".toCharArray();
                n4 = 31;
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
                    case 0 -> 34;
                    case 1 -> 22;
                    case 2 -> 10;
                    case 3 -> 47;
                    case 4 -> 4;
                    case 5 -> 11;
                    default -> 22;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        b = new String(cArray).intern();
    }
}

