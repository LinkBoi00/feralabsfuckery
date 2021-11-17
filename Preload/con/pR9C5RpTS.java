package con;

import android.animation.TimeInterpolator;
/* loaded from: classes.dex */
public final class pR9C5RpTS implements lOtvezK70 {
    public final /* synthetic */ TimeInterpolator q3BipwRCk;

    public pR9C5RpTS(TimeInterpolator timeInterpolator) {
        this.q3BipwRCk = timeInterpolator;
    }

    @Override // con.lOtvezK70
    public final float q3BipwRCk(float f) {
        return this.q3BipwRCk.getInterpolation(f);
    }
}
