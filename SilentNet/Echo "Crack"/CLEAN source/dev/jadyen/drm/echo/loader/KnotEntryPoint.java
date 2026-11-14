package dev.jadyen.drm.echo.loader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.SecureClassLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class KnotEntryPoint extends SecureClassLoader implements ModInitializer, PreLaunchEntrypoint {
   public KnotEntryPoint() {
   }

   public KnotEntryPoint(ClassLoader loader) {
      super(loader);
   }

   public native void onPreLaunch();

   public native void onInitialize();

   private static native void onShutdown();

   @Override
   public native Class<?> loadClass(String var1) throws ClassNotFoundException;

   @Override
   protected native Class<?> findClass(String var1) throws ClassNotFoundException;

   @Override
   public native URL getResource(String var1);

   @Override
   public native InputStream getResourceAsStream(String var1);

   static {
      try {
         String osName = System.getProperty("os.name").toLowerCase();
         String libName = "echonative";
         String libExtension;
         if (osName.contains("win")) {
            libExtension = ".dll";
         } else if (osName.contains("mac")) {
            libExtension = ".dylib";
         } else {
            libExtension = ".so";
         }

         Path tempDir = Files.createTempDirectory("echo");
         tempDir.toFile().deleteOnExit();

         try {
            try (InputStream input = KnotEntryPoint.class.getResourceAsStream("/" + libName + libExtension)) {
               if (input == null) {
                  throw new RuntimeException("?");
               }

               Path nativeFile = tempDir.resolve(libName + libExtension);
               Files.copy(input, nativeFile, StandardCopyOption.REPLACE_EXISTING);
               nativeFile.toFile().deleteOnExit();
               System.load(nativeFile.toString());
               Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                  try {
                     onShutdown();
                  } catch (Throwable var1x) {
                  }
               }, "echo-native-shutdown"));
            }
         } catch (IOException var9) {
            throw new RuntimeException("?");
         }
      } catch (IOException var10) {
         throw new RuntimeException("?");
      }
   }
}
