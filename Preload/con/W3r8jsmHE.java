package con;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class W3r8jsmHE implements Iterable, f7VKpcPHS {
    public int MzoOEjc4X;
    public int PSTqBLTET;
    public boolean ilHKhw3Yw;
    public int kmSgne1rO;
    public int qVUwofr5s;
    public int[] CBQ5d1kRq = new int[0];
    public Object[] Bhmn1KIah = new Object[0];
    public ArrayList Eeka1udhb = new ArrayList();

    public final TQJXgv7HU J4Ux7ym32() {
        if (!this.ilHKhw3Yw) {
            this.MzoOEjc4X++;
            return new TQJXgv7HU(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new M6jQSt0Qa(this, 0, this.kmSgne1rO);
    }

    public final ZVqfObOve kCA6Zs9sL() {
        if (!this.ilHKhw3Yw) {
            if (this.MzoOEjc4X <= 0) {
                this.ilHKhw3Yw = true;
                this.qVUwofr5s++;
                return new ZVqfObOve(this);
            }
            G7WvUK4mQ.tGV7Q6urW("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        G7WvUK4mQ.tGV7Q6urW("Cannot start a writer when another writer is pending".toString());
        throw null;
    }
}
