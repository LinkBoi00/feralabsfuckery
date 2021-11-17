package con;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class TUluWcWHA extends RatingBar {
    public final bLi3v8XK4 CBQ5d1kRq;

    public TUluWcWHA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        bLi3v8XK4 bli3v8xk4 = new bLi3v8XK4(this);
        this.CBQ5d1kRq = bli3v8xk4;
        bli3v8xk4.q3BipwRCk(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.CBQ5d1kRq.J4Ux7ym32;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
