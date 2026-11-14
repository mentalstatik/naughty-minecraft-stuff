/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package pulsescanner.f.f;

import net.minecraft.class_2338;
import pulsescanner.f.f.a;
import pulsescanner.f.f.q;
import pulsescanner.f.i;

record ab(class_2338 ax, class_2338 ay, a az) {
    boolean a() {
        int n2;
        block8: {
            block7: {
                ab ab2;
                i[] iArray;
                block6: {
                    iArray = q.r();
                    try {
                        try {
                            ab2 = this;
                            if (iArray != null) break block6;
                            if (ab2.ax.method_10264() >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ab.a(matchException);
                        }
                        ab2 = this;
                    }
                    catch (MatchException matchException) {
                        throw ab.a(matchException);
                    }
                }
                try {
                    n2 = ab2.ay.method_10264();
                    if (iArray != null) break block8;
                    if (n2 >= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw ab.a(matchException);
                }
                n2 = 1;
                break block8;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    double b() {
        return (double)(this.ax.method_10263() + this.ay.method_10263() + 1) * 0.5;
    }

    double c() {
        return (double)(this.ax.method_10264() + this.ay.method_10264() + 1) * 0.5;
    }

    double d() {
        return (double)(this.ax.method_10260() + this.ay.method_10260() + 1) * 0.5;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

