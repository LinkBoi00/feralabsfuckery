package con;
/* loaded from: classes.dex */
public final class MHI3maOyb extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ PmanMZxiM Bhmn1KIah;
    public final /* synthetic */ PmanMZxiM PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHI3maOyb(PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = pmanMZxiM;
            this.PSTqBLTET = pmanMZxiM2;
            super(1);
        } else if (i == 2) {
            this.Bhmn1KIah = pmanMZxiM;
            this.PSTqBLTET = pmanMZxiM2;
            super(1);
        } else if (i != 3) {
            this.Bhmn1KIah = pmanMZxiM;
            this.PSTqBLTET = pmanMZxiM2;
        } else {
            this.Bhmn1KIah = pmanMZxiM;
            this.PSTqBLTET = pmanMZxiM2;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        int i;
        switch (this.kmSgne1rO) {
            case 0:
                Uhy55gmtq uhy55gmtq = (Uhy55gmtq) obj;
                synchronized (UvOuyIFuT.J4Ux7ym32) {
                    i = UvOuyIFuT.dIocxURUo;
                    UvOuyIFuT.dIocxURUo = i + 1;
                }
                return new YcVx1OAEe(i, uhy55gmtq, this.Bhmn1KIah, this.PSTqBLTET);
            case 1:
                q3BipwRCk(obj);
                return qih4lW99W.q3BipwRCk;
            case 2:
                q3BipwRCk(obj);
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk(obj);
                return qih4lW99W.q3BipwRCk;
        }
    }

    public void q3BipwRCk(Object obj) {
        switch (this.kmSgne1rO) {
            case 1:
                this.Bhmn1KIah.IytU16YUK(obj);
                this.PSTqBLTET.IytU16YUK(obj);
                return;
            case 2:
                this.Bhmn1KIah.IytU16YUK(obj);
                this.PSTqBLTET.IytU16YUK(obj);
                return;
            default:
                this.Bhmn1KIah.IytU16YUK(obj);
                this.PSTqBLTET.IytU16YUK(obj);
                return;
        }
    }
}
