package con;

import java.util.LinkedHashMap;
import java.util.Locale;
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
    public void tGV7Q6urW(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.J4Ux7ym32     // Catch: all -> 0x0069
            if (r0 < 0) goto L_0x004a
            java.util.LinkedHashMap r0 = r2.q3BipwRCk     // Catch: all -> 0x0069
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0069
            if (r0 == 0) goto L_0x0011
            int r0 = r2.J4Ux7ym32     // Catch: all -> 0x0069
            if (r0 != 0) goto L_0x004a
        L_0x0011:
            int r0 = r2.J4Ux7ym32     // Catch: all -> 0x0069
            if (r0 <= r3) goto L_0x0048
            java.util.LinkedHashMap r0 = r2.q3BipwRCk     // Catch: all -> 0x0069
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0069
            if (r0 == 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            java.util.LinkedHashMap r0 = r2.q3BipwRCk     // Catch: all -> 0x0069
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x0069
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0069
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x0069
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x0069
            java.lang.Object r1 = r0.getKey()     // Catch: all -> 0x0069
            r0.getValue()     // Catch: all -> 0x0069
            java.util.LinkedHashMap r0 = r2.q3BipwRCk     // Catch: all -> 0x0069
            r0.remove(r1)     // Catch: all -> 0x0069
            int r0 = r2.J4Ux7ym32     // Catch: all -> 0x0069
            int r0 = r0 + -1
            r2.J4Ux7ym32 = r0     // Catch: all -> 0x0069
            int r0 = r2.kCA6Zs9sL     // Catch: all -> 0x0069
            int r0 = r0 + 1
            r2.kCA6Zs9sL = r0     // Catch: all -> 0x0069
            monitor-exit(r2)     // Catch: all -> 0x0069
            goto L_0x0000
        L_0x0048:
            monitor-exit(r2)     // Catch: all -> 0x0069
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: all -> 0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0069
            r0.<init>()     // Catch: all -> 0x0069
            java.lang.Class r1 = r2.getClass()     // Catch: all -> 0x0069
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x0069
            r0.append(r1)     // Catch: all -> 0x0069
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: all -> 0x0069
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0069
            r3.<init>(r0)     // Catch: all -> 0x0069
            throw r3     // Catch: all -> 0x0069
        L_0x0069:
            r3 = move-exception
            monitor-exit(r2)     // Catch: all -> 0x0069
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: con.sRvcTfY85.tGV7Q6urW(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.iiGwOFFnr;
        i2 = this.GPLPRo6go + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.tGV7Q6urW), Integer.valueOf(this.iiGwOFFnr), Integer.valueOf(this.GPLPRo6go), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
