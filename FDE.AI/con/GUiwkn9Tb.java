package con;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.RG2GI7LDp;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class GUiwkn9Tb extends FrameLayout {
    public View.OnApplyWindowInsetsListener Bhmn1KIah;
    public ArrayList CBQ5d1kRq;
    public boolean PSTqBLTET = true;
    public ArrayList kmSgne1rO;

    public GUiwkn9Tb(Context context, AttributeSet attributeSet, fVMSvDhE6 fvmsvdhe6) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mrcVSuHp9.J4Ux7ym32);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        UxHHqhbTP vNtjxmzUM = fvmsvdhe6.vNtjxmzUM(id);
        if (classAttribute != null && vNtjxmzUM == null) {
            if (id <= 0) {
                throw new IllegalStateException(M5g57XBLr.q3BipwRCk("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? UexvVay3o.q3BipwRCk(" with tag ", string) : ""));
            }
            qKDOZuDet igRQEZxnW = fvmsvdhe6.igRQEZxnW();
            context.getClassLoader();
            UxHHqhbTP q3BipwRCk = igRQEZxnW.q3BipwRCk(classAttribute);
            q3BipwRCk.i0Zug1mVk(context, attributeSet, null);
            xkmNtxX26 xkmntxx26 = new xkmNtxX26(fvmsvdhe6);
            xkmntxx26.PSTqBLTET = true;
            q3BipwRCk.igRQEZxnW = this;
            xkmntxx26.kCA6Zs9sL(getId(), q3BipwRCk, string, 1);
            if (!xkmntxx26.GPLPRo6go) {
                xkmntxx26.MzoOEjc4X.nlGCs0NZs(xkmntxx26, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = ((ArrayList) fvmsvdhe6.tGV7Q6urW.yWvV4ePLl()).iterator();
        while (it.hasNext()) {
            RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) it.next();
            UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
            if (uxHHqhbTP.mUqPm6GBh == getId() && (view = uxHHqhbTP.EBQXiIPmm) != null && view.getParent() == null) {
                uxHHqhbTP.igRQEZxnW = this;
                rG2GI7LDp.J4Ux7ym32();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof UxHHqhbTP ? (UxHHqhbTP) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof UxHHqhbTP ? (UxHHqhbTP) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.View, android.view.ViewGroup
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        o8nscdGif yWvV4ePLl = o8nscdGif.yWvV4ePLl(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.Bhmn1KIah;
        o8nscdGif Puu3Rhg4F = onApplyWindowInsetsListener != null ? o8nscdGif.Puu3Rhg4F(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : IuQbWntsc.vPSbyrYWX(this, yWvV4ePLl);
        if (!Puu3Rhg4F.iiGwOFFnr()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                IuQbWntsc.tGV7Q6urW(getChildAt(i), Puu3Rhg4F);
            }
        }
        return windowInsets;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        if (this.PSTqBLTET && this.CBQ5d1kRq != null) {
            for (int i = 0; i < this.CBQ5d1kRq.size(); i++) {
                super.drawChild(canvas, (View) this.CBQ5d1kRq.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.PSTqBLTET || (arrayList = this.CBQ5d1kRq) == null || arrayList.size() <= 0 || !this.CBQ5d1kRq.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.kmSgne1rO;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.CBQ5d1kRq;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.PSTqBLTET = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final void q3BipwRCk(View view) {
        ArrayList arrayList = this.kmSgne1rO;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.CBQ5d1kRq == null) {
                this.CBQ5d1kRq = new ArrayList();
            }
            this.CBQ5d1kRq.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            q3BipwRCk(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            q3BipwRCk(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        q3BipwRCk(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        q3BipwRCk(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        q3BipwRCk(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            q3BipwRCk(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            q3BipwRCk(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.PSTqBLTET = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.Bhmn1KIah = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.kmSgne1rO == null) {
                this.kmSgne1rO = new ArrayList();
            }
            this.kmSgne1rO.add(view);
        }
        super.startViewTransition(view);
    }
}
