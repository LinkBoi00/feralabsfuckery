package con;

import android.view.View;
/* loaded from: classes.dex */
public class mhl5lIdbQ implements DRrV7WVOe {
    public int J4Ux7ym32;
    public boolean q3BipwRCk = false;
    public final /* synthetic */ aXI58Y1kr tGV7Q6urW;

    public mhl5lIdbQ(aXI58Y1kr axi58y1kr) {
        this.tGV7Q6urW = axi58y1kr;
    }

    @Override // con.DRrV7WVOe
    public void J4Ux7ym32(View view) {
        this.q3BipwRCk = true;
    }

    @Override // con.DRrV7WVOe
    public void onAnimationEnd(View view) {
        if (!this.q3BipwRCk) {
            aXI58Y1kr axi58y1kr = this.tGV7Q6urW;
            axi58y1kr.ilHKhw3Yw = null;
            mhl5lIdbQ.super.setVisibility(this.J4Ux7ym32);
        }
    }

    @Override // con.DRrV7WVOe
    public void q3BipwRCk(View view) {
        mhl5lIdbQ.super.setVisibility(0);
        this.q3BipwRCk = false;
    }
}
