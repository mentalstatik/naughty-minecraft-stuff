package echo.offline.config;

import net.fabricmc.loader.api.FabricLoader;

public final class LocalConfigs {
   private static final LocalConfigStore STORE = new LocalConfigStore(FabricLoader.getInstance().getConfigDir().resolve("echo"));

   private LocalConfigs() {
   }

   public static String call(String var0, String[] var1) {
      return STORE.call(var0, var1);
   }
}
