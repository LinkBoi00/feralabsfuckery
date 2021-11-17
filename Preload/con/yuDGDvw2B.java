package con;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* loaded from: classes.dex */
public final class yuDGDvw2B implements LineHeightSpan {
    public final int CBQ5d1kRq;

    public yuDGDvw2B(int i) {
        this.CBQ5d1kRq = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 > 0) {
            int ceil = (int) Math.ceil(((double) i5) * ((double) ((((float) this.CBQ5d1kRq) * 1.0f) / ((float) i6))));
            fontMetricsInt.descent = ceil;
            fontMetricsInt.ascent = ceil - this.CBQ5d1kRq;
        }
    }
}
