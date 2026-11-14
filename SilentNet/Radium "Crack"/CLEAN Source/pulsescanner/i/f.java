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
import java.util.Arrays;
import java.util.List;
import pulsescanner.f.i;
import pulsescanner.i.a;

public class f
extends a<String> {
    public final List<String> g;

    public f(String string, String string2, String string3, String ... stringArray) {
        super(string, string2, string3);
        this.g = Arrays.asList(stringArray);
    }

    public boolean a(String string) {
        return ((String)this.a()).equals(string);
    }

    @Override
    public void a(int n2) {
        int n3 = this.g.indexOf(this.a());
        n3 = Math.floorMod(n3 + n2, this.g.size());
        i[] iArray = pulsescanner.i.a.f();
        this.b(this.g.get(n3));
        i[] iArray2 = iArray;
        try {
            if (i.n() != null) {
                pulsescanner.i.a.b(new i[3]);
            }
        }
        catch (MatchException matchException) {
            throw f.a(matchException);
        }
    }

    public void b(String string) {
        block5: {
            f f2;
            block4: {
                i[] iArray = pulsescanner.i.a.f();
                try {
                    try {
                        f2 = this;
                        if (iArray == null) break block4;
                        if (!f2.g.contains(string)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw f.a(matchException);
                    }
                    f2 = this;
                }
                catch (MatchException matchException) {
                    throw f.a(matchException);
                }
            }
            super.a(string);
        }
    }

    @Override
    public JsonElement e() {
        return new JsonPrimitive((String)this.a());
    }

    @Override
    public void a(JsonElement jsonElement) {
        try {
            if (jsonElement.isJsonPrimitive()) {
                this.b(jsonElement.getAsString());
            }
        }
        catch (MatchException matchException) {
            throw f.a(matchException);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

