/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_4050
 *  net.minecraft.class_746
 */
package pulsescanner.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_4050;
import net.minecraft.class_746;
import pulsescanner.a.ad;
import pulsescanner.a.as;
import pulsescanner.a.i;

public final class aj
implements ad {
    private static final String b;

    public static List<class_243> a(class_238 class_2382) {
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        int n2 = as.q();
        double d2 = 0.01f;
        int n3 = 17;
        int n4 = 5;
        int n5 = 24;
        int n6 = 6;
        class_2382 = class_2382.method_989(-d2, -d2, -d2);
        double[] dArray = new double[]{class_2382.field_1320 - class_2382.field_1323, class_2382.field_1325 - class_2382.field_1322, (class_2382.field_1325 - class_2382.field_1322) / 1.05};
        double[] dArray2 = new double[]{class_2382.field_1323 + dArray[0] / 2.0, class_2382.field_1322, class_2382.field_1321 + dArray[0] / 2.0};
        double[] dArray3 = new double[]{class_2382.field_1323, class_2382.field_1322, class_2382.field_1321};
        double[] dArray4 = new double[]{class_2382.field_1320, class_2382.field_1325, class_2382.field_1324};
        float f2 = (float)Math.sqrt(dArray[0] * dArray[0] + dArray[0] * dArray[0] + dArray[0] * dArray[0]) / 2.0f;
        class_746 class_7462 = aj.a.field_1724;
        try {
            if (class_7462 == null) {
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw aj.a(unsupportedOperationException);
        }
        float f3 = (float)((1.0 - Math.min(class_7462.method_73189().method_1022(new class_243(dArray2[0], dArray2[1], dArray2[2])) / 5.0, 1.0)) * Math.min(class_7462.method_73189().method_1022(new class_243(dArray2[0], class_7462.method_23318(), dArray2[2])) / (double)0.6f, 1.0));
        int n7 = aj.a(n4, n3, f3);
        int n8 = aj.a(n6, n5, f3);
        float f4 = 0.0f;
        int[] nArray = IntStream.range(0, n7).toArray();
        int n9 = nArray.length;
        int n10 = 0;
        while (n10 < n9) {
            block58: {
                int[] nArray2 = nArray;
                int n11 = n10;
                block45: while (true) {
                    int n12;
                    int n13;
                    int[] nArray3;
                    double d3;
                    int n14;
                    block57: {
                        int n15;
                        Integer n16;
                        block56: {
                            n16 = nArray2[n11];
                            n15 = n16;
                            if (n2 == 0) {
                                block55: {
                                    try {
                                        try {
                                            if (n15 == 0) break block55;
                                            n15 = n16;
                                            if (n2 != 0) break block56;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw aj.a(unsupportedOperationException);
                                        }
                                        if (n15 == n7 - 1) break block55;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw aj.a(unsupportedOperationException);
                                    }
                                    n14 = 0;
                                    d3 = aj.b(dArray3[0], dArray4[0], (float)n16.intValue() / (float)(n7 - 1));
                                    nArray3 = IntStream.range(0, n7).toArray();
                                    n13 = nArray3.length;
                                    n12 = 0;
                                    try {
                                        if (n2 == 0) break block57;
                                        pulsescanner.f.i.b(new int[5]);
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw aj.a(unsupportedOperationException);
                                    }
                                }
                                n15 = 1;
                            }
                        }
                        n14 = n15;
                        d3 = aj.b(dArray3[0], dArray4[0], (float)n16.intValue() / (float)(n7 - 1));
                        nArray3 = IntStream.range(0, n7).toArray();
                        n13 = nArray3.length;
                        n12 = 0;
                    }
                    while (n12 < n13) {
                        int n17;
                        Integer n18;
                        block59: {
                            block61: {
                                if (n2 != 0) break block58;
                                n18 = nArray3[n12];
                                try {
                                    block60: {
                                        try {
                                            try {
                                                try {
                                                    n17 = n18;
                                                    if (n2 != 0) break block59;
                                                    if (n17 == 0) break block60;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw aj.a(unsupportedOperationException);
                                                }
                                                n17 = n18;
                                                if (n2 != 0) break block59;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw aj.a(unsupportedOperationException);
                                            }
                                            if (n17 != n7 - 1) break block61;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw aj.a(unsupportedOperationException);
                                        }
                                    }
                                    n17 = 1;
                                    break block59;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                            }
                            n17 = 0;
                        }
                        int n19 = n17;
                        double d4 = aj.b(dArray3[2], dArray4[2], (float)n18.intValue() / (float)(n7 - 1));
                        int[] nArray4 = IntStream.range(0, n8).toArray();
                        int n20 = nArray4.length;
                        for (int i2 = 0; i2 < n20; ++i2) {
                            boolean bl;
                            block67: {
                                class_746 class_7463;
                                class_243 class_2432;
                                block66: {
                                    int n21;
                                    block64: {
                                        int n22;
                                        block68: {
                                            double d5;
                                            int n23;
                                            Integer n24;
                                            block62: {
                                                block63: {
                                                    nArray2 = nArray4;
                                                    n11 = i2;
                                                    if (n2 != 0) continue block45;
                                                    n24 = nArray2[n11];
                                                    try {
                                                        try {
                                                            try {
                                                                n23 = n24;
                                                                if (n2 != 0) break block62;
                                                                if (n23 == 0) break block63;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                throw aj.a(unsupportedOperationException);
                                                            }
                                                            n23 = n24;
                                                            if (n2 != 0) break block62;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw aj.a(unsupportedOperationException);
                                                        }
                                                        if (n23 == n8 - 1) break block63;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw aj.a(unsupportedOperationException);
                                                    }
                                                    n22 = 0;
                                                    d5 = aj.b(dArray3[1], dArray4[1], (float)n24.intValue() / (float)(n8 - 1));
                                                    class_2432 = new class_243(d3, d5, d4);
                                                    if (n2 == 0) break block68;
                                                }
                                                n23 = 1;
                                            }
                                            n22 = n23;
                                            d5 = aj.b(dArray3[1], dArray4[1], (float)n24.intValue() / (float)(n8 - 1));
                                            class_2432 = new class_243(d3, d5, d4);
                                        }
                                        try {
                                            try {
                                                block65: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        n21 = n14;
                                                                        if (n2 != 0) break block64;
                                                                        if (n21 != 0) break block65;
                                                                    }
                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                        throw aj.a(unsupportedOperationException);
                                                                    }
                                                                    n21 = n19;
                                                                    if (n2 != 0) break block64;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    throw aj.a(unsupportedOperationException);
                                                                }
                                                                if (n21 != 0) break block65;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                throw aj.a(unsupportedOperationException);
                                                            }
                                                            n21 = n22;
                                                            if (n2 != 0) break block64;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw aj.a(unsupportedOperationException);
                                                        }
                                                        if (n21 == 0) continue;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw aj.a(unsupportedOperationException);
                                                    }
                                                }
                                                class_7463 = class_7462;
                                                if (n2 != 0) break block66;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw aj.a(unsupportedOperationException);
                                            }
                                            double d6 = class_7463.method_73189().method_1022(class_2432.method_1031(0.0, (double)(-class_7462.method_18381(class_4050.field_18076)), 0.0)) - (double)f2;
                                            n21 = d6 == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw aj.a(unsupportedOperationException);
                                        }
                                    }
                                    if (n21 < 0) continue;
                                    class_7463 = class_7462;
                                }
                                try {
                                    try {
                                        bl = aj.a(class_7463, class_2432, f4);
                                        if (n2 != 0) break block67;
                                        if (!bl) continue;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw aj.a(unsupportedOperationException);
                                    }
                                    bl = arrayList.add(class_2432);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                            }
                            try {
                                try {
                                    if (!bl && n2 == 0) break;
                                    continue;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw aj.a(unsupportedOperationException);
                            }
                        }
                        ++n12;
                        if (n2 == 0) continue;
                    }
                    break;
                }
                ++n10;
            }
            if (n2 == 0) continue;
        }
        return arrayList;
    }

    public static class_239 a(class_243 class_2432, class_243 class_2433, class_3959.class_3960 class_39602, class_3959.class_242 class_2422) {
        return aj.a.field_1687.method_17742(new class_3959(class_2432, class_2433, class_39602, class_2422, (class_1297)aj.a.field_1724));
    }

    public static class_243 b(class_238 class_2382) {
        return aj.a(class_2382, false);
    }

    private static boolean a(class_746 class_7462, double d2, double d3, double d4) {
        boolean bl;
        block5: {
            block4: {
                class_243 class_2432 = new class_243(d2, d3, d4);
                try {
                    try {
                        if (aj.a.field_1687 == null || aj.a(class_7462.method_33571(), class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348).method_17783() == class_239.class_240.field_1332) break block4;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw aj.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw aj.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean a(class_746 class_7462, class_243 class_2432, float f2) {
        boolean bl;
        block17: {
            block18: {
                block16: {
                    try {
                        if (f2 != 0.0f) break block16;
                        bl = aj.a(class_7462, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
                        break block17;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw aj.a(unsupportedOperationException);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (!aj.a(class_7462, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350) || !aj.a(class_7462, class_2432.field_1352, class_2432.field_1351 + (double)f2, class_2432.field_1350)) break block18;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw aj.a(unsupportedOperationException);
                                        }
                                        if (!aj.a(class_7462, class_2432.field_1352, class_2432.field_1351 - (double)f2, class_2432.field_1350)) break block18;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw aj.a(unsupportedOperationException);
                                    }
                                    if (!aj.a(class_7462, class_2432.field_1352 + (double)f2, class_2432.field_1351, class_2432.field_1350)) break block18;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                                if (!aj.a(class_7462, class_2432.field_1352 - (double)f2, class_2432.field_1351, class_2432.field_1350)) break block18;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw aj.a(unsupportedOperationException);
                            }
                            if (!aj.a(class_7462, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350 + (double)f2)) break block18;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw aj.a(unsupportedOperationException);
                        }
                        if (!aj.a(class_7462, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350 - (double)f2)) break block18;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw aj.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block17;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw aj.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static double a(class_746 class_7462, double d2, double d3) {
        double d4 = class_7462.method_23317() - d2;
        double d5 = class_7462.method_23321() - d3;
        return class_3532.method_15355((float)((float)(d4 * d4 + d5 * d5)));
    }

    private aj() {
        throw new UnsupportedOperationException(b);
    }

    public static double a(double d2, double d3, double d4) {
        return Math.min(d4, Math.max(d2, d3));
    }

    private static boolean a(class_746 class_7462, class_243 class_2432) {
        boolean bl;
        block5: {
            block4: {
                class_243 class_2433 = new class_243(class_7462.method_23317(), class_7462.method_23320(), class_7462.method_23321());
                try {
                    try {
                        if (aj.a.field_1687 == null || aj.a(class_2433, class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348).method_17783() == class_239.class_240.field_1332) break block4;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw aj.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw aj.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static double a(class_243 class_2432, class_243 class_2433) {
        double d2 = class_2432.field_1352 - class_2433.field_1352;
        double d3 = class_2432.field_1351 - class_2433.field_1351;
        double d4 = class_2432.field_1350 - class_2433.field_1350;
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public static class_243 a(class_238 class_2382, boolean bl) {
        class_243 class_2432;
        block18: {
            class_243 class_2433;
            block22: {
                block21: {
                    List<class_243> list;
                    block20: {
                        double d2;
                        double[] dArray;
                        block19: {
                            double[] dArray2;
                            block17: {
                                try {
                                    if (class_2382 == null) {
                                        return aj.a.field_1724.method_33571();
                                    }
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                                dArray2 = new double[]{class_2382.field_1320 - class_2382.field_1323, class_2382.field_1325 - class_2382.field_1322, (class_2382.field_1325 - class_2382.field_1322) / (double)1.1f};
                                double[] dArray3 = new double[]{class_2382.field_1323 + dArray2[0] / 2.0, class_2382.field_1322, class_2382.field_1321 + dArray2[0] / 2.0};
                                dArray = new double[]{aj.a.field_1724.method_23318() - dArray3[1], aj.a(aj.a.field_1724, dArray3[0], dArray3[2])};
                                double d3 = aj.a(i.z.a((dArray[1] - dArray2[0] / 2.0) / (5.0 + dArray2[0] / 2.0)), 0.1, 0.95);
                                double d4 = aj.a(d3 * d3, 0.0, 1.0);
                                d2 = aj.a(dArray2[2] / 2.0 * d4 + dArray2[2] / 2.0 * aj.a(dArray[0] + d4, 0.0, 1.0), 0.0, dArray2[2]);
                                class_2432 = new class_243(dArray3[0], dArray3[1] + d2, dArray3[2]);
                                try {
                                    if (bl || aj.a(aj.a.field_1724, class_2432)) break block17;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                                class_2432 = class_2432.method_1031(0.0, -d2 / 2.0, 0.0);
                            }
                            try {
                                try {
                                    if (dArray2[1] <= 1.0) break block18;
                                    if (bl) break block19;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw aj.a(unsupportedOperationException);
                                }
                                if (aj.a(aj.a.field_1724, class_2432)) break block18;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw aj.a(unsupportedOperationException);
                            }
                        }
                        list = aj.a(class_2382);
                        float f2 = 1.0f - (float)Math.max(Math.min((dArray[1] - 2.0) / 3.0, 1.0), 0.0);
                        class_243 class_2434 = new class_243(aj.a.field_1724.method_23317(), aj.a.field_1724.method_23318() + (double)0.6f + aj.b(d2, d2 / 2.5, f2), aj.a.field_1724.method_23321());
                        try {
                            try {
                                if (list == null || list.size() <= 1) break block20;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw aj.a(unsupportedOperationException);
                            }
                            list.sort(Comparator.comparing(arg_0 -> aj.lambda$findAimPoint$0(class_2434, arg_0)));
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw aj.a(unsupportedOperationException);
                        }
                    }
                    try {
                        try {
                            if (list == null || list.isEmpty()) break block21;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw aj.a(unsupportedOperationException);
                        }
                        class_2433 = list.getFirst();
                        break block22;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw aj.a(unsupportedOperationException);
                    }
                }
                class_2433 = class_2432;
            }
            return class_2433;
        }
        return class_2432;
    }

    public static int a(int n2, int n3, float f2) {
        return n2 + (int)(f2 * (float)(n3 - n2));
    }

    private static Double a(class_243 class_2432) {
        return class_2432.method_1025(aj.a.field_1724.method_33571());
    }

    public static double b(double d2, double d3, double d4) {
        return d2 + d4 * (d3 - d2);
    }

    private static Double lambda$findAimPoint$0(class_243 class_2432, class_243 class_2433) {
        return aj.a(class_2432, class_2433);
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
                char[] cArray2 = "NK#tB\tG:Bjr\u0016\tXsW3'\u0001\fUiPjf\f\u0004\u0014yB$i\r\u0014\u0014xFjn\f\u0013@{M>n\u0003\u0014Q~".toCharArray();
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
                    case 0 -> 76;
                    case 1 -> 117;
                    case 2 -> 28;
                    case 3 -> 81;
                    case 4 -> 52;
                    case 5 -> 54;
                    default -> 98;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        b = new String(cArray).intern();
    }
}

