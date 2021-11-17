package con;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class gQLYYUI6F implements Iterator, f7VKpcPHS {
    public int Bhmn1KIah;
    public Object CBQ5d1kRq;
    public final Map kmSgne1rO;

    public gQLYYUI6F(Object obj, Map map) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Bhmn1KIah < this.kmSgne1rO.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object obj = this.CBQ5d1kRq;
            this.Bhmn1KIah++;
            Object obj2 = this.kmSgne1rO.get(obj);
            if (obj2 != null) {
                this.CBQ5d1kRq = ((NQDE489uH) obj2).J4Ux7ym32;
                return obj;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
