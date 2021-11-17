package con;
/* loaded from: classes.dex */
public abstract class KjSpAhKVE extends m9DrxOui1 implements Sd85yPnM9 {
    public KjSpAhKVE(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KjSpAhKVE) {
            KjSpAhKVE kjSpAhKVE = (KjSpAhKVE) obj;
            return kCA6Zs9sL().equals(kjSpAhKVE.kCA6Zs9sL()) && this.PSTqBLTET.equals(kjSpAhKVE.PSTqBLTET) && this.MzoOEjc4X.equals(kjSpAhKVE.MzoOEjc4X) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, kjSpAhKVE.kmSgne1rO);
        } else if (obj instanceof Sd85yPnM9) {
            return obj.equals(J4Ux7ym32());
        } else {
            return false;
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = this.PSTqBLTET.hashCode();
        return this.MzoOEjc4X.hashCode() + ((hashCode + (kCA6Zs9sL().hashCode() * 31)) * 31);
    }

    @Override // java.lang.Object
    public String toString() {
        rDwEuEGSq J4Ux7ym32 = J4Ux7ym32();
        if (J4Ux7ym32 != this) {
            return J4Ux7ym32.toString();
        }
        return my9FFKbZi.q3BipwRCk(abGBwSu8x.q3BipwRCk("property "), this.PSTqBLTET, " (Kotlin reflection is not available)");
    }
}
