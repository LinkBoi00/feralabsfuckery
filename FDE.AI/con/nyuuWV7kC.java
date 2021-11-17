package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class nyuuWV7kC extends Og6dYSoy7 {
    public final OFzjsdJSX CBQ5d1kRq;

    public nyuuWV7kC(OFzjsdJSX oFzjsdJSX) {
        this.CBQ5d1kRq = oFzjsdJSX;
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.CBQ5d1kRq.size();
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.CBQ5d1kRq.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new fixY2W1yA(this.CBQ5d1kRq.CBQ5d1kRq);
    }
}
