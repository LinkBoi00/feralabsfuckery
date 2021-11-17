package con;

import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class vXaCS6jDZ extends wwj2VvJy1 {
    public int Bhmn1KIah;
    public boolean MzoOEjc4X;
    public Object[] PSTqBLTET;

    public vXaCS6jDZ(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.Bhmn1KIah = i3;
        Object[] objArr2 = new Object[i3];
        this.PSTqBLTET = objArr2;
        boolean z = i == i2;
        this.MzoOEjc4X = z;
        objArr2[0] = objArr;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        GPLPRo6go(i - i4, 1);
    }

    public final void GPLPRo6go(int i, int i2) {
        int i3 = (this.Bhmn1KIah - i2) * 5;
        while (i2 < this.Bhmn1KIah) {
            Object[] objArr = this.PSTqBLTET;
            Object[] objArr2 = objArr[i2 - 1];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public final void Puu3Rhg4F(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = this.CBQ5d1kRq;
            if (((i2 >> i3) & 31) != i) {
                break;
            }
            i3 += 5;
        }
        if (i3 > 0) {
            GPLPRo6go(i2, ((this.Bhmn1KIah - 1) - (i3 / 5)) + 1);
        }
    }

    public final Object iiGwOFFnr() {
        Object obj = this.PSTqBLTET[this.Bhmn1KIah - 1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[this.CBQ5d1kRq & 31];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object iiGwOFFnr = iiGwOFFnr();
            int i = this.CBQ5d1kRq + 1;
            this.CBQ5d1kRq = i;
            if (i == this.kmSgne1rO) {
                this.MzoOEjc4X = true;
                return iiGwOFFnr;
            }
            Puu3Rhg4F(0);
            return iiGwOFFnr;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (hasPrevious()) {
            this.CBQ5d1kRq--;
            if (this.MzoOEjc4X) {
                this.MzoOEjc4X = false;
            } else {
                Puu3Rhg4F(31);
            }
            return iiGwOFFnr();
        }
        throw new NoSuchElementException();
    }
}
