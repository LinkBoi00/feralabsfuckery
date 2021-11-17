package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import con.EV4wl6Jg6;
import con.dKJ1o9mQ7;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    public dKJ1o9mQ7 CBQ5d1kRq;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        dKJ1o9mQ7 dkj1o9mq7 = this.CBQ5d1kRq;
        if (dkj1o9mq7 != null) {
            rect.top = ((EV4wl6Jg6) dkj1o9mq7).kmSgne1rO.V9LQMKGJe(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(dKJ1o9mQ7 dkj1o9mq7) {
        this.CBQ5d1kRq = dkj1o9mq7;
    }
}
