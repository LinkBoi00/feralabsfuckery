package con;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
/* loaded from: classes.dex */
public class STF3DPfJi extends ContentObserver {
    public final /* synthetic */ IkIPSLCvr q3BipwRCk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public STF3DPfJi(IkIPSLCvr ikIPSLCvr) {
        super(new Handler());
        this.q3BipwRCk = ikIPSLCvr;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        IkIPSLCvr ikIPSLCvr = this.q3BipwRCk;
        if (ikIPSLCvr.kmSgne1rO && (cursor = ikIPSLCvr.Bhmn1KIah) != null && !cursor.isClosed()) {
            ikIPSLCvr.CBQ5d1kRq = ikIPSLCvr.Bhmn1KIah.requery();
        }
    }
}
