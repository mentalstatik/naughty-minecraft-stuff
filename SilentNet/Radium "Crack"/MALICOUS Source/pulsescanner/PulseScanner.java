/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.minecraft.class_1157
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_634
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package pulsescanner;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.class_1157;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_634;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pulsescanner.c.e;
import pulsescanner.d.f;
import pulsescanner.f.f.q;
import pulsescanner.f.f.t;
import pulsescanner.f.f.u;
import pulsescanner.f.g.d;
import pulsescanner.f.i;
import pulsescanner.f.l;
import pulsescanner.f.m;
import pulsescanner.g.h;
import pulsescanner.g.k;
import pulsescanner.h.a;

public class PulseScanner
implements ClientModInitializer {
    public static final Logger LOG;
    private static boolean diagSkPresent;
    private static int[] b;
    private static final String[] a;

    public void onInitializeClient() {
        String string;
        Object[] objectArray;
        String string2;
        Logger logger;
        block3: {
            byte[] byArray;
            block2: {
                pulsescanner.license.d.k();
                byArray = pulsescanner.license.d.f();
                try {
                    pulsescanner.h.a.a = byArray;
                    logger = LOG;
                    string2 = a[1];
                    Object[] objectArray2 = new Object[3];
                    objectArray2[0] = pulsescanner.license.d.a();
                    objectArray2[1] = pulsescanner.license.d.b();
                    Object[] objectArray3 = objectArray2;
                    objectArray = objectArray2;
                    int n2 = 2;
                    if (byArray != null) break block2;
                    string = a[9];
                    break block3;
                }
                catch (MatchException matchException) {
                    throw PulseScanner.a(matchException);
                }
            }
            String[] stringArray = a;
            string = stringArray[8] + byArray.length + ")";
        }
        objectArray3[n2] = string;
        logger.info(string2, objectArray);
        m.a();
        e.a();
        pulsescanner.b.a.c();
        ClientTickEvents.END_CLIENT_TICK.register(PulseScanner::tick);
        WorldRenderEvents.END_MAIN.register(PulseScanner::lambda$onInitializeClient$0);
        ClientPlayConnectionEvents.JOIN.register(PulseScanner::lambda$onInitializeClient$1);
        ClientPlayConnectionEvents.DISCONNECT.register(PulseScanner::lambda$onInitializeClient$2);
        ClientLifecycleEvents.CLIENT_STOPPING.register(PulseScanner::lambda$onInitializeClient$3);
        LOG.info(a[7], (Object)m.b().size());
    }

    public static void enableSafely(i i2) {
        try {
            i2.a(true);
        }
        catch (Exception exception) {
            LOG.warn(a[2], (Object)i2.b, (Object)exception);
        }
    }

    /*
     * Loose catch block
     */
    private static void tick(class_310 class_3102) {
        block19: {
            block16: {
                String string;
                Object[] objectArray;
                String string2;
                Logger logger;
                block18: {
                    block17: {
                        boolean bl;
                        f.g();
                        pulsescanner.license.d.n();
                        byte[] byArray = pulsescanner.license.d.f();
                        try {
                            pulsescanner.h.a.a = byArray;
                            bl = byArray != null;
                        }
                        catch (Exception exception) {
                            throw PulseScanner.a(exception);
                        }
                        boolean bl2 = bl;
                        if (bl2 == diagSkPresent) break block16;
                        try {
                            block20: {
                                diagSkPresent = bl2;
                                logger = LOG;
                                string2 = a[0];
                                Object[] objectArray2 = new Object[3];
                                Object[] objectArray3 = objectArray2;
                                objectArray = objectArray2;
                                int n2 = 0;
                                if (!bl2) break block17;
                                break block20;
                                catch (Exception exception) {
                                    throw PulseScanner.a(exception);
                                }
                            }
                            string = a[4] + byArray.length + ")";
                            break block18;
                        }
                        catch (Exception exception) {
                            throw PulseScanner.a(exception);
                        }
                    }
                    String[] stringArray = a;
                    string = stringArray[6];
                }
                objectArray3[n2] = string;
                objectArray[1] = pulsescanner.license.d.a();
                objectArray[2] = pulsescanner.license.d.b();
                logger.info(string2, objectArray);
            }
            try {
                if (!pulsescanner.license.d.g()) {
                    return;
                }
            }
            catch (Exception exception) {
                throw PulseScanner.a(exception);
            }
            for (i i2 : m.b()) {
                try {
                    i2.j();
                    if (!i2.b()) continue;
                    i2.i();
                }
                catch (Exception exception) {
                    LOG.error(a[3], (Object)i2.b, (Object)exception);
                }
            }
            pulsescanner.f.b.f f2 = m.a(pulsescanner.f.b.f.class);
            try {
                try {
                    if (!((Boolean)f2.n.a()).booleanValue() || class_3102.field_1690.field_1875 == class_1157.field_5653) break block19;
                }
                catch (Exception exception) {
                    throw PulseScanner.a(exception);
                }
                class_3102.method_1577().method_4910(class_1157.field_5653);
            }
            catch (Exception exception) {
                throw PulseScanner.a(exception);
            }
        }
    }

    public static boolean onKey(int n2) {
        class_310 class_3102;
        block21: {
            class_3102 = class_310.method_1551();
            try {
                block20: {
                    try {
                        try {
                            if (n2 == -1 || class_3102.field_1755 != null) break block20;
                        }
                        catch (MatchException matchException) {
                            throw PulseScanner.a(matchException);
                        }
                        if (pulsescanner.license.d.g()) break block21;
                    }
                    catch (MatchException matchException) {
                        throw PulseScanner.a(matchException);
                    }
                }
                return false;
            }
            catch (MatchException matchException) {
                throw PulseScanner.a(matchException);
            }
        }
        pulsescanner.f.b.a a2 = m.a(pulsescanner.f.b.a.class);
        try {
            if (n2 == (Integer)a2.f.a()) {
                class_3102.method_1507((class_437)new e());
                return true;
            }
        }
        catch (MatchException matchException) {
            throw PulseScanner.a(matchException);
        }
        for (i i2 : m.b()) {
            block22: {
                try {
                    block23: {
                        try {
                            try {
                                try {
                                    if (!i2.a() || (Integer)i2.f.a() != n2) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw PulseScanner.a(matchException);
                                }
                                if (!i2.b()) break block23;
                            }
                            catch (MatchException matchException) {
                                throw PulseScanner.a(matchException);
                            }
                            if (i2.b(n2)) break block22;
                        }
                        catch (MatchException matchException) {
                            throw PulseScanner.a(matchException);
                        }
                    }
                    i2.e();
                }
                catch (MatchException matchException) {
                    throw PulseScanner.a(matchException);
                }
            }
            try {
                if (!i2.b()) continue;
                i2.a(n2);
            }
            catch (MatchException matchException) {
                throw PulseScanner.a(matchException);
            }
        }
        return false;
    }

    private static void lambda$onInitializeClient$3(class_310 class_3102) {
        pulsescanner.b.a.b();
    }

    private static void lambda$onInitializeClient$2(class_634 class_6342, class_310 class_3102) {
        l.b();
    }

    private static void lambda$onInitializeClient$1(class_634 class_6342, PacketSender packetSender, class_310 class_3102) {
        l.a();
    }

    private static void lambda$onInitializeClient$0(WorldRenderContext worldRenderContext) {
        block19: {
            block20: {
                i i2;
                boolean bl;
                int[] nArray;
                block18: {
                    boolean bl2;
                    t t2;
                    block16: {
                        block17: {
                            u u2;
                            block14: {
                                block15: {
                                    block13: {
                                        nArray = PulseScanner.b();
                                        try {
                                            try {
                                                if (class_310.method_1551().field_1724 != null && pulsescanner.license.d.y) break block13;
                                            }
                                            catch (MatchException matchException) {
                                                throw PulseScanner.a(matchException);
                                            }
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw PulseScanner.a(matchException);
                                        }
                                    }
                                    h.a(worldRenderContext.gameRenderer().method_19418());
                                    u2 = m.a(u.class);
                                    t2 = m.a(t.class);
                                    q q2 = m.a(q.class);
                                    bl = false;
                                    try {
                                        bl2 = q2.b();
                                        if (nArray == null) break block14;
                                        if (!bl2) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw PulseScanner.a(matchException);
                                    }
                                    q2.b(worldRenderContext.matrices(), worldRenderContext.gameRenderer().method_19418(), class_310.method_1551().method_61966().method_60637(true));
                                    bl = true;
                                }
                                bl2 = u2.b();
                            }
                            try {
                                if (nArray == null) break block16;
                                if (!bl2) break block17;
                            }
                            catch (MatchException matchException) {
                                throw PulseScanner.a(matchException);
                            }
                            u2.a(worldRenderContext.matrices(), worldRenderContext.gameRenderer().method_19418());
                            bl = true;
                        }
                        try {
                            i2 = t2;
                            if (nArray == null) break block18;
                            bl2 = i2.b();
                        }
                        catch (MatchException matchException) {
                            throw PulseScanner.a(matchException);
                        }
                    }
                    if (bl2) {
                        t2.a(worldRenderContext.matrices(), worldRenderContext.gameRenderer().method_19418());
                        bl = true;
                    }
                    i2 = m.a(d.class);
                }
                d d2 = (d)i2;
                try {
                    if (nArray == null) break block19;
                    if (!d2.b()) break block20;
                }
                catch (MatchException matchException) {
                    throw PulseScanner.a(matchException);
                }
                d2.a(worldRenderContext.matrices(), worldRenderContext.gameRenderer().method_19418());
                bl = true;
            }
            l.a(worldRenderContext.matrices(), worldRenderContext.gameRenderer().method_19418(), class_310.method_1551().method_61966().method_60637(true));
            k.b();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "$}#^ljb\u0015oo^l]x\u001dg!flW+Y6oVt\u000e#\u0018a,Hg]n\u001054P)]\u007f\u0015|*\u0010rS\"2$}#^ljb\u0015ooDgG\u007fN(#DjKe\u0007m+\u0010rS+\u0007|.Yl\u0013p\t(<Hz]b\u001bf\u0004Hp\u0013p\t\u00137g:Am\u000ee\u001b|oHgOi\u0018moVt\u0011\u000fuoKhGg\u0011loYf\u000e\u007f\u001dk$\f\u0004z*^l@\u007f\\d*C)\r$}#^l\u000eX\u0017i!Cl\\\u00065J\u001chGz$$}#^l\u000eX\u0017i!Cl\\+\u0018g.IlJ+\u0003a;E)UvTe I|Bn\u0007";
                var4_3 = "$}#^ljb\u0015oo^l]x\u001dg!flW+Y6oVt\u000e#\u0018a,Hg]n\u001054P)]\u007f\u0015|*\u0010rS\"2$}#^ljb\u0015ooDgG\u007fN(#DjKe\u0007m+\u0010rS+\u0007|.Yl\u0013p\t(<Hz]b\u001bf\u0004Hp\u0013p\t\u00137g:Am\u000ee\u001b|oHgOi\u0018moVt\u0011\u000fuoKhGg\u0011loYf\u000e\u007f\u001dk$\f\u0004z*^l@\u007f\\d*C)\r$}#^l\u000eX\u0017i!Cl\\\u00065J\u001chGz$$}#^l\u000eX\u0017i!Cl\\+\u0018g.IlJ+\u0003a;E)UvTe I|Bn\u0007".length();
                var1_4 = 49;
                var0_5 = -1;
                PulseScanner.b(new int[5]);
lbl8:
                // 2 sources

                while (true) {
                    v0 = 71;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block18;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u0012l<HzViJr<U?\u0006#\\\n~Ql";
                    var4_3 = "\u0012l<HzViJr<U?\u0006#\\\n~Ql".length();
                    var1_4 = 12;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 81;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (true) ** GOTO lbl72
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
                        v11 = 79;
                        break;
                    }
                    case 2: {
                        v11 = 8;
                        break;
                    }
                    case 3: {
                        v11 = 106;
                        break;
                    }
                    case 4: {
                        v11 = 78;
                        break;
                    }
                    case 5: {
                        v11 = 105;
                        break;
                    }
                    default: {
                        v11 = 76;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_6;
lbl72:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_6);
            v4 = new String(v8);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl80:
                // 1 sources

                ** continue;
            }
        }
        PulseScanner.a = var5;
        PulseScanner.LOG = LoggerFactory.getLogger((String)PulseScanner.a[5]);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

