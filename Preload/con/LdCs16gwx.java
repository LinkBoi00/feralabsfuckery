package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class LdCs16gwx extends ViewGroup {
    public final HashMap CBQ5d1kRq = new HashMap();
    public final HashMap kmSgne1rO = new HashMap();

    public LdCs16gwx(Context context) {
        super(context);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, pLYbCSTk0> getHolderToLayoutNode() {
        return this.CBQ5d1kRq;
    }

    public final HashMap<pLYbCSTk0, Object> getLayoutNodeToHolder() {
        return this.kmSgne1rO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator it = this.CBQ5d1kRq.keySet().iterator();
        if (it.hasNext()) {
            K6PL0z3I0.q3BipwRCk(it.next());
            throw null;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z = false;
            }
            if (z) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Iterator it = this.CBQ5d1kRq.keySet().iterator();
                if (it.hasNext()) {
                    K6PL0z3I0.q3BipwRCk(it.next());
                    Objects.requireNonNull(null);
                    throw null;
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.ViewParent, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                pLYbCSTk0 plybcstk0 = (pLYbCSTk0) this.CBQ5d1kRq.get(childAt);
                if (childAt.isLayoutRequested() && plybcstk0 != null) {
                    plybcstk0.nlGCs0NZs();
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
