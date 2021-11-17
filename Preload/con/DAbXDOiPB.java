package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class DAbXDOiPB implements Iterator, f7VKpcPHS {
    public int Bhmn1KIah;
    public Object[] CBQ5d1kRq = yUfRSVKGd.iiGwOFFnr.dIocxURUo;
    public int kmSgne1rO;

    public DAbXDOiPB() {
        ksLrMHgEz kslrmhgez = yUfRSVKGd.kCA6Zs9sL;
        ksLrMHgEz kslrmhgez2 = yUfRSVKGd.kCA6Zs9sL;
    }

    public final void GPLPRo6go(Object[] objArr, int i, int i2) {
        this.CBQ5d1kRq = objArr;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = i2;
    }

    public final boolean J4Ux7ym32() {
        return this.Bhmn1KIah < this.kmSgne1rO;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return J4Ux7ym32();
    }

    public final void iiGwOFFnr(Object[] objArr, int i) {
        this.CBQ5d1kRq = objArr;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = 0;
    }

    public final boolean kCA6Zs9sL() {
        return this.Bhmn1KIah < this.CBQ5d1kRq.length;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
