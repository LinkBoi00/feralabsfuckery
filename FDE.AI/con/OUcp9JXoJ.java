package con;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public final class OUcp9JXoJ extends MetricAffectingSpan {
    public final float CBQ5d1kRq;

    public OUcp9JXoJ(float f) {
        this.CBQ5d1kRq = f;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.CBQ5d1kRq);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.CBQ5d1kRq);
    }
}
