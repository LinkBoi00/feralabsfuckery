package con;
/* loaded from: classes.dex */
public final class DtU31vERS implements AU29aHa4X {
    public final float CBQ5d1kRq;
    public final float kmSgne1rO;

    public DtU31vERS(float f, float f2) {
        this.CBQ5d1kRq = f;
        this.kmSgne1rO = f2;
    }

    @Override // con.AU29aHa4X
    public float MzoOEjc4X(float f) {
        return iOdo7IZgc.iiGwOFFnr(this, f);
    }

    @Override // con.AU29aHa4X
    public long PSTqBLTET(long j) {
        return iOdo7IZgc.GPLPRo6go(this, j);
    }

    @Override // con.AU29aHa4X
    public float dfpT1j18n(int i) {
        return iOdo7IZgc.dIocxURUo(this, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DtU31vERS)) {
            return false;
        }
        DtU31vERS dtU31vERS = (DtU31vERS) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.CBQ5d1kRq), Float.valueOf(dtU31vERS.CBQ5d1kRq)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kmSgne1rO), Float.valueOf(dtU31vERS.kmSgne1rO));
    }

    @Override // con.AU29aHa4X
    public float getDensity() {
        return this.CBQ5d1kRq;
    }

    public int hashCode() {
        return Float.hashCode(this.kmSgne1rO) + (Float.hashCode(this.CBQ5d1kRq) * 31);
    }

    @Override // con.AU29aHa4X
    public int iiGwOFFnr(float f) {
        return iOdo7IZgc.tGV7Q6urW(this, f);
    }

    @Override // con.AU29aHa4X
    public float ilHKhw3Yw(long j) {
        return iOdo7IZgc.kCA6Zs9sL(this, j);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DensityImpl(density=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", fontScale=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.kmSgne1rO, ')');
    }

    @Override // con.AU29aHa4X
    public float yWvV4ePLl() {
        return this.kmSgne1rO;
    }
}
