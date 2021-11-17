package con;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class sRvcTfY85 {
    public int GPLPRo6go;
    public int J4Ux7ym32;
    public int dIocxURUo;
    public int iiGwOFFnr;
    public int kCA6Zs9sL;
    public final LinkedHashMap q3BipwRCk;
    public int tGV7Q6urW;

    public sRvcTfY85(int i) {
        if (i > 0) {
            this.tGV7Q6urW = i;
            this.q3BipwRCk = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object J4Ux7ym32(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.dIocxURUo++;
            this.J4Ux7ym32++;
            put = this.q3BipwRCk.put(obj, obj2);
            if (put != null) {
                this.J4Ux7ym32--;
            }
        }
        tGV7Q6urW(this.tGV7Q6urW);
        return put;
    }

    public final Object q3BipwRCk(Object obj) {
        Objects.requireNonNull(obj, "key == null");
        synchronized (this) {
            Object obj2 = this.q3BipwRCk.get(obj);
            if (obj2 != null) {
                this.iiGwOFFnr++;
                return obj2;
            }
            this.GPLPRo6go++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void tGV7Q6urW(int i) {
        while (true) {
            synchronized (this) {
                if (this.J4Ux7ym32 >= 0 && (!this.q3BipwRCk.isEmpty() || this.J4Ux7ym32 == 0)) {
                    if (this.J4Ux7ym32 <= i || this.q3BipwRCk.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.q3BipwRCk.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.q3BipwRCk.remove(key);
                    this.J4Ux7ym32--;
                    this.kCA6Zs9sL++;
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.iiGwOFFnr;
        i2 = this.GPLPRo6go + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.tGV7Q6urW), Integer.valueOf(this.iiGwOFFnr), Integer.valueOf(this.GPLPRo6go), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
