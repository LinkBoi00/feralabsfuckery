package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet J4Ux7ym32;

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends AnimatorListenerAdapter {
        public RG2GI7LDp() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.J4Ux7ym32 = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract AnimatorSet RG6kpfv3v(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean dXrmkklc8(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.J4Ux7ym32;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet RG6kpfv3v = RG6kpfv3v(view, view2, z, z3);
        this.J4Ux7ym32 = RG6kpfv3v;
        RG6kpfv3v.addListener(new RG2GI7LDp());
        this.J4Ux7ym32.start();
        if (!z2) {
            this.J4Ux7ym32.end();
        }
        return true;
    }
}
