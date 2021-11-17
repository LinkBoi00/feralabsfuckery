package con;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class Fj4Wp9wly {
    public final RecyclerView.LULQkQlc9 q3BipwRCk;
    public int J4Ux7ym32 = Integer.MIN_VALUE;
    public final Rect tGV7Q6urW = new Rect();

    public Fj4Wp9wly(RecyclerView.LULQkQlc9 lULQkQlc9, zBnrA98bV zbnra98bv) {
        this.q3BipwRCk = lULQkQlc9;
    }

    public static Fj4Wp9wly q3BipwRCk(RecyclerView.LULQkQlc9 lULQkQlc9, int i) {
        if (i == 0) {
            return new zBnrA98bV(lULQkQlc9);
        }
        if (i == 1) {
            return new Q58fcynSX(lULQkQlc9);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int Bhmn1KIah(View view);

    public abstract int CBQ5d1kRq();

    public abstract int GPLPRo6go();

    public abstract int J4Ux7ym32(View view);

    public abstract void MzoOEjc4X(int i);

    public abstract int PSTqBLTET(View view);

    public abstract int Puu3Rhg4F();

    public abstract int dIocxURUo(View view);

    public abstract int iiGwOFFnr();

    public abstract int kCA6Zs9sL(View view);

    public int kmSgne1rO() {
        if (Integer.MIN_VALUE == this.J4Ux7ym32) {
            return 0;
        }
        return CBQ5d1kRq() - this.J4Ux7ym32;
    }

    public abstract int oon79WMrY();

    public abstract int tGV7Q6urW(View view);

    public abstract int vPSbyrYWX();

    public abstract int yWvV4ePLl();
}
