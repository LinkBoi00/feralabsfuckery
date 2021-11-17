package con;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public abstract class YV6wSuw98 implements Interpolator {
    public final float J4Ux7ym32;
    public final float[] q3BipwRCk;

    public YV6wSuw98(float[] fArr) {
        this.q3BipwRCk = fArr;
        this.J4Ux7ym32 = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.q3BipwRCk;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.J4Ux7ym32;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.q3BipwRCk;
        return tEHkY2u2i.q3BipwRCk(fArr2[min + 1], fArr2[min], f3, fArr2[min]);
    }
}
