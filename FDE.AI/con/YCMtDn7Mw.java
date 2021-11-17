package con;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class YCMtDn7Mw extends cywn6086a {
    public static final Object[] PSTqBLTET = new Object[0];
    public int Bhmn1KIah;
    public int CBQ5d1kRq;
    public Object[] kmSgne1rO = PSTqBLTET;

    public final void GPLPRo6go(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.kmSgne1rO.length;
        while (i < length && it.hasNext()) {
            this.kmSgne1rO[i] = it.next();
            i++;
        }
        int i2 = this.CBQ5d1kRq;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.kmSgne1rO[i3] = it.next();
        }
        this.Bhmn1KIah = collection.size() + this.Bhmn1KIah;
    }

    @Override // con.cywn6086a
    public int J4Ux7ym32() {
        return this.Bhmn1KIah;
    }

    public final int Puu3Rhg4F(int i) {
        return i == 0 ? this.kmSgne1rO.length - 1 : i - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int J4Ux7ym32 = J4Ux7ym32();
        if (i < 0 || i > J4Ux7ym32) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", J4Ux7ym32));
        } else if (i == J4Ux7ym32()) {
            iiGwOFFnr(obj);
        } else if (i == 0) {
            yWvV4ePLl(J4Ux7ym32() + 1);
            int Puu3Rhg4F = Puu3Rhg4F(this.CBQ5d1kRq);
            this.CBQ5d1kRq = Puu3Rhg4F;
            this.kmSgne1rO[Puu3Rhg4F] = obj;
            this.Bhmn1KIah = J4Ux7ym32() + 1;
        } else {
            yWvV4ePLl(J4Ux7ym32() + 1);
            int i2 = this.CBQ5d1kRq + i;
            Object[] objArr = this.kmSgne1rO;
            if (i2 >= objArr.length) {
                i2 -= objArr.length;
            }
            if (i < ((J4Ux7ym32() + 1) >> 1)) {
                int Puu3Rhg4F2 = Puu3Rhg4F(i2);
                int Puu3Rhg4F3 = Puu3Rhg4F(this.CBQ5d1kRq);
                int i3 = this.CBQ5d1kRq;
                if (Puu3Rhg4F2 >= i3) {
                    Object[] objArr2 = this.kmSgne1rO;
                    objArr2[Puu3Rhg4F3] = objArr2[i3];
                    int i4 = i3 + 1;
                    System.arraycopy(objArr2, i4, objArr2, i3, (Puu3Rhg4F2 + 1) - i4);
                } else {
                    Object[] objArr3 = this.kmSgne1rO;
                    System.arraycopy(objArr3, i3, objArr3, i3 - 1, objArr3.length - i3);
                    Object[] objArr4 = this.kmSgne1rO;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    System.arraycopy(objArr4, 1, objArr4, 0, (Puu3Rhg4F2 + 1) - 1);
                }
                this.kmSgne1rO[Puu3Rhg4F2] = obj;
                this.CBQ5d1kRq = Puu3Rhg4F3;
            } else {
                int J4Ux7ym322 = this.CBQ5d1kRq + J4Ux7ym32();
                Object[] objArr5 = this.kmSgne1rO;
                if (J4Ux7ym322 >= objArr5.length) {
                    J4Ux7ym322 -= objArr5.length;
                }
                if (i2 < J4Ux7ym322) {
                    System.arraycopy(objArr5, i2, objArr5, i2 + 1, J4Ux7ym322 - i2);
                } else {
                    System.arraycopy(objArr5, 0, objArr5, 1, J4Ux7ym322 - 0);
                    Object[] objArr6 = this.kmSgne1rO;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    System.arraycopy(objArr6, i2, objArr6, i2 + 1, (objArr6.length - 1) - i2);
                }
                this.kmSgne1rO[i2] = obj;
            }
            this.Bhmn1KIah = J4Ux7ym32() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        iiGwOFFnr(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.Bhmn1KIah;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", i2));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i3 = this.Bhmn1KIah;
            if (i == i3) {
                return addAll(collection);
            }
            yWvV4ePLl(collection.size() + i3);
            int i4 = this.Bhmn1KIah;
            int i5 = this.CBQ5d1kRq;
            int i6 = i4 + i5;
            Object[] objArr = this.kmSgne1rO;
            if (i6 >= objArr.length) {
                i6 -= objArr.length;
            }
            int i7 = i5 + i;
            if (i7 >= objArr.length) {
                i7 -= objArr.length;
            }
            int size = collection.size();
            if (i < ((this.Bhmn1KIah + 1) >> 1)) {
                int i8 = this.CBQ5d1kRq;
                int i9 = i8 - size;
                if (i7 < i8) {
                    Object[] objArr2 = this.kmSgne1rO;
                    System.arraycopy(objArr2, i8, objArr2, i9, objArr2.length - i8);
                    Object[] objArr3 = this.kmSgne1rO;
                    int length = objArr3.length - size;
                    if (size >= i7) {
                        System.arraycopy(objArr3, 0, objArr3, length, i7 + 0);
                    } else {
                        System.arraycopy(objArr3, 0, objArr3, length, size + 0);
                        Object[] objArr4 = this.kmSgne1rO;
                        System.arraycopy(objArr4, size, objArr4, 0, i7 - size);
                    }
                } else if (i9 >= 0) {
                    Object[] objArr5 = this.kmSgne1rO;
                    System.arraycopy(objArr5, i8, objArr5, i9, i7 - i8);
                } else {
                    Object[] objArr6 = this.kmSgne1rO;
                    i9 += objArr6.length;
                    int i10 = i7 - i8;
                    int length2 = objArr6.length - i9;
                    if (length2 >= i10) {
                        System.arraycopy(objArr6, i8, objArr6, i9, i10);
                    } else {
                        System.arraycopy(objArr6, i8, objArr6, i9, (i8 + length2) - i8);
                        Object[] objArr7 = this.kmSgne1rO;
                        int i11 = this.CBQ5d1kRq + length2;
                        System.arraycopy(objArr7, i11, objArr7, 0, i7 - i11);
                    }
                }
                this.CBQ5d1kRq = i9;
                i7 -= size;
                if (i7 < 0) {
                    i7 += this.kmSgne1rO.length;
                }
            } else {
                int i12 = i7 + size;
                if (i7 < i6) {
                    int i13 = size + i6;
                    Object[] objArr8 = this.kmSgne1rO;
                    if (i13 > objArr8.length) {
                        if (i12 >= objArr8.length) {
                            i12 -= objArr8.length;
                        } else {
                            int length3 = i6 - (i13 - objArr8.length);
                            System.arraycopy(objArr8, length3, objArr8, 0, i6 - length3);
                            Object[] objArr9 = this.kmSgne1rO;
                            System.arraycopy(objArr9, i7, objArr9, i12, length3 - i7);
                        }
                    }
                    System.arraycopy(objArr8, i7, objArr8, i12, i6 - i7);
                } else {
                    Object[] objArr10 = this.kmSgne1rO;
                    System.arraycopy(objArr10, 0, objArr10, size, i6 - 0);
                    Object[] objArr11 = this.kmSgne1rO;
                    if (i12 >= objArr11.length) {
                        System.arraycopy(objArr11, i7, objArr11, i12 - objArr11.length, objArr11.length - i7);
                    } else {
                        int length4 = objArr11.length - size;
                        System.arraycopy(objArr11, length4, objArr11, 0, objArr11.length - length4);
                        Object[] objArr12 = this.kmSgne1rO;
                        System.arraycopy(objArr12, i7, objArr12, i12, (objArr12.length - size) - i7);
                    }
                }
            }
            GPLPRo6go(i7, collection);
            return true;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public void clear() {
        int J4Ux7ym32 = J4Ux7ym32();
        int i = this.CBQ5d1kRq;
        int i2 = J4Ux7ym32 + i;
        Object[] objArr = this.kmSgne1rO;
        if (i2 >= objArr.length) {
            i2 -= objArr.length;
        }
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.kmSgne1rO;
            Arrays.fill(objArr2, this.CBQ5d1kRq, objArr2.length, (Object) null);
            Arrays.fill(this.kmSgne1rO, 0, i2, (Object) null);
        }
        this.CBQ5d1kRq = 0;
        this.Bhmn1KIah = 0;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        int J4Ux7ym32 = J4Ux7ym32();
        if (i < 0 || i >= J4Ux7ym32) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", J4Ux7ym32));
        }
        int i2 = this.CBQ5d1kRq + i;
        Object[] objArr = this.kmSgne1rO;
        if (i2 >= objArr.length) {
            i2 -= objArr.length;
        }
        return objArr[i2];
    }

    public final void iiGwOFFnr(Object obj) {
        yWvV4ePLl(J4Ux7ym32() + 1);
        Object[] objArr = this.kmSgne1rO;
        int J4Ux7ym32 = this.CBQ5d1kRq + J4Ux7ym32();
        Object[] objArr2 = this.kmSgne1rO;
        if (J4Ux7ym32 >= objArr2.length) {
            J4Ux7ym32 -= objArr2.length;
        }
        objArr[J4Ux7ym32] = obj;
        this.Bhmn1KIah = J4Ux7ym32() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int J4Ux7ym32 = J4Ux7ym32();
        int i = this.CBQ5d1kRq;
        int i2 = J4Ux7ym32 + i;
        Object[] objArr = this.kmSgne1rO;
        if (i2 >= objArr.length) {
            i2 -= objArr.length;
        }
        if (i < i2) {
            while (i < i2) {
                if (!anXlDk6fV.tGV7Q6urW(obj, this.kmSgne1rO[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i < i2) {
            return -1;
        } else {
            int length = objArr.length;
            while (true) {
                if (i >= length) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (anXlDk6fV.tGV7Q6urW(obj, this.kmSgne1rO[i3])) {
                            i = i3 + this.kmSgne1rO.length;
                        }
                    }
                    return -1;
                } else if (anXlDk6fV.tGV7Q6urW(obj, this.kmSgne1rO[i])) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i - this.CBQ5d1kRq;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean isEmpty() {
        return J4Ux7ym32() == 0;
    }

    @Override // con.cywn6086a
    public Object kCA6Zs9sL(int i) {
        int J4Ux7ym32 = J4Ux7ym32();
        if (i < 0 || i >= J4Ux7ym32) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", J4Ux7ym32));
        } else if (i == idpM54xlp.CBQ5d1kRq(this)) {
            if (!isEmpty()) {
                int CBQ5d1kRq = this.CBQ5d1kRq + idpM54xlp.CBQ5d1kRq(this);
                Object[] objArr = this.kmSgne1rO;
                if (CBQ5d1kRq >= objArr.length) {
                    CBQ5d1kRq -= objArr.length;
                }
                Object obj = objArr[CBQ5d1kRq];
                objArr[CBQ5d1kRq] = null;
                this.Bhmn1KIah = J4Ux7ym32() - 1;
                return obj;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            return vPSbyrYWX();
        } else {
            int i2 = this.CBQ5d1kRq + i;
            Object[] objArr2 = this.kmSgne1rO;
            if (i2 >= objArr2.length) {
                i2 -= objArr2.length;
            }
            Object obj2 = objArr2[i2];
            if (i < (J4Ux7ym32() >> 1)) {
                int i3 = this.CBQ5d1kRq;
                if (i2 >= i3) {
                    Object[] objArr3 = this.kmSgne1rO;
                    System.arraycopy(objArr3, i3, objArr3, i3 + 1, i2 - i3);
                } else {
                    Object[] objArr4 = this.kmSgne1rO;
                    System.arraycopy(objArr4, 0, objArr4, 1, i2 - 0);
                    Object[] objArr5 = this.kmSgne1rO;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    int i4 = this.CBQ5d1kRq;
                    System.arraycopy(objArr5, i4, objArr5, i4 + 1, (objArr5.length - 1) - i4);
                }
                Object[] objArr6 = this.kmSgne1rO;
                int i5 = this.CBQ5d1kRq;
                objArr6[i5] = null;
                this.CBQ5d1kRq = oon79WMrY(i5);
            } else {
                int CBQ5d1kRq2 = this.CBQ5d1kRq + idpM54xlp.CBQ5d1kRq(this);
                Object[] objArr7 = this.kmSgne1rO;
                if (CBQ5d1kRq2 >= objArr7.length) {
                    CBQ5d1kRq2 -= objArr7.length;
                }
                if (i2 <= CBQ5d1kRq2) {
                    int i6 = i2 + 1;
                    System.arraycopy(objArr7, i6, objArr7, i2, (CBQ5d1kRq2 + 1) - i6);
                } else {
                    int i7 = i2 + 1;
                    System.arraycopy(objArr7, i7, objArr7, i2, objArr7.length - i7);
                    Object[] objArr8 = this.kmSgne1rO;
                    objArr8[objArr8.length - 1] = objArr8[0];
                    System.arraycopy(objArr8, 1, objArr8, 0, (CBQ5d1kRq2 + 1) - 1);
                }
                this.kmSgne1rO[CBQ5d1kRq2] = null;
            }
            this.Bhmn1KIah = J4Ux7ym32() - 1;
            return obj2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int length;
        int J4Ux7ym32 = J4Ux7ym32();
        int i = this.CBQ5d1kRq;
        int i2 = J4Ux7ym32 + i;
        Object[] objArr = this.kmSgne1rO;
        if (i2 >= objArr.length) {
            i2 -= objArr.length;
        }
        if (i < i2) {
            length = i2 - 1;
            if (length >= i) {
                while (!anXlDk6fV.tGV7Q6urW(obj, this.kmSgne1rO[length])) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.CBQ5d1kRq;
            }
            return -1;
        }
        if (i > i2) {
            int i3 = i2 - 1;
            while (true) {
                if (i3 < 0) {
                    length = this.kmSgne1rO.length - 1;
                    int i4 = this.CBQ5d1kRq;
                    if (length >= i4) {
                        while (!anXlDk6fV.tGV7Q6urW(obj, this.kmSgne1rO[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                    }
                } else if (anXlDk6fV.tGV7Q6urW(obj, this.kmSgne1rO[i3])) {
                    length = i3 + this.kmSgne1rO.length;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    public final int oon79WMrY(int i) {
        if (i == this.kmSgne1rO.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        kCA6Zs9sL(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            Object[] objArr = this.kmSgne1rO;
            if ((objArr.length == 0 ? 1 : null) == null) {
                int i2 = this.Bhmn1KIah;
                int i3 = this.CBQ5d1kRq;
                int i4 = i2 + i3;
                if (i4 >= objArr.length) {
                    i4 -= objArr.length;
                }
                if (i3 < i4) {
                    i = i3;
                    while (i3 < i4) {
                        Object obj = this.kmSgne1rO[i3];
                        if (!collection.contains(obj)) {
                            this.kmSgne1rO[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                        i3++;
                    }
                    Arrays.fill(this.kmSgne1rO, i, i4, (Object) null);
                } else {
                    int length = objArr.length;
                    boolean z2 = false;
                    int i5 = i3;
                    while (i3 < length) {
                        Object[] objArr2 = this.kmSgne1rO;
                        Object obj2 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj2)) {
                            this.kmSgne1rO[i5] = obj2;
                            i5++;
                        } else {
                            z2 = true;
                        }
                        i3++;
                    }
                    Object[] objArr3 = this.kmSgne1rO;
                    if (i5 >= objArr3.length) {
                        i5 -= objArr3.length;
                    }
                    i = i5;
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object[] objArr4 = this.kmSgne1rO;
                        Object obj3 = objArr4[i6];
                        objArr4[i6] = null;
                        if (!collection.contains(obj3)) {
                            this.kmSgne1rO[i] = obj3;
                            i = oon79WMrY(i);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i7 = i - this.CBQ5d1kRq;
                    if (i7 < 0) {
                        i7 += this.kmSgne1rO.length;
                    }
                    this.Bhmn1KIah = i7;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            Object[] objArr = this.kmSgne1rO;
            if ((objArr.length == 0 ? 1 : null) == null) {
                int i2 = this.Bhmn1KIah;
                int i3 = this.CBQ5d1kRq;
                int i4 = i2 + i3;
                if (i4 >= objArr.length) {
                    i4 -= objArr.length;
                }
                if (i3 < i4) {
                    i = i3;
                    while (i3 < i4) {
                        Object obj = this.kmSgne1rO[i3];
                        if (collection.contains(obj)) {
                            this.kmSgne1rO[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                        i3++;
                    }
                    Arrays.fill(this.kmSgne1rO, i, i4, (Object) null);
                } else {
                    int length = objArr.length;
                    boolean z2 = false;
                    int i5 = i3;
                    while (i3 < length) {
                        Object[] objArr2 = this.kmSgne1rO;
                        Object obj2 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj2)) {
                            this.kmSgne1rO[i5] = obj2;
                            i5++;
                        } else {
                            z2 = true;
                        }
                        i3++;
                    }
                    Object[] objArr3 = this.kmSgne1rO;
                    if (i5 >= objArr3.length) {
                        i5 -= objArr3.length;
                    }
                    i = i5;
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object[] objArr4 = this.kmSgne1rO;
                        Object obj3 = objArr4[i6];
                        objArr4[i6] = null;
                        if (collection.contains(obj3)) {
                            this.kmSgne1rO[i] = obj3;
                            i = oon79WMrY(i);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i7 = i - this.CBQ5d1kRq;
                    if (i7 < 0) {
                        i7 += this.kmSgne1rO.length;
                    }
                    this.Bhmn1KIah = i7;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int J4Ux7ym32 = J4Ux7ym32();
        if (i < 0 || i >= J4Ux7ym32) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", J4Ux7ym32));
        }
        int i2 = this.CBQ5d1kRq + i;
        Object[] objArr = this.kmSgne1rO;
        if (i2 >= objArr.length) {
            i2 -= objArr.length;
        }
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[J4Ux7ym32()]);
    }

    public final Object vPSbyrYWX() {
        if (!isEmpty()) {
            int i = this.CBQ5d1kRq;
            Object[] objArr = this.kmSgne1rO;
            Object obj = objArr[i];
            objArr[i] = null;
            this.CBQ5d1kRq = oon79WMrY(i);
            this.Bhmn1KIah = J4Ux7ym32() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void yWvV4ePLl(int i) {
        if (i >= 0) {
            Object[] objArr = this.kmSgne1rO;
            if (i > objArr.length) {
                if (objArr == PSTqBLTET) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.kmSgne1rO = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i2];
                int i3 = this.CBQ5d1kRq;
                System.arraycopy(objArr, i3, objArr2, 0, objArr.length - i3);
                Object[] objArr3 = this.kmSgne1rO;
                int length2 = objArr3.length;
                int i4 = this.CBQ5d1kRq;
                System.arraycopy(objArr3, 0, objArr2, length2 - i4, i4 - 0);
                this.CBQ5d1kRq = 0;
                this.kmSgne1rO = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < J4Ux7ym32()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), J4Ux7ym32());
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T>");
            objArr = (Object[]) newInstance;
        }
        int J4Ux7ym32 = J4Ux7ym32();
        int i = this.CBQ5d1kRq;
        int i2 = J4Ux7ym32 + i;
        Object[] objArr2 = this.kmSgne1rO;
        if (i2 >= objArr2.length) {
            i2 -= objArr2.length;
        }
        if (i < i2) {
            Jefa2ExbR.AqaWJg0b4(objArr2, objArr, 0, i, i2, 2);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.kmSgne1rO;
            int i3 = this.CBQ5d1kRq;
            System.arraycopy(objArr3, i3, objArr, 0, objArr3.length - i3);
            Object[] objArr4 = this.kmSgne1rO;
            System.arraycopy(objArr4, 0, objArr, objArr4.length - this.CBQ5d1kRq, i2 - 0);
        }
        if (objArr.length > J4Ux7ym32()) {
            objArr[J4Ux7ym32()] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        yWvV4ePLl(collection.size() + J4Ux7ym32());
        int J4Ux7ym32 = this.CBQ5d1kRq + J4Ux7ym32();
        Object[] objArr = this.kmSgne1rO;
        if (J4Ux7ym32 >= objArr.length) {
            J4Ux7ym32 -= objArr.length;
        }
        GPLPRo6go(J4Ux7ym32, collection);
        return true;
    }
}
