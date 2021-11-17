package con;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class flYb1EqxA extends MetricAffectingSpan {
    public final /* synthetic */ int CBQ5d1kRq;
    public final float kmSgne1rO;

    public flYb1EqxA(float f, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = f;
        } else {
            this.kmSgne1rO = f;
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.CBQ5d1kRq) {
            case 0:
                textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.kmSgne1rO)));
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.kmSgne1rO);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        switch (this.CBQ5d1kRq) {
            case 0:
                textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.kmSgne1rO)));
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.kmSgne1rO);
                return;
        }
    }
}
