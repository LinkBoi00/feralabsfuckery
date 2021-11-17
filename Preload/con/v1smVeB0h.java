package con;

import java.util.List;
/* loaded from: classes.dex */
public final class v1smVeB0h {
    public final List J4Ux7ym32;
    public final WwFGbLVWX q3BipwRCk;
    public final boolean tGV7Q6urW;

    public v1smVeB0h(WwFGbLVWX wwFGbLVWX, List list, boolean z) {
        this.q3BipwRCk = wwFGbLVWX;
        this.J4Ux7ym32 = list;
        this.tGV7Q6urW = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v1smVeB0h) {
            v1smVeB0h v1smveb0h = (v1smVeB0h) obj;
            if (anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, v1smveb0h.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, v1smveb0h.J4Ux7ym32) && this.tGV7Q6urW == v1smveb0h.tGV7Q6urW) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        return Boolean.valueOf(this.tGV7Q6urW).hashCode() + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31);
    }

    public final String q3BipwRCk() {
        String str;
        String str2;
        WwFGbLVWX wwFGbLVWX = this.q3BipwRCk;
        Class cls = null;
        if (!(wwFGbLVWX instanceof WwFGbLVWX)) {
            wwFGbLVWX = null;
        }
        if (wwFGbLVWX != null) {
            cls = idpM54xlp.oon79WMrY(wwFGbLVWX);
        }
        if (cls == null) {
            str = this.q3BipwRCk.toString();
        } else if (cls.isArray()) {
            str = anXlDk6fV.tGV7Q6urW(cls, boolean[].class) ? "kotlin.BooleanArray" : anXlDk6fV.tGV7Q6urW(cls, char[].class) ? "kotlin.CharArray" : anXlDk6fV.tGV7Q6urW(cls, byte[].class) ? "kotlin.ByteArray" : anXlDk6fV.tGV7Q6urW(cls, short[].class) ? "kotlin.ShortArray" : anXlDk6fV.tGV7Q6urW(cls, int[].class) ? "kotlin.IntArray" : anXlDk6fV.tGV7Q6urW(cls, float[].class) ? "kotlin.FloatArray" : anXlDk6fV.tGV7Q6urW(cls, long[].class) ? "kotlin.LongArray" : anXlDk6fV.tGV7Q6urW(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else {
            str = cls.getName();
        }
        String str3 = "";
        if (this.J4Ux7ym32.isEmpty()) {
            str2 = str3;
        } else {
            str2 = wkFJfVmcv.EBQXiIPmm(this.J4Ux7ym32, ", ", "<", ">", 0, null, new nVhenZUxZ(this), 24);
        }
        if (this.tGV7Q6urW) {
            str3 = "?";
        }
        return M5g57XBLr.q3BipwRCk(str, str2, str3);
    }

    public String toString() {
        return q3BipwRCk() + " (Kotlin reflection is not available)";
    }
}
