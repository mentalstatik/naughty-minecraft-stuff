/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1887
 *  net.minecraft.class_1890
 *  net.minecraft.class_2378
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_6880$class_6883
 *  net.minecraft.class_7924
 */
package pulsescanner.a;

import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_2378;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import pulsescanner.a.ad;
import pulsescanner.a.as;

public final class j
implements ad {
    public static void a(int n2) {
        block10: {
            try {
                try {
                    try {
                        try {
                            try {
                                if (j.a.field_1724 == null || j.a.field_1761 == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw j.a(matchException);
                            }
                            if (n2 < 0) break block10;
                        }
                        catch (MatchException matchException) {
                            throw j.a(matchException);
                        }
                        if (n2 > 8) break block10;
                    }
                    catch (MatchException matchException) {
                        throw j.a(matchException);
                    }
                    if (j.a.field_1724.method_31548().method_67532() == n2) break block10;
                }
                catch (MatchException matchException) {
                    throw j.a(matchException);
                }
                j.a.field_1724.method_31548().method_61496(n2);
                j.a.field_1761.method_2911();
            }
            catch (MatchException matchException) {
                throw j.a(matchException);
            }
        }
    }

    private j() {
    }

    public static int a(Predicate<class_1799> predicate, class_5321<class_1887> class_53212) {
        int n2;
        block11: {
            int n3 = as.r();
            try {
                if (j.a.field_1724 == null) {
                    return -1;
                }
            }
            catch (MatchException matchException) {
                throw j.a(matchException);
            }
            int n4 = -1;
            int n5 = 0;
            int n6 = 0;
            while (n6 < 9) {
                block10: {
                    block12: {
                        class_1799 class_17992 = j.a.field_1724.method_31548().method_5438(n6);
                        try {
                            try {
                                if (n3 == 0) break block10;
                                n2 = predicate.test(class_17992) ? 1 : 0;
                                if (n3 == 0) break block11;
                            }
                            catch (MatchException matchException) {
                                throw j.a(matchException);
                            }
                            if (n2 == 0) break block12;
                        }
                        catch (MatchException matchException) {
                            throw j.a(matchException);
                        }
                        int n7 = j.a(class_17992, class_53212);
                        try {
                            if (n3 == 0) break block10;
                            if (n7 <= n5) break block12;
                        }
                        catch (MatchException matchException) {
                            throw j.a(matchException);
                        }
                        n4 = n6;
                        n5 = n7;
                    }
                    ++n6;
                }
                if (n3 != 0) continue;
            }
            n2 = n4;
        }
        return n2;
    }

    public static int a(class_1799 class_17992, class_5321<class_1887> class_53212) {
        int n2;
        block5: {
            block4: {
                try {
                    try {
                        if (j.a.field_1687 == null || class_17992.method_7960()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw j.a(matchException);
                    }
                    n2 = j.a.field_1687.method_30349().method_46759(class_7924.field_41265).flatMap(arg_0 -> j.lambda$enchantmentLevel$0(class_53212, arg_0)).map(arg_0 -> j.lambda$enchantmentLevel$1(class_17992, arg_0)).orElse(0);
                    break block5;
                }
                catch (MatchException matchException) {
                    throw j.a(matchException);
                }
            }
            n2 = 0;
        }
        return n2;
    }

    private static Integer lambda$enchantmentLevel$1(class_1799 class_17992, class_6880.class_6883 class_68832) {
        return class_1890.method_8225((class_6880)class_68832, (class_1799)class_17992);
    }

    private static Optional lambda$enchantmentLevel$0(class_5321 class_53212, class_2378 class_23782) {
        return class_23782.method_10223(class_53212.method_29177());
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

