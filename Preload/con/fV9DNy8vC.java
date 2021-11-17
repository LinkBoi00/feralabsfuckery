package con;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public final class fV9DNy8vC extends ReplacementSpan {
    public final float Bhmn1KIah;
    public final float CBQ5d1kRq;
    public int Eeka1udhb;
    public final float MzoOEjc4X;
    public final int PSTqBLTET;
    public boolean RG6kpfv3v;
    public int dXrmkklc8;
    public final int ilHKhw3Yw;
    public final int kmSgne1rO;
    public Paint.FontMetricsInt qVUwofr5s;

    public final int J4Ux7ym32() {
        if (this.RG6kpfv3v) {
            return this.dXrmkklc8;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        int i3;
        int i4;
        this.RG6kpfv3v = true;
        float textSize = paint.getTextSize();
        this.qVUwofr5s = paint.getFontMetricsInt();
        if (q3BipwRCk().descent > q3BipwRCk().ascent) {
            int i5 = this.kmSgne1rO;
            if (i5 == 0) {
                f = this.CBQ5d1kRq * this.MzoOEjc4X;
            } else if (i5 == 1) {
                f = this.CBQ5d1kRq * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.Eeka1udhb = pA5wCkne4.q3BipwRCk(f);
            int i6 = this.PSTqBLTET;
            if (i6 == 0) {
                f2 = this.Bhmn1KIah * this.MzoOEjc4X;
            } else if (i6 == 1) {
                f2 = this.Bhmn1KIah * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.dXrmkklc8 = pA5wCkne4.q3BipwRCk(f2);
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = q3BipwRCk().ascent;
                fontMetricsInt.descent = q3BipwRCk().descent;
                fontMetricsInt.leading = q3BipwRCk().leading;
                switch (this.ilHKhw3Yw) {
                    case 0:
                        if (fontMetricsInt.ascent > (-J4Ux7ym32())) {
                            i3 = -J4Ux7ym32();
                            fontMetricsInt.ascent = i3;
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (J4Ux7ym32() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                            i4 = fontMetricsInt.ascent;
                            fontMetricsInt.descent = J4Ux7ym32() + i4;
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - J4Ux7ym32()) {
                            i3 = fontMetricsInt.descent - J4Ux7ym32();
                            fontMetricsInt.ascent = i3;
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < J4Ux7ym32()) {
                            i4 = fontMetricsInt.ascent - ((J4Ux7ym32() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = i4;
                            fontMetricsInt.descent = J4Ux7ym32() + i4;
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(q3BipwRCk().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(q3BipwRCk().bottom, fontMetricsInt.descent);
            }
            return tGV7Q6urW();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }

    public final Paint.FontMetricsInt q3BipwRCk() {
        Paint.FontMetricsInt fontMetricsInt = this.qVUwofr5s;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        return null;
    }

    public final int tGV7Q6urW() {
        if (this.RG6kpfv3v) {
            return this.Eeka1udhb;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
