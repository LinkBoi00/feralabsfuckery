package con;
/* loaded from: classes.dex */
public final class Lj9YtXGTc {
    public final long[] J4Ux7ym32;
    public final int q3BipwRCk;
    public final Object[] tGV7Q6urW;

    public Lj9YtXGTc(int i, long[] jArr, Object[] objArr) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = jArr;
        this.tGV7Q6urW = objArr;
    }

    public final Lj9YtXGTc J4Ux7ym32(long j, Object obj) {
        int i = this.q3BipwRCk;
        Object[] objArr = this.tGV7Q6urW;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.J4Ux7ym32[i6];
                Object obj2 = this.tGV7Q6urW[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.J4Ux7ym32[i6];
                    Object obj3 = this.tGV7Q6urW[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new Lj9YtXGTc(i5, jArr, objArr2);
    }

    public final int q3BipwRCk(long j) {
        int i = this.q3BipwRCk - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.J4Ux7ym32[i3] - j) > 0 ? 1 : ((this.J4Ux7ym32[i3] - j) == 0 ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 <= 0) {
                    return i3;
                } else {
                    i = i3 - 1;
                }
            }
            return -(i2 + 1);
        }
        long[] jArr = this.J4Ux7ym32;
        if (jArr[0] == j) {
            return 0;
        }
        return jArr[0] > j ? -2 : -1;
    }
}
