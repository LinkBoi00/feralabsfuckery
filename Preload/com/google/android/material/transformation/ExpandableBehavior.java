package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import con.GGzmzHVt9;
import con.IuQbWntsc;
import con.mN6fklC4R;
import java.util.List;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.mhl5lIdbQ {
    public int q3BipwRCk = 0;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ GGzmzHVt9 Bhmn1KIah;
        public final /* synthetic */ View CBQ5d1kRq;
        public final /* synthetic */ int kmSgne1rO;

        public RG2GI7LDp(View view, int i, GGzmzHVt9 gGzmzHVt9) {
            this.CBQ5d1kRq = view;
            this.kmSgne1rO = i;
            this.Bhmn1KIah = gGzmzHVt9;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.CBQ5d1kRq.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.q3BipwRCk == this.kmSgne1rO) {
                GGzmzHVt9 gGzmzHVt9 = this.Bhmn1KIah;
                expandableBehavior.dXrmkklc8((View) gGzmzHVt9, this.CBQ5d1kRq, gGzmzHVt9.q3BipwRCk(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean Eeka1udhb(boolean z) {
        if (!z) {
            return this.q3BipwRCk == 1;
        }
        int i = this.q3BipwRCk;
        return i == 0 || i == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
        GGzmzHVt9 gGzmzHVt9;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (!mN6fklC4R.tGV7Q6urW(view)) {
            List oon79WMrY = coordinatorLayout.oon79WMrY(view);
            int size = oon79WMrY.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    gGzmzHVt9 = null;
                    break;
                }
                View view2 = (View) oon79WMrY.get(i2);
                if (J4Ux7ym32(coordinatorLayout, view, view2)) {
                    gGzmzHVt9 = (GGzmzHVt9) view2;
                    break;
                }
                i2++;
            }
            if (gGzmzHVt9 != null && Eeka1udhb(gGzmzHVt9.q3BipwRCk())) {
                int i3 = gGzmzHVt9.q3BipwRCk() ? 1 : 2;
                this.q3BipwRCk = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new RG2GI7LDp(view, i3, gGzmzHVt9));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean dIocxURUo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        GGzmzHVt9 gGzmzHVt9 = (GGzmzHVt9) view2;
        if (!Eeka1udhb(gGzmzHVt9.q3BipwRCk())) {
            return false;
        }
        this.q3BipwRCk = gGzmzHVt9.q3BipwRCk() ? 1 : 2;
        return dXrmkklc8((View) gGzmzHVt9, view, gGzmzHVt9.q3BipwRCk(), true);
    }

    public abstract boolean dXrmkklc8(View view, View view2, boolean z, boolean z2);
}
