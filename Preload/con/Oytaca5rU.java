package con;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Oytaca5rU implements BR8wFu8f7 {
    public final float q3BipwRCk;

    public Oytaca5rU(float f) {
        this.q3BipwRCk = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Oytaca5rU) && this.q3BipwRCk == ((Oytaca5rU) obj).q3BipwRCk;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.q3BipwRCk)});
    }

    @Override // con.BR8wFu8f7
    public float q3BipwRCk(RectF rectF) {
        return rectF.height() * this.q3BipwRCk;
    }
}
