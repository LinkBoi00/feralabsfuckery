package con;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class uMFWEtKlP implements Iterator, f7VKpcPHS {
    public final G1uNrjfG6 CBQ5d1kRq;

    public uMFWEtKlP(z2UXUXueK z2uxuxuek) {
        DAbXDOiPB[] dAbXDOiPBArr = new DAbXDOiPB[8];
        for (int i = 0; i < 8; i++) {
            dAbXDOiPBArr[i] = new ccwCZGEqb(this);
        }
        this.CBQ5d1kRq = new G1uNrjfG6(z2uxuxuek, dAbXDOiPBArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.CBQ5d1kRq.Bhmn1KIah;
    }

    @Override // java.util.Iterator
    public Object next() {
        return (Map.Entry) this.CBQ5d1kRq.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.CBQ5d1kRq.remove();
    }
}
