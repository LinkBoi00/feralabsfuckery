package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import con.K6PL0z3I0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {
    public static final /* synthetic */ int IzM1cD9ly = 0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect dIocxURUo = new Rect();
        public WeakReference kCA6Zs9sL;

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean MzoOEjc4X(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            K6PL0z3I0.q3BipwRCk(view);
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
            K6PL0z3I0.q3BipwRCk(view);
            this.kCA6Zs9sL = new WeakReference(null);
            int i2 = BottomAppBar.IzM1cD9ly;
            throw null;
        }
    }
}
