package con;

import android.graphics.Rect;
import java.util.Comparator;
/* loaded from: classes.dex */
public class cQLm6iJtY implements Comparator {
    public final Q4TFMtvSV dIocxURUo;
    public final boolean tGV7Q6urW;
    public final Rect q3BipwRCk = new Rect();
    public final Rect J4Ux7ym32 = new Rect();

    public cQLm6iJtY(boolean z, Q4TFMtvSV q4TFMtvSV) {
        this.tGV7Q6urW = z;
        this.dIocxURUo = q4TFMtvSV;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Rect rect = this.q3BipwRCk;
        Rect rect2 = this.J4Ux7ym32;
        this.dIocxURUo.J4Ux7ym32(obj, rect);
        this.dIocxURUo.J4Ux7ym32(obj2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.tGV7Q6urW ? 1 : -1;
        }
        if (i3 > i4) {
            return this.tGV7Q6urW ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.tGV7Q6urW ? 1 : -1;
        }
        if (i7 > i8) {
            return this.tGV7Q6urW ? -1 : 1;
        }
        return 0;
    }
}
