package con;
/* loaded from: classes.dex */
public final class BVTcmvmUA implements UBY2Inzw8 {
    public final Object CBQ5d1kRq;

    public BVTcmvmUA(Object obj) {
        this.CBQ5d1kRq = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BVTcmvmUA) && anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, ((BVTcmvmUA) obj).CBQ5d1kRq);
    }

    @Override // con.UBY2Inzw8
    public Object getValue() {
        return this.CBQ5d1kRq;
    }

    public int hashCode() {
        Object obj = this.CBQ5d1kRq;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("StaticValueHolder(value=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
