package con;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.RG2GI7LDp;
import com.feravolt.preload.R;
import con.HelDswbLq;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Ct2GXtyrO {
    public final RG2GI7LDp J4Ux7ym32;
    public boolean Puu3Rhg4F;
    public final int dIocxURUo;
    public View iiGwOFFnr;
    public final int kCA6Zs9sL;
    public gR4fovbO3 oon79WMrY;
    public final Context q3BipwRCk;
    public final boolean tGV7Q6urW;
    public PopupWindow.OnDismissListener vPSbyrYWX;
    public HelDswbLq.RG2GI7LDp yWvV4ePLl;
    public int GPLPRo6go = 8388611;
    public final PopupWindow.OnDismissListener CBQ5d1kRq = new gF1I9P7a8(this);

    public Ct2GXtyrO(Context context, RG2GI7LDp rG2GI7LDp, View view, boolean z, int i, int i2) {
        this.q3BipwRCk = context;
        this.J4Ux7ym32 = rG2GI7LDp;
        this.iiGwOFFnr = view;
        this.tGV7Q6urW = z;
        this.dIocxURUo = i;
        this.kCA6Zs9sL = i2;
    }

    public boolean J4Ux7ym32() {
        gR4fovbO3 gr4fovbo3 = this.oon79WMrY;
        return gr4fovbo3 != null && gr4fovbo3.J4Ux7ym32();
    }

    public void dIocxURUo(HelDswbLq.RG2GI7LDp rG2GI7LDp) {
        this.yWvV4ePLl = rG2GI7LDp;
        gR4fovbO3 gr4fovbo3 = this.oon79WMrY;
        if (gr4fovbo3 != null) {
            gr4fovbo3.Puu3Rhg4F(rG2GI7LDp);
        }
    }

    public boolean iiGwOFFnr() {
        if (J4Ux7ym32()) {
            return true;
        }
        if (this.iiGwOFFnr == null) {
            return false;
        }
        kCA6Zs9sL(0, 0, false, false);
        return true;
    }

    public final void kCA6Zs9sL(int i, int i2, boolean z, boolean z2) {
        gR4fovbO3 q3BipwRCk = q3BipwRCk();
        q3BipwRCk.Eeka1udhb(z2);
        if (z) {
            int i3 = this.GPLPRo6go;
            View view = this.iiGwOFFnr;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if ((Gravity.getAbsoluteGravity(i3, RBJDIwG1D.dIocxURUo(view)) & 7) == 5) {
                i -= this.iiGwOFFnr.getWidth();
            }
            q3BipwRCk.ilHKhw3Yw(i);
            q3BipwRCk.dXrmkklc8(i2);
            int i4 = (int) ((this.q3BipwRCk.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            q3BipwRCk.CBQ5d1kRq = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        q3BipwRCk.GPLPRo6go();
    }

    public gR4fovbO3 q3BipwRCk() {
        if (this.oon79WMrY == null) {
            Display defaultDisplay = ((WindowManager) this.q3BipwRCk.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            gR4fovbO3 xSh7SAV24 = Math.min(point.x, point.y) >= this.q3BipwRCk.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new XSh7SAV24(this.q3BipwRCk, this.iiGwOFFnr, this.dIocxURUo, this.kCA6Zs9sL, this.tGV7Q6urW) : new tDVlVoCRy(this.q3BipwRCk, this.J4Ux7ym32, this.iiGwOFFnr, this.dIocxURUo, this.kCA6Zs9sL, this.tGV7Q6urW);
            xSh7SAV24.vPSbyrYWX(this.J4Ux7ym32);
            xSh7SAV24.qVUwofr5s(this.CBQ5d1kRq);
            xSh7SAV24.Bhmn1KIah(this.iiGwOFFnr);
            xSh7SAV24.Puu3Rhg4F(this.yWvV4ePLl);
            xSh7SAV24.PSTqBLTET(this.Puu3Rhg4F);
            xSh7SAV24.MzoOEjc4X(this.GPLPRo6go);
            this.oon79WMrY = xSh7SAV24;
        }
        return this.oon79WMrY;
    }

    public void tGV7Q6urW() {
        this.oon79WMrY = null;
        PopupWindow.OnDismissListener onDismissListener = this.vPSbyrYWX;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }
}
