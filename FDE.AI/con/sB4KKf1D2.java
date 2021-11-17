package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class sB4KKf1D2 extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ WQpIMzWun Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sB4KKf1D2(WQpIMzWun wQpIMzWun, int i) {
        super(0);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = wQpIMzWun;
            return;
        }
        this.Bhmn1KIah = wQpIMzWun;
        super(0);
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        switch (this.kmSgne1rO) {
            case 0:
                return Float.valueOf(this.Bhmn1KIah.getContext().getResources().getDimension(R.dimen.md_dialog_default_corner_radius));
            default:
                return Integer.valueOf(idpM54xlp.iMyQMM6Qj(this.Bhmn1KIah, null, Integer.valueOf((int) R.attr.colorBackgroundFloating), null, 5));
        }
    }
}
