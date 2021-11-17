package con;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class IFeOgs2Gp extends aQP3HyIU9 {
    public static final Comparable MzoOEjc4X(PmYqqGuHi pmYqqGuHi) {
        Iterator it = ((CqYXp4s4a) pmYqqGuHi).iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final List ilHKhw3Yw(PmYqqGuHi pmYqqGuHi) {
        return idpM54xlp.i8XZMQc6Z(qVUwofr5s(pmYqqGuHi));
    }

    public static final List qVUwofr5s(PmYqqGuHi pmYqqGuHi) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : pmYqqGuHi) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
