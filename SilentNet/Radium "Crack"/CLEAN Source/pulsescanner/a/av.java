/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import pulsescanner.a.as;
import pulsescanner.f.i;
import pulsescanner.i.e;

public class av
extends e {
    private static final String h;

    public av(i i2, String string, int n2) {
        super(string, "", n2);
        i2.e.add(this);
    }

    public int j() {
        return (Integer)this.a();
    }

    public static boolean b(int n2) {
        int n3;
        block8: {
            block7: {
                int n4;
                block6: {
                    n4 = as.q();
                    try {
                        n3 = n2;
                        if (n4 != 0) break block6;
                        if (n3 < 0) break block7;
                    }
                    catch (MatchException matchException) {
                        throw av.b(matchException);
                    }
                    n3 = n2;
                }
                try {
                    try {
                        if (n4 != 0) break block8;
                        if (n3 > 7) break block7;
                    }
                    catch (MatchException matchException) {
                        throw av.b(matchException);
                    }
                    n3 = 1;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw av.b(matchException);
                }
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    @Override
    public String i() {
        String string;
        block6: {
            av av2;
            block4: {
                block5: {
                    int n2 = as.r();
                    try {
                        try {
                            av2 = this;
                            if (n2 == 0) break block4;
                            if (!av.b((Integer)av2.a())) break block5;
                        }
                        catch (MatchException matchException) {
                            throw av.b(matchException);
                        }
                        string = h + ((Integer)this.a() + 1);
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw av.b(matchException);
                    }
                }
                av2 = this;
            }
            string = super.i();
        }
        return string;
    }

    private static MatchException b(MatchException matchException) {
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
                char[] cArray2 = "a_9\u001c/\u0013".toCharArray();
                n4 = 79;
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
                    case 0 -> 99;
                    case 1 -> 127;
                    case 2 -> 3;
                    case 3 -> 32;
                    case 4 -> 5;
                    case 5 -> 124;
                    default -> 72;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        h = new String(cArray).intern();
    }
}

