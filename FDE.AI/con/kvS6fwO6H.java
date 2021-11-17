package con;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.feravolt.preload.R;
import java.util.Objects;
/* loaded from: classes.dex */
public class kvS6fwO6H extends ViewGroup {
    public kvS6fwO6H(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = getChildCount();
        boolean z = false;
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                if (((iUgWrj1f5) childAt).Eeka1udhb) {
                    z = true;
                    break;
                } else if (i2 >= childCount) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (z) {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void q3BipwRCk(SI0VpKubr sI0VpKubr, View view, long j) {
        Canvas canvas = RvtysjeZn.q3BipwRCk;
        super.drawChild(((YSo0hTREC) sI0VpKubr).q3BipwRCk, view, j);
    }
}
