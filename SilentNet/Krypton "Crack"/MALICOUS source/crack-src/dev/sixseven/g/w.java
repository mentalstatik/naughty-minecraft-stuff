package dev.sixseven.g;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.U;
import dev.sixseven.d.a.V;
import dev.sixseven.d.a.ad;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2636;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_8961;
import org.joml.Matrix3x2fStack;

public final class w {
   private static final int a = -22733;
   private static final int b = 80;

   private w() {
   }

   public static void a(dev.sixseven.g.b.d vg) {
      if (x.b()) {
         dev.sixseven.d.d var1 = SixSevenClient.modules();
         if (var1 != null) {
            class_310 var2 = class_310.method_1551();
            class_638 var3 = var2.field_1687;
            class_746 var4 = var2.field_1724;
            if (var3 != null && var4 != null) {
               V var5 = var1.L;
               ad var6 = var1.R;
               boolean var7 = var5 != null && var5.f();
               boolean var8 = var6 != null && var6.f() && var6.a.i();
               if (var7 || var8) {
                  float var9 = x.c();
                  dev.sixseven.m.c var10 = SixSevenClient.themes().a();
                  dev.sixseven.d.e.c var11 = var1.b;
                  int var12 = var11 != null && !var11.m.i() ? var11.n.i() : var10.a();
                  ArrayList var13 = new ArrayList();
                  if (var7) {
                     double var14 = var5.n.i();
                     double var16 = var14 * var14;
                     float var18 = var5.l.d();
                     float var19 = (float)(var5.m.i() / 100.0);
                     if (var5.a.i()) {
                        U var20 = var1.J;
                        boolean var21 = var20 != null && var20.f();
                        boolean var22 = var5.b.i() && !var2.field_1690.method_31044().method_31034();

                        for (class_742 var24 : var3.method_18456()) {
                           boolean var25 = var24 == var4;
                           if ((!var25 || var22) && !var24.method_7325() && var24.method_5805()) {
                              double var26 = var4.method_5858(var24);
                              if (var25 || !(var26 > var16)) {
                                 String var28 = var24.method_7334().name();
                                 if (var21) {
                                    String var29 = var20.b(var28);
                                    if (var29 != null) {
                                       var28 = var29;
                                    }
                                 }

                                 float var48 = -1.0F;
                                 if (var5.i.i()) {
                                    float var30 = var24.method_6063();
                                    if (var30 > 0.0F) {
                                       var48 = class_3532.method_15363(var24.method_6032() / var30, 0.0F, 1.0F);
                                    }
                                 }

                                 String var49 = !var25 && var5.j.i() ? (int)Math.sqrt(var26) + "m" : null;
                                 if (!var28.isEmpty() || var49 != null || !(var48 < 0.0F)) {
                                    var13.add(a(var24, var9, Math.sqrt(var26), var28, var49, var12, var48, var18, var19));
                                 }
                              }
                           }
                        }
                     }

                     if (var5.c.i()) {
                        for (class_1297 var40 : var3.method_18112()) {
                           if (var40 instanceof class_1542) {
                              class_1542 var41 = (class_1542)var40;
                              if (var41.method_5805()) {
                                 double var43 = var4.method_5858(var41);
                                 if (!(var43 > var16)) {
                                    class_1799 var45 = var41.method_6983();
                                    if (!var45.method_7960()) {
                                       String var46 = a(var45.method_7947(), var5.k.i(), var5.j.i() ? (int)Math.sqrt(var43) + "m" : null);
                                       var13.add(a(var41, var9, Math.sqrt(var43), var45.method_7964().getString(), var46, var12, -1.0F, var18, var19));
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var8) {
                     boolean var31 = var6.d.i();
                     float var15 = (float)(var6.e.i() / 100.0);

                     for (class_2338 var17 : var6.g.a()) {
                        double var37 = (double)var17.method_10263() + 0.5;
                        double var39 = (double)var17.method_10264() + 1.35;
                        double var42 = (double)var17.method_10260() + 0.5;
                        double var44 = var4.method_5649(var37, (double)var17.method_10264() + 0.5, var42);
                        String var47 = var31 ? (int)Math.sqrt(var44) + "m" : null;
                        var13.add(new w.a(Math.sqrt(var44), var37, var39, var42, a(var3, var17), var47, -22733, -1.0F, 1.0F, var15));
                     }
                  }

                  if (!var13.isEmpty()) {
                     var13.sort(Comparator.comparingDouble(w.a::a));
                     int var32 = Math.min(var13.size(), 80);

                     for (int var33 = var32 - 1; var33 >= 0; var33--) {
                        w.a var35 = (w.a)var13.get(var33);
                        float[] var36 = x.a(var35.b, var35.c, var35.d);
                        if (var36 != null) {
                           a(vg, var10, var36[0], var36[1], var35);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static w.a a(class_1297 e, float pt, double dist, String name, String suffix, int accent, float healthFrac, float scale, float opacity) {
      double var10 = class_3532.method_16436((double)pt, e.field_6038, e.method_23317());
      double var12 = class_3532.method_16436((double)pt, e.field_5971, e.method_23318()) + (double)e.method_17682() + 0.5;
      double var14 = class_3532.method_16436((double)pt, e.field_5989, e.method_23321());
      return new w.a(dist, var10, var12, var14, name, suffix, accent, healthFrac, scale, opacity);
   }

   private static String a(int amount, boolean showAmount, String distance) {
      StringBuilder var3 = new StringBuilder();
      if (showAmount && amount > 1) {
         var3.append('x').append(amount);
      }

      if (distance != null) {
         if (var3.length() > 0) {
            var3.append("  ");
         }

         var3.append(distance);
      }

      return var3.length() == 0 ? null : var3.toString();
   }

   private static String a(class_638 level, class_2338 pos) {
      try {
         class_2586 var2 = level.method_8321(pos);
         if (var2 instanceof class_2636 var6) {
            class_1297 var7 = var6.method_11390().method_8283(level, pos);
            return var7 != null ? var7.method_5864().method_5897().getString() + " Spawner" : "Spawner";
         }

         if (var2 instanceof class_8961 var3) {
            class_1297 var4 = var3.method_55150().method_55174().method_55190(var3.method_55150(), level, var3.method_55151());
            return var4 != null ? "Trial: " + var4.method_5864().method_5897().getString() : "Trial Spawner";
         }
      } catch (Exception var5) {
      }

      return "Spawner";
   }

   private static float a(float s, boolean hasHealth) {
      float var2 = 12.5F * s + 3.5F * s * 2.0F;
      return var2 + (hasHealth ? 3.0F * s + 3.5F * s : 0.0F);
   }

   public static void a(class_332 gg) {
      if (x.b()) {
         dev.sixseven.d.d var1 = SixSevenClient.modules();
         if (var1 != null) {
            V var2 = var1.L;
            if (var2 != null && var2.f() && var2.a.i()) {
               boolean var3 = var2.g.i();
               boolean var4 = var2.h.i();
               if (var3 || var4) {
                  class_310 var5 = class_310.method_1551();
                  if (var5.field_1755 == null && !var5.field_1690.field_1842) {
                     class_638 var6 = var5.field_1687;
                     class_746 var7 = var5.field_1724;
                     if (var6 != null && var7 != null) {
                        float var8 = x.c();
                        double var9 = var2.n.i();
                        double var11 = var9 * var9;
                        float var13 = var2.l.d();
                        float var14 = a(var13, var2.i.i());
                        float var15 = t.a();
                        double var16 = (double)var5.method_22683().method_4495();
                        boolean var18 = var2.b.i() && !var5.field_1690.method_31044().method_31034();
                        ArrayList var19 = new ArrayList();

                        for (class_742 var21 : var6.method_18456()) {
                           boolean var22 = var21 == var7;
                           if ((!var22 || var18) && !var21.method_7325() && var21.method_5805() && (var22 || !(var7.method_5858(var21) > var11))) {
                              var19.clear();
                              if (var3) {
                                 a(var19, var21.method_6118(class_1304.field_6169));
                                 a(var19, var21.method_6118(class_1304.field_6174));
                                 a(var19, var21.method_6118(class_1304.field_6172));
                                 a(var19, var21.method_6118(class_1304.field_6166));
                              }

                              if (var4) {
                                 a(var19, var21.method_6047());
                                 a(var19, var21.method_6118(class_1304.field_6171));
                              }

                              if (!var19.isEmpty()) {
                                 double var23 = class_3532.method_16436((double)var8, var21.field_6038, var21.method_23317());
                                 double var25 = class_3532.method_16436((double)var8, var21.field_5971, var21.method_23318())
                                    + (double)var21.method_17682()
                                    + 0.5;
                                 double var27 = class_3532.method_16436((double)var8, var21.field_5989, var21.method_23321());
                                 float[] var29 = x.b(var23, var25, var27);
                                 if (var29 != null) {
                                    float var30 = (float)((double)var29[0] / var16);
                                    float var31 = (float)((double)(var29[1] - var14 * var15) / var16) - 3.0F;
                                    float var32 = 11.0F * var13;
                                    float var33 = var32 + 1.5F;
                                    float var34 = (float)var19.size() * var32 + (float)(var19.size() - 1) * 1.5F;
                                    float var35 = var30 - var34 / 2.0F;
                                    float var36 = var31 - var32;
                                    Matrix3x2fStack var37 = gg.method_51448();

                                    for (int var38 = 0; var38 < var19.size(); var38++) {
                                       class_1799 var39 = (class_1799)var19.get(var38);
                                       var37.pushMatrix();
                                       var37.translate(var35 + (float)var38 * var33, var36);
                                       var37.scale(var32 / 16.0F, var32 / 16.0F);
                                       gg.method_51423(var21, var39, 0, 0, 0);
                                       gg.method_51431(var5.field_1772, var39, 0, 0);
                                       var37.popMatrix();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static void a(List<class_1799> list, class_1799 stack) {
      if (stack != null && !stack.method_7960()) {
         list.add(stack);
      }
   }

   private static void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float uiX, float uiY, w.a tag) {
      float var5 = tag.i;
      int var6 = dev.sixseven.n.c.b(tag.g, 0.35F);
      float var7 = 12.5F * var5;
      float var8 = 10.0F * var5;
      float var9 = 6.0F * var5;
      float var10 = 3.5F * var5;
      float var11 = 5.0F * var5;
      boolean var12 = tag.h >= 0.0F;
      float var13 = 3.0F * var5;
      float var14 = vg.a(tag.e, var7);
      float var15 = tag.f != null ? var11 + vg.a(tag.f, var8) : 0.0F;
      float var16 = var14 + var15 + var9 * 2.0F;
      float var17 = var7 + var10 * 2.0F;
      float var18 = var17 + (var12 ? var13 + var10 : 0.0F);
      float var19 = uiX - var16 / 2.0F;
      float var20 = uiY - var18;
      float var21 = Math.min(6.0F * var5, var18 / 2.0F);
      boolean var22 = tag.j < 0.999F;
      if (var22) {
         vg.e();
         vg.b(tag.j);
      }

      vg.c(var19, var20, var16, var18, var21, 4.0F, dev.sixseven.n.c.a(tag.g, 0.12F));
      vg.a(var19, var20, var16, var18, var21, theme.f(), theme.g(), true);
      float var23 = var20 + var10 + var7 / 2.0F;
      float var24 = var19 + var9;
      var24 += vg.a(tag.e, var24, var23, var7, var6, tag.g);
      if (tag.f != null) {
         var24 += var11;
         vg.a(tag.f, var24, var23, var8, theme.l());
      }

      if (var12) {
         float var25 = var20 + var17;
         float var26 = var19 + var9;
         float var27 = var16 - var9 * 2.0F;
         vg.a(var26, var25, var27, var13, var13 / 2.0F, dev.sixseven.n.c.a(-16777216, 0.55F));
         int var28 = dev.sixseven.n.c.a(-2080450, -11671924, tag.h);
         vg.a(var26, var25, Math.max(var13, var27 * tag.h), var13, var13 / 2.0F, var28);
      }

      if (var22) {
         vg.f();
      }
   }

   private static record a(double a, double b, double c, double d, String e, String f, int g, float h, float i, float j) {
   }
}
