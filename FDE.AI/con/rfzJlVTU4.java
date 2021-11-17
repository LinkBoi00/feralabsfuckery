package con;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class rfzJlVTU4 implements Bp6zELb4E {
    public final /* synthetic */ RecyclerView.LULQkQlc9 J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;

    public rfzJlVTU4(RecyclerView.LULQkQlc9 lULQkQlc9, int i) {
        this.q3BipwRCk = i;
        if (i != 1) {
            this.J4Ux7ym32 = lULQkQlc9;
        } else {
            this.J4Ux7ym32 = lULQkQlc9;
        }
    }

    public int J4Ux7ym32(View view) {
        int AqaWJg0b4;
        int i;
        switch (this.q3BipwRCk) {
            case 0:
                AqaWJg0b4 = this.J4Ux7ym32.IytU16YUK(view);
                i = ((ViewGroup.MarginLayoutParams) ((RecyclerView.dgsh68zH8) view.getLayoutParams())).leftMargin;
                break;
            default:
                AqaWJg0b4 = this.J4Ux7ym32.AqaWJg0b4(view);
                i = ((ViewGroup.MarginLayoutParams) ((RecyclerView.dgsh68zH8) view.getLayoutParams())).topMargin;
                break;
        }
        return AqaWJg0b4 - i;
    }

    public int dIocxURUo() {
        switch (this.q3BipwRCk) {
            case 0:
                return this.J4Ux7ym32.QNqj6nIzv();
            default:
                return this.J4Ux7ym32.EBQXiIPmm();
        }
    }

    public int q3BipwRCk(View view) {
        int iMyQMM6Qj;
        int i;
        switch (this.q3BipwRCk) {
            case 0:
                iMyQMM6Qj = this.J4Ux7ym32.nlGCs0NZs(view);
                i = ((ViewGroup.MarginLayoutParams) ((RecyclerView.dgsh68zH8) view.getLayoutParams())).rightMargin;
                break;
            default:
                iMyQMM6Qj = this.J4Ux7ym32.iMyQMM6Qj(view);
                i = ((ViewGroup.MarginLayoutParams) ((RecyclerView.dgsh68zH8) view.getLayoutParams())).bottomMargin;
                break;
        }
        return iMyQMM6Qj + i;
    }

    public int tGV7Q6urW() {
        int i;
        int V9LQMKGJe;
        switch (this.q3BipwRCk) {
            case 0:
                RecyclerView.LULQkQlc9 lULQkQlc9 = this.J4Ux7ym32;
                i = lULQkQlc9.Bhmn1KIah;
                V9LQMKGJe = lULQkQlc9.igRQEZxnW();
                break;
            default:
                RecyclerView.LULQkQlc9 lULQkQlc92 = this.J4Ux7ym32;
                i = lULQkQlc92.PSTqBLTET;
                V9LQMKGJe = lULQkQlc92.V9LQMKGJe();
                break;
        }
        return i - V9LQMKGJe;
    }
}
