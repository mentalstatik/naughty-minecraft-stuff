package dev.sixseven.b.c;

import dev.sixseven.i.d;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1799;

public final class b implements c {
   private final d a;
   private List<c.a> b;

   public b(d setting) {
      this.a = setting;
   }

   @Override
   public String a() {
      return this.a.g();
   }

   @Override
   public long b() {
      return this.a.c();
   }

   @Override
   public List<c.a> c() {
      if (this.b == null) {
         ArrayList var1 = new ArrayList(this.a.a().size());

         for (d.a var3 : this.a.a()) {
            var1.add(new b.a(var3));
         }

         this.b = var1;
      }

      return this.b;
   }

   private static final class a implements c.a {
      private final d.a a;
      private final class_1799 b;

      a(d.a entry) {
         this.a = entry;
         this.b = new class_1799(entry.c());
      }

      @Override
      public class_1799 a() {
         return this.b;
      }

      @Override
      public String b() {
         return this.a.b();
      }

      @Override
      public boolean a(String lowerQuery) {
         return this.a.a(lowerQuery);
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public boolean d() {
         return this.a.a.i();
      }

      @Override
      public boolean e() {
         return this.a.a.i();
      }

      @Override
      public int f() {
         return this.a.b.i();
      }

      @Override
      public void g() {
         this.a.a.a();
      }

      @Override
      public dev.sixseven.i.c h() {
         return this.a.b;
      }
   }
}
