package con;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class w1O3kCmGZ implements ActionMode.Callback {
    public final TextView J4Ux7ym32;
    public Method dIocxURUo;
    public boolean iiGwOFFnr = false;
    public boolean kCA6Zs9sL;
    public final ActionMode.Callback q3BipwRCk;
    public Class tGV7Q6urW;

    public w1O3kCmGZ(ActionMode.Callback callback, TextView textView) {
        this.q3BipwRCk = callback;
        this.J4Ux7ym32 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.q3BipwRCk.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.q3BipwRCk.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.q3BipwRCk.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: con.w1O3kCmGZ.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
