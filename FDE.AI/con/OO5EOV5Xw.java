package con;
/* loaded from: classes.dex */
public final class OO5EOV5Xw extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ kdbvrtBH1 Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OO5EOV5Xw(kdbvrtBH1 kdbvrtbh1, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = kdbvrtbh1;
            super(1);
        } else if (i != 2) {
            this.Bhmn1KIah = kdbvrtbh1;
        } else {
            this.Bhmn1KIah = kdbvrtbh1;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                long longValue = ((Number) obj).longValue();
                if (!this.Bhmn1KIah.GPLPRo6go()) {
                    this.Bhmn1KIah.Puu3Rhg4F(longValue / 1);
                }
                return qih4lW99W.q3BipwRCk;
            case 1:
                return q3BipwRCk((ro5oMV4A2) obj);
            default:
                return q3BipwRCk((ro5oMV4A2) obj);
        }
    }

    public y0FAKpZVf q3BipwRCk(ro5oMV4A2 ro5omv4a2) {
        switch (this.kmSgne1rO) {
            case 1:
                return new ZJpslIIh7(this.Bhmn1KIah, 0);
            default:
                return new ZJpslIIh7(this.Bhmn1KIah, 1);
        }
    }
}
