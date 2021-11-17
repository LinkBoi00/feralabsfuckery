package con;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.RG2GI7LDp;
import con.HelDswbLq;
/* loaded from: classes.dex */
public class dnrdHR9MV implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, HelDswbLq.RG2GI7LDp {
    public vAM8bdoEe Bhmn1KIah;
    public RG2GI7LDp CBQ5d1kRq;
    public dF3gF5M3i kmSgne1rO;

    public dnrdHR9MV(RG2GI7LDp rG2GI7LDp) {
        this.CBQ5d1kRq = rG2GI7LDp;
    }

    @Override // con.HelDswbLq.RG2GI7LDp
    public boolean Bhmn1KIah(RG2GI7LDp rG2GI7LDp) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.CBQ5d1kRq.ilHKhw3Yw(((mMP42If7n) this.Bhmn1KIah.J4Ux7ym32()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        vAM8bdoEe vam8bdoee = this.Bhmn1KIah;
        RG2GI7LDp rG2GI7LDp = this.CBQ5d1kRq;
        HelDswbLq.RG2GI7LDp rG2GI7LDp2 = vam8bdoee.MzoOEjc4X;
        if (rG2GI7LDp2 != null) {
            rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.kmSgne1rO.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.kmSgne1rO.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.CBQ5d1kRq.tGV7Q6urW(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.CBQ5d1kRq.performShortcut(i, keyEvent, 0);
    }

    @Override // con.HelDswbLq.RG2GI7LDp
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp, boolean z) {
        dF3gF5M3i df3gf5m3i;
        if ((z || rG2GI7LDp == this.CBQ5d1kRq) && (df3gf5m3i = this.kmSgne1rO) != null) {
            df3gf5m3i.dismiss();
        }
    }
}
