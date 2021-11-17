package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class jRu4T1mV3 implements Iterator, f7VKpcPHS {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 1;
    public final Iterator kmSgne1rO;

    public jRu4T1mV3(CqYXp4s4a cqYXp4s4a) {
        this.Bhmn1KIah = cqYXp4s4a;
        this.kmSgne1rO = cqYXp4s4a.J4Ux7ym32.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return this.kmSgne1rO.hasNext();
            default:
                return this.kmSgne1rO.hasNext();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return (WdHQbIkKn) this.kmSgne1rO.next();
            default:
                return ((PmanMZxiM) ((CqYXp4s4a) this.Bhmn1KIah).tGV7Q6urW).IytU16YUK(this.kmSgne1rO.next());
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

    public jRu4T1mV3(ZOOhBHi6I zOOhBHi6I) {
        this.Bhmn1KIah = zOOhBHi6I;
        this.kmSgne1rO = zOOhBHi6I.RG6kpfv3v.iterator();
    }
}
