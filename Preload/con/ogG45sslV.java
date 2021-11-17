package con;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ogG45sslV implements hrAjOnL52, Iterable, f7VKpcPHS {
    public boolean Bhmn1KIah;
    public final Map CBQ5d1kRq = new LinkedHashMap();
    public boolean kmSgne1rO;

    public final boolean J4Ux7ym32(SHlGWJTIu sHlGWJTIu) {
        return this.CBQ5d1kRq.containsKey(sHlGWJTIu);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogG45sslV)) {
            return false;
        }
        ogG45sslV ogg45sslv = (ogG45sslV) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, ogg45sslv.CBQ5d1kRq) && this.kmSgne1rO == ogg45sslv.kmSgne1rO && this.Bhmn1KIah == ogg45sslv.Bhmn1KIah;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = Boolean.hashCode(this.kmSgne1rO);
        return Boolean.hashCode(this.Bhmn1KIah) + ((hashCode + (this.CBQ5d1kRq.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.CBQ5d1kRq.entrySet().iterator();
    }

    public final Object kCA6Zs9sL(SHlGWJTIu sHlGWJTIu) {
        Object obj = this.CBQ5d1kRq.get(sHlGWJTIu);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + sHlGWJTIu + " - consider getOrElse or getOrNull");
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.kmSgne1rO) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.Bhmn1KIah) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.CBQ5d1kRq.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((SHlGWJTIu) entry.getKey()).q3BipwRCk);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return gThLCaTO1.i8XZMQc6Z(this, null) + "{ " + ((Object) sb) + " }";
    }
}
