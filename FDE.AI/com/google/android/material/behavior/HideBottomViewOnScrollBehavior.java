package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import con.vZAFqpduB;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.mhl5lIdbQ {
    public ViewPropertyAnimator tGV7Q6urW;
    public int q3BipwRCk = 0;
    public int J4Ux7ym32 = 2;

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends AnimatorListenerAdapter {
        public RG2GI7LDp() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.tGV7Q6urW = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void CBQ5d1kRq(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z = false;
        if (i2 > 0) {
            if (!(this.J4Ux7ym32 == 1)) {
                ViewPropertyAnimator viewPropertyAnimator = this.tGV7Q6urW;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.J4Ux7ym32 = 1;
                Eeka1udhb(view, this.q3BipwRCk + 0, 175, vZAFqpduB.tGV7Q6urW);
            }
        } else if (i2 < 0) {
            if (this.J4Ux7ym32 == 2) {
                z = true;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.tGV7Q6urW;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.J4Ux7ym32 = 2;
                Eeka1udhb(view, 0, 225, vZAFqpduB.dIocxURUo);
            }
        }
    }

    public final void Eeka1udhb(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.tGV7Q6urW = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new RG2GI7LDp());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean MzoOEjc4X(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.q3BipwRCk = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }
}
