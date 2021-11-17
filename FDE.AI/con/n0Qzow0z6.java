package con;
/* loaded from: classes.dex */
public final class n0Qzow0z6 extends Cb827Z4La {
    public static final /* synthetic */ int V9LQMKGJe = 0;
    public final /* synthetic */ int o4LF8RkoQ = 1;

    public n0Qzow0z6(qhaZGYFO8 qhazgyfo8, pKrUFkOCk pkrufkock) {
        super(qhazgyfo8, pkrufkock);
    }

    /* JADX WARN: Finally extract failed */
    @Override // con.Cb827Z4La, con.hKxHUWEcH
    public n2gATecRC dIocxURUo(long j) {
        OIP2vionU snapshotObserver;
        switch (this.o4LF8RkoQ) {
            case 1:
                super.dIocxURUo(j);
                nwvyEZJPU nwvyezjpu = new nwvyEZJPU(this);
                jRWr6Yc4S jrwr6yc4s = this.MzoOEjc4X.qVUwofr5s;
                qih4lW99W qih4lw99w = null;
                if (!(jrwr6yc4s == null || (snapshotObserver = jrwr6yc4s.getSnapshotObserver()) == null)) {
                    ZcF0ya1BQ zcF0ya1BQ = snapshotObserver.q3BipwRCk;
                    boolean z = zcF0ya1BQ.GPLPRo6go;
                    zcF0ya1BQ.GPLPRo6go = true;
                    try {
                        nwvyezjpu.GPLPRo6go();
                        zcF0ya1BQ.GPLPRo6go = z;
                        qih4lw99w = qih4lW99W.q3BipwRCk;
                    } catch (Throwable th) {
                        zcF0ya1BQ.GPLPRo6go = z;
                        throw th;
                    }
                }
                if (qih4lw99w == null) {
                    nwvyezjpu.GPLPRo6go();
                }
                return this;
            default:
                super.dIocxURUo(j);
                return this;
        }
    }

    @Override // con.qhaZGYFO8
    public Object hKeU0pt2N(PJrc76djZ pJrc76djZ) {
        switch (this.o4LF8RkoQ) {
            case 0:
                return anXlDk6fV.tGV7Q6urW(((pKrUFkOCk) this.NyWTwPF6V).getKey(), pJrc76djZ) ? ((pKrUFkOCk) this.NyWTwPF6V).getValue() : super.hKeU0pt2N(pJrc76djZ);
            default:
                return super.hKeU0pt2N(pJrc76djZ);
        }
    }

    public n0Qzow0z6(qhaZGYFO8 qhazgyfo8, EqtLMm2mw eqtLMm2mw) {
        super(qhazgyfo8, eqtLMm2mw);
    }
}
