/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package pulsescanner.f.f;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_310;
import net.minecraft.class_746;
import pulsescanner.f.f.q;
import pulsescanner.f.h;
import pulsescanner.f.i;
import pulsescanner.i.c;
import pulsescanner.i.g;

public class k
extends i {
    public final g l;
    public final g m;
    public final c n;
    private static final String[] o;

    public k() {
        String[] stringArray = o;
        super(stringArray[0], stringArray[4], pulsescanner.f.h.RENDER);
        this.l = this.a(new g(stringArray[7], stringArray[2], 1.0, 0.0, 10.0, 1.0));
        this.m = this.a(new g(stringArray[3], stringArray[1], 1.0, 0.0, 10.0, 1.0));
        this.n = this.a(new c(stringArray[6], stringArray[5], true));
    }

    @Override
    public void a(class_1297 class_12972) {
        block42: {
            int n2;
            i[] iArray;
            block41: {
                int n3;
                block38: {
                    Object object;
                    block40: {
                        block39: {
                            block36: {
                                int n4;
                                block37: {
                                    int n5;
                                    block35: {
                                        block33: {
                                            class_746 class_7462;
                                            block34: {
                                                class_310 class_3102;
                                                block32: {
                                                    block30: {
                                                        block31: {
                                                            iArray = q.r();
                                                            try {
                                                                block29: {
                                                                    try {
                                                                        try {
                                                                            if (!(class_12972 instanceof class_1309)) break block29;
                                                                            class_3102 = a;
                                                                            if (iArray != null) break block30;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw k.a(matchException);
                                                                        }
                                                                        if (class_3102.field_1713 != null) break block31;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw k.a(matchException);
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw k.a(matchException);
                                                            }
                                                        }
                                                        class_3102 = a;
                                                    }
                                                    try {
                                                        try {
                                                            if (iArray != null) break block32;
                                                            if (class_3102.field_1724 == null) break block33;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw k.a(matchException);
                                                        }
                                                        class_3102 = a;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw k.a(matchException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        class_7462 = class_3102.field_1724;
                                                        if (iArray != null) break block34;
                                                        if (!(class_7462.field_6017 > 0.0)) break block33;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw k.a(matchException);
                                                    }
                                                    class_7462 = k.a.field_1724;
                                                }
                                                catch (MatchException matchException) {
                                                    throw k.a(matchException);
                                                }
                                            }
                                            try {
                                                n5 = class_7462.method_24828();
                                                if (iArray != null) break block35;
                                                if (n5 != 0) break block33;
                                            }
                                            catch (MatchException matchException) {
                                                throw k.a(matchException);
                                            }
                                            n5 = 1;
                                            break block35;
                                        }
                                        n5 = 0;
                                    }
                                    int n6 = n5;
                                    try {
                                        try {
                                            try {
                                                n4 = ((Boolean)this.n.a()).booleanValue();
                                                if (iArray != null) break block36;
                                                if (n4 != 0) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw k.a(matchException);
                                            }
                                            n3 = n6;
                                            if (iArray != null) break block38;
                                        }
                                        catch (MatchException matchException) {
                                            throw k.a(matchException);
                                        }
                                        if (n3 == 0) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw k.a(matchException);
                                    }
                                }
                                n4 = n2 = 0;
                            }
                            while (n2 < this.l.h()) {
                                try {
                                    object = a;
                                    if (iArray == null) {
                                        object.field_1713.method_3061(class_12972, (class_2394)class_2398.field_11205);
                                        ++n2;
                                        if (iArray == null) continue;
                                        break;
                                    }
                                    break block40;
                                }
                                catch (MatchException matchException) {
                                    throw k.a(matchException);
                                }
                            }
                        }
                        object = this.n.a();
                    }
                    n3 = ((Boolean)object).booleanValue() ? 1 : 0;
                }
                try {
                    if (iArray != null) break block41;
                    if (n3 == 0) break block42;
                }
                catch (MatchException matchException) {
                    throw k.a(matchException);
                }
                n3 = n2 = 0;
            }
            while (n2 < this.m.h()) {
                k.a.field_1713.method_3061(class_12972, (class_2394)class_2398.field_11208);
                ++n2;
                if (iArray == null) continue;
            }
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "\u000fd\u000fwS\u0012C:v,\u001a}\tq[QJ1f\u0015bT\u0005J;(\u0015jNQ_>w\tjY\u001dJ\u007fg\bqI\u0005\\\u007fu\u0018q\u001a\u0019F+++\u001a}\tq[QL-l\tjY\u0010Crm\u0014w\u001a\u0001N-q\u0014`V\u0014\u000f=p\u000fpN\u0002\u000f/`\u000f#R\u0018[q\u0010\fm\u001cqJQb*i\tjJ\u001dF:w#\u0012j\u000ff\u001a\u0019F+%\rbH\u0005F<i\u0018p\u001a\u0006G:k]zU\u0004\u000f>q\tbY\u001a\u00010\fu\u001ctTQ_>w\tjY\u001dJ,%\u0018u_\u001f\u000f(l\tkU\u0004[\u007ff\u000fjN\u0002\u0000:k\u001ek[\u001f[2`\u0013wI_";
                var4_3 = "\u000fd\u000fwS\u0012C:v,\u001a}\tq[QJ1f\u0015bT\u0005J;(\u0015jNQ_>w\tjY\u001dJ\u007fg\bqI\u0005\\\u007fu\u0018q\u001a\u0019F+++\u001a}\tq[QL-l\tjY\u0010Crm\u0014w\u001a\u0001N-q\u0014`V\u0014\u000f=p\u000fpN\u0002\u000f/`\u000f#R\u0018[q\u0010\fm\u001cqJQb*i\tjJ\u001dF:w#\u0012j\u000ff\u001a\u0019F+%\rbH\u0005F<i\u0018p\u001a\u0006G:k]zU\u0004\u000f>q\tbY\u001a\u00010\fu\u001ctTQ_>w\tjY\u001dJ,%\u0018u_\u001f\u000f(l\tkU\u0004[\u007ff\u000fjN\u0002\u0000:k\u001ek[\u001f[2`\u0013wI_".length();
                var1_4 = 9;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 108;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u000bb\t`R@v'`\u000f\rf\u0005f\u000b-K\"`\u0005bG\t[<";
                    var4_3 = "\u000bb\t`R@v'`\u000f\rf\u0005f\u000b-K\"`\u0005bG\t[<".length();
                    var1_4 = 9;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 125;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block19;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v0;
            v8 = v6;
            v9 = v6.length;
            var6_6 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_6;
                switch (var6_6 % 7) {
                    case 0: {
                        v11 = 51;
                        break;
                    }
                    case 1: {
                        v11 = 105;
                        break;
                    }
                    case 2: {
                        v11 = 17;
                        break;
                    }
                    case 3: {
                        v11 = 111;
                        break;
                    }
                    case 4: {
                        v11 = 86;
                        break;
                    }
                    case 5: {
                        v11 = 29;
                        break;
                    }
                    default: {
                        v11 = 67;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl71:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl79:
                // 1 sources

                ** continue;
            }
        }
        k.o = var5;
    }
}

