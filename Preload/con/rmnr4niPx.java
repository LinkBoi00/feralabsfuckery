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
        G8ebKyy85 g8ebKyy85;
        int i = this.Bhmn1KIah;
        int i2 = 0;
        if (i < 0) {
            this.CBQ5d1kRq = 0;
            this.PSTqBLTET = null;
            return;
        }
        yMAbTMUQe ymabtmuqe = this.ilHKhw3Yw;
        int i3 = ymabtmuqe.tGV7Q6urW;
        if (i3 > 0) {
            int i4 = this.MzoOEjc4X + 1;
            this.MzoOEjc4X = i4;
        }
        if (i <= ymabtmuqe.q3BipwRCk.length()) {
            yMAbTMUQe ymabtmuqe2 = this.ilHKhw3Yw;
            n4f84B5OG n4f84b5og = (n4f84B5OG) ymabtmuqe2.dIocxURUo.WaUP0CF08(ymabtmuqe2.q3BipwRCk, Integer.valueOf(this.Bhmn1KIah));
            if (n4f84b5og == null) {
                g8ebKyy85 = new G8ebKyy85(this.kmSgne1rO, r6NbD4wnj.vNtjxmzUM(this.ilHKhw3Yw.q3BipwRCk));
                this.PSTqBLTET = g8ebKyy85;
                this.Bhmn1KIah = -1;
                this.CBQ5d1kRq = 1;
            }
            int intValue = ((Number) n4f84b5og.CBQ5d1kRq).intValue();
            int intValue2 = ((Number) n4f84b5og.kmSgne1rO).intValue();
            this.PSTqBLTET = cT9gik1zL.yWvV4ePLl(this.kmSgne1rO, intValue);
            int i5 = intValue + intValue2;
            this.kmSgne1rO = i5;
            if (intValue2 == 0) {
                i2 = 1;
            }
            this.Bhmn1KIah = i5 + i2;
            this.CBQ5d1kRq = 1;
        }
        g8ebKyy85 = new G8ebKyy85(this.kmSgne1rO, r6NbD4wnj.vNtjxmzUM(this.ilHKhw3Yw.q3BipwRCk));
        this.PSTqBLTET = g8ebKyy85;
        this.Bhmn1KIah = -1;
        this.CBQ5d1kRq = 1;
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
