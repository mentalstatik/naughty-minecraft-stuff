/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package pulsescanner.f;

import java.util.List;
import net.minecraft.class_332;
import pulsescanner.d.c;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.g.e;

public abstract class k
extends j {
    protected static final float x = 6.0f;
    protected static final float C = 4.0f;
    protected static final float D = 3.0f;
    private List<String[]> E = List.of();

    protected k(String string, String string2, int n2, int n3, float f2, float f3) {
        super(string, string2, n2, n3, f2, f3);
    }

    protected abstract List<String[]> w();

    private static float a(String[] stringArray) {
        block2: {
            float f2 = 0.0f;
            try {
                if (stringArray[0] == null || stringArray[0].isEmpty()) break block2;
            }
            catch (MatchException matchException) {
                throw k.c(matchException);
            }
            f2 += (float)(pulsescanner.g.e.a(stringArray[0]) + 4);
        }
        return f2 += (float)pulsescanner.g.e.a(stringArray[1]);
    }

    @Override
    public void r() {
        block4: {
            this.E = this.w();
            i[] iArray = pulsescanner.f.h.b();
            float f2 = 0.0f;
            for (String[] stringArray : this.E) {
                f2 = Math.max(f2, k.a(stringArray));
                try {
                    if (iArray == null) {
                        if (iArray == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw k.c(matchException);
                }
            }
            this.A = f2 + 12.0f;
        }
        int n2 = Math.max(1, this.E.size());
        this.B = 8.0f + (float)(n2 * pulsescanner.g.e.e()) + (float)(n2 - 1) * 3.0f;
    }

    @Override
    public void b(class_332 class_3322, float f2) {
        i[] iArray = pulsescanner.f.h.b();
        pulsescanner.d.c.a(class_3322, this.y, this.z, this.A, this.B);
        float f3 = this.z + 4.0f;
        boolean bl = this.v();
        i[] iArray2 = iArray;
        for (String[] stringArray : this.E) {
            block7: {
                float f4;
                block8: {
                    float f5;
                    try {
                        f5 = bl ? this.y + this.A - 6.0f - k.a(stringArray) : this.y + 6.0f;
                    }
                    catch (MatchException matchException) {
                        throw k.c(matchException);
                    }
                    f4 = f5;
                    try {
                        try {
                            if (iArray2 != null) break block7;
                            if (stringArray[0] == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw k.c(matchException);
                        }
                        if (stringArray[0].isEmpty()) break block8;
                    }
                    catch (MatchException matchException) {
                        throw k.c(matchException);
                    }
                    pulsescanner.d.c.a(class_3322, stringArray[0], f4, f3, pulsescanner.d.c.c());
                    f4 += (float)(pulsescanner.g.e.a(stringArray[0]) + 4);
                }
                pulsescanner.d.c.a(class_3322, stringArray[1], f4, f3, pulsescanner.d.c.d());
                f3 += (float)pulsescanner.g.e.e() + 3.0f;
            }
            if (iArray2 == null) continue;
        }
    }

    private static MatchException c(MatchException matchException) {
        return matchException;
    }
}

