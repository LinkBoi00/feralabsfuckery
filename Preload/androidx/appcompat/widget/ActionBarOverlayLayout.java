package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.widget.Toolbar;
import com.feravolt.preload.R;
import con.BWdUDHRcA;
import con.C8A1BseZU;
import con.CVu4W89kR;
import con.HelDswbLq;
import con.IuQbWntsc;
import con.KMt2sB4vK;
import con.KTMDafsbu;
import con.QiVwQCcLp;
import con.Qprz6rQ4P;
import con.TLfAYfc8I;
import con.TeoeEf1aF;
import con.VCCyeOu6I;
import con.Vo8lDzQhu;
import con.abGBwSu8x;
import con.cyVJjwbRF;
import con.fPr2OzCjq;
import con.mJLaJepZo;
import con.mmX2UQLSo;
import con.o8nscdGif;
import con.p0p8kJ9iW;
import con.qTSiJXW5w;
import con.qya5U7BN8;
import con.tDC1iJlG1;
import java.util.Objects;
import java.util.WeakHashMap;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements CVu4W89kR, QiVwQCcLp, mmX2UQLSo {
    public static final int[] V9LQMKGJe = {R.attr.actionBarSize, 16842841};
    public OverScroller AqaWJg0b4;
    public ContentFrameLayout Bhmn1KIah;
    public int CBQ5d1kRq;
    public o8nscdGif CpG0imbht;
    public boolean Eeka1udhb;
    public o8nscdGif IytU16YUK;
    public KMt2sB4vK MzoOEjc4X;
    public ActionBarContainer PSTqBLTET;
    public boolean RG6kpfv3v;
    public int WaUP0CF08;
    public o8nscdGif cAwN510t2;
    public boolean dXrmkklc8;
    public Drawable ilHKhw3Yw;
    public boolean ixWaw2akD;
    public ViewPropertyAnimator mUqPm6GBh;
    public qhPEQQaQ4 nlGCs0NZs;
    public o8nscdGif qFBXIgpia;
    public boolean qVUwofr5s;
    public int sk5s77z6Q;
    public int kmSgne1rO = 0;
    public final Rect i8XZMQc6Z = new Rect();
    public final Rect dfpT1j18n = new Rect();
    public final Rect iMyQMM6Qj = new Rect();
    public final AnimatorListenerAdapter NyWTwPF6V = new RG2GI7LDp();
    public final Runnable vNtjxmzUM = new mhl5lIdbQ();
    public final Runnable i0Zug1mVk = new aXI58Y1kr();
    public final KTMDafsbu o4LF8RkoQ = new KTMDafsbu();

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends AnimatorListenerAdapter {
        public RG2GI7LDp() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mUqPm6GBh = null;
            actionBarOverlayLayout.ixWaw2akD = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mUqPm6GBh = null;
            actionBarOverlayLayout.ixWaw2akD = false;
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements Runnable {
        public aXI58Y1kr() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.yWvV4ePLl();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mUqPm6GBh = actionBarOverlayLayout.PSTqBLTET.animate().translationY((float) (-ActionBarOverlayLayout.this.PSTqBLTET.getHeight())).setListener(ActionBarOverlayLayout.this.NyWTwPF6V);
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements Runnable {
        public mhl5lIdbQ() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.yWvV4ePLl();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mUqPm6GBh = actionBarOverlayLayout.PSTqBLTET.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.NyWTwPF6V);
        }
    }

    /* loaded from: classes.dex */
    public interface qhPEQQaQ4 {
    }

    /* loaded from: classes.dex */
    public static class s7MlVynBG extends ViewGroup.MarginLayoutParams {
        public s7MlVynBG(int i, int i2) {
            super(i, i2);
        }

        public s7MlVynBG(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public s7MlVynBG(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        o8nscdGif o8nscdgif = o8nscdGif.J4Ux7ym32;
        this.cAwN510t2 = o8nscdgif;
        this.IytU16YUK = o8nscdgif;
        this.CpG0imbht = o8nscdgif;
        this.qFBXIgpia = o8nscdgif;
        vPSbyrYWX(context);
    }

    public void Bhmn1KIah() {
        KMt2sB4vK kMt2sB4vK;
        if (this.Bhmn1KIah == null) {
            this.Bhmn1KIah = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.PSTqBLTET = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof KMt2sB4vK) {
                kMt2sB4vK = (KMt2sB4vK) findViewById;
            } else if (findViewById instanceof Toolbar) {
                kMt2sB4vK = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Can't make a decor toolbar out of ");
                q3BipwRCk.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(q3BipwRCk.toString());
            }
            this.MzoOEjc4X = kMt2sB4vK;
        }
    }

    public void CBQ5d1kRq(int i) {
        Bhmn1KIah();
        if (i == 2) {
            Objects.requireNonNull((qya5U7BN8) this.MzoOEjc4X);
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            Objects.requireNonNull((qya5U7BN8) this.MzoOEjc4X);
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final boolean GPLPRo6go(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        if (!z || ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin = i4;
            z5 = true;
        }
        if (z2 && ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin != (i3 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin = i3;
            z5 = true;
        }
        if (z4 && ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin != (i2 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin = i2;
            z5 = true;
        }
        if (!z3 || ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin = i;
        return true;
    }

    @Override // con.QiVwQCcLp
    public void J4Ux7ym32(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void PSTqBLTET(Menu menu, HelDswbLq.RG2GI7LDp rG2GI7LDp) {
        tDC1iJlG1 tdc1ijlg1;
        Bhmn1KIah();
        qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.MzoOEjc4X;
        if (qya5u7bn8.Bhmn1KIah == null) {
            qya5u7bn8.Bhmn1KIah = new TeoeEf1aF(qya5u7bn8.q3BipwRCk.getContext());
        }
        TeoeEf1aF teoeEf1aF = qya5u7bn8.Bhmn1KIah;
        teoeEf1aF.MzoOEjc4X = rG2GI7LDp;
        Toolbar toolbar = qya5u7bn8.q3BipwRCk;
        androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp2 = (androidx.appcompat.view.menu.RG2GI7LDp) menu;
        if (rG2GI7LDp2 != null || toolbar.CBQ5d1kRq != null) {
            toolbar.iiGwOFFnr();
            androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp3 = toolbar.CBQ5d1kRq.iMyQMM6Qj;
            if (rG2GI7LDp3 != rG2GI7LDp2) {
                if (rG2GI7LDp3 != null) {
                    rG2GI7LDp3.dXrmkklc8(toolbar.L4EwGfXiQ);
                    rG2GI7LDp3.dXrmkklc8(toolbar.zHl31GGXU);
                }
                if (toolbar.zHl31GGXU == null) {
                    toolbar.zHl31GGXU = new Toolbar.qhPEQQaQ4();
                }
                teoeEf1aF.cAwN510t2 = true;
                if (rG2GI7LDp2 != null) {
                    rG2GI7LDp2.J4Ux7ym32(teoeEf1aF, toolbar.RG6kpfv3v);
                    rG2GI7LDp2.J4Ux7ym32(toolbar.zHl31GGXU, toolbar.RG6kpfv3v);
                } else {
                    teoeEf1aF.dIocxURUo(toolbar.RG6kpfv3v, null);
                    Toolbar.qhPEQQaQ4 qhpeqqaq4 = toolbar.zHl31GGXU;
                    androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp4 = qhpeqqaq4.CBQ5d1kRq;
                    if (!(rG2GI7LDp4 == null || (tdc1ijlg1 = qhpeqqaq4.kmSgne1rO) == null)) {
                        rG2GI7LDp4.dIocxURUo(tdc1ijlg1);
                    }
                    qhpeqqaq4.CBQ5d1kRq = null;
                    teoeEf1aF.oon79WMrY(true);
                    toolbar.zHl31GGXU.oon79WMrY(true);
                }
                toolbar.CBQ5d1kRq.setPopupTheme(toolbar.ixWaw2akD);
                toolbar.CBQ5d1kRq.setPresenter(teoeEf1aF);
                toolbar.L4EwGfXiQ = teoeEf1aF;
            }
        }
    }

    public boolean Puu3Rhg4F() {
        ActionMenuView actionMenuView;
        Bhmn1KIah();
        Toolbar toolbar = ((qya5U7BN8) this.MzoOEjc4X).q3BipwRCk;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.CBQ5d1kRq) != null && actionMenuView.CpG0imbht;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof s7MlVynBG;
    }

    @Override // con.mmX2UQLSo
    public void dIocxURUo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.ilHKhw3Yw != null && !this.qVUwofr5s) {
            if (this.PSTqBLTET.getVisibility() == 0) {
                i = (int) (this.PSTqBLTET.getTranslationY() + ((float) this.PSTqBLTET.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.ilHKhw3Yw.setBounds(0, i, getWidth(), this.ilHKhw3Yw.getIntrinsicHeight() + i);
            this.ilHKhw3Yw.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new s7MlVynBG(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s7MlVynBG(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new s7MlVynBG(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.PSTqBLTET;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.o4LF8RkoQ.q3BipwRCk();
    }

    public CharSequence getTitle() {
        Bhmn1KIah();
        return ((qya5U7BN8) this.MzoOEjc4X).q3BipwRCk.getTitle();
    }

    @Override // con.QiVwQCcLp
    public boolean iiGwOFFnr(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // con.QiVwQCcLp
    public void kCA6Zs9sL(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public boolean kmSgne1rO() {
        Bhmn1KIah();
        return ((qya5U7BN8) this.MzoOEjc4X).q3BipwRCk.PSTqBLTET();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Bhmn1KIah();
        o8nscdGif yWvV4ePLl = o8nscdGif.yWvV4ePLl(windowInsets, this);
        boolean GPLPRo6go = GPLPRo6go(this.PSTqBLTET, new Rect(yWvV4ePLl.J4Ux7ym32(), yWvV4ePLl.dIocxURUo(), yWvV4ePLl.tGV7Q6urW(), yWvV4ePLl.q3BipwRCk()), true, true, false, true);
        Rect rect = this.i8XZMQc6Z;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        mJLaJepZo.J4Ux7ym32(this, yWvV4ePLl, rect);
        Rect rect2 = this.i8XZMQc6Z;
        o8nscdGif yWvV4ePLl2 = yWvV4ePLl.q3BipwRCk.yWvV4ePLl(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.cAwN510t2 = yWvV4ePLl2;
        boolean z = true;
        if (!this.IytU16YUK.equals(yWvV4ePLl2)) {
            this.IytU16YUK = this.cAwN510t2;
            GPLPRo6go = true;
        }
        if (!this.dfpT1j18n.equals(this.i8XZMQc6Z)) {
            this.dfpT1j18n.set(this.i8XZMQc6Z);
        } else {
            z = GPLPRo6go;
        }
        if (z) {
            requestLayout();
        }
        return yWvV4ePLl.q3BipwRCk.q3BipwRCk().q3BipwRCk.tGV7Q6urW().q3BipwRCk.J4Ux7ym32().GPLPRo6go();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vPSbyrYWX(getContext());
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yWvV4ePLl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        o8nscdGif o8nscdgif;
        Bhmn1KIah();
        measureChildWithMargins(this.PSTqBLTET, i, 0, i2, 0);
        s7MlVynBG s7mlvynbg = (s7MlVynBG) this.PSTqBLTET.getLayoutParams();
        int max = Math.max(0, this.PSTqBLTET.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin);
        int max2 = Math.max(0, this.PSTqBLTET.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.PSTqBLTET.getMeasuredState());
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean z = (VCCyeOu6I.GPLPRo6go(this) & 256) != 0;
        if (z) {
            i3 = this.CBQ5d1kRq;
            if (this.dXrmkklc8 && this.PSTqBLTET.getTabContainer() != null) {
                i3 += this.CBQ5d1kRq;
            }
        } else {
            i3 = this.PSTqBLTET.getVisibility() != 8 ? this.PSTqBLTET.getMeasuredHeight() : 0;
        }
        this.iMyQMM6Qj.set(this.i8XZMQc6Z);
        o8nscdGif o8nscdgif2 = this.cAwN510t2;
        this.CpG0imbht = o8nscdgif2;
        if (this.Eeka1udhb || z) {
            BWdUDHRcA q3BipwRCk = BWdUDHRcA.q3BipwRCk(o8nscdgif2.J4Ux7ym32(), this.CpG0imbht.dIocxURUo() + i3, this.CpG0imbht.tGV7Q6urW(), this.CpG0imbht.q3BipwRCk() + 0);
            o8nscdGif o8nscdgif3 = this.CpG0imbht;
            int i4 = Build.VERSION.SDK_INT;
            fPr2OzCjq qprz6rQ4P = i4 >= 30 ? new Qprz6rQ4P(o8nscdgif3) : i4 >= 29 ? new TLfAYfc8I(o8nscdgif3) : new Vo8lDzQhu(o8nscdgif3);
            qprz6rQ4P.dIocxURUo(q3BipwRCk);
            o8nscdgif = qprz6rQ4P.J4Ux7ym32();
        } else {
            Rect rect = this.iMyQMM6Qj;
            rect.top += i3;
            rect.bottom += 0;
            o8nscdgif = o8nscdgif2.q3BipwRCk.yWvV4ePLl(0, i3, 0, 0);
        }
        this.CpG0imbht = o8nscdgif;
        GPLPRo6go(this.Bhmn1KIah, this.iMyQMM6Qj, true, true, true, true);
        if (!this.qFBXIgpia.equals(this.CpG0imbht)) {
            o8nscdGif o8nscdgif4 = this.CpG0imbht;
            this.qFBXIgpia = o8nscdgif4;
            IuQbWntsc.tGV7Q6urW(this.Bhmn1KIah, o8nscdgif4);
        }
        measureChildWithMargins(this.Bhmn1KIah, i, 0, i2, 0);
        s7MlVynBG s7mlvynbg2 = (s7MlVynBG) this.Bhmn1KIah.getLayoutParams();
        int max3 = Math.max(max, this.Bhmn1KIah.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) s7mlvynbg2).leftMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg2).rightMargin);
        int max4 = Math.max(max2, this.Bhmn1KIah.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s7mlvynbg2).topMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.Bhmn1KIah.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.RG6kpfv3v || !z) {
            return false;
        }
        this.AqaWJg0b4.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.AqaWJg0b4.getFinalY() > this.PSTqBLTET.getHeight()) {
            z2 = true;
        }
        if (z2) {
            yWvV4ePLl();
            this.i0Zug1mVk.run();
        } else {
            yWvV4ePLl();
            this.vNtjxmzUM.run();
        }
        this.ixWaw2akD = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.sk5s77z6Q + i2;
        this.sk5s77z6Q = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        qTSiJXW5w qtsijxw5w;
        p0p8kJ9iW p0p8kj9iw;
        this.o4LF8RkoQ.q3BipwRCk = i;
        this.sk5s77z6Q = getActionBarHideOffset();
        yWvV4ePLl();
        qhPEQQaQ4 qhpeqqaq4 = this.nlGCs0NZs;
        if (qhpeqqaq4 != null && (p0p8kj9iw = (qtsijxw5w = (qTSiJXW5w) qhpeqqaq4).dXrmkklc8) != null) {
            p0p8kj9iw.q3BipwRCk();
            qtsijxw5w.dXrmkklc8 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.PSTqBLTET.getVisibility() != 0) {
            return false;
        }
        return this.RG6kpfv3v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.RG6kpfv3v && !this.ixWaw2akD) {
            if (this.sk5s77z6Q <= this.PSTqBLTET.getHeight()) {
                yWvV4ePLl();
                postDelayed(this.vNtjxmzUM, 600);
            } else {
                yWvV4ePLl();
                postDelayed(this.i0Zug1mVk, 600);
            }
        }
        qhPEQQaQ4 qhpeqqaq4 = this.nlGCs0NZs;
        if (qhpeqqaq4 != null) {
            Objects.requireNonNull(qhpeqqaq4);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        Bhmn1KIah();
        int i2 = this.WaUP0CF08 ^ i;
        this.WaUP0CF08 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        qhPEQQaQ4 qhpeqqaq4 = this.nlGCs0NZs;
        if (qhpeqqaq4 != null) {
            ((qTSiJXW5w) qhpeqqaq4).MzoOEjc4X = !z2;
            if (z || !z2) {
                qTSiJXW5w qtsijxw5w = (qTSiJXW5w) qhpeqqaq4;
                if (qtsijxw5w.ilHKhw3Yw) {
                    qtsijxw5w.ilHKhw3Yw = false;
                    qtsijxw5w.Puu3Rhg4F(true);
                }
            } else {
                qTSiJXW5w qtsijxw5w2 = (qTSiJXW5w) qhpeqqaq4;
                if (!qtsijxw5w2.ilHKhw3Yw) {
                    qtsijxw5w2.ilHKhw3Yw = true;
                    qtsijxw5w2.Puu3Rhg4F(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.nlGCs0NZs != null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            cyVJjwbRF.tGV7Q6urW(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.kmSgne1rO = i;
        qhPEQQaQ4 qhpeqqaq4 = this.nlGCs0NZs;
        if (qhpeqqaq4 != null) {
            ((qTSiJXW5w) qhpeqqaq4).PSTqBLTET = i;
        }
    }

    public boolean oon79WMrY() {
        Bhmn1KIah();
        ActionMenuView actionMenuView = ((qya5U7BN8) this.MzoOEjc4X).q3BipwRCk.CBQ5d1kRq;
        if (actionMenuView != null) {
            TeoeEf1aF teoeEf1aF = actionMenuView.qFBXIgpia;
            if (teoeEf1aF != null && teoeEf1aF.vPSbyrYWX()) {
                return true;
            }
        }
        return false;
    }

    @Override // con.QiVwQCcLp
    public void q3BipwRCk(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void setActionBarHideOffset(int i) {
        yWvV4ePLl();
        this.PSTqBLTET.setTranslationY((float) (-Math.max(0, Math.min(i, this.PSTqBLTET.getHeight()))));
    }

    public void setActionBarVisibilityCallback(qhPEQQaQ4 qhpeqqaq4) {
        this.nlGCs0NZs = qhpeqqaq4;
        if (getWindowToken() != null) {
            ((qTSiJXW5w) this.nlGCs0NZs).PSTqBLTET = this.kmSgne1rO;
            int i = this.WaUP0CF08;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                cyVJjwbRF.tGV7Q6urW(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.dXrmkklc8 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.RG6kpfv3v) {
            this.RG6kpfv3v = z;
            if (!z) {
                yWvV4ePLl();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        Bhmn1KIah();
        qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.MzoOEjc4X;
        qya5u7bn8.kCA6Zs9sL = i != 0 ? C8A1BseZU.q3BipwRCk(qya5u7bn8.q3BipwRCk(), i) : null;
        qya5u7bn8.iiGwOFFnr();
    }

    public void setLogo(int i) {
        Bhmn1KIah();
        qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.MzoOEjc4X;
        qya5u7bn8.iiGwOFFnr = i != 0 ? C8A1BseZU.q3BipwRCk(qya5u7bn8.q3BipwRCk(), i) : null;
        qya5u7bn8.iiGwOFFnr();
    }

    public void setOverlayMode(boolean z) {
        this.Eeka1udhb = z;
        this.qVUwofr5s = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // con.CVu4W89kR
    public void setWindowCallback(Window.Callback callback) {
        Bhmn1KIah();
        ((qya5U7BN8) this.MzoOEjc4X).CBQ5d1kRq = callback;
    }

    @Override // con.CVu4W89kR
    public void setWindowTitle(CharSequence charSequence) {
        Bhmn1KIah();
        qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.MzoOEjc4X;
        if (!qya5u7bn8.Puu3Rhg4F) {
            qya5u7bn8.yWvV4ePLl = charSequence;
            if ((qya5u7bn8.J4Ux7ym32 & 8) != 0) {
                qya5u7bn8.q3BipwRCk.setTitle(charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // con.QiVwQCcLp
    public void tGV7Q6urW(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final void vPSbyrYWX(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(V9LQMKGJe);
        boolean z = false;
        this.CBQ5d1kRq = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.ilHKhw3Yw = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.qVUwofr5s = z;
        this.AqaWJg0b4 = new OverScroller(context);
    }

    public void yWvV4ePLl() {
        removeCallbacks(this.vNtjxmzUM);
        removeCallbacks(this.i0Zug1mVk);
        ViewPropertyAnimator viewPropertyAnimator = this.mUqPm6GBh;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setIcon(Drawable drawable) {
        Bhmn1KIah();
        qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.MzoOEjc4X;
        qya5u7bn8.kCA6Zs9sL = drawable;
        qya5u7bn8.iiGwOFFnr();
    }
}
