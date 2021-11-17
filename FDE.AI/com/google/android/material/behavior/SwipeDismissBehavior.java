package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.LozNPPdAO;
import con.VCCyeOu6I;
import con.t0Jbif9Ya;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.mhl5lIdbQ {
    public boolean J4Ux7ym32;
    public LozNPPdAO q3BipwRCk;
    public int tGV7Q6urW = 2;
    public float dIocxURUo = 0.5f;
    public float kCA6Zs9sL = 0.0f;
    public float iiGwOFFnr = 0.5f;
    public final LozNPPdAO.RG2GI7LDp GPLPRo6go = new RG2GI7LDp();

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends LozNPPdAO.RG2GI7LDp {
        public int J4Ux7ym32 = -1;
        public int q3BipwRCk;

        public RG2GI7LDp() {
            SwipeDismissBehavior.this = r1;
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public void GPLPRo6go(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.kCA6Zs9sL) + ((float) this.q3BipwRCk);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.iiGwOFFnr) + ((float) this.q3BipwRCk);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.dXrmkklc8(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public int J4Ux7ym32(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.q3BipwRCk) >= java.lang.Math.round(((float) r8.getWidth()) * com.google.android.material.behavior.SwipeDismissBehavior.this.dIocxURUo)) goto L_0x002c;
         */
        @Override // con.LozNPPdAO.RG2GI7LDp
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void Puu3Rhg4F(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.J4Ux7ym32 = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003c
                java.util.WeakHashMap r4 = con.IuQbWntsc.q3BipwRCk
                int r4 = con.RBJDIwG1D.dIocxURUo(r8)
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.tGV7Q6urW
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x002c
            L_0x0021:
                if (r5 != 0) goto L_0x0030
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x002a:
                if (r1 <= 0) goto L_0x002e
            L_0x002c:
                r9 = r2
                goto L_0x0058
            L_0x002e:
                r9 = r3
                goto L_0x0058
            L_0x0030:
                if (r5 != r2) goto L_0x002e
                if (r4 == 0) goto L_0x0037
                if (r1 <= 0) goto L_0x002e
                goto L_0x003b
            L_0x0037:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
            L_0x003b:
                goto L_0x002c
            L_0x003c:
                int r9 = r8.getLeft()
                int r0 = r7.q3BipwRCk
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.dIocxURUo
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002e
                goto L_0x002c
            L_0x0058:
                if (r9 == 0) goto L_0x0066
                int r9 = r8.getLeft()
                int r0 = r7.q3BipwRCk
                if (r9 >= r0) goto L_0x0064
                int r0 = r0 - r10
                goto L_0x0069
            L_0x0064:
                int r0 = r0 + r10
                goto L_0x0069
            L_0x0066:
                int r0 = r7.q3BipwRCk
                r2 = r3
            L_0x0069:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                con.LozNPPdAO r9 = r9.q3BipwRCk
                int r10 = r8.getTop()
                boolean r9 = r9.dXrmkklc8(r0, r10)
                if (r9 == 0) goto L_0x0084
                com.google.android.material.behavior.SwipeDismissBehavior$mhl5lIdbQ r9 = new com.google.android.material.behavior.SwipeDismissBehavior$mhl5lIdbQ
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap r10 = con.IuQbWntsc.q3BipwRCk
                con.VCCyeOu6I.kmSgne1rO(r8, r9)
                goto L_0x008b
            L_0x0084:
                if (r2 == 0) goto L_0x008b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.RG2GI7LDp.Puu3Rhg4F(android.view.View, float, float):void");
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public void iiGwOFFnr(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public void kCA6Zs9sL(View view, int i) {
            this.J4Ux7ym32 = i;
            this.q3BipwRCk = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            r5 = r2.q3BipwRCk;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
            if (r5 != false) goto L_0x001e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r5 != false) goto L_0x0014;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
            r5 = r2.q3BipwRCk - r3.getWidth();
            r3 = r2.q3BipwRCk;
         */
        @Override // con.LozNPPdAO.RG2GI7LDp
        /* Code decompiled incorrectly, please refer to instructions dump */
        public int q3BipwRCk(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.WeakHashMap r5 = con.IuQbWntsc.q3BipwRCk
                int r5 = con.RBJDIwG1D.dIocxURUo(r3)
                r0 = 1
                if (r5 != r0) goto L_0x000b
                r5 = r0
                goto L_0x000c
            L_0x000b:
                r5 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.tGV7Q6urW
                if (r1 != 0) goto L_0x0026
                if (r5 == 0) goto L_0x001e
            L_0x0014:
                int r5 = r2.q3BipwRCk
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.q3BipwRCk
                goto L_0x0039
            L_0x001e:
                int r5 = r2.q3BipwRCk
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0039
            L_0x0026:
                if (r1 != r0) goto L_0x002b
                if (r5 == 0) goto L_0x0014
                goto L_0x001e
            L_0x002b:
                int r5 = r2.q3BipwRCk
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.q3BipwRCk
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0039:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.RG2GI7LDp.q3BipwRCk(android.view.View, int, int):int");
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public int tGV7Q6urW(View view) {
            return view.getWidth();
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public boolean yWvV4ePLl(View view, int i) {
            int i2 = this.J4Ux7ym32;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.Eeka1udhb(view);
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements Runnable {
        public final View CBQ5d1kRq;
        public final boolean kmSgne1rO;

        public mhl5lIdbQ(View view, boolean z) {
            SwipeDismissBehavior.this = r1;
            this.CBQ5d1kRq = view;
            this.kmSgne1rO = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            LozNPPdAO lozNPPdAO = SwipeDismissBehavior.this.q3BipwRCk;
            if (lozNPPdAO != null && lozNPPdAO.yWvV4ePLl(true)) {
                View view = this.CBQ5d1kRq;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.kmSgne1rO(view, this);
            } else if (this.kmSgne1rO) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    public static float dXrmkklc8(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public boolean Eeka1udhb(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean GPLPRo6go(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.J4Ux7ym32;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.PSTqBLTET(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.J4Ux7ym32 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.J4Ux7ym32 = false;
        }
        if (!z) {
            return false;
        }
        if (this.q3BipwRCk == null) {
            this.q3BipwRCk = new LozNPPdAO(coordinatorLayout.getContext(), coordinatorLayout, this.GPLPRo6go);
        }
        return this.q3BipwRCk.RG6kpfv3v(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (VCCyeOu6I.tGV7Q6urW(view) == 0) {
            VCCyeOu6I.Eeka1udhb(view, 1);
            IuQbWntsc.kmSgne1rO(1048576, view);
            IuQbWntsc.oon79WMrY(view, 0);
            if (Eeka1udhb(view)) {
                IuQbWntsc.Bhmn1KIah(view, IqwHQ6O2l.RG2GI7LDp.CBQ5d1kRq, null, new t0Jbif9Ya(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean qVUwofr5s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        LozNPPdAO lozNPPdAO = this.q3BipwRCk;
        if (lozNPPdAO == null) {
            return false;
        }
        lozNPPdAO.Bhmn1KIah(motionEvent);
        return true;
    }
}
