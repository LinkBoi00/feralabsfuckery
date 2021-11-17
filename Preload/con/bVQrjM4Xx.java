package con;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class bVQrjM4Xx implements Iterator, f7VKpcPHS {
    public Object Bhmn1KIah;
    public final Iterator CBQ5d1kRq;
    public final /* synthetic */ jYiAS31u7 PSTqBLTET;
    public int kmSgne1rO = -1;

    public bVQrjM4Xx(jYiAS31u7 jyias31u7) {
        this.PSTqBLTET = jyias31u7;
        this.CBQ5d1kRq = jyias31u7.q3BipwRCk.iterator();
    }

    public final void J4Ux7ym32() {
        while (this.CBQ5d1kRq.hasNext()) {
            Object next = this.CBQ5d1kRq.next();
            boolean booleanValue = ((Boolean) this.PSTqBLTET.J4Ux7ym32.IytU16YUK(next)).booleanValue();
            Objects.requireNonNull(this.PSTqBLTET);
            if (booleanValue) {
                this.Bhmn1KIah = next;
                this.kmSgne1rO = 1;
                return;
            }
        }
        this.kmSgne1rO = 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.kmSgne1rO == -1) {
            J4Ux7ym32();
        }
        return this.kmSgne1rO == 1;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.kmSgne1rO == -1) {
            J4Ux7ym32();
        }
        if (this.kmSgne1rO != 0) {
            Object obj = this.Bhmn1KIah;
            this.Bhmn1KIah = null;
            this.kmSgne1rO = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
