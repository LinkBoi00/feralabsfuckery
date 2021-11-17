package con;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class ukjd43Q6T extends AvKancHZY {
    public final /* synthetic */ int CBQ5d1kRq;
    public final z2UXUXueK kmSgne1rO;

    public ukjd43Q6T(z2UXUXueK z2uxuxuek, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = z2uxuxuek;
        } else {
            this.kmSgne1rO = z2uxuxuek;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.CBQ5d1kRq) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.CBQ5d1kRq) {
            case 0:
                this.kmSgne1rO.clear();
                return;
            default:
                this.kmSgne1rO.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator iterator() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return new uMFWEtKlP(this.kmSgne1rO);
            default:
                return new psqXKQUsm(this.kmSgne1rO);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.CBQ5d1kRq) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.kmSgne1rO.remove(entry.getKey(), entry.getValue());
            default:
                if (!this.kmSgne1rO.containsKey(obj)) {
                    return false;
                }
                this.kmSgne1rO.remove(obj);
                return true;
        }
    }
}
