package con;

import android.view.MenuItem;
/* loaded from: classes.dex */
public class aqHqeV5rz implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ wV2TMeIik J4Ux7ym32;
    public final MenuItem.OnMenuItemClickListener q3BipwRCk;

    public aqHqeV5rz(wV2TMeIik wv2tmeiik, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.J4Ux7ym32 = wv2tmeiik;
        this.q3BipwRCk = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.q3BipwRCk.onMenuItemClick(this.J4Ux7ym32.tGV7Q6urW(menuItem));
    }
}
