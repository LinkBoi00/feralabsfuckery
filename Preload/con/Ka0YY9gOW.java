package con;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class Ka0YY9gOW implements llWJsfBCK, Serializable {
    public gdEmqfwpT CBQ5d1kRq;
    public volatile Object kmSgne1rO = c4RErJAXI.q3BipwRCk;
    public final Object Bhmn1KIah = this;

    public Ka0YY9gOW(gdEmqfwpT gdemqfwpt, Object obj, int i) {
        this.CBQ5d1kRq = gdemqfwpt;
    }

    @Override // con.llWJsfBCK
    public Object getValue() {
        Object obj;
        Object obj2 = this.kmSgne1rO;
        c4RErJAXI c4rerjaxi = c4RErJAXI.q3BipwRCk;
        if (obj2 != c4rerjaxi) {
            return obj2;
        }
        synchronized (this.Bhmn1KIah) {
            obj = this.kmSgne1rO;
            if (obj == c4rerjaxi) {
                obj = this.CBQ5d1kRq.GPLPRo6go();
                this.kmSgne1rO = obj;
                this.CBQ5d1kRq = null;
            }
        }
        return obj;
    }

    @Override // java.lang.Object
    public String toString() {
        return this.kmSgne1rO != c4RErJAXI.q3BipwRCk ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
