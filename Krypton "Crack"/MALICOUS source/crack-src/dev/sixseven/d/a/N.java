package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;

public final class N extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Chunks Per Tick", "Maximum loaded chunks processed per client tick", 64.0, 16.0, 128.0, 8.0));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Time Budget", "Maximum scan time per client tick", 8.0, 2.0, 15.0, 1.0, " ms"));
   private boolean c;

   public N() {
      super("Insane Load Chunk", "Rapidly scans already-loaded chunks through their full vertical data", dev.sixseven.d.b.g);
   }

   @Override
   protected void h() {
      if (SixSevenClient.modules() != null && SixSevenClient.modules().e != null && !SixSevenClient.modules().e.f()) {
         this.c = true;
         SixSevenClient.modules().e.a(true);
      }
   }

   @Override
   protected void i() {
      if (this.c && SixSevenClient.modules() != null && SixSevenClient.modules().e != null) {
         SixSevenClient.modules().e.a(false);
      }

      this.c = false;
   }
}
