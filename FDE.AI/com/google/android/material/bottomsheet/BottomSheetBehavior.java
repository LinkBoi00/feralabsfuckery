package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.IiuvtKLs8;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.JeqVtUN4T;
import con.LozNPPdAO;
import con.McxhmydD3;
import con.MpWGGr5NA;
import con.Pb0Tfh98F;
import con.PlegqbMSA;
import con.PmanMZxiM;
import con.RBJDIwG1D;
import con.RisoK3egD;
import con.VCCyeOu6I;
import con.Zgs44gQcc;
import con.anXlDk6fV;
import con.cyVJjwbRF;
import con.dOSsQaJVg;
import con.jSmvdSgdz;
import con.mJLaJepZo;
import con.mN6fklC4R;
import con.vya5QgxbR;
import con.xT3tobMV0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.mhl5lIdbQ {
    public int AqaWJg0b4;
    public boolean Bhmn1KIah;
    public int CBQ5d1kRq;
    public boolean CpG0imbht;
    public WeakReference EBQXiIPmm;
    public int Eeka1udhb;
    public int GPLPRo6go;
    public float IytU16YUK;
    public boolean J4Ux7ym32;
    public boolean L4EwGfXiQ;
    public boolean MzoOEjc4X;
    public boolean NyWTwPF6V;
    public boolean PSTqBLTET;
    public boolean Puu3Rhg4F;
    public int QNqj6nIzv;
    public int QSbMsHU5X;
    public boolean RG6kpfv3v;
    public final ArrayList TyB1UUd72;
    public int V9LQMKGJe;
    public int WaUP0CF08;
    public int cAwN510t2;
    public int dIocxURUo;
    public xT3tobMV0 dXrmkklc8;
    public int dfpT1j18n;
    public boolean i0Zug1mVk;
    public int i8XZMQc6Z;
    public float iMyQMM6Qj;
    public WeakReference igRQEZxnW;
    public int iiGwOFFnr;
    public boolean ilHKhw3Yw;
    public s7MlVynBG ixWaw2akD;
    public int j22ftfeNI;
    public VelocityTracker juJ6pnCpu;
    public boolean kCA6Zs9sL;
    public boolean kmSgne1rO;
    public LozNPPdAO mUqPm6GBh;
    public boolean nlGCs0NZs;
    public int o4LF8RkoQ;
    public int oon79WMrY;
    public int q3BipwRCk;
    public boolean qFBXIgpia;
    public int qVUwofr5s;
    public ValueAnimator sk5s77z6Q;
    public float tGV7Q6urW;
    public int vNtjxmzUM;
    public int vPSbyrYWX;
    public final LozNPPdAO.RG2GI7LDp wIZEdYHUn;
    public dOSsQaJVg yWvV4ePLl;
    public Map zHl31GGXU;
    public int ziwPzaoF3;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Runnable {
        public final /* synthetic */ View CBQ5d1kRq;
        public final /* synthetic */ int kmSgne1rO;

        public RG2GI7LDp(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.CBQ5d1kRq = view;
            this.kmSgne1rO = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.nlGCs0NZs(this.CBQ5d1kRq, this.kmSgne1rO);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class aXI58Y1kr {
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends LozNPPdAO.RG2GI7LDp {
        public mhl5lIdbQ() {
            BottomSheetBehavior.this = r1;
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public void GPLPRo6go(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.ixWaw2akD(i2);
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public int J4Ux7ym32(View view, int i, int i2) {
            int i8XZMQc6Z = BottomSheetBehavior.this.i8XZMQc6Z();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return BBVaGLNaU.GPLPRo6go(i, i8XZMQc6Z, bottomSheetBehavior.CpG0imbht ? bottomSheetBehavior.QNqj6nIzv : bottomSheetBehavior.cAwN510t2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.i8XZMQc6Z()) < java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.dfpT1j18n)) goto L_0x008e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.i8XZMQc6Z();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
            if (java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.dfpT1j18n) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.cAwN510t2)) goto L_0x00c9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.cAwN510t2)) goto L_0x008e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
            if (java.lang.Math.abs(r9 - r0) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.cAwN510t2)) goto L_0x00c9;
         */
        @Override // con.LozNPPdAO.RG2GI7LDp
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void Puu3Rhg4F(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 290
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mhl5lIdbQ.Puu3Rhg4F(android.view.View, float, float):void");
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public int dIocxURUo(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.CpG0imbht ? bottomSheetBehavior.QNqj6nIzv : bottomSheetBehavior.cAwN510t2;
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public void iiGwOFFnr(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.nlGCs0NZs) {
                    bottomSheetBehavior.qFBXIgpia(1);
                }
            }
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public int q3BipwRCk(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // con.LozNPPdAO.RG2GI7LDp
        public boolean yWvV4ePLl(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.AqaWJg0b4;
            if (i2 == 1 || bottomSheetBehavior.L4EwGfXiQ) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.j22ftfeNI == i) {
                WeakReference weakReference = bottomSheetBehavior.EBQXiIPmm;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.igRQEZxnW;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes.dex */
    public static class qhPEQQaQ4 extends con.s7MlVynBG {
        public static final Parcelable.Creator<qhPEQQaQ4> CREATOR = new jSmvdSgdz(2);
        public final int Bhmn1KIah;
        public boolean MzoOEjc4X;
        public int PSTqBLTET;
        public boolean ilHKhw3Yw;
        public boolean qVUwofr5s;

        public qhPEQQaQ4(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Bhmn1KIah = parcel.readInt();
            this.PSTqBLTET = parcel.readInt();
            boolean z = false;
            this.MzoOEjc4X = parcel.readInt() == 1;
            this.ilHKhw3Yw = parcel.readInt() == 1;
            this.qVUwofr5s = parcel.readInt() == 1 ? true : z;
        }

        public qhPEQQaQ4(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.Bhmn1KIah = bottomSheetBehavior.AqaWJg0b4;
            this.PSTqBLTET = bottomSheetBehavior.dIocxURUo;
            this.MzoOEjc4X = bottomSheetBehavior.J4Ux7ym32;
            this.ilHKhw3Yw = bottomSheetBehavior.CpG0imbht;
            this.qVUwofr5s = bottomSheetBehavior.qFBXIgpia;
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            parcel.writeInt(this.Bhmn1KIah);
            parcel.writeInt(this.PSTqBLTET);
            parcel.writeInt(this.MzoOEjc4X ? 1 : 0);
            parcel.writeInt(this.ilHKhw3Yw ? 1 : 0);
            parcel.writeInt(this.qVUwofr5s ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class s7MlVynBG implements Runnable {
        public int Bhmn1KIah;
        public final View CBQ5d1kRq;
        public boolean kmSgne1rO;

        public s7MlVynBG(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.CBQ5d1kRq = view;
            this.Bhmn1KIah = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            LozNPPdAO lozNPPdAO = BottomSheetBehavior.this.mUqPm6GBh;
            if (lozNPPdAO == null || !lozNPPdAO.yWvV4ePLl(true)) {
                BottomSheetBehavior.this.qFBXIgpia(this.Bhmn1KIah);
            } else {
                View view = this.CBQ5d1kRq;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.kmSgne1rO(view, this);
            }
            this.kmSgne1rO = false;
        }
    }

    public BottomSheetBehavior() {
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = true;
        this.oon79WMrY = -1;
        this.vPSbyrYWX = -1;
        this.ixWaw2akD = null;
        this.iMyQMM6Qj = 0.5f;
        this.IytU16YUK = -1.0f;
        this.nlGCs0NZs = true;
        this.AqaWJg0b4 = 4;
        this.TyB1UUd72 = new ArrayList();
        this.ziwPzaoF3 = -1;
        this.wIZEdYHUn = new mhl5lIdbQ();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = true;
        this.oon79WMrY = -1;
        this.vPSbyrYWX = -1;
        this.ixWaw2akD = null;
        this.iMyQMM6Qj = 0.5f;
        this.IytU16YUK = -1.0f;
        this.nlGCs0NZs = true;
        this.AqaWJg0b4 = 4;
        this.TyB1UUd72 = new ArrayList();
        this.ziwPzaoF3 = -1;
        this.wIZEdYHUn = new mhl5lIdbQ();
        this.GPLPRo6go = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.q3BipwRCk);
        this.Puu3Rhg4F = obtainStyledAttributes.hasValue(17);
        int i3 = 3;
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            RG6kpfv3v(context, attributeSet, hasValue, anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 3));
        } else {
            RG6kpfv3v(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.sk5s77z6Q = ofFloat;
        ofFloat.setDuration(500L);
        this.sk5s77z6Q.addUpdateListener(new vya5QgxbR(this));
        this.IytU16YUK = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.oon79WMrY = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.vPSbyrYWX = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            IytU16YUK(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            IytU16YUK(i2);
        }
        cAwN510t2(obtainStyledAttributes.getBoolean(8, false));
        this.kmSgne1rO = obtainStyledAttributes.getBoolean(12, false);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.J4Ux7ym32 != z) {
            this.J4Ux7ym32 = z;
            if (this.igRQEZxnW != null) {
                Eeka1udhb();
            }
            qFBXIgpia((!this.J4Ux7ym32 || this.AqaWJg0b4 != 6) ? this.AqaWJg0b4 : i3);
            vNtjxmzUM();
        }
        this.qFBXIgpia = obtainStyledAttributes.getBoolean(11, false);
        this.nlGCs0NZs = obtainStyledAttributes.getBoolean(4, true);
        this.q3BipwRCk = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.iMyQMM6Qj = f;
        if (this.igRQEZxnW != null) {
            this.dfpT1j18n = (int) ((1.0f - f) * ((float) this.QNqj6nIzv));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            i = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (i < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            i = peekValue2.data;
            if (i < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.WaUP0CF08 = i;
        this.Bhmn1KIah = obtainStyledAttributes.getBoolean(13, false);
        this.PSTqBLTET = obtainStyledAttributes.getBoolean(14, false);
        this.MzoOEjc4X = obtainStyledAttributes.getBoolean(15, false);
        this.ilHKhw3Yw = obtainStyledAttributes.getBoolean(16, true);
        obtainStyledAttributes.recycle();
        this.tGV7Q6urW = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void AqaWJg0b4(int i) {
        View view = (View) this.igRQEZxnW.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (mN6fklC4R.J4Ux7ym32(view)) {
                    view.post(new RG2GI7LDp(view, i));
                    return;
                }
            }
            nlGCs0NZs(view, i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void Bhmn1KIah(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) parcelable;
        int i = this.q3BipwRCk;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.dIocxURUo = qhpeqqaq4.PSTqBLTET;
            }
            if (i == -1 || (i & 2) == 2) {
                this.J4Ux7ym32 = qhpeqqaq4.MzoOEjc4X;
            }
            if (i == -1 || (i & 4) == 4) {
                this.CpG0imbht = qhpeqqaq4.ilHKhw3Yw;
            }
            if (i == -1 || (i & 8) == 8) {
                this.qFBXIgpia = qhpeqqaq4.qVUwofr5s;
            }
        }
        int i2 = qhpeqqaq4.Bhmn1KIah;
        if (i2 == 1 || i2 == 2) {
            this.AqaWJg0b4 = 4;
        } else {
            this.AqaWJg0b4 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void CBQ5d1kRq(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public void CpG0imbht(int i) {
        if (i != this.AqaWJg0b4) {
            if (this.igRQEZxnW != null) {
                AqaWJg0b4(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.CpG0imbht && i == 5)) {
                this.AqaWJg0b4 = i;
            }
        }
    }

    public final void Eeka1udhb() {
        int dXrmkklc8 = dXrmkklc8();
        if (this.J4Ux7ym32) {
            this.cAwN510t2 = Math.max(this.QNqj6nIzv - dXrmkklc8, this.i8XZMQc6Z);
        } else {
            this.cAwN510t2 = this.QNqj6nIzv - dXrmkklc8;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean GPLPRo6go(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        LozNPPdAO lozNPPdAO;
        if (!view.isShown() || !this.nlGCs0NZs) {
            this.NyWTwPF6V = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.j22ftfeNI = -1;
            VelocityTracker velocityTracker = this.juJ6pnCpu;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.juJ6pnCpu = null;
            }
        }
        if (this.juJ6pnCpu == null) {
            this.juJ6pnCpu = VelocityTracker.obtain();
        }
        this.juJ6pnCpu.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.QSbMsHU5X = (int) motionEvent.getY();
            if (this.AqaWJg0b4 != 2) {
                WeakReference weakReference = this.EBQXiIPmm;
                View view3 = weakReference != null ? (View) weakReference.get() : null;
                if (view3 != null && coordinatorLayout.PSTqBLTET(view3, x, this.QSbMsHU5X)) {
                    this.j22ftfeNI = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.L4EwGfXiQ = true;
                }
            }
            this.NyWTwPF6V = this.j22ftfeNI == -1 && !coordinatorLayout.PSTqBLTET(view, x, this.QSbMsHU5X);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.L4EwGfXiQ = false;
            this.j22ftfeNI = -1;
            if (this.NyWTwPF6V) {
                this.NyWTwPF6V = false;
                return false;
            }
        }
        if (!this.NyWTwPF6V && (lozNPPdAO = this.mUqPm6GBh) != null && lozNPPdAO.RG6kpfv3v(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.EBQXiIPmm;
        if (weakReference2 != null) {
            view2 = (View) weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.NyWTwPF6V && this.AqaWJg0b4 != 1 && !coordinatorLayout.PSTqBLTET(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.mUqPm6GBh != null && Math.abs(((float) this.QSbMsHU5X) - motionEvent.getY()) > ((float) this.mUqPm6GBh.J4Ux7ym32);
    }

    public void IytU16YUK(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.kCA6Zs9sL) {
                this.kCA6Zs9sL = true;
            }
            z = false;
        } else {
            if (this.kCA6Zs9sL || this.dIocxURUo != i) {
                this.kCA6Zs9sL = false;
                this.dIocxURUo = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            V9LQMKGJe(false);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean MzoOEjc4X(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.vNtjxmzUM = 0;
        this.i0Zug1mVk = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0.dXrmkklc8(r5.getLeft(), r7) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void NyWTwPF6V(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            con.LozNPPdAO r0 = r4.mUqPm6GBh
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r8 == 0) goto L_0x0013
            int r8 = r5.getLeft()
            boolean r7 = r0.dXrmkklc8(r8, r7)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0013:
            int r8 = r5.getLeft()
            r0.qVUwofr5s = r5
            r3 = -1
            r0.tGV7Q6urW = r3
            boolean r7 = r0.CBQ5d1kRq(r8, r7, r2, r2)
            if (r7 != 0) goto L_0x002d
            int r8 = r0.q3BipwRCk
            if (r8 != 0) goto L_0x002d
            android.view.View r8 = r0.qVUwofr5s
            if (r8 == 0) goto L_0x002d
            r8 = 0
            r0.qVUwofr5s = r8
        L_0x002d:
            if (r7 == 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0056
            r7 = 2
            r4.qFBXIgpia(r7)
            r4.i0Zug1mVk(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior$s7MlVynBG r7 = r4.ixWaw2akD
            if (r7 != 0) goto L_0x0044
            com.google.android.material.bottomsheet.BottomSheetBehavior$s7MlVynBG r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$s7MlVynBG
            r7.<init>(r5, r6)
            r4.ixWaw2akD = r7
        L_0x0044:
            com.google.android.material.bottomsheet.BottomSheetBehavior$s7MlVynBG r7 = r4.ixWaw2akD
            boolean r8 = r7.kmSgne1rO
            r7.Bhmn1KIah = r6
            if (r8 != 0) goto L_0x0059
            java.util.WeakHashMap r6 = con.IuQbWntsc.q3BipwRCk
            con.VCCyeOu6I.kmSgne1rO(r5, r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior$s7MlVynBG r5 = r4.ixWaw2akD
            r5.kmSgne1rO = r1
            goto L_0x0059
        L_0x0056:
            r4.qFBXIgpia(r6)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.NyWTwPF6V(android.view.View, int, int, boolean):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public Parcelable PSTqBLTET(CoordinatorLayout coordinatorLayout, View view) {
        return new qhPEQQaQ4(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        dOSsQaJVg dossqajvg;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (VCCyeOu6I.J4Ux7ym32(coordinatorLayout) && !VCCyeOu6I.J4Ux7ym32(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.igRQEZxnW == null) {
            this.iiGwOFFnr = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = Build.VERSION.SDK_INT >= 29 && !this.kmSgne1rO && !this.kCA6Zs9sL;
            if (this.Bhmn1KIah || this.PSTqBLTET || this.MzoOEjc4X || z) {
                mJLaJepZo.RG6kpfv3v(view, new PlegqbMSA(new IiuvtKLs8(this, z), new McxhmydD3(RBJDIwG1D.iiGwOFFnr(view), view.getPaddingTop(), RBJDIwG1D.kCA6Zs9sL(view), view.getPaddingBottom())));
                if (mN6fklC4R.J4Ux7ym32(view)) {
                    cyVJjwbRF.tGV7Q6urW(view);
                } else {
                    view.addOnAttachStateChangeListener(new JeqVtUN4T());
                }
            }
            this.igRQEZxnW = new WeakReference(view);
            if (this.Puu3Rhg4F && (dossqajvg = this.yWvV4ePLl) != null) {
                VCCyeOu6I.ilHKhw3Yw(view, dossqajvg);
            }
            dOSsQaJVg dossqajvg2 = this.yWvV4ePLl;
            if (dossqajvg2 != null) {
                float f = this.IytU16YUK;
                if (f == -1.0f) {
                    f = mJLaJepZo.yWvV4ePLl(view);
                }
                dossqajvg2.PSTqBLTET(f);
                boolean z2 = this.AqaWJg0b4 == 3;
                this.RG6kpfv3v = z2;
                this.yWvV4ePLl.ilHKhw3Yw(z2 ? 0.0f : 1.0f);
            }
            vNtjxmzUM();
            if (VCCyeOu6I.tGV7Q6urW(view) == 0) {
                VCCyeOu6I.Eeka1udhb(view, 1);
            }
        }
        if (this.mUqPm6GBh == null) {
            this.mUqPm6GBh = new LozNPPdAO(coordinatorLayout.getContext(), coordinatorLayout, this.wIZEdYHUn);
        }
        int top = view.getTop();
        coordinatorLayout.ilHKhw3Yw(view, i);
        this.V9LQMKGJe = coordinatorLayout.getWidth();
        this.QNqj6nIzv = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.o4LF8RkoQ = height;
        int i3 = this.QNqj6nIzv;
        int i4 = i3 - height;
        int i5 = this.Eeka1udhb;
        if (i4 < i5) {
            if (this.ilHKhw3Yw) {
                this.o4LF8RkoQ = i3;
            } else {
                this.o4LF8RkoQ = i3 - i5;
            }
        }
        this.i8XZMQc6Z = Math.max(0, i3 - this.o4LF8RkoQ);
        this.dfpT1j18n = (int) ((1.0f - this.iMyQMM6Qj) * ((float) this.QNqj6nIzv));
        Eeka1udhb();
        int i6 = this.AqaWJg0b4;
        if (i6 == 3) {
            i2 = i8XZMQc6Z();
        } else if (i6 == 6) {
            i2 = this.dfpT1j18n;
        } else if (this.CpG0imbht && i6 == 5) {
            i2 = this.QNqj6nIzv;
        } else if (i6 == 4) {
            i2 = this.cAwN510t2;
        } else {
            if (i6 == 1 || i6 == 2) {
                view.offsetTopAndBottom(top - view.getTop());
            }
            this.EBQXiIPmm = new WeakReference(sk5s77z6Q(view));
            return true;
        }
        view.offsetTopAndBottom(i2);
        this.EBQXiIPmm = new WeakReference(sk5s77z6Q(view));
        return true;
    }

    public final void RG6kpfv3v(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.Puu3Rhg4F) {
            this.dXrmkklc8 = xT3tobMV0.J4Ux7ym32(context, attributeSet, R.attr.bottomSheetStyle, 2131821353).q3BipwRCk();
            dOSsQaJVg dossqajvg = new dOSsQaJVg(this.dXrmkklc8);
            this.yWvV4ePLl = dossqajvg;
            dossqajvg.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(context);
            dossqajvg.sk5s77z6Q();
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.yWvV4ePLl.setTint(typedValue.data);
                return;
            }
            this.yWvV4ePLl.MzoOEjc4X(colorStateList);
        }
    }

    public final void V9LQMKGJe(boolean z) {
        View view;
        if (this.igRQEZxnW != null) {
            Eeka1udhb();
            if (this.AqaWJg0b4 == 4 && (view = (View) this.igRQEZxnW.get()) != null) {
                if (z) {
                    AqaWJg0b4(this.AqaWJg0b4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public final int WaUP0CF08(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public void cAwN510t2(boolean z) {
        if (this.CpG0imbht != z) {
            this.CpG0imbht = z;
            if (!z && this.AqaWJg0b4 == 5) {
                CpG0imbht(4);
            }
            vNtjxmzUM();
        }
    }

    public final int dXrmkklc8() {
        int i;
        return this.kCA6Zs9sL ? Math.min(Math.max(this.iiGwOFFnr, this.QNqj6nIzv - ((this.V9LQMKGJe * 9) / 16)), this.o4LF8RkoQ) + this.qVUwofr5s : (this.kmSgne1rO || this.Bhmn1KIah || (i = this.CBQ5d1kRq) <= 0) ? this.dIocxURUo + this.qVUwofr5s : Math.max(this.dIocxURUo, i + this.GPLPRo6go);
    }

    public int dfpT1j18n() {
        if (this.kCA6Zs9sL) {
            return -1;
        }
        return this.dIocxURUo;
    }

    public final void i0Zug1mVk(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.RG6kpfv3v != z) {
                this.RG6kpfv3v = z;
                if (this.yWvV4ePLl != null && (valueAnimator = this.sk5s77z6Q) != null) {
                    if (valueAnimator.isRunning()) {
                        this.sk5s77z6Q.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.sk5s77z6Q.setFloatValues(1.0f - f, f);
                    this.sk5s77z6Q.start();
                }
            }
        }
    }

    public int i8XZMQc6Z() {
        if (this.J4Ux7ym32) {
            return this.i8XZMQc6Z;
        }
        return Math.max(this.WaUP0CF08, this.ilHKhw3Yw ? 0 : this.Eeka1udhb);
    }

    public final void iMyQMM6Qj(View view, IqwHQ6O2l.RG2GI7LDp rG2GI7LDp, int i) {
        IuQbWntsc.Bhmn1KIah(view, rG2GI7LDp, null, new MpWGGr5NA(this, i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void iiGwOFFnr() {
        this.igRQEZxnW = null;
        this.mUqPm6GBh = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r4 > r6) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (java.lang.Math.abs(r4 - r3.i8XZMQc6Z) < java.lang.Math.abs(r4 - r3.cAwN510t2)) goto L_0x0075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.cAwN510t2)) goto L_0x0086;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        r4 = i8XZMQc6Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.cAwN510t2)) goto L_0x00b5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (java.lang.Math.abs(r4 - r3.dfpT1j18n) < java.lang.Math.abs(r4 - r3.cAwN510t2)) goto L_0x00b5;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void ilHKhw3Yw(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.i8XZMQc6Z()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.qFBXIgpia(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference r4 = r3.EBQXiIPmm
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00c3
            boolean r4 = r3.i0Zug1mVk
            if (r4 != 0) goto L_0x001f
            goto L_0x00c3
        L_0x001f:
            int r4 = r3.vNtjxmzUM
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0034
            boolean r4 = r3.J4Ux7ym32
            if (r4 == 0) goto L_0x002a
            goto L_0x0075
        L_0x002a:
            int r4 = r5.getTop()
            int r6 = r3.dfpT1j18n
            if (r4 <= r6) goto L_0x0086
            goto L_0x00b7
        L_0x0034:
            boolean r4 = r3.CpG0imbht
            if (r4 == 0) goto L_0x0058
            android.view.VelocityTracker r4 = r3.juJ6pnCpu
            if (r4 != 0) goto L_0x003e
            r4 = 0
            goto L_0x004d
        L_0x003e:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.tGV7Q6urW
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.juJ6pnCpu
            int r1 = r3.j22ftfeNI
            float r4 = r4.getYVelocity(r1)
        L_0x004d:
            boolean r4 = r3.mUqPm6GBh(r5, r4)
            if (r4 == 0) goto L_0x0058
            int r4 = r3.QNqj6nIzv
            r0 = 5
            goto L_0x00bd
        L_0x0058:
            int r4 = r3.vNtjxmzUM
            if (r4 != 0) goto L_0x009b
            int r4 = r5.getTop()
            boolean r1 = r3.J4Ux7ym32
            if (r1 == 0) goto L_0x0078
            int r7 = r3.i8XZMQc6Z
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.cAwN510t2
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x00ba
        L_0x0075:
            int r4 = r3.i8XZMQc6Z
            goto L_0x00bd
        L_0x0078:
            int r1 = r3.dfpT1j18n
            if (r4 >= r1) goto L_0x008b
            int r6 = r3.cAwN510t2
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00b5
        L_0x0086:
            int r4 = r3.i8XZMQc6Z()
            goto L_0x00bd
        L_0x008b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.cAwN510t2
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00ba
            goto L_0x00b5
        L_0x009b:
            boolean r4 = r3.J4Ux7ym32
            if (r4 == 0) goto L_0x00a0
            goto L_0x00ba
        L_0x00a0:
            int r4 = r5.getTop()
            int r0 = r3.dfpT1j18n
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.cAwN510t2
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00ba
        L_0x00b5:
            int r6 = r3.dfpT1j18n
        L_0x00b7:
            r4 = r6
            r0 = r7
            goto L_0x00bd
        L_0x00ba:
            int r4 = r3.cAwN510t2
            r0 = r6
        L_0x00bd:
            r6 = 0
            r3.NyWTwPF6V(r5, r0, r4, r6)
            r3.i0Zug1mVk = r6
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.ilHKhw3Yw(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void ixWaw2akD(int i) {
        float f;
        float f2;
        PmanMZxiM pmanMZxiM;
        float f3;
        if (!(((View) this.igRQEZxnW.get()) == null || this.TyB1UUd72.isEmpty())) {
            int i2 = this.cAwN510t2;
            if (i > i2 || i2 == i8XZMQc6Z()) {
                int i3 = this.cAwN510t2;
                f = (float) (i3 - i);
                f2 = (float) (this.QNqj6nIzv - i3);
            } else {
                int i4 = this.cAwN510t2;
                f = (float) (i4 - i);
                f2 = (float) (i4 - i8XZMQc6Z());
            }
            float f4 = f / f2;
            for (int i5 = 0; i5 < this.TyB1UUd72.size(); i5++) {
                Pb0Tfh98F pb0Tfh98F = (Pb0Tfh98F) ((aXI58Y1kr) this.TyB1UUd72.get(i5));
                if (pb0Tfh98F.q3BipwRCk.AqaWJg0b4 != 5) {
                    float f5 = Float.isNaN(f4) ? 0.0f : f4;
                    if (f5 > 0.0f) {
                        float abs = Math.abs(f5) * ((float) pb0Tfh98F.q3BipwRCk.dfpT1j18n());
                        pmanMZxiM = pb0Tfh98F.J4Ux7ym32;
                        f3 = ((float) pb0Tfh98F.q3BipwRCk.dfpT1j18n()) + abs;
                    } else {
                        float abs2 = Math.abs(f5) * ((float) pb0Tfh98F.q3BipwRCk.dfpT1j18n());
                        pmanMZxiM = pb0Tfh98F.J4Ux7ym32;
                        f3 = ((float) pb0Tfh98F.q3BipwRCk.dfpT1j18n()) - abs2;
                    }
                    pmanMZxiM.IytU16YUK(Integer.valueOf((int) f3));
                }
            }
        }
    }

    public boolean mUqPm6GBh(View view, float f) {
        if (this.qFBXIgpia) {
            return true;
        }
        if (view.getTop() < this.cAwN510t2) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.cAwN510t2)) / ((float) dXrmkklc8()) > 0.5f;
    }

    public void nlGCs0NZs(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.cAwN510t2;
        } else if (i == 6) {
            int i4 = this.dfpT1j18n;
            if (!this.J4Ux7ym32 || i4 > (i3 = this.i8XZMQc6Z)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = i8XZMQc6Z();
        } else if (!this.CpG0imbht || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.QNqj6nIzv;
        }
        NyWTwPF6V(view, i, i2, false);
    }

    public final void o4LF8RkoQ(boolean z) {
        WeakReference weakReference = this.igRQEZxnW;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.zHl31GGXU == null) {
                        this.zHl31GGXU = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.igRQEZxnW.get() && z) {
                        this.zHl31GGXU.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.zHl31GGXU = null;
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean oon79WMrY(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.EBQXiIPmm;
        return (weakReference == null || view2 != weakReference.get() || this.AqaWJg0b4 == 3) ? false : true;
    }

    public void qFBXIgpia(int i) {
        if (this.AqaWJg0b4 != i) {
            this.AqaWJg0b4 = i;
            if (!(i == 4 || i == 3 || i == 6)) {
                boolean z = this.CpG0imbht;
            }
            WeakReference weakReference = this.igRQEZxnW;
            if (!(weakReference == null || ((View) weakReference.get()) == null)) {
                if (i == 3) {
                    o4LF8RkoQ(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    o4LF8RkoQ(false);
                }
                i0Zug1mVk(i);
                for (int i2 = 0; i2 < this.TyB1UUd72.size(); i2++) {
                    Pb0Tfh98F pb0Tfh98F = (Pb0Tfh98F) ((aXI58Y1kr) this.TyB1UUd72.get(i2));
                    Objects.requireNonNull(pb0Tfh98F);
                    if (i == 5) {
                        pb0Tfh98F.tGV7Q6urW.GPLPRo6go();
                    }
                }
                vNtjxmzUM();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean qVUwofr5s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.AqaWJg0b4;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        LozNPPdAO lozNPPdAO = this.mUqPm6GBh;
        if (lozNPPdAO != null && (this.nlGCs0NZs || i == 1)) {
            lozNPPdAO.Bhmn1KIah(motionEvent);
        }
        if (actionMasked == 0) {
            this.j22ftfeNI = -1;
            VelocityTracker velocityTracker = this.juJ6pnCpu;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.juJ6pnCpu = null;
            }
        }
        if (this.juJ6pnCpu == null) {
            this.juJ6pnCpu = VelocityTracker.obtain();
        }
        this.juJ6pnCpu.addMovement(motionEvent);
        if (this.mUqPm6GBh != null && (this.nlGCs0NZs || this.AqaWJg0b4 == 1)) {
            z = true;
        }
        if (z && actionMasked == 2 && !this.NyWTwPF6V) {
            float abs = Math.abs(((float) this.QSbMsHU5X) - motionEvent.getY());
            LozNPPdAO lozNPPdAO2 = this.mUqPm6GBh;
            if (abs > ((float) lozNPPdAO2.J4Ux7ym32)) {
                lozNPPdAO2.J4Ux7ym32(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.NyWTwPF6V;
    }

    public View sk5s77z6Q(View view) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (mJLaJepZo.MzoOEjc4X(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View sk5s77z6Q = sk5s77z6Q(viewGroup.getChildAt(i));
            if (sk5s77z6Q != null) {
                return sk5s77z6Q;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void tGV7Q6urW(CoordinatorLayout.s7MlVynBG s7mlvynbg) {
        this.igRQEZxnW = null;
        this.mUqPm6GBh = null;
    }

    public final void vNtjxmzUM() {
        View view;
        IqwHQ6O2l.RG2GI7LDp rG2GI7LDp;
        int i;
        WeakReference weakReference = this.igRQEZxnW;
        if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
            IuQbWntsc.kmSgne1rO(524288, view);
            IuQbWntsc.oon79WMrY(view, 0);
            IuQbWntsc.kmSgne1rO(262144, view);
            IuQbWntsc.oon79WMrY(view, 0);
            IuQbWntsc.kmSgne1rO(1048576, view);
            IuQbWntsc.oon79WMrY(view, 0);
            int i2 = this.ziwPzaoF3;
            if (i2 != -1) {
                IuQbWntsc.kmSgne1rO(i2, view);
                IuQbWntsc.oon79WMrY(view, 0);
            }
            int i3 = 6;
            if (!this.J4Ux7ym32 && this.AqaWJg0b4 != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                MpWGGr5NA mpWGGr5NA = new MpWGGr5NA(this, 6);
                List Puu3Rhg4F = IuQbWntsc.Puu3Rhg4F(view);
                int i4 = 0;
                while (true) {
                    if (i4 >= Puu3Rhg4F.size()) {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = IuQbWntsc.dIocxURUo;
                            if (i5 >= iArr.length || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z = true;
                            for (int i8 = 0; i8 < Puu3Rhg4F.size(); i8++) {
                                z &= ((IqwHQ6O2l.RG2GI7LDp) Puu3Rhg4F.get(i8)).q3BipwRCk() != i7;
                            }
                            if (z) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    } else if (TextUtils.equals(string, ((IqwHQ6O2l.RG2GI7LDp) Puu3Rhg4F.get(i4)).J4Ux7ym32())) {
                        i = ((IqwHQ6O2l.RG2GI7LDp) Puu3Rhg4F.get(i4)).q3BipwRCk();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    IuQbWntsc.q3BipwRCk(view, new IqwHQ6O2l.RG2GI7LDp(null, i, string, mpWGGr5NA, null));
                }
                this.ziwPzaoF3 = i;
            }
            if (this.CpG0imbht && this.AqaWJg0b4 != 5) {
                iMyQMM6Qj(view, IqwHQ6O2l.RG2GI7LDp.CBQ5d1kRq, 5);
            }
            int i9 = this.AqaWJg0b4;
            if (i9 == 3) {
                if (this.J4Ux7ym32) {
                    i3 = 4;
                }
                rG2GI7LDp = IqwHQ6O2l.RG2GI7LDp.vPSbyrYWX;
            } else if (i9 == 4) {
                if (this.J4Ux7ym32) {
                    i3 = 3;
                }
                rG2GI7LDp = IqwHQ6O2l.RG2GI7LDp.oon79WMrY;
            } else if (i9 == 6) {
                iMyQMM6Qj(view, IqwHQ6O2l.RG2GI7LDp.vPSbyrYWX, 4);
                iMyQMM6Qj(view, IqwHQ6O2l.RG2GI7LDp.oon79WMrY, 3);
                return;
            } else {
                return;
            }
            iMyQMM6Qj(view, rG2GI7LDp, i3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void vPSbyrYWX(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference weakReference = this.EBQXiIPmm;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i5 = top - i2;
                if (i2 > 0) {
                    if (i5 < i8XZMQc6Z()) {
                        iArr[1] = top - i8XZMQc6Z();
                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                        view.offsetTopAndBottom(-iArr[1]);
                        i4 = 3;
                        qFBXIgpia(i4);
                    } else if (this.nlGCs0NZs) {
                        iArr[1] = i2;
                        int i6 = -i2;
                        WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                        view.offsetTopAndBottom(i6);
                        qFBXIgpia(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    int i7 = this.cAwN510t2;
                    if (i5 > i7 && !this.CpG0imbht) {
                        iArr[1] = top - i7;
                        WeakHashMap weakHashMap3 = IuQbWntsc.q3BipwRCk;
                        view.offsetTopAndBottom(-iArr[1]);
                        i4 = 4;
                        qFBXIgpia(i4);
                    } else if (this.nlGCs0NZs) {
                        iArr[1] = i2;
                        int i62 = -i2;
                        WeakHashMap weakHashMap22 = IuQbWntsc.q3BipwRCk;
                        view.offsetTopAndBottom(i62);
                        qFBXIgpia(1);
                    } else {
                        return;
                    }
                }
                ixWaw2akD(view.getTop());
                this.vNtjxmzUM = i2;
                this.i0Zug1mVk = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean yWvV4ePLl(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(WaUP0CF08(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.oon79WMrY, marginLayoutParams.width), WaUP0CF08(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.vPSbyrYWX, marginLayoutParams.height));
        return true;
    }
}
