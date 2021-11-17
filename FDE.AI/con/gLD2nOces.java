package con;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class gLD2nOces implements Qu7jcd5XZ {
    public final vwIzLM8lg q3BipwRCk;

    public gLD2nOces(vwIzLM8lg vwizlm8lg) {
        this.q3BipwRCk = vwizlm8lg;
    }

    public boolean equals(Object obj) {
        return (obj instanceof gLD2nOces) && anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, ((gLD2nOces) obj).q3BipwRCk);
    }

    public int hashCode() {
        return this.q3BipwRCk.hashCode();
    }

    /* renamed from: iiGwOFFnr */
    public xHCS6bK6v mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        Map map = this.q3BipwRCk.J4Ux7ym32;
        LinkedHashMap linkedHashMap = new LinkedHashMap(anXlDk6fV.WaUP0CF08(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            YZcX9Rc1a yZcX9Rc1a = (YZcX9Rc1a) entry.getValue();
            linkedHashMap.put(key, new n4f84B5OG(avkpyniny.q3BipwRCk.IytU16YUK(yZcX9Rc1a.q3BipwRCk), yZcX9Rc1a.J4Ux7ym32));
        }
        return new xHCS6bK6v(linkedHashMap, this.q3BipwRCk.q3BipwRCk, 0);
    }
}
