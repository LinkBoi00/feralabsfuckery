package con;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class hbC5oTdpL implements Iterator, f7VKpcPHS {
    public int Bhmn1KIah;
    public final int CBQ5d1kRq;
    public final int PSTqBLTET;
    public boolean kmSgne1rO;

    public hbC5oTdpL(int i, int i2, int i3) {
        this.PSTqBLTET = i3;
        this.CBQ5d1kRq = i2;
        boolean z = true;
        z = false;
        if (i3 <= 0 ? i < i2 : i > i2) {
        }
        this.kmSgne1rO = z;
        this.Bhmn1KIah = !z ? i2 : i;
    }

    public int J4Ux7ym32() {
        int i = this.Bhmn1KIah;
        if (i != this.CBQ5d1kRq) {
            this.Bhmn1KIah = this.PSTqBLTET + i;
        } else if (this.kmSgne1rO) {
            this.kmSgne1rO = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.kmSgne1rO;
    }

    @Override // java.util.Iterator
    public Object next() {
        return Integer.valueOf(J4Ux7ym32());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
