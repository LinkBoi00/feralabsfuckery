package con;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* loaded from: classes.dex */
public abstract class yu2QUAlaV extends cs4d8hjG8 {
    public final int Bhmn1KIah;
    public final String MzoOEjc4X;
    public final long PSTqBLTET;
    public zDz8HlHNv ilHKhw3Yw;
    public final int kmSgne1rO;

    public yu2QUAlaV(int i, int i2, String str, int i3) {
        i = (i3 & 1) != 0 ? wq9HUSqWV.J4Ux7ym32 : i;
        i2 = (i3 & 2) != 0 ? wq9HUSqWV.tGV7Q6urW : i2;
        String str2 = (i3 & 4) != 0 ? "DefaultDispatcher" : null;
        long j = wq9HUSqWV.dIocxURUo;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = i2;
        this.PSTqBLTET = j;
        this.MzoOEjc4X = str2;
        this.ilHKhw3Yw = new zDz8HlHNv(i, i2, j, str2);
    }

    @Override // con.xaeEKvU2c
    public void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        try {
            zDz8HlHNv zdz8hlhnv = this.ilHKhw3Yw;
            AtomicLongFieldUpdater atomicLongFieldUpdater = zDz8HlHNv.Eeka1udhb;
            zdz8hlhnv.dIocxURUo(runnable, djFtLGhoA.CBQ5d1kRq, false);
        } catch (RejectedExecutionException unused) {
            uJ8K7bc8r.Eeka1udhb.qVUwofr5s(runnable);
        }
    }
}
