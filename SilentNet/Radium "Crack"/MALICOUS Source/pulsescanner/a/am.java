/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_3532
 */
package pulsescanner.a;

import net.minecraft.class_1297;
import net.minecraft.class_3532;
import pulsescanner.a.as;

public final class am {
    public static float a;
    public static float b;
    public static boolean c;

    private am() {
    }

    public static void a(boolean bl) {
        c = bl;
    }

    public static void a(class_1297 class_12972, float f2) {
        block6: {
            class_1297 class_12973;
            block7: {
                int n2 = as.q();
                try {
                    try {
                        try {
                            if (c) break block6;
                            class_12973 = class_12972;
                            if (n2 != 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw am.a(matchException);
                        }
                        if (class_12973 == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw am.a(matchException);
                    }
                    a = class_12972.method_5705(f2);
                    class_12973 = class_12972;
                }
                catch (MatchException matchException) {
                    throw am.a(matchException);
                }
            }
            b = class_12973.method_5695(f2);
        }
    }

    public static void a(double d2, double d3) {
        b = class_3532.method_15363((float)((float)((double)b + d3 * 0.15)), (float)-90.0f, (float)90.0f);
        a = (float)((double)a + d2 * 0.15);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

