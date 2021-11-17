package con;

import android.graphics.Typeface;
import android.os.Handler;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class UcCYfgGXO implements Runnable {
    public Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 2;
    public Object PSTqBLTET;
    public Object kmSgne1rO;

    public UcCYfgGXO(Handler handler, Callable callable, F5n0QAijb f5n0QAijb) {
        this.kmSgne1rO = callable;
        this.Bhmn1KIah = f5n0QAijb;
        this.PSTqBLTET = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        switch (this.CBQ5d1kRq) {
            case 0:
                Typeface typeface = (Typeface) this.Bhmn1KIah;
                DfseMYa7G dfseMYa7G = (DfseMYa7G) ((rPR8g1Ebn) this.kmSgne1rO).J4Ux7ym32;
                if (dfseMYa7G != null) {
                    dfseMYa7G.iiGwOFFnr(typeface);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.Bhmn1KIah;
                hSSq1qu2s hssq1qu2s = (hSSq1qu2s) ((F5n0QAijb) this.kmSgne1rO);
                switch (hssq1qu2s.q3BipwRCk) {
                    case 0:
                        hssq1qu2s.q3BipwRCk((OLEAwlv46) obj2);
                        return;
                    default:
                        hssq1qu2s.q3BipwRCk((OLEAwlv46) obj2);
                        return;
                }
            default:
                try {
                    obj = ((Callable) this.kmSgne1rO).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.PSTqBLTET).post(new UcCYfgGXO(this, (F5n0QAijb) this.Bhmn1KIah, obj));
                return;
        }
    }

    public UcCYfgGXO(PlegqbMSA plegqbMSA, rPR8g1Ebn rpr8g1ebn, Typeface typeface) {
        this.PSTqBLTET = plegqbMSA;
        this.kmSgne1rO = rpr8g1ebn;
        this.Bhmn1KIah = typeface;
    }

    public UcCYfgGXO(UcCYfgGXO ucCYfgGXO, F5n0QAijb f5n0QAijb, Object obj) {
        this.PSTqBLTET = ucCYfgGXO;
        this.kmSgne1rO = f5n0QAijb;
        this.Bhmn1KIah = obj;
    }
}
