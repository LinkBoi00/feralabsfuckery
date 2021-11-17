package con;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class CqYXp4s4a implements PmYqqGuHi {
    public final PmYqqGuHi J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;
    public final Object tGV7Q6urW;

    public CqYXp4s4a(PmYqqGuHi pmYqqGuHi, PmanMZxiM pmanMZxiM) {
        this.J4Ux7ym32 = pmYqqGuHi;
        this.tGV7Q6urW = pmanMZxiM;
    }

    @Override // con.PmYqqGuHi
    public Iterator iterator() {
        switch (this.q3BipwRCk) {
            case 0:
                List qVUwofr5s = IFeOgs2Gp.qVUwofr5s(this.J4Ux7ym32);
                FSq6CQ0dR.AqaWJg0b4(qVUwofr5s, (Comparator) this.tGV7Q6urW);
                return ((ArrayList) qVUwofr5s).iterator();
            default:
                return new jRu4T1mV3(this);
        }
    }

    public CqYXp4s4a(PmYqqGuHi pmYqqGuHi, Comparator comparator) {
        this.J4Ux7ym32 = pmYqqGuHi;
        this.tGV7Q6urW = comparator;
    }
}
