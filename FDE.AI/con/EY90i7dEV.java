package con;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.RG2GI7LDp;
/* loaded from: classes.dex */
public class EY90i7dEV implements Runnable {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public final /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ Object kmSgne1rO;

    public EY90i7dEV(t5E8jan4S t5e8jan4s, xobLfQFEO xoblfqfeo, View view, Rect rect) {
        this.MzoOEjc4X = t5e8jan4s;
        this.kmSgne1rO = xoblfqfeo;
        this.Bhmn1KIah = view;
        this.PSTqBLTET = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                W85tF8RjC w85tF8RjC = (W85tF8RjC) this.kmSgne1rO;
                if (w85tF8RjC != null) {
                    ((XSh7SAV24) ((iFKnyAZAM) this.MzoOEjc4X).kmSgne1rO).o4LF8RkoQ = true;
                    w85tF8RjC.J4Ux7ym32.tGV7Q6urW(false);
                    ((XSh7SAV24) ((iFKnyAZAM) this.MzoOEjc4X).kmSgne1rO).o4LF8RkoQ = false;
                }
                if (((MenuItem) this.Bhmn1KIah).isEnabled() && ((MenuItem) this.Bhmn1KIah).hasSubMenu()) {
                    ((RG2GI7LDp) this.PSTqBLTET).ilHKhw3Yw((MenuItem) this.Bhmn1KIah, 4);
                    return;
                }
                return;
            default:
                ((xobLfQFEO) this.kmSgne1rO).oon79WMrY((View) this.Bhmn1KIah, (Rect) this.PSTqBLTET);
                return;
        }
    }

    public EY90i7dEV(iFKnyAZAM ifknyazam, W85tF8RjC w85tF8RjC, MenuItem menuItem, RG2GI7LDp rG2GI7LDp) {
        this.MzoOEjc4X = ifknyazam;
        this.kmSgne1rO = w85tF8RjC;
        this.Bhmn1KIah = menuItem;
        this.PSTqBLTET = rG2GI7LDp;
    }
}
