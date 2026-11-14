package dev.sixseven.d;

public enum b {
   a("Combat", "combat"),
   b("Player", "player"),
   c("Misc", "misc"),
   d("Render", "render"),
   e("Visuals", "visuals"),
   f("Client", "client"),
   g("AC Has Close \ud83d\udc80", "client");

   private final String h;
   private final String i;

   public static b[] a() {
      return (b[])j.clone();
   }

   public static b a(String param0) {
      return Enum.valueOf(b.class, var0);
   }

   private b(String nullxx, String nullxxx) {
      this.h = nullxx;
      this.i = nullxxx;
   }

   public String b() {
      return this.h;
   }

   public String c() {
      return this.i;
   }
}
