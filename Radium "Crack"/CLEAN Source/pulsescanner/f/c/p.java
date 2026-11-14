/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3489
 *  net.minecraft.class_3675
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3966
 *  org.lwjgl.glfw.GLFW
 */
package pulsescanner.f.c;

import net.minecraft.class_1041;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3489;
import net.minecraft.class_3675;
import net.minecraft.class_3959;
import net.minecraft.class_3966;
import org.lwjgl.glfw.GLFW;
import pulsescanner.a.as;
import pulsescanner.a.at;
import pulsescanner.a.av;
import pulsescanner.a.aw;
import pulsescanner.a.ax;
import pulsescanner.a.j;
import pulsescanner.a.k;
import pulsescanner.a.v;
import pulsescanner.a.w;
import pulsescanner.a.y;
import pulsescanner.a.z;
import pulsescanner.f.c.c;
import pulsescanner.f.c.n;
import pulsescanner.f.c.q;
import pulsescanner.f.c.t;

public class p
extends as {
    private boolean m;
    private int n;
    private int o;
    public final av p;
    private long q;
    public final at r;
    public final ax s;
    private static p t;
    private class_1657 u;
    public final aw v;
    private long w;
    private static final String[] x;

    private boolean a(class_1657 class_16572) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!this.b(class_16572) || !class_16572.method_6039()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.p.a(matchException);
                        }
                        if (!class_16572.method_6030().method_31574(class_1802.field_8255)) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.p.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean s() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (t == null || !t.b()) break block6;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.p.a(matchException);
                        }
                        if (pulsescanner.f.c.p.t.n == -1) break block6;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                    bl = true;
                    break block7;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.p.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private int t() {
        int n2 = pulsescanner.f.c.p.a.field_1724.method_31548().method_67532();
        try {
            if (pulsescanner.f.c.p.a.field_1724.method_31548().method_5438(n2).method_31573(class_3489.field_42612)) {
                return n2;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.f.c.p.a(matchException);
        }
        int n3 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n3 >= 9) break;
                        if (!pulsescanner.f.c.p.a.field_1724.method_31548().method_5438(n3).method_31573(class_3489.field_42612)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                    return n3;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.p.a(matchException);
                }
            }
            ++n3;
        }
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @y
    public void a(v var1_1) {
        block198: {
            block165: {
                block194: {
                    block193: {
                        block242: {
                            block241: {
                                block186: {
                                    block187: {
                                        block192: {
                                            block191: {
                                                block239: {
                                                    block190: {
                                                        block185: {
                                                            block184: {
                                                                block181: {
                                                                    block182: {
                                                                        block232: {
                                                                            block183: {
                                                                                block167: {
                                                                                    block179: {
                                                                                        block180: {
                                                                                            block177: {
                                                                                                block178: {
                                                                                                    block176: {
                                                                                                        block175: {
                                                                                                            block226: {
                                                                                                                block171: {
                                                                                                                    block174: {
                                                                                                                        block173: {
                                                                                                                            block172: {
                                                                                                                                block170: {
                                                                                                                                    block163: {
                                                                                                                                        block223: {
                                                                                                                                            block169: {
                                                                                                                                                block168: {
                                                                                                                                                    block221: {
                                                                                                                                                        block220: {
                                                                                                                                                            block219: {
                                                                                                                                                                block161: {
                                                                                                                                                                    block217: {
                                                                                                                                                                        block166: {
                                                                                                                                                                            block164: {
                                                                                                                                                                                block215: {
                                                                                                                                                                                    block214: {
                                                                                                                                                                                        block213: {
                                                                                                                                                                                            block162: {
                                                                                                                                                                                                block210: {
                                                                                                                                                                                                    block211: {
                                                                                                                                                                                                        block209: {
                                                                                                                                                                                                            block208: {
                                                                                                                                                                                                                block207: {
                                                                                                                                                                                                                    block206: {
                                                                                                                                                                                                                        block205: {
                                                                                                                                                                                                                            block204: {
                                                                                                                                                                                                                                block203: {
                                                                                                                                                                                                                                    block202: {
                                                                                                                                                                                                                                        block160: {
                                                                                                                                                                                                                                            block159: {
                                                                                                                                                                                                                                                block158: {
                                                                                                                                                                                                                                                    var2_2 = pulsescanner.f.c.t.y();
                                                                                                                                                                                                                                                    v0 = pulsescanner.f.c.p.a;
                                                                                                                                                                                                                                                    if (var2_2 != null) break block158;
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        block199: {
                                                                                                                                                                                                                                                            if (v0.field_1724 == null) ** GOTO lbl553
                                                                                                                                                                                                                                                            break block199;
                                                                                                                                                                                                                                                            catch (MatchException v1) {
                                                                                                                                                                                                                                                                throw pulsescanner.f.c.p.a(v1);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v0 = pulsescanner.f.c.p.a;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (MatchException v2) {
                                                                                                                                                                                                                                                        throw pulsescanner.f.c.p.a(v2);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (var2_2 != null) break block159;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    block200: {
                                                                                                                                                                                                                                                        if (v0.field_1687 == null) ** GOTO lbl553
                                                                                                                                                                                                                                                        break block200;
                                                                                                                                                                                                                                                        catch (MatchException v3) {
                                                                                                                                                                                                                                                            throw pulsescanner.f.c.p.a(v3);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    v0 = pulsescanner.f.c.p.a;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (MatchException v4) {
                                                                                                                                                                                                                                                    throw pulsescanner.f.c.p.a(v4);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (v0.field_1761 == null) ** GOTO lbl553
                                                                                                                                                                                                                                            var3_3 = System.currentTimeMillis();
                                                                                                                                                                                                                                            v5 = pulsescanner.f.c.p.a;
                                                                                                                                                                                                                                            if (var2_2 != null) break block160;
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                block201: {
                                                                                                                                                                                                                                                    if (v5.field_1755 != null) ** GOTO lbl177
                                                                                                                                                                                                                                                    break block201;
                                                                                                                                                                                                                                                    catch (MatchException v6) {
                                                                                                                                                                                                                                                        throw pulsescanner.f.c.p.a(v6);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v5 = pulsescanner.f.c.p.a;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (MatchException v7) {
                                                                                                                                                                                                                                                throw pulsescanner.f.c.p.a(v7);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        v8 = v5.field_1724.method_5805();
                                                                                                                                                                                                                                        if (var2_2 != null) break block161;
                                                                                                                                                                                                                                        if (v8 == 0) ** GOTO lbl177
                                                                                                                                                                                                                                        break block202;
                                                                                                                                                                                                                                        catch (MatchException v9) {
                                                                                                                                                                                                                                            throw pulsescanner.f.c.p.a(v9);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v8 = pulsescanner.f.c.p.a.field_1724.method_7325();
                                                                                                                                                                                                                                    if (var2_2 != null) break block161;
                                                                                                                                                                                                                                    break block203;
                                                                                                                                                                                                                                    catch (MatchException v10) {
                                                                                                                                                                                                                                        throw pulsescanner.f.c.p.a(v10);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (v8 != 0) ** GOTO lbl177
                                                                                                                                                                                                                                break block204;
                                                                                                                                                                                                                                catch (MatchException v11) {
                                                                                                                                                                                                                                    throw pulsescanner.f.c.p.a(v11);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v8 = pulsescanner.f.c.p.a.field_1724.method_6115();
                                                                                                                                                                                                                            if (var2_2 != null) break block161;
                                                                                                                                                                                                                            break block205;
                                                                                                                                                                                                                            catch (MatchException v12) {
                                                                                                                                                                                                                                throw pulsescanner.f.c.p.a(v12);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (v8 != 0) ** GOTO lbl177
                                                                                                                                                                                                                        break block206;
                                                                                                                                                                                                                        catch (MatchException v13) {
                                                                                                                                                                                                                            throw pulsescanner.f.c.p.a(v13);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v8 = (int)pulsescanner.f.c.t.s();
                                                                                                                                                                                                                    if (var2_2 != null) break block161;
                                                                                                                                                                                                                    break block207;
                                                                                                                                                                                                                    catch (MatchException v14) {
                                                                                                                                                                                                                        throw pulsescanner.f.c.p.a(v14);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (v8 != 0) ** GOTO lbl177
                                                                                                                                                                                                                break block208;
                                                                                                                                                                                                                catch (MatchException v15) {
                                                                                                                                                                                                                    throw pulsescanner.f.c.p.a(v15);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v16 = this.v.c(pulsescanner.f.c.p.x[6]);
                                                                                                                                                                                                            if (var2_2 != null) break block162;
                                                                                                                                                                                                            break block209;
                                                                                                                                                                                                            catch (MatchException v17) {
                                                                                                                                                                                                                throw pulsescanner.f.c.p.a(v17);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (v16) break block210;
                                                                                                                                                                                                        break block211;
                                                                                                                                                                                                        catch (MatchException v18) {
                                                                                                                                                                                                            throw pulsescanner.f.c.p.a(v18);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        block212: {
                                                                                                                                                                                                            v8 = (int)this.v();
                                                                                                                                                                                                            if (var2_2 != null) break block161;
                                                                                                                                                                                                            break block212;
                                                                                                                                                                                                            catch (MatchException v19) {
                                                                                                                                                                                                                throw pulsescanner.f.c.p.a(v19);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (v8 != 0) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                        ** GOTO lbl177
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v20) {
                                                                                                                                                                                                        throw pulsescanner.f.c.p.a(v20);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                v16 = true;
                                                                                                                                                                                            }
                                                                                                                                                                                            var5_4 = (int)v16;
                                                                                                                                                                                            v21 = this.n;
                                                                                                                                                                                            if (var2_2 != null) break block163;
                                                                                                                                                                                            if (v21 == -1) ** GOTO lbl239
                                                                                                                                                                                            break block213;
                                                                                                                                                                                            catch (MatchException v22) {
                                                                                                                                                                                                throw pulsescanner.f.c.p.a(v22);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        v23 = var5_4;
                                                                                                                                                                                        if (var2_2 != null) break block164;
                                                                                                                                                                                        break block214;
                                                                                                                                                                                        catch (MatchException v24) {
                                                                                                                                                                                            throw pulsescanner.f.c.p.a(v24);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v23 == 0) break block165;
                                                                                                                                                                                    break block215;
                                                                                                                                                                                    catch (MatchException v25) {
                                                                                                                                                                                        throw pulsescanner.f.c.p.a(v25);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                try {
                                                                                                                                                                                    block216: {
                                                                                                                                                                                        v26 = pulsescanner.f.c.p.a;
                                                                                                                                                                                        if (var2_2 != null) break block166;
                                                                                                                                                                                        break block216;
                                                                                                                                                                                        catch (MatchException v27) {
                                                                                                                                                                                            throw pulsescanner.f.c.p.a(v27);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v23 = v26.field_1724.method_31548().method_67532();
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v28) {
                                                                                                                                                                                    throw pulsescanner.f.c.p.a(v28);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                if (v23 != this.o) break block165;
                                                                                                                                                                                v26 = pulsescanner.f.c.p.a;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v29) {
                                                                                                                                                                                throw pulsescanner.f.c.p.a(v29);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v30 = v26.field_1724.method_6047().method_31573(class_3489.field_42612);
                                                                                                                                                                        if (var2_2 != null) break block167;
                                                                                                                                                                        if (v30) ** GOTO lbl355
                                                                                                                                                                        break block217;
                                                                                                                                                                        catch (MatchException v31) {
                                                                                                                                                                            throw pulsescanner.f.c.p.a(v31);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        block218: {
                                                                                                                                                                            if (var2_2 == null) break block165;
                                                                                                                                                                            break block218;
                                                                                                                                                                            catch (MatchException v32) {
                                                                                                                                                                                throw pulsescanner.f.c.p.a(v32);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v8 = 0;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v33) {
                                                                                                                                                                        throw pulsescanner.f.c.p.a(v33);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var5_4 = v8;
                                                                                                                                                                v21 = this.n;
                                                                                                                                                                if (var2_2 != null) break block163;
                                                                                                                                                                if (v21 == -1) ** GOTO lbl239
                                                                                                                                                                break block219;
                                                                                                                                                                catch (MatchException v34) {
                                                                                                                                                                    throw pulsescanner.f.c.p.a(v34);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v35 = var5_4;
                                                                                                                                                            if (var2_2 != null) break block168;
                                                                                                                                                            break block220;
                                                                                                                                                            catch (MatchException v36) {
                                                                                                                                                                throw pulsescanner.f.c.p.a(v36);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (v35 == 0) break block165;
                                                                                                                                                        break block221;
                                                                                                                                                        catch (MatchException v37) {
                                                                                                                                                            throw pulsescanner.f.c.p.a(v37);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        block222: {
                                                                                                                                                            v38 = pulsescanner.f.c.p.a.field_1724;
                                                                                                                                                            if (var2_2 != null) break block169;
                                                                                                                                                            break block222;
                                                                                                                                                            catch (MatchException v39) {
                                                                                                                                                                throw pulsescanner.f.c.p.a(v39);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v35 = v38.method_31548().method_67532();
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v40) {
                                                                                                                                                        throw pulsescanner.f.c.p.a(v40);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (v35 != this.o) break block165;
                                                                                                                                                    v38 = pulsescanner.f.c.p.a.field_1724;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v41) {
                                                                                                                                                    throw pulsescanner.f.c.p.a(v41);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v30 = v38.method_6047().method_31573(class_3489.field_42612);
                                                                                                                                            if (var2_2 != null) break block167;
                                                                                                                                            if (v30) ** GOTO lbl355
                                                                                                                                            break block223;
                                                                                                                                            catch (MatchException v42) {
                                                                                                                                                throw pulsescanner.f.c.p.a(v42);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            block224: {
                                                                                                                                                if (var2_2 == null) break block165;
                                                                                                                                                break block224;
                                                                                                                                                catch (MatchException v43) {
                                                                                                                                                    throw pulsescanner.f.c.p.a(v43);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v21 = var5_4;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v44) {
                                                                                                                                            throw pulsescanner.f.c.p.a(v44);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var2_2 != null) break block170;
                                                                                                                                    try {
                                                                                                                                        block225: {
                                                                                                                                            if (v21 == 0) break block171;
                                                                                                                                            break block225;
                                                                                                                                            catch (MatchException v45) {
                                                                                                                                                throw pulsescanner.f.c.p.a(v45);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        cfr_temp_0 = var3_3 - this.q;
                                                                                                                                        v21 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                                                    }
                                                                                                                                    catch (MatchException v46) {
                                                                                                                                        throw pulsescanner.f.c.p.a(v46);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var2_2 != null) break block172;
                                                                                                                                    if (v21 < 0) break block171;
                                                                                                                                }
                                                                                                                                catch (MatchException v47) {
                                                                                                                                    throw pulsescanner.f.c.p.a(v47);
                                                                                                                                }
                                                                                                                                v21 = (int)pulsescanner.f.c.n.w();
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (var2_2 != null) break block173;
                                                                                                                                if (v21 != 0) break block171;
                                                                                                                            }
                                                                                                                            catch (MatchException v48) {
                                                                                                                                throw pulsescanner.f.c.p.a(v48);
                                                                                                                            }
                                                                                                                            v21 = (int)pulsescanner.f.c.q.s();
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (var2_2 != null) break block174;
                                                                                                                            if (v21 != 0) break block171;
                                                                                                                        }
                                                                                                                        catch (MatchException v49) {
                                                                                                                            throw pulsescanner.f.c.p.a(v49);
                                                                                                                        }
                                                                                                                        v21 = (int)pulsescanner.f.c.c.w();
                                                                                                                    }
                                                                                                                    if (v21 == 0) break block226;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            var8_5 = pulsescanner.f.c.p.a.field_1765;
                                                                                                            v50 = var8_5;
                                                                                                            if (var2_2 != null) break block175;
                                                                                                            try {
                                                                                                                block227: {
                                                                                                                    if (!(v50 instanceof class_3966)) ** GOTO lbl327
                                                                                                                    break block227;
                                                                                                                    catch (MatchException v51) {
                                                                                                                        throw pulsescanner.f.c.p.a(v51);
                                                                                                                    }
                                                                                                                }
                                                                                                                v50 = var8_5;
                                                                                                            }
                                                                                                            catch (MatchException v52) {
                                                                                                                throw pulsescanner.f.c.p.a(v52);
                                                                                                            }
                                                                                                        }
                                                                                                        var6_7 = (class_3966)v50;
                                                                                                        var8_5 = var6_7.method_17782();
                                                                                                        v53 = var8_5;
                                                                                                        if (var2_2 != null) break block176;
                                                                                                        try {
                                                                                                            block228: {
                                                                                                                if (!(v53 instanceof class_1657)) ** GOTO lbl327
                                                                                                                break block228;
                                                                                                                catch (MatchException v54) {
                                                                                                                    throw pulsescanner.f.c.p.a(v54);
                                                                                                                }
                                                                                                            }
                                                                                                            v53 = var8_5;
                                                                                                        }
                                                                                                        catch (MatchException v55) {
                                                                                                            throw pulsescanner.f.c.p.a(v55);
                                                                                                        }
                                                                                                    }
                                                                                                    var7_8 = (class_1657)v53;
                                                                                                    v56 = this;
                                                                                                    if (var2_2 != null) break block177;
                                                                                                    try {
                                                                                                        block229: {
                                                                                                            if (v56.a(var7_8)) break block178;
                                                                                                            break block229;
                                                                                                            catch (MatchException v57) {
                                                                                                                throw pulsescanner.f.c.p.a(v57);
                                                                                                            }
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (MatchException v58) {
                                                                                                        throw pulsescanner.f.c.p.a(v58);
                                                                                                    }
                                                                                                }
                                                                                                v56 = this;
                                                                                            }
                                                                                            var8_6 = v56.t();
                                                                                            if (var2_2 != null) break block179;
                                                                                            try {
                                                                                                block230: {
                                                                                                    if (var8_6 != -1) break block180;
                                                                                                    break block230;
                                                                                                    catch (MatchException v59) {
                                                                                                        throw pulsescanner.f.c.p.a(v59);
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            catch (MatchException v60) {
                                                                                                throw pulsescanner.f.c.p.a(v60);
                                                                                            }
                                                                                        }
                                                                                        this.u = var7_8;
                                                                                        this.n = pulsescanner.f.c.p.a.field_1724.method_31548().method_67532();
                                                                                        this.o = var8_6;
                                                                                        pulsescanner.a.j.a(var8_6);
                                                                                        this.w = var3_3 + (long)Math.round(this.s.g());
                                                                                    }
                                                                                    if (var2_2 == null) break block181;
lbl355:
                                                                                    // 3 sources

                                                                                    try {
                                                                                        block231: {
                                                                                            v61 = this;
                                                                                            if (var2_2 != null) break block182;
                                                                                            break block231;
                                                                                            catch (MatchException v62) {
                                                                                                throw pulsescanner.f.c.p.a(v62);
                                                                                            }
                                                                                        }
                                                                                        v30 = v61.m;
                                                                                    }
                                                                                    catch (MatchException v63) {
                                                                                        throw pulsescanner.f.c.p.a(v63);
                                                                                    }
                                                                                }
                                                                                if (!v30) break block232;
                                                                                try {
                                                                                    block233: {
                                                                                        if (var3_3 < this.w) break block183;
                                                                                        break block233;
                                                                                        catch (MatchException v64) {
                                                                                            throw pulsescanner.f.c.p.a(v64);
                                                                                        }
                                                                                    }
                                                                                    this.w();
                                                                                }
                                                                                catch (MatchException v65) {
                                                                                    throw pulsescanner.f.c.p.a(v65);
                                                                                }
                                                                            }
                                                                            return;
                                                                        }
                                                                        v61 = this;
                                                                    }
                                                                    v66 = v61.a(this.u);
                                                                    if (var2_2 != null) break block184;
                                                                    try {
                                                                        block234: {
                                                                            if (v66 != 0) break block181;
                                                                            break block234;
                                                                            catch (MatchException v67) {
                                                                                throw pulsescanner.f.c.p.a(v67);
                                                                            }
                                                                        }
                                                                        this.w();
                                                                        return;
                                                                    }
                                                                    catch (MatchException v68) {
                                                                        throw pulsescanner.f.c.p.a(v68);
                                                                    }
                                                                }
                                                                v66 = (cfr_temp_1 = var3_3 - this.w) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                            }
                                                            try {
                                                                if (var2_2 == null) {
                                                                    if (v66 >= 0) break block185;
                                                                }
                                                                ** GOTO lbl418
                                                            }
                                                            catch (MatchException v69) {
                                                                throw pulsescanner.f.c.p.a(v69);
                                                            }
                                                            return;
                                                        }
                                                        try {
                                                            block188: {
                                                                block189: {
                                                                    block237: {
                                                                        block236: {
                                                                            block235: {
                                                                                try {
                                                                                    v70 = this;
                                                                                    if (var2_2 != null) break block186;
                                                                                    v66 = (int)v70.a(this.u);
                                                                                }
                                                                                catch (MatchException v71) {
                                                                                    throw pulsescanner.f.c.p.a(v71);
                                                                                }
lbl418:
                                                                                // 3 sources

                                                                                if (v66 == 0) break block187;
                                                                                pulsescanner.f.c.p.a.field_1761.method_2918((class_1657)pulsescanner.f.c.p.a.field_1724, (class_1297)this.u);
                                                                                pulsescanner.f.c.p.a.field_1724.method_6104(class_1268.field_5808);
                                                                                if (var2_2 != null) break block188;
                                                                                break block235;
                                                                                catch (MatchException v72) {
                                                                                    throw pulsescanner.f.c.p.a(v72);
                                                                                }
                                                                            }
                                                                            if (!this.r.i()) break block189;
                                                                            break block236;
                                                                            catch (MatchException v73) {
                                                                                throw pulsescanner.f.c.p.a(v73);
                                                                            }
                                                                        }
                                                                        v74 = this;
                                                                        if (var2_2 != null) break block190;
                                                                        break block237;
                                                                        catch (MatchException v75) {
                                                                            throw pulsescanner.f.c.p.a(v75);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block238: {
                                                                            if (!v74.b(this.u)) break block189;
                                                                            break block238;
                                                                            catch (MatchException v76) {
                                                                                throw pulsescanner.f.c.p.a(v76);
                                                                            }
                                                                        }
                                                                        pulsescanner.f.c.p.a.field_1761.method_2918((class_1657)pulsescanner.f.c.p.a.field_1724, (class_1297)this.u);
                                                                        pulsescanner.f.c.p.a.field_1724.method_6104(class_1268.field_5808);
                                                                    }
                                                                    catch (MatchException v77) {
                                                                        throw pulsescanner.f.c.p.a(v77);
                                                                    }
                                                                }
                                                                try {
                                                                    this.m = true;
                                                                    this.w = var3_3 + (long)Math.round(this.s.g());
                                                                    v78 = this;
                                                                    if (var2_2 != null) break block191;
                                                                    v78.q = var3_3 + Math.max(250L, (long)Math.round(this.s.g()));
                                                                }
                                                                catch (MatchException v79) {
                                                                    throw pulsescanner.f.c.p.a(v79);
                                                                }
                                                            }
                                                            v74 = this;
                                                        }
                                                        catch (Throwable var9_9) {
                                                            block197: {
                                                                block195: {
                                                                    try {
                                                                        block196: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v80 = this;
                                                                                        if (var2_2 != null) break block195;
                                                                                        if (!v80.m) break block196;
                                                                                    }
                                                                                    catch (MatchException v81) {
                                                                                        throw pulsescanner.f.c.p.a(v81);
                                                                                    }
                                                                                    v80 = this;
                                                                                    if (var2_2 != null) break block195;
                                                                                }
                                                                                catch (MatchException v82) {
                                                                                    throw pulsescanner.f.c.p.a(v82);
                                                                                }
                                                                                if (!(v80.s.g() <= 0.0f)) break block197;
                                                                            }
                                                                            catch (MatchException v83) {
                                                                                throw pulsescanner.f.c.p.a(v83);
                                                                            }
                                                                        }
                                                                        v80 = this;
                                                                    }
                                                                    catch (MatchException v84) {
                                                                        throw pulsescanner.f.c.p.a(v84);
                                                                    }
                                                                }
                                                                v80.w();
                                                            }
                                                            throw var9_9;
                                                        }
                                                    }
                                                    if (!v74.m) ** GOTO lbl507
                                                    v78 = this;
                                                    if (var2_2 != null) break block191;
                                                    break block239;
                                                    catch (MatchException v85) {
                                                        throw pulsescanner.f.c.p.a(v85);
                                                    }
                                                }
                                                try {
                                                    block240: {
                                                        if (!(v78.s.g() <= 0.0f)) break block192;
                                                        break block240;
                                                        catch (MatchException v86) {
                                                            throw pulsescanner.f.c.p.a(v86);
                                                        }
                                                    }
                                                    v78 = this;
                                                }
                                                catch (MatchException v87) {
                                                    throw pulsescanner.f.c.p.a(v87);
                                                }
                                            }
                                            v78.w();
                                        }
                                        return;
                                    }
                                    v70 = this;
                                }
                                if (var2_2 != null) break block193;
                                if (!v70.m) ** GOTO lbl539
                                break block241;
                                catch (MatchException v88) {
                                    throw pulsescanner.f.c.p.a(v88);
                                }
                            }
                            v70 = this;
                            if (var2_2 != null) break block193;
                            break block242;
                            catch (MatchException v89) {
                                throw pulsescanner.f.c.p.a(v89);
                            }
                        }
                        try {
                            block243: {
                                if (!(v70.s.g() <= 0.0f)) break block194;
                                break block243;
                                catch (MatchException v90) {
                                    throw pulsescanner.f.c.p.a(v90);
                                }
                            }
                            v70 = this;
                        }
                        catch (MatchException v91) {
                            throw pulsescanner.f.c.p.a(v91);
                        }
                    }
                    v70.w();
                }
                return;
            }
            try {
                this.w();
                if (var2_2 == null) break block198;
lbl553:
                // 4 sources

                this.u();
            }
            catch (MatchException v92) {
                throw pulsescanner.f.c.p.a(v92);
            }
        }
    }

    private void u() {
        this.u = null;
        this.n = -1;
        this.o = -1;
        this.m = false;
        this.w = 0L;
        this.q = 0L;
    }

    private boolean v() {
        boolean bl;
        block9: {
            int n2;
            block7: {
                block8: {
                    n2 = this.p.j();
                    try {
                        if (n2 < 0) {
                            return false;
                        }
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                    try {
                        try {
                            if (n2 > 7) break block7;
                            if (GLFW.glfwGetMouseButton((long)a.method_22683().method_4490(), (int)n2) != 1) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.p.a(matchException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                }
                bl = false;
                break block9;
            }
            bl = class_3675.method_15987((class_1041)a.method_22683(), (int)n2);
        }
        return bl;
    }

    private void w() {
        block8: {
            try {
                try {
                    try {
                        try {
                            if (pulsescanner.f.c.p.a.field_1724 == null || !pulsescanner.f.c.p.a.field_1724.method_5805()) break block8;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.p.a(matchException);
                        }
                        if (pulsescanner.f.c.p.a.field_1724.method_31548().method_67532() != this.o) break block8;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                    if (!pulsescanner.f.c.p.a.field_1724.method_6047().method_31573(class_3489.field_42612)) break block8;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.p.a(matchException);
                }
                pulsescanner.a.j.a(this.n);
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.p.a(matchException);
            }
        }
        this.u = null;
        this.n = -1;
        this.o = -1;
        this.m = false;
    }

    private boolean a(class_1657 class_16572, float f2, float f3) {
        boolean bl;
        block5: {
            class_243 class_2432;
            class_243 class_2433;
            block4: {
                class_2433 = pulsescanner.f.c.p.a.field_1724.method_33571();
                class_243 class_2434 = class_2433.method_1019(k.a(f3, f2).method_1021(pulsescanner.f.c.p.a.field_1724.method_55755()));
                class_2432 = class_16572.method_5829().method_992(class_2433, class_2434).orElse(null);
                try {
                    if (class_2432 != null) break block4;
                    bl = false;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.c.p.a(matchException);
                }
            }
            try {
                bl = pulsescanner.f.c.p.a.field_1687.method_17742(new class_3959(class_2433, class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)pulsescanner.f.c.p.a.field_1724)).method_17783() == class_239.class_240.field_1333;
            }
            catch (MatchException matchException) {
                throw pulsescanner.f.c.p.a(matchException);
            }
        }
        return bl;
    }

    public p() {
        String[] stringArray = x;
        super(stringArray[9], stringArray[2]);
        this.v = new aw(this, stringArray[0], new String[]{stringArray[1], stringArray[7]});
        this.p = (av)new av(this, stringArray[4], 71).a(this::lambda$new$0);
        this.s = new ax(this, stringArray[8], 0.0f, 0.0f, 500.0f, 1.0f);
        this.r = new at(this, stringArray[3], false);
        this.n = -1;
        this.o = -1;
        t = this;
    }

    @Override
    protected void p() {
        this.w();
        this.u();
    }

    @y
    public void a(w w2) {
        this.u();
    }

    private boolean b(class_1657 class_16572) {
        block23: {
            block24: {
                block25: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (class_16572 == null || class_16572 == pulsescanner.f.c.p.a.field_1724) break block23;
                                                }
                                                catch (MatchException matchException) {
                                                    throw pulsescanner.f.c.p.a(matchException);
                                                }
                                                if (!class_16572.method_5805()) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw pulsescanner.f.c.p.a(matchException);
                                            }
                                            if (class_16572.method_31481()) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw pulsescanner.f.c.p.a(matchException);
                                        }
                                        if (class_16572.method_7325()) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw pulsescanner.f.c.p.a(matchException);
                                    }
                                    if (class_16572.method_68878()) break block23;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.p.a(matchException);
                                }
                                if (class_16572.method_5655()) break block23;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.p.a(matchException);
                            }
                            if (pulsescanner.f.c.p.a.field_1687.method_8469(class_16572.method_5628()) != class_16572) break block24;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.p.a(matchException);
                        }
                        if (z.a(class_16572.method_5477().getString())) break block24;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.c.p.a(matchException);
                    }
                    class_239 class_2392 = pulsescanner.f.c.p.a.field_1765;
                    if (class_2392 instanceof class_3966) {
                        class_3966 class_39662 = (class_3966)class_2392;
                        try {
                            try {
                                try {
                                    if (class_39662.method_17782() != class_16572 || !this.a(class_16572, pulsescanner.f.c.p.a.field_1724.method_36454(), pulsescanner.f.c.p.a.field_1724.method_36455())) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw pulsescanner.f.c.p.a(matchException);
                                }
                                if (!this.a(class_16572, pulsescanner.f.c.p.a.field_1724.field_3941, pulsescanner.f.c.p.a.field_1724.field_3925)) break block25;
                            }
                            catch (MatchException matchException) {
                                throw pulsescanner.f.c.p.a(matchException);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw pulsescanner.f.c.p.a(matchException);
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private boolean lambda$new$0() {
        return this.v.c(x[5]);
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
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "W&Na\u0004[<^kFI>Ktf}uuiKj5<y\u007fi^k59hi(Hhp}ur,\nw}4dv-\nks}ur,\nty<x\u007f;\n}z(!{;O$t4ls'M$t)/\u000bI!Cay9!I=_j\u000e[*^mc<us&D$^8x\u0004X D`\u0004[<^k\u0004X D`";
                var4_3 = "W&Na\u0004[<^kFI>Ktf}uuiKj5<y\u007fi^k59hi(Hhp}ur,\nw}4dv-\nks}ur,\nty<x\u007f;\n}z(!{;O$t4ls'M$t)/\u000bI!Cay9!I=_j\u000e[*^mc<us&D$^8x\u0004X D`\u0004[<^k\u0004X D`".length();
                var1_4 = 4;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 13;
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
                    var2_2 = "O8Evp3'X*@cj\u000eO'Eg\u007f?'^=Icx>u";
                    var4_3 = "O8Evp3'X*@cj\u000eO'Eg\u007f?'^=Icx>u".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 11;
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
                        v11 = 23;
                        break;
                    }
                    case 1: {
                        v11 = 68;
                        break;
                    }
                    case 2: {
                        v11 = 39;
                        break;
                    }
                    case 3: {
                        v11 = 9;
                        break;
                    }
                    case 4: {
                        v11 = 24;
                        break;
                    }
                    case 5: {
                        v11 = 80;
                        break;
                    }
                    default: {
                        v11 = 12;
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
        pulsescanner.f.c.p.x = var5;
    }
}

