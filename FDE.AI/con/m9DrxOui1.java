package con;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class m9DrxOui1 implements rDwEuEGSq, Serializable {
    public final Class Bhmn1KIah;
    public transient rDwEuEGSq CBQ5d1kRq;
    public final String MzoOEjc4X;
    public final String PSTqBLTET;
    public final boolean ilHKhw3Yw;
    public final Object kmSgne1rO;

    public m9DrxOui1(Object obj, Class cls, String str, String str2, boolean z) {
        this.kmSgne1rO = obj;
        this.Bhmn1KIah = cls;
        this.PSTqBLTET = str;
        this.MzoOEjc4X = str2;
        this.ilHKhw3Yw = z;
    }

    public rDwEuEGSq J4Ux7ym32() {
        rDwEuEGSq rdweuegsq = this.CBQ5d1kRq;
        if (rdweuegsq != null) {
            return rdweuegsq;
        }
        rDwEuEGSq tGV7Q6urW = tGV7Q6urW();
        this.CBQ5d1kRq = tGV7Q6urW;
        return tGV7Q6urW;
    }

    public String dIocxURUo() {
        return this.PSTqBLTET;
    }

    public String iiGwOFFnr() {
        return this.MzoOEjc4X;
    }

    public gmO9ra072 kCA6Zs9sL() {
        Class cls = this.Bhmn1KIah;
        if (cls == null) {
            return null;
        }
        if (!this.ilHKhw3Yw) {
            return YGTdT21e3.q3BipwRCk(cls);
        }
        Objects.requireNonNull(YGTdT21e3.q3BipwRCk);
        return new lzs96Uhwo(cls, "");
    }

    public abstract rDwEuEGSq tGV7Q6urW();
}
