package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.mhl5lIdbQ;
/* loaded from: classes.dex */
public class qhPEQQaQ4 implements mhl5lIdbQ.RG2GI7LDp {
    public final /* synthetic */ RecyclerView q3BipwRCk;

    public qhPEQQaQ4(RecyclerView recyclerView) {
        this.q3BipwRCk = recyclerView;
    }

    public int J4Ux7ym32() {
        return this.q3BipwRCk.getChildCount();
    }

    public View q3BipwRCk(int i) {
        return this.q3BipwRCk.getChildAt(i);
    }

    public void tGV7Q6urW(int i) {
        View childAt = this.q3BipwRCk.getChildAt(i);
        if (childAt != null) {
            this.q3BipwRCk.MzoOEjc4X(childAt);
            childAt.clearAnimation();
        }
        this.q3BipwRCk.removeViewAt(i);
    }
}
