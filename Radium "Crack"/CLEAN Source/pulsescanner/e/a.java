/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.minecraft.class_310
 */
package pulsescanner.e;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import net.minecraft.class_310;
import pulsescanner.e.b;

public final class a {
    public static final boolean a;
    private static Process b;
    private static Thread c;
    private static Path d;
    private static volatile b e;
    private static volatile boolean f;
    private static final String[] g;

    private a() {
    }

    public static b a() {
        return e;
    }

    public static synchronized void a(int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private static void a(Process process) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).startsWith("\ufeff")) {
                    string = string.substring(1);
                }
                try {
                    if (!string.startsWith("{")) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw pulsescanner.e.a.a(exception);
                }
                try {
                    String string2;
                    String string3;
                    String string4;
                    b b2;
                    b b3;
                    double d2;
                    boolean bl;
                    String[] stringArray;
                    JsonObject jsonObject;
                    block27: {
                        double d3;
                        block26: {
                            jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
                            try {
                                if (jsonObject.has(g[13]) && jsonObject.get(g[12]).getAsBoolean()) break block26;
                            }
                            catch (Exception exception) {
                                throw pulsescanner.e.a.a(exception);
                            }
                            e = null;
                            continue;
                        }
                        stringArray = g;
                        bl = jsonObject.get(stringArray[15]).getAsBoolean();
                        d2 = jsonObject.get(stringArray[18]).getAsDouble();
                        try {
                            d3 = jsonObject.has(stringArray[31]) ? jsonObject.get(stringArray[26]).getAsDouble() : 0.0;
                        }
                        catch (Exception exception) {
                            throw pulsescanner.e.a.a(exception);
                        }
                        double d4 = d3;
                        if (!bl) break block27;
                        try {
                            block29: {
                                if (!(d4 > 0.0)) break block27;
                                break block29;
                                catch (Exception exception) {
                                    throw pulsescanner.e.a.a(exception);
                                }
                            }
                            if (!(d4 < 30.0)) break block27;
                        }
                        catch (Exception exception) {
                            throw pulsescanner.e.a.a(exception);
                        }
                        d2 += d4;
                    }
                    try {
                        b b4;
                        b3 = b4;
                        b2 = b4;
                        string4 = jsonObject.get(g[1]).getAsString();
                        string3 = jsonObject.get(g[25]).getAsString();
                        string2 = jsonObject.has(g[24]) ? jsonObject.get(g[4]).getAsString() : "";
                    }
                    catch (Exception exception) {
                        throw pulsescanner.e.a.a(exception);
                    }
                    stringArray = g;
                    b3(string4, string3, string2, bl, d2, jsonObject.get(stringArray[29]).getAsDouble(), System.currentTimeMillis(), jsonObject.has(stringArray[30]) ? jsonObject.get(stringArray[0]).getAsString() : "");
                    e = b2;
                }
                catch (Exception exception) {}
            }
        }
        catch (IOException iOException) {
        }
        finally {
            f = false;
        }
    }

    public static synchronized void b() {
        try {
            f = false;
            e = null;
            if (b != null) {
                b.destroy();
                b = null;
            }
        }
        catch (MatchException matchException) {
            throw pulsescanner.e.a.a(matchException);
        }
    }

    public static boolean c() {
        return f;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string) {
        block6: {
            if (!f) return;
            try {
                if (d != null) break block6;
                return;
                catch (IOException iOException) {
                    throw pulsescanner.e.a.a(iOException);
                }
            }
            catch (IOException iOException) {
                throw pulsescanner.e.a.a(iOException);
            }
        }
        try {
            Files.writeString(d, (CharSequence)(string + System.lineSeparator()), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            return;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static int d() {
        return 34 * Math.max(1, class_310.method_1551().method_22683().method_4495());
    }

    private static void lambda$start$0(Process process) {
        pulsescanner.e.a.a(process);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[34];
                var3_1 = 0;
                var2_2 = ")\u001bV\u0005<\u0000V\u0001J\ne'M=]t8!\u0005G\u001a%\fF\u0004N5.;X\u0002\u0000Fh-!\u0007EMIi1%IH\f]\u0005)\u0005@\u0018B\u000e8\u0006U\b]h6-\u0005NCJc;\u000b8\u001cN\u001eJ63-\rK\f\u001a\u0018\u001cN\u001eJ;\r+\bL\u0003Ji~\u0005\fF\u0004N;\f-\bF\b]\u0007e(P\u0019kr,\u0006\n\u0010R\f\\h\fe>K\u0003Kt)\u001b\u001d[\u0001J\u0003?\u0000L\u0006)\nV\u0004Y~\u0006)\nV\u0004Y~\u000fe'M\u0003fu*-\u001bC\u000e[r(-\u00078\u0005C\u0014Fu9\u0006\u0000\u0000F\tJu\be(P\u0019|r$-\b8\u0006Q\u0004[r1&\be*O\tir2-$g\bQ\u001eJo-g\u0019W\u0001\\~-+\bL\u0003Jiq%\fF\u0004N43-\rK\f\u0001k-y\u0007+\u0004FC[c*\ne9C\u001fJu*\u0018\u0000F\u0010e,Z\bLn*!\u0006L=@w7+\u0010\u0005)\u0005@\u0018B\u0006)\u001bV\u0004\\o\u0003)\u000eG\u001c\u000b\u0006W\u0001K;0'\u001d\u0002\u001e[z,<IO\bKr?h\u0001G\u0001_~,\u0007'\u001a\f\u0003Nv;\b,\u001cP\f[r1&\u0003)\u001bV\u0003)\u000eG";
                var4_3 = ")\u001bV\u0005<\u0000V\u0001J\ne'M=]t8!\u0005G\u001a%\fF\u0004N5.;X\u0002\u0000Fh-!\u0007EMIi1%IH\f]\u0005)\u0005@\u0018B\u000e8\u0006U\b]h6-\u0005NCJc;\u000b8\u001cN\u001eJ63-\rK\f\u001a\u0018\u001cN\u001eJ;\r+\bL\u0003Ji~\u0005\fF\u0004N;\f-\bF\b]\u0007e(P\u0019kr,\u0006\n\u0010R\f\\h\fe>K\u0003Kt)\u001b\u001d[\u0001J\u0003?\u0000L\u0006)\nV\u0004Y~\u0006)\nV\u0004Y~\u000fe'M\u0003fu*-\u001bC\u000e[r(-\u00078\u0005C\u0014Fu9\u0006\u0000\u0000F\tJu\be(P\u0019|r$-\b8\u0006Q\u0004[r1&\be*O\tir2-$g\bQ\u001eJo-g\u0019W\u0001\\~-+\bL\u0003Jiq%\fF\u0004N43-\rK\f\u0001k-y\u0007+\u0004FC[c*\ne9C\u001fJu*\u0018\u0000F\u0010e,Z\bLn*!\u0006L=@w7+\u0010\u0005)\u0005@\u0018B\u0006)\u001bV\u0004\\o\u0003)\u000eG\u001c\u000b\u0006W\u0001K;0'\u001d\u0002\u001e[z,<IO\bKr?h\u0001G\u0001_~,\u0007'\u001a\f\u0003Nv;\b,\u001cP\f[r1&\u0003)\u001bV\u0003)\u000eG".length();
                var1_4 = 3;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 76;
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
                    var2_2 = "P\u001a~4\u007f\t\u00109s1{\u0000\u001b\u000em";
                    var4_3 = "P\u001a~4\u007f\t\u00109s1{\u0000\u001b\u000em".length();
                    var1_4 = 5;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 121;
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
            var6_7 = 0;
            if (true) ** GOTO lbl71
            do {
                v7 = v7;
                v8 = v8;
                v10 = var6_7;
                switch (var6_7 % 7) {
                    case 0: {
                        v11 = 4;
                        break;
                    }
                    case 1: {
                        v11 = 37;
                        break;
                    }
                    case 2: {
                        v11 = 110;
                        break;
                    }
                    case 3: {
                        v11 = 33;
                        break;
                    }
                    case 4: {
                        v11 = 99;
                        break;
                    }
                    case 5: {
                        v11 = 87;
                        break;
                    }
                    default: {
                        v11 = 18;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v7 ^ v11));
                ++var6_7;
lbl71:
                // 2 sources

                v9 = v9;
            } while (v9 > var6_7);
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
        pulsescanner.e.a.g = var5;
        var0_6 = pulsescanner.e.a.g;
        pulsescanner.e.a.a = System.getProperty(var0_6[28], "").toLowerCase(Locale.ROOT).contains(var0_6[11]);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

