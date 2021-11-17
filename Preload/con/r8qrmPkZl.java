package con;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public class r8qrmPkZl {
    public final ArrayList q3BipwRCk;

    public r8qrmPkZl() {
        this.q3BipwRCk = new ArrayList();
    }

    public int J4Ux7ym32() {
        return this.q3BipwRCk.size();
    }

    public Object dIocxURUo() {
        return this.q3BipwRCk.remove(J4Ux7ym32() - 1);
    }

    public boolean kCA6Zs9sL(Object obj) {
        return this.q3BipwRCk.add(obj);
    }

    public void q3BipwRCk(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList arrayList = this.q3BipwRCk;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.q3BipwRCk, objArr);
                }
            } else if (obj instanceof Collection) {
                this.q3BipwRCk.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    this.q3BipwRCk.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.q3BipwRCk.add(it.next());
                }
            } else {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Don't know how to spread ");
                q3BipwRCk.append(obj.getClass());
                throw new UnsupportedOperationException(q3BipwRCk.toString());
            }
        }
    }

    public boolean tGV7Q6urW() {
        return !this.q3BipwRCk.isEmpty();
    }

    public r8qrmPkZl(int i) {
        this.q3BipwRCk = new ArrayList(i);
    }
}
