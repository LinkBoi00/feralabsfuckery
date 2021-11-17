package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import con.anXlDk6fV;
import con.cTam6szPC;
import java.util.ArrayList;
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final cTam6szPC tGV7Q6urW = new cTam6szPC(75, 150);
    public final cTam6szPC dIocxURUo = new cTam6szPC(0, 150);

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends AnimatorListenerAdapter {
        public final /* synthetic */ View J4Ux7ym32;
        public final /* synthetic */ boolean q3BipwRCk;

        public RG2GI7LDp(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.q3BipwRCk = z;
            this.J4Ux7ym32 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.q3BipwRCk) {
                this.J4Ux7ym32.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.q3BipwRCk) {
                this.J4Ux7ym32.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet RG6kpfv3v(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        cTam6szPC ctam6szpc = z ? this.tGV7Q6urW : this.dIocxURUo;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        ctam6szpc.q3BipwRCk(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        anXlDk6fV.i8XZMQc6Z(animatorSet, arrayList);
        animatorSet.addListener(new RG2GI7LDp(this, z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean qVUwofr5s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}
