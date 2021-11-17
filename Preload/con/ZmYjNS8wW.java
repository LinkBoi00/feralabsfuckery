package con;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class ZmYjNS8wW {
    public static int MzoOEjc4X;
    public static Object[] PSTqBLTET;
    public static Object[] ilHKhw3Yw;
    public static int qVUwofr5s;
    public int Bhmn1KIah;
    public int[] CBQ5d1kRq;
    public Object[] kmSgne1rO;

    public ZmYjNS8wW() {
        this.CBQ5d1kRq = PhWyMtRZm.q3BipwRCk;
        this.kmSgne1rO = PhWyMtRZm.tGV7Q6urW;
        this.Bhmn1KIah = 0;
    }

    public ZmYjNS8wW(int i) {
        if (i == 0) {
            this.CBQ5d1kRq = PhWyMtRZm.q3BipwRCk;
            this.kmSgne1rO = PhWyMtRZm.tGV7Q6urW;
        } else {
            q3BipwRCk(i);
        }
        this.Bhmn1KIah = 0;
    }

    private void q3BipwRCk(int i) {
        if (i == 8) {
            synchronized (ZmYjNS8wW.class) {
                Object[] objArr = ilHKhw3Yw;
                if (objArr != null) {
                    this.kmSgne1rO = objArr;
                    ilHKhw3Yw = (Object[]) objArr[0];
                    this.CBQ5d1kRq = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    qVUwofr5s--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ZmYjNS8wW.class) {
                Object[] objArr2 = PSTqBLTET;
                if (objArr2 != null) {
                    this.kmSgne1rO = objArr2;
                    PSTqBLTET = (Object[]) objArr2[0];
                    this.CBQ5d1kRq = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    MzoOEjc4X--;
                    return;
                }
            }
        }
        this.CBQ5d1kRq = new int[i];
        this.kmSgne1rO = new Object[i << 1];
    }

    public static void tGV7Q6urW(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ZmYjNS8wW.class) {
                if (qVUwofr5s < 10) {
                    objArr[0] = ilHKhw3Yw;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    ilHKhw3Yw = objArr;
                    qVUwofr5s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ZmYjNS8wW.class) {
                if (MzoOEjc4X < 10) {
                    objArr[0] = PSTqBLTET;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    PSTqBLTET = objArr;
                    MzoOEjc4X++;
                }
            }
        }
    }

    public int GPLPRo6go(Object obj) {
        int i = this.Bhmn1KIah * 2;
        Object[] objArr = this.kmSgne1rO;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void J4Ux7ym32(int i) {
        int i2 = this.Bhmn1KIah;
        int[] iArr = this.CBQ5d1kRq;
        if (iArr.length < i) {
            Object[] objArr = this.kmSgne1rO;
            q3BipwRCk(i);
            if (this.Bhmn1KIah > 0) {
                System.arraycopy(iArr, 0, this.CBQ5d1kRq, 0, i2);
                System.arraycopy(objArr, 0, this.kmSgne1rO, 0, i2 << 1);
            }
            tGV7Q6urW(iArr, objArr, i2);
        }
        if (this.Bhmn1KIah != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public Object Puu3Rhg4F(int i) {
        return this.kmSgne1rO[i << 1];
    }

    public void clear() {
        int i = this.Bhmn1KIah;
        if (i > 0) {
            int[] iArr = this.CBQ5d1kRq;
            Object[] objArr = this.kmSgne1rO;
            this.CBQ5d1kRq = PhWyMtRZm.q3BipwRCk;
            this.kmSgne1rO = PhWyMtRZm.tGV7Q6urW;
            this.Bhmn1KIah = 0;
            tGV7Q6urW(iArr, objArr, i);
        }
        if (this.Bhmn1KIah > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return kCA6Zs9sL(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return GPLPRo6go(obj) >= 0;
    }

    public int dIocxURUo(Object obj, int i) {
        int i2 = this.Bhmn1KIah;
        if (i2 == 0) {
            return -1;
        }
        try {
            int q3BipwRCk = PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, i2, i);
            if (q3BipwRCk < 0) {
                return q3BipwRCk;
            }
            if (obj.equals(this.kmSgne1rO[q3BipwRCk << 1])) {
                return q3BipwRCk;
            }
            int i3 = q3BipwRCk + 1;
            while (i3 < i2 && this.CBQ5d1kRq[i3] == i) {
                if (obj.equals(this.kmSgne1rO[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = q3BipwRCk - 1;
            while (i4 >= 0 && this.CBQ5d1kRq[i4] == i) {
                if (obj.equals(this.kmSgne1rO[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZmYjNS8wW) {
            ZmYjNS8wW zmYjNS8wW = (ZmYjNS8wW) obj;
            if (this.Bhmn1KIah != zmYjNS8wW.Bhmn1KIah) {
                return false;
            }
            for (int i = 0; i < this.Bhmn1KIah; i++) {
                try {
                    Object Puu3Rhg4F = Puu3Rhg4F(i);
                    Object vPSbyrYWX = vPSbyrYWX(i);
                    Object obj2 = zmYjNS8wW.get(Puu3Rhg4F);
                    if (vPSbyrYWX == null) {
                        if (obj2 != null || !zmYjNS8wW.containsKey(Puu3Rhg4F)) {
                            return false;
                        }
                    } else if (!vPSbyrYWX.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.Bhmn1KIah != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.Bhmn1KIah; i2++) {
                try {
                    Object Puu3Rhg4F2 = Puu3Rhg4F(i2);
                    Object vPSbyrYWX2 = vPSbyrYWX(i2);
                    Object obj3 = map.get(Puu3Rhg4F2);
                    if (vPSbyrYWX2 == null) {
                        if (obj3 != null || !map.containsKey(Puu3Rhg4F2)) {
                            return false;
                        }
                    } else if (!vPSbyrYWX2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int kCA6Zs9sL = kCA6Zs9sL(obj);
        return kCA6Zs9sL >= 0 ? this.kmSgne1rO[(kCA6Zs9sL << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.CBQ5d1kRq;
        Object[] objArr = this.kmSgne1rO;
        int i = this.Bhmn1KIah;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public int iiGwOFFnr() {
        int i = this.Bhmn1KIah;
        if (i == 0) {
            return -1;
        }
        try {
            int q3BipwRCk = PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, i, 0);
            if (q3BipwRCk < 0) {
                return q3BipwRCk;
            }
            if (this.kmSgne1rO[q3BipwRCk << 1] == null) {
                return q3BipwRCk;
            }
            int i2 = q3BipwRCk + 1;
            while (i2 < i && this.CBQ5d1kRq[i2] == 0) {
                if (this.kmSgne1rO[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = q3BipwRCk - 1;
            while (i3 >= 0 && this.CBQ5d1kRq[i3] == 0) {
                if (this.kmSgne1rO[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean isEmpty() {
        return this.Bhmn1KIah <= 0;
    }

    public int kCA6Zs9sL(Object obj) {
        return obj == null ? iiGwOFFnr() : dIocxURUo(obj, obj.hashCode());
    }

    public Object oon79WMrY(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.kmSgne1rO;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.Bhmn1KIah;
        if (obj == null) {
            i2 = iiGwOFFnr();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = dIocxURUo(obj, hashCode);
            i = hashCode;
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.kmSgne1rO;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~i2;
        int[] iArr = this.CBQ5d1kRq;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.kmSgne1rO;
            q3BipwRCk(i6);
            if (i3 == this.Bhmn1KIah) {
                int[] iArr2 = this.CBQ5d1kRq;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.kmSgne1rO, 0, objArr2.length);
                }
                tGV7Q6urW(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.CBQ5d1kRq;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.kmSgne1rO;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.Bhmn1KIah - i5) << 1);
        }
        int i8 = this.Bhmn1KIah;
        if (i3 == i8) {
            int[] iArr4 = this.CBQ5d1kRq;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.kmSgne1rO;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.Bhmn1KIah = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public Object remove(Object obj) {
        int kCA6Zs9sL = kCA6Zs9sL(obj);
        if (kCA6Zs9sL >= 0) {
            return yWvV4ePLl(kCA6Zs9sL);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int kCA6Zs9sL = kCA6Zs9sL(obj);
        if (kCA6Zs9sL < 0) {
            return false;
        }
        Object vPSbyrYWX = vPSbyrYWX(kCA6Zs9sL);
        if (obj2 != vPSbyrYWX && (obj2 == null || !obj2.equals(vPSbyrYWX))) {
            return false;
        }
        yWvV4ePLl(kCA6Zs9sL);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        int kCA6Zs9sL = kCA6Zs9sL(obj);
        if (kCA6Zs9sL >= 0) {
            return oon79WMrY(kCA6Zs9sL, obj2);
        }
        return null;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int kCA6Zs9sL = kCA6Zs9sL(obj);
        if (kCA6Zs9sL < 0) {
            return false;
        }
        Object vPSbyrYWX = vPSbyrYWX(kCA6Zs9sL);
        if (vPSbyrYWX != obj2 && (obj2 == null || !obj2.equals(vPSbyrYWX))) {
            return false;
        }
        oon79WMrY(kCA6Zs9sL, obj3);
        return true;
    }

    public int size() {
        return this.Bhmn1KIah;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Bhmn1KIah * 28);
        sb.append('{');
        for (int i = 0; i < this.Bhmn1KIah; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object Puu3Rhg4F = Puu3Rhg4F(i);
            if (Puu3Rhg4F != this) {
                sb.append(Puu3Rhg4F);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object vPSbyrYWX = vPSbyrYWX(i);
            if (vPSbyrYWX != this) {
                sb.append(vPSbyrYWX);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object vPSbyrYWX(int i) {
        return this.kmSgne1rO[(i << 1) + 1];
    }

    public Object yWvV4ePLl(int i) {
        Object[] objArr = this.kmSgne1rO;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.Bhmn1KIah;
        int i4 = 0;
        if (i3 <= 1) {
            tGV7Q6urW(this.CBQ5d1kRq, objArr, i3);
            this.CBQ5d1kRq = PhWyMtRZm.q3BipwRCk;
            this.kmSgne1rO = PhWyMtRZm.tGV7Q6urW;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.CBQ5d1kRq;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.kmSgne1rO;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.kmSgne1rO;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                q3BipwRCk(i6);
                if (i3 == this.Bhmn1KIah) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.CBQ5d1kRq, 0, i);
                        System.arraycopy(objArr, 0, this.kmSgne1rO, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.CBQ5d1kRq, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.kmSgne1rO, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.Bhmn1KIah) {
            this.Bhmn1KIah = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }
}
