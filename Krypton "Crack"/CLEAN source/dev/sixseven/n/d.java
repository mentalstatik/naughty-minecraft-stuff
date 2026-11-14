package dev.sixseven.n;

import java.util.ArrayDeque;
import java.util.Deque;

public final class d {
   private static final Deque<Long> a = new ArrayDeque<>();
   private static final Deque<Long> b = new ArrayDeque<>();

   private d() {
   }

   public static void a(int button) {
      Deque var1 = button == 0 ? a : (button == 1 ? b : null);
      if (var1 != null) {
         synchronized (var1) {
            var1.addLast(System.nanoTime());
         }
      }
   }

   public static int b(int button) {
      Deque var1 = button == 0 ? a : b;
      long var2 = System.nanoTime() - 1000000000L;
      synchronized (var1) {
         while (!var1.isEmpty() && var1.peekFirst() < var2) {
            var1.pollFirst();
         }

         return var1.size();
      }
   }
}
