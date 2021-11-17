package con;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class dNif5KqqH implements BR8wFu8f7 {
    public final float q3BipwRCk;

    public dNif5KqqH(float f) {
        this.q3BipwRCk = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dNif5KqqH) && this.q3BipwRCk == ((dNif5KqqH) obj).q3BipwRCk;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.q3BipwRCk)});
    }

    @Override // con.BR8wFu8f7
    public float q3BipwRCk(RectF rectF) {
        return this.q3BipwRCk;
    }
}
