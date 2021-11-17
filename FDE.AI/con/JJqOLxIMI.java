package con;
/* loaded from: classes.dex */
public final class JJqOLxIMI extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ wjjWl3mHt Bhmn1KIah;
    public final /* synthetic */ wjjWl3mHt PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJqOLxIMI(wjjWl3mHt wjjwl3mht, wjjWl3mHt wjjwl3mht2, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = wjjwl3mht;
            this.PSTqBLTET = wjjwl3mht2;
            return;
        }
        this.Bhmn1KIah = wjjwl3mht;
        this.PSTqBLTET = wjjwl3mht2;
        super(1);
    }

    @Override // con.PmanMZxiM
    public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk((oGM5mmQi7) obj);
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk((oGM5mmQi7) obj);
                return qih4lW99W.q3BipwRCk;
        }
    }

    public final void q3BipwRCk(oGM5mmQi7 ogm5mmqi7) {
        switch (this.kmSgne1rO) {
            case 0:
                oGM5mmQi7.q3BipwRCk(ogm5mmqi7, "key", this.Bhmn1KIah.q3BipwRCk(), null, false, 12);
                oGM5mmQi7.q3BipwRCk(ogm5mmqi7, "value", this.PSTqBLTET.q3BipwRCk(), null, false, 12);
                return;
            default:
                oGM5mmQi7.q3BipwRCk(ogm5mmqi7, "first", this.Bhmn1KIah.q3BipwRCk(), null, false, 12);
                oGM5mmQi7.q3BipwRCk(ogm5mmqi7, "second", this.PSTqBLTET.q3BipwRCk(), null, false, 12);
                return;
        }
    }
}
