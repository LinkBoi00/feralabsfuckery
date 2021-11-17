package con;

import android.database.DataSetObserver;
/* loaded from: classes.dex */
public class j2ocyIB2J extends DataSetObserver {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public j2ocyIB2J(IkIPSLCvr ikIPSLCvr) {
        this.J4Ux7ym32 = ikIPSLCvr;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        switch (this.q3BipwRCk) {
            case 0:
                if (((uBkGbmfhd) this.J4Ux7ym32).J4Ux7ym32()) {
                    ((uBkGbmfhd) this.J4Ux7ym32).GPLPRo6go();
                    return;
                }
                return;
            default:
                IkIPSLCvr ikIPSLCvr = (IkIPSLCvr) this.J4Ux7ym32;
                ikIPSLCvr.CBQ5d1kRq = true;
                ikIPSLCvr.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.q3BipwRCk) {
            case 0:
                ((uBkGbmfhd) this.J4Ux7ym32).dismiss();
                return;
            default:
                IkIPSLCvr ikIPSLCvr = (IkIPSLCvr) this.J4Ux7ym32;
                ikIPSLCvr.CBQ5d1kRq = false;
                ikIPSLCvr.notifyDataSetInvalidated();
                return;
        }
    }

    public j2ocyIB2J(uBkGbmfhd ubkgbmfhd) {
        this.J4Ux7ym32 = ubkgbmfhd;
    }
}
