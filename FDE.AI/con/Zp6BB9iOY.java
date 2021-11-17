package con;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class Zp6BB9iOY extends yZALYRwqL {
    public static final Zp6BB9iOY J4Ux7ym32 = new Zp6BB9iOY();

    public Zp6BB9iOY() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // con.nBnrGO77H
    public aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        int i;
        int vPSbyrYWX;
        int oon79WMrY;
        Map map;
        PmanMZxiM vDA3chfQE;
        if (list.isEmpty()) {
            vPSbyrYWX = K5PjwoFCN.vPSbyrYWX(j);
            oon79WMrY = K5PjwoFCN.oon79WMrY(j);
            map = null;
            vDA3chfQE = JHFXdtjfx.cAwN510t2;
        } else {
            int i2 = 0;
            if (list.size() == 1) {
                n2gATecRC dIocxURUo = ((hKxHUWEcH) list.get(0)).dIocxURUo(j);
                vPSbyrYWX = dnBSj5uJN.vPSbyrYWX(j, dIocxURUo.CBQ5d1kRq);
                oon79WMrY = dnBSj5uJN.oon79WMrY(j, dIocxURUo.kmSgne1rO);
                map = null;
                vDA3chfQE = new VDA3chfQE(dIocxURUo, 6);
            } else {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size() - 1;
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        arrayList.add(((hKxHUWEcH) list.get(i3)).dIocxURUo(j));
                        if (i4 > size) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i5 = 0;
                    i = 0;
                    while (true) {
                        int i6 = i2 + 1;
                        n2gATecRC n2gatecrc = (n2gATecRC) arrayList.get(i2);
                        i5 = Math.max(n2gatecrc.CBQ5d1kRq, i5);
                        i = Math.max(n2gatecrc.kmSgne1rO, i);
                        if (i6 > size2) {
                            break;
                        }
                        i2 = i6;
                    }
                    i2 = i5;
                } else {
                    i = 0;
                }
                return fRJidynr8.nlGCs0NZs(dnBSj5uJN.vPSbyrYWX(j, i2), dnBSj5uJN.oon79WMrY(j, i), (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new bvjNsSY6E(arrayList, 5));
            }
        }
        return fRJidynr8.nlGCs0NZs(vPSbyrYWX, oon79WMrY, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, vDA3chfQE);
    }
}
