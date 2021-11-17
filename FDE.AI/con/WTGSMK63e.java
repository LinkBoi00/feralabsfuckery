package con;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class WTGSMK63e implements knaaJ6t3r, PANS4qE9Q, z11H8SJL7, Runnable, Choreographer.FrameCallback {
    public static long dfpT1j18n;
    public static final ksLrMHgEz i8XZMQc6Z = new ksLrMHgEz(null, 3);
    public final pW31wYUjR Bhmn1KIah;
    public final mKU9R6cnm CBQ5d1kRq;
    public long Eeka1udhb;
    public final View MzoOEjc4X;
    public final ZiaC7TNf1 PSTqBLTET;
    public boolean RG6kpfv3v;
    public boolean WaUP0CF08;
    public long dXrmkklc8;
    public boolean ixWaw2akD;
    public final bb216AtXv kmSgne1rO;
    public QMQpxZCHl qVUwofr5s;
    public int ilHKhw3Yw = -1;
    public final Choreographer sk5s77z6Q = Choreographer.getInstance();

    public WTGSMK63e(mKU9R6cnm mku9r6cnm, bb216AtXv bb216atxv, pW31wYUjR pw31wyujr, ZiaC7TNf1 ziaC7TNf1, View view) {
        this.CBQ5d1kRq = mku9r6cnm;
        this.kmSgne1rO = bb216atxv;
        this.Bhmn1KIah = pw31wyujr;
        this.PSTqBLTET = ziaC7TNf1;
        this.MzoOEjc4X = view;
        i8XZMQc6Z.J4Ux7ym32(view);
    }

    @Override // con.knaaJ6t3r
    public void J4Ux7ym32() {
        this.CBQ5d1kRq.q3BipwRCk = this;
        this.kmSgne1rO.kCA6Zs9sL = this;
        this.WaUP0CF08 = true;
    }

    public final long dIocxURUo(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = (long) 4;
        return (j / j3) + ((j2 / j3) * ((long) 3));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.WaUP0CF08) {
            this.MzoOEjc4X.post(this);
        }
    }

    public final QMQpxZCHl kCA6Zs9sL(x1XJraxts x1xjraxts, int i) {
        Object q3BipwRCk = x1xjraxts.q3BipwRCk(i);
        kkcQgCx5G q3BipwRCk2 = this.PSTqBLTET.q3BipwRCk(i, q3BipwRCk);
        pW31wYUjR pw31wyujr = this.Bhmn1KIah;
        pw31wyujr.tGV7Q6urW();
        if (!pw31wyujr.Puu3Rhg4F.containsKey(q3BipwRCk)) {
            Map map = pw31wyujr.oon79WMrY;
            Object obj = map.get(q3BipwRCk);
            if (obj == null) {
                if (pw31wyujr.vPSbyrYWX > 0) {
                    obj = pw31wyujr.iiGwOFFnr(q3BipwRCk);
                    pw31wyujr.dIocxURUo(pw31wyujr.J4Ux7ym32().yWvV4ePLl().indexOf(obj), pw31wyujr.J4Ux7ym32().yWvV4ePLl().size(), 1);
                } else {
                    obj = pw31wyujr.q3BipwRCk(pw31wyujr.J4Ux7ym32().yWvV4ePLl().size());
                }
                pw31wyujr.CBQ5d1kRq++;
                map.put(q3BipwRCk, obj);
            }
            pw31wyujr.kCA6Zs9sL((pLYbCSTk0) obj, q3BipwRCk, q3BipwRCk2);
        }
        return new QMQpxZCHl(pw31wyujr, q3BipwRCk);
    }

    @Override // con.knaaJ6t3r
    public void q3BipwRCk() {
        this.WaUP0CF08 = false;
        this.CBQ5d1kRq.q3BipwRCk = null;
        this.kmSgne1rO.kCA6Zs9sL = null;
        this.MzoOEjc4X.removeCallbacks(this);
        this.sk5s77z6Q.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Choreographer choreographer;
        if (this.ilHKhw3Yw != -1 && this.ixWaw2akD && this.WaUP0CF08) {
            boolean z = true;
            if (this.qVUwofr5s == null) {
                Trace.beginSection("compose:lazylist:prefetch:compose");
                try {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.MzoOEjc4X.getDrawingTime()) + dfpT1j18n;
                    long nanoTime = System.nanoTime();
                    if (nanoTime <= nanos && this.Eeka1udhb + nanoTime >= nanos) {
                        choreographer = this.sk5s77z6Q;
                        choreographer.postFrameCallback(this);
                    }
                    int i = this.ilHKhw3Yw;
                    x1XJraxts x1xjraxts = (x1XJraxts) this.kmSgne1rO.dIocxURUo.GPLPRo6go();
                    if (this.MzoOEjc4X.getWindowVisibility() == 0) {
                        if (i < 0 || i >= x1xjraxts.dIocxURUo()) {
                            z = false;
                        }
                        if (z) {
                            this.qVUwofr5s = kCA6Zs9sL(x1xjraxts, i);
                            this.Eeka1udhb = dIocxURUo(System.nanoTime() - nanoTime, this.Eeka1udhb);
                            choreographer = this.sk5s77z6Q;
                            choreographer.postFrameCallback(this);
                        }
                    }
                    this.ixWaw2akD = false;
                } finally {
                }
            } else {
                Trace.beginSection("compose:lazylist:prefetch:measure");
                try {
                    long nanos2 = TimeUnit.MILLISECONDS.toNanos(this.MzoOEjc4X.getDrawingTime()) + dfpT1j18n;
                    long nanoTime2 = System.nanoTime();
                    if (nanoTime2 <= nanos2 && this.dXrmkklc8 + nanoTime2 >= nanos2) {
                        this.sk5s77z6Q.postFrameCallback(this);
                    }
                    if (this.MzoOEjc4X.getWindowVisibility() == 0) {
                        this.RG6kpfv3v = true;
                        this.kmSgne1rO.q3BipwRCk();
                        this.dXrmkklc8 = dIocxURUo(System.nanoTime() - nanoTime2, this.dXrmkklc8);
                    }
                    this.ixWaw2akD = false;
                } finally {
                }
            }
        }
    }

    @Override // con.knaaJ6t3r
    public void tGV7Q6urW() {
    }
}
