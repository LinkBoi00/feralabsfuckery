package con;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes.dex */
public class vya5QgxbR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior q3BipwRCk;

    public vya5QgxbR(BottomSheetBehavior bottomSheetBehavior) {
        this.q3BipwRCk = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dOSsQaJVg dossqajvg = this.q3BipwRCk.yWvV4ePLl;
        if (dossqajvg != null) {
            dossqajvg.ilHKhw3Yw(floatValue);
        }
    }
}
