package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zGxBV5Le4 {
    public final int Bhmn1KIah;
    public final int CBQ5d1kRq;
    public final boolean GPLPRo6go;
    public final uYQ8gOoPj[] J4Ux7ym32;
    public final int Puu3Rhg4F;
    public final phqQlbVE3 dIocxURUo;
    public final BFRsKhrQv iiGwOFFnr;
    public final T0XFCDCob kCA6Zs9sL;
    public final int kmSgne1rO;
    public final int oon79WMrY;
    public final int q3BipwRCk;
    public final boolean tGV7Q6urW;
    public final Object vPSbyrYWX;
    public final int yWvV4ePLl;

    public zGxBV5Le4(int i, uYQ8gOoPj[] uyq8goopjArr, boolean z, phqQlbVE3 phqqlbve3, T0XFCDCob t0XFCDCob, BFRsKhrQv bFRsKhrQv, boolean z2, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = uyq8goopjArr;
        this.tGV7Q6urW = z;
        this.dIocxURUo = phqqlbve3;
        this.kCA6Zs9sL = t0XFCDCob;
        this.iiGwOFFnr = bFRsKhrQv;
        this.GPLPRo6go = z2;
        this.Puu3Rhg4F = i2;
        this.yWvV4ePLl = i3;
        this.oon79WMrY = i4;
        this.vPSbyrYWX = obj;
        int i7 = 0;
        int i8 = 0;
        for (uYQ8gOoPj uyq8goopj : uyq8goopjArr) {
            n2gATecRC n2gatecrc = uyq8goopj.q3BipwRCk;
            boolean z3 = this.tGV7Q6urW;
            if (z3) {
                i5 = n2gatecrc.kmSgne1rO;
            } else {
                i5 = n2gatecrc.CBQ5d1kRq;
            }
            i7 += i5;
            if (!z3) {
                i6 = n2gatecrc.kmSgne1rO;
            } else {
                i6 = n2gatecrc.CBQ5d1kRq;
            }
            i8 = Math.max(i8, i6);
        }
        this.CBQ5d1kRq = i7;
        this.kmSgne1rO = i7 + this.oon79WMrY;
        this.Bhmn1KIah = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r4 >= 0) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r4 < r8.J4Ux7ym32.length) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r10 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final ymulT8MsV q3BipwRCk(int i, int i2, int i3) {
        ArrayList arrayList;
        zGxBV5Le4 zgxbv5le4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        long j;
        int i11;
        ArrayList arrayList2 = new ArrayList();
        int i12 = this.tGV7Q6urW ? i3 : i2;
        boolean z3 = this.GPLPRo6go;
        int i13 = z3 ? (i12 - i) - this.CBQ5d1kRq : i;
        if (z3) {
            int i14 = this.J4Ux7ym32.length;
            i4 = i;
            zgxbv5le4 = this;
            arrayList = arrayList2;
            i5 = i13;
            i9 = i2;
            int i15 = i12;
            i8 = i3;
            i6 = i14 - 1;
            i7 = i15;
            while (true) {
                z = zgxbv5le4.GPLPRo6go;
                if (!z) {
                }
                if (z2) {
                    return new ymulT8MsV(i4, zgxbv5le4.q3BipwRCk, zgxbv5le4.vPSbyrYWX, zgxbv5le4.CBQ5d1kRq, zgxbv5le4.kmSgne1rO, -zgxbv5le4.Puu3Rhg4F, i7 + zgxbv5le4.yWvV4ePLl, zgxbv5le4.tGV7Q6urW, arrayList);
                }
                n2gATecRC n2gatecrc = zgxbv5le4.J4Ux7ym32[i6].q3BipwRCk;
                if (z) {
                    i10 = 0;
                } else {
                    i10 = arrayList.size();
                }
                if (!zgxbv5le4.tGV7Q6urW) {
                    T0XFCDCob t0XFCDCob = zgxbv5le4.kCA6Zs9sL;
                    if (t0XFCDCob != null) {
                        j = dnBSj5uJN.tGV7Q6urW(i5, t0XFCDCob.q3BipwRCk(n2gatecrc.kmSgne1rO, i8));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    phqQlbVE3 phqqlbve3 = zgxbv5le4.dIocxURUo;
                    if (phqqlbve3 != null) {
                        j = dnBSj5uJN.tGV7Q6urW(phqqlbve3.q3BipwRCk(n2gatecrc.CBQ5d1kRq, i9, zgxbv5le4.iiGwOFFnr), i5);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (zgxbv5le4.tGV7Q6urW) {
                    i11 = n2gatecrc.kmSgne1rO;
                } else {
                    i11 = n2gatecrc.CBQ5d1kRq;
                }
                i5 += i11;
                arrayList.add(i10, new aefHFwQC3(j, n2gatecrc, zgxbv5le4.J4Ux7ym32[i6].J4Ux7ym32, null));
                if (zgxbv5le4.GPLPRo6go) {
                    i15 = i7;
                    i14 = i6;
                    break;
                }
                i6++;
            }
        } else {
            i4 = i;
            zgxbv5le4 = this;
            arrayList = arrayList2;
            i7 = i12;
            i5 = i13;
            i6 = 0;
            i9 = i2;
            i8 = i3;
            while (true) {
                z = zgxbv5le4.GPLPRo6go;
                if (!z) {
                }
                if (z2) {
                }
                i6++;
            }
        }
    }
}
