/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
package pulsescanner.i;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import pulsescanner.f.i;
import pulsescanner.i.a;

public class h
extends a<String> {
    public final int g;

    public h(String string, String string2, String string3) {
        this(string, string2, string3, 256);
    }

    public h(String string, String string2, String string3, int n2) {
        super(string, string2, string3);
        this.g = n2;
    }

    @Override
    public void a(String string) {
        String string2;
        h h2;
        block8: {
            block9: {
                i[] iArray;
                block7: {
                    String string3;
                    block6: {
                        iArray = pulsescanner.i.a.f();
                        try {
                            string3 = string;
                            if (iArray == null) break block6;
                            if (string3 != null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw h.a(matchException);
                        }
                        string3 = "";
                    }
                    string = string3;
                }
                try {
                    try {
                        h2 = this;
                        string2 = string;
                        if (iArray == null) break block8;
                        if (string2.length() <= this.g) break block9;
                    }
                    catch (MatchException matchException) {
                        throw h.a(matchException);
                    }
                    string2 = string.substring(0, this.g);
                    break block8;
                }
                catch (MatchException matchException) {
                    throw h.a(matchException);
                }
            }
            string2 = string;
        }
        super.a(string2);
    }

    @Override
    public JsonElement e() {
        return new JsonPrimitive((String)this.a());
    }

    @Override
    public void a(JsonElement jsonElement) {
        try {
            if (jsonElement.isJsonPrimitive()) {
                this.a(jsonElement.getAsString());
            }
        }
        catch (MatchException matchException) {
            throw h.a(matchException);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

