package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class CmEmpXorE {
    public final jmbWiIwa0 J4Ux7ym32;
    public final Object dIocxURUo;
    public final Throwable kCA6Zs9sL;
    public final Object q3BipwRCk;
    public final PmanMZxiM tGV7Q6urW;

    public CmEmpXorE(Object obj, jmbWiIwa0 jmbwiiwa0, PmanMZxiM pmanMZxiM, Object obj2, Throwable th) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = jmbwiiwa0;
        this.tGV7Q6urW = pmanMZxiM;
        this.dIocxURUo = obj2;
        this.kCA6Zs9sL = th;
    }

    public CmEmpXorE(Object obj, jmbWiIwa0 jmbwiiwa0, PmanMZxiM pmanMZxiM, Object obj2, Throwable th, int i) {
        jmbwiiwa0 = (i & 2) != 0 ? null : jmbwiiwa0;
        pmanMZxiM = (i & 4) != 0 ? null : pmanMZxiM;
        obj2 = (i & 8) != 0 ? null : obj2;
        th = (i & 16) != 0 ? null : th;
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = jmbwiiwa0;
        this.tGV7Q6urW = pmanMZxiM;
        this.dIocxURUo = obj2;
        this.kCA6Zs9sL = th;
    }

    public static CmEmpXorE q3BipwRCk(CmEmpXorE cmEmpXorE, Object obj, jmbWiIwa0 jmbwiiwa0, PmanMZxiM pmanMZxiM, Object obj2, Throwable th, int i) {
        Object obj3 = null;
        Object obj4 = (i & 1) != 0 ? cmEmpXorE.q3BipwRCk : null;
        if ((i & 2) != 0) {
            jmbwiiwa0 = cmEmpXorE.J4Ux7ym32;
        }
        PmanMZxiM pmanMZxiM2 = (i & 4) != 0 ? cmEmpXorE.tGV7Q6urW : null;
        if ((i & 8) != 0) {
            obj3 = cmEmpXorE.dIocxURUo;
        }
        if ((i & 16) != 0) {
            th = cmEmpXorE.kCA6Zs9sL;
        }
        Objects.requireNonNull(cmEmpXorE);
        return new CmEmpXorE(obj4, jmbwiiwa0, pmanMZxiM2, obj3, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmEmpXorE)) {
            return false;
        }
        CmEmpXorE cmEmpXorE = (CmEmpXorE) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, cmEmpXorE.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, cmEmpXorE.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, cmEmpXorE.tGV7Q6urW) && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, cmEmpXorE.dIocxURUo) && anXlDk6fV.tGV7Q6urW(this.kCA6Zs9sL, cmEmpXorE.kCA6Zs9sL);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        jmbWiIwa0 jmbwiiwa0 = this.J4Ux7ym32;
        int hashCode2 = (hashCode + (jmbwiiwa0 == null ? 0 : jmbwiiwa0.hashCode())) * 31;
        PmanMZxiM pmanMZxiM = this.tGV7Q6urW;
        int hashCode3 = (hashCode2 + (pmanMZxiM == null ? 0 : pmanMZxiM.hashCode())) * 31;
        Object obj2 = this.dIocxURUo;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.kCA6Zs9sL;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CompletedContinuation(result=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", cancelHandler=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", onCancellation=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", idempotentResume=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", cancelCause=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
