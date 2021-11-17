package con;
/* loaded from: classes.dex */
public final class sfGSnVX2z implements qRGoInHan {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public sfGSnVX2z(float f, boolean z, kkcQgCx5G kkcqgcx5g, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f;
    }

    @Override // con.MEtaL9md5
    public void J4Ux7ym32(AU29aHa4X aU29aHa4X, int i, int[] iArr, int[] iArr2) {
        tGV7Q6urW(aU29aHa4X, i, iArr, BFRsKhrQv.Ltr, iArr2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfGSnVX2z) && lRwPpHNL9.q3BipwRCk(this.q3BipwRCk, ((sfGSnVX2z) obj).q3BipwRCk) && anXlDk6fV.tGV7Q6urW(null, null);
    }

    public int hashCode() {
        return (((Float.hashCode(this.q3BipwRCk) * 31) + 1) * 31) + 0;
    }

    @Override // con.xrlB614az
    public float q3BipwRCk() {
        return this.J4Ux7ym32;
    }

    @Override // con.xrlB614az
    public void tGV7Q6urW(AU29aHa4X aU29aHa4X, int i, int[] iArr, BFRsKhrQv bFRsKhrQv, int[] iArr2) {
        int i2 = 0;
        if (!(iArr.length == 0)) {
            int iiGwOFFnr = aU29aHa4X.iiGwOFFnr(this.q3BipwRCk);
            boolean z = bFRsKhrQv == BFRsKhrQv.Rtl;
            xSTZH8Y9P xstzh8y9p = xSTZH8Y9P.q3BipwRCk;
            if (!z) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    i4++;
                    iArr2[i4] = Math.min(i3, i - i5);
                    i3 = Math.min(iiGwOFFnr, (i - iArr2[i4]) - i5) + iArr2[i4] + i5;
                    i2++;
                }
                return;
            }
            int length2 = iArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    int i7 = iArr[length2];
                    iArr2[length2] = Math.min(i2, i - i7);
                    i2 = Math.min(iiGwOFFnr, (i - iArr2[length2]) - i7) + iArr2[length2] + i7;
                    if (i6 >= 0) {
                        length2 = i6;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public String toString() {
        return "Arrangement#spacedAligned(" + ((Object) lRwPpHNL9.J4Ux7ym32(this.q3BipwRCk)) + ", " + ((Object) null) + ')';
    }
}
