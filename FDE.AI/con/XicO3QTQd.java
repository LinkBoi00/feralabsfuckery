package con;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class XicO3QTQd {
    public aXI58Y1kr J4Ux7ym32;
    public mhl5lIdbQ q3BipwRCk;
    public s7MlVynBG tGV7Q6urW;

    /* loaded from: classes.dex */
    public final class RG2GI7LDp implements Iterator {
        public int Bhmn1KIah;
        public final int CBQ5d1kRq;
        public boolean PSTqBLTET = false;
        public int kmSgne1rO;

        public RG2GI7LDp(int i) {
            XicO3QTQd.this = r2;
            this.CBQ5d1kRq = i;
            this.kmSgne1rO = r2.dIocxURUo();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Bhmn1KIah < this.kmSgne1rO;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object J4Ux7ym32 = XicO3QTQd.this.J4Ux7ym32(this.Bhmn1KIah, this.CBQ5d1kRq);
                this.Bhmn1KIah++;
                this.PSTqBLTET = true;
                return J4Ux7ym32;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.PSTqBLTET) {
                int i = this.Bhmn1KIah - 1;
                this.Bhmn1KIah = i;
                this.kmSgne1rO--;
                this.PSTqBLTET = false;
                XicO3QTQd.this.GPLPRo6go(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public final class aXI58Y1kr implements Set {
        public aXI58Y1kr() {
            XicO3QTQd.this = r1;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            XicO3QTQd.this.q3BipwRCk();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return XicO3QTQd.this.kCA6Zs9sL(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Map tGV7Q6urW = XicO3QTQd.this.tGV7Q6urW();
            for (Object obj : collection) {
                if (!((ZmYjNS8wW) tGV7Q6urW).containsKey(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public boolean equals(Object obj) {
            return XicO3QTQd.Puu3Rhg4F(this, obj);
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public int hashCode() {
            int i = 0;
            for (int dIocxURUo = XicO3QTQd.this.dIocxURUo() - 1; dIocxURUo >= 0; dIocxURUo--) {
                Object J4Ux7ym32 = XicO3QTQd.this.J4Ux7ym32(dIocxURUo, 0);
                i += J4Ux7ym32 == null ? 0 : J4Ux7ym32.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return XicO3QTQd.this.dIocxURUo() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new RG2GI7LDp(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int kCA6Zs9sL = XicO3QTQd.this.kCA6Zs9sL(obj);
            if (kCA6Zs9sL < 0) {
                return false;
            }
            XicO3QTQd.this.GPLPRo6go(kCA6Zs9sL);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            Map tGV7Q6urW = XicO3QTQd.this.tGV7Q6urW();
            int size = ((ZmYjNS8wW) tGV7Q6urW).size();
            for (Object obj : collection) {
                ((ZmYjNS8wW) tGV7Q6urW).remove(obj);
            }
            return size != ((ZmYjNS8wW) tGV7Q6urW).size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return XicO3QTQd.yWvV4ePLl(XicO3QTQd.this.tGV7Q6urW(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return XicO3QTQd.this.dIocxURUo();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return XicO3QTQd.this.oon79WMrY(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return XicO3QTQd.this.vPSbyrYWX(objArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class mhl5lIdbQ implements Set {
        public mhl5lIdbQ() {
            XicO3QTQd.this = r1;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int dIocxURUo = XicO3QTQd.this.dIocxURUo();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                XicO3QTQd xicO3QTQd = XicO3QTQd.this;
                Object key = entry.getKey();
                Object value = entry.getValue();
                alHS0cjlg alhs0cjlg = (alHS0cjlg) xicO3QTQd;
                switch (alhs0cjlg.dIocxURUo) {
                    case 0:
                        ((rwhamSOu2) alhs0cjlg.kCA6Zs9sL).put(key, value);
                        break;
                    default:
                        ((qIxSZWcre) alhs0cjlg.kCA6Zs9sL).add(key);
                        break;
                }
            }
            return dIocxURUo != XicO3QTQd.this.dIocxURUo();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            XicO3QTQd.this.q3BipwRCk();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int kCA6Zs9sL = XicO3QTQd.this.kCA6Zs9sL(entry.getKey());
            if (kCA6Zs9sL < 0) {
                return false;
            }
            return PhWyMtRZm.tGV7Q6urW(XicO3QTQd.this.J4Ux7ym32(kCA6Zs9sL, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public boolean equals(Object obj) {
            return XicO3QTQd.Puu3Rhg4F(this, obj);
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Object
        public int hashCode() {
            int i = 0;
            for (int dIocxURUo = XicO3QTQd.this.dIocxURUo() - 1; dIocxURUo >= 0; dIocxURUo--) {
                Object J4Ux7ym32 = XicO3QTQd.this.J4Ux7ym32(dIocxURUo, 0);
                Object J4Ux7ym322 = XicO3QTQd.this.J4Ux7ym32(dIocxURUo, 1);
                i += (J4Ux7ym32 == null ? 0 : J4Ux7ym32.hashCode()) ^ (J4Ux7ym322 == null ? 0 : J4Ux7ym322.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return XicO3QTQd.this.dIocxURUo() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new qhPEQQaQ4();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return XicO3QTQd.this.dIocxURUo();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class qhPEQQaQ4 implements Iterator, Map.Entry {
        public int CBQ5d1kRq;
        public boolean Bhmn1KIah = false;
        public int kmSgne1rO = -1;

        public qhPEQQaQ4() {
            XicO3QTQd.this = r2;
            this.CBQ5d1kRq = r2.dIocxURUo() - 1;
        }

        @Override // java.lang.Object, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.Bhmn1KIah) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return PhWyMtRZm.tGV7Q6urW(entry.getKey(), XicO3QTQd.this.J4Ux7ym32(this.kmSgne1rO, 0)) && PhWyMtRZm.tGV7Q6urW(entry.getValue(), XicO3QTQd.this.J4Ux7ym32(this.kmSgne1rO, 1));
            }
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.Bhmn1KIah) {
                return XicO3QTQd.this.J4Ux7ym32(this.kmSgne1rO, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.Bhmn1KIah) {
                return XicO3QTQd.this.J4Ux7ym32(this.kmSgne1rO, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.kmSgne1rO < this.CBQ5d1kRq;
        }

        @Override // java.lang.Object, java.util.Map.Entry
        public int hashCode() {
            if (this.Bhmn1KIah) {
                int i = 0;
                Object J4Ux7ym32 = XicO3QTQd.this.J4Ux7ym32(this.kmSgne1rO, 0);
                Object J4Ux7ym322 = XicO3QTQd.this.J4Ux7ym32(this.kmSgne1rO, 1);
                int hashCode = J4Ux7ym32 == null ? 0 : J4Ux7ym32.hashCode();
                if (J4Ux7ym322 != null) {
                    i = J4Ux7ym322.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.kmSgne1rO++;
                this.Bhmn1KIah = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.Bhmn1KIah) {
                XicO3QTQd.this.GPLPRo6go(this.kmSgne1rO);
                this.kmSgne1rO--;
                this.CBQ5d1kRq--;
                this.Bhmn1KIah = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.Bhmn1KIah) {
                XicO3QTQd xicO3QTQd = XicO3QTQd.this;
                int i = this.kmSgne1rO;
                alHS0cjlg alhs0cjlg = (alHS0cjlg) xicO3QTQd;
                switch (alhs0cjlg.dIocxURUo) {
                    case 0:
                        int i2 = (i << 1) + 1;
                        Object[] objArr = ((rwhamSOu2) alhs0cjlg.kCA6Zs9sL).kmSgne1rO;
                        Object obj2 = objArr[i2];
                        objArr[i2] = obj;
                        return obj2;
                    default:
                        throw new UnsupportedOperationException("not a map");
                }
            } else {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
        }

        @Override // java.lang.Object
        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class s7MlVynBG implements Collection {
        public s7MlVynBG() {
            XicO3QTQd.this = r1;
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            XicO3QTQd.this.q3BipwRCk();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return XicO3QTQd.this.iiGwOFFnr(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return XicO3QTQd.this.dIocxURUo() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new RG2GI7LDp(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iiGwOFFnr = XicO3QTQd.this.iiGwOFFnr(obj);
            if (iiGwOFFnr < 0) {
                return false;
            }
            XicO3QTQd.this.GPLPRo6go(iiGwOFFnr);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int dIocxURUo = XicO3QTQd.this.dIocxURUo();
            int i = 0;
            boolean z = false;
            while (i < dIocxURUo) {
                if (collection.contains(XicO3QTQd.this.J4Ux7ym32(i, 1))) {
                    XicO3QTQd.this.GPLPRo6go(i);
                    i--;
                    dIocxURUo--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int dIocxURUo = XicO3QTQd.this.dIocxURUo();
            int i = 0;
            boolean z = false;
            while (i < dIocxURUo) {
                if (!collection.contains(XicO3QTQd.this.J4Ux7ym32(i, 1))) {
                    XicO3QTQd.this.GPLPRo6go(i);
                    i--;
                    dIocxURUo--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return XicO3QTQd.this.dIocxURUo();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return XicO3QTQd.this.oon79WMrY(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return XicO3QTQd.this.vPSbyrYWX(objArr, 1);
        }
    }

    public static boolean Puu3Rhg4F(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean yWvV4ePLl(Map map, Collection collection) {
        int i = ((ZmYjNS8wW) map).Bhmn1KIah;
        Iterator it = ((aXI58Y1kr) ((rwhamSOu2) map).keySet()).iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return i != ((ZmYjNS8wW) map).Bhmn1KIah;
    }

    public abstract void GPLPRo6go(int i);

    public abstract Object J4Ux7ym32(int i, int i2);

    public abstract int dIocxURUo();

    public abstract int iiGwOFFnr(Object obj);

    public abstract int kCA6Zs9sL(Object obj);

    public Object[] oon79WMrY(int i) {
        int dIocxURUo = dIocxURUo();
        Object[] objArr = new Object[dIocxURUo];
        for (int i2 = 0; i2 < dIocxURUo; i2++) {
            objArr[i2] = J4Ux7ym32(i2, i);
        }
        return objArr;
    }

    public abstract void q3BipwRCk();

    public abstract Map tGV7Q6urW();

    public Object[] vPSbyrYWX(Object[] objArr, int i) {
        int dIocxURUo = dIocxURUo();
        if (objArr.length < dIocxURUo) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), dIocxURUo);
        }
        for (int i2 = 0; i2 < dIocxURUo; i2++) {
            objArr[i2] = J4Ux7ym32(i2, i);
        }
        if (objArr.length > dIocxURUo) {
            objArr[dIocxURUo] = null;
        }
        return objArr;
    }
}
