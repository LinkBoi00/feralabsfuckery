package con;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class rmnr4niPx implements Iterator, f7VKpcPHS {
    public int Bhmn1KIah;
    public int CBQ5d1kRq = -1;
    public int MzoOEjc4X;
    public G8ebKyy85 PSTqBLTET;
    public final /* synthetic */ yMAbTMUQe ilHKhw3Yw;
    public int kmSgne1rO;

    public rmnr4niPx(yMAbTMUQe ymabtmuqe) {
        this.ilHKhw3Yw = ymabtmuqe;
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(ymabtmuqe.J4Ux7ym32, 0, ymabtmuqe.q3BipwRCk.length());
        this.kmSgne1rO = kCA6Zs9sL;
        this.Bhmn1KIah = kCA6Zs9sL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6 < r3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void J4Ux7ym32() {
        /*
            r7 = this;
            int r0 = r7.Bhmn1KIah
            r1 = 0
            if (r0 >= 0) goto L_0x000c
            r7.CBQ5d1kRq = r1
            r0 = 0
            r7.PSTqBLTET = r0
            goto L_0x007e
        L_0x000c:
            con.yMAbTMUQe r2 = r7.ilHKhw3Yw
            int r3 = r2.tGV7Q6urW
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L_0x001b
            int r6 = r7.MzoOEjc4X
            int r6 = r6 + r5
            r7.MzoOEjc4X = r6
            if (r6 >= r3) goto L_0x0023
        L_0x001b:
            java.lang.CharSequence r2 = r2.q3BipwRCk
            int r2 = r2.length()
            if (r0 <= r2) goto L_0x0033
        L_0x0023:
            int r0 = r7.kmSgne1rO
            con.G8ebKyy85 r1 = new con.G8ebKyy85
            con.yMAbTMUQe r2 = r7.ilHKhw3Yw
            java.lang.CharSequence r2 = r2.q3BipwRCk
            int r2 = con.r6NbD4wnj.vNtjxmzUM(r2)
            r1.<init>(r0, r2)
            goto L_0x0056
        L_0x0033:
            con.yMAbTMUQe r0 = r7.ilHKhw3Yw
            con.kkcQgCx5G r2 = r0.dIocxURUo
            java.lang.CharSequence r0 = r0.q3BipwRCk
            int r3 = r7.Bhmn1KIah
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.WaUP0CF08(r0, r3)
            con.n4f84B5OG r0 = (con.n4f84B5OG) r0
            if (r0 != 0) goto L_0x005b
            int r0 = r7.kmSgne1rO
            con.G8ebKyy85 r1 = new con.G8ebKyy85
            con.yMAbTMUQe r2 = r7.ilHKhw3Yw
            java.lang.CharSequence r2 = r2.q3BipwRCk
            int r2 = con.r6NbD4wnj.vNtjxmzUM(r2)
            r1.<init>(r0, r2)
        L_0x0056:
            r7.PSTqBLTET = r1
            r7.Bhmn1KIah = r4
            goto L_0x007c
        L_0x005b:
            java.lang.Object r2 = r0.CBQ5d1kRq
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.kmSgne1rO
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.kmSgne1rO
            con.G8ebKyy85 r3 = con.cT9gik1zL.yWvV4ePLl(r3, r2)
            r7.PSTqBLTET = r3
            int r2 = r2 + r0
            r7.kmSgne1rO = r2
            if (r0 != 0) goto L_0x0079
            r1 = r5
        L_0x0079:
            int r2 = r2 + r1
            r7.Bhmn1KIah = r2
        L_0x007c:
            r7.CBQ5d1kRq = r5
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.rmnr4niPx.J4Ux7ym32():void");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.CBQ5d1kRq == -1) {
            J4Ux7ym32();
        }
        return this.CBQ5d1kRq == 1;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.CBQ5d1kRq == -1) {
            J4Ux7ym32();
        }
        if (this.CBQ5d1kRq != 0) {
            G8ebKyy85 g8ebKyy85 = this.PSTqBLTET;
            Objects.requireNonNull(g8ebKyy85, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.PSTqBLTET = null;
            this.CBQ5d1kRq = -1;
            return g8ebKyy85;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
