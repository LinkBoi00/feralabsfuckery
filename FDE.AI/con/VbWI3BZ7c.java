package con;

import java.util.Map;
/* loaded from: classes.dex */
public class VbWI3BZ7c implements Map.Entry {
    public VbWI3BZ7c Bhmn1KIah;
    public final Object CBQ5d1kRq;
    public VbWI3BZ7c PSTqBLTET;
    public final Object kmSgne1rO;

    public VbWI3BZ7c(Object obj, Object obj2) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = obj2;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VbWI3BZ7c)) {
            return false;
        }
        VbWI3BZ7c vbWI3BZ7c = (VbWI3BZ7c) obj;
        return this.CBQ5d1kRq.equals(vbWI3BZ7c.CBQ5d1kRq) && this.kmSgne1rO.equals(vbWI3BZ7c.kmSgne1rO);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.CBQ5d1kRq;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.kmSgne1rO;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public int hashCode() {
        return this.CBQ5d1kRq.hashCode() ^ this.kmSgne1rO.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    @Override // java.lang.Object
    public String toString() {
        return this.CBQ5d1kRq + "=" + this.kmSgne1rO;
    }
}
