package con;

import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public final class TQJXgv7HU {
    public int GPLPRo6go;
    public final int[] J4Ux7ym32;
    public int Puu3Rhg4F = -1;
    public final Object[] dIocxURUo;
    public int iiGwOFFnr;
    public final int kCA6Zs9sL;
    public int oon79WMrY;
    public final W3r8jsmHE q3BipwRCk;
    public final int tGV7Q6urW;
    public int vPSbyrYWX;
    public int yWvV4ePLl;

    public TQJXgv7HU(W3r8jsmHE w3r8jsmHE) {
        this.q3BipwRCk = w3r8jsmHE;
        this.J4Ux7ym32 = w3r8jsmHE.CBQ5d1kRq;
        int i = w3r8jsmHE.kmSgne1rO;
        this.tGV7Q6urW = i;
        this.dIocxURUo = w3r8jsmHE.Bhmn1KIah;
        this.kCA6Zs9sL = w3r8jsmHE.PSTqBLTET;
        this.GPLPRo6go = i;
    }

    public final Object Bhmn1KIah(int i) {
        if (!xpuSUT7Gh.PSTqBLTET(this.J4Ux7ym32, i)) {
            return null;
        }
        int[] iArr = this.J4Ux7ym32;
        if (xpuSUT7Gh.PSTqBLTET(iArr, i)) {
            return this.dIocxURUo[iArr[(i * 5) + 4]];
        }
        int i2 = rJ0s9PfCL.q3BipwRCk;
        return P7Re99G8L.J4Ux7ym32;
    }

    public final boolean CBQ5d1kRq(int i) {
        return xpuSUT7Gh.PSTqBLTET(this.J4Ux7ym32, i);
    }

    public final void Eeka1udhb() {
        if (this.yWvV4ePLl == 0) {
            this.iiGwOFFnr = this.GPLPRo6go;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    public final Object GPLPRo6go(int i) {
        return J4Ux7ym32(this.J4Ux7ym32, i);
    }

    public final Object J4Ux7ym32(int[] iArr, int i) {
        int i2;
        if (xpuSUT7Gh.kmSgne1rO(iArr, i)) {
            Object[] objArr = this.dIocxURUo;
            int i3 = i * 5;
            if (i3 >= iArr.length) {
                i2 = iArr.length;
            } else {
                i2 = xpuSUT7Gh.NyWTwPF6V(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
            }
            return objArr[i2];
        }
        int i4 = rJ0s9PfCL.q3BipwRCk;
        return P7Re99G8L.J4Ux7ym32;
    }

    public final int MzoOEjc4X(int i) {
        return xpuSUT7Gh.Eeka1udhb(this.J4Ux7ym32, i);
    }

    public final Object PSTqBLTET(int[] iArr, int i) {
        if (!xpuSUT7Gh.Bhmn1KIah(iArr, i)) {
            return null;
        }
        int i2 = i * 5;
        return this.dIocxURUo[xpuSUT7Gh.NyWTwPF6V(iArr[i2 + 1] >> 30) + iArr[i2 + 4]];
    }

    public final Object Puu3Rhg4F(int i) {
        int i2 = this.iiGwOFFnr;
        int dXrmkklc8 = xpuSUT7Gh.dXrmkklc8(this.J4Ux7ym32, i2);
        int i3 = i2 + 1;
        int i4 = dXrmkklc8 + i;
        if (i4 < (i3 < this.tGV7Q6urW ? xpuSUT7Gh.oon79WMrY(this.J4Ux7ym32, i3) : this.kCA6Zs9sL)) {
            return this.dIocxURUo[i4];
        }
        int i5 = rJ0s9PfCL.q3BipwRCk;
        return P7Re99G8L.J4Ux7ym32;
    }

    public final void dIocxURUo() {
        if (this.yWvV4ePLl == 0) {
            if (this.iiGwOFFnr == this.GPLPRo6go) {
                int Eeka1udhb = xpuSUT7Gh.Eeka1udhb(this.J4Ux7ym32, this.Puu3Rhg4F);
                this.Puu3Rhg4F = Eeka1udhb;
                this.GPLPRo6go = Eeka1udhb < 0 ? this.tGV7Q6urW : Eeka1udhb + xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, Eeka1udhb);
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    public final void dXrmkklc8() {
        if (this.yWvV4ePLl <= 0) {
            if (xpuSUT7Gh.Eeka1udhb(this.J4Ux7ym32, this.iiGwOFFnr) == this.Puu3Rhg4F) {
                int i = this.iiGwOFFnr;
                this.Puu3Rhg4F = i;
                this.GPLPRo6go = xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, i) + i;
                int i2 = this.iiGwOFFnr;
                int i3 = i2 + 1;
                this.iiGwOFFnr = i3;
                this.oon79WMrY = xpuSUT7Gh.dXrmkklc8(this.J4Ux7ym32, i2);
                this.vPSbyrYWX = i2 >= this.tGV7Q6urW - 1 ? this.kCA6Zs9sL : xpuSUT7Gh.oon79WMrY(this.J4Ux7ym32, i3);
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final int iiGwOFFnr() {
        int i = this.iiGwOFFnr;
        if (i < this.GPLPRo6go) {
            return this.J4Ux7ym32[i * 5];
        }
        return 0;
    }

    public final void ilHKhw3Yw(int i) {
        if (this.yWvV4ePLl == 0) {
            this.iiGwOFFnr = i;
            int Eeka1udhb = i < this.tGV7Q6urW ? xpuSUT7Gh.Eeka1udhb(this.J4Ux7ym32, i) : -1;
            this.Puu3Rhg4F = Eeka1udhb;
            if (Eeka1udhb < 0) {
                this.GPLPRo6go = this.tGV7Q6urW;
            } else {
                this.GPLPRo6go = xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, Eeka1udhb) + Eeka1udhb;
            }
            this.oon79WMrY = 0;
            this.vPSbyrYWX = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    public final Object kCA6Zs9sL() {
        int i = this.iiGwOFFnr;
        if (i < this.GPLPRo6go) {
            return J4Ux7ym32(this.J4Ux7ym32, i);
        }
        return 0;
    }

    public final Object kmSgne1rO() {
        int i;
        if (this.yWvV4ePLl > 0 || (i = this.oon79WMrY) >= this.vPSbyrYWX) {
            int i2 = rJ0s9PfCL.q3BipwRCk;
            return P7Re99G8L.J4Ux7ym32;
        }
        Object[] objArr = this.dIocxURUo;
        this.oon79WMrY = i + 1;
        return objArr[i];
    }

    public final Object oon79WMrY(int i) {
        return PSTqBLTET(this.J4Ux7ym32, i);
    }

    public final EuSwp7OG7 q3BipwRCk(int i) {
        ArrayList arrayList = this.q3BipwRCk.Eeka1udhb;
        int ln3nf7LH3 = xpuSUT7Gh.ln3nf7LH3(arrayList, i, this.tGV7Q6urW);
        if (ln3nf7LH3 >= 0) {
            return (EuSwp7OG7) arrayList.get(ln3nf7LH3);
        }
        EuSwp7OG7 euSwp7OG7 = new EuSwp7OG7(i);
        arrayList.add(-(ln3nf7LH3 + 1), euSwp7OG7);
        return euSwp7OG7;
    }

    public final int qVUwofr5s() {
        int i = 1;
        if (this.yWvV4ePLl == 0) {
            if (!xpuSUT7Gh.PSTqBLTET(this.J4Ux7ym32, this.iiGwOFFnr)) {
                i = xpuSUT7Gh.qVUwofr5s(this.J4Ux7ym32, this.iiGwOFFnr);
            }
            int i2 = this.iiGwOFFnr;
            this.iiGwOFFnr = xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, i2) + i2;
            return i;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    public final void tGV7Q6urW() {
        W3r8jsmHE w3r8jsmHE = this.q3BipwRCk;
        Objects.requireNonNull(w3r8jsmHE);
        if (this.q3BipwRCk == w3r8jsmHE && w3r8jsmHE.MzoOEjc4X > 0) {
            w3r8jsmHE.MzoOEjc4X--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    public final int vPSbyrYWX(int i) {
        return xpuSUT7Gh.CBQ5d1kRq(this.J4Ux7ym32, i);
    }

    public final int yWvV4ePLl(int i) {
        return this.J4Ux7ym32[i * 5];
    }
}
