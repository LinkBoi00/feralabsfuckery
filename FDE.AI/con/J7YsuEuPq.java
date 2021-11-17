package con;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class J7YsuEuPq extends xaeEKvU2c {
    public final Handler Bhmn1KIah;
    public boolean Eeka1udhb;
    public boolean dXrmkklc8;
    public final Kh7ffW4RH ixWaw2akD;
    public final Choreographer kmSgne1rO;
    public static final ksLrMHgEz sk5s77z6Q = new ksLrMHgEz(null, 27);
    public static final llWJsfBCK WaUP0CF08 = anXlDk6fV.ixWaw2akD(VSocs6HGb.iMyQMM6Qj);
    public static final ThreadLocal i8XZMQc6Z = new tZN5pzFHT();
    public final Object PSTqBLTET = new Object();
    public final YCMtDn7Mw MzoOEjc4X = new YCMtDn7Mw();
    public List ilHKhw3Yw = new ArrayList();
    public List qVUwofr5s = new ArrayList();
    public final ZOfhUHBes RG6kpfv3v = new ZOfhUHBes(this);

    public J7YsuEuPq(Choreographer choreographer, Handler handler, dnBSj5uJN dnbsj5ujn) {
        this.kmSgne1rO = choreographer;
        this.Bhmn1KIah = handler;
        this.ixWaw2akD = new SbDM1N4Hj(choreographer);
    }

    public static final void oon79WMrY(J7YsuEuPq j7YsuEuPq) {
        boolean z;
        while (true) {
            Runnable vPSbyrYWX = j7YsuEuPq.vPSbyrYWX();
            if (vPSbyrYWX != null) {
                vPSbyrYWX.run();
            } else {
                synchronized (j7YsuEuPq.PSTqBLTET) {
                    z = false;
                    if (j7YsuEuPq.MzoOEjc4X.isEmpty()) {
                        j7YsuEuPq.Eeka1udhb = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    @Override // con.xaeEKvU2c
    public void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        synchronized (this.PSTqBLTET) {
            this.MzoOEjc4X.iiGwOFFnr(runnable);
            if (!this.Eeka1udhb) {
                this.Eeka1udhb = true;
                this.Bhmn1KIah.post(this.RG6kpfv3v);
                if (!this.dXrmkklc8) {
                    this.dXrmkklc8 = true;
                    this.kmSgne1rO.postFrameCallback(this.RG6kpfv3v);
                }
            }
        }
    }

    public final Runnable vPSbyrYWX() {
        Runnable runnable;
        synchronized (this.PSTqBLTET) {
            YCMtDn7Mw yCMtDn7Mw = this.MzoOEjc4X;
            runnable = (Runnable) (yCMtDn7Mw.isEmpty() ? null : yCMtDn7Mw.vPSbyrYWX());
        }
        return runnable;
    }
}
