package con;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class y7qLT84T0 extends Y371ZqMzx {
    public final Thread Bhmn1KIah;
    public final ev1IlyvL8 PSTqBLTET;

    public y7qLT84T0(bu5cjmae6 bu5cjmae6, Thread thread, ev1IlyvL8 ev1ilyvl8) {
        super(bu5cjmae6, true, true);
        this.Bhmn1KIah = thread;
        this.PSTqBLTET = ev1ilyvl8;
    }

    @Override // con.Zgh96z4e6
    public void Puu3Rhg4F(Object obj) {
        if (!anXlDk6fV.tGV7Q6urW(Thread.currentThread(), this.Bhmn1KIah)) {
            LockSupport.unpark(this.Bhmn1KIah);
        }
    }
}
