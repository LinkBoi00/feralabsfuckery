package con;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class tGBv7y54S implements llWJsfBCK, Serializable {
    public static final AtomicReferenceFieldUpdater Bhmn1KIah = AtomicReferenceFieldUpdater.newUpdater(tGBv7y54S.class, Object.class, "kmSgne1rO");
    public volatile gdEmqfwpT CBQ5d1kRq;
    public volatile Object kmSgne1rO = c4RErJAXI.q3BipwRCk;

    public tGBv7y54S(gdEmqfwpT gdemqfwpt) {
        this.CBQ5d1kRq = gdemqfwpt;
    }

    @Override // con.llWJsfBCK
    public Object getValue() {
        Object obj = this.kmSgne1rO;
        c4RErJAXI c4rerjaxi = c4RErJAXI.q3BipwRCk;
        if (obj != c4rerjaxi) {
            return obj;
        }
        gdEmqfwpT gdemqfwpt = this.CBQ5d1kRq;
        if (gdemqfwpt != null) {
            Object GPLPRo6go = gdemqfwpt.GPLPRo6go();
            if (Bhmn1KIah.compareAndSet(this, c4rerjaxi, GPLPRo6go)) {
                this.CBQ5d1kRq = null;
                return GPLPRo6go;
            }
        }
        return this.kmSgne1rO;
    }

    @Override // java.lang.Object
    public String toString() {
        return this.kmSgne1rO != c4RErJAXI.q3BipwRCk ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
