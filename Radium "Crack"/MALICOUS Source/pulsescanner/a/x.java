/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.a;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import pulsescanner.PulseScanner;
import pulsescanner.a.as;
import pulsescanner.a.az;
import pulsescanner.a.n;
import pulsescanner.a.y;
import pulsescanner.f.i;
import pulsescanner.license.d;

public final class x {
    private static final Map<Class<?>, List<az>> a;
    private static final String[] b;

    private x() {
    }

    /*
     * Unable to fully structure code
     */
    public static void a(Object var0) {
        var2_1 = var0.getClass();
        var1_2 = as.r();
        while (var2_1 != null) {
            block20: {
                block25: {
                    v0 = var2_1;
                    if (var1_2 == 0) break block25;
                    try {
                        block26: {
                            if (v0 == Object.class) break;
                            break block26;
                            catch (IllegalAccessException v1) {
                                throw x.a(v1);
                            }
                        }
                        v0 = var2_1;
                    }
                    catch (IllegalAccessException v2) {
                        throw x.a(v2);
                    }
                }
                var3_3 = v0.getDeclaredMethods();
                var4_4 = var3_3.length;
                var5_5 = 0;
                while (var5_5 < var4_4) {
                    block21: {
                        block22: {
                            block24: {
                                block23: {
                                    block28: {
                                        block27: {
                                            var6_6 = var3_3[var5_5];
                                            if (var1_2 == 0) break block20;
                                            var7_7 = var6_6.getAnnotation(y.class);
                                            if (var1_2 == 0) break block21;
                                            if (var7_7 == null) break block22;
                                            break block27;
                                            catch (IllegalAccessException v3) {
                                                throw x.a(v3);
                                            }
                                        }
                                        v4 = var6_6;
                                        if (var1_2 == 0) break block23;
                                        break block28;
                                        catch (IllegalAccessException v5) {
                                            throw x.a(v5);
                                        }
                                    }
                                    try {
                                        block29: {
                                            if (Modifier.isStatic(v4.getModifiers())) break block22;
                                            break block29;
                                            catch (IllegalAccessException v6) {
                                                throw x.a(v6);
                                            }
                                        }
                                        v4 = var6_6;
                                    }
                                    catch (IllegalAccessException v7) {
                                        throw x.a(v7);
                                    }
                                }
                                if (var1_2 == 0) ** GOTO lbl63
                                try {
                                    if (v4.getParameterCount() == 1) break block24;
                                    break block22;
                                    catch (IllegalAccessException v8) {
                                        throw x.a(v8);
                                    }
                                }
                                catch (IllegalAccessException v9) {
                                    throw x.a(v9);
                                }
                            }
                            try {
                                v4 = var6_6;
lbl63:
                                // 2 sources

                                v4.setAccessible(true);
                                var8_8 = MethodHandles.lookup().unreflect(var6_6).bindTo(var0);
                                x.a(x.a.computeIfAbsent(var6_6.getParameterTypes()[0], (Function<Class, List>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$register$0(java.lang.Class ), (Ljava/lang/Class;)Ljava/util/List;)()), new az(var0, var8_8, var7_7.a()));
                            }
                            catch (IllegalAccessException var8_9) {
                                PulseScanner.LOG.error(x.b[0], (Object)var6_6, (Object)var8_9);
                            }
                        }
                        ++var5_5;
                    }
                    if (var1_2 != 0) continue;
                }
                var2_1 = var2_1.getSuperclass();
            }
            if (var1_2 != 0) continue;
        }
    }

    private static void a(List<az> list, az az2) {
        int n2 = 0;
        try {
            while (true) {
                try {
                    if (n2 >= list.size() || list.get(n2).c() < az2.c()) break;
                }
                catch (MatchException matchException) {
                    throw x.a(matchException);
                }
                ++n2;
            }
        }
        catch (MatchException matchException) {
            throw x.a(matchException);
        }
        list.add(n2, az2);
    }

    public static <T> T b(T t2) {
        n n2;
        try {
            if (!d.y) {
                return t2;
            }
        }
        catch (Throwable throwable) {
            throw x.a(throwable);
        }
        List<az> list = a.get(t2.getClass());
        try {
            if (list == null) {
                return t2;
            }
        }
        catch (Throwable throwable) {
            throw x.a(throwable);
        }
        if (t2 instanceof n) {
            n n3 = (n)t2;
            n2 = n3;
        } else {
            n2 = null;
        }
        n n4 = n2;
        try {
            if (n4 != null) {
                n4.a(false);
            }
        }
        catch (Throwable throwable) {
            throw x.a(throwable);
        }
        for (az az2 : list) {
            Object object = az2.a();
            if (object instanceof i) {
                i i2 = (i)object;
                try {
                    if (!i2.b()) {
                        continue;
                    }
                }
                catch (Throwable throwable) {
                    throw x.a(throwable);
                }
            }
            try {
                az2.b().invoke(t2);
            }
            catch (Throwable throwable) {
                PulseScanner.LOG.error(b[1], (Object)t2.getClass().getSimpleName(), (Object)throwable);
            }
            try {
                try {
                    if (n4 == null || !n4.c()) continue;
                    break;
                }
                catch (Throwable throwable) {
                    throw x.a(throwable);
                }
            }
            catch (Throwable throwable) {
                throw x.a(throwable);
            }
        }
        return t2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Class<?> clazz) {
        List<az> list;
        block7: {
            list = a.get(clazz);
            try {
                try {
                    if (list != null && d.y) break block7;
                    return false;
                }
                catch (MatchException matchException) {
                    throw x.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw x.a(matchException);
            }
        }
        for (az az2 : list) {
            Object object = az2.a();
            if (!(object instanceof i)) return true;
            i i2 = (i)object;
            try {
                if (!i2.b()) continue;
                return true;
            }
            catch (MatchException matchException) {
                throw x.a(matchException);
            }
        }
        return false;
    }

    private static List lambda$register$0(Class clazz) {
        return new CopyOnWriteArrayList();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "OR\u0010.\bt\"iT\u0017z\b1\",P\u0011d\u001e5$,_\u0017z\b1>iA^r\u0001\u001dO\\\u0013k\u001d p`Z\r}\u0019:5~\u0013\u0018h\u001585h\u0013\u0018f\u000et+q";
            var4_3 = "OR\u0010.\bt\"iT\u0017z\b1\",P\u0011d\u001e5$,_\u0017z\b1>iA^r\u0001\u001dO\\\u0013k\u001d p`Z\r}\u0019:5~\u0013\u0018h\u001585h\u0013\u0018f\u000et+q".length();
            var1_4 = 33;
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
            v3 = 22;
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
                        v6 = 26;
                        break;
                    }
                    case 1: {
                        v6 = 37;
                        break;
                    }
                    case 2: {
                        v6 = 104;
                        break;
                    }
                    case 3: {
                        v6 = 31;
                        break;
                    }
                    case 4: {
                        v6 = 106;
                        break;
                    }
                    case 5: {
                        v6 = 66;
                        break;
                    }
                    default: {
                        v6 = 70;
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
        x.b = var5;
        x.a = new ConcurrentHashMap<Class<?>, List<az>>();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

