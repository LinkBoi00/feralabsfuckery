package con;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class gXDw1hlBA implements dVtF46MWK {
    public final Map J4Ux7ym32;
    public final PmanMZxiM q3BipwRCk;
    public final Map tGV7Q6urW;

    public gXDw1hlBA(Map map, PmanMZxiM pmanMZxiM) {
        this.q3BipwRCk = pmanMZxiM;
        LinkedHashMap linkedHashMap = map == null ? null : new LinkedHashMap(map);
        this.J4Ux7ym32 = linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
        this.tGV7Q6urW = new LinkedHashMap();
    }

    @Override // con.dVtF46MWK
    public Map J4Ux7ym32() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.J4Ux7ym32);
        for (Map.Entry entry : this.tGV7Q6urW.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object GPLPRo6go = ((gdEmqfwpT) list.get(0)).GPLPRo6go();
                if (GPLPRo6go == null) {
                    continue;
                } else if (((Boolean) this.q3BipwRCk.IytU16YUK(GPLPRo6go)).booleanValue()) {
                    linkedHashMap.put(str, idpM54xlp.q3BipwRCk(GPLPRo6go));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object GPLPRo6go2 = ((gdEmqfwpT) list.get(i)).GPLPRo6go();
                    if (GPLPRo6go2 == null || ((Boolean) this.q3BipwRCk.IytU16YUK(GPLPRo6go2)).booleanValue()) {
                        arrayList.add(GPLPRo6go2);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                linkedHashMap.put(str, arrayList);
            }
        }
        return linkedHashMap;
    }

    @Override // con.dVtF46MWK
    public bi1qZD8sm dIocxURUo(String str, gdEmqfwpT gdemqfwpt) {
        if (!r6NbD4wnj.EBQXiIPmm(str)) {
            Map map = this.tGV7Q6urW;
            Object obj = map.get(str);
            if (obj == null) {
                obj = new ArrayList();
                map.put(str, obj);
            }
            ((List) obj).add(gdemqfwpt);
            return new bi1qZD8sm(this, str, gdemqfwpt);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @Override // con.dVtF46MWK
    public boolean q3BipwRCk(Object obj) {
        return ((Boolean) this.q3BipwRCk.IytU16YUK(obj)).booleanValue();
    }

    @Override // con.dVtF46MWK
    public Object tGV7Q6urW(String str) {
        List list = (List) this.J4Ux7ym32.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            this.J4Ux7ym32.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
