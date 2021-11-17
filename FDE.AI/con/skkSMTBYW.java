package con;
/* loaded from: classes.dex */
public final class skkSMTBYW extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ cnnoFa4Tx Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skkSMTBYW(cnnoFa4Tx cnnofa4tx, int i) {
        super(0);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = cnnofa4tx;
            return;
        }
        this.Bhmn1KIah = cnnofa4tx;
        super(0);
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        switch (this.kmSgne1rO) {
            case 0:
                return fAbN97osx.q3BipwRCk(this.Bhmn1KIah.dIocxURUo());
            default:
                return Float.valueOf((((float) this.Bhmn1KIah.kCA6Zs9sL()) / 100000.0f) + ((float) this.Bhmn1KIah.dIocxURUo()));
        }
    }
}
