package con;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* loaded from: classes.dex */
public abstract class YxooWVt2U extends cUyADHjN1 {
    public int tGV7Q6urW;

    public YxooWVt2U() {
        new Rect();
        new Rect();
    }

    public YxooWVt2U(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
    }

    public abstract View RG6kpfv3v(List list);

    @Override // con.cUyADHjN1
    public void dXrmkklc8(CoordinatorLayout coordinatorLayout, View view, int i) {
        RG6kpfv3v(coordinatorLayout.oon79WMrY(view));
        coordinatorLayout.ilHKhw3Yw(view, i);
    }

    public final int ixWaw2akD(View view) {
        int i = this.tGV7Q6urW;
        if (i == 0) {
            return 0;
        }
        return BBVaGLNaU.GPLPRo6go((int) (((float) i) * 0.0f), 0, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean yWvV4ePLl(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        RG6kpfv3v(coordinatorLayout.oon79WMrY(view));
        return false;
    }
}
