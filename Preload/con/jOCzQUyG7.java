package con;

import android.view.View;
/* loaded from: classes.dex */
public class jOCzQUyG7 extends nlgbu4icS {
    public final /* synthetic */ p0p8kJ9iW tGV7Q6urW;
    public boolean q3BipwRCk = false;
    public int J4Ux7ym32 = 0;

    public jOCzQUyG7(p0p8kJ9iW p0p8kj9iw) {
        this.tGV7Q6urW = p0p8kj9iw;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void onAnimationEnd(View view) {
        int i = this.J4Ux7ym32 + 1;
        this.J4Ux7ym32 = i;
        if (i == this.tGV7Q6urW.q3BipwRCk.size()) {
            DRrV7WVOe dRrV7WVOe = this.tGV7Q6urW.dIocxURUo;
            if (dRrV7WVOe != null) {
                dRrV7WVOe.onAnimationEnd(null);
            }
            this.J4Ux7ym32 = 0;
            this.q3BipwRCk = false;
            this.tGV7Q6urW.kCA6Zs9sL = false;
        }
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void q3BipwRCk(View view) {
        if (!this.q3BipwRCk) {
            this.q3BipwRCk = true;
            DRrV7WVOe dRrV7WVOe = this.tGV7Q6urW.dIocxURUo;
            if (dRrV7WVOe != null) {
                dRrV7WVOe.q3BipwRCk(null);
            }
        }
    }
}
