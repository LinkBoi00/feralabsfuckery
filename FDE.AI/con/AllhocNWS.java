package con;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class AllhocNWS {
    public static final ViewGroup.LayoutParams q3BipwRCk = new ViewGroup.LayoutParams(-2, -2);

    public static void q3BipwRCk(ComponentActivity componentActivity, z3ICU5k15 z3icu5k15, kkcQgCx5G kkcqgcx5g, int i) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        qFajNU5jN qfajnu5jn = childAt instanceof qFajNU5jN ? (qFajNU5jN) childAt : null;
        if (qfajnu5jn != null) {
            qfajnu5jn.setParentCompositionContext(null);
            qfajnu5jn.setContent(kkcqgcx5g);
            return;
        }
        qFajNU5jN qfajnu5jn2 = new qFajNU5jN(componentActivity, null, 0, 6);
        qfajnu5jn2.setParentCompositionContext(null);
        qfajnu5jn2.setContent(kkcqgcx5g);
        View decorView = componentActivity.getWindow().getDecorView();
        if (pA5wCkne4.yWvV4ePLl(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (D3DEikrvb.oon79WMrY(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (pA5wCkne4.oon79WMrY(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(qfajnu5jn2, q3BipwRCk);
    }
}
