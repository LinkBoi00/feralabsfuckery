package con;
/* loaded from: classes.dex */
public final class vJeHCLnAC extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float tGV7Q6urW;

    public vJeHCLnAC(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
        this.kCA6Zs9sL = f3;
        this.iiGwOFFnr = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vJeHCLnAC)) {
            return false;
        }
        vJeHCLnAC vjehclnac = (vJeHCLnAC) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(vjehclnac.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(vjehclnac.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kCA6Zs9sL), Float.valueOf(vjehclnac.kCA6Zs9sL)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.iiGwOFFnr), Float.valueOf(vjehclnac.iiGwOFFnr));
    }

    public int hashCode() {
        return Float.hashCode(this.iiGwOFFnr) + gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, Float.hashCode(this.tGV7Q6urW) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ReflectiveCurveTo(x1=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", y1=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", x2=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", y2=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.iiGwOFFnr, ')');
    }
}
