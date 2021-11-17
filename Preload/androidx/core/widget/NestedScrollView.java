package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.KTMDafsbu;
import con.SacA58h0y;
import con.VCCyeOu6I;
import con.XflkRyC2J;
import con.YKK4R667A;
import con.abGBwSu8x;
import con.epVYzXVdP;
import con.mJLaJepZo;
import con.mmX2UQLSo;
import con.nszw3jam6;
import con.p2GzZFWt4;
import con.pA5wCkne4;
import con.reQoeNd7H;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements mmX2UQLSo, epVYzXVdP {
    public aXI58Y1kr AqaWJg0b4;
    public OverScroller Bhmn1KIah;
    public long CBQ5d1kRq;
    public EdgeEffect MzoOEjc4X;
    public final p2GzZFWt4 NyWTwPF6V;
    public EdgeEffect PSTqBLTET;
    public int dfpT1j18n;
    public mhl5lIdbQ i0Zug1mVk;
    public int i8XZMQc6Z;
    public int iMyQMM6Qj;
    public int ilHKhw3Yw;
    public VelocityTracker ixWaw2akD;
    public final KTMDafsbu mUqPm6GBh;
    public int nlGCs0NZs;
    public int qFBXIgpia;
    public boolean sk5s77z6Q;
    public float vNtjxmzUM;
    public static final RG2GI7LDp o4LF8RkoQ = new RG2GI7LDp();
    public static final int[] V9LQMKGJe = {16843130};
    public final Rect kmSgne1rO = new Rect();
    public boolean qVUwofr5s = true;
    public boolean Eeka1udhb = false;
    public View dXrmkklc8 = null;
    public boolean RG6kpfv3v = false;
    public boolean WaUP0CF08 = true;
    public int cAwN510t2 = -1;
    public final int[] IytU16YUK = new int[2];
    public final int[] CpG0imbht = new int[2];

    /* loaded from: classes.dex */
    public static class RG2GI7LDp extends XflkRyC2J {
        @Override // con.XflkRyC2J
        public boolean GPLPRo6go(View view, int i, Bundle bundle) {
            int min;
            if (super.GPLPRo6go(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.dfpT1j18n(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.dfpT1j18n(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }

        @Override // con.XflkRyC2J
        public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
            int scrollRange;
            this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            iqwHQ6O2l.q3BipwRCk.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                iqwHQ6O2l.q3BipwRCk.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    iqwHQ6O2l.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.yWvV4ePLl);
                    iqwHQ6O2l.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.kmSgne1rO);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    iqwHQ6O2l.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.Puu3Rhg4F);
                    iqwHQ6O2l.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.PSTqBLTET);
                }
            }
        }

        @Override // con.XflkRyC2J
        public void tGV7Q6urW(View view, AccessibilityEvent accessibilityEvent) {
            this.q3BipwRCk.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr extends View.BaseSavedState {
        public static final Parcelable.Creator<aXI58Y1kr> CREATOR = new nszw3jam6(2);
        public int CBQ5d1kRq;

        public aXI58Y1kr(Parcel parcel) {
            super(parcel);
            this.CBQ5d1kRq = parcel.readInt();
        }

        public aXI58Y1kr(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("HorizontalScrollView.SavedState{");
            q3BipwRCk.append(Integer.toHexString(System.identityHashCode(this)));
            q3BipwRCk.append(" scrollPosition=");
            q3BipwRCk.append(this.CBQ5d1kRq);
            q3BipwRCk.append("}");
            return q3BipwRCk.toString();
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.CBQ5d1kRq);
        }
    }

    /* loaded from: classes.dex */
    public interface mhl5lIdbQ {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        this.PSTqBLTET = SacA58h0y.q3BipwRCk() ? reQoeNd7H.q3BipwRCk(context, attributeSet) : new EdgeEffect(context);
        this.MzoOEjc4X = SacA58h0y.q3BipwRCk() ? reQoeNd7H.q3BipwRCk(context, attributeSet) : new EdgeEffect(context);
        this.Bhmn1KIah = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.i8XZMQc6Z = viewConfiguration.getScaledTouchSlop();
        this.dfpT1j18n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.iMyQMM6Qj = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V9LQMKGJe, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.mUqPm6GBh = new KTMDafsbu();
        this.NyWTwPF6V = new p2GzZFWt4(this);
        setNestedScrollingEnabled(true);
        IuQbWntsc.MzoOEjc4X(this, o4LF8RkoQ);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.vNtjxmzUM == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.vNtjxmzUM = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.vNtjxmzUM;
    }

    public static boolean ilHKhw3Yw(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && ilHKhw3Yw((View) parent, view2);
    }

    public static int yWvV4ePLl(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public void Bhmn1KIah(int i) {
        if (getChildCount() > 0) {
            this.Bhmn1KIah.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            sk5s77z6Q(true);
        }
    }

    public final void CBQ5d1kRq(int i) {
        if (i == 0) {
            return;
        }
        if (this.WaUP0CF08) {
            dfpT1j18n(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    public final void Eeka1udhb(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.NyWTwPF6V.dIocxURUo(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void GPLPRo6go() {
        this.Bhmn1KIah.abortAnimation();
        this.NyWTwPF6V.oon79WMrY(1);
    }

    @Override // con.QiVwQCcLp
    public void J4Ux7ym32(View view, int i) {
        KTMDafsbu kTMDafsbu = this.mUqPm6GBh;
        if (i == 1) {
            kTMDafsbu.J4Ux7ym32 = 0;
        } else {
            kTMDafsbu.q3BipwRCk = 0;
        }
        this.NyWTwPF6V.oon79WMrY(i);
    }

    public boolean MzoOEjc4X(int i) {
        return this.NyWTwPF6V.GPLPRo6go(i) != null;
    }

    public boolean PSTqBLTET(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.kmSgne1rO;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.kmSgne1rO.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.kmSgne1rO;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.kmSgne1rO;
        return WaUP0CF08(i, rect3.top, rect3.bottom);
    }

    public boolean Puu3Rhg4F(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !qVUwofr5s(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            CBQ5d1kRq(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.kmSgne1rO);
            offsetDescendantRectToMyCoords(findNextFocus, this.kmSgne1rO);
            CBQ5d1kRq(oon79WMrY(this.kmSgne1rO));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!qVUwofr5s(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public boolean RG6kpfv3v(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !MzoOEjc4X(1)) {
            this.Bhmn1KIah.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    public final boolean WaUP0CF08(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            CBQ5d1kRq(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final boolean cAwN510t2(MotionEvent motionEvent) {
        boolean z;
        if (pA5wCkne4.vPSbyrYWX(this.PSTqBLTET) != 0.0f) {
            pA5wCkne4.kmSgne1rO(this.PSTqBLTET, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z = true;
        } else {
            z = false;
        }
        if (pA5wCkne4.vPSbyrYWX(this.MzoOEjc4X) == 0.0f) {
            return z;
        }
        pA5wCkne4.kmSgne1rO(this.MzoOEjc4X, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.Bhmn1KIah.isFinished()) {
            this.Bhmn1KIah.computeScrollOffset();
            int currY = this.Bhmn1KIah.getCurrY();
            int i = currY - this.nlGCs0NZs;
            this.nlGCs0NZs = currY;
            int[] iArr = this.CpG0imbht;
            boolean z = false;
            iArr[1] = 0;
            vPSbyrYWX(0, i, iArr, null, 1);
            int i2 = i - this.CpG0imbht[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                RG6kpfv3v(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.CpG0imbht;
                iArr2[1] = 0;
                this.NyWTwPF6V.iiGwOFFnr(0, scrollY2, 0, i3, this.IytU16YUK, 1, iArr2);
                i2 = i3 - this.CpG0imbht[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i2 < 0) {
                        if (this.PSTqBLTET.isFinished()) {
                            edgeEffect = this.PSTqBLTET;
                            edgeEffect.onAbsorb((int) this.Bhmn1KIah.getCurrVelocity());
                        }
                    } else if (this.MzoOEjc4X.isFinished()) {
                        edgeEffect = this.MzoOEjc4X;
                        edgeEffect.onAbsorb((int) this.Bhmn1KIah.getCurrVelocity());
                    }
                }
                GPLPRo6go();
            }
            if (!this.Bhmn1KIah.isFinished()) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.vPSbyrYWX(this);
                return;
            }
            this.NyWTwPF6V.oon79WMrY(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // con.mmX2UQLSo
    public void dIocxURUo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Eeka1udhb(i4, i5, iArr);
    }

    public final void dXrmkklc8(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.cAwN510t2) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ilHKhw3Yw = (int) motionEvent.getY(i);
            this.cAwN510t2 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.ixWaw2akD;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void dfpT1j18n(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.CBQ5d1kRq > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.Bhmn1KIah;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                sk5s77z6Q(z);
            } else {
                if (!this.Bhmn1KIah.isFinished()) {
                    GPLPRo6go();
                }
                scrollBy(i, i2);
            }
            this.CBQ5d1kRq = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || kmSgne1rO(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.NyWTwPF6V.q3BipwRCk(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.NyWTwPF6V.J4Ux7ym32(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return vPSbyrYWX(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.NyWTwPF6V.kCA6Zs9sL(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.PSTqBLTET.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.PSTqBLTET.setSize(width, height);
            if (this.PSTqBLTET.draw(canvas)) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.vPSbyrYWX(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.MzoOEjc4X.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.MzoOEjc4X.setSize(width2, height2);
            if (this.MzoOEjc4X.draw(canvas)) {
                WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.vPSbyrYWX(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mUqPm6GBh.q3BipwRCk();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return MzoOEjc4X(0);
    }

    public final void i8XZMQc6Z(View view) {
        view.getDrawingRect(this.kmSgne1rO);
        offsetDescendantRectToMyCoords(view, this.kmSgne1rO);
        int oon79WMrY = oon79WMrY(this.kmSgne1rO);
        if (oon79WMrY != 0) {
            scrollBy(0, oon79WMrY);
        }
    }

    public boolean iMyQMM6Qj(int i, int i2) {
        return this.NyWTwPF6V.yWvV4ePLl(i, i2);
    }

    @Override // con.QiVwQCcLp
    public boolean iiGwOFFnr(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.NyWTwPF6V.dIocxURUo;
    }

    public final void ixWaw2akD() {
        VelocityTracker velocityTracker = this.ixWaw2akD;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ixWaw2akD = null;
        }
    }

    @Override // con.QiVwQCcLp
    public void kCA6Zs9sL(View view, int i, int i2, int i3, int i4, int i5) {
        Eeka1udhb(i4, i5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean kmSgne1rO(KeyEvent keyEvent) {
        boolean z;
        Rect rect;
        int i;
        this.kmSgne1rO.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
                if (z) {
                    if (!isFocused() || keyEvent.getKeyCode() == 4) {
                        return false;
                    }
                    View findFocus = findFocus();
                    if (findFocus == this) {
                        findFocus = null;
                    }
                    View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                    return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
                } else if (keyEvent.getAction() != 0) {
                    return false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    int i2 = 33;
                    if (keyCode == 19) {
                        return !keyEvent.isAltPressed() ? Puu3Rhg4F(33) : PSTqBLTET(33);
                    }
                    if (keyCode == 20) {
                        return !keyEvent.isAltPressed() ? Puu3Rhg4F(130) : PSTqBLTET(130);
                    }
                    if (keyCode != 62) {
                        return false;
                    }
                    if (!keyEvent.isShiftPressed()) {
                        i2 = 130;
                    }
                    boolean z2 = i2 == 130;
                    int height = getHeight();
                    if (z2) {
                        this.kmSgne1rO.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            View childAt2 = getChildAt(childCount - 1);
                            int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                            rect = this.kmSgne1rO;
                            if (rect.top + height > paddingBottom) {
                                i = paddingBottom - height;
                                rect.top = i;
                            }
                        }
                        Rect rect2 = this.kmSgne1rO;
                        int i3 = rect2.top;
                        int i4 = height + i3;
                        rect2.bottom = i4;
                        WaUP0CF08(i2, i3, i4);
                        return false;
                    }
                    this.kmSgne1rO.top = getScrollY() - height;
                    rect = this.kmSgne1rO;
                    if (rect.top < 0) {
                        i = 0;
                        rect.top = i;
                    }
                    Rect rect22 = this.kmSgne1rO;
                    int i32 = rect22.top;
                    int i42 = height + i32;
                    rect22.bottom = i42;
                    WaUP0CF08(i2, i32, i42);
                    return false;
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Eeka1udhb = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.RG6kpfv3v) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.RG6kpfv3v) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.cAwN510t2;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.ilHKhw3Yw) > this.i8XZMQc6Z && (2 & getNestedScrollAxes()) == 0) {
                                this.RG6kpfv3v = true;
                                this.ilHKhw3Yw = y;
                                if (this.ixWaw2akD == null) {
                                    this.ixWaw2akD = VelocityTracker.obtain();
                                }
                                this.ixWaw2akD.addMovement(motionEvent);
                                this.qFBXIgpia = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        dXrmkklc8(motionEvent);
                    }
                }
            }
            this.RG6kpfv3v = false;
            this.cAwN510t2 = -1;
            ixWaw2akD();
            if (this.Bhmn1KIah.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                VCCyeOu6I.vPSbyrYWX(this);
            }
            this.NyWTwPF6V.oon79WMrY(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    z = true;
                    if (z) {
                        if (!cAwN510t2(motionEvent) && this.Bhmn1KIah.isFinished()) {
                            z2 = false;
                        }
                        this.RG6kpfv3v = z2;
                        ixWaw2akD();
                    } else {
                        this.ilHKhw3Yw = y2;
                        this.cAwN510t2 = motionEvent.getPointerId(0);
                        VelocityTracker velocityTracker = this.ixWaw2akD;
                        if (velocityTracker == null) {
                            this.ixWaw2akD = VelocityTracker.obtain();
                        } else {
                            velocityTracker.clear();
                        }
                        this.ixWaw2akD.addMovement(motionEvent);
                        this.Bhmn1KIah.computeScrollOffset();
                        if (!cAwN510t2(motionEvent) && this.Bhmn1KIah.isFinished()) {
                            z2 = false;
                        }
                        this.RG6kpfv3v = z2;
                        iMyQMM6Qj(2, 0);
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return this.RG6kpfv3v;
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.qVUwofr5s = false;
        View view = this.dXrmkklc8;
        if (view != null && ilHKhw3Yw(view, this)) {
            i8XZMQc6Z(this.dXrmkklc8);
        }
        this.dXrmkklc8 = null;
        if (!this.Eeka1udhb) {
            if (this.AqaWJg0b4 != null) {
                scrollTo(getScrollX(), this.AqaWJg0b4.CBQ5d1kRq);
                this.AqaWJg0b4 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int yWvV4ePLl = yWvV4ePLl(scrollY, paddingTop, i5);
            if (yWvV4ePLl != scrollY) {
                scrollTo(getScrollX(), yWvV4ePLl);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.Eeka1udhb = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.sk5s77z6Q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        Bhmn1KIah((int) f2);
        return true;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        vPSbyrYWX(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Eeka1udhb(i4, 0, null);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.mUqPm6GBh.q3BipwRCk = i;
        iMyQMM6Qj(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(true ^ qVUwofr5s(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aXI58Y1kr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aXI58Y1kr axi58y1kr = (aXI58Y1kr) parcelable;
        super.onRestoreInstanceState(axi58y1kr.getSuperState());
        this.AqaWJg0b4 = axi58y1kr;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        aXI58Y1kr axi58y1kr = new aXI58Y1kr(super.onSaveInstanceState());
        axi58y1kr.CBQ5d1kRq = getScrollY();
        return axi58y1kr;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mhl5lIdbQ mhl5lidbq = this.i0Zug1mVk;
        if (mhl5lidbq != null) {
            YKK4R667A ykk4r667a = (YKK4R667A) mhl5lidbq;
            AlertController.tGV7Q6urW(this, (View) ykk4r667a.q3BipwRCk, (View) ykk4r667a.J4Ux7ym32);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && qVUwofr5s(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.kmSgne1rO);
            offsetDescendantRectToMyCoords(findFocus, this.kmSgne1rO);
            CBQ5d1kRq(oon79WMrY(this.kmSgne1rO));
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void onStopNestedScroll(View view) {
        this.mUqPm6GBh.q3BipwRCk = 0;
        this.NyWTwPF6V.oon79WMrY(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x029b, code lost:
        if (r30.Bhmn1KIah.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x029d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x029d, code lost:
        r0 = con.IuQbWntsc.q3BipwRCk;
        con.VCCyeOu6I.vPSbyrYWX(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r30.Bhmn1KIah.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x029d;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        int i;
        EdgeEffect edgeEffect;
        int round;
        int i2;
        EdgeEffect edgeEffect2;
        ViewParent parent2;
        EdgeEffect edgeEffect3;
        float f;
        if (this.ixWaw2akD == null) {
            this.ixWaw2akD = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 0) {
            this.qFBXIgpia = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.qFBXIgpia);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.ixWaw2akD;
                velocityTracker.computeCurrentVelocity(1000, (float) this.iMyQMM6Qj);
                int yVelocity = (int) velocityTracker.getYVelocity(this.cAwN510t2);
                if (Math.abs(yVelocity) >= this.dfpT1j18n) {
                    if (pA5wCkne4.vPSbyrYWX(this.PSTqBLTET) != 0.0f) {
                        edgeEffect = this.PSTqBLTET;
                        i = yVelocity;
                    } else if (pA5wCkne4.vPSbyrYWX(this.MzoOEjc4X) != 0.0f) {
                        edgeEffect = this.MzoOEjc4X;
                        i = -yVelocity;
                    } else {
                        z = false;
                        if (!z) {
                            int i3 = -yVelocity;
                            float f3 = (float) i3;
                            if (!dispatchNestedPreFling(0.0f, f3)) {
                                dispatchNestedFling(0.0f, f3, true);
                                Bhmn1KIah(i3);
                            }
                        }
                    }
                    edgeEffect.onAbsorb(i);
                    z = true;
                    if (!z) {
                    }
                }
                this.cAwN510t2 = -1;
                this.RG6kpfv3v = false;
                ixWaw2akD();
                this.NyWTwPF6V.oon79WMrY(0);
                this.PSTqBLTET.onRelease();
                this.MzoOEjc4X.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.cAwN510t2);
                if (findPointerIndex == -1) {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Invalid pointerId=");
                    q3BipwRCk.append(this.cAwN510t2);
                    q3BipwRCk.append(" in onTouchEvent");
                    Log.e("NestedScrollView", q3BipwRCk.toString());
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.ilHKhw3Yw - y;
                    float x = motionEvent.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i4) / ((float) getHeight());
                    if (pA5wCkne4.vPSbyrYWX(this.PSTqBLTET) != 0.0f) {
                        f = -pA5wCkne4.kmSgne1rO(this.PSTqBLTET, -height, x);
                        if (pA5wCkne4.vPSbyrYWX(this.PSTqBLTET) == 0.0f) {
                            edgeEffect3 = this.PSTqBLTET;
                            edgeEffect3.onRelease();
                        }
                        f2 = f;
                        round = Math.round(f2 * ((float) getHeight()));
                        if (round != 0) {
                            invalidate();
                        }
                        i2 = i4 - round;
                        if (!this.RG6kpfv3v && Math.abs(i2) > this.i8XZMQc6Z) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.RG6kpfv3v = true;
                            int i5 = this.i8XZMQc6Z;
                            i2 = i2 <= 0 ? i2 - i5 : i2 + i5;
                        }
                        int i6 = i2;
                        if (this.RG6kpfv3v) {
                            if (vPSbyrYWX(0, i6, this.CpG0imbht, this.IytU16YUK, 0)) {
                                i6 -= this.CpG0imbht[1];
                                this.qFBXIgpia += this.IytU16YUK[1];
                            }
                            this.ilHKhw3Yw = y - this.IytU16YUK[1];
                            int scrollY = getScrollY();
                            int scrollRange = getScrollRange();
                            int overScrollMode = getOverScrollMode();
                            boolean z3 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                            boolean z4 = RG6kpfv3v(0, i6, 0, getScrollY(), 0, scrollRange, 0, 0) && !MzoOEjc4X(0);
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.CpG0imbht;
                            iArr[1] = 0;
                            this.NyWTwPF6V.iiGwOFFnr(0, scrollY2, 0, i6 - scrollY2, this.IytU16YUK, 0, iArr);
                            int i7 = this.ilHKhw3Yw;
                            int[] iArr2 = this.IytU16YUK;
                            this.ilHKhw3Yw = i7 - iArr2[1];
                            this.qFBXIgpia += iArr2[1];
                            if (z3) {
                                int i8 = i6 - this.CpG0imbht[1];
                                int i9 = scrollY + i8;
                                if (i9 < 0) {
                                    pA5wCkne4.kmSgne1rO(this.PSTqBLTET, ((float) (-i8)) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.MzoOEjc4X.isFinished()) {
                                        edgeEffect2 = this.MzoOEjc4X;
                                        edgeEffect2.onRelease();
                                    }
                                    if (this.PSTqBLTET.isFinished() || !this.MzoOEjc4X.isFinished()) {
                                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                                        VCCyeOu6I.vPSbyrYWX(this);
                                        if (z2) {
                                            this.ixWaw2akD.clear();
                                        }
                                    }
                                } else {
                                    if (i9 > scrollRange) {
                                        pA5wCkne4.kmSgne1rO(this.MzoOEjc4X, ((float) i8) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                        if (!this.PSTqBLTET.isFinished()) {
                                            edgeEffect2 = this.PSTqBLTET;
                                            edgeEffect2.onRelease();
                                        }
                                    }
                                    if (this.PSTqBLTET.isFinished()) {
                                    }
                                    WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                                    VCCyeOu6I.vPSbyrYWX(this);
                                    if (z2) {
                                    }
                                }
                            }
                            z2 = z4;
                            if (z2) {
                            }
                        }
                    } else {
                        if (pA5wCkne4.vPSbyrYWX(this.MzoOEjc4X) != 0.0f) {
                            f = pA5wCkne4.kmSgne1rO(this.MzoOEjc4X, height, 1.0f - x);
                            if (pA5wCkne4.vPSbyrYWX(this.MzoOEjc4X) == 0.0f) {
                                edgeEffect3 = this.MzoOEjc4X;
                                edgeEffect3.onRelease();
                            }
                            f2 = f;
                        }
                        round = Math.round(f2 * ((float) getHeight()));
                        if (round != 0) {
                        }
                        i2 = i4 - round;
                        if (!this.RG6kpfv3v) {
                            parent2 = getParent();
                            if (parent2 != null) {
                            }
                            this.RG6kpfv3v = true;
                            int i52 = this.i8XZMQc6Z;
                            if (i2 <= 0) {
                            }
                        }
                        int i62 = i2;
                        if (this.RG6kpfv3v) {
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.RG6kpfv3v) {
                    if (getChildCount() > 0) {
                    }
                }
                this.cAwN510t2 = -1;
                this.RG6kpfv3v = false;
                ixWaw2akD();
                this.NyWTwPF6V.oon79WMrY(0);
                this.PSTqBLTET.onRelease();
                this.MzoOEjc4X.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.ilHKhw3Yw = (int) motionEvent.getY(actionIndex);
                this.cAwN510t2 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                dXrmkklc8(motionEvent);
                this.ilHKhw3Yw = (int) motionEvent.getY(motionEvent.findPointerIndex(this.cAwN510t2));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.RG6kpfv3v && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.Bhmn1KIah.isFinished()) {
                GPLPRo6go();
            }
            this.ilHKhw3Yw = (int) motionEvent.getY();
            this.cAwN510t2 = motionEvent.getPointerId(0);
            iMyQMM6Qj(2, 0);
        }
        VelocityTracker velocityTracker2 = this.ixWaw2akD;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public int oon79WMrY(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // con.QiVwQCcLp
    public void q3BipwRCk(View view, View view2, int i, int i2) {
        KTMDafsbu kTMDafsbu = this.mUqPm6GBh;
        if (i2 == 1) {
            kTMDafsbu.J4Ux7ym32 = i;
        } else {
            kTMDafsbu.q3BipwRCk = i;
        }
        iMyQMM6Qj(2, i2);
    }

    public final boolean qVUwofr5s(View view, int i, int i2) {
        view.getDrawingRect(this.kmSgne1rO);
        offsetDescendantRectToMyCoords(view, this.kmSgne1rO);
        return this.kmSgne1rO.bottom + i >= getScrollY() && this.kmSgne1rO.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void requestChildFocus(View view, View view2) {
        if (!this.qVUwofr5s) {
            i8XZMQc6Z(view2);
        } else {
            this.dXrmkklc8 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int oon79WMrY = oon79WMrY(rect);
        boolean z2 = oon79WMrY != 0;
        if (z2) {
            if (z) {
                scrollBy(0, oon79WMrY);
            } else {
                dfpT1j18n(0, oon79WMrY, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            ixWaw2akD();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        this.qVUwofr5s = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int yWvV4ePLl = yWvV4ePLl(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int yWvV4ePLl2 = yWvV4ePLl(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (yWvV4ePLl != getScrollX() || yWvV4ePLl2 != getScrollY()) {
                super.scrollTo(yWvV4ePLl, yWvV4ePLl2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.sk5s77z6Q) {
            this.sk5s77z6Q = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        p2GzZFWt4 p2gzzfwt4 = this.NyWTwPF6V;
        if (p2gzzfwt4.dIocxURUo) {
            View view = p2gzzfwt4.tGV7Q6urW;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            mJLaJepZo.dfpT1j18n(view);
        }
        p2gzzfwt4.dIocxURUo = z;
    }

    public void setOnScrollChangeListener(mhl5lIdbQ mhl5lidbq) {
        this.i0Zug1mVk = mhl5lidbq;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.WaUP0CF08 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void sk5s77z6Q(boolean z) {
        if (z) {
            iMyQMM6Qj(2, 1);
        } else {
            this.NyWTwPF6V.oon79WMrY(1);
        }
        this.nlGCs0NZs = getScrollY();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.vPSbyrYWX(this);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.NyWTwPF6V.yWvV4ePLl(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.NyWTwPF6V.oon79WMrY(0);
    }

    @Override // con.QiVwQCcLp
    public void tGV7Q6urW(View view, int i, int i2, int[] iArr, int i3) {
        vPSbyrYWX(i, i2, iArr, null, i3);
    }

    public boolean vPSbyrYWX(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.NyWTwPF6V.tGV7Q6urW(i, i2, iArr, iArr2, i3);
    }
}
