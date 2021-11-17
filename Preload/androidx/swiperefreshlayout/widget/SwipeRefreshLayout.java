package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import con.CoGXo2yJl;
import con.D856HTNqd;
import con.HCY8BlMhC;
import con.IuQbWntsc;
import con.KTMDafsbu;
import con.QiVwQCcLp;
import con.epVYzXVdP;
import con.fWAISGlrC;
import con.ilS92Fi6U;
import con.mJLaJepZo;
import con.mmX2UQLSo;
import con.nHNpaD9No;
import con.nszw3jam6;
import con.og3FNDLcb;
import con.p2GzZFWt4;
import java.util.Objects;
import java.util.WeakHashMap;
import me.rosuh.filepicker.FilePickerActivity;
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements mmX2UQLSo, QiVwQCcLp, epVYzXVdP {
    public static final int[] ziwPzaoF3 = {16842766};
    public int AqaWJg0b4;
    public View CBQ5d1kRq;
    public boolean EBQXiIPmm;
    public float MzoOEjc4X;
    public int NyWTwPF6V;
    public int PSTqBLTET;
    public Animation QNqj6nIzv;
    public int TyB1UUd72;
    public Animation V9LQMKGJe;
    public boolean cAwN510t2;
    public float dfpT1j18n;
    public CoGXo2yJl i0Zug1mVk;
    public int i8XZMQc6Z;
    public float iMyQMM6Qj;
    public Animation igRQEZxnW;
    public float ilHKhw3Yw;
    public boolean j22ftfeNI;
    public WfopS3efW juJ6pnCpu;
    public PMYI4lLJM kmSgne1rO;
    public int mUqPm6GBh;
    public Animation o4LF8RkoQ;
    public boolean sk5s77z6Q;
    public int vNtjxmzUM;
    public boolean Bhmn1KIah = false;
    public final int[] dXrmkklc8 = new int[2];
    public final int[] RG6kpfv3v = new int[2];
    public final int[] ixWaw2akD = new int[2];
    public int IytU16YUK = -1;
    public int nlGCs0NZs = -1;
    public Animation.AnimationListener QSbMsHU5X = new RG2GI7LDp();
    public final Animation L4EwGfXiQ = new s7MlVynBG();
    public final Animation zHl31GGXU = new dNif5KqqH();
    public int WaUP0CF08 = getResources().getInteger(17694721);
    public final DecelerateInterpolator CpG0imbht = new DecelerateInterpolator(2.0f);
    public og3FNDLcb qFBXIgpia = new og3FNDLcb(getContext());
    public final KTMDafsbu qVUwofr5s = new KTMDafsbu();
    public final p2GzZFWt4 Eeka1udhb = new p2GzZFWt4(this);

    /* loaded from: classes.dex */
    public interface PMYI4lLJM {
    }

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Animation.AnimationListener {
        public RG2GI7LDp() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            PMYI4lLJM pMYI4lLJM;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.Bhmn1KIah) {
                swipeRefreshLayout.i0Zug1mVk.setAlpha(255);
                SwipeRefreshLayout.this.i0Zug1mVk.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.EBQXiIPmm && (pMYI4lLJM = swipeRefreshLayout2.kmSgne1rO) != null) {
                    FilePickerActivity filePickerActivity = ((HCY8BlMhC) pMYI4lLJM).q3BipwRCk;
                    int i = FilePickerActivity.j22ftfeNI;
                    filePickerActivity.ilHKhw3Yw().oon79WMrY().clear();
                    filePickerActivity.iMyQMM6Qj();
                    filePickerActivity.WaUP0CF08();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.i8XZMQc6Z = swipeRefreshLayout3.qFBXIgpia.getTop();
                return;
            }
            swipeRefreshLayout.Bhmn1KIah();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public static class Rma6SHcSH extends View.BaseSavedState {
        public static final Parcelable.Creator<Rma6SHcSH> CREATOR = new nszw3jam6(4);
        public final boolean CBQ5d1kRq;

        public Rma6SHcSH(Parcel parcel) {
            super(parcel);
            this.CBQ5d1kRq = parcel.readByte() != 0;
        }

        public Rma6SHcSH(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.CBQ5d1kRq = z;
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.CBQ5d1kRq ? (byte) 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public interface WfopS3efW {
        boolean q3BipwRCk(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr extends Animation {
        public final /* synthetic */ int CBQ5d1kRq;
        public final /* synthetic */ int kmSgne1rO;

        public aXI58Y1kr(int i, int i2) {
            SwipeRefreshLayout.this = r1;
            this.CBQ5d1kRq = i;
            this.kmSgne1rO = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            CoGXo2yJl coGXo2yJl = SwipeRefreshLayout.this.i0Zug1mVk;
            int i = this.CBQ5d1kRq;
            coGXo2yJl.setAlpha((int) ((((float) (this.kmSgne1rO - i)) * f) + ((float) i)));
        }
    }

    /* loaded from: classes.dex */
    public class dNif5KqqH extends Animation {
        public dNif5KqqH() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.CBQ5d1kRq(f);
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends Animation {
        public mhl5lIdbQ() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements Animation.AnimationListener {
        public qhPEQQaQ4() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.qVUwofr5s(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class s7MlVynBG extends Animation {
        public s7MlVynBG() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.NyWTwPF6V - Math.abs(swipeRefreshLayout.mUqPm6GBh);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.AqaWJg0b4;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.qFBXIgpia.getTop());
            CoGXo2yJl coGXo2yJl = SwipeRefreshLayout.this.i0Zug1mVk;
            float f2 = 1.0f - f;
            fWAISGlrC fwaisglrc = coGXo2yJl.CBQ5d1kRq;
            if (f2 != fwaisglrc.MzoOEjc4X) {
                fwaisglrc.MzoOEjc4X = f2;
            }
            coGXo2yJl.invalidateSelf();
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MzoOEjc4X = -1.0f;
        this.PSTqBLTET = ViewConfiguration.get(context).getScaledTouchSlop();
        setWillNotDraw(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.TyB1UUd72 = (int) (displayMetrics.density * 40.0f);
        CoGXo2yJl coGXo2yJl = new CoGXo2yJl(getContext());
        this.i0Zug1mVk = coGXo2yJl;
        coGXo2yJl.tGV7Q6urW(1);
        this.qFBXIgpia.setImageDrawable(this.i0Zug1mVk);
        this.qFBXIgpia.setVisibility(8);
        addView(this.qFBXIgpia);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.NyWTwPF6V = i;
        this.MzoOEjc4X = (float) i;
        setNestedScrollingEnabled(true);
        int i2 = -this.TyB1UUd72;
        this.i8XZMQc6Z = i2;
        this.mUqPm6GBh = i2;
        CBQ5d1kRq(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ziwPzaoF3);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.qFBXIgpia.getBackground().setAlpha(i);
        CoGXo2yJl coGXo2yJl = this.i0Zug1mVk;
        coGXo2yJl.CBQ5d1kRq.dXrmkklc8 = i;
        coGXo2yJl.invalidateSelf();
    }

    public void Bhmn1KIah() {
        this.qFBXIgpia.clearAnimation();
        this.i0Zug1mVk.stop();
        this.qFBXIgpia.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.mUqPm6GBh - this.i8XZMQc6Z);
        this.i8XZMQc6Z = this.qFBXIgpia.getTop();
    }

    public void CBQ5d1kRq(float f) {
        int i = this.AqaWJg0b4;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.mUqPm6GBh - i)) * f))) - this.qFBXIgpia.getTop());
    }

    public boolean GPLPRo6go() {
        WfopS3efW wfopS3efW = this.juJ6pnCpu;
        if (wfopS3efW != null) {
            return wfopS3efW.q3BipwRCk(this, this.CBQ5d1kRq);
        }
        View view = this.CBQ5d1kRq;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // con.QiVwQCcLp
    public void J4Ux7ym32(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final Animation MzoOEjc4X(int i, int i2) {
        aXI58Y1kr axi58y1kr = new aXI58Y1kr(i, i2);
        axi58y1kr.setDuration(300);
        og3FNDLcb og3fndlcb = this.qFBXIgpia;
        og3fndlcb.CBQ5d1kRq = null;
        og3fndlcb.clearAnimation();
        this.qFBXIgpia.startAnimation(axi58y1kr);
        return axi58y1kr;
    }

    public final void PSTqBLTET(boolean z, boolean z2) {
        if (this.Bhmn1KIah != z) {
            this.EBQXiIPmm = z2;
            Puu3Rhg4F();
            this.Bhmn1KIah = z;
            if (z) {
                int i = this.i8XZMQc6Z;
                Animation.AnimationListener animationListener = this.QSbMsHU5X;
                this.AqaWJg0b4 = i;
                this.L4EwGfXiQ.reset();
                this.L4EwGfXiQ.setDuration(200);
                this.L4EwGfXiQ.setInterpolator(this.CpG0imbht);
                if (animationListener != null) {
                    this.qFBXIgpia.CBQ5d1kRq = animationListener;
                }
                this.qFBXIgpia.clearAnimation();
                this.qFBXIgpia.startAnimation(this.L4EwGfXiQ);
                return;
            }
            qVUwofr5s(this.QSbMsHU5X);
        }
    }

    public final void Puu3Rhg4F() {
        if (this.CBQ5d1kRq == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.qFBXIgpia)) {
                    this.CBQ5d1kRq = childAt;
                    return;
                }
            }
        }
    }

    @Override // con.mmX2UQLSo
    public void dIocxURUo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            int[] iArr2 = this.RG6kpfv3v;
            if (i5 == 0) {
                this.Eeka1udhb.dIocxURUo(i, i2, i3, i4, iArr2, i5, iArr);
            }
            int i7 = i4 - (iArr[1] - i6);
            int i8 = i7 == 0 ? i4 + this.RG6kpfv3v[1] : i7;
            if (i8 < 0 && !GPLPRo6go()) {
                float abs = this.ilHKhw3Yw + ((float) Math.abs(i8));
                this.ilHKhw3Yw = abs;
                vPSbyrYWX(abs);
                iArr[1] = iArr[1] + i7;
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.Eeka1udhb.q3BipwRCk(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.Eeka1udhb.J4Ux7ym32(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.Eeka1udhb.tGV7Q6urW(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.Eeka1udhb.kCA6Zs9sL(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.nlGCs0NZs;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.qVUwofr5s.q3BipwRCk();
    }

    public int getProgressCircleDiameter() {
        return this.TyB1UUd72;
    }

    public int getProgressViewEndOffset() {
        return this.NyWTwPF6V;
    }

    public int getProgressViewStartOffset() {
        return this.mUqPm6GBh;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.Eeka1udhb.Puu3Rhg4F(0);
    }

    @Override // con.QiVwQCcLp
    public boolean iiGwOFFnr(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final void ilHKhw3Yw(float f) {
        float f2 = this.iMyQMM6Qj;
        int i = this.PSTqBLTET;
        if (f - f2 > ((float) i) && !this.cAwN510t2) {
            this.dfpT1j18n = f2 + ((float) i);
            this.cAwN510t2 = true;
            this.i0Zug1mVk.setAlpha(76);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.Eeka1udhb.dIocxURUo;
    }

    @Override // con.QiVwQCcLp
    public void kCA6Zs9sL(View view, int i, int i2, int i3, int i4, int i5) {
        dIocxURUo(view, i, i2, i3, i4, i5, this.ixWaw2akD);
    }

    public final void kmSgne1rO(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.IytU16YUK) {
            this.IytU16YUK = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bhmn1KIah();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Puu3Rhg4F();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || GPLPRo6go() || this.Bhmn1KIah || this.sk5s77z6Q) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.IytU16YUK;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    ilHKhw3Yw(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        kmSgne1rO(motionEvent);
                    }
                }
            }
            this.cAwN510t2 = false;
            this.IytU16YUK = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mUqPm6GBh - this.qFBXIgpia.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.IytU16YUK = pointerId;
            this.cAwN510t2 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.iMyQMM6Qj = motionEvent.getY(findPointerIndex2);
        }
        return this.cAwN510t2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.CBQ5d1kRq == null) {
                Puu3Rhg4F();
            }
            View view = this.CBQ5d1kRq;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.qFBXIgpia.getMeasuredWidth();
                int measuredHeight2 = this.qFBXIgpia.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.i8XZMQc6Z;
                this.qFBXIgpia.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.CBQ5d1kRq == null) {
            Puu3Rhg4F();
        }
        View view = this.CBQ5d1kRq;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.qFBXIgpia.measure(View.MeasureSpec.makeMeasureSpec(this.TyB1UUd72, 1073741824), View.MeasureSpec.makeMeasureSpec(this.TyB1UUd72, 1073741824));
            this.nlGCs0NZs = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.qFBXIgpia) {
                    this.nlGCs0NZs = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.ilHKhw3Yw;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.ilHKhw3Yw = 0.0f;
                } else {
                    this.ilHKhw3Yw = f - f2;
                    iArr[1] = i2;
                }
                vPSbyrYWX(this.ilHKhw3Yw);
            }
        }
        int[] iArr2 = this.dXrmkklc8;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dIocxURUo(view, i, i2, i3, i4, 0, this.ixWaw2akD);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.qVUwofr5s.q3BipwRCk = i;
        startNestedScroll(i & 2);
        this.ilHKhw3Yw = 0.0f;
        this.sk5s77z6Q = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Rma6SHcSH rma6SHcSH = (Rma6SHcSH) parcelable;
        super.onRestoreInstanceState(rma6SHcSH.getSuperState());
        setRefreshing(rma6SHcSH.CBQ5d1kRq);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new Rma6SHcSH(super.onSaveInstanceState(), this.Bhmn1KIah);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.Bhmn1KIah && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.qVUwofr5s.J4Ux7ym32(0);
        this.sk5s77z6Q = false;
        float f = this.ilHKhw3Yw;
        if (f > 0.0f) {
            yWvV4ePLl(f);
            this.ilHKhw3Yw = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || GPLPRo6go() || this.Bhmn1KIah || this.sk5s77z6Q) {
            return false;
        }
        if (actionMasked == 0) {
            this.IytU16YUK = motionEvent.getPointerId(0);
            this.cAwN510t2 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.IytU16YUK);
            if (findPointerIndex < 0) {
                Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.cAwN510t2) {
                this.cAwN510t2 = false;
                yWvV4ePLl((motionEvent.getY(findPointerIndex) - this.dfpT1j18n) * 0.5f);
            }
            this.IytU16YUK = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.IytU16YUK);
            if (findPointerIndex2 < 0) {
                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            ilHKhw3Yw(y);
            if (this.cAwN510t2) {
                float f = (y - this.dfpT1j18n) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                vPSbyrYWX(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.IytU16YUK = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                kmSgne1rO(motionEvent);
            }
        }
        return true;
    }

    public final boolean oon79WMrY(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    @Override // con.QiVwQCcLp
    public void q3BipwRCk(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void qVUwofr5s(Animation.AnimationListener animationListener) {
        mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ();
        this.V9LQMKGJe = mhl5lidbq;
        mhl5lidbq.setDuration(150);
        og3FNDLcb og3fndlcb = this.qFBXIgpia;
        og3fndlcb.CBQ5d1kRq = animationListener;
        og3fndlcb.clearAnimation();
        this.qFBXIgpia.startAnimation(this.V9LQMKGJe);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.CBQ5d1kRq;
        if (view != null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (!mJLaJepZo.MzoOEjc4X(view)) {
                if (!this.j22ftfeNI && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.qFBXIgpia.setScaleX(f);
        this.qFBXIgpia.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        Puu3Rhg4F();
        CoGXo2yJl coGXo2yJl = this.i0Zug1mVk;
        fWAISGlrC fwaisglrc = coGXo2yJl.CBQ5d1kRq;
        fwaisglrc.yWvV4ePLl = iArr;
        fwaisglrc.q3BipwRCk(0);
        coGXo2yJl.CBQ5d1kRq.q3BipwRCk(0);
        coGXo2yJl.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            Object obj = D856HTNqd.q3BipwRCk;
            iArr2[i] = nHNpaD9No.q3BipwRCk(context, i2);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.MzoOEjc4X = (float) i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            Bhmn1KIah();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.j22ftfeNI = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        p2GzZFWt4 p2gzzfwt4 = this.Eeka1udhb;
        if (p2gzzfwt4.dIocxURUo) {
            View view = p2gzzfwt4.tGV7Q6urW;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            mJLaJepZo.dfpT1j18n(view);
        }
        p2gzzfwt4.dIocxURUo = z;
    }

    public void setOnChildScrollUpCallback(WfopS3efW wfopS3efW) {
        this.juJ6pnCpu = wfopS3efW;
    }

    public void setOnRefreshListener(PMYI4lLJM pMYI4lLJM) {
        this.kmSgne1rO = pMYI4lLJM;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.qFBXIgpia.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        Context context = getContext();
        Object obj = D856HTNqd.q3BipwRCk;
        setProgressBackgroundColorSchemeColor(nHNpaD9No.q3BipwRCk(context, i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.Bhmn1KIah == z) {
            PSTqBLTET(z, false);
            return;
        }
        this.Bhmn1KIah = z;
        setTargetOffsetTopAndBottom((this.NyWTwPF6V + this.mUqPm6GBh) - this.i8XZMQc6Z);
        this.EBQXiIPmm = false;
        Animation.AnimationListener animationListener = this.QSbMsHU5X;
        this.qFBXIgpia.setVisibility(0);
        this.i0Zug1mVk.setAlpha(255);
        ilS92Fi6U ils92fi6u = new ilS92Fi6U(this);
        this.o4LF8RkoQ = ils92fi6u;
        ils92fi6u.setDuration((long) this.WaUP0CF08);
        if (animationListener != null) {
            this.qFBXIgpia.CBQ5d1kRq = animationListener;
        }
        this.qFBXIgpia.clearAnimation();
        this.qFBXIgpia.startAnimation(this.o4LF8RkoQ);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.TyB1UUd72 = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.qFBXIgpia.setImageDrawable(null);
            this.i0Zug1mVk.tGV7Q6urW(i);
            this.qFBXIgpia.setImageDrawable(this.i0Zug1mVk);
        }
    }

    public void setSlingshotDistance(int i) {
        this.vNtjxmzUM = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.qFBXIgpia.bringToFront();
        og3FNDLcb og3fndlcb = this.qFBXIgpia;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        og3fndlcb.offsetTopAndBottom(i);
        this.i8XZMQc6Z = this.qFBXIgpia.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.Eeka1udhb.yWvV4ePLl(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.Eeka1udhb.oon79WMrY(0);
    }

    @Override // con.QiVwQCcLp
    public void tGV7Q6urW(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final void vPSbyrYWX(float f) {
        CoGXo2yJl coGXo2yJl = this.i0Zug1mVk;
        fWAISGlrC fwaisglrc = coGXo2yJl.CBQ5d1kRq;
        if (!fwaisglrc.Bhmn1KIah) {
            fwaisglrc.Bhmn1KIah = true;
        }
        coGXo2yJl.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.MzoOEjc4X));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.MzoOEjc4X;
        int i = this.vNtjxmzUM;
        if (i <= 0) {
            i = this.NyWTwPF6V;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.mUqPm6GBh + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.qFBXIgpia.getVisibility() != 0) {
            this.qFBXIgpia.setVisibility(0);
        }
        this.qFBXIgpia.setScaleX(1.0f);
        this.qFBXIgpia.setScaleY(1.0f);
        if (f < this.MzoOEjc4X) {
            if (this.i0Zug1mVk.CBQ5d1kRq.dXrmkklc8 > 76 && !oon79WMrY(this.QNqj6nIzv)) {
                this.QNqj6nIzv = MzoOEjc4X(this.i0Zug1mVk.CBQ5d1kRq.dXrmkklc8, 76);
            }
        } else if (this.i0Zug1mVk.CBQ5d1kRq.dXrmkklc8 < 255 && !oon79WMrY(this.igRQEZxnW)) {
            this.igRQEZxnW = MzoOEjc4X(this.i0Zug1mVk.CBQ5d1kRq.dXrmkklc8, 255);
        }
        CoGXo2yJl coGXo2yJl2 = this.i0Zug1mVk;
        float min2 = Math.min(0.8f, max * 0.8f);
        fWAISGlrC fwaisglrc2 = coGXo2yJl2.CBQ5d1kRq;
        fwaisglrc2.kCA6Zs9sL = 0.0f;
        fwaisglrc2.iiGwOFFnr = min2;
        coGXo2yJl2.invalidateSelf();
        CoGXo2yJl coGXo2yJl3 = this.i0Zug1mVk;
        float min3 = Math.min(1.0f, max);
        fWAISGlrC fwaisglrc3 = coGXo2yJl3.CBQ5d1kRq;
        if (min3 != fwaisglrc3.MzoOEjc4X) {
            fwaisglrc3.MzoOEjc4X = min3;
        }
        coGXo2yJl3.invalidateSelf();
        CoGXo2yJl coGXo2yJl4 = this.i0Zug1mVk;
        coGXo2yJl4.CBQ5d1kRq.GPLPRo6go = ((pow * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        coGXo2yJl4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.i8XZMQc6Z);
    }

    public final void yWvV4ePLl(float f) {
        if (f > this.MzoOEjc4X) {
            PSTqBLTET(true, true);
            return;
        }
        this.Bhmn1KIah = false;
        CoGXo2yJl coGXo2yJl = this.i0Zug1mVk;
        fWAISGlrC fwaisglrc = coGXo2yJl.CBQ5d1kRq;
        fwaisglrc.kCA6Zs9sL = 0.0f;
        fwaisglrc.iiGwOFFnr = 0.0f;
        coGXo2yJl.invalidateSelf();
        qhPEQQaQ4 qhpeqqaq4 = new qhPEQQaQ4();
        this.AqaWJg0b4 = this.i8XZMQc6Z;
        this.zHl31GGXU.reset();
        this.zHl31GGXU.setDuration(200);
        this.zHl31GGXU.setInterpolator(this.CpG0imbht);
        og3FNDLcb og3fndlcb = this.qFBXIgpia;
        og3fndlcb.CBQ5d1kRq = qhpeqqaq4;
        og3fndlcb.clearAnimation();
        this.qFBXIgpia.startAnimation(this.zHl31GGXU);
        CoGXo2yJl coGXo2yJl2 = this.i0Zug1mVk;
        fWAISGlrC fwaisglrc2 = coGXo2yJl2.CBQ5d1kRq;
        if (fwaisglrc2.Bhmn1KIah) {
            fwaisglrc2.Bhmn1KIah = false;
        }
        coGXo2yJl2.invalidateSelf();
    }
}
