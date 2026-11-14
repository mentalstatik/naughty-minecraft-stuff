/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import pulsescanner.a.as;
import pulsescanner.f.c.j;
import pulsescanner.f.m;

public final class z {
    private static String a;
    private static Set<String> b;
    private static final String c;

    private z() {
    }

    public static boolean a(String string) {
        boolean bl;
        block18: {
            block19: {
                String string2;
                block21: {
                    j j2;
                    int n2;
                    block16: {
                        j j3;
                        block17: {
                            n2 = as.q();
                            try {
                                if (string == null) {
                                    return false;
                                }
                            }
                            catch (MatchException matchException) {
                                throw z.a(matchException);
                            }
                            j3 = m.a(j.class);
                            try {
                                try {
                                    j2 = j3;
                                    if (n2 != 0) break block16;
                                    if (j2 != null) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw z.a(matchException);
                                }
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw z.a(matchException);
                            }
                        }
                        j2 = j3.m.a();
                    }
                    string2 = (String)((Object)j2);
                    try {
                        bl = string2.equals(a);
                        if (n2 != 0) break block18;
                        if (bl) break block19;
                    }
                    catch (MatchException matchException) {
                        throw z.a(matchException);
                    }
                    HashSet<String> hashSet = new HashSet<String>();
                    String[] stringArray = string2.split(c);
                    int n3 = stringArray.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        block20: {
                            block22: {
                                String string3 = stringArray[n4];
                                try {
                                    try {
                                        try {
                                            if (n2 != 0) break block20;
                                            if (n2 != 0) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw z.a(matchException);
                                        }
                                        if (string3.isBlank()) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw z.a(matchException);
                                    }
                                    hashSet.add(string3.trim().toLowerCase(Locale.ROOT));
                                }
                                catch (MatchException matchException) {
                                    throw z.a(matchException);
                                }
                            }
                            ++n4;
                        }
                        if (n2 == 0) continue;
                    }
                    b = hashSet;
                }
                a = string2;
            }
            bl = b.contains(string.toLowerCase(Locale.ROOT));
        }
        return bl;
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
                char[] cArray2 = "v\u0011!aM\r".toCharArray();
                n4 = 35;
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
                    case 1 -> 30;
                    case 2 -> 94;
                    case 3 -> 49;
                    case 4 -> 51;
                    case 5 -> 5;
                    default -> 101;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        c = new String(cArray).intern();
        b = Set.of();
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

