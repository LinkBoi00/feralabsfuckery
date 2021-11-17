package con;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class ilRFFqvx8 implements Runnable {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ Object kmSgne1rO;

    public ilRFFqvx8(t5E8jan4S t5e8jan4s, List list, zXvxcN9Gl zxvxcn9gl) {
        this.CBQ5d1kRq = 2;
        this.PSTqBLTET = t5e8jan4s;
        this.kmSgne1rO = list;
        this.Bhmn1KIah = zxvxcn9gl;
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                ((uRyiqsiNk) this.kmSgne1rO).tGV7Q6urW((UxHHqhbTP) this.Bhmn1KIah, (ce8tBZHr1) this.PSTqBLTET);
                return;
            case 1:
                ((uRyiqsiNk) this.kmSgne1rO).tGV7Q6urW((UxHHqhbTP) this.Bhmn1KIah, (ce8tBZHr1) this.PSTqBLTET);
                return;
            default:
                if (((List) this.kmSgne1rO).contains((zXvxcN9Gl) this.Bhmn1KIah)) {
                    ((List) this.kmSgne1rO).remove((zXvxcN9Gl) this.Bhmn1KIah);
                    zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) this.Bhmn1KIah;
                    Objects.requireNonNull((t5E8jan4S) this.PSTqBLTET);
                    zxvxcn9gl.q3BipwRCk.q3BipwRCk(zxvxcn9gl.tGV7Q6urW.EBQXiIPmm);
                    return;
                }
                return;
        }
    }

    public ilRFFqvx8(uRyiqsiNk uryiqsink, UxHHqhbTP uxHHqhbTP, ce8tBZHr1 ce8tbzhr1, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = uryiqsink;
            this.Bhmn1KIah = uxHHqhbTP;
            this.PSTqBLTET = ce8tbzhr1;
            return;
        }
        this.kmSgne1rO = uryiqsink;
        this.Bhmn1KIah = uxHHqhbTP;
        this.PSTqBLTET = ce8tbzhr1;
    }
}
