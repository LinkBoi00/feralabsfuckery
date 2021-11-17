package con;
/* loaded from: classes.dex */
public class aT3qVrmRB implements Cloneable {
    public static final Object PSTqBLTET = new Object();
    public int Bhmn1KIah;
    public int[] CBQ5d1kRq;
    public Object[] kmSgne1rO;

    public aT3qVrmRB() {
        int kCA6Zs9sL = PhWyMtRZm.kCA6Zs9sL(10);
        this.CBQ5d1kRq = new int[kCA6Zs9sL];
        this.kmSgne1rO = new Object[kCA6Zs9sL];
    }

    public void GPLPRo6go(int i, Object obj) {
        int q3BipwRCk = PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, this.Bhmn1KIah, i);
        if (q3BipwRCk >= 0) {
            this.kmSgne1rO[q3BipwRCk] = obj;
            return;
        }
        int i2 = ~q3BipwRCk;
        int i3 = this.Bhmn1KIah;
        if (i2 < i3) {
            Object[] objArr = this.kmSgne1rO;
            if (objArr[i2] == PSTqBLTET) {
                this.CBQ5d1kRq[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.CBQ5d1kRq.length) {
            int kCA6Zs9sL = PhWyMtRZm.kCA6Zs9sL(i3 + 1);
            int[] iArr = new int[kCA6Zs9sL];
            Object[] objArr2 = new Object[kCA6Zs9sL];
            int[] iArr2 = this.CBQ5d1kRq;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.kmSgne1rO;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.CBQ5d1kRq = iArr;
            this.kmSgne1rO = objArr2;
        }
        int i4 = this.Bhmn1KIah - i2;
        if (i4 != 0) {
            int[] iArr3 = this.CBQ5d1kRq;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4);
            Object[] objArr4 = this.kmSgne1rO;
            System.arraycopy(objArr4, i2, objArr4, i5, this.Bhmn1KIah - i2);
        }
        this.CBQ5d1kRq[i2] = i;
        this.kmSgne1rO[i2] = obj;
        this.Bhmn1KIah++;
    }

    /* renamed from: J4Ux7ym32 */
    public aT3qVrmRB clone() {
        try {
            aT3qVrmRB at3qvrmrb = (aT3qVrmRB) super.clone();
            at3qvrmrb.CBQ5d1kRq = (int[]) this.CBQ5d1kRq.clone();
            at3qvrmrb.kmSgne1rO = (Object[]) this.kmSgne1rO.clone();
            return at3qvrmrb;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public int Puu3Rhg4F() {
        return this.Bhmn1KIah;
    }

    public Object dIocxURUo(int i) {
        return kCA6Zs9sL(i, null);
    }

    public int iiGwOFFnr(int i) {
        return this.CBQ5d1kRq[i];
    }

    public Object kCA6Zs9sL(int i, Object obj) {
        int q3BipwRCk = PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, this.Bhmn1KIah, i);
        if (q3BipwRCk >= 0) {
            Object[] objArr = this.kmSgne1rO;
            if (objArr[q3BipwRCk] != PSTqBLTET) {
                return objArr[q3BipwRCk];
            }
        }
        return obj;
    }

    public void q3BipwRCk(int i, Object obj) {
        int i2 = this.Bhmn1KIah;
        if (i2 == 0 || i > this.CBQ5d1kRq[i2 - 1]) {
            if (i2 >= this.CBQ5d1kRq.length) {
                int kCA6Zs9sL = PhWyMtRZm.kCA6Zs9sL(i2 + 1);
                int[] iArr = new int[kCA6Zs9sL];
                Object[] objArr = new Object[kCA6Zs9sL];
                int[] iArr2 = this.CBQ5d1kRq;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.kmSgne1rO;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.CBQ5d1kRq = iArr;
                this.kmSgne1rO = objArr;
            }
            this.CBQ5d1kRq[i2] = i;
            this.kmSgne1rO[i2] = obj;
            this.Bhmn1KIah = i2 + 1;
            return;
        }
        GPLPRo6go(i, obj);
    }

    public boolean tGV7Q6urW(int i) {
        return PhWyMtRZm.q3BipwRCk(this.CBQ5d1kRq, this.Bhmn1KIah, i) >= 0;
    }

    @Override // java.lang.Object
    public String toString() {
        if (Puu3Rhg4F() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Bhmn1KIah * 28);
        sb.append('{');
        for (int i = 0; i < this.Bhmn1KIah; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(iiGwOFFnr(i));
            sb.append('=');
            Object yWvV4ePLl = yWvV4ePLl(i);
            if (yWvV4ePLl != this) {
                sb.append(yWvV4ePLl);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object yWvV4ePLl(int i) {
        return this.kmSgne1rO[i];
    }
}
