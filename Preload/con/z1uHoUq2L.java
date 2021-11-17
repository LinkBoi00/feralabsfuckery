package con;

import java.util.Map;
/* loaded from: classes.dex */
public class z1uHoUq2L implements Map.Entry, f7VKpcPHS {
    public final Object CBQ5d1kRq;
    public final Object kmSgne1rO;

    public z1uHoUq2L(Object obj, Object obj2) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = obj2;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        if (entry != null && anXlDk6fV.tGV7Q6urW(entry.getKey(), this.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(entry.getValue(), getValue())) {
            return true;
        }
        return false;
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
        Object obj = this.CBQ5d1kRq;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CBQ5d1kRq);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
