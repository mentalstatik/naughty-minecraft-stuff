package dev.sixseven.g.b;

import dev.sixseven.SixSevenClient;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.nanovg.NanoVGGL3;
import org.lwjgl.system.MemoryUtil;

public final class c {
   private static final Map<class_2960, Integer> a = new HashMap<>();
   private static final Map<Integer, Integer> b = new HashMap<>();
   private static int c = -1;
   private static int d = -1;
   private static Path e;

   private c() {
   }

   public static int a(class_2960 location) {
      return a.computeIfAbsent(location, c::b);
   }

   private static int b(class_2960 location) {
      long var1 = dev.sixseven.g.b.d.a().b();
      Optional var3 = class_310.method_1551().method_1478().method_14486(location);
      if (var3.isEmpty()) {
         return -1;
      } else {
         try {
            int var5;
            try (InputStream var4 = ((class_3298)var3.get()).method_14482()) {
               byte[] var6 = var4.readAllBytes();
               ByteBuffer var7 = MemoryUtil.memAlloc(var6.length);

               try {
                  var7.put(var6).flip();
                  var5 = NanoVG.nvgCreateImageMem(var1, 32, var7);
               } finally {
                  MemoryUtil.memFree(var7);
               }
            }

            return var5;
         } catch (Exception var16) {
            SixSevenClient.LOGGER.warn("Failed to load image {}", location, var16);
            return -1;
         }
      }
   }

   public static int a(Path path, int version) {
      if (version == d && path.equals(e)) {
         return c;
      } else {
         long var2 = dev.sixseven.g.b.d.a().b();
         if (c > 0) {
            NanoVG.nvgDeleteImage(var2, c);
            c = -1;
         }

         d = version;
         e = path;

         try {
            byte[] var4 = Files.readAllBytes(path);
            ByteBuffer var5 = MemoryUtil.memAlloc(var4.length);

            try {
               var5.put(var4).flip();
               c = NanoVG.nvgCreateImageMem(var2, 0, var5);
            } finally {
               MemoryUtil.memFree(var5);
            }
         } catch (Exception var10) {
            c = -1;
         }

         return c;
      }
   }

   public static int a(class_2960 textureId, int width, int height) {
      class_1044 var3 = class_310.method_1551().method_1531().method_4619(textureId);
      if (var3 != null && var3.method_68004() instanceof class_10868 var5) {
         int var6 = var5.method_68427();
         return b.computeIfAbsent(var6, id -> NanoVGGL3.nvglCreateImageFromHandle(dev.sixseven.g.b.d.a().b(), id, width, height, 65536));
      } else {
         return -1;
      }
   }

   public static int a(int width, int height) {
      long var2 = dev.sixseven.g.b.d.a().b();
      ByteBuffer var4 = MemoryUtil.memCalloc(width * height * 4);

      int var5;
      try {
         var5 = NanoVG.nvgCreateImageRGBA(var2, width, height, 32, var4);
      } finally {
         MemoryUtil.memFree(var4);
      }

      return var5;
   }

   public static void a(int handle, ByteBuffer rgba) {
      if (handle > 0) {
         NanoVG.nvgUpdateImage(dev.sixseven.g.b.d.a().b(), handle, rgba);
      }
   }

   public static void a(int handle) {
      if (handle > 0) {
         NanoVG.nvgDeleteImage(dev.sixseven.g.b.d.a().b(), handle);
      }
   }

   public static void a(d vg, int image, float texW, float texH, float u0, float v0, float u1, float v1, float x, float y, float w, float h, float alpha) {
      if (image > 0) {
         float var13 = w / (u1 - u0);
         float var14 = h / (v1 - v0);
         vg.a(image, x - u0 * var13, y - v0 * var14, texW * var13, texH * var14, x, y, w, h, alpha);
      }
   }
}
