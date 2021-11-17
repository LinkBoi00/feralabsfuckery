package con;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class ZlWJGA6Lp extends TBL4EpQ7M implements Iterator, f7VKpcPHS {
    public ZlWJGA6Lp(PDQrIJkOY pDQrIJkOY, Iterator it) {
        super(pDQrIJkOY, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entry = this.MzoOEjc4X;
        if (entry != null) {
            J4Ux7ym32();
            return entry.getKey();
        }
        throw new IllegalStateException();
    }
}
