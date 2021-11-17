package con;

import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class JeqVtUN4T implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
