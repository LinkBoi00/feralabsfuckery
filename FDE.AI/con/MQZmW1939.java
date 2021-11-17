package con;

import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class MQZmW1939 implements Runnable {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ uBkGbmfhd kmSgne1rO;

    public MQZmW1939(uBkGbmfhd ubkgbmfhd, int i) {
        this.CBQ5d1kRq = i;
        if (i == 1) {
            this.kmSgne1rO = ubkgbmfhd;
        } else if (i != 2) {
            this.kmSgne1rO = ubkgbmfhd;
        } else {
            this.kmSgne1rO = ubkgbmfhd;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                View view = this.kmSgne1rO.dfpT1j18n;
                if (view != null && view.getWindowToken() != null) {
                    this.kmSgne1rO.GPLPRo6go();
                    return;
                }
                return;
            case 1:
                wRt60CcGM wrt60ccgm = this.kmSgne1rO.Bhmn1KIah;
                if (wrt60ccgm != null) {
                    wrt60ccgm.setListSelectionHidden(true);
                    wrt60ccgm.requestLayout();
                    return;
                }
                return;
            default:
                wRt60CcGM wrt60ccgm2 = this.kmSgne1rO.Bhmn1KIah;
                if (wrt60ccgm2 != null) {
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    if (mN6fklC4R.J4Ux7ym32(wrt60ccgm2) && this.kmSgne1rO.Bhmn1KIah.getCount() > this.kmSgne1rO.Bhmn1KIah.getChildCount()) {
                        int childCount = this.kmSgne1rO.Bhmn1KIah.getChildCount();
                        uBkGbmfhd ubkgbmfhd = this.kmSgne1rO;
                        if (childCount <= ubkgbmfhd.WaUP0CF08) {
                            ubkgbmfhd.vNtjxmzUM.setInputMethodMode(2);
                            this.kmSgne1rO.GPLPRo6go();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
