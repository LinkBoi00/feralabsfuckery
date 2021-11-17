package con;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public final class CKs4YWklF extends MetricAffectingSpan {
    public final float CBQ5d1kRq;

    public CKs4YWklF(float f) {
        this.CBQ5d1kRq = f;
    }

    public final void q3BipwRCk(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (!(textScaleX == 0.0f)) {
            textPaint.setLetterSpacing(this.CBQ5d1kRq / textScaleX);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        q3BipwRCk(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        q3BipwRCk(textPaint);
    }
}
