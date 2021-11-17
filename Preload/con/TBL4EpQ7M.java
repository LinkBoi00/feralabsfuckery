package con;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class TBL4EpQ7M {
    public int Bhmn1KIah;
    public final PDQrIJkOY CBQ5d1kRq;
    public Map.Entry MzoOEjc4X;
    public Map.Entry PSTqBLTET;
    public final Iterator kmSgne1rO;

    public TBL4EpQ7M(PDQrIJkOY pDQrIJkOY, Iterator it) {
        this.CBQ5d1kRq = pDQrIJkOY;
        this.kmSgne1rO = it;
        this.Bhmn1KIah = pDQrIJkOY.kCA6Zs9sL();
        J4Ux7ym32();
    }

    public final void J4Ux7ym32() {
        this.PSTqBLTET = this.MzoOEjc4X;
        this.MzoOEjc4X = this.kmSgne1rO.hasNext() ? (Map.Entry) this.kmSgne1rO.next() : null;
    }

    public final boolean hasNext() {
        return this.MzoOEjc4X != null;
    }

    public final void remove() {
        if (this.CBQ5d1kRq.kCA6Zs9sL() == this.Bhmn1KIah) {
            Map.Entry entry = this.PSTqBLTET;
            if (entry != null) {
                this.CBQ5d1kRq.remove(entry.getKey());
                this.PSTqBLTET = null;
                this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
