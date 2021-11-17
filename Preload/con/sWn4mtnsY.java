package con;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class sWn4mtnsY extends ActionMode.Callback2 {
    public final rKKfiOTQO q3BipwRCk;

    public sWn4mtnsY(rKKfiOTQO rkkfiotqo) {
        this.q3BipwRCk = rkkfiotqo;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.q3BipwRCk.kCA6Zs9sL(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.q3BipwRCk.iiGwOFFnr(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        Objects.requireNonNull(this.q3BipwRCk);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        bzmJZsHMu bzmjzshmu = (bzmJZsHMu) this.q3BipwRCk.q3BipwRCk;
        if (rect != null) {
            rect.set((int) bzmjzshmu.q3BipwRCk, (int) bzmjzshmu.J4Ux7ym32, (int) bzmjzshmu.tGV7Q6urW, (int) bzmjzshmu.dIocxURUo);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Objects.requireNonNull(this.q3BipwRCk);
        return false;
    }
}
