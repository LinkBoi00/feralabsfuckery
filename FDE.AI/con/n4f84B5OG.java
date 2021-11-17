package con;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class n4f84B5OG implements Serializable {
    public final Object CBQ5d1kRq;
    public final Object kmSgne1rO;

    public n4f84B5OG(Object obj, Object obj2) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = obj2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4f84B5OG)) {
            return false;
        }
        n4f84B5OG n4f84b5og = (n4f84B5OG) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, n4f84b5og.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, n4f84b5og.kmSgne1rO);
    }

    @Override // java.lang.Object
    public int hashCode() {
        Object obj = this.CBQ5d1kRq;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.kmSgne1rO;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        return '(' + this.CBQ5d1kRq + ", " + this.kmSgne1rO + ')';
    }
}
