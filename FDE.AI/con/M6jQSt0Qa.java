package con;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class M6jQSt0Qa implements Iterator, f7VKpcPHS {
    public int Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 1;
    public final int MzoOEjc4X;
    public int PSTqBLTET;
    public final Object kmSgne1rO;

    public M6jQSt0Qa(int i, int i2, ZVqfObOve zVqfObOve) {
        this.PSTqBLTET = i;
        this.MzoOEjc4X = i2;
        this.kmSgne1rO = zVqfObOve;
        this.Bhmn1KIah = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return this.PSTqBLTET < this.Bhmn1KIah;
            default:
                return this.Bhmn1KIah < this.MzoOEjc4X;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.CBQ5d1kRq) {
            case 0:
                W3r8jsmHE w3r8jsmHE = (W3r8jsmHE) this.kmSgne1rO;
                if (w3r8jsmHE.qVUwofr5s == this.MzoOEjc4X) {
                    int i = this.PSTqBLTET;
                    this.PSTqBLTET = xpuSUT7Gh.CBQ5d1kRq(w3r8jsmHE.CBQ5d1kRq, i) + i;
                    return new Z2NIE11tE(this, i);
                }
                throw new ConcurrentModificationException();
            default:
                if (!hasNext()) {
                    return null;
                }
                ZVqfObOve zVqfObOve = (ZVqfObOve) this.kmSgne1rO;
                Object[] objArr = zVqfObOve.tGV7Q6urW;
                int i2 = this.Bhmn1KIah;
                this.Bhmn1KIah = i2 + 1;
                if (i2 >= zVqfObOve.oon79WMrY) {
                    i2 += zVqfObOve.vPSbyrYWX;
                }
                return objArr[i2];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.CBQ5d1kRq) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public M6jQSt0Qa(W3r8jsmHE w3r8jsmHE, int i, int i2) {
        this.kmSgne1rO = w3r8jsmHE;
        this.Bhmn1KIah = i2;
        this.PSTqBLTET = i;
        this.MzoOEjc4X = w3r8jsmHE.qVUwofr5s;
        if (w3r8jsmHE.ilHKhw3Yw) {
            throw new ConcurrentModificationException();
        }
    }
}
