package con;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public final class opit3zJSs implements Map.Entry, TLKhhgzsb {
    public final /* synthetic */ T3P8xswqq Bhmn1KIah;
    public final Object CBQ5d1kRq;
    public Object kmSgne1rO;

    public opit3zJSs(T3P8xswqq t3P8xswqq) {
        this.Bhmn1KIah = t3P8xswqq;
        this.CBQ5d1kRq = t3P8xswqq.PSTqBLTET.getKey();
        this.kmSgne1rO = t3P8xswqq.PSTqBLTET.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.CBQ5d1kRq;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.kmSgne1rO;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        T3P8xswqq t3P8xswqq = this.Bhmn1KIah;
        if (t3P8xswqq.CBQ5d1kRq.kCA6Zs9sL() == t3P8xswqq.Bhmn1KIah) {
            Object obj2 = this.kmSgne1rO;
            t3P8xswqq.CBQ5d1kRq.put(this.CBQ5d1kRq, obj);
            this.kmSgne1rO = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
