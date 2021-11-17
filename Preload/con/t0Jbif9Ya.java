package con;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class t0Jbif9Ya implements Sq43ZrsXU {
    public final /* synthetic */ SwipeDismissBehavior q3BipwRCk;

    public t0Jbif9Ya(SwipeDismissBehavior swipeDismissBehavior) {
        this.q3BipwRCk = swipeDismissBehavior;
    }

    @Override // con.Sq43ZrsXU
    public boolean q3BipwRCk(View view, WJBV20Gd3 wJBV20Gd3) {
        boolean z = false;
        if (!this.q3BipwRCk.Eeka1udhb(view)) {
            return false;
        }
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean z2 = RBJDIwG1D.dIocxURUo(view) == 1;
        int i = this.q3BipwRCk.tGV7Q6urW;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.q3BipwRCk);
        return true;
    }
}
