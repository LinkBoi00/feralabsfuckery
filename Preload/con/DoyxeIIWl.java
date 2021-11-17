package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public class DoyxeIIWl implements Iterable, f7VKpcPHS {
    public final int Bhmn1KIah;
    public final int CBQ5d1kRq;
    public final int kmSgne1rO;

    public DoyxeIIWl(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.CBQ5d1kRq = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= cOutqbkMD.oon79WMrY(cOutqbkMD.oon79WMrY(i2, i3) - cOutqbkMD.oon79WMrY(i, i3), i3);
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                int i4 = -i3;
                i2 += cOutqbkMD.oon79WMrY(cOutqbkMD.oon79WMrY(i, i4) - cOutqbkMD.oon79WMrY(i2, i4), i4);
            }
            this.kmSgne1rO = i2;
            this.Bhmn1KIah = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof DoyxeIIWl) {
            if (!isEmpty() || !((DoyxeIIWl) obj).isEmpty()) {
                DoyxeIIWl doyxeIIWl = (DoyxeIIWl) obj;
                if (!(this.CBQ5d1kRq == doyxeIIWl.CBQ5d1kRq && this.kmSgne1rO == doyxeIIWl.kmSgne1rO && this.Bhmn1KIah == doyxeIIWl.Bhmn1KIah)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.CBQ5d1kRq * 31) + this.kmSgne1rO) * 31) + this.Bhmn1KIah;
    }

    public boolean isEmpty() {
        if (this.Bhmn1KIah > 0) {
            if (this.CBQ5d1kRq > this.kmSgne1rO) {
                return true;
            }
        } else if (this.CBQ5d1kRq < this.kmSgne1rO) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new hbC5oTdpL(this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah);
    }

    @Override // java.lang.Object
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.Bhmn1KIah > 0) {
            sb = new StringBuilder();
            sb.append(this.CBQ5d1kRq);
            sb.append("..");
            sb.append(this.kmSgne1rO);
            sb.append(" step ");
            i = this.Bhmn1KIah;
        } else {
            sb = new StringBuilder();
            sb.append(this.CBQ5d1kRq);
            sb.append(" downTo ");
            sb.append(this.kmSgne1rO);
            sb.append(" step ");
            i = -this.Bhmn1KIah;
        }
        sb.append(i);
        return sb.toString();
    }
}
