package dev.sixseven.d.a;

import net.minecraft.class_310;
import net.minecraft.class_408;

public class q extends dev.sixseven.d.c {
   private static final int c = 3;
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Slot", "Macro slot to edit.", "1", "1", "2", "3"));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Send Instantly", "Skip the chat preview and send immediately.", true));
   private final dev.sixseven.i.i[] d = new dev.sixseven.i.i[3];
   private final dev.sixseven.i.e[] e = new dev.sixseven.i.e[3];

   public q() {
      super("ChatMacro", "Bindable chat command macros.", dev.sixseven.d.b.f);

      for (int var1 = 0; var1 < 3; var1++) {
         String var2 = Integer.toString(var1 + 1);
         this.d[var1] = this.a(new dev.sixseven.i.i("Message " + var2, "Message or /command for slot " + var2, "", 256, "/say hi"));
         this.e[var1] = this.a(new dev.sixseven.i.e("Key " + var2, "Key that runs slot " + var2, -1));
         this.d[var1].a(() -> this.a.a(var2));
         this.e[var1].a(() -> this.a.a(var2));
      }
   }

   @Override
   public boolean a(int keyCode) {
      boolean var2 = false;

      for (int var3 = 0; var3 < 3; var3++) {
         if (this.e[var3].a(keyCode)) {
            this.a(this.d[var3].i());
            var2 = true;
         }
      }

      return var2;
   }

   private void a(String message) {
      if (message != null && !message.isBlank()) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1724 != null && var2.field_1724.field_3944 != null) {
            if (!this.b.i()) {
               var2.method_1507(new class_408(message, false));
            } else if (message.startsWith("/")) {
               var2.field_1724.field_3944.method_45730(message.substring(1));
            } else {
               var2.field_1724.field_3944.method_45729(message);
            }
         }
      }
   }
}
