package con;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public final class Jyq4OzKdy extends MetricAffectingSpan {
    public final /* synthetic */ int CBQ5d1kRq = 1;
    public final Object kmSgne1rO;

    public Jyq4OzKdy(Typeface typeface) {
        this.kmSgne1rO = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.CBQ5d1kRq) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.kmSgne1rO);
                return;
            default:
                textPaint.setTypeface((Typeface) this.kmSgne1rO);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        switch (this.CBQ5d1kRq) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.kmSgne1rO);
                return;
            default:
                textPaint.setTypeface((Typeface) this.kmSgne1rO);
                return;
        }
    }

    public Jyq4OzKdy(String str) {
        this.kmSgne1rO = str;
    }
}
