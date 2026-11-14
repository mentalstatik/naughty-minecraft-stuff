/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import pulsescanner.a.as;
import pulsescanner.f.i;
import pulsescanner.i.c;

public class at
extends c {
    public at(String string, boolean bl) {
        super(string, "", bl);
    }

    public at(i i2, String string, boolean bl) {
        this(string, bl);
        i2.e.add(this);
    }

    public boolean i() {
        boolean bl;
        block8: {
            block7: {
                at at2;
                int n2;
                block6: {
                    n2 = as.r();
                    try {
                        try {
                            at2 = this;
                            if (n2 == 0) break block6;
                            if (!((Boolean)at2.a()).booleanValue()) break block7;
                        }
                        catch (MatchException matchException) {
                            throw at.b(matchException);
                        }
                        at2 = this;
                    }
                    catch (MatchException matchException) {
                        throw at.b(matchException);
                    }
                }
                try {
                    bl = at2.d();
                    if (n2 == 0) break block8;
                    if (!bl) break block7;
                }
                catch (MatchException matchException) {
                    throw at.b(matchException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }
}

