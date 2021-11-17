package con;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class LXZ4IeUXr extends DcopFwD8Z implements iui7vINQ4 {
    public final /* synthetic */ int CBQ5d1kRq;
    public final OFzjsdJSX kmSgne1rO;

    public LXZ4IeUXr(OFzjsdJSX oFzjsdJSX, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = oFzjsdJSX;
        } else {
            this.kmSgne1rO = oFzjsdJSX;
        }
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return this.kmSgne1rO.size();
            default:
                return this.kmSgne1rO.size();
        }
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.CBQ5d1kRq) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.kmSgne1rO.get(entry.getKey());
                Boolean valueOf = obj2 == null ? null : Boolean.valueOf(anXlDk6fV.tGV7Q6urW(obj2, entry.getValue()));
                if (valueOf != null) {
                    return valueOf.booleanValue();
                }
                if (entry.getValue() != null || !this.kmSgne1rO.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.kmSgne1rO.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return new sX9JtF8UQ(this.kmSgne1rO.CBQ5d1kRq);
            default:
                return new nrw8S8wIz(this.kmSgne1rO.CBQ5d1kRq);
        }
    }
}
