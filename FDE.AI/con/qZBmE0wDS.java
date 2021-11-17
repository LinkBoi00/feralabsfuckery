package con;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class qZBmE0wDS implements Serializable {
    public final Object Bhmn1KIah;
    public final Object CBQ5d1kRq;
    public final Object kmSgne1rO;

    public qZBmE0wDS(Object obj, Object obj2, Object obj3) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = obj2;
        this.Bhmn1KIah = obj3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qZBmE0wDS)) {
            return false;
        }
        qZBmE0wDS qzbme0wds = (qZBmE0wDS) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, qzbme0wds.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, qzbme0wds.kmSgne1rO) && anXlDk6fV.tGV7Q6urW(this.Bhmn1KIah, qzbme0wds.Bhmn1KIah);
    }

    @Override // java.lang.Object
    public int hashCode() {
        Object obj = this.CBQ5d1kRq;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.kmSgne1rO;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.Bhmn1KIah;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        return '(' + this.CBQ5d1kRq + ", " + this.kmSgne1rO + ", " + this.Bhmn1KIah + ')';
    }
}
