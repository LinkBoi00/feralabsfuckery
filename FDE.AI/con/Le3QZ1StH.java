package con;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class Le3QZ1StH {
    public Map q3BipwRCk;

    public Le3QZ1StH(int i) {
        if (i == 1) {
            this.q3BipwRCk = new HashMap();
        } else if (i != 2) {
            this.q3BipwRCk = new LinkedHashMap();
        } else {
            this.q3BipwRCk = new ConcurrentHashMap(1);
        }
    }

    public Object J4Ux7ym32(W39e6bnPN w39e6bnPN, Q4TFMtvSV q4TFMtvSV, gdEmqfwpT gdemqfwpt) {
        Object q3BipwRCk = q3BipwRCk(w39e6bnPN, q4TFMtvSV);
        if (q3BipwRCk != null) {
            return q3BipwRCk;
        }
        Object GPLPRo6go = gdemqfwpt.GPLPRo6go();
        Map map = this.q3BipwRCk;
        Object obj = map.get(w39e6bnPN);
        if (obj == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1);
            map.put(w39e6bnPN, concurrentHashMap);
            obj = concurrentHashMap;
        }
        ((Map) obj).put(q4TFMtvSV, GPLPRo6go);
        return GPLPRo6go;
    }

    public Object q3BipwRCk(W39e6bnPN w39e6bnPN, Q4TFMtvSV q4TFMtvSV) {
        Map map = (Map) this.q3BipwRCk.get(w39e6bnPN);
        Object obj = map == null ? null : map.get(q4TFMtvSV);
        if (obj != null) {
            return obj;
        }
        return null;
    }
}
