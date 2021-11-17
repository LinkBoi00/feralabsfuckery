package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import con.K6PL0z3I0;
import con.RisoK3egD;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends CoordinatorLayout.mhl5lIdbQ {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.GPLPRo6go);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
        K6PL0z3I0.q3BipwRCk(view);
        List oon79WMrY = coordinatorLayout.oon79WMrY(null);
        int size = oon79WMrY.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewGroup.LayoutParams layoutParams = ((View) oon79WMrY.get(i2)).getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.s7MlVynBG ? ((CoordinatorLayout.s7MlVynBG) layoutParams).q3BipwRCk instanceof BottomSheetBehavior : false) {
                throw null;
            }
        }
        coordinatorLayout.ilHKhw3Yw(null, i);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean dIocxURUo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        K6PL0z3I0.q3BipwRCk(view);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.s7MlVynBG ? ((CoordinatorLayout.s7MlVynBG) layoutParams).q3BipwRCk instanceof BottomSheetBehavior : false)) {
            return false;
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean q3BipwRCk(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        K6PL0z3I0.q3BipwRCk(view);
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void tGV7Q6urW(CoordinatorLayout.s7MlVynBG s7mlvynbg) {
        if (s7mlvynbg.Puu3Rhg4F == 0) {
            s7mlvynbg.Puu3Rhg4F = 80;
        }
    }
}
