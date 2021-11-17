package con;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class VWNUggT0w extends s4jYW5jpn {
    public final String Bhmn1KIah;
    public final VWNUggT0w MzoOEjc4X;
    public final boolean PSTqBLTET;
    private volatile VWNUggT0w _immediate;
    public final Handler kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VWNUggT0w(Handler handler, String str, boolean z) {
        super(null);
        VWNUggT0w vWNUggT0w = null;
        this.kmSgne1rO = handler;
        this.Bhmn1KIah = str;
        this.PSTqBLTET = z;
        this._immediate = z ? this : vWNUggT0w;
        VWNUggT0w vWNUggT0w2 = this._immediate;
        if (vWNUggT0w2 == null) {
            vWNUggT0w2 = new VWNUggT0w(handler, str, true);
            this._immediate = vWNUggT0w2;
        }
        this.MzoOEjc4X = vWNUggT0w2;
    }

    @Override // con.xaeEKvU2c
    public void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        if (!this.kmSgne1rO.post(runnable)) {
            oon79WMrY(bu5cjmae6, runnable);
        }
    }

    @Override // con.XUDDOHuAx
    public void dIocxURUo(long j, Z3EvbqMGQ z3EvbqMGQ) {
        DJbXkgfuR dJbXkgfuR = new DJbXkgfuR(z3EvbqMGQ, this);
        if (this.kmSgne1rO.postDelayed(dJbXkgfuR, cT9gik1zL.J4Ux7ym32(j, 4611686018427387903L))) {
            ((tmgChDFqU) z3EvbqMGQ).RG6kpfv3v(new Idi5q1pZn(this, dJbXkgfuR));
            return;
        }
        oon79WMrY(((tmgChDFqU) z3EvbqMGQ).MzoOEjc4X, dJbXkgfuR);
    }

    public boolean equals(Object obj) {
        return (obj instanceof VWNUggT0w) && ((VWNUggT0w) obj).kmSgne1rO == this.kmSgne1rO;
    }

    public int hashCode() {
        return System.identityHashCode(this.kmSgne1rO);
    }

    public final void oon79WMrY(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        int i = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
        if (jEWwjBE8f != null) {
            ((Zgh96z4e6) jEWwjBE8f).oon79WMrY(cancellationException);
        }
        ((Iu1wdxGcB) tQmFGxsat.tGV7Q6urW).oon79WMrY(runnable, false);
    }

    @Override // con.XUDDOHuAx
    public clUYjTSq7 tGV7Q6urW(long j, Runnable runnable, bu5cjmae6 bu5cjmae6) {
        if (this.kmSgne1rO.postDelayed(runnable, cT9gik1zL.J4Ux7ym32(j, 4611686018427387903L))) {
            return new DkurTpQlf(this, runnable);
        }
        oon79WMrY(bu5cjmae6, runnable);
        return JNEteW1Z7.CBQ5d1kRq;
    }

    @Override // con.xaeEKvU2c, java.lang.Object
    public String toString() {
        String str;
        VWNUggT0w vWNUggT0w;
        xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
        zkUmn2JpE zkumn2jpe = ZezE4t3SB.q3BipwRCk;
        if (this == zkumn2jpe) {
            str = "Dispatchers.Main";
        } else {
            try {
                vWNUggT0w = ((VWNUggT0w) zkumn2jpe).MzoOEjc4X;
            } catch (UnsupportedOperationException unused) {
                vWNUggT0w = null;
            }
            str = this == vWNUggT0w ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.Bhmn1KIah;
        if (str2 == null) {
            str2 = this.kmSgne1rO.toString();
        }
        return this.PSTqBLTET ? anXlDk6fV.iMyQMM6Qj(str2, ".immediate") : str2;
    }

    @Override // con.xaeEKvU2c
    public boolean yWvV4ePLl(bu5cjmae6 bu5cjmae6) {
        return !this.PSTqBLTET || !anXlDk6fV.tGV7Q6urW(Looper.myLooper(), this.kmSgne1rO.getLooper());
    }
}
