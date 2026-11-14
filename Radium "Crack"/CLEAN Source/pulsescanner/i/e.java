/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  net.minecraft.class_1041
 *  net.minecraft.class_310
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_307
 */
package pulsescanner.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import pulsescanner.f.i;
import pulsescanner.i.a;

public class e
extends a<Integer> {
    private static final String g;

    public e(String string, String string2, int n2) {
        super(string, string2, n2);
    }

    public boolean g() {
        boolean bl;
        try {
            bl = (Integer)this.a() == -1;
        }
        catch (MatchException matchException) {
            throw e.a(matchException);
        }
        return bl;
    }

    public boolean h() {
        boolean bl;
        block10: {
            block8: {
                class_310 class_3102;
                i[] iArray;
                block9: {
                    class_310 class_3103 = class_310.method_1551();
                    iArray = pulsescanner.i.a.f();
                    try {
                        try {
                            try {
                                if (this.g()) break block8;
                                class_3102 = class_3103;
                                if (iArray == null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw e.a(matchException);
                            }
                            if (class_3102.field_1755 != null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw e.a(matchException);
                        }
                        class_3102 = class_3103;
                    }
                    catch (MatchException matchException) {
                        throw e.a(matchException);
                    }
                }
                try {
                    bl = class_3675.method_15987((class_1041)class_3102.method_22683(), (int)((Integer)this.a()));
                    if (iArray == null) break block10;
                    if (!bl) break block8;
                }
                catch (MatchException matchException) {
                    throw e.a(matchException);
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        return bl;
    }

    public String i() {
        return e.a((Integer)this.a());
    }

    public static String a(int n2) {
        String string;
        block7: {
            String string2;
            block8: {
                i[] iArray = pulsescanner.i.a.f();
                try {
                    if (n2 == -1) {
                        return g;
                    }
                }
                catch (MatchException matchException) {
                    throw e.a(matchException);
                }
                string2 = class_3675.class_307.field_1668.method_1447(n2).method_27445().getString();
                try {
                    try {
                        string = string2;
                        if (iArray == null) break block7;
                        if (string.length() <= 12) break block8;
                    }
                    catch (MatchException matchException) {
                        throw e.a(matchException);
                    }
                    string = string2.substring(0, 12);
                    break block7;
                }
                catch (MatchException matchException) {
                    throw e.a(matchException);
                }
            }
            string = string2;
        }
        return string;
    }

    @Override
    public JsonElement e() {
        return new JsonPrimitive((Number)this.a());
    }

    @Override
    public void a(JsonElement jsonElement) {
        try {
            if (jsonElement.isJsonPrimitive()) {
                this.a(jsonElement.getAsInt());
            }
        }
        catch (MatchException matchException) {
            throw e.a(matchException);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block11: {
            int n2;
            int n3;
            int n4;
            block10: {
                char[] cArray2 = "\u001aj\u0013X".toCharArray();
                n4 = 120;
                cArray = cArray2;
                n3 = cArray2.length;
                n2 = 0;
                if (!true) break block10;
                n3 = n3;
                if (n3 <= n2) break block11;
            }
            do {
                n4 = n4;
                cArray = cArray;
                int n5 = n2;
                cArray[n5] = (char)(cArray[n5] ^ (n4 ^ (switch (n2 % 7) {
                    case 0 -> 44;
                    case 1 -> 125;
                    case 2 -> 5;
                    case 3 -> 69;
                    case 4 -> 96;
                    case 5 -> 87;
                    default -> 13;
                })));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        g = new String(cArray).intern();
    }
}

