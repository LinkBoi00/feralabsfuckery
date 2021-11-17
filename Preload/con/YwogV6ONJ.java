package con;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class YwogV6ONJ implements ComponentCallbacks2 {
    public final /* synthetic */ IXMg0nBBI CBQ5d1kRq;
    public final /* synthetic */ msAS1mvLD kmSgne1rO;

    public YwogV6ONJ(IXMg0nBBI iXMg0nBBI, msAS1mvLD msas1mvld) {
        this.CBQ5d1kRq = iXMg0nBBI;
        this.kmSgne1rO = msas1mvld;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = (Configuration) this.CBQ5d1kRq.CBQ5d1kRq;
        int updateFrom = configuration2 == null ? -1 : configuration2.updateFrom(configuration);
        Iterator it = this.kmSgne1rO.q3BipwRCk.entrySet().iterator();
        while (it.hasNext()) {
            yicY0FhlC yicy0fhlc = (yicY0FhlC) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (yicy0fhlc == null || Configuration.needNewResources(updateFrom, yicy0fhlc.J4Ux7ym32)) {
                it.remove();
            }
        }
        this.CBQ5d1kRq.CBQ5d1kRq = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.kmSgne1rO.q3BipwRCk.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        this.kmSgne1rO.q3BipwRCk.clear();
    }
}
