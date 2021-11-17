package con;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class QScS9iO33 implements Iterator, Way959ade, f7VKpcPHS {
    public Way959ade Bhmn1KIah;
    public int CBQ5d1kRq;
    public Object kmSgne1rO;

    @Override // con.Way959ade
    public void Bhmn1KIah(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        this.CBQ5d1kRq = 4;
    }

    public final Throwable J4Ux7ym32() {
        int i = this.CBQ5d1kRq;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Unexpected state of the iterator: ");
        q3BipwRCk.append(this.CBQ5d1kRq);
        return new IllegalStateException(q3BipwRCk.toString());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        while (true) {
            i = this.CBQ5d1kRq;
            if (i != 0) {
                break;
            }
            this.CBQ5d1kRq = 5;
            Way959ade way959ade = this.Bhmn1KIah;
            this.Bhmn1KIah = null;
            way959ade.Bhmn1KIah(qih4lW99W.q3BipwRCk);
        }
        if (i == 1) {
            throw null;
        } else if (i == 2 || i == 3) {
            return true;
        } else {
            if (i == 4) {
                return false;
            }
            throw J4Ux7ym32();
        }
    }

    public Object iiGwOFFnr(Object obj, Way959ade way959ade) {
        this.kmSgne1rO = obj;
        this.CBQ5d1kRq = 3;
        this.Bhmn1KIah = way959ade;
        return kBKJSqCSL.COROUTINE_SUSPENDED;
    }

    @Override // con.Way959ade
    public bu5cjmae6 kCA6Zs9sL() {
        return HbUTGjFCZ.CBQ5d1kRq;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.CBQ5d1kRq;
        if (i != 0 && i != 1) {
            Iterator it = null;
            if (i == 2) {
                this.CBQ5d1kRq = 1;
                return it.next();
            } else if (i == 3) {
                this.CBQ5d1kRq = 0;
                Object obj = this.kmSgne1rO;
                this.kmSgne1rO = null;
                return obj;
            } else {
                throw J4Ux7ym32();
            }
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
