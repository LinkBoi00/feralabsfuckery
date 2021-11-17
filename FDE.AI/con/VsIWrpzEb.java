package con;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class VsIWrpzEb extends NySN5IVuc {
    public final /* synthetic */ int ilHKhw3Yw = 0;
    public final /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VsIWrpzEb(Pzd2J3aOK pzd2J3aOK, Context context) {
        super(context);
        this.qVUwofr5s = pzd2J3aOK;
    }

    @Override // con.NySN5IVuc
    public int GPLPRo6go(int i) {
        switch (this.ilHKhw3Yw) {
            case 0:
                return Math.min(100, super.GPLPRo6go(i));
            default:
                return super.GPLPRo6go(i);
        }
    }

    @Override // con.NySN5IVuc
    public float iiGwOFFnr(DisplayMetrics displayMetrics) {
        int i;
        switch (this.ilHKhw3Yw) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / ((float) i);
    }

    @Override // con.NySN5IVuc, androidx.recyclerview.widget.RecyclerView.kVmRinNH6
    public void tGV7Q6urW(View view, RecyclerView.kvFwRYSUX kvfwrysux, QbovnGRsC qbovnGRsC) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        switch (this.ilHKhw3Yw) {
            case 0:
                Pzd2J3aOK pzd2J3aOK = (Pzd2J3aOK) this.qVUwofr5s;
                int[] q3BipwRCk = pzd2J3aOK.q3BipwRCk(pzd2J3aOK.q3BipwRCk.getLayoutManager(), view);
                int i5 = q3BipwRCk[0];
                int i6 = q3BipwRCk[1];
                int ceil = (int) Math.ceil(((double) GPLPRo6go(Math.max(Math.abs(i5), Math.abs(i6)))) / 0.3356d);
                if (ceil > 0) {
                    qbovnGRsC.J4Ux7ym32(i5, i6, ceil, this.oon79WMrY);
                    return;
                }
                return;
            default:
                PointF pointF = this.vPSbyrYWX;
                int i7 = (pointF == null || pointF.x == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
                RecyclerView.LULQkQlc9 lULQkQlc9 = this.tGV7Q6urW;
                if (lULQkQlc9 == null || !lULQkQlc9.kCA6Zs9sL()) {
                    i = 0;
                } else {
                    RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) view.getLayoutParams();
                    i = kCA6Zs9sL(lULQkQlc9.IytU16YUK(view) - ((ViewGroup.MarginLayoutParams) dgsh68zh8).leftMargin, lULQkQlc9.nlGCs0NZs(view) + ((ViewGroup.MarginLayoutParams) dgsh68zh8).rightMargin, lULQkQlc9.QNqj6nIzv(), lULQkQlc9.Bhmn1KIah - lULQkQlc9.igRQEZxnW(), i7);
                }
                PointF pointF2 = this.vPSbyrYWX;
                int i8 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i2 > 0 ? 1 : -1;
                RecyclerView.LULQkQlc9 lULQkQlc92 = this.tGV7Q6urW;
                if (lULQkQlc92 != null && lULQkQlc92.iiGwOFFnr()) {
                    RecyclerView.dgsh68zH8 dgsh68zh82 = (RecyclerView.dgsh68zH8) view.getLayoutParams();
                    i4 = kCA6Zs9sL(lULQkQlc92.AqaWJg0b4(view) - ((ViewGroup.MarginLayoutParams) dgsh68zh82).topMargin, lULQkQlc92.iMyQMM6Qj(view) + ((ViewGroup.MarginLayoutParams) dgsh68zh82).bottomMargin, lULQkQlc92.EBQXiIPmm(), lULQkQlc92.PSTqBLTET - lULQkQlc92.V9LQMKGJe(), i8);
                }
                int ceil2 = (int) Math.ceil(((double) GPLPRo6go((int) Math.sqrt((double) ((i4 * i4) + (i * i))))) / 0.3356d);
                if (ceil2 > 0) {
                    qbovnGRsC.J4Ux7ym32(-i, -i4, ceil2, this.oon79WMrY);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VsIWrpzEb(suTVAeEU9 sutvaeeu9, Context context) {
        super(context);
        this.qVUwofr5s = sutvaeeu9;
    }
}
