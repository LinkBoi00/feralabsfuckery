package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RG2GI7LDp;
import androidx.recyclerview.widget.aXI58Y1kr;
import androidx.recyclerview.widget.dNif5KqqH;
import com.feravolt.preload.R;
import con.CHivVJVYm;
import con.CvY5I9Zfv;
import con.EyOPxwF4a;
import con.FydS381oY;
import con.HCKbStpM1;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.JLwTA7lmU;
import con.L2LvyJsSh;
import con.Lf6t4dzRk;
import con.NySN5IVuc;
import con.PlegqbMSA;
import con.Pzd2J3aOK;
import con.QbovnGRsC;
import con.RBJDIwG1D;
import con.Rwvkmr87Y;
import con.VCCyeOu6I;
import con.WgCAwL00L;
import con.XflkRyC2J;
import con.aBjutDvc3;
import con.abGBwSu8x;
import con.epVYzXVdP;
import con.iBBoHKkSI;
import con.isrYs6b4I;
import con.j2eYa3WQM;
import con.ltHymUmUx;
import con.m1SEohb1F;
import con.mJLaJepZo;
import con.p2GzZFWt4;
import con.rfzJlVTU4;
import con.sSVv3dJln;
import con.t2bwToAfA;
import con.vtDfS6nCt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements epVYzXVdP {
    public static final Class[] oRfL5Lv1q;
    public int AqaWJg0b4;
    public int BL4OzhZBd;
    public BScqaI6mx Bhmn1KIah;
    public Runnable BqpzfZavo;
    public final VLYkjU0mM CBQ5d1kRq;
    public int CMnfe2r2N;
    public boolean CpG0imbht;
    public float Dr7UqlxEV;
    public int DuuXfa7LE;
    public int EBQXiIPmm;
    public final Runnable Eeka1udhb;
    public aXI58Y1kr IG30YE5GU;
    public final int INnK5Rew6;
    public lamBDew8Z.RG2GI7LDp Ihm5o4uLx;
    public LBkrQilnp IytU16YUK;
    public int IzM1cD9ly;
    public p2GzZFWt4 JxIJId84K;
    public Og6dYSoy7 KBYw84i3W;
    public final kvFwRYSUX KlYagMRWx;
    public EdgeEffect L4EwGfXiQ;
    public boolean M66hQ219i;
    public mhl5lIdbQ MzoOEjc4X;
    public boolean NyWTwPF6V;
    public int OpLJtmvFM;
    public final dNif5KqqH.RG2GI7LDp OuoYhTxyj;
    public RG2GI7LDp PSTqBLTET;
    public boolean QNqj6nIzv;
    public EdgeEffect QSbMsHU5X;
    public final eAq6YOFAV R2hkbNqWf;
    public final Rect RG6kpfv3v;
    public boolean ShSN9wbzk;
    public final int SuKhTJIQc;
    public boolean Ta2zrwkcM;
    public int TyB1UUd72;
    public final AccessibilityManager V9LQMKGJe;
    public LULQkQlc9 WaUP0CF08;
    public int XYT7vJqNO;
    public boolean YmNRDyka4;
    public PMYI4lLJM a8N8UmDyD;
    public final int[] aS2AFthYA;
    public aXI58Y1kr.RG2GI7LDp buPcffgdD;
    public final ArrayList cAwN510t2;
    public final Rect dXrmkklc8;
    public final List dfpT1j18n;
    public final int[] hKeU0pt2N;
    public int i0Zug1mVk;
    public aDHI5aP05 i8XZMQc6Z;
    public final ArrayList iMyQMM6Qj;
    public int ifDs8fRNm;
    public boolean igRQEZxnW;
    public final dNif5KqqH ilHKhw3Yw;
    public final RectF ixWaw2akD;
    public EdgeEffect j22ftfeNI;
    public Rma6SHcSH juJ6pnCpu;
    public int kktL0P5MG;
    public final V1xq9aVRv kmSgne1rO;
    public boolean koMoKnP1S;
    public float ln3nf7LH3;
    public wnbPPCp4x lqFHPHdW3;
    public boolean mUqPm6GBh;
    public VelocityTracker n4UIOvAko;
    public boolean nlGCs0NZs;
    public boolean o4LF8RkoQ;
    public List oesmsHQJU;
    public boolean qFBXIgpia;
    public boolean qVUwofr5s;
    public s7MlVynBG sk5s77z6Q;
    public final int[] suAKJqyYV;
    public final List tFD7BDQ71;
    public m1SEohb1F uSBmk4hFZ;
    public final int[] vIbyhVf1d;
    public boolean vNtjxmzUM;
    public int wIZEdYHUn;
    public EdgeEffect zHl31GGXU;
    public lamBDew8Z ziwPzaoF3;
    public static final int[] tTcQQNK5P = {16843830};
    public static final Interpolator LFW0KvNFt = new aXI58Y1kr();

    /* loaded from: classes.dex */
    public static class BScqaI6mx extends con.s7MlVynBG {
        public static final Parcelable.Creator<BScqaI6mx> CREATOR = new EyOPxwF4a(0);
        public Parcelable Bhmn1KIah;

        public BScqaI6mx(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Bhmn1KIah = parcel.readParcelable(classLoader == null ? LULQkQlc9.class.getClassLoader() : classLoader);
        }

        public BScqaI6mx(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            parcel.writeParcelable(this.Bhmn1KIah, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class DrTf1eLw4 {
        public void dIocxURUo(Canvas canvas, RecyclerView recyclerView, kvFwRYSUX kvfwrysux) {
        }

        public void kCA6Zs9sL(Canvas canvas, RecyclerView recyclerView, kvFwRYSUX kvfwrysux) {
        }
    }

    /* loaded from: classes.dex */
    public interface LBkrQilnp {
        void J4Ux7ym32(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean q3BipwRCk(RecyclerView recyclerView, MotionEvent motionEvent);

        void tGV7Q6urW(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class LULQkQlc9 {
        public int Bhmn1KIah;
        public int CBQ5d1kRq;
        public RecyclerView J4Ux7ym32;
        public int PSTqBLTET;
        public PlegqbMSA dIocxURUo;
        public kVmRinNH6 kCA6Zs9sL;
        public int kmSgne1rO;
        public int oon79WMrY;
        public mhl5lIdbQ q3BipwRCk;
        public PlegqbMSA tGV7Q6urW;
        public boolean vPSbyrYWX;
        public boolean iiGwOFFnr = false;
        public boolean GPLPRo6go = false;
        public boolean Puu3Rhg4F = true;
        public boolean yWvV4ePLl = true;

        /* loaded from: classes.dex */
        public interface RG2GI7LDp {
        }

        /* loaded from: classes.dex */
        public static class mhl5lIdbQ {
            public int J4Ux7ym32;
            public boolean dIocxURUo;
            public int q3BipwRCk;
            public boolean tGV7Q6urW;
        }

        public LULQkQlc9() {
            rfzJlVTU4 rfzjlvtu4 = new rfzJlVTU4(this, 0);
            rfzJlVTU4 rfzjlvtu42 = new rfzJlVTU4(this, 1);
            this.tGV7Q6urW = new PlegqbMSA(rfzjlvtu4);
            this.dIocxURUo = new PlegqbMSA(rfzjlvtu42);
        }

        public static int Puu3Rhg4F(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public static int i8XZMQc6Z(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            } else {
                                i4 = max;
                                i2 = 0;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static mhl5lIdbQ juJ6pnCpu(Context context, AttributeSet attributeSet, int i, int i2) {
            mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FydS381oY.q3BipwRCk, i, i2);
            mhl5lidbq.q3BipwRCk = obtainStyledAttributes.getInt(0, 1);
            mhl5lidbq.J4Ux7ym32 = obtainStyledAttributes.getInt(10, 1);
            mhl5lidbq.tGV7Q6urW = obtainStyledAttributes.getBoolean(9, false);
            mhl5lidbq.dIocxURUo = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return mhl5lidbq;
        }

        public static boolean zHl31GGXU(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public int AqaWJg0b4(View view) {
            return view.getTop() - ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32.top;
        }

        public abstract View BL4OzhZBd(View view, int i, V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux);

        public abstract int Bhmn1KIah(kvFwRYSUX kvfwrysux);

        public void BqpzfZavo(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.J4Ux7ym32 = null;
                this.q3BipwRCk = null;
                i = 0;
                this.Bhmn1KIah = 0;
            } else {
                this.J4Ux7ym32 = recyclerView;
                this.q3BipwRCk = recyclerView.MzoOEjc4X;
                this.Bhmn1KIah = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.PSTqBLTET = i;
            this.CBQ5d1kRq = 1073741824;
            this.kmSgne1rO = 1073741824;
        }

        public abstract int CBQ5d1kRq(kvFwRYSUX kvfwrysux);

        public boolean CMnfe2r2N(View view, int i, int i2, dgsh68zH8 dgsh68zh8) {
            return !this.Puu3Rhg4F || !zHl31GGXU(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) dgsh68zh8).width) || !zHl31GGXU(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) dgsh68zh8).height);
        }

        public int CpG0imbht(View view) {
            Rect rect = ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void Dr7UqlxEV(RecyclerView recyclerView, int i, int i2, Object obj) {
        }

        public void DuuXfa7LE(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.J4Ux7ym32;
            V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
            if (accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.J4Ux7ym32.canScrollVertically(-1) && !this.J4Ux7ym32.canScrollHorizontally(-1) && !this.J4Ux7ym32.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                s7MlVynBG s7mlvynbg = this.J4Ux7ym32.sk5s77z6Q;
                if (s7mlvynbg != null) {
                    accessibilityEvent.setItemCount(s7mlvynbg.q3BipwRCk());
                }
            }
        }

        public int EBQXiIPmm() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public View Eeka1udhb(int i) {
            int WaUP0CF08 = WaUP0CF08();
            for (int i2 = 0; i2 < WaUP0CF08; i2++) {
                View sk5s77z6Q = sk5s77z6Q(i2);
                cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(sk5s77z6Q);
                if (V9LQMKGJe != null && V9LQMKGJe.kCA6Zs9sL() == i && !V9LQMKGJe.dXrmkklc8() && (this.J4Ux7ym32.KlYagMRWx.GPLPRo6go || !V9LQMKGJe.CBQ5d1kRq())) {
                    return sk5s77z6Q;
                }
            }
            return null;
        }

        public boolean GPLPRo6go(dgsh68zH8 dgsh68zh8) {
            return dgsh68zh8 != null;
        }

        public abstract void IG30YE5GU(Parcelable parcelable);

        public void INnK5Rew6(RecyclerView recyclerView) {
        }

        public void Ihm5o4uLx(int i) {
            mhl5lIdbQ mhl5lidbq;
            int iiGwOFFnr;
            View q3BipwRCk;
            if (sk5s77z6Q(i) != null && (q3BipwRCk = ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).q3BipwRCk((iiGwOFFnr = (mhl5lidbq = this.q3BipwRCk).iiGwOFFnr(i)))) != null) {
                if (mhl5lidbq.J4Ux7ym32.iiGwOFFnr(iiGwOFFnr)) {
                    mhl5lidbq.CBQ5d1kRq(q3BipwRCk);
                }
                ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).tGV7Q6urW(iiGwOFFnr);
            }
        }

        public int IytU16YUK(View view) {
            return view.getLeft() - ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32.left;
        }

        public void IzM1cD9ly(int i) {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                int kCA6Zs9sL = recyclerView.MzoOEjc4X.kCA6Zs9sL();
                for (int i2 = 0; i2 < kCA6Zs9sL; i2++) {
                    recyclerView.MzoOEjc4X.dIocxURUo(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void J4Ux7ym32(View view) {
            tGV7Q6urW(view, -1, false);
        }

        public abstract int JxIJId84K(int i, V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux);

        public void KBYw84i3W(RecyclerView recyclerView, int i, int i2) {
        }

        public void KlYagMRWx(int i) {
        }

        public abstract boolean L4EwGfXiQ();

        public abstract void M66hQ219i(V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux);

        public abstract int MzoOEjc4X(kvFwRYSUX kvfwrysux);

        public int NyWTwPF6V() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            s7MlVynBG adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.q3BipwRCk();
            }
            return 0;
        }

        public abstract void OpLJtmvFM(RecyclerView recyclerView, V1xq9aVRv v1xq9aVRv);

        public abstract void OuoYhTxyj(RecyclerView recyclerView, kvFwRYSUX kvfwrysux, int i);

        public abstract int PSTqBLTET(kvFwRYSUX kvfwrysux);

        public int QNqj6nIzv() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void QSbMsHU5X(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.J4Ux7ym32 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.J4Ux7ym32.ixWaw2akD;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public abstract void R2hkbNqWf(kvFwRYSUX kvfwrysux);

        public dgsh68zH8 RG6kpfv3v(Context context, AttributeSet attributeSet) {
            return new dgsh68zH8(context, attributeSet);
        }

        public void ShSN9wbzk(int i, V1xq9aVRv v1xq9aVRv) {
            View sk5s77z6Q = sk5s77z6Q(i);
            Ihm5o4uLx(i);
            v1xq9aVRv.GPLPRo6go(sk5s77z6Q);
        }

        public void SuKhTJIQc(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public boolean Ta2zrwkcM(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            boolean z3;
            int[] iArr = new int[2];
            int QNqj6nIzv = QNqj6nIzv();
            int EBQXiIPmm = EBQXiIPmm();
            int igRQEZxnW = this.Bhmn1KIah - igRQEZxnW();
            int V9LQMKGJe = this.PSTqBLTET - V9LQMKGJe();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - QNqj6nIzv;
            int min = Math.min(0, i);
            int i2 = top - EBQXiIPmm;
            int min2 = Math.min(0, i2);
            int i3 = width - igRQEZxnW;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - V9LQMKGJe);
            if (vNtjxmzUM() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int QNqj6nIzv2 = QNqj6nIzv();
                    int EBQXiIPmm2 = EBQXiIPmm();
                    int igRQEZxnW2 = this.Bhmn1KIah - igRQEZxnW();
                    int V9LQMKGJe2 = this.PSTqBLTET - V9LQMKGJe();
                    Rect rect2 = this.J4Ux7ym32.dXrmkklc8;
                    cAwN510t2(focusedChild, rect2);
                    if (rect2.left - i4 < igRQEZxnW2 && rect2.right - i4 > QNqj6nIzv2 && rect2.top - i5 < V9LQMKGJe2 && rect2.bottom - i5 > EBQXiIPmm2) {
                        z3 = true;
                    }
                }
                z3 = false;
            }
            if (!(i4 == 0 && i5 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                } else {
                    recyclerView.Dr7UqlxEV(i4, i5, null, Integer.MIN_VALUE, false);
                }
                return true;
            }
            return false;
        }

        public int TyB1UUd72(View view) {
            return ((dgsh68zH8) view.getLayoutParams()).q3BipwRCk();
        }

        public int V9LQMKGJe() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int WaUP0CF08() {
            mhl5lIdbQ mhl5lidbq = this.q3BipwRCk;
            if (mhl5lidbq != null) {
                return mhl5lidbq.kCA6Zs9sL();
            }
            return 0;
        }

        public void XYT7vJqNO(View view, IqwHQ6O2l iqwHQ6O2l) {
            cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
            if (V9LQMKGJe != null && !V9LQMKGJe.CBQ5d1kRq() && !this.q3BipwRCk.vPSbyrYWX(V9LQMKGJe.q3BipwRCk)) {
                RecyclerView recyclerView = this.J4Ux7ym32;
                kktL0P5MG(recyclerView.kmSgne1rO, recyclerView.KlYagMRWx, view, iqwHQ6O2l);
            }
        }

        public void YmNRDyka4(View view, V1xq9aVRv v1xq9aVRv) {
            mhl5lIdbQ mhl5lidbq = this.q3BipwRCk;
            int indexOfChild = ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).q3BipwRCk.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (mhl5lidbq.J4Ux7ym32.iiGwOFFnr(indexOfChild)) {
                    mhl5lidbq.CBQ5d1kRq(view);
                }
                ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).tGV7Q6urW(indexOfChild);
            }
            v1xq9aVRv.GPLPRo6go(view);
        }

        public abstract int a8N8UmDyD(int i, V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux);

        public void aS2AFthYA(Rect rect, int i, int i2) {
            int igRQEZxnW = igRQEZxnW() + QNqj6nIzv() + rect.width();
            int V9LQMKGJe = V9LQMKGJe() + EBQXiIPmm() + rect.height();
            this.J4Ux7ym32.setMeasuredDimension(Puu3Rhg4F(i, igRQEZxnW, o4LF8RkoQ()), Puu3Rhg4F(i2, V9LQMKGJe, i0Zug1mVk()));
        }

        public abstract Parcelable buPcffgdD();

        public void cAwN510t2(View view, Rect rect) {
            int[] iArr = RecyclerView.tTcQQNK5P;
            dgsh68zH8 dgsh68zh8 = (dgsh68zH8) view.getLayoutParams();
            Rect rect2 = dgsh68zh8.J4Ux7ym32;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) dgsh68zh8).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) dgsh68zh8).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) dgsh68zh8).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) dgsh68zh8).bottomMargin);
        }

        public abstract void dIocxURUo(String str);

        public abstract dgsh68zH8 dXrmkklc8();

        public int dfpT1j18n(V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux) {
            return -1;
        }

        public void hKeU0pt2N(int i, int i2) {
            this.Bhmn1KIah = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.CBQ5d1kRq = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.tTcQQNK5P;
            }
            this.PSTqBLTET = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.kmSgne1rO = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.tTcQQNK5P;
            }
        }

        public int i0Zug1mVk() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            return VCCyeOu6I.dIocxURUo(recyclerView);
        }

        public int iMyQMM6Qj(View view) {
            return view.getBottom() + ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32.bottom;
        }

        public boolean ifDs8fRNm() {
            return false;
        }

        public int igRQEZxnW() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public abstract boolean iiGwOFFnr();

        public void ilHKhw3Yw(V1xq9aVRv v1xq9aVRv) {
            int WaUP0CF08 = WaUP0CF08();
            while (true) {
                WaUP0CF08--;
                if (WaUP0CF08 >= 0) {
                    View sk5s77z6Q = sk5s77z6Q(WaUP0CF08);
                    cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(sk5s77z6Q);
                    if (!V9LQMKGJe.dXrmkklc8()) {
                        if (!V9LQMKGJe.oon79WMrY() || V9LQMKGJe.CBQ5d1kRq() || this.J4Ux7ym32.sk5s77z6Q.J4Ux7ym32) {
                            sk5s77z6Q(WaUP0CF08);
                            this.q3BipwRCk.tGV7Q6urW(WaUP0CF08);
                            v1xq9aVRv.yWvV4ePLl(sk5s77z6Q);
                            this.J4Ux7ym32.ilHKhw3Yw.iiGwOFFnr(V9LQMKGJe);
                        } else {
                            Ihm5o4uLx(WaUP0CF08);
                            v1xq9aVRv.Puu3Rhg4F(V9LQMKGJe);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public dgsh68zH8 ixWaw2akD(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof dgsh68zH8 ? new dgsh68zH8((dgsh68zH8) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new dgsh68zH8((ViewGroup.MarginLayoutParams) layoutParams) : new dgsh68zH8(layoutParams);
        }

        public int j22ftfeNI(V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux) {
            return -1;
        }

        public abstract boolean kCA6Zs9sL();

        public void kktL0P5MG(V1xq9aVRv v1xq9aVRv, kvFwRYSUX kvfwrysux, View view, IqwHQ6O2l iqwHQ6O2l) {
        }

        public abstract int kmSgne1rO(kvFwRYSUX kvfwrysux);

        public boolean koMoKnP1S(View view, int i, int i2, dgsh68zH8 dgsh68zh8) {
            return view.isLayoutRequested() || !this.Puu3Rhg4F || !zHl31GGXU(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) dgsh68zh8).width) || !zHl31GGXU(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) dgsh68zh8).height);
        }

        public void ln3nf7LH3(RecyclerView recyclerView, int i, int i2) {
        }

        public void lqFHPHdW3(V1xq9aVRv v1xq9aVRv) {
            for (int WaUP0CF08 = WaUP0CF08() - 1; WaUP0CF08 >= 0; WaUP0CF08--) {
                if (!RecyclerView.V9LQMKGJe(sk5s77z6Q(WaUP0CF08)).dXrmkklc8()) {
                    ShSN9wbzk(WaUP0CF08, v1xq9aVRv);
                }
            }
        }

        public View mUqPm6GBh() {
            View focusedChild;
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.q3BipwRCk.tGV7Q6urW.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void n4UIOvAko(s7MlVynBG s7mlvynbg, s7MlVynBG s7mlvynbg2) {
        }

        public int nlGCs0NZs(View view) {
            return view.getRight() + ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32.right;
        }

        public int o4LF8RkoQ() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            return VCCyeOu6I.kCA6Zs9sL(recyclerView);
        }

        public abstract boolean oRfL5Lv1q();

        public void oesmsHQJU(V1xq9aVRv v1xq9aVRv) {
            int size = v1xq9aVRv.q3BipwRCk.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = ((cywn6086a) v1xq9aVRv.q3BipwRCk.get(i)).q3BipwRCk;
                cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
                if (!V9LQMKGJe.dXrmkklc8()) {
                    V9LQMKGJe.Eeka1udhb(false);
                    if (V9LQMKGJe.Bhmn1KIah()) {
                        this.J4Ux7ym32.removeDetachedView(view, false);
                    }
                    lamBDew8Z lambdew8z = this.J4Ux7ym32.ziwPzaoF3;
                    if (lambdew8z != null) {
                        lambdew8z.kCA6Zs9sL(V9LQMKGJe);
                    }
                    V9LQMKGJe.Eeka1udhb(true);
                    cywn6086a V9LQMKGJe2 = RecyclerView.V9LQMKGJe(view);
                    V9LQMKGJe2.Bhmn1KIah = null;
                    V9LQMKGJe2.PSTqBLTET = false;
                    V9LQMKGJe2.dIocxURUo();
                    v1xq9aVRv.Puu3Rhg4F(V9LQMKGJe2);
                }
            }
            v1xq9aVRv.q3BipwRCk.clear();
            ArrayList arrayList = v1xq9aVRv.J4Ux7ym32;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.J4Ux7ym32.invalidate();
            }
        }

        public void oon79WMrY(int i, RG2GI7LDp rG2GI7LDp) {
        }

        public int qFBXIgpia(View view) {
            Rect rect = ((dgsh68zH8) view.getLayoutParams()).J4Ux7ym32;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public View qVUwofr5s(View view) {
            View CpG0imbht;
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView == null || (CpG0imbht = recyclerView.CpG0imbht(view)) == null || this.q3BipwRCk.tGV7Q6urW.contains(CpG0imbht)) {
                return null;
            }
            return CpG0imbht;
        }

        public View sk5s77z6Q(int i) {
            mhl5lIdbQ mhl5lidbq = this.q3BipwRCk;
            if (mhl5lidbq == null) {
                return null;
            }
            return ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).q3BipwRCk(mhl5lidbq.iiGwOFFnr(i));
        }

        public void suAKJqyYV(RecyclerView recyclerView) {
            hKeU0pt2N(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void tFD7BDQ71(int i, int i2) {
            int WaUP0CF08 = WaUP0CF08();
            if (WaUP0CF08 == 0) {
                this.J4Ux7ym32.PSTqBLTET(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < WaUP0CF08; i7++) {
                View sk5s77z6Q = sk5s77z6Q(i7);
                Rect rect = this.J4Ux7ym32.dXrmkklc8;
                cAwN510t2(sk5s77z6Q, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.J4Ux7ym32.dXrmkklc8.set(i4, i5, i3, i6);
            aS2AFthYA(this.J4Ux7ym32.dXrmkklc8, i, i2);
        }

        public final void tGV7Q6urW(View view, int i, boolean z) {
            cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
            if (z || V9LQMKGJe.CBQ5d1kRq()) {
                this.J4Ux7ym32.ilHKhw3Yw.q3BipwRCk(V9LQMKGJe);
            } else {
                this.J4Ux7ym32.ilHKhw3Yw.iiGwOFFnr(V9LQMKGJe);
            }
            dgsh68zH8 dgsh68zh8 = (dgsh68zH8) view.getLayoutParams();
            if (V9LQMKGJe.RG6kpfv3v() || V9LQMKGJe.kmSgne1rO()) {
                if (V9LQMKGJe.kmSgne1rO()) {
                    V9LQMKGJe.Bhmn1KIah.vPSbyrYWX(V9LQMKGJe);
                } else {
                    V9LQMKGJe.dIocxURUo();
                }
                this.q3BipwRCk.J4Ux7ym32(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.J4Ux7ym32) {
                int oon79WMrY = this.q3BipwRCk.oon79WMrY(view);
                if (i == -1) {
                    i = this.q3BipwRCk.kCA6Zs9sL();
                }
                if (oon79WMrY == -1) {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    q3BipwRCk.append(this.J4Ux7ym32.indexOfChild(view));
                    throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this.J4Ux7ym32, q3BipwRCk));
                } else if (oon79WMrY != i) {
                    LULQkQlc9 lULQkQlc9 = this.J4Ux7ym32.WaUP0CF08;
                    View sk5s77z6Q = lULQkQlc9.sk5s77z6Q(oon79WMrY);
                    if (sk5s77z6Q != null) {
                        lULQkQlc9.sk5s77z6Q(oon79WMrY);
                        lULQkQlc9.q3BipwRCk.tGV7Q6urW(oon79WMrY);
                        dgsh68zH8 dgsh68zh82 = (dgsh68zH8) sk5s77z6Q.getLayoutParams();
                        cywn6086a V9LQMKGJe2 = RecyclerView.V9LQMKGJe(sk5s77z6Q);
                        if (V9LQMKGJe2.CBQ5d1kRq()) {
                            lULQkQlc9.J4Ux7ym32.ilHKhw3Yw.q3BipwRCk(V9LQMKGJe2);
                        } else {
                            lULQkQlc9.J4Ux7ym32.ilHKhw3Yw.iiGwOFFnr(V9LQMKGJe2);
                        }
                        lULQkQlc9.q3BipwRCk.J4Ux7ym32(sk5s77z6Q, i, dgsh68zh82, V9LQMKGJe2.CBQ5d1kRq());
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + oon79WMrY + lULQkQlc9.J4Ux7ym32.toString());
                    }
                }
            } else {
                this.q3BipwRCk.q3BipwRCk(view, i, false);
                dgsh68zh8.tGV7Q6urW = true;
                kVmRinNH6 kvmrinnh6 = this.kCA6Zs9sL;
                if (kvmrinnh6 != null && kvmrinnh6.kCA6Zs9sL && kvmrinnh6.J4Ux7ym32.i0Zug1mVk(view) == kvmrinnh6.q3BipwRCk) {
                    kvmrinnh6.iiGwOFFnr = view;
                }
            }
            if (dgsh68zh8.dIocxURUo) {
                V9LQMKGJe.q3BipwRCk.invalidate();
                dgsh68zh8.dIocxURUo = false;
            }
        }

        public void tTcQQNK5P(kVmRinNH6 kvmrinnh6) {
            kVmRinNH6 kvmrinnh62 = this.kCA6Zs9sL;
            if (!(kvmrinnh62 == null || kvmrinnh6 == kvmrinnh62 || !kvmrinnh62.kCA6Zs9sL)) {
                kvmrinnh62.dIocxURUo();
            }
            this.kCA6Zs9sL = kvmrinnh6;
            RecyclerView recyclerView = this.J4Ux7ym32;
            recyclerView.R2hkbNqWf.tGV7Q6urW();
            if (kvmrinnh6.Puu3Rhg4F) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("An instance of ");
                q3BipwRCk.append(kvmrinnh6.getClass().getSimpleName());
                q3BipwRCk.append(" was started more than once. Each instance of");
                q3BipwRCk.append(kvmrinnh6.getClass().getSimpleName());
                q3BipwRCk.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", q3BipwRCk.toString());
            }
            kvmrinnh6.J4Ux7ym32 = recyclerView;
            kvmrinnh6.tGV7Q6urW = this;
            int i = kvmrinnh6.q3BipwRCk;
            if (i != -1) {
                recyclerView.KlYagMRWx.q3BipwRCk = i;
                kvmrinnh6.kCA6Zs9sL = true;
                kvmrinnh6.dIocxURUo = true;
                kvmrinnh6.iiGwOFFnr = recyclerView.WaUP0CF08.Eeka1udhb(i);
                kvmrinnh6.J4Ux7ym32.R2hkbNqWf.q3BipwRCk();
                kvmrinnh6.Puu3Rhg4F = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void uSBmk4hFZ() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract void vIbyhVf1d(int i);

        public int vNtjxmzUM() {
            RecyclerView recyclerView = this.J4Ux7ym32;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            return RBJDIwG1D.dIocxURUo(recyclerView);
        }

        public abstract int vPSbyrYWX(kvFwRYSUX kvfwrysux);

        public void wIZEdYHUn(int i) {
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView != null) {
                int kCA6Zs9sL = recyclerView.MzoOEjc4X.kCA6Zs9sL();
                for (int i2 = 0; i2 < kCA6Zs9sL; i2++) {
                    recyclerView.MzoOEjc4X.dIocxURUo(i2).offsetLeftAndRight(i);
                }
            }
        }

        public abstract void yWvV4ePLl(int i, int i2, kvFwRYSUX kvfwrysux, RG2GI7LDp rG2GI7LDp);

        public void ziwPzaoF3(View view, int i, int i2, int i3, int i4) {
            dgsh68zH8 dgsh68zh8 = (dgsh68zH8) view.getLayoutParams();
            Rect rect = dgsh68zh8.J4Ux7ym32;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) dgsh68zh8).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) dgsh68zh8).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) dgsh68zh8).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) dgsh68zh8).bottomMargin);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Og6dYSoy7 {
    }

    /* loaded from: classes.dex */
    public interface PMYI4lLJM {
        int q3BipwRCk(int i, int i2);
    }

    /* loaded from: classes.dex */
    public class Q6hF6Z6Ad implements lamBDew8Z.RG2GI7LDp {
        public Q6hF6Z6Ad() {
            RecyclerView.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Runnable {
        public RG2GI7LDp() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.nlGCs0NZs && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.CpG0imbht) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.NyWTwPF6V) {
                    recyclerView2.mUqPm6GBh = true;
                } else {
                    recyclerView2.Bhmn1KIah();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Rma6SHcSH {
        public EdgeEffect q3BipwRCk(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public final class V1xq9aVRv {
        public Y371ZqMzx GPLPRo6go;
        public final List dIocxURUo;
        public final ArrayList q3BipwRCk;
        public ArrayList J4Ux7ym32 = null;
        public final ArrayList tGV7Q6urW = new ArrayList();
        public int kCA6Zs9sL = 2;
        public int iiGwOFFnr = 2;

        public V1xq9aVRv() {
            RecyclerView.this = r2;
            ArrayList arrayList = new ArrayList();
            this.q3BipwRCk = arrayList;
            this.dIocxURUo = Collections.unmodifiableList(arrayList);
        }

        public void CBQ5d1kRq() {
            LULQkQlc9 lULQkQlc9 = RecyclerView.this.WaUP0CF08;
            this.iiGwOFFnr = this.kCA6Zs9sL + (lULQkQlc9 != null ? lULQkQlc9.oon79WMrY : 0);
            for (int size = this.tGV7Q6urW.size() - 1; size >= 0 && this.tGV7Q6urW.size() > this.iiGwOFFnr; size--) {
                iiGwOFFnr(size);
            }
        }

        public void GPLPRo6go(View view) {
            cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
            if (V9LQMKGJe.Bhmn1KIah()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (V9LQMKGJe.kmSgne1rO()) {
                V9LQMKGJe.Bhmn1KIah.vPSbyrYWX(V9LQMKGJe);
            } else if (V9LQMKGJe.RG6kpfv3v()) {
                V9LQMKGJe.dIocxURUo();
            }
            Puu3Rhg4F(V9LQMKGJe);
            if (RecyclerView.this.ziwPzaoF3 != null && !V9LQMKGJe.vPSbyrYWX()) {
                RecyclerView.this.ziwPzaoF3.kCA6Zs9sL(V9LQMKGJe);
            }
        }

        public void J4Ux7ym32() {
            this.q3BipwRCk.clear();
            kCA6Zs9sL();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void Puu3Rhg4F(cywn6086a cywn6086a) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = false;
            if (cywn6086a.kmSgne1rO() || cywn6086a.q3BipwRCk.getParent() != null) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Scrapped or attached views may not be recycled. isScrap:");
                q3BipwRCk.append(cywn6086a.kmSgne1rO());
                q3BipwRCk.append(" isAttached:");
                if (cywn6086a.q3BipwRCk.getParent() != null) {
                    z4 = true;
                }
                q3BipwRCk.append(z4);
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, q3BipwRCk));
            } else if (cywn6086a.Bhmn1KIah()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(cywn6086a);
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, sb));
            } else if (!cywn6086a.dXrmkklc8()) {
                if ((cywn6086a.oon79WMrY & 16) == 0) {
                    View view = cywn6086a.q3BipwRCk;
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    if (VCCyeOu6I.yWvV4ePLl(view)) {
                        z = true;
                        s7MlVynBG s7mlvynbg = RecyclerView.this.sk5s77z6Q;
                        if (!cywn6086a.vPSbyrYWX()) {
                            if (this.iiGwOFFnr <= 0 || cywn6086a.GPLPRo6go(526)) {
                                z3 = false;
                            } else {
                                int size = this.tGV7Q6urW.size();
                                if (size >= this.iiGwOFFnr && size > 0) {
                                    iiGwOFFnr(0);
                                    size--;
                                }
                                int[] iArr = RecyclerView.tTcQQNK5P;
                                if (size > 0 && !RecyclerView.this.buPcffgdD.tGV7Q6urW(cywn6086a.tGV7Q6urW)) {
                                    do {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                    } while (RecyclerView.this.buPcffgdD.tGV7Q6urW(((cywn6086a) this.tGV7Q6urW.get(size)).tGV7Q6urW));
                                    size++;
                                }
                                this.tGV7Q6urW.add(size, cywn6086a);
                                z3 = true;
                            }
                            if (!z3) {
                                q3BipwRCk(cywn6086a, true);
                                z4 = true;
                            }
                            z2 = z4;
                            z4 = z3;
                        } else {
                            z2 = false;
                        }
                        RecyclerView.this.ilHKhw3Yw.GPLPRo6go(cywn6086a);
                        if (!z4 && !z2 && z) {
                            cywn6086a.Eeka1udhb = null;
                            cywn6086a.qVUwofr5s = null;
                            return;
                        }
                        return;
                    }
                }
                z = false;
                s7MlVynBG s7mlvynbg2 = RecyclerView.this.sk5s77z6Q;
                if (!cywn6086a.vPSbyrYWX()) {
                }
                RecyclerView.this.ilHKhw3Yw.GPLPRo6go(cywn6086a);
                if (!z4) {
                }
            } else {
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, abGBwSu8x.q3BipwRCk("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
        }

        public Y371ZqMzx dIocxURUo() {
            if (this.GPLPRo6go == null) {
                this.GPLPRo6go = new Y371ZqMzx();
            }
            return this.GPLPRo6go;
        }

        public void iiGwOFFnr(int i) {
            q3BipwRCk((cywn6086a) this.tGV7Q6urW.get(i), true);
            this.tGV7Q6urW.remove(i);
        }

        public void kCA6Zs9sL() {
            for (int size = this.tGV7Q6urW.size() - 1; size >= 0; size--) {
                iiGwOFFnr(size);
            }
            this.tGV7Q6urW.clear();
            int[] iArr = RecyclerView.tTcQQNK5P;
            aXI58Y1kr.RG2GI7LDp rG2GI7LDp = RecyclerView.this.buPcffgdD;
            int[] iArr2 = rG2GI7LDp.tGV7Q6urW;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            rG2GI7LDp.dIocxURUo = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:162:0x02ff, code lost:
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:227:0x044c, code lost:
            if (r7.oon79WMrY() == false) goto L_0x0484;
         */
        /* JADX WARN: Code restructure failed: missing block: B:236:0x0482, code lost:
            if ((r10 == 0 || r10 + r8 < r19) == false) goto L_0x0484;
         */
        /* JADX WARN: Removed duplicated region for block: B:126:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x043e  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x046b  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x0493  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0495  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0498  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x04bc  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x0505  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x0535  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x053e  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x0549  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x0550  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x056c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public cywn6086a oon79WMrY(int i, boolean z, long j) {
            cywn6086a cywn6086a;
            boolean z2;
            boolean z3;
            boolean z4;
            ViewGroup.LayoutParams layoutParams;
            dgsh68zH8 dgsh68zh8;
            ViewGroup.LayoutParams layoutParams2;
            boolean z5;
            AccessibilityManager accessibilityManager;
            cywn6086a cywn6086a2;
            cywn6086a cywn6086a3;
            View view;
            boolean z6;
            int size;
            int iiGwOFFnr;
            if (i < 0 || i >= RecyclerView.this.KlYagMRWx.J4Ux7ym32()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid item position ");
                sb.append(i);
                sb.append("(");
                sb.append(i);
                sb.append("). Item count:");
                sb.append(RecyclerView.this.KlYagMRWx.J4Ux7ym32());
                throw new IndexOutOfBoundsException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, sb));
            }
            boolean z7 = false;
            if (RecyclerView.this.KlYagMRWx.GPLPRo6go) {
                ArrayList arrayList = this.J4Ux7ym32;
                if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            RecyclerView recyclerView = RecyclerView.this;
                            if (recyclerView.sk5s77z6Q.J4Ux7ym32 && (iiGwOFFnr = recyclerView.PSTqBLTET.iiGwOFFnr(i, 0)) > 0 && iiGwOFFnr < RecyclerView.this.sk5s77z6Q.q3BipwRCk()) {
                                long J4Ux7ym32 = RecyclerView.this.sk5s77z6Q.J4Ux7ym32(iiGwOFFnr);
                                for (int i3 = 0; i3 < size; i3++) {
                                    cywn6086a cywn6086a4 = (cywn6086a) this.J4Ux7ym32.get(i3);
                                    if (!cywn6086a4.RG6kpfv3v() && cywn6086a4.kCA6Zs9sL == J4Ux7ym32) {
                                        cywn6086a4.J4Ux7ym32(32);
                                        cywn6086a = cywn6086a4;
                                        break;
                                    }
                                }
                            }
                        } else {
                            cywn6086a = (cywn6086a) this.J4Ux7ym32.get(i2);
                            if (!cywn6086a.RG6kpfv3v() && cywn6086a.kCA6Zs9sL() == i) {
                                cywn6086a.J4Ux7ym32(32);
                                break;
                            }
                            i2++;
                        }
                    }
                    if (cywn6086a != null) {
                        z2 = true;
                        if (cywn6086a == null) {
                            int size2 = this.q3BipwRCk.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                cywn6086a3 = (cywn6086a) this.q3BipwRCk.get(i4);
                                if (!cywn6086a3.RG6kpfv3v() && cywn6086a3.kCA6Zs9sL() == i && !cywn6086a3.oon79WMrY() && (RecyclerView.this.KlYagMRWx.GPLPRo6go || !cywn6086a3.CBQ5d1kRq())) {
                                    cywn6086a3.J4Ux7ym32(32);
                                    break;
                                }
                            }
                            if (!z) {
                                mhl5lIdbQ mhl5lidbq = RecyclerView.this.MzoOEjc4X;
                                int size3 = mhl5lidbq.tGV7Q6urW.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        view = null;
                                        break;
                                    }
                                    view = (View) mhl5lidbq.tGV7Q6urW.get(i5);
                                    Objects.requireNonNull((qhPEQQaQ4) mhl5lidbq.q3BipwRCk);
                                    cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
                                    if (!(V9LQMKGJe.kCA6Zs9sL() != i || V9LQMKGJe.oon79WMrY() || V9LQMKGJe.CBQ5d1kRq())) {
                                        break;
                                    }
                                    i5++;
                                }
                                if (view != null) {
                                    cywn6086a = RecyclerView.V9LQMKGJe(view);
                                    mhl5lIdbQ mhl5lidbq2 = RecyclerView.this.MzoOEjc4X;
                                    int indexOfChild = ((qhPEQQaQ4) mhl5lidbq2.q3BipwRCk).q3BipwRCk.indexOfChild(view);
                                    if (indexOfChild < 0) {
                                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                                    } else if (mhl5lidbq2.J4Ux7ym32.dIocxURUo(indexOfChild)) {
                                        mhl5lidbq2.J4Ux7ym32.q3BipwRCk(indexOfChild);
                                        mhl5lidbq2.CBQ5d1kRq(view);
                                        int oon79WMrY = RecyclerView.this.MzoOEjc4X.oon79WMrY(view);
                                        if (oon79WMrY != -1) {
                                            RecyclerView.this.MzoOEjc4X.tGV7Q6urW(oon79WMrY);
                                            yWvV4ePLl(view);
                                            cywn6086a.J4Ux7ym32(8224);
                                            if (cywn6086a != null) {
                                                if (cywn6086a.CBQ5d1kRq()) {
                                                    z6 = RecyclerView.this.KlYagMRWx.GPLPRo6go;
                                                } else {
                                                    int i6 = cywn6086a.tGV7Q6urW;
                                                    if (i6 < 0 || i6 >= RecyclerView.this.sk5s77z6Q.q3BipwRCk()) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("Inconsistency detected. Invalid view holder adapter position");
                                                        sb2.append(cywn6086a);
                                                        throw new IndexOutOfBoundsException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, sb2));
                                                    }
                                                    RecyclerView recyclerView2 = RecyclerView.this;
                                                    if (recyclerView2.KlYagMRWx.GPLPRo6go || recyclerView2.sk5s77z6Q.tGV7Q6urW(cywn6086a.tGV7Q6urW) == cywn6086a.iiGwOFFnr) {
                                                        s7MlVynBG s7mlvynbg = RecyclerView.this.sk5s77z6Q;
                                                        if (!s7mlvynbg.J4Ux7ym32 || cywn6086a.kCA6Zs9sL == s7mlvynbg.J4Ux7ym32(cywn6086a.tGV7Q6urW)) {
                                                            z6 = true;
                                                        }
                                                    }
                                                    z6 = false;
                                                }
                                                if (!z6) {
                                                    if (!z) {
                                                        cywn6086a.J4Ux7ym32(4);
                                                        if (cywn6086a.kmSgne1rO()) {
                                                            RecyclerView.this.removeDetachedView(cywn6086a.q3BipwRCk, false);
                                                            cywn6086a.Bhmn1KIah.vPSbyrYWX(cywn6086a);
                                                        } else if (cywn6086a.RG6kpfv3v()) {
                                                            cywn6086a.dIocxURUo();
                                                        }
                                                        Puu3Rhg4F(cywn6086a);
                                                    }
                                                    cywn6086a = null;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        } else {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("layout index should not be -1 after unhiding a view:");
                                            sb3.append(cywn6086a);
                                            throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, sb3));
                                        }
                                    } else {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                    }
                                }
                            }
                            int size4 = this.tGV7Q6urW.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                cywn6086a3 = (cywn6086a) this.tGV7Q6urW.get(i7);
                                if (!cywn6086a3.oon79WMrY() && cywn6086a3.kCA6Zs9sL() == i && !cywn6086a3.Puu3Rhg4F()) {
                                    if (!z) {
                                        this.tGV7Q6urW.remove(i7);
                                    }
                                    cywn6086a = cywn6086a3;
                                    if (cywn6086a != null) {
                                    }
                                }
                            }
                            cywn6086a = null;
                            if (cywn6086a != null) {
                            }
                        }
                        if (cywn6086a == null) {
                            int iiGwOFFnr2 = RecyclerView.this.PSTqBLTET.iiGwOFFnr(i, 0);
                            if (iiGwOFFnr2 < 0 || iiGwOFFnr2 >= RecyclerView.this.sk5s77z6Q.q3BipwRCk()) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Inconsistency detected. Invalid item position ");
                                sb4.append(i);
                                sb4.append("(offset:");
                                sb4.append(iiGwOFFnr2);
                                sb4.append(").state:");
                                sb4.append(RecyclerView.this.KlYagMRWx.J4Ux7ym32());
                                throw new IndexOutOfBoundsException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, sb4));
                            }
                            int tGV7Q6urW = RecyclerView.this.sk5s77z6Q.tGV7Q6urW(iiGwOFFnr2);
                            s7MlVynBG s7mlvynbg2 = RecyclerView.this.sk5s77z6Q;
                            if (s7mlvynbg2.J4Ux7ym32) {
                                long J4Ux7ym322 = s7mlvynbg2.J4Ux7ym32(iiGwOFFnr2);
                                int size5 = this.q3BipwRCk.size() - 1;
                                while (true) {
                                    if (size5 < 0) {
                                        int size6 = this.tGV7Q6urW.size() - 1;
                                        while (true) {
                                            if (size6 < 0) {
                                                break;
                                            }
                                            cywn6086a = (cywn6086a) this.tGV7Q6urW.get(size6);
                                            if (cywn6086a.kCA6Zs9sL == J4Ux7ym322 && !cywn6086a.Puu3Rhg4F()) {
                                                if (tGV7Q6urW == cywn6086a.iiGwOFFnr) {
                                                    if (!z) {
                                                        this.tGV7Q6urW.remove(size6);
                                                    }
                                                } else if (!z) {
                                                    iiGwOFFnr(size6);
                                                    break;
                                                }
                                            }
                                            size6--;
                                        }
                                    } else {
                                        cywn6086a cywn6086a5 = (cywn6086a) this.q3BipwRCk.get(size5);
                                        if (cywn6086a5.kCA6Zs9sL == J4Ux7ym322 && !cywn6086a5.RG6kpfv3v()) {
                                            if (tGV7Q6urW == cywn6086a5.iiGwOFFnr) {
                                                cywn6086a5.J4Ux7ym32(32);
                                                if (cywn6086a5.CBQ5d1kRq() && !RecyclerView.this.KlYagMRWx.GPLPRo6go) {
                                                    cywn6086a5.qVUwofr5s(2, 14);
                                                }
                                                cywn6086a = cywn6086a5;
                                            } else if (!z) {
                                                this.q3BipwRCk.remove(size5);
                                                RecyclerView.this.removeDetachedView(cywn6086a5.q3BipwRCk, false);
                                                cywn6086a V9LQMKGJe2 = RecyclerView.V9LQMKGJe(cywn6086a5.q3BipwRCk);
                                                V9LQMKGJe2.Bhmn1KIah = null;
                                                V9LQMKGJe2.PSTqBLTET = false;
                                                V9LQMKGJe2.dIocxURUo();
                                                Puu3Rhg4F(V9LQMKGJe2);
                                            }
                                        }
                                        size5--;
                                    }
                                }
                                if (cywn6086a != null) {
                                    cywn6086a.tGV7Q6urW = iiGwOFFnr2;
                                    z2 = true;
                                }
                            }
                            if (cywn6086a == null) {
                                iBBoHKkSI ibbohkksi = (iBBoHKkSI) dIocxURUo().q3BipwRCk.get(tGV7Q6urW);
                                if (ibbohkksi != null && !ibbohkksi.q3BipwRCk.isEmpty()) {
                                    ArrayList arrayList2 = ibbohkksi.q3BipwRCk;
                                    for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                                        if (!((cywn6086a) arrayList2.get(size7)).Puu3Rhg4F()) {
                                            cywn6086a2 = (cywn6086a) arrayList2.remove(size7);
                                            break;
                                        }
                                    }
                                }
                                cywn6086a2 = null;
                                if (cywn6086a2 != null) {
                                    cywn6086a2.ilHKhw3Yw();
                                    int[] iArr = RecyclerView.tTcQQNK5P;
                                }
                                cywn6086a = cywn6086a2;
                            }
                            if (cywn6086a == null) {
                                long nanoTime = RecyclerView.this.getNanoTime();
                                if (j != Long.MAX_VALUE) {
                                    long j2 = this.GPLPRo6go.q3BipwRCk(tGV7Q6urW).tGV7Q6urW;
                                    if (!(j2 == 0 || j2 + nanoTime < j)) {
                                        return null;
                                    }
                                }
                                RecyclerView recyclerView3 = RecyclerView.this;
                                s7MlVynBG s7mlvynbg3 = recyclerView3.sk5s77z6Q;
                                Objects.requireNonNull(s7mlvynbg3);
                                try {
                                    int i8 = aBjutDvc3.q3BipwRCk;
                                    Trace.beginSection("RV CreateView");
                                    cywn6086a GPLPRo6go = s7mlvynbg3.GPLPRo6go(recyclerView3, tGV7Q6urW);
                                    if (GPLPRo6go.q3BipwRCk.getParent() == null) {
                                        GPLPRo6go.iiGwOFFnr = tGV7Q6urW;
                                        Trace.endSection();
                                        int[] iArr2 = RecyclerView.tTcQQNK5P;
                                        RecyclerView AqaWJg0b4 = RecyclerView.AqaWJg0b4(GPLPRo6go.q3BipwRCk);
                                        if (AqaWJg0b4 != null) {
                                            GPLPRo6go.J4Ux7ym32 = new WeakReference(AqaWJg0b4);
                                        }
                                        long nanoTime2 = RecyclerView.this.getNanoTime();
                                        Y371ZqMzx y371ZqMzx = this.GPLPRo6go;
                                        long j3 = nanoTime2 - nanoTime;
                                        iBBoHKkSI q3BipwRCk = y371ZqMzx.q3BipwRCk(tGV7Q6urW);
                                        q3BipwRCk.tGV7Q6urW = y371ZqMzx.J4Ux7ym32(q3BipwRCk.tGV7Q6urW, j3);
                                        cywn6086a = GPLPRo6go;
                                    } else {
                                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                    }
                                } finally {
                                    int i9 = aBjutDvc3.q3BipwRCk;
                                    Trace.endSection();
                                }
                            }
                        }
                        if (z2 && !RecyclerView.this.KlYagMRWx.GPLPRo6go && cywn6086a.GPLPRo6go(8192)) {
                            cywn6086a.qVUwofr5s(0, 8192);
                            if (RecyclerView.this.KlYagMRWx.oon79WMrY) {
                                lamBDew8Z.J4Ux7ym32(cywn6086a);
                                lamBDew8Z lambdew8z = RecyclerView.this.ziwPzaoF3;
                                cywn6086a.iiGwOFFnr();
                                RecyclerView.this.OpLJtmvFM(cywn6086a, lambdew8z.Puu3Rhg4F(cywn6086a));
                            }
                        }
                        if (RecyclerView.this.KlYagMRWx.GPLPRo6go || !cywn6086a.yWvV4ePLl()) {
                            if (cywn6086a.yWvV4ePLl()) {
                                if (!((cywn6086a.oon79WMrY & 2) != 0)) {
                                }
                            }
                            int iiGwOFFnr3 = RecyclerView.this.PSTqBLTET.iiGwOFFnr(i, 0);
                            cywn6086a.Eeka1udhb = null;
                            RecyclerView recyclerView4 = RecyclerView.this;
                            cywn6086a.qVUwofr5s = recyclerView4;
                            int i10 = cywn6086a.iiGwOFFnr;
                            long nanoTime3 = recyclerView4.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j4 = this.GPLPRo6go.q3BipwRCk(i10).dIocxURUo;
                            }
                            s7MlVynBG s7mlvynbg4 = RecyclerView.this.sk5s77z6Q;
                            Objects.requireNonNull(s7mlvynbg4);
                            z5 = cywn6086a.Eeka1udhb != null;
                            if (z5) {
                                cywn6086a.tGV7Q6urW = iiGwOFFnr3;
                                if (s7mlvynbg4.J4Ux7ym32) {
                                    cywn6086a.kCA6Zs9sL = s7mlvynbg4.J4Ux7ym32(iiGwOFFnr3);
                                }
                                cywn6086a.qVUwofr5s(1, 519);
                                int i11 = aBjutDvc3.q3BipwRCk;
                                Trace.beginSection("RV OnBindView");
                            }
                            cywn6086a.Eeka1udhb = s7mlvynbg4;
                            s7mlvynbg4.iiGwOFFnr(cywn6086a, iiGwOFFnr3, cywn6086a.iiGwOFFnr());
                            if (z5) {
                                List list = cywn6086a.vPSbyrYWX;
                                if (list != null) {
                                    list.clear();
                                }
                                cywn6086a.oon79WMrY &= -1025;
                                ViewGroup.LayoutParams layoutParams3 = cywn6086a.q3BipwRCk.getLayoutParams();
                                if (layoutParams3 instanceof dgsh68zH8) {
                                    ((dgsh68zH8) layoutParams3).tGV7Q6urW = true;
                                }
                            }
                            long nanoTime4 = RecyclerView.this.getNanoTime();
                            Y371ZqMzx y371ZqMzx2 = this.GPLPRo6go;
                            long j5 = nanoTime4 - nanoTime3;
                            iBBoHKkSI q3BipwRCk2 = y371ZqMzx2.q3BipwRCk(cywn6086a.iiGwOFFnr);
                            q3BipwRCk2.dIocxURUo = y371ZqMzx2.J4Ux7ym32(q3BipwRCk2.dIocxURUo, j5);
                            accessibilityManager = RecyclerView.this.V9LQMKGJe;
                            if (!(accessibilityManager == null && accessibilityManager.isEnabled())) {
                                View view2 = cywn6086a.q3BipwRCk;
                                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                                if (VCCyeOu6I.tGV7Q6urW(view2) == 0) {
                                    VCCyeOu6I.Eeka1udhb(view2, 1);
                                }
                                m1SEohb1F m1seohb1f = RecyclerView.this.uSBmk4hFZ;
                                if (m1seohb1f != null) {
                                    JLwTA7lmU jLwTA7lmU = m1seohb1f.kCA6Zs9sL;
                                    if (jLwTA7lmU instanceof JLwTA7lmU) {
                                        Objects.requireNonNull(jLwTA7lmU);
                                        XflkRyC2J kCA6Zs9sL = IuQbWntsc.kCA6Zs9sL(view2);
                                        if (!(kCA6Zs9sL == null || kCA6Zs9sL == jLwTA7lmU)) {
                                            jLwTA7lmU.kCA6Zs9sL.put(view2, kCA6Zs9sL);
                                        }
                                    }
                                    IuQbWntsc.MzoOEjc4X(view2, jLwTA7lmU);
                                }
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (RecyclerView.this.KlYagMRWx.GPLPRo6go) {
                                cywn6086a.GPLPRo6go = i;
                            }
                            z4 = z3;
                            layoutParams = cywn6086a.q3BipwRCk.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams2 = RecyclerView.this.generateDefaultLayoutParams();
                            } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                layoutParams2 = RecyclerView.this.generateLayoutParams(layoutParams);
                            } else {
                                dgsh68zh8 = (dgsh68zH8) layoutParams;
                                dgsh68zh8.q3BipwRCk = cywn6086a;
                                if (z2 && z3) {
                                    z7 = z4;
                                }
                                dgsh68zh8.dIocxURUo = z7;
                                return cywn6086a;
                            }
                            dgsh68zh8 = (dgsh68zH8) layoutParams2;
                            cywn6086a.q3BipwRCk.setLayoutParams(dgsh68zh8);
                            dgsh68zh8.q3BipwRCk = cywn6086a;
                            if (z2) {
                                z7 = z4;
                            }
                            dgsh68zh8.dIocxURUo = z7;
                            return cywn6086a;
                        }
                        cywn6086a.GPLPRo6go = i;
                        z4 = true;
                        z3 = false;
                        layoutParams = cywn6086a.q3BipwRCk.getLayoutParams();
                        if (layoutParams == null) {
                        }
                        dgsh68zh8 = (dgsh68zH8) layoutParams2;
                        cywn6086a.q3BipwRCk.setLayoutParams(dgsh68zh8);
                        dgsh68zh8.q3BipwRCk = cywn6086a;
                        if (z2) {
                        }
                        dgsh68zh8.dIocxURUo = z7;
                        return cywn6086a;
                    }
                }
                cywn6086a = null;
                if (cywn6086a != null) {
                }
            } else {
                cywn6086a = null;
            }
            z2 = false;
            if (cywn6086a == null) {
            }
            if (cywn6086a == null) {
            }
            if (z2) {
                cywn6086a.qVUwofr5s(0, 8192);
                if (RecyclerView.this.KlYagMRWx.oon79WMrY) {
                }
            }
            if (RecyclerView.this.KlYagMRWx.GPLPRo6go) {
            }
            if (cywn6086a.yWvV4ePLl()) {
            }
            int iiGwOFFnr32 = RecyclerView.this.PSTqBLTET.iiGwOFFnr(i, 0);
            cywn6086a.Eeka1udhb = null;
            RecyclerView recyclerView42 = RecyclerView.this;
            cywn6086a.qVUwofr5s = recyclerView42;
            int i102 = cywn6086a.iiGwOFFnr;
            long nanoTime32 = recyclerView42.getNanoTime();
            if (j != Long.MAX_VALUE) {
            }
            s7MlVynBG s7mlvynbg42 = RecyclerView.this.sk5s77z6Q;
            Objects.requireNonNull(s7mlvynbg42);
            if (cywn6086a.Eeka1udhb != null) {
            }
            if (z5) {
            }
            cywn6086a.Eeka1udhb = s7mlvynbg42;
            s7mlvynbg42.iiGwOFFnr(cywn6086a, iiGwOFFnr32, cywn6086a.iiGwOFFnr());
            if (z5) {
            }
            long nanoTime42 = RecyclerView.this.getNanoTime();
            Y371ZqMzx y371ZqMzx22 = this.GPLPRo6go;
            long j52 = nanoTime42 - nanoTime32;
            iBBoHKkSI q3BipwRCk22 = y371ZqMzx22.q3BipwRCk(cywn6086a.iiGwOFFnr);
            q3BipwRCk22.dIocxURUo = y371ZqMzx22.J4Ux7ym32(q3BipwRCk22.dIocxURUo, j52);
            accessibilityManager = RecyclerView.this.V9LQMKGJe;
            if (!(accessibilityManager == null && accessibilityManager.isEnabled())) {
            }
            if (RecyclerView.this.KlYagMRWx.GPLPRo6go) {
            }
            z4 = z3;
            layoutParams = cywn6086a.q3BipwRCk.getLayoutParams();
            if (layoutParams == null) {
            }
            dgsh68zh8 = (dgsh68zH8) layoutParams2;
            cywn6086a.q3BipwRCk.setLayoutParams(dgsh68zh8);
            dgsh68zh8.q3BipwRCk = cywn6086a;
            if (z2) {
            }
            dgsh68zh8.dIocxURUo = z7;
            return cywn6086a;
        }

        public void q3BipwRCk(cywn6086a cywn6086a, boolean z) {
            RecyclerView.vPSbyrYWX(cywn6086a);
            View view = cywn6086a.q3BipwRCk;
            m1SEohb1F m1seohb1f = RecyclerView.this.uSBmk4hFZ;
            if (m1seohb1f != null) {
                JLwTA7lmU jLwTA7lmU = m1seohb1f.kCA6Zs9sL;
                IuQbWntsc.MzoOEjc4X(view, jLwTA7lmU instanceof JLwTA7lmU ? (XflkRyC2J) jLwTA7lmU.kCA6Zs9sL.remove(view) : null);
            }
            if (z) {
                aDHI5aP05 adhi5ap05 = RecyclerView.this.i8XZMQc6Z;
                if (adhi5ap05 != null) {
                    adhi5ap05.q3BipwRCk(cywn6086a);
                }
                int size = RecyclerView.this.dfpT1j18n.size();
                for (int i = 0; i < size; i++) {
                    ((aDHI5aP05) RecyclerView.this.dfpT1j18n.get(i)).q3BipwRCk(cywn6086a);
                }
                RecyclerView recyclerView = RecyclerView.this;
                s7MlVynBG s7mlvynbg = recyclerView.sk5s77z6Q;
                if (recyclerView.KlYagMRWx != null) {
                    recyclerView.ilHKhw3Yw.GPLPRo6go(cywn6086a);
                }
            }
            cywn6086a.Eeka1udhb = null;
            cywn6086a.qVUwofr5s = null;
            Y371ZqMzx dIocxURUo = dIocxURUo();
            Objects.requireNonNull(dIocxURUo);
            int i2 = cywn6086a.iiGwOFFnr;
            ArrayList arrayList = dIocxURUo.q3BipwRCk(i2).q3BipwRCk;
            if (((iBBoHKkSI) dIocxURUo.q3BipwRCk.get(i2)).J4Ux7ym32 > arrayList.size()) {
                cywn6086a.ilHKhw3Yw();
                arrayList.add(cywn6086a);
            }
        }

        public int tGV7Q6urW(int i) {
            if (i < 0 || i >= RecyclerView.this.KlYagMRWx.J4Ux7ym32()) {
                StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("invalid position ", i, ". State item count is ");
                q3BipwRCk.append(RecyclerView.this.KlYagMRWx.J4Ux7ym32());
                throw new IndexOutOfBoundsException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, q3BipwRCk));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.KlYagMRWx.GPLPRo6go) {
                return i;
            }
            return recyclerView.PSTqBLTET.iiGwOFFnr(i, 0);
        }

        public void vPSbyrYWX(cywn6086a cywn6086a) {
            (cywn6086a.PSTqBLTET ? this.J4Ux7ym32 : this.q3BipwRCk).remove(cywn6086a);
            cywn6086a.Bhmn1KIah = null;
            cywn6086a.PSTqBLTET = false;
            cywn6086a.dIocxURUo();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void yWvV4ePLl(View view) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
            if (!V9LQMKGJe.GPLPRo6go(12) && V9LQMKGJe.PSTqBLTET()) {
                lamBDew8Z lambdew8z = RecyclerView.this.ziwPzaoF3;
                if (lambdew8z != null) {
                    sSVv3dJln ssvv3djln = (sSVv3dJln) lambdew8z;
                    if (V9LQMKGJe.iiGwOFFnr().isEmpty()) {
                        if (!(!ssvv3djln.GPLPRo6go || V9LQMKGJe.oon79WMrY())) {
                            z2 = false;
                            if (!z2) {
                                z = false;
                                if (!z) {
                                    if (this.J4Ux7ym32 == null) {
                                        this.J4Ux7ym32 = new ArrayList();
                                    }
                                    V9LQMKGJe.Bhmn1KIah = this;
                                    V9LQMKGJe.PSTqBLTET = true;
                                    arrayList = this.J4Ux7ym32;
                                    arrayList.add(V9LQMKGJe);
                                    return;
                                }
                            }
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                z = true;
                if (!z) {
                }
            }
            if (!V9LQMKGJe.oon79WMrY() || V9LQMKGJe.CBQ5d1kRq() || RecyclerView.this.sk5s77z6Q.J4Ux7ym32) {
                V9LQMKGJe.Bhmn1KIah = this;
                V9LQMKGJe.PSTqBLTET = false;
                arrayList = this.q3BipwRCk;
                arrayList.add(V9LQMKGJe);
                return;
            }
            throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(RecyclerView.this, abGBwSu8x.q3BipwRCk("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
    }

    /* loaded from: classes.dex */
    public class VLYkjU0mM extends WfopS3efW {
        public VLYkjU0mM() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.WfopS3efW
        public void J4Ux7ym32(int i, int i2, Object obj) {
            RecyclerView.this.yWvV4ePLl(null);
            RG2GI7LDp rG2GI7LDp = RecyclerView.this.PSTqBLTET;
            Objects.requireNonNull(rG2GI7LDp);
            boolean z = false;
            if (i2 >= 1) {
                rG2GI7LDp.J4Ux7ym32.add(rG2GI7LDp.Puu3Rhg4F(4, i, i2, obj));
                rG2GI7LDp.iiGwOFFnr |= 4;
                if (rG2GI7LDp.J4Ux7ym32.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                int[] iArr = RecyclerView.tTcQQNK5P;
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.qFBXIgpia || !recyclerView.CpG0imbht) {
                    recyclerView.o4LF8RkoQ = true;
                    recyclerView.requestLayout();
                    return;
                }
                Runnable runnable = recyclerView.Eeka1udhb;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.kmSgne1rO(recyclerView, runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.WfopS3efW
        public void q3BipwRCk() {
            RecyclerView.this.yWvV4ePLl(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.KlYagMRWx.iiGwOFFnr = true;
            recyclerView.n4UIOvAko(true);
            if (!RecyclerView.this.PSTqBLTET.GPLPRo6go()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class WfopS3efW {
        public abstract void J4Ux7ym32(int i, int i2, Object obj);

        public abstract void q3BipwRCk();
    }

    /* loaded from: classes.dex */
    public static class Y371ZqMzx {
        public SparseArray q3BipwRCk = new SparseArray();
        public int J4Ux7ym32 = 0;

        public long J4Ux7ym32(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        public final iBBoHKkSI q3BipwRCk(int i) {
            iBBoHKkSI ibbohkksi = (iBBoHKkSI) this.q3BipwRCk.get(i);
            if (ibbohkksi != null) {
                return ibbohkksi;
            }
            iBBoHKkSI ibbohkksi2 = new iBBoHKkSI();
            this.q3BipwRCk.put(i, ibbohkksi2);
            return ibbohkksi2;
        }
    }

    /* loaded from: classes.dex */
    public interface aDHI5aP05 {
        void q3BipwRCk(cywn6086a cywn6086a);
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class cywn6086a {
        public static final List dXrmkklc8 = Collections.emptyList();
        public s7MlVynBG Eeka1udhb;
        public WeakReference J4Ux7ym32;
        public int oon79WMrY;
        public final View q3BipwRCk;
        public RecyclerView qVUwofr5s;
        public int tGV7Q6urW = -1;
        public int dIocxURUo = -1;
        public long kCA6Zs9sL = -1;
        public int iiGwOFFnr = -1;
        public int GPLPRo6go = -1;
        public cywn6086a Puu3Rhg4F = null;
        public cywn6086a yWvV4ePLl = null;
        public List vPSbyrYWX = null;
        public List CBQ5d1kRq = null;
        public int kmSgne1rO = 0;
        public V1xq9aVRv Bhmn1KIah = null;
        public boolean PSTqBLTET = false;
        public int MzoOEjc4X = 0;
        public int ilHKhw3Yw = -1;

        public cywn6086a(View view) {
            if (view != null) {
                this.q3BipwRCk = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public boolean Bhmn1KIah() {
            return (this.oon79WMrY & 256) != 0;
        }

        public boolean CBQ5d1kRq() {
            return (this.oon79WMrY & 8) != 0;
        }

        public final void Eeka1udhb(boolean z) {
            int i;
            int i2 = this.kmSgne1rO;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.kmSgne1rO = i3;
            if (i3 < 0) {
                this.kmSgne1rO = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.oon79WMrY | 16;
            } else if (z && i3 == 0) {
                i = this.oon79WMrY & -17;
            } else {
                return;
            }
            this.oon79WMrY = i;
        }

        public boolean GPLPRo6go(int i) {
            return (i & this.oon79WMrY) != 0;
        }

        public void J4Ux7ym32(int i) {
            this.oon79WMrY = i | this.oon79WMrY;
        }

        public void MzoOEjc4X(int i, boolean z) {
            if (this.dIocxURUo == -1) {
                this.dIocxURUo = this.tGV7Q6urW;
            }
            if (this.GPLPRo6go == -1) {
                this.GPLPRo6go = this.tGV7Q6urW;
            }
            if (z) {
                this.GPLPRo6go += i;
            }
            this.tGV7Q6urW += i;
            if (this.q3BipwRCk.getLayoutParams() != null) {
                ((dgsh68zH8) this.q3BipwRCk.getLayoutParams()).tGV7Q6urW = true;
            }
        }

        public boolean PSTqBLTET() {
            return (this.oon79WMrY & 2) != 0;
        }

        public boolean Puu3Rhg4F() {
            return (this.q3BipwRCk.getParent() == null || this.q3BipwRCk.getParent() == this.qVUwofr5s) ? false : true;
        }

        public boolean RG6kpfv3v() {
            return (this.oon79WMrY & 32) != 0;
        }

        public void dIocxURUo() {
            this.oon79WMrY &= -33;
        }

        public boolean dXrmkklc8() {
            return (this.oon79WMrY & 128) != 0;
        }

        public List iiGwOFFnr() {
            if ((this.oon79WMrY & 1024) != 0) {
                return dXrmkklc8;
            }
            List list = this.vPSbyrYWX;
            return (list == null || list.size() == 0) ? dXrmkklc8 : this.CBQ5d1kRq;
        }

        public void ilHKhw3Yw() {
            this.oon79WMrY = 0;
            this.tGV7Q6urW = -1;
            this.dIocxURUo = -1;
            this.kCA6Zs9sL = -1;
            this.GPLPRo6go = -1;
            this.kmSgne1rO = 0;
            this.Puu3Rhg4F = null;
            this.yWvV4ePLl = null;
            List list = this.vPSbyrYWX;
            if (list != null) {
                list.clear();
            }
            this.oon79WMrY &= -1025;
            this.MzoOEjc4X = 0;
            this.ilHKhw3Yw = -1;
            RecyclerView.vPSbyrYWX(this);
        }

        public final int kCA6Zs9sL() {
            int i = this.GPLPRo6go;
            return i == -1 ? this.tGV7Q6urW : i;
        }

        public boolean kmSgne1rO() {
            return this.Bhmn1KIah != null;
        }

        public boolean oon79WMrY() {
            return (this.oon79WMrY & 4) != 0;
        }

        public void q3BipwRCk(Object obj) {
            if (obj == null) {
                J4Ux7ym32(1024);
            } else if ((1024 & this.oon79WMrY) == 0) {
                if (this.vPSbyrYWX == null) {
                    ArrayList arrayList = new ArrayList();
                    this.vPSbyrYWX = arrayList;
                    this.CBQ5d1kRq = Collections.unmodifiableList(arrayList);
                }
                this.vPSbyrYWX.add(obj);
            }
        }

        public void qVUwofr5s(int i, int i2) {
            this.oon79WMrY = (i & i2) | (this.oon79WMrY & (~i2));
        }

        public void tGV7Q6urW() {
            this.dIocxURUo = -1;
            this.GPLPRo6go = -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.tGV7Q6urW + " id=" + this.kCA6Zs9sL + ", oldPos=" + this.dIocxURUo + ", pLpos:" + this.GPLPRo6go);
            if (kmSgne1rO()) {
                sb.append(" scrap ");
                sb.append(this.PSTqBLTET ? "[changeScrap]" : "[attachedScrap]");
            }
            if (oon79WMrY()) {
                sb.append(" invalid");
            }
            if (!yWvV4ePLl()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.oon79WMrY & 2) != 0) {
                sb.append(" update");
            }
            if (CBQ5d1kRq()) {
                sb.append(" removed");
            }
            if (dXrmkklc8()) {
                sb.append(" ignored");
            }
            if (Bhmn1KIah()) {
                sb.append(" tmpDetached");
            }
            if (!vPSbyrYWX()) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(" not recyclable(");
                q3BipwRCk.append(this.kmSgne1rO);
                q3BipwRCk.append(")");
                sb.append(q3BipwRCk.toString());
            }
            if ((this.oon79WMrY & 512) == 0 && !oon79WMrY()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.q3BipwRCk.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean vPSbyrYWX() {
            if ((this.oon79WMrY & 16) == 0) {
                View view = this.q3BipwRCk;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (!VCCyeOu6I.yWvV4ePLl(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean yWvV4ePLl() {
            return (this.oon79WMrY & 1) != 0;
        }
    }

    /* loaded from: classes.dex */
    public static class dNif5KqqH extends Observable {
        public void J4Ux7ym32() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((WfopS3efW) ((Observable) this).mObservers.get(size)).q3BipwRCk();
            }
        }

        public boolean q3BipwRCk() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void tGV7Q6urW(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((WfopS3efW) ((Observable) this).mObservers.get(size)).J4Ux7ym32(i, i2, obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class dgsh68zH8 extends ViewGroup.MarginLayoutParams {
        public cywn6086a q3BipwRCk;
        public final Rect J4Ux7ym32 = new Rect();
        public boolean tGV7Q6urW = true;
        public boolean dIocxURUo = false;

        public dgsh68zH8(int i, int i2) {
            super(i, i2);
        }

        public dgsh68zH8(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public dgsh68zH8(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public dgsh68zH8(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public dgsh68zH8(dgsh68zH8 dgsh68zh8) {
            super((ViewGroup.LayoutParams) dgsh68zh8);
        }

        public boolean J4Ux7ym32() {
            return this.q3BipwRCk.PSTqBLTET();
        }

        public int q3BipwRCk() {
            return this.q3BipwRCk.kCA6Zs9sL();
        }

        public boolean tGV7Q6urW() {
            return this.q3BipwRCk.CBQ5d1kRq();
        }
    }

    /* loaded from: classes.dex */
    public class eAq6YOFAV implements Runnable {
        public OverScroller Bhmn1KIah;
        public int CBQ5d1kRq;
        public Interpolator PSTqBLTET;
        public int kmSgne1rO;
        public boolean MzoOEjc4X = false;
        public boolean ilHKhw3Yw = false;

        public eAq6YOFAV() {
            RecyclerView.this = r3;
            Interpolator interpolator = RecyclerView.LFW0KvNFt;
            this.PSTqBLTET = interpolator;
            this.Bhmn1KIah = new OverScroller(r3.getContext(), interpolator);
        }

        public void J4Ux7ym32(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.LFW0KvNFt;
            }
            if (this.PSTqBLTET != interpolator) {
                this.PSTqBLTET = interpolator;
                this.Bhmn1KIah = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.kmSgne1rO = 0;
            this.CBQ5d1kRq = 0;
            RecyclerView.this.setScrollState(2);
            this.Bhmn1KIah.startScroll(0, 0, i, i2, i3);
            q3BipwRCk();
        }

        public void q3BipwRCk() {
            if (this.MzoOEjc4X) {
                this.ilHKhw3Yw = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.kmSgne1rO(recyclerView, this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.WaUP0CF08 == null) {
                tGV7Q6urW();
                return;
            }
            this.ilHKhw3Yw = false;
            this.MzoOEjc4X = true;
            recyclerView.Bhmn1KIah();
            OverScroller overScroller = this.Bhmn1KIah;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.CBQ5d1kRq;
                int i4 = currY - this.kmSgne1rO;
                this.CBQ5d1kRq = currX;
                this.kmSgne1rO = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.aS2AFthYA;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dXrmkklc8(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.aS2AFthYA;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.kmSgne1rO(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.sk5s77z6Q != null) {
                    int[] iArr3 = recyclerView3.aS2AFthYA;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.INnK5Rew6(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.aS2AFthYA;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    kVmRinNH6 kvmrinnh6 = recyclerView4.WaUP0CF08.kCA6Zs9sL;
                    if (kvmrinnh6 != null && !kvmrinnh6.dIocxURUo && kvmrinnh6.kCA6Zs9sL) {
                        int J4Ux7ym32 = recyclerView4.KlYagMRWx.J4Ux7ym32();
                        if (J4Ux7ym32 == 0) {
                            kvmrinnh6.dIocxURUo();
                        } else {
                            if (kvmrinnh6.q3BipwRCk >= J4Ux7ym32) {
                                kvmrinnh6.q3BipwRCk = J4Ux7ym32 - 1;
                            }
                            kvmrinnh6.J4Ux7ym32(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.iMyQMM6Qj.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.aS2AFthYA;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.RG6kpfv3v(i, i2, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.aS2AFthYA;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.ixWaw2akD(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                kVmRinNH6 kvmrinnh62 = recyclerView7.WaUP0CF08.kCA6Zs9sL;
                if ((kvmrinnh62 != null && kvmrinnh62.dIocxURUo) || !z) {
                    q3BipwRCk();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    aXI58Y1kr axi58y1kr = recyclerView8.IG30YE5GU;
                    if (axi58y1kr != null) {
                        axi58y1kr.q3BipwRCk(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i7 < 0) {
                            recyclerView9.WaUP0CF08();
                            if (recyclerView9.j22ftfeNI.isFinished()) {
                                recyclerView9.j22ftfeNI.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.i8XZMQc6Z();
                            if (recyclerView9.L4EwGfXiQ.isFinished()) {
                                recyclerView9.L4EwGfXiQ.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.dfpT1j18n();
                            if (recyclerView9.QSbMsHU5X.isFinished()) {
                                recyclerView9.QSbMsHU5X.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.sk5s77z6Q();
                            if (recyclerView9.zHl31GGXU.isFinished()) {
                                recyclerView9.zHl31GGXU.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i7 == 0 && currVelocity == 0)) {
                            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                            VCCyeOu6I.vPSbyrYWX(recyclerView9);
                        }
                    }
                    int[] iArr7 = RecyclerView.tTcQQNK5P;
                    aXI58Y1kr.RG2GI7LDp rG2GI7LDp = RecyclerView.this.buPcffgdD;
                    int[] iArr8 = rG2GI7LDp.tGV7Q6urW;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    rG2GI7LDp.dIocxURUo = 0;
                }
            }
            kVmRinNH6 kvmrinnh63 = RecyclerView.this.WaUP0CF08.kCA6Zs9sL;
            if (kvmrinnh63 != null && kvmrinnh63.dIocxURUo) {
                kvmrinnh63.J4Ux7ym32(0, 0);
            }
            this.MzoOEjc4X = false;
            if (this.ilHKhw3Yw) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.kmSgne1rO(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.KlYagMRWx(1);
        }

        public void tGV7Q6urW() {
            RecyclerView.this.removeCallbacks(this);
            this.Bhmn1KIah.abortAnimation();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class kVmRinNH6 {
        public RecyclerView J4Ux7ym32;
        public boolean Puu3Rhg4F;
        public boolean dIocxURUo;
        public View iiGwOFFnr;
        public boolean kCA6Zs9sL;
        public LULQkQlc9 tGV7Q6urW;
        public int q3BipwRCk = -1;
        public final QbovnGRsC GPLPRo6go = new QbovnGRsC(0, 0);

        /* loaded from: classes.dex */
        public interface RG2GI7LDp {
            PointF q3BipwRCk(int i);
        }

        public void J4Ux7ym32(int i, int i2) {
            PointF q3BipwRCk;
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (this.q3BipwRCk == -1 || recyclerView == null) {
                dIocxURUo();
            }
            if (this.dIocxURUo && this.iiGwOFFnr == null && this.tGV7Q6urW != null && (q3BipwRCk = q3BipwRCk(this.q3BipwRCk)) != null) {
                float f = q3BipwRCk.x;
                if (!(f == 0.0f && q3BipwRCk.y == 0.0f)) {
                    recyclerView.INnK5Rew6((int) Math.signum(f), (int) Math.signum(q3BipwRCk.y), null);
                }
            }
            boolean z = false;
            this.dIocxURUo = false;
            View view = this.iiGwOFFnr;
            if (view != null) {
                if (this.J4Ux7ym32.i0Zug1mVk(view) == this.q3BipwRCk) {
                    tGV7Q6urW(this.iiGwOFFnr, recyclerView.KlYagMRWx, this.GPLPRo6go);
                    this.GPLPRo6go.q3BipwRCk(recyclerView);
                    dIocxURUo();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.iiGwOFFnr = null;
                }
            }
            if (this.kCA6Zs9sL) {
                kvFwRYSUX kvfwrysux = recyclerView.KlYagMRWx;
                QbovnGRsC qbovnGRsC = this.GPLPRo6go;
                NySN5IVuc nySN5IVuc = (NySN5IVuc) this;
                if (nySN5IVuc.J4Ux7ym32.WaUP0CF08.WaUP0CF08() == 0) {
                    nySN5IVuc.dIocxURUo();
                } else {
                    int i3 = nySN5IVuc.PSTqBLTET;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    nySN5IVuc.PSTqBLTET = i4;
                    int i5 = nySN5IVuc.MzoOEjc4X;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    nySN5IVuc.MzoOEjc4X = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF q3BipwRCk2 = nySN5IVuc.q3BipwRCk(nySN5IVuc.q3BipwRCk);
                        if (q3BipwRCk2 != null) {
                            float f2 = q3BipwRCk2.x;
                            if (!(f2 == 0.0f && q3BipwRCk2.y == 0.0f)) {
                                float f3 = q3BipwRCk2.y;
                                float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                                float f4 = q3BipwRCk2.x / sqrt;
                                q3BipwRCk2.x = f4;
                                float f5 = q3BipwRCk2.y / sqrt;
                                q3BipwRCk2.y = f5;
                                nySN5IVuc.vPSbyrYWX = q3BipwRCk2;
                                nySN5IVuc.PSTqBLTET = (int) (f4 * 10000.0f);
                                nySN5IVuc.MzoOEjc4X = (int) (f5 * 10000.0f);
                                qbovnGRsC.J4Ux7ym32((int) (((float) nySN5IVuc.PSTqBLTET) * 1.2f), (int) (((float) nySN5IVuc.MzoOEjc4X) * 1.2f), (int) (((float) nySN5IVuc.GPLPRo6go(10000)) * 1.2f), nySN5IVuc.yWvV4ePLl);
                            }
                        }
                        qbovnGRsC.dIocxURUo = nySN5IVuc.q3BipwRCk;
                        nySN5IVuc.dIocxURUo();
                    }
                }
                QbovnGRsC qbovnGRsC2 = this.GPLPRo6go;
                if (qbovnGRsC2.dIocxURUo >= 0) {
                    z = true;
                }
                qbovnGRsC2.q3BipwRCk(recyclerView);
                if (z && this.kCA6Zs9sL) {
                    this.dIocxURUo = true;
                    recyclerView.R2hkbNqWf.q3BipwRCk();
                }
            }
        }

        public final void dIocxURUo() {
            if (this.kCA6Zs9sL) {
                this.kCA6Zs9sL = false;
                NySN5IVuc nySN5IVuc = (NySN5IVuc) this;
                nySN5IVuc.MzoOEjc4X = 0;
                nySN5IVuc.PSTqBLTET = 0;
                nySN5IVuc.vPSbyrYWX = null;
                this.J4Ux7ym32.KlYagMRWx.q3BipwRCk = -1;
                this.iiGwOFFnr = null;
                this.q3BipwRCk = -1;
                this.dIocxURUo = false;
                LULQkQlc9 lULQkQlc9 = this.tGV7Q6urW;
                if (lULQkQlc9.kCA6Zs9sL == this) {
                    lULQkQlc9.kCA6Zs9sL = null;
                }
                this.tGV7Q6urW = null;
                this.J4Ux7ym32 = null;
            }
        }

        public PointF q3BipwRCk(int i) {
            LULQkQlc9 lULQkQlc9 = this.tGV7Q6urW;
            if (lULQkQlc9 instanceof RG2GI7LDp) {
                return ((RG2GI7LDp) lULQkQlc9).q3BipwRCk(i);
            }
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            q3BipwRCk.append(RG2GI7LDp.class.getCanonicalName());
            Log.w("RecyclerView", q3BipwRCk.toString());
            return null;
        }

        public abstract void tGV7Q6urW(View view, kvFwRYSUX kvfwrysux, QbovnGRsC qbovnGRsC);
    }

    /* loaded from: classes.dex */
    public static class kvFwRYSUX {
        public int Bhmn1KIah;
        public int CBQ5d1kRq;
        public long kmSgne1rO;
        public int q3BipwRCk = -1;
        public int J4Ux7ym32 = 0;
        public int tGV7Q6urW = 0;
        public int dIocxURUo = 1;
        public int kCA6Zs9sL = 0;
        public boolean iiGwOFFnr = false;
        public boolean GPLPRo6go = false;
        public boolean Puu3Rhg4F = false;
        public boolean yWvV4ePLl = false;
        public boolean oon79WMrY = false;
        public boolean vPSbyrYWX = false;

        public int J4Ux7ym32() {
            return this.GPLPRo6go ? this.J4Ux7ym32 - this.tGV7Q6urW : this.kCA6Zs9sL;
        }

        public void q3BipwRCk(int i) {
            if ((this.dIocxURUo & i) == 0) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Layout state should be one of ");
                q3BipwRCk.append(Integer.toBinaryString(i));
                q3BipwRCk.append(" but it is ");
                q3BipwRCk.append(Integer.toBinaryString(this.dIocxURUo));
                throw new IllegalStateException(q3BipwRCk.toString());
            }
        }

        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("State{mTargetPosition=");
            q3BipwRCk.append(this.q3BipwRCk);
            q3BipwRCk.append(", mData=");
            q3BipwRCk.append((Object) null);
            q3BipwRCk.append(", mItemCount=");
            q3BipwRCk.append(this.kCA6Zs9sL);
            q3BipwRCk.append(", mIsMeasuring=");
            q3BipwRCk.append(this.yWvV4ePLl);
            q3BipwRCk.append(", mPreviousLayoutItemCount=");
            q3BipwRCk.append(this.J4Ux7ym32);
            q3BipwRCk.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            q3BipwRCk.append(this.tGV7Q6urW);
            q3BipwRCk.append(", mStructureChanged=");
            q3BipwRCk.append(this.iiGwOFFnr);
            q3BipwRCk.append(", mInPreLayout=");
            q3BipwRCk.append(this.GPLPRo6go);
            q3BipwRCk.append(", mRunSimpleAnimations=");
            q3BipwRCk.append(this.oon79WMrY);
            q3BipwRCk.append(", mRunPredictiveAnimations=");
            q3BipwRCk.append(this.vPSbyrYWX);
            q3BipwRCk.append('}');
            return q3BipwRCk.toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class lamBDew8Z {
        public RG2GI7LDp q3BipwRCk = null;
        public ArrayList J4Ux7ym32 = new ArrayList();
        public long tGV7Q6urW = 120;
        public long dIocxURUo = 120;
        public long kCA6Zs9sL = 250;
        public long iiGwOFFnr = 250;

        /* loaded from: classes.dex */
        public interface RG2GI7LDp {
        }

        /* loaded from: classes.dex */
        public static class mhl5lIdbQ {
            public int J4Ux7ym32;
            public int q3BipwRCk;
        }

        public static int J4Ux7ym32(cywn6086a cywn6086a) {
            int i = cywn6086a.oon79WMrY & 14;
            if (cywn6086a.oon79WMrY()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = cywn6086a.dIocxURUo;
            RecyclerView recyclerView = cywn6086a.qVUwofr5s;
            int NyWTwPF6V = recyclerView == null ? -1 : recyclerView.NyWTwPF6V(cywn6086a);
            return (i2 == -1 || NyWTwPF6V == -1 || i2 == NyWTwPF6V) ? i : i | 2048;
        }

        public abstract boolean GPLPRo6go();

        public mhl5lIdbQ Puu3Rhg4F(cywn6086a cywn6086a) {
            mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ();
            View view = cywn6086a.q3BipwRCk;
            mhl5lidbq.q3BipwRCk = view.getLeft();
            mhl5lidbq.J4Ux7ym32 = view.getTop();
            view.getRight();
            view.getBottom();
            return mhl5lidbq;
        }

        public final void dIocxURUo() {
            int size = this.J4Ux7ym32.size();
            for (int i = 0; i < size; i++) {
                ((j2eYa3WQM) this.J4Ux7ym32.get(i)).q3BipwRCk();
            }
            this.J4Ux7ym32.clear();
        }

        public abstract void iiGwOFFnr();

        public abstract void kCA6Zs9sL(cywn6086a cywn6086a);

        public abstract boolean q3BipwRCk(cywn6086a cywn6086a, cywn6086a cywn6086a2, mhl5lIdbQ mhl5lidbq, mhl5lIdbQ mhl5lidbq2);

        public final void tGV7Q6urW(cywn6086a cywn6086a) {
            RG2GI7LDp rG2GI7LDp = this.q3BipwRCk;
            if (rG2GI7LDp != null) {
                Q6hF6Z6Ad q6hF6Z6Ad = (Q6hF6Z6Ad) rG2GI7LDp;
                Objects.requireNonNull(q6hF6Z6Ad);
                boolean z = true;
                cywn6086a.Eeka1udhb(true);
                if (cywn6086a.Puu3Rhg4F != null && cywn6086a.yWvV4ePLl == null) {
                    cywn6086a.Puu3Rhg4F = null;
                }
                cywn6086a.yWvV4ePLl = null;
                if (!((cywn6086a.oon79WMrY & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = cywn6086a.q3BipwRCk;
                    recyclerView.R2hkbNqWf();
                    mhl5lIdbQ mhl5lidbq = recyclerView.MzoOEjc4X;
                    int indexOfChild = ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).q3BipwRCk.indexOfChild(view);
                    if (indexOfChild == -1) {
                        mhl5lidbq.CBQ5d1kRq(view);
                    } else if (mhl5lidbq.J4Ux7ym32.dIocxURUo(indexOfChild)) {
                        mhl5lidbq.J4Ux7ym32.iiGwOFFnr(indexOfChild);
                        mhl5lidbq.CBQ5d1kRq(view);
                        ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).tGV7Q6urW(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
                        recyclerView.kmSgne1rO.vPSbyrYWX(V9LQMKGJe);
                        recyclerView.kmSgne1rO.Puu3Rhg4F(V9LQMKGJe);
                    }
                    recyclerView.buPcffgdD(!z);
                    if (!z && cywn6086a.Bhmn1KIah()) {
                        RecyclerView.this.removeDetachedView(cywn6086a.q3BipwRCk, false);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements Runnable {
        public mhl5lIdbQ() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            lamBDew8Z lambdew8z = RecyclerView.this.ziwPzaoF3;
            if (lambdew8z != null) {
                sSVv3dJln ssvv3djln = (sSVv3dJln) lambdew8z;
                boolean z = !ssvv3djln.Puu3Rhg4F.isEmpty();
                boolean z2 = !ssvv3djln.oon79WMrY.isEmpty();
                boolean z3 = !ssvv3djln.vPSbyrYWX.isEmpty();
                boolean z4 = !ssvv3djln.yWvV4ePLl.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator it = ssvv3djln.Puu3Rhg4F.iterator();
                    while (it.hasNext()) {
                        cywn6086a cywn6086a = (cywn6086a) it.next();
                        View view = cywn6086a.q3BipwRCk;
                        ViewPropertyAnimator animate = view.animate();
                        ssvv3djln.ilHKhw3Yw.add(cywn6086a);
                        animate.setDuration(ssvv3djln.dIocxURUo).alpha(0.0f).setListener(new t2bwToAfA(ssvv3djln, cywn6086a, animate, view)).start();
                    }
                    ssvv3djln.Puu3Rhg4F.clear();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(ssvv3djln.oon79WMrY);
                        ssvv3djln.kmSgne1rO.add(arrayList);
                        ssvv3djln.oon79WMrY.clear();
                        L2LvyJsSh l2LvyJsSh = new L2LvyJsSh(ssvv3djln, arrayList, 0);
                        if (z) {
                            View view2 = ((WgCAwL00L) arrayList.get(0)).q3BipwRCk.q3BipwRCk;
                            long j = ssvv3djln.dIocxURUo;
                            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                            VCCyeOu6I.Bhmn1KIah(view2, l2LvyJsSh, j);
                        } else {
                            l2LvyJsSh.run();
                        }
                    }
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(ssvv3djln.vPSbyrYWX);
                        ssvv3djln.Bhmn1KIah.add(arrayList2);
                        ssvv3djln.vPSbyrYWX.clear();
                        L2LvyJsSh l2LvyJsSh2 = new L2LvyJsSh(ssvv3djln, arrayList2, 1);
                        if (z) {
                            View view3 = ((ltHymUmUx) arrayList2.get(0)).q3BipwRCk.q3BipwRCk;
                            long j2 = ssvv3djln.dIocxURUo;
                            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                            VCCyeOu6I.Bhmn1KIah(view3, l2LvyJsSh2, j2);
                        } else {
                            l2LvyJsSh2.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(ssvv3djln.yWvV4ePLl);
                        ssvv3djln.CBQ5d1kRq.add(arrayList3);
                        ssvv3djln.yWvV4ePLl.clear();
                        L2LvyJsSh l2LvyJsSh3 = new L2LvyJsSh(ssvv3djln, arrayList3, 2);
                        if (z || z2 || z3) {
                            long j3 = 0;
                            long j4 = z ? ssvv3djln.dIocxURUo : 0;
                            long j5 = z2 ? ssvv3djln.kCA6Zs9sL : 0;
                            if (z3) {
                                j3 = ssvv3djln.iiGwOFFnr;
                            }
                            View view4 = ((cywn6086a) arrayList3.get(0)).q3BipwRCk;
                            WeakHashMap weakHashMap3 = IuQbWntsc.q3BipwRCk;
                            VCCyeOu6I.Bhmn1KIah(view4, l2LvyJsSh3, Math.max(j5, j3) + j4);
                        } else {
                            l2LvyJsSh3.run();
                        }
                    }
                }
            }
            RecyclerView.this.Ta2zrwkcM = false;
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements dNif5KqqH.RG2GI7LDp {
        public qhPEQQaQ4() {
            RecyclerView.this = r1;
        }

        public void J4Ux7ym32(cywn6086a cywn6086a, lamBDew8Z.mhl5lIdbQ mhl5lidbq, lamBDew8Z.mhl5lIdbQ mhl5lidbq2) {
            boolean z;
            RecyclerView.this.kmSgne1rO.vPSbyrYWX(cywn6086a);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.iiGwOFFnr(cywn6086a);
            cywn6086a.Eeka1udhb(false);
            sSVv3dJln ssvv3djln = (sSVv3dJln) recyclerView.ziwPzaoF3;
            Objects.requireNonNull(ssvv3djln);
            int i = mhl5lidbq.q3BipwRCk;
            int i2 = mhl5lidbq.J4Ux7ym32;
            View view = cywn6086a.q3BipwRCk;
            int left = mhl5lidbq2 == null ? view.getLeft() : mhl5lidbq2.q3BipwRCk;
            int top = mhl5lidbq2 == null ? view.getTop() : mhl5lidbq2.J4Ux7ym32;
            if (cywn6086a.CBQ5d1kRq() || (i == left && i2 == top)) {
                ssvv3djln.Bhmn1KIah(cywn6086a);
                ssvv3djln.Puu3Rhg4F.add(cywn6086a);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = ssvv3djln.yWvV4ePLl(cywn6086a, i, i2, left, top);
            }
            if (z) {
                recyclerView.wIZEdYHUn();
            }
        }

        public void q3BipwRCk(cywn6086a cywn6086a, lamBDew8Z.mhl5lIdbQ mhl5lidbq, lamBDew8Z.mhl5lIdbQ mhl5lidbq2) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            cywn6086a.Eeka1udhb(false);
            sSVv3dJln ssvv3djln = (sSVv3dJln) recyclerView.ziwPzaoF3;
            Objects.requireNonNull(ssvv3djln);
            if (mhl5lidbq == null || ((i = mhl5lidbq.q3BipwRCk) == (i2 = mhl5lidbq2.q3BipwRCk) && mhl5lidbq.J4Ux7ym32 == mhl5lidbq2.J4Ux7ym32)) {
                ssvv3djln.Bhmn1KIah(cywn6086a);
                cywn6086a.q3BipwRCk.setAlpha(0.0f);
                ssvv3djln.yWvV4ePLl.add(cywn6086a);
                z = true;
            } else {
                z = ssvv3djln.yWvV4ePLl(cywn6086a, i, mhl5lidbq.J4Ux7ym32, i2, mhl5lidbq2.J4Ux7ym32);
            }
            if (z) {
                recyclerView.wIZEdYHUn();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class s7MlVynBG {
        public final dNif5KqqH q3BipwRCk = new dNif5KqqH();
        public boolean J4Ux7ym32 = false;
        public int tGV7Q6urW = 1;

        public abstract cywn6086a GPLPRo6go(ViewGroup viewGroup, int i);

        public long J4Ux7ym32(int i) {
            return -1;
        }

        public final void dIocxURUo(int i, Object obj) {
            this.q3BipwRCk.tGV7Q6urW(i, 1, obj);
        }

        public void iiGwOFFnr(cywn6086a cywn6086a, int i, List list) {
            kCA6Zs9sL(cywn6086a, i);
        }

        public abstract void kCA6Zs9sL(cywn6086a cywn6086a, int i);

        public abstract int q3BipwRCk();

        public int tGV7Q6urW(int i) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class wnbPPCp4x {
        public abstract void J4Ux7ym32(RecyclerView recyclerView, int i, int i2);

        public void q3BipwRCk(RecyclerView recyclerView, int i) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class wwj2VvJy1 {
    }

    static {
        Class cls = Integer.TYPE;
        oRfL5Lv1q = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:31)(12:32|(1:35)|34|73|37|(1:39)(1:40)|41|42|69|43|44|48)|73|37|(0)(0)|41|42|69|43|44|48) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x025a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025d, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0271, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0292, code lost:
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r0, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0225 A[Catch: ClassNotFoundException -> 0x030b, InvocationTargetException -> 0x02ee, InstantiationException -> 0x02d1, IllegalAccessException -> 0x02b2, ClassCastException -> 0x0293, TryCatch #4 {ClassCastException -> 0x0293, ClassNotFoundException -> 0x030b, IllegalAccessException -> 0x02b2, InstantiationException -> 0x02d1, InvocationTargetException -> 0x02ee, blocks: (B:37:0x021f, B:39:0x0225, B:40:0x022e, B:41:0x0232, B:43:0x023e, B:47:0x025d, B:48:0x0263, B:50:0x0272, B:51:0x0292), top: B:73:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022e A[Catch: ClassNotFoundException -> 0x030b, InvocationTargetException -> 0x02ee, InstantiationException -> 0x02d1, IllegalAccessException -> 0x02b2, ClassCastException -> 0x0293, TryCatch #4 {ClassCastException -> 0x0293, ClassNotFoundException -> 0x030b, IllegalAccessException -> 0x02b2, InstantiationException -> 0x02d1, InvocationTargetException -> 0x02ee, blocks: (B:37:0x021f, B:39:0x0225, B:40:0x022e, B:41:0x0232, B:43:0x023e, B:47:0x025d, B:48:0x0263, B:50:0x0272, B:51:0x0292), top: B:73:0x021f }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        StringBuilder sb;
        this.CBQ5d1kRq = new VLYkjU0mM();
        this.kmSgne1rO = new V1xq9aVRv();
        this.ilHKhw3Yw = new dNif5KqqH();
        this.Eeka1udhb = new RG2GI7LDp();
        this.dXrmkklc8 = new Rect();
        this.RG6kpfv3v = new Rect();
        this.ixWaw2akD = new RectF();
        this.dfpT1j18n = new ArrayList();
        this.iMyQMM6Qj = new ArrayList();
        this.cAwN510t2 = new ArrayList();
        this.AqaWJg0b4 = 0;
        this.QNqj6nIzv = false;
        this.igRQEZxnW = false;
        this.EBQXiIPmm = 0;
        this.TyB1UUd72 = 0;
        this.juJ6pnCpu = new Rma6SHcSH();
        this.ziwPzaoF3 = new sSVv3dJln();
        this.wIZEdYHUn = 0;
        this.IzM1cD9ly = -1;
        this.ln3nf7LH3 = Float.MIN_VALUE;
        this.Dr7UqlxEV = Float.MIN_VALUE;
        this.M66hQ219i = true;
        this.R2hkbNqWf = new eAq6YOFAV();
        this.buPcffgdD = new aXI58Y1kr.RG2GI7LDp();
        this.KlYagMRWx = new kvFwRYSUX();
        this.YmNRDyka4 = false;
        this.ShSN9wbzk = false;
        this.Ihm5o4uLx = new Q6hF6Z6Ad();
        this.Ta2zrwkcM = false;
        char c = 2;
        this.vIbyhVf1d = new int[2];
        this.suAKJqyYV = new int[2];
        this.hKeU0pt2N = new int[2];
        this.aS2AFthYA = new int[2];
        this.tFD7BDQ71 = new ArrayList();
        this.BqpzfZavo = new mhl5lIdbQ();
        this.ifDs8fRNm = 0;
        this.CMnfe2r2N = 0;
        this.OuoYhTxyj = new qhPEQQaQ4();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.kktL0P5MG = viewConfiguration.getScaledTouchSlop();
        this.ln3nf7LH3 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.Dr7UqlxEV = viewConfiguration.getScaledVerticalScrollFactor();
        this.INnK5Rew6 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.SuKhTJIQc = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.ziwPzaoF3.q3BipwRCk = this.Ihm5o4uLx;
        this.PSTqBLTET = new RG2GI7LDp(new s7MlVynBG(this));
        this.MzoOEjc4X = new mhl5lIdbQ(new qhPEQQaQ4(this));
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (HCKbStpM1.J4Ux7ym32(this) == 0) {
            HCKbStpM1.CBQ5d1kRq(this, 8);
        }
        if (VCCyeOu6I.tGV7Q6urW(this) == 0) {
            VCCyeOu6I.Eeka1udhb(this, 1);
        }
        this.V9LQMKGJe = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new m1SEohb1F(this));
        int[] iArr = FydS381oY.q3BipwRCk;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        IuQbWntsc.PSTqBLTET(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.qVUwofr5s = obtainStyledAttributes.getBoolean(1, true);
        int i2 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(this, abGBwSu8x.q3BipwRCk("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c = 2;
            new isrYs6b4I(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                try {
                    if (trim.charAt(0) == '.') {
                        sb = new StringBuilder();
                        sb.append(context.getPackageName());
                    } else {
                        if (!trim.contains(".")) {
                            sb = new StringBuilder();
                            sb.append(RecyclerView.class.getPackage().getName());
                            sb.append('.');
                        }
                        Class<? extends U> asSubclass = Class.forName(trim, false, !isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LULQkQlc9.class);
                        Object[] objArr = null;
                        Constructor constructor = asSubclass.getConstructor(oRfL5Lv1q);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                        constructor.setAccessible(true);
                        setLayoutManager((LULQkQlc9) constructor.newInstance(objArr));
                    }
                    Class<? extends U> asSubclass2 = Class.forName(trim, false, !isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LULQkQlc9.class);
                    Object[] objArr3 = null;
                    Constructor constructor2 = asSubclass2.getConstructor(oRfL5Lv1q);
                    Object[] objArr22 = new Object[i2];
                    objArr22[0] = context;
                    objArr22[1] = attributeSet;
                    objArr22[c] = Integer.valueOf(i);
                    objArr22[3] = 0;
                    objArr3 = objArr22;
                    constructor2.setAccessible(true);
                    setLayoutManager((LULQkQlc9) constructor2.newInstance(objArr3));
                } catch (ClassCastException e) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e);
                } catch (ClassNotFoundException e2) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e3);
                } catch (InstantiationException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                }
                sb.append(trim);
                trim = sb.toString();
            }
        }
        int[] iArr2 = tTcQQNK5P;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        IuQbWntsc.PSTqBLTET(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    public static RecyclerView AqaWJg0b4(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView AqaWJg0b4 = AqaWJg0b4(viewGroup.getChildAt(i));
            if (AqaWJg0b4 != null) {
                return AqaWJg0b4;
            }
        }
        return null;
    }

    public static cywn6086a V9LQMKGJe(View view) {
        if (view == null) {
            return null;
        }
        return ((dgsh68zH8) view.getLayoutParams()).q3BipwRCk;
    }

    private p2GzZFWt4 getScrollingChildHelper() {
        if (this.JxIJId84K == null) {
            this.JxIJId84K = new p2GzZFWt4(this);
        }
        return this.JxIJId84K;
    }

    public static void vPSbyrYWX(cywn6086a cywn6086a2) {
        WeakReference weakReference = cywn6086a2.J4Ux7ym32;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view != cywn6086a2.q3BipwRCk) {
                        obj = view.getParent();
                        if (obj instanceof View) {
                            break;
                        }
                    } else {
                        return;
                    }
                }
                cywn6086a2.J4Ux7ym32 = null;
                return;
            }
        }
    }

    public void BL4OzhZBd() {
        lamBDew8Z lambdew8z = this.ziwPzaoF3;
        if (lambdew8z != null) {
            lambdew8z.iiGwOFFnr();
        }
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            lULQkQlc9.lqFHPHdW3(this.kmSgne1rO);
            this.WaUP0CF08.oesmsHQJU(this.kmSgne1rO);
        }
        this.kmSgne1rO.J4Ux7ym32();
    }

    public void Bhmn1KIah() {
        if (!this.nlGCs0NZs || this.QNqj6nIzv) {
            int i = aBjutDvc3.q3BipwRCk;
            Trace.beginSection("RV FullInvalidate");
            ilHKhw3Yw();
            Trace.endSection();
        } else if (this.PSTqBLTET.GPLPRo6go()) {
            RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
            int i2 = rG2GI7LDp.iiGwOFFnr;
            boolean z = false;
            if ((i2 & 4) != 0) {
                if (!((i2 & 11) != 0)) {
                    int i3 = aBjutDvc3.q3BipwRCk;
                    Trace.beginSection("RV PartialInvalidate");
                    R2hkbNqWf();
                    L4EwGfXiQ();
                    this.PSTqBLTET.oon79WMrY();
                    if (!this.mUqPm6GBh) {
                        int kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL();
                        int i4 = 0;
                        while (true) {
                            if (i4 < kCA6Zs9sL) {
                                cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.dIocxURUo(i4));
                                if (V9LQMKGJe != null && !V9LQMKGJe.dXrmkklc8() && V9LQMKGJe.PSTqBLTET()) {
                                    z = true;
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            ilHKhw3Yw();
                        } else {
                            this.PSTqBLTET.J4Ux7ym32();
                        }
                    }
                    buPcffgdD(true);
                    zHl31GGXU(true);
                    Trace.endSection();
                }
            }
            if (rG2GI7LDp.GPLPRo6go()) {
                int i5 = aBjutDvc3.q3BipwRCk;
                Trace.beginSection("RV FullInvalidate");
                ilHKhw3Yw();
                Trace.endSection();
            }
        }
    }

    public void CBQ5d1kRq() {
        int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
        for (int i = 0; i < Puu3Rhg4F; i++) {
            cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.GPLPRo6go(i));
            if (!V9LQMKGJe.dXrmkklc8()) {
                V9LQMKGJe.tGV7Q6urW();
            }
        }
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        int size = v1xq9aVRv.tGV7Q6urW.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cywn6086a) v1xq9aVRv.tGV7Q6urW.get(i2)).tGV7Q6urW();
        }
        int size2 = v1xq9aVRv.q3BipwRCk.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cywn6086a) v1xq9aVRv.q3BipwRCk.get(i3)).tGV7Q6urW();
        }
        ArrayList arrayList = v1xq9aVRv.J4Ux7ym32;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((cywn6086a) v1xq9aVRv.J4Ux7ym32.get(i4)).tGV7Q6urW();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public View CpG0imbht(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    public void Dr7UqlxEV(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.NyWTwPF6V) {
            int i4 = 0;
            if (!lULQkQlc9.kCA6Zs9sL()) {
                i = 0;
            }
            if (!this.WaUP0CF08.iiGwOFFnr()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        IG30YE5GU(i4, 1);
                    }
                    this.R2hkbNqWf.J4Ux7ym32(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public void DuuXfa7LE(wnbPPCp4x wnbppcp4x) {
        List list = this.oesmsHQJU;
        if (list != null) {
            list.remove(wnbppcp4x);
        }
    }

    public void EBQXiIPmm() {
        this.zHl31GGXU = null;
        this.QSbMsHU5X = null;
        this.L4EwGfXiQ = null;
        this.j22ftfeNI = null;
    }

    public final void Eeka1udhb() {
        R2hkbNqWf();
        L4EwGfXiQ();
        this.KlYagMRWx.q3BipwRCk(6);
        this.PSTqBLTET.tGV7Q6urW();
        this.KlYagMRWx.kCA6Zs9sL = this.sk5s77z6Q.q3BipwRCk();
        this.KlYagMRWx.tGV7Q6urW = 0;
        if (this.Bhmn1KIah != null) {
            s7MlVynBG s7mlvynbg = this.sk5s77z6Q;
            int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(s7mlvynbg.tGV7Q6urW);
            if (tGV7Q6urW == 1 ? s7mlvynbg.q3BipwRCk() > 0 : tGV7Q6urW != 2) {
                Parcelable parcelable = this.Bhmn1KIah.Bhmn1KIah;
                if (parcelable != null) {
                    this.WaUP0CF08.IG30YE5GU(parcelable);
                }
                this.Bhmn1KIah = null;
            }
        }
        kvFwRYSUX kvfwrysux = this.KlYagMRWx;
        kvfwrysux.GPLPRo6go = false;
        this.WaUP0CF08.M66hQ219i(this.kmSgne1rO, kvfwrysux);
        kvFwRYSUX kvfwrysux2 = this.KlYagMRWx;
        kvfwrysux2.iiGwOFFnr = false;
        kvfwrysux2.oon79WMrY = kvfwrysux2.oon79WMrY && this.ziwPzaoF3 != null;
        kvfwrysux2.dIocxURUo = 4;
        zHl31GGXU(true);
        buPcffgdD(false);
    }

    public void GPLPRo6go(DrTf1eLw4 drTf1eLw4) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            lULQkQlc9.dIocxURUo("Cannot add item decoration during a scroll  or layout");
        }
        if (this.iMyQMM6Qj.isEmpty()) {
            setWillNotDraw(false);
        }
        this.iMyQMM6Qj.add(drTf1eLw4);
        j22ftfeNI();
        requestLayout();
    }

    public boolean IG30YE5GU(int i, int i2) {
        return getScrollingChildHelper().yWvV4ePLl(i, i2);
    }

    public void INnK5Rew6(int i, int i2, int[] iArr) {
        cywn6086a cywn6086a2;
        R2hkbNqWf();
        L4EwGfXiQ();
        int i3 = aBjutDvc3.q3BipwRCk;
        Trace.beginSection("RV Scroll");
        cAwN510t2(this.KlYagMRWx);
        int a8N8UmDyD = i != 0 ? this.WaUP0CF08.a8N8UmDyD(i, this.kmSgne1rO, this.KlYagMRWx) : 0;
        int JxIJId84K = i2 != 0 ? this.WaUP0CF08.JxIJId84K(i2, this.kmSgne1rO, this.KlYagMRWx) : 0;
        Trace.endSection();
        int kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL();
        for (int i4 = 0; i4 < kCA6Zs9sL; i4++) {
            View dIocxURUo = this.MzoOEjc4X.dIocxURUo(i4);
            cywn6086a o4LF8RkoQ = o4LF8RkoQ(dIocxURUo);
            if (!(o4LF8RkoQ == null || (cywn6086a2 = o4LF8RkoQ.yWvV4ePLl) == null)) {
                View view = cywn6086a2.q3BipwRCk;
                int left = dIocxURUo.getLeft();
                int top = dIocxURUo.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        zHl31GGXU(true);
        buPcffgdD(false);
        if (iArr != null) {
            iArr[0] = a8N8UmDyD;
            iArr[1] = JxIJId84K;
        }
    }

    public View IytU16YUK(float f, float f2) {
        for (int kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL() - 1; kCA6Zs9sL >= 0; kCA6Zs9sL--) {
            View dIocxURUo = this.MzoOEjc4X.dIocxURUo(kCA6Zs9sL);
            float translationX = dIocxURUo.getTranslationX();
            float translationY = dIocxURUo.getTranslationY();
            if (f >= ((float) dIocxURUo.getLeft()) + translationX && f <= ((float) dIocxURUo.getRight()) + translationX && f2 >= ((float) dIocxURUo.getTop()) + translationY && f2 <= ((float) dIocxURUo.getBottom()) + translationY) {
                return dIocxURUo;
            }
        }
        return null;
    }

    public final void IzM1cD9ly() {
        boolean z;
        boolean z2 = false;
        if (this.QNqj6nIzv) {
            RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
            rG2GI7LDp.CBQ5d1kRq(rG2GI7LDp.J4Ux7ym32);
            rG2GI7LDp.CBQ5d1kRq(rG2GI7LDp.tGV7Q6urW);
            rG2GI7LDp.iiGwOFFnr = 0;
            if (this.igRQEZxnW) {
                this.WaUP0CF08.INnK5Rew6(this);
            }
        }
        if (this.ziwPzaoF3 != null && this.WaUP0CF08.oRfL5Lv1q()) {
            this.PSTqBLTET.oon79WMrY();
        } else {
            this.PSTqBLTET.tGV7Q6urW();
        }
        boolean z3 = this.YmNRDyka4 || this.ShSN9wbzk;
        kvFwRYSUX kvfwrysux = this.KlYagMRWx;
        boolean z4 = this.nlGCs0NZs && this.ziwPzaoF3 != null && ((z = this.QNqj6nIzv) || z3 || this.WaUP0CF08.iiGwOFFnr) && (!z || this.sk5s77z6Q.J4Ux7ym32);
        kvfwrysux.oon79WMrY = z4;
        if (z4 && z3 && !this.QNqj6nIzv) {
            if (this.ziwPzaoF3 != null && this.WaUP0CF08.oRfL5Lv1q()) {
                z2 = true;
            }
        }
        kvfwrysux.vPSbyrYWX = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean KBYw84i3W(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        float f;
        EdgeEffect edgeEffect;
        float f2;
        Bhmn1KIah();
        if (this.sk5s77z6Q != null) {
            int[] iArr = this.aS2AFthYA;
            iArr[0] = 0;
            iArr[1] = 0;
            INnK5Rew6(i, i2, iArr);
            int[] iArr2 = this.aS2AFthYA;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i5 = i - i8;
            i4 = i2 - i9;
            i7 = i9;
            i6 = i8;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.iMyQMM6Qj.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.aS2AFthYA;
        iArr3[0] = 0;
        iArr3[1] = 0;
        RG6kpfv3v(i6, i7, i5, i4, this.suAKJqyYV, i3, iArr3);
        int[] iArr4 = this.aS2AFthYA;
        int i10 = i5 - iArr4[0];
        int i11 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.DuuXfa7LE;
        int[] iArr5 = this.suAKJqyYV;
        this.DuuXfa7LE = i12 - iArr5[0];
        this.XYT7vJqNO -= iArr5[1];
        int[] iArr6 = this.hKeU0pt2N;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    float x = motionEvent.getX();
                    float f3 = (float) i10;
                    float y = motionEvent.getY();
                    float f4 = (float) i11;
                    if (f3 < 0.0f) {
                        WaUP0CF08();
                        edgeEffect = this.j22ftfeNI;
                        f = (-f3) / ((float) getWidth());
                        f2 = 1.0f - (y / ((float) getHeight()));
                    } else if (f3 > 0.0f) {
                        i8XZMQc6Z();
                        edgeEffect = this.L4EwGfXiQ;
                        f = f3 / ((float) getWidth());
                        f2 = y / ((float) getHeight());
                    } else {
                        z = false;
                        if (f4 >= 0.0f) {
                            dfpT1j18n();
                            this.QSbMsHU5X.onPull((-f4) / ((float) getHeight()), x / ((float) getWidth()));
                        } else {
                            if (f4 > 0.0f) {
                                sk5s77z6Q();
                                this.zHl31GGXU.onPull(f4 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
                            }
                            if (!(z && f3 == 0.0f && f4 == 0.0f)) {
                                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                                VCCyeOu6I.vPSbyrYWX(this);
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                        VCCyeOu6I.vPSbyrYWX(this);
                    }
                    edgeEffect.onPull(f, f2);
                    z = true;
                    if (f4 >= 0.0f) {
                    }
                    z = true;
                    if (z) {
                    }
                    WeakHashMap weakHashMap22 = IuQbWntsc.q3BipwRCk;
                    VCCyeOu6I.vPSbyrYWX(this);
                }
            }
            kmSgne1rO(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            ixWaw2akD(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    public void KlYagMRWx(int i) {
        getScrollingChildHelper().oon79WMrY(i);
    }

    public void L4EwGfXiQ() {
        this.EBQXiIPmm++;
    }

    public void M66hQ219i(int i) {
        if (!this.NyWTwPF6V) {
            LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
            if (lULQkQlc9 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                lULQkQlc9.OuoYhTxyj(this, this.KlYagMRWx, i);
            }
        }
    }

    public void MzoOEjc4X(View view) {
        cywn6086a V9LQMKGJe = V9LQMKGJe(view);
        s7MlVynBG s7mlvynbg = this.sk5s77z6Q;
        if (s7mlvynbg != null && V9LQMKGJe != null) {
            Objects.requireNonNull(s7mlvynbg);
        }
    }

    public int NyWTwPF6V(cywn6086a cywn6086a2) {
        if (!cywn6086a2.GPLPRo6go(524) && cywn6086a2.yWvV4ePLl()) {
            RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
            int i = cywn6086a2.tGV7Q6urW;
            int size = rG2GI7LDp.J4Ux7ym32.size();
            for (int i2 = 0; i2 < size; i2++) {
                RG2GI7LDp.mhl5lIdbQ mhl5lidbq = (RG2GI7LDp.mhl5lIdbQ) rG2GI7LDp.J4Ux7ym32.get(i2);
                int i3 = mhl5lidbq.q3BipwRCk;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = mhl5lidbq.J4Ux7ym32;
                        if (i4 <= i) {
                            int i5 = mhl5lidbq.dIocxURUo;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = mhl5lidbq.J4Ux7ym32;
                        if (i6 == i) {
                            i = mhl5lidbq.dIocxURUo;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (mhl5lidbq.dIocxURUo <= i) {
                                i++;
                            }
                        }
                    }
                } else if (mhl5lidbq.J4Ux7ym32 <= i) {
                    i += mhl5lidbq.dIocxURUo;
                }
            }
            return i;
        }
        return -1;
    }

    public void OpLJtmvFM(cywn6086a cywn6086a2, lamBDew8Z.mhl5lIdbQ mhl5lidbq) {
        cywn6086a2.qVUwofr5s(0, 8192);
        if (this.KlYagMRWx.Puu3Rhg4F && cywn6086a2.PSTqBLTET() && !cywn6086a2.CBQ5d1kRq() && !cywn6086a2.dXrmkklc8()) {
            this.ilHKhw3Yw.J4Ux7ym32.iiGwOFFnr(vNtjxmzUM(cywn6086a2), cywn6086a2);
        }
        this.ilHKhw3Yw.tGV7Q6urW(cywn6086a2, mhl5lidbq);
    }

    public void PSTqBLTET(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        setMeasuredDimension(LULQkQlc9.Puu3Rhg4F(i, paddingRight, VCCyeOu6I.kCA6Zs9sL(this)), LULQkQlc9.Puu3Rhg4F(i2, getPaddingBottom() + getPaddingTop(), VCCyeOu6I.dIocxURUo(this)));
    }

    public void Puu3Rhg4F(wnbPPCp4x wnbppcp4x) {
        if (this.oesmsHQJU == null) {
            this.oesmsHQJU = new ArrayList();
        }
        this.oesmsHQJU.add(wnbppcp4x);
    }

    public Rect QNqj6nIzv(View view) {
        dgsh68zH8 dgsh68zh8 = (dgsh68zH8) view.getLayoutParams();
        if (!dgsh68zh8.tGV7Q6urW) {
            return dgsh68zh8.J4Ux7ym32;
        }
        if (this.KlYagMRWx.GPLPRo6go && (dgsh68zh8.J4Ux7ym32() || dgsh68zh8.q3BipwRCk.oon79WMrY())) {
            return dgsh68zh8.J4Ux7ym32;
        }
        Rect rect = dgsh68zh8.J4Ux7ym32;
        rect.set(0, 0, 0, 0);
        int size = this.iMyQMM6Qj.size();
        for (int i = 0; i < size; i++) {
            this.dXrmkklc8.set(0, 0, 0, 0);
            Rect rect2 = this.dXrmkklc8;
            Objects.requireNonNull((DrTf1eLw4) this.iMyQMM6Qj.get(i));
            ((dgsh68zH8) view.getLayoutParams()).q3BipwRCk();
            rect2.set(0, 0, 0, 0);
            int i2 = rect.left;
            Rect rect3 = this.dXrmkklc8;
            rect.left = i2 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        dgsh68zh8.tGV7Q6urW = false;
        return rect;
    }

    public void QSbMsHU5X(int i, int i2, boolean z) {
        int i3 = i + i2;
        int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
        for (int i4 = 0; i4 < Puu3Rhg4F; i4++) {
            cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.GPLPRo6go(i4));
            if (V9LQMKGJe != null && !V9LQMKGJe.dXrmkklc8()) {
                int i5 = V9LQMKGJe.tGV7Q6urW;
                if (i5 >= i3) {
                    V9LQMKGJe.MzoOEjc4X(-i2, z);
                } else if (i5 >= i) {
                    V9LQMKGJe.J4Ux7ym32(8);
                    V9LQMKGJe.MzoOEjc4X(-i2, z);
                    V9LQMKGJe.tGV7Q6urW = i - 1;
                }
                this.KlYagMRWx.iiGwOFFnr = true;
            }
        }
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        int size = v1xq9aVRv.tGV7Q6urW.size();
        while (true) {
            size--;
            if (size >= 0) {
                cywn6086a cywn6086a2 = (cywn6086a) v1xq9aVRv.tGV7Q6urW.get(size);
                if (cywn6086a2 != null) {
                    int i6 = cywn6086a2.tGV7Q6urW;
                    if (i6 >= i3) {
                        cywn6086a2.MzoOEjc4X(-i2, z);
                    } else if (i6 >= i) {
                        cywn6086a2.J4Ux7ym32(8);
                        v1xq9aVRv.iiGwOFFnr(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void R2hkbNqWf() {
        int i = this.AqaWJg0b4 + 1;
        this.AqaWJg0b4 = i;
        if (i == 1 && !this.NyWTwPF6V) {
            this.mUqPm6GBh = false;
        }
    }

    public final void RG6kpfv3v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().iiGwOFFnr(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void SuKhTJIQc(int i) {
        if (!this.NyWTwPF6V) {
            lqFHPHdW3();
            LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
            if (lULQkQlc9 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            lULQkQlc9.vIbyhVf1d(i);
            awakenScrollBars();
        }
    }

    public boolean TyB1UUd72() {
        return this.EBQXiIPmm > 0;
    }

    public void WaUP0CF08() {
        int i;
        int i2;
        if (this.j22ftfeNI == null) {
            EdgeEffect q3BipwRCk = this.juJ6pnCpu.q3BipwRCk(this);
            this.j22ftfeNI = q3BipwRCk;
            if (this.qVUwofr5s) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            q3BipwRCk.setSize(i2, i);
        }
    }

    public final void XYT7vJqNO(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.dXrmkklc8.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof dgsh68zH8) {
            dgsh68zH8 dgsh68zh8 = (dgsh68zH8) layoutParams;
            if (!dgsh68zh8.tGV7Q6urW) {
                Rect rect = dgsh68zh8.J4Ux7ym32;
                Rect rect2 = this.dXrmkklc8;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.dXrmkklc8);
            offsetRectIntoDescendantCoords(view, this.dXrmkklc8);
        }
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        Rect rect3 = this.dXrmkklc8;
        boolean z = true;
        boolean z2 = !this.nlGCs0NZs;
        if (view2 != null) {
            z = false;
        }
        lULQkQlc9.Ta2zrwkcM(this, view, rect3, z2, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            Objects.requireNonNull(lULQkQlc9);
        }
        super.addFocusables(arrayList, i, i2);
    }

    public void buPcffgdD(boolean z) {
        if (this.AqaWJg0b4 < 1) {
            this.AqaWJg0b4 = 1;
        }
        if (!z && !this.NyWTwPF6V) {
            this.mUqPm6GBh = false;
        }
        if (this.AqaWJg0b4 == 1) {
            if (z && this.mUqPm6GBh && !this.NyWTwPF6V && this.WaUP0CF08 != null && this.sk5s77z6Q != null) {
                ilHKhw3Yw();
            }
            if (!this.NyWTwPF6V) {
                this.mUqPm6GBh = false;
            }
        }
        this.AqaWJg0b4--;
    }

    public final void cAwN510t2(kvFwRYSUX kvfwrysux) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.R2hkbNqWf.Bhmn1KIah;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(kvfwrysux);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(kvfwrysux);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof dgsh68zH8) && this.WaUP0CF08.GPLPRo6go((dgsh68zH8) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && lULQkQlc9.kCA6Zs9sL()) {
            return this.WaUP0CF08.vPSbyrYWX(this.KlYagMRWx);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && lULQkQlc9.kCA6Zs9sL()) {
            return this.WaUP0CF08.CBQ5d1kRq(this.KlYagMRWx);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && lULQkQlc9.kCA6Zs9sL()) {
            return this.WaUP0CF08.kmSgne1rO(this.KlYagMRWx);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && lULQkQlc9.iiGwOFFnr()) {
            return this.WaUP0CF08.Bhmn1KIah(this.KlYagMRWx);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && lULQkQlc9.iiGwOFFnr()) {
            return this.WaUP0CF08.PSTqBLTET(this.KlYagMRWx);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && lULQkQlc9.iiGwOFFnr()) {
            return this.WaUP0CF08.MzoOEjc4X(this.KlYagMRWx);
        }
        return 0;
    }

    public boolean dXrmkklc8(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().tGV7Q6urW(i, i2, iArr, iArr2, i3);
    }

    public void dfpT1j18n() {
        int i;
        int i2;
        if (this.QSbMsHU5X == null) {
            EdgeEffect q3BipwRCk = this.juJ6pnCpu.q3BipwRCk(this);
            this.QSbMsHU5X = q3BipwRCk;
            if (this.qVUwofr5s) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            q3BipwRCk.setSize(i2, i);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().q3BipwRCk(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().J4Ux7ym32(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().tGV7Q6urW(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().kCA6Zs9sL(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.iMyQMM6Qj.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((DrTf1eLw4) this.iMyQMM6Qj.get(i)).kCA6Zs9sL(canvas, this, this.KlYagMRWx);
        }
        EdgeEffect edgeEffect = this.j22ftfeNI;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.qVUwofr5s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.j22ftfeNI;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.QSbMsHU5X;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.qVUwofr5s) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.QSbMsHU5X;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.L4EwGfXiQ;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.qVUwofr5s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.L4EwGfXiQ;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.zHl31GGXU;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.qVUwofr5s) {
                f2 = (float) (getPaddingRight() + (-getWidth()));
                f = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f2 = (float) (-getWidth());
                f = (float) (-getHeight());
            }
            canvas.translate(f2, f);
            EdgeEffect edgeEffect8 = this.zHl31GGXU;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.ziwPzaoF3 == null || this.iMyQMM6Qj.size() <= 0 || !this.ziwPzaoF3.GPLPRo6go()) {
            z3 = z;
        }
        if (z3) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.vPSbyrYWX(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0166, code lost:
        if (r3 > 0) goto L_0x019a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0180, code lost:
        if (r6 > 0) goto L_0x019a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
        if (r3 < 0) goto L_0x019a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0186, code lost:
        if (r6 < 0) goto L_0x019a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018e, code lost:
        if ((r6 * r2) <= 0) goto L_0x0199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0196, code lost:
        if ((r6 * r2) >= 0) goto L_0x0199;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /* Code decompiled incorrectly, please refer to instructions dump */
    public View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c;
        boolean z;
        Objects.requireNonNull(this.WaUP0CF08);
        boolean z2 = true;
        boolean z3 = this.sk5s77z6Q != null && this.WaUP0CF08 != null && !TyB1UUd72() && !this.NyWTwPF6V;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                Bhmn1KIah();
                if (CpG0imbht(view) == null) {
                    return null;
                }
                R2hkbNqWf();
                view2 = this.WaUP0CF08.BL4OzhZBd(view, i, this.kmSgne1rO, this.KlYagMRWx);
                buPcffgdD(false);
            }
        } else {
            if (this.WaUP0CF08.iiGwOFFnr()) {
                if (instance.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.WaUP0CF08.kCA6Zs9sL()) {
                        z = instance.findNextFocus(this, view, !((this.WaUP0CF08.vNtjxmzUM() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        Bhmn1KIah();
                        if (CpG0imbht(view) == null) {
                            return null;
                        }
                        R2hkbNqWf();
                        this.WaUP0CF08.BL4OzhZBd(view, i, this.kmSgne1rO, this.KlYagMRWx);
                        buPcffgdD(false);
                    }
                    view2 = instance.findNextFocus(this, view, i);
                }
            }
            z = false;
            if (!z) {
                if (instance.findNextFocus(this, view, !((this.WaUP0CF08.vNtjxmzUM() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!(view2 == null || view2 == this || view2 == view)) {
                if (CpG0imbht(view2) == null) {
                    z2 = false;
                } else if (!(view == null || CpG0imbht(view) == null)) {
                    this.dXrmkklc8.set(0, 0, view.getWidth(), view.getHeight());
                    this.RG6kpfv3v.set(0, 0, view2.getWidth(), view2.getHeight());
                    offsetDescendantRectToMyCoords(view, this.dXrmkklc8);
                    offsetDescendantRectToMyCoords(view2, this.RG6kpfv3v);
                    int i3 = this.WaUP0CF08.vNtjxmzUM() == 1 ? -1 : 1;
                    Rect rect = this.dXrmkklc8;
                    int i4 = rect.left;
                    Rect rect2 = this.RG6kpfv3v;
                    int i5 = rect2.left;
                    if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                        i2 = 1;
                    } else {
                        int i6 = rect.right;
                        int i7 = rect2.right;
                        i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                    }
                    int i8 = rect.top;
                    int i9 = rect2.top;
                    if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                        c = 1;
                    } else {
                        int i10 = rect.bottom;
                        int i11 = rect2.bottom;
                        c = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Invalid direction: ");
                                            sb.append(i);
                                            throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(this, sb));
                                        }
                                    }
                                }
                            }
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                return !z2 ? view2 : super.focusSearch(view, i);
            }
            z2 = false;
            if (!z2) {
            }
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            XYT7vJqNO(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            return lULQkQlc9.dXrmkklc8();
        }
        throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, abGBwSu8x.q3BipwRCk("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            return lULQkQlc9.RG6kpfv3v(getContext(), attributeSet);
        }
        throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, abGBwSu8x.q3BipwRCk("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            return lULQkQlc9.ixWaw2akD(layoutParams);
        }
        throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, abGBwSu8x.q3BipwRCk("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public s7MlVynBG getAdapter() {
        return this.sk5s77z6Q;
    }

    @Override // android.view.View
    public int getBaseline() {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(lULQkQlc9);
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        PMYI4lLJM pMYI4lLJM = this.a8N8UmDyD;
        return pMYI4lLJM == null ? super.getChildDrawingOrder(i, i2) : pMYI4lLJM.q3BipwRCk(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.qVUwofr5s;
    }

    public m1SEohb1F getCompatAccessibilityDelegate() {
        return this.uSBmk4hFZ;
    }

    public Rma6SHcSH getEdgeEffectFactory() {
        return this.juJ6pnCpu;
    }

    public lamBDew8Z getItemAnimator() {
        return this.ziwPzaoF3;
    }

    public int getItemDecorationCount() {
        return this.iMyQMM6Qj.size();
    }

    public LULQkQlc9 getLayoutManager() {
        return this.WaUP0CF08;
    }

    public int getMaxFlingVelocity() {
        return this.SuKhTJIQc;
    }

    public int getMinFlingVelocity() {
        return this.INnK5Rew6;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public Og6dYSoy7 getOnFlingListener() {
        return this.KBYw84i3W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.M66hQ219i;
    }

    public Y371ZqMzx getRecycledViewPool() {
        return this.kmSgne1rO.dIocxURUo();
    }

    public int getScrollState() {
        return this.wIZEdYHUn;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().Puu3Rhg4F(0);
    }

    public int i0Zug1mVk(View view) {
        cywn6086a V9LQMKGJe = V9LQMKGJe(view);
        if (V9LQMKGJe != null) {
            return V9LQMKGJe.kCA6Zs9sL();
        }
        return -1;
    }

    public void i8XZMQc6Z() {
        int i;
        int i2;
        if (this.L4EwGfXiQ == null) {
            EdgeEffect q3BipwRCk = this.juJ6pnCpu.q3BipwRCk(this);
            this.L4EwGfXiQ = q3BipwRCk;
            if (this.qVUwofr5s) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            q3BipwRCk.setSize(i2, i);
        }
    }

    public String iMyQMM6Qj() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(" ");
        q3BipwRCk.append(super.toString());
        q3BipwRCk.append(", adapter:");
        q3BipwRCk.append(this.sk5s77z6Q);
        q3BipwRCk.append(", layout:");
        q3BipwRCk.append(this.WaUP0CF08);
        q3BipwRCk.append(", context:");
        q3BipwRCk.append(getContext());
        return q3BipwRCk.toString();
    }

    public boolean igRQEZxnW() {
        return !this.nlGCs0NZs || this.QNqj6nIzv || this.PSTqBLTET.GPLPRo6go();
    }

    public final void iiGwOFFnr(cywn6086a cywn6086a2) {
        View view = cywn6086a2.q3BipwRCk;
        boolean z = view.getParent() == this;
        this.kmSgne1rO.vPSbyrYWX(o4LF8RkoQ(view));
        if (cywn6086a2.Bhmn1KIah()) {
            this.MzoOEjc4X.J4Ux7ym32(view, -1, view.getLayoutParams(), true);
            return;
        }
        mhl5lIdbQ mhl5lidbq = this.MzoOEjc4X;
        if (!z) {
            mhl5lidbq.q3BipwRCk(view, -1, true);
            return;
        }
        int indexOfChild = ((qhPEQQaQ4) mhl5lidbq.q3BipwRCk).q3BipwRCk.indexOfChild(view);
        if (indexOfChild >= 0) {
            mhl5lidbq.J4Ux7ym32.Puu3Rhg4F(indexOfChild);
            mhl5lidbq.yWvV4ePLl(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x031a, code lost:
        if (r15.MzoOEjc4X.vPSbyrYWX(getFocusedChild()) == false) goto L_0x03de;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void ilHKhw3Yw() {
        kvFwRYSUX kvfwrysux;
        ArrayList arrayList;
        LULQkQlc9 lULQkQlc9;
        int i;
        int[] iArr;
        long j;
        cywn6086a cywn6086a2;
        View view;
        View findViewById;
        cywn6086a mUqPm6GBh;
        boolean z;
        cywn6086a cywn6086a3;
        lamBDew8Z.mhl5lIdbQ mhl5lidbq;
        lamBDew8Z.mhl5lIdbQ mhl5lidbq2;
        boolean z2;
        if (this.sk5s77z6Q == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.WaUP0CF08 == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            int i2 = 0;
            this.KlYagMRWx.yWvV4ePLl = false;
            boolean z3 = true;
            boolean z4 = this.koMoKnP1S && !(this.ifDs8fRNm == getWidth() && this.CMnfe2r2N == getHeight());
            this.ifDs8fRNm = 0;
            this.CMnfe2r2N = 0;
            this.koMoKnP1S = false;
            if (this.KlYagMRWx.dIocxURUo == 1) {
                qVUwofr5s();
            } else {
                RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
                if (!(!rG2GI7LDp.tGV7Q6urW.isEmpty() && !rG2GI7LDp.J4Ux7ym32.isEmpty()) && !z4 && this.WaUP0CF08.Bhmn1KIah == getWidth() && this.WaUP0CF08.PSTqBLTET == getHeight()) {
                    this.WaUP0CF08.suAKJqyYV(this);
                    int i3 = 4;
                    this.KlYagMRWx.q3BipwRCk(4);
                    R2hkbNqWf();
                    L4EwGfXiQ();
                    kvfwrysux = this.KlYagMRWx;
                    kvfwrysux.dIocxURUo = 1;
                    if (kvfwrysux.oon79WMrY) {
                        int kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL() - 1;
                        while (kCA6Zs9sL >= 0) {
                            cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.dIocxURUo(kCA6Zs9sL));
                            if (!V9LQMKGJe.dXrmkklc8()) {
                                long vNtjxmzUM = vNtjxmzUM(V9LQMKGJe);
                                Objects.requireNonNull(this.ziwPzaoF3);
                                lamBDew8Z.mhl5lIdbQ mhl5lidbq3 = new lamBDew8Z.mhl5lIdbQ();
                                View view2 = V9LQMKGJe.q3BipwRCk;
                                mhl5lidbq3.q3BipwRCk = view2.getLeft();
                                mhl5lidbq3.J4Ux7ym32 = view2.getTop();
                                view2.getRight();
                                view2.getBottom();
                                cywn6086a cywn6086a4 = (cywn6086a) this.ilHKhw3Yw.J4Ux7ym32.kCA6Zs9sL(vNtjxmzUM, null);
                                if (cywn6086a4 != null && !cywn6086a4.dXrmkklc8()) {
                                    boolean dIocxURUo = this.ilHKhw3Yw.dIocxURUo(cywn6086a4);
                                    boolean dIocxURUo2 = this.ilHKhw3Yw.dIocxURUo(V9LQMKGJe);
                                    if (!dIocxURUo || cywn6086a4 != V9LQMKGJe) {
                                        lamBDew8Z.mhl5lIdbQ kCA6Zs9sL2 = this.ilHKhw3Yw.kCA6Zs9sL(cywn6086a4, i3);
                                        this.ilHKhw3Yw.J4Ux7ym32(V9LQMKGJe, mhl5lidbq3);
                                        lamBDew8Z.mhl5lIdbQ kCA6Zs9sL3 = this.ilHKhw3Yw.kCA6Zs9sL(V9LQMKGJe, 8);
                                        if (kCA6Zs9sL2 == null) {
                                            int kCA6Zs9sL4 = this.MzoOEjc4X.kCA6Zs9sL();
                                            for (int i4 = 0; i4 < kCA6Zs9sL4; i4++) {
                                                cywn6086a V9LQMKGJe2 = V9LQMKGJe(this.MzoOEjc4X.dIocxURUo(i4));
                                                if (V9LQMKGJe2 != V9LQMKGJe && vNtjxmzUM(V9LQMKGJe2) == vNtjxmzUM) {
                                                    s7MlVynBG s7mlvynbg = this.sk5s77z6Q;
                                                    if (s7mlvynbg == null || !s7mlvynbg.J4Ux7ym32) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                        sb.append(V9LQMKGJe2);
                                                        sb.append(" \n View Holder 2:");
                                                        sb.append(V9LQMKGJe);
                                                        throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, sb));
                                                    }
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                    sb2.append(V9LQMKGJe2);
                                                    sb2.append(" \n View Holder 2:");
                                                    sb2.append(V9LQMKGJe);
                                                    throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, sb2));
                                                }
                                            }
                                            Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + cywn6086a4 + " cannot be found but it is necessary for " + V9LQMKGJe + iMyQMM6Qj());
                                        } else {
                                            cywn6086a4.Eeka1udhb(false);
                                            if (dIocxURUo) {
                                                iiGwOFFnr(cywn6086a4);
                                            }
                                            if (cywn6086a4 != V9LQMKGJe) {
                                                if (dIocxURUo2) {
                                                    iiGwOFFnr(V9LQMKGJe);
                                                }
                                                cywn6086a4.Puu3Rhg4F = V9LQMKGJe;
                                                iiGwOFFnr(cywn6086a4);
                                                this.kmSgne1rO.vPSbyrYWX(cywn6086a4);
                                                V9LQMKGJe.Eeka1udhb(false);
                                                V9LQMKGJe.yWvV4ePLl = cywn6086a4;
                                            }
                                            if (this.ziwPzaoF3.q3BipwRCk(cywn6086a4, V9LQMKGJe, kCA6Zs9sL2, kCA6Zs9sL3)) {
                                                wIZEdYHUn();
                                            }
                                        }
                                    }
                                }
                                this.ilHKhw3Yw.J4Ux7ym32(V9LQMKGJe, mhl5lidbq3);
                            }
                            kCA6Zs9sL--;
                            i3 = 4;
                        }
                        dNif5KqqH dnif5kqqh = this.ilHKhw3Yw;
                        dNif5KqqH.RG2GI7LDp rG2GI7LDp2 = this.OuoYhTxyj;
                        int i5 = dnif5kqqh.q3BipwRCk.Bhmn1KIah;
                        while (true) {
                            i5--;
                            if (i5 < 0) {
                                break;
                            }
                            cywn6086a cywn6086a5 = (cywn6086a) dnif5kqqh.q3BipwRCk.Puu3Rhg4F(i5);
                            CHivVJVYm cHivVJVYm = (CHivVJVYm) dnif5kqqh.q3BipwRCk.yWvV4ePLl(i5);
                            int i6 = cHivVJVYm.q3BipwRCk;
                            if ((i6 & 3) != 3) {
                                if ((i6 & 1) != 0) {
                                    mhl5lidbq2 = cHivVJVYm.J4Ux7ym32;
                                    if (mhl5lidbq2 != null) {
                                        mhl5lidbq = cHivVJVYm.tGV7Q6urW;
                                    }
                                } else {
                                    if ((i6 & 14) != 14) {
                                        if ((i6 & 12) == 12) {
                                            lamBDew8Z.mhl5lIdbQ mhl5lidbq4 = cHivVJVYm.J4Ux7ym32;
                                            lamBDew8Z.mhl5lIdbQ mhl5lidbq5 = cHivVJVYm.tGV7Q6urW;
                                            qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) rG2GI7LDp2;
                                            Objects.requireNonNull(qhpeqqaq4);
                                            cywn6086a5.Eeka1udhb(false);
                                            RecyclerView recyclerView = RecyclerView.this;
                                            boolean z5 = recyclerView.QNqj6nIzv;
                                            lamBDew8Z lambdew8z = recyclerView.ziwPzaoF3;
                                            if (z5) {
                                                if (!lambdew8z.q3BipwRCk(cywn6086a5, cywn6086a5, mhl5lidbq4, mhl5lidbq5)) {
                                                }
                                                RecyclerView.this.wIZEdYHUn();
                                            } else {
                                                sSVv3dJln ssvv3djln = (sSVv3dJln) lambdew8z;
                                                Objects.requireNonNull(ssvv3djln);
                                                int i7 = mhl5lidbq4.q3BipwRCk;
                                                int i8 = mhl5lidbq5.q3BipwRCk;
                                                if (i7 == i8 && mhl5lidbq4.J4Ux7ym32 == mhl5lidbq5.J4Ux7ym32) {
                                                    ssvv3djln.tGV7Q6urW(cywn6086a5);
                                                    z2 = false;
                                                } else {
                                                    z2 = ssvv3djln.yWvV4ePLl(cywn6086a5, i7, mhl5lidbq4.J4Ux7ym32, i8, mhl5lidbq5.J4Ux7ym32);
                                                }
                                                if (!z2) {
                                                }
                                                RecyclerView.this.wIZEdYHUn();
                                            }
                                        } else if ((i6 & 4) != 0) {
                                            mhl5lidbq2 = cHivVJVYm.J4Ux7ym32;
                                            mhl5lidbq = null;
                                        } else if ((i6 & 8) == 0) {
                                        }
                                        CHivVJVYm.J4Ux7ym32(cHivVJVYm);
                                    }
                                    ((qhPEQQaQ4) rG2GI7LDp2).q3BipwRCk(cywn6086a5, cHivVJVYm.J4Ux7ym32, cHivVJVYm.tGV7Q6urW);
                                    CHivVJVYm.J4Ux7ym32(cHivVJVYm);
                                }
                                ((qhPEQQaQ4) rG2GI7LDp2).J4Ux7ym32(cywn6086a5, mhl5lidbq2, mhl5lidbq);
                                CHivVJVYm.J4Ux7ym32(cHivVJVYm);
                            }
                            RecyclerView recyclerView2 = RecyclerView.this;
                            recyclerView2.WaUP0CF08.YmNRDyka4(cywn6086a5.q3BipwRCk, recyclerView2.kmSgne1rO);
                            CHivVJVYm.J4Ux7ym32(cHivVJVYm);
                        }
                    }
                    this.WaUP0CF08.oesmsHQJU(this.kmSgne1rO);
                    kvFwRYSUX kvfwrysux2 = this.KlYagMRWx;
                    kvfwrysux2.J4Ux7ym32 = kvfwrysux2.kCA6Zs9sL;
                    this.QNqj6nIzv = false;
                    this.igRQEZxnW = false;
                    kvfwrysux2.oon79WMrY = false;
                    kvfwrysux2.vPSbyrYWX = false;
                    this.WaUP0CF08.iiGwOFFnr = false;
                    arrayList = this.kmSgne1rO.J4Ux7ym32;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    lULQkQlc9 = this.WaUP0CF08;
                    if (lULQkQlc9.vPSbyrYWX) {
                        lULQkQlc9.oon79WMrY = 0;
                        lULQkQlc9.vPSbyrYWX = false;
                        this.kmSgne1rO.CBQ5d1kRq();
                    }
                    this.WaUP0CF08.R2hkbNqWf(this.KlYagMRWx);
                    zHl31GGXU(true);
                    buPcffgdD(false);
                    dNif5KqqH dnif5kqqh2 = this.ilHKhw3Yw;
                    dnif5kqqh2.q3BipwRCk.clear();
                    dnif5kqqh2.J4Ux7ym32.q3BipwRCk();
                    int[] iArr2 = this.vIbyhVf1d;
                    i = iArr2[0];
                    int i9 = iArr2[1];
                    nlGCs0NZs(iArr2);
                    iArr = this.vIbyhVf1d;
                    if (iArr[0] == i && iArr[1] == i9) {
                        z3 = false;
                    }
                    if (z3) {
                        ixWaw2akD(0, 0);
                    }
                    if (this.M66hQ219i && this.sk5s77z6Q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                        if (!isFocused()) {
                        }
                        j = this.KlYagMRWx.kmSgne1rO;
                        if (j != -1 || !(z = this.sk5s77z6Q.J4Ux7ym32)) {
                            cywn6086a2 = null;
                        } else {
                            if (!z) {
                                cywn6086a3 = null;
                            } else {
                                int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
                                cywn6086a cywn6086a6 = null;
                                for (int i10 = 0; i10 < Puu3Rhg4F; i10++) {
                                    cywn6086a2 = V9LQMKGJe(this.MzoOEjc4X.GPLPRo6go(i10));
                                    if (cywn6086a2 != null && !cywn6086a2.CBQ5d1kRq() && cywn6086a2.kCA6Zs9sL == j) {
                                        if (!this.MzoOEjc4X.vPSbyrYWX(cywn6086a2.q3BipwRCk)) {
                                            break;
                                        }
                                        cywn6086a6 = cywn6086a2;
                                    }
                                }
                                cywn6086a3 = cywn6086a6;
                            }
                            cywn6086a2 = cywn6086a3;
                        }
                        if (cywn6086a2 != null || this.MzoOEjc4X.vPSbyrYWX(cywn6086a2.q3BipwRCk) || !cywn6086a2.q3BipwRCk.hasFocusable()) {
                            if (this.MzoOEjc4X.kCA6Zs9sL() > 0) {
                                kvFwRYSUX kvfwrysux3 = this.KlYagMRWx;
                                int i11 = kvfwrysux3.CBQ5d1kRq;
                                if (i11 != -1) {
                                    i2 = i11;
                                }
                                int J4Ux7ym32 = kvfwrysux3.J4Ux7ym32();
                                for (int i12 = i2; i12 < J4Ux7ym32; i12++) {
                                    cywn6086a mUqPm6GBh2 = mUqPm6GBh(i12);
                                    if (mUqPm6GBh2 == null) {
                                        break;
                                    } else if (mUqPm6GBh2.q3BipwRCk.hasFocusable()) {
                                        view = mUqPm6GBh2.q3BipwRCk;
                                        break;
                                    }
                                }
                                int min = Math.min(J4Ux7ym32, i2);
                                do {
                                    min--;
                                    if (min >= 0 && (mUqPm6GBh = mUqPm6GBh(min)) != null) {
                                    }
                                } while (!mUqPm6GBh.q3BipwRCk.hasFocusable());
                                view = mUqPm6GBh.q3BipwRCk;
                            }
                            view = null;
                            break;
                        } else {
                            view = cywn6086a2.q3BipwRCk;
                        }
                        if (view != null) {
                            int i13 = this.KlYagMRWx.Bhmn1KIah;
                            if (!(((long) i13) == -1 || (findViewById = view.findViewById(i13)) == null || !findViewById.isFocusable())) {
                                view = findViewById;
                            }
                            view.requestFocus();
                        }
                    }
                    kvFwRYSUX kvfwrysux4 = this.KlYagMRWx;
                    kvfwrysux4.kmSgne1rO = -1;
                    kvfwrysux4.CBQ5d1kRq = -1;
                    kvfwrysux4.Bhmn1KIah = -1;
                }
            }
            this.WaUP0CF08.suAKJqyYV(this);
            Eeka1udhb();
            int i32 = 4;
            this.KlYagMRWx.q3BipwRCk(4);
            R2hkbNqWf();
            L4EwGfXiQ();
            kvfwrysux = this.KlYagMRWx;
            kvfwrysux.dIocxURUo = 1;
            if (kvfwrysux.oon79WMrY) {
            }
            this.WaUP0CF08.oesmsHQJU(this.kmSgne1rO);
            kvFwRYSUX kvfwrysux22 = this.KlYagMRWx;
            kvfwrysux22.J4Ux7ym32 = kvfwrysux22.kCA6Zs9sL;
            this.QNqj6nIzv = false;
            this.igRQEZxnW = false;
            kvfwrysux22.oon79WMrY = false;
            kvfwrysux22.vPSbyrYWX = false;
            this.WaUP0CF08.iiGwOFFnr = false;
            arrayList = this.kmSgne1rO.J4Ux7ym32;
            if (arrayList != null) {
            }
            lULQkQlc9 = this.WaUP0CF08;
            if (lULQkQlc9.vPSbyrYWX) {
            }
            this.WaUP0CF08.R2hkbNqWf(this.KlYagMRWx);
            zHl31GGXU(true);
            buPcffgdD(false);
            dNif5KqqH dnif5kqqh22 = this.ilHKhw3Yw;
            dnif5kqqh22.q3BipwRCk.clear();
            dnif5kqqh22.J4Ux7ym32.q3BipwRCk();
            int[] iArr22 = this.vIbyhVf1d;
            i = iArr22[0];
            int i92 = iArr22[1];
            nlGCs0NZs(iArr22);
            iArr = this.vIbyhVf1d;
            if (iArr[0] == i) {
                z3 = false;
            }
            if (z3) {
            }
            if (this.M66hQ219i) {
                if (!isFocused()) {
                }
                j = this.KlYagMRWx.kmSgne1rO;
                if (j != -1) {
                }
                cywn6086a2 = null;
                if (cywn6086a2 != null) {
                }
                if (this.MzoOEjc4X.kCA6Zs9sL() > 0) {
                }
                view = null;
                if (view != null) {
                }
            }
            kvFwRYSUX kvfwrysux42 = this.KlYagMRWx;
            kvfwrysux42.kmSgne1rO = -1;
            kvfwrysux42.CBQ5d1kRq = -1;
            kvfwrysux42.Bhmn1KIah = -1;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.CpG0imbht;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.NyWTwPF6V;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().dIocxURUo;
    }

    public void ixWaw2akD(int i, int i2) {
        this.TyB1UUd72++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        wnbPPCp4x wnbppcp4x = this.lqFHPHdW3;
        if (wnbppcp4x != null) {
            wnbppcp4x.J4Ux7ym32(this, i, i2);
        }
        List list = this.oesmsHQJU;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((wnbPPCp4x) this.oesmsHQJU.get(size)).J4Ux7ym32(this, i, i2);
            }
        }
        this.TyB1UUd72--;
    }

    public void j22ftfeNI() {
        int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
        for (int i = 0; i < Puu3Rhg4F; i++) {
            ((dgsh68zH8) this.MzoOEjc4X.GPLPRo6go(i).getLayoutParams()).tGV7Q6urW = true;
        }
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        int size = v1xq9aVRv.tGV7Q6urW.size();
        for (int i2 = 0; i2 < size; i2++) {
            dgsh68zH8 dgsh68zh8 = (dgsh68zH8) ((cywn6086a) v1xq9aVRv.tGV7Q6urW.get(i2)).q3BipwRCk.getLayoutParams();
            if (dgsh68zh8 != null) {
                dgsh68zh8.tGV7Q6urW = true;
            }
        }
    }

    public void juJ6pnCpu(int i) {
        if (this.WaUP0CF08 != null) {
            setScrollState(2);
            this.WaUP0CF08.vIbyhVf1d(i);
            awakenScrollBars();
        }
    }

    public final void kktL0P5MG() {
        VelocityTracker velocityTracker = this.n4UIOvAko;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        KlYagMRWx(0);
        EdgeEffect edgeEffect = this.j22ftfeNI;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.j22ftfeNI.isFinished();
        }
        EdgeEffect edgeEffect2 = this.QSbMsHU5X;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.QSbMsHU5X.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L4EwGfXiQ;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.L4EwGfXiQ.isFinished();
        }
        EdgeEffect edgeEffect4 = this.zHl31GGXU;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.zHl31GGXU.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.vPSbyrYWX(this);
        }
    }

    public void kmSgne1rO(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.j22ftfeNI;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.j22ftfeNI.onRelease();
            z = this.j22ftfeNI.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L4EwGfXiQ;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.L4EwGfXiQ.onRelease();
            z |= this.L4EwGfXiQ.isFinished();
        }
        EdgeEffect edgeEffect3 = this.QSbMsHU5X;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.QSbMsHU5X.onRelease();
            z |= this.QSbMsHU5X.isFinished();
        }
        EdgeEffect edgeEffect4 = this.zHl31GGXU;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.zHl31GGXU.onRelease();
            z |= this.zHl31GGXU.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.vPSbyrYWX(this);
        }
    }

    public boolean ln3nf7LH3(cywn6086a cywn6086a2, int i) {
        if (TyB1UUd72()) {
            cywn6086a2.ilHKhw3Yw = i;
            this.tFD7BDQ71.add(cywn6086a2);
            return false;
        }
        View view = cywn6086a2.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.Eeka1udhb(view, i);
        return true;
    }

    public void lqFHPHdW3() {
        kVmRinNH6 kvmrinnh6;
        setScrollState(0);
        this.R2hkbNqWf.tGV7Q6urW();
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null && (kvmrinnh6 = lULQkQlc9.kCA6Zs9sL) != null) {
            kvmrinnh6.dIocxURUo();
        }
    }

    public cywn6086a mUqPm6GBh(int i) {
        cywn6086a cywn6086a2 = null;
        if (this.QNqj6nIzv) {
            return null;
        }
        int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
        for (int i2 = 0; i2 < Puu3Rhg4F; i2++) {
            cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.GPLPRo6go(i2));
            if (V9LQMKGJe != null && !V9LQMKGJe.CBQ5d1kRq() && NyWTwPF6V(V9LQMKGJe) == i) {
                if (!this.MzoOEjc4X.vPSbyrYWX(V9LQMKGJe.q3BipwRCk)) {
                    return V9LQMKGJe;
                }
                cywn6086a2 = V9LQMKGJe;
            }
        }
        return cywn6086a2;
    }

    public void n4UIOvAko(boolean z) {
        this.igRQEZxnW = z | this.igRQEZxnW;
        this.QNqj6nIzv = true;
        int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
        for (int i = 0; i < Puu3Rhg4F; i++) {
            cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.GPLPRo6go(i));
            if (V9LQMKGJe != null && !V9LQMKGJe.dXrmkklc8()) {
                V9LQMKGJe.J4Ux7ym32(6);
            }
        }
        j22ftfeNI();
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        int size = v1xq9aVRv.tGV7Q6urW.size();
        for (int i2 = 0; i2 < size; i2++) {
            cywn6086a cywn6086a2 = (cywn6086a) v1xq9aVRv.tGV7Q6urW.get(i2);
            if (cywn6086a2 != null) {
                cywn6086a2.J4Ux7ym32(6);
                cywn6086a2.q3BipwRCk(null);
            }
        }
        s7MlVynBG s7mlvynbg = RecyclerView.this.sk5s77z6Q;
        if (s7mlvynbg == null || !s7mlvynbg.J4Ux7ym32) {
            v1xq9aVRv.kCA6Zs9sL();
        }
    }

    public final void nlGCs0NZs(int[] iArr) {
        int kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL();
        if (kCA6Zs9sL == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < kCA6Zs9sL; i3++) {
            cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.dIocxURUo(i3));
            if (!V9LQMKGJe.dXrmkklc8()) {
                int kCA6Zs9sL2 = V9LQMKGJe.kCA6Zs9sL();
                if (kCA6Zs9sL2 < i) {
                    i = kCA6Zs9sL2;
                }
                if (kCA6Zs9sL2 > i2) {
                    i2 = kCA6Zs9sL2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public cywn6086a o4LF8RkoQ(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return V9LQMKGJe(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.EBQXiIPmm = 0;
        this.CpG0imbht = true;
        this.nlGCs0NZs = this.nlGCs0NZs && !isLayoutRequested();
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            lULQkQlc9.GPLPRo6go = true;
        }
        this.Ta2zrwkcM = false;
        ThreadLocal threadLocal = aXI58Y1kr.MzoOEjc4X;
        aXI58Y1kr axi58y1kr = (aXI58Y1kr) threadLocal.get();
        this.IG30YE5GU = axi58y1kr;
        if (axi58y1kr == null) {
            this.IG30YE5GU = new aXI58Y1kr();
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            Display J4Ux7ym32 = RBJDIwG1D.J4Ux7ym32(this);
            float f = 60.0f;
            if (!isInEditMode() && J4Ux7ym32 != null) {
                float refreshRate = J4Ux7ym32.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            aXI58Y1kr axi58y1kr2 = this.IG30YE5GU;
            axi58y1kr2.Bhmn1KIah = (long) (1.0E9f / f);
            threadLocal.set(axi58y1kr2);
        }
        this.IG30YE5GU.CBQ5d1kRq.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lamBDew8Z lambdew8z = this.ziwPzaoF3;
        if (lambdew8z != null) {
            lambdew8z.iiGwOFFnr();
        }
        lqFHPHdW3();
        this.CpG0imbht = false;
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
            lULQkQlc9.GPLPRo6go = false;
            lULQkQlc9.OpLJtmvFM(this, v1xq9aVRv);
        }
        this.tFD7BDQ71.clear();
        removeCallbacks(this.BqpzfZavo);
        Objects.requireNonNull(this.ilHKhw3Yw);
        do {
        } while (CHivVJVYm.dIocxURUo.q3BipwRCk() != null);
        aXI58Y1kr axi58y1kr = this.IG30YE5GU;
        if (axi58y1kr != null) {
            axi58y1kr.CBQ5d1kRq.remove(this);
            this.IG30YE5GU = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.iMyQMM6Qj.size();
        for (int i = 0; i < size; i++) {
            ((DrTf1eLw4) this.iMyQMM6Qj.get(i)).dIocxURUo(canvas, this, this.KlYagMRWx);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        LULQkQlc9 lULQkQlc9;
        if (this.WaUP0CF08 != null && !this.NyWTwPF6V && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.WaUP0CF08.iiGwOFFnr() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.WaUP0CF08.kCA6Zs9sL()) {
                    f = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f != 0.0f) {
                        int i = (int) (f * this.ln3nf7LH3);
                        int i2 = (int) (f2 * this.Dr7UqlxEV);
                        lULQkQlc9 = this.WaUP0CF08;
                        if (lULQkQlc9 == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.NyWTwPF6V) {
                            int[] iArr = this.aS2AFthYA;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean kCA6Zs9sL = lULQkQlc9.kCA6Zs9sL();
                            boolean iiGwOFFnr = this.WaUP0CF08.iiGwOFFnr();
                            IG30YE5GU(iiGwOFFnr ? kCA6Zs9sL | 2 : kCA6Zs9sL, 1);
                            if (dXrmkklc8(kCA6Zs9sL ? i : 0, iiGwOFFnr ? i2 : 0, this.aS2AFthYA, this.suAKJqyYV, 1)) {
                                int[] iArr2 = this.aS2AFthYA;
                                i -= iArr2[0];
                                i2 -= iArr2[1];
                            }
                            KBYw84i3W(kCA6Zs9sL ? i : 0, iiGwOFFnr ? i2 : 0, motionEvent, 1);
                            aXI58Y1kr axi58y1kr = this.IG30YE5GU;
                            if (!(axi58y1kr == null || (i == 0 && i2 == 0))) {
                                axi58y1kr.q3BipwRCk(this, i, i2);
                            }
                            getScrollingChildHelper().oon79WMrY(1);
                        }
                    }
                }
                f = 0.0f;
                if (f2 == 0.0f) {
                }
                int i3 = (int) (f * this.ln3nf7LH3);
                int i22 = (int) (f2 * this.Dr7UqlxEV);
                lULQkQlc9 = this.WaUP0CF08;
                if (lULQkQlc9 == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.WaUP0CF08.iiGwOFFnr()) {
                        f2 = -axisValue;
                        f = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        int i32 = (int) (f * this.ln3nf7LH3);
                        int i222 = (int) (f2 * this.Dr7UqlxEV);
                        lULQkQlc9 = this.WaUP0CF08;
                        if (lULQkQlc9 == null) {
                        }
                    } else if (this.WaUP0CF08.kCA6Zs9sL()) {
                        f = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        int i322 = (int) (f * this.ln3nf7LH3);
                        int i2222 = (int) (f2 * this.Dr7UqlxEV);
                        lULQkQlc9 = this.WaUP0CF08;
                        if (lULQkQlc9 == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                if (f2 == 0.0f) {
                }
                int i3222 = (int) (f * this.ln3nf7LH3);
                int i22222 = (int) (f2 * this.Dr7UqlxEV);
                lULQkQlc9 = this.WaUP0CF08;
                if (lULQkQlc9 == null) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.NyWTwPF6V) {
            return false;
        }
        this.IytU16YUK = null;
        if (qFBXIgpia(motionEvent)) {
            oon79WMrY();
            return true;
        }
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 == null) {
            return false;
        }
        boolean kCA6Zs9sL = lULQkQlc9.kCA6Zs9sL();
        boolean iiGwOFFnr = this.WaUP0CF08.iiGwOFFnr();
        if (this.n4UIOvAko == null) {
            this.n4UIOvAko = VelocityTracker.obtain();
        }
        this.n4UIOvAko.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.vNtjxmzUM) {
                this.vNtjxmzUM = false;
            }
            this.IzM1cD9ly = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.DuuXfa7LE = x;
            this.OpLJtmvFM = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.XYT7vJqNO = y;
            this.BL4OzhZBd = y;
            if (this.wIZEdYHUn == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                KlYagMRWx(1);
            }
            int[] iArr = this.hKeU0pt2N;
            iArr[1] = 0;
            iArr[0] = 0;
            if (iiGwOFFnr) {
                boolean z = kCA6Zs9sL ? 1 : 0;
                char c = kCA6Zs9sL ? 1 : 0;
                kCA6Zs9sL = z | true;
            }
            int i = kCA6Zs9sL ? 1 : 0;
            int i2 = kCA6Zs9sL ? 1 : 0;
            int i3 = kCA6Zs9sL ? 1 : 0;
            IG30YE5GU(i, 0);
        } else if (actionMasked == 1) {
            this.n4UIOvAko.clear();
            KlYagMRWx(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.IzM1cD9ly);
            if (findPointerIndex < 0) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Error processing scroll; pointer index for id ");
                q3BipwRCk.append(this.IzM1cD9ly);
                q3BipwRCk.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", q3BipwRCk.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.wIZEdYHUn != 1) {
                int i4 = x2 - this.OpLJtmvFM;
                int i5 = y2 - this.BL4OzhZBd;
                if (!kCA6Zs9sL || Math.abs(i4) <= this.kktL0P5MG) {
                    objArr = null;
                } else {
                    this.DuuXfa7LE = x2;
                    objArr = 1;
                }
                if (iiGwOFFnr && Math.abs(i5) > this.kktL0P5MG) {
                    this.XYT7vJqNO = y2;
                    objArr = 1;
                }
                if (objArr != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            oon79WMrY();
        } else if (actionMasked == 5) {
            this.IzM1cD9ly = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.DuuXfa7LE = x3;
            this.OpLJtmvFM = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.XYT7vJqNO = y3;
            this.BL4OzhZBd = y3;
        } else if (actionMasked == 6) {
            ziwPzaoF3(motionEvent);
        }
        return this.wIZEdYHUn == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = aBjutDvc3.q3BipwRCk;
        Trace.beginSection("RV OnLayout");
        ilHKhw3Yw();
        Trace.endSection();
        this.nlGCs0NZs = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 == null) {
            PSTqBLTET(i, i2);
            return;
        }
        boolean z = false;
        if (lULQkQlc9.L4EwGfXiQ()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.WaUP0CF08.J4Ux7ym32.PSTqBLTET(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.koMoKnP1S = z;
            if (!z && this.sk5s77z6Q != null) {
                if (this.KlYagMRWx.dIocxURUo == 1) {
                    qVUwofr5s();
                }
                this.WaUP0CF08.hKeU0pt2N(i, i2);
                this.KlYagMRWx.yWvV4ePLl = true;
                Eeka1udhb();
                this.WaUP0CF08.tFD7BDQ71(i, i2);
                if (this.WaUP0CF08.ifDs8fRNm()) {
                    this.WaUP0CF08.hKeU0pt2N(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.KlYagMRWx.yWvV4ePLl = true;
                    Eeka1udhb();
                    this.WaUP0CF08.tFD7BDQ71(i, i2);
                }
                this.ifDs8fRNm = getMeasuredWidth();
                this.CMnfe2r2N = getMeasuredHeight();
            }
        } else if (this.qFBXIgpia) {
            this.WaUP0CF08.J4Ux7ym32.PSTqBLTET(i, i2);
        } else {
            if (this.o4LF8RkoQ) {
                R2hkbNqWf();
                L4EwGfXiQ();
                IzM1cD9ly();
                zHl31GGXU(true);
                kvFwRYSUX kvfwrysux = this.KlYagMRWx;
                if (kvfwrysux.vPSbyrYWX) {
                    kvfwrysux.GPLPRo6go = true;
                } else {
                    this.PSTqBLTET.tGV7Q6urW();
                    this.KlYagMRWx.GPLPRo6go = false;
                }
                this.o4LF8RkoQ = false;
                buPcffgdD(false);
            } else if (this.KlYagMRWx.vPSbyrYWX) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            s7MlVynBG s7mlvynbg = this.sk5s77z6Q;
            if (s7mlvynbg != null) {
                this.KlYagMRWx.kCA6Zs9sL = s7mlvynbg.q3BipwRCk();
            } else {
                this.KlYagMRWx.kCA6Zs9sL = 0;
            }
            R2hkbNqWf();
            this.WaUP0CF08.J4Ux7ym32.PSTqBLTET(i, i2);
            buPcffgdD(false);
            this.KlYagMRWx.GPLPRo6go = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (TyB1UUd72()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BScqaI6mx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BScqaI6mx bScqaI6mx = (BScqaI6mx) parcelable;
        this.Bhmn1KIah = bScqaI6mx;
        super.onRestoreInstanceState(bScqaI6mx.CBQ5d1kRq);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        BScqaI6mx bScqaI6mx = new BScqaI6mx(super.onSaveInstanceState());
        BScqaI6mx bScqaI6mx2 = this.Bhmn1KIah;
        if (bScqaI6mx2 != null) {
            bScqaI6mx.Bhmn1KIah = bScqaI6mx2.Bhmn1KIah;
        } else {
            LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
            bScqaI6mx.Bhmn1KIah = lULQkQlc9 != null ? lULQkQlc9.buPcffgdD() : null;
        }
        return bScqaI6mx;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            EBQXiIPmm();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0237, code lost:
        if (((r7 == null || r4.q3BipwRCk.getAdapter() == null || ((java.lang.Math.abs(r1) <= (r11 = r4.q3BipwRCk.getMinFlingVelocity()) && java.lang.Math.abs(r0) <= r11) || !r4.Puu3Rhg4F(r7, r0, r1))) ? false : true) != false) goto L_0x028d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0290, code lost:
        if (r0 != false) goto L_0x0295;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ?? r0;
        ?? r2;
        boolean z2 = false;
        if (this.NyWTwPF6V || this.vNtjxmzUM) {
            return false;
        }
        LBkrQilnp lBkrQilnp = this.IytU16YUK;
        if (lBkrQilnp == null) {
            z = motionEvent.getAction() == 0 ? false : qFBXIgpia(motionEvent);
        } else {
            lBkrQilnp.J4Ux7ym32(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.IytU16YUK = null;
            }
            z = true;
        }
        if (z) {
            oon79WMrY();
            return true;
        }
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 == null) {
            return false;
        }
        boolean kCA6Zs9sL = lULQkQlc9.kCA6Zs9sL();
        boolean iiGwOFFnr = this.WaUP0CF08.iiGwOFFnr();
        if (this.n4UIOvAko == null) {
            this.n4UIOvAko = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.hKeU0pt2N;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.hKeU0pt2N;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.IzM1cD9ly = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.DuuXfa7LE = x;
            this.OpLJtmvFM = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.XYT7vJqNO = y;
            this.BL4OzhZBd = y;
            if (iiGwOFFnr) {
                boolean z3 = kCA6Zs9sL ? 1 : 0;
                ?? r10 = kCA6Zs9sL ? 1 : 0;
                kCA6Zs9sL = z3 | true;
            }
            int i = kCA6Zs9sL ? 1 : 0;
            int i2 = kCA6Zs9sL ? 1 : 0;
            int i3 = kCA6Zs9sL ? 1 : 0;
            IG30YE5GU(i, 0);
        } else if (actionMasked == 1) {
            this.n4UIOvAko.addMovement(obtain);
            this.n4UIOvAko.computeCurrentVelocity(1000, (float) this.SuKhTJIQc);
            float f = kCA6Zs9sL ? -this.n4UIOvAko.getXVelocity(this.IzM1cD9ly) : 0.0f;
            float f2 = iiGwOFFnr ? -this.n4UIOvAko.getYVelocity(this.IzM1cD9ly) : 0.0f;
            if (!(f == 0.0f && f2 == 0.0f)) {
                int i4 = (int) f;
                int i5 = (int) f2;
                LULQkQlc9 lULQkQlc92 = this.WaUP0CF08;
                if (lULQkQlc92 == null) {
                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.NyWTwPF6V) {
                    boolean kCA6Zs9sL2 = lULQkQlc92.kCA6Zs9sL();
                    boolean iiGwOFFnr2 = this.WaUP0CF08.iiGwOFFnr();
                    if (!kCA6Zs9sL2 || Math.abs(i4) < this.INnK5Rew6) {
                        i4 = 0;
                    }
                    if (!iiGwOFFnr2 || Math.abs(i5) < this.INnK5Rew6) {
                        i5 = 0;
                    }
                    if (!(i4 == 0 && i5 == 0)) {
                        float f3 = (float) i4;
                        float f4 = (float) i5;
                        if (!dispatchNestedPreFling(f3, f4)) {
                            boolean z4 = kCA6Zs9sL2 || iiGwOFFnr2;
                            dispatchNestedFling(f3, f4, z4);
                            Og6dYSoy7 og6dYSoy7 = this.KBYw84i3W;
                            if (og6dYSoy7 != null) {
                                Pzd2J3aOK pzd2J3aOK = (Pzd2J3aOK) og6dYSoy7;
                                LULQkQlc9 layoutManager = pzd2J3aOK.q3BipwRCk.getLayoutManager();
                            }
                            if (z4) {
                                if (iiGwOFFnr2) {
                                    boolean z5 = kCA6Zs9sL2 ? 1 : 0;
                                    ?? r22 = kCA6Zs9sL2 ? 1 : 0;
                                    kCA6Zs9sL2 = z5 | true;
                                }
                                int i6 = kCA6Zs9sL2 ? 1 : 0;
                                int i7 = kCA6Zs9sL2 ? 1 : 0;
                                int i8 = kCA6Zs9sL2 ? 1 : 0;
                                IG30YE5GU(i6, 1);
                                int i9 = this.SuKhTJIQc;
                                int max = Math.max(-i9, Math.min(i4, i9));
                                int i10 = this.SuKhTJIQc;
                                int max2 = Math.max(-i10, Math.min(i5, i10));
                                eAq6YOFAV eaq6yofav = this.R2hkbNqWf;
                                RecyclerView.this.setScrollState(2);
                                eaq6yofav.kmSgne1rO = 0;
                                eaq6yofav.CBQ5d1kRq = 0;
                                Interpolator interpolator = eaq6yofav.PSTqBLTET;
                                Interpolator interpolator2 = LFW0KvNFt;
                                if (interpolator != interpolator2) {
                                    eaq6yofav.PSTqBLTET = interpolator2;
                                    eaq6yofav.Bhmn1KIah = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                                }
                                eaq6yofav.Bhmn1KIah.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                eaq6yofav.q3BipwRCk();
                                r0 = true;
                            }
                        }
                    }
                }
                r0 = false;
            }
            setScrollState(0);
            kktL0P5MG();
            z2 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.IzM1cD9ly);
            if (findPointerIndex < 0) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Error processing scroll; pointer index for id ");
                q3BipwRCk.append(this.IzM1cD9ly);
                q3BipwRCk.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", q3BipwRCk.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i11 = this.DuuXfa7LE - x2;
            int i12 = this.XYT7vJqNO - y2;
            if (this.wIZEdYHUn != 1) {
                if (kCA6Zs9sL) {
                    int i13 = this.kktL0P5MG;
                    i11 = i11 > 0 ? Math.max(0, i11 - i13) : Math.min(0, i11 + i13);
                    if (i11 != 0) {
                        r2 = true;
                        if (iiGwOFFnr) {
                            int i14 = this.kktL0P5MG;
                            i12 = i12 > 0 ? Math.max(0, i12 - i14) : Math.min(0, i12 + i14);
                            if (i12 != 0) {
                                r2 = true;
                            }
                        }
                        if (r2 == true) {
                            setScrollState(1);
                        }
                    }
                }
                r2 = false;
                if (iiGwOFFnr) {
                }
                if (r2 == true) {
                }
            }
            int i15 = i11;
            int i16 = i12;
            if (this.wIZEdYHUn == 1) {
                int[] iArr3 = this.aS2AFthYA;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (dXrmkklc8(kCA6Zs9sL ? i15 : 0, iiGwOFFnr ? i16 : 0, iArr3, this.suAKJqyYV, 0)) {
                    int[] iArr4 = this.aS2AFthYA;
                    i15 -= iArr4[0];
                    i16 -= iArr4[1];
                    int[] iArr5 = this.hKeU0pt2N;
                    int i17 = iArr5[0];
                    int[] iArr6 = this.suAKJqyYV;
                    iArr5[0] = i17 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int[] iArr7 = this.suAKJqyYV;
                this.DuuXfa7LE = x2 - iArr7[0];
                this.XYT7vJqNO = y2 - iArr7[1];
                if (KBYw84i3W(kCA6Zs9sL ? i15 : 0, iiGwOFFnr ? i16 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                aXI58Y1kr axi58y1kr = this.IG30YE5GU;
                if (!(axi58y1kr == null || (i15 == 0 && i16 == 0))) {
                    axi58y1kr.q3BipwRCk(this, i15, i16);
                }
            }
        } else if (actionMasked == 3) {
            oon79WMrY();
        } else if (actionMasked == 5) {
            this.IzM1cD9ly = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.DuuXfa7LE = x3;
            this.OpLJtmvFM = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.XYT7vJqNO = y3;
            this.BL4OzhZBd = y3;
        } else if (actionMasked == 6) {
            ziwPzaoF3(motionEvent);
        }
        if (!z2) {
            this.n4UIOvAko.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void oon79WMrY() {
        kktL0P5MG();
        setScrollState(0);
    }

    public final boolean qFBXIgpia(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.cAwN510t2.size();
        for (int i = 0; i < size; i++) {
            LBkrQilnp lBkrQilnp = (LBkrQilnp) this.cAwN510t2.get(i);
            if (lBkrQilnp.q3BipwRCk(this, motionEvent) && action != 3) {
                this.IytU16YUK = lBkrQilnp;
                return true;
            }
        }
        return false;
    }

    public final void qVUwofr5s() {
        int i;
        View view;
        int id;
        View CpG0imbht;
        this.KlYagMRWx.q3BipwRCk(1);
        cAwN510t2(this.KlYagMRWx);
        this.KlYagMRWx.yWvV4ePLl = false;
        R2hkbNqWf();
        dNif5KqqH dnif5kqqh = this.ilHKhw3Yw;
        dnif5kqqh.q3BipwRCk.clear();
        dnif5kqqh.J4Ux7ym32.q3BipwRCk();
        L4EwGfXiQ();
        IzM1cD9ly();
        View focusedChild = (!this.M66hQ219i || !hasFocus() || this.sk5s77z6Q == null) ? null : getFocusedChild();
        cywn6086a o4LF8RkoQ = (focusedChild == null || (CpG0imbht = CpG0imbht(focusedChild)) == null) ? null : o4LF8RkoQ(CpG0imbht);
        long j = -1;
        if (o4LF8RkoQ == null) {
            kvFwRYSUX kvfwrysux = this.KlYagMRWx;
            kvfwrysux.kmSgne1rO = -1;
            kvfwrysux.CBQ5d1kRq = -1;
            kvfwrysux.Bhmn1KIah = -1;
        } else {
            kvFwRYSUX kvfwrysux2 = this.KlYagMRWx;
            if (this.sk5s77z6Q.J4Ux7ym32) {
                j = o4LF8RkoQ.kCA6Zs9sL;
            }
            kvfwrysux2.kmSgne1rO = j;
            if (!this.QNqj6nIzv) {
                if (o4LF8RkoQ.CBQ5d1kRq()) {
                    i = o4LF8RkoQ.dIocxURUo;
                } else {
                    RecyclerView recyclerView = o4LF8RkoQ.qVUwofr5s;
                    if (recyclerView != null) {
                        i = recyclerView.NyWTwPF6V(o4LF8RkoQ);
                    }
                }
                kvfwrysux2.CBQ5d1kRq = i;
                kvFwRYSUX kvfwrysux3 = this.KlYagMRWx;
                view = o4LF8RkoQ.q3BipwRCk;
                loop0: while (true) {
                    id = view.getId();
                    while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                            break;
                        }
                    }
                }
                kvfwrysux3.Bhmn1KIah = id;
            }
            i = -1;
            kvfwrysux2.CBQ5d1kRq = i;
            kvFwRYSUX kvfwrysux32 = this.KlYagMRWx;
            view = o4LF8RkoQ.q3BipwRCk;
            loop0: while (true) {
                id = view.getId();
                while (!view.isFocused()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
            kvfwrysux32.Bhmn1KIah = id;
        }
        kvFwRYSUX kvfwrysux4 = this.KlYagMRWx;
        kvfwrysux4.Puu3Rhg4F = kvfwrysux4.oon79WMrY && this.ShSN9wbzk;
        this.ShSN9wbzk = false;
        this.YmNRDyka4 = false;
        kvfwrysux4.GPLPRo6go = kvfwrysux4.vPSbyrYWX;
        kvfwrysux4.kCA6Zs9sL = this.sk5s77z6Q.q3BipwRCk();
        nlGCs0NZs(this.vIbyhVf1d);
        if (this.KlYagMRWx.oon79WMrY) {
            int kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL();
            for (int i2 = 0; i2 < kCA6Zs9sL; i2++) {
                cywn6086a V9LQMKGJe = V9LQMKGJe(this.MzoOEjc4X.dIocxURUo(i2));
                if (!V9LQMKGJe.dXrmkklc8() && (!V9LQMKGJe.oon79WMrY() || this.sk5s77z6Q.J4Ux7ym32)) {
                    lamBDew8Z lambdew8z = this.ziwPzaoF3;
                    lamBDew8Z.J4Ux7ym32(V9LQMKGJe);
                    V9LQMKGJe.iiGwOFFnr();
                    this.ilHKhw3Yw.tGV7Q6urW(V9LQMKGJe, lambdew8z.Puu3Rhg4F(V9LQMKGJe));
                    if (this.KlYagMRWx.Puu3Rhg4F && V9LQMKGJe.PSTqBLTET() && !V9LQMKGJe.CBQ5d1kRq() && !V9LQMKGJe.dXrmkklc8() && !V9LQMKGJe.oon79WMrY()) {
                        this.ilHKhw3Yw.J4Ux7ym32.iiGwOFFnr(vNtjxmzUM(V9LQMKGJe), V9LQMKGJe);
                    }
                }
            }
        }
        if (this.KlYagMRWx.vPSbyrYWX) {
            int Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
            for (int i3 = 0; i3 < Puu3Rhg4F; i3++) {
                cywn6086a V9LQMKGJe2 = V9LQMKGJe(this.MzoOEjc4X.GPLPRo6go(i3));
                if (!V9LQMKGJe2.dXrmkklc8() && V9LQMKGJe2.dIocxURUo == -1) {
                    V9LQMKGJe2.dIocxURUo = V9LQMKGJe2.tGV7Q6urW;
                }
            }
            kvFwRYSUX kvfwrysux5 = this.KlYagMRWx;
            boolean z = kvfwrysux5.iiGwOFFnr;
            kvfwrysux5.iiGwOFFnr = false;
            this.WaUP0CF08.M66hQ219i(this.kmSgne1rO, kvfwrysux5);
            this.KlYagMRWx.iiGwOFFnr = z;
            for (int i4 = 0; i4 < this.MzoOEjc4X.kCA6Zs9sL(); i4++) {
                cywn6086a V9LQMKGJe3 = V9LQMKGJe(this.MzoOEjc4X.dIocxURUo(i4));
                if (!V9LQMKGJe3.dXrmkklc8()) {
                    CHivVJVYm cHivVJVYm = (CHivVJVYm) this.ilHKhw3Yw.q3BipwRCk.getOrDefault(V9LQMKGJe3, null);
                    if (!((cHivVJVYm == null || (cHivVJVYm.q3BipwRCk & 4) == 0) ? false : true)) {
                        lamBDew8Z.J4Ux7ym32(V9LQMKGJe3);
                        boolean GPLPRo6go = V9LQMKGJe3.GPLPRo6go(8192);
                        lamBDew8Z lambdew8z2 = this.ziwPzaoF3;
                        V9LQMKGJe3.iiGwOFFnr();
                        lamBDew8Z.mhl5lIdbQ Puu3Rhg4F2 = lambdew8z2.Puu3Rhg4F(V9LQMKGJe3);
                        if (GPLPRo6go) {
                            OpLJtmvFM(V9LQMKGJe3, Puu3Rhg4F2);
                        } else {
                            dNif5KqqH dnif5kqqh2 = this.ilHKhw3Yw;
                            CHivVJVYm cHivVJVYm2 = (CHivVJVYm) dnif5kqqh2.q3BipwRCk.getOrDefault(V9LQMKGJe3, null);
                            if (cHivVJVYm2 == null) {
                                cHivVJVYm2 = CHivVJVYm.q3BipwRCk();
                                dnif5kqqh2.q3BipwRCk.put(V9LQMKGJe3, cHivVJVYm2);
                            }
                            cHivVJVYm2.q3BipwRCk |= 2;
                            cHivVJVYm2.J4Ux7ym32 = Puu3Rhg4F2;
                        }
                    }
                }
            }
        }
        CBQ5d1kRq();
        zHl31GGXU(true);
        buPcffgdD(false);
        this.KlYagMRWx.dIocxURUo = 2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        cywn6086a V9LQMKGJe = V9LQMKGJe(view);
        if (V9LQMKGJe != null) {
            if (V9LQMKGJe.Bhmn1KIah()) {
                V9LQMKGJe.oon79WMrY &= -257;
            } else if (!V9LQMKGJe.dXrmkklc8()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(V9LQMKGJe);
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(this, sb));
            }
        }
        view.clearAnimation();
        MzoOEjc4X(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        kVmRinNH6 kvmrinnh6 = this.WaUP0CF08.kCA6Zs9sL;
        boolean z = true;
        if (!(kvmrinnh6 != null && kvmrinnh6.kCA6Zs9sL) && !TyB1UUd72()) {
            z = false;
        }
        if (!z && view2 != null) {
            XYT7vJqNO(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.WaUP0CF08.Ta2zrwkcM(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.cAwN510t2.size();
        for (int i = 0; i < size; i++) {
            ((LBkrQilnp) this.cAwN510t2.get(i)).tGV7Q6urW(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        if (this.AqaWJg0b4 != 0 || this.NyWTwPF6V) {
            this.mUqPm6GBh = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.NyWTwPF6V) {
            boolean kCA6Zs9sL = lULQkQlc9.kCA6Zs9sL();
            boolean iiGwOFFnr = this.WaUP0CF08.iiGwOFFnr();
            if (kCA6Zs9sL || iiGwOFFnr) {
                if (!kCA6Zs9sL) {
                    i = 0;
                }
                if (!iiGwOFFnr) {
                    i2 = 0;
                }
                KBYw84i3W(i, i2, null, 0);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (TyB1UUd72()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.i0Zug1mVk |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(m1SEohb1F m1seohb1f) {
        this.uSBmk4hFZ = m1seohb1f;
        IuQbWntsc.MzoOEjc4X(this, m1seohb1f);
    }

    public void setAdapter(s7MlVynBG s7mlvynbg) {
        setLayoutFrozen(false);
        s7MlVynBG s7mlvynbg2 = this.sk5s77z6Q;
        if (s7mlvynbg2 != null) {
            s7mlvynbg2.q3BipwRCk.unregisterObserver(this.CBQ5d1kRq);
            Objects.requireNonNull(this.sk5s77z6Q);
        }
        BL4OzhZBd();
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        rG2GI7LDp.CBQ5d1kRq(rG2GI7LDp.J4Ux7ym32);
        rG2GI7LDp.CBQ5d1kRq(rG2GI7LDp.tGV7Q6urW);
        rG2GI7LDp.iiGwOFFnr = 0;
        s7MlVynBG s7mlvynbg3 = this.sk5s77z6Q;
        this.sk5s77z6Q = s7mlvynbg;
        if (s7mlvynbg != null) {
            s7mlvynbg.q3BipwRCk.registerObserver(this.CBQ5d1kRq);
        }
        LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
        if (lULQkQlc9 != null) {
            lULQkQlc9.n4UIOvAko(s7mlvynbg3, this.sk5s77z6Q);
        }
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        s7MlVynBG s7mlvynbg4 = this.sk5s77z6Q;
        v1xq9aVRv.J4Ux7ym32();
        Y371ZqMzx dIocxURUo = v1xq9aVRv.dIocxURUo();
        Objects.requireNonNull(dIocxURUo);
        if (s7mlvynbg3 != null) {
            dIocxURUo.J4Ux7ym32--;
        }
        if (dIocxURUo.J4Ux7ym32 == 0) {
            for (int i = 0; i < dIocxURUo.q3BipwRCk.size(); i++) {
                ((iBBoHKkSI) dIocxURUo.q3BipwRCk.valueAt(i)).q3BipwRCk.clear();
            }
        }
        if (s7mlvynbg4 != null) {
            dIocxURUo.J4Ux7ym32++;
        }
        this.KlYagMRWx.iiGwOFFnr = true;
        n4UIOvAko(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(PMYI4lLJM pMYI4lLJM) {
        if (pMYI4lLJM != this.a8N8UmDyD) {
            this.a8N8UmDyD = pMYI4lLJM;
            setChildrenDrawingOrderEnabled(pMYI4lLJM != null);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.qVUwofr5s) {
            EBQXiIPmm();
        }
        this.qVUwofr5s = z;
        super.setClipToPadding(z);
        if (this.nlGCs0NZs) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(Rma6SHcSH rma6SHcSH) {
        Objects.requireNonNull(rma6SHcSH);
        this.juJ6pnCpu = rma6SHcSH;
        EBQXiIPmm();
    }

    public void setHasFixedSize(boolean z) {
        this.qFBXIgpia = z;
    }

    public void setItemAnimator(lamBDew8Z lambdew8z) {
        lamBDew8Z lambdew8z2 = this.ziwPzaoF3;
        if (lambdew8z2 != null) {
            lambdew8z2.iiGwOFFnr();
            this.ziwPzaoF3.q3BipwRCk = null;
        }
        this.ziwPzaoF3 = lambdew8z;
        if (lambdew8z != null) {
            lambdew8z.q3BipwRCk = this.Ihm5o4uLx;
        }
    }

    public void setItemViewCacheSize(int i) {
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        v1xq9aVRv.kCA6Zs9sL = i;
        v1xq9aVRv.CBQ5d1kRq();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LULQkQlc9 lULQkQlc9) {
        if (lULQkQlc9 != this.WaUP0CF08) {
            lqFHPHdW3();
            if (this.WaUP0CF08 != null) {
                lamBDew8Z lambdew8z = this.ziwPzaoF3;
                if (lambdew8z != null) {
                    lambdew8z.iiGwOFFnr();
                }
                this.WaUP0CF08.lqFHPHdW3(this.kmSgne1rO);
                this.WaUP0CF08.oesmsHQJU(this.kmSgne1rO);
                this.kmSgne1rO.J4Ux7ym32();
                if (this.CpG0imbht) {
                    LULQkQlc9 lULQkQlc92 = this.WaUP0CF08;
                    V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
                    lULQkQlc92.GPLPRo6go = false;
                    lULQkQlc92.OpLJtmvFM(this, v1xq9aVRv);
                }
                this.WaUP0CF08.BqpzfZavo(null);
                this.WaUP0CF08 = null;
            } else {
                this.kmSgne1rO.J4Ux7ym32();
            }
            mhl5lIdbQ mhl5lidbq = this.MzoOEjc4X;
            CvY5I9Zfv cvY5I9Zfv = mhl5lidbq.J4Ux7ym32;
            cvY5I9Zfv.q3BipwRCk = 0;
            CvY5I9Zfv cvY5I9Zfv2 = cvY5I9Zfv.J4Ux7ym32;
            if (cvY5I9Zfv2 != null) {
                cvY5I9Zfv2.GPLPRo6go();
            }
            int size = mhl5lidbq.tGV7Q6urW.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) mhl5lidbq.q3BipwRCk;
                Objects.requireNonNull(qhpeqqaq4);
                cywn6086a V9LQMKGJe = V9LQMKGJe((View) mhl5lidbq.tGV7Q6urW.get(size));
                if (V9LQMKGJe != null) {
                    qhpeqqaq4.q3BipwRCk.ln3nf7LH3(V9LQMKGJe, V9LQMKGJe.MzoOEjc4X);
                    V9LQMKGJe.MzoOEjc4X = 0;
                }
                mhl5lidbq.tGV7Q6urW.remove(size);
            }
            qhPEQQaQ4 qhpeqqaq42 = (qhPEQQaQ4) mhl5lidbq.q3BipwRCk;
            int J4Ux7ym32 = qhpeqqaq42.J4Ux7ym32();
            for (int i = 0; i < J4Ux7ym32; i++) {
                View q3BipwRCk = qhpeqqaq42.q3BipwRCk(i);
                qhpeqqaq42.q3BipwRCk.MzoOEjc4X(q3BipwRCk);
                q3BipwRCk.clearAnimation();
            }
            qhpeqqaq42.q3BipwRCk.removeAllViews();
            this.WaUP0CF08 = lULQkQlc9;
            if (lULQkQlc9 != null) {
                if (lULQkQlc9.J4Ux7ym32 == null) {
                    lULQkQlc9.BqpzfZavo(this);
                    if (this.CpG0imbht) {
                        this.WaUP0CF08.GPLPRo6go = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lULQkQlc9);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(lULQkQlc9.J4Ux7ym32, sb));
                }
            }
            this.kmSgne1rO.CBQ5d1kRq();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        p2GzZFWt4 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.dIocxURUo) {
            View view = scrollingChildHelper.tGV7Q6urW;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            mJLaJepZo.dfpT1j18n(view);
        }
        scrollingChildHelper.dIocxURUo = z;
    }

    public void setOnFlingListener(Og6dYSoy7 og6dYSoy7) {
        this.KBYw84i3W = og6dYSoy7;
    }

    @Deprecated
    public void setOnScrollListener(wnbPPCp4x wnbppcp4x) {
        this.lqFHPHdW3 = wnbppcp4x;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.M66hQ219i = z;
    }

    public void setRecycledViewPool(Y371ZqMzx y371ZqMzx) {
        V1xq9aVRv v1xq9aVRv = this.kmSgne1rO;
        Y371ZqMzx y371ZqMzx2 = v1xq9aVRv.GPLPRo6go;
        if (y371ZqMzx2 != null) {
            y371ZqMzx2.J4Ux7ym32--;
        }
        v1xq9aVRv.GPLPRo6go = y371ZqMzx;
        if (y371ZqMzx != null && RecyclerView.this.getAdapter() != null) {
            v1xq9aVRv.GPLPRo6go.J4Ux7ym32++;
        }
    }

    @Deprecated
    public void setRecyclerListener(aDHI5aP05 adhi5ap05) {
        this.i8XZMQc6Z = adhi5ap05;
    }

    public void setScrollState(int i) {
        kVmRinNH6 kvmrinnh6;
        if (i != this.wIZEdYHUn) {
            this.wIZEdYHUn = i;
            if (i != 2) {
                this.R2hkbNqWf.tGV7Q6urW();
                LULQkQlc9 lULQkQlc9 = this.WaUP0CF08;
                if (!(lULQkQlc9 == null || (kvmrinnh6 = lULQkQlc9.kCA6Zs9sL) == null)) {
                    kvmrinnh6.dIocxURUo();
                }
            }
            LULQkQlc9 lULQkQlc92 = this.WaUP0CF08;
            if (lULQkQlc92 != null) {
                lULQkQlc92.KlYagMRWx(i);
            }
            wnbPPCp4x wnbppcp4x = this.lqFHPHdW3;
            if (wnbppcp4x != null) {
                wnbppcp4x.q3BipwRCk(this, i);
            }
            List list = this.oesmsHQJU;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((wnbPPCp4x) this.oesmsHQJU.get(size)).q3BipwRCk(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.kktL0P5MG = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.kktL0P5MG = i2;
    }

    public void setViewCacheExtension(wwj2VvJy1 wwj2vvjy1) {
        Objects.requireNonNull(this.kmSgne1rO);
    }

    public void sk5s77z6Q() {
        int i;
        int i2;
        if (this.zHl31GGXU == null) {
            EdgeEffect q3BipwRCk = this.juJ6pnCpu.q3BipwRCk(this);
            this.zHl31GGXU = q3BipwRCk;
            if (this.qVUwofr5s) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            q3BipwRCk.setSize(i2, i);
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().yWvV4ePLl(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().oon79WMrY(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.NyWTwPF6V) {
            yWvV4ePLl("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.NyWTwPF6V = false;
                if (!(!this.mUqPm6GBh || this.WaUP0CF08 == null || this.sk5s77z6Q == null)) {
                    requestLayout();
                }
                this.mUqPm6GBh = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.NyWTwPF6V = true;
            this.vNtjxmzUM = true;
            lqFHPHdW3();
        }
    }

    public long vNtjxmzUM(cywn6086a cywn6086a2) {
        if (this.sk5s77z6Q.J4Ux7ym32) {
            return cywn6086a2.kCA6Zs9sL;
        }
        return (long) cywn6086a2.tGV7Q6urW;
    }

    public void wIZEdYHUn() {
        if (!this.Ta2zrwkcM && this.CpG0imbht) {
            Runnable runnable = this.BqpzfZavo;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.kmSgne1rO(this, runnable);
            this.Ta2zrwkcM = true;
        }
    }

    public void yWvV4ePLl(String str) {
        if (TyB1UUd72()) {
            if (str == null) {
                throw new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, abGBwSu8x.q3BipwRCk("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.TyB1UUd72 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(Rwvkmr87Y.q3BipwRCk(this, abGBwSu8x.q3BipwRCk(""))));
        }
    }

    public void zHl31GGXU(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.EBQXiIPmm - 1;
        this.EBQXiIPmm = i2;
        if (i2 < 1) {
            this.EBQXiIPmm = 0;
            if (z) {
                int i3 = this.i0Zug1mVk;
                this.i0Zug1mVk = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.V9LQMKGJe;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.tFD7BDQ71.size() - 1; size >= 0; size--) {
                    cywn6086a cywn6086a2 = (cywn6086a) this.tFD7BDQ71.get(size);
                    if (cywn6086a2.q3BipwRCk.getParent() == this && !cywn6086a2.dXrmkklc8() && (i = cywn6086a2.ilHKhw3Yw) != -1) {
                        View view = cywn6086a2.q3BipwRCk;
                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                        VCCyeOu6I.Eeka1udhb(view, i);
                        cywn6086a2.ilHKhw3Yw = -1;
                    }
                }
                this.tFD7BDQ71.clear();
            }
        }
    }

    public final void ziwPzaoF3(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.IzM1cD9ly) {
            int i = actionIndex == 0 ? 1 : 0;
            this.IzM1cD9ly = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.DuuXfa7LE = x;
            this.OpLJtmvFM = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.XYT7vJqNO = y;
            this.BL4OzhZBd = y;
        }
    }
}
