/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import pulsescanner.f.e.a;
import pulsescanner.f.e.b;
import pulsescanner.f.e.c;
import pulsescanner.f.e.d;
import pulsescanner.f.e.e;
import pulsescanner.f.f.f;
import pulsescanner.f.f.g;
import pulsescanner.f.f.h;
import pulsescanner.f.f.i;
import pulsescanner.f.f.j;
import pulsescanner.f.f.k;
import pulsescanner.f.f.l;
import pulsescanner.f.f.n;
import pulsescanner.f.f.o;
import pulsescanner.f.f.p;
import pulsescanner.f.f.q;
import pulsescanner.f.f.r;
import pulsescanner.f.f.s;
import pulsescanner.f.f.t;
import pulsescanner.f.f.u;
import pulsescanner.f.f.v;
import pulsescanner.f.f.w;
import pulsescanner.f.f.x;

public final class m {
    private static final List<pulsescanner.f.i> a = new ArrayList<pulsescanner.f.i>();
    private static final Map<Class<? extends pulsescanner.f.i>, pulsescanner.f.i> b = new HashMap<Class<? extends pulsescanner.f.i>, pulsescanner.f.i>();

    private m() {
    }

    public static void a() {
        m.a(new i());
        m.a(new x());
        m.a(new pulsescanner.f.f.c());
        m.a(new pulsescanner.f.f.e());
        m.a(new o());
        m.a(new k());
        m.a(new j());
        m.a(new h());
        m.a(new g());
        m.a(new pulsescanner.f.f.m());
        m.a(new u());
        m.a(new q());
        m.a(new v());
        m.a(new p());
        m.a(new f());
        m.a(new pulsescanner.f.f.d());
        m.a(new l());
        m.a(new pulsescanner.f.f.b());
        m.a(new r());
        m.a(new w());
        m.a(new n());
        m.a(new s());
        m.a(new pulsescanner.f.c.u());
        m.a(new pulsescanner.f.c.r());
        m.a(new pulsescanner.f.c.e());
        m.a(new pulsescanner.f.c.l());
        m.a(new pulsescanner.f.c.d());
        m.a(new pulsescanner.f.c.g());
        m.a(new pulsescanner.f.c.f());
        m.a(new pulsescanner.f.c.i());
        m.a(new pulsescanner.f.c.b());
        m.a(new pulsescanner.f.c.c());
        m.a(new pulsescanner.f.c.k());
        pulsescanner.f.i[] iArray = pulsescanner.f.h.b();
        m.a(new pulsescanner.f.c.t());
        m.a(new pulsescanner.f.c.m());
        m.a(new pulsescanner.f.c.n());
        m.a(new pulsescanner.f.c.h());
        m.a(new pulsescanner.f.c.p());
        m.a(new pulsescanner.f.c.q());
        m.a(new pulsescanner.f.c.o());
        m.a(new pulsescanner.f.c.s());
        pulsescanner.a.d.a();
        m.a(new pulsescanner.f.a.c());
        m.a(new pulsescanner.f.a.b());
        m.a(new pulsescanner.f.a.d());
        m.a(new pulsescanner.f.a.e());
        m.a(new b());
        m.a(new d());
        m.a(new c());
        m.a(new a());
        m.a(new e());
        m.a(new pulsescanner.f.d.r());
        m.a(new pulsescanner.f.d.k());
        m.a(new pulsescanner.f.d.c());
        m.a(new pulsescanner.f.d.e());
        m.a(new pulsescanner.f.d.f());
        m.a(new pulsescanner.f.d.i());
        m.a(new pulsescanner.f.d.d());
        m.a(new pulsescanner.f.d.j());
        m.a(new pulsescanner.f.d.m());
        m.a(new pulsescanner.f.d.l());
        m.a(new pulsescanner.f.d.q());
        m.a(new pulsescanner.f.d.h());
        pulsescanner.f.i[] iArray2 = iArray;
        try {
            m.a(new pulsescanner.f.d.b());
            m.a(new pulsescanner.f.d.g());
            m.a(new pulsescanner.f.d.o());
            m.a(new pulsescanner.f.d.n());
            m.a(new pulsescanner.f.d.p());
            m.a(new pulsescanner.f.d.s());
            m.a(new pulsescanner.f.g.e());
            m.a(new pulsescanner.f.g.g());
            m.a(new pulsescanner.f.g.b());
            m.a(new t());
            m.a(new pulsescanner.f.g.d());
            m.a(new pulsescanner.f.g.c());
            m.a(new pulsescanner.f.g.f());
            m.a(new pulsescanner.f.b.a());
            m.a(new pulsescanner.f.b.c());
            m.a(new pulsescanner.f.b.e());
            m.a(new pulsescanner.f.b.f());
            m.a(new pulsescanner.f.b.d());
            m.a(new pulsescanner.f.b.b());
            m.a(new pulsescanner.f.c.j());
            if (iArray2 != null) {
                pulsescanner.f.i.b(new int[3]);
            }
        }
        catch (MatchException matchException) {
            throw m.a(matchException);
        }
    }

    private static void a(pulsescanner.f.i i2) {
        a.add(i2);
        b.put(i2.getClass(), i2);
    }

    public static <T extends pulsescanner.f.i> T a(Class<T> clazz) {
        return (T)b.get(clazz);
    }

    public static boolean b(Class<? extends pulsescanner.f.i> clazz) {
        boolean bl;
        block5: {
            block4: {
                pulsescanner.f.i i2 = b.get(clazz);
                try {
                    try {
                        if (i2 == null || !i2.b()) break block4;
                    }
                    catch (MatchException matchException) {
                        throw m.a(matchException);
                    }
                    bl = true;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw m.a(matchException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static List<pulsescanner.f.i> b() {
        return Collections.unmodifiableList(a);
    }

    public static List<pulsescanner.f.i> a(pulsescanner.f.h h2) {
        ArrayList<pulsescanner.f.i> arrayList;
        block15: {
            arrayList = new ArrayList<pulsescanner.f.i>();
            Iterator<pulsescanner.f.i> iterator = a.iterator();
            pulsescanner.f.i[] iArray = pulsescanner.f.h.b();
            while (iterator.hasNext()) {
                block18: {
                    boolean bl;
                    pulsescanner.f.i i2;
                    block19: {
                        pulsescanner.f.i i3;
                        block16: {
                            i2 = iterator.next();
                            try {
                                try {
                                    try {
                                        if (iArray != null) break block15;
                                        i3 = i2;
                                        if (iArray != null) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw m.a(matchException);
                                    }
                                    if (i3.d != h2) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw m.a(matchException);
                                }
                            }
                            catch (MatchException matchException) {
                                throw m.a(matchException);
                            }
                            i3 = i2;
                        }
                        try {
                            bl = i3 instanceof pulsescanner.f.j;
                            if (iArray != null) break block18;
                            if (!bl) break block19;
                        }
                        catch (MatchException matchException) {
                            throw m.a(matchException);
                        }
                        pulsescanner.f.j j2 = (pulsescanner.f.j)i2;
                        try {
                            try {
                                if (iArray != null) break block18;
                                if (!j2.q()) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw m.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw m.a(matchException);
                        }
                    }
                    bl = arrayList.add(i2);
                }
                if (iArray == null) continue;
            }
            arrayList.sort(Comparator.comparing(m::lambda$byCategory$0));
        }
        return arrayList;
    }

    public static List<pulsescanner.f.j> c() {
        ArrayList<pulsescanner.f.j> arrayList = new ArrayList<pulsescanner.f.j>();
        for (pulsescanner.f.i i2 : a) {
            if (!(i2 instanceof pulsescanner.f.j)) continue;
            pulsescanner.f.j j2 = (pulsescanner.f.j)i2;
            arrayList.add(j2);
        }
        return arrayList;
    }

    public static pulsescanner.f.i a(String string) {
        for (pulsescanner.f.i i2 : a) {
            try {
                if (!i2.b.equalsIgnoreCase(string)) continue;
                return i2;
            }
            catch (MatchException matchException) {
                throw m.a(matchException);
            }
        }
        return null;
    }

    private static String lambda$byCategory$0(pulsescanner.f.i i2) {
        return i2.b.toLowerCase(Locale.ROOT);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

