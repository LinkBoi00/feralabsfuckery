package con;
/* loaded from: classes.dex */
public class aQYuuNulZ implements Runnable {
    public final /* synthetic */ J3kbcXHdl Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ zXvxcN9Gl kmSgne1rO;

    public aQYuuNulZ(J3kbcXHdl j3kbcXHdl, zXvxcN9Gl zxvxcn9gl, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.Bhmn1KIah = j3kbcXHdl;
            this.kmSgne1rO = zxvxcn9gl;
            return;
        }
        this.Bhmn1KIah = j3kbcXHdl;
        this.kmSgne1rO = zxvxcn9gl;
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                if (this.Bhmn1KIah.J4Ux7ym32.contains(this.kmSgne1rO)) {
                    zXvxcN9Gl zxvxcn9gl = this.kmSgne1rO;
                    zxvxcn9gl.q3BipwRCk.q3BipwRCk(zxvxcn9gl.tGV7Q6urW.EBQXiIPmm);
                    return;
                }
                return;
            default:
                this.Bhmn1KIah.J4Ux7ym32.remove(this.kmSgne1rO);
                this.Bhmn1KIah.tGV7Q6urW.remove(this.kmSgne1rO);
                return;
        }
    }
}
