package con;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* loaded from: classes.dex */
public final class OHQikj1zE extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ long Bhmn1KIah;
    public final /* synthetic */ int PSTqBLTET;
    public final /* synthetic */ FJQyC64rH kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OHQikj1zE(FJQyC64rH fJQyC64rH, long j, int i) {
        super(0);
        this.kmSgne1rO = fJQyC64rH;
        this.Bhmn1KIah = j;
        this.PSTqBLTET = i;
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        jvKy1qifN jvky1qifn;
        FJQyC64rH fJQyC64rH = this.kmSgne1rO;
        long j = this.Bhmn1KIah;
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        if (!bO2dbmrf7.tGV7Q6urW(j, bO2dbmrf7.Puu3Rhg4F)) {
            long j2 = this.Bhmn1KIah;
            int i = this.PSTqBLTET;
            jvky1qifn = new jvKy1qifN(Build.VERSION.SDK_INT >= 29 ? vIcgjOlkC.q3BipwRCk.q3BipwRCk(j2, i) : new PorterDuffColorFilter(xpuSUT7Gh.R2hkbNqWf(j2), xP6F5SR9v.dXrmkklc8(i)));
        } else {
            jvky1qifn = null;
        }
        fJQyC64rH.GPLPRo6go.iiGwOFFnr = jvky1qifn;
        return qih4lW99W.q3BipwRCk;
    }
}
