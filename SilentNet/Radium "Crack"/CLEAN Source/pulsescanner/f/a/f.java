/*
 * Decompiled with CFR 0.152.
 */
package pulsescanner.f.a;

import pulsescanner.f.a.b;

final class f {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    private f() {
    }

    void a(int n2, int n3, int n4, int n5, int n6) {
        f f2;
        block4: {
            block5: {
                String[] stringArray = pulsescanner.f.a.b.o();
                try {
                    try {
                        f2 = this;
                        if (stringArray != null) break block4;
                        if (f2.a != 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw pulsescanner.f.a.f.a(matchException);
                    }
                    this.b = n2;
                    this.c = n3;
                    this.d = n4;
                    this.e = n5;
                    this.f = n6;
                }
                catch (MatchException matchException) {
                    throw pulsescanner.f.a.f.a(matchException);
                }
            }
            f2 = this;
        }
        ++f2.a;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }
}

