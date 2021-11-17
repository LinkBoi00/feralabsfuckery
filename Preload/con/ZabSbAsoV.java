package con;

import java.util.Locale;
/* loaded from: classes.dex */
public final class ZabSbAsoV {
    public final A2Z5rAVoP q3BipwRCk;

    public ZabSbAsoV(A2Z5rAVoP a2Z5rAVoP) {
        this.q3BipwRCk = a2Z5rAVoP;
    }

    public ZabSbAsoV(String str) {
        this.q3BipwRCk = new A2Z5rAVoP(Locale.forLanguageTag(str));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ZabSbAsoV)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return anXlDk6fV.tGV7Q6urW(q3BipwRCk(), ((ZabSbAsoV) obj).q3BipwRCk());
    }

    public int hashCode() {
        return q3BipwRCk().hashCode();
    }

    public final String q3BipwRCk() {
        return this.q3BipwRCk.q3BipwRCk.toLanguageTag();
    }

    public String toString() {
        return q3BipwRCk();
    }
}
