package con;
/* loaded from: classes.dex */
public final class G8ebKyy85 extends DoyxeIIWl {
    public static final Q4TFMtvSV MzoOEjc4X = new Q4TFMtvSV(0);
    public static final G8ebKyy85 PSTqBLTET = new G8ebKyy85(1, 0);

    public G8ebKyy85(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // con.DoyxeIIWl, java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof G8ebKyy85) {
            if (!isEmpty() || !((G8ebKyy85) obj).isEmpty()) {
                G8ebKyy85 g8ebKyy85 = (G8ebKyy85) obj;
                if (!(this.CBQ5d1kRq == g8ebKyy85.CBQ5d1kRq && this.kmSgne1rO == g8ebKyy85.kmSgne1rO)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // con.DoyxeIIWl, java.lang.Object
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.CBQ5d1kRq * 31) + this.kmSgne1rO;
    }

    @Override // con.DoyxeIIWl
    public boolean isEmpty() {
        return this.CBQ5d1kRq > this.kmSgne1rO;
    }

    @Override // con.DoyxeIIWl, java.lang.Object
    public String toString() {
        return this.CBQ5d1kRq + ".." + this.kmSgne1rO;
    }
}
