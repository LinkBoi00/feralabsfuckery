package con;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class klMjnHCuk {
    public static List J4Ux7ym32(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        K6PL0z3I0.q3BipwRCk(it.next());
        throw null;
    }

    public static List q3BipwRCk(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        qIxSZWcre qixszwcre = new qIxSZWcre(list2.size() + list.size());
        qixszwcre.addAll(list);
        qixszwcre.addAll(list2);
        return new ArrayList(qixszwcre);
    }
}
