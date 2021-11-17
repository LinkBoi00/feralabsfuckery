package con;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class p0p8kJ9iW {
    public DRrV7WVOe dIocxURUo;
    public boolean kCA6Zs9sL;
    public Interpolator tGV7Q6urW;
    public long J4Ux7ym32 = -1;
    public final nlgbu4icS iiGwOFFnr = new jOCzQUyG7(this);
    public final ArrayList q3BipwRCk = new ArrayList();

    public void J4Ux7ym32() {
        View view;
        if (!this.kCA6Zs9sL) {
            Iterator it = this.q3BipwRCk.iterator();
            while (it.hasNext()) {
                Roohga8FY roohga8FY = (Roohga8FY) it.next();
                long j = this.J4Ux7ym32;
                if (j >= 0) {
                    roohga8FY.tGV7Q6urW(j);
                }
                Interpolator interpolator = this.tGV7Q6urW;
                if (!(interpolator == null || (view = (View) roohga8FY.q3BipwRCk.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.dIocxURUo != null) {
                    roohga8FY.dIocxURUo(this.iiGwOFFnr);
                }
                View view2 = (View) roohga8FY.q3BipwRCk.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.kCA6Zs9sL = true;
        }
    }

    public void q3BipwRCk() {
        if (this.kCA6Zs9sL) {
            Iterator it = this.q3BipwRCk.iterator();
            while (it.hasNext()) {
                ((Roohga8FY) it.next()).J4Ux7ym32();
            }
            this.kCA6Zs9sL = false;
        }
    }
}
