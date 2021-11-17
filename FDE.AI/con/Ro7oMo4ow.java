package con;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
public final class Ro7oMo4ow implements bu5cjmae6, Serializable {
    public final bu5cjmae6 CBQ5d1kRq;
    public final zG81huwZq kmSgne1rO;

    public Ro7oMo4ow(bu5cjmae6 bu5cjmae6, zG81huwZq zg81huwzq) {
        this.CBQ5d1kRq = bu5cjmae6;
        this.kmSgne1rO = zg81huwzq;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof Ro7oMo4ow)) {
                return false;
            }
            Ro7oMo4ow ro7oMo4ow = (Ro7oMo4ow) obj;
            if (ro7oMo4ow.tGV7Q6urW() != tGV7Q6urW()) {
                return false;
            }
            Objects.requireNonNull(ro7oMo4ow);
            Ro7oMo4ow ro7oMo4ow2 = this;
            while (true) {
                zG81huwZq zg81huwzq = ro7oMo4ow2.kmSgne1rO;
                if (anXlDk6fV.tGV7Q6urW(ro7oMo4ow.get(zg81huwzq.getKey()), zg81huwzq)) {
                    bu5cjmae6 bu5cjmae6 = ro7oMo4ow2.CBQ5d1kRq;
                    if (!(bu5cjmae6 instanceof Ro7oMo4ow)) {
                        Objects.requireNonNull(bu5cjmae6, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        zG81huwZq zg81huwzq2 = (zG81huwZq) bu5cjmae6;
                        z = anXlDk6fV.tGV7Q6urW(ro7oMo4ow.get(zg81huwzq2.getKey()), zg81huwzq2);
                        break;
                    }
                    ro7oMo4ow2 = (Ro7oMo4ow) bu5cjmae6;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // con.bu5cjmae6
    public Object fold(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(this.CBQ5d1kRq.fold(obj, kkcqgcx5g), this.kmSgne1rO);
    }

    @Override // con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        Ro7oMo4ow ro7oMo4ow = this;
        while (true) {
            zG81huwZq zg81huwzq = ro7oMo4ow.kmSgne1rO.get(adus3shb2);
            if (zg81huwzq != null) {
                return zg81huwzq;
            }
            bu5cjmae6 bu5cjmae6 = ro7oMo4ow.CBQ5d1kRq;
            if (!(bu5cjmae6 instanceof Ro7oMo4ow)) {
                return bu5cjmae6.get(adus3shb2);
            }
            ro7oMo4ow = (Ro7oMo4ow) bu5cjmae6;
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.kmSgne1rO.hashCode() + this.CBQ5d1kRq.hashCode();
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        if (this.kmSgne1rO.get(adus3shb2) != null) {
            return this.CBQ5d1kRq;
        }
        bu5cjmae6 minusKey = this.CBQ5d1kRq.minusKey(adus3shb2);
        return minusKey == this.CBQ5d1kRq ? this : minusKey == HbUTGjFCZ.CBQ5d1kRq ? this.kmSgne1rO : new Ro7oMo4ow(minusKey, this.kmSgne1rO);
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return bu5cjmae6 == HbUTGjFCZ.CBQ5d1kRq ? this : (bu5cjmae6) bu5cjmae6.fold(this, pSdrExTbX.i0Zug1mVk);
    }

    public final int tGV7Q6urW() {
        int i = 2;
        Ro7oMo4ow ro7oMo4ow = this;
        while (true) {
            bu5cjmae6 bu5cjmae6 = ro7oMo4ow.CBQ5d1kRq;
            if (!(bu5cjmae6 instanceof Ro7oMo4ow)) {
                bu5cjmae6 = null;
            }
            ro7oMo4ow = (Ro7oMo4ow) bu5cjmae6;
            if (ro7oMo4ow == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("[");
        ZUnPHIUWr zUnPHIUWr = ZUnPHIUWr.CpG0imbht;
        return my9FFKbZi.q3BipwRCk(q3BipwRCk, (String) zUnPHIUWr.WaUP0CF08(this.CBQ5d1kRq.fold("", zUnPHIUWr), this.kmSgne1rO), "]");
    }
}
