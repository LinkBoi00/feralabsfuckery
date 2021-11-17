package con;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lP4K00fUB implements Iterator, f7VKpcPHS {
    public final Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public int kmSgne1rO;

    public lP4K00fUB(OavOIaZo5 oavOIaZo5) {
        this.Bhmn1KIah = oavOIaZo5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return this.kmSgne1rO < ((OavOIaZo5) this.Bhmn1KIah).CBQ5d1kRq;
            case 1:
                return ((Iterator) this.Bhmn1KIah).hasNext();
            case 2:
                return this.kmSgne1rO < ((Object[]) this.Bhmn1KIah).length;
            default:
                return this.kmSgne1rO > 0;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.CBQ5d1kRq) {
            case 0:
                Object[] objArr = ((OavOIaZo5) this.Bhmn1KIah).kmSgne1rO;
                int i = this.kmSgne1rO;
                this.kmSgne1rO = i + 1;
                Object obj = objArr[i];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                return obj;
            case 1:
                int i2 = this.kmSgne1rO;
                this.kmSgne1rO = i2 + 1;
                if (i2 >= 0) {
                    return new KJq8y1k90(i2, ((Iterator) this.Bhmn1KIah).next());
                }
                idpM54xlp.IytU16YUK();
                throw null;
            case 2:
                try {
                    int i3 = this.kmSgne1rO;
                    this.kmSgne1rO = i3 + 1;
                    return ((Object[]) this.Bhmn1KIah)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.kmSgne1rO--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                W39e6bnPN w39e6bnPN = (W39e6bnPN) this.Bhmn1KIah;
                int CBQ5d1kRq = w39e6bnPN.CBQ5d1kRq();
                int i4 = this.kmSgne1rO;
                this.kmSgne1rO = i4 - 1;
                return w39e6bnPN.Puu3Rhg4F(CBQ5d1kRq - i4);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.CBQ5d1kRq) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public lP4K00fUB(W39e6bnPN w39e6bnPN) {
        this.Bhmn1KIah = w39e6bnPN;
        this.kmSgne1rO = w39e6bnPN.CBQ5d1kRq();
    }

    public lP4K00fUB(Iterator it) {
        this.Bhmn1KIah = it;
    }

    public lP4K00fUB(Object[] objArr) {
        this.Bhmn1KIah = objArr;
    }
}
