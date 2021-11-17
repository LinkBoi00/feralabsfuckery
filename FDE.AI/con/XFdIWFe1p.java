package con;
/* loaded from: classes.dex */
public final class XFdIWFe1p implements Comparable {
    public final long CBQ5d1kRq;

    public /* synthetic */ XFdIWFe1p(long j) {
        this.CBQ5d1kRq = j;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return ((this.CBQ5d1kRq ^ Long.MIN_VALUE) > (((XFdIWFe1p) obj).CBQ5d1kRq ^ Long.MIN_VALUE) ? 1 : ((this.CBQ5d1kRq ^ Long.MIN_VALUE) == (((XFdIWFe1p) obj).CBQ5d1kRq ^ Long.MIN_VALUE) ? 0 : -1));
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return (obj instanceof XFdIWFe1p) && this.CBQ5d1kRq == ((XFdIWFe1p) obj).CBQ5d1kRq;
    }

    @Override // java.lang.Object
    public int hashCode() {
        long j = this.CBQ5d1kRq;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Object
    public String toString() {
        long j = this.CBQ5d1kRq;
        if (j >= 0) {
            idpM54xlp.J4Ux7ym32(10);
            return Long.toString(j, 10);
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        idpM54xlp.J4Ux7ym32(10);
        sb.append(Long.toString(j3, 10));
        idpM54xlp.J4Ux7ym32(10);
        sb.append(Long.toString(j4, 10));
        return sb.toString();
    }
}
