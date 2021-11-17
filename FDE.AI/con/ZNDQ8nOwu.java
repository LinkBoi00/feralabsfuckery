package con;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class ZNDQ8nOwu extends m9DrxOui1 implements xSLgCZTSl, uMeWyiQGN {
    public final int Eeka1udhb;
    public final int qVUwofr5s;

    public ZNDQ8nOwu(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.qVUwofr5s = i;
        this.Eeka1udhb = i2 >> 1;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZNDQ8nOwu) {
            ZNDQ8nOwu zNDQ8nOwu = (ZNDQ8nOwu) obj;
            return anXlDk6fV.tGV7Q6urW(kCA6Zs9sL(), zNDQ8nOwu.kCA6Zs9sL()) && dIocxURUo().equals(zNDQ8nOwu.dIocxURUo()) && iiGwOFFnr().equals(zNDQ8nOwu.iiGwOFFnr()) && this.Eeka1udhb == zNDQ8nOwu.Eeka1udhb && this.qVUwofr5s == zNDQ8nOwu.qVUwofr5s && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, zNDQ8nOwu.kmSgne1rO);
        } else if (obj instanceof uMeWyiQGN) {
            return obj.equals(J4Ux7ym32());
        } else {
            return false;
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        return iiGwOFFnr().hashCode() + ((dIocxURUo().hashCode() + (kCA6Zs9sL() == null ? 0 : kCA6Zs9sL().hashCode() * 31)) * 31);
    }

    @Override // con.xSLgCZTSl
    public int kmSgne1rO() {
        return this.qVUwofr5s;
    }

    @Override // con.m9DrxOui1
    public rDwEuEGSq tGV7Q6urW() {
        Objects.requireNonNull(YGTdT21e3.q3BipwRCk);
        return this;
    }

    @Override // java.lang.Object
    public String toString() {
        rDwEuEGSq J4Ux7ym32 = J4Ux7ym32();
        if (J4Ux7ym32 != this) {
            return J4Ux7ym32.toString();
        }
        if ("<init>".equals(dIocxURUo())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("function ");
        q3BipwRCk.append(dIocxURUo());
        q3BipwRCk.append(" (Kotlin reflection is not available)");
        return q3BipwRCk.toString();
    }
}
