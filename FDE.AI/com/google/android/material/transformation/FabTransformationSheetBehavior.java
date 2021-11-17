package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.feravolt.preload.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import con.IuQbWntsc;
import con.VCCyeOu6I;
import con.Yg5AJdYv8;
import con.uBm0YsOoA;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map yWvV4ePLl;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean dXrmkklc8(View view, View view2, boolean z, boolean z2) {
        int i;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.yWvV4ePLl = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.s7MlVynBG) && (((CoordinatorLayout.s7MlVynBG) childAt.getLayoutParams()).q3BipwRCk instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    Map map = this.yWvV4ePLl;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i = ((Integer) this.yWvV4ePLl.get(childAt)).intValue();
                    }
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    VCCyeOu6I.Eeka1udhb(childAt, i);
                }
            }
            if (!z) {
                this.yWvV4ePLl = null;
            }
        }
        super.dXrmkklc8(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.mhl5lIdbQ iMyQMM6Qj(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.mhl5lIdbQ mhl5lidbq = new FabTransformationBehavior.mhl5lIdbQ();
        mhl5lidbq.q3BipwRCk = Yg5AJdYv8.J4Ux7ym32(context, i);
        mhl5lidbq.J4Ux7ym32 = new uBm0YsOoA(17, 0.0f, 0.0f);
        return mhl5lidbq;
    }
}
