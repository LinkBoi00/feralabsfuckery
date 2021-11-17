package con;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
/* loaded from: classes.dex */
public final class JIKDHRcto implements OnReceiveContentListener {
    public final NwQnhQfAW q3BipwRCk;

    public JIKDHRcto(NwQnhQfAW nwQnhQfAW) {
        this.q3BipwRCk = nwQnhQfAW;
    }

    public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        rZsVaMPDT rzsvampdt = new rZsVaMPDT(new iFKnyAZAM(contentInfo));
        rZsVaMPDT q3BipwRCk = ((R6XB2icpf) this.q3BipwRCk).q3BipwRCk(view, rzsvampdt);
        if (q3BipwRCk == null) {
            return null;
        }
        if (q3BipwRCk == rzsvampdt) {
            return contentInfo;
        }
        return q3BipwRCk.q3BipwRCk.Puu3Rhg4F();
    }
}
