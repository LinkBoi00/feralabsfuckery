package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import con.J6Ggjrgp5;
import con.aBjutDvc3;
import con.k5WAg6czX;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class aXI58Y1kr implements Runnable {
    public static final ThreadLocal MzoOEjc4X = new ThreadLocal();
    public static Comparator ilHKhw3Yw = new J6Ggjrgp5();
    public long Bhmn1KIah;
    public ArrayList CBQ5d1kRq = new ArrayList();
    public ArrayList PSTqBLTET = new ArrayList();
    public long kmSgne1rO;

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class RG2GI7LDp implements RecyclerView.LULQkQlc9.RG2GI7LDp {
        public int J4Ux7ym32;
        public int dIocxURUo;
        public int q3BipwRCk;
        public int[] tGV7Q6urW;

        public void J4Ux7ym32(RecyclerView recyclerView, boolean z) {
            this.dIocxURUo = 0;
            int[] iArr = this.tGV7Q6urW;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LULQkQlc9 lULQkQlc9 = recyclerView.WaUP0CF08;
            if (recyclerView.sk5s77z6Q != null && lULQkQlc9 != null && lULQkQlc9.yWvV4ePLl) {
                if (z) {
                    if (!recyclerView.PSTqBLTET.GPLPRo6go()) {
                        lULQkQlc9.oon79WMrY(recyclerView.sk5s77z6Q.q3BipwRCk(), this);
                    }
                } else if (!recyclerView.igRQEZxnW()) {
                    lULQkQlc9.yWvV4ePLl(this.q3BipwRCk, this.J4Ux7ym32, recyclerView.KlYagMRWx, this);
                }
                int i = this.dIocxURUo;
                if (i > lULQkQlc9.oon79WMrY) {
                    lULQkQlc9.oon79WMrY = i;
                    lULQkQlc9.vPSbyrYWX = z;
                    recyclerView.kmSgne1rO.CBQ5d1kRq();
                }
            }
        }

        public void q3BipwRCk(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.dIocxURUo * 2;
                int[] iArr = this.tGV7Q6urW;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.tGV7Q6urW = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.tGV7Q6urW = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.tGV7Q6urW;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.dIocxURUo++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public boolean tGV7Q6urW(int i) {
            if (this.tGV7Q6urW != null) {
                int i2 = this.dIocxURUo * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.tGV7Q6urW[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void J4Ux7ym32(long j) {
        k5WAg6czX k5wag6czx;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        k5WAg6czX k5wag6czx2;
        int size = this.CBQ5d1kRq.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) this.CBQ5d1kRq.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.buPcffgdD.J4Ux7ym32(recyclerView3, false);
                i += recyclerView3.buPcffgdD.dIocxURUo;
            }
        }
        this.PSTqBLTET.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) this.CBQ5d1kRq.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                RG2GI7LDp rG2GI7LDp = recyclerView4.buPcffgdD;
                int abs = Math.abs(rG2GI7LDp.J4Ux7ym32) + Math.abs(rG2GI7LDp.q3BipwRCk);
                for (int i5 = 0; i5 < rG2GI7LDp.dIocxURUo * 2; i5 += 2) {
                    if (i3 >= this.PSTqBLTET.size()) {
                        k5wag6czx2 = new k5WAg6czX();
                        this.PSTqBLTET.add(k5wag6czx2);
                    } else {
                        k5wag6czx2 = (k5WAg6czX) this.PSTqBLTET.get(i3);
                    }
                    int[] iArr = rG2GI7LDp.tGV7Q6urW;
                    int i6 = iArr[i5 + 1];
                    k5wag6czx2.q3BipwRCk = i6 <= abs;
                    k5wag6czx2.J4Ux7ym32 = abs;
                    k5wag6czx2.tGV7Q6urW = i6;
                    k5wag6czx2.dIocxURUo = recyclerView4;
                    k5wag6czx2.kCA6Zs9sL = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.PSTqBLTET, ilHKhw3Yw);
        int i7 = 0;
        while (i7 < this.PSTqBLTET.size() && (recyclerView = (k5wag6czx = (k5WAg6czX) this.PSTqBLTET.get(i7)).dIocxURUo) != null) {
            RecyclerView.cywn6086a tGV7Q6urW = tGV7Q6urW(recyclerView, k5wag6czx.kCA6Zs9sL, k5wag6czx.q3BipwRCk ? Long.MAX_VALUE : j);
            if (!(tGV7Q6urW == null || tGV7Q6urW.J4Ux7ym32 == null || !tGV7Q6urW.yWvV4ePLl() || tGV7Q6urW.oon79WMrY() || (recyclerView2 = (RecyclerView) tGV7Q6urW.J4Ux7ym32.get()) == null)) {
                if (recyclerView2.QNqj6nIzv && recyclerView2.MzoOEjc4X.Puu3Rhg4F() != 0) {
                    recyclerView2.BL4OzhZBd();
                }
                RG2GI7LDp rG2GI7LDp2 = recyclerView2.buPcffgdD;
                rG2GI7LDp2.J4Ux7ym32(recyclerView2, true);
                if (rG2GI7LDp2.dIocxURUo != 0) {
                    try {
                        int i8 = aBjutDvc3.q3BipwRCk;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.kvFwRYSUX kvfwrysux = recyclerView2.KlYagMRWx;
                        RecyclerView.s7MlVynBG s7mlvynbg = recyclerView2.sk5s77z6Q;
                        kvfwrysux.dIocxURUo = 1;
                        kvfwrysux.kCA6Zs9sL = s7mlvynbg.q3BipwRCk();
                        kvfwrysux.GPLPRo6go = false;
                        kvfwrysux.Puu3Rhg4F = false;
                        kvfwrysux.yWvV4ePLl = false;
                        for (int i9 = 0; i9 < rG2GI7LDp2.dIocxURUo * 2; i9 += 2) {
                            tGV7Q6urW(recyclerView2, rG2GI7LDp2.tGV7Q6urW[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = aBjutDvc3.q3BipwRCk;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            k5wag6czx.q3BipwRCk = false;
            k5wag6czx.J4Ux7ym32 = 0;
            k5wag6czx.tGV7Q6urW = 0;
            k5wag6czx.dIocxURUo = null;
            k5wag6czx.kCA6Zs9sL = 0;
            i7++;
        }
    }

    public void q3BipwRCk(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.kmSgne1rO == 0) {
            this.kmSgne1rO = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        RG2GI7LDp rG2GI7LDp = recyclerView.buPcffgdD;
        rG2GI7LDp.q3BipwRCk = i;
        rG2GI7LDp.J4Ux7ym32 = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i = aBjutDvc3.q3BipwRCk;
            Trace.beginSection("RV Prefetch");
            if (this.CBQ5d1kRq.isEmpty()) {
                this.kmSgne1rO = 0;
                Trace.endSection();
                return;
            }
            int size = this.CBQ5d1kRq.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) this.CBQ5d1kRq.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.kmSgne1rO = 0;
                Trace.endSection();
                return;
            }
            J4Ux7ym32(TimeUnit.MILLISECONDS.toNanos(j) + this.Bhmn1KIah);
            this.kmSgne1rO = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.kmSgne1rO = 0;
            int i3 = aBjutDvc3.q3BipwRCk;
            Trace.endSection();
            throw th;
        }
    }

    public final RecyclerView.cywn6086a tGV7Q6urW(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int Puu3Rhg4F = recyclerView.MzoOEjc4X.Puu3Rhg4F();
        int i2 = 0;
        while (true) {
            if (i2 >= Puu3Rhg4F) {
                z = false;
                break;
            }
            RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(recyclerView.MzoOEjc4X.GPLPRo6go(i2));
            if (V9LQMKGJe.tGV7Q6urW == i && !V9LQMKGJe.oon79WMrY()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
        try {
            recyclerView.L4EwGfXiQ();
            RecyclerView.cywn6086a oon79WMrY = v1xq9aVRv.oon79WMrY(i, false, j);
            if (oon79WMrY != null) {
                if (!oon79WMrY.yWvV4ePLl() || oon79WMrY.oon79WMrY()) {
                    v1xq9aVRv.q3BipwRCk(oon79WMrY, false);
                } else {
                    v1xq9aVRv.GPLPRo6go(oon79WMrY.q3BipwRCk);
                }
            }
            return oon79WMrY;
        } finally {
            recyclerView.zHl31GGXU(false);
        }
    }
}
