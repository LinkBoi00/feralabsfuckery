package con;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class pnuAOe8oh implements RandomAccess {
    public int Bhmn1KIah;
    public Object[] CBQ5d1kRq;
    public List kmSgne1rO;

    public pnuAOe8oh(Object[] objArr, int i) {
        this.CBQ5d1kRq = objArr;
        this.Bhmn1KIah = i;
    }

    public final Object CBQ5d1kRq(int i) {
        Object[] objArr = this.CBQ5d1kRq;
        Object obj = objArr[i];
        int i2 = this.Bhmn1KIah;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.Bhmn1KIah - 1;
        this.Bhmn1KIah = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void GPLPRo6go(int i) {
        Object[] objArr = this.CBQ5d1kRq;
        if (objArr.length < i) {
            this.CBQ5d1kRq = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
        }
    }

    public final boolean J4Ux7ym32(Object obj) {
        GPLPRo6go(this.Bhmn1KIah + 1);
        Object[] objArr = this.CBQ5d1kRq;
        int i = this.Bhmn1KIah;
        objArr[i] = obj;
        this.Bhmn1KIah = i + 1;
        return true;
    }

    public final int Puu3Rhg4F(Object obj) {
        int i = this.Bhmn1KIah;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        Object[] objArr = this.CBQ5d1kRq;
        while (!anXlDk6fV.tGV7Q6urW(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean dIocxURUo(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        GPLPRo6go(collection.size() + this.Bhmn1KIah);
        Object[] objArr = this.CBQ5d1kRq;
        if (i != this.Bhmn1KIah) {
            System.arraycopy(objArr, i, objArr, collection.size() + i, this.Bhmn1KIah - i);
        }
        for (Object obj : collection) {
            i2++;
            if (i2 >= 0) {
                objArr[i2 + i] = obj;
            } else {
                idpM54xlp.IytU16YUK();
                throw null;
            }
        }
        this.Bhmn1KIah = collection.size() + this.Bhmn1KIah;
        return true;
    }

    public final boolean iiGwOFFnr(Object obj) {
        int i = this.Bhmn1KIah - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq[i2], obj)) {
                    return true;
                }
                if (i2 == i) {
                    break;
                }
                i2 = i3;
            }
        }
        return false;
    }

    public final void kCA6Zs9sL() {
        Object[] objArr = this.CBQ5d1kRq;
        int i = this.Bhmn1KIah - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                objArr[i] = null;
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        this.Bhmn1KIah = 0;
    }

    public final boolean oon79WMrY() {
        return this.Bhmn1KIah != 0;
    }

    public final void q3BipwRCk(int i, Object obj) {
        GPLPRo6go(this.Bhmn1KIah + 1);
        Object[] objArr = this.CBQ5d1kRq;
        int i2 = this.Bhmn1KIah;
        if (i != i2) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        objArr[i] = obj;
        this.Bhmn1KIah++;
    }

    public final boolean tGV7Q6urW(int i, pnuAOe8oh pnuaoe8oh) {
        if (pnuaoe8oh.yWvV4ePLl()) {
            return false;
        }
        GPLPRo6go(this.Bhmn1KIah + pnuaoe8oh.Bhmn1KIah);
        Object[] objArr = this.CBQ5d1kRq;
        int i2 = this.Bhmn1KIah;
        if (i != i2) {
            System.arraycopy(objArr, i, objArr, pnuaoe8oh.Bhmn1KIah + i, i2 - i);
        }
        System.arraycopy(pnuaoe8oh.CBQ5d1kRq, 0, objArr, i, pnuaoe8oh.Bhmn1KIah - 0);
        this.Bhmn1KIah += pnuaoe8oh.Bhmn1KIah;
        return true;
    }

    public final boolean vPSbyrYWX(Object obj) {
        int Puu3Rhg4F = Puu3Rhg4F(obj);
        if (Puu3Rhg4F < 0) {
            return false;
        }
        CBQ5d1kRq(Puu3Rhg4F);
        return true;
    }

    public final boolean yWvV4ePLl() {
        return this.Bhmn1KIah == 0;
    }
}
