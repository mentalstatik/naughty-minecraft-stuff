package pulsescanner.a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import net.minecraft.class_310;

public final class af {
   private static final Map<Integer, Boolean> a;
   private static volatile long b;
   private static final ScheduledExecutorService c;
   private static final String d;

   private af() {
   }

   public static void a(long var0) {
      b = Math.max(b, System.currentTimeMillis() + Math.max(1L, var0));
   }

   public static boolean a() {
      int var0 = as.q();

      try {
         long var2;
         int var10000 = (var2 = System.currentTimeMillis() - b) == 0L ? 0 : (var2 < 0L ? -1 : 1);
         if (var0 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (MatchException var1) {
         throw a(var1);
      }

      return (boolean)0;
   }

   public static boolean a(int var0) {
      return a.getOrDefault(var0, false);
   }

   public static boolean b(int var0) {
      return a.replace(var0, true, false);
   }

   public static void c(int var0) {
      a(var0, 35L);
   }

   public static void a(int var0, long var1) {
      class_310 var3 = class_310.method_1551();
      d(var0);
      c.schedule(af::lambda$click$2, Math.max(1L, var1), TimeUnit.MILLISECONDS);
   }

   public static void d(int var0) {
      class_310 var1 = class_310.method_1551();
      a.put(var0, true);
      new s(var0).a();
      new t(var0, 1, var1.field_1755).a();
   }

   private static void lambda$click$2(class_310 var0, int var1) {
      var0.execute(af::lambda$click$1);
   }

   private static void lambda$click$1(int var0) {
      a.put(var0, false);
   }

   private static Thread lambda$static$0(Runnable var0) {
      Thread var1 = new Thread(var0, d);
      var1.setDaemon(true);
      return var1;
   }

   static {
      char[] var10003 = "7T\u000e7QVj(L\u0000%@Vj+H\u0001/".toCharArray();
      int var10004 = var10003.length;
      byte var5 = 1;
      char[] var10002 = var10003;
      int var1 = var10004;

      for (int var0 = 0; var1 > var0; var0++) {
         var10002[var0] = (char)(var10002[var0] ^ var5 ^ switch (var0 % 7) {
            case 0 -> 70;
            case 1 -> 32;
            case 2 -> 99;
            case 3 -> 69;
            case 4 -> 53;
            case 5 -> 122;
            default -> 8;
         });
      }

      String var7 = new String(var10002).intern();
      byte var3 = -1;
      d = var7;
      a = new ConcurrentHashMap<>();
      c = Executors.newSingleThreadScheduledExecutor(af::lambda$static$0);
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
