package con;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
/* loaded from: classes.dex */
public final class alvSTFvn7 {
    public final TextDirectionHeuristic J4Ux7ym32;
    public final int dIocxURUo;
    public final TextPaint q3BipwRCk;
    public final int tGV7Q6urW;

    public alvSTFvn7(PrecomputedText.Params params) {
        this.q3BipwRCk = params.getTextPaint();
        this.J4Ux7ym32 = params.getTextDirection();
        this.tGV7Q6urW = params.getBreakStrategy();
        this.dIocxURUo = params.getHyphenationFrequency();
    }

    public alvSTFvn7(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.q3BipwRCk = textPaint;
        this.J4Ux7ym32 = textDirectionHeuristic;
        this.tGV7Q6urW = i;
        this.dIocxURUo = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof alvSTFvn7)) {
            return false;
        }
        alvSTFvn7 alvstfvn7 = (alvSTFvn7) obj;
        return q3BipwRCk(alvstfvn7) && this.J4Ux7ym32 == alvstfvn7.J4Ux7ym32;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.q3BipwRCk.getTextSize()), Float.valueOf(this.q3BipwRCk.getTextScaleX()), Float.valueOf(this.q3BipwRCk.getTextSkewX()), Float.valueOf(this.q3BipwRCk.getLetterSpacing()), Integer.valueOf(this.q3BipwRCk.getFlags()), this.q3BipwRCk.getTextLocales(), this.q3BipwRCk.getTypeface(), Boolean.valueOf(this.q3BipwRCk.isElegantTextHeight()), this.J4Ux7ym32, Integer.valueOf(this.tGV7Q6urW), Integer.valueOf(this.dIocxURUo));
    }

    public boolean q3BipwRCk(alvSTFvn7 alvstfvn7) {
        if (this.tGV7Q6urW != alvstfvn7.tGV7Q6urW || this.dIocxURUo != alvstfvn7.dIocxURUo || this.q3BipwRCk.getTextSize() != alvstfvn7.q3BipwRCk.getTextSize() || this.q3BipwRCk.getTextScaleX() != alvstfvn7.q3BipwRCk.getTextScaleX() || this.q3BipwRCk.getTextSkewX() != alvstfvn7.q3BipwRCk.getTextSkewX() || this.q3BipwRCk.getLetterSpacing() != alvstfvn7.q3BipwRCk.getLetterSpacing() || !TextUtils.equals(this.q3BipwRCk.getFontFeatureSettings(), alvstfvn7.q3BipwRCk.getFontFeatureSettings()) || this.q3BipwRCk.getFlags() != alvstfvn7.q3BipwRCk.getFlags() || !this.q3BipwRCk.getTextLocales().equals(alvstfvn7.q3BipwRCk.getTextLocales())) {
            return false;
        }
        if (this.q3BipwRCk.getTypeface() == null) {
            if (alvstfvn7.q3BipwRCk.getTypeface() != null) {
                return false;
            }
            return true;
        } else if (!this.q3BipwRCk.getTypeface().equals(alvstfvn7.q3BipwRCk.getTypeface())) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("textSize=");
        q3BipwRCk.append(this.q3BipwRCk.getTextSize());
        sb.append(q3BipwRCk.toString());
        sb.append(", textScaleX=" + this.q3BipwRCk.getTextScaleX());
        sb.append(", textSkewX=" + this.q3BipwRCk.getTextSkewX());
        sb.append(", letterSpacing=" + this.q3BipwRCk.getLetterSpacing());
        sb.append(", elegantTextHeight=" + this.q3BipwRCk.isElegantTextHeight());
        sb.append(", textLocale=" + this.q3BipwRCk.getTextLocales());
        sb.append(", typeface=" + this.q3BipwRCk.getTypeface());
        sb.append(", variationSettings=" + this.q3BipwRCk.getFontVariationSettings());
        sb.append(", textDir=" + this.J4Ux7ym32);
        sb.append(", breakStrategy=" + this.tGV7Q6urW);
        sb.append(", hyphenationFrequency=" + this.dIocxURUo);
        sb.append("}");
        return sb.toString();
    }
}
