package con;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class T3CB429PD implements llWJsfBCK, Serializable {
    public gdEmqfwpT CBQ5d1kRq;
    public Object kmSgne1rO = c4RErJAXI.q3BipwRCk;

    public T3CB429PD(gdEmqfwpT gdemqfwpt) {
        this.CBQ5d1kRq = gdemqfwpt;
    }

    @Override // con.llWJsfBCK
    public Object getValue() {
        if (this.kmSgne1rO == c4RErJAXI.q3BipwRCk) {
            this.kmSgne1rO = this.CBQ5d1kRq.GPLPRo6go();
            this.CBQ5d1kRq = null;
        }
        return this.kmSgne1rO;
    }

    @Override // java.lang.Object
    public String toString() {
        return this.kmSgne1rO != c4RErJAXI.q3BipwRCk ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
