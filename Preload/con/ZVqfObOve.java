package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ZVqfObOve {
    public int Bhmn1KIah;
    public int CBQ5d1kRq;
    public int GPLPRo6go;
    public int[] J4Ux7ym32;
    public int Puu3Rhg4F;
    public ArrayList dIocxURUo;
    public boolean dXrmkklc8;
    public int iiGwOFFnr;
    public int kCA6Zs9sL;
    public int kmSgne1rO;
    public int oon79WMrY;
    public final W3r8jsmHE q3BipwRCk;
    public int qVUwofr5s;
    public Object[] tGV7Q6urW;
    public int vPSbyrYWX;
    public int yWvV4ePLl;
    public final I6sO15l0X PSTqBLTET = new I6sO15l0X();
    public final I6sO15l0X MzoOEjc4X = new I6sO15l0X();
    public final I6sO15l0X ilHKhw3Yw = new I6sO15l0X();
    public int Eeka1udhb = -1;

    public ZVqfObOve(W3r8jsmHE w3r8jsmHE) {
        this.q3BipwRCk = w3r8jsmHE;
        int[] iArr = w3r8jsmHE.CBQ5d1kRq;
        this.J4Ux7ym32 = iArr;
        Object[] objArr = w3r8jsmHE.Bhmn1KIah;
        this.tGV7Q6urW = objArr;
        this.dIocxURUo = w3r8jsmHE.Eeka1udhb;
        int i = w3r8jsmHE.kmSgne1rO;
        this.kCA6Zs9sL = i;
        this.iiGwOFFnr = (iArr.length / 5) - i;
        this.GPLPRo6go = i;
        int i2 = w3r8jsmHE.PSTqBLTET;
        this.oon79WMrY = i2;
        this.vPSbyrYWX = objArr.length - i2;
        this.CBQ5d1kRq = i;
    }

    public final void AqaWJg0b4(Object obj) {
        int qVUwofr5s = qVUwofr5s(this.qVUwofr5s);
        if (xpuSUT7Gh.kmSgne1rO(this.J4Ux7ym32, qVUwofr5s)) {
            this.tGV7Q6urW[yWvV4ePLl(dIocxURUo(this.J4Ux7ym32, qVUwofr5s))] = obj;
        } else {
            G7WvUK4mQ.tGV7Q6urW("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void Bhmn1KIah(int i, int i2, int i3) {
        if (i >= this.kCA6Zs9sL) {
            i = -((MzoOEjc4X() - i) + 2);
        }
        while (i3 < i2) {
            xpuSUT7Gh.WaUP0CF08(this.J4Ux7ym32, qVUwofr5s(i3), i);
            int CBQ5d1kRq = xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, qVUwofr5s(i3)) + i3;
            Bhmn1KIah(i3, CBQ5d1kRq, i3 + 1);
            i3 = CBQ5d1kRq;
        }
    }

    public final void CBQ5d1kRq() {
        int i = this.kmSgne1rO;
        boolean z = true;
        if (i > 0) {
            int i2 = i - 1;
            this.kmSgne1rO = i2;
            if (i2 == 0) {
                if (this.ilHKhw3Yw.J4Ux7ym32 != this.PSTqBLTET.J4Ux7ym32) {
                    z = false;
                }
                if (z) {
                    this.GPLPRo6go = (PSTqBLTET() - this.iiGwOFFnr) - this.MzoOEjc4X.kCA6Zs9sL();
                } else {
                    G7WvUK4mQ.tGV7Q6urW("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    public final int CpG0imbht(int[] iArr, int i) {
        if (i >= PSTqBLTET()) {
            return this.tGV7Q6urW.length - this.vPSbyrYWX;
        }
        int dXrmkklc8 = xpuSUT7Gh.dXrmkklc8(iArr, i);
        return dXrmkklc8 < 0 ? (this.tGV7Q6urW.length - this.vPSbyrYWX) + dXrmkklc8 + 1 : dXrmkklc8;
    }

    public final Object Eeka1udhb(int i) {
        if (i >= this.kCA6Zs9sL) {
            i += this.iiGwOFFnr;
        }
        if (!xpuSUT7Gh.Bhmn1KIah(this.J4Ux7ym32, i)) {
            return null;
        }
        Object[] objArr = this.tGV7Q6urW;
        int[] iArr = this.J4Ux7ym32;
        int i2 = i * 5;
        return objArr[xpuSUT7Gh.NyWTwPF6V(iArr[i2 + 1] >> 30) + iArr[i2 + 4]];
    }

    public final int GPLPRo6go(int i) {
        int[] iArr = this.J4Ux7ym32;
        if (i >= this.kCA6Zs9sL) {
            i += this.iiGwOFFnr;
        }
        return Puu3Rhg4F(iArr, i);
    }

    public final void IytU16YUK() {
        int i = this.GPLPRo6go;
        this.qVUwofr5s = i;
        this.Puu3Rhg4F = Puu3Rhg4F(this.J4Ux7ym32, qVUwofr5s(i));
    }

    public final EuSwp7OG7 J4Ux7ym32(int i) {
        ArrayList arrayList = this.dIocxURUo;
        int ln3nf7LH3 = xpuSUT7Gh.ln3nf7LH3(arrayList, i, MzoOEjc4X());
        if (ln3nf7LH3 >= 0) {
            return (EuSwp7OG7) arrayList.get(ln3nf7LH3);
        }
        if (i > this.kCA6Zs9sL) {
            i = -(MzoOEjc4X() - i);
        }
        EuSwp7OG7 euSwp7OG7 = new EuSwp7OG7(i);
        arrayList.add(-(ln3nf7LH3 + 1), euSwp7OG7);
        return euSwp7OG7;
    }

    public final int MzoOEjc4X() {
        return PSTqBLTET() - this.iiGwOFFnr;
    }

    public final int PSTqBLTET() {
        return this.J4Ux7ym32.length / 5;
    }

    public final int Puu3Rhg4F(int[] iArr, int i) {
        if (i >= PSTqBLTET()) {
            return this.tGV7Q6urW.length - this.vPSbyrYWX;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.tGV7Q6urW.length - this.vPSbyrYWX) + i2 + 1 : i2;
    }

    public final void RG6kpfv3v(int i, int i2) {
        if (i > 0) {
            WaUP0CF08(this.Puu3Rhg4F, i2);
            int i3 = this.oon79WMrY;
            int i4 = this.vPSbyrYWX;
            if (i4 < i) {
                Object[] objArr = this.tGV7Q6urW;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3 + 0);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.tGV7Q6urW = objArr2;
                i4 = i7;
            }
            int i9 = this.yWvV4ePLl;
            if (i9 >= i3) {
                this.yWvV4ePLl = i9 + i;
            }
            this.oon79WMrY = i3 + i;
            this.vPSbyrYWX = i4 - i;
        }
    }

    public final void WaUP0CF08(int i, int i2) {
        int i3 = this.vPSbyrYWX;
        int i4 = this.oon79WMrY;
        int i5 = this.CBQ5d1kRq;
        if (i4 != i) {
            Object[] objArr = this.tGV7Q6urW;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
            Arrays.fill(objArr, i, i + i3, (Object) null);
        }
        int min = Math.min(i2 + 1, MzoOEjc4X());
        if (i5 != min) {
            int length = this.tGV7Q6urW.length - i3;
            if (min < i5) {
                int qVUwofr5s = qVUwofr5s(min);
                int qVUwofr5s2 = qVUwofr5s(i5);
                int i7 = this.kCA6Zs9sL;
                while (qVUwofr5s < qVUwofr5s2) {
                    int oon79WMrY = xpuSUT7Gh.oon79WMrY(this.J4Ux7ym32, qVUwofr5s);
                    if (oon79WMrY >= 0) {
                        xpuSUT7Gh.RG6kpfv3v(this.J4Ux7ym32, qVUwofr5s, -((length - oon79WMrY) + 1));
                        qVUwofr5s++;
                        if (qVUwofr5s == i7) {
                            qVUwofr5s += this.iiGwOFFnr;
                        }
                    } else {
                        G7WvUK4mQ.tGV7Q6urW("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int qVUwofr5s3 = qVUwofr5s(i5);
                int qVUwofr5s4 = qVUwofr5s(min);
                while (qVUwofr5s3 < qVUwofr5s4) {
                    int oon79WMrY2 = xpuSUT7Gh.oon79WMrY(this.J4Ux7ym32, qVUwofr5s3);
                    if (oon79WMrY2 < 0) {
                        xpuSUT7Gh.RG6kpfv3v(this.J4Ux7ym32, qVUwofr5s3, oon79WMrY2 + length + 1);
                        qVUwofr5s3++;
                        if (qVUwofr5s3 == this.kCA6Zs9sL) {
                            qVUwofr5s3 += this.iiGwOFFnr;
                        }
                    } else {
                        G7WvUK4mQ.tGV7Q6urW("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.CBQ5d1kRq = min;
        }
        this.oon79WMrY = i;
    }

    public final void cAwN510t2(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.vPSbyrYWX;
            int i5 = i + i2;
            WaUP0CF08(i5, i3);
            this.oon79WMrY = i;
            this.vPSbyrYWX = i4 + i2;
            Arrays.fill(this.tGV7Q6urW, i, i5, (Object) null);
            int i6 = this.yWvV4ePLl;
            if (i6 >= i) {
                this.yWvV4ePLl = i6 - i2;
            }
        }
    }

    public final int dIocxURUo(int[] iArr, int i) {
        return Puu3Rhg4F(iArr, i) + xpuSUT7Gh.NyWTwPF6V(iArr[(i * 5) + 1] >> 29);
    }

    public final void dXrmkklc8(int i) {
        if (i > 0) {
            int i2 = this.qVUwofr5s;
            sk5s77z6Q(i2);
            int i3 = this.kCA6Zs9sL;
            int i4 = this.iiGwOFFnr;
            int[] iArr = this.J4Ux7ym32;
            int length = iArr.length / 5;
            int i5 = length - i4;
            int i6 = 0;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i7 = max - i5;
                System.arraycopy(iArr, 0, iArr2, 0, (i3 * 5) - 0);
                int i8 = (i4 + i3) * 5;
                System.arraycopy(iArr, i8, iArr2, (i3 + i7) * 5, (length * 5) - i8);
                this.J4Ux7ym32 = iArr2;
                i4 = i7;
            }
            int i9 = this.GPLPRo6go;
            if (i9 >= i3) {
                this.GPLPRo6go = i9 + i;
            }
            int i10 = i3 + i;
            this.kCA6Zs9sL = i10;
            this.iiGwOFFnr = i4 - i;
            int GPLPRo6go = i5 > 0 ? GPLPRo6go(i2 + i) : 0;
            if (this.CBQ5d1kRq >= i3) {
                i6 = this.oon79WMrY;
            }
            int oon79WMrY = oon79WMrY(GPLPRo6go, i6, this.vPSbyrYWX, this.tGV7Q6urW.length);
            if (i3 < i10) {
                int i11 = i3;
                while (true) {
                    int i12 = i11 + 1;
                    xpuSUT7Gh.RG6kpfv3v(this.J4Ux7ym32, i11, oon79WMrY);
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            int i13 = this.CBQ5d1kRq;
            if (i13 >= i3) {
                this.CBQ5d1kRq = i13 + i;
            }
        }
    }

    public final boolean dfpT1j18n() {
        int i = 1;
        if (this.kmSgne1rO == 0) {
            int i2 = this.qVUwofr5s;
            int i3 = this.Puu3Rhg4F;
            int qVUwofr5s = qVUwofr5s(i2);
            int CBQ5d1kRq = xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, qVUwofr5s) + this.qVUwofr5s;
            this.qVUwofr5s = CBQ5d1kRq;
            this.Puu3Rhg4F = Puu3Rhg4F(this.J4Ux7ym32, qVUwofr5s(CBQ5d1kRq));
            if (!xpuSUT7Gh.PSTqBLTET(this.J4Ux7ym32, qVUwofr5s)) {
                i = xpuSUT7Gh.qVUwofr5s(this.J4Ux7ym32, qVUwofr5s);
            }
            boolean iMyQMM6Qj = iMyQMM6Qj(i2, this.qVUwofr5s - i2);
            cAwN510t2(i3, this.Puu3Rhg4F - i3, i2 - 1);
            this.qVUwofr5s = i2;
            this.Puu3Rhg4F = i3;
            this.Bhmn1KIah -= i;
            return iMyQMM6Qj;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final int i8XZMQc6Z(int[] iArr, int i) {
        if (i >= this.kCA6Zs9sL) {
            i += this.iiGwOFFnr;
        }
        int i2 = iArr[(i * 5) + 2];
        return i2 > -2 ? i2 : MzoOEjc4X() + i2 + 2;
    }

    public final boolean iMyQMM6Qj(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.dIocxURUo;
            sk5s77z6Q(i);
            if (!arrayList.isEmpty()) {
                int i3 = i2 + i;
                int MzoOEjc4X = xpuSUT7Gh.MzoOEjc4X(this.dIocxURUo, i3, PSTqBLTET() - this.iiGwOFFnr);
                if (MzoOEjc4X >= this.dIocxURUo.size()) {
                    MzoOEjc4X--;
                }
                int i4 = MzoOEjc4X + 1;
                int i5 = 0;
                while (MzoOEjc4X >= 0) {
                    EuSwp7OG7 euSwp7OG7 = (EuSwp7OG7) this.dIocxURUo.get(MzoOEjc4X);
                    int tGV7Q6urW = tGV7Q6urW(euSwp7OG7);
                    if (tGV7Q6urW < i) {
                        break;
                    }
                    if (tGV7Q6urW < i3) {
                        euSwp7OG7.q3BipwRCk = Integer.MIN_VALUE;
                        if (i5 == 0) {
                            i5 = MzoOEjc4X + 1;
                        }
                        i4 = MzoOEjc4X;
                    }
                    MzoOEjc4X--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.dIocxURUo.subList(i4, i5).clear();
                }
            }
            this.kCA6Zs9sL = i;
            this.iiGwOFFnr += i2;
            int i6 = this.CBQ5d1kRq;
            if (i6 > i) {
                this.CBQ5d1kRq = i6 - i2;
            }
            int i7 = this.GPLPRo6go;
            if (i7 >= i) {
                this.GPLPRo6go = i7 - i2;
            }
        }
        return z;
    }

    public final void iiGwOFFnr() {
        boolean z = true;
        this.dXrmkklc8 = true;
        sk5s77z6Q(MzoOEjc4X());
        WaUP0CF08(this.tGV7Q6urW.length - this.vPSbyrYWX, this.kCA6Zs9sL);
        W3r8jsmHE w3r8jsmHE = this.q3BipwRCk;
        int[] iArr = this.J4Ux7ym32;
        int i = this.kCA6Zs9sL;
        Object[] objArr = this.tGV7Q6urW;
        int i2 = this.oon79WMrY;
        ArrayList arrayList = this.dIocxURUo;
        Objects.requireNonNull(w3r8jsmHE);
        if (this.q3BipwRCk != w3r8jsmHE || !w3r8jsmHE.ilHKhw3Yw) {
            z = false;
        }
        if (z) {
            w3r8jsmHE.ilHKhw3Yw = false;
            w3r8jsmHE.CBQ5d1kRq = iArr;
            w3r8jsmHE.kmSgne1rO = i;
            w3r8jsmHE.Bhmn1KIah = objArr;
            w3r8jsmHE.PSTqBLTET = i2;
            w3r8jsmHE.Eeka1udhb = arrayList;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final Object ilHKhw3Yw(int i) {
        if (i >= this.kCA6Zs9sL) {
            i += this.iiGwOFFnr;
        }
        if (xpuSUT7Gh.kmSgne1rO(this.J4Ux7ym32, i)) {
            return this.tGV7Q6urW[dIocxURUo(this.J4Ux7ym32, i)];
        }
        int i2 = rJ0s9PfCL.q3BipwRCk;
        return P7Re99G8L.J4Ux7ym32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List ixWaw2akD(W3r8jsmHE w3r8jsmHE, int i) {
        int i2;
        int i3;
        int i4;
        Dqz1pJHWH dqz1pJHWH;
        int i5;
        int i6;
        int i7;
        if (!(this.kmSgne1rO > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i == 0 && this.qVUwofr5s == 0 && this.q3BipwRCk.kmSgne1rO == 0) {
            int[] iArr = this.J4Ux7ym32;
            Object[] objArr = this.tGV7Q6urW;
            ArrayList arrayList = this.dIocxURUo;
            int[] iArr2 = w3r8jsmHE.CBQ5d1kRq;
            int i8 = w3r8jsmHE.kmSgne1rO;
            Object[] objArr2 = w3r8jsmHE.Bhmn1KIah;
            int i9 = w3r8jsmHE.PSTqBLTET;
            this.J4Ux7ym32 = iArr2;
            this.tGV7Q6urW = objArr2;
            ArrayList arrayList2 = w3r8jsmHE.Eeka1udhb;
            this.dIocxURUo = arrayList2;
            this.kCA6Zs9sL = i8;
            this.iiGwOFFnr = (iArr2.length / 5) - i8;
            this.oon79WMrY = i9;
            this.vPSbyrYWX = objArr2.length - i9;
            this.CBQ5d1kRq = i8;
            w3r8jsmHE.CBQ5d1kRq = iArr;
            w3r8jsmHE.kmSgne1rO = 0;
            w3r8jsmHE.Bhmn1KIah = objArr;
            w3r8jsmHE.PSTqBLTET = 0;
            w3r8jsmHE.Eeka1udhb = arrayList;
            return arrayList2;
        } else {
            ZVqfObOve kCA6Zs9sL = w3r8jsmHE.kCA6Zs9sL();
            try {
                int CBQ5d1kRq = xpuSUT7Gh.CBQ5d1kRq(kCA6Zs9sL.J4Ux7ym32, i < kCA6Zs9sL.kCA6Zs9sL ? i : kCA6Zs9sL.iiGwOFFnr + i);
                int i10 = i + CBQ5d1kRq;
                int GPLPRo6go = kCA6Zs9sL.GPLPRo6go(i);
                int GPLPRo6go2 = kCA6Zs9sL.GPLPRo6go(i10) - GPLPRo6go;
                dXrmkklc8(CBQ5d1kRq);
                RG6kpfv3v(GPLPRo6go2, this.qVUwofr5s);
                int[] iArr3 = this.J4Ux7ym32;
                int i11 = this.qVUwofr5s;
                int i12 = i11 * 5;
                int i13 = i * 5;
                System.arraycopy(kCA6Zs9sL.J4Ux7ym32, i13, iArr3, i12, (i10 * 5) - i13);
                Object[] objArr3 = this.tGV7Q6urW;
                int i14 = this.Puu3Rhg4F;
                System.arraycopy(kCA6Zs9sL.tGV7Q6urW, GPLPRo6go, objArr3, i14, GPLPRo6go2);
                iArr3[i12 + 2] = this.Eeka1udhb;
                int i15 = i11 - i;
                int i16 = CBQ5d1kRq + i11;
                int Puu3Rhg4F = i14 - Puu3Rhg4F(iArr3, i11);
                int i17 = this.CBQ5d1kRq;
                int i18 = this.vPSbyrYWX;
                int length = objArr3.length;
                if (i11 < i16) {
                    i4 = GPLPRo6go2;
                    int i19 = i11;
                    while (true) {
                        i3 = i14;
                        int i20 = i19 + 1;
                        if (i19 != i11) {
                            int i21 = (i19 * 5) + 2;
                            iArr3[i21] = iArr3[i21] + i15;
                        }
                        i2 = i12;
                        int Puu3Rhg4F2 = Puu3Rhg4F(iArr3, i19) + Puu3Rhg4F;
                        if (i17 < i19) {
                            i6 = Puu3Rhg4F;
                            i7 = 0;
                        } else {
                            i6 = Puu3Rhg4F;
                            i7 = this.oon79WMrY;
                        }
                        iArr3[(i19 * 5) + 4] = oon79WMrY(Puu3Rhg4F2, i7, i18, length);
                        if (i19 == i17) {
                            i17++;
                        }
                        if (i20 >= i16) {
                            break;
                        }
                        i19 = i20;
                        i14 = i3;
                        Puu3Rhg4F = i6;
                        i12 = i2;
                    }
                } else {
                    i4 = GPLPRo6go2;
                    i2 = i12;
                    i3 = i14;
                }
                this.CBQ5d1kRq = i17;
                int MzoOEjc4X = xpuSUT7Gh.MzoOEjc4X(w3r8jsmHE.Eeka1udhb, i, w3r8jsmHE.kmSgne1rO);
                int MzoOEjc4X2 = xpuSUT7Gh.MzoOEjc4X(w3r8jsmHE.Eeka1udhb, i10, w3r8jsmHE.kmSgne1rO);
                if (MzoOEjc4X < MzoOEjc4X2) {
                    ArrayList arrayList3 = w3r8jsmHE.Eeka1udhb;
                    ArrayList arrayList4 = new ArrayList(MzoOEjc4X2 - MzoOEjc4X);
                    if (MzoOEjc4X < MzoOEjc4X2) {
                        int i22 = MzoOEjc4X;
                        while (true) {
                            int i23 = i22 + 1;
                            EuSwp7OG7 euSwp7OG7 = (EuSwp7OG7) arrayList3.get(i22);
                            euSwp7OG7.q3BipwRCk += i15;
                            arrayList4.add(euSwp7OG7);
                            if (i23 >= MzoOEjc4X2) {
                                break;
                            }
                            i22 = i23;
                        }
                    }
                    this.q3BipwRCk.Eeka1udhb.addAll(xpuSUT7Gh.MzoOEjc4X(this.dIocxURUo, this.qVUwofr5s, MzoOEjc4X()), arrayList4);
                    arrayList3.subList(MzoOEjc4X, MzoOEjc4X2).clear();
                    dqz1pJHWH = arrayList4;
                } else {
                    dqz1pJHWH = Dqz1pJHWH.CBQ5d1kRq;
                }
                int i8XZMQc6Z = kCA6Zs9sL.i8XZMQc6Z(kCA6Zs9sL.J4Ux7ym32, i);
                if (i8XZMQc6Z >= 0) {
                    kCA6Zs9sL.qFBXIgpia();
                    kCA6Zs9sL.q3BipwRCk(i8XZMQc6Z - kCA6Zs9sL.qVUwofr5s);
                    kCA6Zs9sL.qFBXIgpia();
                }
                kCA6Zs9sL.q3BipwRCk(i - kCA6Zs9sL.qVUwofr5s);
                boolean dfpT1j18n = kCA6Zs9sL.dfpT1j18n();
                if (i8XZMQc6Z >= 0) {
                    kCA6Zs9sL.IytU16YUK();
                    kCA6Zs9sL.vPSbyrYWX();
                    kCA6Zs9sL.IytU16YUK();
                    kCA6Zs9sL.vPSbyrYWX();
                }
                if (!dfpT1j18n) {
                    int i24 = this.Bhmn1KIah;
                    if (xpuSUT7Gh.PSTqBLTET(iArr3, i11)) {
                        i5 = 1;
                    } else {
                        i5 = iArr3[i2 + 1] & 134217727;
                    }
                    this.Bhmn1KIah = i24 + i5;
                    this.qVUwofr5s = i16;
                    this.Puu3Rhg4F = i3 + i4;
                    return dqz1pJHWH;
                }
                G7WvUK4mQ.tGV7Q6urW("Unexpectedly removed anchors".toString());
                throw null;
            } finally {
                kCA6Zs9sL.iiGwOFFnr();
            }
        }
    }

    public final void kCA6Zs9sL() {
        int i = this.kmSgne1rO;
        this.kmSgne1rO = i + 1;
        if (i == 0) {
            this.MzoOEjc4X.iiGwOFFnr((PSTqBLTET() - this.iiGwOFFnr) - this.GPLPRo6go);
        }
    }

    public final void kmSgne1rO(int i) {
        boolean z = true;
        if (this.kmSgne1rO <= 0) {
            int i2 = this.Eeka1udhb;
            if (i2 != i) {
                if (i < i2 || i >= this.GPLPRo6go) {
                    z = false;
                }
                if (z) {
                    int i3 = this.qVUwofr5s;
                    int i4 = this.Puu3Rhg4F;
                    int i5 = this.yWvV4ePLl;
                    this.qVUwofr5s = i;
                    qFBXIgpia();
                    this.qVUwofr5s = i3;
                    this.Puu3Rhg4F = i4;
                    this.yWvV4ePLl = i5;
                    return;
                }
                throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Started group must be a subgroup of the group at ", Integer.valueOf(i2)).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    public final void mUqPm6GBh(int i, Object obj) {
        int i2 = i < this.kCA6Zs9sL ? i : this.iiGwOFFnr + i;
        int[] iArr = this.J4Ux7ym32;
        if (i2 < iArr.length && xpuSUT7Gh.PSTqBLTET(iArr, i2)) {
            this.tGV7Q6urW[yWvV4ePLl(Puu3Rhg4F(this.J4Ux7ym32, i2))] = obj;
            return;
        }
        G7WvUK4mQ.tGV7Q6urW(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    public final void nlGCs0NZs(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = 1;
        Object[] objArr = this.kmSgne1rO > 0 ? 1 : null;
        this.ilHKhw3Yw.iiGwOFFnr(this.Bhmn1KIah);
        if (objArr != null) {
            dXrmkklc8(1);
            int i4 = this.qVUwofr5s;
            int qVUwofr5s = qVUwofr5s(i4);
            int i5 = rJ0s9PfCL.q3BipwRCk;
            Object obj3 = P7Re99G8L.J4Ux7ym32;
            int i6 = obj != obj3 ? 1 : 0;
            if (z || obj2 == obj3) {
                i3 = 0;
            }
            int[] iArr = this.J4Ux7ym32;
            int i7 = this.Eeka1udhb;
            int i8 = this.Puu3Rhg4F;
            int i9 = z ? 1073741824 : 0;
            int i10 = i6 != 0 ? 536870912 : 0;
            int i11 = i3 != 0 ? 268435456 : 0;
            int i12 = qVUwofr5s * 5;
            iArr[i12 + 0] = i;
            iArr[i12 + 1] = i9 | i10 | i11;
            iArr[i12 + 2] = i7;
            iArr[i12 + 3] = 0;
            iArr[i12 + 4] = i8;
            this.yWvV4ePLl = i8;
            int i13 = (z ? 1 : 0) + i6 + i3;
            if (i13 > 0) {
                RG6kpfv3v(i13, i4);
                Object[] objArr2 = this.tGV7Q6urW;
                int i14 = this.Puu3Rhg4F;
                if (z) {
                    i14++;
                    objArr2[i14] = obj2;
                }
                if (i6 != 0) {
                    i14++;
                    objArr2[i14] = obj;
                }
                if (i3 != 0) {
                    i14++;
                    objArr2[i14] = obj2;
                }
                this.Puu3Rhg4F = i14;
            }
            this.Bhmn1KIah = 0;
            i2 = i4 + 1;
            this.Eeka1udhb = i4;
            this.qVUwofr5s = i2;
        } else {
            this.PSTqBLTET.iiGwOFFnr(this.Eeka1udhb);
            this.MzoOEjc4X.iiGwOFFnr((PSTqBLTET() - this.iiGwOFFnr) - this.GPLPRo6go);
            int i15 = this.qVUwofr5s;
            int qVUwofr5s2 = qVUwofr5s(i15);
            int i16 = rJ0s9PfCL.q3BipwRCk;
            if (!anXlDk6fV.tGV7Q6urW(obj2, P7Re99G8L.J4Ux7ym32)) {
                if (z) {
                    mUqPm6GBh(this.qVUwofr5s, obj2);
                } else {
                    AqaWJg0b4(obj2);
                }
            }
            this.Puu3Rhg4F = CpG0imbht(this.J4Ux7ym32, qVUwofr5s2);
            this.yWvV4ePLl = Puu3Rhg4F(this.J4Ux7ym32, qVUwofr5s(this.qVUwofr5s + 1));
            this.Bhmn1KIah = xpuSUT7Gh.qVUwofr5s(this.J4Ux7ym32, qVUwofr5s2);
            this.Eeka1udhb = i15;
            this.qVUwofr5s = i15 + 1;
            i2 = i15 + xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, qVUwofr5s2);
        }
        this.GPLPRo6go = i2;
    }

    public final int oon79WMrY(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void q3BipwRCk(int i) {
        boolean z = true;
        if (i >= 0) {
            if (this.kmSgne1rO <= 0) {
                int i2 = this.qVUwofr5s + i;
                if (i2 < this.Eeka1udhb || i2 > this.GPLPRo6go) {
                    z = false;
                }
                if (z) {
                    this.qVUwofr5s = i2;
                    int Puu3Rhg4F = Puu3Rhg4F(this.J4Ux7ym32, qVUwofr5s(i2));
                    this.Puu3Rhg4F = Puu3Rhg4F;
                    this.yWvV4ePLl = Puu3Rhg4F;
                    return;
                }
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Cannot seek outside the current group (");
                q3BipwRCk.append(this.Eeka1udhb);
                q3BipwRCk.append('-');
                q3BipwRCk.append(this.GPLPRo6go);
                q3BipwRCk.append(')');
                G7WvUK4mQ.tGV7Q6urW(q3BipwRCk.toString().toString());
                throw null;
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        throw new IllegalArgumentException("Cannot seek backwards".toString());
    }

    public final void qFBXIgpia() {
        if (this.kmSgne1rO == 0) {
            int i = rJ0s9PfCL.q3BipwRCk;
            Object obj = P7Re99G8L.J4Ux7ym32;
            nlGCs0NZs(0, obj, false, obj);
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    public final int qVUwofr5s(int i) {
        return i < this.kCA6Zs9sL ? i : i + this.iiGwOFFnr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        r2 = r8.J4Ux7ym32;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r9 >= r1) goto L_0x006d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        java.lang.System.arraycopy(r2, r4, r2, r5 + r4, r6 - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        r7 = r6 + r5;
        java.lang.System.arraycopy(r2, r7, r2, r6, (r4 + r5) - r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void sk5s77z6Q(int i) {
        int i2;
        EuSwp7OG7 euSwp7OG7;
        int i3;
        EuSwp7OG7 euSwp7OG72;
        int i4;
        int i5 = this.iiGwOFFnr;
        int i6 = this.kCA6Zs9sL;
        if (i6 != i) {
            boolean z = true;
            if (!this.dIocxURUo.isEmpty()) {
                int PSTqBLTET = PSTqBLTET() - this.iiGwOFFnr;
                ArrayList arrayList = this.dIocxURUo;
                if (i6 < i) {
                    int MzoOEjc4X = xpuSUT7Gh.MzoOEjc4X(arrayList, i6, PSTqBLTET);
                    while (MzoOEjc4X < this.dIocxURUo.size() && (r6 = (euSwp7OG72 = (EuSwp7OG7) this.dIocxURUo.get(MzoOEjc4X)).q3BipwRCk) < 0 && (i4 = r6 + PSTqBLTET) < i) {
                        euSwp7OG72.q3BipwRCk = i4;
                        MzoOEjc4X++;
                    }
                } else {
                    int MzoOEjc4X2 = xpuSUT7Gh.MzoOEjc4X(arrayList, i, PSTqBLTET);
                    while (MzoOEjc4X2 < this.dIocxURUo.size() && (i3 = (euSwp7OG7 = (EuSwp7OG7) this.dIocxURUo.get(MzoOEjc4X2)).q3BipwRCk) >= 0) {
                        euSwp7OG7.q3BipwRCk = -(PSTqBLTET - i3);
                        MzoOEjc4X2++;
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int PSTqBLTET2 = PSTqBLTET();
            if (i6 >= PSTqBLTET2) {
                z = false;
            }
            Object obj = G7WvUK4mQ.q3BipwRCk;
            if (z) {
                while (i6 < PSTqBLTET2) {
                    int Eeka1udhb = xpuSUT7Gh.Eeka1udhb(this.J4Ux7ym32, i6);
                    if (Eeka1udhb > -2) {
                        i2 = Eeka1udhb;
                    } else {
                        i2 = MzoOEjc4X() + Eeka1udhb + 2;
                    }
                    if (i2 >= i) {
                        i2 = -((MzoOEjc4X() - i2) + 2);
                    }
                    if (i2 != Eeka1udhb) {
                        xpuSUT7Gh.WaUP0CF08(this.J4Ux7ym32, i6, i2);
                    }
                    i6++;
                    if (i6 == i) {
                        i6 += i5;
                    }
                }
            } else {
                G7WvUK4mQ.tGV7Q6urW("Check failed".toString());
                throw null;
            }
        }
        this.kCA6Zs9sL = i;
    }

    public final int tGV7Q6urW(EuSwp7OG7 euSwp7OG7) {
        int i = euSwp7OG7.q3BipwRCk;
        return i < 0 ? i + MzoOEjc4X() : i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SlotWriter(current = ");
        q3BipwRCk.append(this.qVUwofr5s);
        q3BipwRCk.append(" end=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(" size = ");
        q3BipwRCk.append(MzoOEjc4X());
        q3BipwRCk.append(" gap=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append('-');
        q3BipwRCk.append(this.kCA6Zs9sL + this.iiGwOFFnr);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public final int vPSbyrYWX() {
        int i = 1;
        int i2 = 0;
        boolean z = this.kmSgne1rO > 0;
        int i3 = this.qVUwofr5s;
        int i4 = this.GPLPRo6go;
        int i5 = this.Eeka1udhb;
        int qVUwofr5s = qVUwofr5s(i5);
        int i6 = this.Bhmn1KIah;
        int i7 = i3 - i5;
        boolean PSTqBLTET = xpuSUT7Gh.PSTqBLTET(this.J4Ux7ym32, qVUwofr5s);
        if (z) {
            xpuSUT7Gh.ixWaw2akD(this.J4Ux7ym32, qVUwofr5s, i7);
            xpuSUT7Gh.sk5s77z6Q(this.J4Ux7ym32, qVUwofr5s, i6);
            int kCA6Zs9sL = this.ilHKhw3Yw.kCA6Zs9sL();
            if (!PSTqBLTET) {
                i = i6;
            }
            this.Bhmn1KIah = kCA6Zs9sL + i;
            this.Eeka1udhb = i8XZMQc6Z(this.J4Ux7ym32, i5);
        } else {
            if (i3 != i4) {
                i = 0;
            }
            if (i != 0) {
                int CBQ5d1kRq = xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, qVUwofr5s);
                int qVUwofr5s2 = xpuSUT7Gh.qVUwofr5s(this.J4Ux7ym32, qVUwofr5s);
                xpuSUT7Gh.ixWaw2akD(this.J4Ux7ym32, qVUwofr5s, i7);
                xpuSUT7Gh.sk5s77z6Q(this.J4Ux7ym32, qVUwofr5s, i6);
                int kCA6Zs9sL2 = this.PSTqBLTET.kCA6Zs9sL();
                this.GPLPRo6go = (PSTqBLTET() - this.iiGwOFFnr) - this.MzoOEjc4X.kCA6Zs9sL();
                this.Eeka1udhb = kCA6Zs9sL2;
                int i8XZMQc6Z = i8XZMQc6Z(this.J4Ux7ym32, i5);
                int kCA6Zs9sL3 = this.ilHKhw3Yw.kCA6Zs9sL();
                this.Bhmn1KIah = kCA6Zs9sL3;
                if (i8XZMQc6Z == kCA6Zs9sL2) {
                    if (!PSTqBLTET) {
                        i2 = i6 - qVUwofr5s2;
                    }
                    this.Bhmn1KIah = kCA6Zs9sL3 + i2;
                } else {
                    int i8 = i7 - CBQ5d1kRq;
                    int i9 = PSTqBLTET ? 0 : i6 - qVUwofr5s2;
                    if (!(i8 == 0 && i9 == 0)) {
                        while (i8XZMQc6Z != 0 && i8XZMQc6Z != kCA6Zs9sL2 && (i9 != 0 || i8 != 0)) {
                            int qVUwofr5s3 = qVUwofr5s(i8XZMQc6Z);
                            if (i8 != 0) {
                                xpuSUT7Gh.ixWaw2akD(this.J4Ux7ym32, qVUwofr5s3, xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, qVUwofr5s3) + i8);
                            }
                            if (i9 != 0) {
                                int[] iArr = this.J4Ux7ym32;
                                xpuSUT7Gh.sk5s77z6Q(iArr, qVUwofr5s3, xpuSUT7Gh.qVUwofr5s(iArr, qVUwofr5s3) + i9);
                            }
                            if (xpuSUT7Gh.PSTqBLTET(this.J4Ux7ym32, qVUwofr5s3)) {
                                i9 = 0;
                            }
                            i8XZMQc6Z = i8XZMQc6Z(this.J4Ux7ym32, i8XZMQc6Z);
                        }
                    }
                    this.Bhmn1KIah += i9;
                }
            } else {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
        }
        return i6;
    }

    public final int yWvV4ePLl(int i) {
        return i < this.oon79WMrY ? i : i + this.vPSbyrYWX;
    }
}
