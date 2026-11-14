/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import pulsescanner.a.as;

public class ai {
    private static final String a;

    public static Number a(Number number, Number number2, double d2) {
        Number number3;
        block34: {
            block35: {
                int n2;
                double d3;
                block32: {
                    block33: {
                        block30: {
                            block31: {
                                block28: {
                                    block29: {
                                        block26: {
                                            block27: {
                                                block24: {
                                                    block25: {
                                                        double d4 = number.doubleValue();
                                                        double d5 = number2.doubleValue();
                                                        d3 = d4 + d2 * (d5 - d4);
                                                        n2 = as.r();
                                                        try {
                                                            try {
                                                                number3 = number;
                                                                if (n2 == 0) break block24;
                                                                if (!(number3 instanceof Integer)) break block25;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw ai.a(illegalArgumentException);
                                                            }
                                                            return (int)Math.round(d3);
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw ai.a(illegalArgumentException);
                                                        }
                                                    }
                                                    number3 = number;
                                                }
                                                try {
                                                    try {
                                                        if (n2 == 0) break block26;
                                                        if (!(number3 instanceof Double)) break block27;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw ai.a(illegalArgumentException);
                                                    }
                                                    return d3;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw ai.a(illegalArgumentException);
                                                }
                                            }
                                            number3 = number;
                                        }
                                        try {
                                            try {
                                                if (n2 == 0) break block28;
                                                if (!(number3 instanceof Float)) break block29;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ai.a(illegalArgumentException);
                                            }
                                            return Float.valueOf((float)d3);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ai.a(illegalArgumentException);
                                        }
                                    }
                                    number3 = number;
                                }
                                try {
                                    try {
                                        if (n2 == 0) break block30;
                                        if (!(number3 instanceof Long)) break block31;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ai.a(illegalArgumentException);
                                    }
                                    return Math.round(d3);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ai.a(illegalArgumentException);
                                }
                            }
                            number3 = number;
                        }
                        try {
                            try {
                                if (n2 == 0) break block32;
                                if (!(number3 instanceof Short)) break block33;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ai.a(illegalArgumentException);
                            }
                            return (short)Math.round(d3);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ai.a(illegalArgumentException);
                        }
                    }
                    number3 = number;
                }
                try {
                    try {
                        if (n2 == 0) break block34;
                        if (!(number3 instanceof Byte)) break block35;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ai.a(illegalArgumentException);
                    }
                    return (byte)Math.round(d3);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ai.a(illegalArgumentException);
                }
            }
            number3 = number;
        }
        String string = number3.getClass().getSimpleName();
        throw new IllegalArgumentException(a + string);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
                char[] cArray2 = "6tn\u0005Ge^\u0011nx\u0014\u0017aH\u0013\u007f'P".toCharArray();
                n4 = 94;
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
                    case 0 -> 61;
                    case 1 -> 68;
                    case 2 -> 67;
                    case 3 -> 46;
                    case 4 -> 105;
                    case 5 -> 75;
                    default -> 111;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        a = new String(cArray).intern();
    }
}

