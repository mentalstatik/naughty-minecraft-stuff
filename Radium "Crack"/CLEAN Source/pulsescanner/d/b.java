/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 */
package pulsescanner.d;

import net.minecraft.class_310;
import net.minecraft.class_332;
import pulsescanner.c.f;
import pulsescanner.d.d;
import pulsescanner.f.f.q;
import pulsescanner.f.f.t;
import pulsescanner.f.i;
import pulsescanner.f.j;
import pulsescanner.f.l;
import pulsescanner.f.m;

public final class b {
    private b() {
    }

    public static void a(class_332 class_3322, float f2) {
        block49: {
            block50: {
                boolean bl;
                i[] iArray;
                int n2;
                int n3;
                block48: {
                    block47: {
                        class_310 class_3102;
                        block46: {
                            class_310 class_3103;
                            block44: {
                                block45: {
                                    block43: {
                                        q q2;
                                        block42: {
                                            i i2;
                                            block40: {
                                                block41: {
                                                    i i3;
                                                    block38: {
                                                        block39: {
                                                            class_3103 = class_310.method_1551();
                                                            n3 = class_3322.method_51421();
                                                            n2 = class_3322.method_51443();
                                                            t t2 = m.a(t.class);
                                                            iArray = d.b();
                                                            try {
                                                                try {
                                                                    i3 = t2;
                                                                    if (iArray == null) break block38;
                                                                    if (!i3.b()) break block39;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b.a(matchException);
                                                                }
                                                                t2.a(class_3322);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b.a(matchException);
                                                            }
                                                        }
                                                        i3 = m.a(pulsescanner.f.g.d.class);
                                                    }
                                                    pulsescanner.f.g.d d2 = (pulsescanner.f.g.d)i3;
                                                    try {
                                                        try {
                                                            i2 = d2;
                                                            if (iArray == null) break block40;
                                                            if (!i2.b()) break block41;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b.a(matchException);
                                                        }
                                                        d2.a(class_3322);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b.a(matchException);
                                                    }
                                                }
                                                i2 = m.a(q.class);
                                            }
                                            q q3 = (q)i2;
                                            try {
                                                try {
                                                    q2 = q3;
                                                    if (iArray == null) break block42;
                                                    if (!q2.b()) break block43;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b.a(matchException);
                                                }
                                                q2 = q3;
                                            }
                                            catch (MatchException matchException) {
                                                throw b.a(matchException);
                                            }
                                        }
                                        q2.b(class_3322, f2);
                                    }
                                    try {
                                        try {
                                            class_3102 = class_3103;
                                            if (iArray == null) break block44;
                                            if (class_3102.field_1724 == null) break block45;
                                        }
                                        catch (MatchException matchException) {
                                            throw b.a(matchException);
                                        }
                                        l.a(class_3322, f2);
                                    }
                                    catch (MatchException matchException) {
                                        throw b.a(matchException);
                                    }
                                }
                                class_3102 = class_3103;
                            }
                            try {
                                try {
                                    if (iArray == null) break block46;
                                    if (!class_3102.method_53526().method_53536()) break block47;
                                }
                                catch (MatchException matchException) {
                                    throw b.a(matchException);
                                }
                                class_3102 = class_3103;
                            }
                            catch (MatchException matchException) {
                                throw b.a(matchException);
                            }
                        }
                        try {
                            bl = class_3102.field_1755 instanceof f;
                            if (iArray == null) break block48;
                            if (bl) break block47;
                        }
                        catch (MatchException matchException) {
                            throw b.a(matchException);
                        }
                        bl = true;
                        break block48;
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    if (iArray == null) break block49;
                    if (bl2) break block50;
                }
                catch (MatchException matchException) {
                    throw b.a(matchException);
                }
                for (j j2 : m.c()) {
                    block55: {
                        block54: {
                            block53: {
                                block51: {
                                    try {
                                        try {
                                            try {
                                                if (iArray == null) break block49;
                                                if (iArray == null) break block51;
                                            }
                                            catch (MatchException matchException) {
                                                throw b.a(matchException);
                                            }
                                            if (!j2.b()) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw b.a(matchException);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw b.a(matchException);
                                    }
                                    j2.a(n3, n2);
                                }
                                float f3 = j2.s();
                                try {
                                    try {
                                        if (iArray == null) break block53;
                                        if (f3 == 1.0f) break block54;
                                    }
                                    catch (MatchException matchException) {
                                        throw b.a(matchException);
                                    }
                                    class_3322.method_51448().pushMatrix();
                                    class_3322.method_51448().translate(j2.y, j2.z);
                                    class_3322.method_51448().scale(f3, f3);
                                    class_3322.method_51448().translate(-j2.y, -j2.z);
                                    j2.b(class_3322, f2);
                                    class_3322.method_51448().popMatrix();
                                }
                                catch (MatchException matchException) {
                                    throw b.a(matchException);
                                }
                            }
                            try {
                                if (iArray != null) break block55;
                                i.b(new int[3]);
                            }
                            catch (MatchException matchException) {
                                throw b.a(matchException);
                            }
                        }
                        j2.b(class_3322, f2);
                    }
                    if (iArray != null) continue;
                }
            }
            d.a(class_3322);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

