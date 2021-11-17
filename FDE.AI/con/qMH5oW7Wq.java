package con;

import android.content.Context;
import android.view.MenuItem;
/* loaded from: classes.dex */
public abstract class qMH5oW7Wq {
    public ZmYjNS8wW J4Ux7ym32;
    public final Context q3BipwRCk;

    public qMH5oW7Wq(Context context) {
        this.q3BipwRCk = context;
    }

    public final MenuItem tGV7Q6urW(MenuItem menuItem) {
        if (!(menuItem instanceof DIMlfTSGa)) {
            return menuItem;
        }
        DIMlfTSGa dIMlfTSGa = (DIMlfTSGa) menuItem;
        if (this.J4Ux7ym32 == null) {
            this.J4Ux7ym32 = new ZmYjNS8wW();
        }
        MenuItem menuItem2 = (MenuItem) this.J4Ux7ym32.getOrDefault(menuItem, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        wV2TMeIik wv2tmeiik = new wV2TMeIik(this.q3BipwRCk, dIMlfTSGa);
        this.J4Ux7ym32.put(dIMlfTSGa, wv2tmeiik);
        return wv2tmeiik;
    }
}
