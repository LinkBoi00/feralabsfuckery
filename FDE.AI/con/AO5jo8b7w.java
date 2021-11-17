package con;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class AO5jo8b7w implements Iterator, f7VKpcPHS {
    public final DAbXDOiPB[] CBQ5d1kRq;
    public boolean Bhmn1KIah = true;
    public int kmSgne1rO = 0;

    public AO5jo8b7w(yUfRSVKGd yufrsvkgd, DAbXDOiPB[] dAbXDOiPBArr) {
        this.CBQ5d1kRq = dAbXDOiPBArr;
        dAbXDOiPBArr[0].iiGwOFFnr(yufrsvkgd.dIocxURUo, yufrsvkgd.GPLPRo6go() * 2);
        kCA6Zs9sL();
    }

    public final Object J4Ux7ym32() {
        if (this.Bhmn1KIah) {
            DAbXDOiPB dAbXDOiPB = this.CBQ5d1kRq[this.kmSgne1rO];
            return dAbXDOiPB.CBQ5d1kRq[dAbXDOiPB.Bhmn1KIah];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Bhmn1KIah;
    }

    public final int iiGwOFFnr(int i) {
        if (this.CBQ5d1kRq[i].J4Ux7ym32()) {
            return i;
        }
        if (!this.CBQ5d1kRq[i].kCA6Zs9sL()) {
            return -1;
        }
        DAbXDOiPB dAbXDOiPB = this.CBQ5d1kRq[i];
        dAbXDOiPB.kCA6Zs9sL();
        Object obj = dAbXDOiPB.CBQ5d1kRq[dAbXDOiPB.Bhmn1KIah];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        yUfRSVKGd yufrsvkgd = (yUfRSVKGd) obj;
        if (i == 6) {
            DAbXDOiPB dAbXDOiPB2 = this.CBQ5d1kRq[i + 1];
            Object[] objArr = yufrsvkgd.dIocxURUo;
            dAbXDOiPB2.iiGwOFFnr(objArr, objArr.length);
        } else {
            this.CBQ5d1kRq[i + 1].iiGwOFFnr(yufrsvkgd.dIocxURUo, yufrsvkgd.GPLPRo6go() * 2);
        }
        return iiGwOFFnr(i + 1);
    }

    public final void kCA6Zs9sL() {
        if (!this.CBQ5d1kRq[this.kmSgne1rO].J4Ux7ym32()) {
            int i = this.kmSgne1rO;
            if (i >= 0) {
                while (true) {
                    int i2 = i - 1;
                    int iiGwOFFnr = iiGwOFFnr(i);
                    if (iiGwOFFnr == -1 && this.CBQ5d1kRq[i].kCA6Zs9sL()) {
                        DAbXDOiPB dAbXDOiPB = this.CBQ5d1kRq[i];
                        dAbXDOiPB.kCA6Zs9sL();
                        dAbXDOiPB.Bhmn1KIah++;
                        iiGwOFFnr = iiGwOFFnr(i);
                    }
                    if (iiGwOFFnr != -1) {
                        this.kmSgne1rO = iiGwOFFnr;
                        return;
                    }
                    if (i > 0) {
                        DAbXDOiPB dAbXDOiPB2 = this.CBQ5d1kRq[i2];
                        dAbXDOiPB2.kCA6Zs9sL();
                        dAbXDOiPB2.Bhmn1KIah++;
                    }
                    DAbXDOiPB dAbXDOiPB3 = this.CBQ5d1kRq[i];
                    ksLrMHgEz kslrmhgez = yUfRSVKGd.kCA6Zs9sL;
                    ksLrMHgEz kslrmhgez2 = yUfRSVKGd.kCA6Zs9sL;
                    dAbXDOiPB3.iiGwOFFnr(yUfRSVKGd.iiGwOFFnr.dIocxURUo, 0);
                    if (i2 < 0) {
                        break;
                    }
                    i = i2;
                }
            }
            this.Bhmn1KIah = false;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.Bhmn1KIah) {
            Object next = this.CBQ5d1kRq[this.kmSgne1rO].next();
            kCA6Zs9sL();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
