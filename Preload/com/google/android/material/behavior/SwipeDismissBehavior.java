package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.LozNPPdAO;
import con.RBJDIwG1D;
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
        public void Puu3Rhg4F(View view, float f, float f2) {
            boolean z;
            int i;
            this.J4Ux7ym32 = -1;
            int width = view.getWidth();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            boolean z2 = true;
            if (i2 != 0) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                boolean z3 = RBJDIwG1D.dIocxURUo(view) == 1;
                int i3 = SwipeDismissBehavior.this.tGV7Q6urW;
                if (i3 != 2) {
                    z = i3 == 0 ? false : false;
                }
                z = true;
            }
            if (z) {
                int left = view.getLeft();
                int i4 = this.q3BipwRCk;
                i = left < i4 ? i4 - width : i4 + width;
            } else {
                i = this.q3BipwRCk;
                z2 = false;
            }
            if (SwipeDismissBehavior.this.q3BipwRCk.dXrmkklc8(i, view.getTop())) {
                mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ(view, z2);
                WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.kmSgne1rO(view, mhl5lidbq);
            } else if (z2) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
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
        public int q3BipwRCk(View view, int i, int i2) {
            int i3;
            int i4;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            boolean z = RBJDIwG1D.dIocxURUo(view) == 1;
            int i5 = SwipeDismissBehavior.this.tGV7Q6urW;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.q3BipwRCk - view.getWidth();
                    i4 = view.getWidth() + this.q3BipwRCk;
                }
            }
            return Math.min(Math.max(i3, i), i4);
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
