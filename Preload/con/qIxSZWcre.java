package con;

import con.XicO3QTQd;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class qIxSZWcre implements Collection, Set {
    public static int Eeka1udhb;
    public static int RG6kpfv3v;
    public static Object[] dXrmkklc8;
    public static Object[] qVUwofr5s;
    public int Bhmn1KIah;
    public int[] CBQ5d1kRq;
    public XicO3QTQd PSTqBLTET;
    public Object[] kmSgne1rO;
    public static final int[] MzoOEjc4X = new int[0];
    public static final Object[] ilHKhw3Yw = new Object[0];

    public qIxSZWcre(int i) {
        if (i == 0) {
            this.CBQ5d1kRq = MzoOEjc4X;
            this.kmSgne1rO = ilHKhw3Yw;
        } else {
            J4Ux7ym32(i);
        }
        this.Bhmn1KIah = 0;
    }

    public static void kCA6Zs9sL(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (qIxSZWcre.class) {
                if (RG6kpfv3v < 10) {
                    objArr[0] = dXrmkklc8;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    dXrmkklc8 = objArr;
                    RG6kpfv3v++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (qIxSZWcre.class) {
                if (Eeka1udhb < 10) {
                    objArr[0] = qVUwofr5s;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    qVUwofr5s = objArr;
                    Eeka1udhb++;
                }
            }
        }
    }

    public final int GPLPRo6go() {
        int i = this.Bhmn1KIah;
        if (i == 0) {
            return -1;
        }
        int q3BipwRCk = PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, i, 0);
        if (q3BipwRCk < 0 || this.kmSgne1rO[q3BipwRCk] == null) {
            return q3BipwRCk;
        }
        int i2 = q3BipwRCk + 1;
        while (i2 < i && this.CBQ5d1kRq[i2] == 0) {
            if (this.kmSgne1rO[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = q3BipwRCk - 1;
        while (i3 >= 0 && this.CBQ5d1kRq[i3] == 0) {
            if (this.kmSgne1rO[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public final void J4Ux7ym32(int i) {
        if (i == 8) {
            synchronized (qIxSZWcre.class) {
                Object[] objArr = dXrmkklc8;
                if (objArr != null) {
                    this.kmSgne1rO = objArr;
                    dXrmkklc8 = (Object[]) objArr[0];
                    this.CBQ5d1kRq = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    RG6kpfv3v--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (qIxSZWcre.class) {
                Object[] objArr2 = qVUwofr5s;
                if (objArr2 != null) {
                    this.kmSgne1rO = objArr2;
                    qVUwofr5s = (Object[]) objArr2[0];
                    this.CBQ5d1kRq = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    Eeka1udhb--;
                    return;
                }
            }
        }
        this.CBQ5d1kRq = new int[i];
        this.kmSgne1rO = new Object[i];
    }

    public Object Puu3Rhg4F(int i) {
        Object[] objArr = this.kmSgne1rO;
        Object obj = objArr[i];
        int i2 = this.Bhmn1KIah;
        if (i2 <= 1) {
            kCA6Zs9sL(this.CBQ5d1kRq, objArr, i2);
            this.CBQ5d1kRq = MzoOEjc4X;
            this.kmSgne1rO = ilHKhw3Yw;
            this.Bhmn1KIah = 0;
        } else {
            int[] iArr = this.CBQ5d1kRq;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.Bhmn1KIah = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr2 = this.kmSgne1rO;
                    System.arraycopy(objArr2, i5, objArr2, i, this.Bhmn1KIah - i);
                }
                this.kmSgne1rO[this.Bhmn1KIah] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                J4Ux7ym32(i3);
                this.Bhmn1KIah--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.CBQ5d1kRq, 0, i);
                    System.arraycopy(objArr, 0, this.kmSgne1rO, 0, i);
                }
                int i6 = this.Bhmn1KIah;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.CBQ5d1kRq, i, i6 - i);
                    System.arraycopy(objArr, i7, this.kmSgne1rO, i, this.Bhmn1KIah - i);
                }
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int i2;
        if (obj == null) {
            i2 = GPLPRo6go();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = iiGwOFFnr(obj, hashCode);
            i = hashCode;
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.Bhmn1KIah;
        int[] iArr = this.CBQ5d1kRq;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.kmSgne1rO;
            J4Ux7ym32(i5);
            int[] iArr2 = this.CBQ5d1kRq;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.kmSgne1rO, 0, objArr.length);
            }
            kCA6Zs9sL(iArr, objArr, this.Bhmn1KIah);
        }
        int i6 = this.Bhmn1KIah;
        if (i3 < i6) {
            int[] iArr3 = this.CBQ5d1kRq;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.kmSgne1rO;
            System.arraycopy(objArr2, i3, objArr2, i7, this.Bhmn1KIah - i3);
        }
        this.CBQ5d1kRq[i3] = i;
        this.kmSgne1rO[i3] = obj;
        this.Bhmn1KIah++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        int size = collection.size() + this.Bhmn1KIah;
        int[] iArr = this.CBQ5d1kRq;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.kmSgne1rO;
            J4Ux7ym32(size);
            int i = this.Bhmn1KIah;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.CBQ5d1kRq, 0, i);
                System.arraycopy(objArr, 0, this.kmSgne1rO, 0, this.Bhmn1KIah);
            }
            kCA6Zs9sL(iArr, objArr, this.Bhmn1KIah);
        }
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.Bhmn1KIah;
        if (i != 0) {
            kCA6Zs9sL(this.CBQ5d1kRq, this.kmSgne1rO, i);
            this.CBQ5d1kRq = MzoOEjc4X;
            this.kmSgne1rO = ilHKhw3Yw;
            this.Bhmn1KIah = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.Bhmn1KIah != set.size()) {
                return false;
            }
            for (int i = 0; i < this.Bhmn1KIah; i++) {
                try {
                    if (!set.contains(this.kmSgne1rO[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public int hashCode() {
        int[] iArr = this.CBQ5d1kRq;
        int i = this.Bhmn1KIah;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int iiGwOFFnr(Object obj, int i) {
        int i2 = this.Bhmn1KIah;
        if (i2 == 0) {
            return -1;
        }
        int q3BipwRCk = PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, i2, i);
        if (q3BipwRCk < 0 || obj.equals(this.kmSgne1rO[q3BipwRCk])) {
            return q3BipwRCk;
        }
        int i3 = q3BipwRCk + 1;
        while (i3 < i2 && this.CBQ5d1kRq[i3] == i) {
            if (obj.equals(this.kmSgne1rO[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = q3BipwRCk - 1;
        while (i4 >= 0 && this.CBQ5d1kRq[i4] == i) {
            if (obj.equals(this.kmSgne1rO[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? GPLPRo6go() : iiGwOFFnr(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.Bhmn1KIah <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (this.PSTqBLTET == null) {
            this.PSTqBLTET = new alHS0cjlg(this);
        }
        XicO3QTQd xicO3QTQd = this.PSTqBLTET;
        if (xicO3QTQd.J4Ux7ym32 == null) {
            xicO3QTQd.J4Ux7ym32 = new XicO3QTQd.aXI58Y1kr();
        }
        return xicO3QTQd.J4Ux7ym32.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        Puu3Rhg4F(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.Bhmn1KIah - 1; i >= 0; i--) {
            if (!collection.contains(this.kmSgne1rO[i])) {
                Puu3Rhg4F(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.Bhmn1KIah;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.Bhmn1KIah;
        Object[] objArr = new Object[i];
        System.arraycopy(this.kmSgne1rO, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.Bhmn1KIah) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.Bhmn1KIah);
        }
        System.arraycopy(this.kmSgne1rO, 0, objArr, 0, this.Bhmn1KIah);
        int length = objArr.length;
        int i = this.Bhmn1KIah;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.lang.Object
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Bhmn1KIah * 14);
        sb.append('{');
        for (int i = 0; i < this.Bhmn1KIah; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.kmSgne1rO[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
