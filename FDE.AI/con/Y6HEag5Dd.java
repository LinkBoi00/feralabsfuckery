package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class Y6HEag5Dd {
    public Object[] J4Ux7ym32;
    public int dIocxURUo;
    public int[] q3BipwRCk;
    public OavOIaZo5[] tGV7Q6urW;

    public Y6HEag5Dd() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.q3BipwRCk = iArr;
        this.J4Ux7ym32 = new Object[50];
        this.tGV7Q6urW = new OavOIaZo5[50];
    }

    public final boolean J4Ux7ym32(Object obj) {
        return tGV7Q6urW(obj) >= 0;
    }

    public final boolean dIocxURUo(Object obj, Object obj2) {
        int i;
        OavOIaZo5 oavOIaZo5;
        int tGV7Q6urW = tGV7Q6urW(obj);
        if (tGV7Q6urW < 0 || (oavOIaZo5 = this.tGV7Q6urW[(i = this.q3BipwRCk[tGV7Q6urW])]) == null) {
            return false;
        }
        boolean remove = oavOIaZo5.remove(obj2);
        if (oavOIaZo5.CBQ5d1kRq == 0) {
            int i2 = tGV7Q6urW + 1;
            int i3 = this.dIocxURUo;
            if (i2 < i3) {
                int[] iArr = this.q3BipwRCk;
                System.arraycopy(iArr, i2, iArr, tGV7Q6urW, i3 - i2);
            }
            int[] iArr2 = this.q3BipwRCk;
            int i4 = this.dIocxURUo - 1;
            iArr2[i4] = i;
            this.J4Ux7ym32[i] = null;
            this.dIocxURUo = i4;
        }
        return remove;
    }

    public final boolean q3BipwRCk(Object obj, Object obj2) {
        OavOIaZo5 oavOIaZo5;
        int i;
        if (this.dIocxURUo > 0) {
            i = tGV7Q6urW(obj);
            if (i >= 0) {
                oavOIaZo5 = this.tGV7Q6urW[this.q3BipwRCk[i]];
                return oavOIaZo5.add(obj2);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.dIocxURUo;
        int[] iArr = this.q3BipwRCk;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.J4Ux7ym32[i4] = obj;
            OavOIaZo5[] oavOIaZo5Arr = this.tGV7Q6urW;
            OavOIaZo5 oavOIaZo52 = oavOIaZo5Arr[i4];
            if (oavOIaZo52 == null) {
                oavOIaZo52 = new OavOIaZo5();
                oavOIaZo5Arr[i4] = oavOIaZo52;
            }
            oavOIaZo5 = oavOIaZo52;
            if (i2 < i3) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
            }
            this.q3BipwRCk[i2] = i4;
            this.dIocxURUo++;
        } else {
            int length = iArr.length * 2;
            OavOIaZo5[] oavOIaZo5Arr2 = (OavOIaZo5[]) Arrays.copyOf(this.tGV7Q6urW, length);
            this.tGV7Q6urW = oavOIaZo5Arr2;
            OavOIaZo5 oavOIaZo53 = new OavOIaZo5();
            oavOIaZo5Arr2[i3] = oavOIaZo53;
            Object[] copyOf = Arrays.copyOf(this.J4Ux7ym32, length);
            this.J4Ux7ym32 = copyOf;
            copyOf[i3] = obj;
            int[] iArr2 = new int[length];
            int i5 = this.dIocxURUo + 1;
            if (i5 < length) {
                while (true) {
                    int i6 = i5 + 1;
                    iArr2[i5] = i5;
                    if (i6 >= length) {
                        break;
                    }
                    i5 = i6;
                }
            }
            int i7 = this.dIocxURUo;
            if (i2 < i7) {
                System.arraycopy(this.q3BipwRCk, i2, iArr2, i2 + 1, i7 - i2);
            }
            iArr2[i2] = i3;
            if (i2 > 0) {
                Jefa2ExbR.nlGCs0NZs(this.q3BipwRCk, iArr2, 0, 0, i2, 6);
            }
            this.q3BipwRCk = iArr2;
            this.dIocxURUo++;
            oavOIaZo5 = oavOIaZo53;
        }
        return oavOIaZo5.add(obj2);
    }

    public final int tGV7Q6urW(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.dIocxURUo - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.J4Ux7ym32[this.q3BipwRCk[i3]];
            int identityHashCode2 = System.identityHashCode(obj2) - identityHashCode;
            if (identityHashCode2 < 0) {
                i = i3 + 1;
            } else if (identityHashCode2 > 0) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                int i4 = i3 - 1;
                if (i4 >= 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        Object obj3 = this.J4Ux7ym32[this.q3BipwRCk[i4]];
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
                int i7 = this.dIocxURUo;
                if (i6 < i7) {
                    while (true) {
                        int i8 = i6 + 1;
                        Object obj4 = this.J4Ux7ym32[this.q3BipwRCk[i6]];
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
                return -(this.dIocxURUo + 1);
            }
        }
        return -(i + 1);
    }
}
