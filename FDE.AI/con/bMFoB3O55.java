package con;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class bMFoB3O55 implements BR8wFu8f7 {
    public final float J4Ux7ym32;
    public final BR8wFu8f7 q3BipwRCk;

    public bMFoB3O55(float f, BR8wFu8f7 bR8wFu8f7) {
        while (bR8wFu8f7 instanceof bMFoB3O55) {
            bR8wFu8f7 = ((bMFoB3O55) bR8wFu8f7).q3BipwRCk;
            f += ((bMFoB3O55) bR8wFu8f7).J4Ux7ym32;
        }
        this.q3BipwRCk = bR8wFu8f7;
        this.J4Ux7ym32 = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bMFoB3O55)) {
            return false;
        }
        bMFoB3O55 bmfob3o55 = (bMFoB3O55) obj;
        return this.q3BipwRCk.equals(bmfob3o55.q3BipwRCk) && this.J4Ux7ym32 == bmfob3o55.J4Ux7ym32;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.q3BipwRCk, Float.valueOf(this.J4Ux7ym32)});
    }

    @Override // con.BR8wFu8f7
    public float q3BipwRCk(RectF rectF) {
        return Math.max(0.0f, this.q3BipwRCk.q3BipwRCk(rectF) + this.J4Ux7ym32);
    }
}
