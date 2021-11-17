package con;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class GMoVReYTY extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ nPZZG1232 Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMoVReYTY(nPZZG1232 npzzg1232, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = npzzg1232;
            return;
        }
        this.Bhmn1KIah = npzzg1232;
        super(1);
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                gdEmqfwpT gdemqfwpt = (gdEmqfwpT) obj;
                if (anXlDk6fV.tGV7Q6urW(Looper.myLooper(), Looper.getMainLooper())) {
                    gdemqfwpt.GPLPRo6go();
                } else {
                    Handler handler = this.Bhmn1KIah.kmSgne1rO;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        this.Bhmn1KIah.kmSgne1rO = handler;
                    }
                    handler.post(new OD5M57NUq(gdemqfwpt, 1));
                }
                return qih4lW99W.q3BipwRCk;
            default:
                qih4lW99W qih4lw99w = (qih4lW99W) obj;
                this.Bhmn1KIah.PSTqBLTET = true;
                return qih4lW99W.q3BipwRCk;
        }
    }
}
