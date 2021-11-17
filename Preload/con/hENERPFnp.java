package con;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class hENERPFnp implements ListIterator, f7VKpcPHS {
    public final /* synthetic */ BdFQ0RqNz CBQ5d1kRq;
    public final /* synthetic */ ogaVCPZBS kmSgne1rO;

    public hENERPFnp(BdFQ0RqNz bdFQ0RqNz, ogaVCPZBS ogavcpzbs) {
        this.CBQ5d1kRq = bdFQ0RqNz;
        this.kmSgne1rO = ogavcpzbs;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        IKoPXuXRQ.q3BipwRCk();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.CBQ5d1kRq.CBQ5d1kRq < this.kmSgne1rO.PSTqBLTET - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.CBQ5d1kRq.CBQ5d1kRq >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        int i = this.CBQ5d1kRq.CBQ5d1kRq + 1;
        IKoPXuXRQ.J4Ux7ym32(i, this.kmSgne1rO.PSTqBLTET);
        this.CBQ5d1kRq.CBQ5d1kRq = i;
        return this.kmSgne1rO.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.CBQ5d1kRq.CBQ5d1kRq + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        int i = this.CBQ5d1kRq.CBQ5d1kRq;
        IKoPXuXRQ.J4Ux7ym32(i, this.kmSgne1rO.PSTqBLTET);
        this.CBQ5d1kRq.CBQ5d1kRq = i - 1;
        return this.kmSgne1rO.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.CBQ5d1kRq.CBQ5d1kRq;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        IKoPXuXRQ.q3BipwRCk();
        throw null;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        IKoPXuXRQ.q3BipwRCk();
        throw null;
    }
}
