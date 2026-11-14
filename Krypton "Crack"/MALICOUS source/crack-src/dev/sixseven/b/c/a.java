package dev.sixseven.b.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.IntSupplier;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class a implements c {
   private static List<class_2248> a;
   private final dev.sixseven.i.a b;
   private final IntSupplier c;
   private final String d;
   private List<c.a> e;

   public a(dev.sixseven.i.a setting, IntSupplier defaultColor, String title) {
      this.b = setting;
      this.c = defaultColor;
      this.d = title;
   }

   private static List<class_2248> d() {
      if (a == null) {
         ArrayList var0 = new ArrayList();

         for (class_2248 var2 : class_7923.field_41175) {
            if (var2 != class_2246.field_10124 && var2 != class_2246.field_10543 && var2 != class_2246.field_10243) {
               var0.add(var2);
            }
         }

         a = var0;
      }

      return a;
   }

   @Override
   public String a() {
      return this.d;
   }

   @Override
   public long b() {
      return this.b.c();
   }

   @Override
   public List<c.a> c() {
      if (this.e == null) {
         ArrayList var1 = new ArrayList(d().size());

         for (class_2248 var3 : d()) {
            var1.add(new dev.sixseven.b.c.a.a(var3));
         }

         this.e = var1;
      }

      return this.e;
   }

   private final class a implements c.a {
      private final class_2248 b;
      private final String c;
      private class_1799 d;

      a(class_2248 block) {
         this.b = block;
         class_2960 var3 = class_7923.field_41175.method_10221(block);
         String var4 = var3 != null ? var3.method_12832() : "";
         String var5 = var3 != null ? var3.method_12836() : "";
         this.c = (var4 + " " + var5 + " " + dev.sixseven.i.a.c(block)).toLowerCase(Locale.ROOT);
      }

      @Override
      public class_1799 a() {
         if (this.d == null) {
            class_1792 var1 = this.b.method_8389();
            this.d = new class_1799(var1 == class_1802.field_8162 ? class_1802.field_8077 : var1);
         }

         return this.d;
      }

      @Override
      public String b() {
         return dev.sixseven.i.a.c(this.b);
      }

      @Override
      public boolean a(String lowerQuery) {
         return this.c.contains(lowerQuery);
      }

      @Override
      public boolean c() {
         return a.this.b.a(this.b) != null;
      }

      @Override
      public boolean d() {
         dev.sixseven.i.a.a var1 = a.this.b.a(this.b);
         return var1 != null && var1.a.i();
      }

      @Override
      public boolean e() {
         return a.this.b.a(this.b) != null;
      }

      @Override
      public int f() {
         dev.sixseven.i.a.a var1 = a.this.b.a(this.b);
         return var1 != null ? var1.b.i() : a.this.c.getAsInt();
      }

      @Override
      public void g() {
         dev.sixseven.i.a.a var1 = a.this.b.a(this.b);
         if (var1 == null) {
            a.this.b.a(this.b, true, a.this.c.getAsInt());
         } else {
            var1.a.a();
         }
      }

      @Override
      public dev.sixseven.i.c h() {
         dev.sixseven.i.a.a var1 = a.this.b.a(this.b);
         if (var1 == null) {
            var1 = a.this.b.a(this.b, true, a.this.c.getAsInt());
         }

         return var1 != null ? var1.b : null;
      }
   }
}
