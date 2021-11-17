package con;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class pJ2YbbxbH extends wwj2VvJy1 {
    public final /* synthetic */ int Bhmn1KIah = 1;
    public final Object PSTqBLTET;

    public pJ2YbbxbH(Object obj, int i) {
        super(i, 1);
        this.PSTqBLTET = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        switch (this.Bhmn1KIah) {
            case 0:
                if (hasNext()) {
                    int i = this.CBQ5d1kRq;
                    this.CBQ5d1kRq = i + 1;
                    return ((Object[]) this.PSTqBLTET)[i];
                }
                throw new NoSuchElementException();
            default:
                J4Ux7ym32();
                this.CBQ5d1kRq++;
                return this.PSTqBLTET;
        }
    }

    @Override // java.util.ListIterator
    public Object previous() {
        switch (this.Bhmn1KIah) {
            case 0:
                if (hasPrevious()) {
                    int i = this.CBQ5d1kRq - 1;
                    this.CBQ5d1kRq = i;
                    return ((Object[]) this.PSTqBLTET)[i];
                }
                throw new NoSuchElementException();
            default:
                kCA6Zs9sL();
                this.CBQ5d1kRq--;
                return this.PSTqBLTET;
        }
    }

    public pJ2YbbxbH(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.PSTqBLTET = objArr;
    }
}
