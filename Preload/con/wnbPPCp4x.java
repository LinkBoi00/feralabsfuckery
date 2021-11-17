package con;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;
import androidx.compose.ui.platform.s7MlVynBG;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class wnbPPCp4x extends ViewGroup {
    public v0l3RHDWl Bhmn1KIah;
    public WeakReference CBQ5d1kRq;
    public gdEmqfwpT MzoOEjc4X;
    public z3ICU5k15 PSTqBLTET;
    public boolean ilHKhw3Yw;
    public IBinder kmSgne1rO;
    public boolean qVUwofr5s;

    public wnbPPCp4x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        mYYIIpcht myyiipcht = new mYYIIpcht(this);
        addOnAttachStateChangeListener(myyiipcht);
        this.MzoOEjc4X = new kuvj6DyFF(this, myyiipcht);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(z3ICU5k15 z3icu5k15) {
        if (this.PSTqBLTET != z3icu5k15) {
            this.PSTqBLTET = z3icu5k15;
            if (z3icu5k15 != null) {
                this.CBQ5d1kRq = null;
            }
            v0l3RHDWl v0l3rhdwl = this.Bhmn1KIah;
            if (v0l3rhdwl != null) {
                v0l3rhdwl.q3BipwRCk();
                this.Bhmn1KIah = null;
                if (isAttachedToWindow()) {
                    dIocxURUo();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.kmSgne1rO != iBinder) {
            this.kmSgne1rO = iBinder;
            this.CBQ5d1kRq = null;
        }
    }

    public final boolean GPLPRo6go(z3ICU5k15 z3icu5k15) {
        return !(z3icu5k15 instanceof rQamjxEL9) || ((XUuUfkdDV) ((I5LF8ecws) ((rQamjxEL9) z3icu5k15).kmSgne1rO).Puu3Rhg4F()).compareTo(XUuUfkdDV.ShuttingDown) > 0;
    }

    public final z3ICU5k15 J4Ux7ym32(z3ICU5k15 z3icu5k15) {
        z3ICU5k15 z3icu5k152 = GPLPRo6go(z3icu5k15) ? z3icu5k15 : null;
        if (z3icu5k152 != null) {
            this.CBQ5d1kRq = new WeakReference(z3icu5k152);
        }
        return z3icu5k15;
    }

    public final z3ICU5k15 Puu3Rhg4F() {
        bu5cjmae6 bu5cjmae6;
        Lkusa3sxO lkusa3sxO;
        z3ICU5k15 z3icu5k15 = this.PSTqBLTET;
        if (z3icu5k15 == null) {
            z3icu5k15 = prIU0SrzN.q3BipwRCk(this);
            if (z3icu5k15 == null) {
                ViewParent parent = getParent();
                while (z3icu5k15 == null && (parent instanceof View)) {
                    z3icu5k15 = prIU0SrzN.q3BipwRCk((View) parent);
                    parent = parent.getParent();
                }
            }
            if (z3icu5k15 == null) {
                WeakReference weakReference = this.CBQ5d1kRq;
                if (weakReference == null || (z3icu5k15 = (z3ICU5k15) weakReference.get()) == null || !GPLPRo6go(z3icu5k15)) {
                    z3icu5k15 = null;
                }
                if (z3icu5k15 == null) {
                    if (isAttachedToWindow()) {
                        ViewParent parent2 = getParent();
                        View view = this;
                        while (parent2 instanceof View) {
                            View view2 = (View) parent2;
                            if (view2.getId() == 16908290) {
                                break;
                            }
                            parent2 = view2.getParent();
                            view = view2;
                        }
                        z3ICU5k15 q3BipwRCk = prIU0SrzN.q3BipwRCk(view);
                        if (q3BipwRCk == null) {
                            qTH4sqxtL qth4sqxtl = qTH4sqxtL.q3BipwRCk;
                            Objects.requireNonNull((TwoQw5CVC) ((YqzHGe1Ie) qTH4sqxtL.J4Ux7ym32.get()));
                            ksLrMHgEz kslrmhgez = J7YsuEuPq.sk5s77z6Q;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                bu5cjmae6 = (bu5cjmae6) ((Ka0YY9gOW) J7YsuEuPq.WaUP0CF08).getValue();
                            } else {
                                bu5cjmae6 = (bu5cjmae6) J7YsuEuPq.i8XZMQc6Z.get();
                                if (bu5cjmae6 == null) {
                                    throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                                }
                            }
                            Kh7ffW4RH kh7ffW4RH = (Kh7ffW4RH) bu5cjmae6.get(LQcLPKzab.CBQ5d1kRq);
                            if (kh7ffW4RH == null) {
                                lkusa3sxO = null;
                            } else {
                                lkusa3sxO = new Lkusa3sxO(kh7ffW4RH);
                                gknx5HUb7 gknx5hub7 = lkusa3sxO.kmSgne1rO;
                                synchronized (gknx5hub7.J4Ux7ym32) {
                                    gknx5hub7.kCA6Zs9sL = false;
                                }
                            }
                            bu5cjmae6 plus = bu5cjmae6.plus(lkusa3sxO == null ? HbUTGjFCZ.CBQ5d1kRq : lkusa3sxO);
                            rQamjxEL9 rqamjxel9 = new rQamjxEL9(plus);
                            oQkvjGXIr q3BipwRCk2 = D3DEikrvb.q3BipwRCk(plus);
                            BgHiMFrEI yWvV4ePLl = pA5wCkne4.yWvV4ePLl(view);
                            if (yWvV4ePLl != null) {
                                view.addOnAttachStateChangeListener(new Sme6YJlaf(view, rqamjxel9));
                                yWvV4ePLl.GPLPRo6go().q3BipwRCk(new WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2(q3BipwRCk2, lkusa3sxO, rqamjxel9));
                                view.setTag(R.id.androidx_compose_ui_view_composition_context, rqamjxel9);
                                d7XzTBPej d7xztbpej = d7XzTBPej.CBQ5d1kRq;
                                Handler handler = view.getHandler();
                                int i = B5Lo9xvrs.q3BipwRCk;
                                view.addOnAttachStateChangeListener(new mYYIIpcht(idpM54xlp.RG6kpfv3v(d7xztbpej, new VWNUggT0w(handler, "windowRecomposer cleanup", false).MzoOEjc4X, 0, new aZDBn26BU(rqamjxel9, view, null), 2, null)));
                                z3icu5k15 = rqamjxel9;
                            } else {
                                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("ViewTreeLifecycleOwner not found from ", view).toString());
                            }
                        } else if (q3BipwRCk instanceof rQamjxEL9) {
                            z3icu5k15 = (rQamjxEL9) q3BipwRCk;
                        } else {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                    } else {
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                }
            }
            J4Ux7ym32(z3icu5k15);
        }
        return z3icu5k15;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        tGV7Q6urW();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        tGV7Q6urW();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        tGV7Q6urW();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        tGV7Q6urW();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        tGV7Q6urW();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        tGV7Q6urW();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        tGV7Q6urW();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void dIocxURUo() {
        if (this.Bhmn1KIah == null) {
            try {
                this.qVUwofr5s = true;
                this.Bhmn1KIah = s7MlVynBG.q3BipwRCk(this, Puu3Rhg4F(), xpuSUT7Gh.nlGCs0NZs(-985539750, true, new MAZDnzQe5(this)));
            } finally {
                this.qVUwofr5s = false;
            }
        }
    }

    public final boolean getHasComposition() {
        return this.Bhmn1KIah != null;
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    public final boolean getShowLayoutBounds() {
        return this.ilHKhw3Yw;
    }

    public void iiGwOFFnr(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public void kCA6Zs9sL(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            dIocxURUo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        kCA6Zs9sL(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        dIocxURUo();
        iiGwOFFnr(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public abstract void q3BipwRCk(rJ0s9PfCL rj0s9pfcl, int i);

    public final void setParentCompositionContext(z3ICU5k15 z3icu5k15) {
        setParentContext(z3icu5k15);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.ilHKhw3Yw = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((jRWr6Yc4S) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(qRkgsGKoD qrkgsgkod) {
        gdEmqfwpT gdemqfwpt = this.MzoOEjc4X;
        if (gdemqfwpt != null) {
            gdemqfwpt.GPLPRo6go();
        }
        mYYIIpcht myyiipcht = new mYYIIpcht(this);
        addOnAttachStateChangeListener(myyiipcht);
        this.MzoOEjc4X = new kuvj6DyFF(this, myyiipcht);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void tGV7Q6urW() {
        if (!this.qVUwofr5s) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Cannot add views to ");
            q3BipwRCk.append((Object) getClass().getSimpleName());
            q3BipwRCk.append("; only Compose content is supported");
            throw new UnsupportedOperationException(q3BipwRCk.toString());
        }
    }
}
