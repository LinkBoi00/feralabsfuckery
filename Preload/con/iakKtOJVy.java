package con;

import java.util.Map;
/* loaded from: classes.dex */
public final class iakKtOJVy implements Map.Entry, f7VKpcPHS {
    public final Object CBQ5d1kRq;
    public final Object kmSgne1rO;

    public iakKtOJVy(Object obj, Object obj2) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = obj2;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iakKtOJVy)) {
            return false;
        }
        iakKtOJVy iakktojvy = (iakKtOJVy) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, iakktojvy.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, iakktojvy.kmSgne1rO);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.CBQ5d1kRq;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.kmSgne1rO;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public int hashCode() {
        int i;
        Object obj = this.CBQ5d1kRq;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = i * 31;
        Object obj2 = this.kmSgne1rO;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("MapEntry(key=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", value=");
        q3BipwRCk.append(this.kmSgne1rO);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
