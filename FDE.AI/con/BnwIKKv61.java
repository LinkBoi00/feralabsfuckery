package con;

import android.view.MenuItem;
/* loaded from: classes.dex */
public class BnwIKKv61 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ wV2TMeIik J4Ux7ym32;
    public final MenuItem.OnActionExpandListener q3BipwRCk;

    public BnwIKKv61(wV2TMeIik wv2tmeiik, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.J4Ux7ym32 = wv2tmeiik;
        this.q3BipwRCk = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.q3BipwRCk.onMenuItemActionCollapse(this.J4Ux7ym32.tGV7Q6urW(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.q3BipwRCk.onMenuItemActionExpand(this.J4Ux7ym32.tGV7Q6urW(menuItem));
    }
}
