package con;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class qlt0VySXJ implements Serializable {
    public final Throwable CBQ5d1kRq;

    public qlt0VySXJ(Throwable th) {
        this.CBQ5d1kRq = th;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return (obj instanceof qlt0VySXJ) && anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, ((qlt0VySXJ) obj).CBQ5d1kRq);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.CBQ5d1kRq.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Failure(");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
