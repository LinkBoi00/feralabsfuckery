package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class OavOIaZo5 implements Set, f7VKpcPHS {
    public int CBQ5d1kRq;
    public Object[] kmSgne1rO = new Object[16];

    public final int J4Ux7ym32(Object obj) {
        int i = this.CBQ5d1kRq - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.kmSgne1rO[i3];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            int identityHashCode2 = System.identityHashCode(obj2) - identityHashCode;
            if (identityHashCode2 < 0) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > 0) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                int i4 = i3 - 1;
                if (i4 >= 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        Object obj3 = this.kmSgne1rO[i4];
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode || i5 < 0) {
                                break;
                            }
                            i4 = i5;
                        } else {
                            return i4;
                        }
                    }
                }
                int i6 = i3 + 1;
                int i7 = this.CBQ5d1kRq;
                if (i6 < i7) {
                    while (true) {
                        int i8 = i6 + 1;
                        Object obj4 = this.kmSgne1rO[i6];
                        if (obj4 == obj) {
                            return i6;
                        }
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            return -i8;
                        }
                        if (i8 >= i7) {
                            break;
                        }
                        i6 = i8;
                    }
                }
                return -(this.CBQ5d1kRq + 1);
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        if (this.CBQ5d1kRq > 0) {
            i = J4Ux7ym32(obj);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.CBQ5d1kRq;
        Object[] objArr = this.kmSgne1rO;
        if (i3 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, i2, objArr2, i2 + 1, i3 - i2);
            Jefa2ExbR.AqaWJg0b4(this.kmSgne1rO, objArr2, 0, 0, i2, 6);
            this.kmSgne1rO = objArr2;
        } else {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        }
        this.kmSgne1rO[i2] = obj;
        this.CBQ5d1kRq++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.CBQ5d1kRq;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                this.kmSgne1rO[i2] = null;
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        this.CBQ5d1kRq = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && J4Ux7ym32(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.CBQ5d1kRq == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new lP4K00fUB(this);
    }

    public final boolean kCA6Zs9sL() {
        return this.CBQ5d1kRq > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int J4Ux7ym32;
        if (obj == null || (J4Ux7ym32 = J4Ux7ym32(obj)) < 0) {
            return false;
        }
        int i = this.CBQ5d1kRq;
        if (J4Ux7ym32 < i - 1) {
            Object[] objArr = this.kmSgne1rO;
            int i2 = J4Ux7ym32 + 1;
            System.arraycopy(objArr, i2, objArr, J4Ux7ym32, i - i2);
        }
        int i3 = this.CBQ5d1kRq - 1;
        this.CBQ5d1kRq = i3;
        this.kmSgne1rO[i3] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.CBQ5d1kRq;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ZUB9SUm0g.q3BipwRCk(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ZUB9SUm0g.J4Ux7ym32(this, objArr);
    }
}
