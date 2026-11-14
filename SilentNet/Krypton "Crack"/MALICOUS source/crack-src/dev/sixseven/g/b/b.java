package dev.sixseven.g.b;

import dev.sixseven.SixSevenClient;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NanoSVG;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.system.MemoryUtil;

public final class b {
   private static final int a = 64;
   private static final Map<String, Integer> b = new HashMap<>();
   private static boolean c;

   private b() {
   }

   public static int a(dev.sixseven.d.b category) {
      a();
      return b.getOrDefault(category.c(), -1);
   }

   private static void a() {
      if (!c) {
         c = true;

         for (dev.sixseven.d.b var3 : dev.sixseven.d.b.a()) {
            int var4 = a("assets/sixsevenclient/icons/" + var3.c() + ".svg");
            if (var4 > 0) {
               b.put(var3.c(), var4);
            }
         }
      }
   }

   private static int a(String resourcePath) {
      long var1 = d.a().b();

      try {
         int var6;
         try (InputStream var3 = b.class.getClassLoader().getResourceAsStream(resourcePath)) {
            if (var3 == null) {
               SixSevenClient.LOGGER.warn("Icon resource missing: {}", resourcePath);
               return -1;
            }

            String var7 = new String(var3.readAllBytes(), StandardCharsets.UTF_8);
            var7 = var7.replaceAll("#[0-9a-fA-F]{6}", "#ffffff")
               .replaceAll("#[0-9a-fA-F]{3}\\b", "#fff")
               .replace("currentColor", "#ffffff")
               .replace("\"black\"", "\"white\"");
            ByteBuffer var8 = MemoryUtil.memUTF8(var7, true);
            ByteBuffer var9 = MemoryUtil.memASCII("px");
            NSVGImage var10 = null;
            long var11 = 0L;
            ByteBuffer var13 = null;

            try {
               var10 = NanoSVG.nsvgParse(var8, var9, 96.0F);
               if (var10 == null) {
                  return -1;
               }

               var11 = NanoSVG.nsvgCreateRasterizer();
               float var14 = 64.0F / Math.max(var10.width(), var10.height());
               var13 = MemoryUtil.memAlloc(16384);
               NanoSVG.nsvgRasterize(var11, var10, 0.0F, 0.0F, var14, var13, 64, 64, 256);
               var6 = NanoVG.nvgCreateImageRGBA(var1, 64, 64, 0, var13);
            } finally {
               if (var13 != null) {
                  MemoryUtil.memFree(var13);
               }

               if (var11 != 0L) {
                  NanoSVG.nsvgDeleteRasterizer(var11);
               }

               if (var10 != null) {
                  NanoSVG.nsvgDelete(var10);
               }

               MemoryUtil.memFree(var8);
               MemoryUtil.memFree(var9);
            }
         }

         return var6;
      } catch (Exception var23) {
         SixSevenClient.LOGGER.error("Failed to rasterize icon {}", resourcePath, var23);
         return -1;
      }
   }
}
