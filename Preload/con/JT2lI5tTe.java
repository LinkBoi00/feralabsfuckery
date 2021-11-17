package con;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class JT2lI5tTe extends TBL4EpQ7M implements Iterator, f7VKpcPHS {
    public JT2lI5tTe(PDQrIJkOY pDQrIJkOY, Iterator it) {
        super(pDQrIJkOY, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entry = this.MzoOEjc4X;
        if (entry != null) {
            J4Ux7ym32();
            return entry.getValue();
        }
        throw new IllegalStateException();
    }
}
