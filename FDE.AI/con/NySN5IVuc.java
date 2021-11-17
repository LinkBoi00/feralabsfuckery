package con;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class NySN5IVuc extends RecyclerView.kVmRinNH6 {
    public float Bhmn1KIah;
    public final DisplayMetrics CBQ5d1kRq;
    public PointF vPSbyrYWX;
    public final LinearInterpolator yWvV4ePLl = new LinearInterpolator();
    public final DecelerateInterpolator oon79WMrY = new DecelerateInterpolator();
    public boolean kmSgne1rO = false;
    public int PSTqBLTET = 0;
    public int MzoOEjc4X = 0;

    public NySN5IVuc(Context context) {
        this.CBQ5d1kRq = context.getResources().getDisplayMetrics();
    }

    public int GPLPRo6go(int i) {
        float abs = (float) Math.abs(i);
        if (!this.kmSgne1rO) {
            this.Bhmn1KIah = iiGwOFFnr(this.CBQ5d1kRq);
            this.kmSgne1rO = true;
        }
        return (int) Math.ceil((double) (abs * this.Bhmn1KIah));
    }

    public float iiGwOFFnr(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int kCA6Zs9sL(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kVmRinNH6
    public void tGV7Q6urW(View view, RecyclerView.kvFwRYSUX kvfwrysux, QbovnGRsC qbovnGRsC) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.vPSbyrYWX;
        int i4 = 0;
        int i5 = (pointF == null || pointF.x == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.LULQkQlc9 lULQkQlc9 = this.tGV7Q6urW;
        if (lULQkQlc9 == null || !lULQkQlc9.kCA6Zs9sL()) {
            i = 0;
        } else {
            RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) view.getLayoutParams();
            i = kCA6Zs9sL(lULQkQlc9.IytU16YUK(view) - ((ViewGroup.MarginLayoutParams) dgsh68zh8).leftMargin, lULQkQlc9.nlGCs0NZs(view) + ((ViewGroup.MarginLayoutParams) dgsh68zh8).rightMargin, lULQkQlc9.QNqj6nIzv(), lULQkQlc9.Bhmn1KIah - lULQkQlc9.igRQEZxnW(), i5);
        }
        PointF pointF2 = this.vPSbyrYWX;
        int i6 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i2 > 0 ? 1 : -1;
        RecyclerView.LULQkQlc9 lULQkQlc92 = this.tGV7Q6urW;
        if (lULQkQlc92 != null && lULQkQlc92.iiGwOFFnr()) {
            RecyclerView.dgsh68zH8 dgsh68zh82 = (RecyclerView.dgsh68zH8) view.getLayoutParams();
            i4 = kCA6Zs9sL(lULQkQlc92.AqaWJg0b4(view) - ((ViewGroup.MarginLayoutParams) dgsh68zh82).topMargin, lULQkQlc92.iMyQMM6Qj(view) + ((ViewGroup.MarginLayoutParams) dgsh68zh82).bottomMargin, lULQkQlc92.EBQXiIPmm(), lULQkQlc92.PSTqBLTET - lULQkQlc92.V9LQMKGJe(), i6);
        }
        int ceil = (int) Math.ceil(((double) GPLPRo6go((int) Math.sqrt((double) ((i4 * i4) + (i * i))))) / 0.3356d);
        if (ceil > 0) {
            qbovnGRsC.J4Ux7ym32(-i, -i4, ceil, this.oon79WMrY);
        }
    }
}
