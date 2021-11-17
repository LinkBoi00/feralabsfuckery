package con;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class gjOx6fl4C extends TKRDKLJ3n {
    public final /* synthetic */ int J4Ux7ym32;
    public final W39e6bnPN tGV7Q6urW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjOx6fl4C(wjjWl3mHt wjjwl3mht, int i) {
        super(wjjwl3mht, null);
        this.J4Ux7ym32 = i;
        if (i == 1) {
            super(wjjwl3mht, null);
            this.tGV7Q6urW = new Gs9LVOXRD(wjjwl3mht.q3BipwRCk(), 1);
        } else if (i != 2) {
            this.tGV7Q6urW = new LaxEQK0Zs(wjjwl3mht.q3BipwRCk());
        } else {
            super(wjjwl3mht, null);
            this.tGV7Q6urW = new zkjvkkL9j(wjjwl3mht.q3BipwRCk());
        }
    }

    @Override // con.LBkrQilnp
    public int dIocxURUo(Object obj) {
        switch (this.J4Ux7ym32) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
                return ((HashSet) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // con.LBkrQilnp
    public void kCA6Zs9sL(Object obj, int i) {
        switch (this.J4Ux7ym32) {
            case 0:
                ((ArrayList) obj).ensureCapacity(i);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                return;
        }
    }

    @Override // con.LBkrQilnp
    public Object oon79WMrY(Object obj) {
        switch (this.J4Ux7ym32) {
            case 0:
                return (ArrayList) obj;
            case 1:
                return (HashSet) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // con.TKRDKLJ3n, con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        switch (this.J4Ux7ym32) {
            case 0:
                return this.tGV7Q6urW;
            case 1:
                return this.tGV7Q6urW;
            default:
                return this.tGV7Q6urW;
        }
    }

    @Override // con.LBkrQilnp
    public Object tGV7Q6urW() {
        switch (this.J4Ux7ym32) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // con.TKRDKLJ3n
    public void vPSbyrYWX(Object obj, int i, Object obj2) {
        switch (this.J4Ux7ym32) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                return;
            case 1:
                ((HashSet) obj).add(obj2);
                return;
            default:
                ((LinkedHashSet) obj).add(obj2);
                return;
        }
    }

    @Override // con.LBkrQilnp
    public Object yWvV4ePLl(Object obj) {
        Object obj2 = null;
        switch (this.J4Ux7ym32) {
            case 0:
                List list = (List) obj;
                if (list instanceof ArrayList) {
                    obj2 = (ArrayList) list;
                }
                return obj2 == null ? new ArrayList(list) : obj2;
            case 1:
                Set set = (Set) obj;
                if (set instanceof HashSet) {
                    obj2 = (HashSet) set;
                }
                return obj2 == null ? new HashSet(set) : obj2;
            default:
                Set set2 = (Set) obj;
                if (set2 instanceof LinkedHashSet) {
                    obj2 = (LinkedHashSet) set2;
                }
                return obj2 == null ? new LinkedHashSet(set2) : obj2;
        }
    }
}
