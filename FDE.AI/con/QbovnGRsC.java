package con;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class QbovnGRsC {
    public int J4Ux7ym32;
    public int q3BipwRCk;
    public int dIocxURUo = -1;
    public boolean iiGwOFFnr = false;
    public int GPLPRo6go = 0;
    public int tGV7Q6urW = Integer.MIN_VALUE;
    public Interpolator kCA6Zs9sL = null;

    public QbovnGRsC(int i, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
    }

    public void J4Ux7ym32(int i, int i2, int i3, Interpolator interpolator) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = i3;
        this.kCA6Zs9sL = interpolator;
        this.iiGwOFFnr = true;
    }

    public void q3BipwRCk(RecyclerView recyclerView) {
        int i = this.dIocxURUo;
        if (i >= 0) {
            this.dIocxURUo = -1;
            recyclerView.juJ6pnCpu(i);
            this.iiGwOFFnr = false;
        } else if (this.iiGwOFFnr) {
            Interpolator interpolator = this.kCA6Zs9sL;
            if (interpolator == null || this.tGV7Q6urW >= 1) {
                int i2 = this.tGV7Q6urW;
                if (i2 >= 1) {
                    recyclerView.R2hkbNqWf.J4Ux7ym32(this.q3BipwRCk, this.J4Ux7ym32, i2, interpolator);
                    int i3 = this.GPLPRo6go + 1;
                    this.GPLPRo6go = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.iiGwOFFnr = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.GPLPRo6go = 0;
        }
    }
}
