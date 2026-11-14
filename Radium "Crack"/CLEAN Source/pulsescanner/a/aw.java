/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import pulsescanner.a.as;
import pulsescanner.f.i;
import pulsescanner.i.f;

public class aw
extends f {
    public aw(i i2, String string, String[] stringArray) {
        super(string, "", stringArray[0], stringArray);
        i2.e.add(this);
    }

    public boolean c(String string) {
        boolean bl;
        block8: {
            block7: {
                aw aw2;
                int n2;
                block6: {
                    n2 = as.r();
                    try {
                        try {
                            aw2 = this;
                            if (n2 == 0) break block6;
                            if (!((String)aw2.a()).equalsIgnoreCase(string)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw aw.b(matchException);
                        }
                        aw2 = this;
                    }
                    catch (MatchException matchException) {
                        throw aw.b(matchException);
                    }
                }
                try {
                    bl = aw2.d();
                    if (n2 == 0) break block8;
                    if (!bl) break block7;
                }
                catch (MatchException matchException) {
                    throw aw.b(matchException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public String g() {
        return (String)this.a();
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }
}

