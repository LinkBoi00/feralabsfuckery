package con;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final class MVyDqfW5Z implements Choreographer.FrameCallback {
    public final /* synthetic */ Z3EvbqMGQ CBQ5d1kRq;
    public final /* synthetic */ PmanMZxiM kmSgne1rO;

    public MVyDqfW5Z(Z3EvbqMGQ z3EvbqMGQ, SbDM1N4Hj sbDM1N4Hj, PmanMZxiM pmanMZxiM) {
        this.CBQ5d1kRq = z3EvbqMGQ;
        this.kmSgne1rO = pmanMZxiM;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object obj;
        Z3EvbqMGQ z3EvbqMGQ = this.CBQ5d1kRq;
        try {
            obj = this.kmSgne1rO.IytU16YUK(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new qlt0VySXJ(th);
        }
        ((tmgChDFqU) z3EvbqMGQ).Bhmn1KIah(obj);
    }
}
