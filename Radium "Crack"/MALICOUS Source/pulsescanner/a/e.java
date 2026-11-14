/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_4050
 */
package pulsescanner.a;

import java.util.function.Predicate;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_4050;
import pulsescanner.a.ad;
import pulsescanner.a.ao;
import pulsescanner.a.as;

public final class e
implements ad {
    private static final String b;

    public static boolean a(class_238 class_2382, class_2248 class_22482) {
        return e.a(class_2382, arg_0 -> e.lambda$containsBlock$0(class_22482, arg_0));
    }

    public static boolean a(class_2248 class_22482) {
        return e.a(e.a.field_1724.method_5829().method_1014(-0.001), class_22482);
    }

    public static boolean a(class_4050 class_40502) {
        return e.a.field_1724.method_73183().method_8587((class_1297)e.a.field_1724, e.a.field_1724.method_18377(class_40502).method_30757(e.a.field_1724.method_73189()).method_1011(1.0E-7));
    }

    public static boolean a() {
        boolean bl;
        block34: {
            block38: {
                block35: {
                    int n2;
                    block36: {
                        n2 = as.r();
                        try {
                            block37: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            bl = e.a.field_1724.method_6059(class_1294.field_5919);
                                                                                            if (n2 == 0) break block34;
                                                                                            if (bl) break block35;
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            throw e.a(unsupportedOperationException);
                                                                                        }
                                                                                        bl = e.a.field_1724.method_6059(class_1294.field_5902);
                                                                                        if (n2 == 0) break block34;
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        throw e.a(unsupportedOperationException);
                                                                                    }
                                                                                    if (bl) break block35;
                                                                                }
                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                    throw e.a(unsupportedOperationException);
                                                                                }
                                                                                bl = e.a(class_2246.field_10343);
                                                                                if (n2 == 0) break block34;
                                                                            }
                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                throw e.a(unsupportedOperationException);
                                                                            }
                                                                            if (bl) break block35;
                                                                        }
                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                            throw e.a(unsupportedOperationException);
                                                                        }
                                                                        bl = e.a.field_1724.method_5869();
                                                                        if (n2 == 0) break block34;
                                                                    }
                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                        throw e.a(unsupportedOperationException);
                                                                    }
                                                                    if (bl) break block35;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    throw e.a(unsupportedOperationException);
                                                                }
                                                                bl = e.a.field_1724.method_5771();
                                                                if (n2 == 0) break block34;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                throw e.a(unsupportedOperationException);
                                                            }
                                                            if (bl) break block35;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw e.a(unsupportedOperationException);
                                                        }
                                                        bl = e.a.field_1724.method_6101();
                                                        if (n2 == 0) break block34;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw e.a(unsupportedOperationException);
                                                    }
                                                    if (bl) break block35;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw e.a(unsupportedOperationException);
                                                }
                                                bl = e.a(class_4050.field_18076);
                                                if (n2 == 0) break block36;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw e.a(unsupportedOperationException);
                                            }
                                            if (bl) break block37;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw e.a(unsupportedOperationException);
                                        }
                                        bl = e.a.field_1724.method_18276();
                                        if (n2 == 0) break block34;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw e.a(unsupportedOperationException);
                                    }
                                    if (bl) break block35;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw e.a(unsupportedOperationException);
                                }
                            }
                            bl = e.a.field_1724.method_31549().field_7479;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw e.a(unsupportedOperationException);
                        }
                    }
                    try {
                        if (n2 == 0) break block34;
                        if (!bl) break block38;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw e.a(unsupportedOperationException);
                    }
                }
                bl = true;
                break block34;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean a(class_238 class_2382, Predicate<class_2338> predicate) {
        return class_2338.method_29715((class_238)class_2382).anyMatch(predicate);
    }

    public static boolean b() {
        boolean bl;
        block14: {
            block13: {
                boolean bl2;
                block12: {
                    block10: {
                        try {
                            block11: {
                                try {
                                    try {
                                        if (!(e.a.field_1724.field_6017 > 0.0)) break block10;
                                        if (e.a.field_1724.field_6017 < 0.08) break block11;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw e.a(unsupportedOperationException);
                                    }
                                    if (ao.a((int)1).v) break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw e.a(unsupportedOperationException);
                                }
                            }
                            bl2 = true;
                            break block12;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw e.a(unsupportedOperationException);
                        }
                    }
                    bl2 = false;
                }
                boolean bl3 = bl2;
                try {
                    try {
                        if (e.a.field_1724.method_24828() || !bl3) break block13;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw e.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block14;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw e.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private e() {
        throw new UnsupportedOperationException(b);
    }

    private static boolean lambda$containsBlock$0(class_2248 class_22482, class_2338 class_23382) {
        return e.a.field_1687.method_8320(class_23382).method_26204().equals(class_22482);
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
                char[] cArray2 = "\u0011i.R\u0007\u0001\u000ee`gTS\u0001\u0011,u>\u0001D\u0004\u001c6rg@I\f]&`)OH\u001c]'dgHI\u001b\t$o3HF\u001c\u0018!".toCharArray();
                n4 = 75;
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
                    case 0 -> 14;
                    case 1 -> 74;
                    case 2 -> 12;
                    case 3 -> 106;
                    case 4 -> 108;
                    case 5 -> 35;
                    default -> 54;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        b = new String(cArray).intern();
    }
}

