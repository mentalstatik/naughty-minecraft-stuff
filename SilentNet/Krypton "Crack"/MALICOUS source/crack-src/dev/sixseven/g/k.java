package dev.sixseven.g;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3f;

public final class k {
   private static final RenderPipeline c = RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
      .withLocation("sixsevenclient/pipeline/flat_fill")
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .build();
   public static final class_1921 a = class_1921.method_75940("sixsevenclient:flat_fill", class_12247.method_75927(c).method_75937().method_75938());
   private static final RenderPipeline d = RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
      .withLocation("sixsevenclient/pipeline/flat_lines")
      .withDepthWrite(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .build();
   public static final class_1921 b = class_1921.method_75940("sixsevenclient:flat_lines", class_12247.method_75927(d).method_75938());

   private k() {
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, double x0, double z0, double x1, double z1, double y, int color) {
      class_4588 var14 = bufferSource.method_73477(a);
      class_4665 var15 = poseStack.method_23760();
      float var16 = (float)(x0 - cam.field_1352);
      float var17 = (float)(z0 - cam.field_1350);
      float var18 = (float)(x1 - cam.field_1352);
      float var19 = (float)(z1 - cam.field_1350);
      float var20 = (float)(y - cam.field_1351);
      var14.method_56824(var15, var16, var20, var17).method_39415(color);
      var14.method_56824(var15, var16, var20, var19).method_39415(color);
      var14.method_56824(var15, var18, var20, var19).method_39415(color);
      var14.method_56824(var15, var18, var20, var17).method_39415(color);
   }

   public static void a(
      class_4598 bufferSource, class_4587 poseStack, class_243 cam, double x0, double z0, double x1, double z1, double y, int color, float width
   ) {
      class_4588 var15 = bufferSource.method_73477(b);
      class_4665 var16 = poseStack.method_23760();
      Vector3f var17 = new Vector3f((float)(x1 - x0), 0.0F, (float)(z1 - z0)).normalize();
      var15.method_56824(var16, (float)(x0 - cam.field_1352), (float)(y - cam.field_1351), (float)(z0 - cam.field_1350))
         .method_39415(color)
         .method_61959(var16, var17)
         .method_75298(width);
      var15.method_56824(var16, (float)(x1 - cam.field_1352), (float)(y - cam.field_1351), (float)(z1 - cam.field_1350))
         .method_39415(color)
         .method_61959(var16, var17)
         .method_75298(width);
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, double x, double z, double y, double r, int color) {
      b(bufferSource, poseStack, cam, x, z, y, r, color);
      int var12 = dev.sixseven.n.c.a(color, 1.0F);
      a(bufferSource, poseStack, cam, x - r, z, x, z - r, y, var12, 2.0F);
      a(bufferSource, poseStack, cam, x, z - r, x + r, z, y, var12, 2.0F);
      a(bufferSource, poseStack, cam, x + r, z, x, z + r, y, var12, 2.0F);
      a(bufferSource, poseStack, cam, x, z + r, x - r, z, y, var12, 2.0F);
   }

   private static void b(class_4598 bufferSource, class_4587 poseStack, class_243 cam, double cx, double cz, double y, double r, int color) {
      class_4588 var12 = bufferSource.method_73477(a);
      class_4665 var13 = poseStack.method_23760();
      float var14 = (float)(y - cam.field_1351);
      var12.method_56824(var13, (float)(cx - r - cam.field_1352), var14, (float)(cz - cam.field_1350)).method_39415(color);
      var12.method_56824(var13, (float)(cx - cam.field_1352), var14, (float)(cz - r - cam.field_1350)).method_39415(color);
      var12.method_56824(var13, (float)(cx + r - cam.field_1352), var14, (float)(cz - cam.field_1350)).method_39415(color);
      var12.method_56824(var13, (float)(cx - cam.field_1352), var14, (float)(cz + r - cam.field_1350)).method_39415(color);
   }

   public static void a(class_4598 bufferSource) {
      bufferSource.method_22994(a);
      bufferSource.method_22994(b);
   }
}
