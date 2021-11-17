package con;

import androidx.activity.OnBackPressedDispatcher;
/* loaded from: classes.dex */
public class Pqf3I9o09 implements bvrtgBCLi {
    public final TET2Qfhx1 CBQ5d1kRq;
    public final /* synthetic */ OnBackPressedDispatcher kmSgne1rO;

    public Pqf3I9o09(OnBackPressedDispatcher onBackPressedDispatcher, TET2Qfhx1 tET2Qfhx1) {
        this.kmSgne1rO = onBackPressedDispatcher;
        this.CBQ5d1kRq = tET2Qfhx1;
    }

    @Override // con.bvrtgBCLi
    public void cancel() {
        this.kmSgne1rO.J4Ux7ym32.remove(this.CBQ5d1kRq);
        this.CBQ5d1kRq.J4Ux7ym32.remove(this);
    }
}
