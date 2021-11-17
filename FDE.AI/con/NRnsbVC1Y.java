package con;
/* loaded from: classes.dex */
public class NRnsbVC1Y implements Cloneable {
    public static final Object MzoOEjc4X = new Object();
    public Object[] Bhmn1KIah;
    public boolean CBQ5d1kRq = false;
    public int PSTqBLTET;
    public long[] kmSgne1rO;

    public NRnsbVC1Y() {
        int iiGwOFFnr = PhWyMtRZm.iiGwOFFnr(10);
        this.kmSgne1rO = new long[iiGwOFFnr];
        this.Bhmn1KIah = new Object[iiGwOFFnr];
    }

    public int GPLPRo6go() {
        if (this.CBQ5d1kRq) {
            tGV7Q6urW();
        }
        return this.PSTqBLTET;
    }

    /* renamed from: J4Ux7ym32 */
    public NRnsbVC1Y clone() {
        try {
            NRnsbVC1Y nRnsbVC1Y = (NRnsbVC1Y) super.clone();
            nRnsbVC1Y.kmSgne1rO = (long[]) this.kmSgne1rO.clone();
            nRnsbVC1Y.Bhmn1KIah = (Object[]) this.Bhmn1KIah.clone();
            return nRnsbVC1Y;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Object Puu3Rhg4F(int i) {
        if (this.CBQ5d1kRq) {
            tGV7Q6urW();
        }
        return this.Bhmn1KIah[i];
    }

    public Object dIocxURUo(long j) {
        return kCA6Zs9sL(j, null);
    }

    public void iiGwOFFnr(long j, Object obj) {
        int J4Ux7ym32 = PhWyMtRZm.J4Ux7ym32(this.kmSgne1rO, this.PSTqBLTET, j);
        if (J4Ux7ym32 >= 0) {
            this.Bhmn1KIah[J4Ux7ym32] = obj;
            return;
        }
        int i = ~J4Ux7ym32;
        int i2 = this.PSTqBLTET;
        if (i < i2) {
            Object[] objArr = this.Bhmn1KIah;
            if (objArr[i] == MzoOEjc4X) {
                this.kmSgne1rO[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.CBQ5d1kRq && i2 >= this.kmSgne1rO.length) {
            tGV7Q6urW();
            i = ~PhWyMtRZm.J4Ux7ym32(this.kmSgne1rO, this.PSTqBLTET, j);
        }
        int i3 = this.PSTqBLTET;
        if (i3 >= this.kmSgne1rO.length) {
            int iiGwOFFnr = PhWyMtRZm.iiGwOFFnr(i3 + 1);
            long[] jArr = new long[iiGwOFFnr];
            Object[] objArr2 = new Object[iiGwOFFnr];
            long[] jArr2 = this.kmSgne1rO;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.Bhmn1KIah;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.kmSgne1rO = jArr;
            this.Bhmn1KIah = objArr2;
        }
        int i4 = this.PSTqBLTET;
        if (i4 - i != 0) {
            long[] jArr3 = this.kmSgne1rO;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.Bhmn1KIah;
            System.arraycopy(objArr4, i, objArr4, i5, this.PSTqBLTET - i);
        }
        this.kmSgne1rO[i] = j;
        this.Bhmn1KIah[i] = obj;
        this.PSTqBLTET++;
    }

    public Object kCA6Zs9sL(long j, Object obj) {
        int J4Ux7ym32 = PhWyMtRZm.J4Ux7ym32(this.kmSgne1rO, this.PSTqBLTET, j);
        if (J4Ux7ym32 >= 0) {
            Object[] objArr = this.Bhmn1KIah;
            if (objArr[J4Ux7ym32] != MzoOEjc4X) {
                return objArr[J4Ux7ym32];
            }
        }
        return obj;
    }

    public void q3BipwRCk() {
        int i = this.PSTqBLTET;
        Object[] objArr = this.Bhmn1KIah;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.PSTqBLTET = 0;
        this.CBQ5d1kRq = false;
    }

    public final void tGV7Q6urW() {
        int i = this.PSTqBLTET;
        long[] jArr = this.kmSgne1rO;
        Object[] objArr = this.Bhmn1KIah;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != MzoOEjc4X) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.CBQ5d1kRq = false;
        this.PSTqBLTET = i2;
    }

    @Override // java.lang.Object
    public String toString() {
        if (GPLPRo6go() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.PSTqBLTET * 28);
        sb.append('{');
        for (int i = 0; i < this.PSTqBLTET; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.CBQ5d1kRq) {
                tGV7Q6urW();
            }
            sb.append(this.kmSgne1rO[i]);
            sb.append('=');
            Object Puu3Rhg4F = Puu3Rhg4F(i);
            if (Puu3Rhg4F != this) {
                sb.append(Puu3Rhg4F);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
