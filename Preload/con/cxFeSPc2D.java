package con;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class cxFeSPc2D extends SeekBar {
    public final BMpU57nZC CBQ5d1kRq;

    public cxFeSPc2D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        BMpU57nZC bMpU57nZC = new BMpU57nZC(this);
        this.CBQ5d1kRq = bMpU57nZC;
        bMpU57nZC.q3BipwRCk(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        BMpU57nZC bMpU57nZC = this.CBQ5d1kRq;
        Drawable drawable = bMpU57nZC.kCA6Zs9sL;
        if (drawable != null && drawable.isStateful() && drawable.setState(bMpU57nZC.dIocxURUo.getDrawableState())) {
            bMpU57nZC.dIocxURUo.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.CBQ5d1kRq.kCA6Zs9sL;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.CBQ5d1kRq.dIocxURUo(canvas);
    }
}
