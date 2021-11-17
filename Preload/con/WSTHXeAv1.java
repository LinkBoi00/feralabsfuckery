package con;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class WSTHXeAv1 implements PmYqqGuHi {
    public final AtomicReference q3BipwRCk;

    public WSTHXeAv1(PmYqqGuHi pmYqqGuHi) {
        this.q3BipwRCk = new AtomicReference(pmYqqGuHi);
    }

    @Override // con.PmYqqGuHi
    public Iterator iterator() {
        PmYqqGuHi pmYqqGuHi = (PmYqqGuHi) this.q3BipwRCk.getAndSet(null);
        if (pmYqqGuHi != null) {
            return pmYqqGuHi.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
