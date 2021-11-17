package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class og3FNDLcb extends ImageView {
    public Animation.AnimationListener CBQ5d1kRq;
    public int kmSgne1rO;

    public og3FNDLcb(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(dIPZdWx6Q.q3BipwRCk);
        this.kmSgne1rO = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        mJLaJepZo.Eeka1udhb(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.kmSgne1rO);
        VCCyeOu6I.ilHKhw3Yw(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.CBQ5d1kRq;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.CBQ5d1kRq;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.kmSgne1rO = i;
        }
    }
}
