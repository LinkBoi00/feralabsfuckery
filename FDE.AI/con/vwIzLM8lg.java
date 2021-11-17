package con;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class vwIzLM8lg {
    public int q3BipwRCk = 300;
    public final Map J4Ux7ym32 = new LinkedHashMap();

    public boolean equals(Object obj) {
        if (obj instanceof vwIzLM8lg) {
            vwIzLM8lg vwizlm8lg = (vwIzLM8lg) obj;
            Objects.requireNonNull(vwizlm8lg);
            if (this.q3BipwRCk == vwizlm8lg.q3BipwRCk && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, vwizlm8lg.J4Ux7ym32)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.J4Ux7ym32.hashCode() + (((this.q3BipwRCk * 31) + 0) * 31);
    }

    public final YZcX9Rc1a q3BipwRCk(Object obj, int i) {
        YZcX9Rc1a yZcX9Rc1a = new YZcX9Rc1a(obj, null, 2);
        this.J4Ux7ym32.put(Integer.valueOf(i), yZcX9Rc1a);
        return yZcX9Rc1a;
    }
}
