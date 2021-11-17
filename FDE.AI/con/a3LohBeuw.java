package con;
/* loaded from: classes.dex */
public final class a3LohBeuw {
    public double J4Ux7ym32;
    public double q3BipwRCk;

    public a3LohBeuw(double d, double d2) {
        this.q3BipwRCk = d;
        this.J4Ux7ym32 = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3LohBeuw)) {
            return false;
        }
        a3LohBeuw a3lohbeuw = (a3LohBeuw) obj;
        return anXlDk6fV.tGV7Q6urW(Double.valueOf(this.q3BipwRCk), Double.valueOf(a3lohbeuw.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.J4Ux7ym32), Double.valueOf(a3lohbeuw.J4Ux7ym32));
    }

    public int hashCode() {
        return Double.hashCode(this.J4Ux7ym32) + (Double.hashCode(this.q3BipwRCk) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ComplexDouble(_real=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", _imaginary=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
