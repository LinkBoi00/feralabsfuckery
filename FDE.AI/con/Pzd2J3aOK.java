package con;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class Pzd2J3aOK extends RecyclerView.Og6dYSoy7 {
    public final RecyclerView.wnbPPCp4x J4Ux7ym32 = new KIyQKya50(this);
    public Fj4Wp9wly dIocxURUo;
    public RecyclerView q3BipwRCk;
    public Fj4Wp9wly tGV7Q6urW;

    public final void GPLPRo6go() {
        if (this.q3BipwRCk.getOnFlingListener() == null) {
            this.q3BipwRCk.Puu3Rhg4F(this.J4Ux7ym32);
            this.q3BipwRCk.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final void J4Ux7ym32() {
        this.q3BipwRCk.DuuXfa7LE(this.J4Ux7ym32);
        this.q3BipwRCk.setOnFlingListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
        if (r2 < r7) goto L_0x00c1;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean Puu3Rhg4F(androidx.recyclerview.widget.RecyclerView.LULQkQlc9 r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Pzd2J3aOK.Puu3Rhg4F(androidx.recyclerview.widget.RecyclerView$LULQkQlc9, int, int):boolean");
    }

    public final View dIocxURUo(RecyclerView.LULQkQlc9 lULQkQlc9, Fj4Wp9wly fj4Wp9wly) {
        int WaUP0CF08 = lULQkQlc9.WaUP0CF08();
        View view = null;
        if (WaUP0CF08 == 0) {
            return null;
        }
        int CBQ5d1kRq = (fj4Wp9wly.CBQ5d1kRq() / 2) + fj4Wp9wly.vPSbyrYWX();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < WaUP0CF08; i2++) {
            View sk5s77z6Q = lULQkQlc9.sk5s77z6Q(i2);
            int abs = Math.abs(((fj4Wp9wly.tGV7Q6urW(sk5s77z6Q) / 2) + fj4Wp9wly.kCA6Zs9sL(sk5s77z6Q)) - CBQ5d1kRq);
            if (abs < i) {
                view = sk5s77z6Q;
                i = abs;
            }
        }
        return view;
    }

    public final Fj4Wp9wly iiGwOFFnr(RecyclerView.LULQkQlc9 lULQkQlc9) {
        Fj4Wp9wly fj4Wp9wly = this.tGV7Q6urW;
        if (fj4Wp9wly == null || fj4Wp9wly.q3BipwRCk != lULQkQlc9) {
            this.tGV7Q6urW = new Q58fcynSX(lULQkQlc9);
        }
        return this.tGV7Q6urW;
    }

    public final Fj4Wp9wly kCA6Zs9sL(RecyclerView.LULQkQlc9 lULQkQlc9) {
        Fj4Wp9wly fj4Wp9wly = this.dIocxURUo;
        if (fj4Wp9wly == null || fj4Wp9wly.q3BipwRCk != lULQkQlc9) {
            this.dIocxURUo = new zBnrA98bV(lULQkQlc9);
        }
        return this.dIocxURUo;
    }

    public int[] q3BipwRCk(RecyclerView.LULQkQlc9 lULQkQlc9, View view) {
        int[] iArr = new int[2];
        if (lULQkQlc9.kCA6Zs9sL()) {
            iArr[0] = tGV7Q6urW(view, kCA6Zs9sL(lULQkQlc9));
        } else {
            iArr[0] = 0;
        }
        if (lULQkQlc9.iiGwOFFnr()) {
            iArr[1] = tGV7Q6urW(view, iiGwOFFnr(lULQkQlc9));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int tGV7Q6urW(View view, Fj4Wp9wly fj4Wp9wly) {
        return ((fj4Wp9wly.tGV7Q6urW(view) / 2) + fj4Wp9wly.kCA6Zs9sL(view)) - ((fj4Wp9wly.CBQ5d1kRq() / 2) + fj4Wp9wly.vPSbyrYWX());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void yWvV4ePLl() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.q3BipwRCk
            if (r0 != 0) goto L_0x0005
            goto L_0x0045
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$LULQkQlc9 r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000c
            goto L_0x0045
        L_0x000c:
            boolean r1 = r0.iiGwOFFnr()
            if (r1 == 0) goto L_0x0017
            con.Fj4Wp9wly r1 = r10.iiGwOFFnr(r0)
            goto L_0x0021
        L_0x0017:
            boolean r1 = r0.kCA6Zs9sL()
            if (r1 == 0) goto L_0x0026
            con.Fj4Wp9wly r1 = r10.kCA6Zs9sL(r0)
        L_0x0021:
            android.view.View r1 = r10.dIocxURUo(r0, r1)
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            if (r1 != 0) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            int[] r0 = r10.q3BipwRCk(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x0038
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0045
        L_0x0038:
            androidx.recyclerview.widget.RecyclerView r4 = r10.q3BipwRCk
            r5 = r0[r1]
            r6 = r0[r3]
            r9 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            r4.Dr7UqlxEV(r5, r6, r7, r8, r9)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Pzd2J3aOK.yWvV4ePLl():void");
    }
}
