package con;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* loaded from: classes.dex */
public class ilS92Fi6U extends Animation {
    public final /* synthetic */ SwipeRefreshLayout CBQ5d1kRq;

    public ilS92Fi6U(SwipeRefreshLayout swipeRefreshLayout) {
        this.CBQ5d1kRq = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.CBQ5d1kRq.setAnimationProgress(f);
    }
}
