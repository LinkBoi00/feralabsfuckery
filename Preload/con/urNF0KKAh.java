package con;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class urNF0KKAh extends ULBj4kGND {
    public final W39e6bnPN dIocxURUo;
    public final /* synthetic */ int tGV7Q6urW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urNF0KKAh(wjjWl3mHt wjjwl3mht, wjjWl3mHt wjjwl3mht2, int i) {
        super(wjjwl3mht, wjjwl3mht2, null);
        this.tGV7Q6urW = i;
        if (i != 1) {
            this.dIocxURUo = new hR6LpjfZy(wjjwl3mht.q3BipwRCk(), wjjwl3mht2.q3BipwRCk());
            return;
        }
        super(wjjwl3mht, wjjwl3mht2, null);
        this.dIocxURUo = new HkcW0jooT(wjjwl3mht.q3BipwRCk(), wjjwl3mht2.q3BipwRCk());
    }

    @Override // con.LBkrQilnp
    public int dIocxURUo(Object obj) {
        switch (this.tGV7Q6urW) {
            case 0:
                return ((HashMap) obj).size();
            default:
                return ((LinkedHashMap) obj).size();
        }
    }

    @Override // con.LBkrQilnp
    public /* bridge */ /* synthetic */ void kCA6Zs9sL(Object obj, int i) {
        switch (this.tGV7Q6urW) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                return;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                return;
        }
    }

    @Override // con.LBkrQilnp
    public Object oon79WMrY(Object obj) {
        switch (this.tGV7Q6urW) {
            case 0:
                return (HashMap) obj;
            default:
                return (LinkedHashMap) obj;
        }
    }

    @Override // con.ULBj4kGND, con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        switch (this.tGV7Q6urW) {
            case 0:
                return this.dIocxURUo;
            default:
                return this.dIocxURUo;
        }
    }

    @Override // con.LBkrQilnp
    public Object tGV7Q6urW() {
        switch (this.tGV7Q6urW) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // con.LBkrQilnp
    public Object yWvV4ePLl(Object obj) {
        Object obj2 = null;
        switch (this.tGV7Q6urW) {
            case 0:
                Map map = (Map) obj;
                if (map instanceof HashMap) {
                    obj2 = (HashMap) map;
                }
                return obj2 == null ? new HashMap(map) : obj2;
            default:
                Map map2 = (Map) obj;
                if (map2 instanceof LinkedHashMap) {
                    obj2 = (LinkedHashMap) map2;
                }
                return obj2 == null ? new LinkedHashMap(map2) : obj2;
        }
    }
}
