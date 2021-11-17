package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class pD7fcxitw extends Wk9bO57s4 implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pD7fcxitw(kkcQgCx5G kkcqgcx5g) {
        super(2);
        this.kmSgne1rO = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        fL8zjEapz fl8zjeapz = (fL8zjEapz) obj;
        List list = (List) this.kmSgne1rO.WaUP0CF08(fl8zjeapz, obj2);
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj3 = list.get(i);
                if (obj3 != null && !fl8zjeapz.q3BipwRCk.q3BipwRCk(obj3)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }
}
