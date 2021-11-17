package con;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public abstract class cUyADHjN1 extends CoordinatorLayout.mhl5lIdbQ {
    public int J4Ux7ym32 = 0;
    public xoW3gOxG8 q3BipwRCk;

    public cUyADHjN1() {
    }

    public cUyADHjN1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int Eeka1udhb() {
        xoW3gOxG8 xow3goxg8 = this.q3BipwRCk;
        if (xow3goxg8 != null) {
            return xow3goxg8.dIocxURUo;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
        dXrmkklc8(coordinatorLayout, view, i);
        if (this.q3BipwRCk == null) {
            this.q3BipwRCk = new xoW3gOxG8(view);
        }
        xoW3gOxG8 xow3goxg8 = this.q3BipwRCk;
        xow3goxg8.J4Ux7ym32 = xow3goxg8.q3BipwRCk.getTop();
        xow3goxg8.tGV7Q6urW = xow3goxg8.q3BipwRCk.getLeft();
        this.q3BipwRCk.q3BipwRCk();
        int i2 = this.J4Ux7ym32;
        if (i2 == 0) {
            return true;
        }
        xoW3gOxG8 xow3goxg82 = this.q3BipwRCk;
        if (xow3goxg82.dIocxURUo != i2) {
            xow3goxg82.dIocxURUo = i2;
            xow3goxg82.q3BipwRCk();
        }
        this.J4Ux7ym32 = 0;
        return true;
    }

    public void dXrmkklc8(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.ilHKhw3Yw(view, i);
    }
}
