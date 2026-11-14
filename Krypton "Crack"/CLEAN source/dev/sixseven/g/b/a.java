package dev.sixseven.g.b;

import org.lwjgl.opengl.GL33C;

public final class a {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   private int x;
   private boolean y;
   private boolean z;
   private boolean A;
   private boolean B;
   private boolean C;
   private boolean D;
   private final int[] E = new int[4];
   private final int[] F = new int[4];
   private final boolean[] G = new boolean[4];
   private int H;
   private int I;
   private int J;
   private int K;

   private a() {
   }

   public static a a() {
      a var0 = new a();
      var0.a = GL33C.glGetInteger(35725);
      var0.b = GL33C.glGetInteger(34229);
      var0.c = GL33C.glGetInteger(34964);
      var0.d = GL33C.glGetInteger(35368);
      var0.e = GL33C.glGetIntegeri(35368, 0);
      var0.f = GL33C.glGetInteger(34016);
      GL33C.glActiveTexture(33984);
      var0.g = GL33C.glGetInteger(32873);
      var0.h = GL33C.glGetInteger(35097);
      GL33C.glBindSampler(0, 0);
      GL33C.glActiveTexture(var0.f);
      var0.y = GL33C.glIsEnabled(3042);
      var0.i = GL33C.glGetInteger(32969);
      var0.j = GL33C.glGetInteger(32968);
      var0.k = GL33C.glGetInteger(32971);
      var0.l = GL33C.glGetInteger(32970);
      var0.m = GL33C.glGetInteger(32777);
      var0.n = GL33C.glGetInteger(34877);
      var0.z = GL33C.glIsEnabled(2884);
      var0.o = GL33C.glGetInteger(2885);
      var0.p = GL33C.glGetInteger(2886);
      var0.A = GL33C.glIsEnabled(2929);
      var0.q = GL33C.glGetInteger(2932);
      var0.D = GL33C.glGetBoolean(2930);
      var0.B = GL33C.glIsEnabled(3089);
      var0.C = GL33C.glIsEnabled(2960);
      var0.r = GL33C.glGetInteger(2962);
      var0.s = GL33C.glGetInteger(2967);
      var0.t = GL33C.glGetInteger(2963);
      var0.u = GL33C.glGetInteger(2968);
      var0.v = GL33C.glGetInteger(2964);
      var0.w = GL33C.glGetInteger(2965);
      var0.x = GL33C.glGetInteger(2966);
      GL33C.glGetIntegerv(2978, var0.E);
      GL33C.glGetIntegerv(3088, var0.F);
      int[] var1 = new int[4];
      GL33C.glGetIntegerv(3107, var1);

      for (int var2 = 0; var2 < 4; var2++) {
         var0.G[var2] = var1[var2] != 0;
      }

      var0.H = GL33C.glGetInteger(3317);
      var0.I = GL33C.glGetInteger(3314);
      var0.J = GL33C.glGetInteger(3316);
      var0.K = GL33C.glGetInteger(3315);
      return var0;
   }

   public void b() {
      GL33C.glUseProgram(this.a);
      GL33C.glBindVertexArray(this.b);
      GL33C.glBindBuffer(34962, this.c);
      GL33C.glBindBufferBase(35345, 0, this.e);
      GL33C.glBindBuffer(35345, this.d);
      GL33C.glActiveTexture(33984);
      GL33C.glBindTexture(3553, this.g);
      GL33C.glBindSampler(0, this.h);
      GL33C.glActiveTexture(this.f);
      a(3042, this.y);
      GL33C.glBlendFuncSeparate(this.i, this.j, this.k, this.l);
      GL33C.glBlendEquationSeparate(this.m, this.n);
      a(2884, this.z);
      GL33C.glCullFace(this.o);
      GL33C.glFrontFace(this.p);
      a(2929, this.A);
      GL33C.glDepthFunc(this.q);
      GL33C.glDepthMask(this.D);
      a(3089, this.B);
      a(2960, this.C);
      GL33C.glStencilFunc(this.r, this.s, this.t);
      GL33C.glStencilMask(this.u);
      GL33C.glStencilOp(this.v, this.w, this.x);
      GL33C.glViewport(this.E[0], this.E[1], this.E[2], this.E[3]);
      GL33C.glScissor(this.F[0], this.F[1], this.F[2], this.F[3]);
      GL33C.glColorMask(this.G[0], this.G[1], this.G[2], this.G[3]);
      GL33C.glPixelStorei(3317, this.H);
      GL33C.glPixelStorei(3314, this.I);
      GL33C.glPixelStorei(3316, this.J);
      GL33C.glPixelStorei(3315, this.K);
   }

   private static void a(int cap, boolean enabled) {
      if (enabled) {
         GL33C.glEnable(cap);
      } else {
         GL33C.glDisable(cap);
      }
   }
}
