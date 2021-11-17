package con;
/* loaded from: classes.dex */
public final class Nrdhx1ztZ {
    public final hWwBa8Afv J4Ux7ym32;
    public final Url79wyVD dIocxURUo;
    public final vZSd4byf0 q3BipwRCk;
    public final long tGV7Q6urW;

    public Nrdhx1ztZ(vZSd4byf0 vzsd4byf0, hWwBa8Afv hwwba8afv, long j, Url79wyVD url79wyVD, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = vzsd4byf0;
        this.J4Ux7ym32 = hwwba8afv;
        this.tGV7Q6urW = j;
        this.dIocxURUo = url79wyVD;
        rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
        if (!QnjhYJNrZ.q3BipwRCk(j, QnjhYJNrZ.dIocxURUo)) {
            if (!(QnjhYJNrZ.tGV7Q6urW(j) >= 0.0f)) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("lineHeight can't be negative (");
                q3BipwRCk.append(QnjhYJNrZ.tGV7Q6urW(j));
                q3BipwRCk.append(')');
                throw new IllegalStateException(q3BipwRCk.toString().toString());
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nrdhx1ztZ)) {
            return false;
        }
        Nrdhx1ztZ nrdhx1ztZ = (Nrdhx1ztZ) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, nrdhx1ztZ.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, nrdhx1ztZ.J4Ux7ym32) && QnjhYJNrZ.q3BipwRCk(this.tGV7Q6urW, nrdhx1ztZ.tGV7Q6urW) && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, nrdhx1ztZ.dIocxURUo);
    }

    public int hashCode() {
        int i;
        int i2;
        vZSd4byf0 vzsd4byf0 = this.q3BipwRCk;
        int i3 = 0;
        if (vzsd4byf0 == null) {
            i = 0;
        } else {
            i = Integer.hashCode(vzsd4byf0.q3BipwRCk);
        }
        int i4 = i * 31;
        hWwBa8Afv hwwba8afv = this.J4Ux7ym32;
        if (hwwba8afv == null) {
            i2 = 0;
        } else {
            i2 = Integer.hashCode(hwwba8afv.q3BipwRCk);
        }
        long j = this.tGV7Q6urW;
        rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
        int hashCode = (((i4 + i2) * 31) + Long.hashCode(j)) * 31;
        Url79wyVD url79wyVD = this.dIocxURUo;
        if (url79wyVD != null) {
            i3 = url79wyVD.hashCode();
        }
        return hashCode + i3;
    }

    public final Nrdhx1ztZ q3BipwRCk(Nrdhx1ztZ nrdhx1ztZ) {
        if (nrdhx1ztZ == null) {
            return this;
        }
        long j = BBVaGLNaU.CpG0imbht(nrdhx1ztZ.tGV7Q6urW) ? this.tGV7Q6urW : nrdhx1ztZ.tGV7Q6urW;
        Url79wyVD url79wyVD = nrdhx1ztZ.dIocxURUo;
        if (url79wyVD == null) {
            url79wyVD = this.dIocxURUo;
        }
        vZSd4byf0 vzsd4byf0 = nrdhx1ztZ.q3BipwRCk;
        if (vzsd4byf0 == null) {
            vzsd4byf0 = this.q3BipwRCk;
        }
        hWwBa8Afv hwwba8afv = nrdhx1ztZ.J4Ux7ym32;
        if (hwwba8afv == null) {
            hwwba8afv = this.J4Ux7ym32;
        }
        return new Nrdhx1ztZ(vzsd4byf0, hwwba8afv, j, url79wyVD, null);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ParagraphStyle(textAlign=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", textDirection=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", lineHeight=");
        q3BipwRCk.append((Object) QnjhYJNrZ.dIocxURUo(this.tGV7Q6urW));
        q3BipwRCk.append(", textIndent=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
