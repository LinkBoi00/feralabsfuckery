package con;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public class Y46sAvtbJ implements View.OnClickListener {
    public final dvDBMpGRx CBQ5d1kRq;
    public final /* synthetic */ qya5U7BN8 kmSgne1rO;

    public Y46sAvtbJ(qya5U7BN8 qya5u7bn8) {
        this.kmSgne1rO = qya5u7bn8;
        this.CBQ5d1kRq = new dvDBMpGRx(qya5u7bn8.q3BipwRCk.getContext(), 0, 16908332, 0, qya5u7bn8.yWvV4ePLl);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        qya5U7BN8 qya5u7bn8 = this.kmSgne1rO;
        Window.Callback callback = qya5u7bn8.CBQ5d1kRq;
        if (callback != null && qya5u7bn8.kmSgne1rO) {
            callback.onMenuItemSelected(0, this.CBQ5d1kRq);
        }
    }
}
