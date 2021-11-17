package con;

import android.view.View;
/* loaded from: classes.dex */
public class jYxkMmc7F extends nlgbu4icS {
    public final /* synthetic */ int J4Ux7ym32;
    public boolean q3BipwRCk = false;
    public final /* synthetic */ qya5U7BN8 tGV7Q6urW;

    public jYxkMmc7F(qya5U7BN8 qya5u7bn8, int i) {
        this.tGV7Q6urW = qya5u7bn8;
        this.J4Ux7ym32 = i;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void J4Ux7ym32(View view) {
        this.q3BipwRCk = true;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void onAnimationEnd(View view) {
        if (!this.q3BipwRCk) {
            this.tGV7Q6urW.q3BipwRCk.setVisibility(this.J4Ux7ym32);
        }
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void q3BipwRCk(View view) {
        this.tGV7Q6urW.q3BipwRCk.setVisibility(0);
    }
}
