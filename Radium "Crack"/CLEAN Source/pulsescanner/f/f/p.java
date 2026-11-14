/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_742
 */
package pulsescanner.f.f;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_2338;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_742;
import pulsescanner.d.d;
import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;

public class p
extends i {
    private static final int l = 0xFF5A5A;
    private final Set<UUID> m;
    private static final String[] n;

    public p() {
        String[] stringArray = n;
        super(stringArray[1], stringArray[0], pulsescanner.f.h.ESP);
        this.m = new HashSet<UUID>();
    }

    @Override
    protected void g() {
        this.m.clear();
    }

    @Override
    protected void h() {
        this.m.clear();
    }

    @Override
    public void k() {
        this.m.clear();
    }

    @Override
    public void l() {
        this.m.clear();
    }

    @Override
    public void i() {
        block14: {
            i[] iArray = q.r();
            try {
                if (!this.m()) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw p.a(matchException);
            }
            HashSet<UUID> hashSet = new HashSet<UUID>();
            for (class_742 class_7422 : p.a.field_1687.method_18456()) {
                UUID uUID;
                block15: {
                    uUID = class_7422.method_5667();
                    try {
                        try {
                            try {
                                if (iArray != null) break block14;
                                if (iArray != null) break block15;
                            }
                            catch (MatchException matchException) {
                                throw p.a(matchException);
                            }
                            if (uUID.equals(p.a.field_1724.method_5667())) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw p.a(matchException);
                        }
                    }
                    catch (MatchException matchException) {
                        throw p.a(matchException);
                    }
                    hashSet.add(uUID);
                }
                if (!this.m.contains(uUID)) {
                    String string;
                    class_2338 class_23382 = class_7422.method_24515();
                    String string2 = class_7422.method_5477().getString();
                    try {
                        string = pulsescanner.d.d.a() ? string2 + n[2] + class_23382.method_10263() + " " + class_23382.method_10264() + " " + class_23382.method_10260() : string2;
                    }
                    catch (MatchException matchException) {
                        throw p.a(matchException);
                    }
                    String string3 = string;
                    pulsescanner.d.d.a(this, string3, 0xFF5A5A, 6.0f, (class_3414)class_3417.field_14725.comp_349());
                }
                if (iArray == null) continue;
            }
            this.m.retainAll(hashSet);
            this.m.addAll(hashSet);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "99M\u0007\u001cz1I7\u001d\u001aS{(\u000f?^\u0015Hf.\u0007vJ\u001cYaa\bvM\u0018]v$\u001bv^\u001bQj2I?S\u0000S/3\f8Y\u0011N/%\u0000%I\u0015Rl$G\f9:\\\rY}a(:X\u0006H\u0005Iv\u008aT\u001c";
            var4_3 = "99M\u0007\u001cz1I7\u001d\u001aS{(\u000f?^\u0015Hf.\u0007vJ\u001cYaa\bvM\u0018]v$\u001bv^\u001bQj2I?S\u0000S/3\f8Y\u0011N/%\u0000%I\u0015Rl$G\f9:\\\rY}a(:X\u0006H\u0005Iv\u008aT\u001c".length();
            var1_4 = 64;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = 107;
            v0 = v2;
            v4 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl53
            do {
                v3 = v3;
                v0 = v0;
                v5 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 2;
                        break;
                    }
                    case 1: {
                        v6 = 61;
                        break;
                    }
                    case 2: {
                        v6 = 86;
                        break;
                    }
                    case 3: {
                        v6 = 31;
                        break;
                    }
                    case 4: {
                        v6 = 87;
                        break;
                    }
                    case 5: {
                        v6 = 100;
                        break;
                    }
                    default: {
                        v6 = 42;
                    }
                }
                v0[v5] = (char)(v0[v5] ^ (v3 ^ v6));
                ++var6_6;
lbl53:
                // 2 sources

                v4 = v4;
            } while (v4 > var6_6);
            ** while (true)
        }
        p.n = var5;
    }
}

