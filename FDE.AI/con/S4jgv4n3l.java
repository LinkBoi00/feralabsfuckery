package con;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class S4jgv4n3l implements ListIterator, f7VKpcPHS {
    public int Bhmn1KIah;
    public final fhHgxp0FC CBQ5d1kRq;
    public int kmSgne1rO;

    public S4jgv4n3l(fhHgxp0FC fhhgxp0fc, int i) {
        this.CBQ5d1kRq = fhhgxp0fc;
        this.kmSgne1rO = i - 1;
        this.Bhmn1KIah = fhhgxp0fc.kCA6Zs9sL();
    }

    public final void J4Ux7ym32() {
        if (this.CBQ5d1kRq.kCA6Zs9sL() != this.Bhmn1KIah) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        J4Ux7ym32();
        this.CBQ5d1kRq.add(this.kmSgne1rO + 1, obj);
        this.kmSgne1rO++;
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.kmSgne1rO < this.CBQ5d1kRq.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.kmSgne1rO >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        J4Ux7ym32();
        int i = this.kmSgne1rO + 1;
        IKoPXuXRQ.J4Ux7ym32(i, this.CBQ5d1kRq.size());
        Object obj = this.CBQ5d1kRq.get(i);
        this.kmSgne1rO = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.kmSgne1rO + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        J4Ux7ym32();
        IKoPXuXRQ.J4Ux7ym32(this.kmSgne1rO, this.CBQ5d1kRq.size());
        this.kmSgne1rO--;
        return this.CBQ5d1kRq.get(this.kmSgne1rO);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.kmSgne1rO;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        J4Ux7ym32();
        this.CBQ5d1kRq.remove(this.kmSgne1rO);
        this.kmSgne1rO--;
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        J4Ux7ym32();
        this.CBQ5d1kRq.set(this.kmSgne1rO, obj);
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
    }
}
